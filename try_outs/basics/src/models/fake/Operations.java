package models.fake;

public class Operations{
  public int a;
  public int b;
  public Operations(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int add() {
    return this.a + this.b;
  }
}