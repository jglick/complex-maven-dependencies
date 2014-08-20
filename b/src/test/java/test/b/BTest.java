package test.b;

import org.junit.Test;
import static org.junit.Assert.*;

public class BTest {
    
    @Test public void slower() throws InterruptedException {
        Thread.sleep(9000);
    }

}