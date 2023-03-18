package br.com.fiap.spotfake.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name  = "tb_spotfake_purchase")
public class Purchase {
    @ManyToOne
    @JoinColumn(name="email",referencedColumnName = "email")
    private Customer customer;
    @ManyToOne
    @EmbeddedId
    @JoinColumn(name="track_id",referencedColumnName = "track_id")
    private Track track;
    @Column(name = "purchase_method")
    private String method;
    @Column(name="purchase_date")
    private LocalDate date;
    @Column(name = "purchase_time")
    private LocalTime time;
}
