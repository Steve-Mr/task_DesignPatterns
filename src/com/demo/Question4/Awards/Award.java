package com.demo.Question4.Awards;

import com.demo.Question4.Participants.Student;
import com.demo.Question4.Participants.Teacher;

public abstract class Award {
    public abstract void visit(Teacher teacher);
    public abstract void visit(Student student);
}
