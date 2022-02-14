import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAdder {

    @Test
    void addTest(){
        int add = new Adder().add(1,1);

        assertEquals(2, add);
    }

}
