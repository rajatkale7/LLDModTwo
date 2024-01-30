package prototypeAndRegistry;

public class Student {
    private String name;
    private String email;
    private String phoneNumber;
    private String yearOfEnrollment;
    private String batchName;
    private String moduleName;
    private String instructorName;
    private String moduleStartDate;
    private String moduleSchedule;
    private String moduleEndDate;

    public Student(String yearOfEnrollment, String batchName, String moduleName, String instructorName, String moduleStartDate, String moduleSchedule, String moduleEndDate) {
        this.yearOfEnrollment = yearOfEnrollment;
        this.batchName = batchName;
        this.moduleName = moduleName;
        this.instructorName = instructorName;
        this.moduleStartDate = moduleStartDate;
        this.moduleSchedule = moduleSchedule;
        this.moduleEndDate = moduleEndDate;
    }
    //We excluded first 3 attributes from being initiated in the above Constructor
    //Because the user will add it at the time of using the template(name,email,phoneNumber changes for every candidate
    //remaining everything same for perticular batch)

    public Student(Student student) {
        this.yearOfEnrollment = student.yearOfEnrollment;
        this.batchName = student.batchName;
        this.moduleName = student.moduleName;
        this.instructorName = student.instructorName;
        this.moduleStartDate = student.moduleStartDate;
        this.moduleSchedule = student.moduleSchedule;
        this.moduleEndDate = student.moduleEndDate;
    }
    //Above is the copy_constructor. Copying attribute values from current object and giving it to
    //the object in the parenthesis

    @Override
    public Student clone(){
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", yearOfEnrollment='" + yearOfEnrollment + '\'' +
                ", batchName='" + batchName + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", instructorName='" + instructorName + '\'' +
                ", moduleStartDate='" + moduleStartDate + '\'' +
                ", moduleSchedule='" + moduleSchedule + '\'' +
                ", moduleEndDate='" + moduleEndDate + '\'' +
                '}';
    }
    //Above method is just for printing purpose

}
