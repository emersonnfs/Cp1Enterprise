package br.com.fiap.spotfake.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name  = "tb_spotfake_customer")
public class Customer {
    @Id
    @Column(name = "email")
    private String email;
    @Column(name="name")
    private String name;
    @Column(name="password")
    private String password;
    @Column(name = "age")
    private int age;
    @Column(name = "card_information")
    private String card;
    @Column(name = "ip_address")
    private String ip;
    @Column(name = "device")
    private String device;
    @OneToMany(mappedBy = "customer")
    private List<Purchase> purchases;
}
