package ar.edu.unahur.obj2.calculadora;

import ar.edu.unahur.obj2.calculadora.operaciones.OperacionStrategy;

public class Calculadora {

    private OperacionStrategy estrategia;

    public void setEstrategia(OperacionStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public Integer resolver(Integer primerNumero, Integer segundoNumero){
        return estrategia.calcular(primerNumero, segundoNumero);
    }

}
