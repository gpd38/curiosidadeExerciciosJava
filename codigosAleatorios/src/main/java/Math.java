public class MathInJava {
 public static void main(String args[]) {

  validarAbs();
  validarRound();
   validarCeilFloor();
   validarMinMax();
   validarExpLogPowSqrt();
   ValidarTrigonometria();
 }
  
  public static void validarAbs(){
   int i1 = 27;
  int i2 = -45;
  double d1 = 84.6;
  double d2 = 0.45;
  System.out.println("Absolute value of i1: " + Math.abs(i1));

  System.out.println("Absolute value of i2: " + Math.abs(i2));

  System.out.println("Absolute value of d1: " + Math.abs(d1));

  System.out.println("Absolute value of d2: " + Math.abs(d2)); 
  }
  
  public static void validarRound() {
  double d1 = 84.6;
  double d2 = 0.45;
  System.out.println("Round off for d1: " + Math.round(d1));

  System.out.println("Round off for d2: " + Math.round(d2));
 }
  
  public static void validarCeilFloor() {
    double d1 = 84.6;
  double d2 = 0.45;
  System.out.println("Ceiling of '" + d1 + "' = " + Math.ceil(d1));

  System.out.println("Floor of '" + d1 + "' = " + Math.floor(d1));

  System.out.println("Ceiling of '" + d2 + "' = " + Math.ceil(d2));

  System.out.println("Floor of '" + d2 + "' = " + Math.floor(d2));
  }
  
  public static void validarMinMax() {
    int i1 = 27;
  int i2 = -45;
  double d1 = 84.6;
  double d2 = 0.45;
  System.out.println("Minimum out of '" + i1 + "' and '" + i2 + "' = " + Math.min(i1, i2));

  System.out.println("Maximum out of '" + i1 + "' and '" + i2 + "' = " + Math.max(i1, i2));

  System.out.println("Minimum out of '" + d1 + "' and '" + d2 + "' = " + Math.min(d1, d2));

  System.out.println("Maximum out of '" + d1 + "' and '" + d2 + "' = " + Math.max(d1, d2));
  }
  
  public static void validarExpLogPowSqrt() {
    double d1 = 84.6;
  double d2 = 0.45;
  System.out.println("exp(" + d2 + ") = " + Math.exp(d2));

  System.out.println("log(" + d2 + ") = " + Math.log(d2));

  System.out.println("pow(5, 3) = " + Math.pow(5.0, 3.0));

  System.out.println("sqrt(16) = " + Math.sqrt(16));
  }
  
  public static void ValidarTrigonometria() {
  double angle_30 = 30.0;
  double radian_30 = Math.toRadians(angle_30);

  System.out.println("sin(30) = " + Math.sin(radian_30));

  System.out.println("cos(30) = " + Math.cos(radian_30));

  System.out.println("tan(30) = " + Math.tan(radian_30));

  System.out.println("Theta = " + Math.atan2(4, 2));
  }
  
}
