public class Plant {
    int numWeeksOld;
    String color;
    boolean isEdible;

    public Plant(int pweeksold, String pcolor, boolean pEdible){
        numWeeksOld = pweeksold;
        color = pcolor;
        isEdible = pEdible;
    }
    public void printInfo(){
        System.out.println("This " + color +  " plant is " + numWeeksOld + " weeks old, and it is " + isEdible + " that the plant is edible.");
    }
}
