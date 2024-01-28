package builder;

public class Main {
    public static void main(String[] args) {
        Student s= Student.builder()
                .id(1)
                .name("Rajat")
                .age(19)
                .phoneNumber("9545823345")
                .universityName("Solapur university")
                .psp(90)
                .gradYear(2019)
                .build();
        System.out.println(s);
    }
}

/*
FLOW OF EXECUTION:

~Student.builder() gives us the Builder class.
~Builder class.id() is initiating id attribute of Builder class also returning Builder class
~now, Builder.build()--> build() method is first validating the data and if no exception thrown,
it will return a Student class with all the values passed inside Student() constructor from
Builder class.
~So, final return is Student class. So, we stored it inside Student.


Let's see whether we achieved our goal or not:
~ we are supposed to design a system which will store student data
and finally it stored.
 */