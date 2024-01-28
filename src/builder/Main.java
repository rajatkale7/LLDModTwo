package builder;

public class Main {
    public static void main(String[] args) {
        Student s= Student.builder()
                .id(1)
                .name("Rajat")
                .age(24)
                .phoneNumber("9545823345")
                .universityName("Solapur university")
                .psp(90)
                .gradYear(2019)
                .build();
        System.out.println(s);
    }
}
