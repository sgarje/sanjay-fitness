
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object workoutoftheday_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class workoutoftheday extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Exercise],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(exercises: List[Exercise]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>Sanjay's Fitness Workout of the Day</title>
</head>
<body>
<ol>
    """),_display_(/*9.6*/for(exercise <- exercises) yield /*9.32*/ {_display_(Seq[Any](format.raw/*9.34*/("""
    """),format.raw/*10.5*/("""<li>"""),_display_(/*10.10*/exercise/*10.18*/.name),format.raw/*10.23*/(""" """),format.raw/*10.24*/("""and go """),_display_(/*10.32*/exercise/*10.40*/.minutes),format.raw/*10.48*/(""" """),format.raw/*10.49*/("""minutes</li>
    """)))}),format.raw/*11.6*/("""
"""),format.raw/*12.1*/("""</ol>
</body>
</html>"""))
      }
    }
  }

  def render(exercises:List[Exercise]): play.twirl.api.HtmlFormat.Appendable = apply(exercises)

  def f:((List[Exercise]) => play.twirl.api.HtmlFormat.Appendable) = (exercises) => apply(exercises)

  def ref: this.type = this

}


}

/**/
object workoutoftheday extends workoutoftheday_Scope0.workoutoftheday
              /*
                  -- GENERATED --
                  DATE: Wed Jul 01 22:47:34 PDT 2015
                  SOURCE: C:/Training/Scala/projects/sanjay-fitness/app/views/workoutoftheday.scala.html
                  HASH: 1bf34fe53737b439c9e539996b6b6f373c031a19
                  MATRIX: 555->1|677->28|705->30|847->147|888->173|927->175|960->181|992->186|1009->194|1035->199|1064->200|1099->208|1116->216|1145->224|1174->225|1223->244|1252->246
                  LINES: 20->1|25->1|26->2|33->9|33->9|33->9|34->10|34->10|34->10|34->10|34->10|34->10|34->10|34->10|34->10|35->11|36->12
                  -- GENERATED --
              */
          