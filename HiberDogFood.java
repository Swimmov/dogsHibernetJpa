package fkd.java.hiberdog.domain;

import javax.persistence.*;

@Entity
@Table(name = "mixfood1")

public class HiberDogFood {
    @Id
    @Column(name = "id")
    private int foodId;
    @Column(name = "morningFood")
    private String foodMorning;
    @Column(name = "eveningFood")
    private String foodEvening;
    @Column(name = "water")
    private String foodWater;


    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodMorning() {
        return foodMorning;
    }

    public void setFoodMorning(String foodMorning) {
        this.foodMorning = foodMorning;
    }

    public String getFoodEvening() {
        return foodEvening;
    }

    public void setFoodEvening(String foodEvening) {
        this.foodEvening = foodEvening;
    }

    public String getFoodWater() {
        return foodWater;
    }

    public void setFoodWater(String foodWater) {
        this.foodWater = foodWater;
    }
    @Override
    public String toString() {
        return "HiberDogFood{" +
                "foodId=" + foodId +
                ", foodMorning='" + foodMorning + '\'' +
                ", foodEvening='" + foodEvening + '\'' +
                ", foodWater='" + foodWater + '\'' +
                '}';
    }
}
