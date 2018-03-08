package pruebas;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class GenerateResponse implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String x = exchange.getIn().getBody(String.class);
        exchange.getOut().setBody(x);
    }
}
