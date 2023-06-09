package com.info.trabajopractico.domain;

import java.util.UUID;

public class Jugador {

        private UUID id;
        private String nombre;
        private String apellido;
        private double altura;
        //private String posicion;
        private int goles;
        private int partidos;
        private boolean esCapitan;
        private int numeroCamiseta;
        private Equipo equipo;
        private Posicion posicion;

        public Jugador(String nombre, String apellido, double altura,int goles, int partidos, boolean esCapitan, int numeroCamiseta, Equipo equipo,Posicion posicion) {
                this.id = UUID.randomUUID();
                this.nombre = nombre;
                this.apellido = apellido;
                this.altura = altura;
                this.goles = goles;
                this.partidos = partidos;
                this.esCapitan = esCapitan;
                this.numeroCamiseta = numeroCamiseta;
                this.equipo = equipo;
                this.posicion = posicion;
        }
        public Jugador(String nombre,String apellido,Equipo equipo,Posicion posicion){
                this.nombre = nombre;
                this.apellido = apellido;
                this.equipo = equipo;
                this.posicion = posicion;
        }
        public Jugador(String nom, String ape, double medida, int goles, int partidosJugados, boolean esCapitan, int camiseta, String equipo){

        }

        public Jugador(String nom, String ape, double medida, int goles, int partidosJugados, boolean esCapitan, int camiseta, String equipo, String posicion) {
        }

        public Jugador(String nombre, String apellido, double altura, int goles, int partidos, boolean esCapitan, int numeroCamiseta) {
                this.nombre = nombre;
                this.apellido = apellido;
                this.altura = altura;
                this.goles = goles;
                this.partidos = partidos;
                this.esCapitan = esCapitan;
                this.numeroCamiseta = numeroCamiseta;
        }

        public Jugador() {

        }

        public UUID getId() {
                return id;
        }

        public void setId(UUID id) {
                this.id = id;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getApellido() {
                return apellido;
        }

        public void setApellido(String apellido) {
                this.apellido = apellido;
        }

        public double getAltura() {
                return altura;
        }

        public void setAltura(double altura) {
                this.altura = altura;
        }

        public Posicion getPosicion() {
                return posicion;
        }

        public void setPosicion(Posicion posicion) {
                this.posicion = posicion;
        }

        /**
        public String getPosicion() {
                return posicion;
        }

        public void setPosicion(String posicion) {
                this.posicion = posicion;
        }
 **/

        public int getGoles() {
                return goles;
        }

        public void setGoles(int goles) {
                this.goles = goles;
        }

        public int getPartidos() {
                return partidos;
        }

        public void setPartidos(int partidos) {
                this.partidos = partidos;
        }
        public Boolean getEsCapitan() {
                return esCapitan;
        }

        public void setEsCapitan(boolean esCapitan) {
                this.esCapitan = esCapitan;
        }

        public int getNumeroCamiseta() {
                return numeroCamiseta;
        }

        public void setNumeroCamiseta(int numeroCamiseta) {
                this.numeroCamiseta = numeroCamiseta;
        }

        public Equipo getEquipo() {
                return equipo;
        }

        public void setEquipo(Equipo equipo) {
                this.equipo = equipo;
        }

        @Override
        public String toString() {
                return "Jugador: " +
                        "Identificador: " + id +'\n' +
                        "Nombre: " + nombre + '\n' +
                        "Apellido: " + apellido + '\n' +
                        "Altura: " + altura + '\n' +
                        "Posicion: '" + posicion + '\n' +
                        "Goles: " + goles + '\n' +
                        "Partidos: " + partidos + '\n' +
                        "Es Capitan? " + esCapitan + '\n' +
                        "Numero Camiseta: " + numeroCamiseta + '\n' +
                        "Equipo: " + equipo ;
        }

        public void isEsCapitan() {
        }
}
