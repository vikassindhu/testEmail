package steps;

import com.responcePojo.CreateObjectResponce;
import com.requestPojo.CreateObject;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import utility.BaseSpecification;
import utility.ApiEndpoints;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class CreatObjectSteps {

    private CreateObject object;
    private Response response;

    @Given("I have an object with the following details")
    public void setObjectDetails(DataTable dataTable) {

        Map<String, String> data = dataTable.asMap(String.class, String.class);

        CreateObject.Data objectData = new CreateObject.Data();
        objectData.setYear(Integer.parseInt(data.get("year")));
        objectData.setPrice(Double.parseDouble(data.get("price")));
        objectData.setCpuModel(data.get("cpu"));
        objectData.setHardDiskSize(data.get("disk"));

        object = new CreateObject();
        object.setName(data.get("name"));
        object.setData(objectData);
    }

    @When("I send a POST request to create object")
    public void sendPostRequest() {
        response = given()
                .spec(BaseSpecification.getRequestSpec())
                .body(object)
                .when()
                .post(ApiEndpoints.OBJECTS);
    }

    @Then("the response status code should be {int}")
    public void verifyStatusCode(int statusCode) {
        response.then()
                .spec(BaseSpecification.getResponseSpec(statusCode));
    }

    @Then("the response should contain the object details")
    public void verifyResponseBody() {

        CreateObjectResponce responseObject =
                response.as(CreateObjectResponce.class);

        assertEquals(responseObject.getName(), object.getName());
        assertEquals(responseObject.getData().getYear(), object.getData().getYear());
        assertEquals(responseObject.getData().getPrice(), object.getData().getPrice());
        assertEquals(responseObject.getData().getCpuModel(), object.getData().getCpuModel());
        assertEquals(responseObject.getData().getHardDiskSize(), object.getData().getHardDiskSize());
    }
}