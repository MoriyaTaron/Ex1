import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/***
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
            String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2","",null};
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
            assertEquals(false,Ex1.equals(n1,n2));

        }
@Test
        void number2IntTest(){
            String[] unvalidnum = {"","hellob2"," ","1010A","01122b2","2541G26bG","101b1","1239AbA","125BG","ghjjb9","1011b","127b","3 b4",null,"0b1","-3b5"};
            assertEquals(-1,Ex1.number2Int(unvalidnum[0]));
            assertEquals(-1,Ex1.number2Int(unvalidnum[1]));
            assertEquals(-1,Ex1.number2Int(unvalidnum[2]));
    assertEquals(-1,Ex1.number2Int(unvalidnum[3]));
    assertEquals(-1,Ex1.number2Int(unvalidnum[4]));
    assertEquals(-1,Ex1.number2Int(unvalidnum[5]));
    assertEquals(-1,Ex1.number2Int(unvalidnum[6]));
    assertEquals(-1,Ex1.number2Int(unvalidnum[7]));
    assertEquals(-1,Ex1.number2Int(unvalidnum[8]));
    assertEquals(-1,Ex1.number2Int(unvalidnum[9]));
    assertEquals(-1,Ex1.number2Int(unvalidnum[10]));
    assertEquals(-1,Ex1.number2Int(unvalidnum[11]));
    assertEquals(-1,Ex1.number2Int(unvalidnum[12]));
    assertEquals(-1,Ex1.number2Int(unvalidnum[13]));
    assertEquals(-1,Ex1.number2Int(unvalidnum[14]));
    assertEquals(-1,Ex1.number2Int(unvalidnum[15]));
    String[]validNum={"135bA","100111b2","12345b6","012b5","123bG","EFbG","C2ADbF"};
    assertEquals(135,Ex1.number2Int(validNum[0]));
    assertEquals(39,Ex1.number2Int(validNum[1]));
    assertEquals(1865,Ex1.number2Int(validNum[2]));
    assertEquals(7,Ex1.number2Int(validNum[3]));
    assertEquals(291,Ex1.number2Int(validNum[4]));
    assertEquals(239,Ex1.number2Int(validNum[5]));
    assertEquals(41113,Ex1.number2Int(validNum[6]));
        }
        @Test
    void equalsTest(){
            assertEquals(true,Ex1.equals("1724","11010111100b2"));
            assertEquals(true,Ex1.equals("75bG","90bD"));
            assertEquals(true,Ex1.equals("010101b2","23b9"));
            assertEquals(true,Ex1.equals("00b3","0bB"));
            assertEquals(true,Ex1.equals("1254","1254bA"));
            assertEquals(true,Ex1.equals("1253","1253"));
            assertEquals(false,Ex1.equals("298bC","252bD"));
            assertEquals(false,Ex1.equals(null,""));
            assertEquals(false,Ex1.equals(null,"0"));
            assertEquals(false,Ex1.equals(null,"1b2"));
            assertEquals(false,Ex1.equals("obG","0bH"));
            assertEquals(false,Ex1.equals("1b12","1bC"));
            assertEquals(false,Ex1.equals("121","122"));
            assertEquals(false,Ex1.equals("121b4","121b7"));



        }





    }
