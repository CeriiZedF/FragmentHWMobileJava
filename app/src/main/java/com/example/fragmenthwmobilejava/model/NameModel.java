package com.example.fragmenthwmobilejava.model;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class NameModel {
    private String name;
    private String nameDay;
    private String meaning;

    public NameModel(String name) {
        this.name = name;
    }


}
