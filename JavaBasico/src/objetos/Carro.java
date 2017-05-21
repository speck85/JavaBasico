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
public class Carro extends Vehiculo{
    int numeroAsientos;

    public Carro(int marcha, int velocidad, int numeroAsientos) {
        super(marcha, velocidad);
        this.numeroAsientos = numeroAsientos;
    }
    
    
    //Se sobreescribe el metodo aumentaVelocidad de la clase Vehiculo
    @Override
    public void aumentaVelocidad(int incremento){
        velocidad = velocidad + incremento + 2;
    }
    
    @Override
    void imprimeEstado(){
        super.imprimeEstado();
        System.out.println("Numero de asientos "+ numeroAsientos);
    }
}
