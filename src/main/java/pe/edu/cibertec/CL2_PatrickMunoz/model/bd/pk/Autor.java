package pe.edu.cibertec.CL2_PatrickMunoz.model.bd.pk;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdAutor;
    private String NomAutor;
    private String ApeAutor;
    private Date FechNacAutor;
}
