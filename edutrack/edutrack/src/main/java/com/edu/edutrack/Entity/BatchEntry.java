package com.edu.edutrack.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "BatchDetails")
@Getter
@Setter
public class BatchEntry
{
    @Id
    private String id;
    private String name;
    private int fees;
}