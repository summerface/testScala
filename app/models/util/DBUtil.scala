package models.util

import play.api.db.DB
import scala.slick.driver.MySQLDriver.simple._
/**
 * Created by JY on 2015/6/11.
 */
object DBUtil {




  lazy val database = Database.forDataSource(DB.getDataSource())



  }

