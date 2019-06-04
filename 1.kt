fun Array<String>.megaSplit(): Array<String> {
    var splitted : Array<String> = emptyArray()
    for(i in this)
        for(st in i.split(" "))
            splitted = splitted.plus(st)
    return splitted
}

fun main() {
    var n: Int = readLine()!!.toInt()
    var test: Array<String> = emptyArray()
    for (i in 1..n)
        test = test.plus(readLine()!!)
    for (i in test.megaSplit()) println(i)
}