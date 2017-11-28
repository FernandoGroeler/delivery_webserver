package microservices.rest;

import microservices.model.Restaurants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@ResponseBody
public class RestaurantsController {
    public static final String RESTAURANTS_SERVICE_URL = "http://RESTAURANTS-MICROSERVICE";

    @Autowired
    protected RestTemplate restTemplate;

    @RequestMapping(value = "/restaurants", method = RequestMethod.GET)
    public Restaurants restaurants() {
        return restTemplate.getForObject(RESTAURANTS_SERVICE_URL + "/restaurants", Restaurants.class);
    }
}
