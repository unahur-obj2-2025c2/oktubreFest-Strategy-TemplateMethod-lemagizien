package ar.edu.unahur.obj2.Jarras;

import ar.edu.unahur.obj2.marcas.Marca;

public class Jarra {
    private Double capacidad;

    private Marca marca;

    public Jarra(Double capacidad, Marca marca) {
        this.capacidad = capacidad;
        this.marca = marca;
    }

    public Double getCapacidad() {
        return capacidad;
    }

}
