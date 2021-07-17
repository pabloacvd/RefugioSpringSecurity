package ar.com.xeven.refugiospring.entities;

import javax.persistence.Entity;

@Entity
public class Ave extends Animal {
    private int cantidadplumas;
    private int cantidadalas;

    @Override
    public String toString() {
        return "Ave{" +
                "idAnimal=" + idanimal +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                ", cantidadplumas=" + cantidadplumas +
                ", cantidadalas=" + cantidadalas +
                '}';
    }

    public int getCantidadplumas() {
        return cantidadplumas;
    }

    public void setCantidadplumas(int cantidadplumas) {
        this.cantidadplumas = cantidadplumas;
    }

    public int getCantidadalas() {
        return cantidadalas;
    }

    public void setCantidadalas(int cantidadalas) {
        this.cantidadalas = cantidadalas;
    }
}
