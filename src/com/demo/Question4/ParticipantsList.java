package com.demo.Question4;

import com.demo.Question4.Participants.Participant;
import com.demo.Question4.Awards.Award;

import java.util.ArrayList;

public class ParticipantsList {
    private ArrayList<Participant> participantList = new ArrayList<>();

    public void addParticipant(Participant participant){
        participantList.add(participant);
    }

    public void accept(Award award){
        for (Participant participant : participantList){
            participant.accept(award);
        }
    }
}
