package com.redbee.academy.challenge;

import java.util.*;

public class SumArrayNumbers {

  /**
   * Method that receives an array of numbers and
   * returns the sum of each number
   *
   * @param array - Some integer list. ([1,2,3])
   * @return The result of 1 + 2 + 3
   */
  public static Integer sum(List<Integer> array) {
    ListIterator<Integer> iterador = array.listIterator();
    int total=0;
    while(iterador.hasNext()) {
    	total += iterador.next();
    }
    return total;
    
  }
}
