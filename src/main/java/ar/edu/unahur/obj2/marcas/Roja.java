package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.pais.Pais;

public class Roja extends Marca {

    public Roja(Double lupulo, Pais paisOrigen, Double precioPorLitro) {
        super(lupulo, paisOrigen, precioPorLitro);
    }

    @Override
    public Double graduacion() {
        return super.graduacionCervezaNegra() * 1.25;
    }

}
