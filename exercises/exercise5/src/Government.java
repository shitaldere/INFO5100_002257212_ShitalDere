
// Singleton design pattern
public class Government {

   private String name;
   private int totalJobs;

   private Government(){

   }
   private static Government reference =null;
   public static Government getReference() {
       if (Government.reference == null) ;
       Government.reference = new Government();
       return Government.reference;
   }
    public String getName(){
       return name;
    }
    public void setName(String name){
       this.name = name;
    }
    public int getTotalJobs() {
        return totalJobs;
    }
    public void setTotalJobs(int totalJobs){
       this.totalJobs = totalJobs;
    }

   }

