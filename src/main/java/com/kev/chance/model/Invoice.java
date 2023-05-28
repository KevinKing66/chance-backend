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
import org.hibernate.annotations.GenericGenerator;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(name = "creation_date_time")
    private Timestamp creationDateTime;

    @Column(name = "create_by_user_id")
    private String createByUserId;

    private double value;

    private double iva;

    @Column(name = "total_value")
    private double totalValue;

    private String Location;
}
