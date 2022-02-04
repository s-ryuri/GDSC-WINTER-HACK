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

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sentence")
public class SentenceController {


    private final LiteratureRepository literatureRepository;

    @GetMapping("/{title}")
    public ResponseEntity<?> getLiteratureInfo(@PathVariable("title") String title){
        Literature literature = literatureRepository.findByTitle(title);
        return new ResponseEntity<>(literature,HttpStatus.CREATED);
    }
}
