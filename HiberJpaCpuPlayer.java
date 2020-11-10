package fkd.java.hiberdog;

import java.util.Random;

public class HiberJpaCpuPlayer extends HiberJpaPlayers {
    Random random = new Random();
    HiberJpaDogsBreed dogsSizeAndBreed = new HiberJpaDogsBreed();
    HiberJpaFoodForDogs foodForDogs = new HiberJpaFoodForDogs();
    String Name = "CPU";

    public String setCpuBreed (String dSize) {

        if (dSize.equals("1")){
            return dogsSizeAndBreed.getMapDogSizeLarge().get(random.nextInt(dogsSizeAndBreed.mapDogSizeLarge.size())+1);
        }
        if (dSize.equals("2")){
            return dogsSizeAndBreed.getMapDogSizeMedium().get(random.nextInt(dogsSizeAndBreed.mapDogSizeMedium.size())+1);
        }
        if (dSize.equals("3")){
            return dogsSizeAndBreed.getMapDogSizeSmall().get(random.nextInt(dogsSizeAndBreed.mapDogSizeSmall.size())+1);
        }
        return "";
    }
    public String setCpuFood () {
        return foodForDogs.getMapFoodForDogs().get(String.valueOf(random.nextInt(foodForDogs.mapFoodForDogs.size())+1));
    }
    public String setCpuWater () {
        if (random.nextInt(2)+1 == 1) {
            return "Yes";
        }
        else
            return "No";
    }

    public String getName() {
        return Name;
    }
}
