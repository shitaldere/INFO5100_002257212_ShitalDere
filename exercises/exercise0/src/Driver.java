public class Driver {

    public static void main(String[] args) {

        System.out.println("1. Creating Plant class objects\n");

        Plant indoor = new Plant("indoor", "Money plant", 1, "no sun");
        Plant bonsai = new Plant("bonsai", "Elm", 2, "half sun");
        Plant grass = new Plant("grass", "Bluegrass", 3, "full sun");


        System.out.println("\n");

        System.out.println("2. Creating Pet class objects\n");

        Pet huskie = new Pet("brown",5000);
        Pet cat    = new Pet("white",2000);
        Pet rabbit = new Pet("black",2500);


        System.out.println("\n");

        System.out.println("3. Creating Lamp class objects\n");


        Lamp clublamp     = new Lamp("tiffany glass",3,4.2 );
        Lamp treelamp = new Lamp("plastic", 2,2.5 );
        Lamp archedlamp   = new Lamp(" sea shell",4,5.4);

        System.out.println("\n");

        System.out.println("4. Creating Container class objects\n");

        Container tiffin = new Container("tiffin","square");
        Container bottle    = new Container("bottle","Cylinder");
        Container box  = new Container("box","cube");


        System.out.println("\n");

        System.out.println("5. Creating Shoes class objects\n");


        Shoes sport = new Shoes("gray", "Jordan","leathers");
        Shoes casual = new Shoes("blue", "adidas", "synthetics");
        Shoes sneakers = new Shoes("white","NB","plastic");

        System.out.println("\n");

        System.out.println("6. Creating Cloth class objects\n");

        Cloth shirt = new Cloth("gucci", "medium", "Zebraprint");
        Cloth pant = new Cloth("MK", "small", "Checks");
        Cloth suit = new Cloth("valentino","large","noprint");

        System.out.println("\n");

        System.out.println("7. Creating Furniture class objects\n");

        Furniture chair = new Furniture("Chair", false, "AY5284100");
        Furniture table = new Furniture("Table", true, "TC8546921");
        Furniture sofa  = new Furniture("Sofa" , false,"SD21552366");


        System.out.println("\n");

        System.out.println("8. Creating Gym class objects\n");

        Gym plannetFitness = new Gym("Plannet Fitness",150,24);
        Gym gold = new Gym("Gold gym",80,12);
        Gym orangeTheory = new Gym("Orange Theory",75,10);


        System.out.println("\n");

        System.out.println("9. Creating Backpack class objects\n");

        Backpack gucci =  new Backpack(150,"Round");
        Backpack prada = new Backpack(259,"rectangular");
        Backpack coach =  new Backpack(350,"square ");


        System.out.println("\n");

        System.out.println("10. Creating Toy class objects\n");

        Toy doll = new Toy("cotton",false);
        Toy softToy  = new Toy("softFur",true);
        Toy babyCar = new Toy("sillicon",true);


    }



}
