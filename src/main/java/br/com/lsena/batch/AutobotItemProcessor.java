package br.com.lsena.batch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class AutobotItemProcessor implements ItemProcessor<Autobot, Autobot> {

    @Override
    public Autobot process(Autobot autobot) throws Exception {
        String nome = autobot.getNome().toUpperCase();
        String carro = autobot.getCarro().toUpperCase();

        final Autobot transformado = new Autobot(nome, carro);
        log.info("Convetendo {} para {}", autobot, transformado);
        return null;
    }
}
