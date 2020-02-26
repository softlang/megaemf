package org.softlang.qegal.buildins.string;

import org.apache.jena.graph.Node;
import org.apache.jena.graph.NodeFactory;
import org.apache.jena.reasoner.rulesys.BindingEnvironment;
import org.apache.jena.reasoner.rulesys.BuiltinException;
import org.apache.jena.reasoner.rulesys.RuleContext;
import org.softlang.qegal.buildins.QegalBuiltin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Johannes on 24.11.2017.
 */
public class ReplaceAll extends QegalBuiltin {

	public static void main(String[] args) {
		// Test replacement.
		String input = "org.apache.commons.logging;bundle-version=\"1.0.4\";resolution:=optional,";

		String output = input.replaceAll("(\"[^\"]*)\"", "");

		System.out.println(output);

	}

	@Override
	public boolean trackedBodyCall(Node[] args, int length, RuleContext context) {
		if (length != 4)
			throw new BuiltinException(this, context, "Must have 4 arguments " + getName());

		String in = getString(getArg(0, args, context));
		String pattern = getString(getArg(1, args, context));
		String replace = getString(getArg(2, args, context));

		BindingEnvironment env = context.getEnv();
		return env.bind(getArg(3, args, context), NodeFactory.createLiteral(in.replaceAll(pattern, replace)));
	}

	private String getString(Node n) {
		if (n.isLiteral())
			return n.getLiteralLexicalForm();
		else
			return n.getURI();
	}
}
