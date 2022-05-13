package com.kenoh.domosushi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kenoh.domosushi.models.DomoSchedule;

@Repository
public interface DomoScheduleRepository extends CrudRepository<DomoSchedule, Long> {
	List<DomoSchedule> findAll();
}
