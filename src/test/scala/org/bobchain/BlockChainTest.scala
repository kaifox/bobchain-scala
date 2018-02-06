package org.bobchain

import org.scalatest.FunSuite

class BlockChainTest extends FunSuite{

  test("last block is genesis after instantiation") {
    val blockChain = new Blockchain()
    assert(blockChain.lastBlock().previousHash == "genesis")
  }

}
