fun main(args: Array<String>) {
    atividade1()
    atividade2()
}

//# Exercício 1
//A taxa de natalidade e a taxa de mortalidade são indicadores estatísticos de fundamental importância por ajudar
// a compreender aquilo que os especialistas chamam de dinâmica populacional e a entender sua relação com variáveis
// que influenciam o desenvolvimento, como qualidade de vida, migrações, , fatores socioeconômicos e localização.
// Sabendo disso, crie um programa que calcule os dois indicadores utilizando o comando switch.
//**Observação :**
//- A taxa de natalidade é calculada pela seguinte fórmula: taxa de natalidade = (número de crianças nascidas x 1000)
// / número de habitantes;
//- Enquanto que, a taxa de mortalidade = (números de óbitos x 1000) /número de habitantes.
fun atividade1(): Unit {
    println("Digite o número de crianças nascidas:")
    val num1 = readLine()!!.toFloat()
    println("Digite o número de habitantes:")
    val num2 = readLine()!!.toFloat()
    println("Digite o número de óbitos:")
    val num3 = readLine()!!.toFloat()
    println("Escolha a operação:\n1 - TaxaDeNatalidade\n2 - TaxaDeMortalidade")
    val operacao = readLine()!!.toInt()

    when (operacao) {
        1 -> println("A taxa de natalidade é ${(num1 * 1000) / num2}")
        2 -> println("A taxa de mortalidade é ${(num3 * 1000) / num2}")
        else -> println("Inválido!!")
    }
}

//# Exercício 2
//Dado o valor do produto e a forma de pagamento.
//1= à vista;
//2= à prazo (30 dias);
//3= à prazo parcelado.
//- Se o produto for pago **à vista** aplique um desconto de 10% antes de mostrar o valor final, senão informe o mesmo
// valor do produto;
//- Se o produto for pago **à prazo (30 dias)**, deve ser acrescido um juros de 3% antes de mostrar o valor final;
//- Se o produto for pago **à prazo parcelado**, deve ser acrescido um juros de 1.5% a.m antes de mostrar o valor final;
fun atividade2(): Unit {
    println("Digite o valor do produtp:")
    val valorDoProduto = readLine()!!.toFloat()
    println("Digite a forma de pagamento:")
    println("Escolha o tipo de cliente?:\n1 - à vista\n2 - à prazo(30 dias)\n3 - à prazo parcelado")
    val formaDePagamento = readLine()!!.toInt()

    when (formaDePagamento) {
        1 -> println("total a pagar: ${formaDePagamento - formaDePagamento * 0.10}")
        2 -> println("Total a pagar: ${formaDePagamento - formaDePagamento + 0.05}")
        3 -> println("Total a pagar: ${formaDePagamento - formaDePagamento + 1.50}")
        else -> println("Total a pagar: $valorDoProduto")
    }
}