package pokemon_stadium

abstract protected class Pokemon(val nom: String, var pv_max: Double) extends Type with Attaque {
  var pv: Double = this.pv_max
  var nb_attaque: Int = 2
  var aobjet: Boolean = false
  //var objet: Objet = "Baie"

  def attaquer(a: Attaque, p: Pokemon): Unit = {
    if (a.typename == typename) p.pv -= a.puissance * 1.5 else p.pv -= a.puissance
  }
}

object Pikachu extends Pokemon("Pikachu", 100) with Elec with Attaque

object Dracofeu extends Pokemon("Dracofeu", 150) with Feu