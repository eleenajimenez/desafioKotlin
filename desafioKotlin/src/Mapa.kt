import kotlin.random.Random

class Mapa (private var mapa:Array<Array<Any?>>){

    fun addItem(item: Items){
        var fila:Int = 0
        var columna:Int =0
        do{
            fila= (mapa.indices).random()
            columna = (mapa[0].indices).random()
        }while (mapa[fila][columna] != null)

        mapa[fila][columna]=item
    }

    fun addJugador(jugador:Jugador){
        var fila:Int = 0
        var columna:Int =0
        do{
            fila= (mapa.indices).random()
            columna = (mapa[0].indices).random()
        }while (mapa[fila][columna] != null)

        mapa[fila][columna]= jugador
    }

    fun contarJugadores() {
        var acabado:Boolean = false
        var contador = 0
        for (i in 0..mapa.size - 1){
            for (j in 0..mapa[0].size - 1){
                if(mapa[i][j] is Jugador){
                    contador++

                }
            }
        }
        if(contador>1){
            acabado = false
        }else{
            acabado = true
        }
    }

    fun moverJugador(){
        var dentro:Boolean = false
        var contador = 0
        var fila = 0
        var columna = 0
        for (i in 0..mapa.size - 1){
            for (j in 0..mapa[0].size - 1){
                if(mapa[i][j] is Jugador){
                    fila= Random.nextInt(i-1,i+1)
                    columna= Random.nextInt(j-1, j+1)
                    dentro = fila>=0 && fila<mapa.size && columna>=0 && columna<mapa.size;
                    if(dentro){

                    }
                }
            }
        }
    }

    /*fun haGanado(): Any {

    }*/


}