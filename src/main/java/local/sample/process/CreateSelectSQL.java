package local.sample.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CreateSelectSQL implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String header_zip = exchange.getIn().getHeader("zip", String.class);
		String sql="SELECT * FROM ad_address";
		String sql_where = "";
		if (header_zip != null) {
			sql_where += " WHERE zip = \"" + header_zip + "\"";
		}
		exchange.getIn().setBody(sql + sql_where);
	}
}
