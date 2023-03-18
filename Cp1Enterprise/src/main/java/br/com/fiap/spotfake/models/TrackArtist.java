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
@Table(name  = "tb_spotfake_track_artist")
public class TrackArtist {
    @ManyToOne
    @EmbeddedId
    @JoinColumn(name="track_id",referencedColumnName = "track_id")
    private Track track;
    @ManyToOne
    @EmbeddedId
    @JoinColumn(name = "artist_id",referencedColumnName="artist_id")
    private Artist artist;

    @ManyToOne
    @JoinColumn(name="featuring_artist_id",referencedColumnName="artist_id")
    private Artist featuringArtist;
}
