package com.example.bookstore.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@Entity
@Table(name = "DMDungCu")
public class DMDungCu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDMDungCu", nullable = false)
    @NotBlank(message = "Không được để trống")
    private String MaDMDungCu;

    @Column(name = "Khoi", nullable = false)
    private String Khoi;

    @Column(name = "MoTa", nullable = false)
    private String MoTa;
}

