import org.junit.*;
import java.util.*;

class Foo {
  public int getAnInt() {
    return 3;
  }
}

public class SubmissionTest {
  @Test
  public void testGetAnInt() {
    Assert.assertEquals(3, new Foo().getAnInt());
  }
}
