// Memento design pattern
public class SalesProspect {

    private String name;
    private String phone;
    private double budget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name:  " + name);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        System.out.println("Phone: " + phone);
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
        System.out.println("Budget: " + budget);
    }

    // Stores memento
    public Memento saveMemento(){
        System.out.println();
        System.out.println("Saving state --");
        System.out.println();
        return new Memento(name, phone, budget);
    }

    // Restores memento
    public void restoreMemento(Memento memento){
        System.out.println();
        System.out.println("Restoring state --");
        System.out.println();
        this.setName(memento.getName());
        this.setPhone(memento.getPhone());
        this.setBudget(memento.getBudget());
    }

}
