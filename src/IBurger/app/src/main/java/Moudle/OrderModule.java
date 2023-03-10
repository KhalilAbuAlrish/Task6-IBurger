package Moudle;

public class OrderModule {

    private int backgroundOrder;
    private int imageOrder;
    private String nameOrder;
    private String priceOrder;
    private String numberOfOrder;


    public OrderModule(int backgroundOrder, int imageOrder, String nameOrder, String priceOrder, String numberOfOrder) {
        this.backgroundOrder = backgroundOrder;
        this.imageOrder = imageOrder;
        this.nameOrder = nameOrder;
        this.priceOrder = priceOrder;
        this.numberOfOrder = numberOfOrder;
    }


    public int getBackgroundOrder() {
        return backgroundOrder;
    }

    public void setBackgroundOrder(int backgroundOrder) {
        this.backgroundOrder = backgroundOrder;
    }

    public int getImageOrder() {
        return imageOrder;
    }

    public void setImageOrder(int imageOrder) {
        this.imageOrder = imageOrder;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public String getPriceOrder() {
        return priceOrder;
    }

    public void setPriceOrder(String priceOrder) {
        this.priceOrder = priceOrder;
    }

    public String getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(String numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }
}
