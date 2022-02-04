package we_won.hackerton.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import we_won.hackerton.Interface.LiteratureRepository;
import we_won.hackerton.entity.Literature;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/literatures")
public class LiteratureController {
    private final LiteratureRepository literatureRepository;

    @GetMapping("/random")
    public ResponseEntity<?> getAllLiter() {
        List<Literature> literature = literatureRepository.findAll();
        System.out.println(literature);
        try{
            return new ResponseEntity<>(literature,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("에러입니다.",HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/{category}")
    public ResponseEntity<?> getLiteratureById(@PathVariable("category") long category) {
        List<Literature> literature = literatureRepository.findByCategory(category);
        try{
            return new ResponseEntity<>(literature,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("에러입니다.",HttpStatus.BAD_REQUEST);
        }
    }


}
