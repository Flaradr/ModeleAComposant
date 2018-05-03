/**
 * generated by Xtext 2.13.0
 */
package com.project.foo.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.project.foo.FooRuntimeModule;
import com.project.foo.FooStandaloneSetup;
import com.project.foo.ide.FooIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class FooIdeSetup extends FooStandaloneSetup {
  @Override
  public Injector createInjector() {
    FooRuntimeModule _fooRuntimeModule = new FooRuntimeModule();
    FooIdeModule _fooIdeModule = new FooIdeModule();
    return Guice.createInjector(Modules2.mixin(_fooRuntimeModule, _fooIdeModule));
  }
}
