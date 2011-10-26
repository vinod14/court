package com.doniv.tutorial.court.service;

import java.util.List;

import com.doniv.tutorial.court.domain.*;

public interface MemberService {

    public void add(Member member);
    public void remove(String memberName);
    public List<Member> list();
}
