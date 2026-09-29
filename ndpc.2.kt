//Exiba uma lista de planetas do sistema solar ("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno" e "Plutão") para o usuário.
// Em seguida, peça ao usuário para digitar o nome de um planeta.
// Verifique se o planeta que o usuário informou está na lista e informe ao usuário.

fun main() {
    val planetas = listOf(
        "Mercúrio",
        "Vênus",
        "Terra",
        "Marte",
        "Júpiter",
        "Saturno",
        "Urano",
        "Netuno",
        "Plutão"
    )

    println("Planetas do Sistema Solar:")

    for (planeta in planetas) {
        println(planeta)
    }

    print("\nDigite o nome de um planeta: ")
    val resposta = readln()

    if (planetas.contains(resposta)) {
        println("$resposta está na lista.")
    } else {
        println("$resposta não está na lista.")
    }
}