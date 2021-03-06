/**
 * generated by Xtext 2.13.0
 */
package com.project.foo.generator;

import com.google.common.collect.Iterables;
import com.project.foo.foo.Assembly;
import com.project.foo.foo.Component;
import com.project.foo.foo.Model;
import com.project.foo.foo.PSignature;
import com.project.foo.foo.Parameter;
import com.project.foo.foo.ProvidedService;
import com.project.foo.foo.RequiredService;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class FooGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Component> _filter = Iterables.<Component>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Component.class);
    for (final Component c : _filter) {
      String _name = c.getName();
      String _plus = (_name + ".java");
      fsa.generateFile(_plus, this.compile(c));
    }
    Iterable<Assembly> _filter_1 = Iterables.<Assembly>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Assembly.class);
    for (final Assembly a : _filter_1) {
      String _name_1 = a.getName();
      String _plus_1 = (_name_1 + ".java");
      fsa.generateFile(_plus_1, this.compile(a));
    }
  }
  
  public CharSequence compile(final Component c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    EObject _eContainer = c.eContainer();
    String _name = ((Model) _eContainer).getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = c.getName();
    _builder.append(_name_1);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<ProvidedService> _providedServices = c.getListOfPServices().getProvidedServices();
      for(final ProvidedService servicesP : _providedServices) {
        _builder.append("\t");
        CharSequence _compile = this.compile(servicesP);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<RequiredService> _requiredServices = c.getListOfRServices().getRequiredServices();
      for(final RequiredService servicesR : _requiredServices) {
        _builder.append("\t");
        CharSequence _compile_1 = this.compile(servicesR);
        _builder.append(_compile_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final ProvidedService sp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    String _type = sp.getName().getType();
    _builder.append(_type);
    _builder.append(" ");
    String _name = sp.getName().getName();
    _builder.append(_name);
    _builder.append("(");
    CharSequence _loopParameter = this.loopParameter(sp);
    _builder.append(_loopParameter);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Parameter p) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = p.getType();
    _builder.append(_type);
    _builder.append(" ");
    String _name = p.getName();
    _builder.append(_name);
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final RequiredService sr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    String _type = sr.getName().getType();
    _builder.append(_type);
    _builder.append(" ");
    String _name = sr.getName().getName();
    _builder.append(_name);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Assembly a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    EObject _eContainer = a.eContainer();
    String _name = ((Model) _eContainer).getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = a.getName();
    _builder.append(_name_1);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence loopParameter(final ProvidedService sp) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EObject _get = sp.eCrossReferences().get(0);
      EList<Parameter> _parameters = ((PSignature) _get).getParameters();
      for(final Parameter p : _parameters) {
        CharSequence _compile = this.compile(p);
        _builder.append(_compile);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
