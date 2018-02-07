package org.bobchain.domain

import java.time.Instant

class Block(val index: Int, val time: Instant, val transactions: Vector[Transaction], val proof: Long, val previousHash: String) {
}
