package com.ICM.GestionCamiones.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CheckListExpreso")
public class CheckListExpresoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    //Cabina
    private Boolean pruebaArranque;
    private Boolean funcionamientoTablero;
    private Boolean presionFrenos;
    private Boolean presionSuspencion;
    private Boolean cargaAlternador;
    private Boolean frenoMotor;
    private Boolean giroTimon;
    private Boolean tensionEmbrague;
    private Boolean funcionamientoClaxon;
    private Boolean alarmaRetroceso;
    private Boolean cinturonSeguridad;
    private Boolean espejosLunas;
    private Boolean estadoVidrios;
    private Boolean baseEspejo;
    private Boolean funcionamientoChapas;
    private Boolean filtroAire;

    //Compartimiento del Motor
    private Boolean fajaVentilador;
    private Boolean nivelAceite;
    private Boolean nivelRefrigerante;
    private Boolean nivelFluidoCajaD;
    private Boolean filtroAireMotor;
    private Boolean filtroSeparadorCombustible;
    private Boolean holguraDireccion;
    private Boolean ductoAdmision;
    private Boolean ductoEscape;
    private Boolean presionAire;
    private Boolean vidaBateria;
    private Boolean filtroRecirculacionAire;
    private Boolean estanqueidadMotor;
    private Boolean filtroAceiteMotor;

    //Revision de la parte baja, posterior del tracto y carreta
    private Boolean ajusteTapon;
    private Boolean holguraTerminales;
    private Boolean suspensionDelantera;
    private Boolean descarteFugaAire;
    private Boolean descarteFugaAceite;
    private Boolean suspensionPosterior;
    private Boolean inspeccionZapatas;
    private Boolean estadoRachet;
    private Boolean suspensionNeumatica;
    private Boolean tandem;
    private Boolean chasisYPuentes;
    private Boolean estadoSilenciador;
    private Boolean tornamesa;
    private Boolean manparones;
    private Boolean visualNeumaticos;
    private Boolean visualEmisores;
    private Boolean funcionamientoLuces;
    private Boolean cortinasFurgon;
    private Boolean cintaReflectiva;
    private Boolean placasRodaje;
    private Boolean seguroCargar;
    private Boolean mecanismoCortinas;
    private Boolean estructuraSemiremolque;
}
