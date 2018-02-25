// Generated from C:/Javalib/Swe514_Project_v2/src\ExprGrammarFile.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprGrammarFileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprGrammarFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code beginend}
	 * labeled alternative in {@link ExprGrammarFileParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginend(ExprGrammarFileParser.BeginendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ExprGrammarFileParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ExprGrammarFileParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link ExprGrammarFileParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ExprGrammarFileParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifthen}
	 * labeled alternative in {@link ExprGrammarFileParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthen(ExprGrammarFileParser.IfthenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whiledo}
	 * labeled alternative in {@link ExprGrammarFileParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiledo(ExprGrammarFileParser.WhiledoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprGrammarFileParser#opt_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_stmts(ExprGrammarFileParser.Opt_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprGrammarFileParser#stm_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStm_list(ExprGrammarFileParser.Stm_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(ExprGrammarFileParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ExprGrammarFileParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(ExprGrammarFileParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(ExprGrammarFileParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mod}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(ExprGrammarFileParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(ExprGrammarFileParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ExprGrammarFileParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprGrammarFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(ExprGrammarFileParser.IntContext ctx);
}