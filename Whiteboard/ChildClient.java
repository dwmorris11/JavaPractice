package Whiteboard;

class ChildClient {
  public static void main(String[] args) {
      Child firstBorn = new Child("Zachary", Sex.BOY, 25);
      Child secondBorn = new Child("Emily", Sex.GIRL, 19);
      Child thirdBorn = new Child("Wesley", Sex.BOY, 15);
      Child fourthBorn = new Child("Bonnie", Sex.GIRL, -1);

      Child.setFavorite(firstBorn.getName());
      firstBorn.playBasketball();
      secondBorn.doChores();
      secondBorn.playSoccer();
      thirdBorn.sneakOutOfHouse();
      System.out.println(firstBorn.toString());
      System.out.println(secondBorn.toString());
      System.out.println(thirdBorn.toString());
      System.out.println(fourthBorn.toString());
  }
}
