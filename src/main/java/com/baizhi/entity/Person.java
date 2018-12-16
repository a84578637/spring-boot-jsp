package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    @Id
    private Integer id;
    @Column(name="name")
    private String name;
    private String mobile;
    private String email;
    private String city;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    @Transient
    private String trans;
}
