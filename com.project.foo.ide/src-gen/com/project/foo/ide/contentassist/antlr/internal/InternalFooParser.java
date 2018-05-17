package com.project.foo.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.project.foo.services.FooGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFooParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'Assembly'", "'components'", "'bindings'", "'-'", "':'", "'Component'", "'provided'", "'='", "','", "'requiered'", "'service'", "'('", "')'", "';'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFooParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFooParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFooParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFoo.g"; }


    	private FooGrammarAccess grammarAccess;

    	public void setGrammarAccess(FooGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDomainModel"
    // InternalFoo.g:53:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // InternalFoo.g:54:1: ( ruleDomainModel EOF )
            // InternalFoo.g:55:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainModel();

            state._fsp--;

             after(grammarAccess.getDomainModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalFoo.g:62:1: ruleDomainModel : ( ( rule__DomainModel__ModelAssignment ) ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:66:2: ( ( ( rule__DomainModel__ModelAssignment ) ) )
            // InternalFoo.g:67:2: ( ( rule__DomainModel__ModelAssignment ) )
            {
            // InternalFoo.g:67:2: ( ( rule__DomainModel__ModelAssignment ) )
            // InternalFoo.g:68:3: ( rule__DomainModel__ModelAssignment )
            {
             before(grammarAccess.getDomainModelAccess().getModelAssignment()); 
            // InternalFoo.g:69:3: ( rule__DomainModel__ModelAssignment )
            // InternalFoo.g:69:4: rule__DomainModel__ModelAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__ModelAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getModelAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleModel"
    // InternalFoo.g:78:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalFoo.g:79:1: ( ruleModel EOF )
            // InternalFoo.g:80:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalFoo.g:87:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:91:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalFoo.g:92:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalFoo.g:92:2: ( ( rule__Model__Group__0 ) )
            // InternalFoo.g:93:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalFoo.g:94:3: ( rule__Model__Group__0 )
            // InternalFoo.g:94:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalFoo.g:103:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalFoo.g:104:1: ( ruleQualifiedName EOF )
            // InternalFoo.g:105:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalFoo.g:112:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:116:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalFoo.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalFoo.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalFoo.g:118:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalFoo.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalFoo.g:119:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // InternalFoo.g:128:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalFoo.g:129:1: ( ruleImport EOF )
            // InternalFoo.g:130:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalFoo.g:137:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:141:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalFoo.g:142:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalFoo.g:142:2: ( ( rule__Import__Group__0 ) )
            // InternalFoo.g:143:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalFoo.g:144:3: ( rule__Import__Group__0 )
            // InternalFoo.g:144:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalFoo.g:153:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalFoo.g:154:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalFoo.g:155:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalFoo.g:162:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:166:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalFoo.g:167:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalFoo.g:167:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalFoo.g:168:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalFoo.g:169:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalFoo.g:169:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleAssembly"
    // InternalFoo.g:178:1: entryRuleAssembly : ruleAssembly EOF ;
    public final void entryRuleAssembly() throws RecognitionException {
        try {
            // InternalFoo.g:179:1: ( ruleAssembly EOF )
            // InternalFoo.g:180:1: ruleAssembly EOF
            {
             before(grammarAccess.getAssemblyRule()); 
            pushFollow(FOLLOW_1);
            ruleAssembly();

            state._fsp--;

             after(grammarAccess.getAssemblyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssembly"


    // $ANTLR start "ruleAssembly"
    // InternalFoo.g:187:1: ruleAssembly : ( ( rule__Assembly__Group__0 ) ) ;
    public final void ruleAssembly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:191:2: ( ( ( rule__Assembly__Group__0 ) ) )
            // InternalFoo.g:192:2: ( ( rule__Assembly__Group__0 ) )
            {
            // InternalFoo.g:192:2: ( ( rule__Assembly__Group__0 ) )
            // InternalFoo.g:193:3: ( rule__Assembly__Group__0 )
            {
             before(grammarAccess.getAssemblyAccess().getGroup()); 
            // InternalFoo.g:194:3: ( rule__Assembly__Group__0 )
            // InternalFoo.g:194:4: rule__Assembly__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssembly"


    // $ANTLR start "entryRuleComponentInstance"
    // InternalFoo.g:203:1: entryRuleComponentInstance : ruleComponentInstance EOF ;
    public final void entryRuleComponentInstance() throws RecognitionException {
        try {
            // InternalFoo.g:204:1: ( ruleComponentInstance EOF )
            // InternalFoo.g:205:1: ruleComponentInstance EOF
            {
             before(grammarAccess.getComponentInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentInstance();

            state._fsp--;

             after(grammarAccess.getComponentInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentInstance"


    // $ANTLR start "ruleComponentInstance"
    // InternalFoo.g:212:1: ruleComponentInstance : ( ( rule__ComponentInstance__Group__0 ) ) ;
    public final void ruleComponentInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:216:2: ( ( ( rule__ComponentInstance__Group__0 ) ) )
            // InternalFoo.g:217:2: ( ( rule__ComponentInstance__Group__0 ) )
            {
            // InternalFoo.g:217:2: ( ( rule__ComponentInstance__Group__0 ) )
            // InternalFoo.g:218:3: ( rule__ComponentInstance__Group__0 )
            {
             before(grammarAccess.getComponentInstanceAccess().getGroup()); 
            // InternalFoo.g:219:3: ( rule__ComponentInstance__Group__0 )
            // InternalFoo.g:219:4: rule__ComponentInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentInstance"


    // $ANTLR start "entryRuleBindingRequiered"
    // InternalFoo.g:228:1: entryRuleBindingRequiered : ruleBindingRequiered EOF ;
    public final void entryRuleBindingRequiered() throws RecognitionException {
        try {
            // InternalFoo.g:229:1: ( ruleBindingRequiered EOF )
            // InternalFoo.g:230:1: ruleBindingRequiered EOF
            {
             before(grammarAccess.getBindingRequieredRule()); 
            pushFollow(FOLLOW_1);
            ruleBindingRequiered();

            state._fsp--;

             after(grammarAccess.getBindingRequieredRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBindingRequiered"


    // $ANTLR start "ruleBindingRequiered"
    // InternalFoo.g:237:1: ruleBindingRequiered : ( ( rule__BindingRequiered__Group__0 ) ) ;
    public final void ruleBindingRequiered() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:241:2: ( ( ( rule__BindingRequiered__Group__0 ) ) )
            // InternalFoo.g:242:2: ( ( rule__BindingRequiered__Group__0 ) )
            {
            // InternalFoo.g:242:2: ( ( rule__BindingRequiered__Group__0 ) )
            // InternalFoo.g:243:3: ( rule__BindingRequiered__Group__0 )
            {
             before(grammarAccess.getBindingRequieredAccess().getGroup()); 
            // InternalFoo.g:244:3: ( rule__BindingRequiered__Group__0 )
            // InternalFoo.g:244:4: rule__BindingRequiered__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BindingRequiered__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingRequieredAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBindingRequiered"


    // $ANTLR start "entryRuleBindingProvided"
    // InternalFoo.g:253:1: entryRuleBindingProvided : ruleBindingProvided EOF ;
    public final void entryRuleBindingProvided() throws RecognitionException {
        try {
            // InternalFoo.g:254:1: ( ruleBindingProvided EOF )
            // InternalFoo.g:255:1: ruleBindingProvided EOF
            {
             before(grammarAccess.getBindingProvidedRule()); 
            pushFollow(FOLLOW_1);
            ruleBindingProvided();

            state._fsp--;

             after(grammarAccess.getBindingProvidedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBindingProvided"


    // $ANTLR start "ruleBindingProvided"
    // InternalFoo.g:262:1: ruleBindingProvided : ( ( rule__BindingProvided__Group__0 ) ) ;
    public final void ruleBindingProvided() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:266:2: ( ( ( rule__BindingProvided__Group__0 ) ) )
            // InternalFoo.g:267:2: ( ( rule__BindingProvided__Group__0 ) )
            {
            // InternalFoo.g:267:2: ( ( rule__BindingProvided__Group__0 ) )
            // InternalFoo.g:268:3: ( rule__BindingProvided__Group__0 )
            {
             before(grammarAccess.getBindingProvidedAccess().getGroup()); 
            // InternalFoo.g:269:3: ( rule__BindingProvided__Group__0 )
            // InternalFoo.g:269:4: rule__BindingProvided__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BindingProvided__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingProvidedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBindingProvided"


    // $ANTLR start "entryRuleComponent"
    // InternalFoo.g:278:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalFoo.g:279:1: ( ruleComponent EOF )
            // InternalFoo.g:280:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalFoo.g:287:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:291:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalFoo.g:292:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalFoo.g:292:2: ( ( rule__Component__Group__0 ) )
            // InternalFoo.g:293:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalFoo.g:294:3: ( rule__Component__Group__0 )
            // InternalFoo.g:294:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleListOfProvidedServices"
    // InternalFoo.g:303:1: entryRuleListOfProvidedServices : ruleListOfProvidedServices EOF ;
    public final void entryRuleListOfProvidedServices() throws RecognitionException {
        try {
            // InternalFoo.g:304:1: ( ruleListOfProvidedServices EOF )
            // InternalFoo.g:305:1: ruleListOfProvidedServices EOF
            {
             before(grammarAccess.getListOfProvidedServicesRule()); 
            pushFollow(FOLLOW_1);
            ruleListOfProvidedServices();

            state._fsp--;

             after(grammarAccess.getListOfProvidedServicesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListOfProvidedServices"


    // $ANTLR start "ruleListOfProvidedServices"
    // InternalFoo.g:312:1: ruleListOfProvidedServices : ( ( rule__ListOfProvidedServices__Group__0 ) ) ;
    public final void ruleListOfProvidedServices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:316:2: ( ( ( rule__ListOfProvidedServices__Group__0 ) ) )
            // InternalFoo.g:317:2: ( ( rule__ListOfProvidedServices__Group__0 ) )
            {
            // InternalFoo.g:317:2: ( ( rule__ListOfProvidedServices__Group__0 ) )
            // InternalFoo.g:318:3: ( rule__ListOfProvidedServices__Group__0 )
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getGroup()); 
            // InternalFoo.g:319:3: ( rule__ListOfProvidedServices__Group__0 )
            // InternalFoo.g:319:4: rule__ListOfProvidedServices__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfProvidedServicesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListOfProvidedServices"


    // $ANTLR start "entryRuleProvidedService"
    // InternalFoo.g:328:1: entryRuleProvidedService : ruleProvidedService EOF ;
    public final void entryRuleProvidedService() throws RecognitionException {
        try {
            // InternalFoo.g:329:1: ( ruleProvidedService EOF )
            // InternalFoo.g:330:1: ruleProvidedService EOF
            {
             before(grammarAccess.getProvidedServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleProvidedService();

            state._fsp--;

             after(grammarAccess.getProvidedServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProvidedService"


    // $ANTLR start "ruleProvidedService"
    // InternalFoo.g:337:1: ruleProvidedService : ( ( rule__ProvidedService__NameAssignment ) ) ;
    public final void ruleProvidedService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:341:2: ( ( ( rule__ProvidedService__NameAssignment ) ) )
            // InternalFoo.g:342:2: ( ( rule__ProvidedService__NameAssignment ) )
            {
            // InternalFoo.g:342:2: ( ( rule__ProvidedService__NameAssignment ) )
            // InternalFoo.g:343:3: ( rule__ProvidedService__NameAssignment )
            {
             before(grammarAccess.getProvidedServiceAccess().getNameAssignment()); 
            // InternalFoo.g:344:3: ( rule__ProvidedService__NameAssignment )
            // InternalFoo.g:344:4: rule__ProvidedService__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedService__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProvidedServiceAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProvidedService"


    // $ANTLR start "entryRuleListOfRequieredServices"
    // InternalFoo.g:353:1: entryRuleListOfRequieredServices : ruleListOfRequieredServices EOF ;
    public final void entryRuleListOfRequieredServices() throws RecognitionException {
        try {
            // InternalFoo.g:354:1: ( ruleListOfRequieredServices EOF )
            // InternalFoo.g:355:1: ruleListOfRequieredServices EOF
            {
             before(grammarAccess.getListOfRequieredServicesRule()); 
            pushFollow(FOLLOW_1);
            ruleListOfRequieredServices();

            state._fsp--;

             after(grammarAccess.getListOfRequieredServicesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListOfRequieredServices"


    // $ANTLR start "ruleListOfRequieredServices"
    // InternalFoo.g:362:1: ruleListOfRequieredServices : ( ( rule__ListOfRequieredServices__Group__0 ) ) ;
    public final void ruleListOfRequieredServices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:366:2: ( ( ( rule__ListOfRequieredServices__Group__0 ) ) )
            // InternalFoo.g:367:2: ( ( rule__ListOfRequieredServices__Group__0 ) )
            {
            // InternalFoo.g:367:2: ( ( rule__ListOfRequieredServices__Group__0 ) )
            // InternalFoo.g:368:3: ( rule__ListOfRequieredServices__Group__0 )
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getGroup()); 
            // InternalFoo.g:369:3: ( rule__ListOfRequieredServices__Group__0 )
            // InternalFoo.g:369:4: rule__ListOfRequieredServices__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfRequieredServices__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfRequieredServicesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListOfRequieredServices"


    // $ANTLR start "entryRuleRequieredService"
    // InternalFoo.g:378:1: entryRuleRequieredService : ruleRequieredService EOF ;
    public final void entryRuleRequieredService() throws RecognitionException {
        try {
            // InternalFoo.g:379:1: ( ruleRequieredService EOF )
            // InternalFoo.g:380:1: ruleRequieredService EOF
            {
             before(grammarAccess.getRequieredServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleRequieredService();

            state._fsp--;

             after(grammarAccess.getRequieredServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequieredService"


    // $ANTLR start "ruleRequieredService"
    // InternalFoo.g:387:1: ruleRequieredService : ( ( rule__RequieredService__NameAssignment ) ) ;
    public final void ruleRequieredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:391:2: ( ( ( rule__RequieredService__NameAssignment ) ) )
            // InternalFoo.g:392:2: ( ( rule__RequieredService__NameAssignment ) )
            {
            // InternalFoo.g:392:2: ( ( rule__RequieredService__NameAssignment ) )
            // InternalFoo.g:393:3: ( rule__RequieredService__NameAssignment )
            {
             before(grammarAccess.getRequieredServiceAccess().getNameAssignment()); 
            // InternalFoo.g:394:3: ( rule__RequieredService__NameAssignment )
            // InternalFoo.g:394:4: rule__RequieredService__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RequieredService__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRequieredServiceAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequieredService"


    // $ANTLR start "entryRuleMProvidedService"
    // InternalFoo.g:403:1: entryRuleMProvidedService : ruleMProvidedService EOF ;
    public final void entryRuleMProvidedService() throws RecognitionException {
        try {
            // InternalFoo.g:404:1: ( ruleMProvidedService EOF )
            // InternalFoo.g:405:1: ruleMProvidedService EOF
            {
             before(grammarAccess.getMProvidedServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleMProvidedService();

            state._fsp--;

             after(grammarAccess.getMProvidedServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMProvidedService"


    // $ANTLR start "ruleMProvidedService"
    // InternalFoo.g:412:1: ruleMProvidedService : ( ( rule__MProvidedService__Group__0 ) ) ;
    public final void ruleMProvidedService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:416:2: ( ( ( rule__MProvidedService__Group__0 ) ) )
            // InternalFoo.g:417:2: ( ( rule__MProvidedService__Group__0 ) )
            {
            // InternalFoo.g:417:2: ( ( rule__MProvidedService__Group__0 ) )
            // InternalFoo.g:418:3: ( rule__MProvidedService__Group__0 )
            {
             before(grammarAccess.getMProvidedServiceAccess().getGroup()); 
            // InternalFoo.g:419:3: ( rule__MProvidedService__Group__0 )
            // InternalFoo.g:419:4: rule__MProvidedService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MProvidedService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMProvidedServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMProvidedService"


    // $ANTLR start "entryRulePSignature"
    // InternalFoo.g:428:1: entryRulePSignature : rulePSignature EOF ;
    public final void entryRulePSignature() throws RecognitionException {
        try {
            // InternalFoo.g:429:1: ( rulePSignature EOF )
            // InternalFoo.g:430:1: rulePSignature EOF
            {
             before(grammarAccess.getPSignatureRule()); 
            pushFollow(FOLLOW_1);
            rulePSignature();

            state._fsp--;

             after(grammarAccess.getPSignatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePSignature"


    // $ANTLR start "rulePSignature"
    // InternalFoo.g:437:1: rulePSignature : ( ( rule__PSignature__Group__0 ) ) ;
    public final void rulePSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:441:2: ( ( ( rule__PSignature__Group__0 ) ) )
            // InternalFoo.g:442:2: ( ( rule__PSignature__Group__0 ) )
            {
            // InternalFoo.g:442:2: ( ( rule__PSignature__Group__0 ) )
            // InternalFoo.g:443:3: ( rule__PSignature__Group__0 )
            {
             before(grammarAccess.getPSignatureAccess().getGroup()); 
            // InternalFoo.g:444:3: ( rule__PSignature__Group__0 )
            // InternalFoo.g:444:4: rule__PSignature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PSignature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePSignature"


    // $ANTLR start "entryRuleMRequieredService"
    // InternalFoo.g:453:1: entryRuleMRequieredService : ruleMRequieredService EOF ;
    public final void entryRuleMRequieredService() throws RecognitionException {
        try {
            // InternalFoo.g:454:1: ( ruleMRequieredService EOF )
            // InternalFoo.g:455:1: ruleMRequieredService EOF
            {
             before(grammarAccess.getMRequieredServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleMRequieredService();

            state._fsp--;

             after(grammarAccess.getMRequieredServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMRequieredService"


    // $ANTLR start "ruleMRequieredService"
    // InternalFoo.g:462:1: ruleMRequieredService : ( ( rule__MRequieredService__Group__0 ) ) ;
    public final void ruleMRequieredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:466:2: ( ( ( rule__MRequieredService__Group__0 ) ) )
            // InternalFoo.g:467:2: ( ( rule__MRequieredService__Group__0 ) )
            {
            // InternalFoo.g:467:2: ( ( rule__MRequieredService__Group__0 ) )
            // InternalFoo.g:468:3: ( rule__MRequieredService__Group__0 )
            {
             before(grammarAccess.getMRequieredServiceAccess().getGroup()); 
            // InternalFoo.g:469:3: ( rule__MRequieredService__Group__0 )
            // InternalFoo.g:469:4: rule__MRequieredService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MRequieredService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMRequieredServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMRequieredService"


    // $ANTLR start "entryRuleRSignature"
    // InternalFoo.g:478:1: entryRuleRSignature : ruleRSignature EOF ;
    public final void entryRuleRSignature() throws RecognitionException {
        try {
            // InternalFoo.g:479:1: ( ruleRSignature EOF )
            // InternalFoo.g:480:1: ruleRSignature EOF
            {
             before(grammarAccess.getRSignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleRSignature();

            state._fsp--;

             after(grammarAccess.getRSignatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRSignature"


    // $ANTLR start "ruleRSignature"
    // InternalFoo.g:487:1: ruleRSignature : ( ( rule__RSignature__Group__0 ) ) ;
    public final void ruleRSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:491:2: ( ( ( rule__RSignature__Group__0 ) ) )
            // InternalFoo.g:492:2: ( ( rule__RSignature__Group__0 ) )
            {
            // InternalFoo.g:492:2: ( ( rule__RSignature__Group__0 ) )
            // InternalFoo.g:493:3: ( rule__RSignature__Group__0 )
            {
             before(grammarAccess.getRSignatureAccess().getGroup()); 
            // InternalFoo.g:494:3: ( rule__RSignature__Group__0 )
            // InternalFoo.g:494:4: rule__RSignature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RSignature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRSignature"


    // $ANTLR start "entryRuleParameter"
    // InternalFoo.g:503:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalFoo.g:504:1: ( ruleParameter EOF )
            // InternalFoo.g:505:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalFoo.g:512:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:516:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalFoo.g:517:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalFoo.g:517:2: ( ( rule__Parameter__Group__0 ) )
            // InternalFoo.g:518:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalFoo.g:519:3: ( rule__Parameter__Group__0 )
            // InternalFoo.g:519:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "rule__Model__Group__0"
    // InternalFoo.g:527:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:531:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFoo.g:532:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalFoo.g:539:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:543:1: ( ( 'package' ) )
            // InternalFoo.g:544:1: ( 'package' )
            {
            // InternalFoo.g:544:1: ( 'package' )
            // InternalFoo.g:545:2: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalFoo.g:554:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:558:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalFoo.g:559:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalFoo.g:566:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:570:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalFoo.g:571:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalFoo.g:571:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalFoo.g:572:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalFoo.g:573:2: ( rule__Model__NameAssignment_1 )
            // InternalFoo.g:573:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalFoo.g:581:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:585:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalFoo.g:586:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalFoo.g:593:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:597:1: ( ( '{' ) )
            // InternalFoo.g:598:1: ( '{' )
            {
            // InternalFoo.g:598:1: ( '{' )
            // InternalFoo.g:599:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalFoo.g:608:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:612:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalFoo.g:613:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalFoo.g:620:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:624:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // InternalFoo.g:625:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // InternalFoo.g:625:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // InternalFoo.g:626:2: ( rule__Model__ImportsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            // InternalFoo.g:627:2: ( rule__Model__ImportsAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFoo.g:627:3: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalFoo.g:635:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:639:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalFoo.g:640:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalFoo.g:647:1: rule__Model__Group__4__Impl : ( ( rule__Model__ComponentsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:651:1: ( ( ( rule__Model__ComponentsAssignment_4 )* ) )
            // InternalFoo.g:652:1: ( ( rule__Model__ComponentsAssignment_4 )* )
            {
            // InternalFoo.g:652:1: ( ( rule__Model__ComponentsAssignment_4 )* )
            // InternalFoo.g:653:2: ( rule__Model__ComponentsAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getComponentsAssignment_4()); 
            // InternalFoo.g:654:2: ( rule__Model__ComponentsAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFoo.g:654:3: rule__Model__ComponentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__ComponentsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getComponentsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalFoo.g:662:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:666:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalFoo.g:667:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalFoo.g:674:1: rule__Model__Group__5__Impl : ( ( rule__Model__AssemblyAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:678:1: ( ( ( rule__Model__AssemblyAssignment_5 )* ) )
            // InternalFoo.g:679:1: ( ( rule__Model__AssemblyAssignment_5 )* )
            {
            // InternalFoo.g:679:1: ( ( rule__Model__AssemblyAssignment_5 )* )
            // InternalFoo.g:680:2: ( rule__Model__AssemblyAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getAssemblyAssignment_5()); 
            // InternalFoo.g:681:2: ( rule__Model__AssemblyAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFoo.g:681:3: rule__Model__AssemblyAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__AssemblyAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAssemblyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalFoo.g:689:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:693:1: ( rule__Model__Group__6__Impl )
            // InternalFoo.g:694:2: rule__Model__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalFoo.g:700:1: rule__Model__Group__6__Impl : ( '}' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:704:1: ( ( '}' ) )
            // InternalFoo.g:705:1: ( '}' )
            {
            // InternalFoo.g:705:1: ( '}' )
            // InternalFoo.g:706:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalFoo.g:716:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:720:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalFoo.g:721:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalFoo.g:728:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:732:1: ( ( RULE_ID ) )
            // InternalFoo.g:733:1: ( RULE_ID )
            {
            // InternalFoo.g:733:1: ( RULE_ID )
            // InternalFoo.g:734:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalFoo.g:743:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:747:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalFoo.g:748:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalFoo.g:754:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:758:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalFoo.g:759:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalFoo.g:759:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalFoo.g:760:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalFoo.g:761:2: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFoo.g:761:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalFoo.g:770:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:774:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalFoo.g:775:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalFoo.g:782:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:786:1: ( ( '.' ) )
            // InternalFoo.g:787:1: ( '.' )
            {
            // InternalFoo.g:787:1: ( '.' )
            // InternalFoo.g:788:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalFoo.g:797:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:801:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalFoo.g:802:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalFoo.g:808:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:812:1: ( ( RULE_ID ) )
            // InternalFoo.g:813:1: ( RULE_ID )
            {
            // InternalFoo.g:813:1: ( RULE_ID )
            // InternalFoo.g:814:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalFoo.g:824:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:828:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalFoo.g:829:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalFoo.g:836:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:840:1: ( ( 'import' ) )
            // InternalFoo.g:841:1: ( 'import' )
            {
            // InternalFoo.g:841:1: ( 'import' )
            // InternalFoo.g:842:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalFoo.g:851:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:855:1: ( rule__Import__Group__1__Impl )
            // InternalFoo.g:856:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalFoo.g:862:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:866:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalFoo.g:867:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalFoo.g:867:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalFoo.g:868:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalFoo.g:869:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalFoo.g:869:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalFoo.g:878:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:882:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalFoo.g:883:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalFoo.g:890:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:894:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:895:1: ( ruleQualifiedName )
            {
            // InternalFoo.g:895:1: ( ruleQualifiedName )
            // InternalFoo.g:896:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalFoo.g:905:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:909:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalFoo.g:910:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalFoo.g:916:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:920:1: ( ( ( '.*' )? ) )
            // InternalFoo.g:921:1: ( ( '.*' )? )
            {
            // InternalFoo.g:921:1: ( ( '.*' )? )
            // InternalFoo.g:922:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalFoo.g:923:2: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFoo.g:923:3: '.*'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Assembly__Group__0"
    // InternalFoo.g:932:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:936:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // InternalFoo.g:937:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Assembly__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__0"


    // $ANTLR start "rule__Assembly__Group__0__Impl"
    // InternalFoo.g:944:1: rule__Assembly__Group__0__Impl : ( () ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:948:1: ( ( () ) )
            // InternalFoo.g:949:1: ( () )
            {
            // InternalFoo.g:949:1: ( () )
            // InternalFoo.g:950:2: ()
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyAction_0()); 
            // InternalFoo.g:951:2: ()
            // InternalFoo.g:951:3: 
            {
            }

             after(grammarAccess.getAssemblyAccess().getAssemblyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__0__Impl"


    // $ANTLR start "rule__Assembly__Group__1"
    // InternalFoo.g:959:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:963:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // InternalFoo.g:964:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Assembly__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__1"


    // $ANTLR start "rule__Assembly__Group__1__Impl"
    // InternalFoo.g:971:1: rule__Assembly__Group__1__Impl : ( 'Assembly' ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:975:1: ( ( 'Assembly' ) )
            // InternalFoo.g:976:1: ( 'Assembly' )
            {
            // InternalFoo.g:976:1: ( 'Assembly' )
            // InternalFoo.g:977:2: 'Assembly'
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAssemblyAccess().getAssemblyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__1__Impl"


    // $ANTLR start "rule__Assembly__Group__2"
    // InternalFoo.g:986:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:990:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // InternalFoo.g:991:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Assembly__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__2"


    // $ANTLR start "rule__Assembly__Group__2__Impl"
    // InternalFoo.g:998:1: rule__Assembly__Group__2__Impl : ( ( rule__Assembly__NameAssignment_2 ) ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1002:1: ( ( ( rule__Assembly__NameAssignment_2 ) ) )
            // InternalFoo.g:1003:1: ( ( rule__Assembly__NameAssignment_2 ) )
            {
            // InternalFoo.g:1003:1: ( ( rule__Assembly__NameAssignment_2 ) )
            // InternalFoo.g:1004:2: ( rule__Assembly__NameAssignment_2 )
            {
             before(grammarAccess.getAssemblyAccess().getNameAssignment_2()); 
            // InternalFoo.g:1005:2: ( rule__Assembly__NameAssignment_2 )
            // InternalFoo.g:1005:3: rule__Assembly__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__2__Impl"


    // $ANTLR start "rule__Assembly__Group__3"
    // InternalFoo.g:1013:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1017:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // InternalFoo.g:1018:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Assembly__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__3"


    // $ANTLR start "rule__Assembly__Group__3__Impl"
    // InternalFoo.g:1025:1: rule__Assembly__Group__3__Impl : ( '{' ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1029:1: ( ( '{' ) )
            // InternalFoo.g:1030:1: ( '{' )
            {
            // InternalFoo.g:1030:1: ( '{' )
            // InternalFoo.g:1031:2: '{'
            {
             before(grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__3__Impl"


    // $ANTLR start "rule__Assembly__Group__4"
    // InternalFoo.g:1040:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl rule__Assembly__Group__5 ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1044:1: ( rule__Assembly__Group__4__Impl rule__Assembly__Group__5 )
            // InternalFoo.g:1045:2: rule__Assembly__Group__4__Impl rule__Assembly__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Assembly__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__4"


    // $ANTLR start "rule__Assembly__Group__4__Impl"
    // InternalFoo.g:1052:1: rule__Assembly__Group__4__Impl : ( 'components' ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1056:1: ( ( 'components' ) )
            // InternalFoo.g:1057:1: ( 'components' )
            {
            // InternalFoo.g:1057:1: ( 'components' )
            // InternalFoo.g:1058:2: 'components'
            {
             before(grammarAccess.getAssemblyAccess().getComponentsKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAssemblyAccess().getComponentsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__4__Impl"


    // $ANTLR start "rule__Assembly__Group__5"
    // InternalFoo.g:1067:1: rule__Assembly__Group__5 : rule__Assembly__Group__5__Impl rule__Assembly__Group__6 ;
    public final void rule__Assembly__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1071:1: ( rule__Assembly__Group__5__Impl rule__Assembly__Group__6 )
            // InternalFoo.g:1072:2: rule__Assembly__Group__5__Impl rule__Assembly__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Assembly__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__5"


    // $ANTLR start "rule__Assembly__Group__5__Impl"
    // InternalFoo.g:1079:1: rule__Assembly__Group__5__Impl : ( ( rule__Assembly__AttributesAssignment_5 ) ) ;
    public final void rule__Assembly__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1083:1: ( ( ( rule__Assembly__AttributesAssignment_5 ) ) )
            // InternalFoo.g:1084:1: ( ( rule__Assembly__AttributesAssignment_5 ) )
            {
            // InternalFoo.g:1084:1: ( ( rule__Assembly__AttributesAssignment_5 ) )
            // InternalFoo.g:1085:2: ( rule__Assembly__AttributesAssignment_5 )
            {
             before(grammarAccess.getAssemblyAccess().getAttributesAssignment_5()); 
            // InternalFoo.g:1086:2: ( rule__Assembly__AttributesAssignment_5 )
            // InternalFoo.g:1086:3: rule__Assembly__AttributesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__AttributesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getAttributesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__5__Impl"


    // $ANTLR start "rule__Assembly__Group__6"
    // InternalFoo.g:1094:1: rule__Assembly__Group__6 : rule__Assembly__Group__6__Impl rule__Assembly__Group__7 ;
    public final void rule__Assembly__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1098:1: ( rule__Assembly__Group__6__Impl rule__Assembly__Group__7 )
            // InternalFoo.g:1099:2: rule__Assembly__Group__6__Impl rule__Assembly__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Assembly__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__6"


    // $ANTLR start "rule__Assembly__Group__6__Impl"
    // InternalFoo.g:1106:1: rule__Assembly__Group__6__Impl : ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) ) ;
    public final void rule__Assembly__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1110:1: ( ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) ) )
            // InternalFoo.g:1111:1: ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) )
            {
            // InternalFoo.g:1111:1: ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) )
            // InternalFoo.g:1112:2: ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* )
            {
            // InternalFoo.g:1112:2: ( ( rule__Assembly__AttributesAssignment_6 ) )
            // InternalFoo.g:1113:3: ( rule__Assembly__AttributesAssignment_6 )
            {
             before(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 
            // InternalFoo.g:1114:3: ( rule__Assembly__AttributesAssignment_6 )
            // InternalFoo.g:1114:4: rule__Assembly__AttributesAssignment_6
            {
            pushFollow(FOLLOW_15);
            rule__Assembly__AttributesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 

            }

            // InternalFoo.g:1117:2: ( ( rule__Assembly__AttributesAssignment_6 )* )
            // InternalFoo.g:1118:3: ( rule__Assembly__AttributesAssignment_6 )*
            {
             before(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 
            // InternalFoo.g:1119:3: ( rule__Assembly__AttributesAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFoo.g:1119:4: rule__Assembly__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Assembly__AttributesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__6__Impl"


    // $ANTLR start "rule__Assembly__Group__7"
    // InternalFoo.g:1128:1: rule__Assembly__Group__7 : rule__Assembly__Group__7__Impl rule__Assembly__Group__8 ;
    public final void rule__Assembly__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1132:1: ( rule__Assembly__Group__7__Impl rule__Assembly__Group__8 )
            // InternalFoo.g:1133:2: rule__Assembly__Group__7__Impl rule__Assembly__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Assembly__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__7"


    // $ANTLR start "rule__Assembly__Group__7__Impl"
    // InternalFoo.g:1140:1: rule__Assembly__Group__7__Impl : ( 'bindings' ) ;
    public final void rule__Assembly__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1144:1: ( ( 'bindings' ) )
            // InternalFoo.g:1145:1: ( 'bindings' )
            {
            // InternalFoo.g:1145:1: ( 'bindings' )
            // InternalFoo.g:1146:2: 'bindings'
            {
             before(grammarAccess.getAssemblyAccess().getBindingsKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAssemblyAccess().getBindingsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__7__Impl"


    // $ANTLR start "rule__Assembly__Group__8"
    // InternalFoo.g:1155:1: rule__Assembly__Group__8 : rule__Assembly__Group__8__Impl rule__Assembly__Group__9 ;
    public final void rule__Assembly__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1159:1: ( rule__Assembly__Group__8__Impl rule__Assembly__Group__9 )
            // InternalFoo.g:1160:2: rule__Assembly__Group__8__Impl rule__Assembly__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Assembly__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__8"


    // $ANTLR start "rule__Assembly__Group__8__Impl"
    // InternalFoo.g:1167:1: rule__Assembly__Group__8__Impl : ( ( rule__Assembly__Group_8__0 )* ) ;
    public final void rule__Assembly__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1171:1: ( ( ( rule__Assembly__Group_8__0 )* ) )
            // InternalFoo.g:1172:1: ( ( rule__Assembly__Group_8__0 )* )
            {
            // InternalFoo.g:1172:1: ( ( rule__Assembly__Group_8__0 )* )
            // InternalFoo.g:1173:2: ( rule__Assembly__Group_8__0 )*
            {
             before(grammarAccess.getAssemblyAccess().getGroup_8()); 
            // InternalFoo.g:1174:2: ( rule__Assembly__Group_8__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFoo.g:1174:3: rule__Assembly__Group_8__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Assembly__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAssemblyAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__8__Impl"


    // $ANTLR start "rule__Assembly__Group__9"
    // InternalFoo.g:1182:1: rule__Assembly__Group__9 : rule__Assembly__Group__9__Impl ;
    public final void rule__Assembly__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1186:1: ( rule__Assembly__Group__9__Impl )
            // InternalFoo.g:1187:2: rule__Assembly__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__9"


    // $ANTLR start "rule__Assembly__Group__9__Impl"
    // InternalFoo.g:1193:1: rule__Assembly__Group__9__Impl : ( '}' ) ;
    public final void rule__Assembly__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1197:1: ( ( '}' ) )
            // InternalFoo.g:1198:1: ( '}' )
            {
            // InternalFoo.g:1198:1: ( '}' )
            // InternalFoo.g:1199:2: '}'
            {
             before(grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__9__Impl"


    // $ANTLR start "rule__Assembly__Group_8__0"
    // InternalFoo.g:1209:1: rule__Assembly__Group_8__0 : rule__Assembly__Group_8__0__Impl rule__Assembly__Group_8__1 ;
    public final void rule__Assembly__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1213:1: ( rule__Assembly__Group_8__0__Impl rule__Assembly__Group_8__1 )
            // InternalFoo.g:1214:2: rule__Assembly__Group_8__0__Impl rule__Assembly__Group_8__1
            {
            pushFollow(FOLLOW_17);
            rule__Assembly__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group_8__0"


    // $ANTLR start "rule__Assembly__Group_8__0__Impl"
    // InternalFoo.g:1221:1: rule__Assembly__Group_8__0__Impl : ( ( rule__Assembly__BindingsRequieredAssignment_8_0 ) ) ;
    public final void rule__Assembly__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1225:1: ( ( ( rule__Assembly__BindingsRequieredAssignment_8_0 ) ) )
            // InternalFoo.g:1226:1: ( ( rule__Assembly__BindingsRequieredAssignment_8_0 ) )
            {
            // InternalFoo.g:1226:1: ( ( rule__Assembly__BindingsRequieredAssignment_8_0 ) )
            // InternalFoo.g:1227:2: ( rule__Assembly__BindingsRequieredAssignment_8_0 )
            {
             before(grammarAccess.getAssemblyAccess().getBindingsRequieredAssignment_8_0()); 
            // InternalFoo.g:1228:2: ( rule__Assembly__BindingsRequieredAssignment_8_0 )
            // InternalFoo.g:1228:3: rule__Assembly__BindingsRequieredAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__BindingsRequieredAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getBindingsRequieredAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group_8__0__Impl"


    // $ANTLR start "rule__Assembly__Group_8__1"
    // InternalFoo.g:1236:1: rule__Assembly__Group_8__1 : rule__Assembly__Group_8__1__Impl rule__Assembly__Group_8__2 ;
    public final void rule__Assembly__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1240:1: ( rule__Assembly__Group_8__1__Impl rule__Assembly__Group_8__2 )
            // InternalFoo.g:1241:2: rule__Assembly__Group_8__1__Impl rule__Assembly__Group_8__2
            {
            pushFollow(FOLLOW_3);
            rule__Assembly__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group_8__1"


    // $ANTLR start "rule__Assembly__Group_8__1__Impl"
    // InternalFoo.g:1248:1: rule__Assembly__Group_8__1__Impl : ( '-' ) ;
    public final void rule__Assembly__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1252:1: ( ( '-' ) )
            // InternalFoo.g:1253:1: ( '-' )
            {
            // InternalFoo.g:1253:1: ( '-' )
            // InternalFoo.g:1254:2: '-'
            {
             before(grammarAccess.getAssemblyAccess().getHyphenMinusKeyword_8_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAssemblyAccess().getHyphenMinusKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group_8__1__Impl"


    // $ANTLR start "rule__Assembly__Group_8__2"
    // InternalFoo.g:1263:1: rule__Assembly__Group_8__2 : rule__Assembly__Group_8__2__Impl ;
    public final void rule__Assembly__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1267:1: ( rule__Assembly__Group_8__2__Impl )
            // InternalFoo.g:1268:2: rule__Assembly__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group_8__2"


    // $ANTLR start "rule__Assembly__Group_8__2__Impl"
    // InternalFoo.g:1274:1: rule__Assembly__Group_8__2__Impl : ( ( rule__Assembly__BindingsProvidedAssignment_8_2 ) ) ;
    public final void rule__Assembly__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1278:1: ( ( ( rule__Assembly__BindingsProvidedAssignment_8_2 ) ) )
            // InternalFoo.g:1279:1: ( ( rule__Assembly__BindingsProvidedAssignment_8_2 ) )
            {
            // InternalFoo.g:1279:1: ( ( rule__Assembly__BindingsProvidedAssignment_8_2 ) )
            // InternalFoo.g:1280:2: ( rule__Assembly__BindingsProvidedAssignment_8_2 )
            {
             before(grammarAccess.getAssemblyAccess().getBindingsProvidedAssignment_8_2()); 
            // InternalFoo.g:1281:2: ( rule__Assembly__BindingsProvidedAssignment_8_2 )
            // InternalFoo.g:1281:3: rule__Assembly__BindingsProvidedAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__BindingsProvidedAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getBindingsProvidedAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group_8__2__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__0"
    // InternalFoo.g:1290:1: rule__ComponentInstance__Group__0 : rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 ;
    public final void rule__ComponentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1294:1: ( rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 )
            // InternalFoo.g:1295:2: rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ComponentInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__0"


    // $ANTLR start "rule__ComponentInstance__Group__0__Impl"
    // InternalFoo.g:1302:1: rule__ComponentInstance__Group__0__Impl : ( ( rule__ComponentInstance__NameAssignment_0 ) ) ;
    public final void rule__ComponentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1306:1: ( ( ( rule__ComponentInstance__NameAssignment_0 ) ) )
            // InternalFoo.g:1307:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            {
            // InternalFoo.g:1307:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            // InternalFoo.g:1308:2: ( rule__ComponentInstance__NameAssignment_0 )
            {
             before(grammarAccess.getComponentInstanceAccess().getNameAssignment_0()); 
            // InternalFoo.g:1309:2: ( rule__ComponentInstance__NameAssignment_0 )
            // InternalFoo.g:1309:3: rule__ComponentInstance__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__0__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__1"
    // InternalFoo.g:1317:1: rule__ComponentInstance__Group__1 : rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 ;
    public final void rule__ComponentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1321:1: ( rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 )
            // InternalFoo.g:1322:2: rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__1"


    // $ANTLR start "rule__ComponentInstance__Group__1__Impl"
    // InternalFoo.g:1329:1: rule__ComponentInstance__Group__1__Impl : ( ':' ) ;
    public final void rule__ComponentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1333:1: ( ( ':' ) )
            // InternalFoo.g:1334:1: ( ':' )
            {
            // InternalFoo.g:1334:1: ( ':' )
            // InternalFoo.g:1335:2: ':'
            {
             before(grammarAccess.getComponentInstanceAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__1__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__2"
    // InternalFoo.g:1344:1: rule__ComponentInstance__Group__2 : rule__ComponentInstance__Group__2__Impl ;
    public final void rule__ComponentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1348:1: ( rule__ComponentInstance__Group__2__Impl )
            // InternalFoo.g:1349:2: rule__ComponentInstance__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__2"


    // $ANTLR start "rule__ComponentInstance__Group__2__Impl"
    // InternalFoo.g:1355:1: rule__ComponentInstance__Group__2__Impl : ( ( rule__ComponentInstance__ComponentAssignment_2 ) ) ;
    public final void rule__ComponentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1359:1: ( ( ( rule__ComponentInstance__ComponentAssignment_2 ) ) )
            // InternalFoo.g:1360:1: ( ( rule__ComponentInstance__ComponentAssignment_2 ) )
            {
            // InternalFoo.g:1360:1: ( ( rule__ComponentInstance__ComponentAssignment_2 ) )
            // InternalFoo.g:1361:2: ( rule__ComponentInstance__ComponentAssignment_2 )
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentAssignment_2()); 
            // InternalFoo.g:1362:2: ( rule__ComponentInstance__ComponentAssignment_2 )
            // InternalFoo.g:1362:3: rule__ComponentInstance__ComponentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__ComponentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getComponentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__2__Impl"


    // $ANTLR start "rule__BindingRequiered__Group__0"
    // InternalFoo.g:1371:1: rule__BindingRequiered__Group__0 : rule__BindingRequiered__Group__0__Impl rule__BindingRequiered__Group__1 ;
    public final void rule__BindingRequiered__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1375:1: ( rule__BindingRequiered__Group__0__Impl rule__BindingRequiered__Group__1 )
            // InternalFoo.g:1376:2: rule__BindingRequiered__Group__0__Impl rule__BindingRequiered__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BindingRequiered__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BindingRequiered__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingRequiered__Group__0"


    // $ANTLR start "rule__BindingRequiered__Group__0__Impl"
    // InternalFoo.g:1383:1: rule__BindingRequiered__Group__0__Impl : ( ( rule__BindingRequiered__NameAssignment_0 ) ) ;
    public final void rule__BindingRequiered__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1387:1: ( ( ( rule__BindingRequiered__NameAssignment_0 ) ) )
            // InternalFoo.g:1388:1: ( ( rule__BindingRequiered__NameAssignment_0 ) )
            {
            // InternalFoo.g:1388:1: ( ( rule__BindingRequiered__NameAssignment_0 ) )
            // InternalFoo.g:1389:2: ( rule__BindingRequiered__NameAssignment_0 )
            {
             before(grammarAccess.getBindingRequieredAccess().getNameAssignment_0()); 
            // InternalFoo.g:1390:2: ( rule__BindingRequiered__NameAssignment_0 )
            // InternalFoo.g:1390:3: rule__BindingRequiered__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BindingRequiered__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingRequieredAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingRequiered__Group__0__Impl"


    // $ANTLR start "rule__BindingRequiered__Group__1"
    // InternalFoo.g:1398:1: rule__BindingRequiered__Group__1 : rule__BindingRequiered__Group__1__Impl rule__BindingRequiered__Group__2 ;
    public final void rule__BindingRequiered__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1402:1: ( rule__BindingRequiered__Group__1__Impl rule__BindingRequiered__Group__2 )
            // InternalFoo.g:1403:2: rule__BindingRequiered__Group__1__Impl rule__BindingRequiered__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BindingRequiered__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BindingRequiered__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingRequiered__Group__1"


    // $ANTLR start "rule__BindingRequiered__Group__1__Impl"
    // InternalFoo.g:1410:1: rule__BindingRequiered__Group__1__Impl : ( '.' ) ;
    public final void rule__BindingRequiered__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1414:1: ( ( '.' ) )
            // InternalFoo.g:1415:1: ( '.' )
            {
            // InternalFoo.g:1415:1: ( '.' )
            // InternalFoo.g:1416:2: '.'
            {
             before(grammarAccess.getBindingRequieredAccess().getFullStopKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBindingRequieredAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingRequiered__Group__1__Impl"


    // $ANTLR start "rule__BindingRequiered__Group__2"
    // InternalFoo.g:1425:1: rule__BindingRequiered__Group__2 : rule__BindingRequiered__Group__2__Impl ;
    public final void rule__BindingRequiered__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1429:1: ( rule__BindingRequiered__Group__2__Impl )
            // InternalFoo.g:1430:2: rule__BindingRequiered__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BindingRequiered__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingRequiered__Group__2"


    // $ANTLR start "rule__BindingRequiered__Group__2__Impl"
    // InternalFoo.g:1436:1: rule__BindingRequiered__Group__2__Impl : ( ( rule__BindingRequiered__ServiceAssignment_2 ) ) ;
    public final void rule__BindingRequiered__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1440:1: ( ( ( rule__BindingRequiered__ServiceAssignment_2 ) ) )
            // InternalFoo.g:1441:1: ( ( rule__BindingRequiered__ServiceAssignment_2 ) )
            {
            // InternalFoo.g:1441:1: ( ( rule__BindingRequiered__ServiceAssignment_2 ) )
            // InternalFoo.g:1442:2: ( rule__BindingRequiered__ServiceAssignment_2 )
            {
             before(grammarAccess.getBindingRequieredAccess().getServiceAssignment_2()); 
            // InternalFoo.g:1443:2: ( rule__BindingRequiered__ServiceAssignment_2 )
            // InternalFoo.g:1443:3: rule__BindingRequiered__ServiceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BindingRequiered__ServiceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingRequieredAccess().getServiceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingRequiered__Group__2__Impl"


    // $ANTLR start "rule__BindingProvided__Group__0"
    // InternalFoo.g:1452:1: rule__BindingProvided__Group__0 : rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1 ;
    public final void rule__BindingProvided__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1456:1: ( rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1 )
            // InternalFoo.g:1457:2: rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BindingProvided__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BindingProvided__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingProvided__Group__0"


    // $ANTLR start "rule__BindingProvided__Group__0__Impl"
    // InternalFoo.g:1464:1: rule__BindingProvided__Group__0__Impl : ( ( rule__BindingProvided__NameAssignment_0 ) ) ;
    public final void rule__BindingProvided__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1468:1: ( ( ( rule__BindingProvided__NameAssignment_0 ) ) )
            // InternalFoo.g:1469:1: ( ( rule__BindingProvided__NameAssignment_0 ) )
            {
            // InternalFoo.g:1469:1: ( ( rule__BindingProvided__NameAssignment_0 ) )
            // InternalFoo.g:1470:2: ( rule__BindingProvided__NameAssignment_0 )
            {
             before(grammarAccess.getBindingProvidedAccess().getNameAssignment_0()); 
            // InternalFoo.g:1471:2: ( rule__BindingProvided__NameAssignment_0 )
            // InternalFoo.g:1471:3: rule__BindingProvided__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BindingProvided__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingProvidedAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingProvided__Group__0__Impl"


    // $ANTLR start "rule__BindingProvided__Group__1"
    // InternalFoo.g:1479:1: rule__BindingProvided__Group__1 : rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2 ;
    public final void rule__BindingProvided__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1483:1: ( rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2 )
            // InternalFoo.g:1484:2: rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BindingProvided__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BindingProvided__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingProvided__Group__1"


    // $ANTLR start "rule__BindingProvided__Group__1__Impl"
    // InternalFoo.g:1491:1: rule__BindingProvided__Group__1__Impl : ( '.' ) ;
    public final void rule__BindingProvided__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1495:1: ( ( '.' ) )
            // InternalFoo.g:1496:1: ( '.' )
            {
            // InternalFoo.g:1496:1: ( '.' )
            // InternalFoo.g:1497:2: '.'
            {
             before(grammarAccess.getBindingProvidedAccess().getFullStopKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBindingProvidedAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingProvided__Group__1__Impl"


    // $ANTLR start "rule__BindingProvided__Group__2"
    // InternalFoo.g:1506:1: rule__BindingProvided__Group__2 : rule__BindingProvided__Group__2__Impl ;
    public final void rule__BindingProvided__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1510:1: ( rule__BindingProvided__Group__2__Impl )
            // InternalFoo.g:1511:2: rule__BindingProvided__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BindingProvided__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingProvided__Group__2"


    // $ANTLR start "rule__BindingProvided__Group__2__Impl"
    // InternalFoo.g:1517:1: rule__BindingProvided__Group__2__Impl : ( ( rule__BindingProvided__ServiceAssignment_2 ) ) ;
    public final void rule__BindingProvided__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1521:1: ( ( ( rule__BindingProvided__ServiceAssignment_2 ) ) )
            // InternalFoo.g:1522:1: ( ( rule__BindingProvided__ServiceAssignment_2 ) )
            {
            // InternalFoo.g:1522:1: ( ( rule__BindingProvided__ServiceAssignment_2 ) )
            // InternalFoo.g:1523:2: ( rule__BindingProvided__ServiceAssignment_2 )
            {
             before(grammarAccess.getBindingProvidedAccess().getServiceAssignment_2()); 
            // InternalFoo.g:1524:2: ( rule__BindingProvided__ServiceAssignment_2 )
            // InternalFoo.g:1524:3: rule__BindingProvided__ServiceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BindingProvided__ServiceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingProvidedAccess().getServiceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingProvided__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalFoo.g:1533:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1537:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalFoo.g:1538:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalFoo.g:1545:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1549:1: ( ( 'Component' ) )
            // InternalFoo.g:1550:1: ( 'Component' )
            {
            // InternalFoo.g:1550:1: ( 'Component' )
            // InternalFoo.g:1551:2: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalFoo.g:1560:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1564:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalFoo.g:1565:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalFoo.g:1572:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1576:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalFoo.g:1577:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalFoo.g:1577:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalFoo.g:1578:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalFoo.g:1579:2: ( rule__Component__NameAssignment_1 )
            // InternalFoo.g:1579:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalFoo.g:1587:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1591:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalFoo.g:1592:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalFoo.g:1599:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1603:1: ( ( '{' ) )
            // InternalFoo.g:1604:1: ( '{' )
            {
            // InternalFoo.g:1604:1: ( '{' )
            // InternalFoo.g:1605:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalFoo.g:1614:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1618:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalFoo.g:1619:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalFoo.g:1626:1: rule__Component__Group__3__Impl : ( ( rule__Component__ListOfPServicesAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1630:1: ( ( ( rule__Component__ListOfPServicesAssignment_3 ) ) )
            // InternalFoo.g:1631:1: ( ( rule__Component__ListOfPServicesAssignment_3 ) )
            {
            // InternalFoo.g:1631:1: ( ( rule__Component__ListOfPServicesAssignment_3 ) )
            // InternalFoo.g:1632:2: ( rule__Component__ListOfPServicesAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getListOfPServicesAssignment_3()); 
            // InternalFoo.g:1633:2: ( rule__Component__ListOfPServicesAssignment_3 )
            // InternalFoo.g:1633:3: rule__Component__ListOfPServicesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Component__ListOfPServicesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getListOfPServicesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalFoo.g:1641:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1645:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalFoo.g:1646:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalFoo.g:1653:1: rule__Component__Group__4__Impl : ( ( rule__Component__ListOfRServicesAssignment_4 ) ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1657:1: ( ( ( rule__Component__ListOfRServicesAssignment_4 ) ) )
            // InternalFoo.g:1658:1: ( ( rule__Component__ListOfRServicesAssignment_4 ) )
            {
            // InternalFoo.g:1658:1: ( ( rule__Component__ListOfRServicesAssignment_4 ) )
            // InternalFoo.g:1659:2: ( rule__Component__ListOfRServicesAssignment_4 )
            {
             before(grammarAccess.getComponentAccess().getListOfRServicesAssignment_4()); 
            // InternalFoo.g:1660:2: ( rule__Component__ListOfRServicesAssignment_4 )
            // InternalFoo.g:1660:3: rule__Component__ListOfRServicesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Component__ListOfRServicesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getListOfRServicesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // InternalFoo.g:1668:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1672:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalFoo.g:1673:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // InternalFoo.g:1680:1: rule__Component__Group__5__Impl : ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1684:1: ( ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) ) )
            // InternalFoo.g:1685:1: ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) )
            {
            // InternalFoo.g:1685:1: ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) )
            // InternalFoo.g:1686:2: ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* )
            {
            // InternalFoo.g:1686:2: ( ( rule__Component__MProvServicesAssignment_5 ) )
            // InternalFoo.g:1687:3: ( rule__Component__MProvServicesAssignment_5 )
            {
             before(grammarAccess.getComponentAccess().getMProvServicesAssignment_5()); 
            // InternalFoo.g:1688:3: ( rule__Component__MProvServicesAssignment_5 )
            // InternalFoo.g:1688:4: rule__Component__MProvServicesAssignment_5
            {
            pushFollow(FOLLOW_23);
            rule__Component__MProvServicesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getMProvServicesAssignment_5()); 

            }

            // InternalFoo.g:1691:2: ( ( rule__Component__MProvServicesAssignment_5 )* )
            // InternalFoo.g:1692:3: ( rule__Component__MProvServicesAssignment_5 )*
            {
             before(grammarAccess.getComponentAccess().getMProvServicesAssignment_5()); 
            // InternalFoo.g:1693:3: ( rule__Component__MProvServicesAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==23) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalFoo.g:1693:4: rule__Component__MProvServicesAssignment_5
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Component__MProvServicesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getMProvServicesAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // InternalFoo.g:1702:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1706:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalFoo.g:1707:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Component__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // InternalFoo.g:1714:1: rule__Component__Group__6__Impl : ( ( rule__Component__MReqServicesAssignment_6 )* ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1718:1: ( ( ( rule__Component__MReqServicesAssignment_6 )* ) )
            // InternalFoo.g:1719:1: ( ( rule__Component__MReqServicesAssignment_6 )* )
            {
            // InternalFoo.g:1719:1: ( ( rule__Component__MReqServicesAssignment_6 )* )
            // InternalFoo.g:1720:2: ( rule__Component__MReqServicesAssignment_6 )*
            {
             before(grammarAccess.getComponentAccess().getMReqServicesAssignment_6()); 
            // InternalFoo.g:1721:2: ( rule__Component__MReqServicesAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFoo.g:1721:3: rule__Component__MReqServicesAssignment_6
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Component__MReqServicesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getMReqServicesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group__7"
    // InternalFoo.g:1729:1: rule__Component__Group__7 : rule__Component__Group__7__Impl ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1733:1: ( rule__Component__Group__7__Impl )
            // InternalFoo.g:1734:2: rule__Component__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7"


    // $ANTLR start "rule__Component__Group__7__Impl"
    // InternalFoo.g:1740:1: rule__Component__Group__7__Impl : ( '}' ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1744:1: ( ( '}' ) )
            // InternalFoo.g:1745:1: ( '}' )
            {
            // InternalFoo.g:1745:1: ( '}' )
            // InternalFoo.g:1746:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group__0"
    // InternalFoo.g:1756:1: rule__ListOfProvidedServices__Group__0 : rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1 ;
    public final void rule__ListOfProvidedServices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1760:1: ( rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1 )
            // InternalFoo.g:1761:2: rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ListOfProvidedServices__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group__0"


    // $ANTLR start "rule__ListOfProvidedServices__Group__0__Impl"
    // InternalFoo.g:1768:1: rule__ListOfProvidedServices__Group__0__Impl : ( 'provided' ) ;
    public final void rule__ListOfProvidedServices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1772:1: ( ( 'provided' ) )
            // InternalFoo.g:1773:1: ( 'provided' )
            {
            // InternalFoo.g:1773:1: ( 'provided' )
            // InternalFoo.g:1774:2: 'provided'
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getProvidedKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getListOfProvidedServicesAccess().getProvidedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group__0__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group__1"
    // InternalFoo.g:1783:1: rule__ListOfProvidedServices__Group__1 : rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2 ;
    public final void rule__ListOfProvidedServices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1787:1: ( rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2 )
            // InternalFoo.g:1788:2: rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ListOfProvidedServices__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group__1"


    // $ANTLR start "rule__ListOfProvidedServices__Group__1__Impl"
    // InternalFoo.g:1795:1: rule__ListOfProvidedServices__Group__1__Impl : ( '=' ) ;
    public final void rule__ListOfProvidedServices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1799:1: ( ( '=' ) )
            // InternalFoo.g:1800:1: ( '=' )
            {
            // InternalFoo.g:1800:1: ( '=' )
            // InternalFoo.g:1801:2: '='
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getListOfProvidedServicesAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group__1__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group__2"
    // InternalFoo.g:1810:1: rule__ListOfProvidedServices__Group__2 : rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3 ;
    public final void rule__ListOfProvidedServices__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1814:1: ( rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3 )
            // InternalFoo.g:1815:2: rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ListOfProvidedServices__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group__2"


    // $ANTLR start "rule__ListOfProvidedServices__Group__2__Impl"
    // InternalFoo.g:1822:1: rule__ListOfProvidedServices__Group__2__Impl : ( '{' ) ;
    public final void rule__ListOfProvidedServices__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1826:1: ( ( '{' ) )
            // InternalFoo.g:1827:1: ( '{' )
            {
            // InternalFoo.g:1827:1: ( '{' )
            // InternalFoo.g:1828:2: '{'
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getListOfProvidedServicesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group__2__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group__3"
    // InternalFoo.g:1837:1: rule__ListOfProvidedServices__Group__3 : rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4 ;
    public final void rule__ListOfProvidedServices__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1841:1: ( rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4 )
            // InternalFoo.g:1842:2: rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ListOfProvidedServices__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group__3"


    // $ANTLR start "rule__ListOfProvidedServices__Group__3__Impl"
    // InternalFoo.g:1849:1: rule__ListOfProvidedServices__Group__3__Impl : ( ( rule__ListOfProvidedServices__Group_3__0 ) ) ;
    public final void rule__ListOfProvidedServices__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1853:1: ( ( ( rule__ListOfProvidedServices__Group_3__0 ) ) )
            // InternalFoo.g:1854:1: ( ( rule__ListOfProvidedServices__Group_3__0 ) )
            {
            // InternalFoo.g:1854:1: ( ( rule__ListOfProvidedServices__Group_3__0 ) )
            // InternalFoo.g:1855:2: ( rule__ListOfProvidedServices__Group_3__0 )
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getGroup_3()); 
            // InternalFoo.g:1856:2: ( rule__ListOfProvidedServices__Group_3__0 )
            // InternalFoo.g:1856:3: rule__ListOfProvidedServices__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfProvidedServicesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group__3__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group__4"
    // InternalFoo.g:1864:1: rule__ListOfProvidedServices__Group__4 : rule__ListOfProvidedServices__Group__4__Impl ;
    public final void rule__ListOfProvidedServices__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1868:1: ( rule__ListOfProvidedServices__Group__4__Impl )
            // InternalFoo.g:1869:2: rule__ListOfProvidedServices__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group__4"


    // $ANTLR start "rule__ListOfProvidedServices__Group__4__Impl"
    // InternalFoo.g:1875:1: rule__ListOfProvidedServices__Group__4__Impl : ( '}' ) ;
    public final void rule__ListOfProvidedServices__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1879:1: ( ( '}' ) )
            // InternalFoo.g:1880:1: ( '}' )
            {
            // InternalFoo.g:1880:1: ( '}' )
            // InternalFoo.g:1881:2: '}'
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getListOfProvidedServicesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group__4__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group_3__0"
    // InternalFoo.g:1891:1: rule__ListOfProvidedServices__Group_3__0 : rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1 ;
    public final void rule__ListOfProvidedServices__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1895:1: ( rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1 )
            // InternalFoo.g:1896:2: rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1
            {
            pushFollow(FOLLOW_26);
            rule__ListOfProvidedServices__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group_3__0"


    // $ANTLR start "rule__ListOfProvidedServices__Group_3__0__Impl"
    // InternalFoo.g:1903:1: rule__ListOfProvidedServices__Group_3__0__Impl : ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) ) ;
    public final void rule__ListOfProvidedServices__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1907:1: ( ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) ) )
            // InternalFoo.g:1908:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) )
            {
            // InternalFoo.g:1908:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) )
            // InternalFoo.g:1909:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 )
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_0()); 
            // InternalFoo.g:1910:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 )
            // InternalFoo.g:1910:3: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group_3__0__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group_3__1"
    // InternalFoo.g:1918:1: rule__ListOfProvidedServices__Group_3__1 : rule__ListOfProvidedServices__Group_3__1__Impl ;
    public final void rule__ListOfProvidedServices__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1922:1: ( rule__ListOfProvidedServices__Group_3__1__Impl )
            // InternalFoo.g:1923:2: rule__ListOfProvidedServices__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group_3__1"


    // $ANTLR start "rule__ListOfProvidedServices__Group_3__1__Impl"
    // InternalFoo.g:1929:1: rule__ListOfProvidedServices__Group_3__1__Impl : ( ( rule__ListOfProvidedServices__Group_3_1__0 )* ) ;
    public final void rule__ListOfProvidedServices__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1933:1: ( ( ( rule__ListOfProvidedServices__Group_3_1__0 )* ) )
            // InternalFoo.g:1934:1: ( ( rule__ListOfProvidedServices__Group_3_1__0 )* )
            {
            // InternalFoo.g:1934:1: ( ( rule__ListOfProvidedServices__Group_3_1__0 )* )
            // InternalFoo.g:1935:2: ( rule__ListOfProvidedServices__Group_3_1__0 )*
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getGroup_3_1()); 
            // InternalFoo.g:1936:2: ( rule__ListOfProvidedServices__Group_3_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFoo.g:1936:3: rule__ListOfProvidedServices__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__ListOfProvidedServices__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getListOfProvidedServicesAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group_3__1__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group_3_1__0"
    // InternalFoo.g:1945:1: rule__ListOfProvidedServices__Group_3_1__0 : rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1 ;
    public final void rule__ListOfProvidedServices__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1949:1: ( rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1 )
            // InternalFoo.g:1950:2: rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ListOfProvidedServices__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group_3_1__0"


    // $ANTLR start "rule__ListOfProvidedServices__Group_3_1__0__Impl"
    // InternalFoo.g:1957:1: rule__ListOfProvidedServices__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfProvidedServices__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1961:1: ( ( ',' ) )
            // InternalFoo.g:1962:1: ( ',' )
            {
            // InternalFoo.g:1962:1: ( ',' )
            // InternalFoo.g:1963:2: ','
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getCommaKeyword_3_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getListOfProvidedServicesAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group_3_1__0__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group_3_1__1"
    // InternalFoo.g:1972:1: rule__ListOfProvidedServices__Group_3_1__1 : rule__ListOfProvidedServices__Group_3_1__1__Impl ;
    public final void rule__ListOfProvidedServices__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1976:1: ( rule__ListOfProvidedServices__Group_3_1__1__Impl )
            // InternalFoo.g:1977:2: rule__ListOfProvidedServices__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group_3_1__1"


    // $ANTLR start "rule__ListOfProvidedServices__Group_3_1__1__Impl"
    // InternalFoo.g:1983:1: rule__ListOfProvidedServices__Group_3_1__1__Impl : ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) ) ;
    public final void rule__ListOfProvidedServices__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1987:1: ( ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) ) )
            // InternalFoo.g:1988:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) )
            {
            // InternalFoo.g:1988:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) )
            // InternalFoo.g:1989:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 )
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_1_1()); 
            // InternalFoo.g:1990:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 )
            // InternalFoo.g:1990:3: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__Group_3_1__1__Impl"


    // $ANTLR start "rule__ListOfRequieredServices__Group__0"
    // InternalFoo.g:1999:1: rule__ListOfRequieredServices__Group__0 : rule__ListOfRequieredServices__Group__0__Impl rule__ListOfRequieredServices__Group__1 ;
    public final void rule__ListOfRequieredServices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2003:1: ( rule__ListOfRequieredServices__Group__0__Impl rule__ListOfRequieredServices__Group__1 )
            // InternalFoo.g:2004:2: rule__ListOfRequieredServices__Group__0__Impl rule__ListOfRequieredServices__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ListOfRequieredServices__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfRequieredServices__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group__0"


    // $ANTLR start "rule__ListOfRequieredServices__Group__0__Impl"
    // InternalFoo.g:2011:1: rule__ListOfRequieredServices__Group__0__Impl : ( () ) ;
    public final void rule__ListOfRequieredServices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2015:1: ( ( () ) )
            // InternalFoo.g:2016:1: ( () )
            {
            // InternalFoo.g:2016:1: ( () )
            // InternalFoo.g:2017:2: ()
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getListOfRequieredServicesAction_0()); 
            // InternalFoo.g:2018:2: ()
            // InternalFoo.g:2018:3: 
            {
            }

             after(grammarAccess.getListOfRequieredServicesAccess().getListOfRequieredServicesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group__0__Impl"


    // $ANTLR start "rule__ListOfRequieredServices__Group__1"
    // InternalFoo.g:2026:1: rule__ListOfRequieredServices__Group__1 : rule__ListOfRequieredServices__Group__1__Impl rule__ListOfRequieredServices__Group__2 ;
    public final void rule__ListOfRequieredServices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2030:1: ( rule__ListOfRequieredServices__Group__1__Impl rule__ListOfRequieredServices__Group__2 )
            // InternalFoo.g:2031:2: rule__ListOfRequieredServices__Group__1__Impl rule__ListOfRequieredServices__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ListOfRequieredServices__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfRequieredServices__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group__1"


    // $ANTLR start "rule__ListOfRequieredServices__Group__1__Impl"
    // InternalFoo.g:2038:1: rule__ListOfRequieredServices__Group__1__Impl : ( 'requiered' ) ;
    public final void rule__ListOfRequieredServices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2042:1: ( ( 'requiered' ) )
            // InternalFoo.g:2043:1: ( 'requiered' )
            {
            // InternalFoo.g:2043:1: ( 'requiered' )
            // InternalFoo.g:2044:2: 'requiered'
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getRequieredKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getListOfRequieredServicesAccess().getRequieredKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group__1__Impl"


    // $ANTLR start "rule__ListOfRequieredServices__Group__2"
    // InternalFoo.g:2053:1: rule__ListOfRequieredServices__Group__2 : rule__ListOfRequieredServices__Group__2__Impl rule__ListOfRequieredServices__Group__3 ;
    public final void rule__ListOfRequieredServices__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2057:1: ( rule__ListOfRequieredServices__Group__2__Impl rule__ListOfRequieredServices__Group__3 )
            // InternalFoo.g:2058:2: rule__ListOfRequieredServices__Group__2__Impl rule__ListOfRequieredServices__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ListOfRequieredServices__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfRequieredServices__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group__2"


    // $ANTLR start "rule__ListOfRequieredServices__Group__2__Impl"
    // InternalFoo.g:2065:1: rule__ListOfRequieredServices__Group__2__Impl : ( '=' ) ;
    public final void rule__ListOfRequieredServices__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2069:1: ( ( '=' ) )
            // InternalFoo.g:2070:1: ( '=' )
            {
            // InternalFoo.g:2070:1: ( '=' )
            // InternalFoo.g:2071:2: '='
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getListOfRequieredServicesAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group__2__Impl"


    // $ANTLR start "rule__ListOfRequieredServices__Group__3"
    // InternalFoo.g:2080:1: rule__ListOfRequieredServices__Group__3 : rule__ListOfRequieredServices__Group__3__Impl rule__ListOfRequieredServices__Group__4 ;
    public final void rule__ListOfRequieredServices__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2084:1: ( rule__ListOfRequieredServices__Group__3__Impl rule__ListOfRequieredServices__Group__4 )
            // InternalFoo.g:2085:2: rule__ListOfRequieredServices__Group__3__Impl rule__ListOfRequieredServices__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ListOfRequieredServices__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfRequieredServices__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group__3"


    // $ANTLR start "rule__ListOfRequieredServices__Group__3__Impl"
    // InternalFoo.g:2092:1: rule__ListOfRequieredServices__Group__3__Impl : ( '{' ) ;
    public final void rule__ListOfRequieredServices__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2096:1: ( ( '{' ) )
            // InternalFoo.g:2097:1: ( '{' )
            {
            // InternalFoo.g:2097:1: ( '{' )
            // InternalFoo.g:2098:2: '{'
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getListOfRequieredServicesAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group__3__Impl"


    // $ANTLR start "rule__ListOfRequieredServices__Group__4"
    // InternalFoo.g:2107:1: rule__ListOfRequieredServices__Group__4 : rule__ListOfRequieredServices__Group__4__Impl rule__ListOfRequieredServices__Group__5 ;
    public final void rule__ListOfRequieredServices__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2111:1: ( rule__ListOfRequieredServices__Group__4__Impl rule__ListOfRequieredServices__Group__5 )
            // InternalFoo.g:2112:2: rule__ListOfRequieredServices__Group__4__Impl rule__ListOfRequieredServices__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__ListOfRequieredServices__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfRequieredServices__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group__4"


    // $ANTLR start "rule__ListOfRequieredServices__Group__4__Impl"
    // InternalFoo.g:2119:1: rule__ListOfRequieredServices__Group__4__Impl : ( ( rule__ListOfRequieredServices__Group_4__0 ) ) ;
    public final void rule__ListOfRequieredServices__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2123:1: ( ( ( rule__ListOfRequieredServices__Group_4__0 ) ) )
            // InternalFoo.g:2124:1: ( ( rule__ListOfRequieredServices__Group_4__0 ) )
            {
            // InternalFoo.g:2124:1: ( ( rule__ListOfRequieredServices__Group_4__0 ) )
            // InternalFoo.g:2125:2: ( rule__ListOfRequieredServices__Group_4__0 )
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getGroup_4()); 
            // InternalFoo.g:2126:2: ( rule__ListOfRequieredServices__Group_4__0 )
            // InternalFoo.g:2126:3: rule__ListOfRequieredServices__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfRequieredServices__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfRequieredServicesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group__4__Impl"


    // $ANTLR start "rule__ListOfRequieredServices__Group__5"
    // InternalFoo.g:2134:1: rule__ListOfRequieredServices__Group__5 : rule__ListOfRequieredServices__Group__5__Impl ;
    public final void rule__ListOfRequieredServices__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2138:1: ( rule__ListOfRequieredServices__Group__5__Impl )
            // InternalFoo.g:2139:2: rule__ListOfRequieredServices__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfRequieredServices__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group__5"


    // $ANTLR start "rule__ListOfRequieredServices__Group__5__Impl"
    // InternalFoo.g:2145:1: rule__ListOfRequieredServices__Group__5__Impl : ( '}' ) ;
    public final void rule__ListOfRequieredServices__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2149:1: ( ( '}' ) )
            // InternalFoo.g:2150:1: ( '}' )
            {
            // InternalFoo.g:2150:1: ( '}' )
            // InternalFoo.g:2151:2: '}'
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getListOfRequieredServicesAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group__5__Impl"


    // $ANTLR start "rule__ListOfRequieredServices__Group_4__0"
    // InternalFoo.g:2161:1: rule__ListOfRequieredServices__Group_4__0 : rule__ListOfRequieredServices__Group_4__0__Impl rule__ListOfRequieredServices__Group_4__1 ;
    public final void rule__ListOfRequieredServices__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2165:1: ( rule__ListOfRequieredServices__Group_4__0__Impl rule__ListOfRequieredServices__Group_4__1 )
            // InternalFoo.g:2166:2: rule__ListOfRequieredServices__Group_4__0__Impl rule__ListOfRequieredServices__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__ListOfRequieredServices__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfRequieredServices__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group_4__0"


    // $ANTLR start "rule__ListOfRequieredServices__Group_4__0__Impl"
    // InternalFoo.g:2173:1: rule__ListOfRequieredServices__Group_4__0__Impl : ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_0 )? ) ;
    public final void rule__ListOfRequieredServices__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2177:1: ( ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_0 )? ) )
            // InternalFoo.g:2178:1: ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_0 )? )
            {
            // InternalFoo.g:2178:1: ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_0 )? )
            // InternalFoo.g:2179:2: ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_0 )?
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getRequieredServicesAssignment_4_0()); 
            // InternalFoo.g:2180:2: ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFoo.g:2180:3: rule__ListOfRequieredServices__RequieredServicesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListOfRequieredServices__RequieredServicesAssignment_4_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListOfRequieredServicesAccess().getRequieredServicesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group_4__0__Impl"


    // $ANTLR start "rule__ListOfRequieredServices__Group_4__1"
    // InternalFoo.g:2188:1: rule__ListOfRequieredServices__Group_4__1 : rule__ListOfRequieredServices__Group_4__1__Impl ;
    public final void rule__ListOfRequieredServices__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2192:1: ( rule__ListOfRequieredServices__Group_4__1__Impl )
            // InternalFoo.g:2193:2: rule__ListOfRequieredServices__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfRequieredServices__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group_4__1"


    // $ANTLR start "rule__ListOfRequieredServices__Group_4__1__Impl"
    // InternalFoo.g:2199:1: rule__ListOfRequieredServices__Group_4__1__Impl : ( ( rule__ListOfRequieredServices__Group_4_1__0 )* ) ;
    public final void rule__ListOfRequieredServices__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2203:1: ( ( ( rule__ListOfRequieredServices__Group_4_1__0 )* ) )
            // InternalFoo.g:2204:1: ( ( rule__ListOfRequieredServices__Group_4_1__0 )* )
            {
            // InternalFoo.g:2204:1: ( ( rule__ListOfRequieredServices__Group_4_1__0 )* )
            // InternalFoo.g:2205:2: ( rule__ListOfRequieredServices__Group_4_1__0 )*
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getGroup_4_1()); 
            // InternalFoo.g:2206:2: ( rule__ListOfRequieredServices__Group_4_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFoo.g:2206:3: rule__ListOfRequieredServices__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__ListOfRequieredServices__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getListOfRequieredServicesAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group_4__1__Impl"


    // $ANTLR start "rule__ListOfRequieredServices__Group_4_1__0"
    // InternalFoo.g:2215:1: rule__ListOfRequieredServices__Group_4_1__0 : rule__ListOfRequieredServices__Group_4_1__0__Impl rule__ListOfRequieredServices__Group_4_1__1 ;
    public final void rule__ListOfRequieredServices__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2219:1: ( rule__ListOfRequieredServices__Group_4_1__0__Impl rule__ListOfRequieredServices__Group_4_1__1 )
            // InternalFoo.g:2220:2: rule__ListOfRequieredServices__Group_4_1__0__Impl rule__ListOfRequieredServices__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ListOfRequieredServices__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfRequieredServices__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group_4_1__0"


    // $ANTLR start "rule__ListOfRequieredServices__Group_4_1__0__Impl"
    // InternalFoo.g:2227:1: rule__ListOfRequieredServices__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfRequieredServices__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2231:1: ( ( ',' ) )
            // InternalFoo.g:2232:1: ( ',' )
            {
            // InternalFoo.g:2232:1: ( ',' )
            // InternalFoo.g:2233:2: ','
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getCommaKeyword_4_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getListOfRequieredServicesAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group_4_1__0__Impl"


    // $ANTLR start "rule__ListOfRequieredServices__Group_4_1__1"
    // InternalFoo.g:2242:1: rule__ListOfRequieredServices__Group_4_1__1 : rule__ListOfRequieredServices__Group_4_1__1__Impl ;
    public final void rule__ListOfRequieredServices__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2246:1: ( rule__ListOfRequieredServices__Group_4_1__1__Impl )
            // InternalFoo.g:2247:2: rule__ListOfRequieredServices__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfRequieredServices__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group_4_1__1"


    // $ANTLR start "rule__ListOfRequieredServices__Group_4_1__1__Impl"
    // InternalFoo.g:2253:1: rule__ListOfRequieredServices__Group_4_1__1__Impl : ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1 ) ) ;
    public final void rule__ListOfRequieredServices__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2257:1: ( ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1 ) ) )
            // InternalFoo.g:2258:1: ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1 ) )
            {
            // InternalFoo.g:2258:1: ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1 ) )
            // InternalFoo.g:2259:2: ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1 )
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getRequieredServicesAssignment_4_1_1()); 
            // InternalFoo.g:2260:2: ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1 )
            // InternalFoo.g:2260:3: rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getListOfRequieredServicesAccess().getRequieredServicesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__Group_4_1__1__Impl"


    // $ANTLR start "rule__MProvidedService__Group__0"
    // InternalFoo.g:2269:1: rule__MProvidedService__Group__0 : rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1 ;
    public final void rule__MProvidedService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2273:1: ( rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1 )
            // InternalFoo.g:2274:2: rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MProvidedService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MProvidedService__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MProvidedService__Group__0"


    // $ANTLR start "rule__MProvidedService__Group__0__Impl"
    // InternalFoo.g:2281:1: rule__MProvidedService__Group__0__Impl : ( 'service' ) ;
    public final void rule__MProvidedService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2285:1: ( ( 'service' ) )
            // InternalFoo.g:2286:1: ( 'service' )
            {
            // InternalFoo.g:2286:1: ( 'service' )
            // InternalFoo.g:2287:2: 'service'
            {
             before(grammarAccess.getMProvidedServiceAccess().getServiceKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMProvidedServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MProvidedService__Group__0__Impl"


    // $ANTLR start "rule__MProvidedService__Group__1"
    // InternalFoo.g:2296:1: rule__MProvidedService__Group__1 : rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2 ;
    public final void rule__MProvidedService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2300:1: ( rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2 )
            // InternalFoo.g:2301:2: rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MProvidedService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MProvidedService__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MProvidedService__Group__1"


    // $ANTLR start "rule__MProvidedService__Group__1__Impl"
    // InternalFoo.g:2308:1: rule__MProvidedService__Group__1__Impl : ( 'provided' ) ;
    public final void rule__MProvidedService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2312:1: ( ( 'provided' ) )
            // InternalFoo.g:2313:1: ( 'provided' )
            {
            // InternalFoo.g:2313:1: ( 'provided' )
            // InternalFoo.g:2314:2: 'provided'
            {
             before(grammarAccess.getMProvidedServiceAccess().getProvidedKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMProvidedServiceAccess().getProvidedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MProvidedService__Group__1__Impl"


    // $ANTLR start "rule__MProvidedService__Group__2"
    // InternalFoo.g:2323:1: rule__MProvidedService__Group__2 : rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3 ;
    public final void rule__MProvidedService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2327:1: ( rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3 )
            // InternalFoo.g:2328:2: rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__MProvidedService__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MProvidedService__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MProvidedService__Group__2"


    // $ANTLR start "rule__MProvidedService__Group__2__Impl"
    // InternalFoo.g:2335:1: rule__MProvidedService__Group__2__Impl : ( ( rule__MProvidedService__SignatureAssignment_2 ) ) ;
    public final void rule__MProvidedService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2339:1: ( ( ( rule__MProvidedService__SignatureAssignment_2 ) ) )
            // InternalFoo.g:2340:1: ( ( rule__MProvidedService__SignatureAssignment_2 ) )
            {
            // InternalFoo.g:2340:1: ( ( rule__MProvidedService__SignatureAssignment_2 ) )
            // InternalFoo.g:2341:2: ( rule__MProvidedService__SignatureAssignment_2 )
            {
             before(grammarAccess.getMProvidedServiceAccess().getSignatureAssignment_2()); 
            // InternalFoo.g:2342:2: ( rule__MProvidedService__SignatureAssignment_2 )
            // InternalFoo.g:2342:3: rule__MProvidedService__SignatureAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MProvidedService__SignatureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMProvidedServiceAccess().getSignatureAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MProvidedService__Group__2__Impl"


    // $ANTLR start "rule__MProvidedService__Group__3"
    // InternalFoo.g:2350:1: rule__MProvidedService__Group__3 : rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4 ;
    public final void rule__MProvidedService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2354:1: ( rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4 )
            // InternalFoo.g:2355:2: rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__MProvidedService__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MProvidedService__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MProvidedService__Group__3"


    // $ANTLR start "rule__MProvidedService__Group__3__Impl"
    // InternalFoo.g:2362:1: rule__MProvidedService__Group__3__Impl : ( '{' ) ;
    public final void rule__MProvidedService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2366:1: ( ( '{' ) )
            // InternalFoo.g:2367:1: ( '{' )
            {
            // InternalFoo.g:2367:1: ( '{' )
            // InternalFoo.g:2368:2: '{'
            {
             before(grammarAccess.getMProvidedServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMProvidedServiceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MProvidedService__Group__3__Impl"


    // $ANTLR start "rule__MProvidedService__Group__4"
    // InternalFoo.g:2377:1: rule__MProvidedService__Group__4 : rule__MProvidedService__Group__4__Impl ;
    public final void rule__MProvidedService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2381:1: ( rule__MProvidedService__Group__4__Impl )
            // InternalFoo.g:2382:2: rule__MProvidedService__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MProvidedService__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MProvidedService__Group__4"


    // $ANTLR start "rule__MProvidedService__Group__4__Impl"
    // InternalFoo.g:2388:1: rule__MProvidedService__Group__4__Impl : ( '}' ) ;
    public final void rule__MProvidedService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2392:1: ( ( '}' ) )
            // InternalFoo.g:2393:1: ( '}' )
            {
            // InternalFoo.g:2393:1: ( '}' )
            // InternalFoo.g:2394:2: '}'
            {
             before(grammarAccess.getMProvidedServiceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMProvidedServiceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MProvidedService__Group__4__Impl"


    // $ANTLR start "rule__PSignature__Group__0"
    // InternalFoo.g:2404:1: rule__PSignature__Group__0 : rule__PSignature__Group__0__Impl rule__PSignature__Group__1 ;
    public final void rule__PSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2408:1: ( rule__PSignature__Group__0__Impl rule__PSignature__Group__1 )
            // InternalFoo.g:2409:2: rule__PSignature__Group__0__Impl rule__PSignature__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PSignature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PSignature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group__0"


    // $ANTLR start "rule__PSignature__Group__0__Impl"
    // InternalFoo.g:2416:1: rule__PSignature__Group__0__Impl : ( ( rule__PSignature__TypeAssignment_0 ) ) ;
    public final void rule__PSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2420:1: ( ( ( rule__PSignature__TypeAssignment_0 ) ) )
            // InternalFoo.g:2421:1: ( ( rule__PSignature__TypeAssignment_0 ) )
            {
            // InternalFoo.g:2421:1: ( ( rule__PSignature__TypeAssignment_0 ) )
            // InternalFoo.g:2422:2: ( rule__PSignature__TypeAssignment_0 )
            {
             before(grammarAccess.getPSignatureAccess().getTypeAssignment_0()); 
            // InternalFoo.g:2423:2: ( rule__PSignature__TypeAssignment_0 )
            // InternalFoo.g:2423:3: rule__PSignature__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PSignature__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPSignatureAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group__0__Impl"


    // $ANTLR start "rule__PSignature__Group__1"
    // InternalFoo.g:2431:1: rule__PSignature__Group__1 : rule__PSignature__Group__1__Impl rule__PSignature__Group__2 ;
    public final void rule__PSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2435:1: ( rule__PSignature__Group__1__Impl rule__PSignature__Group__2 )
            // InternalFoo.g:2436:2: rule__PSignature__Group__1__Impl rule__PSignature__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__PSignature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PSignature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group__1"


    // $ANTLR start "rule__PSignature__Group__1__Impl"
    // InternalFoo.g:2443:1: rule__PSignature__Group__1__Impl : ( ( rule__PSignature__NameAssignment_1 ) ) ;
    public final void rule__PSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2447:1: ( ( ( rule__PSignature__NameAssignment_1 ) ) )
            // InternalFoo.g:2448:1: ( ( rule__PSignature__NameAssignment_1 ) )
            {
            // InternalFoo.g:2448:1: ( ( rule__PSignature__NameAssignment_1 ) )
            // InternalFoo.g:2449:2: ( rule__PSignature__NameAssignment_1 )
            {
             before(grammarAccess.getPSignatureAccess().getNameAssignment_1()); 
            // InternalFoo.g:2450:2: ( rule__PSignature__NameAssignment_1 )
            // InternalFoo.g:2450:3: rule__PSignature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PSignature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPSignatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group__1__Impl"


    // $ANTLR start "rule__PSignature__Group__2"
    // InternalFoo.g:2458:1: rule__PSignature__Group__2 : rule__PSignature__Group__2__Impl rule__PSignature__Group__3 ;
    public final void rule__PSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2462:1: ( rule__PSignature__Group__2__Impl rule__PSignature__Group__3 )
            // InternalFoo.g:2463:2: rule__PSignature__Group__2__Impl rule__PSignature__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__PSignature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PSignature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group__2"


    // $ANTLR start "rule__PSignature__Group__2__Impl"
    // InternalFoo.g:2470:1: rule__PSignature__Group__2__Impl : ( '(' ) ;
    public final void rule__PSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2474:1: ( ( '(' ) )
            // InternalFoo.g:2475:1: ( '(' )
            {
            // InternalFoo.g:2475:1: ( '(' )
            // InternalFoo.g:2476:2: '('
            {
             before(grammarAccess.getPSignatureAccess().getLeftParenthesisKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPSignatureAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group__2__Impl"


    // $ANTLR start "rule__PSignature__Group__3"
    // InternalFoo.g:2485:1: rule__PSignature__Group__3 : rule__PSignature__Group__3__Impl rule__PSignature__Group__4 ;
    public final void rule__PSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2489:1: ( rule__PSignature__Group__3__Impl rule__PSignature__Group__4 )
            // InternalFoo.g:2490:2: rule__PSignature__Group__3__Impl rule__PSignature__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__PSignature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PSignature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group__3"


    // $ANTLR start "rule__PSignature__Group__3__Impl"
    // InternalFoo.g:2497:1: rule__PSignature__Group__3__Impl : ( ( rule__PSignature__ParametersAssignment_3 )? ) ;
    public final void rule__PSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2501:1: ( ( ( rule__PSignature__ParametersAssignment_3 )? ) )
            // InternalFoo.g:2502:1: ( ( rule__PSignature__ParametersAssignment_3 )? )
            {
            // InternalFoo.g:2502:1: ( ( rule__PSignature__ParametersAssignment_3 )? )
            // InternalFoo.g:2503:2: ( rule__PSignature__ParametersAssignment_3 )?
            {
             before(grammarAccess.getPSignatureAccess().getParametersAssignment_3()); 
            // InternalFoo.g:2504:2: ( rule__PSignature__ParametersAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFoo.g:2504:3: rule__PSignature__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__PSignature__ParametersAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPSignatureAccess().getParametersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group__3__Impl"


    // $ANTLR start "rule__PSignature__Group__4"
    // InternalFoo.g:2512:1: rule__PSignature__Group__4 : rule__PSignature__Group__4__Impl rule__PSignature__Group__5 ;
    public final void rule__PSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2516:1: ( rule__PSignature__Group__4__Impl rule__PSignature__Group__5 )
            // InternalFoo.g:2517:2: rule__PSignature__Group__4__Impl rule__PSignature__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__PSignature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PSignature__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group__4"


    // $ANTLR start "rule__PSignature__Group__4__Impl"
    // InternalFoo.g:2524:1: rule__PSignature__Group__4__Impl : ( ( rule__PSignature__Group_4__0 )* ) ;
    public final void rule__PSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2528:1: ( ( ( rule__PSignature__Group_4__0 )* ) )
            // InternalFoo.g:2529:1: ( ( rule__PSignature__Group_4__0 )* )
            {
            // InternalFoo.g:2529:1: ( ( rule__PSignature__Group_4__0 )* )
            // InternalFoo.g:2530:2: ( rule__PSignature__Group_4__0 )*
            {
             before(grammarAccess.getPSignatureAccess().getGroup_4()); 
            // InternalFoo.g:2531:2: ( rule__PSignature__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFoo.g:2531:3: rule__PSignature__Group_4__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__PSignature__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPSignatureAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group__4__Impl"


    // $ANTLR start "rule__PSignature__Group__5"
    // InternalFoo.g:2539:1: rule__PSignature__Group__5 : rule__PSignature__Group__5__Impl ;
    public final void rule__PSignature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2543:1: ( rule__PSignature__Group__5__Impl )
            // InternalFoo.g:2544:2: rule__PSignature__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PSignature__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group__5"


    // $ANTLR start "rule__PSignature__Group__5__Impl"
    // InternalFoo.g:2550:1: rule__PSignature__Group__5__Impl : ( ')' ) ;
    public final void rule__PSignature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2554:1: ( ( ')' ) )
            // InternalFoo.g:2555:1: ( ')' )
            {
            // InternalFoo.g:2555:1: ( ')' )
            // InternalFoo.g:2556:2: ')'
            {
             before(grammarAccess.getPSignatureAccess().getRightParenthesisKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPSignatureAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group__5__Impl"


    // $ANTLR start "rule__PSignature__Group_4__0"
    // InternalFoo.g:2566:1: rule__PSignature__Group_4__0 : rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1 ;
    public final void rule__PSignature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2570:1: ( rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1 )
            // InternalFoo.g:2571:2: rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__PSignature__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PSignature__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group_4__0"


    // $ANTLR start "rule__PSignature__Group_4__0__Impl"
    // InternalFoo.g:2578:1: rule__PSignature__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PSignature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2582:1: ( ( ',' ) )
            // InternalFoo.g:2583:1: ( ',' )
            {
            // InternalFoo.g:2583:1: ( ',' )
            // InternalFoo.g:2584:2: ','
            {
             before(grammarAccess.getPSignatureAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPSignatureAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group_4__0__Impl"


    // $ANTLR start "rule__PSignature__Group_4__1"
    // InternalFoo.g:2593:1: rule__PSignature__Group_4__1 : rule__PSignature__Group_4__1__Impl ;
    public final void rule__PSignature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2597:1: ( rule__PSignature__Group_4__1__Impl )
            // InternalFoo.g:2598:2: rule__PSignature__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PSignature__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group_4__1"


    // $ANTLR start "rule__PSignature__Group_4__1__Impl"
    // InternalFoo.g:2604:1: rule__PSignature__Group_4__1__Impl : ( ( rule__PSignature__ParametersAssignment_4_1 ) ) ;
    public final void rule__PSignature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2608:1: ( ( ( rule__PSignature__ParametersAssignment_4_1 ) ) )
            // InternalFoo.g:2609:1: ( ( rule__PSignature__ParametersAssignment_4_1 ) )
            {
            // InternalFoo.g:2609:1: ( ( rule__PSignature__ParametersAssignment_4_1 ) )
            // InternalFoo.g:2610:2: ( rule__PSignature__ParametersAssignment_4_1 )
            {
             before(grammarAccess.getPSignatureAccess().getParametersAssignment_4_1()); 
            // InternalFoo.g:2611:2: ( rule__PSignature__ParametersAssignment_4_1 )
            // InternalFoo.g:2611:3: rule__PSignature__ParametersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PSignature__ParametersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPSignatureAccess().getParametersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__Group_4__1__Impl"


    // $ANTLR start "rule__MRequieredService__Group__0"
    // InternalFoo.g:2620:1: rule__MRequieredService__Group__0 : rule__MRequieredService__Group__0__Impl rule__MRequieredService__Group__1 ;
    public final void rule__MRequieredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2624:1: ( rule__MRequieredService__Group__0__Impl rule__MRequieredService__Group__1 )
            // InternalFoo.g:2625:2: rule__MRequieredService__Group__0__Impl rule__MRequieredService__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MRequieredService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MRequieredService__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRequieredService__Group__0"


    // $ANTLR start "rule__MRequieredService__Group__0__Impl"
    // InternalFoo.g:2632:1: rule__MRequieredService__Group__0__Impl : ( 'service' ) ;
    public final void rule__MRequieredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2636:1: ( ( 'service' ) )
            // InternalFoo.g:2637:1: ( 'service' )
            {
            // InternalFoo.g:2637:1: ( 'service' )
            // InternalFoo.g:2638:2: 'service'
            {
             before(grammarAccess.getMRequieredServiceAccess().getServiceKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMRequieredServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRequieredService__Group__0__Impl"


    // $ANTLR start "rule__MRequieredService__Group__1"
    // InternalFoo.g:2647:1: rule__MRequieredService__Group__1 : rule__MRequieredService__Group__1__Impl rule__MRequieredService__Group__2 ;
    public final void rule__MRequieredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2651:1: ( rule__MRequieredService__Group__1__Impl rule__MRequieredService__Group__2 )
            // InternalFoo.g:2652:2: rule__MRequieredService__Group__1__Impl rule__MRequieredService__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MRequieredService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MRequieredService__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRequieredService__Group__1"


    // $ANTLR start "rule__MRequieredService__Group__1__Impl"
    // InternalFoo.g:2659:1: rule__MRequieredService__Group__1__Impl : ( 'requiered' ) ;
    public final void rule__MRequieredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2663:1: ( ( 'requiered' ) )
            // InternalFoo.g:2664:1: ( 'requiered' )
            {
            // InternalFoo.g:2664:1: ( 'requiered' )
            // InternalFoo.g:2665:2: 'requiered'
            {
             before(grammarAccess.getMRequieredServiceAccess().getRequieredKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMRequieredServiceAccess().getRequieredKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRequieredService__Group__1__Impl"


    // $ANTLR start "rule__MRequieredService__Group__2"
    // InternalFoo.g:2674:1: rule__MRequieredService__Group__2 : rule__MRequieredService__Group__2__Impl rule__MRequieredService__Group__3 ;
    public final void rule__MRequieredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2678:1: ( rule__MRequieredService__Group__2__Impl rule__MRequieredService__Group__3 )
            // InternalFoo.g:2679:2: rule__MRequieredService__Group__2__Impl rule__MRequieredService__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__MRequieredService__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MRequieredService__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRequieredService__Group__2"


    // $ANTLR start "rule__MRequieredService__Group__2__Impl"
    // InternalFoo.g:2686:1: rule__MRequieredService__Group__2__Impl : ( ( rule__MRequieredService__SignatureAssignment_2 ) ) ;
    public final void rule__MRequieredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2690:1: ( ( ( rule__MRequieredService__SignatureAssignment_2 ) ) )
            // InternalFoo.g:2691:1: ( ( rule__MRequieredService__SignatureAssignment_2 ) )
            {
            // InternalFoo.g:2691:1: ( ( rule__MRequieredService__SignatureAssignment_2 ) )
            // InternalFoo.g:2692:2: ( rule__MRequieredService__SignatureAssignment_2 )
            {
             before(grammarAccess.getMRequieredServiceAccess().getSignatureAssignment_2()); 
            // InternalFoo.g:2693:2: ( rule__MRequieredService__SignatureAssignment_2 )
            // InternalFoo.g:2693:3: rule__MRequieredService__SignatureAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MRequieredService__SignatureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMRequieredServiceAccess().getSignatureAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRequieredService__Group__2__Impl"


    // $ANTLR start "rule__MRequieredService__Group__3"
    // InternalFoo.g:2701:1: rule__MRequieredService__Group__3 : rule__MRequieredService__Group__3__Impl ;
    public final void rule__MRequieredService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2705:1: ( rule__MRequieredService__Group__3__Impl )
            // InternalFoo.g:2706:2: rule__MRequieredService__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MRequieredService__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRequieredService__Group__3"


    // $ANTLR start "rule__MRequieredService__Group__3__Impl"
    // InternalFoo.g:2712:1: rule__MRequieredService__Group__3__Impl : ( ';' ) ;
    public final void rule__MRequieredService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2716:1: ( ( ';' ) )
            // InternalFoo.g:2717:1: ( ';' )
            {
            // InternalFoo.g:2717:1: ( ';' )
            // InternalFoo.g:2718:2: ';'
            {
             before(grammarAccess.getMRequieredServiceAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMRequieredServiceAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRequieredService__Group__3__Impl"


    // $ANTLR start "rule__RSignature__Group__0"
    // InternalFoo.g:2728:1: rule__RSignature__Group__0 : rule__RSignature__Group__0__Impl rule__RSignature__Group__1 ;
    public final void rule__RSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2732:1: ( rule__RSignature__Group__0__Impl rule__RSignature__Group__1 )
            // InternalFoo.g:2733:2: rule__RSignature__Group__0__Impl rule__RSignature__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RSignature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RSignature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group__0"


    // $ANTLR start "rule__RSignature__Group__0__Impl"
    // InternalFoo.g:2740:1: rule__RSignature__Group__0__Impl : ( ( rule__RSignature__TypeAssignment_0 ) ) ;
    public final void rule__RSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2744:1: ( ( ( rule__RSignature__TypeAssignment_0 ) ) )
            // InternalFoo.g:2745:1: ( ( rule__RSignature__TypeAssignment_0 ) )
            {
            // InternalFoo.g:2745:1: ( ( rule__RSignature__TypeAssignment_0 ) )
            // InternalFoo.g:2746:2: ( rule__RSignature__TypeAssignment_0 )
            {
             before(grammarAccess.getRSignatureAccess().getTypeAssignment_0()); 
            // InternalFoo.g:2747:2: ( rule__RSignature__TypeAssignment_0 )
            // InternalFoo.g:2747:3: rule__RSignature__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RSignature__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRSignatureAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group__0__Impl"


    // $ANTLR start "rule__RSignature__Group__1"
    // InternalFoo.g:2755:1: rule__RSignature__Group__1 : rule__RSignature__Group__1__Impl rule__RSignature__Group__2 ;
    public final void rule__RSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2759:1: ( rule__RSignature__Group__1__Impl rule__RSignature__Group__2 )
            // InternalFoo.g:2760:2: rule__RSignature__Group__1__Impl rule__RSignature__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__RSignature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RSignature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group__1"


    // $ANTLR start "rule__RSignature__Group__1__Impl"
    // InternalFoo.g:2767:1: rule__RSignature__Group__1__Impl : ( ( rule__RSignature__NameAssignment_1 ) ) ;
    public final void rule__RSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2771:1: ( ( ( rule__RSignature__NameAssignment_1 ) ) )
            // InternalFoo.g:2772:1: ( ( rule__RSignature__NameAssignment_1 ) )
            {
            // InternalFoo.g:2772:1: ( ( rule__RSignature__NameAssignment_1 ) )
            // InternalFoo.g:2773:2: ( rule__RSignature__NameAssignment_1 )
            {
             before(grammarAccess.getRSignatureAccess().getNameAssignment_1()); 
            // InternalFoo.g:2774:2: ( rule__RSignature__NameAssignment_1 )
            // InternalFoo.g:2774:3: rule__RSignature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RSignature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRSignatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group__1__Impl"


    // $ANTLR start "rule__RSignature__Group__2"
    // InternalFoo.g:2782:1: rule__RSignature__Group__2 : rule__RSignature__Group__2__Impl rule__RSignature__Group__3 ;
    public final void rule__RSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2786:1: ( rule__RSignature__Group__2__Impl rule__RSignature__Group__3 )
            // InternalFoo.g:2787:2: rule__RSignature__Group__2__Impl rule__RSignature__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__RSignature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RSignature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group__2"


    // $ANTLR start "rule__RSignature__Group__2__Impl"
    // InternalFoo.g:2794:1: rule__RSignature__Group__2__Impl : ( '(' ) ;
    public final void rule__RSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2798:1: ( ( '(' ) )
            // InternalFoo.g:2799:1: ( '(' )
            {
            // InternalFoo.g:2799:1: ( '(' )
            // InternalFoo.g:2800:2: '('
            {
             before(grammarAccess.getRSignatureAccess().getLeftParenthesisKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRSignatureAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group__2__Impl"


    // $ANTLR start "rule__RSignature__Group__3"
    // InternalFoo.g:2809:1: rule__RSignature__Group__3 : rule__RSignature__Group__3__Impl rule__RSignature__Group__4 ;
    public final void rule__RSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2813:1: ( rule__RSignature__Group__3__Impl rule__RSignature__Group__4 )
            // InternalFoo.g:2814:2: rule__RSignature__Group__3__Impl rule__RSignature__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__RSignature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RSignature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group__3"


    // $ANTLR start "rule__RSignature__Group__3__Impl"
    // InternalFoo.g:2821:1: rule__RSignature__Group__3__Impl : ( ( rule__RSignature__ParametersAssignment_3 )? ) ;
    public final void rule__RSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2825:1: ( ( ( rule__RSignature__ParametersAssignment_3 )? ) )
            // InternalFoo.g:2826:1: ( ( rule__RSignature__ParametersAssignment_3 )? )
            {
            // InternalFoo.g:2826:1: ( ( rule__RSignature__ParametersAssignment_3 )? )
            // InternalFoo.g:2827:2: ( rule__RSignature__ParametersAssignment_3 )?
            {
             before(grammarAccess.getRSignatureAccess().getParametersAssignment_3()); 
            // InternalFoo.g:2828:2: ( rule__RSignature__ParametersAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFoo.g:2828:3: rule__RSignature__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RSignature__ParametersAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRSignatureAccess().getParametersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group__3__Impl"


    // $ANTLR start "rule__RSignature__Group__4"
    // InternalFoo.g:2836:1: rule__RSignature__Group__4 : rule__RSignature__Group__4__Impl rule__RSignature__Group__5 ;
    public final void rule__RSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2840:1: ( rule__RSignature__Group__4__Impl rule__RSignature__Group__5 )
            // InternalFoo.g:2841:2: rule__RSignature__Group__4__Impl rule__RSignature__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__RSignature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RSignature__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group__4"


    // $ANTLR start "rule__RSignature__Group__4__Impl"
    // InternalFoo.g:2848:1: rule__RSignature__Group__4__Impl : ( ( rule__RSignature__Group_4__0 )* ) ;
    public final void rule__RSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2852:1: ( ( ( rule__RSignature__Group_4__0 )* ) )
            // InternalFoo.g:2853:1: ( ( rule__RSignature__Group_4__0 )* )
            {
            // InternalFoo.g:2853:1: ( ( rule__RSignature__Group_4__0 )* )
            // InternalFoo.g:2854:2: ( rule__RSignature__Group_4__0 )*
            {
             before(grammarAccess.getRSignatureAccess().getGroup_4()); 
            // InternalFoo.g:2855:2: ( rule__RSignature__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFoo.g:2855:3: rule__RSignature__Group_4__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__RSignature__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRSignatureAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group__4__Impl"


    // $ANTLR start "rule__RSignature__Group__5"
    // InternalFoo.g:2863:1: rule__RSignature__Group__5 : rule__RSignature__Group__5__Impl ;
    public final void rule__RSignature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2867:1: ( rule__RSignature__Group__5__Impl )
            // InternalFoo.g:2868:2: rule__RSignature__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RSignature__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group__5"


    // $ANTLR start "rule__RSignature__Group__5__Impl"
    // InternalFoo.g:2874:1: rule__RSignature__Group__5__Impl : ( ')' ) ;
    public final void rule__RSignature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2878:1: ( ( ')' ) )
            // InternalFoo.g:2879:1: ( ')' )
            {
            // InternalFoo.g:2879:1: ( ')' )
            // InternalFoo.g:2880:2: ')'
            {
             before(grammarAccess.getRSignatureAccess().getRightParenthesisKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRSignatureAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group__5__Impl"


    // $ANTLR start "rule__RSignature__Group_4__0"
    // InternalFoo.g:2890:1: rule__RSignature__Group_4__0 : rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1 ;
    public final void rule__RSignature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2894:1: ( rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1 )
            // InternalFoo.g:2895:2: rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__RSignature__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RSignature__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group_4__0"


    // $ANTLR start "rule__RSignature__Group_4__0__Impl"
    // InternalFoo.g:2902:1: rule__RSignature__Group_4__0__Impl : ( ',' ) ;
    public final void rule__RSignature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2906:1: ( ( ',' ) )
            // InternalFoo.g:2907:1: ( ',' )
            {
            // InternalFoo.g:2907:1: ( ',' )
            // InternalFoo.g:2908:2: ','
            {
             before(grammarAccess.getRSignatureAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRSignatureAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group_4__0__Impl"


    // $ANTLR start "rule__RSignature__Group_4__1"
    // InternalFoo.g:2917:1: rule__RSignature__Group_4__1 : rule__RSignature__Group_4__1__Impl ;
    public final void rule__RSignature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2921:1: ( rule__RSignature__Group_4__1__Impl )
            // InternalFoo.g:2922:2: rule__RSignature__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RSignature__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group_4__1"


    // $ANTLR start "rule__RSignature__Group_4__1__Impl"
    // InternalFoo.g:2928:1: rule__RSignature__Group_4__1__Impl : ( ( rule__RSignature__ParametersAssignment_4_1 ) ) ;
    public final void rule__RSignature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2932:1: ( ( ( rule__RSignature__ParametersAssignment_4_1 ) ) )
            // InternalFoo.g:2933:1: ( ( rule__RSignature__ParametersAssignment_4_1 ) )
            {
            // InternalFoo.g:2933:1: ( ( rule__RSignature__ParametersAssignment_4_1 ) )
            // InternalFoo.g:2934:2: ( rule__RSignature__ParametersAssignment_4_1 )
            {
             before(grammarAccess.getRSignatureAccess().getParametersAssignment_4_1()); 
            // InternalFoo.g:2935:2: ( rule__RSignature__ParametersAssignment_4_1 )
            // InternalFoo.g:2935:3: rule__RSignature__ParametersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RSignature__ParametersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRSignatureAccess().getParametersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__Group_4__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalFoo.g:2944:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2948:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalFoo.g:2949:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalFoo.g:2956:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2960:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalFoo.g:2961:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalFoo.g:2961:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalFoo.g:2962:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalFoo.g:2963:2: ( rule__Parameter__NameAssignment_0 )
            // InternalFoo.g:2963:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalFoo.g:2971:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2975:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalFoo.g:2976:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalFoo.g:2983:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2987:1: ( ( ':' ) )
            // InternalFoo.g:2988:1: ( ':' )
            {
            // InternalFoo.g:2988:1: ( ':' )
            // InternalFoo.g:2989:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalFoo.g:2998:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3002:1: ( rule__Parameter__Group__2__Impl )
            // InternalFoo.g:3003:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalFoo.g:3009:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3013:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalFoo.g:3014:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalFoo.g:3014:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalFoo.g:3015:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalFoo.g:3016:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalFoo.g:3016:3: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__DomainModel__ModelAssignment"
    // InternalFoo.g:3025:1: rule__DomainModel__ModelAssignment : ( ruleModel ) ;
    public final void rule__DomainModel__ModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3029:1: ( ( ruleModel ) )
            // InternalFoo.g:3030:2: ( ruleModel )
            {
            // InternalFoo.g:3030:2: ( ruleModel )
            // InternalFoo.g:3031:3: ruleModel
            {
             before(grammarAccess.getDomainModelAccess().getModelModelParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getModelModelParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__ModelAssignment"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalFoo.g:3040:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3044:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3045:2: ( ruleQualifiedName )
            {
            // InternalFoo.g:3045:2: ( ruleQualifiedName )
            // InternalFoo.g:3046:3: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__ImportsAssignment_3"
    // InternalFoo.g:3055:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3059:1: ( ( ruleImport ) )
            // InternalFoo.g:3060:2: ( ruleImport )
            {
            // InternalFoo.g:3060:2: ( ruleImport )
            // InternalFoo.g:3061:3: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_3"


    // $ANTLR start "rule__Model__ComponentsAssignment_4"
    // InternalFoo.g:3070:1: rule__Model__ComponentsAssignment_4 : ( ruleComponent ) ;
    public final void rule__Model__ComponentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3074:1: ( ( ruleComponent ) )
            // InternalFoo.g:3075:2: ( ruleComponent )
            {
            // InternalFoo.g:3075:2: ( ruleComponent )
            // InternalFoo.g:3076:3: ruleComponent
            {
             before(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ComponentsAssignment_4"


    // $ANTLR start "rule__Model__AssemblyAssignment_5"
    // InternalFoo.g:3085:1: rule__Model__AssemblyAssignment_5 : ( ruleAssembly ) ;
    public final void rule__Model__AssemblyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3089:1: ( ( ruleAssembly ) )
            // InternalFoo.g:3090:2: ( ruleAssembly )
            {
            // InternalFoo.g:3090:2: ( ruleAssembly )
            // InternalFoo.g:3091:3: ruleAssembly
            {
             before(grammarAccess.getModelAccess().getAssemblyAssemblyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAssembly();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAssemblyAssemblyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AssemblyAssignment_5"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalFoo.g:3100:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3104:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalFoo.g:3105:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalFoo.g:3105:2: ( ruleQualifiedNameWithWildcard )
            // InternalFoo.g:3106:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Assembly__NameAssignment_2"
    // InternalFoo.g:3115:1: rule__Assembly__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Assembly__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3119:1: ( ( RULE_ID ) )
            // InternalFoo.g:3120:2: ( RULE_ID )
            {
            // InternalFoo.g:3120:2: ( RULE_ID )
            // InternalFoo.g:3121:3: RULE_ID
            {
             before(grammarAccess.getAssemblyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssemblyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__NameAssignment_2"


    // $ANTLR start "rule__Assembly__AttributesAssignment_5"
    // InternalFoo.g:3130:1: rule__Assembly__AttributesAssignment_5 : ( ruleComponentInstance ) ;
    public final void rule__Assembly__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3134:1: ( ( ruleComponentInstance ) )
            // InternalFoo.g:3135:2: ( ruleComponentInstance )
            {
            // InternalFoo.g:3135:2: ( ruleComponentInstance )
            // InternalFoo.g:3136:3: ruleComponentInstance
            {
             before(grammarAccess.getAssemblyAccess().getAttributesComponentInstanceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentInstance();

            state._fsp--;

             after(grammarAccess.getAssemblyAccess().getAttributesComponentInstanceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__AttributesAssignment_5"


    // $ANTLR start "rule__Assembly__AttributesAssignment_6"
    // InternalFoo.g:3145:1: rule__Assembly__AttributesAssignment_6 : ( ruleComponentInstance ) ;
    public final void rule__Assembly__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3149:1: ( ( ruleComponentInstance ) )
            // InternalFoo.g:3150:2: ( ruleComponentInstance )
            {
            // InternalFoo.g:3150:2: ( ruleComponentInstance )
            // InternalFoo.g:3151:3: ruleComponentInstance
            {
             before(grammarAccess.getAssemblyAccess().getAttributesComponentInstanceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentInstance();

            state._fsp--;

             after(grammarAccess.getAssemblyAccess().getAttributesComponentInstanceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__AttributesAssignment_6"


    // $ANTLR start "rule__Assembly__BindingsRequieredAssignment_8_0"
    // InternalFoo.g:3160:1: rule__Assembly__BindingsRequieredAssignment_8_0 : ( ruleBindingRequiered ) ;
    public final void rule__Assembly__BindingsRequieredAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3164:1: ( ( ruleBindingRequiered ) )
            // InternalFoo.g:3165:2: ( ruleBindingRequiered )
            {
            // InternalFoo.g:3165:2: ( ruleBindingRequiered )
            // InternalFoo.g:3166:3: ruleBindingRequiered
            {
             before(grammarAccess.getAssemblyAccess().getBindingsRequieredBindingRequieredParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBindingRequiered();

            state._fsp--;

             after(grammarAccess.getAssemblyAccess().getBindingsRequieredBindingRequieredParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__BindingsRequieredAssignment_8_0"


    // $ANTLR start "rule__Assembly__BindingsProvidedAssignment_8_2"
    // InternalFoo.g:3175:1: rule__Assembly__BindingsProvidedAssignment_8_2 : ( ruleBindingProvided ) ;
    public final void rule__Assembly__BindingsProvidedAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3179:1: ( ( ruleBindingProvided ) )
            // InternalFoo.g:3180:2: ( ruleBindingProvided )
            {
            // InternalFoo.g:3180:2: ( ruleBindingProvided )
            // InternalFoo.g:3181:3: ruleBindingProvided
            {
             before(grammarAccess.getAssemblyAccess().getBindingsProvidedBindingProvidedParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBindingProvided();

            state._fsp--;

             after(grammarAccess.getAssemblyAccess().getBindingsProvidedBindingProvidedParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__BindingsProvidedAssignment_8_2"


    // $ANTLR start "rule__ComponentInstance__NameAssignment_0"
    // InternalFoo.g:3190:1: rule__ComponentInstance__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ComponentInstance__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3194:1: ( ( RULE_ID ) )
            // InternalFoo.g:3195:2: ( RULE_ID )
            {
            // InternalFoo.g:3195:2: ( RULE_ID )
            // InternalFoo.g:3196:3: RULE_ID
            {
             before(grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__NameAssignment_0"


    // $ANTLR start "rule__ComponentInstance__ComponentAssignment_2"
    // InternalFoo.g:3205:1: rule__ComponentInstance__ComponentAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComponentInstance__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3209:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3210:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3210:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3211:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentComponentCrossReference_2_0()); 
            // InternalFoo.g:3212:3: ( ruleQualifiedName )
            // InternalFoo.g:3213:4: ruleQualifiedName
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentComponentQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentInstanceAccess().getComponentComponentQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getComponentInstanceAccess().getComponentComponentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__ComponentAssignment_2"


    // $ANTLR start "rule__BindingRequiered__NameAssignment_0"
    // InternalFoo.g:3224:1: rule__BindingRequiered__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BindingRequiered__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3228:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:3229:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:3229:2: ( ( RULE_ID ) )
            // InternalFoo.g:3230:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingRequieredAccess().getNameComponentInstanceCrossReference_0_0()); 
            // InternalFoo.g:3231:3: ( RULE_ID )
            // InternalFoo.g:3232:4: RULE_ID
            {
             before(grammarAccess.getBindingRequieredAccess().getNameComponentInstanceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingRequieredAccess().getNameComponentInstanceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBindingRequieredAccess().getNameComponentInstanceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingRequiered__NameAssignment_0"


    // $ANTLR start "rule__BindingRequiered__ServiceAssignment_2"
    // InternalFoo.g:3243:1: rule__BindingRequiered__ServiceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingRequiered__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3247:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3248:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3248:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3249:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBindingRequieredAccess().getServiceRSignatureCrossReference_2_0()); 
            // InternalFoo.g:3250:3: ( ruleQualifiedName )
            // InternalFoo.g:3251:4: ruleQualifiedName
            {
             before(grammarAccess.getBindingRequieredAccess().getServiceRSignatureQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBindingRequieredAccess().getServiceRSignatureQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBindingRequieredAccess().getServiceRSignatureCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingRequiered__ServiceAssignment_2"


    // $ANTLR start "rule__BindingProvided__NameAssignment_0"
    // InternalFoo.g:3262:1: rule__BindingProvided__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BindingProvided__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3266:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:3267:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:3267:2: ( ( RULE_ID ) )
            // InternalFoo.g:3268:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingProvidedAccess().getNameComponentInstanceCrossReference_0_0()); 
            // InternalFoo.g:3269:3: ( RULE_ID )
            // InternalFoo.g:3270:4: RULE_ID
            {
             before(grammarAccess.getBindingProvidedAccess().getNameComponentInstanceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingProvidedAccess().getNameComponentInstanceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBindingProvidedAccess().getNameComponentInstanceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingProvided__NameAssignment_0"


    // $ANTLR start "rule__BindingProvided__ServiceAssignment_2"
    // InternalFoo.g:3281:1: rule__BindingProvided__ServiceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingProvided__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3285:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3286:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3286:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3287:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBindingProvidedAccess().getServicePSignatureCrossReference_2_0()); 
            // InternalFoo.g:3288:3: ( ruleQualifiedName )
            // InternalFoo.g:3289:4: ruleQualifiedName
            {
             before(grammarAccess.getBindingProvidedAccess().getServicePSignatureQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBindingProvidedAccess().getServicePSignatureQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBindingProvidedAccess().getServicePSignatureCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingProvided__ServiceAssignment_2"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalFoo.g:3300:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3304:1: ( ( RULE_ID ) )
            // InternalFoo.g:3305:2: ( RULE_ID )
            {
            // InternalFoo.g:3305:2: ( RULE_ID )
            // InternalFoo.g:3306:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__ListOfPServicesAssignment_3"
    // InternalFoo.g:3315:1: rule__Component__ListOfPServicesAssignment_3 : ( ruleListOfProvidedServices ) ;
    public final void rule__Component__ListOfPServicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3319:1: ( ( ruleListOfProvidedServices ) )
            // InternalFoo.g:3320:2: ( ruleListOfProvidedServices )
            {
            // InternalFoo.g:3320:2: ( ruleListOfProvidedServices )
            // InternalFoo.g:3321:3: ruleListOfProvidedServices
            {
             before(grammarAccess.getComponentAccess().getListOfPServicesListOfProvidedServicesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfProvidedServices();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getListOfPServicesListOfProvidedServicesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ListOfPServicesAssignment_3"


    // $ANTLR start "rule__Component__ListOfRServicesAssignment_4"
    // InternalFoo.g:3330:1: rule__Component__ListOfRServicesAssignment_4 : ( ruleListOfRequieredServices ) ;
    public final void rule__Component__ListOfRServicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3334:1: ( ( ruleListOfRequieredServices ) )
            // InternalFoo.g:3335:2: ( ruleListOfRequieredServices )
            {
            // InternalFoo.g:3335:2: ( ruleListOfRequieredServices )
            // InternalFoo.g:3336:3: ruleListOfRequieredServices
            {
             before(grammarAccess.getComponentAccess().getListOfRServicesListOfRequieredServicesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfRequieredServices();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getListOfRServicesListOfRequieredServicesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ListOfRServicesAssignment_4"


    // $ANTLR start "rule__Component__MProvServicesAssignment_5"
    // InternalFoo.g:3345:1: rule__Component__MProvServicesAssignment_5 : ( ruleMProvidedService ) ;
    public final void rule__Component__MProvServicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3349:1: ( ( ruleMProvidedService ) )
            // InternalFoo.g:3350:2: ( ruleMProvidedService )
            {
            // InternalFoo.g:3350:2: ( ruleMProvidedService )
            // InternalFoo.g:3351:3: ruleMProvidedService
            {
             before(grammarAccess.getComponentAccess().getMProvServicesMProvidedServiceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMProvidedService();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getMProvServicesMProvidedServiceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__MProvServicesAssignment_5"


    // $ANTLR start "rule__Component__MReqServicesAssignment_6"
    // InternalFoo.g:3360:1: rule__Component__MReqServicesAssignment_6 : ( ruleMRequieredService ) ;
    public final void rule__Component__MReqServicesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3364:1: ( ( ruleMRequieredService ) )
            // InternalFoo.g:3365:2: ( ruleMRequieredService )
            {
            // InternalFoo.g:3365:2: ( ruleMRequieredService )
            // InternalFoo.g:3366:3: ruleMRequieredService
            {
             before(grammarAccess.getComponentAccess().getMReqServicesMRequieredServiceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMRequieredService();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getMReqServicesMRequieredServiceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__MReqServicesAssignment_6"


    // $ANTLR start "rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0"
    // InternalFoo.g:3375:1: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 : ( ruleProvidedService ) ;
    public final void rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3379:1: ( ( ruleProvidedService ) )
            // InternalFoo.g:3380:2: ( ruleProvidedService )
            {
            // InternalFoo.g:3380:2: ( ruleProvidedService )
            // InternalFoo.g:3381:3: ruleProvidedService
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProvidedService();

            state._fsp--;

             after(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0"


    // $ANTLR start "rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1"
    // InternalFoo.g:3390:1: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 : ( ruleProvidedService ) ;
    public final void rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3394:1: ( ( ruleProvidedService ) )
            // InternalFoo.g:3395:2: ( ruleProvidedService )
            {
            // InternalFoo.g:3395:2: ( ruleProvidedService )
            // InternalFoo.g:3396:3: ruleProvidedService
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProvidedService();

            state._fsp--;

             after(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1"


    // $ANTLR start "rule__ProvidedService__NameAssignment"
    // InternalFoo.g:3405:1: rule__ProvidedService__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ProvidedService__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3409:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:3410:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:3410:2: ( ( RULE_ID ) )
            // InternalFoo.g:3411:3: ( RULE_ID )
            {
             before(grammarAccess.getProvidedServiceAccess().getNamePSignatureCrossReference_0()); 
            // InternalFoo.g:3412:3: ( RULE_ID )
            // InternalFoo.g:3413:4: RULE_ID
            {
             before(grammarAccess.getProvidedServiceAccess().getNamePSignatureIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProvidedServiceAccess().getNamePSignatureIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getProvidedServiceAccess().getNamePSignatureCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedService__NameAssignment"


    // $ANTLR start "rule__ListOfRequieredServices__RequieredServicesAssignment_4_0"
    // InternalFoo.g:3424:1: rule__ListOfRequieredServices__RequieredServicesAssignment_4_0 : ( ruleRequieredService ) ;
    public final void rule__ListOfRequieredServices__RequieredServicesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3428:1: ( ( ruleRequieredService ) )
            // InternalFoo.g:3429:2: ( ruleRequieredService )
            {
            // InternalFoo.g:3429:2: ( ruleRequieredService )
            // InternalFoo.g:3430:3: ruleRequieredService
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getRequieredServicesRequieredServiceParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRequieredService();

            state._fsp--;

             after(grammarAccess.getListOfRequieredServicesAccess().getRequieredServicesRequieredServiceParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__RequieredServicesAssignment_4_0"


    // $ANTLR start "rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1"
    // InternalFoo.g:3439:1: rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1 : ( ruleRequieredService ) ;
    public final void rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3443:1: ( ( ruleRequieredService ) )
            // InternalFoo.g:3444:2: ( ruleRequieredService )
            {
            // InternalFoo.g:3444:2: ( ruleRequieredService )
            // InternalFoo.g:3445:3: ruleRequieredService
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getRequieredServicesRequieredServiceParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequieredService();

            state._fsp--;

             after(grammarAccess.getListOfRequieredServicesAccess().getRequieredServicesRequieredServiceParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1"


    // $ANTLR start "rule__RequieredService__NameAssignment"
    // InternalFoo.g:3454:1: rule__RequieredService__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RequieredService__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3458:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:3459:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:3459:2: ( ( RULE_ID ) )
            // InternalFoo.g:3460:3: ( RULE_ID )
            {
             before(grammarAccess.getRequieredServiceAccess().getNameRSignatureCrossReference_0()); 
            // InternalFoo.g:3461:3: ( RULE_ID )
            // InternalFoo.g:3462:4: RULE_ID
            {
             before(grammarAccess.getRequieredServiceAccess().getNameRSignatureIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequieredServiceAccess().getNameRSignatureIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getRequieredServiceAccess().getNameRSignatureCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequieredService__NameAssignment"


    // $ANTLR start "rule__MProvidedService__SignatureAssignment_2"
    // InternalFoo.g:3473:1: rule__MProvidedService__SignatureAssignment_2 : ( rulePSignature ) ;
    public final void rule__MProvidedService__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3477:1: ( ( rulePSignature ) )
            // InternalFoo.g:3478:2: ( rulePSignature )
            {
            // InternalFoo.g:3478:2: ( rulePSignature )
            // InternalFoo.g:3479:3: rulePSignature
            {
             before(grammarAccess.getMProvidedServiceAccess().getSignaturePSignatureParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePSignature();

            state._fsp--;

             after(grammarAccess.getMProvidedServiceAccess().getSignaturePSignatureParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MProvidedService__SignatureAssignment_2"


    // $ANTLR start "rule__PSignature__TypeAssignment_0"
    // InternalFoo.g:3488:1: rule__PSignature__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__PSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3492:1: ( ( RULE_ID ) )
            // InternalFoo.g:3493:2: ( RULE_ID )
            {
            // InternalFoo.g:3493:2: ( RULE_ID )
            // InternalFoo.g:3494:3: RULE_ID
            {
             before(grammarAccess.getPSignatureAccess().getTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPSignatureAccess().getTypeIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__TypeAssignment_0"


    // $ANTLR start "rule__PSignature__NameAssignment_1"
    // InternalFoo.g:3503:1: rule__PSignature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PSignature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3507:1: ( ( RULE_ID ) )
            // InternalFoo.g:3508:2: ( RULE_ID )
            {
            // InternalFoo.g:3508:2: ( RULE_ID )
            // InternalFoo.g:3509:3: RULE_ID
            {
             before(grammarAccess.getPSignatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPSignatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__NameAssignment_1"


    // $ANTLR start "rule__PSignature__ParametersAssignment_3"
    // InternalFoo.g:3518:1: rule__PSignature__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__PSignature__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3522:1: ( ( ruleParameter ) )
            // InternalFoo.g:3523:2: ( ruleParameter )
            {
            // InternalFoo.g:3523:2: ( ruleParameter )
            // InternalFoo.g:3524:3: ruleParameter
            {
             before(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__ParametersAssignment_3"


    // $ANTLR start "rule__PSignature__ParametersAssignment_4_1"
    // InternalFoo.g:3533:1: rule__PSignature__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__PSignature__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3537:1: ( ( ruleParameter ) )
            // InternalFoo.g:3538:2: ( ruleParameter )
            {
            // InternalFoo.g:3538:2: ( ruleParameter )
            // InternalFoo.g:3539:3: ruleParameter
            {
             before(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__ParametersAssignment_4_1"


    // $ANTLR start "rule__MRequieredService__SignatureAssignment_2"
    // InternalFoo.g:3548:1: rule__MRequieredService__SignatureAssignment_2 : ( ruleRSignature ) ;
    public final void rule__MRequieredService__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3552:1: ( ( ruleRSignature ) )
            // InternalFoo.g:3553:2: ( ruleRSignature )
            {
            // InternalFoo.g:3553:2: ( ruleRSignature )
            // InternalFoo.g:3554:3: ruleRSignature
            {
             before(grammarAccess.getMRequieredServiceAccess().getSignatureRSignatureParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRSignature();

            state._fsp--;

             after(grammarAccess.getMRequieredServiceAccess().getSignatureRSignatureParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MRequieredService__SignatureAssignment_2"


    // $ANTLR start "rule__RSignature__TypeAssignment_0"
    // InternalFoo.g:3563:1: rule__RSignature__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__RSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3567:1: ( ( RULE_ID ) )
            // InternalFoo.g:3568:2: ( RULE_ID )
            {
            // InternalFoo.g:3568:2: ( RULE_ID )
            // InternalFoo.g:3569:3: RULE_ID
            {
             before(grammarAccess.getRSignatureAccess().getTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRSignatureAccess().getTypeIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__TypeAssignment_0"


    // $ANTLR start "rule__RSignature__NameAssignment_1"
    // InternalFoo.g:3578:1: rule__RSignature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RSignature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3582:1: ( ( RULE_ID ) )
            // InternalFoo.g:3583:2: ( RULE_ID )
            {
            // InternalFoo.g:3583:2: ( RULE_ID )
            // InternalFoo.g:3584:3: RULE_ID
            {
             before(grammarAccess.getRSignatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRSignatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__NameAssignment_1"


    // $ANTLR start "rule__RSignature__ParametersAssignment_3"
    // InternalFoo.g:3593:1: rule__RSignature__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__RSignature__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3597:1: ( ( ruleParameter ) )
            // InternalFoo.g:3598:2: ( ruleParameter )
            {
            // InternalFoo.g:3598:2: ( ruleParameter )
            // InternalFoo.g:3599:3: ruleParameter
            {
             before(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__ParametersAssignment_3"


    // $ANTLR start "rule__RSignature__ParametersAssignment_4_1"
    // InternalFoo.g:3608:1: rule__RSignature__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__RSignature__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3612:1: ( ( ruleParameter ) )
            // InternalFoo.g:3613:2: ( ruleParameter )
            {
            // InternalFoo.g:3613:2: ( ruleParameter )
            // InternalFoo.g:3614:3: ruleParameter
            {
             before(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__ParametersAssignment_4_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalFoo.g:3623:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3627:1: ( ( RULE_ID ) )
            // InternalFoo.g:3628:2: ( RULE_ID )
            {
            // InternalFoo.g:3628:2: ( RULE_ID )
            // InternalFoo.g:3629:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // InternalFoo.g:3638:1: rule__Parameter__TypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3642:1: ( ( RULE_ID ) )
            // InternalFoo.g:3643:2: ( RULE_ID )
            {
            // InternalFoo.g:3643:2: ( RULE_ID )
            // InternalFoo.g:3644:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getTypeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTypeIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000042A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000022000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});

}