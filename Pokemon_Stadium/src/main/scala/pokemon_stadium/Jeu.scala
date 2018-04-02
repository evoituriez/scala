package pokemon_stadium

class Jeu(j1: Joueur, j2: Joueur) {

  val alternance = new Alternance(j1, j2)

  print("Nommer le joueur 1 : ")
  j1.nom = scala.io.StdIn.readLine()
  print("Nommer le joueur 2 : ")
  j2.nom = scala.io.StdIn.readLine()
  var pokeList: Array[Pokemon] = Array(Pikachu, Dracofeu, Tortank, Raichu)

  println(j1.nom + ", choisis 3 pokemons parmi la liste suivante :")
    for (i <- pokeList) {
      println(i.nom)
    }
    print("Pokemon 1 : ")
    val j1p1 = scala.io.StdIn.readInt()
    print("Pokemon 2 : ")
    val j1p2 = scala.io.StdIn.readInt()
    print("Pokemon 3 : ")
    val j1p3 = scala.io.StdIn.readInt()

    var j1poke1: Pokemon = pokeList(j1p1)
    var j1poke2: Pokemon = pokeList(j1p2)
    var j1poke3: Pokemon = pokeList(j1p3)

    j1.acheter(j1poke1, j1poke2, j1poke3, Baie)


    println(j2.nom + ", choisis 3 pokemons parmi la liste suivante :")
    for (i <- pokeList) {
      println(i.nom)
    }
    print("Pokemon 1 : ")
    val j2p1 = scala.io.StdIn.readInt()
    print("Pokemon 2 : ")
    val j2p2 = scala.io.StdIn.readInt()
    print("Pokemon 3 : ")
    val j2p3 = scala.io.StdIn.readInt()

    var j2poke1: Pokemon = pokeList(j2p1)
    var j2poke2: Pokemon = pokeList(j2p2)
    var j2poke3: Pokemon = pokeList(j2p3)

    j2.acheter(j2poke1, j2poke2, j2poke3, Baie)

  println("Match opposant " + j1.nom + " et " + j2.nom)
  print("Les Pokemons de " + j1.nom + " :")
  println(j1poke1.nom + j1poke2.nom + j1poke3.nom)
  print("Les Pokemons de " + j2.nom + " :")
  println(j2poke1.nom + j2poke2.nom + j2poke3.nom)


  println("Début du Jeu")
  j1.lancerAttaque(AttaqueLanceFlamme, Dracofeu, Pikachu)


  //Pikachu.attaquer(AttaqueEclair, Dracofeu)
}
