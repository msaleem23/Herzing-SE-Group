package com.unitseven.springboot.repository;

import com.unitseven.springboot.Entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usersRepository extends JpaRepository<user, Integer> {


}
