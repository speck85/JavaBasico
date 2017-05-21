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
class Vehiculo implements IVehiculo {

    int velocidad = 0;
    int marcha = 1;
    
    public Vehiculo(int marcha, int velocidad){
        this.marcha = marcha;
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    @Override
    public void cambiaMarcha(int nuevaMarcha) {
        marcha = nuevaMarcha;
    }

    @Override
    public void aumentaVelocidad(int incremento) {
        velocidad = velocidad + incremento;
    }

    void imprimeEstado() {
        System.out.println(" velocidad:" + velocidad + " marcha: " + marcha);
    }
}
