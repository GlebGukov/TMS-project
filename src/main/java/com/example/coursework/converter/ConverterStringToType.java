package com.example.coursework.converter;

import com.example.coursework.TypeOfNews;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Service
public class ConverterStringToType {
    public TypeOfNews convertStringToTypeNews(String type) {
        return TypeOfNews.valueOf(TypeOfNews.class, type);
    }
}