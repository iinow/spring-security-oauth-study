package com.example.oauth.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oauth.entities.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
    
}
