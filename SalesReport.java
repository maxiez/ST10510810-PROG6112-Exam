/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Student
 */
public class SalesReport {

    public static void main(String[] args) {
        //product names and sales: 
        String [] products = {
           "cozyMattress",
        "restonicMatrress",
        "sealyMattress",
        };
        
        int [] unitsSold = { 25, 18, 20, 15, 10, 12, 18, 15,       };
        
        //total untis that were sold for each product
        Map<String, Integer>
                totalsPerProduct = new
                LinkedHashMap<>();
        int totalSold = 0;
        
        for (int i = 0; i < products.length; i++) {
            
            totalsPerProduct.merge(products[i], unitsSold[i], Integer::sum);
            totalSold +=
                    unitsSold[i];
        }
        
        //Total number of products sold 
        
       double average = (double)
               totalSold/unitsSold.length;
       
       //The products that is mot popular
       String topProduct = null;
       int topTotal = -1;
       for (Map.Entry<String,Integer> entry;
               totalsPerProduct.entrySet()) {
           if(entry.getValue() > topTotal) {
               topTotal = entry.getValue();
               topProduct = entry.getKey();
           }
            
        }
       
        System.out.println("====================Sales Mattress Report=================");
        System.out.println();
        System.out.println("Sales per products: ");
        for Map.Entry<String,Integer> entry :
        
                
    }
}
