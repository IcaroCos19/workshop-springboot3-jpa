package com.EstudoWeb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.EstudoWeb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> 
{ 
    
}
