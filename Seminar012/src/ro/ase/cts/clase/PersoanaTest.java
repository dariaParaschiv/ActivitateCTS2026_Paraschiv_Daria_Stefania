package ro.ase.cts.clase;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class PersoanaTest {

    @org.junit.jupiter.api.Test
    public void testGetGen() throws Exception {
        IPersoana persoana = new Persoana("Matei","1234123412351");
        Assert.assertEquals("M", persoana.getGen());
    }

    @Test
    public void testGetGenDupa2000(){
        Persoana persoana1 = new Persoana("Ana","6131313131123");
        Assert.assertEquals("F", persoana1.getGen());
    }

    @Test
    public void testGenPersoanaBoundryInferior2000(){
        Persoana persoana2 = new Persoana("Mircea", "5000101232131");
        Assert.assertEquals("M", persoana2.getGen());
    }

    @Test
    public void testGetVarstaPersoanaNascutaAzi(){
        Persoana persoana3 = new Persoana("Mircea", "5260514232131");
        Assert.assertEquals(0, persoana3.getVarsta());
    }

    @Test
    public void testGetGenCrossCheck(){
        String cnp = "6123131610231";
        Persoana persoana4 = new Persoana("Andreea", cnp);
        String expected;
        if(cnp.charAt(0) % 2 == 0){
            expected = "F";
        }
        else{
            expected = "M";
        }
        String actual = persoana4.getGen();
        Assert.assertEquals(expected, actual);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testCheckLungimeCnp(){
        Persoana persoana5 = new Persoana("Mircea", "5260514232131");
        persoana5.checkCNP();
    }

    @BeforeEach
    public void setUp()  {

    }

    @AfterEach
    public void tearDown() throws Exception{

    }

    @Test
    public void testCheckCNP(){
        Persoana persoana = new Persoana("Matei", "1700316413221");
        Assert.assertEquals(true, persoana.checkCNP());
        Assert.assertTrue(persoana.checkCNP());
    }



}