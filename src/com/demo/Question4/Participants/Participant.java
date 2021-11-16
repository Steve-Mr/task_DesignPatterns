package com.demo.Question4.Participants;

import com.demo.Question4.Awards.Award;

public interface Participant {
    //接受一个抽象访问者的访问
    void accept(Award judge);
}
