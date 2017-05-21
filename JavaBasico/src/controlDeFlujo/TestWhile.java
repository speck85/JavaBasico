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
public class TestWhile {
    public static void main(String[] args) {
        
        //Variable contador de tipo entero que nos servira para definir el numero de veces que se ejecutara el bloque
        // de sentencias
        int contador = 1;
        
        //Mientras el valor de la variable sea menor a 11 se ejecutara el bloque de instrucciones
        while(contador < 11){
            System.out.println("La cuenta es: "+ contador);
            contador++; //incremento en uno de la variable contador lo mismo que: "contador = contador + 1;"
        }
    }
}
