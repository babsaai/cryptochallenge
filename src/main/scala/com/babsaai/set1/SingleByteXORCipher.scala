package com.babsaai.set1

object SingleByteXORCipher {

  def getPaddedCharAsHexBytes(c: Char, size: Int): String = {
    val hex = ConvertHexToBase64.bytes2hex(c.toString.getBytes)
    val key = hex.reverse.padTo(size, hex).reverse
    key.mkString
  }

  def decrypt(code: String): String = {
    val decrypteds = letterFrequencies.keys.toList.map(c => {
      val proposedKey = getPaddedCharAsHexBytes(c, code.size)

      val xoredHex = FixedXOR.xorHexes(code, proposedKey)

      val decrypted = new String(ConvertHexToBase64.hex2bytes(xoredHex))
      val score = calculateScore(decrypted)

      (decrypted, score)
    })

    decrypteds.sortBy(_._2).reverse.take(5).mkString("\n")

  }

  def calculateScore(code: String): Double = {
    code.foldLeft(.0)((sum, c) => sum + letterFrequencies(c.toUpper))
  }

  val letterFrequencies = Map(
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