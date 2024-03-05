package org.example.builder;

import java.util.*;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("DSA");
        subs.add("OS");
        subs.add("CN");
        this.subjects = subs;
        return this;
    }
}
