class Personnage {
  var pv = 10
  var argent = 100
  var nom = "Héro"

  def sauter = println(nom + " a sauté !!!")

  def donnerBisou(p: Princesse) = println(nom + " a donné un bisou à " + p.nom)

  def battre(e: Ennemi) = println(nom + " a battu " + e.nom)

  def battre(b: Boss) = println("Wahouuuu !! " + nom + " a battu " + b.nom)

  def entrerChateau = println(nom + " est entré dans le château !")

  def mourir(s: String) = {
    println(s)
    pv -= 1
  }
}

class Ennemi {
  var nom = "Ennemi"

  def battre(p: Personnage) = {
    println(p.nom + " a perdu devant " + nom + " !")
    p.pv -= 1
  }
}

class Boss {
  var nom = "Boss"

  def battre(p: Personnage) = {
    println(p.nom + " a perdu devant " + nom + " !")
    p.pv -= 1
  }
  def battre(e: Ennemi) = println(e.nom + " a perdu devant " + nom + " !")
  def battre(b: Boss) = println(b.nom + " a perdu devant " + nom + " !")
}

class Princesse {
  var nom = "Princesse"

  def donnerBisou(p: Personnage) = println("mwaaaaaaaaah !")
  def donnerGifle(p: Personnage) = {
    println("Va-t-en !!")
    p.pv -= 1
  }
}

class Jeu {

  val mario = new Personnage
  val goomba = new Ennemi
  val bowser = new Boss
  val peach = new Princesse

  val rand = new scala.util.Random

  def chance(n: Int, m: Int) = {
    rand.nextInt(m) >= n
  }

  var gameOver = false

  def maledictionDeMario = {
    mario.nom = "Mario"
    goomba.nom = "Goomba"
    bowser.nom = "Bowser"
    peach.nom = "Peach"
    
    for(i <- 1 to 10; if (!gameOver)){
      println("*" * 50)

      if (chance(1, 5)) {
        mario.sauter

        if(chance(1, 3)) {
          mario.sauter

          if(chance(1, 4)) {
            mario.battre(goomba)

            if(chance(3, 10) || chance(3, 10)) { /* on a deux essais pour le château, il faut
                                                que le premier OU le deuxième soit VRAI */
              mario.entrerChateau

              if(chance(1, 2)){
                mario.battre(bowser)

                if (chance(1, 3)) {
                  mario.donnerBisou(peach)
                  gameOver = true  // si Mario arrive à baiser Peach alors le jeu se termine
                
                } else peach.donnerGifle(mario)

              }else bowser.battre(mario)

            }else println(mario.nom + " a été attrapé !")

          }else goomba.battre(mario)

        }else println(mario.nom + " est tombé dans le 2e trou !")

      }else println(mario.nom + " est tombé dans le premier trou !")

      if(mario.pv == 0) gameOver = true // si les vies de Mario sont toutes perdues on perd le jeu
      Thread.sleep(3000)  // temps d'attente 3 secondes
    }
    println("*" * 50)
    println("*" * 50)
    println("Game Over")
  }
}