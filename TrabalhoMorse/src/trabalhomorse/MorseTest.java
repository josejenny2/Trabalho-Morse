/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhomorse;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author Jenny
 */
public class MorseTest {
    


    
private Morse morse;

@Before
public void inicializa(){
morse=new Morse(); 
     
}

@Test
public void testapalavras(){
morse.setMensagem("SOS");
assertEquals("*** ... ***",morse.codifica());
morse.setMensagem("JENNY");
assertEquals("*... .*.*.*..",morse.codifica());
morse.setMensagem(" ESTUDANTE");
assertEquals("* ***.**. .** .** *.**",morse.codifica());
morse.setMensagem("JAVA");
assertEquals("*...*. ***. *.",morse.codifica());
morse.setMensagem("ZIP");
assertEquals("..** ** *..*",morse.codifica());
morse.setMensagem("KGW");
assertEquals(".*. ..* *..",morse.codifica());
morse.setMensagem("FH");
assertEquals("**. *****",morse.codifica());
morse.setMensagem("XQ");
assertEquals(".**. ..*.",morse.codifica());
}

@Test
public void testNUMERO(){
    morse.setMensagem("0123456789");
    assertEquals(".... .*... ** ***... ****. ***** .**** ...** ....*"));
}

@Test
public void testapontovirgulaespaco(){
    morse.setMensagem("., ");
    assertEquals("*.*.*. ..**..",morse.codifica());
}

    private void assertEquals(String __, String codifica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
