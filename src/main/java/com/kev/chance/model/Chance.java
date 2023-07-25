package com.kev.chance.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Kevin
 */
@Entity(name = "chances")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column(name = "invoice_id")
    private long invoiceId;

    private int digits;

    private int number;

    @Column(name = "value_with_tax")
    private double value;

    @Column(name = "lottery_code")
    private String lottery;

    @Column(name = "play_date")
    private Timestamp playDate;

}
