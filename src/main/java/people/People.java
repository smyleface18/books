/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

import values.UserTypes;

/**
 *
 * @author SCIS2PC08
 */
public class People {
    
    private UserTypes type;
    String id;
    String name;

    public People(UserTypes type, String id, String name) {
        this.type = type;
        this.id = id;
        this.name = name;
    }
    
    
    
    public void buy(){
        
    }
    
    public void sell(){
        if (this.type != UserTypes.ADMINISTRATIVE){
            System.out.println("Usted no esta autorizado para vender");
        }
    }
}
