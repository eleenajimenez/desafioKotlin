import kotlin.random.Random

class Jugador(var distrito: Distrito?= null, var edad:Int?= null, var vida:Int?= null) {


    override fun toString(): String {
        return "Jugador: " + this.distrito + ", edad: " + this.edad + ", vida: " + this.vida
    }



    /*class Builder(var distrito: String?= null, var edad:Int?= null,  var vida: Int?= null){
        fun distrito(distrito:String):Builder{
            this.distrito= distrito
            return this
        }
        fun edad(edad: Int):Builder{
            this.edad= edad
            return this
        }
        fun vida(vida:Int):Builder{
            this.vida= vida
            return this
        }

        fun build():Jugador{
            return Jugador(distrito, edad, vida)
        }
    }*/
}