package com.edu.edutrack.Service;

import com.edu.edutrack.Entity.BatchEntry;
import com.edu.edutrack.Repository.BatchEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BatchEntryService
{
    @Autowired
    private BatchEntryRepository batchEntryRepository;

    public void saveEntry(BatchEntry batchEntry)
    {
        batchEntryRepository.save(batchEntry);
    }

    public List<BatchEntry> getAll()
    {
        return batchEntryRepository.findAll();
    }

    public Optional<BatchEntry> findById(String id)
    {
        return batchEntryRepository.findById(id);
    }

    public void deleteById(String id)
    {
        batchEntryRepository.deleteById(id);
    }
}