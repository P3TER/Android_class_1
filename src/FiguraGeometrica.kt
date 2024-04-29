open class FiguraGeometrica {
    //Creación de la clase de tipo open para heredar

    //Creación de las variables para la clase
    private var nombre: String;
    private var color: String;

    //Creación del constructor de las variables de la clase
    constructor(nombre: String, color: String){
        this.nombre = nombre;
        this.color = color;
    }

    //Setter de la variable Nombre
    public fun establecerNombre(nombre: String){
        this.nombre = nombre;
    }

    //Getter de la variable Nombre
    public fun obtenerNombre():String{
        return this.nombre;
    }

    //Setter de la variable Color
    public fun establecerColor(color: String){
        this.color = color;
    }

    //Getter de la variable Color
    public fun obtenerColor():String{
        return this.color;
    }
}