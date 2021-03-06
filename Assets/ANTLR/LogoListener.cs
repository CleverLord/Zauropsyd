//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.10.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from Logo.g4 by ANTLR 4.10.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="LogoParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.10.1")]
[System.CLSCompliant(false)]
public interface ILogoListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.int_type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInt_type([NotNull] LogoParser.Int_typeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.int_type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInt_type([NotNull] LogoParser.Int_typeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.float_type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFloat_type([NotNull] LogoParser.Float_typeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.float_type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFloat_type([NotNull] LogoParser.Float_typeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.string_type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterString_type([NotNull] LogoParser.String_typeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.string_type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitString_type([NotNull] LogoParser.String_typeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.identifier"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIdentifier([NotNull] LogoParser.IdentifierContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.identifier"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIdentifier([NotNull] LogoParser.IdentifierContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.operand"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOperand([NotNull] LogoParser.OperandContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.operand"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOperand([NotNull] LogoParser.OperandContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.comparator_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterComparator_gen([NotNull] LogoParser.Comparator_genContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.comparator_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitComparator_gen([NotNull] LogoParser.Comparator_genContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.num_val"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNum_val([NotNull] LogoParser.Num_valContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.num_val"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNum_val([NotNull] LogoParser.Num_valContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.operation_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOperation_gen([NotNull] LogoParser.Operation_genContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.operation_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOperation_gen([NotNull] LogoParser.Operation_genContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.value_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterValue_gen([NotNull] LogoParser.Value_genContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.value_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitValue_gen([NotNull] LogoParser.Value_genContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.list_acc"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterList_acc([NotNull] LogoParser.List_accContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.list_acc"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitList_acc([NotNull] LogoParser.List_accContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.cond"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCond([NotNull] LogoParser.CondContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.cond"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCond([NotNull] LogoParser.CondContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.list_type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterList_type([NotNull] LogoParser.List_typeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.list_type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitList_type([NotNull] LogoParser.List_typeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.move_keyword"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMove_keyword([NotNull] LogoParser.Move_keywordContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.move_keyword"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMove_keyword([NotNull] LogoParser.Move_keywordContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.move_command"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMove_command([NotNull] LogoParser.Move_commandContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.move_command"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMove_command([NotNull] LogoParser.Move_commandContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.pen_command"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPen_command([NotNull] LogoParser.Pen_commandContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.pen_command"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPen_command([NotNull] LogoParser.Pen_commandContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.if_command"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIf_command([NotNull] LogoParser.If_commandContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.if_command"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIf_command([NotNull] LogoParser.If_commandContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.if_faker"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIf_faker([NotNull] LogoParser.If_fakerContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.if_faker"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIf_faker([NotNull] LogoParser.If_fakerContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.list_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterList_gen([NotNull] LogoParser.List_genContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.list_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitList_gen([NotNull] LogoParser.List_genContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.assignment_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAssignment_gen([NotNull] LogoParser.Assignment_genContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.assignment_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAssignment_gen([NotNull] LogoParser.Assignment_genContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.output_instruction_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOutput_instruction_gen([NotNull] LogoParser.Output_instruction_genContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.output_instruction_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOutput_instruction_gen([NotNull] LogoParser.Output_instruction_genContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.instruction_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInstruction_gen([NotNull] LogoParser.Instruction_genContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.instruction_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInstruction_gen([NotNull] LogoParser.Instruction_genContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.function_instr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFunction_instr([NotNull] LogoParser.Function_instrContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.function_instr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFunction_instr([NotNull] LogoParser.Function_instrContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.repeat_loop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterRepeat_loop([NotNull] LogoParser.Repeat_loopContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.repeat_loop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitRepeat_loop([NotNull] LogoParser.Repeat_loopContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.repeat_start"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterRepeat_start([NotNull] LogoParser.Repeat_startContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.repeat_start"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitRepeat_start([NotNull] LogoParser.Repeat_startContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.while_loop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWhile_loop([NotNull] LogoParser.While_loopContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.while_loop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWhile_loop([NotNull] LogoParser.While_loopContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.loop_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLoop_gen([NotNull] LogoParser.Loop_genContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.loop_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLoop_gen([NotNull] LogoParser.Loop_genContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.instructions_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInstructions_gen([NotNull] LogoParser.Instructions_genContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.instructions_gen"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInstructions_gen([NotNull] LogoParser.Instructions_genContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LogoParser.starter"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStarter([NotNull] LogoParser.StarterContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LogoParser.starter"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStarter([NotNull] LogoParser.StarterContext context);
}
