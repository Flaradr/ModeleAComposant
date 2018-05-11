/*
 * generated by Xtext 2.13.0
 */
package com.project.foo.validation

import com.project.foo.foo.Assembly
import com.project.foo.foo.Attribute
import com.project.foo.foo.Binding
import com.project.foo.foo.Component
import com.project.foo.foo.ComponentInstance
import com.project.foo.foo.FooPackage
import com.project.foo.foo.MProvidedService
import com.project.foo.foo.MRequieredService
import com.project.foo.foo.ProvidedService
import com.project.foo.foo.RequieredService
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.validation.Check
import com.project.foo.foo.BindingProvided
import com.project.foo.foo.BindingRequiered

/**
 * This class contains custom validation rules.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class FooValidator extends AbstractFooValidator {

	public static val CHECK_C_NAME_START_W_CAPITAL = "com.projet.foo.foo.checkComponentNameStartsWithCapital"
	public static val CHECK_A_NAME_START_W_CAPITAL = "com.projet.foo.foo.checkAssemblyNameStartsWithCapital"

	public static val CHECK_COMPONENT_NAME_IS_UNIQUE = "com.project.foo.foo.CheckComponentNameIsUnique"
	public static val CHECK_ASSEMBLY_NAME_IS_UNIQUE = "com.project.foo.foo.CheckAssemblyNameIsUnique"
	public static val CHECK_COMPONENT_ATTRIBUTE_NAME_IS_UNIQUE = "com.project.foo.foo.ChecKComponentAttributeNameIsUnique"
	public static val CHECK_P_SERVICE_NAME_IS_UNIQUE = "com.project.foo.foo.CheckProvidedServiceNameIsUnique"
	public static val CHECK_R_SERVICE_NAME_IS_UNIQUE = "com.project.foo.foo.CheckRequieredServiceNameIsUnique"

	//public static val CHECK_LINK_L_OPERAND_BINDING = "com.project.foo.foo.CheckLinkLeftOperandBinding"
	public static val CHECK_BINDING_IS_VALID = "com.project.foo.foo.CheckBindingIsValid"
	public static val CHECK_BINDING_REQUIERED_CAN_USE_METHOD = "com.project.foo.foo.CheckBindingRequieredCanUseMethod"
	public static val CHECK_BINDING_PROVIDED_CAN_USE_METHOD = "com.project.foo.foo.CheckBindingProvidedCanUseMethod"
	
	public static val CHECK_P_SERVICE_HAS_METHOD = "com.projetc.foo.foo.CheckProvidedServiceHasMethod"
	public static val CHECK_R_SERVICE_HAS_METHOD = "com.project.foo.foo.CheckRequieredServiceHasMethod"
	public static val CHECK_ASSEMBLY_IS_VALID = "com.project.foo.foo.CheckAssemblyIsValid"
	public static val CHECK_IMPORT_IS_VALID = "com.project.foo.foo.CheckImportIsValid"

	@Check
	def void checkComponentNameStartsWithCapital(Component component) {
		if(!Character.isUpperCase(component.name.charAt(0))){
			warning("Name should start with a capital: '"+ component.name +"'",
				 	FooPackage.Literals.COMPONENT__NAME,
					CHECK_C_NAME_START_W_CAPITAL)
		}
	}

	@Check
	def void checkAssemblyNameStartsWithCapital(Assembly assembly){
		if(!Character.isUpperCase(assembly.name.charAt(0))){
			warning("Name should start with a capital: '"+assembly.name+"'",
					FooPackage.Literals.ASSEMBLY__NAME,
					CHECK_A_NAME_START_W_CAPITAL)
		}
	}

	 /*************************************************************
	 * 				       Check unicite nom				  	  *
	 **************************************************************/

	 /**
	  * Verifie qu'il n'y a pas plusieurs composant ayant le meme nom
	  * au sein d'un modele
	  */
	 @Check
	 def void checkComponentNameIsUnique(Component component){
		var tmp = EcoreUtil2.getNextSibling(component)
		while(tmp !== null){
			if (component.name.equals((tmp as Component).name)){
				error("The name of a component should be unique:'"+component.name+"'",
					  FooPackage.Literals.COMPONENT__NAME,
					  CHECK_COMPONENT_NAME_IS_UNIQUE)
			}
			tmp = EcoreUtil2.getNextSibling(tmp)
		}
	  }

	 /**
	  * Verifie qu'il n'y a pas plusieurs assemblage ayant le meme nom
	  * au sein d'un modele
	  */
	 @Check
	 def void checkAssemblyNameIsUnique(Assembly assembly){
	 	var tmp = EcoreUtil2.getNextSibling(assembly)
	 	while(tmp !== null){
			if(assembly.name.equals((tmp as Assembly).name)){
				error("The name of an assembly should be unique :'"+assembly.name+"'",
				      FooPackage.Literals.ASSEMBLY__NAME,
					  CHECK_ASSEMBLY_NAME_IS_UNIQUE)
			}
			tmp = EcoreUtil2.getNextSibling(tmp)
	 	}
	 }

	 /**
	  * Verifie qu'il n'y a pas plusieurs attributs d'un assemblage ayant le meme nom
	  * au sein d'un modele
	  */
	 @Check
	 def void checkComponentAttributeNameIsUnique(ComponentInstance ca){
	 	var tmp = EcoreUtil2.getNextSibling(ca)
	 	while(tmp !== null){
	 		if(ca.name.equals((tmp as ComponentInstance).name)){
	 			error("The name of a component attribute should be unique :'"+ca.name+"'",
	 				  FooPackage.Literals.COMPONENT_INSTANCE__NAME,
	 				  CHECK_COMPONENT_ATTRIBUTE_NAME_IS_UNIQUE)
	 		}
			tmp = EcoreUtil2.getNextSibling(tmp)
	 	}
	 }

	 /**
	  * Verifie qu'il n'y a pas plusieurs services pourvu ayant le meme nom
	  * au sein d'un composant
	  */
	 @Check
	 def void checkProvidedServiceNameIsUnique(ProvidedService ps){
	 	var tmp = EcoreUtil2.getNextSibling(ps)
	 	while(tmp !== null){
	 		if(ps.name.equals((tmp as ProvidedService).name)){
	 			error("The name of a provided service should be unique in a component: '"+ps.name +"'",
	 				  FooPackage.Literals.PROVIDED_SERVICE__NAME,
	 				  CHECK_P_SERVICE_NAME_IS_UNIQUE)
	 		}
	 		tmp = EcoreUtil2.getNextSibling(tmp)
	 	}
	 }

	 /**
	  * Verifie qu'il n'y a pas plusieurs services requis ayant le meme nom
	  * au sein d'un composant
	  */
	 @Check
	 def void checkRequieredServiceNameIsUnique(RequieredService rs){
	 	var tmp = EcoreUtil2.getNextSibling(rs)
	 	while(tmp !== null){
	 		if(rs.name.equals((tmp as RequieredService).name)){
	 			error("The name of a requiered service should be unique in a component: '"+rs.name+"'",
	 				FooPackage.Literals.REQUIERED_SERVICE__NAME,
	 				CHECK_R_SERVICE_NAME_IS_UNIQUE)
	 		}
	 		tmp = EcoreUtil2.getNextSibling(tmp)
	 	}
	 }


	 /*************************************************************
	 * 				     Check validite binging  			  	  *
	 **************************************************************/
	
	/**
	 * Verifie que l'instance d'un composant X demande un service requis par 
	 * le composant X et pas un autre 
	 */ 
	@Check
	def void checkBindingRequieredCanUseMethod(BindingRequiered bindingRequiered){
		val listOfComponent = (bindingRequiered.id.eContainer as Assembly).attributes
		var res = false
		var i = 0
		var String typeOfInstance
		while (i < listOfComponent.size() && !res){
			if (listOfComponent.get(i).name.equals(bindingRequiered.id.name)){
				res = true
				typeOfInstance = listOfComponent.get(i).composant.name
			}
			i++
		}
		
		val componentTypeOfService = (bindingRequiered.service.eContainer.eContainer as Component).name
		
		println("\nValue of bindingProvided : " + bindingRequiered.id.name + "." + bindingRequiered.service.name)
		println("Value of typeOfInstance : " + typeOfInstance)
		println("Value of componentTypeOfService : " + componentTypeOfService)
		
		if (!typeOfInstance.equals(componentTypeOfService)){
			error("This service is not requiered by the component",
				  FooPackage.Literals.BINDING_REQUIERED__SERVICE,
				  CHECK_BINDING_REQUIERED_CAN_USE_METHOD)
		}
	}
	
	/**
	 * Verifie que l'instance d'un composant X demande un service fourni par 
	 * le composant X et pas un autre 
	 */ 
	@Check
	def void checkBindingProvidedCanUseMethod(BindingProvided bindingProvided){
		val listOfComponent = (bindingProvided.id.eContainer as Assembly).attributes
		var res = false
		var i = 0
		var String typeOfInstance
		while (i < listOfComponent.size() && !res){
			if (listOfComponent.get(i).name.equals(bindingProvided.id.name)){
				res = true
				typeOfInstance = listOfComponent.get(i).composant.name
			}
			i++
		}
		val componentTypeOfService = (bindingProvided.service.eContainer.eContainer as Component).name
		
		println("\nValue of bindingProvided : " + bindingProvided.id.name + "." + bindingProvided.service.name)
		println("Value of typeOfInstance : " + typeOfInstance)
		println("Value of componentTypeOfService : " + componentTypeOfService)
		
		if (!typeOfInstance.equals(componentTypeOfService)){
			error("The type of the component and the component requiring this method are not the same",
				  FooPackage.Literals.BINDING_PROVIDED__SERVICE,
				  CHECK_BINDING_PROVIDED_CAN_USE_METHOD)
		}
	}
	
	/**
	 * Verifie qu'un binding est valide
	 * i.e. Pas d'erreur si la signature et le type de retour
	 *  d'un service fourni et d'un service requis sont identique
	 * @param binding en cours d'analyse
	 * @error <b>Return type of the provided service do not match the return type of the requiered service</b>
	 * if the signatures or the return type do not match
	 */
	@Check
	def void checkBindingIsValid(Binding binding){
		val nomMethodG = binding.getMG().service
		val nomMethodD = binding.getMD().service
		val listOfRequieredServices = (binding.getMG().service.eContainer().eContainer() as Component).MReqServices
		val listOfProvidedServices = (binding.getMD().service.eContainer().eContainer() as Component).MProvServices	
		
		/*println("\nValue of the binding : " + binding)
		println("Value of the bindingRequiered : " + binding.MG.id.name + "." + binding.MG.service.name)
		println("Value of the bindingProvided : " + binding.MD.id.name + "." + binding.MD.service.name)*/

		
		
		var String valRetMReq = ""
		var String valRetMProv = ""
		var EList<Attribute> signatureofRequieredMethod
		var EList<Attribute> signatureOfProvidedMethod

		for(MRequieredService foo : listOfRequieredServices){
			if (foo.signature.name.name.equals(nomMethodG.name)){
				valRetMReq = foo.signature.type
				signatureofRequieredMethod = foo.signature.attributes
			}
		}
		for(MProvidedService foo : listOfProvidedServices){
			if(foo.signature.name.name.equals(nomMethodD.name)){
				valRetMProv = foo.signature.type
				signatureOfProvidedMethod = foo.signature.attributes
			}
		}
		
		/*println("Value of valRetMReq : " + valRetMReq)
		println("Value of valRetMProv : " + valRetMProv)*/
		if (!valRetMReq.equals(valRetMProv)){
			error("Return type of the provided service do not match the return type of the requiered service",
				  FooPackage.Literals.BINDING__MD,
				  CHECK_BINDING_IS_VALID)
		}

		signatureEquals(signatureofRequieredMethod,signatureOfProvidedMethod)
	}

	/**
	 * V�rifie que les parametres des signatures de deux methodes sont dans le m�me ordre
	 * et que pour tout parametre a la position i dans les deux signature le type du parametre est identique
	 * @param signature1 : signature de la methode d'un service requis
	 * @param signature2 : signature de la methode d'un service pourvu
	 */
	def signatureEquals(EList<Attribute> signature1, EList<Attribute> signature2){
		if(!(signature1.size() == signature2.size())){
			error("Number of parameters between the requiered service and the provided service do not match",
				  FooPackage.Literals.BINDING__MD,
				  CHECK_BINDING_IS_VALID)
			return
		}
		var int i = 0
		var boolean res = true
		while (i < signature1.size() && res){
			if(!(signature1.get(i).type.equals(signature2.get(i).type))){
				error("The type of the parameters of the requiered service and the provided service do not match",
					  FooPackage.Literals.BINDING__MD,
					  CHECK_BINDING_IS_VALID)
			}
			i++
		}
	}

	/**
	 * Verifie qu'un service pourvu possede une methode qui lui est lie
	 * @param provS : service pourvu en cours d'analyse
	 */
	@Check
	def void checkProvidedServiceHasMethod(ProvidedService provS){
		val services = (provS.eContainer.eContainer as Component).MProvServices
		var int i = 0
		var boolean hasMethod = false
		while (i < services.size() && !hasMethod){
			if(services.get(i).signature.name.name.equals(provS.name)){
				hasMethod = true
			}
			i++
		}
		if(!hasMethod){
			error("The service needs a method declaration",
				  FooPackage.Literals.PROVIDED_SERVICE__NAME,
				  CHECK_P_SERVICE_HAS_METHOD)
		}
	}

	/**
	 * Verifie qu'un service requis possede une methode qui lui est lie
	 * @param reqS : service requis en cours d'analyse
	 */
	@Check
	def void checkRequieredServiceHasMethod(RequieredService reqS){
		val services = (reqS.eContainer.eContainer as Component).MReqServices
		var int i = 0
		var boolean hasMethod = false
		while (i < services.size() && !hasMethod){
			if(services.get(i).signature.name.name.equals(reqS.name)){
				hasMethod = true
			}
			i++
		}
		if(!hasMethod){
			error("The service needs a method declaration",
				  FooPackage.Literals.REQUIERED_SERVICE__NAME,
				  CHECK_R_SERVICE_HAS_METHOD)
		}
	}

	/**
	 * Verifie qu'un assemblage est correct
	 * i.e. Verifie que les services requis par l'ensemble des composants
	 * constituant l'assemblage sont li� � des services fournis dans la section
	 * bindings de l'assemblage
	 */
	@Check
	def void checkAssemblyIsCorrect(Assembly assembly){
		var listeComposants = assembly.attributes
		for (ComponentInstance component : listeComposants){
		//Recupere liste des composants dans l'assemblage
			var listeServicesRequis = (component.composant as Component).listOfRServices.requieredServices
			for(RequieredService service : listeServicesRequis){
			//Liste des services requis dans un composant
				var listeBindings = assembly.bindings
			 	if(listeBindings.isEmpty() && !listeServicesRequis.isEmpty()){
					error("The assembly is not correct, there are missing bindings",
						  FooPackage.Literals.ASSEMBLY__NAME,
						  CHECK_ASSEMBLY_IS_VALID)
					return
				}
				for(Binding binding : listeBindings){
				//Liste des bindings dans l'assemblage
					var int i = 0
					var boolean isPresent = false
					while (i < listeBindings.size() && !isPresent){
						if(service.name.equals(listeBindings.get(i).MG.service.name) && //Comparaison de la m�thode requise par l'instance du composant en cours et celle du binding
						//   component.name.equals(listeBindings.get(i).MG.id.name)	//Comparaison du nom de l'instance composant en cours et du nom du composant dans le binding
							component.name.equals(listeBindings.get(i).MG.id.name)
						){
							isPresent = true
						}
						i++
					}
					if (!isPresent){
						error("The assembly is not correct, there are missing bindings",
							  FooPackage.Literals.ASSEMBLY__NAME,
							  CHECK_ASSEMBLY_IS_VALID)
					}
				}
			}
		}
	}
}
