package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    List<Integer> max = new ArrayList<Integer>();
    Integer largoA = a.size();
    Integer largoB = b.size();
    Integer largo = Math.max(largoA, largoB);
    for (int i=0; i<largo; i++){
      Integer p, q;
      if(i >= largoA){
        p = 0;
      }else{
        p = a.get(i);
      }
      if(i >= largoB){
        q = 0;
      }else{
        q = b.get(i);
      }
      max.add(Math.max(p, q));
    }
    
    return max;
  }
}
