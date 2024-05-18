package org.thy.thy.Model;

import jakarta.persistence.*;
        import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "transactions")
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "trans_date_trans_time")
    private Timestamp transDateTransTime;

    @Column(name = "cc_num")
    private String ccNum;

    @Column(name = "merchant")
    private String merchant;

    @Column(name = "category")
    private String category;

    @Column(name = "amt")
    private BigDecimal amt;

    @Column(name = "first")
    private String first;

    @Column(name = "last")
    private String last;

    @Column(name = "gender")
    private String gender;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip")
    private String zip;

    @Column(name = "lat")
    private Float lat;

    @Column(name = "long")
    private Float lon;

    @Column(name = "city_pop")
    private Integer cityPop;

    @Column(name = "job")
    private String job;

    @Column(name = "dob")
    private Timestamp dob;

    @Column(name = "trans_num")
    private String transNum;

    @Column(name = "unix_time")
    private Long unixTime;

    @Column(name = "merch_lat")
    private Float merchLat;

    @Column(name = "merch_long")
    private Float merchLong;

    @Column(name = "is_fraud")
    private Boolean isFraud;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "merchant_id", nullable = false)
    private Merchant merchantEntity;

    @ManyToOne
    @JoinColumn(name = "wallet_id", nullable = false)
    private Wallet wallet;

    @ManyToOne
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment payment;
}