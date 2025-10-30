package br.thullyoo.langchain4j_java.utils;

import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class AssistantTool {

    private Map<String, Double> categoryRates = Map.of(
            "economico", 100.0,
            "suv", 150.0,
            "premium", 250.0
    );

    private Map<String, Double> insuranceRates = Map.of(
            "economico", 0.05,
            "suv", 0.08,
            "premium", 0.12
    );

    @Tool("Calcula o valor total do aluguel corporativo com base na categoria do carro e número de dias.")
    public String calculingQuotation(String category, int days){
        if (!categoryRates.containsKey(category.toLowerCase())) {
            return "Categoria inválida. As categorias disponíveis são: economico, suv, premium.";
        }

        double ratePerDay = categoryRates.get(category.toLowerCase());
        double insuranceRate = insuranceRates.get(category);
        double totalCost = (ratePerDay * days) * (1 + insuranceRate);

        return String.format("Cotação: %s por %d dias → R$ %.2f (inclui seguro %.0f%%)", category, days, totalCost, ratePerDay * 100);
    }

}
