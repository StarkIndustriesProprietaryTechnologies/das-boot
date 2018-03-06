/**
 * @author ashish.adhikari
 */
package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.Shipwreck;

/**
 * @author ashish.adhikari
 *
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{
	
}
