
public class Classroom {
    public static void main(String[] args) {

        Wilder Damien = new Wilder("Damien", true);
        Wilder Vincent = new Wilder("Vincent", false);
        Wilder Denis = new Wilder("Denis", true);

        System.out.println(Damien.whoAmI());
        System.out.println(Vincent.whoAmI());
        System.out.println(Denis.whoAmI());

    }
}