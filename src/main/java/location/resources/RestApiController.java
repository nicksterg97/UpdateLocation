package location.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import location.entities.ApiResponse;
import location.entities.AuthenticationRequest;
import location.entities.AuthenticationResponse;
import location.entities.User;
import location.entities.UserLocation;
import location.entities.service.MyUserDetailsService;
import location.jwtfilter.JwtUtil;
import location.proccessors.UserProcessor;
import location.repositories.UserRepository;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class RestApiController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private JwtUtil jwtTokenUtil;

	@Autowired
	private UserProcessor userProcessor;

	@Autowired
	private MyUserDetailsService userDetailsService;

	@RequestMapping(value = "/authenticate/android", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)
			throws Exception {

		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					authenticationRequest.getUsername(), authenticationRequest.getPassword()));
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password", e);
		}

		final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());

		final String jwt = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}

	@RequestMapping(value = "/android/update/userlocation", method = RequestMethod.POST)
	public void updateUserLocation(@RequestBody UserLocation location) {
		Optional<User> userFromRepo = userRepo.findById(location.getUser_id());

		// Posted Data
		String lat = location.getLatString();
		String lonString = location.getLonString();

		// User from user_id
		User user = userFromRepo.get();

		// Task Here

		/*
		 * asdjkmjkj
		 * userProcessor.process(user);
		 * dkfdc
		 */

	}

	@RequestMapping(value = "/android/receive/userlocation", method = RequestMethod.GET)
	public Flux<User> getUserLocation() {
		return Flux.create(sink -> {
			userProcessor.register(sink::next);
		});

	}

}
