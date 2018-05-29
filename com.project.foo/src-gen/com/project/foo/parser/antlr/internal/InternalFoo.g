/*
 * generated by Xtext 2.13.0
 */
grammar InternalFoo;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.project.foo.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.project.foo.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.project.foo.services.FooGrammarAccess;

}

@parser::members {

 	private FooGrammarAccess grammarAccess;

    public InternalFooParser(TokenStream input, FooGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "DomainModel";
   	}

   	@Override
   	protected FooGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDomainModel
entryRuleDomainModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDomainModelRule()); }
	iv_ruleDomainModel=ruleDomainModel
	{ $current=$iv_ruleDomainModel.current; }
	EOF;

// Rule DomainModel
ruleDomainModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getDomainModelAccess().getModelModelParserRuleCall_0());
			}
			lv_model_0_0=ruleModel
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getDomainModelRule());
				}
				set(
					$current,
					"model",
					lv_model_0_0,
					"com.project.foo.Foo.Model");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='package'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"com.project.foo.Foo.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0());
				}
				lv_imports_3_0=ruleImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"imports",
						lv_imports_3_0,
						"com.project.foo.Foo.Import");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_4_0());
				}
				lv_components_4_0=ruleComponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"components",
						lv_components_4_0,
						"com.project.foo.Foo.Component");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getAssemblyAssemblyParserRuleCall_5_0());
				}
				lv_assembly_5_0=ruleAssembly
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"assembly",
						lv_assembly_5_0,
						"com.project.foo.Foo.Assembly");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
				}
				lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_1_0,
						"com.project.foo.Foo.QualifiedNameWithWildcard");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); }
	iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard
	{ $current=$iv_ruleQualifiedNameWithWildcard.current.getText(); }
	EOF;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
		}
		this_QualifiedName_0=ruleQualifiedName
		{
			$current.merge(this_QualifiedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='.*'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleAssembly
entryRuleAssembly returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssemblyRule()); }
	iv_ruleAssembly=ruleAssembly
	{ $current=$iv_ruleAssembly.current; }
	EOF;

// Rule Assembly
ruleAssembly returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAssemblyAccess().getAssemblyAction_0(),
					$current);
			}
		)
		otherlv_1='Assembly'
		{
			newLeafNode(otherlv_1, grammarAccess.getAssemblyAccess().getAssemblyKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getAssemblyAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssemblyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='components'
		{
			newLeafNode(otherlv_4, grammarAccess.getAssemblyAccess().getComponentsKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssemblyAccess().getAttributesComponentInstanceParserRuleCall_5_0());
				}
				lv_attributes_5_0=ruleComponentInstance
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssemblyRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_5_0,
						"com.project.foo.Foo.ComponentInstance");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAssemblyAccess().getAttributesComponentInstanceParserRuleCall_6_0());
				}
				lv_attributes_6_0=ruleComponentInstance
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssemblyRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_6_0,
						"com.project.foo.Foo.ComponentInstance");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_7='bindings'
		{
			newLeafNode(otherlv_7, grammarAccess.getAssemblyAccess().getBindingsKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssemblyAccess().getBindingsBindingParserRuleCall_8_0());
				}
				lv_bindings_8_0=ruleBinding
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssemblyRule());
					}
					add(
						$current,
						"bindings",
						lv_bindings_8_0,
						"com.project.foo.Foo.Binding");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleComponentInstance
entryRuleComponentInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentInstanceRule()); }
	iv_ruleComponentInstance=ruleComponentInstance
	{ $current=$iv_ruleComponentInstance.current; }
	EOF;

// Rule ComponentInstance
ruleComponentInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentInstanceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getComponentInstanceAccess().getColonKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentInstanceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getComponentInstanceAccess().getComponentComponentCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBinding
entryRuleBinding returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBindingRule()); }
	iv_ruleBinding=ruleBinding
	{ $current=$iv_ruleBinding.current; }
	EOF;

// Rule Binding
ruleBinding returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBindingAccess().getBindingRequiredBindingRequiredParserRuleCall_0_0());
				}
				lv_bindingRequired_0_0=ruleBindingRequired
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBindingRule());
					}
					set(
						$current,
						"bindingRequired",
						lv_bindingRequired_0_0,
						"com.project.foo.Foo.BindingRequired");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='-'
		{
			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getHyphenMinusKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBindingAccess().getBindingProvidedBindingProvidedParserRuleCall_2_0());
				}
				lv_bindingProvided_2_0=ruleBindingProvided
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBindingRule());
					}
					set(
						$current,
						"bindingProvided",
						lv_bindingProvided_2_0,
						"com.project.foo.Foo.BindingProvided");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBindingRequired
entryRuleBindingRequired returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBindingRequiredRule()); }
	iv_ruleBindingRequired=ruleBindingRequired
	{ $current=$iv_ruleBindingRequired.current; }
	EOF;

// Rule BindingRequired
ruleBindingRequired returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindingRequiredRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getBindingRequiredAccess().getNameComponentInstanceCrossReference_0_0());
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getBindingRequiredAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindingRequiredRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getBindingRequiredAccess().getServiceRSignatureCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBindingProvided
entryRuleBindingProvided returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBindingProvidedRule()); }
	iv_ruleBindingProvided=ruleBindingProvided
	{ $current=$iv_ruleBindingProvided.current; }
	EOF;

// Rule BindingProvided
ruleBindingProvided returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindingProvidedRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getBindingProvidedAccess().getNameComponentInstanceCrossReference_0_0());
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getBindingProvidedAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindingProvidedRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getBindingProvidedAccess().getServicePSignatureCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	iv_ruleComponent=ruleComponent
	{ $current=$iv_ruleComponent.current; }
	EOF;

// Rule Component
ruleComponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Component'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='refines'
			{
				newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getRefinesKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getComponentRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getComponentAccess().getRefinedComponentComponentCrossReference_2_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getListOfPServicesListOfProvidedServicesParserRuleCall_4_0());
				}
				lv_listOfPServices_5_0=ruleListOfProvidedServices
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					set(
						$current,
						"listOfPServices",
						lv_listOfPServices_5_0,
						"com.project.foo.Foo.ListOfProvidedServices");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getListOfRServicesListOfrequiredServicesParserRuleCall_5_0());
				}
				lv_listOfRServices_6_0=ruleListOfrequiredServices
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					set(
						$current,
						"listOfRServices",
						lv_listOfRServices_6_0,
						"com.project.foo.Foo.ListOfrequiredServices");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getMProvServicesMProvidedServiceParserRuleCall_6_0());
				}
				lv_mProvServices_7_0=ruleMProvidedService
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					add(
						$current,
						"mProvServices",
						lv_mProvServices_7_0,
						"com.project.foo.Foo.MProvidedService");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getMReqServicesMRequiredServiceParserRuleCall_7_0());
				}
				lv_mReqServices_8_0=ruleMRequiredService
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					add(
						$current,
						"mReqServices",
						lv_mReqServices_8_0,
						"com.project.foo.Foo.MRequiredService");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getAssemblyAssemblyParserRuleCall_8_0());
				}
				lv_assembly_9_0=ruleAssembly
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					add(
						$current,
						"assembly",
						lv_assembly_9_0,
						"com.project.foo.Foo.Assembly");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleListOfProvidedServices
entryRuleListOfProvidedServices returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListOfProvidedServicesRule()); }
	iv_ruleListOfProvidedServices=ruleListOfProvidedServices
	{ $current=$iv_ruleListOfProvidedServices.current; }
	EOF;

// Rule ListOfProvidedServices
ruleListOfProvidedServices returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='provided'
		{
			newLeafNode(otherlv_0, grammarAccess.getListOfProvidedServicesAccess().getProvidedKeyword_0());
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getListOfProvidedServicesAccess().getEqualsSignKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getListOfProvidedServicesAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_0_0());
					}
					lv_providedServices_3_0=ruleProvidedService
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getListOfProvidedServicesRule());
						}
						add(
							$current,
							"providedServices",
							lv_providedServices_3_0,
							"com.project.foo.Foo.ProvidedService");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getListOfProvidedServicesAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_1_1_0());
						}
						lv_providedServices_5_0=ruleProvidedService
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getListOfProvidedServicesRule());
							}
							add(
								$current,
								"providedServices",
								lv_providedServices_5_0,
								"com.project.foo.Foo.ProvidedService");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getListOfProvidedServicesAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleProvidedService
entryRuleProvidedService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProvidedServiceRule()); }
	iv_ruleProvidedService=ruleProvidedService
	{ $current=$iv_ruleProvidedService.current; }
	EOF;

// Rule ProvidedService
ruleProvidedService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getProvidedServiceRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getProvidedServiceAccess().getNamePSignatureCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleListOfrequiredServices
entryRuleListOfrequiredServices returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListOfrequiredServicesRule()); }
	iv_ruleListOfrequiredServices=ruleListOfrequiredServices
	{ $current=$iv_ruleListOfrequiredServices.current; }
	EOF;

// Rule ListOfrequiredServices
ruleListOfrequiredServices returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getListOfrequiredServicesAccess().getListOfrequiredServicesAction_0(),
					$current);
			}
		)
		otherlv_1='required'
		{
			newLeafNode(otherlv_1, grammarAccess.getListOfrequiredServicesAccess().getRequiredKeyword_1());
		}
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getListOfrequiredServicesAccess().getEqualsSignKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getListOfrequiredServicesAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_0_0());
					}
					lv_requiredServices_4_0=ruleRequiredService
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getListOfrequiredServicesRule());
						}
						add(
							$current,
							"requiredServices",
							lv_requiredServices_4_0,
							"com.project.foo.Foo.RequiredService");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getListOfrequiredServicesAccess().getCommaKeyword_4_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_1_1_0());
						}
						lv_requiredServices_6_0=ruleRequiredService
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getListOfrequiredServicesRule());
							}
							add(
								$current,
								"requiredServices",
								lv_requiredServices_6_0,
								"com.project.foo.Foo.RequiredService");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getListOfrequiredServicesAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleRequiredService
entryRuleRequiredService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequiredServiceRule()); }
	iv_ruleRequiredService=ruleRequiredService
	{ $current=$iv_ruleRequiredService.current; }
	EOF;

// Rule RequiredService
ruleRequiredService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getRequiredServiceRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getRequiredServiceAccess().getNameRSignatureCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleMProvidedService
entryRuleMProvidedService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMProvidedServiceRule()); }
	iv_ruleMProvidedService=ruleMProvidedService
	{ $current=$iv_ruleMProvidedService.current; }
	EOF;

// Rule MProvidedService
ruleMProvidedService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='service'
		{
			newLeafNode(otherlv_0, grammarAccess.getMProvidedServiceAccess().getServiceKeyword_0());
		}
		otherlv_1='provided'
		{
			newLeafNode(otherlv_1, grammarAccess.getMProvidedServiceAccess().getProvidedKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMProvidedServiceAccess().getSignaturePSignatureParserRuleCall_2_0());
				}
				lv_signature_2_0=rulePSignature
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMProvidedServiceRule());
					}
					set(
						$current,
						"signature",
						lv_signature_2_0,
						"com.project.foo.Foo.PSignature");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getMProvidedServiceAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getMProvidedServiceAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRulePSignature
entryRulePSignature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPSignatureRule()); }
	iv_rulePSignature=rulePSignature
	{ $current=$iv_rulePSignature.current; }
	EOF;

// Rule PSignature
rulePSignature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0=RULE_ID
				{
					newLeafNode(lv_type_0_0, grammarAccess.getPSignatureAccess().getTypeIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPSignatureRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPSignatureAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPSignatureRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getPSignatureAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_3_0());
				}
				lv_parameters_3_0=ruleParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPSignatureRule());
					}
					add(
						$current,
						"parameters",
						lv_parameters_3_0,
						"com.project.foo.Foo.Parameter");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getPSignatureAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_4_1_0());
					}
					lv_parameters_5_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPSignatureRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_5_0,
							"com.project.foo.Foo.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getPSignatureAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleMRequiredService
entryRuleMRequiredService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMRequiredServiceRule()); }
	iv_ruleMRequiredService=ruleMRequiredService
	{ $current=$iv_ruleMRequiredService.current; }
	EOF;

// Rule MRequiredService
ruleMRequiredService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='service'
		{
			newLeafNode(otherlv_0, grammarAccess.getMRequiredServiceAccess().getServiceKeyword_0());
		}
		otherlv_1='required'
		{
			newLeafNode(otherlv_1, grammarAccess.getMRequiredServiceAccess().getRequiredKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMRequiredServiceAccess().getSignatureRSignatureParserRuleCall_2_0());
				}
				lv_signature_2_0=ruleRSignature
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMRequiredServiceRule());
					}
					set(
						$current,
						"signature",
						lv_signature_2_0,
						"com.project.foo.Foo.RSignature");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getMRequiredServiceAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleRSignature
entryRuleRSignature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRSignatureRule()); }
	iv_ruleRSignature=ruleRSignature
	{ $current=$iv_ruleRSignature.current; }
	EOF;

// Rule RSignature
ruleRSignature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0=RULE_ID
				{
					newLeafNode(lv_type_0_0, grammarAccess.getRSignatureAccess().getTypeIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRSignatureRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRSignatureAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRSignatureRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getRSignatureAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_3_0());
				}
				lv_parameters_3_0=ruleParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRSignatureRule());
					}
					add(
						$current,
						"parameters",
						lv_parameters_3_0,
						"com.project.foo.Foo.Parameter");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getRSignatureAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_4_1_0());
					}
					lv_parameters_5_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRSignatureRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_5_0,
							"com.project.foo.Foo.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getRSignatureAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
		}
		(
			(
				lv_type_2_0=RULE_ID
				{
					newLeafNode(lv_type_2_0, grammarAccess.getParameterAccess().getTypeIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
