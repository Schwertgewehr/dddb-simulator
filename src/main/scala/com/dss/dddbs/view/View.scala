package com.dss.dddbs.view

import com.dss.dddbs.model.data.Data
import org.scalajs.dom.raw.HTMLDocument

class View(document: HTMLDocument) {
  val graph = new Graph(document).build()
  val upperT = new Text(document, "v_ut")
  val lowerT = new Text(document, "v_lt")
  val increase = new Text(document, "v_in")
  val decrease = new Text(document, "v_de")
  upperT.onchange(e => test(this))
  lowerT.onchange(e => test(this))
  increase.onchange(e => test(this))
  decrease.onchange(e => test(this))

  def update(value: Data) {
    graph.context.clearRect(0, 0, graph.canvas.width, graph.canvas.height);
    graph.update(value)
  }

  private def test(v: View) {
    update(Data(
      upperThreshold = v.upperT.input.value.toInt,
      lowerThreshold = v.lowerT.input.value.toInt,
      increase = v.increase.input.value.toInt,
      decrease = v.decrease.input.value.toInt
    ))
  }
}
