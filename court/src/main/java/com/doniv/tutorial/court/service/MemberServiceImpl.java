package com.doniv.tutorial.court.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.doniv.tutorial.court.domain.*;


public class MemberServiceImpl implements MemberService {

    private Map<String, Member> members = new TreeMap<String, Member>();

    public void add(Member member) {
        members.put(member.getName(), member);
    }

    public void remove(String memberName) {
        members.remove(memberName);
    }

    public List<Member> list() {
        return new ArrayList<Member>(members.values());
    }
}
