package org.bobchain

import org.scalatest.FunSuite

class BobMainTest extends FunSuite {
  test("BobMain.root") {
    assert(BobMain.cube(3) == 27)
  }
}
