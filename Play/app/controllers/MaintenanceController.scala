package controllers

import javax.inject.Inject

import play.api.cache.CacheApi
import play.api.mvc.{Action, Controller}
import services.{CacheTrait, HashingPassword, UserDetails}

/**
  * Created by knoldus on 7/3/17.
  */
class MaintenanceController @Inject() (cache: CacheApi,cacheService: CacheTrait) extends Controller {

  def default=Action{
//    val maybeUser: Option[UserDetails] = cacheService.getcache()
//    maybeUser match {
//      case Some(result) if (value.username.equals(result.username) && HashingPassword.checkHash(value.password,result.password)==true) => {
//        Redirect(routes.ProfileController.default).withSession("username" -> result.username).flashing("success" -> "Successfull logged in. Your details are...")
//      }
//      case _=> Ok(views.html.signin("Incorrect Username or password !!"))
//    }
    Ok(views.html.maintenance())
  }
}
