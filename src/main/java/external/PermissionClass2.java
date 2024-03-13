
package external;



/**
 *
 * @author SCIS2PC08
 */
 public class PermissionClass2 {     //si no esta public entonces el nivel de acceso es default
    String msg;

    public PermissionClass2(String msg) {
        this.msg = msg;
    }
    
     String sayHello(){                 //si no tiene el nivel de acceso es por que es default
        return this.msg;
    }
    
    
    
}
