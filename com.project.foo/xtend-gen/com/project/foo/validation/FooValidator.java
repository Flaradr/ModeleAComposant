/**
 * generated by Xtext 2.13.0
 */
package com.project.foo.validation;

import com.project.foo.foo.Assembly;
import com.project.foo.foo.Binding;
import com.project.foo.foo.BindingProvided;
import com.project.foo.foo.BindingRequiered;
import com.project.foo.foo.Component;
import com.project.foo.foo.ComponentInstance;
import com.project.foo.foo.FooPackage;
import com.project.foo.foo.MProvidedService;
import com.project.foo.foo.MRequieredService;
import com.project.foo.foo.PSignature;
import com.project.foo.foo.Parameter;
import com.project.foo.foo.ProvidedService;
import com.project.foo.foo.RSignature;
import com.project.foo.foo.RequieredService;
import com.project.foo.validation.AbstractFooValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class FooValidator extends AbstractFooValidator {
  public final static String CHECK_C_NAME_START_W_CAPITAL = "com.projet.foo.foo.checkComponentNameStartsWithCapital";
  
  public final static String CHECK_A_NAME_START_W_CAPITAL = "com.projet.foo.foo.checkAssemblyNameStartsWithCapital";
  
  public final static String CHECK_COMPONENT_NAME_IS_UNIQUE = "com.project.foo.foo.CheckComponentNameIsUnique";
  
  public final static String CHECK_ASSEMBLY_NAME_IS_UNIQUE = "com.project.foo.foo.CheckAssemblyNameIsUnique";
  
  public final static String CHECK_COMPONENT_ATTRIBUTE_NAME_IS_UNIQUE = "com.project.foo.foo.ChecKComponentAttributeNameIsUnique";
  
  public final static String CHECK_P_SERVICE_NAME_IS_UNIQUE = "com.project.foo.foo.CheckProvidedServiceNameIsUnique";
  
  public final static String CHECK_R_SERVICE_NAME_IS_UNIQUE = "com.project.foo.foo.CheckRequieredServiceNameIsUnique";
  
  public final static String CHECK_BINDING_IS_VALID = "com.project.foo.foo.CheckBindingIsValid";
  
  public final static String CHECK_BINDING_REQUIERED_CAN_USE_METHOD = "com.project.foo.foo.CheckBindingRequieredCanUseMethod";
  
  public final static String CHECK_BINDING_PROVIDED_CAN_USE_METHOD = "com.project.foo.foo.CheckBindingProvidedCanUseMethod";
  
  public final static String CHECK_P_SERVICE_HAS_METHOD = "com.projetc.foo.foo.CheckProvidedServiceHasMethod";
  
  public final static String CHECK_R_SERVICE_HAS_METHOD = "com.project.foo.foo.CheckRequieredServiceHasMethod";
  
  public final static String CHECK_ASSEMBLY_IS_VALID = "com.project.foo.foo.CheckAssemblyIsValid";
  
  public final static String CHECK_IMPORT_IS_VALID = "com.project.foo.foo.CheckImportIsValid";
  
  @Check
  public void checkComponentNameStartsWithCapital(final Component component) {
    boolean _isUpperCase = Character.isUpperCase(component.getName().charAt(0));
    boolean _not = (!_isUpperCase);
    if (_not) {
      String _name = component.getName();
      String _plus = ("Name should start with a capital: \'" + _name);
      String _plus_1 = (_plus + "\'");
      this.warning(_plus_1, 
        FooPackage.Literals.COMPONENT__NAME, 
        FooValidator.CHECK_C_NAME_START_W_CAPITAL);
    }
  }
  
  @Check
  public void checkAssemblyNameStartsWithCapital(final Assembly assembly) {
    boolean _isUpperCase = Character.isUpperCase(assembly.getName().charAt(0));
    boolean _not = (!_isUpperCase);
    if (_not) {
      String _name = assembly.getName();
      String _plus = ("Name should start with a capital: \'" + _name);
      String _plus_1 = (_plus + "\'");
      this.warning(_plus_1, 
        FooPackage.Literals.ASSEMBLY__NAME, 
        FooValidator.CHECK_A_NAME_START_W_CAPITAL);
    }
  }
  
  /**
   * Verifie qu'il n'y a pas plusieurs composant ayant le meme nom
   * au sein d'un modele
   */
  @Check
  public void checkComponentNameIsUnique(final Component component) {
    EObject tmp = EcoreUtil2.getNextSibling(component);
    while ((tmp != null)) {
      {
        boolean _equals = component.getName().equals(((Component) tmp).getName());
        if (_equals) {
          String _name = component.getName();
          String _plus = ("The name of a component should be unique:\'" + _name);
          String _plus_1 = (_plus + "\'");
          this.error(_plus_1, 
            FooPackage.Literals.COMPONENT__NAME, 
            FooValidator.CHECK_COMPONENT_NAME_IS_UNIQUE);
        }
        tmp = EcoreUtil2.getNextSibling(tmp);
      }
    }
  }
  
  /**
   * Verifie qu'il n'y a pas plusieurs assemblage ayant le meme nom
   * au sein d'un modele
   */
  @Check
  public void checkAssemblyNameIsUnique(final Assembly assembly) {
    EObject tmp = EcoreUtil2.getNextSibling(assembly);
    while ((tmp != null)) {
      {
        boolean _equals = assembly.getName().equals(((Assembly) tmp).getName());
        if (_equals) {
          String _name = assembly.getName();
          String _plus = ("The name of an assembly should be unique :\'" + _name);
          String _plus_1 = (_plus + "\'");
          this.error(_plus_1, 
            FooPackage.Literals.ASSEMBLY__NAME, 
            FooValidator.CHECK_ASSEMBLY_NAME_IS_UNIQUE);
        }
        tmp = EcoreUtil2.getNextSibling(tmp);
      }
    }
  }
  
  /**
   * Verifie qu'il n'y a pas plusieurs attributs d'un assemblage ayant le meme nom
   * au sein d'un modele
   */
  @Check
  public void checkComponentAttributeNameIsUnique(final ComponentInstance ca) {
    EObject tmp = EcoreUtil2.getNextSibling(ca);
    while ((tmp != null)) {
      {
        boolean _equals = ca.getName().equals(((ComponentInstance) tmp).getName());
        if (_equals) {
          String _name = ca.getName();
          String _plus = ("The name of a component attribute should be unique :\'" + _name);
          String _plus_1 = (_plus + "\'");
          this.error(_plus_1, 
            FooPackage.Literals.COMPONENT_INSTANCE__NAME, 
            FooValidator.CHECK_COMPONENT_ATTRIBUTE_NAME_IS_UNIQUE);
        }
        tmp = EcoreUtil2.getNextSibling(tmp);
      }
    }
  }
  
  /**
   * Verifie qu'il n'y a pas plusieurs services pourvu ayant le meme nom
   * au sein d'un composant
   */
  @Check
  public void checkProvidedServiceNameIsUnique(final ProvidedService ps) {
    EObject tmp = EcoreUtil2.getNextSibling(ps);
    while ((tmp != null)) {
      {
        boolean _equals = ps.getName().equals(((ProvidedService) tmp).getName());
        if (_equals) {
          PSignature _name = ps.getName();
          String _plus = ("The name of a provided service should be unique in a component: \'" + _name);
          String _plus_1 = (_plus + "\'");
          this.error(_plus_1, 
            FooPackage.Literals.PROVIDED_SERVICE__NAME, 
            FooValidator.CHECK_P_SERVICE_NAME_IS_UNIQUE);
        }
        tmp = EcoreUtil2.getNextSibling(tmp);
      }
    }
  }
  
  /**
   * Verifie qu'il n'y a pas plusieurs services requis ayant le meme nom
   * au sein d'un composant
   */
  @Check
  public void checkRequieredServiceNameIsUnique(final RequieredService rs) {
    EObject tmp = EcoreUtil2.getNextSibling(rs);
    while ((tmp != null)) {
      {
        boolean _equals = rs.getName().equals(((RequieredService) tmp).getName());
        if (_equals) {
          RSignature _name = rs.getName();
          String _plus = ("The name of a requiered service should be unique in a component: \'" + _name);
          String _plus_1 = (_plus + "\'");
          this.error(_plus_1, 
            FooPackage.Literals.REQUIERED_SERVICE__NAME, 
            FooValidator.CHECK_R_SERVICE_NAME_IS_UNIQUE);
        }
        tmp = EcoreUtil2.getNextSibling(tmp);
      }
    }
  }
  
  /**
   * Verifie que l'instance d'un composant X demande un service requis par
   * le composant X et pas un autre
   */
  @Check
  public void checkBindingRequieredCanUseMethod(final BindingRequiered bindingRequiered) {
    EObject _eContainer = bindingRequiered.getName().eContainer();
    final EList<ComponentInstance> listOfComponent = ((Assembly) _eContainer).getAttributes();
    boolean res = false;
    int i = 0;
    String typeOfInstance = null;
    while (((i < listOfComponent.size()) && (!res))) {
      {
        boolean _equals = listOfComponent.get(i).getName().equals(bindingRequiered.getName().getName());
        if (_equals) {
          res = true;
          typeOfInstance = listOfComponent.get(i).getComponent().getName();
        }
        i++;
      }
    }
    EObject _eContainer_1 = bindingRequiered.getService().eContainer().eContainer();
    final String componentTypeOfService = ((Component) _eContainer_1).getName();
    boolean _equals = typeOfInstance.equals(componentTypeOfService);
    boolean _not = (!_equals);
    if (_not) {
      this.error("This service is not requiered by the component", 
        FooPackage.Literals.BINDING_REQUIERED__SERVICE, 
        FooValidator.CHECK_BINDING_REQUIERED_CAN_USE_METHOD);
    }
  }
  
  /**
   * Verifie que l'instance d'un composant X demande un service fourni par
   * le composant X et pas un autre
   */
  @Check
  public void checkBindingProvidedCanUseMethod(final BindingProvided bindingProvided) {
    EObject _eContainer = bindingProvided.getName().eContainer();
    final EList<ComponentInstance> listOfComponent = ((Assembly) _eContainer).getAttributes();
    boolean res = false;
    int i = 0;
    String typeOfInstance = null;
    while (((i < listOfComponent.size()) && (!res))) {
      {
        boolean _equals = listOfComponent.get(i).getName().equals(bindingProvided.getName().getName());
        if (_equals) {
          res = true;
          typeOfInstance = listOfComponent.get(i).getComponent().getName();
        }
        i++;
      }
    }
    EObject _eContainer_1 = bindingProvided.getService().eContainer().eContainer();
    final String componentTypeOfService = ((Component) _eContainer_1).getName();
    boolean _equals = typeOfInstance.equals(componentTypeOfService);
    boolean _not = (!_equals);
    if (_not) {
      this.error("The type of the component and the component requiring this method are not the same", 
        FooPackage.Literals.BINDING_PROVIDED__SERVICE, 
        FooValidator.CHECK_BINDING_PROVIDED_CAN_USE_METHOD);
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
  public void checkBindingIsValid(final Binding binding) {
    final RSignature nomMethodG = binding.getMG().getService();
    final PSignature nomMethodD = binding.getMD().getService();
    EObject _eContainer = binding.getMG().getService().eContainer().eContainer();
    final EList<MRequieredService> listOfRequieredServices = ((Component) _eContainer).getMReqServices();
    EObject _eContainer_1 = binding.getMD().getService().eContainer().eContainer();
    final EList<MProvidedService> listOfProvidedServices = ((Component) _eContainer_1).getMProvServices();
    String valRetMReq = "";
    String valRetMProv = "";
    EList<Parameter> signatureofRequieredMethod = null;
    EList<Parameter> signatureOfProvidedMethod = null;
    for (final MRequieredService foo : listOfRequieredServices) {
      boolean _equals = foo.getSignature().getName().equals(nomMethodG.getName());
      if (_equals) {
        valRetMReq = foo.getSignature().getType();
        signatureofRequieredMethod = foo.getSignature().getParameters();
      }
    }
    for (final MProvidedService foo_1 : listOfProvidedServices) {
      boolean _equals_1 = foo_1.getSignature().getName().equals(nomMethodD.getName());
      if (_equals_1) {
        valRetMProv = foo_1.getSignature().getType();
        signatureOfProvidedMethod = foo_1.getSignature().getParameters();
      }
    }
    boolean _equals_2 = valRetMReq.equals(valRetMProv);
    boolean _not = (!_equals_2);
    if (_not) {
      this.error("Return type of the provided service do not match the return type of the requiered service", 
        FooPackage.Literals.BINDING__MD, 
        FooValidator.CHECK_BINDING_IS_VALID);
    }
    this.signatureEquals(signatureofRequieredMethod, signatureOfProvidedMethod);
  }
  
  /**
   * V�rifie que les parametres des signatures de deux methodes sont dans le m�me ordre
   * et que pour tout parametre a la position i dans les deux signature le type du parametre est identique
   * @param signature1 : signature de la methode d'un service requis
   * @param signature2 : signature de la methode d'un service pourvu
   */
  public void signatureEquals(final EList<Parameter> signature1, final EList<Parameter> signature2) {
    int _size = signature1.size();
    int _size_1 = signature2.size();
    boolean _equals = (_size == _size_1);
    boolean _not = (!_equals);
    if (_not) {
      this.error("Number of parameters between the requiered service and the provided service do not match", 
        FooPackage.Literals.BINDING__MD, 
        FooValidator.CHECK_BINDING_IS_VALID);
      return;
    }
    int i = 0;
    boolean res = true;
    while (((i < signature1.size()) && res)) {
      {
        boolean _equals_1 = signature1.get(i).getType().equals(signature2.get(i).getType());
        boolean _not_1 = (!_equals_1);
        if (_not_1) {
          this.error("The type of the parameters of the requiered service and the provided service do not match", 
            FooPackage.Literals.BINDING__MD, 
            FooValidator.CHECK_BINDING_IS_VALID);
        }
        i++;
      }
    }
  }
  
  /**
   * Verifie qu'un assemblage est correct
   * i.e. Verifie que les services requis par l'ensemble des composants
   * constituant l'assemblage sont li� � des services fournis dans la section
   * bindings de l'assemblage
   */
  @Check
  public void checkAssemblyIsCorrect(final Assembly assembly) {
    EList<ComponentInstance> listeComposants = assembly.getAttributes();
    for (final ComponentInstance component : listeComposants) {
      {
        Component _component = component.getComponent();
        EList<RequieredService> listeServicesRequis = ((Component) _component).getListOfRServices().getRequieredServices();
        for (final RequieredService service : listeServicesRequis) {
          {
            EList<BindingRequiered> listeBindings = assembly.getBindingsRequiered();
            if ((listeBindings.isEmpty() && (!listeServicesRequis.isEmpty()))) {
              this.error("The assembly is not correct, there are missing bindings", 
                FooPackage.Literals.ASSEMBLY__NAME, 
                FooValidator.CHECK_ASSEMBLY_IS_VALID);
              return;
            }
            for (final BindingRequiered bindingRequiered : listeBindings) {
              {
                int i = 0;
                boolean isPresent = false;
                while (((i < listeBindings.size()) && (!isPresent))) {
                  {
                    if ((service.getName().getName().equals(listeBindings.get(i).getService().getName()) && 
                      component.getName().equals(listeBindings.get(i).getName().getName()))) {
                      isPresent = true;
                    }
                    i++;
                  }
                }
                if ((!isPresent)) {
                  this.error("The assembly is not correct, there are missing bindings", 
                    FooPackage.Literals.ASSEMBLY__NAME, 
                    FooValidator.CHECK_ASSEMBLY_IS_VALID);
                }
              }
            }
          }
        }
      }
    }
  }
}
