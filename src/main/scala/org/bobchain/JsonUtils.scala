package org.bobchain

import com.google.gson.Gson

object JsonUtils {

  private val gson = new Gson()

  def toJson(any: Any) : String = {
    gson.toJson(any)
  }

}
