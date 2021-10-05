class Distrito(var nombre:String?, var mapa: Mapa?) {
    var jugadores:ArrayList<Jugador> = ArrayList<Jugador>(2)

    override fun toString(): String {
        return "Distrito $nombre: " +jugadores.size + " jugadores"
    }

    /*fun generarJugador(distrito: ArrayList<Jugador?>){
        var disAzar:Int= Random.nextInt(0,5)
        var distrito:String = when(disAzar){
            1 -> "Distrito 1"
            2 -> "Distrito 2"
            3 -> "Distrito 3"
            4 -> "Distrito 4"
            5 -> "Distrito 5"
            else -> "Sin distrito"
        }
        var edad = Random.nextInt(7,100)
        var vida = Random.nextInt(0, 100)
        jugadores.add(Jugador(distrito, edad, vida))
    }*/

    fun enviarJugadores(){
        for (i in jugadores.indices){
            var jug: Jugador = jugadores[i]
            mapa?.addJugador(jug)
            this.jugadores.remove(jug)

        }
    }


    class Builder(var nombre:String?= null, var mapa:Mapa?=null){
        fun nombre(nombre:String):Builder{
            this.nombre= nombre
            return this
        }
        fun mapa(mapa:Mapa):Builder{
            this.mapa= mapa
            return this
        }

        fun build():Distrito{
            return Distrito(nombre, mapa)
        }
    }


}