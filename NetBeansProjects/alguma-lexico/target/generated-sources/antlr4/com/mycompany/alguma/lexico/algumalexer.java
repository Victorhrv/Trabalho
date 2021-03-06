// Generated from com\mycompany\alguma\lexico\algumalexer.g4 by ANTLR 4.3
package com.mycompany.alguma.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class algumalexer extends Lexer {

    static Object VOCABULARY;
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Letra=1, Digito=2, PCAlgoritimo=3, Variavel=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'"
	};
	public static final String[] ruleNames = {
		"Letra", "Digito", "PCAlgoritimo", "Variavel"
	};


	public algumalexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "algumalexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2: PCAlgoritimo_action((RuleContext)_localctx, actionIndex); break;

		case 3: Variavel_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void Variavel_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  System.out.print("[Var,"+getText()+"]"); break;
		}
	}
	private void PCAlgoritimo_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  System.out.print("[Palavra-chave, "+getText()+"]"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\6&\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5 \n\5\f\5\16\5#\13\5\3\5\3\5\2\2\6"+
		"\3\3\5\4\7\5\t\6\3\2\3\4\2C\\c|\'\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\3\13\3\2\2\2\5\r\3\2\2\2\7\17\3\2\2\2\t\34\3\2\2\2\13\f\t"+
		"\2\2\2\f\4\3\2\2\2\r\16\4\62;\2\16\6\3\2\2\2\17\20\7C\2\2\20\21\7N\2\2"+
		"\21\22\7I\2\2\22\23\7Q\2\2\23\24\7T\2\2\24\25\7K\2\2\25\26\7V\2\2\26\27"+
		"\7K\2\2\27\30\7O\2\2\30\31\7Q\2\2\31\32\3\2\2\2\32\33\b\4\2\2\33\b\3\2"+
		"\2\2\34!\5\3\2\2\35 \5\3\2\2\36 \5\5\3\2\37\35\3\2\2\2\37\36\3\2\2\2 "+
		"#\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\b\5\3\2%\n\3\2"+
		"\2\2\5\2\37!\4\3\4\2\3\5\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}