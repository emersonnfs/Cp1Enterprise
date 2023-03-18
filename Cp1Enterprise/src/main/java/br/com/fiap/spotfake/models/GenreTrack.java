package br.com.fiap.spotfake.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.metamodel.mapping.EntityAssociationMapping;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name  = "tb_spotfake_genre_track")
public class GenreTrack {
    @ManyToOne
    @EmbeddedId
    @JoinColumn(name="genre_id",referencedColumnName = "genre_id")
    private Genre genre;
    @ManyToOne
    @EmbeddedId
    @JoinColumn(name = "tarck_id",referencedColumnName = "track_id")
    private Track track;
}
