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
@Table(name  = "tb_spotfake_artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private long id;
    @Column(name="artist_name")
    private String name;
    @Column(name="artist_type")
    private String type;
    @OneToMany(mappedBy = "artist")
    private List<TrackArtist> trackArtist;
    @OneToMany(mappedBy = "featuringArtist")
    private List<TrackArtist> featuringTrackArtists;
    @OneToMany(mappedBy = "artist")
    private List<Album> albums;
}
