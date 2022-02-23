

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingTest {

    @Test
    public  void checkDecodedCipher(){
        Decoding decode = new Decoding();
        assertEquals("kin", decode.decode("mkp", 2));
    };

}