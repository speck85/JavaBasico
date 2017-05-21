/*
 * Copyright (C) 2017 Juan Carlos Garcia Bernal
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package controlDeFlujo;

/**
 *
 * @author Juan Carlos Garcia Bernal
 */
public class TestSwitch {

    public static void main(String[] args) {
        
        //Variable diaDeLaSemana de tipo entero que representa un Día de la semana por un numero del 1 al 7
        //Variable nombreDia que almacenará el nombre del día al ser evaluado por el switch
        int diaDeLaSemana = 1;
        String nombreDia = "";

        switch (diaDeLaSemana) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
        }

        System.out.println("Dia de la semana " + nombreDia);
    }

}
