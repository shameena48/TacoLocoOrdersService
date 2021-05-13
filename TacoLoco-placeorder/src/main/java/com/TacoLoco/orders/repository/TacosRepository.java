package com.TacoLoco.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TacoLoco.orders.Model.Tacos;

@Repository
public interface TacosRepository extends JpaRepository<Tacos, Long> {

	Tacos findByitemname(String itemname);

}
