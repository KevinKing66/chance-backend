package com.kev.chance.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Kevin
 */
@Entity(name = "invoices")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {

    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column(name = "creation_date_time")
    private Timestamp creationDateTime;

    @Column(name = "created_by_user_id")
    private String createdByUserId;

    private double value;

    private double iva;

    @Column(name = "total_value")
    private double totalValue;

    private String location;

    @Column(columnDefinition = "integer default 1")
    private int sync;
}
