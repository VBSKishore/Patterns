/**
 * Kishore Vattumilli
 */
package com.kishore.DMS.repository;

import org.springframework.data.repository.CrudRepository;


import com.kishore.DMS.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {
	
}
