class TestSuper {
 TestSuper(int i) { }
}
class TestSub extends TestSuper { }
class TestAll {
 public static void main (String [] args) {
  new TestSub();
 }
}