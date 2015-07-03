
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Training/Scala/projects/sanjay-fitness/conf/routes
// @DATE:Thu Jul 02 15:30:51 PDT 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:9
  Assets_0: controllers.Assets,
  // @LINE:10
  FitnessController_2: controllers.FitnessController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:9
    Assets_0: controllers.Assets,
    // @LINE:10
    FitnessController_2: controllers.FitnessController
  ) = this(errorHandler, Application_1, Assets_0, FitnessController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, FitnessController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """welcome""", """controllers.FitnessController.welcome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """welcome/$name<[^/]+>""", """controllers.FitnessController.welcomeWithName(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exrciseoftheday""", """controllers.FitnessController.exerciseOfTheDay()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workoutoftheday""", """controllers.FitnessController.workoutOfTheDay()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exercise/create""", """controllers.FitnessController.initExercise()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exercise/create""", """controllers.FitnessController.createExercise()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listexercises""", """controllers.FitnessController.listExercises()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_FitnessController_welcome2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("welcome")))
  )
  private[this] lazy val controllers_FitnessController_welcome2_invoker = createInvoker(
    FitnessController_2.welcome(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FitnessController",
      "welcome",
      Nil,
      "GET",
      """""",
      this.prefix + """welcome"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_FitnessController_welcomeWithName3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("welcome/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FitnessController_welcomeWithName3_invoker = createInvoker(
    FitnessController_2.welcomeWithName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FitnessController",
      "welcomeWithName",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """welcome/$name<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_FitnessController_exerciseOfTheDay4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exrciseoftheday")))
  )
  private[this] lazy val controllers_FitnessController_exerciseOfTheDay4_invoker = createInvoker(
    FitnessController_2.exerciseOfTheDay(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FitnessController",
      "exerciseOfTheDay",
      Nil,
      "GET",
      """""",
      this.prefix + """exrciseoftheday"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_FitnessController_workoutOfTheDay5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workoutoftheday")))
  )
  private[this] lazy val controllers_FitnessController_workoutOfTheDay5_invoker = createInvoker(
    FitnessController_2.workoutOfTheDay(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FitnessController",
      "workoutOfTheDay",
      Nil,
      "GET",
      """""",
      this.prefix + """workoutoftheday"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_FitnessController_initExercise6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exercise/create")))
  )
  private[this] lazy val controllers_FitnessController_initExercise6_invoker = createInvoker(
    FitnessController_2.initExercise(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FitnessController",
      "initExercise",
      Nil,
      "GET",
      """""",
      this.prefix + """exercise/create"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_FitnessController_createExercise7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exercise/create")))
  )
  private[this] lazy val controllers_FitnessController_createExercise7_invoker = createInvoker(
    FitnessController_2.createExercise(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FitnessController",
      "createExercise",
      Nil,
      "POST",
      """""",
      this.prefix + """exercise/create"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_FitnessController_listExercises8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listexercises")))
  )
  private[this] lazy val controllers_FitnessController_listExercises8_invoker = createInvoker(
    FitnessController_2.listExercises(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FitnessController",
      "listExercises",
      Nil,
      "GET",
      """""",
      this.prefix + """listexercises"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:10
    case controllers_FitnessController_welcome2_route(params) =>
      call { 
        controllers_FitnessController_welcome2_invoker.call(FitnessController_2.welcome())
      }
  
    // @LINE:11
    case controllers_FitnessController_welcomeWithName3_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_FitnessController_welcomeWithName3_invoker.call(FitnessController_2.welcomeWithName(name))
      }
  
    // @LINE:12
    case controllers_FitnessController_exerciseOfTheDay4_route(params) =>
      call { 
        controllers_FitnessController_exerciseOfTheDay4_invoker.call(FitnessController_2.exerciseOfTheDay())
      }
  
    // @LINE:13
    case controllers_FitnessController_workoutOfTheDay5_route(params) =>
      call { 
        controllers_FitnessController_workoutOfTheDay5_invoker.call(FitnessController_2.workoutOfTheDay())
      }
  
    // @LINE:14
    case controllers_FitnessController_initExercise6_route(params) =>
      call { 
        controllers_FitnessController_initExercise6_invoker.call(FitnessController_2.initExercise())
      }
  
    // @LINE:15
    case controllers_FitnessController_createExercise7_route(params) =>
      call { 
        controllers_FitnessController_createExercise7_invoker.call(FitnessController_2.createExercise())
      }
  
    // @LINE:16
    case controllers_FitnessController_listExercises8_route(params) =>
      call { 
        controllers_FitnessController_listExercises8_invoker.call(FitnessController_2.listExercises())
      }
  }
}