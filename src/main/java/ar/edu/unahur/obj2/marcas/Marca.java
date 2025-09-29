package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.pais.Pais;

public abstract class Marca {

    protected Double lupulo;
    protected Pais paisOrigen;
    protected Double precioPorLitro;
    protected Double graduacionReglamentaria; 



    public Double getLupulo() {
        return lupulo;
    }
 
    public abstract Double graduacion();

    public Double getPrecioPorLitro() {
        return precioPorLitro;
    }

    public Marca(Double lupulo, Pais paisOrigen, Double precioPorLitro) {
        this.lupulo = lupulo;
        this.paisOrigen = paisOrigen;
        this.precioPorLitro = precioPorLitro;
    }

    public void setPrecioPorLitro(Double precioPorLitro) {
        this.precioPorLitro = precioPorLitro;
    }

        public Double getGraduacionReglamentaria() {
        return graduacionReglamentaria;
    }

    public void setGraduacionReglamentaria(Double graduacionReglamentaria) {
        this.graduacionReglamentaria = graduacionReglamentaria;
    }

    public Double graduacionCervezaNegra(){
        return Double.min(graduacionReglamentaria, (lupulo*2));
    }


}
