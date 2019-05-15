package com.prcbadminton.badminton.repository;

import com.prcbadminton.badminton.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}
