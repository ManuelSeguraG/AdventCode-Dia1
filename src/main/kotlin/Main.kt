import java.io.File

var listaMedidas = mutableListOf<Int>()
var posicionArchivo: String = "/home/manuelsegura/input"
var contador: Int = 0
var tamañoLista: Int = 0

fun crearLista() = File(posicionArchivo).forEachLine { listaMedidas.add(it.toInt()) }

fun contarAumentos() {
    tamañoLista = listaMedidas.size

    for (i in 1..tamañoLista-1 ) {
        if (listaMedidas[i] > listaMedidas[i-1]) {
            contador++
        }
    }

}

fun main(args: Array<String>) {
    crearLista()
    contarAumentos()
    println(contador)
}