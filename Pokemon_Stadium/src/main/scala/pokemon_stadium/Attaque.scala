package pokemon_stadium

abstract class Attaque(nom: String, attaque: Attaque, precision: Float, puissance: Float) {

}

trait AttaqueClassique extends Attaque
trait AttaqueSpeciale extends Attaque
