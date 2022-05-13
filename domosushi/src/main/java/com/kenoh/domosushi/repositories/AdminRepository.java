package com.kenoh.domosushi.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kenoh.domosushi.models.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {
	Optional<Admin> findByEmail(String email);
}
