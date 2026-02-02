public class Greenhouse{
    String name;
    boolean sprinklersOn;
    int numberOfFlowers;
    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();
    }

    public Greenhouse(){
        System.out.println("Hello World! Good luck on your exams!");
        name = "Planting Parameters at the CSG";
        sprinklersOn = true;
        numberOfFlowers = 31;
        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering plants right now. We have " + numberOfFlowers + " flowers!");
        numberOfFlowers = 24;
        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering plants right now. We have " + numberOfFlowers + " flowers!");
        randomReplant();
        veggieOfTheDay("cauliflower");
        countFlowers();
        changeTemperature();
        Plant kimPlant = new Plant(3, "orange", true);
        kimPlant.printInfo();
        Plant myPlant = new Plant(2, "green", false);
        myPlant.printInfo();
        starTriangle(9);
        perimeterTriangle(11);

    }
    public void randomReplant(){
        int randomInt = (int)(Math.random() * 15) + 1;
        System.out.println("We are replanting " + randomInt + " vegetables today!");

    }
    public void veggieOfTheDay(String veggie){
        System.out.println("Today's chosen veggie is " + veggie + ".");

    }
    public void countFlowers(){
        for(int i = 2; i <7; ++i){
            System.out.println(i);
        }
        for(int x = 20; x < 140; x+=30){
            System.out.println(x);
        }
        for(int y = 8; y >-1; y-=1){
            System.out.print(y + ", ");

        }
    }
    public void changeTemperature(){
        double randomNum = Math.random();
        if(randomNum < 0.25){
            System.out.println("The temperature has decreased by 2 degrees.");
        }
        else if(randomNum >= 0.25 && randomNum<0.5){
            System.out.println("The temperature has decreased by 1 degree.");
        }else if(randomNum >=0.5 && randomNum <0.75){
            System.out.println("The temperature has increased by 1 degree");
        }else if(randomNum >=0.75 && randomNum < 1) {
            System.out.println("The temperature has increased by 2 degrees.");
        }
    }
    public void starTriangle(int psize){
        for(int x = psize; x > 0; --x){
            for(int y = x; y<psize + 1; ++y){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public void perimeterTriangle(int pparametersize){

        for(int x = pparametersize; x > 0; --x){
            for(int y = x; y<pparametersize+1; ++y){
                if(x > 1 && x <pparametersize -1 && y>x && y<pparametersize){
                    System.out.print("*");
                }
                else {
                    System.out.print("-");
                }
            }
            System.out.println(" ");

        }

    }
}
