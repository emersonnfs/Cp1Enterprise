package br.com.fiap.spotfake.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name  = "tb_spotfake_album_track")
public class AlbumTrack {
    @ManyToOne
    @EmbeddedId
    @JoinColumn(name="album_id",referencedColumnName="album_id")
    private Album album;
    @ManyToOne
    @EmbeddedId
    @JoinColumn(name="track_id",referencedColumnName="track_id")
    private Track track;
}
