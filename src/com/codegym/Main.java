package com.codegym;

import static com.codegym.BinarySearch.binarySearch;
import static com.codegym.BinarySearch.listNumber;

public class Main {

    public static void main(String[] args) {
        System.out.println(binarySearch(listNumber, 2));  /* 0 */
        System.out.println(binarySearch(listNumber, 11)); /* 4 */
        System.out.println(binarySearch(listNumber, 79)); /*12 */
        System.out.println(binarySearch(listNumber, 1));  /*-1 */
        System.out.println(binarySearch(listNumber, 5));  /*-1 */
        System.out.println(binarySearch(listNumber, 80)); /*-1 */
    }
}
