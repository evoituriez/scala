package pokemon_stadium

trait Attaque extends Type {
  val puissance: Double = 0
  //La précision est calculée en pourcentage
  val precision: Int = 0
}

//trait AttaqueElec extends Attaque with Elec

object AttaqueQueueDeFeu extends Attaque with Feu {
  override val puissance: Double = 15
  override val precision: Int = 80
}

object AttaqueLanceFlamme extends Attaque with Feu {
  override val puissance: Double = 30
  override val precision: Int = 60
}

object AttaqueEclair extends Attaque with Elec {
  override val puissance: Double = 5
  override val precision: Int = 90
}

object AttaqueTonerre extends Attaque with Elec {
  override val puissance: Double = 15
  override val precision: Int = 70
}

object AttaqueKarsher extends Attaque with Eau {
  override val puissance: Double = 40
  override val precision: Int = 50
}

object AttaqueOuragan extends Attaque with Eau {
  override val puissance: Double = 60
  override val precision: Int = 25
}



//trait AttaqueClassique extends Attaque
/*trait AttaqueSpeciale extends Attaque {
  protected def attaqueSpeciale(pokemon: Pokemon): Unit = pokemon.pv -= 10
}*/

