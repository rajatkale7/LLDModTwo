package prototypeAndRegistry;

public class Student implements Prototype<Student>{
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

    public Student(Student student) {  //copy constructor to make deep copy
        this.yearOfEnrollment = student.yearOfEnrollment;
        this.batchName = student.batchName;
        this.moduleName = student.moduleName;
        this.instructorName = student.instructorName;
        this.moduleStartDate = student.moduleStartDate;
        this.moduleSchedule = student.moduleSchedule;
        this.moduleEndDate = student.moduleEndDate;
    }


    @Override
    public Student clone(){
        return new Student(this);  //Means copy everything from "this" to "student" which is new blank.
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
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public String getBatchName() {
        return batchName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getModuleStartDate() {
        return moduleStartDate;
    }

    public String getModuleSchedule() {
        return moduleSchedule;
    }

    public String getModuleEndDate() {
        return moduleEndDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setYearOfEnrollment(String yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setModuleStartDate(String moduleStartDate) {
        this.moduleStartDate = moduleStartDate;
    }

    public void setModuleSchedule(String moduleSchedule) {
        this.moduleSchedule = moduleSchedule;
    }

    public void setModuleEndDate(String moduleEndDate) {
        this.moduleEndDate = moduleEndDate;
    }
}
