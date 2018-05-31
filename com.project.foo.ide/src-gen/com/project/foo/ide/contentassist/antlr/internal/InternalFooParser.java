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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFooParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'<'", "'>'", "'<='", "'>='", "'=='", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'Assembly'", "'components'", "'bindings'", "':'", "'-'", "'Component'", "'refines'", "'assembly'", "'provided'", "'='", "','", "'required'", "'service'", "'if'", "'('", "')'", "';'", "'else'", "'while'", "'!'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalFoo.g:54:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // InternalFoo.g:55:1: ( ruleDomainModel EOF )
            // InternalFoo.g:56:1: ruleDomainModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDomainModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:63:1: ruleDomainModel : ( ( rule__DomainModel__ModelAssignment ) ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:67:2: ( ( ( rule__DomainModel__ModelAssignment ) ) )
            // InternalFoo.g:68:2: ( ( rule__DomainModel__ModelAssignment ) )
            {
            // InternalFoo.g:68:2: ( ( rule__DomainModel__ModelAssignment ) )
            // InternalFoo.g:69:3: ( rule__DomainModel__ModelAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainModelAccess().getModelAssignment()); 
            }
            // InternalFoo.g:70:3: ( rule__DomainModel__ModelAssignment )
            // InternalFoo.g:70:4: rule__DomainModel__ModelAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__ModelAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainModelAccess().getModelAssignment()); 
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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleModel"
    // InternalFoo.g:79:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalFoo.g:80:1: ( ruleModel EOF )
            // InternalFoo.g:81:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:88:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:92:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalFoo.g:93:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalFoo.g:93:2: ( ( rule__Model__Group__0 ) )
            // InternalFoo.g:94:3: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalFoo.g:95:3: ( rule__Model__Group__0 )
            // InternalFoo.g:95:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalFoo.g:104:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalFoo.g:105:1: ( ruleQualifiedName EOF )
            // InternalFoo.g:106:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:113:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:117:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalFoo.g:118:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalFoo.g:118:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalFoo.g:119:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalFoo.g:120:3: ( rule__QualifiedName__Group__0 )
            // InternalFoo.g:120:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // InternalFoo.g:129:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalFoo.g:130:1: ( ruleImport EOF )
            // InternalFoo.g:131:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:138:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:142:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalFoo.g:143:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalFoo.g:143:2: ( ( rule__Import__Group__0 ) )
            // InternalFoo.g:144:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalFoo.g:145:3: ( rule__Import__Group__0 )
            // InternalFoo.g:145:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalFoo.g:154:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalFoo.g:155:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalFoo.g:156:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:163:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:167:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalFoo.g:168:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalFoo.g:168:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalFoo.g:169:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalFoo.g:170:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalFoo.g:170:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleAssembly"
    // InternalFoo.g:179:1: entryRuleAssembly : ruleAssembly EOF ;
    public final void entryRuleAssembly() throws RecognitionException {
        try {
            // InternalFoo.g:180:1: ( ruleAssembly EOF )
            // InternalFoo.g:181:1: ruleAssembly EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssembly();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:188:1: ruleAssembly : ( ( rule__Assembly__Group__0 ) ) ;
    public final void ruleAssembly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:192:2: ( ( ( rule__Assembly__Group__0 ) ) )
            // InternalFoo.g:193:2: ( ( rule__Assembly__Group__0 ) )
            {
            // InternalFoo.g:193:2: ( ( rule__Assembly__Group__0 ) )
            // InternalFoo.g:194:3: ( rule__Assembly__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getGroup()); 
            }
            // InternalFoo.g:195:3: ( rule__Assembly__Group__0 )
            // InternalFoo.g:195:4: rule__Assembly__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getGroup()); 
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
    // $ANTLR end "ruleAssembly"


    // $ANTLR start "entryRuleComponentInstance"
    // InternalFoo.g:204:1: entryRuleComponentInstance : ruleComponentInstance EOF ;
    public final void entryRuleComponentInstance() throws RecognitionException {
        try {
            // InternalFoo.g:205:1: ( ruleComponentInstance EOF )
            // InternalFoo.g:206:1: ruleComponentInstance EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentInstanceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComponentInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentInstanceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:213:1: ruleComponentInstance : ( ( rule__ComponentInstance__Group__0 ) ) ;
    public final void ruleComponentInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:217:2: ( ( ( rule__ComponentInstance__Group__0 ) ) )
            // InternalFoo.g:218:2: ( ( rule__ComponentInstance__Group__0 ) )
            {
            // InternalFoo.g:218:2: ( ( rule__ComponentInstance__Group__0 ) )
            // InternalFoo.g:219:3: ( rule__ComponentInstance__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentInstanceAccess().getGroup()); 
            }
            // InternalFoo.g:220:3: ( rule__ComponentInstance__Group__0 )
            // InternalFoo.g:220:4: rule__ComponentInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentInstanceAccess().getGroup()); 
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
    // $ANTLR end "ruleComponentInstance"


    // $ANTLR start "entryRuleBinding"
    // InternalFoo.g:229:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalFoo.g:230:1: ( ruleBinding EOF )
            // InternalFoo.g:231:1: ruleBinding EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:238:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:242:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalFoo.g:243:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalFoo.g:243:2: ( ( rule__Binding__Group__0 ) )
            // InternalFoo.g:244:3: ( rule__Binding__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getGroup()); 
            }
            // InternalFoo.g:245:3: ( rule__Binding__Group__0 )
            // InternalFoo.g:245:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getGroup()); 
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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBindingRequired"
    // InternalFoo.g:254:1: entryRuleBindingRequired : ruleBindingRequired EOF ;
    public final void entryRuleBindingRequired() throws RecognitionException {
        try {
            // InternalFoo.g:255:1: ( ruleBindingRequired EOF )
            // InternalFoo.g:256:1: ruleBindingRequired EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRequiredRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBindingRequired();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingRequiredRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:263:1: ruleBindingRequired : ( ( rule__BindingRequired__Group__0 ) ) ;
    public final void ruleBindingRequired() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:267:2: ( ( ( rule__BindingRequired__Group__0 ) ) )
            // InternalFoo.g:268:2: ( ( rule__BindingRequired__Group__0 ) )
            {
            // InternalFoo.g:268:2: ( ( rule__BindingRequired__Group__0 ) )
            // InternalFoo.g:269:3: ( rule__BindingRequired__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRequiredAccess().getGroup()); 
            }
            // InternalFoo.g:270:3: ( rule__BindingRequired__Group__0 )
            // InternalFoo.g:270:4: rule__BindingRequired__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BindingRequired__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingRequiredAccess().getGroup()); 
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
    // $ANTLR end "ruleBindingRequired"


    // $ANTLR start "entryRuleBindingProvided"
    // InternalFoo.g:279:1: entryRuleBindingProvided : ruleBindingProvided EOF ;
    public final void entryRuleBindingProvided() throws RecognitionException {
        try {
            // InternalFoo.g:280:1: ( ruleBindingProvided EOF )
            // InternalFoo.g:281:1: ruleBindingProvided EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingProvidedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBindingProvided();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingProvidedRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:288:1: ruleBindingProvided : ( ( rule__BindingProvided__Group__0 ) ) ;
    public final void ruleBindingProvided() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:292:2: ( ( ( rule__BindingProvided__Group__0 ) ) )
            // InternalFoo.g:293:2: ( ( rule__BindingProvided__Group__0 ) )
            {
            // InternalFoo.g:293:2: ( ( rule__BindingProvided__Group__0 ) )
            // InternalFoo.g:294:3: ( rule__BindingProvided__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingProvidedAccess().getGroup()); 
            }
            // InternalFoo.g:295:3: ( rule__BindingProvided__Group__0 )
            // InternalFoo.g:295:4: rule__BindingProvided__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BindingProvided__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingProvidedAccess().getGroup()); 
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
    // $ANTLR end "ruleBindingProvided"


    // $ANTLR start "entryRuleComponent"
    // InternalFoo.g:304:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalFoo.g:305:1: ( ruleComponent EOF )
            // InternalFoo.g:306:1: ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:313:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:317:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalFoo.g:318:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalFoo.g:318:2: ( ( rule__Component__Group__0 ) )
            // InternalFoo.g:319:3: ( rule__Component__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup()); 
            }
            // InternalFoo.g:320:3: ( rule__Component__Group__0 )
            // InternalFoo.g:320:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup()); 
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleListOfProvidedServices"
    // InternalFoo.g:329:1: entryRuleListOfProvidedServices : ruleListOfProvidedServices EOF ;
    public final void entryRuleListOfProvidedServices() throws RecognitionException {
        try {
            // InternalFoo.g:330:1: ( ruleListOfProvidedServices EOF )
            // InternalFoo.g:331:1: ruleListOfProvidedServices EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListOfProvidedServices();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfProvidedServicesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:338:1: ruleListOfProvidedServices : ( ( rule__ListOfProvidedServices__Group__0 ) ) ;
    public final void ruleListOfProvidedServices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:342:2: ( ( ( rule__ListOfProvidedServices__Group__0 ) ) )
            // InternalFoo.g:343:2: ( ( rule__ListOfProvidedServices__Group__0 ) )
            {
            // InternalFoo.g:343:2: ( ( rule__ListOfProvidedServices__Group__0 ) )
            // InternalFoo.g:344:3: ( rule__ListOfProvidedServices__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getGroup()); 
            }
            // InternalFoo.g:345:3: ( rule__ListOfProvidedServices__Group__0 )
            // InternalFoo.g:345:4: rule__ListOfProvidedServices__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfProvidedServicesAccess().getGroup()); 
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
    // $ANTLR end "ruleListOfProvidedServices"


    // $ANTLR start "entryRuleProvidedService"
    // InternalFoo.g:354:1: entryRuleProvidedService : ruleProvidedService EOF ;
    public final void entryRuleProvidedService() throws RecognitionException {
        try {
            // InternalFoo.g:355:1: ( ruleProvidedService EOF )
            // InternalFoo.g:356:1: ruleProvidedService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProvidedServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProvidedService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProvidedServiceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:363:1: ruleProvidedService : ( ( rule__ProvidedService__NameAssignment ) ) ;
    public final void ruleProvidedService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:367:2: ( ( ( rule__ProvidedService__NameAssignment ) ) )
            // InternalFoo.g:368:2: ( ( rule__ProvidedService__NameAssignment ) )
            {
            // InternalFoo.g:368:2: ( ( rule__ProvidedService__NameAssignment ) )
            // InternalFoo.g:369:3: ( rule__ProvidedService__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProvidedServiceAccess().getNameAssignment()); 
            }
            // InternalFoo.g:370:3: ( rule__ProvidedService__NameAssignment )
            // InternalFoo.g:370:4: rule__ProvidedService__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedService__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProvidedServiceAccess().getNameAssignment()); 
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
    // $ANTLR end "ruleProvidedService"


    // $ANTLR start "entryRuleListOfrequiredServices"
    // InternalFoo.g:379:1: entryRuleListOfrequiredServices : ruleListOfrequiredServices EOF ;
    public final void entryRuleListOfrequiredServices() throws RecognitionException {
        try {
            // InternalFoo.g:380:1: ( ruleListOfrequiredServices EOF )
            // InternalFoo.g:381:1: ruleListOfrequiredServices EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListOfrequiredServices();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfrequiredServicesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:388:1: ruleListOfrequiredServices : ( ( rule__ListOfrequiredServices__Group__0 ) ) ;
    public final void ruleListOfrequiredServices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:392:2: ( ( ( rule__ListOfrequiredServices__Group__0 ) ) )
            // InternalFoo.g:393:2: ( ( rule__ListOfrequiredServices__Group__0 ) )
            {
            // InternalFoo.g:393:2: ( ( rule__ListOfrequiredServices__Group__0 ) )
            // InternalFoo.g:394:3: ( rule__ListOfrequiredServices__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getGroup()); 
            }
            // InternalFoo.g:395:3: ( rule__ListOfrequiredServices__Group__0 )
            // InternalFoo.g:395:4: rule__ListOfrequiredServices__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfrequiredServicesAccess().getGroup()); 
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
    // $ANTLR end "ruleListOfrequiredServices"


    // $ANTLR start "entryRuleRequiredService"
    // InternalFoo.g:404:1: entryRuleRequiredService : ruleRequiredService EOF ;
    public final void entryRuleRequiredService() throws RecognitionException {
        try {
            // InternalFoo.g:405:1: ( ruleRequiredService EOF )
            // InternalFoo.g:406:1: ruleRequiredService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRequiredService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:413:1: ruleRequiredService : ( ( rule__RequiredService__NameAssignment ) ) ;
    public final void ruleRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:417:2: ( ( ( rule__RequiredService__NameAssignment ) ) )
            // InternalFoo.g:418:2: ( ( rule__RequiredService__NameAssignment ) )
            {
            // InternalFoo.g:418:2: ( ( rule__RequiredService__NameAssignment ) )
            // InternalFoo.g:419:3: ( rule__RequiredService__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameAssignment()); 
            }
            // InternalFoo.g:420:3: ( rule__RequiredService__NameAssignment )
            // InternalFoo.g:420:4: rule__RequiredService__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceAccess().getNameAssignment()); 
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
    // $ANTLR end "ruleRequiredService"


    // $ANTLR start "entryRuleMProvidedService"
    // InternalFoo.g:429:1: entryRuleMProvidedService : ruleMProvidedService EOF ;
    public final void entryRuleMProvidedService() throws RecognitionException {
        try {
            // InternalFoo.g:430:1: ( ruleMProvidedService EOF )
            // InternalFoo.g:431:1: ruleMProvidedService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMProvidedService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMProvidedServiceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:438:1: ruleMProvidedService : ( ( rule__MProvidedService__Group__0 ) ) ;
    public final void ruleMProvidedService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:442:2: ( ( ( rule__MProvidedService__Group__0 ) ) )
            // InternalFoo.g:443:2: ( ( rule__MProvidedService__Group__0 ) )
            {
            // InternalFoo.g:443:2: ( ( rule__MProvidedService__Group__0 ) )
            // InternalFoo.g:444:3: ( rule__MProvidedService__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getGroup()); 
            }
            // InternalFoo.g:445:3: ( rule__MProvidedService__Group__0 )
            // InternalFoo.g:445:4: rule__MProvidedService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MProvidedService__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMProvidedServiceAccess().getGroup()); 
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
    // $ANTLR end "ruleMProvidedService"


    // $ANTLR start "entryRuleExpression"
    // InternalFoo.g:454:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalFoo.g:455:1: ( ruleExpression EOF )
            // InternalFoo.g:456:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:463:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:467:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalFoo.g:468:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalFoo.g:468:2: ( ( rule__Expression__Alternatives ) )
            // InternalFoo.g:469:3: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalFoo.g:470:3: ( rule__Expression__Alternatives )
            // InternalFoo.g:470:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIf"
    // InternalFoo.g:479:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalFoo.g:480:1: ( ruleIf EOF )
            // InternalFoo.g:481:1: ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:488:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:492:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalFoo.g:493:2: ( ( rule__If__Group__0 ) )
            {
            // InternalFoo.g:493:2: ( ( rule__If__Group__0 ) )
            // InternalFoo.g:494:3: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // InternalFoo.g:495:3: ( rule__If__Group__0 )
            // InternalFoo.g:495:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup()); 
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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleWhile"
    // InternalFoo.g:504:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // InternalFoo.g:505:1: ( ruleWhile EOF )
            // InternalFoo.g:506:1: ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:513:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:517:2: ( ( ( rule__While__Group__0 ) ) )
            // InternalFoo.g:518:2: ( ( rule__While__Group__0 ) )
            {
            // InternalFoo.g:518:2: ( ( rule__While__Group__0 ) )
            // InternalFoo.g:519:3: ( rule__While__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getGroup()); 
            }
            // InternalFoo.g:520:3: ( rule__While__Group__0 )
            // InternalFoo.g:520:4: rule__While__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getGroup()); 
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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleCondition"
    // InternalFoo.g:529:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalFoo.g:530:1: ( ruleCondition EOF )
            // InternalFoo.g:531:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:538:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:542:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalFoo.g:543:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalFoo.g:543:2: ( ( rule__Condition__Group__0 ) )
            // InternalFoo.g:544:3: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalFoo.g:545:3: ( rule__Condition__Group__0 )
            // InternalFoo.g:545:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup()); 
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleStr"
    // InternalFoo.g:554:1: entryRuleStr : ruleStr EOF ;
    public final void entryRuleStr() throws RecognitionException {
        try {
            // InternalFoo.g:555:1: ( ruleStr EOF )
            // InternalFoo.g:556:1: ruleStr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStr"


    // $ANTLR start "ruleStr"
    // InternalFoo.g:563:1: ruleStr : ( ( rule__Str__Group__0 ) ) ;
    public final void ruleStr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:567:2: ( ( ( rule__Str__Group__0 ) ) )
            // InternalFoo.g:568:2: ( ( rule__Str__Group__0 ) )
            {
            // InternalFoo.g:568:2: ( ( rule__Str__Group__0 ) )
            // InternalFoo.g:569:3: ( rule__Str__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getGroup()); 
            }
            // InternalFoo.g:570:3: ( rule__Str__Group__0 )
            // InternalFoo.g:570:4: rule__Str__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Str__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrAccess().getGroup()); 
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
    // $ANTLR end "ruleStr"


    // $ANTLR start "entryRuleComparison"
    // InternalFoo.g:579:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalFoo.g:580:1: ( ruleComparison EOF )
            // InternalFoo.g:581:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalFoo.g:588:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:592:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalFoo.g:593:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalFoo.g:593:2: ( ( rule__Comparison__Group__0 ) )
            // InternalFoo.g:594:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalFoo.g:595:3: ( rule__Comparison__Group__0 )
            // InternalFoo.g:595:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup()); 
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePSignature"
    // InternalFoo.g:604:1: entryRulePSignature : rulePSignature EOF ;
    public final void entryRulePSignature() throws RecognitionException {
        try {
            // InternalFoo.g:605:1: ( rulePSignature EOF )
            // InternalFoo.g:606:1: rulePSignature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePSignature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSignatureRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:613:1: rulePSignature : ( ( rule__PSignature__Group__0 ) ) ;
    public final void rulePSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:617:2: ( ( ( rule__PSignature__Group__0 ) ) )
            // InternalFoo.g:618:2: ( ( rule__PSignature__Group__0 ) )
            {
            // InternalFoo.g:618:2: ( ( rule__PSignature__Group__0 ) )
            // InternalFoo.g:619:3: ( rule__PSignature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getGroup()); 
            }
            // InternalFoo.g:620:3: ( rule__PSignature__Group__0 )
            // InternalFoo.g:620:4: rule__PSignature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PSignature__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSignatureAccess().getGroup()); 
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
    // $ANTLR end "rulePSignature"


    // $ANTLR start "entryRuleMRequiredService"
    // InternalFoo.g:629:1: entryRuleMRequiredService : ruleMRequiredService EOF ;
    public final void entryRuleMRequiredService() throws RecognitionException {
        try {
            // InternalFoo.g:630:1: ( ruleMRequiredService EOF )
            // InternalFoo.g:631:1: ruleMRequiredService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRequiredServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMRequiredService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRequiredServiceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:638:1: ruleMRequiredService : ( ( rule__MRequiredService__Group__0 ) ) ;
    public final void ruleMRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:642:2: ( ( ( rule__MRequiredService__Group__0 ) ) )
            // InternalFoo.g:643:2: ( ( rule__MRequiredService__Group__0 ) )
            {
            // InternalFoo.g:643:2: ( ( rule__MRequiredService__Group__0 ) )
            // InternalFoo.g:644:3: ( rule__MRequiredService__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRequiredServiceAccess().getGroup()); 
            }
            // InternalFoo.g:645:3: ( rule__MRequiredService__Group__0 )
            // InternalFoo.g:645:4: rule__MRequiredService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MRequiredService__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRequiredServiceAccess().getGroup()); 
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
    // $ANTLR end "ruleMRequiredService"


    // $ANTLR start "entryRuleRSignature"
    // InternalFoo.g:654:1: entryRuleRSignature : ruleRSignature EOF ;
    public final void entryRuleRSignature() throws RecognitionException {
        try {
            // InternalFoo.g:655:1: ( ruleRSignature EOF )
            // InternalFoo.g:656:1: ruleRSignature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRSignature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSignatureRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:663:1: ruleRSignature : ( ( rule__RSignature__Group__0 ) ) ;
    public final void ruleRSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:667:2: ( ( ( rule__RSignature__Group__0 ) ) )
            // InternalFoo.g:668:2: ( ( rule__RSignature__Group__0 ) )
            {
            // InternalFoo.g:668:2: ( ( rule__RSignature__Group__0 ) )
            // InternalFoo.g:669:3: ( rule__RSignature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getGroup()); 
            }
            // InternalFoo.g:670:3: ( rule__RSignature__Group__0 )
            // InternalFoo.g:670:4: rule__RSignature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RSignature__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSignatureAccess().getGroup()); 
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
    // $ANTLR end "ruleRSignature"


    // $ANTLR start "entryRuleParameter"
    // InternalFoo.g:679:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalFoo.g:680:1: ( ruleParameter EOF )
            // InternalFoo.g:681:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalFoo.g:688:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:692:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalFoo.g:693:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalFoo.g:693:2: ( ( rule__Parameter__Group__0 ) )
            // InternalFoo.g:694:3: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalFoo.g:695:3: ( rule__Parameter__Group__0 )
            // InternalFoo.g:695:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup()); 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalFoo.g:703:1: rule__Expression__Alternatives : ( ( ruleIf ) | ( ruleWhile ) | ( ruleStr ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:707:1: ( ( ruleIf ) | ( ruleWhile ) | ( ruleStr ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt1=1;
                }
                break;
            case 42:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalFoo.g:708:2: ( ruleIf )
                    {
                    // InternalFoo.g:708:2: ( ruleIf )
                    // InternalFoo.g:709:3: ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getIfParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getIfParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:714:2: ( ruleWhile )
                    {
                    // InternalFoo.g:714:2: ( ruleWhile )
                    // InternalFoo.g:715:3: ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getWhileParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWhile();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getWhileParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFoo.g:720:2: ( ruleStr )
                    {
                    // InternalFoo.g:720:2: ( ruleStr )
                    // InternalFoo.g:721:3: ruleStr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getStrParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getStrParserRuleCall_2()); 
                    }

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
    // InternalFoo.g:730:1: rule__If__Alternatives_2_1 : ( ( '||' ) | ( '&&' ) );
    public final void rule__If__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:734:1: ( ( '||' ) | ( '&&' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFoo.g:735:2: ( '||' )
                    {
                    // InternalFoo.g:735:2: ( '||' )
                    // InternalFoo.g:736:3: '||'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getVerticalLineVerticalLineKeyword_2_1_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getVerticalLineVerticalLineKeyword_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:741:2: ( '&&' )
                    {
                    // InternalFoo.g:741:2: ( '&&' )
                    // InternalFoo.g:742:3: '&&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getAmpersandAmpersandKeyword_2_1_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getAmpersandAmpersandKeyword_2_1_1()); 
                    }

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


    // $ANTLR start "rule__If__Alternatives_6"
    // InternalFoo.g:751:1: rule__If__Alternatives_6 : ( ( ( rule__If__Group_6_0__0 ) ) | ( ( rule__If__IfAssignment_6_1 ) ) | ( ( rule__If__WhileAssignment_6_2 ) ) );
    public final void rule__If__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:755:1: ( ( ( rule__If__Group_6_0__0 ) ) | ( ( rule__If__IfAssignment_6_1 ) ) | ( ( rule__If__WhileAssignment_6_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 42:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFoo.g:756:2: ( ( rule__If__Group_6_0__0 ) )
                    {
                    // InternalFoo.g:756:2: ( ( rule__If__Group_6_0__0 ) )
                    // InternalFoo.g:757:3: ( rule__If__Group_6_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getGroup_6_0()); 
                    }
                    // InternalFoo.g:758:3: ( rule__If__Group_6_0__0 )
                    // InternalFoo.g:758:4: rule__If__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_6_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getGroup_6_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:762:2: ( ( rule__If__IfAssignment_6_1 ) )
                    {
                    // InternalFoo.g:762:2: ( ( rule__If__IfAssignment_6_1 ) )
                    // InternalFoo.g:763:3: ( rule__If__IfAssignment_6_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getIfAssignment_6_1()); 
                    }
                    // InternalFoo.g:764:3: ( rule__If__IfAssignment_6_1 )
                    // InternalFoo.g:764:4: rule__If__IfAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__IfAssignment_6_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getIfAssignment_6_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFoo.g:768:2: ( ( rule__If__WhileAssignment_6_2 ) )
                    {
                    // InternalFoo.g:768:2: ( ( rule__If__WhileAssignment_6_2 ) )
                    // InternalFoo.g:769:3: ( rule__If__WhileAssignment_6_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getWhileAssignment_6_2()); 
                    }
                    // InternalFoo.g:770:3: ( rule__If__WhileAssignment_6_2 )
                    // InternalFoo.g:770:4: rule__If__WhileAssignment_6_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__WhileAssignment_6_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getWhileAssignment_6_2()); 
                    }

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
    // $ANTLR end "rule__If__Alternatives_6"


    // $ANTLR start "rule__If__Alternatives_8_1"
    // InternalFoo.g:778:1: rule__If__Alternatives_8_1 : ( ( ( rule__If__ElseAssignment_8_1_0 ) ) | ( ( rule__If__Group_8_1_1__0 ) ) );
    public final void rule__If__Alternatives_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:782:1: ( ( ( rule__If__ElseAssignment_8_1_0 ) ) | ( ( rule__If__Group_8_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFoo.g:783:2: ( ( rule__If__ElseAssignment_8_1_0 ) )
                    {
                    // InternalFoo.g:783:2: ( ( rule__If__ElseAssignment_8_1_0 ) )
                    // InternalFoo.g:784:3: ( rule__If__ElseAssignment_8_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getElseAssignment_8_1_0()); 
                    }
                    // InternalFoo.g:785:3: ( rule__If__ElseAssignment_8_1_0 )
                    // InternalFoo.g:785:4: rule__If__ElseAssignment_8_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__ElseAssignment_8_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getElseAssignment_8_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:789:2: ( ( rule__If__Group_8_1_1__0 ) )
                    {
                    // InternalFoo.g:789:2: ( ( rule__If__Group_8_1_1__0 ) )
                    // InternalFoo.g:790:3: ( rule__If__Group_8_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getGroup_8_1_1()); 
                    }
                    // InternalFoo.g:791:3: ( rule__If__Group_8_1_1__0 )
                    // InternalFoo.g:791:4: rule__If__Group_8_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_8_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getGroup_8_1_1()); 
                    }

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


    // $ANTLR start "rule__If__Alternatives_8_1_1_1"
    // InternalFoo.g:799:1: rule__If__Alternatives_8_1_1_1 : ( ( ( rule__If__Group_8_1_1_1_0__0 ) ) | ( ( rule__If__IfAssignment_8_1_1_1_1 ) ) | ( ( rule__If__WhileAssignment_8_1_1_1_2 ) ) );
    public final void rule__If__Alternatives_8_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:803:1: ( ( ( rule__If__Group_8_1_1_1_0__0 ) ) | ( ( rule__If__IfAssignment_8_1_1_1_1 ) ) | ( ( rule__If__WhileAssignment_8_1_1_1_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 37:
                {
                alt5=2;
                }
                break;
            case 42:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFoo.g:804:2: ( ( rule__If__Group_8_1_1_1_0__0 ) )
                    {
                    // InternalFoo.g:804:2: ( ( rule__If__Group_8_1_1_1_0__0 ) )
                    // InternalFoo.g:805:3: ( rule__If__Group_8_1_1_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getGroup_8_1_1_1_0()); 
                    }
                    // InternalFoo.g:806:3: ( rule__If__Group_8_1_1_1_0__0 )
                    // InternalFoo.g:806:4: rule__If__Group_8_1_1_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_8_1_1_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getGroup_8_1_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:810:2: ( ( rule__If__IfAssignment_8_1_1_1_1 ) )
                    {
                    // InternalFoo.g:810:2: ( ( rule__If__IfAssignment_8_1_1_1_1 ) )
                    // InternalFoo.g:811:3: ( rule__If__IfAssignment_8_1_1_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getIfAssignment_8_1_1_1_1()); 
                    }
                    // InternalFoo.g:812:3: ( rule__If__IfAssignment_8_1_1_1_1 )
                    // InternalFoo.g:812:4: rule__If__IfAssignment_8_1_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__IfAssignment_8_1_1_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getIfAssignment_8_1_1_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFoo.g:816:2: ( ( rule__If__WhileAssignment_8_1_1_1_2 ) )
                    {
                    // InternalFoo.g:816:2: ( ( rule__If__WhileAssignment_8_1_1_1_2 ) )
                    // InternalFoo.g:817:3: ( rule__If__WhileAssignment_8_1_1_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getWhileAssignment_8_1_1_1_2()); 
                    }
                    // InternalFoo.g:818:3: ( rule__If__WhileAssignment_8_1_1_1_2 )
                    // InternalFoo.g:818:4: rule__If__WhileAssignment_8_1_1_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__WhileAssignment_8_1_1_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getWhileAssignment_8_1_1_1_2()); 
                    }

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
    // $ANTLR end "rule__If__Alternatives_8_1_1_1"


    // $ANTLR start "rule__While__Alternatives_2_1"
    // InternalFoo.g:826:1: rule__While__Alternatives_2_1 : ( ( '||' ) | ( '&&' ) );
    public final void rule__While__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:830:1: ( ( '||' ) | ( '&&' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFoo.g:831:2: ( '||' )
                    {
                    // InternalFoo.g:831:2: ( '||' )
                    // InternalFoo.g:832:3: '||'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWhileAccess().getVerticalLineVerticalLineKeyword_2_1_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWhileAccess().getVerticalLineVerticalLineKeyword_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:837:2: ( '&&' )
                    {
                    // InternalFoo.g:837:2: ( '&&' )
                    // InternalFoo.g:838:3: '&&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWhileAccess().getAmpersandAmpersandKeyword_2_1_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWhileAccess().getAmpersandAmpersandKeyword_2_1_1()); 
                    }

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


    // $ANTLR start "rule__While__Alternatives_6"
    // InternalFoo.g:847:1: rule__While__Alternatives_6 : ( ( ( rule__While__Group_6_0__0 ) ) | ( ( rule__While__IfAssignment_6_1 ) ) | ( ( rule__While__WhileAssignment_6_2 ) ) );
    public final void rule__While__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:851:1: ( ( ( rule__While__Group_6_0__0 ) ) | ( ( rule__While__IfAssignment_6_1 ) ) | ( ( rule__While__WhileAssignment_6_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 37:
                {
                alt7=2;
                }
                break;
            case 42:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalFoo.g:852:2: ( ( rule__While__Group_6_0__0 ) )
                    {
                    // InternalFoo.g:852:2: ( ( rule__While__Group_6_0__0 ) )
                    // InternalFoo.g:853:3: ( rule__While__Group_6_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWhileAccess().getGroup_6_0()); 
                    }
                    // InternalFoo.g:854:3: ( rule__While__Group_6_0__0 )
                    // InternalFoo.g:854:4: rule__While__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__While__Group_6_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWhileAccess().getGroup_6_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:858:2: ( ( rule__While__IfAssignment_6_1 ) )
                    {
                    // InternalFoo.g:858:2: ( ( rule__While__IfAssignment_6_1 ) )
                    // InternalFoo.g:859:3: ( rule__While__IfAssignment_6_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWhileAccess().getIfAssignment_6_1()); 
                    }
                    // InternalFoo.g:860:3: ( rule__While__IfAssignment_6_1 )
                    // InternalFoo.g:860:4: rule__While__IfAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__While__IfAssignment_6_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWhileAccess().getIfAssignment_6_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFoo.g:864:2: ( ( rule__While__WhileAssignment_6_2 ) )
                    {
                    // InternalFoo.g:864:2: ( ( rule__While__WhileAssignment_6_2 ) )
                    // InternalFoo.g:865:3: ( rule__While__WhileAssignment_6_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWhileAccess().getWhileAssignment_6_2()); 
                    }
                    // InternalFoo.g:866:3: ( rule__While__WhileAssignment_6_2 )
                    // InternalFoo.g:866:4: rule__While__WhileAssignment_6_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__While__WhileAssignment_6_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWhileAccess().getWhileAssignment_6_2()); 
                    }

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
    // $ANTLR end "rule__While__Alternatives_6"


    // $ANTLR start "rule__Condition__Alternatives_1"
    // InternalFoo.g:874:1: rule__Condition__Alternatives_1 : ( ( ( rule__Condition__ConditionsAssignment_1_0 ) ) | ( ( rule__Condition__ConditionsAssignment_1_1 ) ) );
    public final void rule__Condition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:878:1: ( ( ( rule__Condition__ConditionsAssignment_1_0 ) ) | ( ( rule__Condition__ConditionsAssignment_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=13 && LA8_1<=17)) ) {
                    alt8=1;
                }
                else if ( (LA8_1==EOF||LA8_1==RULE_ID||(LA8_1>=11 && LA8_1<=12)||LA8_1==21||LA8_1==39) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFoo.g:879:2: ( ( rule__Condition__ConditionsAssignment_1_0 ) )
                    {
                    // InternalFoo.g:879:2: ( ( rule__Condition__ConditionsAssignment_1_0 ) )
                    // InternalFoo.g:880:3: ( rule__Condition__ConditionsAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionAccess().getConditionsAssignment_1_0()); 
                    }
                    // InternalFoo.g:881:3: ( rule__Condition__ConditionsAssignment_1_0 )
                    // InternalFoo.g:881:4: rule__Condition__ConditionsAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__ConditionsAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionAccess().getConditionsAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:885:2: ( ( rule__Condition__ConditionsAssignment_1_1 ) )
                    {
                    // InternalFoo.g:885:2: ( ( rule__Condition__ConditionsAssignment_1_1 ) )
                    // InternalFoo.g:886:3: ( rule__Condition__ConditionsAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionAccess().getConditionsAssignment_1_1()); 
                    }
                    // InternalFoo.g:887:3: ( rule__Condition__ConditionsAssignment_1_1 )
                    // InternalFoo.g:887:4: rule__Condition__ConditionsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__ConditionsAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionAccess().getConditionsAssignment_1_1()); 
                    }

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


    // $ANTLR start "rule__Comparison__Alternatives_1"
    // InternalFoo.g:895:1: rule__Comparison__Alternatives_1 : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) | ( '==' ) );
    public final void rule__Comparison__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:899:1: ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) | ( '==' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt9=1;
                }
                break;
            case 14:
                {
                alt9=2;
                }
                break;
            case 15:
                {
                alt9=3;
                }
                break;
            case 16:
                {
                alt9=4;
                }
                break;
            case 17:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalFoo.g:900:2: ( '<' )
                    {
                    // InternalFoo.g:900:2: ( '<' )
                    // InternalFoo.g:901:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:906:2: ( '>' )
                    {
                    // InternalFoo.g:906:2: ( '>' )
                    // InternalFoo.g:907:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFoo.g:912:2: ( '<=' )
                    {
                    // InternalFoo.g:912:2: ( '<=' )
                    // InternalFoo.g:913:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_2()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFoo.g:918:2: ( '>=' )
                    {
                    // InternalFoo.g:918:2: ( '>=' )
                    // InternalFoo.g:919:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_3()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFoo.g:924:2: ( '==' )
                    {
                    // InternalFoo.g:924:2: ( '==' )
                    // InternalFoo.g:925:3: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_4()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_4()); 
                    }

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
    // $ANTLR end "rule__Comparison__Alternatives_1"


    // $ANTLR start "rule__Model__Group__0"
    // InternalFoo.g:934:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:938:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFoo.g:939:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:946:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:950:1: ( ( 'package' ) )
            // InternalFoo.g:951:1: ( 'package' )
            {
            // InternalFoo.g:951:1: ( 'package' )
            // InternalFoo.g:952:2: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPackageKeyword_0()); 
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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalFoo.g:961:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:965:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalFoo.g:966:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:973:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:977:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalFoo.g:978:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalFoo.g:978:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalFoo.g:979:2: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // InternalFoo.g:980:2: ( rule__Model__NameAssignment_1 )
            // InternalFoo.g:980:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalFoo.g:988:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:992:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalFoo.g:993:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1000:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1004:1: ( ( '{' ) )
            // InternalFoo.g:1005:1: ( '{' )
            {
            // InternalFoo.g:1005:1: ( '{' )
            // InternalFoo.g:1006:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalFoo.g:1015:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1019:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalFoo.g:1020:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1027:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1031:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // InternalFoo.g:1032:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // InternalFoo.g:1032:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // InternalFoo.g:1033:2: ( rule__Model__ImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            }
            // InternalFoo.g:1034:2: ( rule__Model__ImportsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFoo.g:1034:3: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__ImportsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsAssignment_3()); 
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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalFoo.g:1042:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1046:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalFoo.g:1047:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1054:1: rule__Model__Group__4__Impl : ( ( rule__Model__ComponentsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1058:1: ( ( ( rule__Model__ComponentsAssignment_4 )* ) )
            // InternalFoo.g:1059:1: ( ( rule__Model__ComponentsAssignment_4 )* )
            {
            // InternalFoo.g:1059:1: ( ( rule__Model__ComponentsAssignment_4 )* )
            // InternalFoo.g:1060:2: ( rule__Model__ComponentsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getComponentsAssignment_4()); 
            }
            // InternalFoo.g:1061:2: ( rule__Model__ComponentsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFoo.g:1061:3: rule__Model__ComponentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__ComponentsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getComponentsAssignment_4()); 
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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalFoo.g:1069:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1073:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalFoo.g:1074:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1081:1: rule__Model__Group__5__Impl : ( ( rule__Model__AssemblyAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1085:1: ( ( ( rule__Model__AssemblyAssignment_5 )* ) )
            // InternalFoo.g:1086:1: ( ( rule__Model__AssemblyAssignment_5 )* )
            {
            // InternalFoo.g:1086:1: ( ( rule__Model__AssemblyAssignment_5 )* )
            // InternalFoo.g:1087:2: ( rule__Model__AssemblyAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAssemblyAssignment_5()); 
            }
            // InternalFoo.g:1088:2: ( rule__Model__AssemblyAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFoo.g:1088:3: rule__Model__AssemblyAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__AssemblyAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAssemblyAssignment_5()); 
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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalFoo.g:1096:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1100:1: ( rule__Model__Group__6__Impl )
            // InternalFoo.g:1101:2: rule__Model__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1107:1: rule__Model__Group__6__Impl : ( '}' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1111:1: ( ( '}' ) )
            // InternalFoo.g:1112:1: ( '}' )
            {
            // InternalFoo.g:1112:1: ( '}' )
            // InternalFoo.g:1113:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalFoo.g:1123:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1127:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalFoo.g:1128:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1135:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1139:1: ( ( RULE_ID ) )
            // InternalFoo.g:1140:1: ( RULE_ID )
            {
            // InternalFoo.g:1140:1: ( RULE_ID )
            // InternalFoo.g:1141:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalFoo.g:1150:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1154:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalFoo.g:1155:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1161:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1165:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalFoo.g:1166:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalFoo.g:1166:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalFoo.g:1167:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalFoo.g:1168:2: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFoo.g:1168:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalFoo.g:1177:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1181:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalFoo.g:1182:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1189:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1193:1: ( ( '.' ) )
            // InternalFoo.g:1194:1: ( '.' )
            {
            // InternalFoo.g:1194:1: ( '.' )
            // InternalFoo.g:1195:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalFoo.g:1204:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1208:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalFoo.g:1209:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1215:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1219:1: ( ( RULE_ID ) )
            // InternalFoo.g:1220:1: ( RULE_ID )
            {
            // InternalFoo.g:1220:1: ( RULE_ID )
            // InternalFoo.g:1221:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalFoo.g:1231:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1235:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalFoo.g:1236:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1243:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1247:1: ( ( 'import' ) )
            // InternalFoo.g:1248:1: ( 'import' )
            {
            // InternalFoo.g:1248:1: ( 'import' )
            // InternalFoo.g:1249:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalFoo.g:1258:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1262:1: ( rule__Import__Group__1__Impl )
            // InternalFoo.g:1263:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1269:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1273:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalFoo.g:1274:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalFoo.g:1274:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalFoo.g:1275:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalFoo.g:1276:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalFoo.g:1276:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalFoo.g:1285:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1289:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalFoo.g:1290:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1297:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1301:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:1302:1: ( ruleQualifiedName )
            {
            // InternalFoo.g:1302:1: ( ruleQualifiedName )
            // InternalFoo.g:1303:2: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalFoo.g:1312:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1316:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalFoo.g:1317:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1323:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1327:1: ( ( ( '.*' )? ) )
            // InternalFoo.g:1328:1: ( ( '.*' )? )
            {
            // InternalFoo.g:1328:1: ( ( '.*' )? )
            // InternalFoo.g:1329:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalFoo.g:1330:2: ( '.*' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFoo.g:1330:3: '.*'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Assembly__Group__0"
    // InternalFoo.g:1339:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1343:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // InternalFoo.g:1344:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Assembly__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1351:1: rule__Assembly__Group__0__Impl : ( () ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1355:1: ( ( () ) )
            // InternalFoo.g:1356:1: ( () )
            {
            // InternalFoo.g:1356:1: ( () )
            // InternalFoo.g:1357:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAssemblyAction_0()); 
            }
            // InternalFoo.g:1358:2: ()
            // InternalFoo.g:1358:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getAssemblyAction_0()); 
            }

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
    // InternalFoo.g:1366:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1370:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // InternalFoo.g:1371:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Assembly__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1378:1: rule__Assembly__Group__1__Impl : ( 'Assembly' ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1382:1: ( ( 'Assembly' ) )
            // InternalFoo.g:1383:1: ( 'Assembly' )
            {
            // InternalFoo.g:1383:1: ( 'Assembly' )
            // InternalFoo.g:1384:2: 'Assembly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getAssemblyKeyword_1()); 
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
    // $ANTLR end "rule__Assembly__Group__1__Impl"


    // $ANTLR start "rule__Assembly__Group__2"
    // InternalFoo.g:1393:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1397:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // InternalFoo.g:1398:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Assembly__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1405:1: rule__Assembly__Group__2__Impl : ( ( rule__Assembly__NameAssignment_2 ) ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1409:1: ( ( ( rule__Assembly__NameAssignment_2 ) ) )
            // InternalFoo.g:1410:1: ( ( rule__Assembly__NameAssignment_2 ) )
            {
            // InternalFoo.g:1410:1: ( ( rule__Assembly__NameAssignment_2 ) )
            // InternalFoo.g:1411:2: ( rule__Assembly__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getNameAssignment_2()); 
            }
            // InternalFoo.g:1412:2: ( rule__Assembly__NameAssignment_2 )
            // InternalFoo.g:1412:3: rule__Assembly__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Assembly__Group__2__Impl"


    // $ANTLR start "rule__Assembly__Group__3"
    // InternalFoo.g:1420:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1424:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // InternalFoo.g:1425:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Assembly__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1432:1: rule__Assembly__Group__3__Impl : ( '{' ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1436:1: ( ( '{' ) )
            // InternalFoo.g:1437:1: ( '{' )
            {
            // InternalFoo.g:1437:1: ( '{' )
            // InternalFoo.g:1438:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Assembly__Group__3__Impl"


    // $ANTLR start "rule__Assembly__Group__4"
    // InternalFoo.g:1447:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl rule__Assembly__Group__5 ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1451:1: ( rule__Assembly__Group__4__Impl rule__Assembly__Group__5 )
            // InternalFoo.g:1452:2: rule__Assembly__Group__4__Impl rule__Assembly__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Assembly__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1459:1: rule__Assembly__Group__4__Impl : ( 'components' ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1463:1: ( ( 'components' ) )
            // InternalFoo.g:1464:1: ( 'components' )
            {
            // InternalFoo.g:1464:1: ( 'components' )
            // InternalFoo.g:1465:2: 'components'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getComponentsKeyword_4()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getComponentsKeyword_4()); 
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
    // $ANTLR end "rule__Assembly__Group__4__Impl"


    // $ANTLR start "rule__Assembly__Group__5"
    // InternalFoo.g:1474:1: rule__Assembly__Group__5 : rule__Assembly__Group__5__Impl rule__Assembly__Group__6 ;
    public final void rule__Assembly__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1478:1: ( rule__Assembly__Group__5__Impl rule__Assembly__Group__6 )
            // InternalFoo.g:1479:2: rule__Assembly__Group__5__Impl rule__Assembly__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Assembly__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1486:1: rule__Assembly__Group__5__Impl : ( ( rule__Assembly__AttributesAssignment_5 ) ) ;
    public final void rule__Assembly__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1490:1: ( ( ( rule__Assembly__AttributesAssignment_5 ) ) )
            // InternalFoo.g:1491:1: ( ( rule__Assembly__AttributesAssignment_5 ) )
            {
            // InternalFoo.g:1491:1: ( ( rule__Assembly__AttributesAssignment_5 ) )
            // InternalFoo.g:1492:2: ( rule__Assembly__AttributesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAttributesAssignment_5()); 
            }
            // InternalFoo.g:1493:2: ( rule__Assembly__AttributesAssignment_5 )
            // InternalFoo.g:1493:3: rule__Assembly__AttributesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__AttributesAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getAttributesAssignment_5()); 
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
    // $ANTLR end "rule__Assembly__Group__5__Impl"


    // $ANTLR start "rule__Assembly__Group__6"
    // InternalFoo.g:1501:1: rule__Assembly__Group__6 : rule__Assembly__Group__6__Impl rule__Assembly__Group__7 ;
    public final void rule__Assembly__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1505:1: ( rule__Assembly__Group__6__Impl rule__Assembly__Group__7 )
            // InternalFoo.g:1506:2: rule__Assembly__Group__6__Impl rule__Assembly__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Assembly__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1513:1: rule__Assembly__Group__6__Impl : ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) ) ;
    public final void rule__Assembly__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1517:1: ( ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) ) )
            // InternalFoo.g:1518:1: ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) )
            {
            // InternalFoo.g:1518:1: ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) )
            // InternalFoo.g:1519:2: ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* )
            {
            // InternalFoo.g:1519:2: ( ( rule__Assembly__AttributesAssignment_6 ) )
            // InternalFoo.g:1520:3: ( rule__Assembly__AttributesAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 
            }
            // InternalFoo.g:1521:3: ( rule__Assembly__AttributesAssignment_6 )
            // InternalFoo.g:1521:4: rule__Assembly__AttributesAssignment_6
            {
            pushFollow(FOLLOW_15);
            rule__Assembly__AttributesAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 
            }

            }

            // InternalFoo.g:1524:2: ( ( rule__Assembly__AttributesAssignment_6 )* )
            // InternalFoo.g:1525:3: ( rule__Assembly__AttributesAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 
            }
            // InternalFoo.g:1526:3: ( rule__Assembly__AttributesAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFoo.g:1526:4: rule__Assembly__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Assembly__AttributesAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 
            }

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
    // InternalFoo.g:1535:1: rule__Assembly__Group__7 : rule__Assembly__Group__7__Impl rule__Assembly__Group__8 ;
    public final void rule__Assembly__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1539:1: ( rule__Assembly__Group__7__Impl rule__Assembly__Group__8 )
            // InternalFoo.g:1540:2: rule__Assembly__Group__7__Impl rule__Assembly__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Assembly__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1547:1: rule__Assembly__Group__7__Impl : ( 'bindings' ) ;
    public final void rule__Assembly__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1551:1: ( ( 'bindings' ) )
            // InternalFoo.g:1552:1: ( 'bindings' )
            {
            // InternalFoo.g:1552:1: ( 'bindings' )
            // InternalFoo.g:1553:2: 'bindings'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getBindingsKeyword_7()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getBindingsKeyword_7()); 
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
    // $ANTLR end "rule__Assembly__Group__7__Impl"


    // $ANTLR start "rule__Assembly__Group__8"
    // InternalFoo.g:1562:1: rule__Assembly__Group__8 : rule__Assembly__Group__8__Impl rule__Assembly__Group__9 ;
    public final void rule__Assembly__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1566:1: ( rule__Assembly__Group__8__Impl rule__Assembly__Group__9 )
            // InternalFoo.g:1567:2: rule__Assembly__Group__8__Impl rule__Assembly__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Assembly__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1574:1: rule__Assembly__Group__8__Impl : ( ( rule__Assembly__BindingsAssignment_8 )* ) ;
    public final void rule__Assembly__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1578:1: ( ( ( rule__Assembly__BindingsAssignment_8 )* ) )
            // InternalFoo.g:1579:1: ( ( rule__Assembly__BindingsAssignment_8 )* )
            {
            // InternalFoo.g:1579:1: ( ( rule__Assembly__BindingsAssignment_8 )* )
            // InternalFoo.g:1580:2: ( rule__Assembly__BindingsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getBindingsAssignment_8()); 
            }
            // InternalFoo.g:1581:2: ( rule__Assembly__BindingsAssignment_8 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFoo.g:1581:3: rule__Assembly__BindingsAssignment_8
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Assembly__BindingsAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getBindingsAssignment_8()); 
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
    // $ANTLR end "rule__Assembly__Group__8__Impl"


    // $ANTLR start "rule__Assembly__Group__9"
    // InternalFoo.g:1589:1: rule__Assembly__Group__9 : rule__Assembly__Group__9__Impl ;
    public final void rule__Assembly__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1593:1: ( rule__Assembly__Group__9__Impl )
            // InternalFoo.g:1594:2: rule__Assembly__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1600:1: rule__Assembly__Group__9__Impl : ( '}' ) ;
    public final void rule__Assembly__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1604:1: ( ( '}' ) )
            // InternalFoo.g:1605:1: ( '}' )
            {
            // InternalFoo.g:1605:1: ( '}' )
            // InternalFoo.g:1606:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_9()); 
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
    // $ANTLR end "rule__Assembly__Group__9__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__0"
    // InternalFoo.g:1616:1: rule__ComponentInstance__Group__0 : rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 ;
    public final void rule__ComponentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1620:1: ( rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 )
            // InternalFoo.g:1621:2: rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ComponentInstance__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1628:1: rule__ComponentInstance__Group__0__Impl : ( ( rule__ComponentInstance__NameAssignment_0 ) ) ;
    public final void rule__ComponentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1632:1: ( ( ( rule__ComponentInstance__NameAssignment_0 ) ) )
            // InternalFoo.g:1633:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            {
            // InternalFoo.g:1633:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            // InternalFoo.g:1634:2: ( rule__ComponentInstance__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentInstanceAccess().getNameAssignment_0()); 
            }
            // InternalFoo.g:1635:2: ( rule__ComponentInstance__NameAssignment_0 )
            // InternalFoo.g:1635:3: rule__ComponentInstance__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentInstanceAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__ComponentInstance__Group__0__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__1"
    // InternalFoo.g:1643:1: rule__ComponentInstance__Group__1 : rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 ;
    public final void rule__ComponentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1647:1: ( rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 )
            // InternalFoo.g:1648:2: rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInstance__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1655:1: rule__ComponentInstance__Group__1__Impl : ( ':' ) ;
    public final void rule__ComponentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1659:1: ( ( ':' ) )
            // InternalFoo.g:1660:1: ( ':' )
            {
            // InternalFoo.g:1660:1: ( ':' )
            // InternalFoo.g:1661:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentInstanceAccess().getColonKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentInstanceAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__ComponentInstance__Group__1__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__2"
    // InternalFoo.g:1670:1: rule__ComponentInstance__Group__2 : rule__ComponentInstance__Group__2__Impl ;
    public final void rule__ComponentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1674:1: ( rule__ComponentInstance__Group__2__Impl )
            // InternalFoo.g:1675:2: rule__ComponentInstance__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1681:1: rule__ComponentInstance__Group__2__Impl : ( ( rule__ComponentInstance__ComponentAssignment_2 ) ) ;
    public final void rule__ComponentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1685:1: ( ( ( rule__ComponentInstance__ComponentAssignment_2 ) ) )
            // InternalFoo.g:1686:1: ( ( rule__ComponentInstance__ComponentAssignment_2 ) )
            {
            // InternalFoo.g:1686:1: ( ( rule__ComponentInstance__ComponentAssignment_2 ) )
            // InternalFoo.g:1687:2: ( rule__ComponentInstance__ComponentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentInstanceAccess().getComponentAssignment_2()); 
            }
            // InternalFoo.g:1688:2: ( rule__ComponentInstance__ComponentAssignment_2 )
            // InternalFoo.g:1688:3: rule__ComponentInstance__ComponentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__ComponentAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentInstanceAccess().getComponentAssignment_2()); 
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
    // $ANTLR end "rule__ComponentInstance__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalFoo.g:1697:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1701:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalFoo.g:1702:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Binding__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1709:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__BindingRequiredAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1713:1: ( ( ( rule__Binding__BindingRequiredAssignment_0 ) ) )
            // InternalFoo.g:1714:1: ( ( rule__Binding__BindingRequiredAssignment_0 ) )
            {
            // InternalFoo.g:1714:1: ( ( rule__Binding__BindingRequiredAssignment_0 ) )
            // InternalFoo.g:1715:2: ( rule__Binding__BindingRequiredAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getBindingRequiredAssignment_0()); 
            }
            // InternalFoo.g:1716:2: ( rule__Binding__BindingRequiredAssignment_0 )
            // InternalFoo.g:1716:3: rule__Binding__BindingRequiredAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__BindingRequiredAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getBindingRequiredAssignment_0()); 
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
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalFoo.g:1724:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1728:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalFoo.g:1729:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Binding__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1736:1: rule__Binding__Group__1__Impl : ( '-' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1740:1: ( ( '-' ) )
            // InternalFoo.g:1741:1: ( '-' )
            {
            // InternalFoo.g:1741:1: ( '-' )
            // InternalFoo.g:1742:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getHyphenMinusKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getHyphenMinusKeyword_1()); 
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
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // InternalFoo.g:1751:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1755:1: ( rule__Binding__Group__2__Impl )
            // InternalFoo.g:1756:2: rule__Binding__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1762:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__BindingProvidedAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1766:1: ( ( ( rule__Binding__BindingProvidedAssignment_2 ) ) )
            // InternalFoo.g:1767:1: ( ( rule__Binding__BindingProvidedAssignment_2 ) )
            {
            // InternalFoo.g:1767:1: ( ( rule__Binding__BindingProvidedAssignment_2 ) )
            // InternalFoo.g:1768:2: ( rule__Binding__BindingProvidedAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getBindingProvidedAssignment_2()); 
            }
            // InternalFoo.g:1769:2: ( rule__Binding__BindingProvidedAssignment_2 )
            // InternalFoo.g:1769:3: rule__Binding__BindingProvidedAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Binding__BindingProvidedAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getBindingProvidedAssignment_2()); 
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
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__BindingRequired__Group__0"
    // InternalFoo.g:1778:1: rule__BindingRequired__Group__0 : rule__BindingRequired__Group__0__Impl rule__BindingRequired__Group__1 ;
    public final void rule__BindingRequired__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1782:1: ( rule__BindingRequired__Group__0__Impl rule__BindingRequired__Group__1 )
            // InternalFoo.g:1783:2: rule__BindingRequired__Group__0__Impl rule__BindingRequired__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BindingRequired__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BindingRequired__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1790:1: rule__BindingRequired__Group__0__Impl : ( ( rule__BindingRequired__NameAssignment_0 ) ) ;
    public final void rule__BindingRequired__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1794:1: ( ( ( rule__BindingRequired__NameAssignment_0 ) ) )
            // InternalFoo.g:1795:1: ( ( rule__BindingRequired__NameAssignment_0 ) )
            {
            // InternalFoo.g:1795:1: ( ( rule__BindingRequired__NameAssignment_0 ) )
            // InternalFoo.g:1796:2: ( rule__BindingRequired__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRequiredAccess().getNameAssignment_0()); 
            }
            // InternalFoo.g:1797:2: ( rule__BindingRequired__NameAssignment_0 )
            // InternalFoo.g:1797:3: rule__BindingRequired__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BindingRequired__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingRequiredAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__BindingRequired__Group__0__Impl"


    // $ANTLR start "rule__BindingRequired__Group__1"
    // InternalFoo.g:1805:1: rule__BindingRequired__Group__1 : rule__BindingRequired__Group__1__Impl rule__BindingRequired__Group__2 ;
    public final void rule__BindingRequired__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1809:1: ( rule__BindingRequired__Group__1__Impl rule__BindingRequired__Group__2 )
            // InternalFoo.g:1810:2: rule__BindingRequired__Group__1__Impl rule__BindingRequired__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BindingRequired__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BindingRequired__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1817:1: rule__BindingRequired__Group__1__Impl : ( '.' ) ;
    public final void rule__BindingRequired__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1821:1: ( ( '.' ) )
            // InternalFoo.g:1822:1: ( '.' )
            {
            // InternalFoo.g:1822:1: ( '.' )
            // InternalFoo.g:1823:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRequiredAccess().getFullStopKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingRequiredAccess().getFullStopKeyword_1()); 
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
    // $ANTLR end "rule__BindingRequired__Group__1__Impl"


    // $ANTLR start "rule__BindingRequired__Group__2"
    // InternalFoo.g:1832:1: rule__BindingRequired__Group__2 : rule__BindingRequired__Group__2__Impl ;
    public final void rule__BindingRequired__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1836:1: ( rule__BindingRequired__Group__2__Impl )
            // InternalFoo.g:1837:2: rule__BindingRequired__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BindingRequired__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1843:1: rule__BindingRequired__Group__2__Impl : ( ( rule__BindingRequired__ServiceAssignment_2 ) ) ;
    public final void rule__BindingRequired__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1847:1: ( ( ( rule__BindingRequired__ServiceAssignment_2 ) ) )
            // InternalFoo.g:1848:1: ( ( rule__BindingRequired__ServiceAssignment_2 ) )
            {
            // InternalFoo.g:1848:1: ( ( rule__BindingRequired__ServiceAssignment_2 ) )
            // InternalFoo.g:1849:2: ( rule__BindingRequired__ServiceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRequiredAccess().getServiceAssignment_2()); 
            }
            // InternalFoo.g:1850:2: ( rule__BindingRequired__ServiceAssignment_2 )
            // InternalFoo.g:1850:3: rule__BindingRequired__ServiceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BindingRequired__ServiceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingRequiredAccess().getServiceAssignment_2()); 
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
    // $ANTLR end "rule__BindingRequired__Group__2__Impl"


    // $ANTLR start "rule__BindingProvided__Group__0"
    // InternalFoo.g:1859:1: rule__BindingProvided__Group__0 : rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1 ;
    public final void rule__BindingProvided__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1863:1: ( rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1 )
            // InternalFoo.g:1864:2: rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BindingProvided__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BindingProvided__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1871:1: rule__BindingProvided__Group__0__Impl : ( ( rule__BindingProvided__NameAssignment_0 ) ) ;
    public final void rule__BindingProvided__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1875:1: ( ( ( rule__BindingProvided__NameAssignment_0 ) ) )
            // InternalFoo.g:1876:1: ( ( rule__BindingProvided__NameAssignment_0 ) )
            {
            // InternalFoo.g:1876:1: ( ( rule__BindingProvided__NameAssignment_0 ) )
            // InternalFoo.g:1877:2: ( rule__BindingProvided__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingProvidedAccess().getNameAssignment_0()); 
            }
            // InternalFoo.g:1878:2: ( rule__BindingProvided__NameAssignment_0 )
            // InternalFoo.g:1878:3: rule__BindingProvided__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BindingProvided__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingProvidedAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__BindingProvided__Group__0__Impl"


    // $ANTLR start "rule__BindingProvided__Group__1"
    // InternalFoo.g:1886:1: rule__BindingProvided__Group__1 : rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2 ;
    public final void rule__BindingProvided__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1890:1: ( rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2 )
            // InternalFoo.g:1891:2: rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BindingProvided__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BindingProvided__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1898:1: rule__BindingProvided__Group__1__Impl : ( '.' ) ;
    public final void rule__BindingProvided__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1902:1: ( ( '.' ) )
            // InternalFoo.g:1903:1: ( '.' )
            {
            // InternalFoo.g:1903:1: ( '.' )
            // InternalFoo.g:1904:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingProvidedAccess().getFullStopKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingProvidedAccess().getFullStopKeyword_1()); 
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
    // $ANTLR end "rule__BindingProvided__Group__1__Impl"


    // $ANTLR start "rule__BindingProvided__Group__2"
    // InternalFoo.g:1913:1: rule__BindingProvided__Group__2 : rule__BindingProvided__Group__2__Impl ;
    public final void rule__BindingProvided__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1917:1: ( rule__BindingProvided__Group__2__Impl )
            // InternalFoo.g:1918:2: rule__BindingProvided__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BindingProvided__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1924:1: rule__BindingProvided__Group__2__Impl : ( ( rule__BindingProvided__ServiceAssignment_2 ) ) ;
    public final void rule__BindingProvided__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1928:1: ( ( ( rule__BindingProvided__ServiceAssignment_2 ) ) )
            // InternalFoo.g:1929:1: ( ( rule__BindingProvided__ServiceAssignment_2 ) )
            {
            // InternalFoo.g:1929:1: ( ( rule__BindingProvided__ServiceAssignment_2 ) )
            // InternalFoo.g:1930:2: ( rule__BindingProvided__ServiceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingProvidedAccess().getServiceAssignment_2()); 
            }
            // InternalFoo.g:1931:2: ( rule__BindingProvided__ServiceAssignment_2 )
            // InternalFoo.g:1931:3: rule__BindingProvided__ServiceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BindingProvided__ServiceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingProvidedAccess().getServiceAssignment_2()); 
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
    // $ANTLR end "rule__BindingProvided__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalFoo.g:1940:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1944:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalFoo.g:1945:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1952:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1956:1: ( ( 'Component' ) )
            // InternalFoo.g:1957:1: ( 'Component' )
            {
            // InternalFoo.g:1957:1: ( 'Component' )
            // InternalFoo.g:1958:2: 'Component'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
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
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalFoo.g:1967:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1971:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalFoo.g:1972:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:1979:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1983:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalFoo.g:1984:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalFoo.g:1984:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalFoo.g:1985:2: ( rule__Component__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            }
            // InternalFoo.g:1986:2: ( rule__Component__NameAssignment_1 )
            // InternalFoo.g:1986:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalFoo.g:1994:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1998:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalFoo.g:1999:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2006:1: rule__Component__Group__2__Impl : ( ( rule__Component__Group_2__0 )? ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2010:1: ( ( ( rule__Component__Group_2__0 )? ) )
            // InternalFoo.g:2011:1: ( ( rule__Component__Group_2__0 )? )
            {
            // InternalFoo.g:2011:1: ( ( rule__Component__Group_2__0 )? )
            // InternalFoo.g:2012:2: ( rule__Component__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_2()); 
            }
            // InternalFoo.g:2013:2: ( rule__Component__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFoo.g:2013:3: rule__Component__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalFoo.g:2021:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2025:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalFoo.g:2026:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Component__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2033:1: rule__Component__Group__3__Impl : ( '{' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2037:1: ( ( '{' ) )
            // InternalFoo.g:2038:1: ( '{' )
            {
            // InternalFoo.g:2038:1: ( '{' )
            // InternalFoo.g:2039:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalFoo.g:2048:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2052:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalFoo.g:2053:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Component__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2060:1: rule__Component__Group__4__Impl : ( ( rule__Component__ListOfPServicesAssignment_4 ) ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2064:1: ( ( ( rule__Component__ListOfPServicesAssignment_4 ) ) )
            // InternalFoo.g:2065:1: ( ( rule__Component__ListOfPServicesAssignment_4 ) )
            {
            // InternalFoo.g:2065:1: ( ( rule__Component__ListOfPServicesAssignment_4 ) )
            // InternalFoo.g:2066:2: ( rule__Component__ListOfPServicesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getListOfPServicesAssignment_4()); 
            }
            // InternalFoo.g:2067:2: ( rule__Component__ListOfPServicesAssignment_4 )
            // InternalFoo.g:2067:3: rule__Component__ListOfPServicesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Component__ListOfPServicesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getListOfPServicesAssignment_4()); 
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
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // InternalFoo.g:2075:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2079:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalFoo.g:2080:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Component__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2087:1: rule__Component__Group__5__Impl : ( ( rule__Component__ListOfRServicesAssignment_5 ) ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2091:1: ( ( ( rule__Component__ListOfRServicesAssignment_5 ) ) )
            // InternalFoo.g:2092:1: ( ( rule__Component__ListOfRServicesAssignment_5 ) )
            {
            // InternalFoo.g:2092:1: ( ( rule__Component__ListOfRServicesAssignment_5 ) )
            // InternalFoo.g:2093:2: ( rule__Component__ListOfRServicesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getListOfRServicesAssignment_5()); 
            }
            // InternalFoo.g:2094:2: ( rule__Component__ListOfRServicesAssignment_5 )
            // InternalFoo.g:2094:3: rule__Component__ListOfRServicesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Component__ListOfRServicesAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getListOfRServicesAssignment_5()); 
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
    // InternalFoo.g:2102:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2106:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalFoo.g:2107:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Component__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2114:1: rule__Component__Group__6__Impl : ( ( ( rule__Component__MProvServicesAssignment_6 ) ) ( ( rule__Component__MProvServicesAssignment_6 )* ) ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2118:1: ( ( ( ( rule__Component__MProvServicesAssignment_6 ) ) ( ( rule__Component__MProvServicesAssignment_6 )* ) ) )
            // InternalFoo.g:2119:1: ( ( ( rule__Component__MProvServicesAssignment_6 ) ) ( ( rule__Component__MProvServicesAssignment_6 )* ) )
            {
            // InternalFoo.g:2119:1: ( ( ( rule__Component__MProvServicesAssignment_6 ) ) ( ( rule__Component__MProvServicesAssignment_6 )* ) )
            // InternalFoo.g:2120:2: ( ( rule__Component__MProvServicesAssignment_6 ) ) ( ( rule__Component__MProvServicesAssignment_6 )* )
            {
            // InternalFoo.g:2120:2: ( ( rule__Component__MProvServicesAssignment_6 ) )
            // InternalFoo.g:2121:3: ( rule__Component__MProvServicesAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getMProvServicesAssignment_6()); 
            }
            // InternalFoo.g:2122:3: ( rule__Component__MProvServicesAssignment_6 )
            // InternalFoo.g:2122:4: rule__Component__MProvServicesAssignment_6
            {
            pushFollow(FOLLOW_24);
            rule__Component__MProvServicesAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getMProvServicesAssignment_6()); 
            }

            }

            // InternalFoo.g:2125:2: ( ( rule__Component__MProvServicesAssignment_6 )* )
            // InternalFoo.g:2126:3: ( rule__Component__MProvServicesAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getMProvServicesAssignment_6()); 
            }
            // InternalFoo.g:2127:3: ( rule__Component__MProvServicesAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==32) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalFoo.g:2127:4: rule__Component__MProvServicesAssignment_6
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Component__MProvServicesAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getMProvServicesAssignment_6()); 
            }

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
    // InternalFoo.g:2136:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2140:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalFoo.g:2141:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Component__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2148:1: rule__Component__Group__7__Impl : ( ( rule__Component__MReqServicesAssignment_7 )* ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2152:1: ( ( ( rule__Component__MReqServicesAssignment_7 )* ) )
            // InternalFoo.g:2153:1: ( ( rule__Component__MReqServicesAssignment_7 )* )
            {
            // InternalFoo.g:2153:1: ( ( rule__Component__MReqServicesAssignment_7 )* )
            // InternalFoo.g:2154:2: ( rule__Component__MReqServicesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getMReqServicesAssignment_7()); 
            }
            // InternalFoo.g:2155:2: ( rule__Component__MReqServicesAssignment_7 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFoo.g:2155:3: rule__Component__MReqServicesAssignment_7
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Component__MReqServicesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getMReqServicesAssignment_7()); 
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
    // $ANTLR end "rule__Component__Group__7__Impl"


    // $ANTLR start "rule__Component__Group__8"
    // InternalFoo.g:2163:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2167:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // InternalFoo.g:2168:2: rule__Component__Group__8__Impl rule__Component__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__Component__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2175:1: rule__Component__Group__8__Impl : ( ( rule__Component__Group_8__0 )* ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2179:1: ( ( ( rule__Component__Group_8__0 )* ) )
            // InternalFoo.g:2180:1: ( ( rule__Component__Group_8__0 )* )
            {
            // InternalFoo.g:2180:1: ( ( rule__Component__Group_8__0 )* )
            // InternalFoo.g:2181:2: ( rule__Component__Group_8__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_8()); 
            }
            // InternalFoo.g:2182:2: ( rule__Component__Group_8__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalFoo.g:2182:3: rule__Component__Group_8__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Component__Group_8__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_8()); 
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
    // $ANTLR end "rule__Component__Group__8__Impl"


    // $ANTLR start "rule__Component__Group__9"
    // InternalFoo.g:2190:1: rule__Component__Group__9 : rule__Component__Group__9__Impl ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2194:1: ( rule__Component__Group__9__Impl )
            // InternalFoo.g:2195:2: rule__Component__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2201:1: rule__Component__Group__9__Impl : ( '}' ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2205:1: ( ( '}' ) )
            // InternalFoo.g:2206:1: ( '}' )
            {
            // InternalFoo.g:2206:1: ( '}' )
            // InternalFoo.g:2207:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9()); 
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
    // $ANTLR end "rule__Component__Group__9__Impl"


    // $ANTLR start "rule__Component__Group_2__0"
    // InternalFoo.g:2217:1: rule__Component__Group_2__0 : rule__Component__Group_2__0__Impl rule__Component__Group_2__1 ;
    public final void rule__Component__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2221:1: ( rule__Component__Group_2__0__Impl rule__Component__Group_2__1 )
            // InternalFoo.g:2222:2: rule__Component__Group_2__0__Impl rule__Component__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2229:1: rule__Component__Group_2__0__Impl : ( 'refines' ) ;
    public final void rule__Component__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2233:1: ( ( 'refines' ) )
            // InternalFoo.g:2234:1: ( 'refines' )
            {
            // InternalFoo.g:2234:1: ( 'refines' )
            // InternalFoo.g:2235:2: 'refines'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRefinesKeyword_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRefinesKeyword_2_0()); 
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
    // $ANTLR end "rule__Component__Group_2__0__Impl"


    // $ANTLR start "rule__Component__Group_2__1"
    // InternalFoo.g:2244:1: rule__Component__Group_2__1 : rule__Component__Group_2__1__Impl ;
    public final void rule__Component__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2248:1: ( rule__Component__Group_2__1__Impl )
            // InternalFoo.g:2249:2: rule__Component__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2255:1: rule__Component__Group_2__1__Impl : ( ( rule__Component__RefinedComponentAssignment_2_1 ) ) ;
    public final void rule__Component__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2259:1: ( ( ( rule__Component__RefinedComponentAssignment_2_1 ) ) )
            // InternalFoo.g:2260:1: ( ( rule__Component__RefinedComponentAssignment_2_1 ) )
            {
            // InternalFoo.g:2260:1: ( ( rule__Component__RefinedComponentAssignment_2_1 ) )
            // InternalFoo.g:2261:2: ( rule__Component__RefinedComponentAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRefinedComponentAssignment_2_1()); 
            }
            // InternalFoo.g:2262:2: ( rule__Component__RefinedComponentAssignment_2_1 )
            // InternalFoo.g:2262:3: rule__Component__RefinedComponentAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__RefinedComponentAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRefinedComponentAssignment_2_1()); 
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
    // $ANTLR end "rule__Component__Group_2__1__Impl"


    // $ANTLR start "rule__Component__Group_8__0"
    // InternalFoo.g:2271:1: rule__Component__Group_8__0 : rule__Component__Group_8__0__Impl rule__Component__Group_8__1 ;
    public final void rule__Component__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2275:1: ( rule__Component__Group_8__0__Impl rule__Component__Group_8__1 )
            // InternalFoo.g:2276:2: rule__Component__Group_8__0__Impl rule__Component__Group_8__1
            {
            pushFollow(FOLLOW_26);
            rule__Component__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2283:1: rule__Component__Group_8__0__Impl : ( ( rule__Component__Group_8_0__0 )? ) ;
    public final void rule__Component__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2287:1: ( ( ( rule__Component__Group_8_0__0 )? ) )
            // InternalFoo.g:2288:1: ( ( rule__Component__Group_8_0__0 )? )
            {
            // InternalFoo.g:2288:1: ( ( rule__Component__Group_8_0__0 )? )
            // InternalFoo.g:2289:2: ( rule__Component__Group_8_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_8_0()); 
            }
            // InternalFoo.g:2290:2: ( rule__Component__Group_8_0__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFoo.g:2290:3: rule__Component__Group_8_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_8_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_8_0()); 
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
    // $ANTLR end "rule__Component__Group_8__0__Impl"


    // $ANTLR start "rule__Component__Group_8__1"
    // InternalFoo.g:2298:1: rule__Component__Group_8__1 : rule__Component__Group_8__1__Impl ;
    public final void rule__Component__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2302:1: ( rule__Component__Group_8__1__Impl )
            // InternalFoo.g:2303:2: rule__Component__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2309:1: rule__Component__Group_8__1__Impl : ( ( rule__Component__AssembliesAssignment_8_1 ) ) ;
    public final void rule__Component__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2313:1: ( ( ( rule__Component__AssembliesAssignment_8_1 ) ) )
            // InternalFoo.g:2314:1: ( ( rule__Component__AssembliesAssignment_8_1 ) )
            {
            // InternalFoo.g:2314:1: ( ( rule__Component__AssembliesAssignment_8_1 ) )
            // InternalFoo.g:2315:2: ( rule__Component__AssembliesAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getAssembliesAssignment_8_1()); 
            }
            // InternalFoo.g:2316:2: ( rule__Component__AssembliesAssignment_8_1 )
            // InternalFoo.g:2316:3: rule__Component__AssembliesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__AssembliesAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getAssembliesAssignment_8_1()); 
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
    // $ANTLR end "rule__Component__Group_8__1__Impl"


    // $ANTLR start "rule__Component__Group_8_0__0"
    // InternalFoo.g:2325:1: rule__Component__Group_8_0__0 : rule__Component__Group_8_0__0__Impl rule__Component__Group_8_0__1 ;
    public final void rule__Component__Group_8_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2329:1: ( rule__Component__Group_8_0__0__Impl rule__Component__Group_8_0__1 )
            // InternalFoo.g:2330:2: rule__Component__Group_8_0__0__Impl rule__Component__Group_8_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Component__Group_8_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_8_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2337:1: rule__Component__Group_8_0__0__Impl : ( 'assembly' ) ;
    public final void rule__Component__Group_8_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2341:1: ( ( 'assembly' ) )
            // InternalFoo.g:2342:1: ( 'assembly' )
            {
            // InternalFoo.g:2342:1: ( 'assembly' )
            // InternalFoo.g:2343:2: 'assembly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getAssemblyKeyword_8_0_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getAssemblyKeyword_8_0_0()); 
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
    // $ANTLR end "rule__Component__Group_8_0__0__Impl"


    // $ANTLR start "rule__Component__Group_8_0__1"
    // InternalFoo.g:2352:1: rule__Component__Group_8_0__1 : rule__Component__Group_8_0__1__Impl ;
    public final void rule__Component__Group_8_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2356:1: ( rule__Component__Group_8_0__1__Impl )
            // InternalFoo.g:2357:2: rule__Component__Group_8_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_8_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2363:1: rule__Component__Group_8_0__1__Impl : ( ':' ) ;
    public final void rule__Component__Group_8_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2367:1: ( ( ':' ) )
            // InternalFoo.g:2368:1: ( ':' )
            {
            // InternalFoo.g:2368:1: ( ':' )
            // InternalFoo.g:2369:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getColonKeyword_8_0_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getColonKeyword_8_0_1()); 
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
    // $ANTLR end "rule__Component__Group_8_0__1__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group__0"
    // InternalFoo.g:2379:1: rule__ListOfProvidedServices__Group__0 : rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1 ;
    public final void rule__ListOfProvidedServices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2383:1: ( rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1 )
            // InternalFoo.g:2384:2: rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ListOfProvidedServices__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2391:1: rule__ListOfProvidedServices__Group__0__Impl : ( 'provided' ) ;
    public final void rule__ListOfProvidedServices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2395:1: ( ( 'provided' ) )
            // InternalFoo.g:2396:1: ( 'provided' )
            {
            // InternalFoo.g:2396:1: ( 'provided' )
            // InternalFoo.g:2397:2: 'provided'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getProvidedKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfProvidedServicesAccess().getProvidedKeyword_0()); 
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
    // $ANTLR end "rule__ListOfProvidedServices__Group__0__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group__1"
    // InternalFoo.g:2406:1: rule__ListOfProvidedServices__Group__1 : rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2 ;
    public final void rule__ListOfProvidedServices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2410:1: ( rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2 )
            // InternalFoo.g:2411:2: rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ListOfProvidedServices__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2418:1: rule__ListOfProvidedServices__Group__1__Impl : ( '=' ) ;
    public final void rule__ListOfProvidedServices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2422:1: ( ( '=' ) )
            // InternalFoo.g:2423:1: ( '=' )
            {
            // InternalFoo.g:2423:1: ( '=' )
            // InternalFoo.g:2424:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getEqualsSignKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfProvidedServicesAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__ListOfProvidedServices__Group__1__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group__2"
    // InternalFoo.g:2433:1: rule__ListOfProvidedServices__Group__2 : rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3 ;
    public final void rule__ListOfProvidedServices__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2437:1: ( rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3 )
            // InternalFoo.g:2438:2: rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ListOfProvidedServices__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2445:1: rule__ListOfProvidedServices__Group__2__Impl : ( '{' ) ;
    public final void rule__ListOfProvidedServices__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2449:1: ( ( '{' ) )
            // InternalFoo.g:2450:1: ( '{' )
            {
            // InternalFoo.g:2450:1: ( '{' )
            // InternalFoo.g:2451:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfProvidedServicesAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__ListOfProvidedServices__Group__2__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group__3"
    // InternalFoo.g:2460:1: rule__ListOfProvidedServices__Group__3 : rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4 ;
    public final void rule__ListOfProvidedServices__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2464:1: ( rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4 )
            // InternalFoo.g:2465:2: rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ListOfProvidedServices__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2472:1: rule__ListOfProvidedServices__Group__3__Impl : ( ( rule__ListOfProvidedServices__Group_3__0 ) ) ;
    public final void rule__ListOfProvidedServices__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2476:1: ( ( ( rule__ListOfProvidedServices__Group_3__0 ) ) )
            // InternalFoo.g:2477:1: ( ( rule__ListOfProvidedServices__Group_3__0 ) )
            {
            // InternalFoo.g:2477:1: ( ( rule__ListOfProvidedServices__Group_3__0 ) )
            // InternalFoo.g:2478:2: ( rule__ListOfProvidedServices__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getGroup_3()); 
            }
            // InternalFoo.g:2479:2: ( rule__ListOfProvidedServices__Group_3__0 )
            // InternalFoo.g:2479:3: rule__ListOfProvidedServices__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfProvidedServicesAccess().getGroup_3()); 
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
    // $ANTLR end "rule__ListOfProvidedServices__Group__3__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group__4"
    // InternalFoo.g:2487:1: rule__ListOfProvidedServices__Group__4 : rule__ListOfProvidedServices__Group__4__Impl ;
    public final void rule__ListOfProvidedServices__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2491:1: ( rule__ListOfProvidedServices__Group__4__Impl )
            // InternalFoo.g:2492:2: rule__ListOfProvidedServices__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2498:1: rule__ListOfProvidedServices__Group__4__Impl : ( '}' ) ;
    public final void rule__ListOfProvidedServices__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2502:1: ( ( '}' ) )
            // InternalFoo.g:2503:1: ( '}' )
            {
            // InternalFoo.g:2503:1: ( '}' )
            // InternalFoo.g:2504:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfProvidedServicesAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__ListOfProvidedServices__Group__4__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group_3__0"
    // InternalFoo.g:2514:1: rule__ListOfProvidedServices__Group_3__0 : rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1 ;
    public final void rule__ListOfProvidedServices__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2518:1: ( rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1 )
            // InternalFoo.g:2519:2: rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1
            {
            pushFollow(FOLLOW_29);
            rule__ListOfProvidedServices__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2526:1: rule__ListOfProvidedServices__Group_3__0__Impl : ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) ) ;
    public final void rule__ListOfProvidedServices__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2530:1: ( ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) ) )
            // InternalFoo.g:2531:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) )
            {
            // InternalFoo.g:2531:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) )
            // InternalFoo.g:2532:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_0()); 
            }
            // InternalFoo.g:2533:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 )
            // InternalFoo.g:2533:3: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_0()); 
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
    // $ANTLR end "rule__ListOfProvidedServices__Group_3__0__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group_3__1"
    // InternalFoo.g:2541:1: rule__ListOfProvidedServices__Group_3__1 : rule__ListOfProvidedServices__Group_3__1__Impl ;
    public final void rule__ListOfProvidedServices__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2545:1: ( rule__ListOfProvidedServices__Group_3__1__Impl )
            // InternalFoo.g:2546:2: rule__ListOfProvidedServices__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2552:1: rule__ListOfProvidedServices__Group_3__1__Impl : ( ( rule__ListOfProvidedServices__Group_3_1__0 )* ) ;
    public final void rule__ListOfProvidedServices__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2556:1: ( ( ( rule__ListOfProvidedServices__Group_3_1__0 )* ) )
            // InternalFoo.g:2557:1: ( ( rule__ListOfProvidedServices__Group_3_1__0 )* )
            {
            // InternalFoo.g:2557:1: ( ( rule__ListOfProvidedServices__Group_3_1__0 )* )
            // InternalFoo.g:2558:2: ( rule__ListOfProvidedServices__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getGroup_3_1()); 
            }
            // InternalFoo.g:2559:2: ( rule__ListOfProvidedServices__Group_3_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==34) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalFoo.g:2559:3: rule__ListOfProvidedServices__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ListOfProvidedServices__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfProvidedServicesAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__ListOfProvidedServices__Group_3__1__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group_3_1__0"
    // InternalFoo.g:2568:1: rule__ListOfProvidedServices__Group_3_1__0 : rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1 ;
    public final void rule__ListOfProvidedServices__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2572:1: ( rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1 )
            // InternalFoo.g:2573:2: rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ListOfProvidedServices__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2580:1: rule__ListOfProvidedServices__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfProvidedServices__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2584:1: ( ( ',' ) )
            // InternalFoo.g:2585:1: ( ',' )
            {
            // InternalFoo.g:2585:1: ( ',' )
            // InternalFoo.g:2586:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfProvidedServicesAccess().getCommaKeyword_3_1_0()); 
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
    // $ANTLR end "rule__ListOfProvidedServices__Group_3_1__0__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group_3_1__1"
    // InternalFoo.g:2595:1: rule__ListOfProvidedServices__Group_3_1__1 : rule__ListOfProvidedServices__Group_3_1__1__Impl ;
    public final void rule__ListOfProvidedServices__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2599:1: ( rule__ListOfProvidedServices__Group_3_1__1__Impl )
            // InternalFoo.g:2600:2: rule__ListOfProvidedServices__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2606:1: rule__ListOfProvidedServices__Group_3_1__1__Impl : ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) ) ;
    public final void rule__ListOfProvidedServices__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2610:1: ( ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) ) )
            // InternalFoo.g:2611:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) )
            {
            // InternalFoo.g:2611:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) )
            // InternalFoo.g:2612:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_1_1()); 
            }
            // InternalFoo.g:2613:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 )
            // InternalFoo.g:2613:3: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_1_1()); 
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
    // $ANTLR end "rule__ListOfProvidedServices__Group_3_1__1__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group__0"
    // InternalFoo.g:2622:1: rule__ListOfrequiredServices__Group__0 : rule__ListOfrequiredServices__Group__0__Impl rule__ListOfrequiredServices__Group__1 ;
    public final void rule__ListOfrequiredServices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2626:1: ( rule__ListOfrequiredServices__Group__0__Impl rule__ListOfrequiredServices__Group__1 )
            // InternalFoo.g:2627:2: rule__ListOfrequiredServices__Group__0__Impl rule__ListOfrequiredServices__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ListOfrequiredServices__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2634:1: rule__ListOfrequiredServices__Group__0__Impl : ( () ) ;
    public final void rule__ListOfrequiredServices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2638:1: ( ( () ) )
            // InternalFoo.g:2639:1: ( () )
            {
            // InternalFoo.g:2639:1: ( () )
            // InternalFoo.g:2640:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getListOfrequiredServicesAction_0()); 
            }
            // InternalFoo.g:2641:2: ()
            // InternalFoo.g:2641:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfrequiredServicesAccess().getListOfrequiredServicesAction_0()); 
            }

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
    // InternalFoo.g:2649:1: rule__ListOfrequiredServices__Group__1 : rule__ListOfrequiredServices__Group__1__Impl rule__ListOfrequiredServices__Group__2 ;
    public final void rule__ListOfrequiredServices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2653:1: ( rule__ListOfrequiredServices__Group__1__Impl rule__ListOfrequiredServices__Group__2 )
            // InternalFoo.g:2654:2: rule__ListOfrequiredServices__Group__1__Impl rule__ListOfrequiredServices__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ListOfrequiredServices__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2661:1: rule__ListOfrequiredServices__Group__1__Impl : ( 'required' ) ;
    public final void rule__ListOfrequiredServices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2665:1: ( ( 'required' ) )
            // InternalFoo.g:2666:1: ( 'required' )
            {
            // InternalFoo.g:2666:1: ( 'required' )
            // InternalFoo.g:2667:2: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getRequiredKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfrequiredServicesAccess().getRequiredKeyword_1()); 
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
    // $ANTLR end "rule__ListOfrequiredServices__Group__1__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group__2"
    // InternalFoo.g:2676:1: rule__ListOfrequiredServices__Group__2 : rule__ListOfrequiredServices__Group__2__Impl rule__ListOfrequiredServices__Group__3 ;
    public final void rule__ListOfrequiredServices__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2680:1: ( rule__ListOfrequiredServices__Group__2__Impl rule__ListOfrequiredServices__Group__3 )
            // InternalFoo.g:2681:2: rule__ListOfrequiredServices__Group__2__Impl rule__ListOfrequiredServices__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ListOfrequiredServices__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2688:1: rule__ListOfrequiredServices__Group__2__Impl : ( '=' ) ;
    public final void rule__ListOfrequiredServices__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2692:1: ( ( '=' ) )
            // InternalFoo.g:2693:1: ( '=' )
            {
            // InternalFoo.g:2693:1: ( '=' )
            // InternalFoo.g:2694:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getEqualsSignKeyword_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfrequiredServicesAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__ListOfrequiredServices__Group__2__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group__3"
    // InternalFoo.g:2703:1: rule__ListOfrequiredServices__Group__3 : rule__ListOfrequiredServices__Group__3__Impl rule__ListOfrequiredServices__Group__4 ;
    public final void rule__ListOfrequiredServices__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2707:1: ( rule__ListOfrequiredServices__Group__3__Impl rule__ListOfrequiredServices__Group__4 )
            // InternalFoo.g:2708:2: rule__ListOfrequiredServices__Group__3__Impl rule__ListOfrequiredServices__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__ListOfrequiredServices__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2715:1: rule__ListOfrequiredServices__Group__3__Impl : ( '{' ) ;
    public final void rule__ListOfrequiredServices__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2719:1: ( ( '{' ) )
            // InternalFoo.g:2720:1: ( '{' )
            {
            // InternalFoo.g:2720:1: ( '{' )
            // InternalFoo.g:2721:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfrequiredServicesAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__ListOfrequiredServices__Group__3__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group__4"
    // InternalFoo.g:2730:1: rule__ListOfrequiredServices__Group__4 : rule__ListOfrequiredServices__Group__4__Impl rule__ListOfrequiredServices__Group__5 ;
    public final void rule__ListOfrequiredServices__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2734:1: ( rule__ListOfrequiredServices__Group__4__Impl rule__ListOfrequiredServices__Group__5 )
            // InternalFoo.g:2735:2: rule__ListOfrequiredServices__Group__4__Impl rule__ListOfrequiredServices__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__ListOfrequiredServices__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2742:1: rule__ListOfrequiredServices__Group__4__Impl : ( ( rule__ListOfrequiredServices__Group_4__0 ) ) ;
    public final void rule__ListOfrequiredServices__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2746:1: ( ( ( rule__ListOfrequiredServices__Group_4__0 ) ) )
            // InternalFoo.g:2747:1: ( ( rule__ListOfrequiredServices__Group_4__0 ) )
            {
            // InternalFoo.g:2747:1: ( ( rule__ListOfrequiredServices__Group_4__0 ) )
            // InternalFoo.g:2748:2: ( rule__ListOfrequiredServices__Group_4__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getGroup_4()); 
            }
            // InternalFoo.g:2749:2: ( rule__ListOfrequiredServices__Group_4__0 )
            // InternalFoo.g:2749:3: rule__ListOfrequiredServices__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group_4__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfrequiredServicesAccess().getGroup_4()); 
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
    // $ANTLR end "rule__ListOfrequiredServices__Group__4__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group__5"
    // InternalFoo.g:2757:1: rule__ListOfrequiredServices__Group__5 : rule__ListOfrequiredServices__Group__5__Impl ;
    public final void rule__ListOfrequiredServices__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2761:1: ( rule__ListOfrequiredServices__Group__5__Impl )
            // InternalFoo.g:2762:2: rule__ListOfrequiredServices__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2768:1: rule__ListOfrequiredServices__Group__5__Impl : ( '}' ) ;
    public final void rule__ListOfrequiredServices__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2772:1: ( ( '}' ) )
            // InternalFoo.g:2773:1: ( '}' )
            {
            // InternalFoo.g:2773:1: ( '}' )
            // InternalFoo.g:2774:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfrequiredServicesAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__ListOfrequiredServices__Group__5__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group_4__0"
    // InternalFoo.g:2784:1: rule__ListOfrequiredServices__Group_4__0 : rule__ListOfrequiredServices__Group_4__0__Impl rule__ListOfrequiredServices__Group_4__1 ;
    public final void rule__ListOfrequiredServices__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2788:1: ( rule__ListOfrequiredServices__Group_4__0__Impl rule__ListOfrequiredServices__Group_4__1 )
            // InternalFoo.g:2789:2: rule__ListOfrequiredServices__Group_4__0__Impl rule__ListOfrequiredServices__Group_4__1
            {
            pushFollow(FOLLOW_31);
            rule__ListOfrequiredServices__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2796:1: rule__ListOfrequiredServices__Group_4__0__Impl : ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? ) ;
    public final void rule__ListOfrequiredServices__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2800:1: ( ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? ) )
            // InternalFoo.g:2801:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? )
            {
            // InternalFoo.g:2801:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? )
            // InternalFoo.g:2802:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesAssignment_4_0()); 
            }
            // InternalFoo.g:2803:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFoo.g:2803:3: rule__ListOfrequiredServices__RequiredServicesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListOfrequiredServices__RequiredServicesAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesAssignment_4_0()); 
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
    // $ANTLR end "rule__ListOfrequiredServices__Group_4__0__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group_4__1"
    // InternalFoo.g:2811:1: rule__ListOfrequiredServices__Group_4__1 : rule__ListOfrequiredServices__Group_4__1__Impl ;
    public final void rule__ListOfrequiredServices__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2815:1: ( rule__ListOfrequiredServices__Group_4__1__Impl )
            // InternalFoo.g:2816:2: rule__ListOfrequiredServices__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2822:1: rule__ListOfrequiredServices__Group_4__1__Impl : ( ( rule__ListOfrequiredServices__Group_4_1__0 )* ) ;
    public final void rule__ListOfrequiredServices__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2826:1: ( ( ( rule__ListOfrequiredServices__Group_4_1__0 )* ) )
            // InternalFoo.g:2827:1: ( ( rule__ListOfrequiredServices__Group_4_1__0 )* )
            {
            // InternalFoo.g:2827:1: ( ( rule__ListOfrequiredServices__Group_4_1__0 )* )
            // InternalFoo.g:2828:2: ( rule__ListOfrequiredServices__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getGroup_4_1()); 
            }
            // InternalFoo.g:2829:2: ( rule__ListOfrequiredServices__Group_4_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==34) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalFoo.g:2829:3: rule__ListOfrequiredServices__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ListOfrequiredServices__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfrequiredServicesAccess().getGroup_4_1()); 
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
    // $ANTLR end "rule__ListOfrequiredServices__Group_4__1__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group_4_1__0"
    // InternalFoo.g:2838:1: rule__ListOfrequiredServices__Group_4_1__0 : rule__ListOfrequiredServices__Group_4_1__0__Impl rule__ListOfrequiredServices__Group_4_1__1 ;
    public final void rule__ListOfrequiredServices__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2842:1: ( rule__ListOfrequiredServices__Group_4_1__0__Impl rule__ListOfrequiredServices__Group_4_1__1 )
            // InternalFoo.g:2843:2: rule__ListOfrequiredServices__Group_4_1__0__Impl rule__ListOfrequiredServices__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ListOfrequiredServices__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2850:1: rule__ListOfrequiredServices__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfrequiredServices__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2854:1: ( ( ',' ) )
            // InternalFoo.g:2855:1: ( ',' )
            {
            // InternalFoo.g:2855:1: ( ',' )
            // InternalFoo.g:2856:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfrequiredServicesAccess().getCommaKeyword_4_1_0()); 
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
    // $ANTLR end "rule__ListOfrequiredServices__Group_4_1__0__Impl"


    // $ANTLR start "rule__ListOfrequiredServices__Group_4_1__1"
    // InternalFoo.g:2865:1: rule__ListOfrequiredServices__Group_4_1__1 : rule__ListOfrequiredServices__Group_4_1__1__Impl ;
    public final void rule__ListOfrequiredServices__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2869:1: ( rule__ListOfrequiredServices__Group_4_1__1__Impl )
            // InternalFoo.g:2870:2: rule__ListOfrequiredServices__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2876:1: rule__ListOfrequiredServices__Group_4_1__1__Impl : ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) ) ;
    public final void rule__ListOfrequiredServices__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2880:1: ( ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) ) )
            // InternalFoo.g:2881:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) )
            {
            // InternalFoo.g:2881:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) )
            // InternalFoo.g:2882:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesAssignment_4_1_1()); 
            }
            // InternalFoo.g:2883:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 )
            // InternalFoo.g:2883:3: rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesAssignment_4_1_1()); 
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
    // $ANTLR end "rule__ListOfrequiredServices__Group_4_1__1__Impl"


    // $ANTLR start "rule__MProvidedService__Group__0"
    // InternalFoo.g:2892:1: rule__MProvidedService__Group__0 : rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1 ;
    public final void rule__MProvidedService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2896:1: ( rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1 )
            // InternalFoo.g:2897:2: rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MProvidedService__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MProvidedService__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2904:1: rule__MProvidedService__Group__0__Impl : ( 'service' ) ;
    public final void rule__MProvidedService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2908:1: ( ( 'service' ) )
            // InternalFoo.g:2909:1: ( 'service' )
            {
            // InternalFoo.g:2909:1: ( 'service' )
            // InternalFoo.g:2910:2: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getServiceKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMProvidedServiceAccess().getServiceKeyword_0()); 
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
    // $ANTLR end "rule__MProvidedService__Group__0__Impl"


    // $ANTLR start "rule__MProvidedService__Group__1"
    // InternalFoo.g:2919:1: rule__MProvidedService__Group__1 : rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2 ;
    public final void rule__MProvidedService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2923:1: ( rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2 )
            // InternalFoo.g:2924:2: rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MProvidedService__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MProvidedService__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2931:1: rule__MProvidedService__Group__1__Impl : ( 'provided' ) ;
    public final void rule__MProvidedService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2935:1: ( ( 'provided' ) )
            // InternalFoo.g:2936:1: ( 'provided' )
            {
            // InternalFoo.g:2936:1: ( 'provided' )
            // InternalFoo.g:2937:2: 'provided'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getProvidedKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMProvidedServiceAccess().getProvidedKeyword_1()); 
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
    // $ANTLR end "rule__MProvidedService__Group__1__Impl"


    // $ANTLR start "rule__MProvidedService__Group__2"
    // InternalFoo.g:2946:1: rule__MProvidedService__Group__2 : rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3 ;
    public final void rule__MProvidedService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2950:1: ( rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3 )
            // InternalFoo.g:2951:2: rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__MProvidedService__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MProvidedService__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2958:1: rule__MProvidedService__Group__2__Impl : ( ( rule__MProvidedService__SignatureAssignment_2 ) ) ;
    public final void rule__MProvidedService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2962:1: ( ( ( rule__MProvidedService__SignatureAssignment_2 ) ) )
            // InternalFoo.g:2963:1: ( ( rule__MProvidedService__SignatureAssignment_2 ) )
            {
            // InternalFoo.g:2963:1: ( ( rule__MProvidedService__SignatureAssignment_2 ) )
            // InternalFoo.g:2964:2: ( rule__MProvidedService__SignatureAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getSignatureAssignment_2()); 
            }
            // InternalFoo.g:2965:2: ( rule__MProvidedService__SignatureAssignment_2 )
            // InternalFoo.g:2965:3: rule__MProvidedService__SignatureAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MProvidedService__SignatureAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMProvidedServiceAccess().getSignatureAssignment_2()); 
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
    // $ANTLR end "rule__MProvidedService__Group__2__Impl"


    // $ANTLR start "rule__MProvidedService__Group__3"
    // InternalFoo.g:2973:1: rule__MProvidedService__Group__3 : rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4 ;
    public final void rule__MProvidedService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2977:1: ( rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4 )
            // InternalFoo.g:2978:2: rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__MProvidedService__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MProvidedService__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:2985:1: rule__MProvidedService__Group__3__Impl : ( '{' ) ;
    public final void rule__MProvidedService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2989:1: ( ( '{' ) )
            // InternalFoo.g:2990:1: ( '{' )
            {
            // InternalFoo.g:2990:1: ( '{' )
            // InternalFoo.g:2991:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMProvidedServiceAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__MProvidedService__Group__3__Impl"


    // $ANTLR start "rule__MProvidedService__Group__4"
    // InternalFoo.g:3000:1: rule__MProvidedService__Group__4 : rule__MProvidedService__Group__4__Impl rule__MProvidedService__Group__5 ;
    public final void rule__MProvidedService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3004:1: ( rule__MProvidedService__Group__4__Impl rule__MProvidedService__Group__5 )
            // InternalFoo.g:3005:2: rule__MProvidedService__Group__4__Impl rule__MProvidedService__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__MProvidedService__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MProvidedService__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3012:1: rule__MProvidedService__Group__4__Impl : ( ( ( rule__MProvidedService__ExpressionsAssignment_4 ) ) ( ( rule__MProvidedService__ExpressionsAssignment_4 )* ) ) ;
    public final void rule__MProvidedService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3016:1: ( ( ( ( rule__MProvidedService__ExpressionsAssignment_4 ) ) ( ( rule__MProvidedService__ExpressionsAssignment_4 )* ) ) )
            // InternalFoo.g:3017:1: ( ( ( rule__MProvidedService__ExpressionsAssignment_4 ) ) ( ( rule__MProvidedService__ExpressionsAssignment_4 )* ) )
            {
            // InternalFoo.g:3017:1: ( ( ( rule__MProvidedService__ExpressionsAssignment_4 ) ) ( ( rule__MProvidedService__ExpressionsAssignment_4 )* ) )
            // InternalFoo.g:3018:2: ( ( rule__MProvidedService__ExpressionsAssignment_4 ) ) ( ( rule__MProvidedService__ExpressionsAssignment_4 )* )
            {
            // InternalFoo.g:3018:2: ( ( rule__MProvidedService__ExpressionsAssignment_4 ) )
            // InternalFoo.g:3019:3: ( rule__MProvidedService__ExpressionsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getExpressionsAssignment_4()); 
            }
            // InternalFoo.g:3020:3: ( rule__MProvidedService__ExpressionsAssignment_4 )
            // InternalFoo.g:3020:4: rule__MProvidedService__ExpressionsAssignment_4
            {
            pushFollow(FOLLOW_33);
            rule__MProvidedService__ExpressionsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMProvidedServiceAccess().getExpressionsAssignment_4()); 
            }

            }

            // InternalFoo.g:3023:2: ( ( rule__MProvidedService__ExpressionsAssignment_4 )* )
            // InternalFoo.g:3024:3: ( rule__MProvidedService__ExpressionsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getExpressionsAssignment_4()); 
            }
            // InternalFoo.g:3025:3: ( rule__MProvidedService__ExpressionsAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==37||LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalFoo.g:3025:4: rule__MProvidedService__ExpressionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__MProvidedService__ExpressionsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMProvidedServiceAccess().getExpressionsAssignment_4()); 
            }

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
    // InternalFoo.g:3034:1: rule__MProvidedService__Group__5 : rule__MProvidedService__Group__5__Impl ;
    public final void rule__MProvidedService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3038:1: ( rule__MProvidedService__Group__5__Impl )
            // InternalFoo.g:3039:2: rule__MProvidedService__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MProvidedService__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3045:1: rule__MProvidedService__Group__5__Impl : ( '}' ) ;
    public final void rule__MProvidedService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3049:1: ( ( '}' ) )
            // InternalFoo.g:3050:1: ( '}' )
            {
            // InternalFoo.g:3050:1: ( '}' )
            // InternalFoo.g:3051:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMProvidedServiceAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__MProvidedService__Group__5__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalFoo.g:3061:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3065:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalFoo.g:3066:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3073:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3077:1: ( ( 'if' ) )
            // InternalFoo.g:3078:1: ( 'if' )
            {
            // InternalFoo.g:3078:1: ( 'if' )
            // InternalFoo.g:3079:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getIfKeyword_0()); 
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
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalFoo.g:3088:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3092:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalFoo.g:3093:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3100:1: rule__If__Group__1__Impl : ( '(' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3104:1: ( ( '(' ) )
            // InternalFoo.g:3105:1: ( '(' )
            {
            // InternalFoo.g:3105:1: ( '(' )
            // InternalFoo.g:3106:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalFoo.g:3115:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3119:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalFoo.g:3120:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3127:1: rule__If__Group__2__Impl : ( ( rule__If__Group_2__0 )* ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3131:1: ( ( ( rule__If__Group_2__0 )* ) )
            // InternalFoo.g:3132:1: ( ( rule__If__Group_2__0 )* )
            {
            // InternalFoo.g:3132:1: ( ( rule__If__Group_2__0 )* )
            // InternalFoo.g:3133:2: ( rule__If__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_2()); 
            }
            // InternalFoo.g:3134:2: ( rule__If__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalFoo.g:3134:3: rule__If__Group_2__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__If__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup_2()); 
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
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // InternalFoo.g:3142:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3146:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalFoo.g:3147:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3154:1: rule__If__Group__3__Impl : ( ( rule__If__ConditionsAssignment_3 ) ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3158:1: ( ( ( rule__If__ConditionsAssignment_3 ) ) )
            // InternalFoo.g:3159:1: ( ( rule__If__ConditionsAssignment_3 ) )
            {
            // InternalFoo.g:3159:1: ( ( rule__If__ConditionsAssignment_3 ) )
            // InternalFoo.g:3160:2: ( rule__If__ConditionsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionsAssignment_3()); 
            }
            // InternalFoo.g:3161:2: ( rule__If__ConditionsAssignment_3 )
            // InternalFoo.g:3161:3: rule__If__ConditionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__If__ConditionsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getConditionsAssignment_3()); 
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
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // InternalFoo.g:3169:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3173:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalFoo.g:3174:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__If__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3181:1: rule__If__Group__4__Impl : ( ')' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3185:1: ( ( ')' ) )
            // InternalFoo.g:3186:1: ( ')' )
            {
            // InternalFoo.g:3186:1: ( ')' )
            // InternalFoo.g:3187:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group__5"
    // InternalFoo.g:3196:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3200:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalFoo.g:3201:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__If__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3208:1: rule__If__Group__5__Impl : ( '{' ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3212:1: ( ( '{' ) )
            // InternalFoo.g:3213:1: ( '{' )
            {
            // InternalFoo.g:3213:1: ( '{' )
            // InternalFoo.g:3214:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__If__Group__5__Impl"


    // $ANTLR start "rule__If__Group__6"
    // InternalFoo.g:3223:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3227:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // InternalFoo.g:3228:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__If__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3235:1: rule__If__Group__6__Impl : ( ( ( rule__If__Alternatives_6 ) ) ( ( rule__If__Alternatives_6 )* ) ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3239:1: ( ( ( ( rule__If__Alternatives_6 ) ) ( ( rule__If__Alternatives_6 )* ) ) )
            // InternalFoo.g:3240:1: ( ( ( rule__If__Alternatives_6 ) ) ( ( rule__If__Alternatives_6 )* ) )
            {
            // InternalFoo.g:3240:1: ( ( ( rule__If__Alternatives_6 ) ) ( ( rule__If__Alternatives_6 )* ) )
            // InternalFoo.g:3241:2: ( ( rule__If__Alternatives_6 ) ) ( ( rule__If__Alternatives_6 )* )
            {
            // InternalFoo.g:3241:2: ( ( rule__If__Alternatives_6 ) )
            // InternalFoo.g:3242:3: ( rule__If__Alternatives_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAlternatives_6()); 
            }
            // InternalFoo.g:3243:3: ( rule__If__Alternatives_6 )
            // InternalFoo.g:3243:4: rule__If__Alternatives_6
            {
            pushFollow(FOLLOW_33);
            rule__If__Alternatives_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getAlternatives_6()); 
            }

            }

            // InternalFoo.g:3246:2: ( ( rule__If__Alternatives_6 )* )
            // InternalFoo.g:3247:3: ( rule__If__Alternatives_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAlternatives_6()); 
            }
            // InternalFoo.g:3248:3: ( rule__If__Alternatives_6 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==37||LA27_0==42) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalFoo.g:3248:4: rule__If__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__If__Alternatives_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getAlternatives_6()); 
            }

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
    // $ANTLR end "rule__If__Group__6__Impl"


    // $ANTLR start "rule__If__Group__7"
    // InternalFoo.g:3257:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3261:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // InternalFoo.g:3262:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_38);
            rule__If__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3269:1: rule__If__Group__7__Impl : ( '}' ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3273:1: ( ( '}' ) )
            // InternalFoo.g:3274:1: ( '}' )
            {
            // InternalFoo.g:3274:1: ( '}' )
            // InternalFoo.g:3275:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__If__Group__7__Impl"


    // $ANTLR start "rule__If__Group__8"
    // InternalFoo.g:3284:1: rule__If__Group__8 : rule__If__Group__8__Impl ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3288:1: ( rule__If__Group__8__Impl )
            // InternalFoo.g:3289:2: rule__If__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3295:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3299:1: ( ( ( rule__If__Group_8__0 )? ) )
            // InternalFoo.g:3300:1: ( ( rule__If__Group_8__0 )? )
            {
            // InternalFoo.g:3300:1: ( ( rule__If__Group_8__0 )? )
            // InternalFoo.g:3301:2: ( rule__If__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_8()); 
            }
            // InternalFoo.g:3302:2: ( rule__If__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFoo.g:3302:3: rule__If__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup_8()); 
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
    // $ANTLR end "rule__If__Group__8__Impl"


    // $ANTLR start "rule__If__Group_2__0"
    // InternalFoo.g:3311:1: rule__If__Group_2__0 : rule__If__Group_2__0__Impl rule__If__Group_2__1 ;
    public final void rule__If__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3315:1: ( rule__If__Group_2__0__Impl rule__If__Group_2__1 )
            // InternalFoo.g:3316:2: rule__If__Group_2__0__Impl rule__If__Group_2__1
            {
            pushFollow(FOLLOW_39);
            rule__If__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3323:1: rule__If__Group_2__0__Impl : ( ( rule__If__ConditionsAssignment_2_0 ) ) ;
    public final void rule__If__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3327:1: ( ( ( rule__If__ConditionsAssignment_2_0 ) ) )
            // InternalFoo.g:3328:1: ( ( rule__If__ConditionsAssignment_2_0 ) )
            {
            // InternalFoo.g:3328:1: ( ( rule__If__ConditionsAssignment_2_0 ) )
            // InternalFoo.g:3329:2: ( rule__If__ConditionsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionsAssignment_2_0()); 
            }
            // InternalFoo.g:3330:2: ( rule__If__ConditionsAssignment_2_0 )
            // InternalFoo.g:3330:3: rule__If__ConditionsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__If__ConditionsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getConditionsAssignment_2_0()); 
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
    // $ANTLR end "rule__If__Group_2__0__Impl"


    // $ANTLR start "rule__If__Group_2__1"
    // InternalFoo.g:3338:1: rule__If__Group_2__1 : rule__If__Group_2__1__Impl ;
    public final void rule__If__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3342:1: ( rule__If__Group_2__1__Impl )
            // InternalFoo.g:3343:2: rule__If__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3349:1: rule__If__Group_2__1__Impl : ( ( rule__If__Alternatives_2_1 ) ) ;
    public final void rule__If__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3353:1: ( ( ( rule__If__Alternatives_2_1 ) ) )
            // InternalFoo.g:3354:1: ( ( rule__If__Alternatives_2_1 ) )
            {
            // InternalFoo.g:3354:1: ( ( rule__If__Alternatives_2_1 ) )
            // InternalFoo.g:3355:2: ( rule__If__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAlternatives_2_1()); 
            }
            // InternalFoo.g:3356:2: ( rule__If__Alternatives_2_1 )
            // InternalFoo.g:3356:3: rule__If__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__If__Alternatives_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getAlternatives_2_1()); 
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
    // $ANTLR end "rule__If__Group_2__1__Impl"


    // $ANTLR start "rule__If__Group_6_0__0"
    // InternalFoo.g:3365:1: rule__If__Group_6_0__0 : rule__If__Group_6_0__0__Impl rule__If__Group_6_0__1 ;
    public final void rule__If__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3369:1: ( rule__If__Group_6_0__0__Impl rule__If__Group_6_0__1 )
            // InternalFoo.g:3370:2: rule__If__Group_6_0__0__Impl rule__If__Group_6_0__1
            {
            pushFollow(FOLLOW_40);
            rule__If__Group_6_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group_6_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_6_0__0"


    // $ANTLR start "rule__If__Group_6_0__0__Impl"
    // InternalFoo.g:3377:1: rule__If__Group_6_0__0__Impl : ( ( rule__If__StrAssignment_6_0_0 ) ) ;
    public final void rule__If__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3381:1: ( ( ( rule__If__StrAssignment_6_0_0 ) ) )
            // InternalFoo.g:3382:1: ( ( rule__If__StrAssignment_6_0_0 ) )
            {
            // InternalFoo.g:3382:1: ( ( rule__If__StrAssignment_6_0_0 ) )
            // InternalFoo.g:3383:2: ( rule__If__StrAssignment_6_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getStrAssignment_6_0_0()); 
            }
            // InternalFoo.g:3384:2: ( rule__If__StrAssignment_6_0_0 )
            // InternalFoo.g:3384:3: rule__If__StrAssignment_6_0_0
            {
            pushFollow(FOLLOW_2);
            rule__If__StrAssignment_6_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getStrAssignment_6_0_0()); 
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
    // $ANTLR end "rule__If__Group_6_0__0__Impl"


    // $ANTLR start "rule__If__Group_6_0__1"
    // InternalFoo.g:3392:1: rule__If__Group_6_0__1 : rule__If__Group_6_0__1__Impl ;
    public final void rule__If__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3396:1: ( rule__If__Group_6_0__1__Impl )
            // InternalFoo.g:3397:2: rule__If__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_6_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_6_0__1"


    // $ANTLR start "rule__If__Group_6_0__1__Impl"
    // InternalFoo.g:3403:1: rule__If__Group_6_0__1__Impl : ( ';' ) ;
    public final void rule__If__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3407:1: ( ( ';' ) )
            // InternalFoo.g:3408:1: ( ';' )
            {
            // InternalFoo.g:3408:1: ( ';' )
            // InternalFoo.g:3409:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getSemicolonKeyword_6_0_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getSemicolonKeyword_6_0_1()); 
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
    // $ANTLR end "rule__If__Group_6_0__1__Impl"


    // $ANTLR start "rule__If__Group_8__0"
    // InternalFoo.g:3419:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3423:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // InternalFoo.g:3424:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
            {
            pushFollow(FOLLOW_41);
            rule__If__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3431:1: rule__If__Group_8__0__Impl : ( ( 'else' ) ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3435:1: ( ( ( 'else' ) ) )
            // InternalFoo.g:3436:1: ( ( 'else' ) )
            {
            // InternalFoo.g:3436:1: ( ( 'else' ) )
            // InternalFoo.g:3437:2: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            }
            // InternalFoo.g:3438:2: ( 'else' )
            // InternalFoo.g:3438:3: 'else'
            {
            match(input,41,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
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
    // $ANTLR end "rule__If__Group_8__0__Impl"


    // $ANTLR start "rule__If__Group_8__1"
    // InternalFoo.g:3446:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3450:1: ( rule__If__Group_8__1__Impl )
            // InternalFoo.g:3451:2: rule__If__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3457:1: rule__If__Group_8__1__Impl : ( ( rule__If__Alternatives_8_1 ) ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3461:1: ( ( ( rule__If__Alternatives_8_1 ) ) )
            // InternalFoo.g:3462:1: ( ( rule__If__Alternatives_8_1 ) )
            {
            // InternalFoo.g:3462:1: ( ( rule__If__Alternatives_8_1 ) )
            // InternalFoo.g:3463:2: ( rule__If__Alternatives_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAlternatives_8_1()); 
            }
            // InternalFoo.g:3464:2: ( rule__If__Alternatives_8_1 )
            // InternalFoo.g:3464:3: rule__If__Alternatives_8_1
            {
            pushFollow(FOLLOW_2);
            rule__If__Alternatives_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getAlternatives_8_1()); 
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
    // $ANTLR end "rule__If__Group_8__1__Impl"


    // $ANTLR start "rule__If__Group_8_1_1__0"
    // InternalFoo.g:3473:1: rule__If__Group_8_1_1__0 : rule__If__Group_8_1_1__0__Impl rule__If__Group_8_1_1__1 ;
    public final void rule__If__Group_8_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3477:1: ( rule__If__Group_8_1_1__0__Impl rule__If__Group_8_1_1__1 )
            // InternalFoo.g:3478:2: rule__If__Group_8_1_1__0__Impl rule__If__Group_8_1_1__1
            {
            pushFollow(FOLLOW_32);
            rule__If__Group_8_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group_8_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3485:1: rule__If__Group_8_1_1__0__Impl : ( '{' ) ;
    public final void rule__If__Group_8_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3489:1: ( ( '{' ) )
            // InternalFoo.g:3490:1: ( '{' )
            {
            // InternalFoo.g:3490:1: ( '{' )
            // InternalFoo.g:3491:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_1_1_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_1_1_0()); 
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
    // $ANTLR end "rule__If__Group_8_1_1__0__Impl"


    // $ANTLR start "rule__If__Group_8_1_1__1"
    // InternalFoo.g:3500:1: rule__If__Group_8_1_1__1 : rule__If__Group_8_1_1__1__Impl rule__If__Group_8_1_1__2 ;
    public final void rule__If__Group_8_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3504:1: ( rule__If__Group_8_1_1__1__Impl rule__If__Group_8_1_1__2 )
            // InternalFoo.g:3505:2: rule__If__Group_8_1_1__1__Impl rule__If__Group_8_1_1__2
            {
            pushFollow(FOLLOW_28);
            rule__If__Group_8_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group_8_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3512:1: rule__If__Group_8_1_1__1__Impl : ( ( ( rule__If__Alternatives_8_1_1_1 ) ) ( ( rule__If__Alternatives_8_1_1_1 )* ) ) ;
    public final void rule__If__Group_8_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3516:1: ( ( ( ( rule__If__Alternatives_8_1_1_1 ) ) ( ( rule__If__Alternatives_8_1_1_1 )* ) ) )
            // InternalFoo.g:3517:1: ( ( ( rule__If__Alternatives_8_1_1_1 ) ) ( ( rule__If__Alternatives_8_1_1_1 )* ) )
            {
            // InternalFoo.g:3517:1: ( ( ( rule__If__Alternatives_8_1_1_1 ) ) ( ( rule__If__Alternatives_8_1_1_1 )* ) )
            // InternalFoo.g:3518:2: ( ( rule__If__Alternatives_8_1_1_1 ) ) ( ( rule__If__Alternatives_8_1_1_1 )* )
            {
            // InternalFoo.g:3518:2: ( ( rule__If__Alternatives_8_1_1_1 ) )
            // InternalFoo.g:3519:3: ( rule__If__Alternatives_8_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAlternatives_8_1_1_1()); 
            }
            // InternalFoo.g:3520:3: ( rule__If__Alternatives_8_1_1_1 )
            // InternalFoo.g:3520:4: rule__If__Alternatives_8_1_1_1
            {
            pushFollow(FOLLOW_33);
            rule__If__Alternatives_8_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getAlternatives_8_1_1_1()); 
            }

            }

            // InternalFoo.g:3523:2: ( ( rule__If__Alternatives_8_1_1_1 )* )
            // InternalFoo.g:3524:3: ( rule__If__Alternatives_8_1_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAlternatives_8_1_1_1()); 
            }
            // InternalFoo.g:3525:3: ( rule__If__Alternatives_8_1_1_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==37||LA29_0==42) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalFoo.g:3525:4: rule__If__Alternatives_8_1_1_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__If__Alternatives_8_1_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getAlternatives_8_1_1_1()); 
            }

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
    // $ANTLR end "rule__If__Group_8_1_1__1__Impl"


    // $ANTLR start "rule__If__Group_8_1_1__2"
    // InternalFoo.g:3534:1: rule__If__Group_8_1_1__2 : rule__If__Group_8_1_1__2__Impl ;
    public final void rule__If__Group_8_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3538:1: ( rule__If__Group_8_1_1__2__Impl )
            // InternalFoo.g:3539:2: rule__If__Group_8_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_8_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3545:1: rule__If__Group_8_1_1__2__Impl : ( '}' ) ;
    public final void rule__If__Group_8_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3549:1: ( ( '}' ) )
            // InternalFoo.g:3550:1: ( '}' )
            {
            // InternalFoo.g:3550:1: ( '}' )
            // InternalFoo.g:3551:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8_1_1_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8_1_1_2()); 
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
    // $ANTLR end "rule__If__Group_8_1_1__2__Impl"


    // $ANTLR start "rule__If__Group_8_1_1_1_0__0"
    // InternalFoo.g:3561:1: rule__If__Group_8_1_1_1_0__0 : rule__If__Group_8_1_1_1_0__0__Impl rule__If__Group_8_1_1_1_0__1 ;
    public final void rule__If__Group_8_1_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3565:1: ( rule__If__Group_8_1_1_1_0__0__Impl rule__If__Group_8_1_1_1_0__1 )
            // InternalFoo.g:3566:2: rule__If__Group_8_1_1_1_0__0__Impl rule__If__Group_8_1_1_1_0__1
            {
            pushFollow(FOLLOW_40);
            rule__If__Group_8_1_1_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group_8_1_1_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8_1_1_1_0__0"


    // $ANTLR start "rule__If__Group_8_1_1_1_0__0__Impl"
    // InternalFoo.g:3573:1: rule__If__Group_8_1_1_1_0__0__Impl : ( ( rule__If__StrAssignment_8_1_1_1_0_0 ) ) ;
    public final void rule__If__Group_8_1_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3577:1: ( ( ( rule__If__StrAssignment_8_1_1_1_0_0 ) ) )
            // InternalFoo.g:3578:1: ( ( rule__If__StrAssignment_8_1_1_1_0_0 ) )
            {
            // InternalFoo.g:3578:1: ( ( rule__If__StrAssignment_8_1_1_1_0_0 ) )
            // InternalFoo.g:3579:2: ( rule__If__StrAssignment_8_1_1_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getStrAssignment_8_1_1_1_0_0()); 
            }
            // InternalFoo.g:3580:2: ( rule__If__StrAssignment_8_1_1_1_0_0 )
            // InternalFoo.g:3580:3: rule__If__StrAssignment_8_1_1_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__If__StrAssignment_8_1_1_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getStrAssignment_8_1_1_1_0_0()); 
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
    // $ANTLR end "rule__If__Group_8_1_1_1_0__0__Impl"


    // $ANTLR start "rule__If__Group_8_1_1_1_0__1"
    // InternalFoo.g:3588:1: rule__If__Group_8_1_1_1_0__1 : rule__If__Group_8_1_1_1_0__1__Impl ;
    public final void rule__If__Group_8_1_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3592:1: ( rule__If__Group_8_1_1_1_0__1__Impl )
            // InternalFoo.g:3593:2: rule__If__Group_8_1_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_8_1_1_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8_1_1_1_0__1"


    // $ANTLR start "rule__If__Group_8_1_1_1_0__1__Impl"
    // InternalFoo.g:3599:1: rule__If__Group_8_1_1_1_0__1__Impl : ( ';' ) ;
    public final void rule__If__Group_8_1_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3603:1: ( ( ';' ) )
            // InternalFoo.g:3604:1: ( ';' )
            {
            // InternalFoo.g:3604:1: ( ';' )
            // InternalFoo.g:3605:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getSemicolonKeyword_8_1_1_1_0_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getSemicolonKeyword_8_1_1_1_0_1()); 
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
    // $ANTLR end "rule__If__Group_8_1_1_1_0__1__Impl"


    // $ANTLR start "rule__While__Group__0"
    // InternalFoo.g:3615:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3619:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalFoo.g:3620:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3627:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3631:1: ( ( 'while' ) )
            // InternalFoo.g:3632:1: ( 'while' )
            {
            // InternalFoo.g:3632:1: ( 'while' )
            // InternalFoo.g:3633:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
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
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // InternalFoo.g:3642:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3646:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // InternalFoo.g:3647:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3654:1: rule__While__Group__1__Impl : ( '(' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3658:1: ( ( '(' ) )
            // InternalFoo.g:3659:1: ( '(' )
            {
            // InternalFoo.g:3659:1: ( '(' )
            // InternalFoo.g:3660:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__While__Group__2"
    // InternalFoo.g:3669:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3673:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // InternalFoo.g:3674:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__While__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3681:1: rule__While__Group__2__Impl : ( ( rule__While__Group_2__0 )* ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3685:1: ( ( ( rule__While__Group_2__0 )* ) )
            // InternalFoo.g:3686:1: ( ( rule__While__Group_2__0 )* )
            {
            // InternalFoo.g:3686:1: ( ( rule__While__Group_2__0 )* )
            // InternalFoo.g:3687:2: ( rule__While__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getGroup_2()); 
            }
            // InternalFoo.g:3688:2: ( rule__While__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // InternalFoo.g:3688:3: rule__While__Group_2__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__While__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getGroup_2()); 
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
    // $ANTLR end "rule__While__Group__2__Impl"


    // $ANTLR start "rule__While__Group__3"
    // InternalFoo.g:3696:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3700:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // InternalFoo.g:3701:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__While__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3708:1: rule__While__Group__3__Impl : ( ( rule__While__ConditionsAssignment_3 ) ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3712:1: ( ( ( rule__While__ConditionsAssignment_3 ) ) )
            // InternalFoo.g:3713:1: ( ( rule__While__ConditionsAssignment_3 ) )
            {
            // InternalFoo.g:3713:1: ( ( rule__While__ConditionsAssignment_3 ) )
            // InternalFoo.g:3714:2: ( rule__While__ConditionsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getConditionsAssignment_3()); 
            }
            // InternalFoo.g:3715:2: ( rule__While__ConditionsAssignment_3 )
            // InternalFoo.g:3715:3: rule__While__ConditionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__While__ConditionsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getConditionsAssignment_3()); 
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
    // $ANTLR end "rule__While__Group__3__Impl"


    // $ANTLR start "rule__While__Group__4"
    // InternalFoo.g:3723:1: rule__While__Group__4 : rule__While__Group__4__Impl rule__While__Group__5 ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3727:1: ( rule__While__Group__4__Impl rule__While__Group__5 )
            // InternalFoo.g:3728:2: rule__While__Group__4__Impl rule__While__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__While__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3735:1: rule__While__Group__4__Impl : ( ')' ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3739:1: ( ( ')' ) )
            // InternalFoo.g:3740:1: ( ')' )
            {
            // InternalFoo.g:3740:1: ( ')' )
            // InternalFoo.g:3741:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__While__Group__4__Impl"


    // $ANTLR start "rule__While__Group__5"
    // InternalFoo.g:3750:1: rule__While__Group__5 : rule__While__Group__5__Impl rule__While__Group__6 ;
    public final void rule__While__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3754:1: ( rule__While__Group__5__Impl rule__While__Group__6 )
            // InternalFoo.g:3755:2: rule__While__Group__5__Impl rule__While__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__While__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3762:1: rule__While__Group__5__Impl : ( '{' ) ;
    public final void rule__While__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3766:1: ( ( '{' ) )
            // InternalFoo.g:3767:1: ( '{' )
            {
            // InternalFoo.g:3767:1: ( '{' )
            // InternalFoo.g:3768:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__While__Group__5__Impl"


    // $ANTLR start "rule__While__Group__6"
    // InternalFoo.g:3777:1: rule__While__Group__6 : rule__While__Group__6__Impl rule__While__Group__7 ;
    public final void rule__While__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3781:1: ( rule__While__Group__6__Impl rule__While__Group__7 )
            // InternalFoo.g:3782:2: rule__While__Group__6__Impl rule__While__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__While__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3789:1: rule__While__Group__6__Impl : ( ( ( rule__While__Alternatives_6 ) ) ( ( rule__While__Alternatives_6 )* ) ) ;
    public final void rule__While__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3793:1: ( ( ( ( rule__While__Alternatives_6 ) ) ( ( rule__While__Alternatives_6 )* ) ) )
            // InternalFoo.g:3794:1: ( ( ( rule__While__Alternatives_6 ) ) ( ( rule__While__Alternatives_6 )* ) )
            {
            // InternalFoo.g:3794:1: ( ( ( rule__While__Alternatives_6 ) ) ( ( rule__While__Alternatives_6 )* ) )
            // InternalFoo.g:3795:2: ( ( rule__While__Alternatives_6 ) ) ( ( rule__While__Alternatives_6 )* )
            {
            // InternalFoo.g:3795:2: ( ( rule__While__Alternatives_6 ) )
            // InternalFoo.g:3796:3: ( rule__While__Alternatives_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getAlternatives_6()); 
            }
            // InternalFoo.g:3797:3: ( rule__While__Alternatives_6 )
            // InternalFoo.g:3797:4: rule__While__Alternatives_6
            {
            pushFollow(FOLLOW_33);
            rule__While__Alternatives_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getAlternatives_6()); 
            }

            }

            // InternalFoo.g:3800:2: ( ( rule__While__Alternatives_6 )* )
            // InternalFoo.g:3801:3: ( rule__While__Alternatives_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getAlternatives_6()); 
            }
            // InternalFoo.g:3802:3: ( rule__While__Alternatives_6 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==37||LA31_0==42) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalFoo.g:3802:4: rule__While__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__While__Alternatives_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getAlternatives_6()); 
            }

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
    // $ANTLR end "rule__While__Group__6__Impl"


    // $ANTLR start "rule__While__Group__7"
    // InternalFoo.g:3811:1: rule__While__Group__7 : rule__While__Group__7__Impl ;
    public final void rule__While__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3815:1: ( rule__While__Group__7__Impl )
            // InternalFoo.g:3816:2: rule__While__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3822:1: rule__While__Group__7__Impl : ( '}' ) ;
    public final void rule__While__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3826:1: ( ( '}' ) )
            // InternalFoo.g:3827:1: ( '}' )
            {
            // InternalFoo.g:3827:1: ( '}' )
            // InternalFoo.g:3828:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__While__Group__7__Impl"


    // $ANTLR start "rule__While__Group_2__0"
    // InternalFoo.g:3838:1: rule__While__Group_2__0 : rule__While__Group_2__0__Impl rule__While__Group_2__1 ;
    public final void rule__While__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3842:1: ( rule__While__Group_2__0__Impl rule__While__Group_2__1 )
            // InternalFoo.g:3843:2: rule__While__Group_2__0__Impl rule__While__Group_2__1
            {
            pushFollow(FOLLOW_39);
            rule__While__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3850:1: rule__While__Group_2__0__Impl : ( ( rule__While__ConditionsAssignment_2_0 ) ) ;
    public final void rule__While__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3854:1: ( ( ( rule__While__ConditionsAssignment_2_0 ) ) )
            // InternalFoo.g:3855:1: ( ( rule__While__ConditionsAssignment_2_0 ) )
            {
            // InternalFoo.g:3855:1: ( ( rule__While__ConditionsAssignment_2_0 ) )
            // InternalFoo.g:3856:2: ( rule__While__ConditionsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getConditionsAssignment_2_0()); 
            }
            // InternalFoo.g:3857:2: ( rule__While__ConditionsAssignment_2_0 )
            // InternalFoo.g:3857:3: rule__While__ConditionsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__While__ConditionsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getConditionsAssignment_2_0()); 
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
    // $ANTLR end "rule__While__Group_2__0__Impl"


    // $ANTLR start "rule__While__Group_2__1"
    // InternalFoo.g:3865:1: rule__While__Group_2__1 : rule__While__Group_2__1__Impl ;
    public final void rule__While__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3869:1: ( rule__While__Group_2__1__Impl )
            // InternalFoo.g:3870:2: rule__While__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3876:1: rule__While__Group_2__1__Impl : ( ( rule__While__Alternatives_2_1 ) ) ;
    public final void rule__While__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3880:1: ( ( ( rule__While__Alternatives_2_1 ) ) )
            // InternalFoo.g:3881:1: ( ( rule__While__Alternatives_2_1 ) )
            {
            // InternalFoo.g:3881:1: ( ( rule__While__Alternatives_2_1 ) )
            // InternalFoo.g:3882:2: ( rule__While__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getAlternatives_2_1()); 
            }
            // InternalFoo.g:3883:2: ( rule__While__Alternatives_2_1 )
            // InternalFoo.g:3883:3: rule__While__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__While__Alternatives_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getAlternatives_2_1()); 
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
    // $ANTLR end "rule__While__Group_2__1__Impl"


    // $ANTLR start "rule__While__Group_6_0__0"
    // InternalFoo.g:3892:1: rule__While__Group_6_0__0 : rule__While__Group_6_0__0__Impl rule__While__Group_6_0__1 ;
    public final void rule__While__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3896:1: ( rule__While__Group_6_0__0__Impl rule__While__Group_6_0__1 )
            // InternalFoo.g:3897:2: rule__While__Group_6_0__0__Impl rule__While__Group_6_0__1
            {
            pushFollow(FOLLOW_40);
            rule__While__Group_6_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group_6_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group_6_0__0"


    // $ANTLR start "rule__While__Group_6_0__0__Impl"
    // InternalFoo.g:3904:1: rule__While__Group_6_0__0__Impl : ( ( rule__While__StrAssignment_6_0_0 ) ) ;
    public final void rule__While__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3908:1: ( ( ( rule__While__StrAssignment_6_0_0 ) ) )
            // InternalFoo.g:3909:1: ( ( rule__While__StrAssignment_6_0_0 ) )
            {
            // InternalFoo.g:3909:1: ( ( rule__While__StrAssignment_6_0_0 ) )
            // InternalFoo.g:3910:2: ( rule__While__StrAssignment_6_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getStrAssignment_6_0_0()); 
            }
            // InternalFoo.g:3911:2: ( rule__While__StrAssignment_6_0_0 )
            // InternalFoo.g:3911:3: rule__While__StrAssignment_6_0_0
            {
            pushFollow(FOLLOW_2);
            rule__While__StrAssignment_6_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getStrAssignment_6_0_0()); 
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
    // $ANTLR end "rule__While__Group_6_0__0__Impl"


    // $ANTLR start "rule__While__Group_6_0__1"
    // InternalFoo.g:3919:1: rule__While__Group_6_0__1 : rule__While__Group_6_0__1__Impl ;
    public final void rule__While__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3923:1: ( rule__While__Group_6_0__1__Impl )
            // InternalFoo.g:3924:2: rule__While__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While__Group_6_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group_6_0__1"


    // $ANTLR start "rule__While__Group_6_0__1__Impl"
    // InternalFoo.g:3930:1: rule__While__Group_6_0__1__Impl : ( ';' ) ;
    public final void rule__While__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3934:1: ( ( ';' ) )
            // InternalFoo.g:3935:1: ( ';' )
            {
            // InternalFoo.g:3935:1: ( ';' )
            // InternalFoo.g:3936:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getSemicolonKeyword_6_0_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getSemicolonKeyword_6_0_1()); 
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
    // $ANTLR end "rule__While__Group_6_0__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalFoo.g:3946:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3950:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalFoo.g:3951:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3958:1: rule__Condition__Group__0__Impl : ( ( '!' )? ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3962:1: ( ( ( '!' )? ) )
            // InternalFoo.g:3963:1: ( ( '!' )? )
            {
            // InternalFoo.g:3963:1: ( ( '!' )? )
            // InternalFoo.g:3964:2: ( '!' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExclamationMarkKeyword_0()); 
            }
            // InternalFoo.g:3965:2: ( '!' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalFoo.g:3965:3: '!'
                    {
                    match(input,43,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getExclamationMarkKeyword_0()); 
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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalFoo.g:3973:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3977:1: ( rule__Condition__Group__1__Impl )
            // InternalFoo.g:3978:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:3984:1: rule__Condition__Group__1__Impl : ( ( ( rule__Condition__Alternatives_1 ) ) ( ( rule__Condition__Alternatives_1 )* ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3988:1: ( ( ( ( rule__Condition__Alternatives_1 ) ) ( ( rule__Condition__Alternatives_1 )* ) ) )
            // InternalFoo.g:3989:1: ( ( ( rule__Condition__Alternatives_1 ) ) ( ( rule__Condition__Alternatives_1 )* ) )
            {
            // InternalFoo.g:3989:1: ( ( ( rule__Condition__Alternatives_1 ) ) ( ( rule__Condition__Alternatives_1 )* ) )
            // InternalFoo.g:3990:2: ( ( rule__Condition__Alternatives_1 ) ) ( ( rule__Condition__Alternatives_1 )* )
            {
            // InternalFoo.g:3990:2: ( ( rule__Condition__Alternatives_1 ) )
            // InternalFoo.g:3991:3: ( rule__Condition__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAlternatives_1()); 
            }
            // InternalFoo.g:3992:3: ( rule__Condition__Alternatives_1 )
            // InternalFoo.g:3992:4: rule__Condition__Alternatives_1
            {
            pushFollow(FOLLOW_36);
            rule__Condition__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getAlternatives_1()); 
            }

            }

            // InternalFoo.g:3995:2: ( ( rule__Condition__Alternatives_1 )* )
            // InternalFoo.g:3996:3: ( rule__Condition__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAlternatives_1()); 
            }
            // InternalFoo.g:3997:3: ( rule__Condition__Alternatives_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalFoo.g:3997:4: rule__Condition__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Condition__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getAlternatives_1()); 
            }

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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Str__Group__0"
    // InternalFoo.g:4007:1: rule__Str__Group__0 : rule__Str__Group__0__Impl rule__Str__Group__1 ;
    public final void rule__Str__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4011:1: ( rule__Str__Group__0__Impl rule__Str__Group__1 )
            // InternalFoo.g:4012:2: rule__Str__Group__0__Impl rule__Str__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Str__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Str__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Str__Group__0"


    // $ANTLR start "rule__Str__Group__0__Impl"
    // InternalFoo.g:4019:1: rule__Str__Group__0__Impl : ( ( rule__Str__ValueAssignment_0 ) ) ;
    public final void rule__Str__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4023:1: ( ( ( rule__Str__ValueAssignment_0 ) ) )
            // InternalFoo.g:4024:1: ( ( rule__Str__ValueAssignment_0 ) )
            {
            // InternalFoo.g:4024:1: ( ( rule__Str__ValueAssignment_0 ) )
            // InternalFoo.g:4025:2: ( rule__Str__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getValueAssignment_0()); 
            }
            // InternalFoo.g:4026:2: ( rule__Str__ValueAssignment_0 )
            // InternalFoo.g:4026:3: rule__Str__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Str__ValueAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrAccess().getValueAssignment_0()); 
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
    // $ANTLR end "rule__Str__Group__0__Impl"


    // $ANTLR start "rule__Str__Group__1"
    // InternalFoo.g:4034:1: rule__Str__Group__1 : rule__Str__Group__1__Impl ;
    public final void rule__Str__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4038:1: ( rule__Str__Group__1__Impl )
            // InternalFoo.g:4039:2: rule__Str__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Str__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Str__Group__1"


    // $ANTLR start "rule__Str__Group__1__Impl"
    // InternalFoo.g:4045:1: rule__Str__Group__1__Impl : ( ( rule__Str__Group_1__0 )* ) ;
    public final void rule__Str__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4049:1: ( ( ( rule__Str__Group_1__0 )* ) )
            // InternalFoo.g:4050:1: ( ( rule__Str__Group_1__0 )* )
            {
            // InternalFoo.g:4050:1: ( ( rule__Str__Group_1__0 )* )
            // InternalFoo.g:4051:2: ( rule__Str__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getGroup_1()); 
            }
            // InternalFoo.g:4052:2: ( rule__Str__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==21) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalFoo.g:4052:3: rule__Str__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Str__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Str__Group__1__Impl"


    // $ANTLR start "rule__Str__Group_1__0"
    // InternalFoo.g:4061:1: rule__Str__Group_1__0 : rule__Str__Group_1__0__Impl rule__Str__Group_1__1 ;
    public final void rule__Str__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4065:1: ( rule__Str__Group_1__0__Impl rule__Str__Group_1__1 )
            // InternalFoo.g:4066:2: rule__Str__Group_1__0__Impl rule__Str__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Str__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Str__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Str__Group_1__0"


    // $ANTLR start "rule__Str__Group_1__0__Impl"
    // InternalFoo.g:4073:1: rule__Str__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Str__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4077:1: ( ( '.' ) )
            // InternalFoo.g:4078:1: ( '.' )
            {
            // InternalFoo.g:4078:1: ( '.' )
            // InternalFoo.g:4079:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getFullStopKeyword_1_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__Str__Group_1__0__Impl"


    // $ANTLR start "rule__Str__Group_1__1"
    // InternalFoo.g:4088:1: rule__Str__Group_1__1 : rule__Str__Group_1__1__Impl rule__Str__Group_1__2 ;
    public final void rule__Str__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4092:1: ( rule__Str__Group_1__1__Impl rule__Str__Group_1__2 )
            // InternalFoo.g:4093:2: rule__Str__Group_1__1__Impl rule__Str__Group_1__2
            {
            pushFollow(FOLLOW_34);
            rule__Str__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Str__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Str__Group_1__1"


    // $ANTLR start "rule__Str__Group_1__1__Impl"
    // InternalFoo.g:4100:1: rule__Str__Group_1__1__Impl : ( ( rule__Str__ValueAssignment_1_1 ) ) ;
    public final void rule__Str__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4104:1: ( ( ( rule__Str__ValueAssignment_1_1 ) ) )
            // InternalFoo.g:4105:1: ( ( rule__Str__ValueAssignment_1_1 ) )
            {
            // InternalFoo.g:4105:1: ( ( rule__Str__ValueAssignment_1_1 ) )
            // InternalFoo.g:4106:2: ( rule__Str__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getValueAssignment_1_1()); 
            }
            // InternalFoo.g:4107:2: ( rule__Str__ValueAssignment_1_1 )
            // InternalFoo.g:4107:3: rule__Str__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Str__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrAccess().getValueAssignment_1_1()); 
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
    // $ANTLR end "rule__Str__Group_1__1__Impl"


    // $ANTLR start "rule__Str__Group_1__2"
    // InternalFoo.g:4115:1: rule__Str__Group_1__2 : rule__Str__Group_1__2__Impl rule__Str__Group_1__3 ;
    public final void rule__Str__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4119:1: ( rule__Str__Group_1__2__Impl rule__Str__Group_1__3 )
            // InternalFoo.g:4120:2: rule__Str__Group_1__2__Impl rule__Str__Group_1__3
            {
            pushFollow(FOLLOW_42);
            rule__Str__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Str__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Str__Group_1__2"


    // $ANTLR start "rule__Str__Group_1__2__Impl"
    // InternalFoo.g:4127:1: rule__Str__Group_1__2__Impl : ( '(' ) ;
    public final void rule__Str__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4131:1: ( ( '(' ) )
            // InternalFoo.g:4132:1: ( '(' )
            {
            // InternalFoo.g:4132:1: ( '(' )
            // InternalFoo.g:4133:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getLeftParenthesisKeyword_1_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrAccess().getLeftParenthesisKeyword_1_2()); 
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
    // $ANTLR end "rule__Str__Group_1__2__Impl"


    // $ANTLR start "rule__Str__Group_1__3"
    // InternalFoo.g:4142:1: rule__Str__Group_1__3 : rule__Str__Group_1__3__Impl rule__Str__Group_1__4 ;
    public final void rule__Str__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4146:1: ( rule__Str__Group_1__3__Impl rule__Str__Group_1__4 )
            // InternalFoo.g:4147:2: rule__Str__Group_1__3__Impl rule__Str__Group_1__4
            {
            pushFollow(FOLLOW_42);
            rule__Str__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Str__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Str__Group_1__3"


    // $ANTLR start "rule__Str__Group_1__3__Impl"
    // InternalFoo.g:4154:1: rule__Str__Group_1__3__Impl : ( ( rule__Str__ValueAssignment_1_3 )? ) ;
    public final void rule__Str__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4158:1: ( ( ( rule__Str__ValueAssignment_1_3 )? ) )
            // InternalFoo.g:4159:1: ( ( rule__Str__ValueAssignment_1_3 )? )
            {
            // InternalFoo.g:4159:1: ( ( rule__Str__ValueAssignment_1_3 )? )
            // InternalFoo.g:4160:2: ( rule__Str__ValueAssignment_1_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getValueAssignment_1_3()); 
            }
            // InternalFoo.g:4161:2: ( rule__Str__ValueAssignment_1_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFoo.g:4161:3: rule__Str__ValueAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Str__ValueAssignment_1_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrAccess().getValueAssignment_1_3()); 
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
    // $ANTLR end "rule__Str__Group_1__3__Impl"


    // $ANTLR start "rule__Str__Group_1__4"
    // InternalFoo.g:4169:1: rule__Str__Group_1__4 : rule__Str__Group_1__4__Impl ;
    public final void rule__Str__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4173:1: ( rule__Str__Group_1__4__Impl )
            // InternalFoo.g:4174:2: rule__Str__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Str__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Str__Group_1__4"


    // $ANTLR start "rule__Str__Group_1__4__Impl"
    // InternalFoo.g:4180:1: rule__Str__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Str__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4184:1: ( ( ')' ) )
            // InternalFoo.g:4185:1: ( ')' )
            {
            // InternalFoo.g:4185:1: ( ')' )
            // InternalFoo.g:4186:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getRightParenthesisKeyword_1_4()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrAccess().getRightParenthesisKeyword_1_4()); 
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
    // $ANTLR end "rule__Str__Group_1__4__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalFoo.g:4196:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4200:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalFoo.g:4201:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalFoo.g:4208:1: rule__Comparison__Group__0__Impl : ( ( rule__Comparison__LeftMemberAssignment_0 ) ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4212:1: ( ( ( rule__Comparison__LeftMemberAssignment_0 ) ) )
            // InternalFoo.g:4213:1: ( ( rule__Comparison__LeftMemberAssignment_0 ) )
            {
            // InternalFoo.g:4213:1: ( ( rule__Comparison__LeftMemberAssignment_0 ) )
            // InternalFoo.g:4214:2: ( rule__Comparison__LeftMemberAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLeftMemberAssignment_0()); 
            }
            // InternalFoo.g:4215:2: ( rule__Comparison__LeftMemberAssignment_0 )
            // InternalFoo.g:4215:3: rule__Comparison__LeftMemberAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__LeftMemberAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLeftMemberAssignment_0()); 
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
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalFoo.g:4223:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4227:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // InternalFoo.g:4228:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Comparison__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalFoo.g:4235:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Alternatives_1 ) ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4239:1: ( ( ( rule__Comparison__Alternatives_1 ) ) )
            // InternalFoo.g:4240:1: ( ( rule__Comparison__Alternatives_1 ) )
            {
            // InternalFoo.g:4240:1: ( ( rule__Comparison__Alternatives_1 ) )
            // InternalFoo.g:4241:2: ( rule__Comparison__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_1()); 
            }
            // InternalFoo.g:4242:2: ( rule__Comparison__Alternatives_1 )
            // InternalFoo.g:4242:3: rule__Comparison__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group__2"
    // InternalFoo.g:4250:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4254:1: ( rule__Comparison__Group__2__Impl )
            // InternalFoo.g:4255:2: rule__Comparison__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__2"


    // $ANTLR start "rule__Comparison__Group__2__Impl"
    // InternalFoo.g:4261:1: rule__Comparison__Group__2__Impl : ( ( rule__Comparison__RightMemberAssignment_2 ) ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4265:1: ( ( ( rule__Comparison__RightMemberAssignment_2 ) ) )
            // InternalFoo.g:4266:1: ( ( rule__Comparison__RightMemberAssignment_2 ) )
            {
            // InternalFoo.g:4266:1: ( ( rule__Comparison__RightMemberAssignment_2 ) )
            // InternalFoo.g:4267:2: ( rule__Comparison__RightMemberAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightMemberAssignment_2()); 
            }
            // InternalFoo.g:4268:2: ( rule__Comparison__RightMemberAssignment_2 )
            // InternalFoo.g:4268:3: rule__Comparison__RightMemberAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightMemberAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightMemberAssignment_2()); 
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
    // $ANTLR end "rule__Comparison__Group__2__Impl"


    // $ANTLR start "rule__PSignature__Group__0"
    // InternalFoo.g:4277:1: rule__PSignature__Group__0 : rule__PSignature__Group__0__Impl rule__PSignature__Group__1 ;
    public final void rule__PSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4281:1: ( rule__PSignature__Group__0__Impl rule__PSignature__Group__1 )
            // InternalFoo.g:4282:2: rule__PSignature__Group__0__Impl rule__PSignature__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PSignature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PSignature__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4289:1: rule__PSignature__Group__0__Impl : ( ( rule__PSignature__TypeAssignment_0 ) ) ;
    public final void rule__PSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4293:1: ( ( ( rule__PSignature__TypeAssignment_0 ) ) )
            // InternalFoo.g:4294:1: ( ( rule__PSignature__TypeAssignment_0 ) )
            {
            // InternalFoo.g:4294:1: ( ( rule__PSignature__TypeAssignment_0 ) )
            // InternalFoo.g:4295:2: ( rule__PSignature__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getTypeAssignment_0()); 
            }
            // InternalFoo.g:4296:2: ( rule__PSignature__TypeAssignment_0 )
            // InternalFoo.g:4296:3: rule__PSignature__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PSignature__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSignatureAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__PSignature__Group__0__Impl"


    // $ANTLR start "rule__PSignature__Group__1"
    // InternalFoo.g:4304:1: rule__PSignature__Group__1 : rule__PSignature__Group__1__Impl rule__PSignature__Group__2 ;
    public final void rule__PSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4308:1: ( rule__PSignature__Group__1__Impl rule__PSignature__Group__2 )
            // InternalFoo.g:4309:2: rule__PSignature__Group__1__Impl rule__PSignature__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__PSignature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PSignature__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4316:1: rule__PSignature__Group__1__Impl : ( ( rule__PSignature__NameAssignment_1 ) ) ;
    public final void rule__PSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4320:1: ( ( ( rule__PSignature__NameAssignment_1 ) ) )
            // InternalFoo.g:4321:1: ( ( rule__PSignature__NameAssignment_1 ) )
            {
            // InternalFoo.g:4321:1: ( ( rule__PSignature__NameAssignment_1 ) )
            // InternalFoo.g:4322:2: ( rule__PSignature__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getNameAssignment_1()); 
            }
            // InternalFoo.g:4323:2: ( rule__PSignature__NameAssignment_1 )
            // InternalFoo.g:4323:3: rule__PSignature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PSignature__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSignatureAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__PSignature__Group__1__Impl"


    // $ANTLR start "rule__PSignature__Group__2"
    // InternalFoo.g:4331:1: rule__PSignature__Group__2 : rule__PSignature__Group__2__Impl rule__PSignature__Group__3 ;
    public final void rule__PSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4335:1: ( rule__PSignature__Group__2__Impl rule__PSignature__Group__3 )
            // InternalFoo.g:4336:2: rule__PSignature__Group__2__Impl rule__PSignature__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__PSignature__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PSignature__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4343:1: rule__PSignature__Group__2__Impl : ( '(' ) ;
    public final void rule__PSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4347:1: ( ( '(' ) )
            // InternalFoo.g:4348:1: ( '(' )
            {
            // InternalFoo.g:4348:1: ( '(' )
            // InternalFoo.g:4349:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSignatureAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__PSignature__Group__2__Impl"


    // $ANTLR start "rule__PSignature__Group__3"
    // InternalFoo.g:4358:1: rule__PSignature__Group__3 : rule__PSignature__Group__3__Impl rule__PSignature__Group__4 ;
    public final void rule__PSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4362:1: ( rule__PSignature__Group__3__Impl rule__PSignature__Group__4 )
            // InternalFoo.g:4363:2: rule__PSignature__Group__3__Impl rule__PSignature__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__PSignature__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PSignature__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4370:1: rule__PSignature__Group__3__Impl : ( ( rule__PSignature__ParametersAssignment_3 )? ) ;
    public final void rule__PSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4374:1: ( ( ( rule__PSignature__ParametersAssignment_3 )? ) )
            // InternalFoo.g:4375:1: ( ( rule__PSignature__ParametersAssignment_3 )? )
            {
            // InternalFoo.g:4375:1: ( ( rule__PSignature__ParametersAssignment_3 )? )
            // InternalFoo.g:4376:2: ( rule__PSignature__ParametersAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getParametersAssignment_3()); 
            }
            // InternalFoo.g:4377:2: ( rule__PSignature__ParametersAssignment_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalFoo.g:4377:3: rule__PSignature__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__PSignature__ParametersAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSignatureAccess().getParametersAssignment_3()); 
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
    // $ANTLR end "rule__PSignature__Group__3__Impl"


    // $ANTLR start "rule__PSignature__Group__4"
    // InternalFoo.g:4385:1: rule__PSignature__Group__4 : rule__PSignature__Group__4__Impl rule__PSignature__Group__5 ;
    public final void rule__PSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4389:1: ( rule__PSignature__Group__4__Impl rule__PSignature__Group__5 )
            // InternalFoo.g:4390:2: rule__PSignature__Group__4__Impl rule__PSignature__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__PSignature__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PSignature__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4397:1: rule__PSignature__Group__4__Impl : ( ( rule__PSignature__Group_4__0 )* ) ;
    public final void rule__PSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4401:1: ( ( ( rule__PSignature__Group_4__0 )* ) )
            // InternalFoo.g:4402:1: ( ( rule__PSignature__Group_4__0 )* )
            {
            // InternalFoo.g:4402:1: ( ( rule__PSignature__Group_4__0 )* )
            // InternalFoo.g:4403:2: ( rule__PSignature__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getGroup_4()); 
            }
            // InternalFoo.g:4404:2: ( rule__PSignature__Group_4__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==34) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalFoo.g:4404:3: rule__PSignature__Group_4__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__PSignature__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSignatureAccess().getGroup_4()); 
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
    // $ANTLR end "rule__PSignature__Group__4__Impl"


    // $ANTLR start "rule__PSignature__Group__5"
    // InternalFoo.g:4412:1: rule__PSignature__Group__5 : rule__PSignature__Group__5__Impl ;
    public final void rule__PSignature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4416:1: ( rule__PSignature__Group__5__Impl )
            // InternalFoo.g:4417:2: rule__PSignature__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PSignature__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4423:1: rule__PSignature__Group__5__Impl : ( ')' ) ;
    public final void rule__PSignature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4427:1: ( ( ')' ) )
            // InternalFoo.g:4428:1: ( ')' )
            {
            // InternalFoo.g:4428:1: ( ')' )
            // InternalFoo.g:4429:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSignatureAccess().getRightParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__PSignature__Group__5__Impl"


    // $ANTLR start "rule__PSignature__Group_4__0"
    // InternalFoo.g:4439:1: rule__PSignature__Group_4__0 : rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1 ;
    public final void rule__PSignature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4443:1: ( rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1 )
            // InternalFoo.g:4444:2: rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__PSignature__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PSignature__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4451:1: rule__PSignature__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PSignature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4455:1: ( ( ',' ) )
            // InternalFoo.g:4456:1: ( ',' )
            {
            // InternalFoo.g:4456:1: ( ',' )
            // InternalFoo.g:4457:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getCommaKeyword_4_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSignatureAccess().getCommaKeyword_4_0()); 
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
    // $ANTLR end "rule__PSignature__Group_4__0__Impl"


    // $ANTLR start "rule__PSignature__Group_4__1"
    // InternalFoo.g:4466:1: rule__PSignature__Group_4__1 : rule__PSignature__Group_4__1__Impl ;
    public final void rule__PSignature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4470:1: ( rule__PSignature__Group_4__1__Impl )
            // InternalFoo.g:4471:2: rule__PSignature__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PSignature__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4477:1: rule__PSignature__Group_4__1__Impl : ( ( rule__PSignature__ParametersAssignment_4_1 ) ) ;
    public final void rule__PSignature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4481:1: ( ( ( rule__PSignature__ParametersAssignment_4_1 ) ) )
            // InternalFoo.g:4482:1: ( ( rule__PSignature__ParametersAssignment_4_1 ) )
            {
            // InternalFoo.g:4482:1: ( ( rule__PSignature__ParametersAssignment_4_1 ) )
            // InternalFoo.g:4483:2: ( rule__PSignature__ParametersAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getParametersAssignment_4_1()); 
            }
            // InternalFoo.g:4484:2: ( rule__PSignature__ParametersAssignment_4_1 )
            // InternalFoo.g:4484:3: rule__PSignature__ParametersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PSignature__ParametersAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSignatureAccess().getParametersAssignment_4_1()); 
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
    // $ANTLR end "rule__PSignature__Group_4__1__Impl"


    // $ANTLR start "rule__MRequiredService__Group__0"
    // InternalFoo.g:4493:1: rule__MRequiredService__Group__0 : rule__MRequiredService__Group__0__Impl rule__MRequiredService__Group__1 ;
    public final void rule__MRequiredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4497:1: ( rule__MRequiredService__Group__0__Impl rule__MRequiredService__Group__1 )
            // InternalFoo.g:4498:2: rule__MRequiredService__Group__0__Impl rule__MRequiredService__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__MRequiredService__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MRequiredService__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4505:1: rule__MRequiredService__Group__0__Impl : ( 'service' ) ;
    public final void rule__MRequiredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4509:1: ( ( 'service' ) )
            // InternalFoo.g:4510:1: ( 'service' )
            {
            // InternalFoo.g:4510:1: ( 'service' )
            // InternalFoo.g:4511:2: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRequiredServiceAccess().getServiceKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRequiredServiceAccess().getServiceKeyword_0()); 
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
    // $ANTLR end "rule__MRequiredService__Group__0__Impl"


    // $ANTLR start "rule__MRequiredService__Group__1"
    // InternalFoo.g:4520:1: rule__MRequiredService__Group__1 : rule__MRequiredService__Group__1__Impl rule__MRequiredService__Group__2 ;
    public final void rule__MRequiredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4524:1: ( rule__MRequiredService__Group__1__Impl rule__MRequiredService__Group__2 )
            // InternalFoo.g:4525:2: rule__MRequiredService__Group__1__Impl rule__MRequiredService__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MRequiredService__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MRequiredService__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4532:1: rule__MRequiredService__Group__1__Impl : ( 'required' ) ;
    public final void rule__MRequiredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4536:1: ( ( 'required' ) )
            // InternalFoo.g:4537:1: ( 'required' )
            {
            // InternalFoo.g:4537:1: ( 'required' )
            // InternalFoo.g:4538:2: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRequiredServiceAccess().getRequiredKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRequiredServiceAccess().getRequiredKeyword_1()); 
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
    // $ANTLR end "rule__MRequiredService__Group__1__Impl"


    // $ANTLR start "rule__MRequiredService__Group__2"
    // InternalFoo.g:4547:1: rule__MRequiredService__Group__2 : rule__MRequiredService__Group__2__Impl rule__MRequiredService__Group__3 ;
    public final void rule__MRequiredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4551:1: ( rule__MRequiredService__Group__2__Impl rule__MRequiredService__Group__3 )
            // InternalFoo.g:4552:2: rule__MRequiredService__Group__2__Impl rule__MRequiredService__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__MRequiredService__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MRequiredService__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4559:1: rule__MRequiredService__Group__2__Impl : ( ( rule__MRequiredService__SignatureAssignment_2 ) ) ;
    public final void rule__MRequiredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4563:1: ( ( ( rule__MRequiredService__SignatureAssignment_2 ) ) )
            // InternalFoo.g:4564:1: ( ( rule__MRequiredService__SignatureAssignment_2 ) )
            {
            // InternalFoo.g:4564:1: ( ( rule__MRequiredService__SignatureAssignment_2 ) )
            // InternalFoo.g:4565:2: ( rule__MRequiredService__SignatureAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRequiredServiceAccess().getSignatureAssignment_2()); 
            }
            // InternalFoo.g:4566:2: ( rule__MRequiredService__SignatureAssignment_2 )
            // InternalFoo.g:4566:3: rule__MRequiredService__SignatureAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MRequiredService__SignatureAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRequiredServiceAccess().getSignatureAssignment_2()); 
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
    // $ANTLR end "rule__MRequiredService__Group__2__Impl"


    // $ANTLR start "rule__MRequiredService__Group__3"
    // InternalFoo.g:4574:1: rule__MRequiredService__Group__3 : rule__MRequiredService__Group__3__Impl ;
    public final void rule__MRequiredService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4578:1: ( rule__MRequiredService__Group__3__Impl )
            // InternalFoo.g:4579:2: rule__MRequiredService__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MRequiredService__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4585:1: rule__MRequiredService__Group__3__Impl : ( ';' ) ;
    public final void rule__MRequiredService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4589:1: ( ( ';' ) )
            // InternalFoo.g:4590:1: ( ';' )
            {
            // InternalFoo.g:4590:1: ( ';' )
            // InternalFoo.g:4591:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRequiredServiceAccess().getSemicolonKeyword_3()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRequiredServiceAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__MRequiredService__Group__3__Impl"


    // $ANTLR start "rule__RSignature__Group__0"
    // InternalFoo.g:4601:1: rule__RSignature__Group__0 : rule__RSignature__Group__0__Impl rule__RSignature__Group__1 ;
    public final void rule__RSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4605:1: ( rule__RSignature__Group__0__Impl rule__RSignature__Group__1 )
            // InternalFoo.g:4606:2: rule__RSignature__Group__0__Impl rule__RSignature__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RSignature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RSignature__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4613:1: rule__RSignature__Group__0__Impl : ( ( rule__RSignature__TypeAssignment_0 ) ) ;
    public final void rule__RSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4617:1: ( ( ( rule__RSignature__TypeAssignment_0 ) ) )
            // InternalFoo.g:4618:1: ( ( rule__RSignature__TypeAssignment_0 ) )
            {
            // InternalFoo.g:4618:1: ( ( rule__RSignature__TypeAssignment_0 ) )
            // InternalFoo.g:4619:2: ( rule__RSignature__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getTypeAssignment_0()); 
            }
            // InternalFoo.g:4620:2: ( rule__RSignature__TypeAssignment_0 )
            // InternalFoo.g:4620:3: rule__RSignature__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RSignature__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSignatureAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__RSignature__Group__0__Impl"


    // $ANTLR start "rule__RSignature__Group__1"
    // InternalFoo.g:4628:1: rule__RSignature__Group__1 : rule__RSignature__Group__1__Impl rule__RSignature__Group__2 ;
    public final void rule__RSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4632:1: ( rule__RSignature__Group__1__Impl rule__RSignature__Group__2 )
            // InternalFoo.g:4633:2: rule__RSignature__Group__1__Impl rule__RSignature__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__RSignature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RSignature__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4640:1: rule__RSignature__Group__1__Impl : ( ( rule__RSignature__NameAssignment_1 ) ) ;
    public final void rule__RSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4644:1: ( ( ( rule__RSignature__NameAssignment_1 ) ) )
            // InternalFoo.g:4645:1: ( ( rule__RSignature__NameAssignment_1 ) )
            {
            // InternalFoo.g:4645:1: ( ( rule__RSignature__NameAssignment_1 ) )
            // InternalFoo.g:4646:2: ( rule__RSignature__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getNameAssignment_1()); 
            }
            // InternalFoo.g:4647:2: ( rule__RSignature__NameAssignment_1 )
            // InternalFoo.g:4647:3: rule__RSignature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RSignature__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSignatureAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__RSignature__Group__1__Impl"


    // $ANTLR start "rule__RSignature__Group__2"
    // InternalFoo.g:4655:1: rule__RSignature__Group__2 : rule__RSignature__Group__2__Impl rule__RSignature__Group__3 ;
    public final void rule__RSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4659:1: ( rule__RSignature__Group__2__Impl rule__RSignature__Group__3 )
            // InternalFoo.g:4660:2: rule__RSignature__Group__2__Impl rule__RSignature__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__RSignature__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RSignature__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4667:1: rule__RSignature__Group__2__Impl : ( '(' ) ;
    public final void rule__RSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4671:1: ( ( '(' ) )
            // InternalFoo.g:4672:1: ( '(' )
            {
            // InternalFoo.g:4672:1: ( '(' )
            // InternalFoo.g:4673:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSignatureAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__RSignature__Group__2__Impl"


    // $ANTLR start "rule__RSignature__Group__3"
    // InternalFoo.g:4682:1: rule__RSignature__Group__3 : rule__RSignature__Group__3__Impl rule__RSignature__Group__4 ;
    public final void rule__RSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4686:1: ( rule__RSignature__Group__3__Impl rule__RSignature__Group__4 )
            // InternalFoo.g:4687:2: rule__RSignature__Group__3__Impl rule__RSignature__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__RSignature__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RSignature__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4694:1: rule__RSignature__Group__3__Impl : ( ( rule__RSignature__ParametersAssignment_3 )? ) ;
    public final void rule__RSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4698:1: ( ( ( rule__RSignature__ParametersAssignment_3 )? ) )
            // InternalFoo.g:4699:1: ( ( rule__RSignature__ParametersAssignment_3 )? )
            {
            // InternalFoo.g:4699:1: ( ( rule__RSignature__ParametersAssignment_3 )? )
            // InternalFoo.g:4700:2: ( rule__RSignature__ParametersAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getParametersAssignment_3()); 
            }
            // InternalFoo.g:4701:2: ( rule__RSignature__ParametersAssignment_3 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalFoo.g:4701:3: rule__RSignature__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RSignature__ParametersAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSignatureAccess().getParametersAssignment_3()); 
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
    // $ANTLR end "rule__RSignature__Group__3__Impl"


    // $ANTLR start "rule__RSignature__Group__4"
    // InternalFoo.g:4709:1: rule__RSignature__Group__4 : rule__RSignature__Group__4__Impl rule__RSignature__Group__5 ;
    public final void rule__RSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4713:1: ( rule__RSignature__Group__4__Impl rule__RSignature__Group__5 )
            // InternalFoo.g:4714:2: rule__RSignature__Group__4__Impl rule__RSignature__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__RSignature__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RSignature__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4721:1: rule__RSignature__Group__4__Impl : ( ( rule__RSignature__Group_4__0 )* ) ;
    public final void rule__RSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4725:1: ( ( ( rule__RSignature__Group_4__0 )* ) )
            // InternalFoo.g:4726:1: ( ( rule__RSignature__Group_4__0 )* )
            {
            // InternalFoo.g:4726:1: ( ( rule__RSignature__Group_4__0 )* )
            // InternalFoo.g:4727:2: ( rule__RSignature__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getGroup_4()); 
            }
            // InternalFoo.g:4728:2: ( rule__RSignature__Group_4__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==34) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalFoo.g:4728:3: rule__RSignature__Group_4__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__RSignature__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSignatureAccess().getGroup_4()); 
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
    // $ANTLR end "rule__RSignature__Group__4__Impl"


    // $ANTLR start "rule__RSignature__Group__5"
    // InternalFoo.g:4736:1: rule__RSignature__Group__5 : rule__RSignature__Group__5__Impl ;
    public final void rule__RSignature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4740:1: ( rule__RSignature__Group__5__Impl )
            // InternalFoo.g:4741:2: rule__RSignature__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RSignature__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4747:1: rule__RSignature__Group__5__Impl : ( ')' ) ;
    public final void rule__RSignature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4751:1: ( ( ')' ) )
            // InternalFoo.g:4752:1: ( ')' )
            {
            // InternalFoo.g:4752:1: ( ')' )
            // InternalFoo.g:4753:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSignatureAccess().getRightParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__RSignature__Group__5__Impl"


    // $ANTLR start "rule__RSignature__Group_4__0"
    // InternalFoo.g:4763:1: rule__RSignature__Group_4__0 : rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1 ;
    public final void rule__RSignature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4767:1: ( rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1 )
            // InternalFoo.g:4768:2: rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__RSignature__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RSignature__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4775:1: rule__RSignature__Group_4__0__Impl : ( ',' ) ;
    public final void rule__RSignature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4779:1: ( ( ',' ) )
            // InternalFoo.g:4780:1: ( ',' )
            {
            // InternalFoo.g:4780:1: ( ',' )
            // InternalFoo.g:4781:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getCommaKeyword_4_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSignatureAccess().getCommaKeyword_4_0()); 
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
    // $ANTLR end "rule__RSignature__Group_4__0__Impl"


    // $ANTLR start "rule__RSignature__Group_4__1"
    // InternalFoo.g:4790:1: rule__RSignature__Group_4__1 : rule__RSignature__Group_4__1__Impl ;
    public final void rule__RSignature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4794:1: ( rule__RSignature__Group_4__1__Impl )
            // InternalFoo.g:4795:2: rule__RSignature__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RSignature__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4801:1: rule__RSignature__Group_4__1__Impl : ( ( rule__RSignature__ParametersAssignment_4_1 ) ) ;
    public final void rule__RSignature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4805:1: ( ( ( rule__RSignature__ParametersAssignment_4_1 ) ) )
            // InternalFoo.g:4806:1: ( ( rule__RSignature__ParametersAssignment_4_1 ) )
            {
            // InternalFoo.g:4806:1: ( ( rule__RSignature__ParametersAssignment_4_1 ) )
            // InternalFoo.g:4807:2: ( rule__RSignature__ParametersAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getParametersAssignment_4_1()); 
            }
            // InternalFoo.g:4808:2: ( rule__RSignature__ParametersAssignment_4_1 )
            // InternalFoo.g:4808:3: rule__RSignature__ParametersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RSignature__ParametersAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSignatureAccess().getParametersAssignment_4_1()); 
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
    // $ANTLR end "rule__RSignature__Group_4__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalFoo.g:4817:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4821:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalFoo.g:4822:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4829:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4833:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalFoo.g:4834:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalFoo.g:4834:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalFoo.g:4835:2: ( rule__Parameter__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            }
            // InternalFoo.g:4836:2: ( rule__Parameter__NameAssignment_0 )
            // InternalFoo.g:4836:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalFoo.g:4844:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4848:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalFoo.g:4849:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4856:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4860:1: ( ( ':' ) )
            // InternalFoo.g:4861:1: ( ':' )
            {
            // InternalFoo.g:4861:1: ( ':' )
            // InternalFoo.g:4862:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalFoo.g:4871:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4875:1: ( rule__Parameter__Group__2__Impl )
            // InternalFoo.g:4876:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalFoo.g:4882:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4886:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalFoo.g:4887:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalFoo.g:4887:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalFoo.g:4888:2: ( rule__Parameter__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            }
            // InternalFoo.g:4889:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalFoo.g:4889:3: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__DomainModel__ModelAssignment"
    // InternalFoo.g:4898:1: rule__DomainModel__ModelAssignment : ( ruleModel ) ;
    public final void rule__DomainModel__ModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4902:1: ( ( ruleModel ) )
            // InternalFoo.g:4903:2: ( ruleModel )
            {
            // InternalFoo.g:4903:2: ( ruleModel )
            // InternalFoo.g:4904:3: ruleModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainModelAccess().getModelModelParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainModelAccess().getModelModelParserRuleCall_0()); 
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
    // $ANTLR end "rule__DomainModel__ModelAssignment"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalFoo.g:4913:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4917:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:4918:2: ( ruleQualifiedName )
            {
            // InternalFoo.g:4918:2: ( ruleQualifiedName )
            // InternalFoo.g:4919:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__ImportsAssignment_3"
    // InternalFoo.g:4928:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4932:1: ( ( ruleImport ) )
            // InternalFoo.g:4933:2: ( ruleImport )
            {
            // InternalFoo.g:4933:2: ( ruleImport )
            // InternalFoo.g:4934:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Model__ImportsAssignment_3"


    // $ANTLR start "rule__Model__ComponentsAssignment_4"
    // InternalFoo.g:4943:1: rule__Model__ComponentsAssignment_4 : ( ruleComponent ) ;
    public final void rule__Model__ComponentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4947:1: ( ( ruleComponent ) )
            // InternalFoo.g:4948:2: ( ruleComponent )
            {
            // InternalFoo.g:4948:2: ( ruleComponent )
            // InternalFoo.g:4949:3: ruleComponent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Model__ComponentsAssignment_4"


    // $ANTLR start "rule__Model__AssemblyAssignment_5"
    // InternalFoo.g:4958:1: rule__Model__AssemblyAssignment_5 : ( ruleAssembly ) ;
    public final void rule__Model__AssemblyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4962:1: ( ( ruleAssembly ) )
            // InternalFoo.g:4963:2: ( ruleAssembly )
            {
            // InternalFoo.g:4963:2: ( ruleAssembly )
            // InternalFoo.g:4964:3: ruleAssembly
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAssemblyAssemblyParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssembly();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAssemblyAssemblyParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Model__AssemblyAssignment_5"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalFoo.g:4973:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4977:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalFoo.g:4978:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalFoo.g:4978:2: ( ruleQualifiedNameWithWildcard )
            // InternalFoo.g:4979:3: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Assembly__NameAssignment_2"
    // InternalFoo.g:4988:1: rule__Assembly__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Assembly__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4992:1: ( ( RULE_ID ) )
            // InternalFoo.g:4993:2: ( RULE_ID )
            {
            // InternalFoo.g:4993:2: ( RULE_ID )
            // InternalFoo.g:4994:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Assembly__NameAssignment_2"


    // $ANTLR start "rule__Assembly__AttributesAssignment_5"
    // InternalFoo.g:5003:1: rule__Assembly__AttributesAssignment_5 : ( ruleComponentInstance ) ;
    public final void rule__Assembly__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5007:1: ( ( ruleComponentInstance ) )
            // InternalFoo.g:5008:2: ( ruleComponentInstance )
            {
            // InternalFoo.g:5008:2: ( ruleComponentInstance )
            // InternalFoo.g:5009:3: ruleComponentInstance
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAttributesComponentInstanceParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComponentInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getAttributesComponentInstanceParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Assembly__AttributesAssignment_5"


    // $ANTLR start "rule__Assembly__AttributesAssignment_6"
    // InternalFoo.g:5018:1: rule__Assembly__AttributesAssignment_6 : ( ruleComponentInstance ) ;
    public final void rule__Assembly__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5022:1: ( ( ruleComponentInstance ) )
            // InternalFoo.g:5023:2: ( ruleComponentInstance )
            {
            // InternalFoo.g:5023:2: ( ruleComponentInstance )
            // InternalFoo.g:5024:3: ruleComponentInstance
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAttributesComponentInstanceParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComponentInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getAttributesComponentInstanceParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Assembly__AttributesAssignment_6"


    // $ANTLR start "rule__Assembly__BindingsAssignment_8"
    // InternalFoo.g:5033:1: rule__Assembly__BindingsAssignment_8 : ( ruleBinding ) ;
    public final void rule__Assembly__BindingsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5037:1: ( ( ruleBinding ) )
            // InternalFoo.g:5038:2: ( ruleBinding )
            {
            // InternalFoo.g:5038:2: ( ruleBinding )
            // InternalFoo.g:5039:3: ruleBinding
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getBindingsBindingParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getBindingsBindingParserRuleCall_8_0()); 
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
    // $ANTLR end "rule__Assembly__BindingsAssignment_8"


    // $ANTLR start "rule__ComponentInstance__NameAssignment_0"
    // InternalFoo.g:5048:1: rule__ComponentInstance__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ComponentInstance__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5052:1: ( ( RULE_ID ) )
            // InternalFoo.g:5053:2: ( RULE_ID )
            {
            // InternalFoo.g:5053:2: ( RULE_ID )
            // InternalFoo.g:5054:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__ComponentInstance__NameAssignment_0"


    // $ANTLR start "rule__ComponentInstance__ComponentAssignment_2"
    // InternalFoo.g:5063:1: rule__ComponentInstance__ComponentAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComponentInstance__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5067:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:5068:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:5068:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:5069:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentInstanceAccess().getComponentComponentCrossReference_2_0()); 
            }
            // InternalFoo.g:5070:3: ( ruleQualifiedName )
            // InternalFoo.g:5071:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentInstanceAccess().getComponentComponentQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentInstanceAccess().getComponentComponentQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentInstanceAccess().getComponentComponentCrossReference_2_0()); 
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
    // $ANTLR end "rule__ComponentInstance__ComponentAssignment_2"


    // $ANTLR start "rule__Binding__BindingRequiredAssignment_0"
    // InternalFoo.g:5082:1: rule__Binding__BindingRequiredAssignment_0 : ( ruleBindingRequired ) ;
    public final void rule__Binding__BindingRequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5086:1: ( ( ruleBindingRequired ) )
            // InternalFoo.g:5087:2: ( ruleBindingRequired )
            {
            // InternalFoo.g:5087:2: ( ruleBindingRequired )
            // InternalFoo.g:5088:3: ruleBindingRequired
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getBindingRequiredBindingRequiredParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBindingRequired();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getBindingRequiredBindingRequiredParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Binding__BindingRequiredAssignment_0"


    // $ANTLR start "rule__Binding__BindingProvidedAssignment_2"
    // InternalFoo.g:5097:1: rule__Binding__BindingProvidedAssignment_2 : ( ruleBindingProvided ) ;
    public final void rule__Binding__BindingProvidedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5101:1: ( ( ruleBindingProvided ) )
            // InternalFoo.g:5102:2: ( ruleBindingProvided )
            {
            // InternalFoo.g:5102:2: ( ruleBindingProvided )
            // InternalFoo.g:5103:3: ruleBindingProvided
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getBindingProvidedBindingProvidedParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBindingProvided();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getBindingProvidedBindingProvidedParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Binding__BindingProvidedAssignment_2"


    // $ANTLR start "rule__BindingRequired__NameAssignment_0"
    // InternalFoo.g:5112:1: rule__BindingRequired__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BindingRequired__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5116:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:5117:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:5117:2: ( ( RULE_ID ) )
            // InternalFoo.g:5118:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRequiredAccess().getNameComponentInstanceCrossReference_0_0()); 
            }
            // InternalFoo.g:5119:3: ( RULE_ID )
            // InternalFoo.g:5120:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRequiredAccess().getNameComponentInstanceIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingRequiredAccess().getNameComponentInstanceIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingRequiredAccess().getNameComponentInstanceCrossReference_0_0()); 
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
    // $ANTLR end "rule__BindingRequired__NameAssignment_0"


    // $ANTLR start "rule__BindingRequired__ServiceAssignment_2"
    // InternalFoo.g:5131:1: rule__BindingRequired__ServiceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingRequired__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5135:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:5136:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:5136:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:5137:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRequiredAccess().getServiceRSignatureCrossReference_2_0()); 
            }
            // InternalFoo.g:5138:3: ( ruleQualifiedName )
            // InternalFoo.g:5139:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRequiredAccess().getServiceRSignatureQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingRequiredAccess().getServiceRSignatureQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingRequiredAccess().getServiceRSignatureCrossReference_2_0()); 
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
    // $ANTLR end "rule__BindingRequired__ServiceAssignment_2"


    // $ANTLR start "rule__BindingProvided__NameAssignment_0"
    // InternalFoo.g:5150:1: rule__BindingProvided__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BindingProvided__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5154:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:5155:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:5155:2: ( ( RULE_ID ) )
            // InternalFoo.g:5156:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingProvidedAccess().getNameComponentInstanceCrossReference_0_0()); 
            }
            // InternalFoo.g:5157:3: ( RULE_ID )
            // InternalFoo.g:5158:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingProvidedAccess().getNameComponentInstanceIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingProvidedAccess().getNameComponentInstanceIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingProvidedAccess().getNameComponentInstanceCrossReference_0_0()); 
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
    // $ANTLR end "rule__BindingProvided__NameAssignment_0"


    // $ANTLR start "rule__BindingProvided__ServiceAssignment_2"
    // InternalFoo.g:5169:1: rule__BindingProvided__ServiceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingProvided__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5173:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:5174:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:5174:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:5175:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingProvidedAccess().getServicePSignatureCrossReference_2_0()); 
            }
            // InternalFoo.g:5176:3: ( ruleQualifiedName )
            // InternalFoo.g:5177:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingProvidedAccess().getServicePSignatureQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingProvidedAccess().getServicePSignatureQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingProvidedAccess().getServicePSignatureCrossReference_2_0()); 
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
    // $ANTLR end "rule__BindingProvided__ServiceAssignment_2"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalFoo.g:5188:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5192:1: ( ( RULE_ID ) )
            // InternalFoo.g:5193:2: ( RULE_ID )
            {
            // InternalFoo.g:5193:2: ( RULE_ID )
            // InternalFoo.g:5194:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__RefinedComponentAssignment_2_1"
    // InternalFoo.g:5203:1: rule__Component__RefinedComponentAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Component__RefinedComponentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5207:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:5208:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:5208:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:5209:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRefinedComponentComponentCrossReference_2_1_0()); 
            }
            // InternalFoo.g:5210:3: ( ruleQualifiedName )
            // InternalFoo.g:5211:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRefinedComponentComponentQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRefinedComponentComponentQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRefinedComponentComponentCrossReference_2_1_0()); 
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
    // $ANTLR end "rule__Component__RefinedComponentAssignment_2_1"


    // $ANTLR start "rule__Component__ListOfPServicesAssignment_4"
    // InternalFoo.g:5222:1: rule__Component__ListOfPServicesAssignment_4 : ( ruleListOfProvidedServices ) ;
    public final void rule__Component__ListOfPServicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5226:1: ( ( ruleListOfProvidedServices ) )
            // InternalFoo.g:5227:2: ( ruleListOfProvidedServices )
            {
            // InternalFoo.g:5227:2: ( ruleListOfProvidedServices )
            // InternalFoo.g:5228:3: ruleListOfProvidedServices
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getListOfPServicesListOfProvidedServicesParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListOfProvidedServices();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getListOfPServicesListOfProvidedServicesParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Component__ListOfPServicesAssignment_4"


    // $ANTLR start "rule__Component__ListOfRServicesAssignment_5"
    // InternalFoo.g:5237:1: rule__Component__ListOfRServicesAssignment_5 : ( ruleListOfrequiredServices ) ;
    public final void rule__Component__ListOfRServicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5241:1: ( ( ruleListOfrequiredServices ) )
            // InternalFoo.g:5242:2: ( ruleListOfrequiredServices )
            {
            // InternalFoo.g:5242:2: ( ruleListOfrequiredServices )
            // InternalFoo.g:5243:3: ruleListOfrequiredServices
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getListOfRServicesListOfrequiredServicesParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListOfrequiredServices();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getListOfRServicesListOfrequiredServicesParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Component__ListOfRServicesAssignment_5"


    // $ANTLR start "rule__Component__MProvServicesAssignment_6"
    // InternalFoo.g:5252:1: rule__Component__MProvServicesAssignment_6 : ( ruleMProvidedService ) ;
    public final void rule__Component__MProvServicesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5256:1: ( ( ruleMProvidedService ) )
            // InternalFoo.g:5257:2: ( ruleMProvidedService )
            {
            // InternalFoo.g:5257:2: ( ruleMProvidedService )
            // InternalFoo.g:5258:3: ruleMProvidedService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getMProvServicesMProvidedServiceParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMProvidedService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getMProvServicesMProvidedServiceParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Component__MProvServicesAssignment_6"


    // $ANTLR start "rule__Component__MReqServicesAssignment_7"
    // InternalFoo.g:5267:1: rule__Component__MReqServicesAssignment_7 : ( ruleMRequiredService ) ;
    public final void rule__Component__MReqServicesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5271:1: ( ( ruleMRequiredService ) )
            // InternalFoo.g:5272:2: ( ruleMRequiredService )
            {
            // InternalFoo.g:5272:2: ( ruleMRequiredService )
            // InternalFoo.g:5273:3: ruleMRequiredService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getMReqServicesMRequiredServiceParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMRequiredService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getMReqServicesMRequiredServiceParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Component__MReqServicesAssignment_7"


    // $ANTLR start "rule__Component__AssembliesAssignment_8_1"
    // InternalFoo.g:5282:1: rule__Component__AssembliesAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Component__AssembliesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5286:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:5287:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:5287:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:5288:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getAssembliesAssemblyCrossReference_8_1_0()); 
            }
            // InternalFoo.g:5289:3: ( ruleQualifiedName )
            // InternalFoo.g:5290:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getAssembliesAssemblyQualifiedNameParserRuleCall_8_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getAssembliesAssemblyQualifiedNameParserRuleCall_8_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getAssembliesAssemblyCrossReference_8_1_0()); 
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
    // $ANTLR end "rule__Component__AssembliesAssignment_8_1"


    // $ANTLR start "rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0"
    // InternalFoo.g:5301:1: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 : ( ruleProvidedService ) ;
    public final void rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5305:1: ( ( ruleProvidedService ) )
            // InternalFoo.g:5306:2: ( ruleProvidedService )
            {
            // InternalFoo.g:5306:2: ( ruleProvidedService )
            // InternalFoo.g:5307:3: ruleProvidedService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProvidedService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0"


    // $ANTLR start "rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1"
    // InternalFoo.g:5316:1: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 : ( ruleProvidedService ) ;
    public final void rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5320:1: ( ( ruleProvidedService ) )
            // InternalFoo.g:5321:2: ( ruleProvidedService )
            {
            // InternalFoo.g:5321:2: ( ruleProvidedService )
            // InternalFoo.g:5322:3: ruleProvidedService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProvidedService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_1_1_0()); 
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
    // $ANTLR end "rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1"


    // $ANTLR start "rule__ProvidedService__NameAssignment"
    // InternalFoo.g:5331:1: rule__ProvidedService__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ProvidedService__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5335:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:5336:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:5336:2: ( ( RULE_ID ) )
            // InternalFoo.g:5337:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProvidedServiceAccess().getNamePSignatureCrossReference_0()); 
            }
            // InternalFoo.g:5338:3: ( RULE_ID )
            // InternalFoo.g:5339:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProvidedServiceAccess().getNamePSignatureIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProvidedServiceAccess().getNamePSignatureIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProvidedServiceAccess().getNamePSignatureCrossReference_0()); 
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
    // $ANTLR end "rule__ProvidedService__NameAssignment"


    // $ANTLR start "rule__ListOfrequiredServices__RequiredServicesAssignment_4_0"
    // InternalFoo.g:5350:1: rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 : ( ruleRequiredService ) ;
    public final void rule__ListOfrequiredServices__RequiredServicesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5354:1: ( ( ruleRequiredService ) )
            // InternalFoo.g:5355:2: ( ruleRequiredService )
            {
            // InternalFoo.g:5355:2: ( ruleRequiredService )
            // InternalFoo.g:5356:3: ruleRequiredService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRequiredService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_0_0()); 
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
    // $ANTLR end "rule__ListOfrequiredServices__RequiredServicesAssignment_4_0"


    // $ANTLR start "rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1"
    // InternalFoo.g:5365:1: rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 : ( ruleRequiredService ) ;
    public final void rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5369:1: ( ( ruleRequiredService ) )
            // InternalFoo.g:5370:2: ( ruleRequiredService )
            {
            // InternalFoo.g:5370:2: ( ruleRequiredService )
            // InternalFoo.g:5371:3: ruleRequiredService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRequiredService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_1_1_0()); 
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
    // $ANTLR end "rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1"


    // $ANTLR start "rule__RequiredService__NameAssignment"
    // InternalFoo.g:5380:1: rule__RequiredService__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RequiredService__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5384:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:5385:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:5385:2: ( ( RULE_ID ) )
            // InternalFoo.g:5386:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameRSignatureCrossReference_0()); 
            }
            // InternalFoo.g:5387:3: ( RULE_ID )
            // InternalFoo.g:5388:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameRSignatureIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceAccess().getNameRSignatureIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceAccess().getNameRSignatureCrossReference_0()); 
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
    // $ANTLR end "rule__RequiredService__NameAssignment"


    // $ANTLR start "rule__MProvidedService__SignatureAssignment_2"
    // InternalFoo.g:5399:1: rule__MProvidedService__SignatureAssignment_2 : ( rulePSignature ) ;
    public final void rule__MProvidedService__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5403:1: ( ( rulePSignature ) )
            // InternalFoo.g:5404:2: ( rulePSignature )
            {
            // InternalFoo.g:5404:2: ( rulePSignature )
            // InternalFoo.g:5405:3: rulePSignature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getSignaturePSignatureParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePSignature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMProvidedServiceAccess().getSignaturePSignatureParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__MProvidedService__SignatureAssignment_2"


    // $ANTLR start "rule__MProvidedService__ExpressionsAssignment_4"
    // InternalFoo.g:5414:1: rule__MProvidedService__ExpressionsAssignment_4 : ( ruleExpression ) ;
    public final void rule__MProvidedService__ExpressionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5418:1: ( ( ruleExpression ) )
            // InternalFoo.g:5419:2: ( ruleExpression )
            {
            // InternalFoo.g:5419:2: ( ruleExpression )
            // InternalFoo.g:5420:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getExpressionsExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMProvidedServiceAccess().getExpressionsExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__MProvidedService__ExpressionsAssignment_4"


    // $ANTLR start "rule__If__ConditionsAssignment_2_0"
    // InternalFoo.g:5429:1: rule__If__ConditionsAssignment_2_0 : ( ruleCondition ) ;
    public final void rule__If__ConditionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5433:1: ( ( ruleCondition ) )
            // InternalFoo.g:5434:2: ( ruleCondition )
            {
            // InternalFoo.g:5434:2: ( ruleCondition )
            // InternalFoo.g:5435:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionsConditionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getConditionsConditionParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__If__ConditionsAssignment_2_0"


    // $ANTLR start "rule__If__ConditionsAssignment_3"
    // InternalFoo.g:5444:1: rule__If__ConditionsAssignment_3 : ( ruleCondition ) ;
    public final void rule__If__ConditionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5448:1: ( ( ruleCondition ) )
            // InternalFoo.g:5449:2: ( ruleCondition )
            {
            // InternalFoo.g:5449:2: ( ruleCondition )
            // InternalFoo.g:5450:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionsConditionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getConditionsConditionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__If__ConditionsAssignment_3"


    // $ANTLR start "rule__If__StrAssignment_6_0_0"
    // InternalFoo.g:5459:1: rule__If__StrAssignment_6_0_0 : ( ruleStr ) ;
    public final void rule__If__StrAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5463:1: ( ( ruleStr ) )
            // InternalFoo.g:5464:2: ( ruleStr )
            {
            // InternalFoo.g:5464:2: ( ruleStr )
            // InternalFoo.g:5465:3: ruleStr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getStrStrParserRuleCall_6_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getStrStrParserRuleCall_6_0_0_0()); 
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
    // $ANTLR end "rule__If__StrAssignment_6_0_0"


    // $ANTLR start "rule__If__IfAssignment_6_1"
    // InternalFoo.g:5474:1: rule__If__IfAssignment_6_1 : ( ruleIf ) ;
    public final void rule__If__IfAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5478:1: ( ( ruleIf ) )
            // InternalFoo.g:5479:2: ( ruleIf )
            {
            // InternalFoo.g:5479:2: ( ruleIf )
            // InternalFoo.g:5480:3: ruleIf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfIfParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getIfIfParserRuleCall_6_1_0()); 
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
    // $ANTLR end "rule__If__IfAssignment_6_1"


    // $ANTLR start "rule__If__WhileAssignment_6_2"
    // InternalFoo.g:5489:1: rule__If__WhileAssignment_6_2 : ( ruleWhile ) ;
    public final void rule__If__WhileAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5493:1: ( ( ruleWhile ) )
            // InternalFoo.g:5494:2: ( ruleWhile )
            {
            // InternalFoo.g:5494:2: ( ruleWhile )
            // InternalFoo.g:5495:3: ruleWhile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getWhileWhileParserRuleCall_6_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getWhileWhileParserRuleCall_6_2_0()); 
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
    // $ANTLR end "rule__If__WhileAssignment_6_2"


    // $ANTLR start "rule__If__ElseAssignment_8_1_0"
    // InternalFoo.g:5504:1: rule__If__ElseAssignment_8_1_0 : ( ruleIf ) ;
    public final void rule__If__ElseAssignment_8_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5508:1: ( ( ruleIf ) )
            // InternalFoo.g:5509:2: ( ruleIf )
            {
            // InternalFoo.g:5509:2: ( ruleIf )
            // InternalFoo.g:5510:3: ruleIf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseIfParserRuleCall_8_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getElseIfParserRuleCall_8_1_0_0()); 
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
    // $ANTLR end "rule__If__ElseAssignment_8_1_0"


    // $ANTLR start "rule__If__StrAssignment_8_1_1_1_0_0"
    // InternalFoo.g:5519:1: rule__If__StrAssignment_8_1_1_1_0_0 : ( ruleStr ) ;
    public final void rule__If__StrAssignment_8_1_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5523:1: ( ( ruleStr ) )
            // InternalFoo.g:5524:2: ( ruleStr )
            {
            // InternalFoo.g:5524:2: ( ruleStr )
            // InternalFoo.g:5525:3: ruleStr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getStrStrParserRuleCall_8_1_1_1_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getStrStrParserRuleCall_8_1_1_1_0_0_0()); 
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
    // $ANTLR end "rule__If__StrAssignment_8_1_1_1_0_0"


    // $ANTLR start "rule__If__IfAssignment_8_1_1_1_1"
    // InternalFoo.g:5534:1: rule__If__IfAssignment_8_1_1_1_1 : ( ruleIf ) ;
    public final void rule__If__IfAssignment_8_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5538:1: ( ( ruleIf ) )
            // InternalFoo.g:5539:2: ( ruleIf )
            {
            // InternalFoo.g:5539:2: ( ruleIf )
            // InternalFoo.g:5540:3: ruleIf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfIfParserRuleCall_8_1_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getIfIfParserRuleCall_8_1_1_1_1_0()); 
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
    // $ANTLR end "rule__If__IfAssignment_8_1_1_1_1"


    // $ANTLR start "rule__If__WhileAssignment_8_1_1_1_2"
    // InternalFoo.g:5549:1: rule__If__WhileAssignment_8_1_1_1_2 : ( ruleWhile ) ;
    public final void rule__If__WhileAssignment_8_1_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5553:1: ( ( ruleWhile ) )
            // InternalFoo.g:5554:2: ( ruleWhile )
            {
            // InternalFoo.g:5554:2: ( ruleWhile )
            // InternalFoo.g:5555:3: ruleWhile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getWhileWhileParserRuleCall_8_1_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getWhileWhileParserRuleCall_8_1_1_1_2_0()); 
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
    // $ANTLR end "rule__If__WhileAssignment_8_1_1_1_2"


    // $ANTLR start "rule__While__ConditionsAssignment_2_0"
    // InternalFoo.g:5564:1: rule__While__ConditionsAssignment_2_0 : ( ruleCondition ) ;
    public final void rule__While__ConditionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5568:1: ( ( ruleCondition ) )
            // InternalFoo.g:5569:2: ( ruleCondition )
            {
            // InternalFoo.g:5569:2: ( ruleCondition )
            // InternalFoo.g:5570:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getConditionsConditionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getConditionsConditionParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__While__ConditionsAssignment_2_0"


    // $ANTLR start "rule__While__ConditionsAssignment_3"
    // InternalFoo.g:5579:1: rule__While__ConditionsAssignment_3 : ( ruleCondition ) ;
    public final void rule__While__ConditionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5583:1: ( ( ruleCondition ) )
            // InternalFoo.g:5584:2: ( ruleCondition )
            {
            // InternalFoo.g:5584:2: ( ruleCondition )
            // InternalFoo.g:5585:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getConditionsConditionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getConditionsConditionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__While__ConditionsAssignment_3"


    // $ANTLR start "rule__While__StrAssignment_6_0_0"
    // InternalFoo.g:5594:1: rule__While__StrAssignment_6_0_0 : ( ruleStr ) ;
    public final void rule__While__StrAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5598:1: ( ( ruleStr ) )
            // InternalFoo.g:5599:2: ( ruleStr )
            {
            // InternalFoo.g:5599:2: ( ruleStr )
            // InternalFoo.g:5600:3: ruleStr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getStrStrParserRuleCall_6_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getStrStrParserRuleCall_6_0_0_0()); 
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
    // $ANTLR end "rule__While__StrAssignment_6_0_0"


    // $ANTLR start "rule__While__IfAssignment_6_1"
    // InternalFoo.g:5609:1: rule__While__IfAssignment_6_1 : ( ruleIf ) ;
    public final void rule__While__IfAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5613:1: ( ( ruleIf ) )
            // InternalFoo.g:5614:2: ( ruleIf )
            {
            // InternalFoo.g:5614:2: ( ruleIf )
            // InternalFoo.g:5615:3: ruleIf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getIfIfParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getIfIfParserRuleCall_6_1_0()); 
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
    // $ANTLR end "rule__While__IfAssignment_6_1"


    // $ANTLR start "rule__While__WhileAssignment_6_2"
    // InternalFoo.g:5624:1: rule__While__WhileAssignment_6_2 : ( ruleWhile ) ;
    public final void rule__While__WhileAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5628:1: ( ( ruleWhile ) )
            // InternalFoo.g:5629:2: ( ruleWhile )
            {
            // InternalFoo.g:5629:2: ( ruleWhile )
            // InternalFoo.g:5630:3: ruleWhile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileWhileParserRuleCall_6_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getWhileWhileParserRuleCall_6_2_0()); 
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
    // $ANTLR end "rule__While__WhileAssignment_6_2"


    // $ANTLR start "rule__Condition__ConditionsAssignment_1_0"
    // InternalFoo.g:5639:1: rule__Condition__ConditionsAssignment_1_0 : ( ruleComparison ) ;
    public final void rule__Condition__ConditionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5643:1: ( ( ruleComparison ) )
            // InternalFoo.g:5644:2: ( ruleComparison )
            {
            // InternalFoo.g:5644:2: ( ruleComparison )
            // InternalFoo.g:5645:3: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionsComparisonParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getConditionsComparisonParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__Condition__ConditionsAssignment_1_0"


    // $ANTLR start "rule__Condition__ConditionsAssignment_1_1"
    // InternalFoo.g:5654:1: rule__Condition__ConditionsAssignment_1_1 : ( ruleStr ) ;
    public final void rule__Condition__ConditionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5658:1: ( ( ruleStr ) )
            // InternalFoo.g:5659:2: ( ruleStr )
            {
            // InternalFoo.g:5659:2: ( ruleStr )
            // InternalFoo.g:5660:3: ruleStr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionsStrParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getConditionsStrParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Condition__ConditionsAssignment_1_1"


    // $ANTLR start "rule__Str__ValueAssignment_0"
    // InternalFoo.g:5669:1: rule__Str__ValueAssignment_0 : ( RULE_ID ) ;
    public final void rule__Str__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5673:1: ( ( RULE_ID ) )
            // InternalFoo.g:5674:2: ( RULE_ID )
            {
            // InternalFoo.g:5674:2: ( RULE_ID )
            // InternalFoo.g:5675:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getValueIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrAccess().getValueIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Str__ValueAssignment_0"


    // $ANTLR start "rule__Str__ValueAssignment_1_1"
    // InternalFoo.g:5684:1: rule__Str__ValueAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Str__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5688:1: ( ( RULE_ID ) )
            // InternalFoo.g:5689:2: ( RULE_ID )
            {
            // InternalFoo.g:5689:2: ( RULE_ID )
            // InternalFoo.g:5690:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getValueIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrAccess().getValueIDTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Str__ValueAssignment_1_1"


    // $ANTLR start "rule__Str__ValueAssignment_1_3"
    // InternalFoo.g:5699:1: rule__Str__ValueAssignment_1_3 : ( RULE_ID ) ;
    public final void rule__Str__ValueAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5703:1: ( ( RULE_ID ) )
            // InternalFoo.g:5704:2: ( RULE_ID )
            {
            // InternalFoo.g:5704:2: ( RULE_ID )
            // InternalFoo.g:5705:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getValueIDTerminalRuleCall_1_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrAccess().getValueIDTerminalRuleCall_1_3_0()); 
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
    // $ANTLR end "rule__Str__ValueAssignment_1_3"


    // $ANTLR start "rule__Comparison__LeftMemberAssignment_0"
    // InternalFoo.g:5714:1: rule__Comparison__LeftMemberAssignment_0 : ( RULE_ID ) ;
    public final void rule__Comparison__LeftMemberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5718:1: ( ( RULE_ID ) )
            // InternalFoo.g:5719:2: ( RULE_ID )
            {
            // InternalFoo.g:5719:2: ( RULE_ID )
            // InternalFoo.g:5720:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLeftMemberIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLeftMemberIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Comparison__LeftMemberAssignment_0"


    // $ANTLR start "rule__Comparison__RightMemberAssignment_2"
    // InternalFoo.g:5729:1: rule__Comparison__RightMemberAssignment_2 : ( RULE_ID ) ;
    public final void rule__Comparison__RightMemberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5733:1: ( ( RULE_ID ) )
            // InternalFoo.g:5734:2: ( RULE_ID )
            {
            // InternalFoo.g:5734:2: ( RULE_ID )
            // InternalFoo.g:5735:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightMemberIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightMemberIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Comparison__RightMemberAssignment_2"


    // $ANTLR start "rule__PSignature__TypeAssignment_0"
    // InternalFoo.g:5744:1: rule__PSignature__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__PSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5748:1: ( ( RULE_ID ) )
            // InternalFoo.g:5749:2: ( RULE_ID )
            {
            // InternalFoo.g:5749:2: ( RULE_ID )
            // InternalFoo.g:5750:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getTypeIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSignatureAccess().getTypeIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__PSignature__TypeAssignment_0"


    // $ANTLR start "rule__PSignature__NameAssignment_1"
    // InternalFoo.g:5759:1: rule__PSignature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PSignature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5763:1: ( ( RULE_ID ) )
            // InternalFoo.g:5764:2: ( RULE_ID )
            {
            // InternalFoo.g:5764:2: ( RULE_ID )
            // InternalFoo.g:5765:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSignatureAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__PSignature__NameAssignment_1"


    // $ANTLR start "rule__PSignature__ParametersAssignment_3"
    // InternalFoo.g:5774:1: rule__PSignature__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__PSignature__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5778:1: ( ( ruleParameter ) )
            // InternalFoo.g:5779:2: ( ruleParameter )
            {
            // InternalFoo.g:5779:2: ( ruleParameter )
            // InternalFoo.g:5780:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__PSignature__ParametersAssignment_3"


    // $ANTLR start "rule__PSignature__ParametersAssignment_4_1"
    // InternalFoo.g:5789:1: rule__PSignature__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__PSignature__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5793:1: ( ( ruleParameter ) )
            // InternalFoo.g:5794:2: ( ruleParameter )
            {
            // InternalFoo.g:5794:2: ( ruleParameter )
            // InternalFoo.g:5795:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__PSignature__ParametersAssignment_4_1"


    // $ANTLR start "rule__MRequiredService__SignatureAssignment_2"
    // InternalFoo.g:5804:1: rule__MRequiredService__SignatureAssignment_2 : ( ruleRSignature ) ;
    public final void rule__MRequiredService__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5808:1: ( ( ruleRSignature ) )
            // InternalFoo.g:5809:2: ( ruleRSignature )
            {
            // InternalFoo.g:5809:2: ( ruleRSignature )
            // InternalFoo.g:5810:3: ruleRSignature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRequiredServiceAccess().getSignatureRSignatureParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRSignature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMRequiredServiceAccess().getSignatureRSignatureParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__MRequiredService__SignatureAssignment_2"


    // $ANTLR start "rule__RSignature__TypeAssignment_0"
    // InternalFoo.g:5819:1: rule__RSignature__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__RSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5823:1: ( ( RULE_ID ) )
            // InternalFoo.g:5824:2: ( RULE_ID )
            {
            // InternalFoo.g:5824:2: ( RULE_ID )
            // InternalFoo.g:5825:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getTypeIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSignatureAccess().getTypeIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__RSignature__TypeAssignment_0"


    // $ANTLR start "rule__RSignature__NameAssignment_1"
    // InternalFoo.g:5834:1: rule__RSignature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RSignature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5838:1: ( ( RULE_ID ) )
            // InternalFoo.g:5839:2: ( RULE_ID )
            {
            // InternalFoo.g:5839:2: ( RULE_ID )
            // InternalFoo.g:5840:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSignatureAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__RSignature__NameAssignment_1"


    // $ANTLR start "rule__RSignature__ParametersAssignment_3"
    // InternalFoo.g:5849:1: rule__RSignature__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__RSignature__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5853:1: ( ( ruleParameter ) )
            // InternalFoo.g:5854:2: ( ruleParameter )
            {
            // InternalFoo.g:5854:2: ( ruleParameter )
            // InternalFoo.g:5855:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__RSignature__ParametersAssignment_3"


    // $ANTLR start "rule__RSignature__ParametersAssignment_4_1"
    // InternalFoo.g:5864:1: rule__RSignature__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__RSignature__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5868:1: ( ( ruleParameter ) )
            // InternalFoo.g:5869:2: ( ruleParameter )
            {
            // InternalFoo.g:5869:2: ( ruleParameter )
            // InternalFoo.g:5870:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__RSignature__ParametersAssignment_4_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalFoo.g:5879:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5883:1: ( ( RULE_ID ) )
            // InternalFoo.g:5884:2: ( RULE_ID )
            {
            // InternalFoo.g:5884:2: ( RULE_ID )
            // InternalFoo.g:5885:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // InternalFoo.g:5894:1: rule__Parameter__TypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5898:1: ( ( RULE_ID ) )
            // InternalFoo.g:5899:2: ( RULE_ID )
            {
            // InternalFoo.g:5899:2: ( RULE_ID )
            // InternalFoo.g:5900:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Parameter__TypeAssignment_2"

    // Delegated rules


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\5\4\1\uffff\5\4\1\uffff\1\46\10\4\1\46\1\4\1\47\2\4\1\47\1\4";
    static final String dfa_3s = "\1\53\1\4\1\47\1\4\1\47\1\uffff\5\4\1\uffff\1\46\6\4\2\47\1\46\6\47";
    static final String dfa_4s = "\5\uffff\1\2\5\uffff\1\1\20\uffff";
    static final String dfa_5s = "\34\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\46\uffff\1\1",
            "\1\2",
            "\1\4\6\uffff\2\13\1\6\1\7\1\10\1\11\1\12\3\uffff\1\3\21\uffff\1\5",
            "\1\14",
            "\1\4\6\uffff\2\13\1\16\1\17\1\20\1\21\1\22\3\uffff\1\15\21\uffff\1\5",
            "",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\4\6\uffff\2\13\32\uffff\1\5",
            "\1\27\42\uffff\1\30",
            "\1\31",
            "\1\4\6\uffff\2\13\32\uffff\1\5",
            "\1\30",
            "\1\4\6\uffff\2\13\10\uffff\1\3\21\uffff\1\5",
            "\1\32\42\uffff\1\33",
            "\1\33",
            "\1\4\6\uffff\2\13\10\uffff\1\15\21\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 3134:2: ( rule__If__Group_2__0 )*";
        }
    }
    static final String dfa_7s = "\5\uffff\1\1\5\uffff\1\2\20\uffff";
    static final String[] dfa_8s = {
            "\1\2\46\uffff\1\1",
            "\1\2",
            "\1\4\6\uffff\2\5\1\6\1\7\1\10\1\11\1\12\3\uffff\1\3\21\uffff\1\13",
            "\1\14",
            "\1\4\6\uffff\2\5\1\16\1\17\1\20\1\21\1\22\3\uffff\1\15\21\uffff\1\13",
            "",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\4\6\uffff\2\5\32\uffff\1\13",
            "\1\27\42\uffff\1\30",
            "\1\31",
            "\1\4\6\uffff\2\5\32\uffff\1\13",
            "\1\30",
            "\1\4\6\uffff\2\5\10\uffff\1\3\21\uffff\1\13",
            "\1\32\42\uffff\1\33",
            "\1\33",
            "\1\4\6\uffff\2\5\10\uffff\1\15\21\uffff\1\13"
    };
    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[][] dfa_8 = unpackEncodedStringArray(dfa_8s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_7;
            this.special = dfa_5;
            this.transition = dfa_8;
        }
        public String getDescription() {
            return "()* loopback of 3688:2: ( rule__While__Group_2__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000021500000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001080100010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000042000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000042000000012L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000C2000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000C2000000012L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008400000010L});

}