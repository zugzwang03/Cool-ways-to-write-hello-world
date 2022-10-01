fun main(args : Array<String>) {
    val cool = charArrayOf('h', 'e', 'l', 'o', 'w', 'r', 'd')
    var t = 0
    var it = 5
    outer@while(true) {
        for (i in 96..123) {
            if (t > 6) {
                print('!')
                return }
            if(it == 0) {
                print('o'+" ")
                it = 6
            }
            if (i.toChar() == cool[t]) {
                if(cool[t] == 'l'|| cool[t] == 'd'){
                    print('l'+" ")
                }
                it--;
                print(cool[t]+" ")
                t++
                continue@outer
            }
        }
    break
    }
}