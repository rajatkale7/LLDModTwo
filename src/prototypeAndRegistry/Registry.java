package prototypeAndRegistry;

import builder.Student;

import java.util.HashMap;

public class Registry {
    private HashMap<String,Student> templateBox;

    public Registry() {
        this.templateBox = new HashMap<>();
    }
    public Student addToTemplateBox(Student s){
        templateBox.put(s.getBatchName(),s);
        return s;
    }
    public Student giveTemplate(String batchName){
        return templateBox.get(batchName);
    }
    /*
    The giveTemplate():
    method is actually been called in the Main.
    Say user want to add new entry of the candidate in perticular batch say A
    then user will pass A in the method. method will look for key A in the map
    and return that template.The value against the key string is class Student(template)
    so we are returning it.
     */

    /*
    The addToTemplateBox():
    method is taking the template from user and putting it inside the map
    s.getBatchName() gives batch name i. e String

     */

}
