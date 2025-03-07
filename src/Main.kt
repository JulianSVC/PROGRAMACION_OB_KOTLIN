//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*

    CONSTRUIR UNA CLASE DE NOMBRE LIBRO QUE TIENE LO SIGUIENTE ATRIBUTOS , LIBRO,TITULO,ISBN, AUTOR, NUMERO DE PAGINAS,
    PRECIO Y CANTIDAD DISPONIBLE

    METODOS CONSTRUCTORES VAICOS COMO PARAMETROS QUE VA TENER : PRESTAR LIBRO BOLEANO, DEVOLVER LIBRO :INT, MOSTRAR
    DATOS DEL LIBRO.
    MAIN -> UN SOLO LIBRO
    */
    val lstLibros = mutableListOf<Libros>()

    // Agregar un libro de prueba
    val libro1 = Libros("El Principito", "Antoine de Saint-Exupéry", "B-612", 97, 20000, 5)
    lstLibros.add(libro1)

    println("📚 Lista de libros disponibles:")
    lstLibros.forEach { println(it) }

    while (true) {
        println(
            """
        | MENÚ DE OPCIONES
        |1. Prestar Libro 
        |2. Devolver Libro 
        |3. Mostrar Libro
        |4. Salir
    """.trimMargin()
        )

        print(" Ingresa una opción: ")
        val opcionIngresada = readln().toIntOrNull()

        when (opcionIngresada) {
            1 -> {
                println(" Prestando libro...")
                libro1.prestarLibro()
            }
            2 -> {
                println("Devolviendo libro...")
                libro1.devolverLibro()
            }
            3 -> {
                println(" Datos del libro:")
                println(libro1)
            }
            4 -> {
                println("👋Saliendo del sistema...")
                break
            }
            else -> {
                println(" Opción inválida, intenta de nuevo.")
            }
        }
    }
}