package gestion_veterinaria;
import gestion_veterinaria.Mascota;
import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private List<Mascota> listaMascotas;

    public Veterinaria() {
        this.listaMascotas = new ArrayList<>();
    }

    public void mostrarMascotas() {
        if (listaMascotas.isEmpty()) {
            System.out.println("No hay mascotas en el sistema.");
        } else {
            listaMascotas.forEach(System.out::println);
        }
    }
}
