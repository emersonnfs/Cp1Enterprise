package br.com.fiap.spotfake.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.net.URL;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name  = "tb_spotfake_record_label")
public class RecordLabel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_label_id")
    private long id;
    @Column(name="record_label_name")
    private String name;
    @Column(name="website")
    private String website;
    @OneToMany(mappedBy = "recordLabel")
    private List<Album> albums;
}
