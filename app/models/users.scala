package models
import util.DBUtil.db
/**
 * Created by JY on 2015/6/11.
 */
object users {
    def insertUser(name:String,psw:String,email:Option[String],phone:Option[String])=db.withSession{implicit session=>

    }

}
