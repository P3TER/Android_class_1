class Circulo(private var nombre: String, private var color: String, private var circunferencia: Double, private var radio: Double): FiguraGeometrica(nombre, color) {
    //Creación de la sub-clase Circulo habiendo heredado de FiguraGeometrica()

    //Setter de la variable Circunferencia
    public fun establecerEdad(circunferencia: Double){
        this.circunferencia = circunferencia;
    }

    //Getter de la variable Circunferencia
    public fun obtenerEdad(): Double{
        return this.circunferencia;
    }

    //Setter de la variable Radio
    public fun establecerRadio(radio: Double){
        this.radio = radio;
    }

    //Getter de la variable Radio
    public fun obtenerRadio(): Double{
        return this.radio;
    }

    //Función extra para imprimir las valores Ingresados
    public fun Imprimir(){
        println("Nombre: ${this.nombre}\nColor: ${this.color}\nCircunferencia: ${this.circunferencia}\nRadio: ${this.radio}");
    }
}