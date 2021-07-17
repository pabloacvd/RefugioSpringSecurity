package ar.com.xeven.refugiospring.entities;

import javax.persistence.Entity;

@Entity
public class Gato extends Animal {

    private int cantidadvidasrestantes;

    public int getCantidadvidasrestantes() {
        return cantidadvidasrestantes;
    }

    public void setCantidadvidasrestantes(int cantidadvidasrestantes) {
        this.cantidadvidasrestantes = cantidadvidasrestantes;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "idAnimal=" + idanimal +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                ", cantidadvidasrestantes=" + cantidadvidasrestantes +
                '}';
    }

}
