fun main(){
    var i = 0
    while (i < 80){
        if (i >= 20){

            i+=5
            println(i)
            continue
        }
        print("$i ")
        i+=3
    }
    i = 0
    while (i < 80){
        if (i >= 20){

            break
        }
        print("$i ")
        i+=3
    }
}