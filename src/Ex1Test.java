import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 *  Make sure you complete all the needed JUnits
 */
public class Ex1Test {
        @Test
        void computeNumberTest() {
            String s2 = "1011b2";
            int v = Ex1.number2Int(s2);
            assertEquals(v,11);
            String s10 = "1011bA";
            v = Ex1.number2Int(s10);
            s2 = Ex1.int2Number(v,2);
            int v2 = Ex1.number2Int(s2);
            assertEquals(v,v2);
            assertTrue(Ex1.equals(s10,s2));
        }

        @Test
        void isBasisNumberTest() {
            String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
            for(int i=0;i<good.length;i=i+1) {
                boolean ok = Ex1.isNumber(good[i]);
                assertTrue(ok);
            }
            String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
            for(int i=0;i<not_good.length;i=i+1) {
                boolean not_ok = Ex1.isNumber(not_good[i]);
                assertFalse(not_ok);
            }
            
        }
        @Test
        void int2NumberTest() {
           assertEquals("10bG", Ex1.int2Number(16, 16));
           assertEquals("1100b2",Ex1.int2Number(12,2));
           assertEquals("",Ex1.int2Number(20,17));
           assertEquals("457",Ex1.int2Number(457,10));
           assertEquals("",Ex1.int2Number(1010,0));
           assertEquals("",Ex1.int2Number(-5,101));
           assertEquals("126bG",Ex1.int2Number(294,16));
           assertEquals("897bF",Ex1.int2Number(1942,15));
           assertEquals("12856bE",Ex1.int2Number(45548,14));

        }
        @Test
        void maxIndexTest() {
            String[] arr1 = {"5","72","30","35","72"};
            assertEquals(1,Ex1.maxIndex(arr1));
            String[] arr2=new String[5];
            arr2[4]="21";
            arr2[2]="17";
            assertEquals(4,Ex1.maxIndex(arr2));
            String[] arr3= {"010101bG","542E455bD","900000bF",null,"","127000000","27000"};
            assertEquals(5,Ex1.maxIndex(arr3));
            String[] arr4= {"15865","  ","1230000","2131b4","99fs231bG"};
            assertEquals(2,Ex1.maxIndex(arr4));
            String n1=arr4[Ex1.maxIndex(arr4)];
            String n2=arr3[Ex1.maxIndex(arr3)];
           assert equals(false,Ex1.equals(n1,n))
        }

        // Add additional test functions - test as much as you can.
    }
