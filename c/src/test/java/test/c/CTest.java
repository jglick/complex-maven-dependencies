package test.c;

import org.junit.Test;
import static org.junit.Assert.*;

public class CTest {
    
    @Test public void muchSlower() throws InterruptedException {
        Thread.sleep(99000);
    }

}