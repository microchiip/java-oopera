public class Director extends Person{
    private int numbersOfShows;

    public Director(Person person, int numbersOfShows) {
        super(person.getName(), person.getSurname(), person.getGender());
        setNumbersOfShows(numbersOfShows);
    }

    public static Director parse(String fullName, Gender gender, int numbersOfShows) {
        Person person = Person.parse(fullName, gender);
        return new Director(person, numbersOfShows);
    }

    public int getNumbersOfShows() {
        return numbersOfShows;
    }

    public void setNumbersOfShows(int numbersOfShows) {
        this.numbersOfShows = numbersOfShows;
    }

    @Override
    public String toString() {
        return getSurname() + " " + getName();
    }

}
