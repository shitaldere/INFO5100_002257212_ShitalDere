//  Proxy design pattern
public class RealShape implements Shape {

    private String shapeName;

    RealShape(String shapeName){
     this.shapeName= shapeName;
    }

    public void draw(){
        System.out.println(" drawing  shape : " + shapeName);
    }

}
