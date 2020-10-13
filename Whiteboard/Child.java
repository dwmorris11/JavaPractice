package Whiteboard;
  class Child {
    private static String favorite;
    public static final int MIN_AGE = 0;
    public static final int MAX_AGE = 125;
    private Sex sex;
    private int age;
    private String name;

    public Child() {}
    public Child(String name, Sex sex, int age) {
        this();
        setName(name);
        setSex(sex);
        setAge(age);
    }
    public void playBasketball() {
        System.out.println(name + " " + playSports() + " basketball");
    }

    public void playSoccer() {
        System.out.println(name + " " + playSports() + " soccer");
    }

    private String playSports() {
        boolean didWin = (int)(Math.random()*100)%2 == 0 ? true : false;
        return didWin ? "won" : "lost";
    }

    public void sneakOutOfHouse() {
        System.out.println(name + " snuck out of house.  Shhh!");
    }

    public void doChores() {
        System.out.println(this.name + " is busy with chores.");
    }

    public boolean isFavorite() {
        if(Child.favorite.equals(getName())) {
            return true;
        }
        return false;
    }

    public static void setFavorite(String name) {
        Child.favorite = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >=Child.MIN_AGE && age <= Child.MAX_AGE){
            this.age = age;
        }else {
            System.out.println("Age " + age + " is invalid. It must be between: "
                    + Child.MIN_AGE + " and " + Child.MAX_AGE);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String toString() {
        return "{Child: sex: " + getSex() + " age: " + getAge()
            + " name: " + getName() + " isFavorite: " + isFavorite();
    }
}

