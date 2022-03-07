 data class Cliente (var nome: String, var telefone: String) {

        var endereco = ""

        private var listaDeCompras = mutableListOf<String>()


        constructor(
            nome: String, telefone: String, endereco: String
        ) : this(nome, telefone) {

            this.endereco = endereco
        }

        init {
            if (nome.isEmpty() && telefone.isEmpty()) {
                throw Exception("Classe sendo instanciada de maneira incorreta!")
            } else {
                println("Seja bem-vindo!")
            }

        }

        fun listar() {

            if (listaDeCompras.isEmpty()) {
                println("Produto inválido")
            } else {
                listaDeCompras.forEach {
                    print(it)
                }
            }
        }

        fun adicionar(produto: String) {

            if (produto.isEmpty()) {
                println("Produto inválido")
            } else {
                listaDeCompras.add(produto)
                println("Produto adicionado com sucesso!")
            }

        }

        fun remover(produto: String) {
            if (produto.isEmpty()) {
                println("Produto inválido")
            } else if (produto.contains(produto)) {
                listaDeCompras.remove(produto)
                println("Produto removido com sucesso")
            } else {
                println("Esse produto não existe na lista")
            }
        }
    }

