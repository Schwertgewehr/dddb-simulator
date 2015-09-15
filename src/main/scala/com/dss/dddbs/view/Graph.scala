package com.dss.dddbs.view

import com.dss.dddbs.model.data.Data
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.raw.{HTMLCanvasElement, HTMLDocument}

class Graph(document: HTMLDocument) {

  val canvas: HTMLCanvasElement = initCanvas
  val context = canvas.getContext("2d").asInstanceOf[CanvasRenderingContext2D]

  val maxWidth: Double = 640
  val maxHeight: Double = 480

  private def initCanvas = {
    val canvas = document.createElement("canvas").asInstanceOf[HTMLCanvasElement]
    canvas.setAttribute("width", "640")
    canvas.setAttribute("height", "480")
    canvas
  }

  def build(): Graph = {
    document.body.insertBefore(canvas, document.getElementsByName("script")(0))
    this
  }

  def update(value: Data) {
    drawLine((0, 50), (100, 50)) // base
    drawLine((40, value.upperThreshold), (60, value.upperThreshold)) // center upperT
    val leftUpper = value.upperThreshold * (1.0 - value.decrease.toDouble / 100.0)
    val rightUpper = value.upperThreshold * (1.0 + value.increase.toDouble / 100.0)
    drawLine((0, leftUpper), (20, leftUpper)) // left upperT
    drawLine((80, rightUpper), (100, rightUpper)) // left upperT

//    val leftLower = value.lowerThreshold * (1.0 - value.decrease.toDouble / 100.0)
//    val rightLower = value.lowerThreshold * (1.0 + value.increase.toDouble / 100.0)
//    drawLine((0, leftLower), (20, leftLower)) // left lowerT
//    drawLine((80, rightLower), (100, rightLower)) // left lowerT
  }

  private def drawLine(from: (Double, Double), to: (Double, Double)) {
    context.beginPath()
    context.moveTo(value2x(from._1), value2y(from._2))
    context.lineTo(value2x(to._1), value2y(to._2))
    context.closePath()
    context.stroke()
  }

  private def value2x(value: Double): Double = value.toDouble * maxWidth / 100.0

  private def value2y(value: Double): Double = maxHeight - ((value.toDouble * maxHeight / 100.0) / 2)
}
