package br.thullyoo.langchain4j_java.controller;

import br.thullyoo.langchain4j_java.services.AssistantAiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssistantController {

    private final AssistantAiService aiService;

    public AssistantController(AssistantAiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/api/assistant")
    public ResponseEntity<String> assistantEndpoint(@RequestBody String message ) {
        String response = aiService.handleRequest(message).content();
        return ResponseEntity.ok(response);
    }
}
