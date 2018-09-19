package serialize;

public class Monkey {
    private final int numLegs = 2;
    public Integer age;
    private String name;
    private String country;
    private String subtype;

    public String getName() {
        return name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private void saySmth(String speech) {
        System.out.println(speech);
    }
}