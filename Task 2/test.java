package shapes;

public class cylinder {
    
 private double radius;
 private double hight;

    public double getRadius() {
        return radius;
    }//end getRadius

    public void setRadius(double radius) {
        this.radius = radius;
    }//end setRadius

    public double getHight() {
        return hight;
    }//end getHight

    public void setHight(double hight) {
        this.hight = hight;
    }//end setHight


    
    public  void area(){
    
        double SideArea;
        SideArea=2*3.14*hight*radius;
        
        double AreaOfTheTwoBases;
        AreaOfTheTwoBases=2*3.14*radius*radius;
        
        double AreaOfCylinder ;
        AreaOfCylinder=SideArea + AreaOfTheTwoBases;
        
        System.out.println("area of cylinder = "+AreaOfCylinder);
    }//end area
    
    public void volume(){
        
        double VolumeOfCylinder;
        VolumeOfCylinder=2*3.14*radius*radius*hight;
        
        System.out.println("volume of cylinder = "+VolumeOfCylinder);
    }//end volume
    
}//end cylinder





public class circle extends cylinder {
    private double radius;

    public double getRadius() {
        return radius;
    }//end getRadius

    public void setRadius(double radius) {
        this.radius = radius;
    }//end setRadius
    
 
   @Override
   public void area(){
    double AreaOfCircle;
    AreaOfCircle=2*3.14*radius;
    
       System.out.println("area of circle = "+AreaOfCircle);
        
    }//end area 
    
    
    
} //end circle





public class Shapes {


    public static void main(String[] args) {
       cylinder a=new cylinder();
       a.setHight(12);
       a.setRadius(4);
       a.area();
       a.volume();
       
       circle b=new circle();
       b.setRadius(4);
       b.area();
    }//end main
    
}//end Shapes
