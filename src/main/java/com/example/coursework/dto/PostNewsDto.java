package com.example.coursework.dto;

import com.example.coursework.TypeOfNews;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostNewsDto {

    private Long id;

    private String title, anons;

    private String fullText;

    private long views = 1;

    private TypeOfNews typeOfNews;

    private boolean archived = false;
}