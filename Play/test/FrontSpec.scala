import org.scalatestplus.play.{OneAppPerTest, PlaySpec}
import play.api.mvc.Results
import play.api.test.FakeRequest
import play.api.test.Helpers._


/**
  * Created by knoldus on 8/3/17.
  */
class FrontSpec extends PlaySpec with OneAppPerTest with Results{

  "Front Page#front" should {
    "should be valid" in {
      val logRoute=route(app,FakeRequest(GET,"/front")).get
      contentType(logRoute) mustBe Some("text/html")
      status(logRoute) mustBe OK
    }
  }
}
