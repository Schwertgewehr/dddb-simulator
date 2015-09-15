package com.dss.dddbs.controller

import com.dss.dddbs.model.DataModel
import com.dss.dddbs.view.View
import org.scalajs.dom
import dom.document

object DataController {
  val view: View = new View(document)
  def init() = ???
  def update(name: String, value: Int) = {
    val data = DataModel(name, value).update
    view.update(data)
  }
}
