package ar.edu.unahur.obj2.personas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.Jarras.Jarra;
import ar.edu.unahur.obj2.marcas.Marca;

public class Persona {
    private Double peso;
    private List<Jarra> jarrasTomadas = new ArrayList<>();
    private Boolean leGustaMusicaTradicional;
    private Double nivelDeAguante;
    private List<Marca> marcasQueLeGustan = new ArrayList<>();
    

    public Boolean estaEbrio() {
        return jarrasTomadas.stream().mapToDouble(j -> j.getCapacidad()).sum() * peso > nivelDeAguante;
    }

}
