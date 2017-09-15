package com.babsaai.set1

import org.scalatest.FlatSpec

class ConvertHexToBase64Spec extends FlatSpec {

  it should "work with the example" in {
    val a = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d"

    val actual = ConvertHexToBase64.convert(a)
    val expected = "SSdtIGtpbGxpbmcgeW91ciBicmFpbiBsaWtlIGEgcG9pc29ub3VzIG11c2hyb29t"
    
    assert(expected == actual)
  }

}