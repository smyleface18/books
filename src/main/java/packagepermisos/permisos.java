/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package packagepermisos;

import external.PermissionClass2;

/**
 *
 * @author SCIS2PC08
 */
 public class permisos {              //si no esta public entonces el nivel de acceso es default

    public static void main(String[] args) {
        
        PermissionClass permission = new PermissionClass("Hola mundo de los persmisos");
        //System.out.println(permission.sayHello());  comente esta linea porque .sayHello() de la clase PermissionClass es private
        
        System.out.println(permission.getMsg());  //con getters y setters si puedo acceder a los atributos privados0
        
        
        
        
        //accesos a la clase PermissionClass2 que es de un packege externo
        
        PermissionClass2 permission2 = new PermissionClass2("Hola estoy en otro paquete");
        //System.out.println(permission2.sayHello() comente esta linea porque .sayHello() tiene acceso default
        

        
        
        
        
        
        
                
    }
}
