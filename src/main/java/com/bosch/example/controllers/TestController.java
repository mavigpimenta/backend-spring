// package com.bosch.example.controllers;

// import org.springframework.http.HttpStatus;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.server.ResponseStatusException;

// import com.bosch.example.dto.User;
// import org.springframework.web.bind.annotation.RequestParam;


// @RestController
// public class TestController {
//     @GetMapping("/test")
//     public String test(@RequestBody User user) {
//         if (user.name() == null) {
//             throw new ResponseStatusException(
//                 HttpStatus.BAD_REQUEST, 
//                 "name is missing"
//             );     
//         }
//         return user.name();
//     }

//     @GetMapping("/name")
//     public String name(@RequestBody User user) {
//         if (user.name().length() < 6) {
//             throw new ResponseStatusException(
//                 HttpStatus.BAD_REQUEST,
//                 "name is small"
//             );
//         }
//         if (user.name() == null) {
//             throw new ResponseStatusException(
//                 HttpStatus.BAD_REQUEST, 
//                 "name is missing"
//             );     
//         }
//         if (user.email() == null) {
//             throw new ResponseStatusException(
//                 HttpStatus.BAD_REQUEST, 
//                 "email is missing"
//             );     
//         }

//         boolean hasNumber = false;
//         boolean specialChar = false;
//         boolean hasLetter = false;
//         for (char c : user.password().toCharArray())
//         {
//             if (c >= '0' && c <= '9') {
//                 hasNumber = true;
//             }
//             if (c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '&') {
//                 specialChar = true;
//             }
//             if (c >= 'a' && c <= 'z') {
//                 hasNumber = true;
//             }
//         }

//         if (!hasNumber || !specialChar || !hasLetter) {
//             throw new ResponseStatusException(
//                 HttpStatus.BAD_REQUEST, 
//                 "password isnt strong"
//             );   
//         }
//         return "Sucess";
//     }
// }
// // @RestController
// // public class TestController {
// //     @GetMapping("/test")
// //     public Integer test( Integer a, Integer b) {
// //         return a + b;
// //     }
// // }

// //ou

// // @RestController
// // public class TestController {
// //     @GetMapping("/test/{a}/{b}")
// //     public Integer test(PathVariable Integer a, PathVariable Integer b) {
// //         return a + b;
// //     }
// // }