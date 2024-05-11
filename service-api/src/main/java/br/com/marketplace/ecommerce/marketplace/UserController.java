package br.com.marketplace.ecommerce.marketplace;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for exposing User information.
 *
 * @author Rob Winch
 */
@RestController
@CrossOrigin(origins = "*")
public class UserController {

    private String token;

    @GetMapping("/login")
    public ResponseEntity<?> user(@PathVariable("jsessionid") String jsessionid) {
        CustomUser user = new CustomUser();
        user.setToken(jsessionid);
        this.token = jsessionid;
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<?> user(@RequestBody CustomUser users) {
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
