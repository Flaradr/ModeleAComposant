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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'Assembly'", "'components'", "'bindings'", "':'", "'-'", "'Component'", "'refines'", "'assembly'", "'provided'", "'='", "','", "'required'", "'service'", "'('", "')'", "';'"
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
    public static final int T__31=31;
    public static final int T__32=32;
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


    // $ANTLR start "entryRuleBinding"
    // InternalFoo.g:228:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalFoo.g:229:1: ( ruleBinding EOF )
            // InternalFoo.g:230:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalFoo.g:237:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:241:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalFoo.g:242:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalFoo.g:242:2: ( ( rule__Binding__Group__0 ) )
            // InternalFoo.g:243:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalFoo.g:244:3: ( rule__Binding__Group__0 )
            // InternalFoo.g:244:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBindingRequired"
    // InternalFoo.g:253:1: entryRuleBindingRequired : ruleBindingRequired EOF ;
    public final void entryRuleBindingRequired() throws RecognitionException {
        try {
            // InternalFoo.g:254:1: ( ruleBindingRequired EOF )
            // InternalFoo.g:255:1: ruleBindingRequired EOF
            {
             before(grammarAccess.getBindingRequiredRule()); 
            pushFollow(FOLLOW_1);
            ruleBindingRequired();

            state._fsp--;

             after(grammarAccess.getBindingRequiredRule()); 
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
    // $ANTLR end "entryRuleBindingRequired"


    // $ANTLR start "ruleBindingRequired"
    // InternalFoo.g:262:1: ruleBindingRequired : ( ( rule__BindingRequired__Group__0 ) ) ;
    public final void ruleBindingRequired() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:266:2: ( ( ( rule__BindingRequired__Group__0 ) ) )
            // InternalFoo.g:267:2: ( ( rule__BindingRequired__Group__0 ) )
            {
            // InternalFoo.g:267:2: ( ( rule__BindingRequired__Group__0 ) )
            // InternalFoo.g:268:3: ( rule__BindingRequired__Group__0 )
            {
             before(grammarAccess.getBindingRequiredAccess().getGroup()); 
            // InternalFoo.g:269:3: ( rule__BindingRequired__Group__0 )
            // InternalFoo.g:269:4: rule__BindingRequired__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BindingRequired__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingRequiredAccess().getGroup()); 

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
    // $ANTLR end "ruleBindingRequired"


    // $ANTLR start "entryRuleBindingProvided"
    // InternalFoo.g:278:1: entryRuleBindingProvided : ruleBindingProvided EOF ;
    public final void entryRuleBindingProvided() throws RecognitionException {
        try {
            // InternalFoo.g:279:1: ( ruleBindingProvided EOF )
            // InternalFoo.g:280:1: ruleBindingProvided EOF
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
    // InternalFoo.g:287:1: ruleBindingProvided : ( ( rule__BindingProvided__Group__0 ) ) ;
    public final void ruleBindingProvided() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:291:2: ( ( ( rule__BindingProvided__Group__0 ) ) )
            // InternalFoo.g:292:2: ( ( rule__BindingProvided__Group__0 ) )
            {
            // InternalFoo.g:292:2: ( ( rule__BindingProvided__Group__0 ) )
            // InternalFoo.g:293:3: ( rule__BindingProvided__Group__0 )
            {
             before(grammarAccess.getBindingProvidedAccess().getGroup()); 
            // InternalFoo.g:294:3: ( rule__BindingProvided__Group__0 )
            // InternalFoo.g:294:4: rule__BindingProvided__Group__0
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
    // InternalFoo.g:303:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalFoo.g:304:1: ( ruleComponent EOF )
            // InternalFoo.g:305:1: ruleComponent EOF
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
    // InternalFoo.g:312:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:316:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalFoo.g:317:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalFoo.g:317:2: ( ( rule__Component__Group__0 ) )
            // InternalFoo.g:318:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalFoo.g:319:3: ( rule__Component__Group__0 )
            // InternalFoo.g:319:4: rule__Component__Group__0
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
    // InternalFoo.g:328:1: entryRuleListOfProvidedServices : ruleListOfProvidedServices EOF ;
    public final void entryRuleListOfProvidedServices() throws RecognitionException {
        try {
            // InternalFoo.g:329:1: ( ruleListOfProvidedServices EOF )
            // InternalFoo.g:330:1: ruleListOfProvidedServices EOF
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
    // InternalFoo.g:337:1: ruleListOfProvidedServices : ( ( rule__ListOfProvidedServices__Group__0 ) ) ;
    public final void ruleListOfProvidedServices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:341:2: ( ( ( rule__ListOfProvidedServices__Group__0 ) ) )
            // InternalFoo.g:342:2: ( ( rule__ListOfProvidedServices__Group__0 ) )
            {
            // InternalFoo.g:342:2: ( ( rule__ListOfProvidedServices__Group__0 ) )
            // InternalFoo.g:343:3: ( rule__ListOfProvidedServices__Group__0 )
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getGroup()); 
            // InternalFoo.g:344:3: ( rule__ListOfProvidedServices__Group__0 )
            // InternalFoo.g:344:4: rule__ListOfProvidedServices__Group__0
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
    // InternalFoo.g:353:1: entryRuleProvidedService : ruleProvidedService EOF ;
    public final void entryRuleProvidedService() throws RecognitionException {
        try {
            // InternalFoo.g:354:1: ( ruleProvidedService EOF )
            // InternalFoo.g:355:1: ruleProvidedService EOF
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
    // InternalFoo.g:362:1: ruleProvidedService : ( ( rule__ProvidedService__NameAssignment ) ) ;
    public final void ruleProvidedService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:366:2: ( ( ( rule__ProvidedService__NameAssignment ) ) )
            // InternalFoo.g:367:2: ( ( rule__ProvidedService__NameAssignment ) )
            {
            // InternalFoo.g:367:2: ( ( rule__ProvidedService__NameAssignment ) )
            // InternalFoo.g:368:3: ( rule__ProvidedService__NameAssignment )
            {
             before(grammarAccess.getProvidedServiceAccess().getNameAssignment()); 
            // InternalFoo.g:369:3: ( rule__ProvidedService__NameAssignment )
            // InternalFoo.g:369:4: rule__ProvidedService__NameAssignment
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


    // $ANTLR start "entryRuleListOfrequiredServices"
    // InternalFoo.g:378:1: entryRuleListOfrequiredServices : ruleListOfrequiredServices EOF ;
    public final void entryRuleListOfrequiredServices() throws RecognitionException {
        try {
            // InternalFoo.g:379:1: ( ruleListOfrequiredServices EOF )
            // InternalFoo.g:380:1: ruleListOfrequiredServices EOF
            {
             before(grammarAccess.getListOfrequiredServicesRule()); 
            pushFollow(FOLLOW_1);
            ruleListOfrequiredServices();

            state._fsp--;

             after(grammarAccess.getListOfrequiredServicesRule()); 
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
    // $ANTLR end "entryRuleListOfrequiredServices"


    // $ANTLR start "ruleListOfrequiredServices"
    // InternalFoo.g:387:1: ruleListOfrequiredServices : ( ( rule__ListOfrequiredServices__Group__0 ) ) ;
    public final void ruleListOfrequiredServices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:391:2: ( ( ( rule__ListOfrequiredServices__Group__0 ) ) )
            // InternalFoo.g:392:2: ( ( rule__ListOfrequiredServices__Group__0 ) )
            {
            // InternalFoo.g:392:2: ( ( rule__ListOfrequiredServices__Group__0 ) )
            // InternalFoo.g:393:3: ( rule__ListOfrequiredServices__Group__0 )
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getGroup()); 
            // InternalFoo.g:394:3: ( rule__ListOfrequiredServices__Group__0 )
            // InternalFoo.g:394:4: rule__ListOfrequiredServices__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfrequiredServicesAccess().getGroup()); 

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
    // $ANTLR end "ruleListOfrequiredServices"


    // $ANTLR start "entryRuleRequiredService"
    // InternalFoo.g:403:1: entryRuleRequiredService : ruleRequiredService EOF ;
    public final void entryRuleRequiredService() throws RecognitionException {
        try {
            // InternalFoo.g:404:1: ( ruleRequiredService EOF )
            // InternalFoo.g:405:1: ruleRequiredService EOF
            {
             before(grammarAccess.getRequiredServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleRequiredService();

            state._fsp--;

             after(grammarAccess.getRequiredServiceRule()); 
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
    // $ANTLR end "entryRuleRequiredService"


    // $ANTLR start "ruleRequiredService"
    // InternalFoo.g:412:1: ruleRequiredService : ( ( rule__RequiredService__NameAssignment ) ) ;
    public final void ruleRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:416:2: ( ( ( rule__RequiredService__NameAssignment ) ) )
            // InternalFoo.g:417:2: ( ( rule__RequiredService__NameAssignment ) )
            {
            // InternalFoo.g:417:2: ( ( rule__RequiredService__NameAssignment ) )
            // InternalFoo.g:418:3: ( rule__RequiredService__NameAssignment )
            {
             before(grammarAccess.getRequiredServiceAccess().getNameAssignment()); 
            // InternalFoo.g:419:3: ( rule__RequiredService__NameAssignment )
            // InternalFoo.g:419:4: rule__RequiredService__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRequiredServiceAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleRequiredService"


    // $ANTLR start "entryRuleMProvidedService"
    // InternalFoo.g:428:1: entryRuleMProvidedService : ruleMProvidedService EOF ;
    public final void entryRuleMProvidedService() throws RecognitionException {
        try {
            // InternalFoo.g:429:1: ( ruleMProvidedService EOF )
            // InternalFoo.g:430:1: ruleMProvidedService EOF
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
    // InternalFoo.g:437:1: ruleMProvidedService : ( ( rule__MProvidedService__Group__0 ) ) ;
    public final void ruleMProvidedService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:441:2: ( ( ( rule__MProvidedService__Group__0 ) ) )
            // InternalFoo.g:442:2: ( ( rule__MProvidedService__Group__0 ) )
            {
            // InternalFoo.g:442:2: ( ( rule__MProvidedService__Group__0 ) )
            // InternalFoo.g:443:3: ( rule__MProvidedService__Group__0 )
            {
             before(grammarAccess.getMProvidedServiceAccess().getGroup()); 
            // InternalFoo.g:444:3: ( rule__MProvidedService__Group__0 )
            // InternalFoo.g:444:4: rule__MProvidedService__Group__0
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
    // InternalFoo.g:453:1: entryRulePSignature : rulePSignature EOF ;
    public final void entryRulePSignature() throws RecognitionException {
        try {
            // InternalFoo.g:454:1: ( rulePSignature EOF )
            // InternalFoo.g:455:1: rulePSignature EOF
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
    // InternalFoo.g:462:1: rulePSignature : ( ( rule__PSignature__Group__0 ) ) ;
    public final void rulePSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:466:2: ( ( ( rule__PSignature__Group__0 ) ) )
            // InternalFoo.g:467:2: ( ( rule__PSignature__Group__0 ) )
            {
            // InternalFoo.g:467:2: ( ( rule__PSignature__Group__0 ) )
            // InternalFoo.g:468:3: ( rule__PSignature__Group__0 )
            {
             before(grammarAccess.getPSignatureAccess().getGroup()); 
            // InternalFoo.g:469:3: ( rule__PSignature__Group__0 )
            // InternalFoo.g:469:4: rule__PSignature__Group__0
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


    // $ANTLR start "entryRuleMRequiredService"
    // InternalFoo.g:478:1: entryRuleMRequiredService : ruleMRequiredService EOF ;
    public final void entryRuleMRequiredService() throws RecognitionException {
        try {
            // InternalFoo.g:479:1: ( ruleMRequiredService EOF )
            // InternalFoo.g:480:1: ruleMRequiredService EOF
            {
             before(grammarAccess.getMRequiredServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleMRequiredService();

            state._fsp--;

             after(grammarAccess.getMRequiredServiceRule()); 
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
    // $ANTLR end "entryRuleMRequiredService"


    // $ANTLR start "ruleMRequiredService"
    // InternalFoo.g:487:1: ruleMRequiredService : ( ( rule__MRequiredService__Group__0 ) ) ;
    public final void ruleMRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:491:2: ( ( ( rule__MRequiredService__Group__0 ) ) )
            // InternalFoo.g:492:2: ( ( rule__MRequiredService__Group__0 ) )
            {
            // InternalFoo.g:492:2: ( ( rule__MRequiredService__Group__0 ) )
            // InternalFoo.g:493:3: ( rule__MRequiredService__Group__0 )
            {
             before(grammarAccess.getMRequiredServiceAccess().getGroup()); 
            // InternalFoo.g:494:3: ( rule__MRequiredService__Group__0 )
            // InternalFoo.g:494:4: rule__MRequiredService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MRequiredService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMRequiredServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleMRequiredService"


    // $ANTLR start "entryRuleRSignature"
    // InternalFoo.g:503:1: entryRuleRSignature : ruleRSignature EOF ;
    public final void entryRuleRSignature() throws RecognitionException {
        try {
            // InternalFoo.g:504:1: ( ruleRSignature EOF )
            // InternalFoo.g:505:1: ruleRSignature EOF
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
    // InternalFoo.g:512:1: ruleRSignature : ( ( rule__RSignature__Group__0 ) ) ;
    public final void ruleRSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:516:2: ( ( ( rule__RSignature__Group__0 ) ) )
            // InternalFoo.g:517:2: ( ( rule__RSignature__Group__0 ) )
            {
            // InternalFoo.g:517:2: ( ( rule__RSignature__Group__0 ) )
            // InternalFoo.g:518:3: ( rule__RSignature__Group__0 )
            {
             before(grammarAccess.getRSignatureAccess().getGroup()); 
            // InternalFoo.g:519:3: ( rule__RSignature__Group__0 )
            // InternalFoo.g:519:4: rule__RSignature__Group__0
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
    // InternalFoo.g:528:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalFoo.g:529:1: ( ruleParameter EOF )
            // InternalFoo.g:530:1: ruleParameter EOF
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
    // InternalFoo.g:537:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:541:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalFoo.g:542:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalFoo.g:542:2: ( ( rule__Parameter__Group__0 ) )
            // InternalFoo.g:543:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalFoo.g:544:3: ( rule__Parameter__Group__0 )
            // InternalFoo.g:544:4: rule__Parameter__Group__0
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
    // InternalFoo.g:552:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:556:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFoo.g:557:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalFoo.g:564:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:568:1: ( ( 'package' ) )
            // InternalFoo.g:569:1: ( 'package' )
            {
            // InternalFoo.g:569:1: ( 'package' )
            // InternalFoo.g:570:2: 'package'
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
    // InternalFoo.g:579:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:583:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalFoo.g:584:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalFoo.g:591:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:595:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalFoo.g:596:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalFoo.g:596:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalFoo.g:597:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalFoo.g:598:2: ( rule__Model__NameAssignment_1 )
            // InternalFoo.g:598:3: rule__Model__NameAssignment_1
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
    // InternalFoo.g:606:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:610:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalFoo.g:611:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalFoo.g:618:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:622:1: ( ( '{' ) )
            // InternalFoo.g:623:1: ( '{' )
            {
            // InternalFoo.g:623:1: ( '{' )
            // InternalFoo.g:624:2: '{'
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
    // InternalFoo.g:633:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:637:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalFoo.g:638:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalFoo.g:645:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:649:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // InternalFoo.g:650:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // InternalFoo.g:650:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // InternalFoo.g:651:2: ( rule__Model__ImportsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            // InternalFoo.g:652:2: ( rule__Model__ImportsAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFoo.g:652:3: rule__Model__ImportsAssignment_3
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
    // InternalFoo.g:660:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:664:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalFoo.g:665:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalFoo.g:672:1: rule__Model__Group__4__Impl : ( ( rule__Model__ComponentsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:676:1: ( ( ( rule__Model__ComponentsAssignment_4 )* ) )
            // InternalFoo.g:677:1: ( ( rule__Model__ComponentsAssignment_4 )* )
            {
            // InternalFoo.g:677:1: ( ( rule__Model__ComponentsAssignment_4 )* )
            // InternalFoo.g:678:2: ( rule__Model__ComponentsAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getComponentsAssignment_4()); 
            // InternalFoo.g:679:2: ( rule__Model__ComponentsAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFoo.g:679:3: rule__Model__ComponentsAssignment_4
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
    // InternalFoo.g:687:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:691:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalFoo.g:692:2: rule__Model__Group__5__Impl rule__Model__Group__6
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
    // InternalFoo.g:699:1: rule__Model__Group__5__Impl : ( ( rule__Model__AssemblyAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:703:1: ( ( ( rule__Model__AssemblyAssignment_5 )* ) )
            // InternalFoo.g:704:1: ( ( rule__Model__AssemblyAssignment_5 )* )
            {
            // InternalFoo.g:704:1: ( ( rule__Model__AssemblyAssignment_5 )* )
            // InternalFoo.g:705:2: ( rule__Model__AssemblyAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getAssemblyAssignment_5()); 
            // InternalFoo.g:706:2: ( rule__Model__AssemblyAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFoo.g:706:3: rule__Model__AssemblyAssignment_5
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
    // InternalFoo.g:714:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:718:1: ( rule__Model__Group__6__Impl )
            // InternalFoo.g:719:2: rule__Model__Group__6__Impl
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
    // InternalFoo.g:725:1: rule__Model__Group__6__Impl : ( '}' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:729:1: ( ( '}' ) )
            // InternalFoo.g:730:1: ( '}' )
            {
            // InternalFoo.g:730:1: ( '}' )
            // InternalFoo.g:731:2: '}'
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
    // InternalFoo.g:741:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:745:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalFoo.g:746:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalFoo.g:753:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:757:1: ( ( RULE_ID ) )
            // InternalFoo.g:758:1: ( RULE_ID )
            {
            // InternalFoo.g:758:1: ( RULE_ID )
            // InternalFoo.g:759:2: RULE_ID
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
    // InternalFoo.g:768:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:772:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalFoo.g:773:2: rule__QualifiedName__Group__1__Impl
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
    // InternalFoo.g:779:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:783:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalFoo.g:784:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalFoo.g:784:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalFoo.g:785:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalFoo.g:786:2: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFoo.g:786:3: rule__QualifiedName__Group_1__0
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
    // InternalFoo.g:795:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:799:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalFoo.g:800:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalFoo.g:807:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:811:1: ( ( '.' ) )
            // InternalFoo.g:812:1: ( '.' )
            {
            // InternalFoo.g:812:1: ( '.' )
            // InternalFoo.g:813:2: '.'
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
    // InternalFoo.g:822:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:826:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalFoo.g:827:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalFoo.g:833:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:837:1: ( ( RULE_ID ) )
            // InternalFoo.g:838:1: ( RULE_ID )
            {
            // InternalFoo.g:838:1: ( RULE_ID )
            // InternalFoo.g:839:2: RULE_ID
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
    // InternalFoo.g:849:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:853:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalFoo.g:854:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalFoo.g:861:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:865:1: ( ( 'import' ) )
            // InternalFoo.g:866:1: ( 'import' )
            {
            // InternalFoo.g:866:1: ( 'import' )
            // InternalFoo.g:867:2: 'import'
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
    // InternalFoo.g:876:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:880:1: ( rule__Import__Group__1__Impl )
            // InternalFoo.g:881:2: rule__Import__Group__1__Impl
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
    // InternalFoo.g:887:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:891:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalFoo.g:892:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalFoo.g:892:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalFoo.g:893:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalFoo.g:894:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalFoo.g:894:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalFoo.g:903:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:907:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalFoo.g:908:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalFoo.g:915:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:919:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:920:1: ( ruleQualifiedName )
            {
            // InternalFoo.g:920:1: ( ruleQualifiedName )
            // InternalFoo.g:921:2: ruleQualifiedName
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
    // InternalFoo.g:930:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:934:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalFoo.g:935:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalFoo.g:941:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:945:1: ( ( ( '.*' )? ) )
            // InternalFoo.g:946:1: ( ( '.*' )? )
            {
            // InternalFoo.g:946:1: ( ( '.*' )? )
            // InternalFoo.g:947:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalFoo.g:948:2: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFoo.g:948:3: '.*'
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
    // InternalFoo.g:957:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:961:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // InternalFoo.g:962:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
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
    // InternalFoo.g:969:1: rule__Assembly__Group__0__Impl : ( () ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:973:1: ( ( () ) )
            // InternalFoo.g:974:1: ( () )
            {
            // InternalFoo.g:974:1: ( () )
            // InternalFoo.g:975:2: ()
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyAction_0()); 
            // InternalFoo.g:976:2: ()
            // InternalFoo.g:976:3: 
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
    // InternalFoo.g:984:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:988:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // InternalFoo.g:989:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
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
    // InternalFoo.g:996:1: rule__Assembly__Group__1__Impl : ( 'Assembly' ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1000:1: ( ( 'Assembly' ) )
            // InternalFoo.g:1001:1: ( 'Assembly' )
            {
            // InternalFoo.g:1001:1: ( 'Assembly' )
            // InternalFoo.g:1002:2: 'Assembly'
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
    // InternalFoo.g:1011:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1015:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // InternalFoo.g:1016:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
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
    // InternalFoo.g:1023:1: rule__Assembly__Group__2__Impl : ( ( rule__Assembly__NameAssignment_2 ) ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1027:1: ( ( ( rule__Assembly__NameAssignment_2 ) ) )
            // InternalFoo.g:1028:1: ( ( rule__Assembly__NameAssignment_2 ) )
            {
            // InternalFoo.g:1028:1: ( ( rule__Assembly__NameAssignment_2 ) )
            // InternalFoo.g:1029:2: ( rule__Assembly__NameAssignment_2 )
            {
             before(grammarAccess.getAssemblyAccess().getNameAssignment_2()); 
            // InternalFoo.g:1030:2: ( rule__Assembly__NameAssignment_2 )
            // InternalFoo.g:1030:3: rule__Assembly__NameAssignment_2
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
    // InternalFoo.g:1038:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1042:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // InternalFoo.g:1043:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
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
    // InternalFoo.g:1050:1: rule__Assembly__Group__3__Impl : ( '{' ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1054:1: ( ( '{' ) )
            // InternalFoo.g:1055:1: ( '{' )
            {
            // InternalFoo.g:1055:1: ( '{' )
            // InternalFoo.g:1056:2: '{'
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
    // InternalFoo.g:1065:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl rule__Assembly__Group__5 ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1069:1: ( rule__Assembly__Group__4__Impl rule__Assembly__Group__5 )
            // InternalFoo.g:1070:2: rule__Assembly__Group__4__Impl rule__Assembly__Group__5
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
    // InternalFoo.g:1077:1: rule__Assembly__Group__4__Impl : ( 'components' ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1081:1: ( ( 'components' ) )
            // InternalFoo.g:1082:1: ( 'components' )
            {
            // InternalFoo.g:1082:1: ( 'components' )
            // InternalFoo.g:1083:2: 'components'
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
    // InternalFoo.g:1092:1: rule__Assembly__Group__5 : rule__Assembly__Group__5__Impl rule__Assembly__Group__6 ;
    public final void rule__Assembly__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1096:1: ( rule__Assembly__Group__5__Impl rule__Assembly__Group__6 )
            // InternalFoo.g:1097:2: rule__Assembly__Group__5__Impl rule__Assembly__Group__6
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
    // InternalFoo.g:1104:1: rule__Assembly__Group__5__Impl : ( ( rule__Assembly__AttributesAssignment_5 ) ) ;
    public final void rule__Assembly__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1108:1: ( ( ( rule__Assembly__AttributesAssignment_5 ) ) )
            // InternalFoo.g:1109:1: ( ( rule__Assembly__AttributesAssignment_5 ) )
            {
            // InternalFoo.g:1109:1: ( ( rule__Assembly__AttributesAssignment_5 ) )
            // InternalFoo.g:1110:2: ( rule__Assembly__AttributesAssignment_5 )
            {
             before(grammarAccess.getAssemblyAccess().getAttributesAssignment_5()); 
            // InternalFoo.g:1111:2: ( rule__Assembly__AttributesAssignment_5 )
            // InternalFoo.g:1111:3: rule__Assembly__AttributesAssignment_5
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
    // InternalFoo.g:1119:1: rule__Assembly__Group__6 : rule__Assembly__Group__6__Impl rule__Assembly__Group__7 ;
    public final void rule__Assembly__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1123:1: ( rule__Assembly__Group__6__Impl rule__Assembly__Group__7 )
            // InternalFoo.g:1124:2: rule__Assembly__Group__6__Impl rule__Assembly__Group__7
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
    // InternalFoo.g:1131:1: rule__Assembly__Group__6__Impl : ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) ) ;
    public final void rule__Assembly__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1135:1: ( ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) ) )
            // InternalFoo.g:1136:1: ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) )
            {
            // InternalFoo.g:1136:1: ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) )
            // InternalFoo.g:1137:2: ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* )
            {
            // InternalFoo.g:1137:2: ( ( rule__Assembly__AttributesAssignment_6 ) )
            // InternalFoo.g:1138:3: ( rule__Assembly__AttributesAssignment_6 )
            {
             before(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 
            // InternalFoo.g:1139:3: ( rule__Assembly__AttributesAssignment_6 )
            // InternalFoo.g:1139:4: rule__Assembly__AttributesAssignment_6
            {
            pushFollow(FOLLOW_15);
            rule__Assembly__AttributesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 

            }

            // InternalFoo.g:1142:2: ( ( rule__Assembly__AttributesAssignment_6 )* )
            // InternalFoo.g:1143:3: ( rule__Assembly__AttributesAssignment_6 )*
            {
             before(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 
            // InternalFoo.g:1144:3: ( rule__Assembly__AttributesAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFoo.g:1144:4: rule__Assembly__AttributesAssignment_6
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
    // InternalFoo.g:1153:1: rule__Assembly__Group__7 : rule__Assembly__Group__7__Impl rule__Assembly__Group__8 ;
    public final void rule__Assembly__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1157:1: ( rule__Assembly__Group__7__Impl rule__Assembly__Group__8 )
            // InternalFoo.g:1158:2: rule__Assembly__Group__7__Impl rule__Assembly__Group__8
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
    // InternalFoo.g:1165:1: rule__Assembly__Group__7__Impl : ( 'bindings' ) ;
    public final void rule__Assembly__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1169:1: ( ( 'bindings' ) )
            // InternalFoo.g:1170:1: ( 'bindings' )
            {
            // InternalFoo.g:1170:1: ( 'bindings' )
            // InternalFoo.g:1171:2: 'bindings'
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
    // InternalFoo.g:1180:1: rule__Assembly__Group__8 : rule__Assembly__Group__8__Impl rule__Assembly__Group__9 ;
    public final void rule__Assembly__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1184:1: ( rule__Assembly__Group__8__Impl rule__Assembly__Group__9 )
            // InternalFoo.g:1185:2: rule__Assembly__Group__8__Impl rule__Assembly__Group__9
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
    // InternalFoo.g:1192:1: rule__Assembly__Group__8__Impl : ( ( rule__Assembly__BindingsAssignment_8 )* ) ;
    public final void rule__Assembly__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1196:1: ( ( ( rule__Assembly__BindingsAssignment_8 )* ) )
            // InternalFoo.g:1197:1: ( ( rule__Assembly__BindingsAssignment_8 )* )
            {
            // InternalFoo.g:1197:1: ( ( rule__Assembly__BindingsAssignment_8 )* )
            // InternalFoo.g:1198:2: ( rule__Assembly__BindingsAssignment_8 )*
            {
             before(grammarAccess.getAssemblyAccess().getBindingsAssignment_8()); 
            // InternalFoo.g:1199:2: ( rule__Assembly__BindingsAssignment_8 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFoo.g:1199:3: rule__Assembly__BindingsAssignment_8
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Assembly__BindingsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAssemblyAccess().getBindingsAssignment_8()); 

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
    // InternalFoo.g:1207:1: rule__Assembly__Group__9 : rule__Assembly__Group__9__Impl ;
    public final void rule__Assembly__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1211:1: ( rule__Assembly__Group__9__Impl )
            // InternalFoo.g:1212:2: rule__Assembly__Group__9__Impl
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
    // InternalFoo.g:1218:1: rule__Assembly__Group__9__Impl : ( '}' ) ;
    public final void rule__Assembly__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1222:1: ( ( '}' ) )
            // InternalFoo.g:1223:1: ( '}' )
            {
            // InternalFoo.g:1223:1: ( '}' )
            // InternalFoo.g:1224:2: '}'
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


    // $ANTLR start "rule__ComponentInstance__Group__0"
    // InternalFoo.g:1234:1: rule__ComponentInstance__Group__0 : rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 ;
    public final void rule__ComponentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1238:1: ( rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 )
            // InternalFoo.g:1239:2: rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalFoo.g:1246:1: rule__ComponentInstance__Group__0__Impl : ( ( rule__ComponentInstance__NameAssignment_0 ) ) ;
    public final void rule__ComponentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1250:1: ( ( ( rule__ComponentInstance__NameAssignment_0 ) ) )
            // InternalFoo.g:1251:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            {
            // InternalFoo.g:1251:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            // InternalFoo.g:1252:2: ( rule__ComponentInstance__NameAssignment_0 )
            {
             before(grammarAccess.getComponentInstanceAccess().getNameAssignment_0()); 
            // InternalFoo.g:1253:2: ( rule__ComponentInstance__NameAssignment_0 )
            // InternalFoo.g:1253:3: rule__ComponentInstance__NameAssignment_0
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
    // InternalFoo.g:1261:1: rule__ComponentInstance__Group__1 : rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 ;
    public final void rule__ComponentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1265:1: ( rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 )
            // InternalFoo.g:1266:2: rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2
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
    // InternalFoo.g:1273:1: rule__ComponentInstance__Group__1__Impl : ( ':' ) ;
    public final void rule__ComponentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1277:1: ( ( ':' ) )
            // InternalFoo.g:1278:1: ( ':' )
            {
            // InternalFoo.g:1278:1: ( ':' )
            // InternalFoo.g:1279:2: ':'
            {
             before(grammarAccess.getComponentInstanceAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalFoo.g:1288:1: rule__ComponentInstance__Group__2 : rule__ComponentInstance__Group__2__Impl ;
    public final void rule__ComponentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1292:1: ( rule__ComponentInstance__Group__2__Impl )
            // InternalFoo.g:1293:2: rule__ComponentInstance__Group__2__Impl
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
    // InternalFoo.g:1299:1: rule__ComponentInstance__Group__2__Impl : ( ( rule__ComponentInstance__ComponentAssignment_2 ) ) ;
    public final void rule__ComponentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1303:1: ( ( ( rule__ComponentInstance__ComponentAssignment_2 ) ) )
            // InternalFoo.g:1304:1: ( ( rule__ComponentInstance__ComponentAssignment_2 ) )
            {
            // InternalFoo.g:1304:1: ( ( rule__ComponentInstance__ComponentAssignment_2 ) )
            // InternalFoo.g:1305:2: ( rule__ComponentInstance__ComponentAssignment_2 )
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentAssignment_2()); 
            // InternalFoo.g:1306:2: ( rule__ComponentInstance__ComponentAssignment_2 )
            // InternalFoo.g:1306:3: rule__ComponentInstance__ComponentAssignment_2
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


    // $ANTLR start "rule__Binding__Group__0"
    // InternalFoo.g:1315:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1319:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalFoo.g:1320:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

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
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalFoo.g:1327:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__BindingRequiredAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1331:1: ( ( ( rule__Binding__BindingRequiredAssignment_0 ) ) )
            // InternalFoo.g:1332:1: ( ( rule__Binding__BindingRequiredAssignment_0 ) )
            {
            // InternalFoo.g:1332:1: ( ( rule__Binding__BindingRequiredAssignment_0 ) )
            // InternalFoo.g:1333:2: ( rule__Binding__BindingRequiredAssignment_0 )
            {
             before(grammarAccess.getBindingAccess().getBindingRequiredAssignment_0()); 
            // InternalFoo.g:1334:2: ( rule__Binding__BindingRequiredAssignment_0 )
            // InternalFoo.g:1334:3: rule__Binding__BindingRequiredAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__BindingRequiredAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getBindingRequiredAssignment_0()); 

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
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalFoo.g:1342:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1346:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalFoo.g:1347:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

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
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalFoo.g:1354:1: rule__Binding__Group__1__Impl : ( '-' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1358:1: ( ( '-' ) )
            // InternalFoo.g:1359:1: ( '-' )
            {
            // InternalFoo.g:1359:1: ( '-' )
            // InternalFoo.g:1360:2: '-'
            {
             before(grammarAccess.getBindingAccess().getHyphenMinusKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // InternalFoo.g:1369:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1373:1: ( rule__Binding__Group__2__Impl )
            // InternalFoo.g:1374:2: rule__Binding__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__2__Impl();

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
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalFoo.g:1380:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__BindingProvidedAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1384:1: ( ( ( rule__Binding__BindingProvidedAssignment_2 ) ) )
            // InternalFoo.g:1385:1: ( ( rule__Binding__BindingProvidedAssignment_2 ) )
            {
            // InternalFoo.g:1385:1: ( ( rule__Binding__BindingProvidedAssignment_2 ) )
            // InternalFoo.g:1386:2: ( rule__Binding__BindingProvidedAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getBindingProvidedAssignment_2()); 
            // InternalFoo.g:1387:2: ( rule__Binding__BindingProvidedAssignment_2 )
            // InternalFoo.g:1387:3: rule__Binding__BindingProvidedAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Binding__BindingProvidedAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getBindingProvidedAssignment_2()); 

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
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__BindingRequired__Group__0"
    // InternalFoo.g:1396:1: rule__BindingRequired__Group__0 : rule__BindingRequired__Group__0__Impl rule__BindingRequired__Group__1 ;
    public final void rule__BindingRequired__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1400:1: ( rule__BindingRequired__Group__0__Impl rule__BindingRequired__Group__1 )
            // InternalFoo.g:1401:2: rule__BindingRequired__Group__0__Impl rule__BindingRequired__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BindingRequired__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BindingRequired__Group__1();

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
    // $ANTLR end "rule__BindingRequired__Group__0"


    // $ANTLR start "rule__BindingRequired__Group__0__Impl"
    // InternalFoo.g:1408:1: rule__BindingRequired__Group__0__Impl : ( ( rule__BindingRequired__NameAssignment_0 ) ) ;
    public final void rule__BindingRequired__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1412:1: ( ( ( rule__BindingRequired__NameAssignment_0 ) ) )
            // InternalFoo.g:1413:1: ( ( rule__BindingRequired__NameAssignment_0 ) )
            {
            // InternalFoo.g:1413:1: ( ( rule__BindingRequired__NameAssignment_0 ) )
            // InternalFoo.g:1414:2: ( rule__BindingRequired__NameAssignment_0 )
            {
             before(grammarAccess.getBindingRequiredAccess().getNameAssignment_0()); 
            // InternalFoo.g:1415:2: ( rule__BindingRequired__NameAssignment_0 )
            // InternalFoo.g:1415:3: rule__BindingRequired__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BindingRequired__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingRequiredAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__BindingRequired__Group__0__Impl"


    // $ANTLR start "rule__BindingRequired__Group__1"
    // InternalFoo.g:1423:1: rule__BindingRequired__Group__1 : rule__BindingRequired__Group__1__Impl rule__BindingRequired__Group__2 ;
    public final void rule__BindingRequired__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1427:1: ( rule__BindingRequired__Group__1__Impl rule__BindingRequired__Group__2 )
            // InternalFoo.g:1428:2: rule__BindingRequired__Group__1__Impl rule__BindingRequired__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BindingRequired__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BindingRequired__Group__2();

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
    // $ANTLR end "rule__BindingRequired__Group__1"


    // $ANTLR start "rule__BindingRequired__Group__1__Impl"
    // InternalFoo.g:1435:1: rule__BindingRequired__Group__1__Impl : ( '.' ) ;
    public final void rule__BindingRequired__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1439:1: ( ( '.' ) )
            // InternalFoo.g:1440:1: ( '.' )
            {
            // InternalFoo.g:1440:1: ( '.' )
            // InternalFoo.g:1441:2: '.'
            {
             before(grammarAccess.getBindingRequiredAccess().getFullStopKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBindingRequiredAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__BindingRequired__Group__1__Impl"


    // $ANTLR start "rule__BindingRequired__Group__2"
    // InternalFoo.g:1450:1: rule__BindingRequired__Group__2 : rule__BindingRequired__Group__2__Impl ;
    public final void rule__BindingRequired__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1454:1: ( rule__BindingRequired__Group__2__Impl )
            // InternalFoo.g:1455:2: rule__BindingRequired__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BindingRequired__Group__2__Impl();

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
    // $ANTLR end "rule__BindingRequired__Group__2"


    // $ANTLR start "rule__BindingRequired__Group__2__Impl"
    // InternalFoo.g:1461:1: rule__BindingRequired__Group__2__Impl : ( ( rule__BindingRequired__ServiceAssignment_2 ) ) ;
    public final void rule__BindingRequired__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1465:1: ( ( ( rule__BindingRequired__ServiceAssignment_2 ) ) )
            // InternalFoo.g:1466:1: ( ( rule__BindingRequired__ServiceAssignment_2 ) )
            {
            // InternalFoo.g:1466:1: ( ( rule__BindingRequired__ServiceAssignment_2 ) )
            // InternalFoo.g:1467:2: ( rule__BindingRequired__ServiceAssignment_2 )
            {
             before(grammarAccess.getBindingRequiredAccess().getServiceAssignment_2()); 
            // InternalFoo.g:1468:2: ( rule__BindingRequired__ServiceAssignment_2 )
            // InternalFoo.g:1468:3: rule__BindingRequired__ServiceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BindingRequired__ServiceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingRequiredAccess().getServiceAssignment_2()); 

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
    // $ANTLR end "rule__BindingRequired__Group__2__Impl"


    // $ANTLR start "rule__BindingProvided__Group__0"
    // InternalFoo.g:1477:1: rule__BindingProvided__Group__0 : rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1 ;
    public final void rule__BindingProvided__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1481:1: ( rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1 )
            // InternalFoo.g:1482:2: rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1
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
    // InternalFoo.g:1489:1: rule__BindingProvided__Group__0__Impl : ( ( rule__BindingProvided__NameAssignment_0 ) ) ;
    public final void rule__BindingProvided__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1493:1: ( ( ( rule__BindingProvided__NameAssignment_0 ) ) )
            // InternalFoo.g:1494:1: ( ( rule__BindingProvided__NameAssignment_0 ) )
            {
            // InternalFoo.g:1494:1: ( ( rule__BindingProvided__NameAssignment_0 ) )
            // InternalFoo.g:1495:2: ( rule__BindingProvided__NameAssignment_0 )
            {
             before(grammarAccess.getBindingProvidedAccess().getNameAssignment_0()); 
            // InternalFoo.g:1496:2: ( rule__BindingProvided__NameAssignment_0 )
            // InternalFoo.g:1496:3: rule__BindingProvided__NameAssignment_0
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
    // InternalFoo.g:1504:1: rule__BindingProvided__Group__1 : rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2 ;
    public final void rule__BindingProvided__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1508:1: ( rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2 )
            // InternalFoo.g:1509:2: rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2
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
    // InternalFoo.g:1516:1: rule__BindingProvided__Group__1__Impl : ( '.' ) ;
    public final void rule__BindingProvided__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1520:1: ( ( '.' ) )
            // InternalFoo.g:1521:1: ( '.' )
            {
            // InternalFoo.g:1521:1: ( '.' )
            // InternalFoo.g:1522:2: '.'
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
    // InternalFoo.g:1531:1: rule__BindingProvided__Group__2 : rule__BindingProvided__Group__2__Impl ;
    public final void rule__BindingProvided__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1535:1: ( rule__BindingProvided__Group__2__Impl )
            // InternalFoo.g:1536:2: rule__BindingProvided__Group__2__Impl
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
    // InternalFoo.g:1542:1: rule__BindingProvided__Group__2__Impl : ( ( rule__BindingProvided__ServiceAssignment_2 ) ) ;
    public final void rule__BindingProvided__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1546:1: ( ( ( rule__BindingProvided__ServiceAssignment_2 ) ) )
            // InternalFoo.g:1547:1: ( ( rule__BindingProvided__ServiceAssignment_2 ) )
            {
            // InternalFoo.g:1547:1: ( ( rule__BindingProvided__ServiceAssignment_2 ) )
            // InternalFoo.g:1548:2: ( rule__BindingProvided__ServiceAssignment_2 )
            {
             before(grammarAccess.getBindingProvidedAccess().getServiceAssignment_2()); 
            // InternalFoo.g:1549:2: ( rule__BindingProvided__ServiceAssignment_2 )
            // InternalFoo.g:1549:3: rule__BindingProvided__ServiceAssignment_2
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
    // InternalFoo.g:1558:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1562:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalFoo.g:1563:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalFoo.g:1570:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1574:1: ( ( 'Component' ) )
            // InternalFoo.g:1575:1: ( 'Component' )
            {
            // InternalFoo.g:1575:1: ( 'Component' )
            // InternalFoo.g:1576:2: 'Component'
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
    // InternalFoo.g:1585:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1589:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalFoo.g:1590:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalFoo.g:1597:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1601:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalFoo.g:1602:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalFoo.g:1602:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalFoo.g:1603:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalFoo.g:1604:2: ( rule__Component__NameAssignment_1 )
            // InternalFoo.g:1604:3: rule__Component__NameAssignment_1
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
    // InternalFoo.g:1612:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1616:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalFoo.g:1617:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalFoo.g:1624:1: rule__Component__Group__2__Impl : ( ( rule__Component__Group_2__0 )? ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1628:1: ( ( ( rule__Component__Group_2__0 )? ) )
            // InternalFoo.g:1629:1: ( ( rule__Component__Group_2__0 )? )
            {
            // InternalFoo.g:1629:1: ( ( rule__Component__Group_2__0 )? )
            // InternalFoo.g:1630:2: ( rule__Component__Group_2__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_2()); 
            // InternalFoo.g:1631:2: ( rule__Component__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFoo.g:1631:3: rule__Component__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_2()); 

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
    // InternalFoo.g:1639:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1643:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalFoo.g:1644:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalFoo.g:1651:1: rule__Component__Group__3__Impl : ( '{' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1655:1: ( ( '{' ) )
            // InternalFoo.g:1656:1: ( '{' )
            {
            // InternalFoo.g:1656:1: ( '{' )
            // InternalFoo.g:1657:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalFoo.g:1666:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1670:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalFoo.g:1671:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalFoo.g:1678:1: rule__Component__Group__4__Impl : ( ( rule__Component__ListOfPServicesAssignment_4 ) ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1682:1: ( ( ( rule__Component__ListOfPServicesAssignment_4 ) ) )
            // InternalFoo.g:1683:1: ( ( rule__Component__ListOfPServicesAssignment_4 ) )
            {
            // InternalFoo.g:1683:1: ( ( rule__Component__ListOfPServicesAssignment_4 ) )
            // InternalFoo.g:1684:2: ( rule__Component__ListOfPServicesAssignment_4 )
            {
             before(grammarAccess.getComponentAccess().getListOfPServicesAssignment_4()); 
            // InternalFoo.g:1685:2: ( rule__Component__ListOfPServicesAssignment_4 )
            // InternalFoo.g:1685:3: rule__Component__ListOfPServicesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Component__ListOfPServicesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getListOfPServicesAssignment_4()); 

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
    // InternalFoo.g:1693:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1697:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalFoo.g:1698:2: rule__Component__Group__5__Impl rule__Component__Group__6
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
    // InternalFoo.g:1705:1: rule__Component__Group__5__Impl : ( ( rule__Component__ListOfRServicesAssignment_5 ) ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1709:1: ( ( ( rule__Component__ListOfRServicesAssignment_5 ) ) )
            // InternalFoo.g:1710:1: ( ( rule__Component__ListOfRServicesAssignment_5 ) )
            {
            // InternalFoo.g:1710:1: ( ( rule__Component__ListOfRServicesAssignment_5 ) )
            // InternalFoo.g:1711:2: ( rule__Component__ListOfRServicesAssignment_5 )
            {
             before(grammarAccess.getComponentAccess().getListOfRServicesAssignment_5()); 
            // InternalFoo.g:1712:2: ( rule__Component__ListOfRServicesAssignment_5 )
            // InternalFoo.g:1712:3: rule__Component__ListOfRServicesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Component__ListOfRServicesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getListOfRServicesAssignment_5()); 

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
    // InternalFoo.g:1720:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1724:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalFoo.g:1725:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalFoo.g:1732:1: rule__Component__Group__6__Impl : ( ( ( rule__Component__MProvServicesAssignment_6 ) ) ( ( rule__Component__MProvServicesAssignment_6 )* ) ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1736:1: ( ( ( ( rule__Component__MProvServicesAssignment_6 ) ) ( ( rule__Component__MProvServicesAssignment_6 )* ) ) )
            // InternalFoo.g:1737:1: ( ( ( rule__Component__MProvServicesAssignment_6 ) ) ( ( rule__Component__MProvServicesAssignment_6 )* ) )
            {
            // InternalFoo.g:1737:1: ( ( ( rule__Component__MProvServicesAssignment_6 ) ) ( ( rule__Component__MProvServicesAssignment_6 )* ) )
            // InternalFoo.g:1738:2: ( ( rule__Component__MProvServicesAssignment_6 ) ) ( ( rule__Component__MProvServicesAssignment_6 )* )
            {
            // InternalFoo.g:1738:2: ( ( rule__Component__MProvServicesAssignment_6 ) )
            // InternalFoo.g:1739:3: ( rule__Component__MProvServicesAssignment_6 )
            {
             before(grammarAccess.getComponentAccess().getMProvServicesAssignment_6()); 
            // InternalFoo.g:1740:3: ( rule__Component__MProvServicesAssignment_6 )
            // InternalFoo.g:1740:4: rule__Component__MProvServicesAssignment_6
            {
            pushFollow(FOLLOW_24);
            rule__Component__MProvServicesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getMProvServicesAssignment_6()); 

            }

            // InternalFoo.g:1743:2: ( ( rule__Component__MProvServicesAssignment_6 )* )
            // InternalFoo.g:1744:3: ( rule__Component__MProvServicesAssignment_6 )*
            {
             before(grammarAccess.getComponentAccess().getMProvServicesAssignment_6()); 
            // InternalFoo.g:1745:3: ( rule__Component__MProvServicesAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==25) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalFoo.g:1745:4: rule__Component__MProvServicesAssignment_6
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Component__MProvServicesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getMProvServicesAssignment_6()); 

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
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group__7"
    // InternalFoo.g:1754:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1758:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalFoo.g:1759:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Component__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__8();

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
    // InternalFoo.g:1766:1: rule__Component__Group__7__Impl : ( ( rule__Component__MReqServicesAssignment_7 )* ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1770:1: ( ( ( rule__Component__MReqServicesAssignment_7 )* ) )
            // InternalFoo.g:1771:1: ( ( rule__Component__MReqServicesAssignment_7 )* )
            {
            // InternalFoo.g:1771:1: ( ( rule__Component__MReqServicesAssignment_7 )* )
            // InternalFoo.g:1772:2: ( rule__Component__MReqServicesAssignment_7 )*
            {
             before(grammarAccess.getComponentAccess().getMReqServicesAssignment_7()); 
            // InternalFoo.g:1773:2: ( rule__Component__MReqServicesAssignment_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFoo.g:1773:3: rule__Component__MReqServicesAssignment_7
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Component__MReqServicesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getMReqServicesAssignment_7()); 

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


    // $ANTLR start "rule__Component__Group__8"
    // InternalFoo.g:1781:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1785:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // InternalFoo.g:1786:2: rule__Component__Group__8__Impl rule__Component__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__Component__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__9();

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
    // $ANTLR end "rule__Component__Group__8"


    // $ANTLR start "rule__Component__Group__8__Impl"
    // InternalFoo.g:1793:1: rule__Component__Group__8__Impl : ( ( rule__Component__Group_8__0 )* ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1797:1: ( ( ( rule__Component__Group_8__0 )* ) )
            // InternalFoo.g:1798:1: ( ( rule__Component__Group_8__0 )* )
            {
            // InternalFoo.g:1798:1: ( ( rule__Component__Group_8__0 )* )
            // InternalFoo.g:1799:2: ( rule__Component__Group_8__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_8()); 
            // InternalFoo.g:1800:2: ( rule__Component__Group_8__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFoo.g:1800:3: rule__Component__Group_8__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Component__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Component__Group__8__Impl"


    // $ANTLR start "rule__Component__Group__9"
    // InternalFoo.g:1808:1: rule__Component__Group__9 : rule__Component__Group__9__Impl ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1812:1: ( rule__Component__Group__9__Impl )
            // InternalFoo.g:1813:2: rule__Component__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__9__Impl();

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
    // $ANTLR end "rule__Component__Group__9"


    // $ANTLR start "rule__Component__Group__9__Impl"
    // InternalFoo.g:1819:1: rule__Component__Group__9__Impl : ( '}' ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1823:1: ( ( '}' ) )
            // InternalFoo.g:1824:1: ( '}' )
            {
            // InternalFoo.g:1824:1: ( '}' )
            // InternalFoo.g:1825:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Component__Group__9__Impl"


    // $ANTLR start "rule__Component__Group_2__0"
    // InternalFoo.g:1835:1: rule__Component__Group_2__0 : rule__Component__Group_2__0__Impl rule__Component__Group_2__1 ;
    public final void rule__Component__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1839:1: ( rule__Component__Group_2__0__Impl rule__Component__Group_2__1 )
            // InternalFoo.g:1840:2: rule__Component__Group_2__0__Impl rule__Component__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_2__1();

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
    // $ANTLR end "rule__Component__Group_2__0"


    // $ANTLR start "rule__Component__Group_2__0__Impl"
    // InternalFoo.g:1847:1: rule__Component__Group_2__0__Impl : ( 'refines' ) ;
    public final void rule__Component__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1851:1: ( ( 'refines' ) )
            // InternalFoo.g:1852:1: ( 'refines' )
            {
            // InternalFoo.g:1852:1: ( 'refines' )
            // InternalFoo.g:1853:2: 'refines'
            {
             before(grammarAccess.getComponentAccess().getRefinesKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRefinesKeyword_2_0()); 

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
    // $ANTLR end "rule__Component__Group_2__0__Impl"


    // $ANTLR start "rule__Component__Group_2__1"
    // InternalFoo.g:1862:1: rule__Component__Group_2__1 : rule__Component__Group_2__1__Impl ;
    public final void rule__Component__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1866:1: ( rule__Component__Group_2__1__Impl )
            // InternalFoo.g:1867:2: rule__Component__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_2__1__Impl();

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
    // $ANTLR end "rule__Component__Group_2__1"


    // $ANTLR start "rule__Component__Group_2__1__Impl"
    // InternalFoo.g:1873:1: rule__Component__Group_2__1__Impl : ( ( rule__Component__RefinedComponentAssignment_2_1 ) ) ;
    public final void rule__Component__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1877:1: ( ( ( rule__Component__RefinedComponentAssignment_2_1 ) ) )
            // InternalFoo.g:1878:1: ( ( rule__Component__RefinedComponentAssignment_2_1 ) )
            {
            // InternalFoo.g:1878:1: ( ( rule__Component__RefinedComponentAssignment_2_1 ) )
            // InternalFoo.g:1879:2: ( rule__Component__RefinedComponentAssignment_2_1 )
            {
             before(grammarAccess.getComponentAccess().getRefinedComponentAssignment_2_1()); 
            // InternalFoo.g:1880:2: ( rule__Component__RefinedComponentAssignment_2_1 )
            // InternalFoo.g:1880:3: rule__Component__RefinedComponentAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__RefinedComponentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getRefinedComponentAssignment_2_1()); 

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
    // $ANTLR end "rule__Component__Group_2__1__Impl"


    // $ANTLR start "rule__Component__Group_8__0"
    // InternalFoo.g:1889:1: rule__Component__Group_8__0 : rule__Component__Group_8__0__Impl rule__Component__Group_8__1 ;
    public final void rule__Component__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1893:1: ( rule__Component__Group_8__0__Impl rule__Component__Group_8__1 )
            // InternalFoo.g:1894:2: rule__Component__Group_8__0__Impl rule__Component__Group_8__1
            {
            pushFollow(FOLLOW_26);
            rule__Component__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_8__1();

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
    // $ANTLR end "rule__Component__Group_8__0"


    // $ANTLR start "rule__Component__Group_8__0__Impl"
    // InternalFoo.g:1901:1: rule__Component__Group_8__0__Impl : ( ( rule__Component__Group_8_0__0 )? ) ;
    public final void rule__Component__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1905:1: ( ( ( rule__Component__Group_8_0__0 )? ) )
            // InternalFoo.g:1906:1: ( ( rule__Component__Group_8_0__0 )? )
            {
            // InternalFoo.g:1906:1: ( ( rule__Component__Group_8_0__0 )? )
            // InternalFoo.g:1907:2: ( rule__Component__Group_8_0__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_8_0()); 
            // InternalFoo.g:1908:2: ( rule__Component__Group_8_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFoo.g:1908:3: rule__Component__Group_8_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_8_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_8_0()); 

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
    // $ANTLR end "rule__Component__Group_8__0__Impl"


    // $ANTLR start "rule__Component__Group_8__1"
    // InternalFoo.g:1916:1: rule__Component__Group_8__1 : rule__Component__Group_8__1__Impl ;
    public final void rule__Component__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1920:1: ( rule__Component__Group_8__1__Impl )
            // InternalFoo.g:1921:2: rule__Component__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_8__1__Impl();

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
    // $ANTLR end "rule__Component__Group_8__1"


    // $ANTLR start "rule__Component__Group_8__1__Impl"
    // InternalFoo.g:1927:1: rule__Component__Group_8__1__Impl : ( ( rule__Component__AssembliesAssignment_8_1 ) ) ;
    public final void rule__Component__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1931:1: ( ( ( rule__Component__AssembliesAssignment_8_1 ) ) )
            // InternalFoo.g:1932:1: ( ( rule__Component__AssembliesAssignment_8_1 ) )
            {
            // InternalFoo.g:1932:1: ( ( rule__Component__AssembliesAssignment_8_1 ) )
            // InternalFoo.g:1933:2: ( rule__Component__AssembliesAssignment_8_1 )
            {
             before(grammarAccess.getComponentAccess().getAssembliesAssignment_8_1()); 
            // InternalFoo.g:1934:2: ( rule__Component__AssembliesAssignment_8_1 )
            // InternalFoo.g:1934:3: rule__Component__AssembliesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__AssembliesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAssembliesAssignment_8_1()); 

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
    // $ANTLR end "rule__Component__Group_8__1__Impl"


    // $ANTLR start "rule__Component__Group_8_0__0"
    // InternalFoo.g:1943:1: rule__Component__Group_8_0__0 : rule__Component__Group_8_0__0__Impl rule__Component__Group_8_0__1 ;
    public final void rule__Component__Group_8_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1947:1: ( rule__Component__Group_8_0__0__Impl rule__Component__Group_8_0__1 )
            // InternalFoo.g:1948:2: rule__Component__Group_8_0__0__Impl rule__Component__Group_8_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Component__Group_8_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_8_0__1();

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
    // $ANTLR end "rule__Component__Group_8_0__0"


    // $ANTLR start "rule__Component__Group_8_0__0__Impl"
    // InternalFoo.g:1955:1: rule__Component__Group_8_0__0__Impl : ( 'assembly' ) ;
    public final void rule__Component__Group_8_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1959:1: ( ( 'assembly' ) )
            // InternalFoo.g:1960:1: ( 'assembly' )
            {
            // InternalFoo.g:1960:1: ( 'assembly' )
            // InternalFoo.g:1961:2: 'assembly'
            {
             before(grammarAccess.getComponentAccess().getAssemblyKeyword_8_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getAssemblyKeyword_8_0_0()); 

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
    // $ANTLR end "rule__Component__Group_8_0__0__Impl"


    // $ANTLR start "rule__Component__Group_8_0__1"
    // InternalFoo.g:1970:1: rule__Component__Group_8_0__1 : rule__Component__Group_8_0__1__Impl ;
    public final void rule__Component__Group_8_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1974:1: ( rule__Component__Group_8_0__1__Impl )
            // InternalFoo.g:1975:2: rule__Component__Group_8_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_8_0__1__Impl();

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
    // $ANTLR end "rule__Component__Group_8_0__1"


    // $ANTLR start "rule__Component__Group_8_0__1__Impl"
    // InternalFoo.g:1981:1: rule__Component__Group_8_0__1__Impl : ( ':' ) ;
    public final void rule__Component__Group_8_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1985:1: ( ( ':' ) )
            // InternalFoo.g:1986:1: ( ':' )
            {
            // InternalFoo.g:1986:1: ( ':' )
            // InternalFoo.g:1987:2: ':'
            {
             before(grammarAccess.getComponentAccess().getColonKeyword_8_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getColonKeyword_8_0_1()); 

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
    // $ANTLR end "rule__Component__Group_8_0__1__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group__0"
    // InternalFoo.g:1997:1: rule__ListOfProvidedServices__Group__0 : rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1 ;
    public final void rule__ListOfProvidedServices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2001:1: ( rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1 )
            // InternalFoo.g:2002:2: rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalFoo.g:2009:1: rule__ListOfProvidedServices__Group__0__Impl : ( 'provided' ) ;
    public final void rule__ListOfProvidedServices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2013:1: ( ( 'provided' ) )
            // InternalFoo.g:2014:1: ( 'provided' )
            {
            // InternalFoo.g:2014:1: ( 'provided' )
            // InternalFoo.g:2015:2: 'provided'
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getProvidedKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFoo.g:2024:1: rule__ListOfProvidedServices__Group__1 : rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2 ;
    public final void rule__ListOfProvidedServices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2028:1: ( rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2 )
            // InternalFoo.g:2029:2: rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2
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
    // InternalFoo.g:2036:1: rule__ListOfProvidedServices__Group__1__Impl : ( '=' ) ;
    public final void rule__ListOfProvidedServices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2040:1: ( ( '=' ) )
            // InternalFoo.g:2041:1: ( '=' )
            {
            // InternalFoo.g:2041:1: ( '=' )
            // InternalFoo.g:2042:2: '='
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getEqualsSignKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFoo.g:2051:1: rule__ListOfProvidedServices__Group__2 : rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3 ;
    public final void rule__ListOfProvidedServices__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2055:1: ( rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3 )
            // InternalFoo.g:2056:2: rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3
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
    // InternalFoo.g:2063:1: rule__ListOfProvidedServices__Group__2__Impl : ( '{' ) ;
    public final void rule__ListOfProvidedServices__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2067:1: ( ( '{' ) )
            // InternalFoo.g:2068:1: ( '{' )
            {
            // InternalFoo.g:2068:1: ( '{' )
            // InternalFoo.g:2069:2: '{'
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
    // InternalFoo.g:2078:1: rule__ListOfProvidedServices__Group__3 : rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4 ;
    public final void rule__ListOfProvidedServices__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2082:1: ( rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4 )
            // InternalFoo.g:2083:2: rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalFoo.g:2090:1: rule__ListOfProvidedServices__Group__3__Impl : ( ( rule__ListOfProvidedServices__Group_3__0 ) ) ;
    public final void rule__ListOfProvidedServices__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2094:1: ( ( ( rule__ListOfProvidedServices__Group_3__0 ) ) )
            // InternalFoo.g:2095:1: ( ( rule__ListOfProvidedServices__Group_3__0 ) )
            {
            // InternalFoo.g:2095:1: ( ( rule__ListOfProvidedServices__Group_3__0 ) )
            // InternalFoo.g:2096:2: ( rule__ListOfProvidedServices__Group_3__0 )
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getGroup_3()); 
            // InternalFoo.g:2097:2: ( rule__ListOfProvidedServices__Group_3__0 )
            // InternalFoo.g:2097:3: rule__ListOfProvidedServices__Group_3__0
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
    // InternalFoo.g:2105:1: rule__ListOfProvidedServices__Group__4 : rule__ListOfProvidedServices__Group__4__Impl ;
    public final void rule__ListOfProvidedServices__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2109:1: ( rule__ListOfProvidedServices__Group__4__Impl )
            // InternalFoo.g:2110:2: rule__ListOfProvidedServices__Group__4__Impl
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
    // InternalFoo.g:2116:1: rule__ListOfProvidedServices__Group__4__Impl : ( '}' ) ;
    public final void rule__ListOfProvidedServices__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2120:1: ( ( '}' ) )
            // InternalFoo.g:2121:1: ( '}' )
            {
            // InternalFoo.g:2121:1: ( '}' )
            // InternalFoo.g:2122:2: '}'
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
    // InternalFoo.g:2132:1: rule__ListOfProvidedServices__Group_3__0 : rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1 ;
    public final void rule__ListOfProvidedServices__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2136:1: ( rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1 )
            // InternalFoo.g:2137:2: rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalFoo.g:2144:1: rule__ListOfProvidedServices__Group_3__0__Impl : ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) ) ;
    public final void rule__ListOfProvidedServices__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2148:1: ( ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) ) )
            // InternalFoo.g:2149:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) )
            {
            // InternalFoo.g:2149:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) )
            // InternalFoo.g:2150:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 )
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_0()); 
            // InternalFoo.g:2151:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 )
            // InternalFoo.g:2151:3: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0
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
    // InternalFoo.g:2159:1: rule__ListOfProvidedServices__Group_3__1 : rule__ListOfProvidedServices__Group_3__1__Impl ;
    public final void rule__ListOfProvidedServices__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2163:1: ( rule__ListOfProvidedServices__Group_3__1__Impl )
            // InternalFoo.g:2164:2: rule__ListOfProvidedServices__Group_3__1__Impl
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
    // InternalFoo.g:2170:1: rule__ListOfProvidedServices__Group_3__1__Impl : ( ( rule__ListOfProvidedServices__Group_3_1__0 )* ) ;
    public final void rule__ListOfProvidedServices__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2174:1: ( ( ( rule__ListOfProvidedServices__Group_3_1__0 )* ) )
            // InternalFoo.g:2175:1: ( ( rule__ListOfProvidedServices__Group_3_1__0 )* )
            {
            // InternalFoo.g:2175:1: ( ( rule__ListOfProvidedServices__Group_3_1__0 )* )
            // InternalFoo.g:2176:2: ( rule__ListOfProvidedServices__Group_3_1__0 )*
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getGroup_3_1()); 
            // InternalFoo.g:2177:2: ( rule__ListOfProvidedServices__Group_3_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFoo.g:2177:3: rule__ListOfProvidedServices__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ListOfProvidedServices__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalFoo.g:2186:1: rule__ListOfProvidedServices__Group_3_1__0 : rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1 ;
    public final void rule__ListOfProvidedServices__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2190:1: ( rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1 )
            // InternalFoo.g:2191:2: rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1
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
    // InternalFoo.g:2198:1: rule__ListOfProvidedServices__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfProvidedServices__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2202:1: ( ( ',' ) )
            // InternalFoo.g:2203:1: ( ',' )
            {
            // InternalFoo.g:2203:1: ( ',' )
            // InternalFoo.g:2204:2: ','
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getCommaKeyword_3_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFoo.g:2213:1: rule__ListOfProvidedServices__Group_3_1__1 : rule__ListOfProvidedServices__Group_3_1__1__Impl ;
    public final void rule__ListOfProvidedServices__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2217:1: ( rule__ListOfProvidedServices__Group_3_1__1__Impl )
            // InternalFoo.g:2218:2: rule__ListOfProvidedServices__Group_3_1__1__Impl
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
    // InternalFoo.g:2224:1: rule__ListOfProvidedServices__Group_3_1__1__Impl : ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) ) ;
    public final void rule__ListOfProvidedServices__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2228:1: ( ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) ) )
            // InternalFoo.g:2229:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) )
            {
            // InternalFoo.g:2229:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) )
            // InternalFoo.g:2230:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 )
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_1_1()); 
            // InternalFoo.g:2231:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 )
            // InternalFoo.g:2231:3: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1
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


    // $ANTLR start "rule__ListOfrequiredServices__Group__0"
    // InternalFoo.g:2240:1: rule__ListOfrequiredServices__Group__0 : rule__ListOfrequiredServices__Group__0__Impl rule__ListOfrequiredServices__Group__1 ;
    public final void rule__ListOfrequiredServices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2244:1: ( rule__ListOfrequiredServices__Group__0__Impl rule__ListOfrequiredServices__Group__1 )
            // InternalFoo.g:2245:2: rule__ListOfrequiredServices__Group__0__Impl rule__ListOfrequiredServices__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ListOfrequiredServices__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group__1();

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
    // $ANTLR end "rule__ListOfrequiredServices__Group__0"


    // $ANTLR start "rule__ListOfrequiredServices__Group__0__Impl"
    // InternalFoo.g:2252:1: rule__ListOfrequiredServices__Group__0__Impl : ( () ) ;
    public final void rule__ListOfrequiredServices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2256:1: ( ( () ) )
            // InternalFoo.g:2257:1: ( () )
            {
            // InternalFoo.g:2257:1: ( () )
            // InternalFoo.g:2258:2: ()
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getListOfrequiredServicesAction_0()); 
            // InternalFoo.g:2259:2: ()
            // InternalFoo.g:2259:3: 
            {
            }

             after(grammarAccess.getListOfrequiredServicesAccess().getListOfrequiredServicesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOfrequiredServices__Group__0__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group__1"
    // InternalFoo.g:2267:1: rule__ListOfrequiredServices__Group__1 : rule__ListOfrequiredServices__Group__1__Impl rule__ListOfrequiredServices__Group__2 ;
    public final void rule__ListOfrequiredServices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2271:1: ( rule__ListOfrequiredServices__Group__1__Impl rule__ListOfrequiredServices__Group__2 )
            // InternalFoo.g:2272:2: rule__ListOfrequiredServices__Group__1__Impl rule__ListOfrequiredServices__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ListOfrequiredServices__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group__2();

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
    // $ANTLR end "rule__ListOfrequiredServices__Group__1"


    // $ANTLR start "rule__ListOfrequiredServices__Group__1__Impl"
    // InternalFoo.g:2279:1: rule__ListOfrequiredServices__Group__1__Impl : ( 'required' ) ;
    public final void rule__ListOfrequiredServices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2283:1: ( ( 'required' ) )
            // InternalFoo.g:2284:1: ( 'required' )
            {
            // InternalFoo.g:2284:1: ( 'required' )
            // InternalFoo.g:2285:2: 'required'
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getRequiredKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getListOfrequiredServicesAccess().getRequiredKeyword_1()); 

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
    // $ANTLR end "rule__ListOfrequiredServices__Group__1__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group__2"
    // InternalFoo.g:2294:1: rule__ListOfrequiredServices__Group__2 : rule__ListOfrequiredServices__Group__2__Impl rule__ListOfrequiredServices__Group__3 ;
    public final void rule__ListOfrequiredServices__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2298:1: ( rule__ListOfrequiredServices__Group__2__Impl rule__ListOfrequiredServices__Group__3 )
            // InternalFoo.g:2299:2: rule__ListOfrequiredServices__Group__2__Impl rule__ListOfrequiredServices__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ListOfrequiredServices__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group__3();

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
    // $ANTLR end "rule__ListOfrequiredServices__Group__2"


    // $ANTLR start "rule__ListOfrequiredServices__Group__2__Impl"
    // InternalFoo.g:2306:1: rule__ListOfrequiredServices__Group__2__Impl : ( '=' ) ;
    public final void rule__ListOfrequiredServices__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2310:1: ( ( '=' ) )
            // InternalFoo.g:2311:1: ( '=' )
            {
            // InternalFoo.g:2311:1: ( '=' )
            // InternalFoo.g:2312:2: '='
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getEqualsSignKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getListOfrequiredServicesAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__ListOfrequiredServices__Group__2__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group__3"
    // InternalFoo.g:2321:1: rule__ListOfrequiredServices__Group__3 : rule__ListOfrequiredServices__Group__3__Impl rule__ListOfrequiredServices__Group__4 ;
    public final void rule__ListOfrequiredServices__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2325:1: ( rule__ListOfrequiredServices__Group__3__Impl rule__ListOfrequiredServices__Group__4 )
            // InternalFoo.g:2326:2: rule__ListOfrequiredServices__Group__3__Impl rule__ListOfrequiredServices__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__ListOfrequiredServices__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group__4();

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
    // $ANTLR end "rule__ListOfrequiredServices__Group__3"


    // $ANTLR start "rule__ListOfrequiredServices__Group__3__Impl"
    // InternalFoo.g:2333:1: rule__ListOfrequiredServices__Group__3__Impl : ( '{' ) ;
    public final void rule__ListOfrequiredServices__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2337:1: ( ( '{' ) )
            // InternalFoo.g:2338:1: ( '{' )
            {
            // InternalFoo.g:2338:1: ( '{' )
            // InternalFoo.g:2339:2: '{'
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getListOfrequiredServicesAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ListOfrequiredServices__Group__3__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group__4"
    // InternalFoo.g:2348:1: rule__ListOfrequiredServices__Group__4 : rule__ListOfrequiredServices__Group__4__Impl rule__ListOfrequiredServices__Group__5 ;
    public final void rule__ListOfrequiredServices__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2352:1: ( rule__ListOfrequiredServices__Group__4__Impl rule__ListOfrequiredServices__Group__5 )
            // InternalFoo.g:2353:2: rule__ListOfrequiredServices__Group__4__Impl rule__ListOfrequiredServices__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__ListOfrequiredServices__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group__5();

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
    // $ANTLR end "rule__ListOfrequiredServices__Group__4"


    // $ANTLR start "rule__ListOfrequiredServices__Group__4__Impl"
    // InternalFoo.g:2360:1: rule__ListOfrequiredServices__Group__4__Impl : ( ( rule__ListOfrequiredServices__Group_4__0 ) ) ;
    public final void rule__ListOfrequiredServices__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2364:1: ( ( ( rule__ListOfrequiredServices__Group_4__0 ) ) )
            // InternalFoo.g:2365:1: ( ( rule__ListOfrequiredServices__Group_4__0 ) )
            {
            // InternalFoo.g:2365:1: ( ( rule__ListOfrequiredServices__Group_4__0 ) )
            // InternalFoo.g:2366:2: ( rule__ListOfrequiredServices__Group_4__0 )
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getGroup_4()); 
            // InternalFoo.g:2367:2: ( rule__ListOfrequiredServices__Group_4__0 )
            // InternalFoo.g:2367:3: rule__ListOfrequiredServices__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getListOfrequiredServicesAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ListOfrequiredServices__Group__4__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group__5"
    // InternalFoo.g:2375:1: rule__ListOfrequiredServices__Group__5 : rule__ListOfrequiredServices__Group__5__Impl ;
    public final void rule__ListOfrequiredServices__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2379:1: ( rule__ListOfrequiredServices__Group__5__Impl )
            // InternalFoo.g:2380:2: rule__ListOfrequiredServices__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group__5__Impl();

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
    // $ANTLR end "rule__ListOfrequiredServices__Group__5"


    // $ANTLR start "rule__ListOfrequiredServices__Group__5__Impl"
    // InternalFoo.g:2386:1: rule__ListOfrequiredServices__Group__5__Impl : ( '}' ) ;
    public final void rule__ListOfrequiredServices__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2390:1: ( ( '}' ) )
            // InternalFoo.g:2391:1: ( '}' )
            {
            // InternalFoo.g:2391:1: ( '}' )
            // InternalFoo.g:2392:2: '}'
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getListOfrequiredServicesAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ListOfrequiredServices__Group__5__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group_4__0"
    // InternalFoo.g:2402:1: rule__ListOfrequiredServices__Group_4__0 : rule__ListOfrequiredServices__Group_4__0__Impl rule__ListOfrequiredServices__Group_4__1 ;
    public final void rule__ListOfrequiredServices__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2406:1: ( rule__ListOfrequiredServices__Group_4__0__Impl rule__ListOfrequiredServices__Group_4__1 )
            // InternalFoo.g:2407:2: rule__ListOfrequiredServices__Group_4__0__Impl rule__ListOfrequiredServices__Group_4__1
            {
            pushFollow(FOLLOW_31);
            rule__ListOfrequiredServices__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group_4__1();

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
    // $ANTLR end "rule__ListOfrequiredServices__Group_4__0"


    // $ANTLR start "rule__ListOfrequiredServices__Group_4__0__Impl"
    // InternalFoo.g:2414:1: rule__ListOfrequiredServices__Group_4__0__Impl : ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? ) ;
    public final void rule__ListOfrequiredServices__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2418:1: ( ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? ) )
            // InternalFoo.g:2419:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? )
            {
            // InternalFoo.g:2419:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? )
            // InternalFoo.g:2420:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )?
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesAssignment_4_0()); 
            // InternalFoo.g:2421:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFoo.g:2421:3: rule__ListOfrequiredServices__RequiredServicesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListOfrequiredServices__RequiredServicesAssignment_4_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesAssignment_4_0()); 

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
    // $ANTLR end "rule__ListOfrequiredServices__Group_4__0__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group_4__1"
    // InternalFoo.g:2429:1: rule__ListOfrequiredServices__Group_4__1 : rule__ListOfrequiredServices__Group_4__1__Impl ;
    public final void rule__ListOfrequiredServices__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2433:1: ( rule__ListOfrequiredServices__Group_4__1__Impl )
            // InternalFoo.g:2434:2: rule__ListOfrequiredServices__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group_4__1__Impl();

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
    // $ANTLR end "rule__ListOfrequiredServices__Group_4__1"


    // $ANTLR start "rule__ListOfrequiredServices__Group_4__1__Impl"
    // InternalFoo.g:2440:1: rule__ListOfrequiredServices__Group_4__1__Impl : ( ( rule__ListOfrequiredServices__Group_4_1__0 )* ) ;
    public final void rule__ListOfrequiredServices__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2444:1: ( ( ( rule__ListOfrequiredServices__Group_4_1__0 )* ) )
            // InternalFoo.g:2445:1: ( ( rule__ListOfrequiredServices__Group_4_1__0 )* )
            {
            // InternalFoo.g:2445:1: ( ( rule__ListOfrequiredServices__Group_4_1__0 )* )
            // InternalFoo.g:2446:2: ( rule__ListOfrequiredServices__Group_4_1__0 )*
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getGroup_4_1()); 
            // InternalFoo.g:2447:2: ( rule__ListOfrequiredServices__Group_4_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFoo.g:2447:3: rule__ListOfrequiredServices__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ListOfrequiredServices__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getListOfrequiredServicesAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__ListOfrequiredServices__Group_4__1__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group_4_1__0"
    // InternalFoo.g:2456:1: rule__ListOfrequiredServices__Group_4_1__0 : rule__ListOfrequiredServices__Group_4_1__0__Impl rule__ListOfrequiredServices__Group_4_1__1 ;
    public final void rule__ListOfrequiredServices__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2460:1: ( rule__ListOfrequiredServices__Group_4_1__0__Impl rule__ListOfrequiredServices__Group_4_1__1 )
            // InternalFoo.g:2461:2: rule__ListOfrequiredServices__Group_4_1__0__Impl rule__ListOfrequiredServices__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ListOfrequiredServices__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group_4_1__1();

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
    // $ANTLR end "rule__ListOfrequiredServices__Group_4_1__0"


    // $ANTLR start "rule__ListOfrequiredServices__Group_4_1__0__Impl"
    // InternalFoo.g:2468:1: rule__ListOfrequiredServices__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfrequiredServices__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2472:1: ( ( ',' ) )
            // InternalFoo.g:2473:1: ( ',' )
            {
            // InternalFoo.g:2473:1: ( ',' )
            // InternalFoo.g:2474:2: ','
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getCommaKeyword_4_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getListOfrequiredServicesAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__ListOfrequiredServices__Group_4_1__0__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group_4_1__1"
    // InternalFoo.g:2483:1: rule__ListOfrequiredServices__Group_4_1__1 : rule__ListOfrequiredServices__Group_4_1__1__Impl ;
    public final void rule__ListOfrequiredServices__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2487:1: ( rule__ListOfrequiredServices__Group_4_1__1__Impl )
            // InternalFoo.g:2488:2: rule__ListOfrequiredServices__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__ListOfrequiredServices__Group_4_1__1"


    // $ANTLR start "rule__ListOfrequiredServices__Group_4_1__1__Impl"
    // InternalFoo.g:2494:1: rule__ListOfrequiredServices__Group_4_1__1__Impl : ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) ) ;
    public final void rule__ListOfrequiredServices__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2498:1: ( ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) ) )
            // InternalFoo.g:2499:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) )
            {
            // InternalFoo.g:2499:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) )
            // InternalFoo.g:2500:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 )
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesAssignment_4_1_1()); 
            // InternalFoo.g:2501:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 )
            // InternalFoo.g:2501:3: rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesAssignment_4_1_1()); 

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
    // $ANTLR end "rule__ListOfrequiredServices__Group_4_1__1__Impl"


    // $ANTLR start "rule__MProvidedService__Group__0"
    // InternalFoo.g:2510:1: rule__MProvidedService__Group__0 : rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1 ;
    public final void rule__MProvidedService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2514:1: ( rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1 )
            // InternalFoo.g:2515:2: rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFoo.g:2522:1: rule__MProvidedService__Group__0__Impl : ( 'service' ) ;
    public final void rule__MProvidedService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2526:1: ( ( 'service' ) )
            // InternalFoo.g:2527:1: ( 'service' )
            {
            // InternalFoo.g:2527:1: ( 'service' )
            // InternalFoo.g:2528:2: 'service'
            {
             before(grammarAccess.getMProvidedServiceAccess().getServiceKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalFoo.g:2537:1: rule__MProvidedService__Group__1 : rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2 ;
    public final void rule__MProvidedService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2541:1: ( rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2 )
            // InternalFoo.g:2542:2: rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2
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
    // InternalFoo.g:2549:1: rule__MProvidedService__Group__1__Impl : ( 'provided' ) ;
    public final void rule__MProvidedService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2553:1: ( ( 'provided' ) )
            // InternalFoo.g:2554:1: ( 'provided' )
            {
            // InternalFoo.g:2554:1: ( 'provided' )
            // InternalFoo.g:2555:2: 'provided'
            {
             before(grammarAccess.getMProvidedServiceAccess().getProvidedKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFoo.g:2564:1: rule__MProvidedService__Group__2 : rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3 ;
    public final void rule__MProvidedService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2568:1: ( rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3 )
            // InternalFoo.g:2569:2: rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3
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
    // InternalFoo.g:2576:1: rule__MProvidedService__Group__2__Impl : ( ( rule__MProvidedService__SignatureAssignment_2 ) ) ;
    public final void rule__MProvidedService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2580:1: ( ( ( rule__MProvidedService__SignatureAssignment_2 ) ) )
            // InternalFoo.g:2581:1: ( ( rule__MProvidedService__SignatureAssignment_2 ) )
            {
            // InternalFoo.g:2581:1: ( ( rule__MProvidedService__SignatureAssignment_2 ) )
            // InternalFoo.g:2582:2: ( rule__MProvidedService__SignatureAssignment_2 )
            {
             before(grammarAccess.getMProvidedServiceAccess().getSignatureAssignment_2()); 
            // InternalFoo.g:2583:2: ( rule__MProvidedService__SignatureAssignment_2 )
            // InternalFoo.g:2583:3: rule__MProvidedService__SignatureAssignment_2
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
    // InternalFoo.g:2591:1: rule__MProvidedService__Group__3 : rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4 ;
    public final void rule__MProvidedService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2595:1: ( rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4 )
            // InternalFoo.g:2596:2: rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalFoo.g:2603:1: rule__MProvidedService__Group__3__Impl : ( '{' ) ;
    public final void rule__MProvidedService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2607:1: ( ( '{' ) )
            // InternalFoo.g:2608:1: ( '{' )
            {
            // InternalFoo.g:2608:1: ( '{' )
            // InternalFoo.g:2609:2: '{'
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
    // InternalFoo.g:2618:1: rule__MProvidedService__Group__4 : rule__MProvidedService__Group__4__Impl ;
    public final void rule__MProvidedService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2622:1: ( rule__MProvidedService__Group__4__Impl )
            // InternalFoo.g:2623:2: rule__MProvidedService__Group__4__Impl
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
    // InternalFoo.g:2629:1: rule__MProvidedService__Group__4__Impl : ( '}' ) ;
    public final void rule__MProvidedService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2633:1: ( ( '}' ) )
            // InternalFoo.g:2634:1: ( '}' )
            {
            // InternalFoo.g:2634:1: ( '}' )
            // InternalFoo.g:2635:2: '}'
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
    // InternalFoo.g:2645:1: rule__PSignature__Group__0 : rule__PSignature__Group__0__Impl rule__PSignature__Group__1 ;
    public final void rule__PSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2649:1: ( rule__PSignature__Group__0__Impl rule__PSignature__Group__1 )
            // InternalFoo.g:2650:2: rule__PSignature__Group__0__Impl rule__PSignature__Group__1
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
    // InternalFoo.g:2657:1: rule__PSignature__Group__0__Impl : ( ( rule__PSignature__TypeAssignment_0 ) ) ;
    public final void rule__PSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2661:1: ( ( ( rule__PSignature__TypeAssignment_0 ) ) )
            // InternalFoo.g:2662:1: ( ( rule__PSignature__TypeAssignment_0 ) )
            {
            // InternalFoo.g:2662:1: ( ( rule__PSignature__TypeAssignment_0 ) )
            // InternalFoo.g:2663:2: ( rule__PSignature__TypeAssignment_0 )
            {
             before(grammarAccess.getPSignatureAccess().getTypeAssignment_0()); 
            // InternalFoo.g:2664:2: ( rule__PSignature__TypeAssignment_0 )
            // InternalFoo.g:2664:3: rule__PSignature__TypeAssignment_0
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
    // InternalFoo.g:2672:1: rule__PSignature__Group__1 : rule__PSignature__Group__1__Impl rule__PSignature__Group__2 ;
    public final void rule__PSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2676:1: ( rule__PSignature__Group__1__Impl rule__PSignature__Group__2 )
            // InternalFoo.g:2677:2: rule__PSignature__Group__1__Impl rule__PSignature__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalFoo.g:2684:1: rule__PSignature__Group__1__Impl : ( ( rule__PSignature__NameAssignment_1 ) ) ;
    public final void rule__PSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2688:1: ( ( ( rule__PSignature__NameAssignment_1 ) ) )
            // InternalFoo.g:2689:1: ( ( rule__PSignature__NameAssignment_1 ) )
            {
            // InternalFoo.g:2689:1: ( ( rule__PSignature__NameAssignment_1 ) )
            // InternalFoo.g:2690:2: ( rule__PSignature__NameAssignment_1 )
            {
             before(grammarAccess.getPSignatureAccess().getNameAssignment_1()); 
            // InternalFoo.g:2691:2: ( rule__PSignature__NameAssignment_1 )
            // InternalFoo.g:2691:3: rule__PSignature__NameAssignment_1
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
    // InternalFoo.g:2699:1: rule__PSignature__Group__2 : rule__PSignature__Group__2__Impl rule__PSignature__Group__3 ;
    public final void rule__PSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2703:1: ( rule__PSignature__Group__2__Impl rule__PSignature__Group__3 )
            // InternalFoo.g:2704:2: rule__PSignature__Group__2__Impl rule__PSignature__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalFoo.g:2711:1: rule__PSignature__Group__2__Impl : ( '(' ) ;
    public final void rule__PSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2715:1: ( ( '(' ) )
            // InternalFoo.g:2716:1: ( '(' )
            {
            // InternalFoo.g:2716:1: ( '(' )
            // InternalFoo.g:2717:2: '('
            {
             before(grammarAccess.getPSignatureAccess().getLeftParenthesisKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalFoo.g:2726:1: rule__PSignature__Group__3 : rule__PSignature__Group__3__Impl rule__PSignature__Group__4 ;
    public final void rule__PSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2730:1: ( rule__PSignature__Group__3__Impl rule__PSignature__Group__4 )
            // InternalFoo.g:2731:2: rule__PSignature__Group__3__Impl rule__PSignature__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalFoo.g:2738:1: rule__PSignature__Group__3__Impl : ( ( rule__PSignature__ParametersAssignment_3 )? ) ;
    public final void rule__PSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2742:1: ( ( ( rule__PSignature__ParametersAssignment_3 )? ) )
            // InternalFoo.g:2743:1: ( ( rule__PSignature__ParametersAssignment_3 )? )
            {
            // InternalFoo.g:2743:1: ( ( rule__PSignature__ParametersAssignment_3 )? )
            // InternalFoo.g:2744:2: ( rule__PSignature__ParametersAssignment_3 )?
            {
             before(grammarAccess.getPSignatureAccess().getParametersAssignment_3()); 
            // InternalFoo.g:2745:2: ( rule__PSignature__ParametersAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFoo.g:2745:3: rule__PSignature__ParametersAssignment_3
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
    // InternalFoo.g:2753:1: rule__PSignature__Group__4 : rule__PSignature__Group__4__Impl rule__PSignature__Group__5 ;
    public final void rule__PSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2757:1: ( rule__PSignature__Group__4__Impl rule__PSignature__Group__5 )
            // InternalFoo.g:2758:2: rule__PSignature__Group__4__Impl rule__PSignature__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalFoo.g:2765:1: rule__PSignature__Group__4__Impl : ( ( rule__PSignature__Group_4__0 )* ) ;
    public final void rule__PSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2769:1: ( ( ( rule__PSignature__Group_4__0 )* ) )
            // InternalFoo.g:2770:1: ( ( rule__PSignature__Group_4__0 )* )
            {
            // InternalFoo.g:2770:1: ( ( rule__PSignature__Group_4__0 )* )
            // InternalFoo.g:2771:2: ( rule__PSignature__Group_4__0 )*
            {
             before(grammarAccess.getPSignatureAccess().getGroup_4()); 
            // InternalFoo.g:2772:2: ( rule__PSignature__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalFoo.g:2772:3: rule__PSignature__Group_4__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__PSignature__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalFoo.g:2780:1: rule__PSignature__Group__5 : rule__PSignature__Group__5__Impl ;
    public final void rule__PSignature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2784:1: ( rule__PSignature__Group__5__Impl )
            // InternalFoo.g:2785:2: rule__PSignature__Group__5__Impl
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
    // InternalFoo.g:2791:1: rule__PSignature__Group__5__Impl : ( ')' ) ;
    public final void rule__PSignature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2795:1: ( ( ')' ) )
            // InternalFoo.g:2796:1: ( ')' )
            {
            // InternalFoo.g:2796:1: ( ')' )
            // InternalFoo.g:2797:2: ')'
            {
             before(grammarAccess.getPSignatureAccess().getRightParenthesisKeyword_5()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFoo.g:2807:1: rule__PSignature__Group_4__0 : rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1 ;
    public final void rule__PSignature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2811:1: ( rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1 )
            // InternalFoo.g:2812:2: rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1
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
    // InternalFoo.g:2819:1: rule__PSignature__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PSignature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2823:1: ( ( ',' ) )
            // InternalFoo.g:2824:1: ( ',' )
            {
            // InternalFoo.g:2824:1: ( ',' )
            // InternalFoo.g:2825:2: ','
            {
             before(grammarAccess.getPSignatureAccess().getCommaKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFoo.g:2834:1: rule__PSignature__Group_4__1 : rule__PSignature__Group_4__1__Impl ;
    public final void rule__PSignature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2838:1: ( rule__PSignature__Group_4__1__Impl )
            // InternalFoo.g:2839:2: rule__PSignature__Group_4__1__Impl
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
    // InternalFoo.g:2845:1: rule__PSignature__Group_4__1__Impl : ( ( rule__PSignature__ParametersAssignment_4_1 ) ) ;
    public final void rule__PSignature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2849:1: ( ( ( rule__PSignature__ParametersAssignment_4_1 ) ) )
            // InternalFoo.g:2850:1: ( ( rule__PSignature__ParametersAssignment_4_1 ) )
            {
            // InternalFoo.g:2850:1: ( ( rule__PSignature__ParametersAssignment_4_1 ) )
            // InternalFoo.g:2851:2: ( rule__PSignature__ParametersAssignment_4_1 )
            {
             before(grammarAccess.getPSignatureAccess().getParametersAssignment_4_1()); 
            // InternalFoo.g:2852:2: ( rule__PSignature__ParametersAssignment_4_1 )
            // InternalFoo.g:2852:3: rule__PSignature__ParametersAssignment_4_1
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


    // $ANTLR start "rule__MRequiredService__Group__0"
    // InternalFoo.g:2861:1: rule__MRequiredService__Group__0 : rule__MRequiredService__Group__0__Impl rule__MRequiredService__Group__1 ;
    public final void rule__MRequiredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2865:1: ( rule__MRequiredService__Group__0__Impl rule__MRequiredService__Group__1 )
            // InternalFoo.g:2866:2: rule__MRequiredService__Group__0__Impl rule__MRequiredService__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__MRequiredService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MRequiredService__Group__1();

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
    // $ANTLR end "rule__MRequiredService__Group__0"


    // $ANTLR start "rule__MRequiredService__Group__0__Impl"
    // InternalFoo.g:2873:1: rule__MRequiredService__Group__0__Impl : ( 'service' ) ;
    public final void rule__MRequiredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2877:1: ( ( 'service' ) )
            // InternalFoo.g:2878:1: ( 'service' )
            {
            // InternalFoo.g:2878:1: ( 'service' )
            // InternalFoo.g:2879:2: 'service'
            {
             before(grammarAccess.getMRequiredServiceAccess().getServiceKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMRequiredServiceAccess().getServiceKeyword_0()); 

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
    // $ANTLR end "rule__MRequiredService__Group__0__Impl"


    // $ANTLR start "rule__MRequiredService__Group__1"
    // InternalFoo.g:2888:1: rule__MRequiredService__Group__1 : rule__MRequiredService__Group__1__Impl rule__MRequiredService__Group__2 ;
    public final void rule__MRequiredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2892:1: ( rule__MRequiredService__Group__1__Impl rule__MRequiredService__Group__2 )
            // InternalFoo.g:2893:2: rule__MRequiredService__Group__1__Impl rule__MRequiredService__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MRequiredService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MRequiredService__Group__2();

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
    // $ANTLR end "rule__MRequiredService__Group__1"


    // $ANTLR start "rule__MRequiredService__Group__1__Impl"
    // InternalFoo.g:2900:1: rule__MRequiredService__Group__1__Impl : ( 'required' ) ;
    public final void rule__MRequiredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2904:1: ( ( 'required' ) )
            // InternalFoo.g:2905:1: ( 'required' )
            {
            // InternalFoo.g:2905:1: ( 'required' )
            // InternalFoo.g:2906:2: 'required'
            {
             before(grammarAccess.getMRequiredServiceAccess().getRequiredKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMRequiredServiceAccess().getRequiredKeyword_1()); 

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
    // $ANTLR end "rule__MRequiredService__Group__1__Impl"


    // $ANTLR start "rule__MRequiredService__Group__2"
    // InternalFoo.g:2915:1: rule__MRequiredService__Group__2 : rule__MRequiredService__Group__2__Impl rule__MRequiredService__Group__3 ;
    public final void rule__MRequiredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2919:1: ( rule__MRequiredService__Group__2__Impl rule__MRequiredService__Group__3 )
            // InternalFoo.g:2920:2: rule__MRequiredService__Group__2__Impl rule__MRequiredService__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__MRequiredService__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MRequiredService__Group__3();

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
    // $ANTLR end "rule__MRequiredService__Group__2"


    // $ANTLR start "rule__MRequiredService__Group__2__Impl"
    // InternalFoo.g:2927:1: rule__MRequiredService__Group__2__Impl : ( ( rule__MRequiredService__SignatureAssignment_2 ) ) ;
    public final void rule__MRequiredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2931:1: ( ( ( rule__MRequiredService__SignatureAssignment_2 ) ) )
            // InternalFoo.g:2932:1: ( ( rule__MRequiredService__SignatureAssignment_2 ) )
            {
            // InternalFoo.g:2932:1: ( ( rule__MRequiredService__SignatureAssignment_2 ) )
            // InternalFoo.g:2933:2: ( rule__MRequiredService__SignatureAssignment_2 )
            {
             before(grammarAccess.getMRequiredServiceAccess().getSignatureAssignment_2()); 
            // InternalFoo.g:2934:2: ( rule__MRequiredService__SignatureAssignment_2 )
            // InternalFoo.g:2934:3: rule__MRequiredService__SignatureAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MRequiredService__SignatureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMRequiredServiceAccess().getSignatureAssignment_2()); 

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
    // $ANTLR end "rule__MRequiredService__Group__2__Impl"


    // $ANTLR start "rule__MRequiredService__Group__3"
    // InternalFoo.g:2942:1: rule__MRequiredService__Group__3 : rule__MRequiredService__Group__3__Impl ;
    public final void rule__MRequiredService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2946:1: ( rule__MRequiredService__Group__3__Impl )
            // InternalFoo.g:2947:2: rule__MRequiredService__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MRequiredService__Group__3__Impl();

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
    // $ANTLR end "rule__MRequiredService__Group__3"


    // $ANTLR start "rule__MRequiredService__Group__3__Impl"
    // InternalFoo.g:2953:1: rule__MRequiredService__Group__3__Impl : ( ';' ) ;
    public final void rule__MRequiredService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2957:1: ( ( ';' ) )
            // InternalFoo.g:2958:1: ( ';' )
            {
            // InternalFoo.g:2958:1: ( ';' )
            // InternalFoo.g:2959:2: ';'
            {
             before(grammarAccess.getMRequiredServiceAccess().getSemicolonKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMRequiredServiceAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__MRequiredService__Group__3__Impl"


    // $ANTLR start "rule__RSignature__Group__0"
    // InternalFoo.g:2969:1: rule__RSignature__Group__0 : rule__RSignature__Group__0__Impl rule__RSignature__Group__1 ;
    public final void rule__RSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2973:1: ( rule__RSignature__Group__0__Impl rule__RSignature__Group__1 )
            // InternalFoo.g:2974:2: rule__RSignature__Group__0__Impl rule__RSignature__Group__1
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
    // InternalFoo.g:2981:1: rule__RSignature__Group__0__Impl : ( ( rule__RSignature__TypeAssignment_0 ) ) ;
    public final void rule__RSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2985:1: ( ( ( rule__RSignature__TypeAssignment_0 ) ) )
            // InternalFoo.g:2986:1: ( ( rule__RSignature__TypeAssignment_0 ) )
            {
            // InternalFoo.g:2986:1: ( ( rule__RSignature__TypeAssignment_0 ) )
            // InternalFoo.g:2987:2: ( rule__RSignature__TypeAssignment_0 )
            {
             before(grammarAccess.getRSignatureAccess().getTypeAssignment_0()); 
            // InternalFoo.g:2988:2: ( rule__RSignature__TypeAssignment_0 )
            // InternalFoo.g:2988:3: rule__RSignature__TypeAssignment_0
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
    // InternalFoo.g:2996:1: rule__RSignature__Group__1 : rule__RSignature__Group__1__Impl rule__RSignature__Group__2 ;
    public final void rule__RSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3000:1: ( rule__RSignature__Group__1__Impl rule__RSignature__Group__2 )
            // InternalFoo.g:3001:2: rule__RSignature__Group__1__Impl rule__RSignature__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalFoo.g:3008:1: rule__RSignature__Group__1__Impl : ( ( rule__RSignature__NameAssignment_1 ) ) ;
    public final void rule__RSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3012:1: ( ( ( rule__RSignature__NameAssignment_1 ) ) )
            // InternalFoo.g:3013:1: ( ( rule__RSignature__NameAssignment_1 ) )
            {
            // InternalFoo.g:3013:1: ( ( rule__RSignature__NameAssignment_1 ) )
            // InternalFoo.g:3014:2: ( rule__RSignature__NameAssignment_1 )
            {
             before(grammarAccess.getRSignatureAccess().getNameAssignment_1()); 
            // InternalFoo.g:3015:2: ( rule__RSignature__NameAssignment_1 )
            // InternalFoo.g:3015:3: rule__RSignature__NameAssignment_1
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
    // InternalFoo.g:3023:1: rule__RSignature__Group__2 : rule__RSignature__Group__2__Impl rule__RSignature__Group__3 ;
    public final void rule__RSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3027:1: ( rule__RSignature__Group__2__Impl rule__RSignature__Group__3 )
            // InternalFoo.g:3028:2: rule__RSignature__Group__2__Impl rule__RSignature__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalFoo.g:3035:1: rule__RSignature__Group__2__Impl : ( '(' ) ;
    public final void rule__RSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3039:1: ( ( '(' ) )
            // InternalFoo.g:3040:1: ( '(' )
            {
            // InternalFoo.g:3040:1: ( '(' )
            // InternalFoo.g:3041:2: '('
            {
             before(grammarAccess.getRSignatureAccess().getLeftParenthesisKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalFoo.g:3050:1: rule__RSignature__Group__3 : rule__RSignature__Group__3__Impl rule__RSignature__Group__4 ;
    public final void rule__RSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3054:1: ( rule__RSignature__Group__3__Impl rule__RSignature__Group__4 )
            // InternalFoo.g:3055:2: rule__RSignature__Group__3__Impl rule__RSignature__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalFoo.g:3062:1: rule__RSignature__Group__3__Impl : ( ( rule__RSignature__ParametersAssignment_3 )? ) ;
    public final void rule__RSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3066:1: ( ( ( rule__RSignature__ParametersAssignment_3 )? ) )
            // InternalFoo.g:3067:1: ( ( rule__RSignature__ParametersAssignment_3 )? )
            {
            // InternalFoo.g:3067:1: ( ( rule__RSignature__ParametersAssignment_3 )? )
            // InternalFoo.g:3068:2: ( rule__RSignature__ParametersAssignment_3 )?
            {
             before(grammarAccess.getRSignatureAccess().getParametersAssignment_3()); 
            // InternalFoo.g:3069:2: ( rule__RSignature__ParametersAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFoo.g:3069:3: rule__RSignature__ParametersAssignment_3
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
    // InternalFoo.g:3077:1: rule__RSignature__Group__4 : rule__RSignature__Group__4__Impl rule__RSignature__Group__5 ;
    public final void rule__RSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3081:1: ( rule__RSignature__Group__4__Impl rule__RSignature__Group__5 )
            // InternalFoo.g:3082:2: rule__RSignature__Group__4__Impl rule__RSignature__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalFoo.g:3089:1: rule__RSignature__Group__4__Impl : ( ( rule__RSignature__Group_4__0 )* ) ;
    public final void rule__RSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3093:1: ( ( ( rule__RSignature__Group_4__0 )* ) )
            // InternalFoo.g:3094:1: ( ( rule__RSignature__Group_4__0 )* )
            {
            // InternalFoo.g:3094:1: ( ( rule__RSignature__Group_4__0 )* )
            // InternalFoo.g:3095:2: ( rule__RSignature__Group_4__0 )*
            {
             before(grammarAccess.getRSignatureAccess().getGroup_4()); 
            // InternalFoo.g:3096:2: ( rule__RSignature__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFoo.g:3096:3: rule__RSignature__Group_4__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__RSignature__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalFoo.g:3104:1: rule__RSignature__Group__5 : rule__RSignature__Group__5__Impl ;
    public final void rule__RSignature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3108:1: ( rule__RSignature__Group__5__Impl )
            // InternalFoo.g:3109:2: rule__RSignature__Group__5__Impl
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
    // InternalFoo.g:3115:1: rule__RSignature__Group__5__Impl : ( ')' ) ;
    public final void rule__RSignature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3119:1: ( ( ')' ) )
            // InternalFoo.g:3120:1: ( ')' )
            {
            // InternalFoo.g:3120:1: ( ')' )
            // InternalFoo.g:3121:2: ')'
            {
             before(grammarAccess.getRSignatureAccess().getRightParenthesisKeyword_5()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFoo.g:3131:1: rule__RSignature__Group_4__0 : rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1 ;
    public final void rule__RSignature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3135:1: ( rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1 )
            // InternalFoo.g:3136:2: rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1
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
    // InternalFoo.g:3143:1: rule__RSignature__Group_4__0__Impl : ( ',' ) ;
    public final void rule__RSignature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3147:1: ( ( ',' ) )
            // InternalFoo.g:3148:1: ( ',' )
            {
            // InternalFoo.g:3148:1: ( ',' )
            // InternalFoo.g:3149:2: ','
            {
             before(grammarAccess.getRSignatureAccess().getCommaKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFoo.g:3158:1: rule__RSignature__Group_4__1 : rule__RSignature__Group_4__1__Impl ;
    public final void rule__RSignature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3162:1: ( rule__RSignature__Group_4__1__Impl )
            // InternalFoo.g:3163:2: rule__RSignature__Group_4__1__Impl
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
    // InternalFoo.g:3169:1: rule__RSignature__Group_4__1__Impl : ( ( rule__RSignature__ParametersAssignment_4_1 ) ) ;
    public final void rule__RSignature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3173:1: ( ( ( rule__RSignature__ParametersAssignment_4_1 ) ) )
            // InternalFoo.g:3174:1: ( ( rule__RSignature__ParametersAssignment_4_1 ) )
            {
            // InternalFoo.g:3174:1: ( ( rule__RSignature__ParametersAssignment_4_1 ) )
            // InternalFoo.g:3175:2: ( rule__RSignature__ParametersAssignment_4_1 )
            {
             before(grammarAccess.getRSignatureAccess().getParametersAssignment_4_1()); 
            // InternalFoo.g:3176:2: ( rule__RSignature__ParametersAssignment_4_1 )
            // InternalFoo.g:3176:3: rule__RSignature__ParametersAssignment_4_1
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
    // InternalFoo.g:3185:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3189:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalFoo.g:3190:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalFoo.g:3197:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3201:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalFoo.g:3202:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalFoo.g:3202:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalFoo.g:3203:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalFoo.g:3204:2: ( rule__Parameter__NameAssignment_0 )
            // InternalFoo.g:3204:3: rule__Parameter__NameAssignment_0
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
    // InternalFoo.g:3212:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3216:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalFoo.g:3217:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalFoo.g:3224:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3228:1: ( ( ':' ) )
            // InternalFoo.g:3229:1: ( ':' )
            {
            // InternalFoo.g:3229:1: ( ':' )
            // InternalFoo.g:3230:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalFoo.g:3239:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3243:1: ( rule__Parameter__Group__2__Impl )
            // InternalFoo.g:3244:2: rule__Parameter__Group__2__Impl
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
    // InternalFoo.g:3250:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3254:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalFoo.g:3255:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalFoo.g:3255:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalFoo.g:3256:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalFoo.g:3257:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalFoo.g:3257:3: rule__Parameter__TypeAssignment_2
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
    // InternalFoo.g:3266:1: rule__DomainModel__ModelAssignment : ( ruleModel ) ;
    public final void rule__DomainModel__ModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3270:1: ( ( ruleModel ) )
            // InternalFoo.g:3271:2: ( ruleModel )
            {
            // InternalFoo.g:3271:2: ( ruleModel )
            // InternalFoo.g:3272:3: ruleModel
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
    // InternalFoo.g:3281:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3285:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3286:2: ( ruleQualifiedName )
            {
            // InternalFoo.g:3286:2: ( ruleQualifiedName )
            // InternalFoo.g:3287:3: ruleQualifiedName
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
    // InternalFoo.g:3296:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3300:1: ( ( ruleImport ) )
            // InternalFoo.g:3301:2: ( ruleImport )
            {
            // InternalFoo.g:3301:2: ( ruleImport )
            // InternalFoo.g:3302:3: ruleImport
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
    // InternalFoo.g:3311:1: rule__Model__ComponentsAssignment_4 : ( ruleComponent ) ;
    public final void rule__Model__ComponentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3315:1: ( ( ruleComponent ) )
            // InternalFoo.g:3316:2: ( ruleComponent )
            {
            // InternalFoo.g:3316:2: ( ruleComponent )
            // InternalFoo.g:3317:3: ruleComponent
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
    // InternalFoo.g:3326:1: rule__Model__AssemblyAssignment_5 : ( ruleAssembly ) ;
    public final void rule__Model__AssemblyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3330:1: ( ( ruleAssembly ) )
            // InternalFoo.g:3331:2: ( ruleAssembly )
            {
            // InternalFoo.g:3331:2: ( ruleAssembly )
            // InternalFoo.g:3332:3: ruleAssembly
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
    // InternalFoo.g:3341:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3345:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalFoo.g:3346:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalFoo.g:3346:2: ( ruleQualifiedNameWithWildcard )
            // InternalFoo.g:3347:3: ruleQualifiedNameWithWildcard
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
    // InternalFoo.g:3356:1: rule__Assembly__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Assembly__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3360:1: ( ( RULE_ID ) )
            // InternalFoo.g:3361:2: ( RULE_ID )
            {
            // InternalFoo.g:3361:2: ( RULE_ID )
            // InternalFoo.g:3362:3: RULE_ID
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
    // InternalFoo.g:3371:1: rule__Assembly__AttributesAssignment_5 : ( ruleComponentInstance ) ;
    public final void rule__Assembly__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3375:1: ( ( ruleComponentInstance ) )
            // InternalFoo.g:3376:2: ( ruleComponentInstance )
            {
            // InternalFoo.g:3376:2: ( ruleComponentInstance )
            // InternalFoo.g:3377:3: ruleComponentInstance
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
    // InternalFoo.g:3386:1: rule__Assembly__AttributesAssignment_6 : ( ruleComponentInstance ) ;
    public final void rule__Assembly__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3390:1: ( ( ruleComponentInstance ) )
            // InternalFoo.g:3391:2: ( ruleComponentInstance )
            {
            // InternalFoo.g:3391:2: ( ruleComponentInstance )
            // InternalFoo.g:3392:3: ruleComponentInstance
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


    // $ANTLR start "rule__Assembly__BindingsAssignment_8"
    // InternalFoo.g:3401:1: rule__Assembly__BindingsAssignment_8 : ( ruleBinding ) ;
    public final void rule__Assembly__BindingsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3405:1: ( ( ruleBinding ) )
            // InternalFoo.g:3406:2: ( ruleBinding )
            {
            // InternalFoo.g:3406:2: ( ruleBinding )
            // InternalFoo.g:3407:3: ruleBinding
            {
             before(grammarAccess.getAssemblyAccess().getBindingsBindingParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getAssemblyAccess().getBindingsBindingParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Assembly__BindingsAssignment_8"


    // $ANTLR start "rule__ComponentInstance__NameAssignment_0"
    // InternalFoo.g:3416:1: rule__ComponentInstance__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ComponentInstance__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3420:1: ( ( RULE_ID ) )
            // InternalFoo.g:3421:2: ( RULE_ID )
            {
            // InternalFoo.g:3421:2: ( RULE_ID )
            // InternalFoo.g:3422:3: RULE_ID
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
    // InternalFoo.g:3431:1: rule__ComponentInstance__ComponentAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComponentInstance__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3435:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3436:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3436:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3437:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentComponentCrossReference_2_0()); 
            // InternalFoo.g:3438:3: ( ruleQualifiedName )
            // InternalFoo.g:3439:4: ruleQualifiedName
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


    // $ANTLR start "rule__Binding__BindingRequiredAssignment_0"
    // InternalFoo.g:3450:1: rule__Binding__BindingRequiredAssignment_0 : ( ruleBindingRequired ) ;
    public final void rule__Binding__BindingRequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3454:1: ( ( ruleBindingRequired ) )
            // InternalFoo.g:3455:2: ( ruleBindingRequired )
            {
            // InternalFoo.g:3455:2: ( ruleBindingRequired )
            // InternalFoo.g:3456:3: ruleBindingRequired
            {
             before(grammarAccess.getBindingAccess().getBindingRequiredBindingRequiredParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBindingRequired();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getBindingRequiredBindingRequiredParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Binding__BindingRequiredAssignment_0"


    // $ANTLR start "rule__Binding__BindingProvidedAssignment_2"
    // InternalFoo.g:3465:1: rule__Binding__BindingProvidedAssignment_2 : ( ruleBindingProvided ) ;
    public final void rule__Binding__BindingProvidedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3469:1: ( ( ruleBindingProvided ) )
            // InternalFoo.g:3470:2: ( ruleBindingProvided )
            {
            // InternalFoo.g:3470:2: ( ruleBindingProvided )
            // InternalFoo.g:3471:3: ruleBindingProvided
            {
             before(grammarAccess.getBindingAccess().getBindingProvidedBindingProvidedParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBindingProvided();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getBindingProvidedBindingProvidedParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Binding__BindingProvidedAssignment_2"


    // $ANTLR start "rule__BindingRequired__NameAssignment_0"
    // InternalFoo.g:3480:1: rule__BindingRequired__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BindingRequired__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3484:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:3485:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:3485:2: ( ( RULE_ID ) )
            // InternalFoo.g:3486:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingRequiredAccess().getNameComponentInstanceCrossReference_0_0()); 
            // InternalFoo.g:3487:3: ( RULE_ID )
            // InternalFoo.g:3488:4: RULE_ID
            {
             before(grammarAccess.getBindingRequiredAccess().getNameComponentInstanceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingRequiredAccess().getNameComponentInstanceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBindingRequiredAccess().getNameComponentInstanceCrossReference_0_0()); 

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
    // $ANTLR end "rule__BindingRequired__NameAssignment_0"


    // $ANTLR start "rule__BindingRequired__ServiceAssignment_2"
    // InternalFoo.g:3499:1: rule__BindingRequired__ServiceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingRequired__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3503:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3504:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3504:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3505:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBindingRequiredAccess().getServiceRSignatureCrossReference_2_0()); 
            // InternalFoo.g:3506:3: ( ruleQualifiedName )
            // InternalFoo.g:3507:4: ruleQualifiedName
            {
             before(grammarAccess.getBindingRequiredAccess().getServiceRSignatureQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBindingRequiredAccess().getServiceRSignatureQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBindingRequiredAccess().getServiceRSignatureCrossReference_2_0()); 

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
    // $ANTLR end "rule__BindingRequired__ServiceAssignment_2"


    // $ANTLR start "rule__BindingProvided__NameAssignment_0"
    // InternalFoo.g:3518:1: rule__BindingProvided__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BindingProvided__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3522:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:3523:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:3523:2: ( ( RULE_ID ) )
            // InternalFoo.g:3524:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingProvidedAccess().getNameComponentInstanceCrossReference_0_0()); 
            // InternalFoo.g:3525:3: ( RULE_ID )
            // InternalFoo.g:3526:4: RULE_ID
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
    // InternalFoo.g:3537:1: rule__BindingProvided__ServiceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingProvided__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3541:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3542:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3542:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3543:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBindingProvidedAccess().getServicePSignatureCrossReference_2_0()); 
            // InternalFoo.g:3544:3: ( ruleQualifiedName )
            // InternalFoo.g:3545:4: ruleQualifiedName
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
    // InternalFoo.g:3556:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3560:1: ( ( RULE_ID ) )
            // InternalFoo.g:3561:2: ( RULE_ID )
            {
            // InternalFoo.g:3561:2: ( RULE_ID )
            // InternalFoo.g:3562:3: RULE_ID
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


    // $ANTLR start "rule__Component__RefinedComponentAssignment_2_1"
    // InternalFoo.g:3571:1: rule__Component__RefinedComponentAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Component__RefinedComponentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3575:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3576:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3576:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3577:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentAccess().getRefinedComponentComponentCrossReference_2_1_0()); 
            // InternalFoo.g:3578:3: ( ruleQualifiedName )
            // InternalFoo.g:3579:4: ruleQualifiedName
            {
             before(grammarAccess.getComponentAccess().getRefinedComponentComponentQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getRefinedComponentComponentQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getRefinedComponentComponentCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Component__RefinedComponentAssignment_2_1"


    // $ANTLR start "rule__Component__ListOfPServicesAssignment_4"
    // InternalFoo.g:3590:1: rule__Component__ListOfPServicesAssignment_4 : ( ruleListOfProvidedServices ) ;
    public final void rule__Component__ListOfPServicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3594:1: ( ( ruleListOfProvidedServices ) )
            // InternalFoo.g:3595:2: ( ruleListOfProvidedServices )
            {
            // InternalFoo.g:3595:2: ( ruleListOfProvidedServices )
            // InternalFoo.g:3596:3: ruleListOfProvidedServices
            {
             before(grammarAccess.getComponentAccess().getListOfPServicesListOfProvidedServicesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfProvidedServices();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getListOfPServicesListOfProvidedServicesParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Component__ListOfPServicesAssignment_4"


    // $ANTLR start "rule__Component__ListOfRServicesAssignment_5"
    // InternalFoo.g:3605:1: rule__Component__ListOfRServicesAssignment_5 : ( ruleListOfrequiredServices ) ;
    public final void rule__Component__ListOfRServicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3609:1: ( ( ruleListOfrequiredServices ) )
            // InternalFoo.g:3610:2: ( ruleListOfrequiredServices )
            {
            // InternalFoo.g:3610:2: ( ruleListOfrequiredServices )
            // InternalFoo.g:3611:3: ruleListOfrequiredServices
            {
             before(grammarAccess.getComponentAccess().getListOfRServicesListOfrequiredServicesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleListOfrequiredServices();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getListOfRServicesListOfrequiredServicesParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Component__ListOfRServicesAssignment_5"


    // $ANTLR start "rule__Component__MProvServicesAssignment_6"
    // InternalFoo.g:3620:1: rule__Component__MProvServicesAssignment_6 : ( ruleMProvidedService ) ;
    public final void rule__Component__MProvServicesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3624:1: ( ( ruleMProvidedService ) )
            // InternalFoo.g:3625:2: ( ruleMProvidedService )
            {
            // InternalFoo.g:3625:2: ( ruleMProvidedService )
            // InternalFoo.g:3626:3: ruleMProvidedService
            {
             before(grammarAccess.getComponentAccess().getMProvServicesMProvidedServiceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMProvidedService();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getMProvServicesMProvidedServiceParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Component__MProvServicesAssignment_6"


    // $ANTLR start "rule__Component__MReqServicesAssignment_7"
    // InternalFoo.g:3635:1: rule__Component__MReqServicesAssignment_7 : ( ruleMRequiredService ) ;
    public final void rule__Component__MReqServicesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3639:1: ( ( ruleMRequiredService ) )
            // InternalFoo.g:3640:2: ( ruleMRequiredService )
            {
            // InternalFoo.g:3640:2: ( ruleMRequiredService )
            // InternalFoo.g:3641:3: ruleMRequiredService
            {
             before(grammarAccess.getComponentAccess().getMReqServicesMRequiredServiceParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleMRequiredService();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getMReqServicesMRequiredServiceParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Component__MReqServicesAssignment_7"


    // $ANTLR start "rule__Component__AssembliesAssignment_8_1"
    // InternalFoo.g:3650:1: rule__Component__AssembliesAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Component__AssembliesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3654:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3655:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3655:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3656:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentAccess().getAssembliesAssemblyCrossReference_8_1_0()); 
            // InternalFoo.g:3657:3: ( ruleQualifiedName )
            // InternalFoo.g:3658:4: ruleQualifiedName
            {
             before(grammarAccess.getComponentAccess().getAssembliesAssemblyQualifiedNameParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getAssembliesAssemblyQualifiedNameParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getAssembliesAssemblyCrossReference_8_1_0()); 

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
    // $ANTLR end "rule__Component__AssembliesAssignment_8_1"


    // $ANTLR start "rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0"
    // InternalFoo.g:3669:1: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 : ( ruleProvidedService ) ;
    public final void rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3673:1: ( ( ruleProvidedService ) )
            // InternalFoo.g:3674:2: ( ruleProvidedService )
            {
            // InternalFoo.g:3674:2: ( ruleProvidedService )
            // InternalFoo.g:3675:3: ruleProvidedService
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
    // InternalFoo.g:3684:1: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 : ( ruleProvidedService ) ;
    public final void rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3688:1: ( ( ruleProvidedService ) )
            // InternalFoo.g:3689:2: ( ruleProvidedService )
            {
            // InternalFoo.g:3689:2: ( ruleProvidedService )
            // InternalFoo.g:3690:3: ruleProvidedService
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
    // InternalFoo.g:3699:1: rule__ProvidedService__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ProvidedService__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3703:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:3704:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:3704:2: ( ( RULE_ID ) )
            // InternalFoo.g:3705:3: ( RULE_ID )
            {
             before(grammarAccess.getProvidedServiceAccess().getNamePSignatureCrossReference_0()); 
            // InternalFoo.g:3706:3: ( RULE_ID )
            // InternalFoo.g:3707:4: RULE_ID
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


    // $ANTLR start "rule__ListOfrequiredServices__RequiredServicesAssignment_4_0"
    // InternalFoo.g:3718:1: rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 : ( ruleRequiredService ) ;
    public final void rule__ListOfrequiredServices__RequiredServicesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3722:1: ( ( ruleRequiredService ) )
            // InternalFoo.g:3723:2: ( ruleRequiredService )
            {
            // InternalFoo.g:3723:2: ( ruleRequiredService )
            // InternalFoo.g:3724:3: ruleRequiredService
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredService();

            state._fsp--;

             after(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__ListOfrequiredServices__RequiredServicesAssignment_4_0"


    // $ANTLR start "rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1"
    // InternalFoo.g:3733:1: rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 : ( ruleRequiredService ) ;
    public final void rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3737:1: ( ( ruleRequiredService ) )
            // InternalFoo.g:3738:2: ( ruleRequiredService )
            {
            // InternalFoo.g:3738:2: ( ruleRequiredService )
            // InternalFoo.g:3739:3: ruleRequiredService
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredService();

            state._fsp--;

             after(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1"


    // $ANTLR start "rule__RequiredService__NameAssignment"
    // InternalFoo.g:3748:1: rule__RequiredService__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RequiredService__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3752:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:3753:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:3753:2: ( ( RULE_ID ) )
            // InternalFoo.g:3754:3: ( RULE_ID )
            {
             before(grammarAccess.getRequiredServiceAccess().getNameRSignatureCrossReference_0()); 
            // InternalFoo.g:3755:3: ( RULE_ID )
            // InternalFoo.g:3756:4: RULE_ID
            {
             before(grammarAccess.getRequiredServiceAccess().getNameRSignatureIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequiredServiceAccess().getNameRSignatureIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getRequiredServiceAccess().getNameRSignatureCrossReference_0()); 

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
    // $ANTLR end "rule__RequiredService__NameAssignment"


    // $ANTLR start "rule__MProvidedService__SignatureAssignment_2"
    // InternalFoo.g:3767:1: rule__MProvidedService__SignatureAssignment_2 : ( rulePSignature ) ;
    public final void rule__MProvidedService__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3771:1: ( ( rulePSignature ) )
            // InternalFoo.g:3772:2: ( rulePSignature )
            {
            // InternalFoo.g:3772:2: ( rulePSignature )
            // InternalFoo.g:3773:3: rulePSignature
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
    // InternalFoo.g:3782:1: rule__PSignature__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__PSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3786:1: ( ( RULE_ID ) )
            // InternalFoo.g:3787:2: ( RULE_ID )
            {
            // InternalFoo.g:3787:2: ( RULE_ID )
            // InternalFoo.g:3788:3: RULE_ID
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
    // InternalFoo.g:3797:1: rule__PSignature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PSignature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3801:1: ( ( RULE_ID ) )
            // InternalFoo.g:3802:2: ( RULE_ID )
            {
            // InternalFoo.g:3802:2: ( RULE_ID )
            // InternalFoo.g:3803:3: RULE_ID
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
    // InternalFoo.g:3812:1: rule__PSignature__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__PSignature__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3816:1: ( ( ruleParameter ) )
            // InternalFoo.g:3817:2: ( ruleParameter )
            {
            // InternalFoo.g:3817:2: ( ruleParameter )
            // InternalFoo.g:3818:3: ruleParameter
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
    // InternalFoo.g:3827:1: rule__PSignature__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__PSignature__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3831:1: ( ( ruleParameter ) )
            // InternalFoo.g:3832:2: ( ruleParameter )
            {
            // InternalFoo.g:3832:2: ( ruleParameter )
            // InternalFoo.g:3833:3: ruleParameter
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


    // $ANTLR start "rule__MRequiredService__SignatureAssignment_2"
    // InternalFoo.g:3842:1: rule__MRequiredService__SignatureAssignment_2 : ( ruleRSignature ) ;
    public final void rule__MRequiredService__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3846:1: ( ( ruleRSignature ) )
            // InternalFoo.g:3847:2: ( ruleRSignature )
            {
            // InternalFoo.g:3847:2: ( ruleRSignature )
            // InternalFoo.g:3848:3: ruleRSignature
            {
             before(grammarAccess.getMRequiredServiceAccess().getSignatureRSignatureParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRSignature();

            state._fsp--;

             after(grammarAccess.getMRequiredServiceAccess().getSignatureRSignatureParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MRequiredService__SignatureAssignment_2"


    // $ANTLR start "rule__RSignature__TypeAssignment_0"
    // InternalFoo.g:3857:1: rule__RSignature__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__RSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3861:1: ( ( RULE_ID ) )
            // InternalFoo.g:3862:2: ( RULE_ID )
            {
            // InternalFoo.g:3862:2: ( RULE_ID )
            // InternalFoo.g:3863:3: RULE_ID
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
    // InternalFoo.g:3872:1: rule__RSignature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RSignature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3876:1: ( ( RULE_ID ) )
            // InternalFoo.g:3877:2: ( RULE_ID )
            {
            // InternalFoo.g:3877:2: ( RULE_ID )
            // InternalFoo.g:3878:3: RULE_ID
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
    // InternalFoo.g:3887:1: rule__RSignature__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__RSignature__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3891:1: ( ( ruleParameter ) )
            // InternalFoo.g:3892:2: ( ruleParameter )
            {
            // InternalFoo.g:3892:2: ( ruleParameter )
            // InternalFoo.g:3893:3: ruleParameter
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
    // InternalFoo.g:3902:1: rule__RSignature__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__RSignature__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3906:1: ( ( ruleParameter ) )
            // InternalFoo.g:3907:2: ( ruleParameter )
            {
            // InternalFoo.g:3907:2: ( ruleParameter )
            // InternalFoo.g:3908:3: ruleParameter
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
    // InternalFoo.g:3917:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3921:1: ( ( RULE_ID ) )
            // InternalFoo.g:3922:2: ( RULE_ID )
            {
            // InternalFoo.g:3922:2: ( RULE_ID )
            // InternalFoo.g:3923:3: RULE_ID
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
    // InternalFoo.g:3932:1: rule__Parameter__TypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3936:1: ( ( RULE_ID ) )
            // InternalFoo.g:3937:2: ( RULE_ID )
            {
            // InternalFoo.g:3937:2: ( RULE_ID )
            // InternalFoo.g:3938:3: RULE_ID
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
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000021002010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000088000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000000L});

}