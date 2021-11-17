package homework1;

public class App {
    public static void main(String[] args) {

        Person personOne = new PersonBuilder()
                .firstName("Ivan")
                .lastName("Ivanov")
                .middleName("Petrovich")
                .country("Russia")
                .address("Moscow 1 May 1-1")
                .phone("76486738")
                .age(35)
                .gender("male")
                .build();

        System.out.println(personOne);
    }


}
