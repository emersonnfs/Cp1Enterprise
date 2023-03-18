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
@Table(name  = "tb_spotfake_track")
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "track_id")
    private long id;

    @Column(name="track_name")
    private String name;
    @Column(name="track_length")
    private String length;
    @Column(name="track_size")
    private String size;
    @Column(name="track_price")
    private String price;
    @Column(name="track_language")
    private String language;
    @Column(name="track_producer")
    private String producer;
    @Column(name="track_songwriters")
    private String songwriters;
    @Column(name="track_released")
    private String released;
    @OneToMany(mappedBy = "track")
    private List<TrackArtist> trackArtists;
    @OneToMany(mappedBy = "track")
    private List<AlbumTrack> albumTracks;
    @OneToMany(mappedBy = "track")
    private List<Purchase> purchases;
    @OneToMany(mappedBy = "track")
    private  List<GenreTrack> genreTracks;
}
