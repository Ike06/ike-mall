package com.ike.demo.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class Book {
    private int id;
    private String name;
    private String author;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publiccataionDate;
}
