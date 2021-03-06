/*
 * generated by Xtext 2.13.0
 */
package com.project.foo.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.project.foo.foo.Model
import com.project.foo.foo.Component
import com.project.foo.foo.Assembly
import com.project.foo.foo.ProvidedService
import com.project.foo.foo.RequiredService
import com.project.foo.foo.Parameter
import com.project.foo.foo.PSignature

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class FooGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(c : resource.allContents.toIterable.filter(Component)){
			fsa.generateFile(c.name+".java", c.compile())
		}
		
		for(a : resource.allContents.toIterable.filter(Assembly)){
			fsa.generateFile(a.name+".java", a.compile())
		}
	}
	
	def compile(Component c) '''
    package �(c.eContainer as Model).name�;
        
    public class �c.name� {
    	�FOR ProvidedService servicesP : c.listOfPServices.providedServices�
    		�servicesP.compile()�
    	�ENDFOR�
    	
    	�FOR RequiredService servicesR : c.listOfRServices.requiredServices�
    		�servicesR.compile()�
    	�ENDFOR�
    }
	'''

	def compile(ProvidedService sp)'''
	private �sp.name.type� �sp.name.name�(�loopParameter(sp)�{
	}
	'''
	
	def compile(Parameter p)'''
	�p.type� �p.name�,
	'''
	
	def compile(RequiredService sr)'''
	private �sr.name.type� �sr.name.name�{
	}
	'''
	
	def compile(Assembly a) '''
    package �(a.eContainer as Model).name�;
        
    public class �a.name� {
    	
    }
	'''
	
	//Donne la signature du service fourni sp
	def loopParameter(ProvidedService sp)'''
	�FOR Parameter p : (sp.eCrossReferences.get(0) as PSignature).parameters��p.compile()��ENDFOR�
	'''
}
