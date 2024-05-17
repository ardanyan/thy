package org.thy.thy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "currencies")
@Getter
@Setter
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String abbreviation;

    @OneToMany(mappedBy = "currency", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Wallet> wallets;

    @OneToMany(mappedBy = "currency", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MerchantCurrency> merchantCurrencies;

}
