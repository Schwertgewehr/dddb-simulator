package com.dss.dddbs

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document

object App extends JSApp {
  def main () {
    val ele = document.createElement("p")
    ele.innerHTML = "hello"
    document.body.insertBefore(ele, document.getElementsByName("div")(0))
  }
}
