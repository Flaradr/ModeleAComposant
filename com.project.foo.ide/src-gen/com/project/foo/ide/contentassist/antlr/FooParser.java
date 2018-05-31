/*
 * generated by Xtext 2.13.0
 */
package com.project.foo.ide.contentassist.antlr;

import com.google.inject.Inject;
import com.project.foo.ide.contentassist.antlr.internal.InternalFooParser;
import com.project.foo.services.FooGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class FooParser extends AbstractContentAssistParser {

	@Inject
	private FooGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFooParser createParser() {
		InternalFooParser result = new InternalFooParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getIfAccess().getAlternatives_2_1(), "rule__If__Alternatives_2_1");
					put(grammarAccess.getIfAccess().getAlternatives_6(), "rule__If__Alternatives_6");
					put(grammarAccess.getIfAccess().getAlternatives_8_1(), "rule__If__Alternatives_8_1");
					put(grammarAccess.getIfAccess().getAlternatives_8_1_1_1(), "rule__If__Alternatives_8_1_1_1");
					put(grammarAccess.getWhileAccess().getAlternatives_2_1(), "rule__While__Alternatives_2_1");
					put(grammarAccess.getWhileAccess().getAlternatives_6(), "rule__While__Alternatives_6");
					put(grammarAccess.getConditionAccess().getAlternatives_1(), "rule__Condition__Alternatives_1");
					put(grammarAccess.getComparisonAccess().getAlternatives_1(), "rule__Comparison__Alternatives_1");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getRefineAccess().getGroup(), "rule__Refine__Group__0");
					put(grammarAccess.getAssemblyAccess().getGroup(), "rule__Assembly__Group__0");
					put(grammarAccess.getComponentInstanceAccess().getGroup(), "rule__ComponentInstance__Group__0");
					put(grammarAccess.getBindingAccess().getGroup(), "rule__Binding__Group__0");
					put(grammarAccess.getBindingRequiredAccess().getGroup(), "rule__BindingRequired__Group__0");
					put(grammarAccess.getBindingProvidedAccess().getGroup(), "rule__BindingProvided__Group__0");
					put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
					put(grammarAccess.getComponentAccess().getGroup_7(), "rule__Component__Group_7__0");
					put(grammarAccess.getComponentAccess().getGroup_7_0(), "rule__Component__Group_7_0__0");
					put(grammarAccess.getListOfProvidedServicesAccess().getGroup(), "rule__ListOfProvidedServices__Group__0");
					put(grammarAccess.getListOfProvidedServicesAccess().getGroup_3(), "rule__ListOfProvidedServices__Group_3__0");
					put(grammarAccess.getListOfProvidedServicesAccess().getGroup_3_1(), "rule__ListOfProvidedServices__Group_3_1__0");
					put(grammarAccess.getListOfrequiredServicesAccess().getGroup(), "rule__ListOfrequiredServices__Group__0");
					put(grammarAccess.getListOfrequiredServicesAccess().getGroup_4(), "rule__ListOfrequiredServices__Group_4__0");
					put(grammarAccess.getListOfrequiredServicesAccess().getGroup_4_1(), "rule__ListOfrequiredServices__Group_4_1__0");
					put(grammarAccess.getMProvidedServiceAccess().getGroup(), "rule__MProvidedService__Group__0");
					put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
					put(grammarAccess.getIfAccess().getGroup_2(), "rule__If__Group_2__0");
					put(grammarAccess.getIfAccess().getGroup_8(), "rule__If__Group_8__0");
					put(grammarAccess.getIfAccess().getGroup_8_1_1(), "rule__If__Group_8_1_1__0");
					put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
					put(grammarAccess.getWhileAccess().getGroup_2(), "rule__While__Group_2__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getStrAccess().getGroup(), "rule__Str__Group__0");
					put(grammarAccess.getStrAccess().getGroup_1(), "rule__Str__Group_1__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getPSignatureAccess().getGroup(), "rule__PSignature__Group__0");
					put(grammarAccess.getPSignatureAccess().getGroup_4(), "rule__PSignature__Group_4__0");
					put(grammarAccess.getMRequiredServiceAccess().getGroup(), "rule__MRequiredService__Group__0");
					put(grammarAccess.getRSignatureAccess().getGroup(), "rule__RSignature__Group__0");
					put(grammarAccess.getRSignatureAccess().getGroup_4(), "rule__RSignature__Group_4__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getDomainModelAccess().getModelAssignment(), "rule__DomainModel__ModelAssignment");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getImportsAssignment_3(), "rule__Model__ImportsAssignment_3");
					put(grammarAccess.getModelAccess().getComponentsAssignment_4(), "rule__Model__ComponentsAssignment_4");
					put(grammarAccess.getModelAccess().getAssemblyAssignment_5(), "rule__Model__AssemblyAssignment_5");
					put(grammarAccess.getModelAccess().getRefiningListAssignment_6(), "rule__Model__RefiningListAssignment_6");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getRefineAccess().getEltToRefineAssignment_1(), "rule__Refine__EltToRefineAssignment_1");
					put(grammarAccess.getRefineAccess().getRefiningEltAssignment_3(), "rule__Refine__RefiningEltAssignment_3");
					put(grammarAccess.getAssemblyAccess().getNameAssignment_2(), "rule__Assembly__NameAssignment_2");
					put(grammarAccess.getAssemblyAccess().getAttributesAssignment_5(), "rule__Assembly__AttributesAssignment_5");
					put(grammarAccess.getAssemblyAccess().getAttributesAssignment_6(), "rule__Assembly__AttributesAssignment_6");
					put(grammarAccess.getAssemblyAccess().getBindingsAssignment_8(), "rule__Assembly__BindingsAssignment_8");
					put(grammarAccess.getComponentInstanceAccess().getNameAssignment_0(), "rule__ComponentInstance__NameAssignment_0");
					put(grammarAccess.getComponentInstanceAccess().getComponentAssignment_2(), "rule__ComponentInstance__ComponentAssignment_2");
					put(grammarAccess.getBindingAccess().getBindingRequiredAssignment_0(), "rule__Binding__BindingRequiredAssignment_0");
					put(grammarAccess.getBindingAccess().getBindingProvidedAssignment_2(), "rule__Binding__BindingProvidedAssignment_2");
					put(grammarAccess.getBindingRequiredAccess().getNameAssignment_0(), "rule__BindingRequired__NameAssignment_0");
					put(grammarAccess.getBindingRequiredAccess().getServiceAssignment_2(), "rule__BindingRequired__ServiceAssignment_2");
					put(grammarAccess.getBindingProvidedAccess().getNameAssignment_0(), "rule__BindingProvided__NameAssignment_0");
					put(grammarAccess.getBindingProvidedAccess().getServiceAssignment_2(), "rule__BindingProvided__ServiceAssignment_2");
					put(grammarAccess.getComponentAccess().getNameAssignment_1(), "rule__Component__NameAssignment_1");
					put(grammarAccess.getComponentAccess().getListOfPServicesAssignment_3(), "rule__Component__ListOfPServicesAssignment_3");
					put(grammarAccess.getComponentAccess().getListOfRServicesAssignment_4(), "rule__Component__ListOfRServicesAssignment_4");
					put(grammarAccess.getComponentAccess().getMProvServicesAssignment_5(), "rule__Component__MProvServicesAssignment_5");
					put(grammarAccess.getComponentAccess().getMReqServicesAssignment_6(), "rule__Component__MReqServicesAssignment_6");
					put(grammarAccess.getComponentAccess().getAssembliesAssignment_7_1(), "rule__Component__AssembliesAssignment_7_1");
					put(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_0(), "rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0");
					put(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_1_1(), "rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1");
					put(grammarAccess.getProvidedServiceAccess().getNameAssignment(), "rule__ProvidedService__NameAssignment");
					put(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesAssignment_4_0(), "rule__ListOfrequiredServices__RequiredServicesAssignment_4_0");
					put(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesAssignment_4_1_1(), "rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1");
					put(grammarAccess.getRequiredServiceAccess().getNameAssignment(), "rule__RequiredService__NameAssignment");
					put(grammarAccess.getMProvidedServiceAccess().getSignatureAssignment_2(), "rule__MProvidedService__SignatureAssignment_2");
					put(grammarAccess.getMProvidedServiceAccess().getExpressionsAssignment_4(), "rule__MProvidedService__ExpressionsAssignment_4");
					put(grammarAccess.getIfAccess().getConditionsAssignment_2_0(), "rule__If__ConditionsAssignment_2_0");
					put(grammarAccess.getIfAccess().getConditionsAssignment_3(), "rule__If__ConditionsAssignment_3");
					put(grammarAccess.getIfAccess().getStrAssignment_6_0(), "rule__If__StrAssignment_6_0");
					put(grammarAccess.getIfAccess().getIfAssignment_6_1(), "rule__If__IfAssignment_6_1");
					put(grammarAccess.getIfAccess().getWhileAssignment_6_2(), "rule__If__WhileAssignment_6_2");
					put(grammarAccess.getIfAccess().getElseAssignment_8_1_0(), "rule__If__ElseAssignment_8_1_0");
					put(grammarAccess.getIfAccess().getStrAssignment_8_1_1_1_0(), "rule__If__StrAssignment_8_1_1_1_0");
					put(grammarAccess.getIfAccess().getIfAssignment_8_1_1_1_1(), "rule__If__IfAssignment_8_1_1_1_1");
					put(grammarAccess.getIfAccess().getWhileAssignment_8_1_1_1_2(), "rule__If__WhileAssignment_8_1_1_1_2");
					put(grammarAccess.getWhileAccess().getConditionsAssignment_2_0(), "rule__While__ConditionsAssignment_2_0");
					put(grammarAccess.getWhileAccess().getConditionsAssignment_3(), "rule__While__ConditionsAssignment_3");
					put(grammarAccess.getWhileAccess().getStrAssignment_6_0(), "rule__While__StrAssignment_6_0");
					put(grammarAccess.getWhileAccess().getIfAssignment_6_1(), "rule__While__IfAssignment_6_1");
					put(grammarAccess.getWhileAccess().getWhileAssignment_6_2(), "rule__While__WhileAssignment_6_2");
					put(grammarAccess.getConditionAccess().getConditionsAssignment_1_0(), "rule__Condition__ConditionsAssignment_1_0");
					put(grammarAccess.getConditionAccess().getConditionsAssignment_1_1(), "rule__Condition__ConditionsAssignment_1_1");
					put(grammarAccess.getStrAccess().getValueAssignment_0(), "rule__Str__ValueAssignment_0");
					put(grammarAccess.getStrAccess().getValueAssignment_1_1(), "rule__Str__ValueAssignment_1_1");
					put(grammarAccess.getStrAccess().getValueAssignment_1_3(), "rule__Str__ValueAssignment_1_3");
					put(grammarAccess.getComparisonAccess().getLeftMemberAssignment_0(), "rule__Comparison__LeftMemberAssignment_0");
					put(grammarAccess.getComparisonAccess().getRightMemberAssignment_2(), "rule__Comparison__RightMemberAssignment_2");
					put(grammarAccess.getPSignatureAccess().getTypeAssignment_0(), "rule__PSignature__TypeAssignment_0");
					put(grammarAccess.getPSignatureAccess().getNameAssignment_1(), "rule__PSignature__NameAssignment_1");
					put(grammarAccess.getPSignatureAccess().getParametersAssignment_3(), "rule__PSignature__ParametersAssignment_3");
					put(grammarAccess.getPSignatureAccess().getParametersAssignment_4_1(), "rule__PSignature__ParametersAssignment_4_1");
					put(grammarAccess.getMRequiredServiceAccess().getSignatureAssignment_2(), "rule__MRequiredService__SignatureAssignment_2");
					put(grammarAccess.getRSignatureAccess().getTypeAssignment_0(), "rule__RSignature__TypeAssignment_0");
					put(grammarAccess.getRSignatureAccess().getNameAssignment_1(), "rule__RSignature__NameAssignment_1");
					put(grammarAccess.getRSignatureAccess().getParametersAssignment_3(), "rule__RSignature__ParametersAssignment_3");
					put(grammarAccess.getRSignatureAccess().getParametersAssignment_4_1(), "rule__RSignature__ParametersAssignment_4_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
					put(grammarAccess.getParameterAccess().getTypeAssignment_2(), "rule__Parameter__TypeAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FooGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FooGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
