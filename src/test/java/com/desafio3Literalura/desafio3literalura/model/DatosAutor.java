package com.desafio3Literalura.desafio3literalura.model;
import
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutor {


    @JsonAlias("name") String nombre,
    @JsonAlias("birth_year") String fechaDeNacimiento,
    @JsonAlias("death_year") String fechaDeFallecimiento,


}
