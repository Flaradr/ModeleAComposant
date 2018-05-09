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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'static'", "'extension'", "'.*'", "'Assembly'", "'components'", "'bindings'", "':'", "'-'", "'->'", "'Component'", "'provided'", "'='", "','", "'requiered'", "'service'", "'('", "')'", "';'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
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
    // InternalFoo.g:62:1: ruleDomainModel : ( ( rule__DomainModel__ModelsAssignment )* ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:66:2: ( ( ( rule__DomainModel__ModelsAssignment )* ) )
            // InternalFoo.g:67:2: ( ( rule__DomainModel__ModelsAssignment )* )
            {
            // InternalFoo.g:67:2: ( ( rule__DomainModel__ModelsAssignment )* )
            // InternalFoo.g:68:3: ( rule__DomainModel__ModelsAssignment )*
            {
             before(grammarAccess.getDomainModelAccess().getModelsAssignment()); 
            // InternalFoo.g:69:3: ( rule__DomainModel__ModelsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFoo.g:69:4: rule__DomainModel__ModelsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DomainModel__ModelsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getModelsAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleFqnWithWildCard"
    // InternalFoo.g:153:1: entryRuleFqnWithWildCard : ruleFqnWithWildCard EOF ;
    public final void entryRuleFqnWithWildCard() throws RecognitionException {
        try {
            // InternalFoo.g:154:1: ( ruleFqnWithWildCard EOF )
            // InternalFoo.g:155:1: ruleFqnWithWildCard EOF
            {
             before(grammarAccess.getFqnWithWildCardRule()); 
            pushFollow(FOLLOW_1);
            ruleFqnWithWildCard();

            state._fsp--;

             after(grammarAccess.getFqnWithWildCardRule()); 
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
    // $ANTLR end "entryRuleFqnWithWildCard"


    // $ANTLR start "ruleFqnWithWildCard"
    // InternalFoo.g:162:1: ruleFqnWithWildCard : ( ( rule__FqnWithWildCard__Group__0 ) ) ;
    public final void ruleFqnWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:166:2: ( ( ( rule__FqnWithWildCard__Group__0 ) ) )
            // InternalFoo.g:167:2: ( ( rule__FqnWithWildCard__Group__0 ) )
            {
            // InternalFoo.g:167:2: ( ( rule__FqnWithWildCard__Group__0 ) )
            // InternalFoo.g:168:3: ( rule__FqnWithWildCard__Group__0 )
            {
             before(grammarAccess.getFqnWithWildCardAccess().getGroup()); 
            // InternalFoo.g:169:3: ( rule__FqnWithWildCard__Group__0 )
            // InternalFoo.g:169:4: rule__FqnWithWildCard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FqnWithWildCard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFqnWithWildCardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFqnWithWildCard"


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


    // $ANTLR start "entryRuleComponentAttribute"
    // InternalFoo.g:203:1: entryRuleComponentAttribute : ruleComponentAttribute EOF ;
    public final void entryRuleComponentAttribute() throws RecognitionException {
        try {
            // InternalFoo.g:204:1: ( ruleComponentAttribute EOF )
            // InternalFoo.g:205:1: ruleComponentAttribute EOF
            {
             before(grammarAccess.getComponentAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentAttribute();

            state._fsp--;

             after(grammarAccess.getComponentAttributeRule()); 
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
    // $ANTLR end "entryRuleComponentAttribute"


    // $ANTLR start "ruleComponentAttribute"
    // InternalFoo.g:212:1: ruleComponentAttribute : ( ( rule__ComponentAttribute__Group__0 ) ) ;
    public final void ruleComponentAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:216:2: ( ( ( rule__ComponentAttribute__Group__0 ) ) )
            // InternalFoo.g:217:2: ( ( rule__ComponentAttribute__Group__0 ) )
            {
            // InternalFoo.g:217:2: ( ( rule__ComponentAttribute__Group__0 ) )
            // InternalFoo.g:218:3: ( rule__ComponentAttribute__Group__0 )
            {
             before(grammarAccess.getComponentAttributeAccess().getGroup()); 
            // InternalFoo.g:219:3: ( rule__ComponentAttribute__Group__0 )
            // InternalFoo.g:219:4: rule__ComponentAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentAttribute"


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


    // $ANTLR start "entryRuleBindingRequiered"
    // InternalFoo.g:253:1: entryRuleBindingRequiered : ruleBindingRequiered EOF ;
    public final void entryRuleBindingRequiered() throws RecognitionException {
        try {
            // InternalFoo.g:254:1: ( ruleBindingRequiered EOF )
            // InternalFoo.g:255:1: ruleBindingRequiered EOF
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
    // InternalFoo.g:262:1: ruleBindingRequiered : ( ( rule__BindingRequiered__Group__0 ) ) ;
    public final void ruleBindingRequiered() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:266:2: ( ( ( rule__BindingRequiered__Group__0 ) ) )
            // InternalFoo.g:267:2: ( ( rule__BindingRequiered__Group__0 ) )
            {
            // InternalFoo.g:267:2: ( ( rule__BindingRequiered__Group__0 ) )
            // InternalFoo.g:268:3: ( rule__BindingRequiered__Group__0 )
            {
             before(grammarAccess.getBindingRequieredAccess().getGroup()); 
            // InternalFoo.g:269:3: ( rule__BindingRequiered__Group__0 )
            // InternalFoo.g:269:4: rule__BindingRequiered__Group__0
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


    // $ANTLR start "entryRuleProvided"
    // InternalFoo.g:328:1: entryRuleProvided : ruleProvided EOF ;
    public final void entryRuleProvided() throws RecognitionException {
        try {
            // InternalFoo.g:329:1: ( ruleProvided EOF )
            // InternalFoo.g:330:1: ruleProvided EOF
            {
             before(grammarAccess.getProvidedRule()); 
            pushFollow(FOLLOW_1);
            ruleProvided();

            state._fsp--;

             after(grammarAccess.getProvidedRule()); 
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
    // $ANTLR end "entryRuleProvided"


    // $ANTLR start "ruleProvided"
    // InternalFoo.g:337:1: ruleProvided : ( ( rule__Provided__Group__0 ) ) ;
    public final void ruleProvided() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:341:2: ( ( ( rule__Provided__Group__0 ) ) )
            // InternalFoo.g:342:2: ( ( rule__Provided__Group__0 ) )
            {
            // InternalFoo.g:342:2: ( ( rule__Provided__Group__0 ) )
            // InternalFoo.g:343:3: ( rule__Provided__Group__0 )
            {
             before(grammarAccess.getProvidedAccess().getGroup()); 
            // InternalFoo.g:344:3: ( rule__Provided__Group__0 )
            // InternalFoo.g:344:4: rule__Provided__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Provided__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProvidedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProvided"


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


    // $ANTLR start "entryRuleRequiered"
    // InternalFoo.g:378:1: entryRuleRequiered : ruleRequiered EOF ;
    public final void entryRuleRequiered() throws RecognitionException {
        try {
            // InternalFoo.g:379:1: ( ruleRequiered EOF )
            // InternalFoo.g:380:1: ruleRequiered EOF
            {
             before(grammarAccess.getRequieredRule()); 
            pushFollow(FOLLOW_1);
            ruleRequiered();

            state._fsp--;

             after(grammarAccess.getRequieredRule()); 
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
    // $ANTLR end "entryRuleRequiered"


    // $ANTLR start "ruleRequiered"
    // InternalFoo.g:387:1: ruleRequiered : ( ( rule__Requiered__Group__0 ) ) ;
    public final void ruleRequiered() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:391:2: ( ( ( rule__Requiered__Group__0 ) ) )
            // InternalFoo.g:392:2: ( ( rule__Requiered__Group__0 ) )
            {
            // InternalFoo.g:392:2: ( ( rule__Requiered__Group__0 ) )
            // InternalFoo.g:393:3: ( rule__Requiered__Group__0 )
            {
             before(grammarAccess.getRequieredAccess().getGroup()); 
            // InternalFoo.g:394:3: ( rule__Requiered__Group__0 )
            // InternalFoo.g:394:4: rule__Requiered__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Requiered__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequieredAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequiered"


    // $ANTLR start "entryRuleRequieredService"
    // InternalFoo.g:403:1: entryRuleRequieredService : ruleRequieredService EOF ;
    public final void entryRuleRequieredService() throws RecognitionException {
        try {
            // InternalFoo.g:404:1: ( ruleRequieredService EOF )
            // InternalFoo.g:405:1: ruleRequieredService EOF
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
    // InternalFoo.g:412:1: ruleRequieredService : ( ( rule__RequieredService__NameAssignment ) ) ;
    public final void ruleRequieredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:416:2: ( ( ( rule__RequieredService__NameAssignment ) ) )
            // InternalFoo.g:417:2: ( ( rule__RequieredService__NameAssignment ) )
            {
            // InternalFoo.g:417:2: ( ( rule__RequieredService__NameAssignment ) )
            // InternalFoo.g:418:3: ( rule__RequieredService__NameAssignment )
            {
             before(grammarAccess.getRequieredServiceAccess().getNameAssignment()); 
            // InternalFoo.g:419:3: ( rule__RequieredService__NameAssignment )
            // InternalFoo.g:419:4: rule__RequieredService__NameAssignment
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


    // $ANTLR start "entryRuleMRequieredService"
    // InternalFoo.g:478:1: entryRuleMRequieredService : ruleMRequieredService EOF ;
    public final void entryRuleMRequieredService() throws RecognitionException {
        try {
            // InternalFoo.g:479:1: ( ruleMRequieredService EOF )
            // InternalFoo.g:480:1: ruleMRequieredService EOF
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
    // InternalFoo.g:487:1: ruleMRequieredService : ( ( rule__MRequieredService__Group__0 ) ) ;
    public final void ruleMRequieredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:491:2: ( ( ( rule__MRequieredService__Group__0 ) ) )
            // InternalFoo.g:492:2: ( ( rule__MRequieredService__Group__0 ) )
            {
            // InternalFoo.g:492:2: ( ( rule__MRequieredService__Group__0 ) )
            // InternalFoo.g:493:3: ( rule__MRequieredService__Group__0 )
            {
             before(grammarAccess.getMRequieredServiceAccess().getGroup()); 
            // InternalFoo.g:494:3: ( rule__MRequieredService__Group__0 )
            // InternalFoo.g:494:4: rule__MRequieredService__Group__0
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


    // $ANTLR start "entryRuleAttribute"
    // InternalFoo.g:528:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalFoo.g:529:1: ( ruleAttribute EOF )
            // InternalFoo.g:530:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalFoo.g:537:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:541:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalFoo.g:542:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalFoo.g:542:2: ( ( rule__Attribute__Group__0 ) )
            // InternalFoo.g:543:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalFoo.g:544:3: ( rule__Attribute__Group__0 )
            // InternalFoo.g:544:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "rule__Model__Group__0"
    // InternalFoo.g:552:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:556:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFoo.g:557:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
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
            pushFollow(FOLLOW_5);
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
            pushFollow(FOLLOW_6);
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
            pushFollow(FOLLOW_6);
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
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFoo.g:652:3: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
            pushFollow(FOLLOW_6);
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
    // InternalFoo.g:672:1: rule__Model__Group__4__Impl : ( ( rule__Model__ComponentAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:676:1: ( ( ( rule__Model__ComponentAssignment_4 )* ) )
            // InternalFoo.g:677:1: ( ( rule__Model__ComponentAssignment_4 )* )
            {
            // InternalFoo.g:677:1: ( ( rule__Model__ComponentAssignment_4 )* )
            // InternalFoo.g:678:2: ( rule__Model__ComponentAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getComponentAssignment_4()); 
            // InternalFoo.g:679:2: ( rule__Model__ComponentAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFoo.g:679:3: rule__Model__ComponentAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__ComponentAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getComponentAssignment_4()); 

            }


            }

        }
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
            pushFollow(FOLLOW_6);
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
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFoo.g:706:3: rule__Model__AssemblyAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__AssemblyAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
            pushFollow(FOLLOW_10);
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
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFoo.g:786:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
            pushFollow(FOLLOW_4);
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
            pushFollow(FOLLOW_12);
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
    // InternalFoo.g:876:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:880:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalFoo.g:881:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
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
    // InternalFoo.g:888:1: rule__Import__Group__1__Impl : ( 'static' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:892:1: ( ( 'static' ) )
            // InternalFoo.g:893:1: ( 'static' )
            {
            // InternalFoo.g:893:1: ( 'static' )
            // InternalFoo.g:894:2: 'static'
            {
             before(grammarAccess.getImportAccess().getStaticKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getStaticKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Import__Group__2"
    // InternalFoo.g:903:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:907:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalFoo.g:908:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalFoo.g:915:1: rule__Import__Group__2__Impl : ( 'extension' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:919:1: ( ( 'extension' ) )
            // InternalFoo.g:920:1: ( 'extension' )
            {
            // InternalFoo.g:920:1: ( 'extension' )
            // InternalFoo.g:921:2: 'extension'
            {
             before(grammarAccess.getImportAccess().getExtensionKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getExtensionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__3"
    // InternalFoo.g:930:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:934:1: ( rule__Import__Group__3__Impl )
            // InternalFoo.g:935:2: rule__Import__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3"


    // $ANTLR start "rule__Import__Group__3__Impl"
    // InternalFoo.g:941:1: rule__Import__Group__3__Impl : ( ( rule__Import__ImportedNamespaceAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:945:1: ( ( ( rule__Import__ImportedNamespaceAssignment_3 ) ) )
            // InternalFoo.g:946:1: ( ( rule__Import__ImportedNamespaceAssignment_3 ) )
            {
            // InternalFoo.g:946:1: ( ( rule__Import__ImportedNamespaceAssignment_3 ) )
            // InternalFoo.g:947:2: ( rule__Import__ImportedNamespaceAssignment_3 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_3()); 
            // InternalFoo.g:948:2: ( rule__Import__ImportedNamespaceAssignment_3 )
            // InternalFoo.g:948:3: rule__Import__ImportedNamespaceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3__Impl"


    // $ANTLR start "rule__FqnWithWildCard__Group__0"
    // InternalFoo.g:957:1: rule__FqnWithWildCard__Group__0 : rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 ;
    public final void rule__FqnWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:961:1: ( rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 )
            // InternalFoo.g:962:2: rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FqnWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FqnWithWildCard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FqnWithWildCard__Group__0"


    // $ANTLR start "rule__FqnWithWildCard__Group__0__Impl"
    // InternalFoo.g:969:1: rule__FqnWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__FqnWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:973:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:974:1: ( ruleQualifiedName )
            {
            // InternalFoo.g:974:1: ( ruleQualifiedName )
            // InternalFoo.g:975:2: ruleQualifiedName
            {
             before(grammarAccess.getFqnWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFqnWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FqnWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__FqnWithWildCard__Group__1"
    // InternalFoo.g:984:1: rule__FqnWithWildCard__Group__1 : rule__FqnWithWildCard__Group__1__Impl ;
    public final void rule__FqnWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:988:1: ( rule__FqnWithWildCard__Group__1__Impl )
            // InternalFoo.g:989:2: rule__FqnWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FqnWithWildCard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FqnWithWildCard__Group__1"


    // $ANTLR start "rule__FqnWithWildCard__Group__1__Impl"
    // InternalFoo.g:995:1: rule__FqnWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FqnWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:999:1: ( ( ( '.*' )? ) )
            // InternalFoo.g:1000:1: ( ( '.*' )? )
            {
            // InternalFoo.g:1000:1: ( ( '.*' )? )
            // InternalFoo.g:1001:2: ( '.*' )?
            {
             before(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalFoo.g:1002:2: ( '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFoo.g:1002:3: '.*'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FqnWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__Assembly__Group__0"
    // InternalFoo.g:1011:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1015:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // InternalFoo.g:1016:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalFoo.g:1023:1: rule__Assembly__Group__0__Impl : ( () ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1027:1: ( ( () ) )
            // InternalFoo.g:1028:1: ( () )
            {
            // InternalFoo.g:1028:1: ( () )
            // InternalFoo.g:1029:2: ()
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyAction_0()); 
            // InternalFoo.g:1030:2: ()
            // InternalFoo.g:1030:3: 
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
    // InternalFoo.g:1038:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1042:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // InternalFoo.g:1043:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:1050:1: rule__Assembly__Group__1__Impl : ( 'Assembly' ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1054:1: ( ( 'Assembly' ) )
            // InternalFoo.g:1055:1: ( 'Assembly' )
            {
            // InternalFoo.g:1055:1: ( 'Assembly' )
            // InternalFoo.g:1056:2: 'Assembly'
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalFoo.g:1065:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1069:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // InternalFoo.g:1070:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalFoo.g:1077:1: rule__Assembly__Group__2__Impl : ( ( rule__Assembly__NameAssignment_2 ) ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1081:1: ( ( ( rule__Assembly__NameAssignment_2 ) ) )
            // InternalFoo.g:1082:1: ( ( rule__Assembly__NameAssignment_2 ) )
            {
            // InternalFoo.g:1082:1: ( ( rule__Assembly__NameAssignment_2 ) )
            // InternalFoo.g:1083:2: ( rule__Assembly__NameAssignment_2 )
            {
             before(grammarAccess.getAssemblyAccess().getNameAssignment_2()); 
            // InternalFoo.g:1084:2: ( rule__Assembly__NameAssignment_2 )
            // InternalFoo.g:1084:3: rule__Assembly__NameAssignment_2
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
    // InternalFoo.g:1092:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1096:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // InternalFoo.g:1097:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalFoo.g:1104:1: rule__Assembly__Group__3__Impl : ( '{' ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1108:1: ( ( '{' ) )
            // InternalFoo.g:1109:1: ( '{' )
            {
            // InternalFoo.g:1109:1: ( '{' )
            // InternalFoo.g:1110:2: '{'
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
    // InternalFoo.g:1119:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl rule__Assembly__Group__5 ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1123:1: ( rule__Assembly__Group__4__Impl rule__Assembly__Group__5 )
            // InternalFoo.g:1124:2: rule__Assembly__Group__4__Impl rule__Assembly__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:1131:1: rule__Assembly__Group__4__Impl : ( 'components' ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1135:1: ( ( 'components' ) )
            // InternalFoo.g:1136:1: ( 'components' )
            {
            // InternalFoo.g:1136:1: ( 'components' )
            // InternalFoo.g:1137:2: 'components'
            {
             before(grammarAccess.getAssemblyAccess().getComponentsKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalFoo.g:1146:1: rule__Assembly__Group__5 : rule__Assembly__Group__5__Impl rule__Assembly__Group__6 ;
    public final void rule__Assembly__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1150:1: ( rule__Assembly__Group__5__Impl rule__Assembly__Group__6 )
            // InternalFoo.g:1151:2: rule__Assembly__Group__5__Impl rule__Assembly__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:1158:1: rule__Assembly__Group__5__Impl : ( ( rule__Assembly__AttributesAssignment_5 ) ) ;
    public final void rule__Assembly__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1162:1: ( ( ( rule__Assembly__AttributesAssignment_5 ) ) )
            // InternalFoo.g:1163:1: ( ( rule__Assembly__AttributesAssignment_5 ) )
            {
            // InternalFoo.g:1163:1: ( ( rule__Assembly__AttributesAssignment_5 ) )
            // InternalFoo.g:1164:2: ( rule__Assembly__AttributesAssignment_5 )
            {
             before(grammarAccess.getAssemblyAccess().getAttributesAssignment_5()); 
            // InternalFoo.g:1165:2: ( rule__Assembly__AttributesAssignment_5 )
            // InternalFoo.g:1165:3: rule__Assembly__AttributesAssignment_5
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
    // InternalFoo.g:1173:1: rule__Assembly__Group__6 : rule__Assembly__Group__6__Impl rule__Assembly__Group__7 ;
    public final void rule__Assembly__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1177:1: ( rule__Assembly__Group__6__Impl rule__Assembly__Group__7 )
            // InternalFoo.g:1178:2: rule__Assembly__Group__6__Impl rule__Assembly__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalFoo.g:1185:1: rule__Assembly__Group__6__Impl : ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) ) ;
    public final void rule__Assembly__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1189:1: ( ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) ) )
            // InternalFoo.g:1190:1: ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) )
            {
            // InternalFoo.g:1190:1: ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) )
            // InternalFoo.g:1191:2: ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* )
            {
            // InternalFoo.g:1191:2: ( ( rule__Assembly__AttributesAssignment_6 ) )
            // InternalFoo.g:1192:3: ( rule__Assembly__AttributesAssignment_6 )
            {
             before(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 
            // InternalFoo.g:1193:3: ( rule__Assembly__AttributesAssignment_6 )
            // InternalFoo.g:1193:4: rule__Assembly__AttributesAssignment_6
            {
            pushFollow(FOLLOW_18);
            rule__Assembly__AttributesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 

            }

            // InternalFoo.g:1196:2: ( ( rule__Assembly__AttributesAssignment_6 )* )
            // InternalFoo.g:1197:3: ( rule__Assembly__AttributesAssignment_6 )*
            {
             before(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 
            // InternalFoo.g:1198:3: ( rule__Assembly__AttributesAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFoo.g:1198:4: rule__Assembly__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Assembly__AttributesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalFoo.g:1207:1: rule__Assembly__Group__7 : rule__Assembly__Group__7__Impl rule__Assembly__Group__8 ;
    public final void rule__Assembly__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1211:1: ( rule__Assembly__Group__7__Impl rule__Assembly__Group__8 )
            // InternalFoo.g:1212:2: rule__Assembly__Group__7__Impl rule__Assembly__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalFoo.g:1219:1: rule__Assembly__Group__7__Impl : ( 'bindings' ) ;
    public final void rule__Assembly__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1223:1: ( ( 'bindings' ) )
            // InternalFoo.g:1224:1: ( 'bindings' )
            {
            // InternalFoo.g:1224:1: ( 'bindings' )
            // InternalFoo.g:1225:2: 'bindings'
            {
             before(grammarAccess.getAssemblyAccess().getBindingsKeyword_7()); 
            match(input,21,FOLLOW_2); 
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
    // InternalFoo.g:1234:1: rule__Assembly__Group__8 : rule__Assembly__Group__8__Impl rule__Assembly__Group__9 ;
    public final void rule__Assembly__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1238:1: ( rule__Assembly__Group__8__Impl rule__Assembly__Group__9 )
            // InternalFoo.g:1239:2: rule__Assembly__Group__8__Impl rule__Assembly__Group__9
            {
            pushFollow(FOLLOW_19);
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
    // InternalFoo.g:1246:1: rule__Assembly__Group__8__Impl : ( ( rule__Assembly__BindingsAssignment_8 )* ) ;
    public final void rule__Assembly__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1250:1: ( ( ( rule__Assembly__BindingsAssignment_8 )* ) )
            // InternalFoo.g:1251:1: ( ( rule__Assembly__BindingsAssignment_8 )* )
            {
            // InternalFoo.g:1251:1: ( ( rule__Assembly__BindingsAssignment_8 )* )
            // InternalFoo.g:1252:2: ( rule__Assembly__BindingsAssignment_8 )*
            {
             before(grammarAccess.getAssemblyAccess().getBindingsAssignment_8()); 
            // InternalFoo.g:1253:2: ( rule__Assembly__BindingsAssignment_8 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFoo.g:1253:3: rule__Assembly__BindingsAssignment_8
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Assembly__BindingsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalFoo.g:1261:1: rule__Assembly__Group__9 : rule__Assembly__Group__9__Impl ;
    public final void rule__Assembly__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1265:1: ( rule__Assembly__Group__9__Impl )
            // InternalFoo.g:1266:2: rule__Assembly__Group__9__Impl
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
    // InternalFoo.g:1272:1: rule__Assembly__Group__9__Impl : ( '}' ) ;
    public final void rule__Assembly__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1276:1: ( ( '}' ) )
            // InternalFoo.g:1277:1: ( '}' )
            {
            // InternalFoo.g:1277:1: ( '}' )
            // InternalFoo.g:1278:2: '}'
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


    // $ANTLR start "rule__ComponentAttribute__Group__0"
    // InternalFoo.g:1288:1: rule__ComponentAttribute__Group__0 : rule__ComponentAttribute__Group__0__Impl rule__ComponentAttribute__Group__1 ;
    public final void rule__ComponentAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1292:1: ( rule__ComponentAttribute__Group__0__Impl rule__ComponentAttribute__Group__1 )
            // InternalFoo.g:1293:2: rule__ComponentAttribute__Group__0__Impl rule__ComponentAttribute__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ComponentAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentAttribute__Group__0"


    // $ANTLR start "rule__ComponentAttribute__Group__0__Impl"
    // InternalFoo.g:1300:1: rule__ComponentAttribute__Group__0__Impl : ( ( rule__ComponentAttribute__NameAssignment_0 ) ) ;
    public final void rule__ComponentAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1304:1: ( ( ( rule__ComponentAttribute__NameAssignment_0 ) ) )
            // InternalFoo.g:1305:1: ( ( rule__ComponentAttribute__NameAssignment_0 ) )
            {
            // InternalFoo.g:1305:1: ( ( rule__ComponentAttribute__NameAssignment_0 ) )
            // InternalFoo.g:1306:2: ( rule__ComponentAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getComponentAttributeAccess().getNameAssignment_0()); 
            // InternalFoo.g:1307:2: ( rule__ComponentAttribute__NameAssignment_0 )
            // InternalFoo.g:1307:3: rule__ComponentAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentAttribute__Group__0__Impl"


    // $ANTLR start "rule__ComponentAttribute__Group__1"
    // InternalFoo.g:1315:1: rule__ComponentAttribute__Group__1 : rule__ComponentAttribute__Group__1__Impl rule__ComponentAttribute__Group__2 ;
    public final void rule__ComponentAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1319:1: ( rule__ComponentAttribute__Group__1__Impl rule__ComponentAttribute__Group__2 )
            // InternalFoo.g:1320:2: rule__ComponentAttribute__Group__1__Impl rule__ComponentAttribute__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComponentAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentAttribute__Group__1"


    // $ANTLR start "rule__ComponentAttribute__Group__1__Impl"
    // InternalFoo.g:1327:1: rule__ComponentAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__ComponentAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1331:1: ( ( ':' ) )
            // InternalFoo.g:1332:1: ( ':' )
            {
            // InternalFoo.g:1332:1: ( ':' )
            // InternalFoo.g:1333:2: ':'
            {
             before(grammarAccess.getComponentAttributeAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentAttribute__Group__1__Impl"


    // $ANTLR start "rule__ComponentAttribute__Group__2"
    // InternalFoo.g:1342:1: rule__ComponentAttribute__Group__2 : rule__ComponentAttribute__Group__2__Impl ;
    public final void rule__ComponentAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1346:1: ( rule__ComponentAttribute__Group__2__Impl )
            // InternalFoo.g:1347:2: rule__ComponentAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentAttribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentAttribute__Group__2"


    // $ANTLR start "rule__ComponentAttribute__Group__2__Impl"
    // InternalFoo.g:1353:1: rule__ComponentAttribute__Group__2__Impl : ( ( rule__ComponentAttribute__ComposantAssignment_2 ) ) ;
    public final void rule__ComponentAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1357:1: ( ( ( rule__ComponentAttribute__ComposantAssignment_2 ) ) )
            // InternalFoo.g:1358:1: ( ( rule__ComponentAttribute__ComposantAssignment_2 ) )
            {
            // InternalFoo.g:1358:1: ( ( rule__ComponentAttribute__ComposantAssignment_2 ) )
            // InternalFoo.g:1359:2: ( rule__ComponentAttribute__ComposantAssignment_2 )
            {
             before(grammarAccess.getComponentAttributeAccess().getComposantAssignment_2()); 
            // InternalFoo.g:1360:2: ( rule__ComponentAttribute__ComposantAssignment_2 )
            // InternalFoo.g:1360:3: rule__ComponentAttribute__ComposantAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentAttribute__ComposantAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAttributeAccess().getComposantAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentAttribute__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalFoo.g:1369:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1373:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalFoo.g:1374:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalFoo.g:1381:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__MGAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1385:1: ( ( ( rule__Binding__MGAssignment_0 ) ) )
            // InternalFoo.g:1386:1: ( ( rule__Binding__MGAssignment_0 ) )
            {
            // InternalFoo.g:1386:1: ( ( rule__Binding__MGAssignment_0 ) )
            // InternalFoo.g:1387:2: ( rule__Binding__MGAssignment_0 )
            {
             before(grammarAccess.getBindingAccess().getMGAssignment_0()); 
            // InternalFoo.g:1388:2: ( rule__Binding__MGAssignment_0 )
            // InternalFoo.g:1388:3: rule__Binding__MGAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__MGAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getMGAssignment_0()); 

            }


            }

        }
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
    // InternalFoo.g:1396:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1400:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalFoo.g:1401:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:1408:1: rule__Binding__Group__1__Impl : ( '-' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1412:1: ( ( '-' ) )
            // InternalFoo.g:1413:1: ( '-' )
            {
            // InternalFoo.g:1413:1: ( '-' )
            // InternalFoo.g:1414:2: '-'
            {
             before(grammarAccess.getBindingAccess().getHyphenMinusKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalFoo.g:1423:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1427:1: ( rule__Binding__Group__2__Impl )
            // InternalFoo.g:1428:2: rule__Binding__Group__2__Impl
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
    // InternalFoo.g:1434:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__MDAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1438:1: ( ( ( rule__Binding__MDAssignment_2 ) ) )
            // InternalFoo.g:1439:1: ( ( rule__Binding__MDAssignment_2 ) )
            {
            // InternalFoo.g:1439:1: ( ( rule__Binding__MDAssignment_2 ) )
            // InternalFoo.g:1440:2: ( rule__Binding__MDAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getMDAssignment_2()); 
            // InternalFoo.g:1441:2: ( rule__Binding__MDAssignment_2 )
            // InternalFoo.g:1441:3: rule__Binding__MDAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Binding__MDAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getMDAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__BindingRequiered__Group__0"
    // InternalFoo.g:1450:1: rule__BindingRequiered__Group__0 : rule__BindingRequiered__Group__0__Impl rule__BindingRequiered__Group__1 ;
    public final void rule__BindingRequiered__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1454:1: ( rule__BindingRequiered__Group__0__Impl rule__BindingRequiered__Group__1 )
            // InternalFoo.g:1455:2: rule__BindingRequiered__Group__0__Impl rule__BindingRequiered__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalFoo.g:1462:1: rule__BindingRequiered__Group__0__Impl : ( ( rule__BindingRequiered__IdAssignment_0 ) ) ;
    public final void rule__BindingRequiered__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1466:1: ( ( ( rule__BindingRequiered__IdAssignment_0 ) ) )
            // InternalFoo.g:1467:1: ( ( rule__BindingRequiered__IdAssignment_0 ) )
            {
            // InternalFoo.g:1467:1: ( ( rule__BindingRequiered__IdAssignment_0 ) )
            // InternalFoo.g:1468:2: ( rule__BindingRequiered__IdAssignment_0 )
            {
             before(grammarAccess.getBindingRequieredAccess().getIdAssignment_0()); 
            // InternalFoo.g:1469:2: ( rule__BindingRequiered__IdAssignment_0 )
            // InternalFoo.g:1469:3: rule__BindingRequiered__IdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BindingRequiered__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingRequieredAccess().getIdAssignment_0()); 

            }


            }

        }
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
    // InternalFoo.g:1477:1: rule__BindingRequiered__Group__1 : rule__BindingRequiered__Group__1__Impl rule__BindingRequiered__Group__2 ;
    public final void rule__BindingRequiered__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1481:1: ( rule__BindingRequiered__Group__1__Impl rule__BindingRequiered__Group__2 )
            // InternalFoo.g:1482:2: rule__BindingRequiered__Group__1__Impl rule__BindingRequiered__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:1489:1: rule__BindingRequiered__Group__1__Impl : ( '->' ) ;
    public final void rule__BindingRequiered__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1493:1: ( ( '->' ) )
            // InternalFoo.g:1494:1: ( '->' )
            {
            // InternalFoo.g:1494:1: ( '->' )
            // InternalFoo.g:1495:2: '->'
            {
             before(grammarAccess.getBindingRequieredAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBindingRequieredAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
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
    // InternalFoo.g:1504:1: rule__BindingRequiered__Group__2 : rule__BindingRequiered__Group__2__Impl ;
    public final void rule__BindingRequiered__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1508:1: ( rule__BindingRequiered__Group__2__Impl )
            // InternalFoo.g:1509:2: rule__BindingRequiered__Group__2__Impl
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
    // InternalFoo.g:1515:1: rule__BindingRequiered__Group__2__Impl : ( ( rule__BindingRequiered__ServiceAssignment_2 ) ) ;
    public final void rule__BindingRequiered__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1519:1: ( ( ( rule__BindingRequiered__ServiceAssignment_2 ) ) )
            // InternalFoo.g:1520:1: ( ( rule__BindingRequiered__ServiceAssignment_2 ) )
            {
            // InternalFoo.g:1520:1: ( ( rule__BindingRequiered__ServiceAssignment_2 ) )
            // InternalFoo.g:1521:2: ( rule__BindingRequiered__ServiceAssignment_2 )
            {
             before(grammarAccess.getBindingRequieredAccess().getServiceAssignment_2()); 
            // InternalFoo.g:1522:2: ( rule__BindingRequiered__ServiceAssignment_2 )
            // InternalFoo.g:1522:3: rule__BindingRequiered__ServiceAssignment_2
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
    // InternalFoo.g:1531:1: rule__BindingProvided__Group__0 : rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1 ;
    public final void rule__BindingProvided__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1535:1: ( rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1 )
            // InternalFoo.g:1536:2: rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalFoo.g:1543:1: rule__BindingProvided__Group__0__Impl : ( ( rule__BindingProvided__IdAssignment_0 ) ) ;
    public final void rule__BindingProvided__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1547:1: ( ( ( rule__BindingProvided__IdAssignment_0 ) ) )
            // InternalFoo.g:1548:1: ( ( rule__BindingProvided__IdAssignment_0 ) )
            {
            // InternalFoo.g:1548:1: ( ( rule__BindingProvided__IdAssignment_0 ) )
            // InternalFoo.g:1549:2: ( rule__BindingProvided__IdAssignment_0 )
            {
             before(grammarAccess.getBindingProvidedAccess().getIdAssignment_0()); 
            // InternalFoo.g:1550:2: ( rule__BindingProvided__IdAssignment_0 )
            // InternalFoo.g:1550:3: rule__BindingProvided__IdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BindingProvided__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingProvidedAccess().getIdAssignment_0()); 

            }


            }

        }
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
    // InternalFoo.g:1558:1: rule__BindingProvided__Group__1 : rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2 ;
    public final void rule__BindingProvided__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1562:1: ( rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2 )
            // InternalFoo.g:1563:2: rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:1570:1: rule__BindingProvided__Group__1__Impl : ( '->' ) ;
    public final void rule__BindingProvided__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1574:1: ( ( '->' ) )
            // InternalFoo.g:1575:1: ( '->' )
            {
            // InternalFoo.g:1575:1: ( '->' )
            // InternalFoo.g:1576:2: '->'
            {
             before(grammarAccess.getBindingProvidedAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBindingProvidedAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
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
    // InternalFoo.g:1585:1: rule__BindingProvided__Group__2 : rule__BindingProvided__Group__2__Impl ;
    public final void rule__BindingProvided__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1589:1: ( rule__BindingProvided__Group__2__Impl )
            // InternalFoo.g:1590:2: rule__BindingProvided__Group__2__Impl
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
    // InternalFoo.g:1596:1: rule__BindingProvided__Group__2__Impl : ( ( rule__BindingProvided__ServiceAssignment_2 ) ) ;
    public final void rule__BindingProvided__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1600:1: ( ( ( rule__BindingProvided__ServiceAssignment_2 ) ) )
            // InternalFoo.g:1601:1: ( ( rule__BindingProvided__ServiceAssignment_2 ) )
            {
            // InternalFoo.g:1601:1: ( ( rule__BindingProvided__ServiceAssignment_2 ) )
            // InternalFoo.g:1602:2: ( rule__BindingProvided__ServiceAssignment_2 )
            {
             before(grammarAccess.getBindingProvidedAccess().getServiceAssignment_2()); 
            // InternalFoo.g:1603:2: ( rule__BindingProvided__ServiceAssignment_2 )
            // InternalFoo.g:1603:3: rule__BindingProvided__ServiceAssignment_2
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
    // InternalFoo.g:1612:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1616:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalFoo.g:1617:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:1624:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1628:1: ( ( 'Component' ) )
            // InternalFoo.g:1629:1: ( 'Component' )
            {
            // InternalFoo.g:1629:1: ( 'Component' )
            // InternalFoo.g:1630:2: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFoo.g:1639:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1643:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalFoo.g:1644:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalFoo.g:1651:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1655:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalFoo.g:1656:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalFoo.g:1656:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalFoo.g:1657:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalFoo.g:1658:2: ( rule__Component__NameAssignment_1 )
            // InternalFoo.g:1658:3: rule__Component__NameAssignment_1
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
    // InternalFoo.g:1666:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1670:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalFoo.g:1671:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalFoo.g:1678:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1682:1: ( ( '{' ) )
            // InternalFoo.g:1683:1: ( '{' )
            {
            // InternalFoo.g:1683:1: ( '{' )
            // InternalFoo.g:1684:2: '{'
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
    // InternalFoo.g:1693:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1697:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalFoo.g:1698:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalFoo.g:1705:1: rule__Component__Group__3__Impl : ( ( rule__Component__ProvidedAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1709:1: ( ( ( rule__Component__ProvidedAssignment_3 ) ) )
            // InternalFoo.g:1710:1: ( ( rule__Component__ProvidedAssignment_3 ) )
            {
            // InternalFoo.g:1710:1: ( ( rule__Component__ProvidedAssignment_3 ) )
            // InternalFoo.g:1711:2: ( rule__Component__ProvidedAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getProvidedAssignment_3()); 
            // InternalFoo.g:1712:2: ( rule__Component__ProvidedAssignment_3 )
            // InternalFoo.g:1712:3: rule__Component__ProvidedAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Component__ProvidedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getProvidedAssignment_3()); 

            }


            }

        }
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
    // InternalFoo.g:1720:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1724:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalFoo.g:1725:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalFoo.g:1732:1: rule__Component__Group__4__Impl : ( ( rule__Component__RequieredAssignment_4 ) ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1736:1: ( ( ( rule__Component__RequieredAssignment_4 ) ) )
            // InternalFoo.g:1737:1: ( ( rule__Component__RequieredAssignment_4 ) )
            {
            // InternalFoo.g:1737:1: ( ( rule__Component__RequieredAssignment_4 ) )
            // InternalFoo.g:1738:2: ( rule__Component__RequieredAssignment_4 )
            {
             before(grammarAccess.getComponentAccess().getRequieredAssignment_4()); 
            // InternalFoo.g:1739:2: ( rule__Component__RequieredAssignment_4 )
            // InternalFoo.g:1739:3: rule__Component__RequieredAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Component__RequieredAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getRequieredAssignment_4()); 

            }


            }

        }
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
    // InternalFoo.g:1747:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1751:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalFoo.g:1752:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalFoo.g:1759:1: rule__Component__Group__5__Impl : ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1763:1: ( ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) ) )
            // InternalFoo.g:1764:1: ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) )
            {
            // InternalFoo.g:1764:1: ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) )
            // InternalFoo.g:1765:2: ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* )
            {
            // InternalFoo.g:1765:2: ( ( rule__Component__MProvServicesAssignment_5 ) )
            // InternalFoo.g:1766:3: ( rule__Component__MProvServicesAssignment_5 )
            {
             before(grammarAccess.getComponentAccess().getMProvServicesAssignment_5()); 
            // InternalFoo.g:1767:3: ( rule__Component__MProvServicesAssignment_5 )
            // InternalFoo.g:1767:4: rule__Component__MProvServicesAssignment_5
            {
            pushFollow(FOLLOW_27);
            rule__Component__MProvServicesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getMProvServicesAssignment_5()); 

            }

            // InternalFoo.g:1770:2: ( ( rule__Component__MProvServicesAssignment_5 )* )
            // InternalFoo.g:1771:3: ( rule__Component__MProvServicesAssignment_5 )*
            {
             before(grammarAccess.getComponentAccess().getMProvServicesAssignment_5()); 
            // InternalFoo.g:1772:3: ( rule__Component__MProvServicesAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==26) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalFoo.g:1772:4: rule__Component__MProvServicesAssignment_5
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Component__MProvServicesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalFoo.g:1781:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1785:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalFoo.g:1786:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_26);
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
    // InternalFoo.g:1793:1: rule__Component__Group__6__Impl : ( ( rule__Component__MReqServicesAssignment_6 )* ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1797:1: ( ( ( rule__Component__MReqServicesAssignment_6 )* ) )
            // InternalFoo.g:1798:1: ( ( rule__Component__MReqServicesAssignment_6 )* )
            {
            // InternalFoo.g:1798:1: ( ( rule__Component__MReqServicesAssignment_6 )* )
            // InternalFoo.g:1799:2: ( rule__Component__MReqServicesAssignment_6 )*
            {
             before(grammarAccess.getComponentAccess().getMReqServicesAssignment_6()); 
            // InternalFoo.g:1800:2: ( rule__Component__MReqServicesAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFoo.g:1800:3: rule__Component__MReqServicesAssignment_6
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Component__MReqServicesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalFoo.g:1808:1: rule__Component__Group__7 : rule__Component__Group__7__Impl ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1812:1: ( rule__Component__Group__7__Impl )
            // InternalFoo.g:1813:2: rule__Component__Group__7__Impl
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
    // InternalFoo.g:1819:1: rule__Component__Group__7__Impl : ( '}' ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1823:1: ( ( '}' ) )
            // InternalFoo.g:1824:1: ( '}' )
            {
            // InternalFoo.g:1824:1: ( '}' )
            // InternalFoo.g:1825:2: '}'
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


    // $ANTLR start "rule__Provided__Group__0"
    // InternalFoo.g:1835:1: rule__Provided__Group__0 : rule__Provided__Group__0__Impl rule__Provided__Group__1 ;
    public final void rule__Provided__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1839:1: ( rule__Provided__Group__0__Impl rule__Provided__Group__1 )
            // InternalFoo.g:1840:2: rule__Provided__Group__0__Impl rule__Provided__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Provided__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provided__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group__0"


    // $ANTLR start "rule__Provided__Group__0__Impl"
    // InternalFoo.g:1847:1: rule__Provided__Group__0__Impl : ( 'provided' ) ;
    public final void rule__Provided__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1851:1: ( ( 'provided' ) )
            // InternalFoo.g:1852:1: ( 'provided' )
            {
            // InternalFoo.g:1852:1: ( 'provided' )
            // InternalFoo.g:1853:2: 'provided'
            {
             before(grammarAccess.getProvidedAccess().getProvidedKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProvidedAccess().getProvidedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group__0__Impl"


    // $ANTLR start "rule__Provided__Group__1"
    // InternalFoo.g:1862:1: rule__Provided__Group__1 : rule__Provided__Group__1__Impl rule__Provided__Group__2 ;
    public final void rule__Provided__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1866:1: ( rule__Provided__Group__1__Impl rule__Provided__Group__2 )
            // InternalFoo.g:1867:2: rule__Provided__Group__1__Impl rule__Provided__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Provided__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provided__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group__1"


    // $ANTLR start "rule__Provided__Group__1__Impl"
    // InternalFoo.g:1874:1: rule__Provided__Group__1__Impl : ( '=' ) ;
    public final void rule__Provided__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1878:1: ( ( '=' ) )
            // InternalFoo.g:1879:1: ( '=' )
            {
            // InternalFoo.g:1879:1: ( '=' )
            // InternalFoo.g:1880:2: '='
            {
             before(grammarAccess.getProvidedAccess().getEqualsSignKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProvidedAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group__1__Impl"


    // $ANTLR start "rule__Provided__Group__2"
    // InternalFoo.g:1889:1: rule__Provided__Group__2 : rule__Provided__Group__2__Impl rule__Provided__Group__3 ;
    public final void rule__Provided__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1893:1: ( rule__Provided__Group__2__Impl rule__Provided__Group__3 )
            // InternalFoo.g:1894:2: rule__Provided__Group__2__Impl rule__Provided__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Provided__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provided__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group__2"


    // $ANTLR start "rule__Provided__Group__2__Impl"
    // InternalFoo.g:1901:1: rule__Provided__Group__2__Impl : ( '{' ) ;
    public final void rule__Provided__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1905:1: ( ( '{' ) )
            // InternalFoo.g:1906:1: ( '{' )
            {
            // InternalFoo.g:1906:1: ( '{' )
            // InternalFoo.g:1907:2: '{'
            {
             before(grammarAccess.getProvidedAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProvidedAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group__2__Impl"


    // $ANTLR start "rule__Provided__Group__3"
    // InternalFoo.g:1916:1: rule__Provided__Group__3 : rule__Provided__Group__3__Impl rule__Provided__Group__4 ;
    public final void rule__Provided__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1920:1: ( rule__Provided__Group__3__Impl rule__Provided__Group__4 )
            // InternalFoo.g:1921:2: rule__Provided__Group__3__Impl rule__Provided__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Provided__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provided__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group__3"


    // $ANTLR start "rule__Provided__Group__3__Impl"
    // InternalFoo.g:1928:1: rule__Provided__Group__3__Impl : ( ( rule__Provided__Group_3__0 ) ) ;
    public final void rule__Provided__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1932:1: ( ( ( rule__Provided__Group_3__0 ) ) )
            // InternalFoo.g:1933:1: ( ( rule__Provided__Group_3__0 ) )
            {
            // InternalFoo.g:1933:1: ( ( rule__Provided__Group_3__0 ) )
            // InternalFoo.g:1934:2: ( rule__Provided__Group_3__0 )
            {
             before(grammarAccess.getProvidedAccess().getGroup_3()); 
            // InternalFoo.g:1935:2: ( rule__Provided__Group_3__0 )
            // InternalFoo.g:1935:3: rule__Provided__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Provided__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getProvidedAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group__3__Impl"


    // $ANTLR start "rule__Provided__Group__4"
    // InternalFoo.g:1943:1: rule__Provided__Group__4 : rule__Provided__Group__4__Impl ;
    public final void rule__Provided__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1947:1: ( rule__Provided__Group__4__Impl )
            // InternalFoo.g:1948:2: rule__Provided__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Provided__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group__4"


    // $ANTLR start "rule__Provided__Group__4__Impl"
    // InternalFoo.g:1954:1: rule__Provided__Group__4__Impl : ( '}' ) ;
    public final void rule__Provided__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1958:1: ( ( '}' ) )
            // InternalFoo.g:1959:1: ( '}' )
            {
            // InternalFoo.g:1959:1: ( '}' )
            // InternalFoo.g:1960:2: '}'
            {
             before(grammarAccess.getProvidedAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProvidedAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group__4__Impl"


    // $ANTLR start "rule__Provided__Group_3__0"
    // InternalFoo.g:1970:1: rule__Provided__Group_3__0 : rule__Provided__Group_3__0__Impl rule__Provided__Group_3__1 ;
    public final void rule__Provided__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1974:1: ( rule__Provided__Group_3__0__Impl rule__Provided__Group_3__1 )
            // InternalFoo.g:1975:2: rule__Provided__Group_3__0__Impl rule__Provided__Group_3__1
            {
            pushFollow(FOLLOW_30);
            rule__Provided__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provided__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group_3__0"


    // $ANTLR start "rule__Provided__Group_3__0__Impl"
    // InternalFoo.g:1982:1: rule__Provided__Group_3__0__Impl : ( ( rule__Provided__ProvidedServicesAssignment_3_0 ) ) ;
    public final void rule__Provided__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1986:1: ( ( ( rule__Provided__ProvidedServicesAssignment_3_0 ) ) )
            // InternalFoo.g:1987:1: ( ( rule__Provided__ProvidedServicesAssignment_3_0 ) )
            {
            // InternalFoo.g:1987:1: ( ( rule__Provided__ProvidedServicesAssignment_3_0 ) )
            // InternalFoo.g:1988:2: ( rule__Provided__ProvidedServicesAssignment_3_0 )
            {
             before(grammarAccess.getProvidedAccess().getProvidedServicesAssignment_3_0()); 
            // InternalFoo.g:1989:2: ( rule__Provided__ProvidedServicesAssignment_3_0 )
            // InternalFoo.g:1989:3: rule__Provided__ProvidedServicesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Provided__ProvidedServicesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getProvidedAccess().getProvidedServicesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group_3__0__Impl"


    // $ANTLR start "rule__Provided__Group_3__1"
    // InternalFoo.g:1997:1: rule__Provided__Group_3__1 : rule__Provided__Group_3__1__Impl ;
    public final void rule__Provided__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2001:1: ( rule__Provided__Group_3__1__Impl )
            // InternalFoo.g:2002:2: rule__Provided__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Provided__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group_3__1"


    // $ANTLR start "rule__Provided__Group_3__1__Impl"
    // InternalFoo.g:2008:1: rule__Provided__Group_3__1__Impl : ( ( rule__Provided__Group_3_1__0 )* ) ;
    public final void rule__Provided__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2012:1: ( ( ( rule__Provided__Group_3_1__0 )* ) )
            // InternalFoo.g:2013:1: ( ( rule__Provided__Group_3_1__0 )* )
            {
            // InternalFoo.g:2013:1: ( ( rule__Provided__Group_3_1__0 )* )
            // InternalFoo.g:2014:2: ( rule__Provided__Group_3_1__0 )*
            {
             before(grammarAccess.getProvidedAccess().getGroup_3_1()); 
            // InternalFoo.g:2015:2: ( rule__Provided__Group_3_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFoo.g:2015:3: rule__Provided__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Provided__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProvidedAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group_3__1__Impl"


    // $ANTLR start "rule__Provided__Group_3_1__0"
    // InternalFoo.g:2024:1: rule__Provided__Group_3_1__0 : rule__Provided__Group_3_1__0__Impl rule__Provided__Group_3_1__1 ;
    public final void rule__Provided__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2028:1: ( rule__Provided__Group_3_1__0__Impl rule__Provided__Group_3_1__1 )
            // InternalFoo.g:2029:2: rule__Provided__Group_3_1__0__Impl rule__Provided__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Provided__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Provided__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group_3_1__0"


    // $ANTLR start "rule__Provided__Group_3_1__0__Impl"
    // InternalFoo.g:2036:1: rule__Provided__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Provided__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2040:1: ( ( ',' ) )
            // InternalFoo.g:2041:1: ( ',' )
            {
            // InternalFoo.g:2041:1: ( ',' )
            // InternalFoo.g:2042:2: ','
            {
             before(grammarAccess.getProvidedAccess().getCommaKeyword_3_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProvidedAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group_3_1__0__Impl"


    // $ANTLR start "rule__Provided__Group_3_1__1"
    // InternalFoo.g:2051:1: rule__Provided__Group_3_1__1 : rule__Provided__Group_3_1__1__Impl ;
    public final void rule__Provided__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2055:1: ( rule__Provided__Group_3_1__1__Impl )
            // InternalFoo.g:2056:2: rule__Provided__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Provided__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group_3_1__1"


    // $ANTLR start "rule__Provided__Group_3_1__1__Impl"
    // InternalFoo.g:2062:1: rule__Provided__Group_3_1__1__Impl : ( ( rule__Provided__ProvidedServicesAssignment_3_1_1 ) ) ;
    public final void rule__Provided__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2066:1: ( ( ( rule__Provided__ProvidedServicesAssignment_3_1_1 ) ) )
            // InternalFoo.g:2067:1: ( ( rule__Provided__ProvidedServicesAssignment_3_1_1 ) )
            {
            // InternalFoo.g:2067:1: ( ( rule__Provided__ProvidedServicesAssignment_3_1_1 ) )
            // InternalFoo.g:2068:2: ( rule__Provided__ProvidedServicesAssignment_3_1_1 )
            {
             before(grammarAccess.getProvidedAccess().getProvidedServicesAssignment_3_1_1()); 
            // InternalFoo.g:2069:2: ( rule__Provided__ProvidedServicesAssignment_3_1_1 )
            // InternalFoo.g:2069:3: rule__Provided__ProvidedServicesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Provided__ProvidedServicesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProvidedAccess().getProvidedServicesAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__Group_3_1__1__Impl"


    // $ANTLR start "rule__Requiered__Group__0"
    // InternalFoo.g:2078:1: rule__Requiered__Group__0 : rule__Requiered__Group__0__Impl rule__Requiered__Group__1 ;
    public final void rule__Requiered__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2082:1: ( rule__Requiered__Group__0__Impl rule__Requiered__Group__1 )
            // InternalFoo.g:2083:2: rule__Requiered__Group__0__Impl rule__Requiered__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Requiered__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requiered__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group__0"


    // $ANTLR start "rule__Requiered__Group__0__Impl"
    // InternalFoo.g:2090:1: rule__Requiered__Group__0__Impl : ( () ) ;
    public final void rule__Requiered__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2094:1: ( ( () ) )
            // InternalFoo.g:2095:1: ( () )
            {
            // InternalFoo.g:2095:1: ( () )
            // InternalFoo.g:2096:2: ()
            {
             before(grammarAccess.getRequieredAccess().getRequieredAction_0()); 
            // InternalFoo.g:2097:2: ()
            // InternalFoo.g:2097:3: 
            {
            }

             after(grammarAccess.getRequieredAccess().getRequieredAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group__0__Impl"


    // $ANTLR start "rule__Requiered__Group__1"
    // InternalFoo.g:2105:1: rule__Requiered__Group__1 : rule__Requiered__Group__1__Impl rule__Requiered__Group__2 ;
    public final void rule__Requiered__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2109:1: ( rule__Requiered__Group__1__Impl rule__Requiered__Group__2 )
            // InternalFoo.g:2110:2: rule__Requiered__Group__1__Impl rule__Requiered__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Requiered__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requiered__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group__1"


    // $ANTLR start "rule__Requiered__Group__1__Impl"
    // InternalFoo.g:2117:1: rule__Requiered__Group__1__Impl : ( 'requiered' ) ;
    public final void rule__Requiered__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2121:1: ( ( 'requiered' ) )
            // InternalFoo.g:2122:1: ( 'requiered' )
            {
            // InternalFoo.g:2122:1: ( 'requiered' )
            // InternalFoo.g:2123:2: 'requiered'
            {
             before(grammarAccess.getRequieredAccess().getRequieredKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRequieredAccess().getRequieredKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group__1__Impl"


    // $ANTLR start "rule__Requiered__Group__2"
    // InternalFoo.g:2132:1: rule__Requiered__Group__2 : rule__Requiered__Group__2__Impl rule__Requiered__Group__3 ;
    public final void rule__Requiered__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2136:1: ( rule__Requiered__Group__2__Impl rule__Requiered__Group__3 )
            // InternalFoo.g:2137:2: rule__Requiered__Group__2__Impl rule__Requiered__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Requiered__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requiered__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group__2"


    // $ANTLR start "rule__Requiered__Group__2__Impl"
    // InternalFoo.g:2144:1: rule__Requiered__Group__2__Impl : ( '=' ) ;
    public final void rule__Requiered__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2148:1: ( ( '=' ) )
            // InternalFoo.g:2149:1: ( '=' )
            {
            // InternalFoo.g:2149:1: ( '=' )
            // InternalFoo.g:2150:2: '='
            {
             before(grammarAccess.getRequieredAccess().getEqualsSignKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRequieredAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group__2__Impl"


    // $ANTLR start "rule__Requiered__Group__3"
    // InternalFoo.g:2159:1: rule__Requiered__Group__3 : rule__Requiered__Group__3__Impl rule__Requiered__Group__4 ;
    public final void rule__Requiered__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2163:1: ( rule__Requiered__Group__3__Impl rule__Requiered__Group__4 )
            // InternalFoo.g:2164:2: rule__Requiered__Group__3__Impl rule__Requiered__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Requiered__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requiered__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group__3"


    // $ANTLR start "rule__Requiered__Group__3__Impl"
    // InternalFoo.g:2171:1: rule__Requiered__Group__3__Impl : ( '{' ) ;
    public final void rule__Requiered__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2175:1: ( ( '{' ) )
            // InternalFoo.g:2176:1: ( '{' )
            {
            // InternalFoo.g:2176:1: ( '{' )
            // InternalFoo.g:2177:2: '{'
            {
             before(grammarAccess.getRequieredAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRequieredAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group__3__Impl"


    // $ANTLR start "rule__Requiered__Group__4"
    // InternalFoo.g:2186:1: rule__Requiered__Group__4 : rule__Requiered__Group__4__Impl rule__Requiered__Group__5 ;
    public final void rule__Requiered__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2190:1: ( rule__Requiered__Group__4__Impl rule__Requiered__Group__5 )
            // InternalFoo.g:2191:2: rule__Requiered__Group__4__Impl rule__Requiered__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Requiered__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requiered__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group__4"


    // $ANTLR start "rule__Requiered__Group__4__Impl"
    // InternalFoo.g:2198:1: rule__Requiered__Group__4__Impl : ( ( rule__Requiered__Group_4__0 ) ) ;
    public final void rule__Requiered__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2202:1: ( ( ( rule__Requiered__Group_4__0 ) ) )
            // InternalFoo.g:2203:1: ( ( rule__Requiered__Group_4__0 ) )
            {
            // InternalFoo.g:2203:1: ( ( rule__Requiered__Group_4__0 ) )
            // InternalFoo.g:2204:2: ( rule__Requiered__Group_4__0 )
            {
             before(grammarAccess.getRequieredAccess().getGroup_4()); 
            // InternalFoo.g:2205:2: ( rule__Requiered__Group_4__0 )
            // InternalFoo.g:2205:3: rule__Requiered__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__Requiered__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getRequieredAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group__4__Impl"


    // $ANTLR start "rule__Requiered__Group__5"
    // InternalFoo.g:2213:1: rule__Requiered__Group__5 : rule__Requiered__Group__5__Impl ;
    public final void rule__Requiered__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2217:1: ( rule__Requiered__Group__5__Impl )
            // InternalFoo.g:2218:2: rule__Requiered__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Requiered__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group__5"


    // $ANTLR start "rule__Requiered__Group__5__Impl"
    // InternalFoo.g:2224:1: rule__Requiered__Group__5__Impl : ( '}' ) ;
    public final void rule__Requiered__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2228:1: ( ( '}' ) )
            // InternalFoo.g:2229:1: ( '}' )
            {
            // InternalFoo.g:2229:1: ( '}' )
            // InternalFoo.g:2230:2: '}'
            {
             before(grammarAccess.getRequieredAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRequieredAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group__5__Impl"


    // $ANTLR start "rule__Requiered__Group_4__0"
    // InternalFoo.g:2240:1: rule__Requiered__Group_4__0 : rule__Requiered__Group_4__0__Impl rule__Requiered__Group_4__1 ;
    public final void rule__Requiered__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2244:1: ( rule__Requiered__Group_4__0__Impl rule__Requiered__Group_4__1 )
            // InternalFoo.g:2245:2: rule__Requiered__Group_4__0__Impl rule__Requiered__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__Requiered__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requiered__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group_4__0"


    // $ANTLR start "rule__Requiered__Group_4__0__Impl"
    // InternalFoo.g:2252:1: rule__Requiered__Group_4__0__Impl : ( ( rule__Requiered__RequieredServicesAssignment_4_0 )? ) ;
    public final void rule__Requiered__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2256:1: ( ( ( rule__Requiered__RequieredServicesAssignment_4_0 )? ) )
            // InternalFoo.g:2257:1: ( ( rule__Requiered__RequieredServicesAssignment_4_0 )? )
            {
            // InternalFoo.g:2257:1: ( ( rule__Requiered__RequieredServicesAssignment_4_0 )? )
            // InternalFoo.g:2258:2: ( rule__Requiered__RequieredServicesAssignment_4_0 )?
            {
             before(grammarAccess.getRequieredAccess().getRequieredServicesAssignment_4_0()); 
            // InternalFoo.g:2259:2: ( rule__Requiered__RequieredServicesAssignment_4_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFoo.g:2259:3: rule__Requiered__RequieredServicesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Requiered__RequieredServicesAssignment_4_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequieredAccess().getRequieredServicesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group_4__0__Impl"


    // $ANTLR start "rule__Requiered__Group_4__1"
    // InternalFoo.g:2267:1: rule__Requiered__Group_4__1 : rule__Requiered__Group_4__1__Impl ;
    public final void rule__Requiered__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2271:1: ( rule__Requiered__Group_4__1__Impl )
            // InternalFoo.g:2272:2: rule__Requiered__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Requiered__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group_4__1"


    // $ANTLR start "rule__Requiered__Group_4__1__Impl"
    // InternalFoo.g:2278:1: rule__Requiered__Group_4__1__Impl : ( ( rule__Requiered__Group_4_1__0 )* ) ;
    public final void rule__Requiered__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2282:1: ( ( ( rule__Requiered__Group_4_1__0 )* ) )
            // InternalFoo.g:2283:1: ( ( rule__Requiered__Group_4_1__0 )* )
            {
            // InternalFoo.g:2283:1: ( ( rule__Requiered__Group_4_1__0 )* )
            // InternalFoo.g:2284:2: ( rule__Requiered__Group_4_1__0 )*
            {
             before(grammarAccess.getRequieredAccess().getGroup_4_1()); 
            // InternalFoo.g:2285:2: ( rule__Requiered__Group_4_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFoo.g:2285:3: rule__Requiered__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Requiered__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRequieredAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group_4__1__Impl"


    // $ANTLR start "rule__Requiered__Group_4_1__0"
    // InternalFoo.g:2294:1: rule__Requiered__Group_4_1__0 : rule__Requiered__Group_4_1__0__Impl rule__Requiered__Group_4_1__1 ;
    public final void rule__Requiered__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2298:1: ( rule__Requiered__Group_4_1__0__Impl rule__Requiered__Group_4_1__1 )
            // InternalFoo.g:2299:2: rule__Requiered__Group_4_1__0__Impl rule__Requiered__Group_4_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Requiered__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requiered__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group_4_1__0"


    // $ANTLR start "rule__Requiered__Group_4_1__0__Impl"
    // InternalFoo.g:2306:1: rule__Requiered__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Requiered__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2310:1: ( ( ',' ) )
            // InternalFoo.g:2311:1: ( ',' )
            {
            // InternalFoo.g:2311:1: ( ',' )
            // InternalFoo.g:2312:2: ','
            {
             before(grammarAccess.getRequieredAccess().getCommaKeyword_4_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRequieredAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group_4_1__0__Impl"


    // $ANTLR start "rule__Requiered__Group_4_1__1"
    // InternalFoo.g:2321:1: rule__Requiered__Group_4_1__1 : rule__Requiered__Group_4_1__1__Impl ;
    public final void rule__Requiered__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2325:1: ( rule__Requiered__Group_4_1__1__Impl )
            // InternalFoo.g:2326:2: rule__Requiered__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Requiered__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group_4_1__1"


    // $ANTLR start "rule__Requiered__Group_4_1__1__Impl"
    // InternalFoo.g:2332:1: rule__Requiered__Group_4_1__1__Impl : ( ( rule__Requiered__RequieredServicesAssignment_4_1_1 ) ) ;
    public final void rule__Requiered__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2336:1: ( ( ( rule__Requiered__RequieredServicesAssignment_4_1_1 ) ) )
            // InternalFoo.g:2337:1: ( ( rule__Requiered__RequieredServicesAssignment_4_1_1 ) )
            {
            // InternalFoo.g:2337:1: ( ( rule__Requiered__RequieredServicesAssignment_4_1_1 ) )
            // InternalFoo.g:2338:2: ( rule__Requiered__RequieredServicesAssignment_4_1_1 )
            {
             before(grammarAccess.getRequieredAccess().getRequieredServicesAssignment_4_1_1()); 
            // InternalFoo.g:2339:2: ( rule__Requiered__RequieredServicesAssignment_4_1_1 )
            // InternalFoo.g:2339:3: rule__Requiered__RequieredServicesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Requiered__RequieredServicesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRequieredAccess().getRequieredServicesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__Group_4_1__1__Impl"


    // $ANTLR start "rule__MProvidedService__Group__0"
    // InternalFoo.g:2348:1: rule__MProvidedService__Group__0 : rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1 ;
    public final void rule__MProvidedService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2352:1: ( rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1 )
            // InternalFoo.g:2353:2: rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalFoo.g:2360:1: rule__MProvidedService__Group__0__Impl : ( 'service' ) ;
    public final void rule__MProvidedService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2364:1: ( ( 'service' ) )
            // InternalFoo.g:2365:1: ( 'service' )
            {
            // InternalFoo.g:2365:1: ( 'service' )
            // InternalFoo.g:2366:2: 'service'
            {
             before(grammarAccess.getMProvidedServiceAccess().getServiceKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalFoo.g:2375:1: rule__MProvidedService__Group__1 : rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2 ;
    public final void rule__MProvidedService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2379:1: ( rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2 )
            // InternalFoo.g:2380:2: rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:2387:1: rule__MProvidedService__Group__1__Impl : ( 'provided' ) ;
    public final void rule__MProvidedService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2391:1: ( ( 'provided' ) )
            // InternalFoo.g:2392:1: ( 'provided' )
            {
            // InternalFoo.g:2392:1: ( 'provided' )
            // InternalFoo.g:2393:2: 'provided'
            {
             before(grammarAccess.getMProvidedServiceAccess().getProvidedKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFoo.g:2402:1: rule__MProvidedService__Group__2 : rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3 ;
    public final void rule__MProvidedService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2406:1: ( rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3 )
            // InternalFoo.g:2407:2: rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalFoo.g:2414:1: rule__MProvidedService__Group__2__Impl : ( ( rule__MProvidedService__SignatureAssignment_2 ) ) ;
    public final void rule__MProvidedService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2418:1: ( ( ( rule__MProvidedService__SignatureAssignment_2 ) ) )
            // InternalFoo.g:2419:1: ( ( rule__MProvidedService__SignatureAssignment_2 ) )
            {
            // InternalFoo.g:2419:1: ( ( rule__MProvidedService__SignatureAssignment_2 ) )
            // InternalFoo.g:2420:2: ( rule__MProvidedService__SignatureAssignment_2 )
            {
             before(grammarAccess.getMProvidedServiceAccess().getSignatureAssignment_2()); 
            // InternalFoo.g:2421:2: ( rule__MProvidedService__SignatureAssignment_2 )
            // InternalFoo.g:2421:3: rule__MProvidedService__SignatureAssignment_2
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
    // InternalFoo.g:2429:1: rule__MProvidedService__Group__3 : rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4 ;
    public final void rule__MProvidedService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2433:1: ( rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4 )
            // InternalFoo.g:2434:2: rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalFoo.g:2441:1: rule__MProvidedService__Group__3__Impl : ( '{' ) ;
    public final void rule__MProvidedService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2445:1: ( ( '{' ) )
            // InternalFoo.g:2446:1: ( '{' )
            {
            // InternalFoo.g:2446:1: ( '{' )
            // InternalFoo.g:2447:2: '{'
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
    // InternalFoo.g:2456:1: rule__MProvidedService__Group__4 : rule__MProvidedService__Group__4__Impl ;
    public final void rule__MProvidedService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2460:1: ( rule__MProvidedService__Group__4__Impl )
            // InternalFoo.g:2461:2: rule__MProvidedService__Group__4__Impl
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
    // InternalFoo.g:2467:1: rule__MProvidedService__Group__4__Impl : ( '}' ) ;
    public final void rule__MProvidedService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2471:1: ( ( '}' ) )
            // InternalFoo.g:2472:1: ( '}' )
            {
            // InternalFoo.g:2472:1: ( '}' )
            // InternalFoo.g:2473:2: '}'
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
    // InternalFoo.g:2483:1: rule__PSignature__Group__0 : rule__PSignature__Group__0__Impl rule__PSignature__Group__1 ;
    public final void rule__PSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2487:1: ( rule__PSignature__Group__0__Impl rule__PSignature__Group__1 )
            // InternalFoo.g:2488:2: rule__PSignature__Group__0__Impl rule__PSignature__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:2495:1: rule__PSignature__Group__0__Impl : ( ( rule__PSignature__TypeAssignment_0 ) ) ;
    public final void rule__PSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2499:1: ( ( ( rule__PSignature__TypeAssignment_0 ) ) )
            // InternalFoo.g:2500:1: ( ( rule__PSignature__TypeAssignment_0 ) )
            {
            // InternalFoo.g:2500:1: ( ( rule__PSignature__TypeAssignment_0 ) )
            // InternalFoo.g:2501:2: ( rule__PSignature__TypeAssignment_0 )
            {
             before(grammarAccess.getPSignatureAccess().getTypeAssignment_0()); 
            // InternalFoo.g:2502:2: ( rule__PSignature__TypeAssignment_0 )
            // InternalFoo.g:2502:3: rule__PSignature__TypeAssignment_0
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
    // InternalFoo.g:2510:1: rule__PSignature__Group__1 : rule__PSignature__Group__1__Impl rule__PSignature__Group__2 ;
    public final void rule__PSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2514:1: ( rule__PSignature__Group__1__Impl rule__PSignature__Group__2 )
            // InternalFoo.g:2515:2: rule__PSignature__Group__1__Impl rule__PSignature__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalFoo.g:2522:1: rule__PSignature__Group__1__Impl : ( ( rule__PSignature__NameAssignment_1 ) ) ;
    public final void rule__PSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2526:1: ( ( ( rule__PSignature__NameAssignment_1 ) ) )
            // InternalFoo.g:2527:1: ( ( rule__PSignature__NameAssignment_1 ) )
            {
            // InternalFoo.g:2527:1: ( ( rule__PSignature__NameAssignment_1 ) )
            // InternalFoo.g:2528:2: ( rule__PSignature__NameAssignment_1 )
            {
             before(grammarAccess.getPSignatureAccess().getNameAssignment_1()); 
            // InternalFoo.g:2529:2: ( rule__PSignature__NameAssignment_1 )
            // InternalFoo.g:2529:3: rule__PSignature__NameAssignment_1
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
    // InternalFoo.g:2537:1: rule__PSignature__Group__2 : rule__PSignature__Group__2__Impl rule__PSignature__Group__3 ;
    public final void rule__PSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2541:1: ( rule__PSignature__Group__2__Impl rule__PSignature__Group__3 )
            // InternalFoo.g:2542:2: rule__PSignature__Group__2__Impl rule__PSignature__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalFoo.g:2549:1: rule__PSignature__Group__2__Impl : ( '(' ) ;
    public final void rule__PSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2553:1: ( ( '(' ) )
            // InternalFoo.g:2554:1: ( '(' )
            {
            // InternalFoo.g:2554:1: ( '(' )
            // InternalFoo.g:2555:2: '('
            {
             before(grammarAccess.getPSignatureAccess().getLeftParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFoo.g:2564:1: rule__PSignature__Group__3 : rule__PSignature__Group__3__Impl rule__PSignature__Group__4 ;
    public final void rule__PSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2568:1: ( rule__PSignature__Group__3__Impl rule__PSignature__Group__4 )
            // InternalFoo.g:2569:2: rule__PSignature__Group__3__Impl rule__PSignature__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalFoo.g:2576:1: rule__PSignature__Group__3__Impl : ( ( rule__PSignature__AttributesAssignment_3 )? ) ;
    public final void rule__PSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2580:1: ( ( ( rule__PSignature__AttributesAssignment_3 )? ) )
            // InternalFoo.g:2581:1: ( ( rule__PSignature__AttributesAssignment_3 )? )
            {
            // InternalFoo.g:2581:1: ( ( rule__PSignature__AttributesAssignment_3 )? )
            // InternalFoo.g:2582:2: ( rule__PSignature__AttributesAssignment_3 )?
            {
             before(grammarAccess.getPSignatureAccess().getAttributesAssignment_3()); 
            // InternalFoo.g:2583:2: ( rule__PSignature__AttributesAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFoo.g:2583:3: rule__PSignature__AttributesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__PSignature__AttributesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPSignatureAccess().getAttributesAssignment_3()); 

            }


            }

        }
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
    // InternalFoo.g:2591:1: rule__PSignature__Group__4 : rule__PSignature__Group__4__Impl rule__PSignature__Group__5 ;
    public final void rule__PSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2595:1: ( rule__PSignature__Group__4__Impl rule__PSignature__Group__5 )
            // InternalFoo.g:2596:2: rule__PSignature__Group__4__Impl rule__PSignature__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalFoo.g:2603:1: rule__PSignature__Group__4__Impl : ( ( rule__PSignature__Group_4__0 )* ) ;
    public final void rule__PSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2607:1: ( ( ( rule__PSignature__Group_4__0 )* ) )
            // InternalFoo.g:2608:1: ( ( rule__PSignature__Group_4__0 )* )
            {
            // InternalFoo.g:2608:1: ( ( rule__PSignature__Group_4__0 )* )
            // InternalFoo.g:2609:2: ( rule__PSignature__Group_4__0 )*
            {
             before(grammarAccess.getPSignatureAccess().getGroup_4()); 
            // InternalFoo.g:2610:2: ( rule__PSignature__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFoo.g:2610:3: rule__PSignature__Group_4__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__PSignature__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalFoo.g:2618:1: rule__PSignature__Group__5 : rule__PSignature__Group__5__Impl ;
    public final void rule__PSignature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2622:1: ( rule__PSignature__Group__5__Impl )
            // InternalFoo.g:2623:2: rule__PSignature__Group__5__Impl
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
    // InternalFoo.g:2629:1: rule__PSignature__Group__5__Impl : ( ')' ) ;
    public final void rule__PSignature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2633:1: ( ( ')' ) )
            // InternalFoo.g:2634:1: ( ')' )
            {
            // InternalFoo.g:2634:1: ( ')' )
            // InternalFoo.g:2635:2: ')'
            {
             before(grammarAccess.getPSignatureAccess().getRightParenthesisKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalFoo.g:2645:1: rule__PSignature__Group_4__0 : rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1 ;
    public final void rule__PSignature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2649:1: ( rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1 )
            // InternalFoo.g:2650:2: rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:2657:1: rule__PSignature__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PSignature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2661:1: ( ( ',' ) )
            // InternalFoo.g:2662:1: ( ',' )
            {
            // InternalFoo.g:2662:1: ( ',' )
            // InternalFoo.g:2663:2: ','
            {
             before(grammarAccess.getPSignatureAccess().getCommaKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalFoo.g:2672:1: rule__PSignature__Group_4__1 : rule__PSignature__Group_4__1__Impl ;
    public final void rule__PSignature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2676:1: ( rule__PSignature__Group_4__1__Impl )
            // InternalFoo.g:2677:2: rule__PSignature__Group_4__1__Impl
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
    // InternalFoo.g:2683:1: rule__PSignature__Group_4__1__Impl : ( ( rule__PSignature__AttributesAssignment_4_1 ) ) ;
    public final void rule__PSignature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2687:1: ( ( ( rule__PSignature__AttributesAssignment_4_1 ) ) )
            // InternalFoo.g:2688:1: ( ( rule__PSignature__AttributesAssignment_4_1 ) )
            {
            // InternalFoo.g:2688:1: ( ( rule__PSignature__AttributesAssignment_4_1 ) )
            // InternalFoo.g:2689:2: ( rule__PSignature__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getPSignatureAccess().getAttributesAssignment_4_1()); 
            // InternalFoo.g:2690:2: ( rule__PSignature__AttributesAssignment_4_1 )
            // InternalFoo.g:2690:3: rule__PSignature__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PSignature__AttributesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPSignatureAccess().getAttributesAssignment_4_1()); 

            }


            }

        }
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
    // InternalFoo.g:2699:1: rule__MRequieredService__Group__0 : rule__MRequieredService__Group__0__Impl rule__MRequieredService__Group__1 ;
    public final void rule__MRequieredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2703:1: ( rule__MRequieredService__Group__0__Impl rule__MRequieredService__Group__1 )
            // InternalFoo.g:2704:2: rule__MRequieredService__Group__0__Impl rule__MRequieredService__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalFoo.g:2711:1: rule__MRequieredService__Group__0__Impl : ( 'service' ) ;
    public final void rule__MRequieredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2715:1: ( ( 'service' ) )
            // InternalFoo.g:2716:1: ( 'service' )
            {
            // InternalFoo.g:2716:1: ( 'service' )
            // InternalFoo.g:2717:2: 'service'
            {
             before(grammarAccess.getMRequieredServiceAccess().getServiceKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalFoo.g:2726:1: rule__MRequieredService__Group__1 : rule__MRequieredService__Group__1__Impl rule__MRequieredService__Group__2 ;
    public final void rule__MRequieredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2730:1: ( rule__MRequieredService__Group__1__Impl rule__MRequieredService__Group__2 )
            // InternalFoo.g:2731:2: rule__MRequieredService__Group__1__Impl rule__MRequieredService__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:2738:1: rule__MRequieredService__Group__1__Impl : ( 'requiered' ) ;
    public final void rule__MRequieredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2742:1: ( ( 'requiered' ) )
            // InternalFoo.g:2743:1: ( 'requiered' )
            {
            // InternalFoo.g:2743:1: ( 'requiered' )
            // InternalFoo.g:2744:2: 'requiered'
            {
             before(grammarAccess.getMRequieredServiceAccess().getRequieredKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalFoo.g:2753:1: rule__MRequieredService__Group__2 : rule__MRequieredService__Group__2__Impl rule__MRequieredService__Group__3 ;
    public final void rule__MRequieredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2757:1: ( rule__MRequieredService__Group__2__Impl rule__MRequieredService__Group__3 )
            // InternalFoo.g:2758:2: rule__MRequieredService__Group__2__Impl rule__MRequieredService__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalFoo.g:2765:1: rule__MRequieredService__Group__2__Impl : ( ( rule__MRequieredService__SignatureAssignment_2 ) ) ;
    public final void rule__MRequieredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2769:1: ( ( ( rule__MRequieredService__SignatureAssignment_2 ) ) )
            // InternalFoo.g:2770:1: ( ( rule__MRequieredService__SignatureAssignment_2 ) )
            {
            // InternalFoo.g:2770:1: ( ( rule__MRequieredService__SignatureAssignment_2 ) )
            // InternalFoo.g:2771:2: ( rule__MRequieredService__SignatureAssignment_2 )
            {
             before(grammarAccess.getMRequieredServiceAccess().getSignatureAssignment_2()); 
            // InternalFoo.g:2772:2: ( rule__MRequieredService__SignatureAssignment_2 )
            // InternalFoo.g:2772:3: rule__MRequieredService__SignatureAssignment_2
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
    // InternalFoo.g:2780:1: rule__MRequieredService__Group__3 : rule__MRequieredService__Group__3__Impl ;
    public final void rule__MRequieredService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2784:1: ( rule__MRequieredService__Group__3__Impl )
            // InternalFoo.g:2785:2: rule__MRequieredService__Group__3__Impl
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
    // InternalFoo.g:2791:1: rule__MRequieredService__Group__3__Impl : ( ';' ) ;
    public final void rule__MRequieredService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2795:1: ( ( ';' ) )
            // InternalFoo.g:2796:1: ( ';' )
            {
            // InternalFoo.g:2796:1: ( ';' )
            // InternalFoo.g:2797:2: ';'
            {
             before(grammarAccess.getMRequieredServiceAccess().getSemicolonKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalFoo.g:2807:1: rule__RSignature__Group__0 : rule__RSignature__Group__0__Impl rule__RSignature__Group__1 ;
    public final void rule__RSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2811:1: ( rule__RSignature__Group__0__Impl rule__RSignature__Group__1 )
            // InternalFoo.g:2812:2: rule__RSignature__Group__0__Impl rule__RSignature__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:2819:1: rule__RSignature__Group__0__Impl : ( ( rule__RSignature__TypeAssignment_0 ) ) ;
    public final void rule__RSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2823:1: ( ( ( rule__RSignature__TypeAssignment_0 ) ) )
            // InternalFoo.g:2824:1: ( ( rule__RSignature__TypeAssignment_0 ) )
            {
            // InternalFoo.g:2824:1: ( ( rule__RSignature__TypeAssignment_0 ) )
            // InternalFoo.g:2825:2: ( rule__RSignature__TypeAssignment_0 )
            {
             before(grammarAccess.getRSignatureAccess().getTypeAssignment_0()); 
            // InternalFoo.g:2826:2: ( rule__RSignature__TypeAssignment_0 )
            // InternalFoo.g:2826:3: rule__RSignature__TypeAssignment_0
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
    // InternalFoo.g:2834:1: rule__RSignature__Group__1 : rule__RSignature__Group__1__Impl rule__RSignature__Group__2 ;
    public final void rule__RSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2838:1: ( rule__RSignature__Group__1__Impl rule__RSignature__Group__2 )
            // InternalFoo.g:2839:2: rule__RSignature__Group__1__Impl rule__RSignature__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalFoo.g:2846:1: rule__RSignature__Group__1__Impl : ( ( rule__RSignature__NameAssignment_1 ) ) ;
    public final void rule__RSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2850:1: ( ( ( rule__RSignature__NameAssignment_1 ) ) )
            // InternalFoo.g:2851:1: ( ( rule__RSignature__NameAssignment_1 ) )
            {
            // InternalFoo.g:2851:1: ( ( rule__RSignature__NameAssignment_1 ) )
            // InternalFoo.g:2852:2: ( rule__RSignature__NameAssignment_1 )
            {
             before(grammarAccess.getRSignatureAccess().getNameAssignment_1()); 
            // InternalFoo.g:2853:2: ( rule__RSignature__NameAssignment_1 )
            // InternalFoo.g:2853:3: rule__RSignature__NameAssignment_1
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
    // InternalFoo.g:2861:1: rule__RSignature__Group__2 : rule__RSignature__Group__2__Impl rule__RSignature__Group__3 ;
    public final void rule__RSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2865:1: ( rule__RSignature__Group__2__Impl rule__RSignature__Group__3 )
            // InternalFoo.g:2866:2: rule__RSignature__Group__2__Impl rule__RSignature__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalFoo.g:2873:1: rule__RSignature__Group__2__Impl : ( '(' ) ;
    public final void rule__RSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2877:1: ( ( '(' ) )
            // InternalFoo.g:2878:1: ( '(' )
            {
            // InternalFoo.g:2878:1: ( '(' )
            // InternalFoo.g:2879:2: '('
            {
             before(grammarAccess.getRSignatureAccess().getLeftParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFoo.g:2888:1: rule__RSignature__Group__3 : rule__RSignature__Group__3__Impl rule__RSignature__Group__4 ;
    public final void rule__RSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2892:1: ( rule__RSignature__Group__3__Impl rule__RSignature__Group__4 )
            // InternalFoo.g:2893:2: rule__RSignature__Group__3__Impl rule__RSignature__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalFoo.g:2900:1: rule__RSignature__Group__3__Impl : ( ( rule__RSignature__AttributesAssignment_3 )? ) ;
    public final void rule__RSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2904:1: ( ( ( rule__RSignature__AttributesAssignment_3 )? ) )
            // InternalFoo.g:2905:1: ( ( rule__RSignature__AttributesAssignment_3 )? )
            {
            // InternalFoo.g:2905:1: ( ( rule__RSignature__AttributesAssignment_3 )? )
            // InternalFoo.g:2906:2: ( rule__RSignature__AttributesAssignment_3 )?
            {
             before(grammarAccess.getRSignatureAccess().getAttributesAssignment_3()); 
            // InternalFoo.g:2907:2: ( rule__RSignature__AttributesAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFoo.g:2907:3: rule__RSignature__AttributesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RSignature__AttributesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRSignatureAccess().getAttributesAssignment_3()); 

            }


            }

        }
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
    // InternalFoo.g:2915:1: rule__RSignature__Group__4 : rule__RSignature__Group__4__Impl rule__RSignature__Group__5 ;
    public final void rule__RSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2919:1: ( rule__RSignature__Group__4__Impl rule__RSignature__Group__5 )
            // InternalFoo.g:2920:2: rule__RSignature__Group__4__Impl rule__RSignature__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalFoo.g:2927:1: rule__RSignature__Group__4__Impl : ( ( rule__RSignature__Group_4__0 )* ) ;
    public final void rule__RSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2931:1: ( ( ( rule__RSignature__Group_4__0 )* ) )
            // InternalFoo.g:2932:1: ( ( rule__RSignature__Group_4__0 )* )
            {
            // InternalFoo.g:2932:1: ( ( rule__RSignature__Group_4__0 )* )
            // InternalFoo.g:2933:2: ( rule__RSignature__Group_4__0 )*
            {
             before(grammarAccess.getRSignatureAccess().getGroup_4()); 
            // InternalFoo.g:2934:2: ( rule__RSignature__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalFoo.g:2934:3: rule__RSignature__Group_4__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__RSignature__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalFoo.g:2942:1: rule__RSignature__Group__5 : rule__RSignature__Group__5__Impl ;
    public final void rule__RSignature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2946:1: ( rule__RSignature__Group__5__Impl )
            // InternalFoo.g:2947:2: rule__RSignature__Group__5__Impl
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
    // InternalFoo.g:2953:1: rule__RSignature__Group__5__Impl : ( ')' ) ;
    public final void rule__RSignature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2957:1: ( ( ')' ) )
            // InternalFoo.g:2958:1: ( ')' )
            {
            // InternalFoo.g:2958:1: ( ')' )
            // InternalFoo.g:2959:2: ')'
            {
             before(grammarAccess.getRSignatureAccess().getRightParenthesisKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalFoo.g:2969:1: rule__RSignature__Group_4__0 : rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1 ;
    public final void rule__RSignature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2973:1: ( rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1 )
            // InternalFoo.g:2974:2: rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:2981:1: rule__RSignature__Group_4__0__Impl : ( ',' ) ;
    public final void rule__RSignature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2985:1: ( ( ',' ) )
            // InternalFoo.g:2986:1: ( ',' )
            {
            // InternalFoo.g:2986:1: ( ',' )
            // InternalFoo.g:2987:2: ','
            {
             before(grammarAccess.getRSignatureAccess().getCommaKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalFoo.g:2996:1: rule__RSignature__Group_4__1 : rule__RSignature__Group_4__1__Impl ;
    public final void rule__RSignature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3000:1: ( rule__RSignature__Group_4__1__Impl )
            // InternalFoo.g:3001:2: rule__RSignature__Group_4__1__Impl
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
    // InternalFoo.g:3007:1: rule__RSignature__Group_4__1__Impl : ( ( rule__RSignature__AttributesAssignment_4_1 ) ) ;
    public final void rule__RSignature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3011:1: ( ( ( rule__RSignature__AttributesAssignment_4_1 ) ) )
            // InternalFoo.g:3012:1: ( ( rule__RSignature__AttributesAssignment_4_1 ) )
            {
            // InternalFoo.g:3012:1: ( ( rule__RSignature__AttributesAssignment_4_1 ) )
            // InternalFoo.g:3013:2: ( rule__RSignature__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getRSignatureAccess().getAttributesAssignment_4_1()); 
            // InternalFoo.g:3014:2: ( rule__RSignature__AttributesAssignment_4_1 )
            // InternalFoo.g:3014:3: rule__RSignature__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RSignature__AttributesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRSignatureAccess().getAttributesAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalFoo.g:3023:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3027:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalFoo.g:3028:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalFoo.g:3035:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3039:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalFoo.g:3040:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalFoo.g:3040:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalFoo.g:3041:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalFoo.g:3042:2: ( rule__Attribute__NameAssignment_0 )
            // InternalFoo.g:3042:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalFoo.g:3050:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3054:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalFoo.g:3055:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalFoo.g:3062:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3066:1: ( ( ':' ) )
            // InternalFoo.g:3067:1: ( ':' )
            {
            // InternalFoo.g:3067:1: ( ':' )
            // InternalFoo.g:3068:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalFoo.g:3077:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3081:1: ( rule__Attribute__Group__2__Impl )
            // InternalFoo.g:3082:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalFoo.g:3088:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3092:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalFoo.g:3093:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalFoo.g:3093:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalFoo.g:3094:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalFoo.g:3095:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalFoo.g:3095:3: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__DomainModel__ModelsAssignment"
    // InternalFoo.g:3104:1: rule__DomainModel__ModelsAssignment : ( ruleModel ) ;
    public final void rule__DomainModel__ModelsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3108:1: ( ( ruleModel ) )
            // InternalFoo.g:3109:2: ( ruleModel )
            {
            // InternalFoo.g:3109:2: ( ruleModel )
            // InternalFoo.g:3110:3: ruleModel
            {
             before(grammarAccess.getDomainModelAccess().getModelsModelParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getModelsModelParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__ModelsAssignment"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalFoo.g:3119:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3123:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3124:2: ( ruleQualifiedName )
            {
            // InternalFoo.g:3124:2: ( ruleQualifiedName )
            // InternalFoo.g:3125:3: ruleQualifiedName
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
    // InternalFoo.g:3134:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3138:1: ( ( ruleImport ) )
            // InternalFoo.g:3139:2: ( ruleImport )
            {
            // InternalFoo.g:3139:2: ( ruleImport )
            // InternalFoo.g:3140:3: ruleImport
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


    // $ANTLR start "rule__Model__ComponentAssignment_4"
    // InternalFoo.g:3149:1: rule__Model__ComponentAssignment_4 : ( ruleComponent ) ;
    public final void rule__Model__ComponentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3153:1: ( ( ruleComponent ) )
            // InternalFoo.g:3154:2: ( ruleComponent )
            {
            // InternalFoo.g:3154:2: ( ruleComponent )
            // InternalFoo.g:3155:3: ruleComponent
            {
             before(grammarAccess.getModelAccess().getComponentComponentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getComponentComponentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ComponentAssignment_4"


    // $ANTLR start "rule__Model__AssemblyAssignment_5"
    // InternalFoo.g:3164:1: rule__Model__AssemblyAssignment_5 : ( ruleAssembly ) ;
    public final void rule__Model__AssemblyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3168:1: ( ( ruleAssembly ) )
            // InternalFoo.g:3169:2: ( ruleAssembly )
            {
            // InternalFoo.g:3169:2: ( ruleAssembly )
            // InternalFoo.g:3170:3: ruleAssembly
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


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_3"
    // InternalFoo.g:3179:1: rule__Import__ImportedNamespaceAssignment_3 : ( ruleFqnWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3183:1: ( ( ruleFqnWithWildCard ) )
            // InternalFoo.g:3184:2: ( ruleFqnWithWildCard )
            {
            // InternalFoo.g:3184:2: ( ruleFqnWithWildCard )
            // InternalFoo.g:3185:3: ruleFqnWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFqnWithWildCard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_3"


    // $ANTLR start "rule__Assembly__NameAssignment_2"
    // InternalFoo.g:3194:1: rule__Assembly__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Assembly__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3198:1: ( ( RULE_ID ) )
            // InternalFoo.g:3199:2: ( RULE_ID )
            {
            // InternalFoo.g:3199:2: ( RULE_ID )
            // InternalFoo.g:3200:3: RULE_ID
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
    // InternalFoo.g:3209:1: rule__Assembly__AttributesAssignment_5 : ( ruleComponentAttribute ) ;
    public final void rule__Assembly__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3213:1: ( ( ruleComponentAttribute ) )
            // InternalFoo.g:3214:2: ( ruleComponentAttribute )
            {
            // InternalFoo.g:3214:2: ( ruleComponentAttribute )
            // InternalFoo.g:3215:3: ruleComponentAttribute
            {
             before(grammarAccess.getAssemblyAccess().getAttributesComponentAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentAttribute();

            state._fsp--;

             after(grammarAccess.getAssemblyAccess().getAttributesComponentAttributeParserRuleCall_5_0()); 

            }


            }

        }
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
    // InternalFoo.g:3224:1: rule__Assembly__AttributesAssignment_6 : ( ruleComponentAttribute ) ;
    public final void rule__Assembly__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3228:1: ( ( ruleComponentAttribute ) )
            // InternalFoo.g:3229:2: ( ruleComponentAttribute )
            {
            // InternalFoo.g:3229:2: ( ruleComponentAttribute )
            // InternalFoo.g:3230:3: ruleComponentAttribute
            {
             before(grammarAccess.getAssemblyAccess().getAttributesComponentAttributeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentAttribute();

            state._fsp--;

             after(grammarAccess.getAssemblyAccess().getAttributesComponentAttributeParserRuleCall_6_0()); 

            }


            }

        }
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
    // InternalFoo.g:3239:1: rule__Assembly__BindingsAssignment_8 : ( ruleBinding ) ;
    public final void rule__Assembly__BindingsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3243:1: ( ( ruleBinding ) )
            // InternalFoo.g:3244:2: ( ruleBinding )
            {
            // InternalFoo.g:3244:2: ( ruleBinding )
            // InternalFoo.g:3245:3: ruleBinding
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


    // $ANTLR start "rule__ComponentAttribute__NameAssignment_0"
    // InternalFoo.g:3254:1: rule__ComponentAttribute__NameAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__ComponentAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3258:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3259:2: ( ruleQualifiedName )
            {
            // InternalFoo.g:3259:2: ( ruleQualifiedName )
            // InternalFoo.g:3260:3: ruleQualifiedName
            {
             before(grammarAccess.getComponentAttributeAccess().getNameQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentAttributeAccess().getNameQualifiedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentAttribute__NameAssignment_0"


    // $ANTLR start "rule__ComponentAttribute__ComposantAssignment_2"
    // InternalFoo.g:3269:1: rule__ComponentAttribute__ComposantAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComponentAttribute__ComposantAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3273:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3274:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3274:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3275:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentAttributeAccess().getComposantComponentCrossReference_2_0()); 
            // InternalFoo.g:3276:3: ( ruleQualifiedName )
            // InternalFoo.g:3277:4: ruleQualifiedName
            {
             before(grammarAccess.getComponentAttributeAccess().getComposantComponentQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentAttributeAccess().getComposantComponentQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getComponentAttributeAccess().getComposantComponentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentAttribute__ComposantAssignment_2"


    // $ANTLR start "rule__Binding__MGAssignment_0"
    // InternalFoo.g:3288:1: rule__Binding__MGAssignment_0 : ( ruleBindingRequiered ) ;
    public final void rule__Binding__MGAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3292:1: ( ( ruleBindingRequiered ) )
            // InternalFoo.g:3293:2: ( ruleBindingRequiered )
            {
            // InternalFoo.g:3293:2: ( ruleBindingRequiered )
            // InternalFoo.g:3294:3: ruleBindingRequiered
            {
             before(grammarAccess.getBindingAccess().getMGBindingRequieredParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBindingRequiered();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getMGBindingRequieredParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__MGAssignment_0"


    // $ANTLR start "rule__Binding__MDAssignment_2"
    // InternalFoo.g:3303:1: rule__Binding__MDAssignment_2 : ( ruleBindingProvided ) ;
    public final void rule__Binding__MDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3307:1: ( ( ruleBindingProvided ) )
            // InternalFoo.g:3308:2: ( ruleBindingProvided )
            {
            // InternalFoo.g:3308:2: ( ruleBindingProvided )
            // InternalFoo.g:3309:3: ruleBindingProvided
            {
             before(grammarAccess.getBindingAccess().getMDBindingProvidedParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBindingProvided();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getMDBindingProvidedParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__MDAssignment_2"


    // $ANTLR start "rule__BindingRequiered__IdAssignment_0"
    // InternalFoo.g:3318:1: rule__BindingRequiered__IdAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingRequiered__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3322:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3323:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3323:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3324:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBindingRequieredAccess().getIdComponentAttributeCrossReference_0_0()); 
            // InternalFoo.g:3325:3: ( ruleQualifiedName )
            // InternalFoo.g:3326:4: ruleQualifiedName
            {
             before(grammarAccess.getBindingRequieredAccess().getIdComponentAttributeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBindingRequieredAccess().getIdComponentAttributeQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBindingRequieredAccess().getIdComponentAttributeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingRequiered__IdAssignment_0"


    // $ANTLR start "rule__BindingRequiered__ServiceAssignment_2"
    // InternalFoo.g:3337:1: rule__BindingRequiered__ServiceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingRequiered__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3341:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3342:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3342:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3343:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBindingRequieredAccess().getServiceRequieredServiceCrossReference_2_0()); 
            // InternalFoo.g:3344:3: ( ruleQualifiedName )
            // InternalFoo.g:3345:4: ruleQualifiedName
            {
             before(grammarAccess.getBindingRequieredAccess().getServiceRequieredServiceQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBindingRequieredAccess().getServiceRequieredServiceQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBindingRequieredAccess().getServiceRequieredServiceCrossReference_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__BindingProvided__IdAssignment_0"
    // InternalFoo.g:3356:1: rule__BindingProvided__IdAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingProvided__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3360:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3361:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3361:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3362:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBindingProvidedAccess().getIdComponentAttributeCrossReference_0_0()); 
            // InternalFoo.g:3363:3: ( ruleQualifiedName )
            // InternalFoo.g:3364:4: ruleQualifiedName
            {
             before(grammarAccess.getBindingProvidedAccess().getIdComponentAttributeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBindingProvidedAccess().getIdComponentAttributeQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBindingProvidedAccess().getIdComponentAttributeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingProvided__IdAssignment_0"


    // $ANTLR start "rule__BindingProvided__ServiceAssignment_2"
    // InternalFoo.g:3375:1: rule__BindingProvided__ServiceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingProvided__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3379:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3380:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3380:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3381:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBindingProvidedAccess().getServiceProvidedServiceCrossReference_2_0()); 
            // InternalFoo.g:3382:3: ( ruleQualifiedName )
            // InternalFoo.g:3383:4: ruleQualifiedName
            {
             before(grammarAccess.getBindingProvidedAccess().getServiceProvidedServiceQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBindingProvidedAccess().getServiceProvidedServiceQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBindingProvidedAccess().getServiceProvidedServiceCrossReference_2_0()); 

            }


            }

        }
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
    // InternalFoo.g:3394:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3398:1: ( ( RULE_ID ) )
            // InternalFoo.g:3399:2: ( RULE_ID )
            {
            // InternalFoo.g:3399:2: ( RULE_ID )
            // InternalFoo.g:3400:3: RULE_ID
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


    // $ANTLR start "rule__Component__ProvidedAssignment_3"
    // InternalFoo.g:3409:1: rule__Component__ProvidedAssignment_3 : ( ruleProvided ) ;
    public final void rule__Component__ProvidedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3413:1: ( ( ruleProvided ) )
            // InternalFoo.g:3414:2: ( ruleProvided )
            {
            // InternalFoo.g:3414:2: ( ruleProvided )
            // InternalFoo.g:3415:3: ruleProvided
            {
             before(grammarAccess.getComponentAccess().getProvidedProvidedParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProvided();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getProvidedProvidedParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ProvidedAssignment_3"


    // $ANTLR start "rule__Component__RequieredAssignment_4"
    // InternalFoo.g:3424:1: rule__Component__RequieredAssignment_4 : ( ruleRequiered ) ;
    public final void rule__Component__RequieredAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3428:1: ( ( ruleRequiered ) )
            // InternalFoo.g:3429:2: ( ruleRequiered )
            {
            // InternalFoo.g:3429:2: ( ruleRequiered )
            // InternalFoo.g:3430:3: ruleRequiered
            {
             before(grammarAccess.getComponentAccess().getRequieredRequieredParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiered();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getRequieredRequieredParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__RequieredAssignment_4"


    // $ANTLR start "rule__Component__MProvServicesAssignment_5"
    // InternalFoo.g:3439:1: rule__Component__MProvServicesAssignment_5 : ( ruleMProvidedService ) ;
    public final void rule__Component__MProvServicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3443:1: ( ( ruleMProvidedService ) )
            // InternalFoo.g:3444:2: ( ruleMProvidedService )
            {
            // InternalFoo.g:3444:2: ( ruleMProvidedService )
            // InternalFoo.g:3445:3: ruleMProvidedService
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
    // InternalFoo.g:3454:1: rule__Component__MReqServicesAssignment_6 : ( ruleMRequieredService ) ;
    public final void rule__Component__MReqServicesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3458:1: ( ( ruleMRequieredService ) )
            // InternalFoo.g:3459:2: ( ruleMRequieredService )
            {
            // InternalFoo.g:3459:2: ( ruleMRequieredService )
            // InternalFoo.g:3460:3: ruleMRequieredService
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


    // $ANTLR start "rule__Provided__ProvidedServicesAssignment_3_0"
    // InternalFoo.g:3469:1: rule__Provided__ProvidedServicesAssignment_3_0 : ( ruleProvidedService ) ;
    public final void rule__Provided__ProvidedServicesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3473:1: ( ( ruleProvidedService ) )
            // InternalFoo.g:3474:2: ( ruleProvidedService )
            {
            // InternalFoo.g:3474:2: ( ruleProvidedService )
            // InternalFoo.g:3475:3: ruleProvidedService
            {
             before(grammarAccess.getProvidedAccess().getProvidedServicesProvidedServiceParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProvidedService();

            state._fsp--;

             after(grammarAccess.getProvidedAccess().getProvidedServicesProvidedServiceParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__ProvidedServicesAssignment_3_0"


    // $ANTLR start "rule__Provided__ProvidedServicesAssignment_3_1_1"
    // InternalFoo.g:3484:1: rule__Provided__ProvidedServicesAssignment_3_1_1 : ( ruleProvidedService ) ;
    public final void rule__Provided__ProvidedServicesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3488:1: ( ( ruleProvidedService ) )
            // InternalFoo.g:3489:2: ( ruleProvidedService )
            {
            // InternalFoo.g:3489:2: ( ruleProvidedService )
            // InternalFoo.g:3490:3: ruleProvidedService
            {
             before(grammarAccess.getProvidedAccess().getProvidedServicesProvidedServiceParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProvidedService();

            state._fsp--;

             after(grammarAccess.getProvidedAccess().getProvidedServicesProvidedServiceParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provided__ProvidedServicesAssignment_3_1_1"


    // $ANTLR start "rule__ProvidedService__NameAssignment"
    // InternalFoo.g:3499:1: rule__ProvidedService__NameAssignment : ( RULE_ID ) ;
    public final void rule__ProvidedService__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3503:1: ( ( RULE_ID ) )
            // InternalFoo.g:3504:2: ( RULE_ID )
            {
            // InternalFoo.g:3504:2: ( RULE_ID )
            // InternalFoo.g:3505:3: RULE_ID
            {
             before(grammarAccess.getProvidedServiceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProvidedServiceAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Requiered__RequieredServicesAssignment_4_0"
    // InternalFoo.g:3514:1: rule__Requiered__RequieredServicesAssignment_4_0 : ( ruleRequieredService ) ;
    public final void rule__Requiered__RequieredServicesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3518:1: ( ( ruleRequieredService ) )
            // InternalFoo.g:3519:2: ( ruleRequieredService )
            {
            // InternalFoo.g:3519:2: ( ruleRequieredService )
            // InternalFoo.g:3520:3: ruleRequieredService
            {
             before(grammarAccess.getRequieredAccess().getRequieredServicesRequieredServiceParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRequieredService();

            state._fsp--;

             after(grammarAccess.getRequieredAccess().getRequieredServicesRequieredServiceParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__RequieredServicesAssignment_4_0"


    // $ANTLR start "rule__Requiered__RequieredServicesAssignment_4_1_1"
    // InternalFoo.g:3529:1: rule__Requiered__RequieredServicesAssignment_4_1_1 : ( ruleRequieredService ) ;
    public final void rule__Requiered__RequieredServicesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3533:1: ( ( ruleRequieredService ) )
            // InternalFoo.g:3534:2: ( ruleRequieredService )
            {
            // InternalFoo.g:3534:2: ( ruleRequieredService )
            // InternalFoo.g:3535:3: ruleRequieredService
            {
             before(grammarAccess.getRequieredAccess().getRequieredServicesRequieredServiceParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequieredService();

            state._fsp--;

             after(grammarAccess.getRequieredAccess().getRequieredServicesRequieredServiceParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requiered__RequieredServicesAssignment_4_1_1"


    // $ANTLR start "rule__RequieredService__NameAssignment"
    // InternalFoo.g:3544:1: rule__RequieredService__NameAssignment : ( RULE_ID ) ;
    public final void rule__RequieredService__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3548:1: ( ( RULE_ID ) )
            // InternalFoo.g:3549:2: ( RULE_ID )
            {
            // InternalFoo.g:3549:2: ( RULE_ID )
            // InternalFoo.g:3550:3: RULE_ID
            {
             before(grammarAccess.getRequieredServiceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequieredServiceAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalFoo.g:3559:1: rule__MProvidedService__SignatureAssignment_2 : ( rulePSignature ) ;
    public final void rule__MProvidedService__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3563:1: ( ( rulePSignature ) )
            // InternalFoo.g:3564:2: ( rulePSignature )
            {
            // InternalFoo.g:3564:2: ( rulePSignature )
            // InternalFoo.g:3565:3: rulePSignature
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
    // InternalFoo.g:3574:1: rule__PSignature__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__PSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3578:1: ( ( RULE_ID ) )
            // InternalFoo.g:3579:2: ( RULE_ID )
            {
            // InternalFoo.g:3579:2: ( RULE_ID )
            // InternalFoo.g:3580:3: RULE_ID
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
    // InternalFoo.g:3589:1: rule__PSignature__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PSignature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3593:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:3594:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:3594:2: ( ( RULE_ID ) )
            // InternalFoo.g:3595:3: ( RULE_ID )
            {
             before(grammarAccess.getPSignatureAccess().getNameProvidedServiceCrossReference_1_0()); 
            // InternalFoo.g:3596:3: ( RULE_ID )
            // InternalFoo.g:3597:4: RULE_ID
            {
             before(grammarAccess.getPSignatureAccess().getNameProvidedServiceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPSignatureAccess().getNameProvidedServiceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPSignatureAccess().getNameProvidedServiceCrossReference_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__PSignature__AttributesAssignment_3"
    // InternalFoo.g:3608:1: rule__PSignature__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__PSignature__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3612:1: ( ( ruleAttribute ) )
            // InternalFoo.g:3613:2: ( ruleAttribute )
            {
            // InternalFoo.g:3613:2: ( ruleAttribute )
            // InternalFoo.g:3614:3: ruleAttribute
            {
             before(grammarAccess.getPSignatureAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getPSignatureAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__AttributesAssignment_3"


    // $ANTLR start "rule__PSignature__AttributesAssignment_4_1"
    // InternalFoo.g:3623:1: rule__PSignature__AttributesAssignment_4_1 : ( ruleAttribute ) ;
    public final void rule__PSignature__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3627:1: ( ( ruleAttribute ) )
            // InternalFoo.g:3628:2: ( ruleAttribute )
            {
            // InternalFoo.g:3628:2: ( ruleAttribute )
            // InternalFoo.g:3629:3: ruleAttribute
            {
             before(grammarAccess.getPSignatureAccess().getAttributesAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getPSignatureAccess().getAttributesAttributeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PSignature__AttributesAssignment_4_1"


    // $ANTLR start "rule__MRequieredService__SignatureAssignment_2"
    // InternalFoo.g:3638:1: rule__MRequieredService__SignatureAssignment_2 : ( ruleRSignature ) ;
    public final void rule__MRequieredService__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3642:1: ( ( ruleRSignature ) )
            // InternalFoo.g:3643:2: ( ruleRSignature )
            {
            // InternalFoo.g:3643:2: ( ruleRSignature )
            // InternalFoo.g:3644:3: ruleRSignature
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
    // InternalFoo.g:3653:1: rule__RSignature__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__RSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3657:1: ( ( RULE_ID ) )
            // InternalFoo.g:3658:2: ( RULE_ID )
            {
            // InternalFoo.g:3658:2: ( RULE_ID )
            // InternalFoo.g:3659:3: RULE_ID
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
    // InternalFoo.g:3668:1: rule__RSignature__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RSignature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3672:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:3673:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:3673:2: ( ( RULE_ID ) )
            // InternalFoo.g:3674:3: ( RULE_ID )
            {
             before(grammarAccess.getRSignatureAccess().getNameRequieredServiceCrossReference_1_0()); 
            // InternalFoo.g:3675:3: ( RULE_ID )
            // InternalFoo.g:3676:4: RULE_ID
            {
             before(grammarAccess.getRSignatureAccess().getNameRequieredServiceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRSignatureAccess().getNameRequieredServiceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRSignatureAccess().getNameRequieredServiceCrossReference_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__RSignature__AttributesAssignment_3"
    // InternalFoo.g:3687:1: rule__RSignature__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__RSignature__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3691:1: ( ( ruleAttribute ) )
            // InternalFoo.g:3692:2: ( ruleAttribute )
            {
            // InternalFoo.g:3692:2: ( ruleAttribute )
            // InternalFoo.g:3693:3: ruleAttribute
            {
             before(grammarAccess.getRSignatureAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRSignatureAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__AttributesAssignment_3"


    // $ANTLR start "rule__RSignature__AttributesAssignment_4_1"
    // InternalFoo.g:3702:1: rule__RSignature__AttributesAssignment_4_1 : ( ruleAttribute ) ;
    public final void rule__RSignature__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3706:1: ( ( ruleAttribute ) )
            // InternalFoo.g:3707:2: ( ruleAttribute )
            {
            // InternalFoo.g:3707:2: ( ruleAttribute )
            // InternalFoo.g:3708:3: ruleAttribute
            {
             before(grammarAccess.getRSignatureAccess().getAttributesAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRSignatureAccess().getAttributesAttributeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RSignature__AttributesAssignment_4_1"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalFoo.g:3717:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3721:1: ( ( RULE_ID ) )
            // InternalFoo.g:3722:2: ( RULE_ID )
            {
            // InternalFoo.g:3722:2: ( RULE_ID )
            // InternalFoo.g:3723:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalFoo.g:3732:1: rule__Attribute__TypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3736:1: ( ( RULE_ID ) )
            // InternalFoo.g:3737:2: ( RULE_ID )
            {
            // InternalFoo.g:3737:2: ( RULE_ID )
            // InternalFoo.g:3738:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000208A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000110000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});

}