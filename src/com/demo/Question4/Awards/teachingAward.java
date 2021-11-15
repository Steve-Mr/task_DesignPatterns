package com.demo.Question4.Awards;

import com.demo.Question4.Participants.Student;
import com.demo.Question4.Participants.Teacher;

public class teachingAward extends Award{
    @Override
    public void visit(Teacher teacher) {
        double score = teacher.getScore();
        if (score >= 90) System.out.println(teacher.getName() + "老师获得参加教学奖评选的资格");
    }

    @Override
    public void visit(Student student) {
        double avgScore = student.getAvgScore();
        if (avgScore >= 90) System.out.println(student.getName() + "同学获得参加教学奖评选的资格");
    }
}
