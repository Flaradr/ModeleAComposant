/*
 * generated by Xtext 2.13.0
 */
package com.project.foo.serializer;

import com.google.inject.Inject;
import com.project.foo.foo.Assembly;
import com.project.foo.foo.Binding;
import com.project.foo.foo.BindingProvided;
import com.project.foo.foo.BindingRequiered;
import com.project.foo.foo.Component;
import com.project.foo.foo.ComponentInstance;
import com.project.foo.foo.DomainModel;
import com.project.foo.foo.FooPackage;
import com.project.foo.foo.Import;
import com.project.foo.foo.ListOfProvidedServices;
import com.project.foo.foo.ListOfRequieredServices;
import com.project.foo.foo.MProvidedService;
import com.project.foo.foo.MRequieredService;
import com.project.foo.foo.Model;
import com.project.foo.foo.PSignature;
import com.project.foo.foo.ProvidedService;
import com.project.foo.foo.RSignature;
import com.project.foo.foo.RequieredService;
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
			case FooPackage.BINDING_REQUIERED:
				sequence_BindingRequiered(context, (BindingRequiered) semanticObject); 
				return; 
			case FooPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case FooPackage.COMPONENT_INSTANCE:
				sequence_ComponentInstance(context, (ComponentInstance) semanticObject); 
				return; 
			case FooPackage.DOMAIN_MODEL:
				sequence_DomainModel(context, (DomainModel) semanticObject); 
				return; 
			case FooPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case FooPackage.LIST_OF_PROVIDED_SERVICES:
				sequence_ListOfProvidedServices(context, (ListOfProvidedServices) semanticObject); 
				return; 
			case FooPackage.LIST_OF_REQUIERED_SERVICES:
				sequence_ListOfRequieredServices(context, (ListOfRequieredServices) semanticObject); 
				return; 
			case FooPackage.MPROVIDED_SERVICE:
				sequence_MProvidedService(context, (MProvidedService) semanticObject); 
				return; 
			case FooPackage.MREQUIERED_SERVICE:
				sequence_MRequieredService(context, (MRequieredService) semanticObject); 
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
			case FooPackage.REQUIERED_SERVICE:
				sequence_RequieredService(context, (RequieredService) semanticObject); 
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
	 *     (name=[ComponentInstance|ID] service=[ProvidedService|ID])
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
		feeder.accept(grammarAccess.getBindingProvidedAccess().getServiceProvidedServiceIDTerminalRuleCall_2_0_1(), semanticObject.eGet(FooPackage.Literals.BINDING_PROVIDED__SERVICE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BindingRequiered returns BindingRequiered
	 *
	 * Constraint:
	 *     (name=[ComponentInstance|ID] service=[RequieredService|ID])
	 */
	protected void sequence_BindingRequiered(ISerializationContext context, BindingRequiered semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.BINDING_REQUIERED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.BINDING_REQUIERED__NAME));
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.BINDING_REQUIERED__SERVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.BINDING_REQUIERED__SERVICE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBindingRequieredAccess().getNameComponentInstanceIDTerminalRuleCall_0_0_1(), semanticObject.eGet(FooPackage.Literals.BINDING_REQUIERED__NAME, false));
		feeder.accept(grammarAccess.getBindingRequieredAccess().getServiceRequieredServiceIDTerminalRuleCall_2_0_1(), semanticObject.eGet(FooPackage.Literals.BINDING_REQUIERED__SERVICE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Binding returns Binding
	 *
	 * Constraint:
	 *     (mG=BindingRequiered mD=BindingProvided)
	 */
	protected void sequence_Binding(ISerializationContext context, Binding semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.BINDING__MG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.BINDING__MG));
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.BINDING__MD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.BINDING__MD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBindingAccess().getMGBindingRequieredParserRuleCall_0_0(), semanticObject.getMG());
		feeder.accept(grammarAccess.getBindingAccess().getMDBindingProvidedParserRuleCall_2_0(), semanticObject.getMD());
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
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         listOfPServices=ListOfProvidedServices 
	 *         listOfRServices=ListOfRequieredServices 
	 *         mProvServices+=MProvidedService+ 
	 *         mReqServices+=MRequieredService*
	 *     )
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomainModel returns DomainModel
	 *
	 * Constraint:
	 *     model+=Model+
	 */
	protected void sequence_DomainModel(ISerializationContext context, DomainModel semanticObject) {
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
	 *     ListOfRequieredServices returns ListOfRequieredServices
	 *
	 * Constraint:
	 *     (requieredServices+=RequieredService? requieredServices+=RequieredService*)
	 */
	protected void sequence_ListOfRequieredServices(ISerializationContext context, ListOfRequieredServices semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MProvidedService returns MProvidedService
	 *
	 * Constraint:
	 *     signature=PSignature
	 */
	protected void sequence_MProvidedService(ISerializationContext context, MProvidedService semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.MPROVIDED_SERVICE__SIGNATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.MPROVIDED_SERVICE__SIGNATURE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMProvidedServiceAccess().getSignaturePSignatureParserRuleCall_2_0(), semanticObject.getSignature());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MRequieredService returns MRequieredService
	 *
	 * Constraint:
	 *     signature=RSignature
	 */
	protected void sequence_MRequieredService(ISerializationContext context, MRequieredService semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.MREQUIERED_SERVICE__SIGNATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.MREQUIERED_SERVICE__SIGNATURE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMRequieredServiceAccess().getSignatureRSignatureParserRuleCall_2_0(), semanticObject.getSignature());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=QualifiedName imports+=Import* component+=Component* assembly+=Assembly*)
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
	 *     RequieredService returns RequieredService
	 *
	 * Constraint:
	 *     name=[RSignature|ID]
	 */
	protected void sequence_RequieredService(ISerializationContext context, RequieredService semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FooPackage.Literals.REQUIERED_SERVICE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.REQUIERED_SERVICE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequieredServiceAccess().getNameRSignatureIDTerminalRuleCall_0_1(), semanticObject.eGet(FooPackage.Literals.REQUIERED_SERVICE__NAME, false));
		feeder.finish();
	}
	
	
}
