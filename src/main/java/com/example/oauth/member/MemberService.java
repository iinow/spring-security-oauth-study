package com.example.oauth.member;

import org.springframework.stereotype.Service;

import com.example.oauth.entities.Member;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MemberService {
    
    private final MemberRepository memberRepository;

    public Member getMember(String uuid) {
        return memberRepository.findById(uuid).orElseThrow();
    }

    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    public Member updateMember(Member member) {
        return memberRepository.save(member);
    }

    public void deleteMember(String uuid) {
        memberRepository.deleteById(uuid);
    }
}
