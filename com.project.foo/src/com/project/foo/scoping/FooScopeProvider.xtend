/*
 * generated by Xtext 2.13.0
 */
package com.project.foo.scoping

import com.project.foo.foo.BindingProvided
import com.project.foo.foo.BindingRequiered
import com.project.foo.foo.DomainModel
import com.project.foo.foo.FooPackage
import com.project.foo.foo.Import
import com.project.foo.foo.Model
import com.project.foo.foo.PSignature
import com.project.foo.foo.RSignature
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider
import org.eclipse.xtext.scoping.impl.SimpleScope

/**
 * This class contains custom scoping description.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */

class FooScopeProvider extends ImportedNamespaceAwareLocalScopeProvider{
	
/*
	override IScope getScope(EObject context, EReference reference){

		if (context instanceof BindingRequiered && reference == FooPackage.Literals.BINDING_REQUIERED__SERVICE){
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement,RSignature)
			val assembly = (EcoreUtil2.getRootContainer(context) as DomainModel).model.assembly
		//	return Scopes.scopeFor(candidates)
 		}

 		if (context instanceof BindingProvided && reference == FooPackage.Literals.BINDING_PROVIDED__SERVICE){
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement,PSignature)
	//		return Scopes.scopeFor(candidates)
 		}
	
 		return super.getScope(context, reference);
	}
	
	override protected getImportedNamespace (EObject object){
		if (object instanceof Import){
			return (object as Import).importedNamespace
		} else {
			return super.getImportedNamespace(object)
		}
	}
	
	*/
	/*
	 *Permet d'auto importer le paquet auquel le modele en cours d'analyse appartient 
	 */
	override protected List<ImportNormalizer> getImportedNamespaceResolvers(EObject context, boolean ignorecase){
		var List<ImportNormalizer> importedNamespaceResolvers = super.getImportedNamespaceResolvers(context, ignorecase);
		if (context instanceof Model){
			var model = (context as Model)
			println("\nANALYSE MODELE : " + model.name)
			importedNamespaceResolvers.add(doCreateImportNormalizer(getQualifiedNameConverter().toQualifiedName(model.getName()), true, ignorecase))
		
			for (var i = 0; i < model.components.size(); i++){
				importedNamespaceResolvers.add(doCreateImportNormalizer(getQualifiedNameConverter().toQualifiedName(model.name+"."+model.components.get(i).name), true, ignorecase))
			}
			
			for (var j = 0; j < model.imports.size(); j++){
				println(doCreateImportNormalizer(getQualifiedNameConverter().toQualifiedName(model.imports.get(j).importedNamespace), true, ignorecase))
				importedNamespaceResolvers.add(doCreateImportNormalizer(getQualifiedNameConverter().toQualifiedName(model.imports.get(j).importedNamespace), true, ignorecase))
				
			}
		}
		return importedNamespaceResolvers;
	}	
	
	/*
	override IScope getLocalElementsScope(IScope scope, EObject context, EReference reference){
		if (scope instanceof ImportScope){
			var Model model = EcoreUtil2.getContainerOfType(context, Model)
			if (model !== null){
				var QualifiedName qname = qualifiedNameProvider.getFullyQualifiedName(model)
				if (qname !== null){
					var ImportNormalizer importNormalizer = new ImportNormalizer(qname,true,true)
					var scope2 = new ImportScope(
						Collections.singletonList(importNormalizer),scope,null,reference.eClass(),false)
					return scope2
				}
			}
		}
		
		return scope
	}*/
}