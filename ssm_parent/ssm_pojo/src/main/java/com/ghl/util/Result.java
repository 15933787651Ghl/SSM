package com.ghl.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result<T>{

    private  boolean success=true;

    private String message;


    private T content;

    private Integer state;


}
