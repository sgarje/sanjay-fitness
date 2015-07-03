
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listexercises_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class listexercises extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Exercise],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(exercises: List[Exercise]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>Create a New Exercise</title>
</head>
<body>
Here are the list of exercises already entered!

<ul>
    """),_display_(/*12.6*/for(e <- exercises) yield /*12.25*/ {_display_(Seq[Any](format.raw/*12.27*/("""
    """),format.raw/*13.5*/("""<li>"""),_display_(/*13.10*/e/*13.11*/.name),format.raw/*13.16*/(""" """),format.raw/*13.17*/("""for """),_display_(/*13.22*/e/*13.23*/.minutes),format.raw/*13.31*/(""" """),format.raw/*13.32*/("""minutes</li>
    """)))}),format.raw/*14.6*/("""
"""),format.raw/*15.1*/("""</ul>
</body>
</html>
"""))
      }
    }
  }

  def render(exercises:List[Exercise]): play.twirl.api.HtmlFormat.Appendable = apply(exercises)

  def f:((List[Exercise]) => play.twirl.api.HtmlFormat.Appendable) = (exercises) => apply(exercises)

  def ref: this.type = this

}


}

/**/
object listexercises extends listexercises_Scope0.listexercises
              /*
                  -- GENERATED --
                  DATE: Thu Jul 02 15:29:57 PDT 2015
                  SOURCE: C:/Training/Scala/projects/sanjay-fitness/app/views/listexercises.scala.html
                  HASH: 1b964776ed6d4369154a85d34fdfd3a728ee0f9d
                  MATRIX: 551->1|673->28|703->32|883->186|918->205|958->207|991->213|1023->218|1033->219|1059->224|1088->225|1120->230|1130->231|1159->239|1188->240|1237->259|1266->261
                  LINES: 20->1|25->1|27->3|36->12|36->12|36->12|37->13|37->13|37->13|37->13|37->13|37->13|37->13|37->13|37->13|38->14|39->15
                  -- GENERATED --
              */
          