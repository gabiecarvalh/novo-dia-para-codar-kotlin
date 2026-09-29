//Crie um programa onde o usuário possa cadastrar estudantes sem limites, e, em seguida, Se o usuário digitar "PARE" o programa deve exibir a quantidade de estudantes cadastrados e a lista com cada um deles.

fun main() {
    val estudantes = mutableListOf<String>()

    while (true) {
        print("Digite o nome do estudante ou PARE para encerrar: ")
        val nome = readln()

        if (nome.uppercase() == "PARE") {
            break
        }

        estudantes.add(nome)
    }

    println("\nQuantidade de estudantes cadastrados: ${estudantes.size}")

    println("Lista de estudantes:")

    for (estudante in estudantes) {
        println(estudante)
    }
}