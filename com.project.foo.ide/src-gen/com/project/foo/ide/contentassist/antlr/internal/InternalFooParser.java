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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'true'", "'false'", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'Assembly'", "'components'", "'bindings'", "':'", "'-'", "'Component'", "'refines'", "'assembly'", "'provided'", "'='", "','", "'required'", "'service'", "'if'", "'('", "')'", "'else'", "'while'", "'!'", "'Lorem'", "'Ipsum'", "';'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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


    // $ANTLR start "entryRuleExpression"
    // InternalFoo.g:453:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalFoo.g:454:1: ( ruleExpression EOF )
            // InternalFoo.g:455:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalFoo.g:462:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:466:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalFoo.g:467:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalFoo.g:467:2: ( ( rule__Expression__Alternatives ) )
            // InternalFoo.g:468:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalFoo.g:469:3: ( rule__Expression__Alternatives )
            // InternalFoo.g:469:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIf"
    // InternalFoo.g:478:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalFoo.g:479:1: ( ruleIf EOF )
            // InternalFoo.g:480:1: ruleIf EOF
            {
             before(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getIfRule()); 
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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalFoo.g:487:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:491:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalFoo.g:492:2: ( ( rule__If__Group__0 ) )
            {
            // InternalFoo.g:492:2: ( ( rule__If__Group__0 ) )
            // InternalFoo.g:493:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalFoo.g:494:3: ( rule__If__Group__0 )
            // InternalFoo.g:494:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleWhile"
    // InternalFoo.g:503:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // InternalFoo.g:504:1: ( ruleWhile EOF )
            // InternalFoo.g:505:1: ruleWhile EOF
            {
             before(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            ruleWhile();

            state._fsp--;

             after(grammarAccess.getWhileRule()); 
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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalFoo.g:512:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:516:2: ( ( ( rule__While__Group__0 ) ) )
            // InternalFoo.g:517:2: ( ( rule__While__Group__0 ) )
            {
            // InternalFoo.g:517:2: ( ( rule__While__Group__0 ) )
            // InternalFoo.g:518:3: ( rule__While__Group__0 )
            {
             before(grammarAccess.getWhileAccess().getGroup()); 
            // InternalFoo.g:519:3: ( rule__While__Group__0 )
            // InternalFoo.g:519:4: rule__While__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleCondition"
    // InternalFoo.g:528:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalFoo.g:529:1: ( ruleCondition EOF )
            // InternalFoo.g:530:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalFoo.g:537:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:541:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalFoo.g:542:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalFoo.g:542:2: ( ( rule__Condition__Group__0 ) )
            // InternalFoo.g:543:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalFoo.g:544:3: ( rule__Condition__Group__0 )
            // InternalFoo.g:544:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleStatement"
    // InternalFoo.g:553:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalFoo.g:554:1: ( ruleStatement EOF )
            // InternalFoo.g:555:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalFoo.g:562:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:566:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalFoo.g:567:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalFoo.g:567:2: ( ( rule__Statement__Group__0 ) )
            // InternalFoo.g:568:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalFoo.g:569:3: ( rule__Statement__Group__0 )
            // InternalFoo.g:569:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePSignature"
    // InternalFoo.g:578:1: entryRulePSignature : rulePSignature EOF ;
    public final void entryRulePSignature() throws RecognitionException {
        try {
            // InternalFoo.g:579:1: ( rulePSignature EOF )
            // InternalFoo.g:580:1: rulePSignature EOF
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
    // InternalFoo.g:587:1: rulePSignature : ( ( rule__PSignature__Group__0 ) ) ;
    public final void rulePSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:591:2: ( ( ( rule__PSignature__Group__0 ) ) )
            // InternalFoo.g:592:2: ( ( rule__PSignature__Group__0 ) )
            {
            // InternalFoo.g:592:2: ( ( rule__PSignature__Group__0 ) )
            // InternalFoo.g:593:3: ( rule__PSignature__Group__0 )
            {
             before(grammarAccess.getPSignatureAccess().getGroup()); 
            // InternalFoo.g:594:3: ( rule__PSignature__Group__0 )
            // InternalFoo.g:594:4: rule__PSignature__Group__0
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
    // InternalFoo.g:603:1: entryRuleMRequiredService : ruleMRequiredService EOF ;
    public final void entryRuleMRequiredService() throws RecognitionException {
        try {
            // InternalFoo.g:604:1: ( ruleMRequiredService EOF )
            // InternalFoo.g:605:1: ruleMRequiredService EOF
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
    // InternalFoo.g:612:1: ruleMRequiredService : ( ( rule__MRequiredService__Group__0 ) ) ;
    public final void ruleMRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:616:2: ( ( ( rule__MRequiredService__Group__0 ) ) )
            // InternalFoo.g:617:2: ( ( rule__MRequiredService__Group__0 ) )
            {
            // InternalFoo.g:617:2: ( ( rule__MRequiredService__Group__0 ) )
            // InternalFoo.g:618:3: ( rule__MRequiredService__Group__0 )
            {
             before(grammarAccess.getMRequiredServiceAccess().getGroup()); 
            // InternalFoo.g:619:3: ( rule__MRequiredService__Group__0 )
            // InternalFoo.g:619:4: rule__MRequiredService__Group__0
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
    // InternalFoo.g:628:1: entryRuleRSignature : ruleRSignature EOF ;
    public final void entryRuleRSignature() throws RecognitionException {
        try {
            // InternalFoo.g:629:1: ( ruleRSignature EOF )
            // InternalFoo.g:630:1: ruleRSignature EOF
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
    // InternalFoo.g:637:1: ruleRSignature : ( ( rule__RSignature__Group__0 ) ) ;
    public final void ruleRSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:641:2: ( ( ( rule__RSignature__Group__0 ) ) )
            // InternalFoo.g:642:2: ( ( rule__RSignature__Group__0 ) )
            {
            // InternalFoo.g:642:2: ( ( rule__RSignature__Group__0 ) )
            // InternalFoo.g:643:3: ( rule__RSignature__Group__0 )
            {
             before(grammarAccess.getRSignatureAccess().getGroup()); 
            // InternalFoo.g:644:3: ( rule__RSignature__Group__0 )
            // InternalFoo.g:644:4: rule__RSignature__Group__0
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
    // InternalFoo.g:653:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalFoo.g:654:1: ( ruleParameter EOF )
            // InternalFoo.g:655:1: ruleParameter EOF
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
    // InternalFoo.g:662:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:666:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalFoo.g:667:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalFoo.g:667:2: ( ( rule__Parameter__Group__0 ) )
            // InternalFoo.g:668:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalFoo.g:669:3: ( rule__Parameter__Group__0 )
            // InternalFoo.g:669:4: rule__Parameter__Group__0
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


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalFoo.g:677:1: rule__Expression__Alternatives : ( ( ruleIf ) | ( ruleWhile ) | ( ( rule__Expression__Group_2__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:681:1: ( ( ruleIf ) | ( ruleWhile ) | ( ( rule__Expression__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt1=1;
                }
                break;
            case 38:
                {
                alt1=2;
                }
                break;
            case 40:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalFoo.g:682:2: ( ruleIf )
                    {
                    // InternalFoo.g:682:2: ( ruleIf )
                    // InternalFoo.g:683:3: ruleIf
                    {
                     before(grammarAccess.getExpressionAccess().getIfParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getIfParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:688:2: ( ruleWhile )
                    {
                    // InternalFoo.g:688:2: ( ruleWhile )
                    // InternalFoo.g:689:3: ruleWhile
                    {
                     before(grammarAccess.getExpressionAccess().getWhileParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWhile();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getWhileParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFoo.g:694:2: ( ( rule__Expression__Group_2__0 ) )
                    {
                    // InternalFoo.g:694:2: ( ( rule__Expression__Group_2__0 ) )
                    // InternalFoo.g:695:3: ( rule__Expression__Group_2__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_2()); 
                    // InternalFoo.g:696:3: ( rule__Expression__Group_2__0 )
                    // InternalFoo.g:696:4: rule__Expression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__If__Alternatives_2_1"
    // InternalFoo.g:704:1: rule__If__Alternatives_2_1 : ( ( '||' ) | ( '&&' ) );
    public final void rule__If__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:708:1: ( ( '||' ) | ( '&&' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFoo.g:709:2: ( '||' )
                    {
                    // InternalFoo.g:709:2: ( '||' )
                    // InternalFoo.g:710:3: '||'
                    {
                     before(grammarAccess.getIfAccess().getVerticalLineVerticalLineKeyword_2_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getIfAccess().getVerticalLineVerticalLineKeyword_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:715:2: ( '&&' )
                    {
                    // InternalFoo.g:715:2: ( '&&' )
                    // InternalFoo.g:716:3: '&&'
                    {
                     before(grammarAccess.getIfAccess().getAmpersandAmpersandKeyword_2_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getIfAccess().getAmpersandAmpersandKeyword_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Alternatives_2_1"


    // $ANTLR start "rule__If__Alternatives_8_1"
    // InternalFoo.g:725:1: rule__If__Alternatives_8_1 : ( ( ( rule__If__ElseAssignment_8_1_0 ) ) | ( ( rule__If__Group_8_1_1__0 ) ) );
    public final void rule__If__Alternatives_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:729:1: ( ( ( rule__If__ElseAssignment_8_1_0 ) ) | ( ( rule__If__Group_8_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFoo.g:730:2: ( ( rule__If__ElseAssignment_8_1_0 ) )
                    {
                    // InternalFoo.g:730:2: ( ( rule__If__ElseAssignment_8_1_0 ) )
                    // InternalFoo.g:731:3: ( rule__If__ElseAssignment_8_1_0 )
                    {
                     before(grammarAccess.getIfAccess().getElseAssignment_8_1_0()); 
                    // InternalFoo.g:732:3: ( rule__If__ElseAssignment_8_1_0 )
                    // InternalFoo.g:732:4: rule__If__ElseAssignment_8_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__ElseAssignment_8_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIfAccess().getElseAssignment_8_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:736:2: ( ( rule__If__Group_8_1_1__0 ) )
                    {
                    // InternalFoo.g:736:2: ( ( rule__If__Group_8_1_1__0 ) )
                    // InternalFoo.g:737:3: ( rule__If__Group_8_1_1__0 )
                    {
                     before(grammarAccess.getIfAccess().getGroup_8_1_1()); 
                    // InternalFoo.g:738:3: ( rule__If__Group_8_1_1__0 )
                    // InternalFoo.g:738:4: rule__If__Group_8_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_8_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIfAccess().getGroup_8_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Alternatives_8_1"


    // $ANTLR start "rule__While__Alternatives_2_1"
    // InternalFoo.g:746:1: rule__While__Alternatives_2_1 : ( ( '||' ) | ( '&&' ) );
    public final void rule__While__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:750:1: ( ( '||' ) | ( '&&' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFoo.g:751:2: ( '||' )
                    {
                    // InternalFoo.g:751:2: ( '||' )
                    // InternalFoo.g:752:3: '||'
                    {
                     before(grammarAccess.getWhileAccess().getVerticalLineVerticalLineKeyword_2_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getWhileAccess().getVerticalLineVerticalLineKeyword_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:757:2: ( '&&' )
                    {
                    // InternalFoo.g:757:2: ( '&&' )
                    // InternalFoo.g:758:3: '&&'
                    {
                     before(grammarAccess.getWhileAccess().getAmpersandAmpersandKeyword_2_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getWhileAccess().getAmpersandAmpersandKeyword_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Alternatives_2_1"


    // $ANTLR start "rule__Condition__Alternatives_1"
    // InternalFoo.g:767:1: rule__Condition__Alternatives_1 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Condition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:771:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFoo.g:772:2: ( 'true' )
                    {
                    // InternalFoo.g:772:2: ( 'true' )
                    // InternalFoo.g:773:3: 'true'
                    {
                     before(grammarAccess.getConditionAccess().getTrueKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getTrueKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:778:2: ( 'false' )
                    {
                    // InternalFoo.g:778:2: ( 'false' )
                    // InternalFoo.g:779:3: 'false'
                    {
                     before(grammarAccess.getConditionAccess().getFalseKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getFalseKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives_1"


    // $ANTLR start "rule__Model__Group__0"
    // InternalFoo.g:788:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:792:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFoo.g:793:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalFoo.g:800:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:804:1: ( ( 'package' ) )
            // InternalFoo.g:805:1: ( 'package' )
            {
            // InternalFoo.g:805:1: ( 'package' )
            // InternalFoo.g:806:2: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalFoo.g:815:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:819:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalFoo.g:820:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalFoo.g:827:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:831:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalFoo.g:832:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalFoo.g:832:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalFoo.g:833:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalFoo.g:834:2: ( rule__Model__NameAssignment_1 )
            // InternalFoo.g:834:3: rule__Model__NameAssignment_1
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
    // InternalFoo.g:842:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:846:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalFoo.g:847:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalFoo.g:854:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:858:1: ( ( '{' ) )
            // InternalFoo.g:859:1: ( '{' )
            {
            // InternalFoo.g:859:1: ( '{' )
            // InternalFoo.g:860:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalFoo.g:869:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:873:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalFoo.g:874:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalFoo.g:881:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:885:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // InternalFoo.g:886:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // InternalFoo.g:886:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // InternalFoo.g:887:2: ( rule__Model__ImportsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            // InternalFoo.g:888:2: ( rule__Model__ImportsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFoo.g:888:3: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalFoo.g:896:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:900:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalFoo.g:901:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalFoo.g:908:1: rule__Model__Group__4__Impl : ( ( rule__Model__ComponentsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:912:1: ( ( ( rule__Model__ComponentsAssignment_4 )* ) )
            // InternalFoo.g:913:1: ( ( rule__Model__ComponentsAssignment_4 )* )
            {
            // InternalFoo.g:913:1: ( ( rule__Model__ComponentsAssignment_4 )* )
            // InternalFoo.g:914:2: ( rule__Model__ComponentsAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getComponentsAssignment_4()); 
            // InternalFoo.g:915:2: ( rule__Model__ComponentsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFoo.g:915:3: rule__Model__ComponentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__ComponentsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalFoo.g:923:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:927:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalFoo.g:928:2: rule__Model__Group__5__Impl rule__Model__Group__6
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
    // InternalFoo.g:935:1: rule__Model__Group__5__Impl : ( ( rule__Model__AssemblyAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:939:1: ( ( ( rule__Model__AssemblyAssignment_5 )* ) )
            // InternalFoo.g:940:1: ( ( rule__Model__AssemblyAssignment_5 )* )
            {
            // InternalFoo.g:940:1: ( ( rule__Model__AssemblyAssignment_5 )* )
            // InternalFoo.g:941:2: ( rule__Model__AssemblyAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getAssemblyAssignment_5()); 
            // InternalFoo.g:942:2: ( rule__Model__AssemblyAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFoo.g:942:3: rule__Model__AssemblyAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__AssemblyAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalFoo.g:950:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:954:1: ( rule__Model__Group__6__Impl )
            // InternalFoo.g:955:2: rule__Model__Group__6__Impl
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
    // InternalFoo.g:961:1: rule__Model__Group__6__Impl : ( '}' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:965:1: ( ( '}' ) )
            // InternalFoo.g:966:1: ( '}' )
            {
            // InternalFoo.g:966:1: ( '}' )
            // InternalFoo.g:967:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
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
    // InternalFoo.g:977:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:981:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalFoo.g:982:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalFoo.g:989:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:993:1: ( ( RULE_ID ) )
            // InternalFoo.g:994:1: ( RULE_ID )
            {
            // InternalFoo.g:994:1: ( RULE_ID )
            // InternalFoo.g:995:2: RULE_ID
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
    // InternalFoo.g:1004:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1008:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalFoo.g:1009:2: rule__QualifiedName__Group__1__Impl
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
    // InternalFoo.g:1015:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1019:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalFoo.g:1020:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalFoo.g:1020:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalFoo.g:1021:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalFoo.g:1022:2: ( rule__QualifiedName__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFoo.g:1022:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalFoo.g:1031:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1035:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalFoo.g:1036:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalFoo.g:1043:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1047:1: ( ( '.' ) )
            // InternalFoo.g:1048:1: ( '.' )
            {
            // InternalFoo.g:1048:1: ( '.' )
            // InternalFoo.g:1049:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalFoo.g:1058:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1062:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalFoo.g:1063:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalFoo.g:1069:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1073:1: ( ( RULE_ID ) )
            // InternalFoo.g:1074:1: ( RULE_ID )
            {
            // InternalFoo.g:1074:1: ( RULE_ID )
            // InternalFoo.g:1075:2: RULE_ID
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
    // InternalFoo.g:1085:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1089:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalFoo.g:1090:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalFoo.g:1097:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1101:1: ( ( 'import' ) )
            // InternalFoo.g:1102:1: ( 'import' )
            {
            // InternalFoo.g:1102:1: ( 'import' )
            // InternalFoo.g:1103:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalFoo.g:1112:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1116:1: ( rule__Import__Group__1__Impl )
            // InternalFoo.g:1117:2: rule__Import__Group__1__Impl
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
    // InternalFoo.g:1123:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1127:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalFoo.g:1128:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalFoo.g:1128:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalFoo.g:1129:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalFoo.g:1130:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalFoo.g:1130:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalFoo.g:1139:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1143:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalFoo.g:1144:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalFoo.g:1151:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1155:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:1156:1: ( ruleQualifiedName )
            {
            // InternalFoo.g:1156:1: ( ruleQualifiedName )
            // InternalFoo.g:1157:2: ruleQualifiedName
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
    // InternalFoo.g:1166:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1170:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalFoo.g:1171:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalFoo.g:1177:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1181:1: ( ( ( '.*' )? ) )
            // InternalFoo.g:1182:1: ( ( '.*' )? )
            {
            // InternalFoo.g:1182:1: ( ( '.*' )? )
            // InternalFoo.g:1183:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalFoo.g:1184:2: ( '.*' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFoo.g:1184:3: '.*'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalFoo.g:1193:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1197:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // InternalFoo.g:1198:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
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
    // InternalFoo.g:1205:1: rule__Assembly__Group__0__Impl : ( () ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1209:1: ( ( () ) )
            // InternalFoo.g:1210:1: ( () )
            {
            // InternalFoo.g:1210:1: ( () )
            // InternalFoo.g:1211:2: ()
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyAction_0()); 
            // InternalFoo.g:1212:2: ()
            // InternalFoo.g:1212:3: 
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
    // InternalFoo.g:1220:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1224:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // InternalFoo.g:1225:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
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
    // InternalFoo.g:1232:1: rule__Assembly__Group__1__Impl : ( 'Assembly' ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1236:1: ( ( 'Assembly' ) )
            // InternalFoo.g:1237:1: ( 'Assembly' )
            {
            // InternalFoo.g:1237:1: ( 'Assembly' )
            // InternalFoo.g:1238:2: 'Assembly'
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalFoo.g:1247:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1251:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // InternalFoo.g:1252:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
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
    // InternalFoo.g:1259:1: rule__Assembly__Group__2__Impl : ( ( rule__Assembly__NameAssignment_2 ) ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1263:1: ( ( ( rule__Assembly__NameAssignment_2 ) ) )
            // InternalFoo.g:1264:1: ( ( rule__Assembly__NameAssignment_2 ) )
            {
            // InternalFoo.g:1264:1: ( ( rule__Assembly__NameAssignment_2 ) )
            // InternalFoo.g:1265:2: ( rule__Assembly__NameAssignment_2 )
            {
             before(grammarAccess.getAssemblyAccess().getNameAssignment_2()); 
            // InternalFoo.g:1266:2: ( rule__Assembly__NameAssignment_2 )
            // InternalFoo.g:1266:3: rule__Assembly__NameAssignment_2
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
    // InternalFoo.g:1274:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1278:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // InternalFoo.g:1279:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
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
    // InternalFoo.g:1286:1: rule__Assembly__Group__3__Impl : ( '{' ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1290:1: ( ( '{' ) )
            // InternalFoo.g:1291:1: ( '{' )
            {
            // InternalFoo.g:1291:1: ( '{' )
            // InternalFoo.g:1292:2: '{'
            {
             before(grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalFoo.g:1301:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl rule__Assembly__Group__5 ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1305:1: ( rule__Assembly__Group__4__Impl rule__Assembly__Group__5 )
            // InternalFoo.g:1306:2: rule__Assembly__Group__4__Impl rule__Assembly__Group__5
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
    // InternalFoo.g:1313:1: rule__Assembly__Group__4__Impl : ( 'components' ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1317:1: ( ( 'components' ) )
            // InternalFoo.g:1318:1: ( 'components' )
            {
            // InternalFoo.g:1318:1: ( 'components' )
            // InternalFoo.g:1319:2: 'components'
            {
             before(grammarAccess.getAssemblyAccess().getComponentsKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalFoo.g:1328:1: rule__Assembly__Group__5 : rule__Assembly__Group__5__Impl rule__Assembly__Group__6 ;
    public final void rule__Assembly__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1332:1: ( rule__Assembly__Group__5__Impl rule__Assembly__Group__6 )
            // InternalFoo.g:1333:2: rule__Assembly__Group__5__Impl rule__Assembly__Group__6
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
    // InternalFoo.g:1340:1: rule__Assembly__Group__5__Impl : ( ( rule__Assembly__AttributesAssignment_5 ) ) ;
    public final void rule__Assembly__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1344:1: ( ( ( rule__Assembly__AttributesAssignment_5 ) ) )
            // InternalFoo.g:1345:1: ( ( rule__Assembly__AttributesAssignment_5 ) )
            {
            // InternalFoo.g:1345:1: ( ( rule__Assembly__AttributesAssignment_5 ) )
            // InternalFoo.g:1346:2: ( rule__Assembly__AttributesAssignment_5 )
            {
             before(grammarAccess.getAssemblyAccess().getAttributesAssignment_5()); 
            // InternalFoo.g:1347:2: ( rule__Assembly__AttributesAssignment_5 )
            // InternalFoo.g:1347:3: rule__Assembly__AttributesAssignment_5
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
    // InternalFoo.g:1355:1: rule__Assembly__Group__6 : rule__Assembly__Group__6__Impl rule__Assembly__Group__7 ;
    public final void rule__Assembly__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1359:1: ( rule__Assembly__Group__6__Impl rule__Assembly__Group__7 )
            // InternalFoo.g:1360:2: rule__Assembly__Group__6__Impl rule__Assembly__Group__7
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
    // InternalFoo.g:1367:1: rule__Assembly__Group__6__Impl : ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) ) ;
    public final void rule__Assembly__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1371:1: ( ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) ) )
            // InternalFoo.g:1372:1: ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) )
            {
            // InternalFoo.g:1372:1: ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) )
            // InternalFoo.g:1373:2: ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* )
            {
            // InternalFoo.g:1373:2: ( ( rule__Assembly__AttributesAssignment_6 ) )
            // InternalFoo.g:1374:3: ( rule__Assembly__AttributesAssignment_6 )
            {
             before(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 
            // InternalFoo.g:1375:3: ( rule__Assembly__AttributesAssignment_6 )
            // InternalFoo.g:1375:4: rule__Assembly__AttributesAssignment_6
            {
            pushFollow(FOLLOW_15);
            rule__Assembly__AttributesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 

            }

            // InternalFoo.g:1378:2: ( ( rule__Assembly__AttributesAssignment_6 )* )
            // InternalFoo.g:1379:3: ( rule__Assembly__AttributesAssignment_6 )*
            {
             before(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 
            // InternalFoo.g:1380:3: ( rule__Assembly__AttributesAssignment_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFoo.g:1380:4: rule__Assembly__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Assembly__AttributesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalFoo.g:1389:1: rule__Assembly__Group__7 : rule__Assembly__Group__7__Impl rule__Assembly__Group__8 ;
    public final void rule__Assembly__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1393:1: ( rule__Assembly__Group__7__Impl rule__Assembly__Group__8 )
            // InternalFoo.g:1394:2: rule__Assembly__Group__7__Impl rule__Assembly__Group__8
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
    // InternalFoo.g:1401:1: rule__Assembly__Group__7__Impl : ( 'bindings' ) ;
    public final void rule__Assembly__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1405:1: ( ( 'bindings' ) )
            // InternalFoo.g:1406:1: ( 'bindings' )
            {
            // InternalFoo.g:1406:1: ( 'bindings' )
            // InternalFoo.g:1407:2: 'bindings'
            {
             before(grammarAccess.getAssemblyAccess().getBindingsKeyword_7()); 
            match(input,23,FOLLOW_2); 
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
    // InternalFoo.g:1416:1: rule__Assembly__Group__8 : rule__Assembly__Group__8__Impl rule__Assembly__Group__9 ;
    public final void rule__Assembly__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1420:1: ( rule__Assembly__Group__8__Impl rule__Assembly__Group__9 )
            // InternalFoo.g:1421:2: rule__Assembly__Group__8__Impl rule__Assembly__Group__9
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
    // InternalFoo.g:1428:1: rule__Assembly__Group__8__Impl : ( ( rule__Assembly__BindingsAssignment_8 )* ) ;
    public final void rule__Assembly__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1432:1: ( ( ( rule__Assembly__BindingsAssignment_8 )* ) )
            // InternalFoo.g:1433:1: ( ( rule__Assembly__BindingsAssignment_8 )* )
            {
            // InternalFoo.g:1433:1: ( ( rule__Assembly__BindingsAssignment_8 )* )
            // InternalFoo.g:1434:2: ( rule__Assembly__BindingsAssignment_8 )*
            {
             before(grammarAccess.getAssemblyAccess().getBindingsAssignment_8()); 
            // InternalFoo.g:1435:2: ( rule__Assembly__BindingsAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFoo.g:1435:3: rule__Assembly__BindingsAssignment_8
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Assembly__BindingsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalFoo.g:1443:1: rule__Assembly__Group__9 : rule__Assembly__Group__9__Impl ;
    public final void rule__Assembly__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1447:1: ( rule__Assembly__Group__9__Impl )
            // InternalFoo.g:1448:2: rule__Assembly__Group__9__Impl
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
    // InternalFoo.g:1454:1: rule__Assembly__Group__9__Impl : ( '}' ) ;
    public final void rule__Assembly__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1458:1: ( ( '}' ) )
            // InternalFoo.g:1459:1: ( '}' )
            {
            // InternalFoo.g:1459:1: ( '}' )
            // InternalFoo.g:1460:2: '}'
            {
             before(grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_2); 
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
    // InternalFoo.g:1470:1: rule__ComponentInstance__Group__0 : rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 ;
    public final void rule__ComponentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1474:1: ( rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 )
            // InternalFoo.g:1475:2: rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1
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
    // InternalFoo.g:1482:1: rule__ComponentInstance__Group__0__Impl : ( ( rule__ComponentInstance__NameAssignment_0 ) ) ;
    public final void rule__ComponentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1486:1: ( ( ( rule__ComponentInstance__NameAssignment_0 ) ) )
            // InternalFoo.g:1487:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            {
            // InternalFoo.g:1487:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            // InternalFoo.g:1488:2: ( rule__ComponentInstance__NameAssignment_0 )
            {
             before(grammarAccess.getComponentInstanceAccess().getNameAssignment_0()); 
            // InternalFoo.g:1489:2: ( rule__ComponentInstance__NameAssignment_0 )
            // InternalFoo.g:1489:3: rule__ComponentInstance__NameAssignment_0
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
    // InternalFoo.g:1497:1: rule__ComponentInstance__Group__1 : rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 ;
    public final void rule__ComponentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1501:1: ( rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 )
            // InternalFoo.g:1502:2: rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2
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
    // InternalFoo.g:1509:1: rule__ComponentInstance__Group__1__Impl : ( ':' ) ;
    public final void rule__ComponentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1513:1: ( ( ':' ) )
            // InternalFoo.g:1514:1: ( ':' )
            {
            // InternalFoo.g:1514:1: ( ':' )
            // InternalFoo.g:1515:2: ':'
            {
             before(grammarAccess.getComponentInstanceAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFoo.g:1524:1: rule__ComponentInstance__Group__2 : rule__ComponentInstance__Group__2__Impl ;
    public final void rule__ComponentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1528:1: ( rule__ComponentInstance__Group__2__Impl )
            // InternalFoo.g:1529:2: rule__ComponentInstance__Group__2__Impl
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
    // InternalFoo.g:1535:1: rule__ComponentInstance__Group__2__Impl : ( ( rule__ComponentInstance__ComponentAssignment_2 ) ) ;
    public final void rule__ComponentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1539:1: ( ( ( rule__ComponentInstance__ComponentAssignment_2 ) ) )
            // InternalFoo.g:1540:1: ( ( rule__ComponentInstance__ComponentAssignment_2 ) )
            {
            // InternalFoo.g:1540:1: ( ( rule__ComponentInstance__ComponentAssignment_2 ) )
            // InternalFoo.g:1541:2: ( rule__ComponentInstance__ComponentAssignment_2 )
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentAssignment_2()); 
            // InternalFoo.g:1542:2: ( rule__ComponentInstance__ComponentAssignment_2 )
            // InternalFoo.g:1542:3: rule__ComponentInstance__ComponentAssignment_2
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
    // InternalFoo.g:1551:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1555:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalFoo.g:1556:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
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
    // InternalFoo.g:1563:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__BindingRequiredAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1567:1: ( ( ( rule__Binding__BindingRequiredAssignment_0 ) ) )
            // InternalFoo.g:1568:1: ( ( rule__Binding__BindingRequiredAssignment_0 ) )
            {
            // InternalFoo.g:1568:1: ( ( rule__Binding__BindingRequiredAssignment_0 ) )
            // InternalFoo.g:1569:2: ( rule__Binding__BindingRequiredAssignment_0 )
            {
             before(grammarAccess.getBindingAccess().getBindingRequiredAssignment_0()); 
            // InternalFoo.g:1570:2: ( rule__Binding__BindingRequiredAssignment_0 )
            // InternalFoo.g:1570:3: rule__Binding__BindingRequiredAssignment_0
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
    // InternalFoo.g:1578:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1582:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalFoo.g:1583:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
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
    // InternalFoo.g:1590:1: rule__Binding__Group__1__Impl : ( '-' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1594:1: ( ( '-' ) )
            // InternalFoo.g:1595:1: ( '-' )
            {
            // InternalFoo.g:1595:1: ( '-' )
            // InternalFoo.g:1596:2: '-'
            {
             before(grammarAccess.getBindingAccess().getHyphenMinusKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFoo.g:1605:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1609:1: ( rule__Binding__Group__2__Impl )
            // InternalFoo.g:1610:2: rule__Binding__Group__2__Impl
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
    // InternalFoo.g:1616:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__BindingProvidedAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1620:1: ( ( ( rule__Binding__BindingProvidedAssignment_2 ) ) )
            // InternalFoo.g:1621:1: ( ( rule__Binding__BindingProvidedAssignment_2 ) )
            {
            // InternalFoo.g:1621:1: ( ( rule__Binding__BindingProvidedAssignment_2 ) )
            // InternalFoo.g:1622:2: ( rule__Binding__BindingProvidedAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getBindingProvidedAssignment_2()); 
            // InternalFoo.g:1623:2: ( rule__Binding__BindingProvidedAssignment_2 )
            // InternalFoo.g:1623:3: rule__Binding__BindingProvidedAssignment_2
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
    // InternalFoo.g:1632:1: rule__BindingRequired__Group__0 : rule__BindingRequired__Group__0__Impl rule__BindingRequired__Group__1 ;
    public final void rule__BindingRequired__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1636:1: ( rule__BindingRequired__Group__0__Impl rule__BindingRequired__Group__1 )
            // InternalFoo.g:1637:2: rule__BindingRequired__Group__0__Impl rule__BindingRequired__Group__1
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
    // InternalFoo.g:1644:1: rule__BindingRequired__Group__0__Impl : ( ( rule__BindingRequired__NameAssignment_0 ) ) ;
    public final void rule__BindingRequired__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1648:1: ( ( ( rule__BindingRequired__NameAssignment_0 ) ) )
            // InternalFoo.g:1649:1: ( ( rule__BindingRequired__NameAssignment_0 ) )
            {
            // InternalFoo.g:1649:1: ( ( rule__BindingRequired__NameAssignment_0 ) )
            // InternalFoo.g:1650:2: ( rule__BindingRequired__NameAssignment_0 )
            {
             before(grammarAccess.getBindingRequiredAccess().getNameAssignment_0()); 
            // InternalFoo.g:1651:2: ( rule__BindingRequired__NameAssignment_0 )
            // InternalFoo.g:1651:3: rule__BindingRequired__NameAssignment_0
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
    // InternalFoo.g:1659:1: rule__BindingRequired__Group__1 : rule__BindingRequired__Group__1__Impl rule__BindingRequired__Group__2 ;
    public final void rule__BindingRequired__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1663:1: ( rule__BindingRequired__Group__1__Impl rule__BindingRequired__Group__2 )
            // InternalFoo.g:1664:2: rule__BindingRequired__Group__1__Impl rule__BindingRequired__Group__2
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
    // InternalFoo.g:1671:1: rule__BindingRequired__Group__1__Impl : ( '.' ) ;
    public final void rule__BindingRequired__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1675:1: ( ( '.' ) )
            // InternalFoo.g:1676:1: ( '.' )
            {
            // InternalFoo.g:1676:1: ( '.' )
            // InternalFoo.g:1677:2: '.'
            {
             before(grammarAccess.getBindingRequiredAccess().getFullStopKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalFoo.g:1686:1: rule__BindingRequired__Group__2 : rule__BindingRequired__Group__2__Impl ;
    public final void rule__BindingRequired__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1690:1: ( rule__BindingRequired__Group__2__Impl )
            // InternalFoo.g:1691:2: rule__BindingRequired__Group__2__Impl
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
    // InternalFoo.g:1697:1: rule__BindingRequired__Group__2__Impl : ( ( rule__BindingRequired__ServiceAssignment_2 ) ) ;
    public final void rule__BindingRequired__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1701:1: ( ( ( rule__BindingRequired__ServiceAssignment_2 ) ) )
            // InternalFoo.g:1702:1: ( ( rule__BindingRequired__ServiceAssignment_2 ) )
            {
            // InternalFoo.g:1702:1: ( ( rule__BindingRequired__ServiceAssignment_2 ) )
            // InternalFoo.g:1703:2: ( rule__BindingRequired__ServiceAssignment_2 )
            {
             before(grammarAccess.getBindingRequiredAccess().getServiceAssignment_2()); 
            // InternalFoo.g:1704:2: ( rule__BindingRequired__ServiceAssignment_2 )
            // InternalFoo.g:1704:3: rule__BindingRequired__ServiceAssignment_2
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
    // InternalFoo.g:1713:1: rule__BindingProvided__Group__0 : rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1 ;
    public final void rule__BindingProvided__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1717:1: ( rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1 )
            // InternalFoo.g:1718:2: rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1
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
    // InternalFoo.g:1725:1: rule__BindingProvided__Group__0__Impl : ( ( rule__BindingProvided__NameAssignment_0 ) ) ;
    public final void rule__BindingProvided__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1729:1: ( ( ( rule__BindingProvided__NameAssignment_0 ) ) )
            // InternalFoo.g:1730:1: ( ( rule__BindingProvided__NameAssignment_0 ) )
            {
            // InternalFoo.g:1730:1: ( ( rule__BindingProvided__NameAssignment_0 ) )
            // InternalFoo.g:1731:2: ( rule__BindingProvided__NameAssignment_0 )
            {
             before(grammarAccess.getBindingProvidedAccess().getNameAssignment_0()); 
            // InternalFoo.g:1732:2: ( rule__BindingProvided__NameAssignment_0 )
            // InternalFoo.g:1732:3: rule__BindingProvided__NameAssignment_0
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
    // InternalFoo.g:1740:1: rule__BindingProvided__Group__1 : rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2 ;
    public final void rule__BindingProvided__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1744:1: ( rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2 )
            // InternalFoo.g:1745:2: rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2
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
    // InternalFoo.g:1752:1: rule__BindingProvided__Group__1__Impl : ( '.' ) ;
    public final void rule__BindingProvided__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1756:1: ( ( '.' ) )
            // InternalFoo.g:1757:1: ( '.' )
            {
            // InternalFoo.g:1757:1: ( '.' )
            // InternalFoo.g:1758:2: '.'
            {
             before(grammarAccess.getBindingProvidedAccess().getFullStopKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalFoo.g:1767:1: rule__BindingProvided__Group__2 : rule__BindingProvided__Group__2__Impl ;
    public final void rule__BindingProvided__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1771:1: ( rule__BindingProvided__Group__2__Impl )
            // InternalFoo.g:1772:2: rule__BindingProvided__Group__2__Impl
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
    // InternalFoo.g:1778:1: rule__BindingProvided__Group__2__Impl : ( ( rule__BindingProvided__ServiceAssignment_2 ) ) ;
    public final void rule__BindingProvided__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1782:1: ( ( ( rule__BindingProvided__ServiceAssignment_2 ) ) )
            // InternalFoo.g:1783:1: ( ( rule__BindingProvided__ServiceAssignment_2 ) )
            {
            // InternalFoo.g:1783:1: ( ( rule__BindingProvided__ServiceAssignment_2 ) )
            // InternalFoo.g:1784:2: ( rule__BindingProvided__ServiceAssignment_2 )
            {
             before(grammarAccess.getBindingProvidedAccess().getServiceAssignment_2()); 
            // InternalFoo.g:1785:2: ( rule__BindingProvided__ServiceAssignment_2 )
            // InternalFoo.g:1785:3: rule__BindingProvided__ServiceAssignment_2
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
    // InternalFoo.g:1794:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1798:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalFoo.g:1799:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalFoo.g:1806:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1810:1: ( ( 'Component' ) )
            // InternalFoo.g:1811:1: ( 'Component' )
            {
            // InternalFoo.g:1811:1: ( 'Component' )
            // InternalFoo.g:1812:2: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFoo.g:1821:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1825:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalFoo.g:1826:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalFoo.g:1833:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1837:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalFoo.g:1838:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalFoo.g:1838:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalFoo.g:1839:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalFoo.g:1840:2: ( rule__Component__NameAssignment_1 )
            // InternalFoo.g:1840:3: rule__Component__NameAssignment_1
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
    // InternalFoo.g:1848:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1852:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalFoo.g:1853:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalFoo.g:1860:1: rule__Component__Group__2__Impl : ( ( rule__Component__Group_2__0 )? ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1864:1: ( ( ( rule__Component__Group_2__0 )? ) )
            // InternalFoo.g:1865:1: ( ( rule__Component__Group_2__0 )? )
            {
            // InternalFoo.g:1865:1: ( ( rule__Component__Group_2__0 )? )
            // InternalFoo.g:1866:2: ( rule__Component__Group_2__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_2()); 
            // InternalFoo.g:1867:2: ( rule__Component__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFoo.g:1867:3: rule__Component__Group_2__0
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
    // InternalFoo.g:1875:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1879:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalFoo.g:1880:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalFoo.g:1887:1: rule__Component__Group__3__Impl : ( '{' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1891:1: ( ( '{' ) )
            // InternalFoo.g:1892:1: ( '{' )
            {
            // InternalFoo.g:1892:1: ( '{' )
            // InternalFoo.g:1893:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalFoo.g:1902:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1906:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalFoo.g:1907:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalFoo.g:1914:1: rule__Component__Group__4__Impl : ( ( rule__Component__ListOfPServicesAssignment_4 ) ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1918:1: ( ( ( rule__Component__ListOfPServicesAssignment_4 ) ) )
            // InternalFoo.g:1919:1: ( ( rule__Component__ListOfPServicesAssignment_4 ) )
            {
            // InternalFoo.g:1919:1: ( ( rule__Component__ListOfPServicesAssignment_4 ) )
            // InternalFoo.g:1920:2: ( rule__Component__ListOfPServicesAssignment_4 )
            {
             before(grammarAccess.getComponentAccess().getListOfPServicesAssignment_4()); 
            // InternalFoo.g:1921:2: ( rule__Component__ListOfPServicesAssignment_4 )
            // InternalFoo.g:1921:3: rule__Component__ListOfPServicesAssignment_4
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
    // InternalFoo.g:1929:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1933:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalFoo.g:1934:2: rule__Component__Group__5__Impl rule__Component__Group__6
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
    // InternalFoo.g:1941:1: rule__Component__Group__5__Impl : ( ( rule__Component__ListOfRServicesAssignment_5 ) ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1945:1: ( ( ( rule__Component__ListOfRServicesAssignment_5 ) ) )
            // InternalFoo.g:1946:1: ( ( rule__Component__ListOfRServicesAssignment_5 ) )
            {
            // InternalFoo.g:1946:1: ( ( rule__Component__ListOfRServicesAssignment_5 ) )
            // InternalFoo.g:1947:2: ( rule__Component__ListOfRServicesAssignment_5 )
            {
             before(grammarAccess.getComponentAccess().getListOfRServicesAssignment_5()); 
            // InternalFoo.g:1948:2: ( rule__Component__ListOfRServicesAssignment_5 )
            // InternalFoo.g:1948:3: rule__Component__ListOfRServicesAssignment_5
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
    // InternalFoo.g:1956:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1960:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalFoo.g:1961:2: rule__Component__Group__6__Impl rule__Component__Group__7
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
    // InternalFoo.g:1968:1: rule__Component__Group__6__Impl : ( ( ( rule__Component__MProvServicesAssignment_6 ) ) ( ( rule__Component__MProvServicesAssignment_6 )* ) ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1972:1: ( ( ( ( rule__Component__MProvServicesAssignment_6 ) ) ( ( rule__Component__MProvServicesAssignment_6 )* ) ) )
            // InternalFoo.g:1973:1: ( ( ( rule__Component__MProvServicesAssignment_6 ) ) ( ( rule__Component__MProvServicesAssignment_6 )* ) )
            {
            // InternalFoo.g:1973:1: ( ( ( rule__Component__MProvServicesAssignment_6 ) ) ( ( rule__Component__MProvServicesAssignment_6 )* ) )
            // InternalFoo.g:1974:2: ( ( rule__Component__MProvServicesAssignment_6 ) ) ( ( rule__Component__MProvServicesAssignment_6 )* )
            {
            // InternalFoo.g:1974:2: ( ( rule__Component__MProvServicesAssignment_6 ) )
            // InternalFoo.g:1975:3: ( rule__Component__MProvServicesAssignment_6 )
            {
             before(grammarAccess.getComponentAccess().getMProvServicesAssignment_6()); 
            // InternalFoo.g:1976:3: ( rule__Component__MProvServicesAssignment_6 )
            // InternalFoo.g:1976:4: rule__Component__MProvServicesAssignment_6
            {
            pushFollow(FOLLOW_24);
            rule__Component__MProvServicesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getMProvServicesAssignment_6()); 

            }

            // InternalFoo.g:1979:2: ( ( rule__Component__MProvServicesAssignment_6 )* )
            // InternalFoo.g:1980:3: ( rule__Component__MProvServicesAssignment_6 )*
            {
             before(grammarAccess.getComponentAccess().getMProvServicesAssignment_6()); 
            // InternalFoo.g:1981:3: ( rule__Component__MProvServicesAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==29) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalFoo.g:1981:4: rule__Component__MProvServicesAssignment_6
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Component__MProvServicesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalFoo.g:1990:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1994:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalFoo.g:1995:2: rule__Component__Group__7__Impl rule__Component__Group__8
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
    // InternalFoo.g:2002:1: rule__Component__Group__7__Impl : ( ( rule__Component__MReqServicesAssignment_7 )* ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2006:1: ( ( ( rule__Component__MReqServicesAssignment_7 )* ) )
            // InternalFoo.g:2007:1: ( ( rule__Component__MReqServicesAssignment_7 )* )
            {
            // InternalFoo.g:2007:1: ( ( rule__Component__MReqServicesAssignment_7 )* )
            // InternalFoo.g:2008:2: ( rule__Component__MReqServicesAssignment_7 )*
            {
             before(grammarAccess.getComponentAccess().getMReqServicesAssignment_7()); 
            // InternalFoo.g:2009:2: ( rule__Component__MReqServicesAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFoo.g:2009:3: rule__Component__MReqServicesAssignment_7
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Component__MReqServicesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalFoo.g:2017:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2021:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // InternalFoo.g:2022:2: rule__Component__Group__8__Impl rule__Component__Group__9
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
    // InternalFoo.g:2029:1: rule__Component__Group__8__Impl : ( ( rule__Component__Group_8__0 )* ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2033:1: ( ( ( rule__Component__Group_8__0 )* ) )
            // InternalFoo.g:2034:1: ( ( rule__Component__Group_8__0 )* )
            {
            // InternalFoo.g:2034:1: ( ( rule__Component__Group_8__0 )* )
            // InternalFoo.g:2035:2: ( rule__Component__Group_8__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_8()); 
            // InternalFoo.g:2036:2: ( rule__Component__Group_8__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFoo.g:2036:3: rule__Component__Group_8__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Component__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalFoo.g:2044:1: rule__Component__Group__9 : rule__Component__Group__9__Impl ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2048:1: ( rule__Component__Group__9__Impl )
            // InternalFoo.g:2049:2: rule__Component__Group__9__Impl
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
    // InternalFoo.g:2055:1: rule__Component__Group__9__Impl : ( '}' ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2059:1: ( ( '}' ) )
            // InternalFoo.g:2060:1: ( '}' )
            {
            // InternalFoo.g:2060:1: ( '}' )
            // InternalFoo.g:2061:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_2); 
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
    // InternalFoo.g:2071:1: rule__Component__Group_2__0 : rule__Component__Group_2__0__Impl rule__Component__Group_2__1 ;
    public final void rule__Component__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2075:1: ( rule__Component__Group_2__0__Impl rule__Component__Group_2__1 )
            // InternalFoo.g:2076:2: rule__Component__Group_2__0__Impl rule__Component__Group_2__1
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
    // InternalFoo.g:2083:1: rule__Component__Group_2__0__Impl : ( 'refines' ) ;
    public final void rule__Component__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2087:1: ( ( 'refines' ) )
            // InternalFoo.g:2088:1: ( 'refines' )
            {
            // InternalFoo.g:2088:1: ( 'refines' )
            // InternalFoo.g:2089:2: 'refines'
            {
             before(grammarAccess.getComponentAccess().getRefinesKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFoo.g:2098:1: rule__Component__Group_2__1 : rule__Component__Group_2__1__Impl ;
    public final void rule__Component__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2102:1: ( rule__Component__Group_2__1__Impl )
            // InternalFoo.g:2103:2: rule__Component__Group_2__1__Impl
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
    // InternalFoo.g:2109:1: rule__Component__Group_2__1__Impl : ( ( rule__Component__RefinedComponentAssignment_2_1 ) ) ;
    public final void rule__Component__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2113:1: ( ( ( rule__Component__RefinedComponentAssignment_2_1 ) ) )
            // InternalFoo.g:2114:1: ( ( rule__Component__RefinedComponentAssignment_2_1 ) )
            {
            // InternalFoo.g:2114:1: ( ( rule__Component__RefinedComponentAssignment_2_1 ) )
            // InternalFoo.g:2115:2: ( rule__Component__RefinedComponentAssignment_2_1 )
            {
             before(grammarAccess.getComponentAccess().getRefinedComponentAssignment_2_1()); 
            // InternalFoo.g:2116:2: ( rule__Component__RefinedComponentAssignment_2_1 )
            // InternalFoo.g:2116:3: rule__Component__RefinedComponentAssignment_2_1
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
    // InternalFoo.g:2125:1: rule__Component__Group_8__0 : rule__Component__Group_8__0__Impl rule__Component__Group_8__1 ;
    public final void rule__Component__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2129:1: ( rule__Component__Group_8__0__Impl rule__Component__Group_8__1 )
            // InternalFoo.g:2130:2: rule__Component__Group_8__0__Impl rule__Component__Group_8__1
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
    // InternalFoo.g:2137:1: rule__Component__Group_8__0__Impl : ( ( rule__Component__Group_8_0__0 )? ) ;
    public final void rule__Component__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2141:1: ( ( ( rule__Component__Group_8_0__0 )? ) )
            // InternalFoo.g:2142:1: ( ( rule__Component__Group_8_0__0 )? )
            {
            // InternalFoo.g:2142:1: ( ( rule__Component__Group_8_0__0 )? )
            // InternalFoo.g:2143:2: ( rule__Component__Group_8_0__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_8_0()); 
            // InternalFoo.g:2144:2: ( rule__Component__Group_8_0__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFoo.g:2144:3: rule__Component__Group_8_0__0
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
    // InternalFoo.g:2152:1: rule__Component__Group_8__1 : rule__Component__Group_8__1__Impl ;
    public final void rule__Component__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2156:1: ( rule__Component__Group_8__1__Impl )
            // InternalFoo.g:2157:2: rule__Component__Group_8__1__Impl
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
    // InternalFoo.g:2163:1: rule__Component__Group_8__1__Impl : ( ( rule__Component__AssembliesAssignment_8_1 ) ) ;
    public final void rule__Component__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2167:1: ( ( ( rule__Component__AssembliesAssignment_8_1 ) ) )
            // InternalFoo.g:2168:1: ( ( rule__Component__AssembliesAssignment_8_1 ) )
            {
            // InternalFoo.g:2168:1: ( ( rule__Component__AssembliesAssignment_8_1 ) )
            // InternalFoo.g:2169:2: ( rule__Component__AssembliesAssignment_8_1 )
            {
             before(grammarAccess.getComponentAccess().getAssembliesAssignment_8_1()); 
            // InternalFoo.g:2170:2: ( rule__Component__AssembliesAssignment_8_1 )
            // InternalFoo.g:2170:3: rule__Component__AssembliesAssignment_8_1
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
    // InternalFoo.g:2179:1: rule__Component__Group_8_0__0 : rule__Component__Group_8_0__0__Impl rule__Component__Group_8_0__1 ;
    public final void rule__Component__Group_8_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2183:1: ( rule__Component__Group_8_0__0__Impl rule__Component__Group_8_0__1 )
            // InternalFoo.g:2184:2: rule__Component__Group_8_0__0__Impl rule__Component__Group_8_0__1
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
    // InternalFoo.g:2191:1: rule__Component__Group_8_0__0__Impl : ( 'assembly' ) ;
    public final void rule__Component__Group_8_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2195:1: ( ( 'assembly' ) )
            // InternalFoo.g:2196:1: ( 'assembly' )
            {
            // InternalFoo.g:2196:1: ( 'assembly' )
            // InternalFoo.g:2197:2: 'assembly'
            {
             before(grammarAccess.getComponentAccess().getAssemblyKeyword_8_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalFoo.g:2206:1: rule__Component__Group_8_0__1 : rule__Component__Group_8_0__1__Impl ;
    public final void rule__Component__Group_8_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2210:1: ( rule__Component__Group_8_0__1__Impl )
            // InternalFoo.g:2211:2: rule__Component__Group_8_0__1__Impl
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
    // InternalFoo.g:2217:1: rule__Component__Group_8_0__1__Impl : ( ':' ) ;
    public final void rule__Component__Group_8_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2221:1: ( ( ':' ) )
            // InternalFoo.g:2222:1: ( ':' )
            {
            // InternalFoo.g:2222:1: ( ':' )
            // InternalFoo.g:2223:2: ':'
            {
             before(grammarAccess.getComponentAccess().getColonKeyword_8_0_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFoo.g:2233:1: rule__ListOfProvidedServices__Group__0 : rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1 ;
    public final void rule__ListOfProvidedServices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2237:1: ( rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1 )
            // InternalFoo.g:2238:2: rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1
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
    // InternalFoo.g:2245:1: rule__ListOfProvidedServices__Group__0__Impl : ( 'provided' ) ;
    public final void rule__ListOfProvidedServices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2249:1: ( ( 'provided' ) )
            // InternalFoo.g:2250:1: ( 'provided' )
            {
            // InternalFoo.g:2250:1: ( 'provided' )
            // InternalFoo.g:2251:2: 'provided'
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getProvidedKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalFoo.g:2260:1: rule__ListOfProvidedServices__Group__1 : rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2 ;
    public final void rule__ListOfProvidedServices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2264:1: ( rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2 )
            // InternalFoo.g:2265:2: rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2
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
    // InternalFoo.g:2272:1: rule__ListOfProvidedServices__Group__1__Impl : ( '=' ) ;
    public final void rule__ListOfProvidedServices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2276:1: ( ( '=' ) )
            // InternalFoo.g:2277:1: ( '=' )
            {
            // InternalFoo.g:2277:1: ( '=' )
            // InternalFoo.g:2278:2: '='
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getEqualsSignKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalFoo.g:2287:1: rule__ListOfProvidedServices__Group__2 : rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3 ;
    public final void rule__ListOfProvidedServices__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2291:1: ( rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3 )
            // InternalFoo.g:2292:2: rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3
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
    // InternalFoo.g:2299:1: rule__ListOfProvidedServices__Group__2__Impl : ( '{' ) ;
    public final void rule__ListOfProvidedServices__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2303:1: ( ( '{' ) )
            // InternalFoo.g:2304:1: ( '{' )
            {
            // InternalFoo.g:2304:1: ( '{' )
            // InternalFoo.g:2305:2: '{'
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalFoo.g:2314:1: rule__ListOfProvidedServices__Group__3 : rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4 ;
    public final void rule__ListOfProvidedServices__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2318:1: ( rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4 )
            // InternalFoo.g:2319:2: rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4
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
    // InternalFoo.g:2326:1: rule__ListOfProvidedServices__Group__3__Impl : ( ( rule__ListOfProvidedServices__Group_3__0 ) ) ;
    public final void rule__ListOfProvidedServices__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2330:1: ( ( ( rule__ListOfProvidedServices__Group_3__0 ) ) )
            // InternalFoo.g:2331:1: ( ( rule__ListOfProvidedServices__Group_3__0 ) )
            {
            // InternalFoo.g:2331:1: ( ( rule__ListOfProvidedServices__Group_3__0 ) )
            // InternalFoo.g:2332:2: ( rule__ListOfProvidedServices__Group_3__0 )
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getGroup_3()); 
            // InternalFoo.g:2333:2: ( rule__ListOfProvidedServices__Group_3__0 )
            // InternalFoo.g:2333:3: rule__ListOfProvidedServices__Group_3__0
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
    // InternalFoo.g:2341:1: rule__ListOfProvidedServices__Group__4 : rule__ListOfProvidedServices__Group__4__Impl ;
    public final void rule__ListOfProvidedServices__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2345:1: ( rule__ListOfProvidedServices__Group__4__Impl )
            // InternalFoo.g:2346:2: rule__ListOfProvidedServices__Group__4__Impl
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
    // InternalFoo.g:2352:1: rule__ListOfProvidedServices__Group__4__Impl : ( '}' ) ;
    public final void rule__ListOfProvidedServices__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2356:1: ( ( '}' ) )
            // InternalFoo.g:2357:1: ( '}' )
            {
            // InternalFoo.g:2357:1: ( '}' )
            // InternalFoo.g:2358:2: '}'
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalFoo.g:2368:1: rule__ListOfProvidedServices__Group_3__0 : rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1 ;
    public final void rule__ListOfProvidedServices__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2372:1: ( rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1 )
            // InternalFoo.g:2373:2: rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1
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
    // InternalFoo.g:2380:1: rule__ListOfProvidedServices__Group_3__0__Impl : ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) ) ;
    public final void rule__ListOfProvidedServices__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2384:1: ( ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) ) )
            // InternalFoo.g:2385:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) )
            {
            // InternalFoo.g:2385:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) )
            // InternalFoo.g:2386:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 )
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_0()); 
            // InternalFoo.g:2387:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 )
            // InternalFoo.g:2387:3: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0
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
    // InternalFoo.g:2395:1: rule__ListOfProvidedServices__Group_3__1 : rule__ListOfProvidedServices__Group_3__1__Impl ;
    public final void rule__ListOfProvidedServices__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2399:1: ( rule__ListOfProvidedServices__Group_3__1__Impl )
            // InternalFoo.g:2400:2: rule__ListOfProvidedServices__Group_3__1__Impl
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
    // InternalFoo.g:2406:1: rule__ListOfProvidedServices__Group_3__1__Impl : ( ( rule__ListOfProvidedServices__Group_3_1__0 )* ) ;
    public final void rule__ListOfProvidedServices__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2410:1: ( ( ( rule__ListOfProvidedServices__Group_3_1__0 )* ) )
            // InternalFoo.g:2411:1: ( ( rule__ListOfProvidedServices__Group_3_1__0 )* )
            {
            // InternalFoo.g:2411:1: ( ( rule__ListOfProvidedServices__Group_3_1__0 )* )
            // InternalFoo.g:2412:2: ( rule__ListOfProvidedServices__Group_3_1__0 )*
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getGroup_3_1()); 
            // InternalFoo.g:2413:2: ( rule__ListOfProvidedServices__Group_3_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalFoo.g:2413:3: rule__ListOfProvidedServices__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ListOfProvidedServices__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalFoo.g:2422:1: rule__ListOfProvidedServices__Group_3_1__0 : rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1 ;
    public final void rule__ListOfProvidedServices__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2426:1: ( rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1 )
            // InternalFoo.g:2427:2: rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1
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
    // InternalFoo.g:2434:1: rule__ListOfProvidedServices__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfProvidedServices__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2438:1: ( ( ',' ) )
            // InternalFoo.g:2439:1: ( ',' )
            {
            // InternalFoo.g:2439:1: ( ',' )
            // InternalFoo.g:2440:2: ','
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getCommaKeyword_3_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFoo.g:2449:1: rule__ListOfProvidedServices__Group_3_1__1 : rule__ListOfProvidedServices__Group_3_1__1__Impl ;
    public final void rule__ListOfProvidedServices__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2453:1: ( rule__ListOfProvidedServices__Group_3_1__1__Impl )
            // InternalFoo.g:2454:2: rule__ListOfProvidedServices__Group_3_1__1__Impl
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
    // InternalFoo.g:2460:1: rule__ListOfProvidedServices__Group_3_1__1__Impl : ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) ) ;
    public final void rule__ListOfProvidedServices__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2464:1: ( ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) ) )
            // InternalFoo.g:2465:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) )
            {
            // InternalFoo.g:2465:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) )
            // InternalFoo.g:2466:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 )
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_1_1()); 
            // InternalFoo.g:2467:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 )
            // InternalFoo.g:2467:3: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1
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
    // InternalFoo.g:2476:1: rule__ListOfrequiredServices__Group__0 : rule__ListOfrequiredServices__Group__0__Impl rule__ListOfrequiredServices__Group__1 ;
    public final void rule__ListOfrequiredServices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2480:1: ( rule__ListOfrequiredServices__Group__0__Impl rule__ListOfrequiredServices__Group__1 )
            // InternalFoo.g:2481:2: rule__ListOfrequiredServices__Group__0__Impl rule__ListOfrequiredServices__Group__1
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
    // InternalFoo.g:2488:1: rule__ListOfrequiredServices__Group__0__Impl : ( () ) ;
    public final void rule__ListOfrequiredServices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2492:1: ( ( () ) )
            // InternalFoo.g:2493:1: ( () )
            {
            // InternalFoo.g:2493:1: ( () )
            // InternalFoo.g:2494:2: ()
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getListOfrequiredServicesAction_0()); 
            // InternalFoo.g:2495:2: ()
            // InternalFoo.g:2495:3: 
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
    // InternalFoo.g:2503:1: rule__ListOfrequiredServices__Group__1 : rule__ListOfrequiredServices__Group__1__Impl rule__ListOfrequiredServices__Group__2 ;
    public final void rule__ListOfrequiredServices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2507:1: ( rule__ListOfrequiredServices__Group__1__Impl rule__ListOfrequiredServices__Group__2 )
            // InternalFoo.g:2508:2: rule__ListOfrequiredServices__Group__1__Impl rule__ListOfrequiredServices__Group__2
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
    // InternalFoo.g:2515:1: rule__ListOfrequiredServices__Group__1__Impl : ( 'required' ) ;
    public final void rule__ListOfrequiredServices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2519:1: ( ( 'required' ) )
            // InternalFoo.g:2520:1: ( 'required' )
            {
            // InternalFoo.g:2520:1: ( 'required' )
            // InternalFoo.g:2521:2: 'required'
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getRequiredKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalFoo.g:2530:1: rule__ListOfrequiredServices__Group__2 : rule__ListOfrequiredServices__Group__2__Impl rule__ListOfrequiredServices__Group__3 ;
    public final void rule__ListOfrequiredServices__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2534:1: ( rule__ListOfrequiredServices__Group__2__Impl rule__ListOfrequiredServices__Group__3 )
            // InternalFoo.g:2535:2: rule__ListOfrequiredServices__Group__2__Impl rule__ListOfrequiredServices__Group__3
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
    // InternalFoo.g:2542:1: rule__ListOfrequiredServices__Group__2__Impl : ( '=' ) ;
    public final void rule__ListOfrequiredServices__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2546:1: ( ( '=' ) )
            // InternalFoo.g:2547:1: ( '=' )
            {
            // InternalFoo.g:2547:1: ( '=' )
            // InternalFoo.g:2548:2: '='
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getEqualsSignKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalFoo.g:2557:1: rule__ListOfrequiredServices__Group__3 : rule__ListOfrequiredServices__Group__3__Impl rule__ListOfrequiredServices__Group__4 ;
    public final void rule__ListOfrequiredServices__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2561:1: ( rule__ListOfrequiredServices__Group__3__Impl rule__ListOfrequiredServices__Group__4 )
            // InternalFoo.g:2562:2: rule__ListOfrequiredServices__Group__3__Impl rule__ListOfrequiredServices__Group__4
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
    // InternalFoo.g:2569:1: rule__ListOfrequiredServices__Group__3__Impl : ( '{' ) ;
    public final void rule__ListOfrequiredServices__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2573:1: ( ( '{' ) )
            // InternalFoo.g:2574:1: ( '{' )
            {
            // InternalFoo.g:2574:1: ( '{' )
            // InternalFoo.g:2575:2: '{'
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalFoo.g:2584:1: rule__ListOfrequiredServices__Group__4 : rule__ListOfrequiredServices__Group__4__Impl rule__ListOfrequiredServices__Group__5 ;
    public final void rule__ListOfrequiredServices__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2588:1: ( rule__ListOfrequiredServices__Group__4__Impl rule__ListOfrequiredServices__Group__5 )
            // InternalFoo.g:2589:2: rule__ListOfrequiredServices__Group__4__Impl rule__ListOfrequiredServices__Group__5
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
    // InternalFoo.g:2596:1: rule__ListOfrequiredServices__Group__4__Impl : ( ( rule__ListOfrequiredServices__Group_4__0 ) ) ;
    public final void rule__ListOfrequiredServices__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2600:1: ( ( ( rule__ListOfrequiredServices__Group_4__0 ) ) )
            // InternalFoo.g:2601:1: ( ( rule__ListOfrequiredServices__Group_4__0 ) )
            {
            // InternalFoo.g:2601:1: ( ( rule__ListOfrequiredServices__Group_4__0 ) )
            // InternalFoo.g:2602:2: ( rule__ListOfrequiredServices__Group_4__0 )
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getGroup_4()); 
            // InternalFoo.g:2603:2: ( rule__ListOfrequiredServices__Group_4__0 )
            // InternalFoo.g:2603:3: rule__ListOfrequiredServices__Group_4__0
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
    // InternalFoo.g:2611:1: rule__ListOfrequiredServices__Group__5 : rule__ListOfrequiredServices__Group__5__Impl ;
    public final void rule__ListOfrequiredServices__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2615:1: ( rule__ListOfrequiredServices__Group__5__Impl )
            // InternalFoo.g:2616:2: rule__ListOfrequiredServices__Group__5__Impl
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
    // InternalFoo.g:2622:1: rule__ListOfrequiredServices__Group__5__Impl : ( '}' ) ;
    public final void rule__ListOfrequiredServices__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2626:1: ( ( '}' ) )
            // InternalFoo.g:2627:1: ( '}' )
            {
            // InternalFoo.g:2627:1: ( '}' )
            // InternalFoo.g:2628:2: '}'
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalFoo.g:2638:1: rule__ListOfrequiredServices__Group_4__0 : rule__ListOfrequiredServices__Group_4__0__Impl rule__ListOfrequiredServices__Group_4__1 ;
    public final void rule__ListOfrequiredServices__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2642:1: ( rule__ListOfrequiredServices__Group_4__0__Impl rule__ListOfrequiredServices__Group_4__1 )
            // InternalFoo.g:2643:2: rule__ListOfrequiredServices__Group_4__0__Impl rule__ListOfrequiredServices__Group_4__1
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
    // InternalFoo.g:2650:1: rule__ListOfrequiredServices__Group_4__0__Impl : ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? ) ;
    public final void rule__ListOfrequiredServices__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2654:1: ( ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? ) )
            // InternalFoo.g:2655:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? )
            {
            // InternalFoo.g:2655:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? )
            // InternalFoo.g:2656:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )?
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesAssignment_4_0()); 
            // InternalFoo.g:2657:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFoo.g:2657:3: rule__ListOfrequiredServices__RequiredServicesAssignment_4_0
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
    // InternalFoo.g:2665:1: rule__ListOfrequiredServices__Group_4__1 : rule__ListOfrequiredServices__Group_4__1__Impl ;
    public final void rule__ListOfrequiredServices__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2669:1: ( rule__ListOfrequiredServices__Group_4__1__Impl )
            // InternalFoo.g:2670:2: rule__ListOfrequiredServices__Group_4__1__Impl
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
    // InternalFoo.g:2676:1: rule__ListOfrequiredServices__Group_4__1__Impl : ( ( rule__ListOfrequiredServices__Group_4_1__0 )* ) ;
    public final void rule__ListOfrequiredServices__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2680:1: ( ( ( rule__ListOfrequiredServices__Group_4_1__0 )* ) )
            // InternalFoo.g:2681:1: ( ( rule__ListOfrequiredServices__Group_4_1__0 )* )
            {
            // InternalFoo.g:2681:1: ( ( rule__ListOfrequiredServices__Group_4_1__0 )* )
            // InternalFoo.g:2682:2: ( rule__ListOfrequiredServices__Group_4_1__0 )*
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getGroup_4_1()); 
            // InternalFoo.g:2683:2: ( rule__ListOfrequiredServices__Group_4_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalFoo.g:2683:3: rule__ListOfrequiredServices__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ListOfrequiredServices__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalFoo.g:2692:1: rule__ListOfrequiredServices__Group_4_1__0 : rule__ListOfrequiredServices__Group_4_1__0__Impl rule__ListOfrequiredServices__Group_4_1__1 ;
    public final void rule__ListOfrequiredServices__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2696:1: ( rule__ListOfrequiredServices__Group_4_1__0__Impl rule__ListOfrequiredServices__Group_4_1__1 )
            // InternalFoo.g:2697:2: rule__ListOfrequiredServices__Group_4_1__0__Impl rule__ListOfrequiredServices__Group_4_1__1
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
    // InternalFoo.g:2704:1: rule__ListOfrequiredServices__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfrequiredServices__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2708:1: ( ( ',' ) )
            // InternalFoo.g:2709:1: ( ',' )
            {
            // InternalFoo.g:2709:1: ( ',' )
            // InternalFoo.g:2710:2: ','
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getCommaKeyword_4_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFoo.g:2719:1: rule__ListOfrequiredServices__Group_4_1__1 : rule__ListOfrequiredServices__Group_4_1__1__Impl ;
    public final void rule__ListOfrequiredServices__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2723:1: ( rule__ListOfrequiredServices__Group_4_1__1__Impl )
            // InternalFoo.g:2724:2: rule__ListOfrequiredServices__Group_4_1__1__Impl
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
    // InternalFoo.g:2730:1: rule__ListOfrequiredServices__Group_4_1__1__Impl : ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) ) ;
    public final void rule__ListOfrequiredServices__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2734:1: ( ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) ) )
            // InternalFoo.g:2735:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) )
            {
            // InternalFoo.g:2735:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) )
            // InternalFoo.g:2736:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 )
            {
             before(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesAssignment_4_1_1()); 
            // InternalFoo.g:2737:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 )
            // InternalFoo.g:2737:3: rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1
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
    // InternalFoo.g:2746:1: rule__MProvidedService__Group__0 : rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1 ;
    public final void rule__MProvidedService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2750:1: ( rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1 )
            // InternalFoo.g:2751:2: rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1
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
    // InternalFoo.g:2758:1: rule__MProvidedService__Group__0__Impl : ( 'service' ) ;
    public final void rule__MProvidedService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2762:1: ( ( 'service' ) )
            // InternalFoo.g:2763:1: ( 'service' )
            {
            // InternalFoo.g:2763:1: ( 'service' )
            // InternalFoo.g:2764:2: 'service'
            {
             before(grammarAccess.getMProvidedServiceAccess().getServiceKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalFoo.g:2773:1: rule__MProvidedService__Group__1 : rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2 ;
    public final void rule__MProvidedService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2777:1: ( rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2 )
            // InternalFoo.g:2778:2: rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2
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
    // InternalFoo.g:2785:1: rule__MProvidedService__Group__1__Impl : ( 'provided' ) ;
    public final void rule__MProvidedService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2789:1: ( ( 'provided' ) )
            // InternalFoo.g:2790:1: ( 'provided' )
            {
            // InternalFoo.g:2790:1: ( 'provided' )
            // InternalFoo.g:2791:2: 'provided'
            {
             before(grammarAccess.getMProvidedServiceAccess().getProvidedKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalFoo.g:2800:1: rule__MProvidedService__Group__2 : rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3 ;
    public final void rule__MProvidedService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2804:1: ( rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3 )
            // InternalFoo.g:2805:2: rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3
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
    // InternalFoo.g:2812:1: rule__MProvidedService__Group__2__Impl : ( ( rule__MProvidedService__SignatureAssignment_2 ) ) ;
    public final void rule__MProvidedService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2816:1: ( ( ( rule__MProvidedService__SignatureAssignment_2 ) ) )
            // InternalFoo.g:2817:1: ( ( rule__MProvidedService__SignatureAssignment_2 ) )
            {
            // InternalFoo.g:2817:1: ( ( rule__MProvidedService__SignatureAssignment_2 ) )
            // InternalFoo.g:2818:2: ( rule__MProvidedService__SignatureAssignment_2 )
            {
             before(grammarAccess.getMProvidedServiceAccess().getSignatureAssignment_2()); 
            // InternalFoo.g:2819:2: ( rule__MProvidedService__SignatureAssignment_2 )
            // InternalFoo.g:2819:3: rule__MProvidedService__SignatureAssignment_2
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
    // InternalFoo.g:2827:1: rule__MProvidedService__Group__3 : rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4 ;
    public final void rule__MProvidedService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2831:1: ( rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4 )
            // InternalFoo.g:2832:2: rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalFoo.g:2839:1: rule__MProvidedService__Group__3__Impl : ( '{' ) ;
    public final void rule__MProvidedService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2843:1: ( ( '{' ) )
            // InternalFoo.g:2844:1: ( '{' )
            {
            // InternalFoo.g:2844:1: ( '{' )
            // InternalFoo.g:2845:2: '{'
            {
             before(grammarAccess.getMProvidedServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalFoo.g:2854:1: rule__MProvidedService__Group__4 : rule__MProvidedService__Group__4__Impl rule__MProvidedService__Group__5 ;
    public final void rule__MProvidedService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2858:1: ( rule__MProvidedService__Group__4__Impl rule__MProvidedService__Group__5 )
            // InternalFoo.g:2859:2: rule__MProvidedService__Group__4__Impl rule__MProvidedService__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__MProvidedService__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MProvidedService__Group__5();

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
    // InternalFoo.g:2866:1: rule__MProvidedService__Group__4__Impl : ( ( ( rule__MProvidedService__ExpressionsAssignment_4 ) ) ( ( rule__MProvidedService__ExpressionsAssignment_4 )* ) ) ;
    public final void rule__MProvidedService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2870:1: ( ( ( ( rule__MProvidedService__ExpressionsAssignment_4 ) ) ( ( rule__MProvidedService__ExpressionsAssignment_4 )* ) ) )
            // InternalFoo.g:2871:1: ( ( ( rule__MProvidedService__ExpressionsAssignment_4 ) ) ( ( rule__MProvidedService__ExpressionsAssignment_4 )* ) )
            {
            // InternalFoo.g:2871:1: ( ( ( rule__MProvidedService__ExpressionsAssignment_4 ) ) ( ( rule__MProvidedService__ExpressionsAssignment_4 )* ) )
            // InternalFoo.g:2872:2: ( ( rule__MProvidedService__ExpressionsAssignment_4 ) ) ( ( rule__MProvidedService__ExpressionsAssignment_4 )* )
            {
            // InternalFoo.g:2872:2: ( ( rule__MProvidedService__ExpressionsAssignment_4 ) )
            // InternalFoo.g:2873:3: ( rule__MProvidedService__ExpressionsAssignment_4 )
            {
             before(grammarAccess.getMProvidedServiceAccess().getExpressionsAssignment_4()); 
            // InternalFoo.g:2874:3: ( rule__MProvidedService__ExpressionsAssignment_4 )
            // InternalFoo.g:2874:4: rule__MProvidedService__ExpressionsAssignment_4
            {
            pushFollow(FOLLOW_33);
            rule__MProvidedService__ExpressionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMProvidedServiceAccess().getExpressionsAssignment_4()); 

            }

            // InternalFoo.g:2877:2: ( ( rule__MProvidedService__ExpressionsAssignment_4 )* )
            // InternalFoo.g:2878:3: ( rule__MProvidedService__ExpressionsAssignment_4 )*
            {
             before(grammarAccess.getMProvidedServiceAccess().getExpressionsAssignment_4()); 
            // InternalFoo.g:2879:3: ( rule__MProvidedService__ExpressionsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34||LA21_0==38||LA21_0==40) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalFoo.g:2879:4: rule__MProvidedService__ExpressionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__MProvidedService__ExpressionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getMProvidedServiceAccess().getExpressionsAssignment_4()); 

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
    // $ANTLR end "rule__MProvidedService__Group__4__Impl"


    // $ANTLR start "rule__MProvidedService__Group__5"
    // InternalFoo.g:2888:1: rule__MProvidedService__Group__5 : rule__MProvidedService__Group__5__Impl ;
    public final void rule__MProvidedService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2892:1: ( rule__MProvidedService__Group__5__Impl )
            // InternalFoo.g:2893:2: rule__MProvidedService__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MProvidedService__Group__5__Impl();

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
    // $ANTLR end "rule__MProvidedService__Group__5"


    // $ANTLR start "rule__MProvidedService__Group__5__Impl"
    // InternalFoo.g:2899:1: rule__MProvidedService__Group__5__Impl : ( '}' ) ;
    public final void rule__MProvidedService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2903:1: ( ( '}' ) )
            // InternalFoo.g:2904:1: ( '}' )
            {
            // InternalFoo.g:2904:1: ( '}' )
            // InternalFoo.g:2905:2: '}'
            {
             before(grammarAccess.getMProvidedServiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMProvidedServiceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MProvidedService__Group__5__Impl"


    // $ANTLR start "rule__Expression__Group_2__0"
    // InternalFoo.g:2915:1: rule__Expression__Group_2__0 : rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 ;
    public final void rule__Expression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2919:1: ( rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 )
            // InternalFoo.g:2920:2: rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1
            {
            pushFollow(FOLLOW_32);
            rule__Expression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__1();

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
    // $ANTLR end "rule__Expression__Group_2__0"


    // $ANTLR start "rule__Expression__Group_2__0__Impl"
    // InternalFoo.g:2927:1: rule__Expression__Group_2__0__Impl : ( () ) ;
    public final void rule__Expression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2931:1: ( ( () ) )
            // InternalFoo.g:2932:1: ( () )
            {
            // InternalFoo.g:2932:1: ( () )
            // InternalFoo.g:2933:2: ()
            {
             before(grammarAccess.getExpressionAccess().getExpressionAction_2_0()); 
            // InternalFoo.g:2934:2: ()
            // InternalFoo.g:2934:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getExpressionAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__0__Impl"


    // $ANTLR start "rule__Expression__Group_2__1"
    // InternalFoo.g:2942:1: rule__Expression__Group_2__1 : rule__Expression__Group_2__1__Impl ;
    public final void rule__Expression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2946:1: ( rule__Expression__Group_2__1__Impl )
            // InternalFoo.g:2947:2: rule__Expression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_2__1"


    // $ANTLR start "rule__Expression__Group_2__1__Impl"
    // InternalFoo.g:2953:1: rule__Expression__Group_2__1__Impl : ( ruleStatement ) ;
    public final void rule__Expression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2957:1: ( ( ruleStatement ) )
            // InternalFoo.g:2958:1: ( ruleStatement )
            {
            // InternalFoo.g:2958:1: ( ruleStatement )
            // InternalFoo.g:2959:2: ruleStatement
            {
             before(grammarAccess.getExpressionAccess().getStatementParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getStatementParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__1__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalFoo.g:2969:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2973:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalFoo.g:2974:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__If__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__1();

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
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // InternalFoo.g:2981:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2985:1: ( ( 'if' ) )
            // InternalFoo.g:2986:1: ( 'if' )
            {
            // InternalFoo.g:2986:1: ( 'if' )
            // InternalFoo.g:2987:2: 'if'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalFoo.g:2996:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3000:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalFoo.g:3001:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__If__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__2();

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
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // InternalFoo.g:3008:1: rule__If__Group__1__Impl : ( '(' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3012:1: ( ( '(' ) )
            // InternalFoo.g:3013:1: ( '(' )
            {
            // InternalFoo.g:3013:1: ( '(' )
            // InternalFoo.g:3014:2: '('
            {
             before(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalFoo.g:3023:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3027:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalFoo.g:3028:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__If__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__3();

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
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // InternalFoo.g:3035:1: rule__If__Group__2__Impl : ( ( rule__If__Group_2__0 )* ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3039:1: ( ( ( rule__If__Group_2__0 )* ) )
            // InternalFoo.g:3040:1: ( ( rule__If__Group_2__0 )* )
            {
            // InternalFoo.g:3040:1: ( ( rule__If__Group_2__0 )* )
            // InternalFoo.g:3041:2: ( rule__If__Group_2__0 )*
            {
             before(grammarAccess.getIfAccess().getGroup_2()); 
            // InternalFoo.g:3042:2: ( rule__If__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==13) ) {
                        int LA22_2 = input.LA(3);

                        if ( ((LA22_2>=11 && LA22_2<=12)) ) {
                            alt22=1;
                        }


                    }
                    else if ( (LA22_1==14) ) {
                        int LA22_3 = input.LA(3);

                        if ( ((LA22_3>=11 && LA22_3<=12)) ) {
                            alt22=1;
                        }


                    }


                    }
                    break;
                case 13:
                    {
                    int LA22_2 = input.LA(2);

                    if ( ((LA22_2>=11 && LA22_2<=12)) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA22_3 = input.LA(2);

                    if ( ((LA22_3>=11 && LA22_3<=12)) ) {
                        alt22=1;
                    }


                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // InternalFoo.g:3042:3: rule__If__Group_2__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__If__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getIfAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // InternalFoo.g:3050:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3054:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalFoo.g:3055:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__If__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__4();

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
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // InternalFoo.g:3062:1: rule__If__Group__3__Impl : ( ( rule__If__ConditionsAssignment_3 ) ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3066:1: ( ( ( rule__If__ConditionsAssignment_3 ) ) )
            // InternalFoo.g:3067:1: ( ( rule__If__ConditionsAssignment_3 ) )
            {
            // InternalFoo.g:3067:1: ( ( rule__If__ConditionsAssignment_3 ) )
            // InternalFoo.g:3068:2: ( rule__If__ConditionsAssignment_3 )
            {
             before(grammarAccess.getIfAccess().getConditionsAssignment_3()); 
            // InternalFoo.g:3069:2: ( rule__If__ConditionsAssignment_3 )
            // InternalFoo.g:3069:3: rule__If__ConditionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__If__ConditionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getConditionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // InternalFoo.g:3077:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3081:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalFoo.g:3082:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__If__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__5();

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
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // InternalFoo.g:3089:1: rule__If__Group__4__Impl : ( ')' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3093:1: ( ( ')' ) )
            // InternalFoo.g:3094:1: ( ')' )
            {
            // InternalFoo.g:3094:1: ( ')' )
            // InternalFoo.g:3095:2: ')'
            {
             before(grammarAccess.getIfAccess().getRightParenthesisKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group__5"
    // InternalFoo.g:3104:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3108:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalFoo.g:3109:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__If__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__6();

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
    // $ANTLR end "rule__If__Group__5"


    // $ANTLR start "rule__If__Group__5__Impl"
    // InternalFoo.g:3116:1: rule__If__Group__5__Impl : ( '{' ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3120:1: ( ( '{' ) )
            // InternalFoo.g:3121:1: ( '{' )
            {
            // InternalFoo.g:3121:1: ( '{' )
            // InternalFoo.g:3122:2: '{'
            {
             before(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5__Impl"


    // $ANTLR start "rule__If__Group__6"
    // InternalFoo.g:3131:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3135:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // InternalFoo.g:3136:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__If__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__7();

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
    // $ANTLR end "rule__If__Group__6"


    // $ANTLR start "rule__If__Group__6__Impl"
    // InternalFoo.g:3143:1: rule__If__Group__6__Impl : ( ( rule__If__ExpressionsAssignment_6 ) ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3147:1: ( ( ( rule__If__ExpressionsAssignment_6 ) ) )
            // InternalFoo.g:3148:1: ( ( rule__If__ExpressionsAssignment_6 ) )
            {
            // InternalFoo.g:3148:1: ( ( rule__If__ExpressionsAssignment_6 ) )
            // InternalFoo.g:3149:2: ( rule__If__ExpressionsAssignment_6 )
            {
             before(grammarAccess.getIfAccess().getExpressionsAssignment_6()); 
            // InternalFoo.g:3150:2: ( rule__If__ExpressionsAssignment_6 )
            // InternalFoo.g:3150:3: rule__If__ExpressionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__If__ExpressionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getExpressionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6__Impl"


    // $ANTLR start "rule__If__Group__7"
    // InternalFoo.g:3158:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3162:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // InternalFoo.g:3163:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_38);
            rule__If__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__8();

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
    // $ANTLR end "rule__If__Group__7"


    // $ANTLR start "rule__If__Group__7__Impl"
    // InternalFoo.g:3170:1: rule__If__Group__7__Impl : ( '}' ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3174:1: ( ( '}' ) )
            // InternalFoo.g:3175:1: ( '}' )
            {
            // InternalFoo.g:3175:1: ( '}' )
            // InternalFoo.g:3176:2: '}'
            {
             before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__7__Impl"


    // $ANTLR start "rule__If__Group__8"
    // InternalFoo.g:3185:1: rule__If__Group__8 : rule__If__Group__8__Impl ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3189:1: ( rule__If__Group__8__Impl )
            // InternalFoo.g:3190:2: rule__If__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__8__Impl();

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
    // $ANTLR end "rule__If__Group__8"


    // $ANTLR start "rule__If__Group__8__Impl"
    // InternalFoo.g:3196:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3200:1: ( ( ( rule__If__Group_8__0 )? ) )
            // InternalFoo.g:3201:1: ( ( rule__If__Group_8__0 )? )
            {
            // InternalFoo.g:3201:1: ( ( rule__If__Group_8__0 )? )
            // InternalFoo.g:3202:2: ( rule__If__Group_8__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_8()); 
            // InternalFoo.g:3203:2: ( rule__If__Group_8__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFoo.g:3203:3: rule__If__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__8__Impl"


    // $ANTLR start "rule__If__Group_2__0"
    // InternalFoo.g:3212:1: rule__If__Group_2__0 : rule__If__Group_2__0__Impl rule__If__Group_2__1 ;
    public final void rule__If__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3216:1: ( rule__If__Group_2__0__Impl rule__If__Group_2__1 )
            // InternalFoo.g:3217:2: rule__If__Group_2__0__Impl rule__If__Group_2__1
            {
            pushFollow(FOLLOW_39);
            rule__If__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_2__1();

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
    // $ANTLR end "rule__If__Group_2__0"


    // $ANTLR start "rule__If__Group_2__0__Impl"
    // InternalFoo.g:3224:1: rule__If__Group_2__0__Impl : ( ( rule__If__ConditionsAssignment_2_0 ) ) ;
    public final void rule__If__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3228:1: ( ( ( rule__If__ConditionsAssignment_2_0 ) ) )
            // InternalFoo.g:3229:1: ( ( rule__If__ConditionsAssignment_2_0 ) )
            {
            // InternalFoo.g:3229:1: ( ( rule__If__ConditionsAssignment_2_0 ) )
            // InternalFoo.g:3230:2: ( rule__If__ConditionsAssignment_2_0 )
            {
             before(grammarAccess.getIfAccess().getConditionsAssignment_2_0()); 
            // InternalFoo.g:3231:2: ( rule__If__ConditionsAssignment_2_0 )
            // InternalFoo.g:3231:3: rule__If__ConditionsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__If__ConditionsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getConditionsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_2__0__Impl"


    // $ANTLR start "rule__If__Group_2__1"
    // InternalFoo.g:3239:1: rule__If__Group_2__1 : rule__If__Group_2__1__Impl ;
    public final void rule__If__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3243:1: ( rule__If__Group_2__1__Impl )
            // InternalFoo.g:3244:2: rule__If__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_2__1__Impl();

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
    // $ANTLR end "rule__If__Group_2__1"


    // $ANTLR start "rule__If__Group_2__1__Impl"
    // InternalFoo.g:3250:1: rule__If__Group_2__1__Impl : ( ( rule__If__Alternatives_2_1 ) ) ;
    public final void rule__If__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3254:1: ( ( ( rule__If__Alternatives_2_1 ) ) )
            // InternalFoo.g:3255:1: ( ( rule__If__Alternatives_2_1 ) )
            {
            // InternalFoo.g:3255:1: ( ( rule__If__Alternatives_2_1 ) )
            // InternalFoo.g:3256:2: ( rule__If__Alternatives_2_1 )
            {
             before(grammarAccess.getIfAccess().getAlternatives_2_1()); 
            // InternalFoo.g:3257:2: ( rule__If__Alternatives_2_1 )
            // InternalFoo.g:3257:3: rule__If__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__If__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getAlternatives_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_2__1__Impl"


    // $ANTLR start "rule__If__Group_8__0"
    // InternalFoo.g:3266:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3270:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // InternalFoo.g:3271:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
            {
            pushFollow(FOLLOW_40);
            rule__If__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_8__1();

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
    // $ANTLR end "rule__If__Group_8__0"


    // $ANTLR start "rule__If__Group_8__0__Impl"
    // InternalFoo.g:3278:1: rule__If__Group_8__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3282:1: ( ( 'else' ) )
            // InternalFoo.g:3283:1: ( 'else' )
            {
            // InternalFoo.g:3283:1: ( 'else' )
            // InternalFoo.g:3284:2: 'else'
            {
             before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getElseKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__0__Impl"


    // $ANTLR start "rule__If__Group_8__1"
    // InternalFoo.g:3293:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3297:1: ( rule__If__Group_8__1__Impl )
            // InternalFoo.g:3298:2: rule__If__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_8__1__Impl();

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
    // $ANTLR end "rule__If__Group_8__1"


    // $ANTLR start "rule__If__Group_8__1__Impl"
    // InternalFoo.g:3304:1: rule__If__Group_8__1__Impl : ( ( rule__If__Alternatives_8_1 ) ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3308:1: ( ( ( rule__If__Alternatives_8_1 ) ) )
            // InternalFoo.g:3309:1: ( ( rule__If__Alternatives_8_1 ) )
            {
            // InternalFoo.g:3309:1: ( ( rule__If__Alternatives_8_1 ) )
            // InternalFoo.g:3310:2: ( rule__If__Alternatives_8_1 )
            {
             before(grammarAccess.getIfAccess().getAlternatives_8_1()); 
            // InternalFoo.g:3311:2: ( rule__If__Alternatives_8_1 )
            // InternalFoo.g:3311:3: rule__If__Alternatives_8_1
            {
            pushFollow(FOLLOW_2);
            rule__If__Alternatives_8_1();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getAlternatives_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__1__Impl"


    // $ANTLR start "rule__If__Group_8_1_1__0"
    // InternalFoo.g:3320:1: rule__If__Group_8_1_1__0 : rule__If__Group_8_1_1__0__Impl rule__If__Group_8_1_1__1 ;
    public final void rule__If__Group_8_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3324:1: ( rule__If__Group_8_1_1__0__Impl rule__If__Group_8_1_1__1 )
            // InternalFoo.g:3325:2: rule__If__Group_8_1_1__0__Impl rule__If__Group_8_1_1__1
            {
            pushFollow(FOLLOW_32);
            rule__If__Group_8_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_8_1_1__1();

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
    // $ANTLR end "rule__If__Group_8_1_1__0"


    // $ANTLR start "rule__If__Group_8_1_1__0__Impl"
    // InternalFoo.g:3332:1: rule__If__Group_8_1_1__0__Impl : ( '{' ) ;
    public final void rule__If__Group_8_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3336:1: ( ( '{' ) )
            // InternalFoo.g:3337:1: ( '{' )
            {
            // InternalFoo.g:3337:1: ( '{' )
            // InternalFoo.g:3338:2: '{'
            {
             before(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_1_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8_1_1__0__Impl"


    // $ANTLR start "rule__If__Group_8_1_1__1"
    // InternalFoo.g:3347:1: rule__If__Group_8_1_1__1 : rule__If__Group_8_1_1__1__Impl rule__If__Group_8_1_1__2 ;
    public final void rule__If__Group_8_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3351:1: ( rule__If__Group_8_1_1__1__Impl rule__If__Group_8_1_1__2 )
            // InternalFoo.g:3352:2: rule__If__Group_8_1_1__1__Impl rule__If__Group_8_1_1__2
            {
            pushFollow(FOLLOW_28);
            rule__If__Group_8_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_8_1_1__2();

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
    // $ANTLR end "rule__If__Group_8_1_1__1"


    // $ANTLR start "rule__If__Group_8_1_1__1__Impl"
    // InternalFoo.g:3359:1: rule__If__Group_8_1_1__1__Impl : ( ( rule__If__ExpressionAssignment_8_1_1_1 ) ) ;
    public final void rule__If__Group_8_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3363:1: ( ( ( rule__If__ExpressionAssignment_8_1_1_1 ) ) )
            // InternalFoo.g:3364:1: ( ( rule__If__ExpressionAssignment_8_1_1_1 ) )
            {
            // InternalFoo.g:3364:1: ( ( rule__If__ExpressionAssignment_8_1_1_1 ) )
            // InternalFoo.g:3365:2: ( rule__If__ExpressionAssignment_8_1_1_1 )
            {
             before(grammarAccess.getIfAccess().getExpressionAssignment_8_1_1_1()); 
            // InternalFoo.g:3366:2: ( rule__If__ExpressionAssignment_8_1_1_1 )
            // InternalFoo.g:3366:3: rule__If__ExpressionAssignment_8_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__If__ExpressionAssignment_8_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getExpressionAssignment_8_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8_1_1__1__Impl"


    // $ANTLR start "rule__If__Group_8_1_1__2"
    // InternalFoo.g:3374:1: rule__If__Group_8_1_1__2 : rule__If__Group_8_1_1__2__Impl ;
    public final void rule__If__Group_8_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3378:1: ( rule__If__Group_8_1_1__2__Impl )
            // InternalFoo.g:3379:2: rule__If__Group_8_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_8_1_1__2__Impl();

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
    // $ANTLR end "rule__If__Group_8_1_1__2"


    // $ANTLR start "rule__If__Group_8_1_1__2__Impl"
    // InternalFoo.g:3385:1: rule__If__Group_8_1_1__2__Impl : ( '}' ) ;
    public final void rule__If__Group_8_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3389:1: ( ( '}' ) )
            // InternalFoo.g:3390:1: ( '}' )
            {
            // InternalFoo.g:3390:1: ( '}' )
            // InternalFoo.g:3391:2: '}'
            {
             before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8_1_1_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8_1_1__2__Impl"


    // $ANTLR start "rule__While__Group__0"
    // InternalFoo.g:3401:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3405:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalFoo.g:3406:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__While__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__1();

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
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // InternalFoo.g:3413:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3417:1: ( ( 'while' ) )
            // InternalFoo.g:3418:1: ( 'while' )
            {
            // InternalFoo.g:3418:1: ( 'while' )
            // InternalFoo.g:3419:2: 'while'
            {
             before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // InternalFoo.g:3428:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3432:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // InternalFoo.g:3433:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__While__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__2();

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
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // InternalFoo.g:3440:1: rule__While__Group__1__Impl : ( '(' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3444:1: ( ( '(' ) )
            // InternalFoo.g:3445:1: ( '(' )
            {
            // InternalFoo.g:3445:1: ( '(' )
            // InternalFoo.g:3446:2: '('
            {
             before(grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__While__Group__2"
    // InternalFoo.g:3455:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3459:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // InternalFoo.g:3460:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__While__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__3();

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
    // $ANTLR end "rule__While__Group__2"


    // $ANTLR start "rule__While__Group__2__Impl"
    // InternalFoo.g:3467:1: rule__While__Group__2__Impl : ( ( rule__While__Group_2__0 )* ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3471:1: ( ( ( rule__While__Group_2__0 )* ) )
            // InternalFoo.g:3472:1: ( ( rule__While__Group_2__0 )* )
            {
            // InternalFoo.g:3472:1: ( ( rule__While__Group_2__0 )* )
            // InternalFoo.g:3473:2: ( rule__While__Group_2__0 )*
            {
             before(grammarAccess.getWhileAccess().getGroup_2()); 
            // InternalFoo.g:3474:2: ( rule__While__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==13) ) {
                        int LA24_2 = input.LA(3);

                        if ( ((LA24_2>=11 && LA24_2<=12)) ) {
                            alt24=1;
                        }


                    }
                    else if ( (LA24_1==14) ) {
                        int LA24_3 = input.LA(3);

                        if ( ((LA24_3>=11 && LA24_3<=12)) ) {
                            alt24=1;
                        }


                    }


                    }
                    break;
                case 13:
                    {
                    int LA24_2 = input.LA(2);

                    if ( ((LA24_2>=11 && LA24_2<=12)) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA24_3 = input.LA(2);

                    if ( ((LA24_3>=11 && LA24_3<=12)) ) {
                        alt24=1;
                    }


                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // InternalFoo.g:3474:3: rule__While__Group_2__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__While__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getWhileAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2__Impl"


    // $ANTLR start "rule__While__Group__3"
    // InternalFoo.g:3482:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3486:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // InternalFoo.g:3487:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__While__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__4();

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
    // $ANTLR end "rule__While__Group__3"


    // $ANTLR start "rule__While__Group__3__Impl"
    // InternalFoo.g:3494:1: rule__While__Group__3__Impl : ( ( rule__While__ConditionsAssignment_3 ) ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3498:1: ( ( ( rule__While__ConditionsAssignment_3 ) ) )
            // InternalFoo.g:3499:1: ( ( rule__While__ConditionsAssignment_3 ) )
            {
            // InternalFoo.g:3499:1: ( ( rule__While__ConditionsAssignment_3 ) )
            // InternalFoo.g:3500:2: ( rule__While__ConditionsAssignment_3 )
            {
             before(grammarAccess.getWhileAccess().getConditionsAssignment_3()); 
            // InternalFoo.g:3501:2: ( rule__While__ConditionsAssignment_3 )
            // InternalFoo.g:3501:3: rule__While__ConditionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__While__ConditionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getConditionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__3__Impl"


    // $ANTLR start "rule__While__Group__4"
    // InternalFoo.g:3509:1: rule__While__Group__4 : rule__While__Group__4__Impl rule__While__Group__5 ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3513:1: ( rule__While__Group__4__Impl rule__While__Group__5 )
            // InternalFoo.g:3514:2: rule__While__Group__4__Impl rule__While__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__While__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__5();

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
    // $ANTLR end "rule__While__Group__4"


    // $ANTLR start "rule__While__Group__4__Impl"
    // InternalFoo.g:3521:1: rule__While__Group__4__Impl : ( ')' ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3525:1: ( ( ')' ) )
            // InternalFoo.g:3526:1: ( ')' )
            {
            // InternalFoo.g:3526:1: ( ')' )
            // InternalFoo.g:3527:2: ')'
            {
             before(grammarAccess.getWhileAccess().getRightParenthesisKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__4__Impl"


    // $ANTLR start "rule__While__Group__5"
    // InternalFoo.g:3536:1: rule__While__Group__5 : rule__While__Group__5__Impl rule__While__Group__6 ;
    public final void rule__While__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3540:1: ( rule__While__Group__5__Impl rule__While__Group__6 )
            // InternalFoo.g:3541:2: rule__While__Group__5__Impl rule__While__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__While__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__6();

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
    // $ANTLR end "rule__While__Group__5"


    // $ANTLR start "rule__While__Group__5__Impl"
    // InternalFoo.g:3548:1: rule__While__Group__5__Impl : ( '{' ) ;
    public final void rule__While__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3552:1: ( ( '{' ) )
            // InternalFoo.g:3553:1: ( '{' )
            {
            // InternalFoo.g:3553:1: ( '{' )
            // InternalFoo.g:3554:2: '{'
            {
             before(grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__5__Impl"


    // $ANTLR start "rule__While__Group__6"
    // InternalFoo.g:3563:1: rule__While__Group__6 : rule__While__Group__6__Impl rule__While__Group__7 ;
    public final void rule__While__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3567:1: ( rule__While__Group__6__Impl rule__While__Group__7 )
            // InternalFoo.g:3568:2: rule__While__Group__6__Impl rule__While__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__While__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__7();

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
    // $ANTLR end "rule__While__Group__6"


    // $ANTLR start "rule__While__Group__6__Impl"
    // InternalFoo.g:3575:1: rule__While__Group__6__Impl : ( ( rule__While__ExpressionsAssignment_6 ) ) ;
    public final void rule__While__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3579:1: ( ( ( rule__While__ExpressionsAssignment_6 ) ) )
            // InternalFoo.g:3580:1: ( ( rule__While__ExpressionsAssignment_6 ) )
            {
            // InternalFoo.g:3580:1: ( ( rule__While__ExpressionsAssignment_6 ) )
            // InternalFoo.g:3581:2: ( rule__While__ExpressionsAssignment_6 )
            {
             before(grammarAccess.getWhileAccess().getExpressionsAssignment_6()); 
            // InternalFoo.g:3582:2: ( rule__While__ExpressionsAssignment_6 )
            // InternalFoo.g:3582:3: rule__While__ExpressionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__While__ExpressionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getExpressionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__6__Impl"


    // $ANTLR start "rule__While__Group__7"
    // InternalFoo.g:3590:1: rule__While__Group__7 : rule__While__Group__7__Impl ;
    public final void rule__While__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3594:1: ( rule__While__Group__7__Impl )
            // InternalFoo.g:3595:2: rule__While__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__7__Impl();

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
    // $ANTLR end "rule__While__Group__7"


    // $ANTLR start "rule__While__Group__7__Impl"
    // InternalFoo.g:3601:1: rule__While__Group__7__Impl : ( '}' ) ;
    public final void rule__While__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3605:1: ( ( '}' ) )
            // InternalFoo.g:3606:1: ( '}' )
            {
            // InternalFoo.g:3606:1: ( '}' )
            // InternalFoo.g:3607:2: '}'
            {
             before(grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__7__Impl"


    // $ANTLR start "rule__While__Group_2__0"
    // InternalFoo.g:3617:1: rule__While__Group_2__0 : rule__While__Group_2__0__Impl rule__While__Group_2__1 ;
    public final void rule__While__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3621:1: ( rule__While__Group_2__0__Impl rule__While__Group_2__1 )
            // InternalFoo.g:3622:2: rule__While__Group_2__0__Impl rule__While__Group_2__1
            {
            pushFollow(FOLLOW_39);
            rule__While__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group_2__1();

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
    // $ANTLR end "rule__While__Group_2__0"


    // $ANTLR start "rule__While__Group_2__0__Impl"
    // InternalFoo.g:3629:1: rule__While__Group_2__0__Impl : ( ( rule__While__ConditionsAssignment_2_0 ) ) ;
    public final void rule__While__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3633:1: ( ( ( rule__While__ConditionsAssignment_2_0 ) ) )
            // InternalFoo.g:3634:1: ( ( rule__While__ConditionsAssignment_2_0 ) )
            {
            // InternalFoo.g:3634:1: ( ( rule__While__ConditionsAssignment_2_0 ) )
            // InternalFoo.g:3635:2: ( rule__While__ConditionsAssignment_2_0 )
            {
             before(grammarAccess.getWhileAccess().getConditionsAssignment_2_0()); 
            // InternalFoo.g:3636:2: ( rule__While__ConditionsAssignment_2_0 )
            // InternalFoo.g:3636:3: rule__While__ConditionsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__While__ConditionsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getConditionsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group_2__0__Impl"


    // $ANTLR start "rule__While__Group_2__1"
    // InternalFoo.g:3644:1: rule__While__Group_2__1 : rule__While__Group_2__1__Impl ;
    public final void rule__While__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3648:1: ( rule__While__Group_2__1__Impl )
            // InternalFoo.g:3649:2: rule__While__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While__Group_2__1__Impl();

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
    // $ANTLR end "rule__While__Group_2__1"


    // $ANTLR start "rule__While__Group_2__1__Impl"
    // InternalFoo.g:3655:1: rule__While__Group_2__1__Impl : ( ( rule__While__Alternatives_2_1 ) ) ;
    public final void rule__While__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3659:1: ( ( ( rule__While__Alternatives_2_1 ) ) )
            // InternalFoo.g:3660:1: ( ( rule__While__Alternatives_2_1 ) )
            {
            // InternalFoo.g:3660:1: ( ( rule__While__Alternatives_2_1 ) )
            // InternalFoo.g:3661:2: ( rule__While__Alternatives_2_1 )
            {
             before(grammarAccess.getWhileAccess().getAlternatives_2_1()); 
            // InternalFoo.g:3662:2: ( rule__While__Alternatives_2_1 )
            // InternalFoo.g:3662:3: rule__While__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__While__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getAlternatives_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group_2__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalFoo.g:3671:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3675:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalFoo.g:3676:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalFoo.g:3683:1: rule__Condition__Group__0__Impl : ( ( '!' )? ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3687:1: ( ( ( '!' )? ) )
            // InternalFoo.g:3688:1: ( ( '!' )? )
            {
            // InternalFoo.g:3688:1: ( ( '!' )? )
            // InternalFoo.g:3689:2: ( '!' )?
            {
             before(grammarAccess.getConditionAccess().getExclamationMarkKeyword_0()); 
            // InternalFoo.g:3690:2: ( '!' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalFoo.g:3690:3: '!'
                    {
                    match(input,39,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalFoo.g:3698:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3702:1: ( rule__Condition__Group__1__Impl )
            // InternalFoo.g:3703:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalFoo.g:3709:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Alternatives_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3713:1: ( ( ( rule__Condition__Alternatives_1 ) ) )
            // InternalFoo.g:3714:1: ( ( rule__Condition__Alternatives_1 ) )
            {
            // InternalFoo.g:3714:1: ( ( rule__Condition__Alternatives_1 ) )
            // InternalFoo.g:3715:2: ( rule__Condition__Alternatives_1 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_1()); 
            // InternalFoo.g:3716:2: ( rule__Condition__Alternatives_1 )
            // InternalFoo.g:3716:3: rule__Condition__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalFoo.g:3725:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3729:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalFoo.g:3730:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

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
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalFoo.g:3737:1: rule__Statement__Group__0__Impl : ( 'Lorem' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3741:1: ( ( 'Lorem' ) )
            // InternalFoo.g:3742:1: ( 'Lorem' )
            {
            // InternalFoo.g:3742:1: ( 'Lorem' )
            // InternalFoo.g:3743:2: 'Lorem'
            {
             before(grammarAccess.getStatementAccess().getLoremKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getLoremKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalFoo.g:3752:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3756:1: ( rule__Statement__Group__1__Impl )
            // InternalFoo.g:3757:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

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
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalFoo.g:3763:1: rule__Statement__Group__1__Impl : ( 'Ipsum' ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3767:1: ( ( 'Ipsum' ) )
            // InternalFoo.g:3768:1: ( 'Ipsum' )
            {
            // InternalFoo.g:3768:1: ( 'Ipsum' )
            // InternalFoo.g:3769:2: 'Ipsum'
            {
             before(grammarAccess.getStatementAccess().getIpsumKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getIpsumKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__PSignature__Group__0"
    // InternalFoo.g:3779:1: rule__PSignature__Group__0 : rule__PSignature__Group__0__Impl rule__PSignature__Group__1 ;
    public final void rule__PSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3783:1: ( rule__PSignature__Group__0__Impl rule__PSignature__Group__1 )
            // InternalFoo.g:3784:2: rule__PSignature__Group__0__Impl rule__PSignature__Group__1
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
    // InternalFoo.g:3791:1: rule__PSignature__Group__0__Impl : ( ( rule__PSignature__TypeAssignment_0 ) ) ;
    public final void rule__PSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3795:1: ( ( ( rule__PSignature__TypeAssignment_0 ) ) )
            // InternalFoo.g:3796:1: ( ( rule__PSignature__TypeAssignment_0 ) )
            {
            // InternalFoo.g:3796:1: ( ( rule__PSignature__TypeAssignment_0 ) )
            // InternalFoo.g:3797:2: ( rule__PSignature__TypeAssignment_0 )
            {
             before(grammarAccess.getPSignatureAccess().getTypeAssignment_0()); 
            // InternalFoo.g:3798:2: ( rule__PSignature__TypeAssignment_0 )
            // InternalFoo.g:3798:3: rule__PSignature__TypeAssignment_0
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
    // InternalFoo.g:3806:1: rule__PSignature__Group__1 : rule__PSignature__Group__1__Impl rule__PSignature__Group__2 ;
    public final void rule__PSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3810:1: ( rule__PSignature__Group__1__Impl rule__PSignature__Group__2 )
            // InternalFoo.g:3811:2: rule__PSignature__Group__1__Impl rule__PSignature__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalFoo.g:3818:1: rule__PSignature__Group__1__Impl : ( ( rule__PSignature__NameAssignment_1 ) ) ;
    public final void rule__PSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3822:1: ( ( ( rule__PSignature__NameAssignment_1 ) ) )
            // InternalFoo.g:3823:1: ( ( rule__PSignature__NameAssignment_1 ) )
            {
            // InternalFoo.g:3823:1: ( ( rule__PSignature__NameAssignment_1 ) )
            // InternalFoo.g:3824:2: ( rule__PSignature__NameAssignment_1 )
            {
             before(grammarAccess.getPSignatureAccess().getNameAssignment_1()); 
            // InternalFoo.g:3825:2: ( rule__PSignature__NameAssignment_1 )
            // InternalFoo.g:3825:3: rule__PSignature__NameAssignment_1
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
    // InternalFoo.g:3833:1: rule__PSignature__Group__2 : rule__PSignature__Group__2__Impl rule__PSignature__Group__3 ;
    public final void rule__PSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3837:1: ( rule__PSignature__Group__2__Impl rule__PSignature__Group__3 )
            // InternalFoo.g:3838:2: rule__PSignature__Group__2__Impl rule__PSignature__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalFoo.g:3845:1: rule__PSignature__Group__2__Impl : ( '(' ) ;
    public final void rule__PSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3849:1: ( ( '(' ) )
            // InternalFoo.g:3850:1: ( '(' )
            {
            // InternalFoo.g:3850:1: ( '(' )
            // InternalFoo.g:3851:2: '('
            {
             before(grammarAccess.getPSignatureAccess().getLeftParenthesisKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalFoo.g:3860:1: rule__PSignature__Group__3 : rule__PSignature__Group__3__Impl rule__PSignature__Group__4 ;
    public final void rule__PSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3864:1: ( rule__PSignature__Group__3__Impl rule__PSignature__Group__4 )
            // InternalFoo.g:3865:2: rule__PSignature__Group__3__Impl rule__PSignature__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalFoo.g:3872:1: rule__PSignature__Group__3__Impl : ( ( rule__PSignature__ParametersAssignment_3 )? ) ;
    public final void rule__PSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3876:1: ( ( ( rule__PSignature__ParametersAssignment_3 )? ) )
            // InternalFoo.g:3877:1: ( ( rule__PSignature__ParametersAssignment_3 )? )
            {
            // InternalFoo.g:3877:1: ( ( rule__PSignature__ParametersAssignment_3 )? )
            // InternalFoo.g:3878:2: ( rule__PSignature__ParametersAssignment_3 )?
            {
             before(grammarAccess.getPSignatureAccess().getParametersAssignment_3()); 
            // InternalFoo.g:3879:2: ( rule__PSignature__ParametersAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalFoo.g:3879:3: rule__PSignature__ParametersAssignment_3
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
    // InternalFoo.g:3887:1: rule__PSignature__Group__4 : rule__PSignature__Group__4__Impl rule__PSignature__Group__5 ;
    public final void rule__PSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3891:1: ( rule__PSignature__Group__4__Impl rule__PSignature__Group__5 )
            // InternalFoo.g:3892:2: rule__PSignature__Group__4__Impl rule__PSignature__Group__5
            {
            pushFollow(FOLLOW_42);
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
    // InternalFoo.g:3899:1: rule__PSignature__Group__4__Impl : ( ( rule__PSignature__Group_4__0 )* ) ;
    public final void rule__PSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3903:1: ( ( ( rule__PSignature__Group_4__0 )* ) )
            // InternalFoo.g:3904:1: ( ( rule__PSignature__Group_4__0 )* )
            {
            // InternalFoo.g:3904:1: ( ( rule__PSignature__Group_4__0 )* )
            // InternalFoo.g:3905:2: ( rule__PSignature__Group_4__0 )*
            {
             before(grammarAccess.getPSignatureAccess().getGroup_4()); 
            // InternalFoo.g:3906:2: ( rule__PSignature__Group_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==31) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalFoo.g:3906:3: rule__PSignature__Group_4__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__PSignature__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalFoo.g:3914:1: rule__PSignature__Group__5 : rule__PSignature__Group__5__Impl ;
    public final void rule__PSignature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3918:1: ( rule__PSignature__Group__5__Impl )
            // InternalFoo.g:3919:2: rule__PSignature__Group__5__Impl
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
    // InternalFoo.g:3925:1: rule__PSignature__Group__5__Impl : ( ')' ) ;
    public final void rule__PSignature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3929:1: ( ( ')' ) )
            // InternalFoo.g:3930:1: ( ')' )
            {
            // InternalFoo.g:3930:1: ( ')' )
            // InternalFoo.g:3931:2: ')'
            {
             before(grammarAccess.getPSignatureAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalFoo.g:3941:1: rule__PSignature__Group_4__0 : rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1 ;
    public final void rule__PSignature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3945:1: ( rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1 )
            // InternalFoo.g:3946:2: rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1
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
    // InternalFoo.g:3953:1: rule__PSignature__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PSignature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3957:1: ( ( ',' ) )
            // InternalFoo.g:3958:1: ( ',' )
            {
            // InternalFoo.g:3958:1: ( ',' )
            // InternalFoo.g:3959:2: ','
            {
             before(grammarAccess.getPSignatureAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFoo.g:3968:1: rule__PSignature__Group_4__1 : rule__PSignature__Group_4__1__Impl ;
    public final void rule__PSignature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3972:1: ( rule__PSignature__Group_4__1__Impl )
            // InternalFoo.g:3973:2: rule__PSignature__Group_4__1__Impl
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
    // InternalFoo.g:3979:1: rule__PSignature__Group_4__1__Impl : ( ( rule__PSignature__ParametersAssignment_4_1 ) ) ;
    public final void rule__PSignature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3983:1: ( ( ( rule__PSignature__ParametersAssignment_4_1 ) ) )
            // InternalFoo.g:3984:1: ( ( rule__PSignature__ParametersAssignment_4_1 ) )
            {
            // InternalFoo.g:3984:1: ( ( rule__PSignature__ParametersAssignment_4_1 ) )
            // InternalFoo.g:3985:2: ( rule__PSignature__ParametersAssignment_4_1 )
            {
             before(grammarAccess.getPSignatureAccess().getParametersAssignment_4_1()); 
            // InternalFoo.g:3986:2: ( rule__PSignature__ParametersAssignment_4_1 )
            // InternalFoo.g:3986:3: rule__PSignature__ParametersAssignment_4_1
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
    // InternalFoo.g:3995:1: rule__MRequiredService__Group__0 : rule__MRequiredService__Group__0__Impl rule__MRequiredService__Group__1 ;
    public final void rule__MRequiredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3999:1: ( rule__MRequiredService__Group__0__Impl rule__MRequiredService__Group__1 )
            // InternalFoo.g:4000:2: rule__MRequiredService__Group__0__Impl rule__MRequiredService__Group__1
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
    // InternalFoo.g:4007:1: rule__MRequiredService__Group__0__Impl : ( 'service' ) ;
    public final void rule__MRequiredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4011:1: ( ( 'service' ) )
            // InternalFoo.g:4012:1: ( 'service' )
            {
            // InternalFoo.g:4012:1: ( 'service' )
            // InternalFoo.g:4013:2: 'service'
            {
             before(grammarAccess.getMRequiredServiceAccess().getServiceKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalFoo.g:4022:1: rule__MRequiredService__Group__1 : rule__MRequiredService__Group__1__Impl rule__MRequiredService__Group__2 ;
    public final void rule__MRequiredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4026:1: ( rule__MRequiredService__Group__1__Impl rule__MRequiredService__Group__2 )
            // InternalFoo.g:4027:2: rule__MRequiredService__Group__1__Impl rule__MRequiredService__Group__2
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
    // InternalFoo.g:4034:1: rule__MRequiredService__Group__1__Impl : ( 'required' ) ;
    public final void rule__MRequiredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4038:1: ( ( 'required' ) )
            // InternalFoo.g:4039:1: ( 'required' )
            {
            // InternalFoo.g:4039:1: ( 'required' )
            // InternalFoo.g:4040:2: 'required'
            {
             before(grammarAccess.getMRequiredServiceAccess().getRequiredKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalFoo.g:4049:1: rule__MRequiredService__Group__2 : rule__MRequiredService__Group__2__Impl rule__MRequiredService__Group__3 ;
    public final void rule__MRequiredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4053:1: ( rule__MRequiredService__Group__2__Impl rule__MRequiredService__Group__3 )
            // InternalFoo.g:4054:2: rule__MRequiredService__Group__2__Impl rule__MRequiredService__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalFoo.g:4061:1: rule__MRequiredService__Group__2__Impl : ( ( rule__MRequiredService__SignatureAssignment_2 ) ) ;
    public final void rule__MRequiredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4065:1: ( ( ( rule__MRequiredService__SignatureAssignment_2 ) ) )
            // InternalFoo.g:4066:1: ( ( rule__MRequiredService__SignatureAssignment_2 ) )
            {
            // InternalFoo.g:4066:1: ( ( rule__MRequiredService__SignatureAssignment_2 ) )
            // InternalFoo.g:4067:2: ( rule__MRequiredService__SignatureAssignment_2 )
            {
             before(grammarAccess.getMRequiredServiceAccess().getSignatureAssignment_2()); 
            // InternalFoo.g:4068:2: ( rule__MRequiredService__SignatureAssignment_2 )
            // InternalFoo.g:4068:3: rule__MRequiredService__SignatureAssignment_2
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
    // InternalFoo.g:4076:1: rule__MRequiredService__Group__3 : rule__MRequiredService__Group__3__Impl ;
    public final void rule__MRequiredService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4080:1: ( rule__MRequiredService__Group__3__Impl )
            // InternalFoo.g:4081:2: rule__MRequiredService__Group__3__Impl
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
    // InternalFoo.g:4087:1: rule__MRequiredService__Group__3__Impl : ( ';' ) ;
    public final void rule__MRequiredService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4091:1: ( ( ';' ) )
            // InternalFoo.g:4092:1: ( ';' )
            {
            // InternalFoo.g:4092:1: ( ';' )
            // InternalFoo.g:4093:2: ';'
            {
             before(grammarAccess.getMRequiredServiceAccess().getSemicolonKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalFoo.g:4103:1: rule__RSignature__Group__0 : rule__RSignature__Group__0__Impl rule__RSignature__Group__1 ;
    public final void rule__RSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4107:1: ( rule__RSignature__Group__0__Impl rule__RSignature__Group__1 )
            // InternalFoo.g:4108:2: rule__RSignature__Group__0__Impl rule__RSignature__Group__1
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
    // InternalFoo.g:4115:1: rule__RSignature__Group__0__Impl : ( ( rule__RSignature__TypeAssignment_0 ) ) ;
    public final void rule__RSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4119:1: ( ( ( rule__RSignature__TypeAssignment_0 ) ) )
            // InternalFoo.g:4120:1: ( ( rule__RSignature__TypeAssignment_0 ) )
            {
            // InternalFoo.g:4120:1: ( ( rule__RSignature__TypeAssignment_0 ) )
            // InternalFoo.g:4121:2: ( rule__RSignature__TypeAssignment_0 )
            {
             before(grammarAccess.getRSignatureAccess().getTypeAssignment_0()); 
            // InternalFoo.g:4122:2: ( rule__RSignature__TypeAssignment_0 )
            // InternalFoo.g:4122:3: rule__RSignature__TypeAssignment_0
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
    // InternalFoo.g:4130:1: rule__RSignature__Group__1 : rule__RSignature__Group__1__Impl rule__RSignature__Group__2 ;
    public final void rule__RSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4134:1: ( rule__RSignature__Group__1__Impl rule__RSignature__Group__2 )
            // InternalFoo.g:4135:2: rule__RSignature__Group__1__Impl rule__RSignature__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalFoo.g:4142:1: rule__RSignature__Group__1__Impl : ( ( rule__RSignature__NameAssignment_1 ) ) ;
    public final void rule__RSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4146:1: ( ( ( rule__RSignature__NameAssignment_1 ) ) )
            // InternalFoo.g:4147:1: ( ( rule__RSignature__NameAssignment_1 ) )
            {
            // InternalFoo.g:4147:1: ( ( rule__RSignature__NameAssignment_1 ) )
            // InternalFoo.g:4148:2: ( rule__RSignature__NameAssignment_1 )
            {
             before(grammarAccess.getRSignatureAccess().getNameAssignment_1()); 
            // InternalFoo.g:4149:2: ( rule__RSignature__NameAssignment_1 )
            // InternalFoo.g:4149:3: rule__RSignature__NameAssignment_1
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
    // InternalFoo.g:4157:1: rule__RSignature__Group__2 : rule__RSignature__Group__2__Impl rule__RSignature__Group__3 ;
    public final void rule__RSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4161:1: ( rule__RSignature__Group__2__Impl rule__RSignature__Group__3 )
            // InternalFoo.g:4162:2: rule__RSignature__Group__2__Impl rule__RSignature__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalFoo.g:4169:1: rule__RSignature__Group__2__Impl : ( '(' ) ;
    public final void rule__RSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4173:1: ( ( '(' ) )
            // InternalFoo.g:4174:1: ( '(' )
            {
            // InternalFoo.g:4174:1: ( '(' )
            // InternalFoo.g:4175:2: '('
            {
             before(grammarAccess.getRSignatureAccess().getLeftParenthesisKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalFoo.g:4184:1: rule__RSignature__Group__3 : rule__RSignature__Group__3__Impl rule__RSignature__Group__4 ;
    public final void rule__RSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4188:1: ( rule__RSignature__Group__3__Impl rule__RSignature__Group__4 )
            // InternalFoo.g:4189:2: rule__RSignature__Group__3__Impl rule__RSignature__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalFoo.g:4196:1: rule__RSignature__Group__3__Impl : ( ( rule__RSignature__ParametersAssignment_3 )? ) ;
    public final void rule__RSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4200:1: ( ( ( rule__RSignature__ParametersAssignment_3 )? ) )
            // InternalFoo.g:4201:1: ( ( rule__RSignature__ParametersAssignment_3 )? )
            {
            // InternalFoo.g:4201:1: ( ( rule__RSignature__ParametersAssignment_3 )? )
            // InternalFoo.g:4202:2: ( rule__RSignature__ParametersAssignment_3 )?
            {
             before(grammarAccess.getRSignatureAccess().getParametersAssignment_3()); 
            // InternalFoo.g:4203:2: ( rule__RSignature__ParametersAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFoo.g:4203:3: rule__RSignature__ParametersAssignment_3
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
    // InternalFoo.g:4211:1: rule__RSignature__Group__4 : rule__RSignature__Group__4__Impl rule__RSignature__Group__5 ;
    public final void rule__RSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4215:1: ( rule__RSignature__Group__4__Impl rule__RSignature__Group__5 )
            // InternalFoo.g:4216:2: rule__RSignature__Group__4__Impl rule__RSignature__Group__5
            {
            pushFollow(FOLLOW_42);
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
    // InternalFoo.g:4223:1: rule__RSignature__Group__4__Impl : ( ( rule__RSignature__Group_4__0 )* ) ;
    public final void rule__RSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4227:1: ( ( ( rule__RSignature__Group_4__0 )* ) )
            // InternalFoo.g:4228:1: ( ( rule__RSignature__Group_4__0 )* )
            {
            // InternalFoo.g:4228:1: ( ( rule__RSignature__Group_4__0 )* )
            // InternalFoo.g:4229:2: ( rule__RSignature__Group_4__0 )*
            {
             before(grammarAccess.getRSignatureAccess().getGroup_4()); 
            // InternalFoo.g:4230:2: ( rule__RSignature__Group_4__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==31) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalFoo.g:4230:3: rule__RSignature__Group_4__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__RSignature__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalFoo.g:4238:1: rule__RSignature__Group__5 : rule__RSignature__Group__5__Impl ;
    public final void rule__RSignature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4242:1: ( rule__RSignature__Group__5__Impl )
            // InternalFoo.g:4243:2: rule__RSignature__Group__5__Impl
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
    // InternalFoo.g:4249:1: rule__RSignature__Group__5__Impl : ( ')' ) ;
    public final void rule__RSignature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4253:1: ( ( ')' ) )
            // InternalFoo.g:4254:1: ( ')' )
            {
            // InternalFoo.g:4254:1: ( ')' )
            // InternalFoo.g:4255:2: ')'
            {
             before(grammarAccess.getRSignatureAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalFoo.g:4265:1: rule__RSignature__Group_4__0 : rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1 ;
    public final void rule__RSignature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4269:1: ( rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1 )
            // InternalFoo.g:4270:2: rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1
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
    // InternalFoo.g:4277:1: rule__RSignature__Group_4__0__Impl : ( ',' ) ;
    public final void rule__RSignature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4281:1: ( ( ',' ) )
            // InternalFoo.g:4282:1: ( ',' )
            {
            // InternalFoo.g:4282:1: ( ',' )
            // InternalFoo.g:4283:2: ','
            {
             before(grammarAccess.getRSignatureAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFoo.g:4292:1: rule__RSignature__Group_4__1 : rule__RSignature__Group_4__1__Impl ;
    public final void rule__RSignature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4296:1: ( rule__RSignature__Group_4__1__Impl )
            // InternalFoo.g:4297:2: rule__RSignature__Group_4__1__Impl
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
    // InternalFoo.g:4303:1: rule__RSignature__Group_4__1__Impl : ( ( rule__RSignature__ParametersAssignment_4_1 ) ) ;
    public final void rule__RSignature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4307:1: ( ( ( rule__RSignature__ParametersAssignment_4_1 ) ) )
            // InternalFoo.g:4308:1: ( ( rule__RSignature__ParametersAssignment_4_1 ) )
            {
            // InternalFoo.g:4308:1: ( ( rule__RSignature__ParametersAssignment_4_1 ) )
            // InternalFoo.g:4309:2: ( rule__RSignature__ParametersAssignment_4_1 )
            {
             before(grammarAccess.getRSignatureAccess().getParametersAssignment_4_1()); 
            // InternalFoo.g:4310:2: ( rule__RSignature__ParametersAssignment_4_1 )
            // InternalFoo.g:4310:3: rule__RSignature__ParametersAssignment_4_1
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
    // InternalFoo.g:4319:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4323:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalFoo.g:4324:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalFoo.g:4331:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4335:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalFoo.g:4336:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalFoo.g:4336:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalFoo.g:4337:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalFoo.g:4338:2: ( rule__Parameter__NameAssignment_0 )
            // InternalFoo.g:4338:3: rule__Parameter__NameAssignment_0
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
    // InternalFoo.g:4346:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4350:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalFoo.g:4351:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalFoo.g:4358:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4362:1: ( ( ':' ) )
            // InternalFoo.g:4363:1: ( ':' )
            {
            // InternalFoo.g:4363:1: ( ':' )
            // InternalFoo.g:4364:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFoo.g:4373:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4377:1: ( rule__Parameter__Group__2__Impl )
            // InternalFoo.g:4378:2: rule__Parameter__Group__2__Impl
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
    // InternalFoo.g:4384:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4388:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalFoo.g:4389:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalFoo.g:4389:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalFoo.g:4390:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalFoo.g:4391:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalFoo.g:4391:3: rule__Parameter__TypeAssignment_2
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
    // InternalFoo.g:4400:1: rule__DomainModel__ModelAssignment : ( ruleModel ) ;
    public final void rule__DomainModel__ModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4404:1: ( ( ruleModel ) )
            // InternalFoo.g:4405:2: ( ruleModel )
            {
            // InternalFoo.g:4405:2: ( ruleModel )
            // InternalFoo.g:4406:3: ruleModel
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
    // InternalFoo.g:4415:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4419:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:4420:2: ( ruleQualifiedName )
            {
            // InternalFoo.g:4420:2: ( ruleQualifiedName )
            // InternalFoo.g:4421:3: ruleQualifiedName
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
    // InternalFoo.g:4430:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4434:1: ( ( ruleImport ) )
            // InternalFoo.g:4435:2: ( ruleImport )
            {
            // InternalFoo.g:4435:2: ( ruleImport )
            // InternalFoo.g:4436:3: ruleImport
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
    // InternalFoo.g:4445:1: rule__Model__ComponentsAssignment_4 : ( ruleComponent ) ;
    public final void rule__Model__ComponentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4449:1: ( ( ruleComponent ) )
            // InternalFoo.g:4450:2: ( ruleComponent )
            {
            // InternalFoo.g:4450:2: ( ruleComponent )
            // InternalFoo.g:4451:3: ruleComponent
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
    // InternalFoo.g:4460:1: rule__Model__AssemblyAssignment_5 : ( ruleAssembly ) ;
    public final void rule__Model__AssemblyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4464:1: ( ( ruleAssembly ) )
            // InternalFoo.g:4465:2: ( ruleAssembly )
            {
            // InternalFoo.g:4465:2: ( ruleAssembly )
            // InternalFoo.g:4466:3: ruleAssembly
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
    // InternalFoo.g:4475:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4479:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalFoo.g:4480:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalFoo.g:4480:2: ( ruleQualifiedNameWithWildcard )
            // InternalFoo.g:4481:3: ruleQualifiedNameWithWildcard
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
    // InternalFoo.g:4490:1: rule__Assembly__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Assembly__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4494:1: ( ( RULE_ID ) )
            // InternalFoo.g:4495:2: ( RULE_ID )
            {
            // InternalFoo.g:4495:2: ( RULE_ID )
            // InternalFoo.g:4496:3: RULE_ID
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
    // InternalFoo.g:4505:1: rule__Assembly__AttributesAssignment_5 : ( ruleComponentInstance ) ;
    public final void rule__Assembly__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4509:1: ( ( ruleComponentInstance ) )
            // InternalFoo.g:4510:2: ( ruleComponentInstance )
            {
            // InternalFoo.g:4510:2: ( ruleComponentInstance )
            // InternalFoo.g:4511:3: ruleComponentInstance
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
    // InternalFoo.g:4520:1: rule__Assembly__AttributesAssignment_6 : ( ruleComponentInstance ) ;
    public final void rule__Assembly__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4524:1: ( ( ruleComponentInstance ) )
            // InternalFoo.g:4525:2: ( ruleComponentInstance )
            {
            // InternalFoo.g:4525:2: ( ruleComponentInstance )
            // InternalFoo.g:4526:3: ruleComponentInstance
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
    // InternalFoo.g:4535:1: rule__Assembly__BindingsAssignment_8 : ( ruleBinding ) ;
    public final void rule__Assembly__BindingsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4539:1: ( ( ruleBinding ) )
            // InternalFoo.g:4540:2: ( ruleBinding )
            {
            // InternalFoo.g:4540:2: ( ruleBinding )
            // InternalFoo.g:4541:3: ruleBinding
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
    // InternalFoo.g:4550:1: rule__ComponentInstance__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ComponentInstance__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4554:1: ( ( RULE_ID ) )
            // InternalFoo.g:4555:2: ( RULE_ID )
            {
            // InternalFoo.g:4555:2: ( RULE_ID )
            // InternalFoo.g:4556:3: RULE_ID
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
    // InternalFoo.g:4565:1: rule__ComponentInstance__ComponentAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComponentInstance__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4569:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:4570:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:4570:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:4571:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentComponentCrossReference_2_0()); 
            // InternalFoo.g:4572:3: ( ruleQualifiedName )
            // InternalFoo.g:4573:4: ruleQualifiedName
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
    // InternalFoo.g:4584:1: rule__Binding__BindingRequiredAssignment_0 : ( ruleBindingRequired ) ;
    public final void rule__Binding__BindingRequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4588:1: ( ( ruleBindingRequired ) )
            // InternalFoo.g:4589:2: ( ruleBindingRequired )
            {
            // InternalFoo.g:4589:2: ( ruleBindingRequired )
            // InternalFoo.g:4590:3: ruleBindingRequired
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
    // InternalFoo.g:4599:1: rule__Binding__BindingProvidedAssignment_2 : ( ruleBindingProvided ) ;
    public final void rule__Binding__BindingProvidedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4603:1: ( ( ruleBindingProvided ) )
            // InternalFoo.g:4604:2: ( ruleBindingProvided )
            {
            // InternalFoo.g:4604:2: ( ruleBindingProvided )
            // InternalFoo.g:4605:3: ruleBindingProvided
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
    // InternalFoo.g:4614:1: rule__BindingRequired__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BindingRequired__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4618:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:4619:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:4619:2: ( ( RULE_ID ) )
            // InternalFoo.g:4620:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingRequiredAccess().getNameComponentInstanceCrossReference_0_0()); 
            // InternalFoo.g:4621:3: ( RULE_ID )
            // InternalFoo.g:4622:4: RULE_ID
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
    // InternalFoo.g:4633:1: rule__BindingRequired__ServiceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingRequired__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4637:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:4638:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:4638:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:4639:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBindingRequiredAccess().getServiceRSignatureCrossReference_2_0()); 
            // InternalFoo.g:4640:3: ( ruleQualifiedName )
            // InternalFoo.g:4641:4: ruleQualifiedName
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
    // InternalFoo.g:4652:1: rule__BindingProvided__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BindingProvided__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4656:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:4657:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:4657:2: ( ( RULE_ID ) )
            // InternalFoo.g:4658:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingProvidedAccess().getNameComponentInstanceCrossReference_0_0()); 
            // InternalFoo.g:4659:3: ( RULE_ID )
            // InternalFoo.g:4660:4: RULE_ID
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
    // InternalFoo.g:4671:1: rule__BindingProvided__ServiceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingProvided__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4675:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:4676:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:4676:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:4677:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBindingProvidedAccess().getServicePSignatureCrossReference_2_0()); 
            // InternalFoo.g:4678:3: ( ruleQualifiedName )
            // InternalFoo.g:4679:4: ruleQualifiedName
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
    // InternalFoo.g:4690:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4694:1: ( ( RULE_ID ) )
            // InternalFoo.g:4695:2: ( RULE_ID )
            {
            // InternalFoo.g:4695:2: ( RULE_ID )
            // InternalFoo.g:4696:3: RULE_ID
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
    // InternalFoo.g:4705:1: rule__Component__RefinedComponentAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Component__RefinedComponentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4709:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:4710:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:4710:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:4711:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentAccess().getRefinedComponentComponentCrossReference_2_1_0()); 
            // InternalFoo.g:4712:3: ( ruleQualifiedName )
            // InternalFoo.g:4713:4: ruleQualifiedName
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
    // InternalFoo.g:4724:1: rule__Component__ListOfPServicesAssignment_4 : ( ruleListOfProvidedServices ) ;
    public final void rule__Component__ListOfPServicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4728:1: ( ( ruleListOfProvidedServices ) )
            // InternalFoo.g:4729:2: ( ruleListOfProvidedServices )
            {
            // InternalFoo.g:4729:2: ( ruleListOfProvidedServices )
            // InternalFoo.g:4730:3: ruleListOfProvidedServices
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
    // InternalFoo.g:4739:1: rule__Component__ListOfRServicesAssignment_5 : ( ruleListOfrequiredServices ) ;
    public final void rule__Component__ListOfRServicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4743:1: ( ( ruleListOfrequiredServices ) )
            // InternalFoo.g:4744:2: ( ruleListOfrequiredServices )
            {
            // InternalFoo.g:4744:2: ( ruleListOfrequiredServices )
            // InternalFoo.g:4745:3: ruleListOfrequiredServices
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
    // InternalFoo.g:4754:1: rule__Component__MProvServicesAssignment_6 : ( ruleMProvidedService ) ;
    public final void rule__Component__MProvServicesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4758:1: ( ( ruleMProvidedService ) )
            // InternalFoo.g:4759:2: ( ruleMProvidedService )
            {
            // InternalFoo.g:4759:2: ( ruleMProvidedService )
            // InternalFoo.g:4760:3: ruleMProvidedService
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
    // InternalFoo.g:4769:1: rule__Component__MReqServicesAssignment_7 : ( ruleMRequiredService ) ;
    public final void rule__Component__MReqServicesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4773:1: ( ( ruleMRequiredService ) )
            // InternalFoo.g:4774:2: ( ruleMRequiredService )
            {
            // InternalFoo.g:4774:2: ( ruleMRequiredService )
            // InternalFoo.g:4775:3: ruleMRequiredService
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
    // InternalFoo.g:4784:1: rule__Component__AssembliesAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Component__AssembliesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4788:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:4789:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:4789:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:4790:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentAccess().getAssembliesAssemblyCrossReference_8_1_0()); 
            // InternalFoo.g:4791:3: ( ruleQualifiedName )
            // InternalFoo.g:4792:4: ruleQualifiedName
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
    // InternalFoo.g:4803:1: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 : ( ruleProvidedService ) ;
    public final void rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4807:1: ( ( ruleProvidedService ) )
            // InternalFoo.g:4808:2: ( ruleProvidedService )
            {
            // InternalFoo.g:4808:2: ( ruleProvidedService )
            // InternalFoo.g:4809:3: ruleProvidedService
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
    // InternalFoo.g:4818:1: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 : ( ruleProvidedService ) ;
    public final void rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4822:1: ( ( ruleProvidedService ) )
            // InternalFoo.g:4823:2: ( ruleProvidedService )
            {
            // InternalFoo.g:4823:2: ( ruleProvidedService )
            // InternalFoo.g:4824:3: ruleProvidedService
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
    // InternalFoo.g:4833:1: rule__ProvidedService__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ProvidedService__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4837:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:4838:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:4838:2: ( ( RULE_ID ) )
            // InternalFoo.g:4839:3: ( RULE_ID )
            {
             before(grammarAccess.getProvidedServiceAccess().getNamePSignatureCrossReference_0()); 
            // InternalFoo.g:4840:3: ( RULE_ID )
            // InternalFoo.g:4841:4: RULE_ID
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
    // InternalFoo.g:4852:1: rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 : ( ruleRequiredService ) ;
    public final void rule__ListOfrequiredServices__RequiredServicesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4856:1: ( ( ruleRequiredService ) )
            // InternalFoo.g:4857:2: ( ruleRequiredService )
            {
            // InternalFoo.g:4857:2: ( ruleRequiredService )
            // InternalFoo.g:4858:3: ruleRequiredService
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
    // InternalFoo.g:4867:1: rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 : ( ruleRequiredService ) ;
    public final void rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4871:1: ( ( ruleRequiredService ) )
            // InternalFoo.g:4872:2: ( ruleRequiredService )
            {
            // InternalFoo.g:4872:2: ( ruleRequiredService )
            // InternalFoo.g:4873:3: ruleRequiredService
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
    // InternalFoo.g:4882:1: rule__RequiredService__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RequiredService__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4886:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:4887:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:4887:2: ( ( RULE_ID ) )
            // InternalFoo.g:4888:3: ( RULE_ID )
            {
             before(grammarAccess.getRequiredServiceAccess().getNameRSignatureCrossReference_0()); 
            // InternalFoo.g:4889:3: ( RULE_ID )
            // InternalFoo.g:4890:4: RULE_ID
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
    // InternalFoo.g:4901:1: rule__MProvidedService__SignatureAssignment_2 : ( rulePSignature ) ;
    public final void rule__MProvidedService__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4905:1: ( ( rulePSignature ) )
            // InternalFoo.g:4906:2: ( rulePSignature )
            {
            // InternalFoo.g:4906:2: ( rulePSignature )
            // InternalFoo.g:4907:3: rulePSignature
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


    // $ANTLR start "rule__MProvidedService__ExpressionsAssignment_4"
    // InternalFoo.g:4916:1: rule__MProvidedService__ExpressionsAssignment_4 : ( ruleExpression ) ;
    public final void rule__MProvidedService__ExpressionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4920:1: ( ( ruleExpression ) )
            // InternalFoo.g:4921:2: ( ruleExpression )
            {
            // InternalFoo.g:4921:2: ( ruleExpression )
            // InternalFoo.g:4922:3: ruleExpression
            {
             before(grammarAccess.getMProvidedServiceAccess().getExpressionsExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMProvidedServiceAccess().getExpressionsExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MProvidedService__ExpressionsAssignment_4"


    // $ANTLR start "rule__If__ConditionsAssignment_2_0"
    // InternalFoo.g:4931:1: rule__If__ConditionsAssignment_2_0 : ( ruleCondition ) ;
    public final void rule__If__ConditionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4935:1: ( ( ruleCondition ) )
            // InternalFoo.g:4936:2: ( ruleCondition )
            {
            // InternalFoo.g:4936:2: ( ruleCondition )
            // InternalFoo.g:4937:3: ruleCondition
            {
             before(grammarAccess.getIfAccess().getConditionsConditionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getIfAccess().getConditionsConditionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ConditionsAssignment_2_0"


    // $ANTLR start "rule__If__ConditionsAssignment_3"
    // InternalFoo.g:4946:1: rule__If__ConditionsAssignment_3 : ( ruleCondition ) ;
    public final void rule__If__ConditionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4950:1: ( ( ruleCondition ) )
            // InternalFoo.g:4951:2: ( ruleCondition )
            {
            // InternalFoo.g:4951:2: ( ruleCondition )
            // InternalFoo.g:4952:3: ruleCondition
            {
             before(grammarAccess.getIfAccess().getConditionsConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getIfAccess().getConditionsConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ConditionsAssignment_3"


    // $ANTLR start "rule__If__ExpressionsAssignment_6"
    // InternalFoo.g:4961:1: rule__If__ExpressionsAssignment_6 : ( ruleExpression ) ;
    public final void rule__If__ExpressionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4965:1: ( ( ruleExpression ) )
            // InternalFoo.g:4966:2: ( ruleExpression )
            {
            // InternalFoo.g:4966:2: ( ruleExpression )
            // InternalFoo.g:4967:3: ruleExpression
            {
             before(grammarAccess.getIfAccess().getExpressionsExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfAccess().getExpressionsExpressionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ExpressionsAssignment_6"


    // $ANTLR start "rule__If__ElseAssignment_8_1_0"
    // InternalFoo.g:4976:1: rule__If__ElseAssignment_8_1_0 : ( ruleIf ) ;
    public final void rule__If__ElseAssignment_8_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4980:1: ( ( ruleIf ) )
            // InternalFoo.g:4981:2: ( ruleIf )
            {
            // InternalFoo.g:4981:2: ( ruleIf )
            // InternalFoo.g:4982:3: ruleIf
            {
             before(grammarAccess.getIfAccess().getElseIfParserRuleCall_8_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getIfAccess().getElseIfParserRuleCall_8_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ElseAssignment_8_1_0"


    // $ANTLR start "rule__If__ExpressionAssignment_8_1_1_1"
    // InternalFoo.g:4991:1: rule__If__ExpressionAssignment_8_1_1_1 : ( ruleExpression ) ;
    public final void rule__If__ExpressionAssignment_8_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4995:1: ( ( ruleExpression ) )
            // InternalFoo.g:4996:2: ( ruleExpression )
            {
            // InternalFoo.g:4996:2: ( ruleExpression )
            // InternalFoo.g:4997:3: ruleExpression
            {
             before(grammarAccess.getIfAccess().getExpressionExpressionParserRuleCall_8_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfAccess().getExpressionExpressionParserRuleCall_8_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ExpressionAssignment_8_1_1_1"


    // $ANTLR start "rule__While__ConditionsAssignment_2_0"
    // InternalFoo.g:5006:1: rule__While__ConditionsAssignment_2_0 : ( ruleCondition ) ;
    public final void rule__While__ConditionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5010:1: ( ( ruleCondition ) )
            // InternalFoo.g:5011:2: ( ruleCondition )
            {
            // InternalFoo.g:5011:2: ( ruleCondition )
            // InternalFoo.g:5012:3: ruleCondition
            {
             before(grammarAccess.getWhileAccess().getConditionsConditionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getConditionsConditionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__ConditionsAssignment_2_0"


    // $ANTLR start "rule__While__ConditionsAssignment_3"
    // InternalFoo.g:5021:1: rule__While__ConditionsAssignment_3 : ( ruleCondition ) ;
    public final void rule__While__ConditionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5025:1: ( ( ruleCondition ) )
            // InternalFoo.g:5026:2: ( ruleCondition )
            {
            // InternalFoo.g:5026:2: ( ruleCondition )
            // InternalFoo.g:5027:3: ruleCondition
            {
             before(grammarAccess.getWhileAccess().getConditionsConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getConditionsConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__ConditionsAssignment_3"


    // $ANTLR start "rule__While__ExpressionsAssignment_6"
    // InternalFoo.g:5036:1: rule__While__ExpressionsAssignment_6 : ( ruleExpression ) ;
    public final void rule__While__ExpressionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5040:1: ( ( ruleExpression ) )
            // InternalFoo.g:5041:2: ( ruleExpression )
            {
            // InternalFoo.g:5041:2: ( ruleExpression )
            // InternalFoo.g:5042:3: ruleExpression
            {
             before(grammarAccess.getWhileAccess().getExpressionsExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getExpressionsExpressionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__ExpressionsAssignment_6"


    // $ANTLR start "rule__PSignature__TypeAssignment_0"
    // InternalFoo.g:5051:1: rule__PSignature__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__PSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5055:1: ( ( RULE_ID ) )
            // InternalFoo.g:5056:2: ( RULE_ID )
            {
            // InternalFoo.g:5056:2: ( RULE_ID )
            // InternalFoo.g:5057:3: RULE_ID
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
    // InternalFoo.g:5066:1: rule__PSignature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PSignature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5070:1: ( ( RULE_ID ) )
            // InternalFoo.g:5071:2: ( RULE_ID )
            {
            // InternalFoo.g:5071:2: ( RULE_ID )
            // InternalFoo.g:5072:3: RULE_ID
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
    // InternalFoo.g:5081:1: rule__PSignature__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__PSignature__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5085:1: ( ( ruleParameter ) )
            // InternalFoo.g:5086:2: ( ruleParameter )
            {
            // InternalFoo.g:5086:2: ( ruleParameter )
            // InternalFoo.g:5087:3: ruleParameter
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
    // InternalFoo.g:5096:1: rule__PSignature__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__PSignature__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5100:1: ( ( ruleParameter ) )
            // InternalFoo.g:5101:2: ( ruleParameter )
            {
            // InternalFoo.g:5101:2: ( ruleParameter )
            // InternalFoo.g:5102:3: ruleParameter
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
    // InternalFoo.g:5111:1: rule__MRequiredService__SignatureAssignment_2 : ( ruleRSignature ) ;
    public final void rule__MRequiredService__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5115:1: ( ( ruleRSignature ) )
            // InternalFoo.g:5116:2: ( ruleRSignature )
            {
            // InternalFoo.g:5116:2: ( ruleRSignature )
            // InternalFoo.g:5117:3: ruleRSignature
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
    // InternalFoo.g:5126:1: rule__RSignature__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__RSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5130:1: ( ( RULE_ID ) )
            // InternalFoo.g:5131:2: ( RULE_ID )
            {
            // InternalFoo.g:5131:2: ( RULE_ID )
            // InternalFoo.g:5132:3: RULE_ID
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
    // InternalFoo.g:5141:1: rule__RSignature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RSignature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5145:1: ( ( RULE_ID ) )
            // InternalFoo.g:5146:2: ( RULE_ID )
            {
            // InternalFoo.g:5146:2: ( RULE_ID )
            // InternalFoo.g:5147:3: RULE_ID
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
    // InternalFoo.g:5156:1: rule__RSignature__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__RSignature__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5160:1: ( ( ruleParameter ) )
            // InternalFoo.g:5161:2: ( ruleParameter )
            {
            // InternalFoo.g:5161:2: ( ruleParameter )
            // InternalFoo.g:5162:3: ruleParameter
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
    // InternalFoo.g:5171:1: rule__RSignature__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__RSignature__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5175:1: ( ( ruleParameter ) )
            // InternalFoo.g:5176:2: ( ruleParameter )
            {
            // InternalFoo.g:5176:2: ( ruleParameter )
            // InternalFoo.g:5177:3: ruleParameter
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
    // InternalFoo.g:5186:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5190:1: ( ( RULE_ID ) )
            // InternalFoo.g:5191:2: ( RULE_ID )
            {
            // InternalFoo.g:5191:2: ( RULE_ID )
            // InternalFoo.g:5192:3: RULE_ID
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
    // InternalFoo.g:5201:1: rule__Parameter__TypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5205:1: ( ( RULE_ID ) )
            // InternalFoo.g:5206:2: ( RULE_ID )
            {
            // InternalFoo.g:5206:2: ( RULE_ID )
            // InternalFoo.g:5207:3: RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000042A0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000210020010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000014400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000014400000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000006000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000006002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001080000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});

}