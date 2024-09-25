import java.util.Scanner;

class cylinder{
    private int radius;
    private int height;
    public void setRadius(int radius)
    {
        this.radius=radius;
    }
    public void setHeight(int height)
    {
        this.height=height;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public  double volume(){
//        volume of cylinder = pi*r*r*h
        double vol= Math.PI*this.radius*this.radius*this.height;
        return vol;
    }
    public  double area(){
//        volume of surface area=2*pi*r*r+2*pi*r*h
//        float ar= 2*3.14f*this.radius*this.radius+2*3.14f*this.radius*this.height;
        double ar= 2*Math.PI*this.radius*this.radius+2*Math.PI*this.radius*this.height;
        return ar;
    }

}

public class cylinder_volume_area {
    public static void main(String[] args) {

        cylinder c=new cylinder();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter radius");
        int radius=scan.nextInt();
        System.out.println("Enter the height");
        int height=scan.nextInt();
        c.setRadius(radius);
        c.setHeight(height);
        System.out.println("The height of cylinder is : "+c.getHeight());
        System.out.println("The radius of cylinder is ; "+c.getRadius());

        System.out.println("Surface area of cylinder : "+c.area());
        System.out.println("volume of area of cylinder : "+c.volume());



    }
}
