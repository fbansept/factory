package edu.fbansept;

public class Main {

    public static void main(String[] args) {

        Vehicule velo = VehiculeFactory.createVehicule(VehiculeFactory.VELO);
        Vehicule voiture = VehiculeFactory.createVehicule(VehiculeFactory.VOITURE);

        velo.verification();
        voiture.verification();
    }

}
