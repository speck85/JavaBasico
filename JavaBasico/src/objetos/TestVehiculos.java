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
package objetos;

/**
 *
 * @author Juan Carlos Garcia Bernal
 */
public class TestVehiculos {

    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo(3, 100);
        Carro miCarro = new Carro(1, 50, 5);
        Camioneta miCamioneta = new Camioneta(2, 150, 500);
        
        System.out.println("Estado de mi Vehiculo:");
        miVehiculo.imprimeEstado();
        
        System.out.println("Estado de miCarro:");
        miCarro.imprimeEstado();
        
        System.out.println("Estado de miCamioneta:");
        miCamioneta.imprimeEstado();
    }

}
