package builder;

public class Student {
    private int id;
    private String name;
    private String universityName;
    private int gradYear;
    private int psp;
    private int age;
    private String phoneNumber;

    private Student(int id, String name, String universityName, int gradYear,int psp, int age, String phoneNumber){
        this.id = id;
        this.name = name;
        this.universityName = universityName;
        this.gradYear = gradYear;
        this.psp = psp;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {    //shortcut is (fn+alt+insert)
        return "Student{" +
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


        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setUniversityName(String universityName) {
            this.universityName = universityName;
        }

        public void setGradYear(int gradYear) {
            this.gradYear = gradYear;
        }

        public void setPsp(int psp) {
            this.psp = psp;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
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

        public Student build(){
            validate();
            return new Student(this.id, this.name, this.universityName, this.gradYear, this.psp, this.age, this.phoneNumber);
        }
    }
}

/*
 INNER CLASSES-->
 1. Normal Inner class(object level):

 public class A{
   int A,B;
   public void hello(){
   }
   class B{
     int p,q;
     public void show(){
     }
   }
 }

-->I can create the object of class A but How about B??
The answer is we can do it using the object of class A

A a= new A();  //Object of class A
B b=a.new B(); //Object of B using A
NOTE: A cannot use attributes of B and B cannot of A
(We will see this in UML- Associations and compositions)
----------------------------------------------------------------------------
2. Static inner class:

public class A{
   int A,B;
   public void hello(){
   }
   static class B{
     int p,q;
     public void show(){
     }
   }
 }

B b= A.new B();
----------------------------------------------------------------------------
3. Local inner class:
-class inside the method

public class A{
  public void hello(){
    class B{
    }
  }
}
----------------------------------------------------------------------------
*/
