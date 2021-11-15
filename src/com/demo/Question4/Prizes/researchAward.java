package com.demo.Question4.Prizes;

import com.demo.Question4.Participants.Student;
import com.demo.Question4.Participants.Teacher;

public class researchAward extends Award {
    @Override
    public void visit(Teacher teacher) {
        int numSCI = teacher.getNumSCI();
        if (numSCI > 5) System.out.println(teacher.getName() + "老师获得参加科研奖评选的资格");
    }

    @Override
    public void visit(Student student) {
        int numSCI = student.getNumSCI();
        if (numSCI > 2) System.out.println(student.getName() + "同学获得参加科研奖评选的资格");
    }
}
