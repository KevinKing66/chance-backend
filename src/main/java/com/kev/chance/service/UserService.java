package com.kev.chance.service;

import com.kev.chance.dto.LoginDto;
import com.kev.chance.model.User;
import com.kev.chance.repository.UserRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin
 */
@Transactional
@Service
public class UserService implements UserServiceInterface {

    @Autowired
    UserRepository repo;

    @Value("No existe el usuario")
    public String noExistUser;

    @Value("Clave equivocada")
    public String wrongPassword;

    @Override
    public User findUserByEmail(String email) {
        return repo.findByEmail(email);
    }

    @Override
    public User findUserByEmailOrDoc(LoginDto entity) {
        User userOut = repo.findByEmail(entity.getEmail());
        if (userOut == null) {
            userOut = repo.findByNumDoc(entity.getEmail());
        }

        return userOut;
    }

    @Override
    public void createUser(User entity) {
        entity.setSalt(generateSalt());
        repo.save(entity);
    }

    private String generateSalt() {
        Random random = new Random();
        String possibleMatchest = "[a-zA-Z0-9]";
        Pattern pattern = Pattern.compile(possibleMatchest);
        Matcher matcher = pattern.matcher("");

        StringBuilder word = new StringBuilder(8);

        while (word.length()
                < 8) {
            char caracter = (char) (random.nextInt(Character.MAX_VALUE) + 1);
            matcher.reset(String.valueOf(caracter));

            if (matcher.matches()) {
                word.append(caracter);
            }
        }

        return word.toString();
    }

    @Override
    public List<User> syncUp(List<User> users) {
        for (User user : users) {
            if (repo.findByEmail(user.getEmail()) == null && repo.findByNumDoc(user.getNumDoc()) == null) {
                repo.save(user);
            }
        }
        return repo.findAll();
    }

    @Override
    public List<User> findAll() {
        return repo.findAll();
    }

}
