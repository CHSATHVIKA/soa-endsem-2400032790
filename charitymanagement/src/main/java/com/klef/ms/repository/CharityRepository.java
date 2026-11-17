package com.klef.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.ms.entity.CharityEntity;

public interface CharityRepository extends JpaRepository<CharityEntity, Long> {
}
