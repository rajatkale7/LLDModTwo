package builder;

//This is exactly same that of Student. Difference is just that we used getter along with setter

public class StudentAlternate {
    private int id;
    private String name;
    private String universityName;
    private int gradYear;
    private int psp;
    private int age;
    private String phoneNumber;

    private StudentAlternate(Builder b){
        this.id = b.getId();
        this.name =b.getName();
        this.universityName =b.getUniversityName();
        this.gradYear =b.getGradYear();
        this.psp =b.getPsp();
        this.age =b.getAge();
        this.phoneNumber =b.getPhoneNumber();
    }
    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "StudentAlternate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class Builder{  //Take input, validate and create student object
        private int id;
        private String name;
        private String universityName;
        private int gradYear;
        private int psp;
        private int age;
        private String phoneNumber;

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getUniversityName() {
            return this.universityName;
        }

        public int getGradYear() {
            return this.gradYear;
        }

        public int getPsp() {
            return this.psp;
        }

        public int getAge() {
            return this.age;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder universityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder psp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        private void validate(){
            if(this.gradYear > 2023){
                throw new InvalidGradYearException();
            }
            if(this.name == null){
                throw new InvalidNameException();
            }
            if(this.age < 18){
                throw new InvalidAgeException();
            }
        }

        public StudentAlternate build(){
            validate();
            return new StudentAlternate(this);
        }

    }
}


