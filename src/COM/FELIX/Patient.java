package COM.FELIX;

import java.util.Scanner;

public class Patient {
    private String name;
    private String age;
    private Eyes eyes;
    private Heart heart;
    private Legs legs;
    private Skin skin;
    private Stomach stomach;

    public Patient(String name, String age, Eyes eyes, Heart heart, Legs legs, Skin skin, Stomach stomach) {
        this.name = name;
        this.age = age;
        this.eyes = eyes;
        this.heart = heart;
        this.legs = legs;
        this.skin = skin;
        this.stomach = stomach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Eyes getEyes() {
        return eyes;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Legs getLegs() {
        return legs;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public static void main(String[] args) {
        Patient one = new Patient("omondi timon", "30 yrs",

                new Eyes(" eyes", "shortsighted", "dorothy rambim", "red"),
                new Heart("hesrt", "heart attacked", 500, "abnormal"),
                new Legs(" feet", "morning elephant", true, "both"),
                new Skin("skin", "skin rushes", "abnormal", "rough"),
                new Stomach("stomach", "public ulcered deaease", "abnormal"));

        System.out.println(one.getName());
        System.out.println(one.getAge());

        boolean checkresult = true;
        Scanner input = new Scanner(System.in);
        while (checkresult) {
            System.out.println("select an organ\t" + one.name);
            System.out.println("1.Eye\n" + "2.Heart\n" + "3.Legs\n" + "4.Skin\n" + "5.Stomach");

            int choice = Integer.parseInt(input.next());
            switch (choice) {

                case 1: {
                    System.out.println(one.eyes.getName()+one.eyes.getColour() );
                    System.out.println(one.getClass());
                    continue;
                }
                case 2: {
                    System.out.println(one.heart);
                    continue;
                }
                case 3: {
                    System.out.println(  one.legs);
                    continue;
                }
                case 4: {
                    System.out.println( one.skin);
                    continue;
                }
                case 5: {
                    System.out.println( one.stomach);
                    continue;
                }

                default: {
                    System.out.println("thank you "+one.getName());
                    break;
                }
            }


            if (!checkresult) {
                System.out.println("thank you !!" + one.getName());
              }
break;
        }
    }
    //TODO complete the project output
}