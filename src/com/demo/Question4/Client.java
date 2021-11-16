package com.demo.Question4;

import com.demo.Question4.Participants.Participant;
import com.demo.Question4.Participants.Student;
import com.demo.Question4.Participants.Teacher;
import com.demo.Question4.Awards.Award;
import com.demo.Question4.Awards.researchAward;
import com.demo.Util.XMLUtil;

public class Client {

    public static void main(String[] args) {
        ParticipantsList participantsList = new ParticipantsList();
        Participant teacher1, teacher2, student1, student2;

        teacher1 = new Teacher("张三", 6, 92);
        teacher2 = new Teacher("李四", 4, 90);
        student1 = new Student("王五", 1, 95);
        student2 = new Student("赵四", 3, 89);

        participantsList.addParticipant(teacher1);
        participantsList.addParticipant(teacher2);
        participantsList.addParticipant(student1);
        participantsList.addParticipant(student2);

        Award award;

        award = new researchAward();
        participantsList.accept(award);

        award = (Award)XMLUtil.getBean("src/com/demo/Question4/config.xml");
        participantsList.accept(award);

    }
}
