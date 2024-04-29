package com.ps.swipeservice.repository;

import com.ps.swipeservice.model.SwipeEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SwipeEventRepository extends JpaRepository<SwipeEvent, Integer> {

}
