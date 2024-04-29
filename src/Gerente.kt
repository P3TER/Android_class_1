class Gerente(private var nombre: String, private var edad: Int, private var salario: Double): Empleado(nombre, edad, salario) {
    //Se crea la sub-clase Gerente que hereda de la clase Empleado

    //Función extra para imprimir las valores Ingresados
    public fun Imprimir(){
        println("Nombre: ${this.nombre}\nEdad: ${this.edad}\nSalario: ${this.salario}");
    }

    //Se usan el metodo de las interfaces segun la necesidad
    override fun calcularSalario() {
        this.salario = this.salario*1.1;
        println("El salario total es: ${this.salario}");
    }
}