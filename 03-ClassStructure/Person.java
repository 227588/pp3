public class Person {
    String name;
    double weight;
    double height;
    double BMI;

    public Person(String name){
        this.name=name;
    }
    public Person(String name, double weight, double height){
        this.name=name;
        this.weight=weight;
        this.height=height;
    }
    
    public void setWeightAndHeight(double weight, double height){
        this.weight=weight;
        this.height=height;    
    }
    public void calculateBMI(){
        this.BMI=weight/((height/100)*(height/100));
    }
    public void displayRecord(){
        String BMIInfo = "BMI is okay";
        if(BMI<18.5) BMIInfo = "BMI too low";
        if(BMI>24.9) BMIInfo = "BMI too high";
        System.out.printf("Name: %s \nWeight: %s \nHeight: %s \n%s\n",name,weight,height,BMIInfo);
    }
}
