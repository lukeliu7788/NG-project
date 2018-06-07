package com.careconnect.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.careconnect.model.Member;
import com.careconnect.repo.MemberRepository;

@RestController
public class MemberController {
	
	@Autowired
	MemberRepository memRepository;
	
	@GetMapping(value="/member",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Member> getAll() {
		List<Member> list = new ArrayList<>();
		list = memRepository.findAll();

		//members.forEach(list::add);
		return list;
	}
	
	@PostMapping(value="/postMember")
	public Member postMember(@RequestBody Member member) {
		return memRepository.saveAndFlush(member);
	}
	
	@PostMapping(value="/member/{id}")
	public void updateMember(@PathVariable("id") Integer id,@RequestBody Member member) {
		Member updatedMember=memRepository.findOne(id);
		memRepository.updateMember(updatedMember.getId(), member.getSuffix(), member.getFirstName(), member.getLastName(), member.getGroupName(), 
				member.getGroupNumber(), member.getDob(), member.getMiddleName(), member.getMedicaidNumber());
		memRepository.flush();
		//System.out.println(updatedMember.getSuffix());
	}
	
	@DeleteMapping(value="/member/{id}")
	public void deleteMember(@PathVariable("id") Integer id){
		memRepository.delete(id);
		memRepository.flush();
	}
}
