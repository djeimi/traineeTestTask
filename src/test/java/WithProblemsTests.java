import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WithProblemsTests {

    private String CONST = "const";
    private final static String bd = "pui";

    @Test
    public void equalsOneToOneString(){
        assertEquals("1", "1");
    }


    @Test
    public void assignValueToConstVar(){
        CONST = "newValue";
        assertEquals("newValue", CONST);
    }

    @Test
    public static void equalsOneToOne(){
        assertEquals(1, 1);
    }



    @Test
    public void stringsMustBeEquals(){
        String res = "a";

        if (bd.equals("pui")) {
            res = "asd";
        }

        assertEquals("asd", res);
    }

    @Test
    public void successfullyRemovingFirstElementFromList(){
        List<String> sourceData = new ArrayList<>();

        sourceData.add("1");
        sourceData.add("viskas");
        sourceData.add("chupocabra");

       // sourceData.clear();
        for (int i = 0; i < sourceData.size(); i++){
            sourceData.remove(i);
        }
        assertFalse(sourceData.contains("1"));
    }


}
