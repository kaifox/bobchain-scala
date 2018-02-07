package org.bobchain.domain

import java.time.Instant

import org.bobchain.domain.Blockchains.hash
import org.scalatest.FunSuite

class BlockchainsTest extends FunSuite {

  test("hash returns the same for same objects") {
    assert(hash(blockOfIndex(1)) == hash(blockOfIndex(1)))
  }

  test("hash for different indizes is different") {
    assert(hash(blockOfIndex(1)) != hash(blockOfIndex(2)))
  }

  private def blockOfIndex(index: Int): Block = {
    new Block(index = index, previousHash = "any", proof = 1, time = Instant.ofEpochSecond(0), transactions = Vector.empty)
  }
}
