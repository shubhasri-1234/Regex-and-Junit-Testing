import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Main;


public class SampleTest {
    @Test
    public void testAdd(){
            Main obj = new Main();
            int result = obj.add(2,3);
            assertEquals(5, result);
    }
    
    
}
