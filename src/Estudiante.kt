class Estudiante(private var nombre: String, private var edad: Int, private var grado: Int): Persona(nombre, edad), Trabajador {
    //Importacion de la clase Persona

    //Setter de la variable grado, con la conversion de Int a String
    public fun establecerGrado(grado: Int){
        this.grado = grado;
    }

    //Getter de la variable grado
    public fun obtenerGrado():String{
        return this.grado.toString()+"°";
    }

    //Polimorfismo del método de la interfaz realizarTarea
    override fun realizarTarea() {
        println("Realizando Tarea Escolar");
    }

    //Función extra para imprimir las valores Ingresados
    public fun Imprimir(){
        println("Nombre: ${this.nombre}\nEdad: ${this.edad}\nGrado: ${this.grado}°")
    }
}