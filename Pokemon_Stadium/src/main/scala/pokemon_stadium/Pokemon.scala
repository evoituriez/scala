package pokemon_stadium

abstract protected class Pokemon(val nom: String, var pv_max: Double) extends Type with Attaque {
  var pv: Double = this.pv_max
  var aobjet: Boolean = false
  var objet: Objet
  var attaquebase: Attaque
  var attaquespeciale: Attaque

  private val random = scala.util.Random

  def attaquer(a: Attaque, p: Pokemon): Unit = {
    val hasChance: Boolean = random.nextInt(99) <= a.precision
    val pokeHasAttackType: Boolean = a.typename == typename
    val hasAttaque: Boolean = {a == attaquebase || a == attaquespeciale}

    if (hasAttaque) {
      if (hasChance) {
        if (pokeHasAttackType) {
          p.pv -= a.puissance * 1.5
          println(nom + " a attaqué !")
        }
        else {
          p.pv -= a.puissance
          println(nom + " a attaqué !")
        }
      }
      else {
        println(nom + " a manqué sa cible !")
      }
    } else {
      println(nom + " ne possède pas cette attaque !")
    }
  }
}

object Pikachu extends Pokemon("Pikachu", 100) with Elec with Attaque {
  var attaquebase: Attaque = AttaqueEclair
  var attaquespeciale: Attaque = AttaqueTonerre
  var objet: Objet = Baie
}

object Dracofeu extends Pokemon("Dracofeu", 150) with Feu with Attaque {
  var attaquebase: Attaque = AttaqueQueueDeFeu
  var attaquespeciale: Attaque = AttaqueLanceFlamme
  var objet: Objet = Baie
}

object Tortank extends Pokemon("Tortank", 200) with Eau with Attaque {
  var attaquebase: Attaque = AttaqueKarsher
  var attaquespeciale: Attaque = AttaqueOuragan
  var objet: Objet = Baie
}

object Raichu extends Pokemon("Raichu", 150) with Elec with Attaque {
  var attaquebase: Attaque = AttaqueEclair
  var attaquespeciale: Attaque = AttaqueTonerre
  var objet: Objet = Baie
}
