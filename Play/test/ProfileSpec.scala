import org.scalatestplus.play.{OneAppPerTest, PlaySpec}
import play.api.mvc.Results
import play.api.test.FakeRequest
import play.api.test.Helpers._
import org.scalatest._
import scala.concurrent.Future
import play.api.mvc._
import controllers.ProfileController
import services.CacheTrait
import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito._


/**
  * Created by knoldus on 8/3/17.
  */
class ProfileSpec extends PlaySpec with OneAppPerTest with Results with MockitoSugar{
  "Example Page#index" should {
    "should be valid" in {
      val mockDataService = mock[CacheTrait]
      when(mockDataService.getcache("")) thenReturn Option[cache])
      val controller = new ProfileController()
      val result: Future[Result] = controller.default().apply(FakeRequest())
      val bodyText: String = contentAsString(result)
      bodyText mustBe "ok"
  }
  }
}
