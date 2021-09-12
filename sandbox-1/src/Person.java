public class Person {

    private String name;
    private int age;

    public Person(String nameIPassIn, int ageIPassIn) {
        this.age = ageIPassIn;
        this.name = nameIPassIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
