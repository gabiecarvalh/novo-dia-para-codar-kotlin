data class Contato(
    val nome: String,
    val telefone: String
)

fun main() {

    val contatos = mutableListOf<Contato>()

    while (true) {

        print("\nDigite um comando (ADICIONAR, BUSCAR, REMOVER, LISTAR, SAIR): ")
        val comando = readln().uppercase()

        when (comando) {

            "ADICIONAR" -> {
                print("Nome: ")
                val nome = readln()

                print("Telefone: ")
                val telefone = readln()

                contatos.add(Contato(nome, telefone))

                println("Contato adicionado!")
            }

            "BUSCAR" -> {
                print("Nome: ")
                val nome = readln()

                val contato = contatos.find {
                    it.nome.equals(nome, ignoreCase = true)
                }

                if (contato != null) {
                    println("Telefone: ${contato.telefone}")
                } else {
                    println("Contato não encontrado")
                }
            }

            "REMOVER" -> {
                print("Nome: ")
                val nome = readln()

                val removido = contatos.removeIf {
                    it.nome.equals(nome, ignoreCase = true)
                }

                if (removido) {
                    println("Contato removido!")
                } else {
                    println("Contato não encontrado")
                }
            }

            "LISTAR" -> {
                if (contatos.isEmpty()) {
                    println("Nenhum contato cadastrado.")
                } else {
                    for (contato in contatos) {
                        println("Nome: ${contato.nome} | Telefone: ${contato.telefone}")
                    }
                }
            }

            "SAIR" -> {
                println("Agenda encerrada. Total de contatos: ${contatos.size}")
                break
            }

            else -> {
                println("Comando inválido.")
            }
        }
    }
}