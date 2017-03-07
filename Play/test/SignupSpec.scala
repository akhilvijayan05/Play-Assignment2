import controllers.SignupController
import org.scalatestplus.play.{OneAppPerTest, PlaySpec}
import play.api.mvc.Results
import play.api.test.FakeRequest
import play.api.test.Helpers._


/**
  * Created by knoldus on 8/3/17.
  */
class SignupSpec extends PlaySpec with OneAppPerTest with Results{

  "Signup Page#default" should {
    "should be valid" in {
      //val controller = new SignupController()
      val logRoute=route(app,FakeRequest(GET,"/signup")).get
      contentType(logRoute) mustBe Some("text/html")
      status(logRoute) mustBe OK
    }
  }
}
