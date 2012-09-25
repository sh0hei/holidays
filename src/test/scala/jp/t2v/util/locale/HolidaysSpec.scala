package jp.t2v.util.locale

import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

import org.scala_tools.time.Imports._
import jp.t2v.util.locale.Implicits._

class HolidaysSpec extends FlatSpec with ShouldMatchers {

  "The Holidays" should "return holiday name" in {
    new LocalDate(2012,  1,  1).holidayName should equal (Some("元日"))
    new LocalDate(2012,  1,  2).holidayName should equal (Some("振替休日"))
    new LocalDate(2012,  1,  9).holidayName should equal (Some("成人の日"))
    new LocalDate(2012,  2, 11).holidayName should equal (Some("建国記念の日"))
    new LocalDate(2012,  3, 20).holidayName should equal (Some("春分の日"))
    new LocalDate(2012,  4, 29).holidayName should equal (Some("昭和の日"))
    new LocalDate(2012,  4, 30).holidayName should equal (Some("振替休日"))
    new LocalDate(2012,  5,  3).holidayName should equal (Some("憲法記念日"))
    new LocalDate(2012,  5,  4).holidayName should equal (Some("みどりの日"))
    new LocalDate(2012,  5,  5).holidayName should equal (Some("こどもの日"))
    new LocalDate(2012,  7, 16).holidayName should equal (Some("海の日"))
    new LocalDate(2012,  9, 17).holidayName should equal (Some("敬老の日"))
    new LocalDate(2012,  9, 22).holidayName should equal (Some("秋分の日"))
    new LocalDate(2012, 10,  8).holidayName should equal (Some("体育の日"))
    new LocalDate(2012, 11,  3).holidayName should equal (Some("文化の日"))
    new LocalDate(2012, 11, 23).holidayName should equal (Some("勤労感謝の日"))
    new LocalDate(2012, 12, 23).holidayName should equal (Some("天皇誕生日"))
    new LocalDate(2012, 12, 24).holidayName should equal (Some("振替休日"))

    // 水曜日の振替休日
    new LocalDate(2009,  5,  6).holidayName should equal (Some("振替休日"))
  }

}