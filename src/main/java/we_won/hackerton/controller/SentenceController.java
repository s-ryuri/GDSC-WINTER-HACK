//package we_won.hackerton.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import we_won.hackerton.Interface.SentenceRepository;
//import we_won.hackerton.dto.SentenceFormDTO;
//
//import java.util.HashMap;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api/sentence")
//public class SentenceController {
//
//    private final SentenceRepository sentenceRepository;
//
//    @PostMapping("")
//    public ResponseEntity<?> insertSentence(@RequestBody SentenceFormDTO sentenceFormDTO){
//        sentenceRepository.save(sentenceFormDTO.toEntity());
//        HashMap<String,String> result = new HashMap<>();
//        result.put("status","200");
//        result.put("message","문장이 DB에 성공적으로 저장되었습니다.");
//        return new ResponseEntity<>(result, HttpStatus.CREATED);
//    }
//}
