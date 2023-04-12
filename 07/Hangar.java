public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car("Clio", 200000);
        Boat titanic = new Boat("Titanic", 0);

        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}