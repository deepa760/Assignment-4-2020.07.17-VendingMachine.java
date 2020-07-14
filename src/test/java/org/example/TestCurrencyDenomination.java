package org.example;
//package org.example.VendingMachine.Products;

import VendingMachine.Denomination;
import org.example.VendingMachine.Products.Product;
import org.junit.Test.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class TestCurrencyDenomination
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void currencyOkay()
    {
        Denomination result1 = Denomination._1KR;
        assertEquals(1,result1.getValue());
    }
    @Test
    public void currencyOkayText()
    {
        Denomination result1 = Denomination._1KR;
        assertEquals("1",result1.toString());
    }

}