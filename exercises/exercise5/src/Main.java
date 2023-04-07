
public class Main {

    public static void main(String[] args) {

        System.out.println("Proxy design pattern");
       //  Proxy design pattern
        Shape shape = new ProxyShape("Square");
        shape.draw();

        System.out.println();
        System.out.println("Memento design pattern");

        // Memento design pattern example
        SalesProspect salesProspect = new SalesProspect();
        salesProspect.setName("Shital Dere");
        salesProspect.setPhone("4444-133-111");
        salesProspect.setBudget(25000.0);

        //** Store internal state
        ProspectMemory prospectMemory = new ProspectMemory();
        prospectMemory.setMemento(salesProspect.saveMemento());

        //** Continue changing originator
        salesProspect.setName("Jolly Jeh");
        salesProspect.setPhone("4242-111-111");
        salesProspect.setBudget(1000000.0);

        //** Restore saved state
        salesProspect.restoreMemento(prospectMemory.getMemento());

        System.out.println();
        System.out.println("Singleton design pattern");

        //Singleton design pattern example
        Government singleton = Government.getReference();
        singleton.setName("republic");
        singleton.setTotalJobs(146);
        System.out.println(singleton.getName());
        System.out.println(singleton.getTotalJobs());

    }
}