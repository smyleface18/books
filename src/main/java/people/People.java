/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

import foods.Dish;
import values.UserTypes;
import java.util.Scanner;
import values.DishTypes;

/**
 *
 * @author SCIS2PC08
 */
public class People {
    
    Scanner read = new Scanner(System.in);
    
    private UserTypes type;
    int id;
    String name;

    public People(UserTypes type, int id, String name) {
        this.type = type;
        this.id = id;
        this.name = name;
    }
    
    
        public  void buy( Dish breakfast, Dish lunch, Dish dinner){
        
        Dish   arrayDish  [] ={breakfast,lunch,dinner};
        int size = arrayDish.length;
        
        System.out.println("Que tipo de comida quieres comprar");
        
            for (int i = 0; i < size; i++) {
                System.out.println("COD "+i+" = "+arrayDish[i].getType());
            }
            
            int typeDish = read.nextInt();
            DishTypes orderFood;
            switch (typeDish) {
                case 0:
                     orderFood = breakfast.getType();
                case 1:
                     orderFood = lunch.getType();
                     System.out.println(lunch.getType());
                case 2:
                     orderFood = dinner.getType();
                                                      
                    break;
                default:
                    throw new AssertionError();
            }


        boolean value = false;
        
            int i;
        for ( i=0;i < size; i++) {
            if(arrayDish[i].getType() == orderFood){
                System.out.println(arrayDish[i].getType() );
                value = true;
                break;
            }
        }
            
            if(value){
                if(arrayDish[i].getStock() > 0){
                    arrayDish[i].setStock(arrayDish[i].getStock()-1);   
                System.out.println("Plato vendido, quedan disponibles "+ arrayDish[i].getStock());
                }

                else {
                        System.out.println("No hay platos disponibles");}
            }
            else{
                System.out.println("ERROR");
            }
        
    }

    
    public void sell(){
        if (this.type != UserTypes.ADMINISTRATIVE){
            System.out.println("Usted no esta autorizado para vender");
        }
        else {
        }
    }
    
    public String infoPeople(){
        
        String msg = this.name+""+this.name+""+this.type;
        return msg;
    }

    public UserTypes getType() {
        return type;
    }

    public void setType(UserTypes type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}
