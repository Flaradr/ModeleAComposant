/*
 * generated by Xtext 2.13.0
 */
package com.project.foo


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class FooStandaloneSetup extends FooStandaloneSetupGenerated {

	def static void doSetup() {
		new FooStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
