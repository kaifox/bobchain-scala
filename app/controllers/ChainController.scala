package controllers

import javax.inject.Inject

import play.api._
import play.api.mvc._

class ChainController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def fullChain = Action {
    Ok("We soon will return the full chain here ...")
  }
}
