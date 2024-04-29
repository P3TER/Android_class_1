class Vendedor(private var nombre: String, private var edad: Int, private var salario: Double, private var cantExtra: Double): Empleado(nombre, edad, salario) {
    //Se crea la clase vendedor habiendo heredado de Empleado

    //Setter de cantExtra
    public fun establecerVentas(cantExtra: Double){
        this.cantExtra = cantExtra;
    }

    //Getter de cantExtra
    public fun obtenerVentas(): Double{
        return this.cantExtra;
    }

    //Función extra para imprimir las valores Ingresados
    public fun Imprimir(){
        println("Nombre: ${this.nombre}\nEdad: ${this.edad}\nSalario: ${this.salario}");
    }

    override fun calcularSalario() {
        this.salario += this.salario * cantExtra;
        println("El salario total es: ${this.salario}");
    }
}