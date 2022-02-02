import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test {
    @Test
    public void doubleTest() {
        assertEquals(5, SkillDemo1.doubleAmount(3));
    }
}