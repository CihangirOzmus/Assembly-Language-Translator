// Generated from C:/Javalib/Swe514_Project_v2/src\ExprGrammarFile.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprGrammarFileParser}.
 */
public interface ExprGrammarFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code beginend}
	 * labeled alternative in {@link ExprGrammarFileParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterBeginend(ExprGrammarFileParser.BeginendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code beginend}
	 * labeled alternative in {@link ExprGrammarFileParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitBeginend(ExprGrammarFileParser.BeginendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ExprGrammarFileParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ExprGrammarFileParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ExprGrammarFileParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ExprGrammarFileParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link ExprGrammarFileParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ExprGrammarFileParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link ExprGrammarFileParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ExprGrammarFileParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifthen}
	 * labeled alternative in {@link ExprGrammarFileParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterIfthen(ExprGrammarFileParser.IfthenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifthen}
	 * labeled alternative in {@link ExprGrammarFileParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitIfthen(ExprGrammarFileParser.IfthenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whiledo}
	 * labeled alternative in {@link ExprGrammarFileParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterWhiledo(ExprGrammarFileParser.WhiledoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whiledo}
	 * labeled alternative in {@link ExprGrammarFileParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitWhiledo(ExprGrammarFileParser.WhiledoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarFileParser#opt_stmts}.
	 * @param ctx the parse tree
	 */
	void enterOpt_stmts(ExprGrammarFileParser.Opt_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarFileParser#opt_stmts}.
	 * @param ctx the parse tree
	 */
	void exitOpt_stmts(ExprGrammarFileParser.Opt_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarFileParser#stm_list}.
	 * @param ctx the parse tree
	 */
	void enterStm_list(ExprGrammarFileParser.Stm_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarFileParser#stm_list}.
	 * @param ctx the parse tree
	 */
	void exitStm_list(ExprGrammarFileParser.Stm_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(ExprGrammarFileParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(ExprGrammarFileParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ExprGrammarFileParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ExprGrammarFileParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(ExprGrammarFileParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(ExprGrammarFileParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(ExprGrammarFileParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(ExprGrammarFileParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mod}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMod(ExprGrammarFileParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mod}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMod(ExprGrammarFileParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(ExprGrammarFileParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(ExprGrammarFileParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(ExprGrammarFileParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(ExprGrammarFileParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(ExprGrammarFileParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(ExprGrammarFileParser.IntContext ctx);
}