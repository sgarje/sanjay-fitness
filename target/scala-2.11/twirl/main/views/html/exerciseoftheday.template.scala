
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object exerciseoftheday_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class exerciseoftheday extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Exercise,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(exercise:Exercise):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>Sanjay's Fitness: Exercise of the Day """),_display_(/*5.51*/exercise/*5.59*/.name),format.raw/*5.64*/("""</title>
</head>
<body>
Our exercise of the day is """),_display_(/*8.29*/exercise/*8.37*/.name),format.raw/*8.42*/(""" """),format.raw/*8.43*/("""and going for """),_display_(/*8.58*/exercise/*8.66*/.minutes),format.raw/*8.74*/(""" """),format.raw/*8.75*/("""minutes
</body>
</html>"""))
      }
    }
  }

  def render(exercise:Exercise): play.twirl.api.HtmlFormat.Appendable = apply(exercise)

  def f:((Exercise) => play.twirl.api.HtmlFormat.Appendable) = (exercise) => apply(exercise)

  def ref: this.type = this

}


}

/**/
object exerciseoftheday extends exerciseoftheday_Scope0.exerciseoftheday
              /*
                  -- GENERATED --
                  DATE: Wed Jul 01 22:53:42 PDT 2015
                  SOURCE: C:/Training/Scala/projects/sanjay-fitness/app/views/exerciseoftheday.scala.html
                  HASH: 6c2f8a556fe54b2daea53689fff27e908d665bc8
                  MATRIX: 551->1|665->20|693->22|802->105|818->113|843->118|924->173|940->181|965->186|993->187|1034->202|1050->210|1078->218|1106->219
                  LINES: 20->1|25->1|26->2|29->5|29->5|29->5|32->8|32->8|32->8|32->8|32->8|32->8|32->8|32->8
                  -- GENERATED --
              */
          