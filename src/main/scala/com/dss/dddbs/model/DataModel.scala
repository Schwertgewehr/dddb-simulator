package com.dss.dddbs.model

import data.Data
import data.Percent

object DataModel {
  var upperThreshold: Int = 0
  var lowerThreshold: Int = 0
  var increase: Percent = 0
  var decrease: Percent = 0
  def update(name: String, value: Int): Option[Data] = {
    if (name == "upperThreshold") {
      upperThreshold = value
      Some(Data(upperThreshold, lowerThreshold, increase, decrease))
    } else if (name == "lowerThreshold") {
      lowerThreshold = value
      Some(Data(upperThreshold, lowerThreshold, increase, decrease))
    } else if (name == "increase") {
      increase = value
      Some(Data(upperThreshold, lowerThreshold, increase, decrease))
    } else if (name == "decrease") {
      decrease = value
      Some(Data(upperThreshold, lowerThreshold, increase, decrease))
    } else {
      None
    }
  }
}
