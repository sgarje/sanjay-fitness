
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Training/Scala/projects/sanjay-fitness/conf/routes
// @DATE:Thu Jul 02 15:30:51 PDT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
