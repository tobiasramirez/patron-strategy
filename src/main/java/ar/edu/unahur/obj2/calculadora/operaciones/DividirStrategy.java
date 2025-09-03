package ar.edu.unahur.obj2.calculadora.operaciones;

public class DividirStrategy implements OperacionStrategy {

    @Override
    public Integer calcular(Integer a, Integer b) {
        return a / b;
    }

}
