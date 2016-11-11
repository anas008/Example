import Ahorcado.Ahorcado;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class AhorcadoTest {
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
            {"A",true},{"L",false}
           });
    }
    private int car;
    private boolean Cond;

    
    public AhorcadoTest(int car, boolean Cond) {
           this.car=car;
           this.Cond=Cond;
    }
    
     @Test
    public void verificarTest(){
        Ahorcado p = new Ahorcado();
        
        assertEquals(1,p.BuscarLetra());
        
    }
    
}
