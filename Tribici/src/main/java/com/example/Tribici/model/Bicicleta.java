package com.example.Tribici.model;

import com.example.Tribici.Estado;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bicicleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    @Enumerated(EnumType.STRING)
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "estacion_id")
    private Estacion estacion;

    @OneToMany
    Set<Uso> usos;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bicicleta bicicleta = (Bicicleta) o;
        return Objects.equals(id, bicicleta.id) && Objects.equals(marca, bicicleta.marca) && Objects.equals(modelo, bicicleta.modelo) && estado == bicicleta.estado && Objects.equals(estacion, bicicleta.estacion) && Objects.equals(usos, bicicleta.usos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, marca, modelo, estado, estacion, usos);
    }
}
