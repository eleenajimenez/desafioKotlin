import kotlin.random.Random

class Capitolio(var capitolio:ArrayList<Items>, var mapa:Mapa) {

    init {
        mandarItems(10) //para empezar enviando los 10 items
    }

    fun inicializarItems(){
        var tipo:Int = Random.nextInt(0,2)
        var nivel:Int = Random.nextInt(50, 100)
        for(i in 0..capitolio.size) {
            when (tipo) {
                0 -> capitolio.add(Arma("Arma", nivel))
                1 -> capitolio.add(Medicina("Medicina", nivel))
                2 -> capitolio.add(Trampa("Trampa"))

            }

        }
    }

    fun mandarItems(numero:Int){
        for (i in 0..numero){
            var aleatorio: Items = capitolio[i]
            mapa?.addItem(aleatorio)
            this.capitolio.remove(aleatorio)

        }
    }
}