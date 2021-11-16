package com.demo.Question4;

import com.demo.Question4.Awards.Award;
import com.demo.Question4.Participants.Participant;

import java.util.ArrayList;

/**
 * 参与者列表类
 * */
public class ParticipantsList {
    private final ArrayList<Participant> participantList = new ArrayList<>();

    public void addParticipant(Participant participant){
        participantList.add(participant);
    }

    public void accept(Award award){
        for (Participant participant : participantList){
            participant.accept(award);
        }
    }
}
