package com.example.get_nested_fields_in_tymeleaf;

import lombok.Data;

import java.util.List;

@Data
public class MyForm {

    private List<ServerDate> serverDateList;

}
