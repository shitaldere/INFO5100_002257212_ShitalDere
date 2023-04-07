
public class ProxyShape implements Shape {

    //  Proxy design pattern
    private RealShape realShape;
    private String shapename;

    ProxyShape(String shapename){
        this.shapename=shapename;
    }

    public void draw(){
     if (realShape ==null){

         realShape = new RealShape(shapename);
     }
       realShape.draw();
    }

}
