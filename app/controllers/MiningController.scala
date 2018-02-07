package controllers

import javax.inject.Inject

import play.api.mvc._

class MiningController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def mineNewBlock = Action {
    Ok("We will mine a new block")
  }
}
