package org.example.builder;

public class Director {
    StudentBuilder studentBuilder;
    Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }else if(studentBuilder instanceof FinanceStudentBuilder){
            return createFinanceStudent();
        }
        return  null;
    }

    private Student createFinanceStudent() {
        return studentBuilder.setRollNumber(11).setAge(23).setName("CFA Amit").setSubjects().build();
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(12).setAge(20).setName("Er Sumit").setSubjects().build();
    }

}
