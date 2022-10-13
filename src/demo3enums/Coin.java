package demo3enums;

import java.util.Random;

public class Coin {
  private FaceValue value;

  public Coin() {

    flip();
  }

  public void flip() {
    Random random = new Random();

    // Ternary operator:
    value = (random.nextBoolean() ? FaceValue.HEADS : FaceValue.TAILS);

    // Nedenstående giver det samme:
    if (random.nextBoolean() == true)
      value = FaceValue.HEADS;
    else
      value = FaceValue.TAILS;
  }

  public FaceValue getValue() {

    return value;
  }
}
