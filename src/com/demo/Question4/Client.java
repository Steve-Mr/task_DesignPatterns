package com.demo.Question4;

import com.demo.Question4.Awards.Award;
import com.demo.Question4.Awards.researchAward;
import com.demo.Question4.Participants.Participant;
import com.demo.Question4.Participants.Student;
import com.demo.Question4.Participants.Teacher;
import com.demo.Util.XMLUtil;

/**
 * 某单位的年度奖励审批系统，
 * 可以实现对教师和研究生的奖励审批，现有奖励的类型有科研奖和教学奖。
 *
 * 如果教师当年发表的SCI论文数量超过5篇，
 * 或研究生当年发表的SCI论文数量超过2篇，
 * 可以参加科研奖的评选；
 *
 * 如果教师当年教学考评综合成绩大于等于90分，
 * 或研究生当年所有必修课的平均成绩大于等于90分，
 * 可以参加教学奖的评选。
 *
 * 现使用访问者模式设计该系统，以判断候选人集合中，教师或研究生是否符合某种获奖条件。
 * */
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
