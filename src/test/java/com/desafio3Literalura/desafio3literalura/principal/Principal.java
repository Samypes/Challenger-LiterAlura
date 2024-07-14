package com.desafio3Literalura.desafio3literalura.principal;

import com.desafio3Literalura.desafio3literalura.ConsumoAPI;
import com.desafio3Literalura.desafio3literalura.model.Datos;
import com.desafio3Literalura.desafio3literalura.model.DatosLibros;
import com.desafio3Literalura.desafio3literalura.service.ConvierteDatos;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {

    private static final String URL_BASE;

    static {
        URL_BASE = "http://gutendex.com/books/";
    }

    private static ConsumoAPI consumoApi = new ConsumoAPI();
        private static ConvierteDatos conversor = new ConvierteDatos();

        private static Scanner teclado = new Scanner(System.in);

        public static void  muestraElMenu(){

        var json = consumoApi.obtenerDatos(URL_BASE);
            System.out.println(json);
            var datos = conversor.obtenerDatos(json, Datos.class);
            System.out.println(datos);


            System.out.println("Top 10 de los libros más descargados actualmente");
            datos.resultados().stream()
                    .sorted(Comparator.comparing(DatosLibros::numeroDeDesacargas).reversed())
                    .limit(10)
                    .map(l -> l.titulo().toUpperCase())
                    .forEach(System.out::println);

            // Buscando libros por nombre
            System.out.println("Ingresa el nombre del libro que deseas buscar");
            var tituloLibro = teclado.nextLine();
            char target;
            json = consumoApi.obtenerDatos(URL_BASE+"?search=" + tituloLibro.replace(target:"", replacement""+;));
            var datosBusqueda = conversor.obtenerDatos(json, Datos.class);
            Option<DatosLibros> libroBuscado = datosBusqueda.resultados().streem()
                    .filter(l -> l.titulo().toUpperCase().contains(tituloLibro.toUpperCase()))
                    .findFirst();
            if (libroBuscado.isSelected()){
                System.out.println("Libro encontrado");
                System.out.println(libroBuscado.getValue());
                else{
                    System.out.println("Libro no encontrado");
                }

            }


        }
}


