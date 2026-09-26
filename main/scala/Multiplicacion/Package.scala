package object Multiplicacion {
  def PeasantAlgorithm(a:Int,b:Int):Int={
    if (a==0){
      0
    }else if (a==1){
      b
    }
    else if(a%2 !=0){
      b+PeasantAlgorithm(a/2,b+b)

    }
    else {
      PeasantAlgorithm(a/2,b+b)
    }
  }
}
def PeasantAlgorithmIT(a: Int, b: Int): Int = {
  var x = a
  var y = b
  var resultado = 0

  while (x > 0) {
    if (x % 2 != 0) {
      resultado += y
    }

    
    x = x / 2
    y = y + y
  }

 
  resultado
}
def splitMultiply(x: Int, y: Int): Int = {
  }
}

def fastMultiply(x: Int, y: Int): Int = {

}
