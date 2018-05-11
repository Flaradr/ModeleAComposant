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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'Assembly'", "'components'", "'bindings'", "':'", "'-'", "'->'", "'Component'", "'provided'", "'='", "','", "'requiered'", "'service'", "'('", "')'", "';'"
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



    // $ANTLR start "entryRuleFile"
    // InternalFoo.g:53:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalFoo.g:54:1: ( ruleFile EOF )
            // InternalFoo.g:55:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalFoo.g:62:1: ruleFile : ( ( rule__File__ModelsAssignment )* ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:66:2: ( ( ( rule__File__ModelsAssignment )* ) )
            // InternalFoo.g:67:2: ( ( rule__File__ModelsAssignment )* )
            {
            // InternalFoo.g:67:2: ( ( rule__File__ModelsAssignment )* )
            // InternalFoo.g:68:3: ( rule__File__ModelsAssignment )*
            {
             before(grammarAccess.getFileAccess().getModelsAssignment()); 
            // InternalFoo.g:69:3: ( rule__File__ModelsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFoo.g:69:4: rule__File__ModelsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__File__ModelsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getModelsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


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


    // $ANTLR start "entryRuleListOfRequieredServices"
    // InternalFoo.g:378:1: entryRuleListOfRequieredServices : ruleListOfRequieredServices EOF ;
    public final void entryRuleListOfRequieredServices() throws RecognitionException {
        try {
            // InternalFoo.g:379:1: ( ruleListOfRequieredServices EOF )
            // InternalFoo.g:380:1: ruleListOfRequieredServices EOF
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
    // InternalFoo.g:387:1: ruleListOfRequieredServices : ( ( rule__ListOfRequieredServices__Group__0 ) ) ;
    public final void ruleListOfRequieredServices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:391:2: ( ( ( rule__ListOfRequieredServices__Group__0 ) ) )
            // InternalFoo.g:392:2: ( ( rule__ListOfRequieredServices__Group__0 ) )
            {
            // InternalFoo.g:392:2: ( ( rule__ListOfRequieredServices__Group__0 ) )
            // InternalFoo.g:393:3: ( rule__ListOfRequieredServices__Group__0 )
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getGroup()); 
            // InternalFoo.g:394:3: ( rule__ListOfRequieredServices__Group__0 )
            // InternalFoo.g:394:4: rule__ListOfRequieredServices__Group__0
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
    // InternalFoo.g:591:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:595:1: ( ( ( rule__Model__PackageNameAssignment_1 ) ) )
            // InternalFoo.g:596:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            {
            // InternalFoo.g:596:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            // InternalFoo.g:597:2: ( rule__Model__PackageNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 
            // InternalFoo.g:598:2: ( rule__Model__PackageNameAssignment_1 )
            // InternalFoo.g:598:3: rule__Model__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__PackageNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 

            }


            }

        }
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

                if ( (LA3_0==23) ) {
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

                if ( (LA4_0==17) ) {
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
            pushFollow(FOLLOW_4);
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


    // $ANTLR start "rule__FqnWithWildCard__Group__0"
    // InternalFoo.g:903:1: rule__FqnWithWildCard__Group__0 : rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 ;
    public final void rule__FqnWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:907:1: ( rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 )
            // InternalFoo.g:908:2: rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalFoo.g:915:1: rule__FqnWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__FqnWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:919:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:920:1: ( ruleQualifiedName )
            {
            // InternalFoo.g:920:1: ( ruleQualifiedName )
            // InternalFoo.g:921:2: ruleQualifiedName
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
    // InternalFoo.g:930:1: rule__FqnWithWildCard__Group__1 : rule__FqnWithWildCard__Group__1__Impl ;
    public final void rule__FqnWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:934:1: ( rule__FqnWithWildCard__Group__1__Impl )
            // InternalFoo.g:935:2: rule__FqnWithWildCard__Group__1__Impl
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
    // InternalFoo.g:941:1: rule__FqnWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FqnWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:945:1: ( ( ( '.*' )? ) )
            // InternalFoo.g:946:1: ( ( '.*' )? )
            {
            // InternalFoo.g:946:1: ( ( '.*' )? )
            // InternalFoo.g:947:2: ( '.*' )?
            {
             before(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalFoo.g:948:2: ( '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFoo.g:948:3: '.*'
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalFoo.g:957:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:961:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // InternalFoo.g:962:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
            {
            pushFollow(FOLLOW_13);
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
            pushFollow(FOLLOW_14);
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
            pushFollow(FOLLOW_15);
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
            pushFollow(FOLLOW_16);
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
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFoo.g:1144:4: rule__Assembly__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_16);
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
    // InternalFoo.g:1153:1: rule__Assembly__Group__7 : rule__Assembly__Group__7__Impl rule__Assembly__Group__8 ;
    public final void rule__Assembly__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1157:1: ( rule__Assembly__Group__7__Impl rule__Assembly__Group__8 )
            // InternalFoo.g:1158:2: rule__Assembly__Group__7__Impl rule__Assembly__Group__8
            {
            pushFollow(FOLLOW_17);
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
            pushFollow(FOLLOW_17);
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
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFoo.g:1199:3: rule__Assembly__BindingsAssignment_8
            	    {
            	    pushFollow(FOLLOW_16);
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
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:1299:1: rule__ComponentInstance__Group__2__Impl : ( ( rule__ComponentInstance__ComposantAssignment_2 ) ) ;
    public final void rule__ComponentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1303:1: ( ( ( rule__ComponentInstance__ComposantAssignment_2 ) ) )
            // InternalFoo.g:1304:1: ( ( rule__ComponentInstance__ComposantAssignment_2 ) )
            {
            // InternalFoo.g:1304:1: ( ( rule__ComponentInstance__ComposantAssignment_2 ) )
            // InternalFoo.g:1305:2: ( rule__ComponentInstance__ComposantAssignment_2 )
            {
             before(grammarAccess.getComponentInstanceAccess().getComposantAssignment_2()); 
            // InternalFoo.g:1306:2: ( rule__ComponentInstance__ComposantAssignment_2 )
            // InternalFoo.g:1306:3: rule__ComponentInstance__ComposantAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__ComposantAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getComposantAssignment_2()); 

            }


            }

        }
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
            pushFollow(FOLLOW_19);
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
    // InternalFoo.g:1327:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__MGAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1331:1: ( ( ( rule__Binding__MGAssignment_0 ) ) )
            // InternalFoo.g:1332:1: ( ( rule__Binding__MGAssignment_0 ) )
            {
            // InternalFoo.g:1332:1: ( ( rule__Binding__MGAssignment_0 ) )
            // InternalFoo.g:1333:2: ( rule__Binding__MGAssignment_0 )
            {
             before(grammarAccess.getBindingAccess().getMGAssignment_0()); 
            // InternalFoo.g:1334:2: ( rule__Binding__MGAssignment_0 )
            // InternalFoo.g:1334:3: rule__Binding__MGAssignment_0
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
    // InternalFoo.g:1342:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1346:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalFoo.g:1347:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
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
    // InternalFoo.g:1380:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__MDAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1384:1: ( ( ( rule__Binding__MDAssignment_2 ) ) )
            // InternalFoo.g:1385:1: ( ( rule__Binding__MDAssignment_2 ) )
            {
            // InternalFoo.g:1385:1: ( ( rule__Binding__MDAssignment_2 ) )
            // InternalFoo.g:1386:2: ( rule__Binding__MDAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getMDAssignment_2()); 
            // InternalFoo.g:1387:2: ( rule__Binding__MDAssignment_2 )
            // InternalFoo.g:1387:3: rule__Binding__MDAssignment_2
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
    // InternalFoo.g:1396:1: rule__BindingRequiered__Group__0 : rule__BindingRequiered__Group__0__Impl rule__BindingRequiered__Group__1 ;
    public final void rule__BindingRequiered__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1400:1: ( rule__BindingRequiered__Group__0__Impl rule__BindingRequiered__Group__1 )
            // InternalFoo.g:1401:2: rule__BindingRequiered__Group__0__Impl rule__BindingRequiered__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFoo.g:1408:1: rule__BindingRequiered__Group__0__Impl : ( ( rule__BindingRequiered__IdAssignment_0 ) ) ;
    public final void rule__BindingRequiered__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1412:1: ( ( ( rule__BindingRequiered__IdAssignment_0 ) ) )
            // InternalFoo.g:1413:1: ( ( rule__BindingRequiered__IdAssignment_0 ) )
            {
            // InternalFoo.g:1413:1: ( ( rule__BindingRequiered__IdAssignment_0 ) )
            // InternalFoo.g:1414:2: ( rule__BindingRequiered__IdAssignment_0 )
            {
             before(grammarAccess.getBindingRequieredAccess().getIdAssignment_0()); 
            // InternalFoo.g:1415:2: ( rule__BindingRequiered__IdAssignment_0 )
            // InternalFoo.g:1415:3: rule__BindingRequiered__IdAssignment_0
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
    // InternalFoo.g:1423:1: rule__BindingRequiered__Group__1 : rule__BindingRequiered__Group__1__Impl rule__BindingRequiered__Group__2 ;
    public final void rule__BindingRequiered__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1427:1: ( rule__BindingRequiered__Group__1__Impl rule__BindingRequiered__Group__2 )
            // InternalFoo.g:1428:2: rule__BindingRequiered__Group__1__Impl rule__BindingRequiered__Group__2
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
    // InternalFoo.g:1435:1: rule__BindingRequiered__Group__1__Impl : ( '->' ) ;
    public final void rule__BindingRequiered__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1439:1: ( ( '->' ) )
            // InternalFoo.g:1440:1: ( '->' )
            {
            // InternalFoo.g:1440:1: ( '->' )
            // InternalFoo.g:1441:2: '->'
            {
             before(grammarAccess.getBindingRequieredAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalFoo.g:1450:1: rule__BindingRequiered__Group__2 : rule__BindingRequiered__Group__2__Impl ;
    public final void rule__BindingRequiered__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1454:1: ( rule__BindingRequiered__Group__2__Impl )
            // InternalFoo.g:1455:2: rule__BindingRequiered__Group__2__Impl
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
    // InternalFoo.g:1461:1: rule__BindingRequiered__Group__2__Impl : ( ( rule__BindingRequiered__ServiceAssignment_2 ) ) ;
    public final void rule__BindingRequiered__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1465:1: ( ( ( rule__BindingRequiered__ServiceAssignment_2 ) ) )
            // InternalFoo.g:1466:1: ( ( rule__BindingRequiered__ServiceAssignment_2 ) )
            {
            // InternalFoo.g:1466:1: ( ( rule__BindingRequiered__ServiceAssignment_2 ) )
            // InternalFoo.g:1467:2: ( rule__BindingRequiered__ServiceAssignment_2 )
            {
             before(grammarAccess.getBindingRequieredAccess().getServiceAssignment_2()); 
            // InternalFoo.g:1468:2: ( rule__BindingRequiered__ServiceAssignment_2 )
            // InternalFoo.g:1468:3: rule__BindingRequiered__ServiceAssignment_2
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
    // InternalFoo.g:1477:1: rule__BindingProvided__Group__0 : rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1 ;
    public final void rule__BindingProvided__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1481:1: ( rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1 )
            // InternalFoo.g:1482:2: rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFoo.g:1489:1: rule__BindingProvided__Group__0__Impl : ( ( rule__BindingProvided__IdAssignment_0 ) ) ;
    public final void rule__BindingProvided__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1493:1: ( ( ( rule__BindingProvided__IdAssignment_0 ) ) )
            // InternalFoo.g:1494:1: ( ( rule__BindingProvided__IdAssignment_0 ) )
            {
            // InternalFoo.g:1494:1: ( ( rule__BindingProvided__IdAssignment_0 ) )
            // InternalFoo.g:1495:2: ( rule__BindingProvided__IdAssignment_0 )
            {
             before(grammarAccess.getBindingProvidedAccess().getIdAssignment_0()); 
            // InternalFoo.g:1496:2: ( rule__BindingProvided__IdAssignment_0 )
            // InternalFoo.g:1496:3: rule__BindingProvided__IdAssignment_0
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
    // InternalFoo.g:1504:1: rule__BindingProvided__Group__1 : rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2 ;
    public final void rule__BindingProvided__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1508:1: ( rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2 )
            // InternalFoo.g:1509:2: rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2
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
    // InternalFoo.g:1516:1: rule__BindingProvided__Group__1__Impl : ( '->' ) ;
    public final void rule__BindingProvided__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1520:1: ( ( '->' ) )
            // InternalFoo.g:1521:1: ( '->' )
            {
            // InternalFoo.g:1521:1: ( '->' )
            // InternalFoo.g:1522:2: '->'
            {
             before(grammarAccess.getBindingProvidedAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
            match(input,23,FOLLOW_2); 
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
            pushFollow(FOLLOW_21);
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
    // InternalFoo.g:1624:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1628:1: ( ( '{' ) )
            // InternalFoo.g:1629:1: ( '{' )
            {
            // InternalFoo.g:1629:1: ( '{' )
            // InternalFoo.g:1630:2: '{'
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
    // InternalFoo.g:1639:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1643:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalFoo.g:1644:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalFoo.g:1651:1: rule__Component__Group__3__Impl : ( ( rule__Component__ListOfPServicesAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1655:1: ( ( ( rule__Component__ListOfPServicesAssignment_3 ) ) )
            // InternalFoo.g:1656:1: ( ( rule__Component__ListOfPServicesAssignment_3 ) )
            {
            // InternalFoo.g:1656:1: ( ( rule__Component__ListOfPServicesAssignment_3 ) )
            // InternalFoo.g:1657:2: ( rule__Component__ListOfPServicesAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getListOfPServicesAssignment_3()); 
            // InternalFoo.g:1658:2: ( rule__Component__ListOfPServicesAssignment_3 )
            // InternalFoo.g:1658:3: rule__Component__ListOfPServicesAssignment_3
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
    // InternalFoo.g:1666:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1670:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalFoo.g:1671:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalFoo.g:1678:1: rule__Component__Group__4__Impl : ( ( rule__Component__ListOfRServicesAssignment_4 ) ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1682:1: ( ( ( rule__Component__ListOfRServicesAssignment_4 ) ) )
            // InternalFoo.g:1683:1: ( ( rule__Component__ListOfRServicesAssignment_4 ) )
            {
            // InternalFoo.g:1683:1: ( ( rule__Component__ListOfRServicesAssignment_4 ) )
            // InternalFoo.g:1684:2: ( rule__Component__ListOfRServicesAssignment_4 )
            {
             before(grammarAccess.getComponentAccess().getListOfRServicesAssignment_4()); 
            // InternalFoo.g:1685:2: ( rule__Component__ListOfRServicesAssignment_4 )
            // InternalFoo.g:1685:3: rule__Component__ListOfRServicesAssignment_4
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
    // InternalFoo.g:1693:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1697:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalFoo.g:1698:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalFoo.g:1705:1: rule__Component__Group__5__Impl : ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1709:1: ( ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) ) )
            // InternalFoo.g:1710:1: ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) )
            {
            // InternalFoo.g:1710:1: ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) )
            // InternalFoo.g:1711:2: ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* )
            {
            // InternalFoo.g:1711:2: ( ( rule__Component__MProvServicesAssignment_5 ) )
            // InternalFoo.g:1712:3: ( rule__Component__MProvServicesAssignment_5 )
            {
             before(grammarAccess.getComponentAccess().getMProvServicesAssignment_5()); 
            // InternalFoo.g:1713:3: ( rule__Component__MProvServicesAssignment_5 )
            // InternalFoo.g:1713:4: rule__Component__MProvServicesAssignment_5
            {
            pushFollow(FOLLOW_25);
            rule__Component__MProvServicesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getMProvServicesAssignment_5()); 

            }

            // InternalFoo.g:1716:2: ( ( rule__Component__MProvServicesAssignment_5 )* )
            // InternalFoo.g:1717:3: ( rule__Component__MProvServicesAssignment_5 )*
            {
             before(grammarAccess.getComponentAccess().getMProvServicesAssignment_5()); 
            // InternalFoo.g:1718:3: ( rule__Component__MProvServicesAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==24) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalFoo.g:1718:4: rule__Component__MProvServicesAssignment_5
            	    {
            	    pushFollow(FOLLOW_25);
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
    // InternalFoo.g:1727:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1731:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalFoo.g:1732:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalFoo.g:1739:1: rule__Component__Group__6__Impl : ( ( rule__Component__MReqServicesAssignment_6 )* ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1743:1: ( ( ( rule__Component__MReqServicesAssignment_6 )* ) )
            // InternalFoo.g:1744:1: ( ( rule__Component__MReqServicesAssignment_6 )* )
            {
            // InternalFoo.g:1744:1: ( ( rule__Component__MReqServicesAssignment_6 )* )
            // InternalFoo.g:1745:2: ( rule__Component__MReqServicesAssignment_6 )*
            {
             before(grammarAccess.getComponentAccess().getMReqServicesAssignment_6()); 
            // InternalFoo.g:1746:2: ( rule__Component__MReqServicesAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFoo.g:1746:3: rule__Component__MReqServicesAssignment_6
            	    {
            	    pushFollow(FOLLOW_25);
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
    // InternalFoo.g:1754:1: rule__Component__Group__7 : rule__Component__Group__7__Impl ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1758:1: ( rule__Component__Group__7__Impl )
            // InternalFoo.g:1759:2: rule__Component__Group__7__Impl
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
    // InternalFoo.g:1765:1: rule__Component__Group__7__Impl : ( '}' ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1769:1: ( ( '}' ) )
            // InternalFoo.g:1770:1: ( '}' )
            {
            // InternalFoo.g:1770:1: ( '}' )
            // InternalFoo.g:1771:2: '}'
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
    // InternalFoo.g:1781:1: rule__ListOfProvidedServices__Group__0 : rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1 ;
    public final void rule__ListOfProvidedServices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1785:1: ( rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1 )
            // InternalFoo.g:1786:2: rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalFoo.g:1793:1: rule__ListOfProvidedServices__Group__0__Impl : ( 'provided' ) ;
    public final void rule__ListOfProvidedServices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1797:1: ( ( 'provided' ) )
            // InternalFoo.g:1798:1: ( 'provided' )
            {
            // InternalFoo.g:1798:1: ( 'provided' )
            // InternalFoo.g:1799:2: 'provided'
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getProvidedKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFoo.g:1808:1: rule__ListOfProvidedServices__Group__1 : rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2 ;
    public final void rule__ListOfProvidedServices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1812:1: ( rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2 )
            // InternalFoo.g:1813:2: rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalFoo.g:1820:1: rule__ListOfProvidedServices__Group__1__Impl : ( '=' ) ;
    public final void rule__ListOfProvidedServices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1824:1: ( ( '=' ) )
            // InternalFoo.g:1825:1: ( '=' )
            {
            // InternalFoo.g:1825:1: ( '=' )
            // InternalFoo.g:1826:2: '='
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFoo.g:1835:1: rule__ListOfProvidedServices__Group__2 : rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3 ;
    public final void rule__ListOfProvidedServices__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1839:1: ( rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3 )
            // InternalFoo.g:1840:2: rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:1847:1: rule__ListOfProvidedServices__Group__2__Impl : ( '{' ) ;
    public final void rule__ListOfProvidedServices__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1851:1: ( ( '{' ) )
            // InternalFoo.g:1852:1: ( '{' )
            {
            // InternalFoo.g:1852:1: ( '{' )
            // InternalFoo.g:1853:2: '{'
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
    // InternalFoo.g:1862:1: rule__ListOfProvidedServices__Group__3 : rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4 ;
    public final void rule__ListOfProvidedServices__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1866:1: ( rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4 )
            // InternalFoo.g:1867:2: rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalFoo.g:1874:1: rule__ListOfProvidedServices__Group__3__Impl : ( ( rule__ListOfProvidedServices__Group_3__0 ) ) ;
    public final void rule__ListOfProvidedServices__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1878:1: ( ( ( rule__ListOfProvidedServices__Group_3__0 ) ) )
            // InternalFoo.g:1879:1: ( ( rule__ListOfProvidedServices__Group_3__0 ) )
            {
            // InternalFoo.g:1879:1: ( ( rule__ListOfProvidedServices__Group_3__0 ) )
            // InternalFoo.g:1880:2: ( rule__ListOfProvidedServices__Group_3__0 )
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getGroup_3()); 
            // InternalFoo.g:1881:2: ( rule__ListOfProvidedServices__Group_3__0 )
            // InternalFoo.g:1881:3: rule__ListOfProvidedServices__Group_3__0
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
    // InternalFoo.g:1889:1: rule__ListOfProvidedServices__Group__4 : rule__ListOfProvidedServices__Group__4__Impl ;
    public final void rule__ListOfProvidedServices__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1893:1: ( rule__ListOfProvidedServices__Group__4__Impl )
            // InternalFoo.g:1894:2: rule__ListOfProvidedServices__Group__4__Impl
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
    // InternalFoo.g:1900:1: rule__ListOfProvidedServices__Group__4__Impl : ( '}' ) ;
    public final void rule__ListOfProvidedServices__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1904:1: ( ( '}' ) )
            // InternalFoo.g:1905:1: ( '}' )
            {
            // InternalFoo.g:1905:1: ( '}' )
            // InternalFoo.g:1906:2: '}'
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
    // InternalFoo.g:1916:1: rule__ListOfProvidedServices__Group_3__0 : rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1 ;
    public final void rule__ListOfProvidedServices__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1920:1: ( rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1 )
            // InternalFoo.g:1921:2: rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalFoo.g:1928:1: rule__ListOfProvidedServices__Group_3__0__Impl : ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) ) ;
    public final void rule__ListOfProvidedServices__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1932:1: ( ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) ) )
            // InternalFoo.g:1933:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) )
            {
            // InternalFoo.g:1933:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) )
            // InternalFoo.g:1934:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 )
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_0()); 
            // InternalFoo.g:1935:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 )
            // InternalFoo.g:1935:3: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0
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
    // InternalFoo.g:1943:1: rule__ListOfProvidedServices__Group_3__1 : rule__ListOfProvidedServices__Group_3__1__Impl ;
    public final void rule__ListOfProvidedServices__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1947:1: ( rule__ListOfProvidedServices__Group_3__1__Impl )
            // InternalFoo.g:1948:2: rule__ListOfProvidedServices__Group_3__1__Impl
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
    // InternalFoo.g:1954:1: rule__ListOfProvidedServices__Group_3__1__Impl : ( ( rule__ListOfProvidedServices__Group_3_1__0 )* ) ;
    public final void rule__ListOfProvidedServices__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1958:1: ( ( ( rule__ListOfProvidedServices__Group_3_1__0 )* ) )
            // InternalFoo.g:1959:1: ( ( rule__ListOfProvidedServices__Group_3_1__0 )* )
            {
            // InternalFoo.g:1959:1: ( ( rule__ListOfProvidedServices__Group_3_1__0 )* )
            // InternalFoo.g:1960:2: ( rule__ListOfProvidedServices__Group_3_1__0 )*
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getGroup_3_1()); 
            // InternalFoo.g:1961:2: ( rule__ListOfProvidedServices__Group_3_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFoo.g:1961:3: rule__ListOfProvidedServices__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__ListOfProvidedServices__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalFoo.g:1970:1: rule__ListOfProvidedServices__Group_3_1__0 : rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1 ;
    public final void rule__ListOfProvidedServices__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1974:1: ( rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1 )
            // InternalFoo.g:1975:2: rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:1982:1: rule__ListOfProvidedServices__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfProvidedServices__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1986:1: ( ( ',' ) )
            // InternalFoo.g:1987:1: ( ',' )
            {
            // InternalFoo.g:1987:1: ( ',' )
            // InternalFoo.g:1988:2: ','
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getCommaKeyword_3_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFoo.g:1997:1: rule__ListOfProvidedServices__Group_3_1__1 : rule__ListOfProvidedServices__Group_3_1__1__Impl ;
    public final void rule__ListOfProvidedServices__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2001:1: ( rule__ListOfProvidedServices__Group_3_1__1__Impl )
            // InternalFoo.g:2002:2: rule__ListOfProvidedServices__Group_3_1__1__Impl
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
    // InternalFoo.g:2008:1: rule__ListOfProvidedServices__Group_3_1__1__Impl : ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) ) ;
    public final void rule__ListOfProvidedServices__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2012:1: ( ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) ) )
            // InternalFoo.g:2013:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) )
            {
            // InternalFoo.g:2013:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) )
            // InternalFoo.g:2014:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 )
            {
             before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_1_1()); 
            // InternalFoo.g:2015:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 )
            // InternalFoo.g:2015:3: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1
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
    // InternalFoo.g:2024:1: rule__ListOfRequieredServices__Group__0 : rule__ListOfRequieredServices__Group__0__Impl rule__ListOfRequieredServices__Group__1 ;
    public final void rule__ListOfRequieredServices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2028:1: ( rule__ListOfRequieredServices__Group__0__Impl rule__ListOfRequieredServices__Group__1 )
            // InternalFoo.g:2029:2: rule__ListOfRequieredServices__Group__0__Impl rule__ListOfRequieredServices__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalFoo.g:2036:1: rule__ListOfRequieredServices__Group__0__Impl : ( () ) ;
    public final void rule__ListOfRequieredServices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2040:1: ( ( () ) )
            // InternalFoo.g:2041:1: ( () )
            {
            // InternalFoo.g:2041:1: ( () )
            // InternalFoo.g:2042:2: ()
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getListOfRequieredServicesAction_0()); 
            // InternalFoo.g:2043:2: ()
            // InternalFoo.g:2043:3: 
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
    // InternalFoo.g:2051:1: rule__ListOfRequieredServices__Group__1 : rule__ListOfRequieredServices__Group__1__Impl rule__ListOfRequieredServices__Group__2 ;
    public final void rule__ListOfRequieredServices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2055:1: ( rule__ListOfRequieredServices__Group__1__Impl rule__ListOfRequieredServices__Group__2 )
            // InternalFoo.g:2056:2: rule__ListOfRequieredServices__Group__1__Impl rule__ListOfRequieredServices__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalFoo.g:2063:1: rule__ListOfRequieredServices__Group__1__Impl : ( 'requiered' ) ;
    public final void rule__ListOfRequieredServices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2067:1: ( ( 'requiered' ) )
            // InternalFoo.g:2068:1: ( 'requiered' )
            {
            // InternalFoo.g:2068:1: ( 'requiered' )
            // InternalFoo.g:2069:2: 'requiered'
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getRequieredKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFoo.g:2078:1: rule__ListOfRequieredServices__Group__2 : rule__ListOfRequieredServices__Group__2__Impl rule__ListOfRequieredServices__Group__3 ;
    public final void rule__ListOfRequieredServices__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2082:1: ( rule__ListOfRequieredServices__Group__2__Impl rule__ListOfRequieredServices__Group__3 )
            // InternalFoo.g:2083:2: rule__ListOfRequieredServices__Group__2__Impl rule__ListOfRequieredServices__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalFoo.g:2090:1: rule__ListOfRequieredServices__Group__2__Impl : ( '=' ) ;
    public final void rule__ListOfRequieredServices__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2094:1: ( ( '=' ) )
            // InternalFoo.g:2095:1: ( '=' )
            {
            // InternalFoo.g:2095:1: ( '=' )
            // InternalFoo.g:2096:2: '='
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getEqualsSignKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalFoo.g:2105:1: rule__ListOfRequieredServices__Group__3 : rule__ListOfRequieredServices__Group__3__Impl rule__ListOfRequieredServices__Group__4 ;
    public final void rule__ListOfRequieredServices__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2109:1: ( rule__ListOfRequieredServices__Group__3__Impl rule__ListOfRequieredServices__Group__4 )
            // InternalFoo.g:2110:2: rule__ListOfRequieredServices__Group__3__Impl rule__ListOfRequieredServices__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalFoo.g:2117:1: rule__ListOfRequieredServices__Group__3__Impl : ( '{' ) ;
    public final void rule__ListOfRequieredServices__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2121:1: ( ( '{' ) )
            // InternalFoo.g:2122:1: ( '{' )
            {
            // InternalFoo.g:2122:1: ( '{' )
            // InternalFoo.g:2123:2: '{'
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
    // InternalFoo.g:2132:1: rule__ListOfRequieredServices__Group__4 : rule__ListOfRequieredServices__Group__4__Impl rule__ListOfRequieredServices__Group__5 ;
    public final void rule__ListOfRequieredServices__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2136:1: ( rule__ListOfRequieredServices__Group__4__Impl rule__ListOfRequieredServices__Group__5 )
            // InternalFoo.g:2137:2: rule__ListOfRequieredServices__Group__4__Impl rule__ListOfRequieredServices__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalFoo.g:2144:1: rule__ListOfRequieredServices__Group__4__Impl : ( ( rule__ListOfRequieredServices__Group_4__0 ) ) ;
    public final void rule__ListOfRequieredServices__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2148:1: ( ( ( rule__ListOfRequieredServices__Group_4__0 ) ) )
            // InternalFoo.g:2149:1: ( ( rule__ListOfRequieredServices__Group_4__0 ) )
            {
            // InternalFoo.g:2149:1: ( ( rule__ListOfRequieredServices__Group_4__0 ) )
            // InternalFoo.g:2150:2: ( rule__ListOfRequieredServices__Group_4__0 )
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getGroup_4()); 
            // InternalFoo.g:2151:2: ( rule__ListOfRequieredServices__Group_4__0 )
            // InternalFoo.g:2151:3: rule__ListOfRequieredServices__Group_4__0
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
    // InternalFoo.g:2159:1: rule__ListOfRequieredServices__Group__5 : rule__ListOfRequieredServices__Group__5__Impl ;
    public final void rule__ListOfRequieredServices__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2163:1: ( rule__ListOfRequieredServices__Group__5__Impl )
            // InternalFoo.g:2164:2: rule__ListOfRequieredServices__Group__5__Impl
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
    // InternalFoo.g:2170:1: rule__ListOfRequieredServices__Group__5__Impl : ( '}' ) ;
    public final void rule__ListOfRequieredServices__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2174:1: ( ( '}' ) )
            // InternalFoo.g:2175:1: ( '}' )
            {
            // InternalFoo.g:2175:1: ( '}' )
            // InternalFoo.g:2176:2: '}'
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
    // InternalFoo.g:2186:1: rule__ListOfRequieredServices__Group_4__0 : rule__ListOfRequieredServices__Group_4__0__Impl rule__ListOfRequieredServices__Group_4__1 ;
    public final void rule__ListOfRequieredServices__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2190:1: ( rule__ListOfRequieredServices__Group_4__0__Impl rule__ListOfRequieredServices__Group_4__1 )
            // InternalFoo.g:2191:2: rule__ListOfRequieredServices__Group_4__0__Impl rule__ListOfRequieredServices__Group_4__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalFoo.g:2198:1: rule__ListOfRequieredServices__Group_4__0__Impl : ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_0 )? ) ;
    public final void rule__ListOfRequieredServices__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2202:1: ( ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_0 )? ) )
            // InternalFoo.g:2203:1: ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_0 )? )
            {
            // InternalFoo.g:2203:1: ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_0 )? )
            // InternalFoo.g:2204:2: ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_0 )?
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getRequieredServicesAssignment_4_0()); 
            // InternalFoo.g:2205:2: ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFoo.g:2205:3: rule__ListOfRequieredServices__RequieredServicesAssignment_4_0
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
    // InternalFoo.g:2213:1: rule__ListOfRequieredServices__Group_4__1 : rule__ListOfRequieredServices__Group_4__1__Impl ;
    public final void rule__ListOfRequieredServices__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2217:1: ( rule__ListOfRequieredServices__Group_4__1__Impl )
            // InternalFoo.g:2218:2: rule__ListOfRequieredServices__Group_4__1__Impl
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
    // InternalFoo.g:2224:1: rule__ListOfRequieredServices__Group_4__1__Impl : ( ( rule__ListOfRequieredServices__Group_4_1__0 )* ) ;
    public final void rule__ListOfRequieredServices__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2228:1: ( ( ( rule__ListOfRequieredServices__Group_4_1__0 )* ) )
            // InternalFoo.g:2229:1: ( ( rule__ListOfRequieredServices__Group_4_1__0 )* )
            {
            // InternalFoo.g:2229:1: ( ( rule__ListOfRequieredServices__Group_4_1__0 )* )
            // InternalFoo.g:2230:2: ( rule__ListOfRequieredServices__Group_4_1__0 )*
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getGroup_4_1()); 
            // InternalFoo.g:2231:2: ( rule__ListOfRequieredServices__Group_4_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFoo.g:2231:3: rule__ListOfRequieredServices__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__ListOfRequieredServices__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalFoo.g:2240:1: rule__ListOfRequieredServices__Group_4_1__0 : rule__ListOfRequieredServices__Group_4_1__0__Impl rule__ListOfRequieredServices__Group_4_1__1 ;
    public final void rule__ListOfRequieredServices__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2244:1: ( rule__ListOfRequieredServices__Group_4_1__0__Impl rule__ListOfRequieredServices__Group_4_1__1 )
            // InternalFoo.g:2245:2: rule__ListOfRequieredServices__Group_4_1__0__Impl rule__ListOfRequieredServices__Group_4_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:2252:1: rule__ListOfRequieredServices__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfRequieredServices__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2256:1: ( ( ',' ) )
            // InternalFoo.g:2257:1: ( ',' )
            {
            // InternalFoo.g:2257:1: ( ',' )
            // InternalFoo.g:2258:2: ','
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getCommaKeyword_4_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFoo.g:2267:1: rule__ListOfRequieredServices__Group_4_1__1 : rule__ListOfRequieredServices__Group_4_1__1__Impl ;
    public final void rule__ListOfRequieredServices__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2271:1: ( rule__ListOfRequieredServices__Group_4_1__1__Impl )
            // InternalFoo.g:2272:2: rule__ListOfRequieredServices__Group_4_1__1__Impl
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
    // InternalFoo.g:2278:1: rule__ListOfRequieredServices__Group_4_1__1__Impl : ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1 ) ) ;
    public final void rule__ListOfRequieredServices__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2282:1: ( ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1 ) ) )
            // InternalFoo.g:2283:1: ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1 ) )
            {
            // InternalFoo.g:2283:1: ( ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1 ) )
            // InternalFoo.g:2284:2: ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1 )
            {
             before(grammarAccess.getListOfRequieredServicesAccess().getRequieredServicesAssignment_4_1_1()); 
            // InternalFoo.g:2285:2: ( rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1 )
            // InternalFoo.g:2285:3: rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1
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
    // InternalFoo.g:2294:1: rule__MProvidedService__Group__0 : rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1 ;
    public final void rule__MProvidedService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2298:1: ( rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1 )
            // InternalFoo.g:2299:2: rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalFoo.g:2306:1: rule__MProvidedService__Group__0__Impl : ( 'service' ) ;
    public final void rule__MProvidedService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2310:1: ( ( 'service' ) )
            // InternalFoo.g:2311:1: ( 'service' )
            {
            // InternalFoo.g:2311:1: ( 'service' )
            // InternalFoo.g:2312:2: 'service'
            {
             before(grammarAccess.getMProvidedServiceAccess().getServiceKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalFoo.g:2321:1: rule__MProvidedService__Group__1 : rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2 ;
    public final void rule__MProvidedService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2325:1: ( rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2 )
            // InternalFoo.g:2326:2: rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2
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
    // InternalFoo.g:2333:1: rule__MProvidedService__Group__1__Impl : ( 'provided' ) ;
    public final void rule__MProvidedService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2337:1: ( ( 'provided' ) )
            // InternalFoo.g:2338:1: ( 'provided' )
            {
            // InternalFoo.g:2338:1: ( 'provided' )
            // InternalFoo.g:2339:2: 'provided'
            {
             before(grammarAccess.getMProvidedServiceAccess().getProvidedKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalFoo.g:2348:1: rule__MProvidedService__Group__2 : rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3 ;
    public final void rule__MProvidedService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2352:1: ( rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3 )
            // InternalFoo.g:2353:2: rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3
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
    // InternalFoo.g:2360:1: rule__MProvidedService__Group__2__Impl : ( ( rule__MProvidedService__SignatureAssignment_2 ) ) ;
    public final void rule__MProvidedService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2364:1: ( ( ( rule__MProvidedService__SignatureAssignment_2 ) ) )
            // InternalFoo.g:2365:1: ( ( rule__MProvidedService__SignatureAssignment_2 ) )
            {
            // InternalFoo.g:2365:1: ( ( rule__MProvidedService__SignatureAssignment_2 ) )
            // InternalFoo.g:2366:2: ( rule__MProvidedService__SignatureAssignment_2 )
            {
             before(grammarAccess.getMProvidedServiceAccess().getSignatureAssignment_2()); 
            // InternalFoo.g:2367:2: ( rule__MProvidedService__SignatureAssignment_2 )
            // InternalFoo.g:2367:3: rule__MProvidedService__SignatureAssignment_2
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
    // InternalFoo.g:2375:1: rule__MProvidedService__Group__3 : rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4 ;
    public final void rule__MProvidedService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2379:1: ( rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4 )
            // InternalFoo.g:2380:2: rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalFoo.g:2387:1: rule__MProvidedService__Group__3__Impl : ( '{' ) ;
    public final void rule__MProvidedService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2391:1: ( ( '{' ) )
            // InternalFoo.g:2392:1: ( '{' )
            {
            // InternalFoo.g:2392:1: ( '{' )
            // InternalFoo.g:2393:2: '{'
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
    // InternalFoo.g:2402:1: rule__MProvidedService__Group__4 : rule__MProvidedService__Group__4__Impl ;
    public final void rule__MProvidedService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2406:1: ( rule__MProvidedService__Group__4__Impl )
            // InternalFoo.g:2407:2: rule__MProvidedService__Group__4__Impl
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
    // InternalFoo.g:2413:1: rule__MProvidedService__Group__4__Impl : ( '}' ) ;
    public final void rule__MProvidedService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2417:1: ( ( '}' ) )
            // InternalFoo.g:2418:1: ( '}' )
            {
            // InternalFoo.g:2418:1: ( '}' )
            // InternalFoo.g:2419:2: '}'
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
    // InternalFoo.g:2429:1: rule__PSignature__Group__0 : rule__PSignature__Group__0__Impl rule__PSignature__Group__1 ;
    public final void rule__PSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2433:1: ( rule__PSignature__Group__0__Impl rule__PSignature__Group__1 )
            // InternalFoo.g:2434:2: rule__PSignature__Group__0__Impl rule__PSignature__Group__1
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
    // InternalFoo.g:2441:1: rule__PSignature__Group__0__Impl : ( ( rule__PSignature__TypeAssignment_0 ) ) ;
    public final void rule__PSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2445:1: ( ( ( rule__PSignature__TypeAssignment_0 ) ) )
            // InternalFoo.g:2446:1: ( ( rule__PSignature__TypeAssignment_0 ) )
            {
            // InternalFoo.g:2446:1: ( ( rule__PSignature__TypeAssignment_0 ) )
            // InternalFoo.g:2447:2: ( rule__PSignature__TypeAssignment_0 )
            {
             before(grammarAccess.getPSignatureAccess().getTypeAssignment_0()); 
            // InternalFoo.g:2448:2: ( rule__PSignature__TypeAssignment_0 )
            // InternalFoo.g:2448:3: rule__PSignature__TypeAssignment_0
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
    // InternalFoo.g:2456:1: rule__PSignature__Group__1 : rule__PSignature__Group__1__Impl rule__PSignature__Group__2 ;
    public final void rule__PSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2460:1: ( rule__PSignature__Group__1__Impl rule__PSignature__Group__2 )
            // InternalFoo.g:2461:2: rule__PSignature__Group__1__Impl rule__PSignature__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalFoo.g:2468:1: rule__PSignature__Group__1__Impl : ( ( rule__PSignature__NameAssignment_1 ) ) ;
    public final void rule__PSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2472:1: ( ( ( rule__PSignature__NameAssignment_1 ) ) )
            // InternalFoo.g:2473:1: ( ( rule__PSignature__NameAssignment_1 ) )
            {
            // InternalFoo.g:2473:1: ( ( rule__PSignature__NameAssignment_1 ) )
            // InternalFoo.g:2474:2: ( rule__PSignature__NameAssignment_1 )
            {
             before(grammarAccess.getPSignatureAccess().getNameAssignment_1()); 
            // InternalFoo.g:2475:2: ( rule__PSignature__NameAssignment_1 )
            // InternalFoo.g:2475:3: rule__PSignature__NameAssignment_1
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
    // InternalFoo.g:2483:1: rule__PSignature__Group__2 : rule__PSignature__Group__2__Impl rule__PSignature__Group__3 ;
    public final void rule__PSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2487:1: ( rule__PSignature__Group__2__Impl rule__PSignature__Group__3 )
            // InternalFoo.g:2488:2: rule__PSignature__Group__2__Impl rule__PSignature__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalFoo.g:2495:1: rule__PSignature__Group__2__Impl : ( '(' ) ;
    public final void rule__PSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2499:1: ( ( '(' ) )
            // InternalFoo.g:2500:1: ( '(' )
            {
            // InternalFoo.g:2500:1: ( '(' )
            // InternalFoo.g:2501:2: '('
            {
             before(grammarAccess.getPSignatureAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalFoo.g:2510:1: rule__PSignature__Group__3 : rule__PSignature__Group__3__Impl rule__PSignature__Group__4 ;
    public final void rule__PSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2514:1: ( rule__PSignature__Group__3__Impl rule__PSignature__Group__4 )
            // InternalFoo.g:2515:2: rule__PSignature__Group__3__Impl rule__PSignature__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalFoo.g:2522:1: rule__PSignature__Group__3__Impl : ( ( rule__PSignature__AttributesAssignment_3 )? ) ;
    public final void rule__PSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2526:1: ( ( ( rule__PSignature__AttributesAssignment_3 )? ) )
            // InternalFoo.g:2527:1: ( ( rule__PSignature__AttributesAssignment_3 )? )
            {
            // InternalFoo.g:2527:1: ( ( rule__PSignature__AttributesAssignment_3 )? )
            // InternalFoo.g:2528:2: ( rule__PSignature__AttributesAssignment_3 )?
            {
             before(grammarAccess.getPSignatureAccess().getAttributesAssignment_3()); 
            // InternalFoo.g:2529:2: ( rule__PSignature__AttributesAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFoo.g:2529:3: rule__PSignature__AttributesAssignment_3
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
    // InternalFoo.g:2537:1: rule__PSignature__Group__4 : rule__PSignature__Group__4__Impl rule__PSignature__Group__5 ;
    public final void rule__PSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2541:1: ( rule__PSignature__Group__4__Impl rule__PSignature__Group__5 )
            // InternalFoo.g:2542:2: rule__PSignature__Group__4__Impl rule__PSignature__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalFoo.g:2549:1: rule__PSignature__Group__4__Impl : ( ( rule__PSignature__Group_4__0 )* ) ;
    public final void rule__PSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2553:1: ( ( ( rule__PSignature__Group_4__0 )* ) )
            // InternalFoo.g:2554:1: ( ( rule__PSignature__Group_4__0 )* )
            {
            // InternalFoo.g:2554:1: ( ( rule__PSignature__Group_4__0 )* )
            // InternalFoo.g:2555:2: ( rule__PSignature__Group_4__0 )*
            {
             before(grammarAccess.getPSignatureAccess().getGroup_4()); 
            // InternalFoo.g:2556:2: ( rule__PSignature__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFoo.g:2556:3: rule__PSignature__Group_4__0
            	    {
            	    pushFollow(FOLLOW_29);
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
    // InternalFoo.g:2564:1: rule__PSignature__Group__5 : rule__PSignature__Group__5__Impl ;
    public final void rule__PSignature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2568:1: ( rule__PSignature__Group__5__Impl )
            // InternalFoo.g:2569:2: rule__PSignature__Group__5__Impl
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
    // InternalFoo.g:2575:1: rule__PSignature__Group__5__Impl : ( ')' ) ;
    public final void rule__PSignature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2579:1: ( ( ')' ) )
            // InternalFoo.g:2580:1: ( ')' )
            {
            // InternalFoo.g:2580:1: ( ')' )
            // InternalFoo.g:2581:2: ')'
            {
             before(grammarAccess.getPSignatureAccess().getRightParenthesisKeyword_5()); 
            match(input,30,FOLLOW_2); 
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
    // InternalFoo.g:2591:1: rule__PSignature__Group_4__0 : rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1 ;
    public final void rule__PSignature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2595:1: ( rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1 )
            // InternalFoo.g:2596:2: rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1
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
    // InternalFoo.g:2603:1: rule__PSignature__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PSignature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2607:1: ( ( ',' ) )
            // InternalFoo.g:2608:1: ( ',' )
            {
            // InternalFoo.g:2608:1: ( ',' )
            // InternalFoo.g:2609:2: ','
            {
             before(grammarAccess.getPSignatureAccess().getCommaKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFoo.g:2618:1: rule__PSignature__Group_4__1 : rule__PSignature__Group_4__1__Impl ;
    public final void rule__PSignature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2622:1: ( rule__PSignature__Group_4__1__Impl )
            // InternalFoo.g:2623:2: rule__PSignature__Group_4__1__Impl
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
    // InternalFoo.g:2629:1: rule__PSignature__Group_4__1__Impl : ( ( rule__PSignature__AttributesAssignment_4_1 ) ) ;
    public final void rule__PSignature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2633:1: ( ( ( rule__PSignature__AttributesAssignment_4_1 ) ) )
            // InternalFoo.g:2634:1: ( ( rule__PSignature__AttributesAssignment_4_1 ) )
            {
            // InternalFoo.g:2634:1: ( ( rule__PSignature__AttributesAssignment_4_1 ) )
            // InternalFoo.g:2635:2: ( rule__PSignature__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getPSignatureAccess().getAttributesAssignment_4_1()); 
            // InternalFoo.g:2636:2: ( rule__PSignature__AttributesAssignment_4_1 )
            // InternalFoo.g:2636:3: rule__PSignature__AttributesAssignment_4_1
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
    // InternalFoo.g:2645:1: rule__MRequieredService__Group__0 : rule__MRequieredService__Group__0__Impl rule__MRequieredService__Group__1 ;
    public final void rule__MRequieredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2649:1: ( rule__MRequieredService__Group__0__Impl rule__MRequieredService__Group__1 )
            // InternalFoo.g:2650:2: rule__MRequieredService__Group__0__Impl rule__MRequieredService__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalFoo.g:2657:1: rule__MRequieredService__Group__0__Impl : ( 'service' ) ;
    public final void rule__MRequieredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2661:1: ( ( 'service' ) )
            // InternalFoo.g:2662:1: ( 'service' )
            {
            // InternalFoo.g:2662:1: ( 'service' )
            // InternalFoo.g:2663:2: 'service'
            {
             before(grammarAccess.getMRequieredServiceAccess().getServiceKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalFoo.g:2672:1: rule__MRequieredService__Group__1 : rule__MRequieredService__Group__1__Impl rule__MRequieredService__Group__2 ;
    public final void rule__MRequieredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2676:1: ( rule__MRequieredService__Group__1__Impl rule__MRequieredService__Group__2 )
            // InternalFoo.g:2677:2: rule__MRequieredService__Group__1__Impl rule__MRequieredService__Group__2
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
    // InternalFoo.g:2684:1: rule__MRequieredService__Group__1__Impl : ( 'requiered' ) ;
    public final void rule__MRequieredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2688:1: ( ( 'requiered' ) )
            // InternalFoo.g:2689:1: ( 'requiered' )
            {
            // InternalFoo.g:2689:1: ( 'requiered' )
            // InternalFoo.g:2690:2: 'requiered'
            {
             before(grammarAccess.getMRequieredServiceAccess().getRequieredKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFoo.g:2699:1: rule__MRequieredService__Group__2 : rule__MRequieredService__Group__2__Impl rule__MRequieredService__Group__3 ;
    public final void rule__MRequieredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2703:1: ( rule__MRequieredService__Group__2__Impl rule__MRequieredService__Group__3 )
            // InternalFoo.g:2704:2: rule__MRequieredService__Group__2__Impl rule__MRequieredService__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalFoo.g:2711:1: rule__MRequieredService__Group__2__Impl : ( ( rule__MRequieredService__SignatureAssignment_2 ) ) ;
    public final void rule__MRequieredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2715:1: ( ( ( rule__MRequieredService__SignatureAssignment_2 ) ) )
            // InternalFoo.g:2716:1: ( ( rule__MRequieredService__SignatureAssignment_2 ) )
            {
            // InternalFoo.g:2716:1: ( ( rule__MRequieredService__SignatureAssignment_2 ) )
            // InternalFoo.g:2717:2: ( rule__MRequieredService__SignatureAssignment_2 )
            {
             before(grammarAccess.getMRequieredServiceAccess().getSignatureAssignment_2()); 
            // InternalFoo.g:2718:2: ( rule__MRequieredService__SignatureAssignment_2 )
            // InternalFoo.g:2718:3: rule__MRequieredService__SignatureAssignment_2
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
    // InternalFoo.g:2726:1: rule__MRequieredService__Group__3 : rule__MRequieredService__Group__3__Impl ;
    public final void rule__MRequieredService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2730:1: ( rule__MRequieredService__Group__3__Impl )
            // InternalFoo.g:2731:2: rule__MRequieredService__Group__3__Impl
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
    // InternalFoo.g:2737:1: rule__MRequieredService__Group__3__Impl : ( ';' ) ;
    public final void rule__MRequieredService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2741:1: ( ( ';' ) )
            // InternalFoo.g:2742:1: ( ';' )
            {
            // InternalFoo.g:2742:1: ( ';' )
            // InternalFoo.g:2743:2: ';'
            {
             before(grammarAccess.getMRequieredServiceAccess().getSemicolonKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFoo.g:2753:1: rule__RSignature__Group__0 : rule__RSignature__Group__0__Impl rule__RSignature__Group__1 ;
    public final void rule__RSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2757:1: ( rule__RSignature__Group__0__Impl rule__RSignature__Group__1 )
            // InternalFoo.g:2758:2: rule__RSignature__Group__0__Impl rule__RSignature__Group__1
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
    // InternalFoo.g:2765:1: rule__RSignature__Group__0__Impl : ( ( rule__RSignature__TypeAssignment_0 ) ) ;
    public final void rule__RSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2769:1: ( ( ( rule__RSignature__TypeAssignment_0 ) ) )
            // InternalFoo.g:2770:1: ( ( rule__RSignature__TypeAssignment_0 ) )
            {
            // InternalFoo.g:2770:1: ( ( rule__RSignature__TypeAssignment_0 ) )
            // InternalFoo.g:2771:2: ( rule__RSignature__TypeAssignment_0 )
            {
             before(grammarAccess.getRSignatureAccess().getTypeAssignment_0()); 
            // InternalFoo.g:2772:2: ( rule__RSignature__TypeAssignment_0 )
            // InternalFoo.g:2772:3: rule__RSignature__TypeAssignment_0
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
    // InternalFoo.g:2780:1: rule__RSignature__Group__1 : rule__RSignature__Group__1__Impl rule__RSignature__Group__2 ;
    public final void rule__RSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2784:1: ( rule__RSignature__Group__1__Impl rule__RSignature__Group__2 )
            // InternalFoo.g:2785:2: rule__RSignature__Group__1__Impl rule__RSignature__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalFoo.g:2792:1: rule__RSignature__Group__1__Impl : ( ( rule__RSignature__NameAssignment_1 ) ) ;
    public final void rule__RSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2796:1: ( ( ( rule__RSignature__NameAssignment_1 ) ) )
            // InternalFoo.g:2797:1: ( ( rule__RSignature__NameAssignment_1 ) )
            {
            // InternalFoo.g:2797:1: ( ( rule__RSignature__NameAssignment_1 ) )
            // InternalFoo.g:2798:2: ( rule__RSignature__NameAssignment_1 )
            {
             before(grammarAccess.getRSignatureAccess().getNameAssignment_1()); 
            // InternalFoo.g:2799:2: ( rule__RSignature__NameAssignment_1 )
            // InternalFoo.g:2799:3: rule__RSignature__NameAssignment_1
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
    // InternalFoo.g:2807:1: rule__RSignature__Group__2 : rule__RSignature__Group__2__Impl rule__RSignature__Group__3 ;
    public final void rule__RSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2811:1: ( rule__RSignature__Group__2__Impl rule__RSignature__Group__3 )
            // InternalFoo.g:2812:2: rule__RSignature__Group__2__Impl rule__RSignature__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalFoo.g:2819:1: rule__RSignature__Group__2__Impl : ( '(' ) ;
    public final void rule__RSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2823:1: ( ( '(' ) )
            // InternalFoo.g:2824:1: ( '(' )
            {
            // InternalFoo.g:2824:1: ( '(' )
            // InternalFoo.g:2825:2: '('
            {
             before(grammarAccess.getRSignatureAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalFoo.g:2834:1: rule__RSignature__Group__3 : rule__RSignature__Group__3__Impl rule__RSignature__Group__4 ;
    public final void rule__RSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2838:1: ( rule__RSignature__Group__3__Impl rule__RSignature__Group__4 )
            // InternalFoo.g:2839:2: rule__RSignature__Group__3__Impl rule__RSignature__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalFoo.g:2846:1: rule__RSignature__Group__3__Impl : ( ( rule__RSignature__AttributesAssignment_3 )? ) ;
    public final void rule__RSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2850:1: ( ( ( rule__RSignature__AttributesAssignment_3 )? ) )
            // InternalFoo.g:2851:1: ( ( rule__RSignature__AttributesAssignment_3 )? )
            {
            // InternalFoo.g:2851:1: ( ( rule__RSignature__AttributesAssignment_3 )? )
            // InternalFoo.g:2852:2: ( rule__RSignature__AttributesAssignment_3 )?
            {
             before(grammarAccess.getRSignatureAccess().getAttributesAssignment_3()); 
            // InternalFoo.g:2853:2: ( rule__RSignature__AttributesAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFoo.g:2853:3: rule__RSignature__AttributesAssignment_3
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
    // InternalFoo.g:2861:1: rule__RSignature__Group__4 : rule__RSignature__Group__4__Impl rule__RSignature__Group__5 ;
    public final void rule__RSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2865:1: ( rule__RSignature__Group__4__Impl rule__RSignature__Group__5 )
            // InternalFoo.g:2866:2: rule__RSignature__Group__4__Impl rule__RSignature__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalFoo.g:2873:1: rule__RSignature__Group__4__Impl : ( ( rule__RSignature__Group_4__0 )* ) ;
    public final void rule__RSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2877:1: ( ( ( rule__RSignature__Group_4__0 )* ) )
            // InternalFoo.g:2878:1: ( ( rule__RSignature__Group_4__0 )* )
            {
            // InternalFoo.g:2878:1: ( ( rule__RSignature__Group_4__0 )* )
            // InternalFoo.g:2879:2: ( rule__RSignature__Group_4__0 )*
            {
             before(grammarAccess.getRSignatureAccess().getGroup_4()); 
            // InternalFoo.g:2880:2: ( rule__RSignature__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalFoo.g:2880:3: rule__RSignature__Group_4__0
            	    {
            	    pushFollow(FOLLOW_29);
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
    // InternalFoo.g:2888:1: rule__RSignature__Group__5 : rule__RSignature__Group__5__Impl ;
    public final void rule__RSignature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2892:1: ( rule__RSignature__Group__5__Impl )
            // InternalFoo.g:2893:2: rule__RSignature__Group__5__Impl
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
    // InternalFoo.g:2899:1: rule__RSignature__Group__5__Impl : ( ')' ) ;
    public final void rule__RSignature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2903:1: ( ( ')' ) )
            // InternalFoo.g:2904:1: ( ')' )
            {
            // InternalFoo.g:2904:1: ( ')' )
            // InternalFoo.g:2905:2: ')'
            {
             before(grammarAccess.getRSignatureAccess().getRightParenthesisKeyword_5()); 
            match(input,30,FOLLOW_2); 
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
    // InternalFoo.g:2915:1: rule__RSignature__Group_4__0 : rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1 ;
    public final void rule__RSignature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2919:1: ( rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1 )
            // InternalFoo.g:2920:2: rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1
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
    // InternalFoo.g:2927:1: rule__RSignature__Group_4__0__Impl : ( ',' ) ;
    public final void rule__RSignature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2931:1: ( ( ',' ) )
            // InternalFoo.g:2932:1: ( ',' )
            {
            // InternalFoo.g:2932:1: ( ',' )
            // InternalFoo.g:2933:2: ','
            {
             before(grammarAccess.getRSignatureAccess().getCommaKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFoo.g:2942:1: rule__RSignature__Group_4__1 : rule__RSignature__Group_4__1__Impl ;
    public final void rule__RSignature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2946:1: ( rule__RSignature__Group_4__1__Impl )
            // InternalFoo.g:2947:2: rule__RSignature__Group_4__1__Impl
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
    // InternalFoo.g:2953:1: rule__RSignature__Group_4__1__Impl : ( ( rule__RSignature__AttributesAssignment_4_1 ) ) ;
    public final void rule__RSignature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2957:1: ( ( ( rule__RSignature__AttributesAssignment_4_1 ) ) )
            // InternalFoo.g:2958:1: ( ( rule__RSignature__AttributesAssignment_4_1 ) )
            {
            // InternalFoo.g:2958:1: ( ( rule__RSignature__AttributesAssignment_4_1 ) )
            // InternalFoo.g:2959:2: ( rule__RSignature__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getRSignatureAccess().getAttributesAssignment_4_1()); 
            // InternalFoo.g:2960:2: ( rule__RSignature__AttributesAssignment_4_1 )
            // InternalFoo.g:2960:3: rule__RSignature__AttributesAssignment_4_1
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
    // InternalFoo.g:2969:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2973:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalFoo.g:2974:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalFoo.g:2981:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__IdAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2985:1: ( ( ( rule__Attribute__IdAssignment_0 ) ) )
            // InternalFoo.g:2986:1: ( ( rule__Attribute__IdAssignment_0 ) )
            {
            // InternalFoo.g:2986:1: ( ( rule__Attribute__IdAssignment_0 ) )
            // InternalFoo.g:2987:2: ( rule__Attribute__IdAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getIdAssignment_0()); 
            // InternalFoo.g:2988:2: ( rule__Attribute__IdAssignment_0 )
            // InternalFoo.g:2988:3: rule__Attribute__IdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getIdAssignment_0()); 

            }


            }

        }
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
    // InternalFoo.g:2996:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3000:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalFoo.g:3001:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalFoo.g:3008:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3012:1: ( ( ':' ) )
            // InternalFoo.g:3013:1: ( ':' )
            {
            // InternalFoo.g:3013:1: ( ':' )
            // InternalFoo.g:3014:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalFoo.g:3023:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3027:1: ( rule__Attribute__Group__2__Impl )
            // InternalFoo.g:3028:2: rule__Attribute__Group__2__Impl
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
    // InternalFoo.g:3034:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3038:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalFoo.g:3039:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalFoo.g:3039:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalFoo.g:3040:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalFoo.g:3041:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalFoo.g:3041:3: rule__Attribute__TypeAssignment_2
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


    // $ANTLR start "rule__File__ModelsAssignment"
    // InternalFoo.g:3050:1: rule__File__ModelsAssignment : ( ruleModel ) ;
    public final void rule__File__ModelsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3054:1: ( ( ruleModel ) )
            // InternalFoo.g:3055:2: ( ruleModel )
            {
            // InternalFoo.g:3055:2: ( ruleModel )
            // InternalFoo.g:3056:3: ruleModel
            {
             before(grammarAccess.getFileAccess().getModelsModelParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getFileAccess().getModelsModelParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__ModelsAssignment"


    // $ANTLR start "rule__Model__PackageNameAssignment_1"
    // InternalFoo.g:3065:1: rule__Model__PackageNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3069:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3070:2: ( ruleQualifiedName )
            {
            // InternalFoo.g:3070:2: ( ruleQualifiedName )
            // InternalFoo.g:3071:3: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackageNameAssignment_1"


    // $ANTLR start "rule__Model__ImportsAssignment_3"
    // InternalFoo.g:3080:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3084:1: ( ( ruleImport ) )
            // InternalFoo.g:3085:2: ( ruleImport )
            {
            // InternalFoo.g:3085:2: ( ruleImport )
            // InternalFoo.g:3086:3: ruleImport
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
    // InternalFoo.g:3095:1: rule__Model__ComponentAssignment_4 : ( ruleComponent ) ;
    public final void rule__Model__ComponentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3099:1: ( ( ruleComponent ) )
            // InternalFoo.g:3100:2: ( ruleComponent )
            {
            // InternalFoo.g:3100:2: ( ruleComponent )
            // InternalFoo.g:3101:3: ruleComponent
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
    // InternalFoo.g:3110:1: rule__Model__AssemblyAssignment_5 : ( ruleAssembly ) ;
    public final void rule__Model__AssemblyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3114:1: ( ( ruleAssembly ) )
            // InternalFoo.g:3115:2: ( ruleAssembly )
            {
            // InternalFoo.g:3115:2: ( ruleAssembly )
            // InternalFoo.g:3116:3: ruleAssembly
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
    // InternalFoo.g:3125:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleFqnWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3129:1: ( ( ruleFqnWithWildCard ) )
            // InternalFoo.g:3130:2: ( ruleFqnWithWildCard )
            {
            // InternalFoo.g:3130:2: ( ruleFqnWithWildCard )
            // InternalFoo.g:3131:3: ruleFqnWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFqnWithWildCard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalFoo.g:3140:1: rule__Assembly__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Assembly__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3144:1: ( ( RULE_ID ) )
            // InternalFoo.g:3145:2: ( RULE_ID )
            {
            // InternalFoo.g:3145:2: ( RULE_ID )
            // InternalFoo.g:3146:3: RULE_ID
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
    // InternalFoo.g:3155:1: rule__Assembly__AttributesAssignment_5 : ( ruleComponentInstance ) ;
    public final void rule__Assembly__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3159:1: ( ( ruleComponentInstance ) )
            // InternalFoo.g:3160:2: ( ruleComponentInstance )
            {
            // InternalFoo.g:3160:2: ( ruleComponentInstance )
            // InternalFoo.g:3161:3: ruleComponentInstance
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
    // InternalFoo.g:3170:1: rule__Assembly__AttributesAssignment_6 : ( ruleComponentInstance ) ;
    public final void rule__Assembly__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3174:1: ( ( ruleComponentInstance ) )
            // InternalFoo.g:3175:2: ( ruleComponentInstance )
            {
            // InternalFoo.g:3175:2: ( ruleComponentInstance )
            // InternalFoo.g:3176:3: ruleComponentInstance
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
    // InternalFoo.g:3185:1: rule__Assembly__BindingsAssignment_8 : ( ruleBinding ) ;
    public final void rule__Assembly__BindingsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3189:1: ( ( ruleBinding ) )
            // InternalFoo.g:3190:2: ( ruleBinding )
            {
            // InternalFoo.g:3190:2: ( ruleBinding )
            // InternalFoo.g:3191:3: ruleBinding
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
    // InternalFoo.g:3200:1: rule__ComponentInstance__NameAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__ComponentInstance__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3204:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3205:2: ( ruleQualifiedName )
            {
            // InternalFoo.g:3205:2: ( ruleQualifiedName )
            // InternalFoo.g:3206:3: ruleQualifiedName
            {
             before(grammarAccess.getComponentInstanceAccess().getNameQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentInstanceAccess().getNameQualifiedNameParserRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComponentInstance__ComposantAssignment_2"
    // InternalFoo.g:3215:1: rule__ComponentInstance__ComposantAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComponentInstance__ComposantAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3219:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3220:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3220:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3221:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentInstanceAccess().getComposantComponentCrossReference_2_0()); 
            // InternalFoo.g:3222:3: ( ruleQualifiedName )
            // InternalFoo.g:3223:4: ruleQualifiedName
            {
             before(grammarAccess.getComponentInstanceAccess().getComposantComponentQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentInstanceAccess().getComposantComponentQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getComponentInstanceAccess().getComposantComponentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__ComposantAssignment_2"


    // $ANTLR start "rule__Binding__MGAssignment_0"
    // InternalFoo.g:3234:1: rule__Binding__MGAssignment_0 : ( ruleBindingRequiered ) ;
    public final void rule__Binding__MGAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3238:1: ( ( ruleBindingRequiered ) )
            // InternalFoo.g:3239:2: ( ruleBindingRequiered )
            {
            // InternalFoo.g:3239:2: ( ruleBindingRequiered )
            // InternalFoo.g:3240:3: ruleBindingRequiered
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
    // InternalFoo.g:3249:1: rule__Binding__MDAssignment_2 : ( ruleBindingProvided ) ;
    public final void rule__Binding__MDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3253:1: ( ( ruleBindingProvided ) )
            // InternalFoo.g:3254:2: ( ruleBindingProvided )
            {
            // InternalFoo.g:3254:2: ( ruleBindingProvided )
            // InternalFoo.g:3255:3: ruleBindingProvided
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
    // InternalFoo.g:3264:1: rule__BindingRequiered__IdAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingRequiered__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3268:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3269:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3269:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3270:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBindingRequieredAccess().getIdComponentInstanceCrossReference_0_0()); 
            // InternalFoo.g:3271:3: ( ruleQualifiedName )
            // InternalFoo.g:3272:4: ruleQualifiedName
            {
             before(grammarAccess.getBindingRequieredAccess().getIdComponentInstanceQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBindingRequieredAccess().getIdComponentInstanceQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBindingRequieredAccess().getIdComponentInstanceCrossReference_0_0()); 

            }


            }

        }
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
    // InternalFoo.g:3283:1: rule__BindingRequiered__ServiceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingRequiered__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3287:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3288:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3288:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3289:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBindingRequieredAccess().getServiceRequieredServiceCrossReference_2_0()); 
            // InternalFoo.g:3290:3: ( ruleQualifiedName )
            // InternalFoo.g:3291:4: ruleQualifiedName
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
    // InternalFoo.g:3302:1: rule__BindingProvided__IdAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingProvided__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3306:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3307:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3307:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3308:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBindingProvidedAccess().getIdComponentInstanceCrossReference_0_0()); 
            // InternalFoo.g:3309:3: ( ruleQualifiedName )
            // InternalFoo.g:3310:4: ruleQualifiedName
            {
             before(grammarAccess.getBindingProvidedAccess().getIdComponentInstanceQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBindingProvidedAccess().getIdComponentInstanceQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBindingProvidedAccess().getIdComponentInstanceCrossReference_0_0()); 

            }


            }

        }
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
    // InternalFoo.g:3321:1: rule__BindingProvided__ServiceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingProvided__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3325:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:3326:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:3326:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:3327:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBindingProvidedAccess().getServiceProvidedServiceCrossReference_2_0()); 
            // InternalFoo.g:3328:3: ( ruleQualifiedName )
            // InternalFoo.g:3329:4: ruleQualifiedName
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
    // InternalFoo.g:3340:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3344:1: ( ( RULE_ID ) )
            // InternalFoo.g:3345:2: ( RULE_ID )
            {
            // InternalFoo.g:3345:2: ( RULE_ID )
            // InternalFoo.g:3346:3: RULE_ID
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
    // InternalFoo.g:3355:1: rule__Component__ListOfPServicesAssignment_3 : ( ruleListOfProvidedServices ) ;
    public final void rule__Component__ListOfPServicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3359:1: ( ( ruleListOfProvidedServices ) )
            // InternalFoo.g:3360:2: ( ruleListOfProvidedServices )
            {
            // InternalFoo.g:3360:2: ( ruleListOfProvidedServices )
            // InternalFoo.g:3361:3: ruleListOfProvidedServices
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
    // InternalFoo.g:3370:1: rule__Component__ListOfRServicesAssignment_4 : ( ruleListOfRequieredServices ) ;
    public final void rule__Component__ListOfRServicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3374:1: ( ( ruleListOfRequieredServices ) )
            // InternalFoo.g:3375:2: ( ruleListOfRequieredServices )
            {
            // InternalFoo.g:3375:2: ( ruleListOfRequieredServices )
            // InternalFoo.g:3376:3: ruleListOfRequieredServices
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
    // InternalFoo.g:3385:1: rule__Component__MProvServicesAssignment_5 : ( ruleMProvidedService ) ;
    public final void rule__Component__MProvServicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3389:1: ( ( ruleMProvidedService ) )
            // InternalFoo.g:3390:2: ( ruleMProvidedService )
            {
            // InternalFoo.g:3390:2: ( ruleMProvidedService )
            // InternalFoo.g:3391:3: ruleMProvidedService
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
    // InternalFoo.g:3400:1: rule__Component__MReqServicesAssignment_6 : ( ruleMRequieredService ) ;
    public final void rule__Component__MReqServicesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3404:1: ( ( ruleMRequieredService ) )
            // InternalFoo.g:3405:2: ( ruleMRequieredService )
            {
            // InternalFoo.g:3405:2: ( ruleMRequieredService )
            // InternalFoo.g:3406:3: ruleMRequieredService
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
    // InternalFoo.g:3415:1: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 : ( ruleProvidedService ) ;
    public final void rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3419:1: ( ( ruleProvidedService ) )
            // InternalFoo.g:3420:2: ( ruleProvidedService )
            {
            // InternalFoo.g:3420:2: ( ruleProvidedService )
            // InternalFoo.g:3421:3: ruleProvidedService
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
    // InternalFoo.g:3430:1: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 : ( ruleProvidedService ) ;
    public final void rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3434:1: ( ( ruleProvidedService ) )
            // InternalFoo.g:3435:2: ( ruleProvidedService )
            {
            // InternalFoo.g:3435:2: ( ruleProvidedService )
            // InternalFoo.g:3436:3: ruleProvidedService
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
    // InternalFoo.g:3445:1: rule__ProvidedService__NameAssignment : ( RULE_ID ) ;
    public final void rule__ProvidedService__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3449:1: ( ( RULE_ID ) )
            // InternalFoo.g:3450:2: ( RULE_ID )
            {
            // InternalFoo.g:3450:2: ( RULE_ID )
            // InternalFoo.g:3451:3: RULE_ID
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


    // $ANTLR start "rule__ListOfRequieredServices__RequieredServicesAssignment_4_0"
    // InternalFoo.g:3460:1: rule__ListOfRequieredServices__RequieredServicesAssignment_4_0 : ( ruleRequieredService ) ;
    public final void rule__ListOfRequieredServices__RequieredServicesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3464:1: ( ( ruleRequieredService ) )
            // InternalFoo.g:3465:2: ( ruleRequieredService )
            {
            // InternalFoo.g:3465:2: ( ruleRequieredService )
            // InternalFoo.g:3466:3: ruleRequieredService
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
    // InternalFoo.g:3475:1: rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1 : ( ruleRequieredService ) ;
    public final void rule__ListOfRequieredServices__RequieredServicesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3479:1: ( ( ruleRequieredService ) )
            // InternalFoo.g:3480:2: ( ruleRequieredService )
            {
            // InternalFoo.g:3480:2: ( ruleRequieredService )
            // InternalFoo.g:3481:3: ruleRequieredService
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
    // InternalFoo.g:3490:1: rule__RequieredService__NameAssignment : ( RULE_ID ) ;
    public final void rule__RequieredService__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3494:1: ( ( RULE_ID ) )
            // InternalFoo.g:3495:2: ( RULE_ID )
            {
            // InternalFoo.g:3495:2: ( RULE_ID )
            // InternalFoo.g:3496:3: RULE_ID
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
    // InternalFoo.g:3505:1: rule__MProvidedService__SignatureAssignment_2 : ( rulePSignature ) ;
    public final void rule__MProvidedService__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3509:1: ( ( rulePSignature ) )
            // InternalFoo.g:3510:2: ( rulePSignature )
            {
            // InternalFoo.g:3510:2: ( rulePSignature )
            // InternalFoo.g:3511:3: rulePSignature
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
    // InternalFoo.g:3520:1: rule__PSignature__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__PSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3524:1: ( ( RULE_ID ) )
            // InternalFoo.g:3525:2: ( RULE_ID )
            {
            // InternalFoo.g:3525:2: ( RULE_ID )
            // InternalFoo.g:3526:3: RULE_ID
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
    // InternalFoo.g:3535:1: rule__PSignature__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PSignature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3539:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:3540:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:3540:2: ( ( RULE_ID ) )
            // InternalFoo.g:3541:3: ( RULE_ID )
            {
             before(grammarAccess.getPSignatureAccess().getNameProvidedServiceCrossReference_1_0()); 
            // InternalFoo.g:3542:3: ( RULE_ID )
            // InternalFoo.g:3543:4: RULE_ID
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
    // InternalFoo.g:3554:1: rule__PSignature__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__PSignature__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3558:1: ( ( ruleAttribute ) )
            // InternalFoo.g:3559:2: ( ruleAttribute )
            {
            // InternalFoo.g:3559:2: ( ruleAttribute )
            // InternalFoo.g:3560:3: ruleAttribute
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
    // InternalFoo.g:3569:1: rule__PSignature__AttributesAssignment_4_1 : ( ruleAttribute ) ;
    public final void rule__PSignature__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3573:1: ( ( ruleAttribute ) )
            // InternalFoo.g:3574:2: ( ruleAttribute )
            {
            // InternalFoo.g:3574:2: ( ruleAttribute )
            // InternalFoo.g:3575:3: ruleAttribute
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
    // InternalFoo.g:3584:1: rule__MRequieredService__SignatureAssignment_2 : ( ruleRSignature ) ;
    public final void rule__MRequieredService__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3588:1: ( ( ruleRSignature ) )
            // InternalFoo.g:3589:2: ( ruleRSignature )
            {
            // InternalFoo.g:3589:2: ( ruleRSignature )
            // InternalFoo.g:3590:3: ruleRSignature
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
    // InternalFoo.g:3599:1: rule__RSignature__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__RSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3603:1: ( ( RULE_ID ) )
            // InternalFoo.g:3604:2: ( RULE_ID )
            {
            // InternalFoo.g:3604:2: ( RULE_ID )
            // InternalFoo.g:3605:3: RULE_ID
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
    // InternalFoo.g:3614:1: rule__RSignature__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RSignature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3618:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:3619:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:3619:2: ( ( RULE_ID ) )
            // InternalFoo.g:3620:3: ( RULE_ID )
            {
             before(grammarAccess.getRSignatureAccess().getNameRequieredServiceCrossReference_1_0()); 
            // InternalFoo.g:3621:3: ( RULE_ID )
            // InternalFoo.g:3622:4: RULE_ID
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
    // InternalFoo.g:3633:1: rule__RSignature__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__RSignature__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3637:1: ( ( ruleAttribute ) )
            // InternalFoo.g:3638:2: ( ruleAttribute )
            {
            // InternalFoo.g:3638:2: ( ruleAttribute )
            // InternalFoo.g:3639:3: ruleAttribute
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
    // InternalFoo.g:3648:1: rule__RSignature__AttributesAssignment_4_1 : ( ruleAttribute ) ;
    public final void rule__RSignature__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3652:1: ( ( ruleAttribute ) )
            // InternalFoo.g:3653:2: ( ruleAttribute )
            {
            // InternalFoo.g:3653:2: ( ruleAttribute )
            // InternalFoo.g:3654:3: ruleAttribute
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


    // $ANTLR start "rule__Attribute__IdAssignment_0"
    // InternalFoo.g:3663:1: rule__Attribute__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3667:1: ( ( RULE_ID ) )
            // InternalFoo.g:3668:2: ( RULE_ID )
            {
            // InternalFoo.g:3668:2: ( RULE_ID )
            // InternalFoo.g:3669:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIdIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__IdAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalFoo.g:3678:1: rule__Attribute__TypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3682:1: ( ( RULE_ID ) )
            // InternalFoo.g:3683:2: ( RULE_ID )
            {
            // InternalFoo.g:3683:2: ( RULE_ID )
            // InternalFoo.g:3684:3: RULE_ID
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000082A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000044000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});

}