package com.edu.edutrack.Repository;

import com.edu.edutrack.Entity.BatchEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchEntryRepository extends MongoRepository<BatchEntry, String>
{

}