fun main() {

    //Задача 1. Копирование массива

    val array = arrayOf(1, 2, 3) // массив
    val arrayCopy = array.copyOf() // копия массива
    arrayCopy.forEach { arg ->
        println(arg)
    } //вывод элементов копии массива


    // Задача 2. Умножение полиномов

    val polynomial1 = intArrayOf(-1, 1) // (x-1)
    val polynomial2 = intArrayOf(2, 1) // (x+2)
    val size1 = polynomial1.size
    val size2 = polynomial2.size
    val sizeProduct = size1 + size2 - 1
    val product = IntArray(sizeProduct)

    for (index1 in 0 until size1) {
        for (index2 in 0 until size2) {
            product[index1 + index2] += polynomial1[index1] * polynomial2[index2]
        } // умножаем каждый член первого полинома
    } // с каждым членом второго полинома.

    println("Первый полином:")
    printPolynomial(polynomial1, size1)
    println("\nВторой полином:")
    printPolynomial(polynomial2, size2)
    println("\nПроизведение полиномов:")
    printPolynomial(product, sizeProduct)
}

//функция вывода полиномов
fun printPolynomial(coefficient: IntArray, size: Int) {
    for (index in 0 until size) {
        print(coefficient[index])
        if (index != 0) { print("x^$index") }
        if (index != size - 1) { print(" + ") }
    }
}

/*
Задача №1. Написать программу для копирования массива.
Задача №2 с элементами математики.
Написать программу для операции "произведение массивов".
Сама операция определяется так, как будто элементы массива - это коэффициенты полинома.
Соответственно, произведение массивов - должно дать новый массив, коэффициенты которого соответсвуют нужному полиному.
Например, возьмем полином (x - 1) и полином (x + 2).
Их можно представить в виде массивов [-1, 1] и [2, 1] соответственно.
Индекс элемента в массиве соответствует степени x при этом коээфициенте,
т.е. полином (x - 1) можно переписать как (-1 * x^0 + 1 * x^1),
таким образом соответсвующий этому полиному массив будет иметь вид [-1, 1].
По указанному правилу произведение массивов [-1, 1] и [2, 1] должно быть равно [-2, 1, 1],
т.к. (x - 1) * (x + 2) = (x^2 + x^1 - 2).
*/