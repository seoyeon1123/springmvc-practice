package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/mapping/users")
public class MappingClassController {
    //1. 회원 목록 조회: GET ( /users )
    @GetMapping
    public String user(){
        return "get users";
    }

    //2. 회원 등록: POST ( /users )
    @PostMapping
    public String addUser(){
        return "post user";
    }

    //3 . 회원 조회: GET ( /users/{userId} )
    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId){
        return "get userId = " + userId;
    }

    //4. 회원 수정: PATCH ( /users/{userId} )
    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId){
        return "update userId = " + userId;
    }

    //5. 회원 삭제: DELETE ( /users/{userId} )
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId){
        return "delete useId = " + userId;
    }

}
