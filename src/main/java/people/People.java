/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

import foods.Dish;
import values.UserTypes;
import java.util.Scanner;

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
    
    
    
    public void buy(){
        
        String TYPEDISH []={"Desayuno","Almuerzo","Comida"};
        
        System.out.println("Que tipo de comida quieres comprar");
        System.out.println("- Desayuno");
        System.out.println("- Almuerzo");
        System.out.println("- Comida");
        String typeDish = read.next();
        
        boolean value = false;
        
        int size = TYPEDISH.length;
        for (int i = 0; i < size; i++) {
            if(typeDish.equalsIgnoreCase(TYPEDISH[i])){    
                value = true;
                break;
            
            }
            
            if(value){
                Dish.orderFood();
            }
            else{
                System.out.println("ERROR");
            }
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
