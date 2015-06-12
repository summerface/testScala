package controllers

import models.users
import play.api._
import play.api.libs.json.Json
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def signin(username:String)=Action{
    val arr=users.findUserByName(username)
    val jarr=Json.obj("username"->arr._1,"password"->arr._2)
    Ok(jarr)
  }
}