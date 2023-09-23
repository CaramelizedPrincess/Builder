import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

//    public Person(String name, String surname, int age){
//                this.name = name;
//                this.surname = surname;
//                this.age = age;
        //        }

        public boolean hasAge () {
            return this.age > 0;
        }

        public boolean hasAddress () {
            return this.address != null;
        }

        public String getName () {
            return name;
        }
        public String getSurname () {
            return surname;
        }
        public OptionalInt getAge () {
            return OptionalInt.of(this.age);
        }

        public String getAddress () {
            return this.address;
        }

        public void setAddress (String address){
            this.address = address;
        }

        public void happyBirthday () {
            if (this.hasAge()) {
                this.age += 1;
            }
        }
        public PersonBuilder newChildBuilder () {
            return new PersonBuilder()
                    .setSurname(this.surname)
                    .setAge(1)
                    .setAddress(this.address);
        }

        @Override
        public String toString () {
            return "Person: " + "имя " + name + ", " + "фамилия " + surname + ", " + "возраст " + age + ", " + "адрес " + address;
        }

        @Override
        public int hashCode () {
            return Objects.hash(name, surname, age, address);
        }
    }
