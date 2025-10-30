package br.thullyoo.langchain4j_java.config;

import br.thullyoo.langchain4j_java.services.AssistantAiService;
import br.thullyoo.langchain4j_java.utils.AssistantTool;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AssistantConfig {

    @Value("${gemini.api.key}")
    private String apiKey;

    @Value("${gemini.model}")
    private String model;

    @Bean
    public GoogleAiGeminiChatModel googleAiGeminiChatModel() {
        return GoogleAiGeminiChatModel.builder()
                .apiKey(apiKey)
                .modelName(model)
                .build();
    }

    @Bean
    public AssistantAiService aiService (GoogleAiGeminiChatModel model, AssistantTool assistantTool) {
        return AiServices.builder(AssistantAiService.class)
                .chatModel(model)
                .tools(assistantTool)
                .build();
    }

}
