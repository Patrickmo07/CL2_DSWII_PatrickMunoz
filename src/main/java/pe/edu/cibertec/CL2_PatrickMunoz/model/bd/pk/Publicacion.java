package pe.edu.cibertec.CL2_PatrickMunoz.model.bd.pk;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "Publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdPublicacion;
    private String Titulo;
    private String Resumen;
    private Date FechPublicacion;
    @ManyToOne
    @JoinColumn(name = "IdAutor")
    private Autor autor;
}
