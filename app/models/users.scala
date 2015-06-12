package models
import util.DBUtil.db
import scala.slick.driver.MySQLDriver.simple._
/**
 * Created by JY on 2015/6/11.
 */
object users {
    def insertUser(name:String,psw:String,email:Option[String],phone:Option[String])=db.withSession{implicit session=>

    }
    def findUserByName(userName:String)=db.withSession{implicit session=>
        Tables.User.filter(_.name===userName).map(f=>(f.name,f.password)).first
    }

}
