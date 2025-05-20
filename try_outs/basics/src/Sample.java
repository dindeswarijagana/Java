// public class Main {
//   public static void main(String[] args){
//     double[] numbers = {1.5, 2.5, 6.5, 4.5};
//     for (int i =0; i<numbers.length; i++ ) {
//       System.out.printf("number = %f  i = %d\n",numbers[i], i);
//     }
//   }
// }
import  models.fake.Operations;

class Sample {
  public static void main(String[] args) {
  
  Operations operation = new Operations(8, 6);

  System.out.printf("sum of %d, %d is %d", operation.a, operation.b, operation.add());
  // System.out.printf()
}
}