package com.rafiqul.CustomerRelationshipManagement.repository;

import com.rafiqul.CustomerRelationshipManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
