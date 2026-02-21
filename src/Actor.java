public class Actor extends Person {
    private double height;


    public Actor(Person person, double height) {
        super(person.getName(), person.getSurname(), person.getGender());
        setHeight(height);

    }

    public static Actor parse(String fullName, Gender gender, double height) {
        Person person = Person.parse(fullName, gender);
        return new Actor(person, height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0 || height > 3.0) {
            System.out.println("Некорректный рост");
        }
        else {
            this.height = height;
        }
    }

    @Override
    public String toString() {
        return getSurname() +" " + getName() + " (" + getHeight() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if(this.getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;
        if (!super.equals(actor)) return false;
        return Double.compare(actor.height, height) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(height);
        return result;
    }

}
