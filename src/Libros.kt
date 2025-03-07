class Libros {
        var titulo: String = ""
        var autor: String = ""
        var ISBN: String = ""
        var numeroDePaginas: Int = 0
        var precio: Int = 0
        var cantidadDisponible: Int = 0

        constructor()

        constructor(titulo: String, autor: String, ISBN: String, numeroDePaginas: Int, precio: Int, cantidadDisponible: Int) {
            this.titulo = titulo
            this.autor = autor
            this.ISBN = ISBN
            this.numeroDePaginas = numeroDePaginas
            this.precio = precio
            this.cantidadDisponible = cantidadDisponible
        }

        override fun toString(): String {
            return """
            |Título: $titulo
            |Autor: $autor
            |ISBN: $ISBN
            |Número de páginas: $numeroDePaginas
            |Precio: $precio
            |Cantidad disponible: $cantidadDisponible
        """.trimMargin()
        }

        fun prestarLibro(): Boolean {
            return if (cantidadDisponible > 0) {
                cantidadDisponible--
                println(" Libro prestado con éxito. Ahora quedan $cantidadDisponible disponibles.")
                true
            } else {
                println("No hay libros disponibles para prestar.")
                false
            }
        }

        fun devolverLibro(): Int {
            cantidadDisponible++
            println(" Libro devuelto con éxito. Ahora hay $cantidadDisponible disponibles.")
            return cantidadDisponible
        }
    }
