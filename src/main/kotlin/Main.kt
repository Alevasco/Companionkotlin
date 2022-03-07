fun main(args: Array<String>) {

        /*
      Cria uma Classe clientes.Cliente, contendo os atributos encapsulados, um construtor padrão e
      pelo menos mais duas opções de construtores conforme sua percepção,
      com os atributos: nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
      A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
      Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
      Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
       */

         val cadastro=Cliente("Laís","96568-2202","Rua Limoeiro,370")

                do {
                    println("\nAs opções são:\n")
                    println("1 - Adicionar itens no carrinho")
                    println("2 - Remover itens do carrinho")
                    println("3 - Listar itens do carrinho")
                    println("4 - Sair")
                    println("\nDigite a opção desejada:")
                    val opc = readLine()!!.toInt()

                    println("Digite o nome de um item: ")
                    val item = readLine()!!

                    when (opc) {
                        1 -> cadastro.adicionar(item)
                        2 -> cadastro.remover(item)
                        3 -> cadastro.listar()
                    }

                }while(opc != 4)


}