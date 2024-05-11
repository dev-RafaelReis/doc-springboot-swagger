package br.descomplica.project;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello World");
    }


@PostMapping("/add")
public ResponseEntity<String> addUser() {
    // Adiciona lógica para adicionar um usuário
    return ResponseEntity.ok("User added");
}

@PutMapping("/{userId}")
public ResponseEntity<String> updateUser(@PathVariable String userId) {
    // Adiciona lógica para atualizar um usuário
    return ResponseEntity.ok("User updated");
}

@DeleteMapping("/{userId}")
public ResponseEntity<String> deleteUser(@PathVariable String userId) {
    // Adiciona lógica para deletar um usuário
    return ResponseEntity.ok("User deleted");
}
}