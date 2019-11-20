package lv.javaguru.lesson8.classwork;

public class Alien {

    protected static int nr = 0;
    private String name;
    private String planet;
    private int age;
    protected int id;

    public Alien(String name, String planet, int age) {
        this.name = name;
        this.planet = planet;
        this.age = age;
        this.id = ++nr;
    }

    public static int getNr() {
        return nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Alien {Name = '%s' from %s, age = %d, id = %d, totally aliens created = %d}",
                this.getName(), this.getPlanet(), this.getAge(), this.getId(), Alien.nr);
    }

    public Object getId() {
        return id;
    }

    public static boolean isAlien(Alien alien) {
        if (alien.planet.equals("Earth")) {
            return false;
        } else {
            return true;
        }
    }

}
