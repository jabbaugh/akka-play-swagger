package controllers

import javax.inject.Inject
import play.api.mvc.{ AbstractController, ControllerComponents }

class SchedulePartnerController @Inject()(cc: ControllerComponents)(implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

}
