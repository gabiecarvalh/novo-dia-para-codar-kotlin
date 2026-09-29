fun main() {
    val frutas = mutableListOf(
        "Maçã",
        "Banana",
        "Laranja",
        "Uva",
        "Morango"
    )

    println("Lista de frutas:")
    println(frutas)

    while (frutas.isNotEmpty()) {

        print("\nDigite uma fruta para remover ou PARE para finalizar: ")
        val fruta = readln()

        if (fruta.uppercase() == "PARE") {
            println("\nFrutas restantes:")
            println(frutas)
            break
        }

        if (frutas.contains(fruta)) {
            frutas.remove(fruta)
            println("Fruta foi retirada da lista")
        } else {
            println("Fruta indisponível no nosso mercado")
        }
    }

    if (frutas.isEmpty()) {
        println("Lista de compras finalizada")
    }
}