
package packagepermisos;

/**
 *
 * @author SCIS2PC08
 */
 class PermissionClass {    //si no esta public entonces el nivel de acceso es default
    private String msg;

    public PermissionClass(String msg) {
        this.msg = msg;
    }
    
    private String sayHello(){   //como tiene acceso private solo se puede acceder desde esta misma clase
        return this.msg;
    }

    public String getMsg() {
        return msg;
    }
    
    
    
    
}
