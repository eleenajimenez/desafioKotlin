fun main(){

    var mapa = Factorias.generarMapa(6,6)
    var capitolio = Factorias.generarCapitolio(10, mapa)
    crearDistritos(mapa)
    var tiempo1 = 0
    var tiempo2 = 0

    while(!mapa.contarJugadores()){
        tiempo1++
        tiempo2++
        if(tiempo1==2){
            tiempo1 = 0
        }
        if(tiempo2==5){
            tiempo2 = 0
            capitolio.mandarItems(4)
            println(mapa)
        }
    }

    var ganador = mapa.haGanado()

    println("Y el ganador de los Juegos del Hambre es... : $ganador")
    println(mapa)


}

fun crearDistritos(mapa:Mapa){
    var distritos = ArrayList<Distrito>(5)
    var d1 = Factorias.generarDistrito("Distrito 1", mapa)
    var d2 = Factorias.generarDistrito("Distrito 2", mapa)
    var d3 = Factorias.generarDistrito("Distrito 3", mapa)
    var d4 = Factorias.generarDistrito("Distrito 4", mapa)
    var d5 = Factorias.generarDistrito("Distrito 5", mapa)

    distritos.add(d1)
    distritos.add(d2)
    distritos.add(d3)
    distritos.add(d4)
    distritos.add(d5)



}