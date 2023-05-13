package com.lucatinkelemberg.backend.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table 
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class DatosEducacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer idEducacion;
    @Basic
    String educacion_institucion;
    String educacion_periodo;
}
