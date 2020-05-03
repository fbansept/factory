package edu.fbansept;

public class Voiture extends Vehicule {
    @Override
    void verification() {
        System.out.println("---- Verification voiture ----");
        System.out.println("Verification plein d'essence ...");
        System.out.println("Verification état carrosserie ...");
    }
}
