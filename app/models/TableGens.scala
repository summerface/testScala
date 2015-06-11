package models

/**
 * Created by JY on 2015/6/11.
 */
object TableGens extends App{

  val slickDriver = "slick.driver.MySQLDriver"
  val jdbcDriver = "com.mysql.jdbc.Driver"
  val url = "jdbc:mysql://localhost:3306/pages?characterEncoding=utf-8"
  val outputFolder = "./app/models"
  val pkg = "models"
  val user = "root"
  val password = "jiye8286566"

  slick.codegen.SourceCodeGenerator.main(
    Array(slickDriver, jdbcDriver, url, outputFolder, pkg, user, password)
  )
}