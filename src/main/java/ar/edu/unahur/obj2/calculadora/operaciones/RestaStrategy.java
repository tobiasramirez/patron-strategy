package ar.edu.unahur.obj2.calculadora.operaciones;

public class RestaStrategy implements OperacionStrategy {

    @Override
    public Integer calcular(Integer a, Integer b) {
        return a - b;
    }

}
