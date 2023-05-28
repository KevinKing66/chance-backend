package com.kev.chance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
/**
 *
 * @author Kevin
 */
@Entity(name = "lotteries")
@Data
@NoArgsConstructor
public class Lottery {

    @Id
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String code;
    private String name;

}
