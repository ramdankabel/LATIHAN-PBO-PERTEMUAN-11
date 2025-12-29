package Pertemuan11;

enum Level {
  BEGINNER("Beginner", 0),
  INTERMEDIATE("Intermediate", 100),
  EXPERT("Expert", 500);

  private String name;
  private int point;

  Level(String name, int point) {
    this.name = name;
    this.point = point;
  }

  public String getName() {
    return name;
  }

  public int getPoint() {
    return point;
  }
}

public class E2_Enum {
  public static void main(String[] args) {
    Level userLevel = Level.INTERMEDIATE;

    System.out.println("User Level: " + userLevel.getName());
    System.out.println("Points Required: " + userLevel.getPoint());

    switch (userLevel) {
      case BEGINNER:
        System.out.println("Selamat datang, Beginner! Let's start learning.");
        break;
      case INTERMEDIATE:
        System.out.println("Selamat datang, Intermediate learner! Keep going.");
        break;
      case EXPERT:
        System.out.println("Hello, Expert! Share your knowledge with others.");
        break;
    }
  }
}
