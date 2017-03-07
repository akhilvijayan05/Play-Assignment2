import org.scalatestplus.play.{OneAppPerTest, PlaySpec}
import play.api.mvc.Results
import play.api.test.FakeRequest
import play.api.test.Helpers._


/**
  * Created by knoldus on 8/3/17.
  */
class SigninSpec extends PlaySpec with OneAppPerTest with Results{

  "Signin Page#default" should {
    "should be valid" in {
      val logRoute=route(app,FakeRequest(GET,"/signin")).get
      contentType(logRoute) mustBe Some("text/html")
      status(logRoute) mustBe OK
    }
  }
}
