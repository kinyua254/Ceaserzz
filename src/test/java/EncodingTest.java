import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {

    @Test
    public  void checkCipherText(){
        Encoding encode = new Encoding();
        assertEquals("mkp", encode.encode("kin", 2));
    }






}