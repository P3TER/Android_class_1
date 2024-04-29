open class Empleado(private var nombre: String, private var edad: Int, private var salario: Double ): Persona(nombre, edad), Trabajador {
    //Creación de la clase trabajador y con la importación de la interfaz

    //Setter de la variable Salario
    public fun establecerSalario(salario: Double){
        this.salario = salario;
    }

    //Getter de la variable Salario
    public fun obtenerSalario(): Double{
        return this.salario;
    }

    //Polimorfismo del método de la Interfaz
    override fun realizarTarea() {
        println("Realizando Tarea Laboral");
    }
}