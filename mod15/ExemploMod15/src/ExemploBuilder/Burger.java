package ExemploBuilder;

public class Burger {

    private String bun = "No Bun";
    private String meat = "No Meat";
    private String salad = "No salad";
    private String cheese = "No cheese";
    private String sauce = "No Sauce";

    public String getBun() {
        return bun;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getSalad() {
        return salad;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void print() {
        System.out.println(
                "Burger is finisheed! " + "n" +
                        "Bun: " + bun +
                        " - Meat: " + meat +
                        " - Cheese: " + cheese +
                        " - Salad: " + salad +
                        " - Sauce: " + sauce);

    }
}
