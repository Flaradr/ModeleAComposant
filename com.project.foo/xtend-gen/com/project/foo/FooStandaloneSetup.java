/**
 * generated by Xtext 2.13.0
 */
package com.project.foo;

import com.project.foo.FooStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class FooStandaloneSetup extends FooStandaloneSetupGenerated {
  public static void doSetup() {
    new FooStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
