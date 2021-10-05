import kotlin.random.Random

object Factorias {

    fun generarMapa(filas:Int, columnas:Int):Mapa{
        var mapa= Array<Array<Any?>>(filas) {Array<Any?>(columnas) {null} }
        return Mapa(mapa)
    }

    fun generarCapitolio(tamanio:Int, mapa: Mapa):Capitolio{
        var capitolio= ArrayList<Items>(tamanio)
        return Capitolio(capitolio, mapa)
    }

    fun generarDistrito(nombre:String, mapa:Mapa):Distrito{
        var distrito = Distrito.Builder().nombre(nombre).mapa(mapa).build()
        var jugadores =ArrayList<Jugador>(2)
        for(i in 0..2){
            jugadores.add(Jugador(distrito, (7..100).random(), (0..100).random()))
        }
        distrito.jugadores= jugadores
        distrito.enviarJugadores()
        return distrito
    }



}