package com.example.coursework.dto;

import com.example.coursework.models.TypeOfNews;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PostNewsDto {

    private UUID id;
    @Size(min = 10, max = 1000, message = "Min 10 characters, max - 1000")
    private String title;
    @Size(min = 10, max = 250, message = "Min 10 characters, max - 250")
    private String anons;
    @Size(min = 10, max = 250, message = "Min 10 characters, max - 2500")
    private String fullText;
    private long views = 1;
    private TypeOfNews typeOfNews;
    private boolean archived = false;
    private boolean approved = false;
    private List<CommentsDto> comments;
}
