public class Wilder {

    // attributes
    private String name;
    private boolean aware;

    // constructors
    public Wilder(String name, Boolean aware) {
        this.name = name;
        this.aware = aware;
    }

    // static method
    public static String quack() {
        return "Quack!";
    }

    // instance method
    public String whoAmI() {
        if ( this.aware) {
            return "Je m'appelle " + this.getName() + " et je suis aware";
        } else {
            return "Je m'appelle " + this.getName() + " et je ne suis pas aware";
        }

    }
    
    // getters
    public String getName() {
        return this.name;
    }
    
    public boolean isAware() {
        return this.aware;
    }
    
    // setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAware(boolean aware) {
        this.aware = aware;
    }
}