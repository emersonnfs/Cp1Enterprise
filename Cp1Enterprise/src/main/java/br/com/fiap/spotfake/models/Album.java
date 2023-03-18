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
@Table(name  = "tb_spotfake_album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "album_id")
    private long id;
    @ManyToOne
    @JoinColumn(name="artist_id",referencedColumnName="artist_id")
    private Artist artist;
    @ManyToOne
    @JoinColumn(name="record_label_id", referencedColumnName="record_label_id")
    private RecordLabel recordLabel;
    @Column(name="album_name")
    private String name;
    @Column(name="album_type")
    private String type;
    @Column(name="album_released")
    private String released;
    @Column(name="album_recorded")
    private String recorded;
    @OneToMany(mappedBy = "album")
    private List<AlbumTrack> albumTracks;
}
