class Fibonacci {
    
    // Math property solve (recursive)
    fun fibMath(n: Int): Int {
        if (n == 0) {
            return 0
        } else if (n == 1) {
            return 1
        }
        return fibMath(n - 1) + fibMath(n - 2)
    }

    // Iteration solve
    fun fibIteration(n: Int): Int {
        var a = 0
        var b = 1
        var temp = 0
        for (i in 1..n) {
            temp = a + b
            a = b
            b = temp
        }
        return a
    }

    // Recursive iteration (tail recursion style)
    fun fibRecursive(a: Int, b: Int, n: Int, k: Int): Int {
        if (k == n) {
            return a
        }
        return fibRecursive(b, a + b, n, k + 1)
    }
}

fun main() {
    val fibonacci = Fibonacci()

    val myValue = fibonacci.fibMath(10)
    println("Fibonacci (Math Recursive) of 10: $myValue")
    
    val myValueIteration = fibonacci.fibIteration(10)
    println("Fibonacci (Iteration) of 10: $myValueIteration")
    
    val myValueRecursive = fibonacci.fibRecursive(0, 1, 10, 0)
    println("Fibonacci (Recursive Iteration) of 10: $myValueRecursive")
}