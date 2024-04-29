open class Persona {
    //Se pone el open en la clase para poder heredarla

    //Creación de las variables a utilizar
    private var nombre: String;
    private var edad: Int;

    //Creación del constructor de la clase Pesona
    public constructor(nombre: String, edad: Int){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Setter de la variable Nombre
    public fun establecerNombre(nombre: String){
        this.nombre = nombre;
    }

    //Getter de la variable Nombre
    public fun obtenerNombre():String{
        return this.nombre;
    }

    //Setter de la variable Edad
    public fun establecerEdad(edad: Int){
        this.edad = edad;
    }

    //Getter de la variable Edad
    public fun obtenerEdad(): Int{
        return this.edad;
    }
}