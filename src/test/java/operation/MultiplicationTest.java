/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package operation;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTest {
    @Test public void testMultiplication() {
       Multiplication multiplication  = new Multiplication();
       assertEquals(30, multiplication.multiply(5, 6)); 
    }
}
