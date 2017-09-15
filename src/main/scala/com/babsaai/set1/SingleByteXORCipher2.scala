package com.babsaai.set1

object SingleByteXORCipher2 {

  def decrypt(code: String): String = {
    val msg = ConvertHexToBase64.hex2bytes(code)
    letterScores.keys
      .map(c => msg.map(x => (c ^ x).toByte))
      .map(d => (d, calculateScore(d)))
      .toList.sortBy(_._2).reverse.take(5)
      .map(a => new String(a._1))
      .mkString("\n")
  }

  def calculateScore(code: Array[Byte]): Double = {
    code.map(b => b.toChar.toUpper).foldLeft(.0)((sum, c) => sum + letterScores(c))
  }

  
  val letterScores = Map(
    'A' -> 8.167,
    'B' -> 1.492,
    'C' -> 2.782,
    'D' -> 4.253,
    'E' -> 12.70,
    'F' -> 2.228,
    'G' -> 2.015,
    'H' -> 6.094,
    'I' -> 6.966,
    'J' -> 0.153,
    'K' -> 0.772,
    'L' -> 4.025,
    'M' -> 2.406,
    'N' -> 6.749,
    'O' -> 7.507,
    'P' -> 1.929,
    'Q' -> 0.095,
    'R' -> 5.987,
    'S' -> 6.327,
    'T' -> 9.056,
    'U' -> 2.758,
    'V' -> 0.978,
    'W' -> 2.360,
    'X' -> 0.150,
    'Y' -> 1.974,
    'Z' -> 0.074).withDefaultValue(.0)

}