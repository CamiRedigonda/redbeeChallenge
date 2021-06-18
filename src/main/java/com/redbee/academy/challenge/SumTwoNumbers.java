package com.redbee.academy.challenge;

public class SumTwoNumbers {

  /**
   * Method that receives two numbers and returns the
   * sum of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static Integer sum(Integer a, Integer b) {
    //TODO: Implement me
    Integer sum = 0;
    if (a == null){
      sum += b;
    }
    if (b == null){
      sum += a;
    }    
    if ((a != null) && (b != null)){
      sum += a + b;
    } 
    return sum;
  }
}
