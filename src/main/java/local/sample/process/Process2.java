package local.sample.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.fasterxml.jackson.databind.JsonNode;

import local.sample.validation.ParameterValidator;

public class Process2 implements Processor {

	private static final String JSON_SCHEMA = "/local/sample/endpoint/v1/schema/schema.json";

	@Override
	public void process(Exchange exchange) throws Exception {
		throw new RuntimeException("this is for rollback test.");
	}
}
