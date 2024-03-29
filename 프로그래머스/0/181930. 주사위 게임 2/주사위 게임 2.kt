import kotlin.math.pow

class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        var answer: Int = 0

        if (a != b && a != c && b != c){
            answer = a + b + c
        } else if (a == b && a == c && b == c){
            answer = (a + b + c) * (((a.toDouble().pow(2) + b.toDouble().pow(2) + c.toDouble().pow(2))) *
                    (a.toDouble().pow(3) + b.toDouble().pow(3) + c.toDouble().pow(3))).toInt()
        } else {
            answer = (a + b + c) * ((a.toDouble().pow(2) + b.toDouble().pow(2) + c.toDouble().pow(2)).toInt())
        }

        return answer
    }
}