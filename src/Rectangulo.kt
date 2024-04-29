class Rectangulo(private var nombre: String, private var color: String, private var altura: Double, private var anchura: Double):FiguraGeometrica(nombre, color) {
    //Creación de la sub-clase Rectangulo habiendo heredado de FiguraGeometrica()

    //Setter de la variable Altura
    public fun establecerAltura(altura: Double){
        this.altura = altura;
    }

    //Getter de la variable Altura
    public fun obtenerAltura(): Double{
        return this.altura;
    }

    //Setter de la variable Anchura
    public fun establecerAnchura(anchura: Double){
        this.anchura = anchura;
    }

    //Getter de la variable Anchura
    public fun obtenerAnchura(): Double{
        return this.anchura;
    }

    //Función extra para imprimir las valores Ingresados
    public fun Imprimir(){
        println("Nombre: ${this.nombre}\nColor: ${this.color}\nAltura: ${this.altura}\nAnchura: ${this.anchura}")
    }
}