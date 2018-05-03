/*
 * generated by Xtext 2.13.0
 */
package com.project.foo.scoping

import com.project.foo.foo.BindingProvided
import com.project.foo.foo.BindingRequiered
import com.project.foo.foo.FooPackage
import com.project.foo.foo.ProvidedService
import com.project.foo.foo.RequieredService
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import com.project.foo.foo.ComponentAttribute
import com.project.foo.foo.Component

/**
 * This class contains custom scoping description.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class FooScopeProvider extends AbstractFooScopeProvider {

@Override
def 
 	//Modification scope des bindings cote requis et fournis, li� � l'ensemble d'un mod�le
 	//et pas d�fini au sein de l'assemblage
 	override IScope getScope(EObject context, EReference reference){
		/* 
		if (context instanceof ComponentAttribute && reference == FooPackage.Literals.COMPONENT_ATTRIBUTE__TYPE){
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement,Component)
			return Scopes.scopeFor(candidates)
		}
		if (context instanceof BindingRequiered && reference == FooPackage.Literals.BINDING_REQUIERED__TYPE){
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement,RequieredService)
			return Scopes.scopeFor(candidates)
 		}
 		if (context instanceof BindingProvided && reference == FooPackage.Literals.BINDING_PROVIDED__TYPE){
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement,ProvidedService)
			return Scopes.scopeFor(candidates)
 		}
 		* */
 		return super.getScope(context, reference);
	}
}
