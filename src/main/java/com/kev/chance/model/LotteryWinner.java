package com.kev.chance.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Kevin
 */
@Entity(name = "lottery_winner")
@Data
@NoArgsConstructor

public class LotteryWinner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(name = "lottery_code")
    String lotteryCode;

    Date date;

    @Column(name = "number_winner")
    String numberWinner;

    int digits;
}
