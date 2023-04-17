package us.tiffanyk;

public class UserInfo {
    private String animalType;

    public UserInfo(String animalType) {
        setAnimalType(animalType);
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        if (animalType == null && animalType.isBlank()) {
            throw new IllegalArgumentException("Animal type must be entered:");
        }
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal Entered: " + animalType +
                '}';
    }
}
