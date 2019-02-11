package com.bikeregistry.bikeregistrysys.Repositories;

import com.bikeregistry.bikeregistrysys.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike,Long> {
}
