package org.bobchain.domain

import java.time.Instant

import org.scalatest.FunSuite

class BlockTest extends FunSuite {

  test("index is correctly passed") {
    val block = new Block(index = 1, previousHash = "", proof = 1, time = Instant.now(), transactions = Vector.empty)
    assert(block.index == 1)
  }


}
