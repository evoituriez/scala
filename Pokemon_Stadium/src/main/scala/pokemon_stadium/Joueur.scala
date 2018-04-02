package pokemon_stadium

class Joueur {
  var nom: String = "Anonyme"

  var pokemons: Set[Pokemon] = Set.empty

  def acheter(poke1: Pokemon, poke2: Pokemon, poke3: Pokemon, o: Objet): Unit = {
    pokemons = pokemons ++ Set(poke1, poke2, poke3)
    var objet: Objet = o
  }

  def lancerAttaque(a: Attaque, to: Pokemon, from: Pokemon): Unit = {

    val hasPokemon = pokemons.contains(from)
    val pokeIsDead: Boolean = from.pv.equals(0)

    if (hasPokemon) {
      if (!pokeIsDead) {
        from.attaquer(a, to)
      } else {
        print(from.nom + " est mort !")
      }
    } else {
      println(from.nom + " ne fait pas parti de votre liste de Pokemon")
    }


  // Int => Int => Int

  // Pokemon => Boolean

    // exists(p: Pokemon => Boolean): Boolean
    // filter(p: Pokemon => Boolean): Set[Boolean]

  }
}


