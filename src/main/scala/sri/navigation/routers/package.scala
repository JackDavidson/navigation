package sri.navigation

import sri.macros.{FunctionObjectMacro, OptDefault, OptionalParam}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

package object routers {

  @ScalaJSDefined
  trait StackRouterConfig extends js.Object

  object StackRouterConfig {
    @inline
    def apply(initialRouteName: OptionalParam[String] = OptDefault,
              initialRouteParams: OptionalParam[js.Object] = OptDefault,
              paths: OptionalParam[NavigationPathsConfig] = OptDefault,
              navigationOptions: OptionalParam[NavigationScreenOptions] =
                OptDefault): StackRouterConfig = {
      val p = FunctionObjectMacro()
      p.asInstanceOf[StackRouterConfig]
    }
  }

  @JSImport("react-navigation", "StackRouter")
  @js.native
  object StackRouterJS extends js.Object {

    def apply(routeConfigMap: NavigationRouteConfigMap,
              stackConfig: StackRouterConfig = ???): NavigationRouter =
      js.native
  }

  @inline
  def StackRouter(routes: (String, NavigationRouteConfig)*) =
    StackRouterJS(js.Dictionary(routes: _*))

  @inline
  def StackRouter(stackConfig: StackRouterConfig,
                  routes: (String, NavigationRouteConfig)*) =
    StackRouterJS(js.Dictionary(routes: _*), stackConfig)

  @ScalaJSDefined
  trait TabRouterConfig extends js.Object

  object TabRouterConfig {
    @inline
    def apply(initialRouteName: OptionalParam[String] = OptDefault,
              initialRouteParams: OptionalParam[js.Object] = OptDefault,
              backBehavior: OptionalParam[String] = OptDefault,
              paths: OptionalParam[NavigationPathsConfig] = OptDefault,
              navigationOptions: OptionalParam[NavigationScreenOptions] =
                OptDefault): TabRouterConfig = {
      val p = FunctionObjectMacro()
      p.asInstanceOf[TabRouterConfig]
    }
  }

  @JSImport("react-navigation", "TabRouter")
  @js.native
  object TabRouterJS extends js.Object {

    def apply(routeConfigMap: NavigationRouteConfigMap,
              tabConfig: TabRouterConfig = ???): NavigationRouter = js.native
  }

  @inline
  def TabRouter(routes: (String, NavigationRouteConfig)*) =
    TabRouterJS(js.Dictionary(routes: _*))

  @inline
  def TabRouter(tabConfig: TabRouterConfig,
                routes: (String, NavigationRouteConfig)*) =
    TabRouterJS(js.Dictionary(routes: _*), tabConfig)
}
