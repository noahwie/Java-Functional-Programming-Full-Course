package imperative;

public class Person {

    private String name;
    private Gender gender;

    Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", gender=" + gender + '}';
    }

    enum Gender {
        MALE, FEMALE
    }

}
