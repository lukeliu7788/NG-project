package com.careconnect.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.careconnect.model.Member;

public interface MemberRepository extends /*CrudRepository<Member, Integer>, */JpaRepository<Member, Integer>
{
	
	@Transactional
	@Modifying
	@Query(value="update Member member set member.firstName=:qfirstName, member.lastName=:qlastName, "
			+ "member.suffix=:qSuffix, member.groupName=:qGroupName, member.groupNumber=:qGroupNumber,"
			+ "member.dob=:qDob, member.middleName=:qMiddleName, member.medicaidNumber=:qMedicaidNumber where member.id=:qId",nativeQuery=true)
	void updateMember(@Param("qId") Integer id, @Param("qSuffix") String suffix, @Param("qfirstName") String firstName,
			@Param("qlastName") String lastName, @Param("qGroupName") String groupName, @Param("qGroupNumber") Integer groupNumber,
			@Param("qDob") String dob, @Param("qMiddleName") String middleName, @Param("qMedicaidNumber") Integer medicaidNumber);
	//Iterable<Member> findAll();
	//List<Member> findByLastName(String lastName);
}
