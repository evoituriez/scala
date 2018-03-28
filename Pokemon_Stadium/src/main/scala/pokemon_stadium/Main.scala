package pokemon_stadium

object Main extends App {
    println("Début du Jeu")
    println(AttaqueLanceFlamme.typename)
    println(AttaqueLanceFlamme.puissance)
    Pikachu.attaquer(AttaqueLanceFlamme, Dracofeu)
    println(Dracofeu.pv)
}
