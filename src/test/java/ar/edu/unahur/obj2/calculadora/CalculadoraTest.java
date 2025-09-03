package ar.edu.unahur.obj2.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.calculadora.operaciones.*;
public class CalculadoraTest {

    Calculadora c = new Calculadora();

    @Test
    void dadaUnaCalculadoraSetearEstrategiaSumarYEnviar2Numeros() {

        c.setEstrategia(new SumarStrategy());

        assertEquals(3, c.resolver(1, 2));
    }

    @Test
    void dadaUnaCalculadoraSetearEstrategiaMultiplicarYEnviar2Numeros() {

        c.setEstrategia(new MultiplicarStrategy());

        assertEquals(6, c.resolver(3, 2));
    }

    @Test 
    void dadaUnaCalculadoraSetearEstrategiaRestarYEnviar2Numeros(){
        c.setEstrategia( new RestaStrategy());
        assertEquals(5, c.resolver(7, 2));
    }
    @Test 
    void dadaUnaCalculadoraSetearEstrategiaDividirYEnviar2Numeros(){
        c.setEstrategia( new DividirStrategy());
        assertEquals(3, c.resolver(6, 2));
    }
}
