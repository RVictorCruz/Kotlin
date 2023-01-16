
fun main(){
    val s = "Victor"
    var i = 0
    while (i < 100){
        print("$i ")
        i += 3
    }
    println(i)
    i = 0
    while (i < s.length){
        println("${s[i]}")
        i++
    }

}