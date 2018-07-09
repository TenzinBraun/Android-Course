package fr.iutmindfuck.adapterviewexercise.data;

public class Animals {

    private String animalName;
    private int animalSize;
    private String animalGender;

    public Animals(String animalName, int animalSize, String animalGender) {
        this.animalName = animalName;
        this.animalSize = animalSize;
        this.animalGender = animalGender;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalSize() {
        return animalSize;
    }

    public void setAnimalSize(int animalSize) {
        this.animalSize = animalSize;
    }

    public String getAnimalGender() {
        return animalGender;
    }

    public void setAnimalGender(String animalGender) {
        this.animalGender = animalGender;
    }
}
