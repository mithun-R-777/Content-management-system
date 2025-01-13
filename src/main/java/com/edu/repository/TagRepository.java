package com.edu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.Entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
}
