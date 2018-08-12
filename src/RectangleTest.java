import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {
  Rectangle myRectangle = new Rectangle(5,6);

  @Test
  public void testGetArea() {
    assertEquals(myRectangle.getArea(), 30);
  }

  @Test
  public void testGetParameter() {
    assertEquals(myRectangle.getParameter(), 22);
  }

  @test
  public void testLength() {
    assertEquals(myRectangle.length, 5);
  }

  @test
  public void testWidth() {
    assertEquals(myRectangle.width, 6);
  }
}
