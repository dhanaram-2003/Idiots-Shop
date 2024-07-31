package com.idiots.IdiotsShop.repository;

import com.idiots.IdiotsShop.model.Slipper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlipperRepository extends JpaRepository<Slipper,Integer> {
}
