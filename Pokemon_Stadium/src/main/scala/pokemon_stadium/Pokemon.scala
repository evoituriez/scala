package pokemon_stadium

abstract protected class Pokemon(nom: String, pv_max: Int) {
  var pv: Int = this.pv_max
  var nb_attaque: Int = 2
  var aobjet: Boolean = false
  //var objet: Objet = "Baie"
}

object Pikachu extends Pokemon("Pikachu", 100) {

}


