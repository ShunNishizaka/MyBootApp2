
package jp.te4a.spring.boot.myapp2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void helloSpringWorldTest()
    {
        HelloController hc = new HelloController();
        String expected = "Taro desu!";
        String actual = hc.taro();
        assertEquals(actual, expected);
    }
}
