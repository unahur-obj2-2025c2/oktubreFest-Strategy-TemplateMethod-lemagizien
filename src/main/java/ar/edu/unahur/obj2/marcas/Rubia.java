package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.pais.Pais;

public class Rubia extends Marca {
    private Double graduacionEstaMarca;

    
    public Rubia(Double lupulo, Pais paisOrigen, Double precioPorLitro, Double graduacionEstaMarca) {
        super(lupulo, paisOrigen, precioPorLitro);
        this.graduacionEstaMarca = graduacionEstaMarca;
    }


    @Override
    public Double graduacion() {
        return graduacionEstaMarca;
    }

}
