package br.com.thiagoneves.cursofastlane;

import org.junit.Test;

import br.com.thiagoneves.cursofastlane.util.Calculo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UtilTest {
    @Test
    public void testIsPar() throws Exception {
        int numeroPar = 2;
        boolean par = Calculo.isEven(numeroPar);
        assertTrue(par);
    }

    @Test
    public void testIsPrimo() throws Exception {
        int numeroPrimo = 73;
        boolean result = Calculo.isPrime(numeroPrimo);
        assertTrue(result);
    }
}