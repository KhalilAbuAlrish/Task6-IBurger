package Moudle;

public class FoodMoudle {

    private int imageBackground;
    private String foodName;
    private String foodPrice;
    private String malePrice;
    private String foodNumber;


    public FoodMoudle(int imageBackground, String foodName, String foodPrice, String malePrice,String foodNumber) {
        this.imageBackground = imageBackground;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.malePrice = malePrice;
        this.foodNumber=foodNumber;
    }


    public String getFoodNumber() {
        return foodNumber;
    }

    public void setFoodNumber(String foodNumber) {
        this.foodNumber = foodNumber;
    }

    public int getImageBackground() {
        return imageBackground;
    }

    public void setImageBackground(int imageBackground) {
        this.imageBackground = imageBackground;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getMalePrice() {
        return malePrice;
    }

    public void setMalePrice(String malePrice) {
        this.malePrice = malePrice;
    }
}
