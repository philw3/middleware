package com.middleware.middleware_tec.resource;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Users, Integer> {
}

