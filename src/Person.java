public class Person {
    private String name;
    private String surname;
    private Gender gender;

    public enum Gender{
        MALE,
        FEMALE
    }

    public Person(String name, String surname, Gender gender){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public static Person parse(String fullName, Gender gender) {
        if (fullName == null || fullName.trim().isEmpty()) {
            System.out.println("Пустое значение");
        }
        String[] parts = fullName.trim().split(" ");

        if (parts.length < 2) {
            System.out.println("Нет имени или фамилии");
        }
        return new Person(parts[1], parts[0], gender);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return name.equals(person.name) &&
                surname.equals(person.surname) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        int result = 12;
        result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + gender.hashCode();
        return result;
    }


}
