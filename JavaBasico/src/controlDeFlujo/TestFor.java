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
public class TestFor {
    public static void main(String[] args) {
        
        /*
        *  La forma general de usar el ciclo for es la siguiente:
        *  for(inicialización ; condicion de termino ; incremento){
        *      sentencias;
        *   }
        */
        for(int i=0; i<10; i++){
            
            System.out.println("El valor de i es "+i);
        
        }
    }
}
