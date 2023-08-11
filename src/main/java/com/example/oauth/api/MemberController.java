package com.example.oauth.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.oauth.entities.Member;
import com.example.oauth.member.MemberService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/member")
public class MemberController {

    private final MemberService memberService;


    @GetMapping("/{uuid}")
    public Member getMember(
        @PathVariable String uuid
    ) {
        return memberService.getMember(uuid);
    }
}