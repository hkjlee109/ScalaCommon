package com.kwoolytech.scalacommon

object Syslog {

  def emergency(s: String) = { println("[Emergency] " + s) }
  def alert(s: String)     = { println("[Alert] "     + s) }
  def critical(s: String)  = { println("[Critical] "  + s) }
  def error(s: String)     = { println("[Error] "     + s) }
  def warning(s: String)   = { println("[Warning] "   + s) }
  def notice(s: String)    = { println("[Notice] "    + s) }
  def debug(s: String)     = { println("[Debug] "     + s) }
  def info(s: String)      = { println("[Info] "      + s) }

}


