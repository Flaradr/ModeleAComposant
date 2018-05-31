/*
 * generated by Xtext 2.13.0
 */
package com.project.foo.serializer;

import com.google.inject.Inject;
import com.project.foo.foo.Assembly;
import com.project.foo.foo.Binding;
import com.project.foo.foo.BindingProvided;
import com.project.foo.foo.BindingRequired;
import com.project.foo.foo.Comparison;
import com.project.foo.foo.Component;
import com.project.foo.foo.ComponentInstance;
import com.project.foo.foo.Condition;
import com.project.foo.foo.DomainModel;
import com.project.foo.foo.FooPackage;
import com.project.foo.foo.If;
import com.project.foo.foo.Import;
import com.project.foo.foo.ListOfProvidedServices;
import com.project.foo.foo.ListOfrequiredServices;
import com.project.foo.foo.MProvidedService;
import com.project.foo.foo.MRequiredService;
import com.project.foo.foo.Model;
import com.project.foo.foo.PSignature;
import com.project.foo.foo.ProvidedService;
import com.project.foo.foo.RSignature;
import com.project.foo.foo.Refine;
import com.project.foo.foo.RequiredService;
import com.project.foo.foo.Str;
import com.project.foo.foo.While;
import com.project.foo.services.FooGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class FooSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FooGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FooPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FooPackage.ASSEMBLY:
				sequence_Assembly(context, (Assembly) semanticObject); 
				return; 
			case FooPackage.BINDING:
				sequence_Binding(context, (Binding) semanticObject); 
				return; 
			case FooPackage.BINDING_PROVIDED:
				sequence_BindingProvided(context, (BindingProvided) semanticObject); 
				return; 
			case FooPackage.BINDING_REQUIRED:
				sequence_BindingRequired(context, (BindingRequired) semanticObject); 
				return; 
			case FooPackage.COMPARISON:
				sequence_Comparison(context, (Comparison) semanticObject); 
				return; 
			case FooPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case FooPackage.COMPONENT_INSTANCE:
				sequence_ComponentInstance(context, (ComponentInstance) semanticObject); 
				return; 
			case FooPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case FooPackage.DOMAIN_MODEL:
				sequence_DomainModel(context, (DomainModel) semanticObject); 
				return; 
			case FooPackage.IF:
				sequence_If(context, (If) semanticObject); 
				return; 
			case FooPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case FooPackage.LIST_OF_PROVIDED_SERVICES:
				sequence_ListOfProvidedServices(context, (ListOfProvidedServices) semanticObject); 
				return; 
			case FooPackage.LIST_OFREQUIRED_SERVICES:
				sequence_ListOfrequiredServices(context, (ListOfrequiredServices) semanticObject); 
				return; 
			case FooPackage.MPROVIDED_SERVICE:
				sequence_MProvidedService(context, (MProvidedService) semanticObject); 
				return; 
			case FooPackage.MREQUIRED_SERVICE:
				sequence_MRequiredService(context, (MRequiredService) semanticObject); 
				return; 
			case FooPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case FooPackage.PSIGNATURE:
				sequence_PSignature(context, (PSignature) semanticObject); 
				return; 
			case FooPackage.PARAMETER:
				sequence_Parameter(context, (com.project.foo.foo.Parameter) semanticObject); 
				return; 
			case FooPackage.PROVIDED_SERVICE:
				sequence_ProvidedService(context, (ProvidedService) semanticObject); 
				return; 
			case FooPackage.RSIGNATURE:
				sequence_RSignature(context, (RSignature) semanticObject); 
				return; 
			case FooPackage.REFINE:
				sequence_Refine(context, (Refine) semanticObject); 
				return; 
			case FooPackage.REQUIRED_SERVICE:
				sequence_RequiredService(context, (RequiredService) semanticObject); 
				return; 
			case FooPackage.STR:
				sequence_Str(context, (Str) semanticObject); 
				return; 
			case FooPackage.WHILE:
				sequence_While(context, (While) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Assembly returns Assembly
	 *
	 * Constraint:
	 *     (name=ID attributes+=ComponentInstance attributes+=ComponentInstance+ bindings+=Binding*)
	 */
	protected void sequence_Assembly(ISerializationContext context, Assembly semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BindingProvided returns BindingProvided
	 *
	 * Constraint:
	 *     (name=[ComponentInstance|ID] service=[PSignature|QualifiedName])
	 */
	protected void sequence_BindingProvided(ISerializationContext context, BindingProvided semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.BINDING_PROVIDED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.BINDING_PROVIDED__NAME));
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.BINDING_PROVIDED__SERVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.BINDING_PROVIDED__SERVICE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBindingProvidedAccess().getNameComponentInstanceIDTerminalRuleCall_0_0_1(), semanticObject.eGet(FooPackage.Literals.BINDING_PROVIDED__NAME, false));
		feeder.accept(grammarAccess.getBindingProvidedAccess().getServicePSignatureQualifiedNameParserRuleCall_2_0_1(), semanticObject.eGet(FooPackage.Literals.BINDING_PROVIDED__SERVICE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BindingRequired returns BindingRequired
	 *
	 * Constraint:
	 *     (name=[ComponentInstance|ID] service=[RSignature|QualifiedName])
	 */
	protected void sequence_BindingRequired(ISerializationContext context, BindingRequired semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.BINDING_REQUIRED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.BINDING_REQUIRED__NAME));
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.BINDING_REQUIRED__SERVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.BINDING_REQUIRED__SERVICE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBindingRequiredAccess().getNameComponentInstanceIDTerminalRuleCall_0_0_1(), semanticObject.eGet(FooPackage.Literals.BINDING_REQUIRED__NAME, false));
		feeder.accept(grammarAccess.getBindingRequiredAccess().getServiceRSignatureQualifiedNameParserRuleCall_2_0_1(), semanticObject.eGet(FooPackage.Literals.BINDING_REQUIRED__SERVICE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Binding
	 *     Binding returns Binding
	 *
	 * Constraint:
	 *     (bindingRequired=BindingRequired bindingProvided=BindingProvided)
	 */
	protected void sequence_Binding(ISerializationContext context, Binding semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.BINDING__BINDING_REQUIRED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.BINDING__BINDING_REQUIRED));
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.BINDING__BINDING_PROVIDED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.BINDING__BINDING_PROVIDED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBindingAccess().getBindingRequiredBindingRequiredParserRuleCall_0_0(), semanticObject.getBindingRequired());
		feeder.accept(grammarAccess.getBindingAccess().getBindingProvidedBindingProvidedParserRuleCall_2_0(), semanticObject.getBindingProvided());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Comparison returns Comparison
	 *
	 * Constraint:
	 *     (leftMember=ID rightMember=ID)
	 */
	protected void sequence_Comparison(ISerializationContext context, Comparison semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.COMPARISON__LEFT_MEMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.COMPARISON__LEFT_MEMBER));
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.COMPARISON__RIGHT_MEMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.COMPARISON__RIGHT_MEMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparisonAccess().getLeftMemberIDTerminalRuleCall_0_0(), semanticObject.getLeftMember());
		feeder.accept(grammarAccess.getComparisonAccess().getRightMemberIDTerminalRuleCall_2_0(), semanticObject.getRightMember());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentInstance returns ComponentInstance
	 *
	 * Constraint:
	 *     (name=ID component=[Component|QualifiedName])
	 */
	protected void sequence_ComponentInstance(ISerializationContext context, ComponentInstance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.COMPONENT_INSTANCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.COMPONENT_INSTANCE__NAME));
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.COMPONENT_INSTANCE__COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.COMPONENT_INSTANCE__COMPONENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getComponentInstanceAccess().getComponentComponentQualifiedNameParserRuleCall_2_0_1(), semanticObject.eGet(FooPackage.Literals.COMPONENT_INSTANCE__COMPONENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Component
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         listOfPServices=ListOfProvidedServices 
	 *         listOfRServices=ListOfrequiredServices 
	 *         mProvServices+=MProvidedService+ 
	 *         mReqServices+=MRequiredService* 
	 *         assemblies+=[Assembly|QualifiedName]*
	 *     )
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     (conditions+=Comparison | conditions+=Str)+
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomainModel returns DomainModel
	 *
	 * Constraint:
	 *     model=Model
	 */
	protected void sequence_DomainModel(ISerializationContext context, DomainModel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.DOMAIN_MODEL__MODEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.DOMAIN_MODEL__MODEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDomainModelAccess().getModelModelParserRuleCall_0(), semanticObject.getModel());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns If
	 *     If returns If
	 *
	 * Constraint:
	 *     (
	 *         conditions+=Condition* 
	 *         conditions+=Condition 
	 *         (str+=Str | if+=If | while+=While)+ 
	 *         (else=If | (while+=While? ((str+=Str | if+=If)? while+=While?)*))?
	 *     )
	 */
	protected void sequence_If(ISerializationContext context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ListOfProvidedServices returns ListOfProvidedServices
	 *
	 * Constraint:
	 *     (providedServices+=ProvidedService providedServices+=ProvidedService*)
	 */
	protected void sequence_ListOfProvidedServices(ISerializationContext context, ListOfProvidedServices semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ListOfrequiredServices returns ListOfrequiredServices
	 *
	 * Constraint:
	 *     (requiredServices+=RequiredService? requiredServices+=RequiredService*)
	 */
	protected void sequence_ListOfrequiredServices(ISerializationContext context, ListOfrequiredServices semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MProvidedService returns MProvidedService
	 *
	 * Constraint:
	 *     (signature=PSignature expressions+=Expression+)
	 */
	protected void sequence_MProvidedService(ISerializationContext context, MProvidedService semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MRequiredService returns MRequiredService
	 *
	 * Constraint:
	 *     signature=RSignature
	 */
	protected void sequence_MRequiredService(ISerializationContext context, MRequiredService semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.MREQUIRED_SERVICE__SIGNATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.MREQUIRED_SERVICE__SIGNATURE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMRequiredServiceAccess().getSignatureRSignatureParserRuleCall_2_0(), semanticObject.getSignature());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=QualifiedName imports+=Import* components+=Component* assembly+=Assembly* refiningList+=Refine*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PSignature returns PSignature
	 *
	 * Constraint:
	 *     (type=ID name=ID parameters+=Parameter? parameters+=Parameter*)
	 */
	protected void sequence_PSignature(ISerializationContext context, PSignature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (name=ID type=ID)
	 */
	protected void sequence_Parameter(ISerializationContext context, com.project.foo.foo.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.PARAMETER__NAME));
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.PARAMETER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAccess().getTypeIDTerminalRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ProvidedService returns ProvidedService
	 *
	 * Constraint:
	 *     name=[PSignature|ID]
	 */
	protected void sequence_ProvidedService(ISerializationContext context, ProvidedService semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.PROVIDED_SERVICE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.PROVIDED_SERVICE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProvidedServiceAccess().getNamePSignatureIDTerminalRuleCall_0_1(), semanticObject.eGet(FooPackage.Literals.PROVIDED_SERVICE__NAME, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RSignature returns RSignature
	 *
	 * Constraint:
	 *     (type=ID name=ID parameters+=Parameter? parameters+=Parameter*)
	 */
	protected void sequence_RSignature(ISerializationContext context, RSignature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Refine returns Refine
	 *
	 * Constraint:
	 *     (eltToRefine=[Element|ID] refiningElt=[Element|ID])
	 */
	protected void sequence_Refine(ISerializationContext context, Refine semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.REFINE__ELT_TO_REFINE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.REFINE__ELT_TO_REFINE));
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.REFINE__REFINING_ELT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.REFINE__REFINING_ELT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRefineAccess().getEltToRefineElementIDTerminalRuleCall_1_0_1(), semanticObject.eGet(FooPackage.Literals.REFINE__ELT_TO_REFINE, false));
		feeder.accept(grammarAccess.getRefineAccess().getRefiningEltElementIDTerminalRuleCall_3_0_1(), semanticObject.eGet(FooPackage.Literals.REFINE__REFINING_ELT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RequiredService returns RequiredService
	 *
	 * Constraint:
	 *     name=[RSignature|ID]
	 */
	protected void sequence_RequiredService(ISerializationContext context, RequiredService semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.REQUIRED_SERVICE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.REQUIRED_SERVICE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequiredServiceAccess().getNameRSignatureIDTerminalRuleCall_0_1(), semanticObject.eGet(FooPackage.Literals.REQUIRED_SERVICE__NAME, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Str
	 *     Str returns Str
	 *
	 * Constraint:
	 *     (value+=ID (value+=ID value+=ID?)*)
	 */
	protected void sequence_Str(ISerializationContext context, Str semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns While
	 *     While returns While
	 *
	 * Constraint:
	 *     (conditions+=Condition* conditions+=Condition (str+=Str | if+=If | while+=While)+)
	 */
	protected void sequence_While(ISerializationContext context, While semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
