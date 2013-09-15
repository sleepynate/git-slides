import junit.framework.TestCase;

public class BowlingKata extends TestCase {
  public BowlingKata(String testName) {
    super(testName);
  }

  public void testPerfectGame() {
    assertEquals(scoreCard.score("XXXXXXXXXXXX"), 300);
  }

  public void testAllNines() {
    assertEquals(scoreCard.score("9-9-9-9-9-9-9-9-9-9-"), 300);
  }

  public void testAllSpares() {
    assertEquals(scoreCard.score("5/5/5/5/5/5/5/5/5/5/5"), 150);
  }
}
