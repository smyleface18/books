/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

import people.People;
import values.UserTypes;

/**
 *
 * @author SCIS2PC08
 */
public class MainRestaurant {
    
    public static void main(String[] args) {
       People student = new People(UserTypes.STUDENT, "1234", "Juan");
       
       student.sell();
    }
}
