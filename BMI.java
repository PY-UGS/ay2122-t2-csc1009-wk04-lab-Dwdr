public class BMI {
    private double Weight;
    private double Height;
    
    public BMI (double Weight, double Height) {
        this.Weight = Weight;
        this.Height = Height;
    }
    public double getWeight(){
        return this.Weight;
    }
    public void setWeight(double Weight){
        this.Weight=Weight;
    }
    public double getHeight(){
        return this.Height;
    }
    public void setHeight(double Height){
        this.Height=Height;
    }
    public double getBMI(){
        double BMI = (0.45359237*this.Weight) / ( (0.0254*this.Height) * (0.0254 * this.Height) );
        return BMI;
    }

    public String printBMI(double BMI){
        if(BMI < 18.5)
         return "Underweight";
      else if(BMI < 25)
         return "Normal";
      else if(BMI < 30)
         return "Overweight";
      else
         return "Obese";
    }
}
