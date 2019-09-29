package OPPTrainning;


public class Rectangle {

    private double width = 88;
    private double lenth;
    private static int numberOfObject ;
    int x;
    public  Rectangle (){
        System.out.println("A new room has been created ");
    numberOfObject++;
    }
   public Rectangle (double l , double w){
   
   this();
   lenth = l ;
   width = w ;
   numberOfObject++;
   }
    
    public void setwidth(double w){
    
    width = w ;
     
    }
    public void setlenth(double l ){
    
    lenth = l ;
   
    
    }
    public double getlenth(){
    
    return lenth ;
    
    }
    public double getwidth(){
    return width ; 
    
    }
   public double getarea(){
    return width * lenth ; 
    
    }  
public static int numberOfObjects (){

return numberOfObject ;
}
public Rectangle addTwoRec(Rectangle r ){
r.lenth = r.lenth + this.lenth;
r.width = r.width + this.width;
return r;
}


}
