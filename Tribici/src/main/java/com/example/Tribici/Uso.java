package com.example.Tribici;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Uso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double coste;

    @ManyToOne
    @JoinColumn(name = "estacion_id")
    private Estacion estacion;

    @ManyToOne
    @JoinColumn(name = "bicicleta_id")
    private Bicicleta bicicleta;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private  Usuario usuario;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Uso uso = (Uso) o;
        return Double.compare(coste, uso.coste) == 0 && Objects.equals(id, uso.id) && Objects.equals(fechaInicio, uso.fechaInicio) && Objects.equals(fechaFin, uso.fechaFin) && Objects.equals(estacion, uso.estacion) && Objects.equals(bicicleta, uso.bicicleta) && Objects.equals(usuario, uso.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fechaInicio, fechaFin, coste, estacion, bicicleta, usuario);
    }
}
