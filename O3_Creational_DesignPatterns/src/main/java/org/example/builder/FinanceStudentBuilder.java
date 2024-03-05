package org.example.builder;

import java.util.ArrayList;
import java.util.List;

public class FinanceStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("TAX");
        subs.add("Invesment");
        subs.add("Fraud");
        this.subjects = subs;
        return this;
    }
}
