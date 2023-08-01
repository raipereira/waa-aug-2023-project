package edu.miu.cs545.alumnimanagementportal.service;

import edu.miu.cs545.alumnimanagementportal.auth.AuthenticationResponse;
import edu.miu.cs545.alumnimanagementportal.auth.LoginRequest;
import edu.miu.cs545.alumnimanagementportal.auth.RegisterRequest;
import edu.miu.cs545.alumnimanagementportal.entiteis.Role;
import edu.miu.cs545.alumnimanagementportal.entiteis.User;
import edu.miu.cs545.alumnimanagementportal.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsService;

    public AuthenticationResponse register(RegisterRequest registerRequest) {
        var user = User.builder()
                .firstname(registerRequest.getFirstname())
                .lastname(registerRequest.getLastname())
                .email(registerRequest.getEmail())
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .role(Role.ADM)
                .build();
        userRepository.save(user);
        var token = jwtService.generateToken(user);
        var refreshToken = jwtService.generateRefreshToken(user);
        return AuthenticationResponse.builder()
                .accessToken(token)
               // .refreshToken(refreshToken)
                .build();
    }

    public AuthenticationResponse authenticate(LoginRequest loginRequest) {

        Authentication result = null;
        try {
            result = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException(e.getMessage());
        }

//        Authentication authenticate = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));

        final UserDetails userDetails = userDetailsService.loadUserByUsername(result.getName());

//        var user = userRepository.findByEmail(loginRequest.getEmail())
//              .orElseThrow();
        var token = jwtService.generateToken(userDetails);
      //  var refreshToken = jwtService.generateRefreshToken(user);
        return AuthenticationResponse.builder()
                .accessToken(token)
              //  .refreshToken(refreshToken)
                .build();
    }

//    public void refreshToken(HttpServletRequest request, HttpServletResponse response)  throws IOException {
//            final String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
//            final String refreshToken;
//            final String userEmail;
//            if (authHeader == null ||!authHeader.startsWith("Bearer ")) {
//                return;
//            }
//            refreshToken = authHeader.substring(7);
//            userEmail = jwtService.extractUserName(refreshToken);
//            if (userEmail != null) {
//                var user = this.userRepository.findByEmail(userEmail)
//                        .orElseThrow();
//                if (jwtService.isTokenIsValid(refreshToken, user)) {
//                    var accessToken = jwtService.generateToken(user);
//                    revokeAllUserTokens(user);
//                    saveUserToken(user, accessToken);
//                    var authResponse = AuthenticationResponse.builder()
//                            .accessToken(accessToken)
//                            .refreshToken(refreshToken)
//                            .build();
//                    new ObjectMapper().writeValue(response.getOutputStream(), authResponse);
//                }
//            }
//        }

//    private void revokeAllUserTokens(User user) {
//        var validUserTokens = tokenRepository.findAllValidTokenByUser(user.getId());
//        if (validUserTokens.isEmpty())
//            return;
//        validUserTokens.forEach(token -> {
//            token.setExpired(true);
//            token.setRevoked(true);
//        });
//        tokenRepository.saveAll(validUserTokens);
//    }

//    private void saveUserToken(User user, String jwtToken) {
//        var token = Token.builder()
//                .user(user)
//                .token(jwtToken)
//                .tokenType(TokenType.BEARER)
//                .expired(false)
//                .revoked(false)
//                .build();
//        tokenRepository.save(token);
//    }

}
