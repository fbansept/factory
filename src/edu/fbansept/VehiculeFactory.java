package edu.fbansept;

public class VehiculeFactory {

    public static final String VELO = "velo";
    public static final String VOITURE = "voiture";

    public static Vehicule createVehicule (String type) {
        Vehicule vehicule = null;

        switch (type) {
            case VELO:
                vehicule = new Velo();
                break;
            case VOITURE:
                vehicule = new Voiture();
                break;
            default:
                throw new IllegalArgumentException("Type de vehicule inconnu");
        }

        return vehicule;
    }
}
