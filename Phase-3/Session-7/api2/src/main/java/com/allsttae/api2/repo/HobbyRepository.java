package com.allsttae.api2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.allsttae.api2.entity.Hobby;

@Repository
public interface HobbyRepository extends JpaRepository<Hobby, Integer>{

	@Query("select h.hobby from Hobby h where h.personId=:personId")
	public String findByPersonId(int personId);
}
