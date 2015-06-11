package util

import scala.slick.jdbc.JdbcBackend.Database
import scala.slick.driver.MySQLDriver.simple._

object DBUtil {
  val db = Database.forURL(url = play.api.Play.current.configuration.getString("db.default.url").getOrElse(""),
    user = play.api.Play.current.configuration.getString("db.default.user").getOrElse(""),
    password = play.api.Play.current.configuration.getString("db.default.password").getOrElse(""),
    driver = play.api.Play.current.configuration.getString("db.default.driver").getOrElse(""))

}  