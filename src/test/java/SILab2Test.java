import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    void testEveryBranch(){

        assertThrows(RuntimeException.class,() -> SILab2.checkCart(null,100));

        assertThrows(RuntimeException.class,() ->
                SILab2.checkCart(List.of(new Item("", "123abc", 100, 2)), 100));

        assertThrows(RuntimeException.class,() ->
                SILab2.checkCart(List.of(new Item("name", null, 100, 2)), 100));

        assertTrue(SILab2.checkCart(List.of(new Item("name", "123", 100, 0)), 400));

        assertFalse(SILab2.checkCart(List.of(new Item("name", "0123", 350, 2)), 400));
    }

    @Test
    void testMultipleCondition(){
        //TODO
    }
}
