package com.redbee.academy.challenge;

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
    //TODO: Implement me
    List<Integer> max = List.of();
    Integer largoA = a.size();
    Integer largoB = b.size();
    Integer largo = 0;
    if (largoA > largoB){
      largo += largoA;
    }else{
      largo += largoB;
    }
    for (int i=0; i<largo; i++){
      if(a.get(i)== null){
        a.set(i, 0);
      }
      if(b.get(i)== null){
        b.set(i, 0);
      }
    }
    for (int i=0; i<largo; i++){
      max.add(Math.max(a.get(i), b.get(i)));
    }
    return max;
  }
}
