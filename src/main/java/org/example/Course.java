package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
public class Course {
    String id;
    String name;
    String teacher;
    List<Student> students=new ArrayList<>();
}
