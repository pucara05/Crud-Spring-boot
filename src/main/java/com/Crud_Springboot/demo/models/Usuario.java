package com.Crud_Springboot.demo.models;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.Data;



@Entity
@Data
public class Usuario {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

private String name;

@Email
private String email;



}
