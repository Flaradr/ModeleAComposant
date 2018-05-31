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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'<'", "'>'", "'<='", "'>='", "'=='", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'refine'", "'with'", "'Assembly'", "'components'", "'bindings'", "':'", "'-'", "'Component'", "'assembly'", "'provided'", "'='", "','", "'required'", "'service'", "'if'", "'('", "')'", "'else'", "'while'", "'!'", "';'"
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
    public static final int T__44=44;
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


    // $ANTLR start "entryRuleRefine"
    // InternalFoo.g:179:1: entryRuleRefine : ruleRefine EOF ;
    public final void entryRuleRefine() throws RecognitionException {
        try {
            // InternalFoo.g:180:1: ( ruleRefine EOF )
            // InternalFoo.g:181:1: ruleRefine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRefine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefineRule()); 
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
    // $ANTLR end "entryRuleRefine"


    // $ANTLR start "ruleRefine"
    // InternalFoo.g:188:1: ruleRefine : ( ( rule__Refine__Group__0 ) ) ;
    public final void ruleRefine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:192:2: ( ( ( rule__Refine__Group__0 ) ) )
            // InternalFoo.g:193:2: ( ( rule__Refine__Group__0 ) )
            {
            // InternalFoo.g:193:2: ( ( rule__Refine__Group__0 ) )
            // InternalFoo.g:194:3: ( rule__Refine__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefineAccess().getGroup()); 
            }
            // InternalFoo.g:195:3: ( rule__Refine__Group__0 )
            // InternalFoo.g:195:4: rule__Refine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Refine__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefineAccess().getGroup()); 
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
    // $ANTLR end "ruleRefine"


    // $ANTLR start "entryRuleAssembly"
    // InternalFoo.g:204:1: entryRuleAssembly : ruleAssembly EOF ;
    public final void entryRuleAssembly() throws RecognitionException {
        try {
            // InternalFoo.g:205:1: ( ruleAssembly EOF )
            // InternalFoo.g:206:1: ruleAssembly EOF
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
    // InternalFoo.g:213:1: ruleAssembly : ( ( rule__Assembly__Group__0 ) ) ;
    public final void ruleAssembly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:217:2: ( ( ( rule__Assembly__Group__0 ) ) )
            // InternalFoo.g:218:2: ( ( rule__Assembly__Group__0 ) )
            {
            // InternalFoo.g:218:2: ( ( rule__Assembly__Group__0 ) )
            // InternalFoo.g:219:3: ( rule__Assembly__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getGroup()); 
            }
            // InternalFoo.g:220:3: ( rule__Assembly__Group__0 )
            // InternalFoo.g:220:4: rule__Assembly__Group__0
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
    // InternalFoo.g:229:1: entryRuleComponentInstance : ruleComponentInstance EOF ;
    public final void entryRuleComponentInstance() throws RecognitionException {
        try {
            // InternalFoo.g:230:1: ( ruleComponentInstance EOF )
            // InternalFoo.g:231:1: ruleComponentInstance EOF
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
    // InternalFoo.g:238:1: ruleComponentInstance : ( ( rule__ComponentInstance__Group__0 ) ) ;
    public final void ruleComponentInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:242:2: ( ( ( rule__ComponentInstance__Group__0 ) ) )
            // InternalFoo.g:243:2: ( ( rule__ComponentInstance__Group__0 ) )
            {
            // InternalFoo.g:243:2: ( ( rule__ComponentInstance__Group__0 ) )
            // InternalFoo.g:244:3: ( rule__ComponentInstance__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentInstanceAccess().getGroup()); 
            }
            // InternalFoo.g:245:3: ( rule__ComponentInstance__Group__0 )
            // InternalFoo.g:245:4: rule__ComponentInstance__Group__0
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
    // InternalFoo.g:254:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalFoo.g:255:1: ( ruleBinding EOF )
            // InternalFoo.g:256:1: ruleBinding EOF
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
    // InternalFoo.g:263:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:267:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalFoo.g:268:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalFoo.g:268:2: ( ( rule__Binding__Group__0 ) )
            // InternalFoo.g:269:3: ( rule__Binding__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getGroup()); 
            }
            // InternalFoo.g:270:3: ( rule__Binding__Group__0 )
            // InternalFoo.g:270:4: rule__Binding__Group__0
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
    // InternalFoo.g:279:1: entryRuleBindingRequired : ruleBindingRequired EOF ;
    public final void entryRuleBindingRequired() throws RecognitionException {
        try {
            // InternalFoo.g:280:1: ( ruleBindingRequired EOF )
            // InternalFoo.g:281:1: ruleBindingRequired EOF
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
    // InternalFoo.g:288:1: ruleBindingRequired : ( ( rule__BindingRequired__Group__0 ) ) ;
    public final void ruleBindingRequired() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:292:2: ( ( ( rule__BindingRequired__Group__0 ) ) )
            // InternalFoo.g:293:2: ( ( rule__BindingRequired__Group__0 ) )
            {
            // InternalFoo.g:293:2: ( ( rule__BindingRequired__Group__0 ) )
            // InternalFoo.g:294:3: ( rule__BindingRequired__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRequiredAccess().getGroup()); 
            }
            // InternalFoo.g:295:3: ( rule__BindingRequired__Group__0 )
            // InternalFoo.g:295:4: rule__BindingRequired__Group__0
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
    // InternalFoo.g:304:1: entryRuleBindingProvided : ruleBindingProvided EOF ;
    public final void entryRuleBindingProvided() throws RecognitionException {
        try {
            // InternalFoo.g:305:1: ( ruleBindingProvided EOF )
            // InternalFoo.g:306:1: ruleBindingProvided EOF
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
    // InternalFoo.g:313:1: ruleBindingProvided : ( ( rule__BindingProvided__Group__0 ) ) ;
    public final void ruleBindingProvided() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:317:2: ( ( ( rule__BindingProvided__Group__0 ) ) )
            // InternalFoo.g:318:2: ( ( rule__BindingProvided__Group__0 ) )
            {
            // InternalFoo.g:318:2: ( ( rule__BindingProvided__Group__0 ) )
            // InternalFoo.g:319:3: ( rule__BindingProvided__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingProvidedAccess().getGroup()); 
            }
            // InternalFoo.g:320:3: ( rule__BindingProvided__Group__0 )
            // InternalFoo.g:320:4: rule__BindingProvided__Group__0
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
    // InternalFoo.g:329:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalFoo.g:330:1: ( ruleComponent EOF )
            // InternalFoo.g:331:1: ruleComponent EOF
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
    // InternalFoo.g:338:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:342:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalFoo.g:343:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalFoo.g:343:2: ( ( rule__Component__Group__0 ) )
            // InternalFoo.g:344:3: ( rule__Component__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup()); 
            }
            // InternalFoo.g:345:3: ( rule__Component__Group__0 )
            // InternalFoo.g:345:4: rule__Component__Group__0
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
    // InternalFoo.g:354:1: entryRuleListOfProvidedServices : ruleListOfProvidedServices EOF ;
    public final void entryRuleListOfProvidedServices() throws RecognitionException {
        try {
            // InternalFoo.g:355:1: ( ruleListOfProvidedServices EOF )
            // InternalFoo.g:356:1: ruleListOfProvidedServices EOF
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
    // InternalFoo.g:363:1: ruleListOfProvidedServices : ( ( rule__ListOfProvidedServices__Group__0 ) ) ;
    public final void ruleListOfProvidedServices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:367:2: ( ( ( rule__ListOfProvidedServices__Group__0 ) ) )
            // InternalFoo.g:368:2: ( ( rule__ListOfProvidedServices__Group__0 ) )
            {
            // InternalFoo.g:368:2: ( ( rule__ListOfProvidedServices__Group__0 ) )
            // InternalFoo.g:369:3: ( rule__ListOfProvidedServices__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getGroup()); 
            }
            // InternalFoo.g:370:3: ( rule__ListOfProvidedServices__Group__0 )
            // InternalFoo.g:370:4: rule__ListOfProvidedServices__Group__0
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
    // InternalFoo.g:379:1: entryRuleProvidedService : ruleProvidedService EOF ;
    public final void entryRuleProvidedService() throws RecognitionException {
        try {
            // InternalFoo.g:380:1: ( ruleProvidedService EOF )
            // InternalFoo.g:381:1: ruleProvidedService EOF
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
    // InternalFoo.g:388:1: ruleProvidedService : ( ( rule__ProvidedService__NameAssignment ) ) ;
    public final void ruleProvidedService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:392:2: ( ( ( rule__ProvidedService__NameAssignment ) ) )
            // InternalFoo.g:393:2: ( ( rule__ProvidedService__NameAssignment ) )
            {
            // InternalFoo.g:393:2: ( ( rule__ProvidedService__NameAssignment ) )
            // InternalFoo.g:394:3: ( rule__ProvidedService__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProvidedServiceAccess().getNameAssignment()); 
            }
            // InternalFoo.g:395:3: ( rule__ProvidedService__NameAssignment )
            // InternalFoo.g:395:4: rule__ProvidedService__NameAssignment
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
    // InternalFoo.g:404:1: entryRuleListOfrequiredServices : ruleListOfrequiredServices EOF ;
    public final void entryRuleListOfrequiredServices() throws RecognitionException {
        try {
            // InternalFoo.g:405:1: ( ruleListOfrequiredServices EOF )
            // InternalFoo.g:406:1: ruleListOfrequiredServices EOF
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
    // InternalFoo.g:413:1: ruleListOfrequiredServices : ( ( rule__ListOfrequiredServices__Group__0 ) ) ;
    public final void ruleListOfrequiredServices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:417:2: ( ( ( rule__ListOfrequiredServices__Group__0 ) ) )
            // InternalFoo.g:418:2: ( ( rule__ListOfrequiredServices__Group__0 ) )
            {
            // InternalFoo.g:418:2: ( ( rule__ListOfrequiredServices__Group__0 ) )
            // InternalFoo.g:419:3: ( rule__ListOfrequiredServices__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getGroup()); 
            }
            // InternalFoo.g:420:3: ( rule__ListOfrequiredServices__Group__0 )
            // InternalFoo.g:420:4: rule__ListOfrequiredServices__Group__0
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
    // InternalFoo.g:429:1: entryRuleRequiredService : ruleRequiredService EOF ;
    public final void entryRuleRequiredService() throws RecognitionException {
        try {
            // InternalFoo.g:430:1: ( ruleRequiredService EOF )
            // InternalFoo.g:431:1: ruleRequiredService EOF
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
    // InternalFoo.g:438:1: ruleRequiredService : ( ( rule__RequiredService__NameAssignment ) ) ;
    public final void ruleRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:442:2: ( ( ( rule__RequiredService__NameAssignment ) ) )
            // InternalFoo.g:443:2: ( ( rule__RequiredService__NameAssignment ) )
            {
            // InternalFoo.g:443:2: ( ( rule__RequiredService__NameAssignment ) )
            // InternalFoo.g:444:3: ( rule__RequiredService__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameAssignment()); 
            }
            // InternalFoo.g:445:3: ( rule__RequiredService__NameAssignment )
            // InternalFoo.g:445:4: rule__RequiredService__NameAssignment
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
    // InternalFoo.g:454:1: entryRuleMProvidedService : ruleMProvidedService EOF ;
    public final void entryRuleMProvidedService() throws RecognitionException {
        try {
            // InternalFoo.g:455:1: ( ruleMProvidedService EOF )
            // InternalFoo.g:456:1: ruleMProvidedService EOF
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
    // InternalFoo.g:463:1: ruleMProvidedService : ( ( rule__MProvidedService__Group__0 ) ) ;
    public final void ruleMProvidedService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:467:2: ( ( ( rule__MProvidedService__Group__0 ) ) )
            // InternalFoo.g:468:2: ( ( rule__MProvidedService__Group__0 ) )
            {
            // InternalFoo.g:468:2: ( ( rule__MProvidedService__Group__0 ) )
            // InternalFoo.g:469:3: ( rule__MProvidedService__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getGroup()); 
            }
            // InternalFoo.g:470:3: ( rule__MProvidedService__Group__0 )
            // InternalFoo.g:470:4: rule__MProvidedService__Group__0
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
    // InternalFoo.g:479:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalFoo.g:480:1: ( ruleExpression EOF )
            // InternalFoo.g:481:1: ruleExpression EOF
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
    // InternalFoo.g:488:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:492:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalFoo.g:493:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalFoo.g:493:2: ( ( rule__Expression__Alternatives ) )
            // InternalFoo.g:494:3: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalFoo.g:495:3: ( rule__Expression__Alternatives )
            // InternalFoo.g:495:4: rule__Expression__Alternatives
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
    // InternalFoo.g:504:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalFoo.g:505:1: ( ruleIf EOF )
            // InternalFoo.g:506:1: ruleIf EOF
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
    // InternalFoo.g:513:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:517:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalFoo.g:518:2: ( ( rule__If__Group__0 ) )
            {
            // InternalFoo.g:518:2: ( ( rule__If__Group__0 ) )
            // InternalFoo.g:519:3: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // InternalFoo.g:520:3: ( rule__If__Group__0 )
            // InternalFoo.g:520:4: rule__If__Group__0
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
    // InternalFoo.g:529:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // InternalFoo.g:530:1: ( ruleWhile EOF )
            // InternalFoo.g:531:1: ruleWhile EOF
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
    // InternalFoo.g:538:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:542:2: ( ( ( rule__While__Group__0 ) ) )
            // InternalFoo.g:543:2: ( ( rule__While__Group__0 ) )
            {
            // InternalFoo.g:543:2: ( ( rule__While__Group__0 ) )
            // InternalFoo.g:544:3: ( rule__While__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getGroup()); 
            }
            // InternalFoo.g:545:3: ( rule__While__Group__0 )
            // InternalFoo.g:545:4: rule__While__Group__0
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
    // InternalFoo.g:554:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalFoo.g:555:1: ( ruleCondition EOF )
            // InternalFoo.g:556:1: ruleCondition EOF
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
    // InternalFoo.g:563:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:567:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalFoo.g:568:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalFoo.g:568:2: ( ( rule__Condition__Group__0 ) )
            // InternalFoo.g:569:3: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalFoo.g:570:3: ( rule__Condition__Group__0 )
            // InternalFoo.g:570:4: rule__Condition__Group__0
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
    // InternalFoo.g:579:1: entryRuleStr : ruleStr EOF ;
    public final void entryRuleStr() throws RecognitionException {
        try {
            // InternalFoo.g:580:1: ( ruleStr EOF )
            // InternalFoo.g:581:1: ruleStr EOF
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
    // InternalFoo.g:588:1: ruleStr : ( ( rule__Str__Group__0 ) ) ;
    public final void ruleStr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:592:2: ( ( ( rule__Str__Group__0 ) ) )
            // InternalFoo.g:593:2: ( ( rule__Str__Group__0 ) )
            {
            // InternalFoo.g:593:2: ( ( rule__Str__Group__0 ) )
            // InternalFoo.g:594:3: ( rule__Str__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getGroup()); 
            }
            // InternalFoo.g:595:3: ( rule__Str__Group__0 )
            // InternalFoo.g:595:4: rule__Str__Group__0
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
    // InternalFoo.g:604:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalFoo.g:605:1: ( ruleComparison EOF )
            // InternalFoo.g:606:1: ruleComparison EOF
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
    // InternalFoo.g:613:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:617:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalFoo.g:618:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalFoo.g:618:2: ( ( rule__Comparison__Group__0 ) )
            // InternalFoo.g:619:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalFoo.g:620:3: ( rule__Comparison__Group__0 )
            // InternalFoo.g:620:4: rule__Comparison__Group__0
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
    // InternalFoo.g:629:1: entryRulePSignature : rulePSignature EOF ;
    public final void entryRulePSignature() throws RecognitionException {
        try {
            // InternalFoo.g:630:1: ( rulePSignature EOF )
            // InternalFoo.g:631:1: rulePSignature EOF
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
    // InternalFoo.g:638:1: rulePSignature : ( ( rule__PSignature__Group__0 ) ) ;
    public final void rulePSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:642:2: ( ( ( rule__PSignature__Group__0 ) ) )
            // InternalFoo.g:643:2: ( ( rule__PSignature__Group__0 ) )
            {
            // InternalFoo.g:643:2: ( ( rule__PSignature__Group__0 ) )
            // InternalFoo.g:644:3: ( rule__PSignature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getGroup()); 
            }
            // InternalFoo.g:645:3: ( rule__PSignature__Group__0 )
            // InternalFoo.g:645:4: rule__PSignature__Group__0
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
    // InternalFoo.g:654:1: entryRuleMRequiredService : ruleMRequiredService EOF ;
    public final void entryRuleMRequiredService() throws RecognitionException {
        try {
            // InternalFoo.g:655:1: ( ruleMRequiredService EOF )
            // InternalFoo.g:656:1: ruleMRequiredService EOF
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
    // InternalFoo.g:663:1: ruleMRequiredService : ( ( rule__MRequiredService__Group__0 ) ) ;
    public final void ruleMRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:667:2: ( ( ( rule__MRequiredService__Group__0 ) ) )
            // InternalFoo.g:668:2: ( ( rule__MRequiredService__Group__0 ) )
            {
            // InternalFoo.g:668:2: ( ( rule__MRequiredService__Group__0 ) )
            // InternalFoo.g:669:3: ( rule__MRequiredService__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRequiredServiceAccess().getGroup()); 
            }
            // InternalFoo.g:670:3: ( rule__MRequiredService__Group__0 )
            // InternalFoo.g:670:4: rule__MRequiredService__Group__0
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
    // InternalFoo.g:679:1: entryRuleRSignature : ruleRSignature EOF ;
    public final void entryRuleRSignature() throws RecognitionException {
        try {
            // InternalFoo.g:680:1: ( ruleRSignature EOF )
            // InternalFoo.g:681:1: ruleRSignature EOF
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
    // InternalFoo.g:688:1: ruleRSignature : ( ( rule__RSignature__Group__0 ) ) ;
    public final void ruleRSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:692:2: ( ( ( rule__RSignature__Group__0 ) ) )
            // InternalFoo.g:693:2: ( ( rule__RSignature__Group__0 ) )
            {
            // InternalFoo.g:693:2: ( ( rule__RSignature__Group__0 ) )
            // InternalFoo.g:694:3: ( rule__RSignature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getGroup()); 
            }
            // InternalFoo.g:695:3: ( rule__RSignature__Group__0 )
            // InternalFoo.g:695:4: rule__RSignature__Group__0
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
    // InternalFoo.g:704:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalFoo.g:705:1: ( ruleParameter EOF )
            // InternalFoo.g:706:1: ruleParameter EOF
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
    // InternalFoo.g:713:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:717:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalFoo.g:718:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalFoo.g:718:2: ( ( rule__Parameter__Group__0 ) )
            // InternalFoo.g:719:3: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalFoo.g:720:3: ( rule__Parameter__Group__0 )
            // InternalFoo.g:720:4: rule__Parameter__Group__0
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
    // InternalFoo.g:728:1: rule__Expression__Alternatives : ( ( ruleIf ) | ( ruleWhile ) | ( ruleStr ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:732:1: ( ( ruleIf ) | ( ruleWhile ) | ( ruleStr ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 38:
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
                    // InternalFoo.g:733:2: ( ruleIf )
                    {
                    // InternalFoo.g:733:2: ( ruleIf )
                    // InternalFoo.g:734:3: ruleIf
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
                    // InternalFoo.g:739:2: ( ruleWhile )
                    {
                    // InternalFoo.g:739:2: ( ruleWhile )
                    // InternalFoo.g:740:3: ruleWhile
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
                    // InternalFoo.g:745:2: ( ruleStr )
                    {
                    // InternalFoo.g:745:2: ( ruleStr )
                    // InternalFoo.g:746:3: ruleStr
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
    // InternalFoo.g:755:1: rule__If__Alternatives_2_1 : ( ( '||' ) | ( '&&' ) );
    public final void rule__If__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:759:1: ( ( '||' ) | ( '&&' ) )
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
                    // InternalFoo.g:760:2: ( '||' )
                    {
                    // InternalFoo.g:760:2: ( '||' )
                    // InternalFoo.g:761:3: '||'
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
                    // InternalFoo.g:766:2: ( '&&' )
                    {
                    // InternalFoo.g:766:2: ( '&&' )
                    // InternalFoo.g:767:3: '&&'
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
    // InternalFoo.g:776:1: rule__If__Alternatives_6 : ( ( ( rule__If__StrAssignment_6_0 ) ) | ( ( rule__If__IfAssignment_6_1 ) ) | ( ( rule__If__WhileAssignment_6_2 ) ) );
    public final void rule__If__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:780:1: ( ( ( rule__If__StrAssignment_6_0 ) ) | ( ( rule__If__IfAssignment_6_1 ) ) | ( ( rule__If__WhileAssignment_6_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 38:
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
                    // InternalFoo.g:781:2: ( ( rule__If__StrAssignment_6_0 ) )
                    {
                    // InternalFoo.g:781:2: ( ( rule__If__StrAssignment_6_0 ) )
                    // InternalFoo.g:782:3: ( rule__If__StrAssignment_6_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getStrAssignment_6_0()); 
                    }
                    // InternalFoo.g:783:3: ( rule__If__StrAssignment_6_0 )
                    // InternalFoo.g:783:4: rule__If__StrAssignment_6_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__StrAssignment_6_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getStrAssignment_6_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:787:2: ( ( rule__If__IfAssignment_6_1 ) )
                    {
                    // InternalFoo.g:787:2: ( ( rule__If__IfAssignment_6_1 ) )
                    // InternalFoo.g:788:3: ( rule__If__IfAssignment_6_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getIfAssignment_6_1()); 
                    }
                    // InternalFoo.g:789:3: ( rule__If__IfAssignment_6_1 )
                    // InternalFoo.g:789:4: rule__If__IfAssignment_6_1
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
                    // InternalFoo.g:793:2: ( ( rule__If__WhileAssignment_6_2 ) )
                    {
                    // InternalFoo.g:793:2: ( ( rule__If__WhileAssignment_6_2 ) )
                    // InternalFoo.g:794:3: ( rule__If__WhileAssignment_6_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getWhileAssignment_6_2()); 
                    }
                    // InternalFoo.g:795:3: ( rule__If__WhileAssignment_6_2 )
                    // InternalFoo.g:795:4: rule__If__WhileAssignment_6_2
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
    // InternalFoo.g:803:1: rule__If__Alternatives_8_1 : ( ( ( rule__If__ElseAssignment_8_1_0 ) ) | ( ( rule__If__Group_8_1_1__0 ) ) );
    public final void rule__If__Alternatives_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:807:1: ( ( ( rule__If__ElseAssignment_8_1_0 ) ) | ( ( rule__If__Group_8_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==38) ) {
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
                    // InternalFoo.g:808:2: ( ( rule__If__ElseAssignment_8_1_0 ) )
                    {
                    // InternalFoo.g:808:2: ( ( rule__If__ElseAssignment_8_1_0 ) )
                    // InternalFoo.g:809:3: ( rule__If__ElseAssignment_8_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getElseAssignment_8_1_0()); 
                    }
                    // InternalFoo.g:810:3: ( rule__If__ElseAssignment_8_1_0 )
                    // InternalFoo.g:810:4: rule__If__ElseAssignment_8_1_0
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
                    // InternalFoo.g:814:2: ( ( rule__If__Group_8_1_1__0 ) )
                    {
                    // InternalFoo.g:814:2: ( ( rule__If__Group_8_1_1__0 ) )
                    // InternalFoo.g:815:3: ( rule__If__Group_8_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getGroup_8_1_1()); 
                    }
                    // InternalFoo.g:816:3: ( rule__If__Group_8_1_1__0 )
                    // InternalFoo.g:816:4: rule__If__Group_8_1_1__0
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
    // InternalFoo.g:824:1: rule__If__Alternatives_8_1_1_1 : ( ( ( rule__If__StrAssignment_8_1_1_1_0 ) ) | ( ( rule__If__IfAssignment_8_1_1_1_1 ) ) | ( ( rule__If__WhileAssignment_8_1_1_1_2 ) ) );
    public final void rule__If__Alternatives_8_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:828:1: ( ( ( rule__If__StrAssignment_8_1_1_1_0 ) ) | ( ( rule__If__IfAssignment_8_1_1_1_1 ) ) | ( ( rule__If__WhileAssignment_8_1_1_1_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 38:
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
                    // InternalFoo.g:829:2: ( ( rule__If__StrAssignment_8_1_1_1_0 ) )
                    {
                    // InternalFoo.g:829:2: ( ( rule__If__StrAssignment_8_1_1_1_0 ) )
                    // InternalFoo.g:830:3: ( rule__If__StrAssignment_8_1_1_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getStrAssignment_8_1_1_1_0()); 
                    }
                    // InternalFoo.g:831:3: ( rule__If__StrAssignment_8_1_1_1_0 )
                    // InternalFoo.g:831:4: rule__If__StrAssignment_8_1_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__StrAssignment_8_1_1_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getStrAssignment_8_1_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:835:2: ( ( rule__If__IfAssignment_8_1_1_1_1 ) )
                    {
                    // InternalFoo.g:835:2: ( ( rule__If__IfAssignment_8_1_1_1_1 ) )
                    // InternalFoo.g:836:3: ( rule__If__IfAssignment_8_1_1_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getIfAssignment_8_1_1_1_1()); 
                    }
                    // InternalFoo.g:837:3: ( rule__If__IfAssignment_8_1_1_1_1 )
                    // InternalFoo.g:837:4: rule__If__IfAssignment_8_1_1_1_1
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
                    // InternalFoo.g:841:2: ( ( rule__If__WhileAssignment_8_1_1_1_2 ) )
                    {
                    // InternalFoo.g:841:2: ( ( rule__If__WhileAssignment_8_1_1_1_2 ) )
                    // InternalFoo.g:842:3: ( rule__If__WhileAssignment_8_1_1_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getWhileAssignment_8_1_1_1_2()); 
                    }
                    // InternalFoo.g:843:3: ( rule__If__WhileAssignment_8_1_1_1_2 )
                    // InternalFoo.g:843:4: rule__If__WhileAssignment_8_1_1_1_2
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
    // InternalFoo.g:851:1: rule__While__Alternatives_2_1 : ( ( '||' ) | ( '&&' ) );
    public final void rule__While__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:855:1: ( ( '||' ) | ( '&&' ) )
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
                    // InternalFoo.g:856:2: ( '||' )
                    {
                    // InternalFoo.g:856:2: ( '||' )
                    // InternalFoo.g:857:3: '||'
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
                    // InternalFoo.g:862:2: ( '&&' )
                    {
                    // InternalFoo.g:862:2: ( '&&' )
                    // InternalFoo.g:863:3: '&&'
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
    // InternalFoo.g:872:1: rule__While__Alternatives_6 : ( ( ( rule__While__StrAssignment_6_0 ) ) | ( ( rule__While__IfAssignment_6_1 ) ) | ( ( rule__While__WhileAssignment_6_2 ) ) );
    public final void rule__While__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:876:1: ( ( ( rule__While__StrAssignment_6_0 ) ) | ( ( rule__While__IfAssignment_6_1 ) ) | ( ( rule__While__WhileAssignment_6_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 38:
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
                    // InternalFoo.g:877:2: ( ( rule__While__StrAssignment_6_0 ) )
                    {
                    // InternalFoo.g:877:2: ( ( rule__While__StrAssignment_6_0 ) )
                    // InternalFoo.g:878:3: ( rule__While__StrAssignment_6_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWhileAccess().getStrAssignment_6_0()); 
                    }
                    // InternalFoo.g:879:3: ( rule__While__StrAssignment_6_0 )
                    // InternalFoo.g:879:4: rule__While__StrAssignment_6_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__While__StrAssignment_6_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWhileAccess().getStrAssignment_6_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFoo.g:883:2: ( ( rule__While__IfAssignment_6_1 ) )
                    {
                    // InternalFoo.g:883:2: ( ( rule__While__IfAssignment_6_1 ) )
                    // InternalFoo.g:884:3: ( rule__While__IfAssignment_6_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWhileAccess().getIfAssignment_6_1()); 
                    }
                    // InternalFoo.g:885:3: ( rule__While__IfAssignment_6_1 )
                    // InternalFoo.g:885:4: rule__While__IfAssignment_6_1
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
                    // InternalFoo.g:889:2: ( ( rule__While__WhileAssignment_6_2 ) )
                    {
                    // InternalFoo.g:889:2: ( ( rule__While__WhileAssignment_6_2 ) )
                    // InternalFoo.g:890:3: ( rule__While__WhileAssignment_6_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWhileAccess().getWhileAssignment_6_2()); 
                    }
                    // InternalFoo.g:891:3: ( rule__While__WhileAssignment_6_2 )
                    // InternalFoo.g:891:4: rule__While__WhileAssignment_6_2
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
    // InternalFoo.g:899:1: rule__Condition__Alternatives_1 : ( ( ( rule__Condition__ConditionsAssignment_1_0 ) ) | ( ( rule__Condition__ConditionsAssignment_1_1 ) ) );
    public final void rule__Condition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:903:1: ( ( ( rule__Condition__ConditionsAssignment_1_0 ) ) | ( ( rule__Condition__ConditionsAssignment_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==RULE_ID||(LA8_1>=11 && LA8_1<=12)||LA8_1==21||LA8_1==40||LA8_1==44) ) {
                    alt8=2;
                }
                else if ( ((LA8_1>=13 && LA8_1<=17)) ) {
                    alt8=1;
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
                    // InternalFoo.g:904:2: ( ( rule__Condition__ConditionsAssignment_1_0 ) )
                    {
                    // InternalFoo.g:904:2: ( ( rule__Condition__ConditionsAssignment_1_0 ) )
                    // InternalFoo.g:905:3: ( rule__Condition__ConditionsAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionAccess().getConditionsAssignment_1_0()); 
                    }
                    // InternalFoo.g:906:3: ( rule__Condition__ConditionsAssignment_1_0 )
                    // InternalFoo.g:906:4: rule__Condition__ConditionsAssignment_1_0
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
                    // InternalFoo.g:910:2: ( ( rule__Condition__ConditionsAssignment_1_1 ) )
                    {
                    // InternalFoo.g:910:2: ( ( rule__Condition__ConditionsAssignment_1_1 ) )
                    // InternalFoo.g:911:3: ( rule__Condition__ConditionsAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionAccess().getConditionsAssignment_1_1()); 
                    }
                    // InternalFoo.g:912:3: ( rule__Condition__ConditionsAssignment_1_1 )
                    // InternalFoo.g:912:4: rule__Condition__ConditionsAssignment_1_1
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
    // InternalFoo.g:920:1: rule__Comparison__Alternatives_1 : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) | ( '==' ) );
    public final void rule__Comparison__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:924:1: ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) | ( '==' ) )
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
                    // InternalFoo.g:925:2: ( '<' )
                    {
                    // InternalFoo.g:925:2: ( '<' )
                    // InternalFoo.g:926:3: '<'
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
                    // InternalFoo.g:931:2: ( '>' )
                    {
                    // InternalFoo.g:931:2: ( '>' )
                    // InternalFoo.g:932:3: '>'
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
                    // InternalFoo.g:937:2: ( '<=' )
                    {
                    // InternalFoo.g:937:2: ( '<=' )
                    // InternalFoo.g:938:3: '<='
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
                    // InternalFoo.g:943:2: ( '>=' )
                    {
                    // InternalFoo.g:943:2: ( '>=' )
                    // InternalFoo.g:944:3: '>='
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
                    // InternalFoo.g:949:2: ( '==' )
                    {
                    // InternalFoo.g:949:2: ( '==' )
                    // InternalFoo.g:950:3: '=='
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
    // InternalFoo.g:959:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:963:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFoo.g:964:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalFoo.g:971:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:975:1: ( ( 'package' ) )
            // InternalFoo.g:976:1: ( 'package' )
            {
            // InternalFoo.g:976:1: ( 'package' )
            // InternalFoo.g:977:2: 'package'
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
    // InternalFoo.g:986:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:990:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalFoo.g:991:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalFoo.g:998:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1002:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalFoo.g:1003:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalFoo.g:1003:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalFoo.g:1004:2: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // InternalFoo.g:1005:2: ( rule__Model__NameAssignment_1 )
            // InternalFoo.g:1005:3: rule__Model__NameAssignment_1
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
    // InternalFoo.g:1013:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1017:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalFoo.g:1018:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalFoo.g:1025:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1029:1: ( ( '{' ) )
            // InternalFoo.g:1030:1: ( '{' )
            {
            // InternalFoo.g:1030:1: ( '{' )
            // InternalFoo.g:1031:2: '{'
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
    // InternalFoo.g:1040:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1044:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalFoo.g:1045:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalFoo.g:1052:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1056:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // InternalFoo.g:1057:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // InternalFoo.g:1057:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // InternalFoo.g:1058:2: ( rule__Model__ImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            }
            // InternalFoo.g:1059:2: ( rule__Model__ImportsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFoo.g:1059:3: rule__Model__ImportsAssignment_3
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
    // InternalFoo.g:1067:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1071:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalFoo.g:1072:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalFoo.g:1079:1: rule__Model__Group__4__Impl : ( ( rule__Model__ComponentsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1083:1: ( ( ( rule__Model__ComponentsAssignment_4 )* ) )
            // InternalFoo.g:1084:1: ( ( rule__Model__ComponentsAssignment_4 )* )
            {
            // InternalFoo.g:1084:1: ( ( rule__Model__ComponentsAssignment_4 )* )
            // InternalFoo.g:1085:2: ( rule__Model__ComponentsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getComponentsAssignment_4()); 
            }
            // InternalFoo.g:1086:2: ( rule__Model__ComponentsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFoo.g:1086:3: rule__Model__ComponentsAssignment_4
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
    // InternalFoo.g:1094:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1098:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalFoo.g:1099:2: rule__Model__Group__5__Impl rule__Model__Group__6
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
    // InternalFoo.g:1106:1: rule__Model__Group__5__Impl : ( ( rule__Model__AssemblyAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1110:1: ( ( ( rule__Model__AssemblyAssignment_5 )* ) )
            // InternalFoo.g:1111:1: ( ( rule__Model__AssemblyAssignment_5 )* )
            {
            // InternalFoo.g:1111:1: ( ( rule__Model__AssemblyAssignment_5 )* )
            // InternalFoo.g:1112:2: ( rule__Model__AssemblyAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAssemblyAssignment_5()); 
            }
            // InternalFoo.g:1113:2: ( rule__Model__AssemblyAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFoo.g:1113:3: rule__Model__AssemblyAssignment_5
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
    // InternalFoo.g:1121:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1125:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalFoo.g:1126:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

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
    // InternalFoo.g:1133:1: rule__Model__Group__6__Impl : ( ( rule__Model__RefiningListAssignment_6 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1137:1: ( ( ( rule__Model__RefiningListAssignment_6 )* ) )
            // InternalFoo.g:1138:1: ( ( rule__Model__RefiningListAssignment_6 )* )
            {
            // InternalFoo.g:1138:1: ( ( rule__Model__RefiningListAssignment_6 )* )
            // InternalFoo.g:1139:2: ( rule__Model__RefiningListAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRefiningListAssignment_6()); 
            }
            // InternalFoo.g:1140:2: ( rule__Model__RefiningListAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFoo.g:1140:3: rule__Model__RefiningListAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__RefiningListAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRefiningListAssignment_6()); 
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


    // $ANTLR start "rule__Model__Group__7"
    // InternalFoo.g:1148:1: rule__Model__Group__7 : rule__Model__Group__7__Impl ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1152:1: ( rule__Model__Group__7__Impl )
            // InternalFoo.g:1153:2: rule__Model__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__7__Impl();

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
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalFoo.g:1159:1: rule__Model__Group__7__Impl : ( '}' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1163:1: ( ( '}' ) )
            // InternalFoo.g:1164:1: ( '}' )
            {
            // InternalFoo.g:1164:1: ( '}' )
            // InternalFoo.g:1165:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalFoo.g:1175:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1179:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalFoo.g:1180:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalFoo.g:1187:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1191:1: ( ( RULE_ID ) )
            // InternalFoo.g:1192:1: ( RULE_ID )
            {
            // InternalFoo.g:1192:1: ( RULE_ID )
            // InternalFoo.g:1193:2: RULE_ID
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
    // InternalFoo.g:1202:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1206:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalFoo.g:1207:2: rule__QualifiedName__Group__1__Impl
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
    // InternalFoo.g:1213:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1217:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalFoo.g:1218:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalFoo.g:1218:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalFoo.g:1219:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalFoo.g:1220:2: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFoo.g:1220:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalFoo.g:1229:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1233:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalFoo.g:1234:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalFoo.g:1241:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1245:1: ( ( '.' ) )
            // InternalFoo.g:1246:1: ( '.' )
            {
            // InternalFoo.g:1246:1: ( '.' )
            // InternalFoo.g:1247:2: '.'
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
    // InternalFoo.g:1256:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1260:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalFoo.g:1261:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalFoo.g:1267:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1271:1: ( ( RULE_ID ) )
            // InternalFoo.g:1272:1: ( RULE_ID )
            {
            // InternalFoo.g:1272:1: ( RULE_ID )
            // InternalFoo.g:1273:2: RULE_ID
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
    // InternalFoo.g:1283:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1287:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalFoo.g:1288:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalFoo.g:1295:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1299:1: ( ( 'import' ) )
            // InternalFoo.g:1300:1: ( 'import' )
            {
            // InternalFoo.g:1300:1: ( 'import' )
            // InternalFoo.g:1301:2: 'import'
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
    // InternalFoo.g:1310:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1314:1: ( rule__Import__Group__1__Impl )
            // InternalFoo.g:1315:2: rule__Import__Group__1__Impl
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
    // InternalFoo.g:1321:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1325:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalFoo.g:1326:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalFoo.g:1326:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalFoo.g:1327:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalFoo.g:1328:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalFoo.g:1328:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalFoo.g:1337:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1341:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalFoo.g:1342:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalFoo.g:1349:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1353:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:1354:1: ( ruleQualifiedName )
            {
            // InternalFoo.g:1354:1: ( ruleQualifiedName )
            // InternalFoo.g:1355:2: ruleQualifiedName
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
    // InternalFoo.g:1364:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1368:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalFoo.g:1369:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalFoo.g:1375:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1379:1: ( ( ( '.*' )? ) )
            // InternalFoo.g:1380:1: ( ( '.*' )? )
            {
            // InternalFoo.g:1380:1: ( ( '.*' )? )
            // InternalFoo.g:1381:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalFoo.g:1382:2: ( '.*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFoo.g:1382:3: '.*'
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


    // $ANTLR start "rule__Refine__Group__0"
    // InternalFoo.g:1391:1: rule__Refine__Group__0 : rule__Refine__Group__0__Impl rule__Refine__Group__1 ;
    public final void rule__Refine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1395:1: ( rule__Refine__Group__0__Impl rule__Refine__Group__1 )
            // InternalFoo.g:1396:2: rule__Refine__Group__0__Impl rule__Refine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Refine__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Refine__Group__1();

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
    // $ANTLR end "rule__Refine__Group__0"


    // $ANTLR start "rule__Refine__Group__0__Impl"
    // InternalFoo.g:1403:1: rule__Refine__Group__0__Impl : ( 'refine' ) ;
    public final void rule__Refine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1407:1: ( ( 'refine' ) )
            // InternalFoo.g:1408:1: ( 'refine' )
            {
            // InternalFoo.g:1408:1: ( 'refine' )
            // InternalFoo.g:1409:2: 'refine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefineAccess().getRefineKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefineAccess().getRefineKeyword_0()); 
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
    // $ANTLR end "rule__Refine__Group__0__Impl"


    // $ANTLR start "rule__Refine__Group__1"
    // InternalFoo.g:1418:1: rule__Refine__Group__1 : rule__Refine__Group__1__Impl rule__Refine__Group__2 ;
    public final void rule__Refine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1422:1: ( rule__Refine__Group__1__Impl rule__Refine__Group__2 )
            // InternalFoo.g:1423:2: rule__Refine__Group__1__Impl rule__Refine__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Refine__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Refine__Group__2();

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
    // $ANTLR end "rule__Refine__Group__1"


    // $ANTLR start "rule__Refine__Group__1__Impl"
    // InternalFoo.g:1430:1: rule__Refine__Group__1__Impl : ( ( rule__Refine__EltToRefineAssignment_1 ) ) ;
    public final void rule__Refine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1434:1: ( ( ( rule__Refine__EltToRefineAssignment_1 ) ) )
            // InternalFoo.g:1435:1: ( ( rule__Refine__EltToRefineAssignment_1 ) )
            {
            // InternalFoo.g:1435:1: ( ( rule__Refine__EltToRefineAssignment_1 ) )
            // InternalFoo.g:1436:2: ( rule__Refine__EltToRefineAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefineAccess().getEltToRefineAssignment_1()); 
            }
            // InternalFoo.g:1437:2: ( rule__Refine__EltToRefineAssignment_1 )
            // InternalFoo.g:1437:3: rule__Refine__EltToRefineAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Refine__EltToRefineAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefineAccess().getEltToRefineAssignment_1()); 
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
    // $ANTLR end "rule__Refine__Group__1__Impl"


    // $ANTLR start "rule__Refine__Group__2"
    // InternalFoo.g:1445:1: rule__Refine__Group__2 : rule__Refine__Group__2__Impl rule__Refine__Group__3 ;
    public final void rule__Refine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1449:1: ( rule__Refine__Group__2__Impl rule__Refine__Group__3 )
            // InternalFoo.g:1450:2: rule__Refine__Group__2__Impl rule__Refine__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Refine__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Refine__Group__3();

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
    // $ANTLR end "rule__Refine__Group__2"


    // $ANTLR start "rule__Refine__Group__2__Impl"
    // InternalFoo.g:1457:1: rule__Refine__Group__2__Impl : ( 'with' ) ;
    public final void rule__Refine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1461:1: ( ( 'with' ) )
            // InternalFoo.g:1462:1: ( 'with' )
            {
            // InternalFoo.g:1462:1: ( 'with' )
            // InternalFoo.g:1463:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefineAccess().getWithKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefineAccess().getWithKeyword_2()); 
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
    // $ANTLR end "rule__Refine__Group__2__Impl"


    // $ANTLR start "rule__Refine__Group__3"
    // InternalFoo.g:1472:1: rule__Refine__Group__3 : rule__Refine__Group__3__Impl ;
    public final void rule__Refine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1476:1: ( rule__Refine__Group__3__Impl )
            // InternalFoo.g:1477:2: rule__Refine__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Refine__Group__3__Impl();

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
    // $ANTLR end "rule__Refine__Group__3"


    // $ANTLR start "rule__Refine__Group__3__Impl"
    // InternalFoo.g:1483:1: rule__Refine__Group__3__Impl : ( ( rule__Refine__RefiningEltAssignment_3 ) ) ;
    public final void rule__Refine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1487:1: ( ( ( rule__Refine__RefiningEltAssignment_3 ) ) )
            // InternalFoo.g:1488:1: ( ( rule__Refine__RefiningEltAssignment_3 ) )
            {
            // InternalFoo.g:1488:1: ( ( rule__Refine__RefiningEltAssignment_3 ) )
            // InternalFoo.g:1489:2: ( rule__Refine__RefiningEltAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefineAccess().getRefiningEltAssignment_3()); 
            }
            // InternalFoo.g:1490:2: ( rule__Refine__RefiningEltAssignment_3 )
            // InternalFoo.g:1490:3: rule__Refine__RefiningEltAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Refine__RefiningEltAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefineAccess().getRefiningEltAssignment_3()); 
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
    // $ANTLR end "rule__Refine__Group__3__Impl"


    // $ANTLR start "rule__Assembly__Group__0"
    // InternalFoo.g:1499:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1503:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // InternalFoo.g:1504:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalFoo.g:1511:1: rule__Assembly__Group__0__Impl : ( () ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1515:1: ( ( () ) )
            // InternalFoo.g:1516:1: ( () )
            {
            // InternalFoo.g:1516:1: ( () )
            // InternalFoo.g:1517:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAssemblyAction_0()); 
            }
            // InternalFoo.g:1518:2: ()
            // InternalFoo.g:1518:3: 
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
    // InternalFoo.g:1526:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1530:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // InternalFoo.g:1531:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
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
    // InternalFoo.g:1538:1: rule__Assembly__Group__1__Impl : ( 'Assembly' ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1542:1: ( ( 'Assembly' ) )
            // InternalFoo.g:1543:1: ( 'Assembly' )
            {
            // InternalFoo.g:1543:1: ( 'Assembly' )
            // InternalFoo.g:1544:2: 'Assembly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:1553:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1557:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // InternalFoo.g:1558:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
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
    // InternalFoo.g:1565:1: rule__Assembly__Group__2__Impl : ( ( rule__Assembly__NameAssignment_2 ) ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1569:1: ( ( ( rule__Assembly__NameAssignment_2 ) ) )
            // InternalFoo.g:1570:1: ( ( rule__Assembly__NameAssignment_2 ) )
            {
            // InternalFoo.g:1570:1: ( ( rule__Assembly__NameAssignment_2 ) )
            // InternalFoo.g:1571:2: ( rule__Assembly__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getNameAssignment_2()); 
            }
            // InternalFoo.g:1572:2: ( rule__Assembly__NameAssignment_2 )
            // InternalFoo.g:1572:3: rule__Assembly__NameAssignment_2
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
    // InternalFoo.g:1580:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1584:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // InternalFoo.g:1585:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalFoo.g:1592:1: rule__Assembly__Group__3__Impl : ( '{' ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1596:1: ( ( '{' ) )
            // InternalFoo.g:1597:1: ( '{' )
            {
            // InternalFoo.g:1597:1: ( '{' )
            // InternalFoo.g:1598:2: '{'
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
    // InternalFoo.g:1607:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl rule__Assembly__Group__5 ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1611:1: ( rule__Assembly__Group__4__Impl rule__Assembly__Group__5 )
            // InternalFoo.g:1612:2: rule__Assembly__Group__4__Impl rule__Assembly__Group__5
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
    // InternalFoo.g:1619:1: rule__Assembly__Group__4__Impl : ( 'components' ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1623:1: ( ( 'components' ) )
            // InternalFoo.g:1624:1: ( 'components' )
            {
            // InternalFoo.g:1624:1: ( 'components' )
            // InternalFoo.g:1625:2: 'components'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getComponentsKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:1634:1: rule__Assembly__Group__5 : rule__Assembly__Group__5__Impl rule__Assembly__Group__6 ;
    public final void rule__Assembly__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1638:1: ( rule__Assembly__Group__5__Impl rule__Assembly__Group__6 )
            // InternalFoo.g:1639:2: rule__Assembly__Group__5__Impl rule__Assembly__Group__6
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
    // InternalFoo.g:1646:1: rule__Assembly__Group__5__Impl : ( ( rule__Assembly__AttributesAssignment_5 ) ) ;
    public final void rule__Assembly__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1650:1: ( ( ( rule__Assembly__AttributesAssignment_5 ) ) )
            // InternalFoo.g:1651:1: ( ( rule__Assembly__AttributesAssignment_5 ) )
            {
            // InternalFoo.g:1651:1: ( ( rule__Assembly__AttributesAssignment_5 ) )
            // InternalFoo.g:1652:2: ( rule__Assembly__AttributesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAttributesAssignment_5()); 
            }
            // InternalFoo.g:1653:2: ( rule__Assembly__AttributesAssignment_5 )
            // InternalFoo.g:1653:3: rule__Assembly__AttributesAssignment_5
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
    // InternalFoo.g:1661:1: rule__Assembly__Group__6 : rule__Assembly__Group__6__Impl rule__Assembly__Group__7 ;
    public final void rule__Assembly__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1665:1: ( rule__Assembly__Group__6__Impl rule__Assembly__Group__7 )
            // InternalFoo.g:1666:2: rule__Assembly__Group__6__Impl rule__Assembly__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalFoo.g:1673:1: rule__Assembly__Group__6__Impl : ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) ) ;
    public final void rule__Assembly__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1677:1: ( ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) ) )
            // InternalFoo.g:1678:1: ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) )
            {
            // InternalFoo.g:1678:1: ( ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* ) )
            // InternalFoo.g:1679:2: ( ( rule__Assembly__AttributesAssignment_6 ) ) ( ( rule__Assembly__AttributesAssignment_6 )* )
            {
            // InternalFoo.g:1679:2: ( ( rule__Assembly__AttributesAssignment_6 ) )
            // InternalFoo.g:1680:3: ( rule__Assembly__AttributesAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 
            }
            // InternalFoo.g:1681:3: ( rule__Assembly__AttributesAssignment_6 )
            // InternalFoo.g:1681:4: rule__Assembly__AttributesAssignment_6
            {
            pushFollow(FOLLOW_17);
            rule__Assembly__AttributesAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 
            }

            }

            // InternalFoo.g:1684:2: ( ( rule__Assembly__AttributesAssignment_6 )* )
            // InternalFoo.g:1685:3: ( rule__Assembly__AttributesAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAttributesAssignment_6()); 
            }
            // InternalFoo.g:1686:3: ( rule__Assembly__AttributesAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFoo.g:1686:4: rule__Assembly__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Assembly__AttributesAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalFoo.g:1695:1: rule__Assembly__Group__7 : rule__Assembly__Group__7__Impl rule__Assembly__Group__8 ;
    public final void rule__Assembly__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1699:1: ( rule__Assembly__Group__7__Impl rule__Assembly__Group__8 )
            // InternalFoo.g:1700:2: rule__Assembly__Group__7__Impl rule__Assembly__Group__8
            {
            pushFollow(FOLLOW_18);
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
    // InternalFoo.g:1707:1: rule__Assembly__Group__7__Impl : ( 'bindings' ) ;
    public final void rule__Assembly__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1711:1: ( ( 'bindings' ) )
            // InternalFoo.g:1712:1: ( 'bindings' )
            {
            // InternalFoo.g:1712:1: ( 'bindings' )
            // InternalFoo.g:1713:2: 'bindings'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getBindingsKeyword_7()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:1722:1: rule__Assembly__Group__8 : rule__Assembly__Group__8__Impl rule__Assembly__Group__9 ;
    public final void rule__Assembly__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1726:1: ( rule__Assembly__Group__8__Impl rule__Assembly__Group__9 )
            // InternalFoo.g:1727:2: rule__Assembly__Group__8__Impl rule__Assembly__Group__9
            {
            pushFollow(FOLLOW_18);
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
    // InternalFoo.g:1734:1: rule__Assembly__Group__8__Impl : ( ( rule__Assembly__BindingsAssignment_8 )* ) ;
    public final void rule__Assembly__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1738:1: ( ( ( rule__Assembly__BindingsAssignment_8 )* ) )
            // InternalFoo.g:1739:1: ( ( rule__Assembly__BindingsAssignment_8 )* )
            {
            // InternalFoo.g:1739:1: ( ( rule__Assembly__BindingsAssignment_8 )* )
            // InternalFoo.g:1740:2: ( rule__Assembly__BindingsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getBindingsAssignment_8()); 
            }
            // InternalFoo.g:1741:2: ( rule__Assembly__BindingsAssignment_8 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalFoo.g:1741:3: rule__Assembly__BindingsAssignment_8
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Assembly__BindingsAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalFoo.g:1749:1: rule__Assembly__Group__9 : rule__Assembly__Group__9__Impl ;
    public final void rule__Assembly__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1753:1: ( rule__Assembly__Group__9__Impl )
            // InternalFoo.g:1754:2: rule__Assembly__Group__9__Impl
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
    // InternalFoo.g:1760:1: rule__Assembly__Group__9__Impl : ( '}' ) ;
    public final void rule__Assembly__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1764:1: ( ( '}' ) )
            // InternalFoo.g:1765:1: ( '}' )
            {
            // InternalFoo.g:1765:1: ( '}' )
            // InternalFoo.g:1766:2: '}'
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
    // InternalFoo.g:1776:1: rule__ComponentInstance__Group__0 : rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 ;
    public final void rule__ComponentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1780:1: ( rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 )
            // InternalFoo.g:1781:2: rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalFoo.g:1788:1: rule__ComponentInstance__Group__0__Impl : ( ( rule__ComponentInstance__NameAssignment_0 ) ) ;
    public final void rule__ComponentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1792:1: ( ( ( rule__ComponentInstance__NameAssignment_0 ) ) )
            // InternalFoo.g:1793:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            {
            // InternalFoo.g:1793:1: ( ( rule__ComponentInstance__NameAssignment_0 ) )
            // InternalFoo.g:1794:2: ( rule__ComponentInstance__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentInstanceAccess().getNameAssignment_0()); 
            }
            // InternalFoo.g:1795:2: ( rule__ComponentInstance__NameAssignment_0 )
            // InternalFoo.g:1795:3: rule__ComponentInstance__NameAssignment_0
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
    // InternalFoo.g:1803:1: rule__ComponentInstance__Group__1 : rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 ;
    public final void rule__ComponentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1807:1: ( rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 )
            // InternalFoo.g:1808:2: rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2
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
    // InternalFoo.g:1815:1: rule__ComponentInstance__Group__1__Impl : ( ':' ) ;
    public final void rule__ComponentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1819:1: ( ( ':' ) )
            // InternalFoo.g:1820:1: ( ':' )
            {
            // InternalFoo.g:1820:1: ( ':' )
            // InternalFoo.g:1821:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentInstanceAccess().getColonKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:1830:1: rule__ComponentInstance__Group__2 : rule__ComponentInstance__Group__2__Impl ;
    public final void rule__ComponentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1834:1: ( rule__ComponentInstance__Group__2__Impl )
            // InternalFoo.g:1835:2: rule__ComponentInstance__Group__2__Impl
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
    // InternalFoo.g:1841:1: rule__ComponentInstance__Group__2__Impl : ( ( rule__ComponentInstance__ComponentAssignment_2 ) ) ;
    public final void rule__ComponentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1845:1: ( ( ( rule__ComponentInstance__ComponentAssignment_2 ) ) )
            // InternalFoo.g:1846:1: ( ( rule__ComponentInstance__ComponentAssignment_2 ) )
            {
            // InternalFoo.g:1846:1: ( ( rule__ComponentInstance__ComponentAssignment_2 ) )
            // InternalFoo.g:1847:2: ( rule__ComponentInstance__ComponentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentInstanceAccess().getComponentAssignment_2()); 
            }
            // InternalFoo.g:1848:2: ( rule__ComponentInstance__ComponentAssignment_2 )
            // InternalFoo.g:1848:3: rule__ComponentInstance__ComponentAssignment_2
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
    // InternalFoo.g:1857:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1861:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalFoo.g:1862:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFoo.g:1869:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__BindingRequiredAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1873:1: ( ( ( rule__Binding__BindingRequiredAssignment_0 ) ) )
            // InternalFoo.g:1874:1: ( ( rule__Binding__BindingRequiredAssignment_0 ) )
            {
            // InternalFoo.g:1874:1: ( ( rule__Binding__BindingRequiredAssignment_0 ) )
            // InternalFoo.g:1875:2: ( rule__Binding__BindingRequiredAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getBindingRequiredAssignment_0()); 
            }
            // InternalFoo.g:1876:2: ( rule__Binding__BindingRequiredAssignment_0 )
            // InternalFoo.g:1876:3: rule__Binding__BindingRequiredAssignment_0
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
    // InternalFoo.g:1884:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1888:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalFoo.g:1889:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
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
    // InternalFoo.g:1896:1: rule__Binding__Group__1__Impl : ( '-' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1900:1: ( ( '-' ) )
            // InternalFoo.g:1901:1: ( '-' )
            {
            // InternalFoo.g:1901:1: ( '-' )
            // InternalFoo.g:1902:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getHyphenMinusKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:1911:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1915:1: ( rule__Binding__Group__2__Impl )
            // InternalFoo.g:1916:2: rule__Binding__Group__2__Impl
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
    // InternalFoo.g:1922:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__BindingProvidedAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1926:1: ( ( ( rule__Binding__BindingProvidedAssignment_2 ) ) )
            // InternalFoo.g:1927:1: ( ( rule__Binding__BindingProvidedAssignment_2 ) )
            {
            // InternalFoo.g:1927:1: ( ( rule__Binding__BindingProvidedAssignment_2 ) )
            // InternalFoo.g:1928:2: ( rule__Binding__BindingProvidedAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getBindingProvidedAssignment_2()); 
            }
            // InternalFoo.g:1929:2: ( rule__Binding__BindingProvidedAssignment_2 )
            // InternalFoo.g:1929:3: rule__Binding__BindingProvidedAssignment_2
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
    // InternalFoo.g:1938:1: rule__BindingRequired__Group__0 : rule__BindingRequired__Group__0__Impl rule__BindingRequired__Group__1 ;
    public final void rule__BindingRequired__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1942:1: ( rule__BindingRequired__Group__0__Impl rule__BindingRequired__Group__1 )
            // InternalFoo.g:1943:2: rule__BindingRequired__Group__0__Impl rule__BindingRequired__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalFoo.g:1950:1: rule__BindingRequired__Group__0__Impl : ( ( rule__BindingRequired__NameAssignment_0 ) ) ;
    public final void rule__BindingRequired__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1954:1: ( ( ( rule__BindingRequired__NameAssignment_0 ) ) )
            // InternalFoo.g:1955:1: ( ( rule__BindingRequired__NameAssignment_0 ) )
            {
            // InternalFoo.g:1955:1: ( ( rule__BindingRequired__NameAssignment_0 ) )
            // InternalFoo.g:1956:2: ( rule__BindingRequired__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRequiredAccess().getNameAssignment_0()); 
            }
            // InternalFoo.g:1957:2: ( rule__BindingRequired__NameAssignment_0 )
            // InternalFoo.g:1957:3: rule__BindingRequired__NameAssignment_0
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
    // InternalFoo.g:1965:1: rule__BindingRequired__Group__1 : rule__BindingRequired__Group__1__Impl rule__BindingRequired__Group__2 ;
    public final void rule__BindingRequired__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1969:1: ( rule__BindingRequired__Group__1__Impl rule__BindingRequired__Group__2 )
            // InternalFoo.g:1970:2: rule__BindingRequired__Group__1__Impl rule__BindingRequired__Group__2
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
    // InternalFoo.g:1977:1: rule__BindingRequired__Group__1__Impl : ( '.' ) ;
    public final void rule__BindingRequired__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1981:1: ( ( '.' ) )
            // InternalFoo.g:1982:1: ( '.' )
            {
            // InternalFoo.g:1982:1: ( '.' )
            // InternalFoo.g:1983:2: '.'
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
    // InternalFoo.g:1992:1: rule__BindingRequired__Group__2 : rule__BindingRequired__Group__2__Impl ;
    public final void rule__BindingRequired__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:1996:1: ( rule__BindingRequired__Group__2__Impl )
            // InternalFoo.g:1997:2: rule__BindingRequired__Group__2__Impl
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
    // InternalFoo.g:2003:1: rule__BindingRequired__Group__2__Impl : ( ( rule__BindingRequired__ServiceAssignment_2 ) ) ;
    public final void rule__BindingRequired__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2007:1: ( ( ( rule__BindingRequired__ServiceAssignment_2 ) ) )
            // InternalFoo.g:2008:1: ( ( rule__BindingRequired__ServiceAssignment_2 ) )
            {
            // InternalFoo.g:2008:1: ( ( rule__BindingRequired__ServiceAssignment_2 ) )
            // InternalFoo.g:2009:2: ( rule__BindingRequired__ServiceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRequiredAccess().getServiceAssignment_2()); 
            }
            // InternalFoo.g:2010:2: ( rule__BindingRequired__ServiceAssignment_2 )
            // InternalFoo.g:2010:3: rule__BindingRequired__ServiceAssignment_2
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
    // InternalFoo.g:2019:1: rule__BindingProvided__Group__0 : rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1 ;
    public final void rule__BindingProvided__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2023:1: ( rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1 )
            // InternalFoo.g:2024:2: rule__BindingProvided__Group__0__Impl rule__BindingProvided__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalFoo.g:2031:1: rule__BindingProvided__Group__0__Impl : ( ( rule__BindingProvided__NameAssignment_0 ) ) ;
    public final void rule__BindingProvided__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2035:1: ( ( ( rule__BindingProvided__NameAssignment_0 ) ) )
            // InternalFoo.g:2036:1: ( ( rule__BindingProvided__NameAssignment_0 ) )
            {
            // InternalFoo.g:2036:1: ( ( rule__BindingProvided__NameAssignment_0 ) )
            // InternalFoo.g:2037:2: ( rule__BindingProvided__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingProvidedAccess().getNameAssignment_0()); 
            }
            // InternalFoo.g:2038:2: ( rule__BindingProvided__NameAssignment_0 )
            // InternalFoo.g:2038:3: rule__BindingProvided__NameAssignment_0
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
    // InternalFoo.g:2046:1: rule__BindingProvided__Group__1 : rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2 ;
    public final void rule__BindingProvided__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2050:1: ( rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2 )
            // InternalFoo.g:2051:2: rule__BindingProvided__Group__1__Impl rule__BindingProvided__Group__2
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
    // InternalFoo.g:2058:1: rule__BindingProvided__Group__1__Impl : ( '.' ) ;
    public final void rule__BindingProvided__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2062:1: ( ( '.' ) )
            // InternalFoo.g:2063:1: ( '.' )
            {
            // InternalFoo.g:2063:1: ( '.' )
            // InternalFoo.g:2064:2: '.'
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
    // InternalFoo.g:2073:1: rule__BindingProvided__Group__2 : rule__BindingProvided__Group__2__Impl ;
    public final void rule__BindingProvided__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2077:1: ( rule__BindingProvided__Group__2__Impl )
            // InternalFoo.g:2078:2: rule__BindingProvided__Group__2__Impl
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
    // InternalFoo.g:2084:1: rule__BindingProvided__Group__2__Impl : ( ( rule__BindingProvided__ServiceAssignment_2 ) ) ;
    public final void rule__BindingProvided__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2088:1: ( ( ( rule__BindingProvided__ServiceAssignment_2 ) ) )
            // InternalFoo.g:2089:1: ( ( rule__BindingProvided__ServiceAssignment_2 ) )
            {
            // InternalFoo.g:2089:1: ( ( rule__BindingProvided__ServiceAssignment_2 ) )
            // InternalFoo.g:2090:2: ( rule__BindingProvided__ServiceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingProvidedAccess().getServiceAssignment_2()); 
            }
            // InternalFoo.g:2091:2: ( rule__BindingProvided__ServiceAssignment_2 )
            // InternalFoo.g:2091:3: rule__BindingProvided__ServiceAssignment_2
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
    // InternalFoo.g:2100:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2104:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalFoo.g:2105:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalFoo.g:2112:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2116:1: ( ( 'Component' ) )
            // InternalFoo.g:2117:1: ( 'Component' )
            {
            // InternalFoo.g:2117:1: ( 'Component' )
            // InternalFoo.g:2118:2: 'Component'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:2127:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2131:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalFoo.g:2132:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalFoo.g:2139:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2143:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalFoo.g:2144:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalFoo.g:2144:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalFoo.g:2145:2: ( rule__Component__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            }
            // InternalFoo.g:2146:2: ( rule__Component__NameAssignment_1 )
            // InternalFoo.g:2146:3: rule__Component__NameAssignment_1
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
    // InternalFoo.g:2154:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2158:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalFoo.g:2159:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalFoo.g:2166:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2170:1: ( ( '{' ) )
            // InternalFoo.g:2171:1: ( '{' )
            {
            // InternalFoo.g:2171:1: ( '{' )
            // InternalFoo.g:2172:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
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
    // InternalFoo.g:2181:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2185:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalFoo.g:2186:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalFoo.g:2193:1: rule__Component__Group__3__Impl : ( ( rule__Component__ListOfPServicesAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2197:1: ( ( ( rule__Component__ListOfPServicesAssignment_3 ) ) )
            // InternalFoo.g:2198:1: ( ( rule__Component__ListOfPServicesAssignment_3 ) )
            {
            // InternalFoo.g:2198:1: ( ( rule__Component__ListOfPServicesAssignment_3 ) )
            // InternalFoo.g:2199:2: ( rule__Component__ListOfPServicesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getListOfPServicesAssignment_3()); 
            }
            // InternalFoo.g:2200:2: ( rule__Component__ListOfPServicesAssignment_3 )
            // InternalFoo.g:2200:3: rule__Component__ListOfPServicesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Component__ListOfPServicesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getListOfPServicesAssignment_3()); 
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
    // InternalFoo.g:2208:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2212:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalFoo.g:2213:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalFoo.g:2220:1: rule__Component__Group__4__Impl : ( ( rule__Component__ListOfRServicesAssignment_4 ) ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2224:1: ( ( ( rule__Component__ListOfRServicesAssignment_4 ) ) )
            // InternalFoo.g:2225:1: ( ( rule__Component__ListOfRServicesAssignment_4 ) )
            {
            // InternalFoo.g:2225:1: ( ( rule__Component__ListOfRServicesAssignment_4 ) )
            // InternalFoo.g:2226:2: ( rule__Component__ListOfRServicesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getListOfRServicesAssignment_4()); 
            }
            // InternalFoo.g:2227:2: ( rule__Component__ListOfRServicesAssignment_4 )
            // InternalFoo.g:2227:3: rule__Component__ListOfRServicesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Component__ListOfRServicesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getListOfRServicesAssignment_4()); 
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
    // InternalFoo.g:2235:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2239:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalFoo.g:2240:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalFoo.g:2247:1: rule__Component__Group__5__Impl : ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2251:1: ( ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) ) )
            // InternalFoo.g:2252:1: ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) )
            {
            // InternalFoo.g:2252:1: ( ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* ) )
            // InternalFoo.g:2253:2: ( ( rule__Component__MProvServicesAssignment_5 ) ) ( ( rule__Component__MProvServicesAssignment_5 )* )
            {
            // InternalFoo.g:2253:2: ( ( rule__Component__MProvServicesAssignment_5 ) )
            // InternalFoo.g:2254:3: ( rule__Component__MProvServicesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getMProvServicesAssignment_5()); 
            }
            // InternalFoo.g:2255:3: ( rule__Component__MProvServicesAssignment_5 )
            // InternalFoo.g:2255:4: rule__Component__MProvServicesAssignment_5
            {
            pushFollow(FOLLOW_25);
            rule__Component__MProvServicesAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getMProvServicesAssignment_5()); 
            }

            }

            // InternalFoo.g:2258:2: ( ( rule__Component__MProvServicesAssignment_5 )* )
            // InternalFoo.g:2259:3: ( rule__Component__MProvServicesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getMProvServicesAssignment_5()); 
            }
            // InternalFoo.g:2260:3: ( rule__Component__MProvServicesAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==33) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalFoo.g:2260:4: rule__Component__MProvServicesAssignment_5
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Component__MProvServicesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getMProvServicesAssignment_5()); 
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
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // InternalFoo.g:2269:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2273:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalFoo.g:2274:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalFoo.g:2281:1: rule__Component__Group__6__Impl : ( ( rule__Component__MReqServicesAssignment_6 )* ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2285:1: ( ( ( rule__Component__MReqServicesAssignment_6 )* ) )
            // InternalFoo.g:2286:1: ( ( rule__Component__MReqServicesAssignment_6 )* )
            {
            // InternalFoo.g:2286:1: ( ( rule__Component__MReqServicesAssignment_6 )* )
            // InternalFoo.g:2287:2: ( rule__Component__MReqServicesAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getMReqServicesAssignment_6()); 
            }
            // InternalFoo.g:2288:2: ( rule__Component__MReqServicesAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFoo.g:2288:3: rule__Component__MReqServicesAssignment_6
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Component__MReqServicesAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getMReqServicesAssignment_6()); 
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
    // InternalFoo.g:2296:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2300:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalFoo.g:2301:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalFoo.g:2308:1: rule__Component__Group__7__Impl : ( ( rule__Component__Group_7__0 )* ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2312:1: ( ( ( rule__Component__Group_7__0 )* ) )
            // InternalFoo.g:2313:1: ( ( rule__Component__Group_7__0 )* )
            {
            // InternalFoo.g:2313:1: ( ( rule__Component__Group_7__0 )* )
            // InternalFoo.g:2314:2: ( rule__Component__Group_7__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_7()); 
            }
            // InternalFoo.g:2315:2: ( rule__Component__Group_7__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalFoo.g:2315:3: rule__Component__Group_7__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Component__Group_7__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_7()); 
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
    // InternalFoo.g:2323:1: rule__Component__Group__8 : rule__Component__Group__8__Impl ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2327:1: ( rule__Component__Group__8__Impl )
            // InternalFoo.g:2328:2: rule__Component__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__8__Impl();

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
    // InternalFoo.g:2334:1: rule__Component__Group__8__Impl : ( '}' ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2338:1: ( ( '}' ) )
            // InternalFoo.g:2339:1: ( '}' )
            {
            // InternalFoo.g:2339:1: ( '}' )
            // InternalFoo.g:2340:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8()); 
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


    // $ANTLR start "rule__Component__Group_7__0"
    // InternalFoo.g:2350:1: rule__Component__Group_7__0 : rule__Component__Group_7__0__Impl rule__Component__Group_7__1 ;
    public final void rule__Component__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2354:1: ( rule__Component__Group_7__0__Impl rule__Component__Group_7__1 )
            // InternalFoo.g:2355:2: rule__Component__Group_7__0__Impl rule__Component__Group_7__1
            {
            pushFollow(FOLLOW_27);
            rule__Component__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_7__1();

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
    // $ANTLR end "rule__Component__Group_7__0"


    // $ANTLR start "rule__Component__Group_7__0__Impl"
    // InternalFoo.g:2362:1: rule__Component__Group_7__0__Impl : ( ( rule__Component__Group_7_0__0 )? ) ;
    public final void rule__Component__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2366:1: ( ( ( rule__Component__Group_7_0__0 )? ) )
            // InternalFoo.g:2367:1: ( ( rule__Component__Group_7_0__0 )? )
            {
            // InternalFoo.g:2367:1: ( ( rule__Component__Group_7_0__0 )? )
            // InternalFoo.g:2368:2: ( rule__Component__Group_7_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_7_0()); 
            }
            // InternalFoo.g:2369:2: ( rule__Component__Group_7_0__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFoo.g:2369:3: rule__Component__Group_7_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_7_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_7_0()); 
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
    // $ANTLR end "rule__Component__Group_7__0__Impl"


    // $ANTLR start "rule__Component__Group_7__1"
    // InternalFoo.g:2377:1: rule__Component__Group_7__1 : rule__Component__Group_7__1__Impl ;
    public final void rule__Component__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2381:1: ( rule__Component__Group_7__1__Impl )
            // InternalFoo.g:2382:2: rule__Component__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_7__1__Impl();

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
    // $ANTLR end "rule__Component__Group_7__1"


    // $ANTLR start "rule__Component__Group_7__1__Impl"
    // InternalFoo.g:2388:1: rule__Component__Group_7__1__Impl : ( ( rule__Component__AssembliesAssignment_7_1 ) ) ;
    public final void rule__Component__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2392:1: ( ( ( rule__Component__AssembliesAssignment_7_1 ) ) )
            // InternalFoo.g:2393:1: ( ( rule__Component__AssembliesAssignment_7_1 ) )
            {
            // InternalFoo.g:2393:1: ( ( rule__Component__AssembliesAssignment_7_1 ) )
            // InternalFoo.g:2394:2: ( rule__Component__AssembliesAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getAssembliesAssignment_7_1()); 
            }
            // InternalFoo.g:2395:2: ( rule__Component__AssembliesAssignment_7_1 )
            // InternalFoo.g:2395:3: rule__Component__AssembliesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__AssembliesAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getAssembliesAssignment_7_1()); 
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
    // $ANTLR end "rule__Component__Group_7__1__Impl"


    // $ANTLR start "rule__Component__Group_7_0__0"
    // InternalFoo.g:2404:1: rule__Component__Group_7_0__0 : rule__Component__Group_7_0__0__Impl rule__Component__Group_7_0__1 ;
    public final void rule__Component__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2408:1: ( rule__Component__Group_7_0__0__Impl rule__Component__Group_7_0__1 )
            // InternalFoo.g:2409:2: rule__Component__Group_7_0__0__Impl rule__Component__Group_7_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group_7_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_7_0__1();

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
    // $ANTLR end "rule__Component__Group_7_0__0"


    // $ANTLR start "rule__Component__Group_7_0__0__Impl"
    // InternalFoo.g:2416:1: rule__Component__Group_7_0__0__Impl : ( 'assembly' ) ;
    public final void rule__Component__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2420:1: ( ( 'assembly' ) )
            // InternalFoo.g:2421:1: ( 'assembly' )
            {
            // InternalFoo.g:2421:1: ( 'assembly' )
            // InternalFoo.g:2422:2: 'assembly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getAssemblyKeyword_7_0_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getAssemblyKeyword_7_0_0()); 
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
    // $ANTLR end "rule__Component__Group_7_0__0__Impl"


    // $ANTLR start "rule__Component__Group_7_0__1"
    // InternalFoo.g:2431:1: rule__Component__Group_7_0__1 : rule__Component__Group_7_0__1__Impl ;
    public final void rule__Component__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2435:1: ( rule__Component__Group_7_0__1__Impl )
            // InternalFoo.g:2436:2: rule__Component__Group_7_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_7_0__1__Impl();

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
    // $ANTLR end "rule__Component__Group_7_0__1"


    // $ANTLR start "rule__Component__Group_7_0__1__Impl"
    // InternalFoo.g:2442:1: rule__Component__Group_7_0__1__Impl : ( ':' ) ;
    public final void rule__Component__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2446:1: ( ( ':' ) )
            // InternalFoo.g:2447:1: ( ':' )
            {
            // InternalFoo.g:2447:1: ( ':' )
            // InternalFoo.g:2448:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getColonKeyword_7_0_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getColonKeyword_7_0_1()); 
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
    // $ANTLR end "rule__Component__Group_7_0__1__Impl"


    // $ANTLR start "rule__ListOfProvidedServices__Group__0"
    // InternalFoo.g:2458:1: rule__ListOfProvidedServices__Group__0 : rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1 ;
    public final void rule__ListOfProvidedServices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2462:1: ( rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1 )
            // InternalFoo.g:2463:2: rule__ListOfProvidedServices__Group__0__Impl rule__ListOfProvidedServices__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalFoo.g:2470:1: rule__ListOfProvidedServices__Group__0__Impl : ( 'provided' ) ;
    public final void rule__ListOfProvidedServices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2474:1: ( ( 'provided' ) )
            // InternalFoo.g:2475:1: ( 'provided' )
            {
            // InternalFoo.g:2475:1: ( 'provided' )
            // InternalFoo.g:2476:2: 'provided'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getProvidedKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:2485:1: rule__ListOfProvidedServices__Group__1 : rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2 ;
    public final void rule__ListOfProvidedServices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2489:1: ( rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2 )
            // InternalFoo.g:2490:2: rule__ListOfProvidedServices__Group__1__Impl rule__ListOfProvidedServices__Group__2
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
    // InternalFoo.g:2497:1: rule__ListOfProvidedServices__Group__1__Impl : ( '=' ) ;
    public final void rule__ListOfProvidedServices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2501:1: ( ( '=' ) )
            // InternalFoo.g:2502:1: ( '=' )
            {
            // InternalFoo.g:2502:1: ( '=' )
            // InternalFoo.g:2503:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getEqualsSignKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:2512:1: rule__ListOfProvidedServices__Group__2 : rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3 ;
    public final void rule__ListOfProvidedServices__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2516:1: ( rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3 )
            // InternalFoo.g:2517:2: rule__ListOfProvidedServices__Group__2__Impl rule__ListOfProvidedServices__Group__3
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
    // InternalFoo.g:2524:1: rule__ListOfProvidedServices__Group__2__Impl : ( '{' ) ;
    public final void rule__ListOfProvidedServices__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2528:1: ( ( '{' ) )
            // InternalFoo.g:2529:1: ( '{' )
            {
            // InternalFoo.g:2529:1: ( '{' )
            // InternalFoo.g:2530:2: '{'
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
    // InternalFoo.g:2539:1: rule__ListOfProvidedServices__Group__3 : rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4 ;
    public final void rule__ListOfProvidedServices__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2543:1: ( rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4 )
            // InternalFoo.g:2544:2: rule__ListOfProvidedServices__Group__3__Impl rule__ListOfProvidedServices__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalFoo.g:2551:1: rule__ListOfProvidedServices__Group__3__Impl : ( ( rule__ListOfProvidedServices__Group_3__0 ) ) ;
    public final void rule__ListOfProvidedServices__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2555:1: ( ( ( rule__ListOfProvidedServices__Group_3__0 ) ) )
            // InternalFoo.g:2556:1: ( ( rule__ListOfProvidedServices__Group_3__0 ) )
            {
            // InternalFoo.g:2556:1: ( ( rule__ListOfProvidedServices__Group_3__0 ) )
            // InternalFoo.g:2557:2: ( rule__ListOfProvidedServices__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getGroup_3()); 
            }
            // InternalFoo.g:2558:2: ( rule__ListOfProvidedServices__Group_3__0 )
            // InternalFoo.g:2558:3: rule__ListOfProvidedServices__Group_3__0
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
    // InternalFoo.g:2566:1: rule__ListOfProvidedServices__Group__4 : rule__ListOfProvidedServices__Group__4__Impl ;
    public final void rule__ListOfProvidedServices__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2570:1: ( rule__ListOfProvidedServices__Group__4__Impl )
            // InternalFoo.g:2571:2: rule__ListOfProvidedServices__Group__4__Impl
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
    // InternalFoo.g:2577:1: rule__ListOfProvidedServices__Group__4__Impl : ( '}' ) ;
    public final void rule__ListOfProvidedServices__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2581:1: ( ( '}' ) )
            // InternalFoo.g:2582:1: ( '}' )
            {
            // InternalFoo.g:2582:1: ( '}' )
            // InternalFoo.g:2583:2: '}'
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
    // InternalFoo.g:2593:1: rule__ListOfProvidedServices__Group_3__0 : rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1 ;
    public final void rule__ListOfProvidedServices__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2597:1: ( rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1 )
            // InternalFoo.g:2598:2: rule__ListOfProvidedServices__Group_3__0__Impl rule__ListOfProvidedServices__Group_3__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalFoo.g:2605:1: rule__ListOfProvidedServices__Group_3__0__Impl : ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) ) ;
    public final void rule__ListOfProvidedServices__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2609:1: ( ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) ) )
            // InternalFoo.g:2610:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) )
            {
            // InternalFoo.g:2610:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 ) )
            // InternalFoo.g:2611:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_0()); 
            }
            // InternalFoo.g:2612:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 )
            // InternalFoo.g:2612:3: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0
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
    // InternalFoo.g:2620:1: rule__ListOfProvidedServices__Group_3__1 : rule__ListOfProvidedServices__Group_3__1__Impl ;
    public final void rule__ListOfProvidedServices__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2624:1: ( rule__ListOfProvidedServices__Group_3__1__Impl )
            // InternalFoo.g:2625:2: rule__ListOfProvidedServices__Group_3__1__Impl
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
    // InternalFoo.g:2631:1: rule__ListOfProvidedServices__Group_3__1__Impl : ( ( rule__ListOfProvidedServices__Group_3_1__0 )* ) ;
    public final void rule__ListOfProvidedServices__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2635:1: ( ( ( rule__ListOfProvidedServices__Group_3_1__0 )* ) )
            // InternalFoo.g:2636:1: ( ( rule__ListOfProvidedServices__Group_3_1__0 )* )
            {
            // InternalFoo.g:2636:1: ( ( rule__ListOfProvidedServices__Group_3_1__0 )* )
            // InternalFoo.g:2637:2: ( rule__ListOfProvidedServices__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getGroup_3_1()); 
            }
            // InternalFoo.g:2638:2: ( rule__ListOfProvidedServices__Group_3_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalFoo.g:2638:3: rule__ListOfProvidedServices__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_31);
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
    // InternalFoo.g:2647:1: rule__ListOfProvidedServices__Group_3_1__0 : rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1 ;
    public final void rule__ListOfProvidedServices__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2651:1: ( rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1 )
            // InternalFoo.g:2652:2: rule__ListOfProvidedServices__Group_3_1__0__Impl rule__ListOfProvidedServices__Group_3_1__1
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
    // InternalFoo.g:2659:1: rule__ListOfProvidedServices__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfProvidedServices__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2663:1: ( ( ',' ) )
            // InternalFoo.g:2664:1: ( ',' )
            {
            // InternalFoo.g:2664:1: ( ',' )
            // InternalFoo.g:2665:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:2674:1: rule__ListOfProvidedServices__Group_3_1__1 : rule__ListOfProvidedServices__Group_3_1__1__Impl ;
    public final void rule__ListOfProvidedServices__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2678:1: ( rule__ListOfProvidedServices__Group_3_1__1__Impl )
            // InternalFoo.g:2679:2: rule__ListOfProvidedServices__Group_3_1__1__Impl
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
    // InternalFoo.g:2685:1: rule__ListOfProvidedServices__Group_3_1__1__Impl : ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) ) ;
    public final void rule__ListOfProvidedServices__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2689:1: ( ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) ) )
            // InternalFoo.g:2690:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) )
            {
            // InternalFoo.g:2690:1: ( ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 ) )
            // InternalFoo.g:2691:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesAssignment_3_1_1()); 
            }
            // InternalFoo.g:2692:2: ( rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 )
            // InternalFoo.g:2692:3: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1
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
    // InternalFoo.g:2701:1: rule__ListOfrequiredServices__Group__0 : rule__ListOfrequiredServices__Group__0__Impl rule__ListOfrequiredServices__Group__1 ;
    public final void rule__ListOfrequiredServices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2705:1: ( rule__ListOfrequiredServices__Group__0__Impl rule__ListOfrequiredServices__Group__1 )
            // InternalFoo.g:2706:2: rule__ListOfrequiredServices__Group__0__Impl rule__ListOfrequiredServices__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalFoo.g:2713:1: rule__ListOfrequiredServices__Group__0__Impl : ( () ) ;
    public final void rule__ListOfrequiredServices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2717:1: ( ( () ) )
            // InternalFoo.g:2718:1: ( () )
            {
            // InternalFoo.g:2718:1: ( () )
            // InternalFoo.g:2719:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getListOfrequiredServicesAction_0()); 
            }
            // InternalFoo.g:2720:2: ()
            // InternalFoo.g:2720:3: 
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
    // InternalFoo.g:2728:1: rule__ListOfrequiredServices__Group__1 : rule__ListOfrequiredServices__Group__1__Impl rule__ListOfrequiredServices__Group__2 ;
    public final void rule__ListOfrequiredServices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2732:1: ( rule__ListOfrequiredServices__Group__1__Impl rule__ListOfrequiredServices__Group__2 )
            // InternalFoo.g:2733:2: rule__ListOfrequiredServices__Group__1__Impl rule__ListOfrequiredServices__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalFoo.g:2740:1: rule__ListOfrequiredServices__Group__1__Impl : ( 'required' ) ;
    public final void rule__ListOfrequiredServices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2744:1: ( ( 'required' ) )
            // InternalFoo.g:2745:1: ( 'required' )
            {
            // InternalFoo.g:2745:1: ( 'required' )
            // InternalFoo.g:2746:2: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getRequiredKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:2755:1: rule__ListOfrequiredServices__Group__2 : rule__ListOfrequiredServices__Group__2__Impl rule__ListOfrequiredServices__Group__3 ;
    public final void rule__ListOfrequiredServices__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2759:1: ( rule__ListOfrequiredServices__Group__2__Impl rule__ListOfrequiredServices__Group__3 )
            // InternalFoo.g:2760:2: rule__ListOfrequiredServices__Group__2__Impl rule__ListOfrequiredServices__Group__3
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
    // InternalFoo.g:2767:1: rule__ListOfrequiredServices__Group__2__Impl : ( '=' ) ;
    public final void rule__ListOfrequiredServices__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2771:1: ( ( '=' ) )
            // InternalFoo.g:2772:1: ( '=' )
            {
            // InternalFoo.g:2772:1: ( '=' )
            // InternalFoo.g:2773:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getEqualsSignKeyword_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:2782:1: rule__ListOfrequiredServices__Group__3 : rule__ListOfrequiredServices__Group__3__Impl rule__ListOfrequiredServices__Group__4 ;
    public final void rule__ListOfrequiredServices__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2786:1: ( rule__ListOfrequiredServices__Group__3__Impl rule__ListOfrequiredServices__Group__4 )
            // InternalFoo.g:2787:2: rule__ListOfrequiredServices__Group__3__Impl rule__ListOfrequiredServices__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalFoo.g:2794:1: rule__ListOfrequiredServices__Group__3__Impl : ( '{' ) ;
    public final void rule__ListOfrequiredServices__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2798:1: ( ( '{' ) )
            // InternalFoo.g:2799:1: ( '{' )
            {
            // InternalFoo.g:2799:1: ( '{' )
            // InternalFoo.g:2800:2: '{'
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
    // InternalFoo.g:2809:1: rule__ListOfrequiredServices__Group__4 : rule__ListOfrequiredServices__Group__4__Impl rule__ListOfrequiredServices__Group__5 ;
    public final void rule__ListOfrequiredServices__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2813:1: ( rule__ListOfrequiredServices__Group__4__Impl rule__ListOfrequiredServices__Group__5 )
            // InternalFoo.g:2814:2: rule__ListOfrequiredServices__Group__4__Impl rule__ListOfrequiredServices__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalFoo.g:2821:1: rule__ListOfrequiredServices__Group__4__Impl : ( ( rule__ListOfrequiredServices__Group_4__0 ) ) ;
    public final void rule__ListOfrequiredServices__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2825:1: ( ( ( rule__ListOfrequiredServices__Group_4__0 ) ) )
            // InternalFoo.g:2826:1: ( ( rule__ListOfrequiredServices__Group_4__0 ) )
            {
            // InternalFoo.g:2826:1: ( ( rule__ListOfrequiredServices__Group_4__0 ) )
            // InternalFoo.g:2827:2: ( rule__ListOfrequiredServices__Group_4__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getGroup_4()); 
            }
            // InternalFoo.g:2828:2: ( rule__ListOfrequiredServices__Group_4__0 )
            // InternalFoo.g:2828:3: rule__ListOfrequiredServices__Group_4__0
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
    // InternalFoo.g:2836:1: rule__ListOfrequiredServices__Group__5 : rule__ListOfrequiredServices__Group__5__Impl ;
    public final void rule__ListOfrequiredServices__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2840:1: ( rule__ListOfrequiredServices__Group__5__Impl )
            // InternalFoo.g:2841:2: rule__ListOfrequiredServices__Group__5__Impl
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
    // InternalFoo.g:2847:1: rule__ListOfrequiredServices__Group__5__Impl : ( '}' ) ;
    public final void rule__ListOfrequiredServices__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2851:1: ( ( '}' ) )
            // InternalFoo.g:2852:1: ( '}' )
            {
            // InternalFoo.g:2852:1: ( '}' )
            // InternalFoo.g:2853:2: '}'
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
    // InternalFoo.g:2863:1: rule__ListOfrequiredServices__Group_4__0 : rule__ListOfrequiredServices__Group_4__0__Impl rule__ListOfrequiredServices__Group_4__1 ;
    public final void rule__ListOfrequiredServices__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2867:1: ( rule__ListOfrequiredServices__Group_4__0__Impl rule__ListOfrequiredServices__Group_4__1 )
            // InternalFoo.g:2868:2: rule__ListOfrequiredServices__Group_4__0__Impl rule__ListOfrequiredServices__Group_4__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalFoo.g:2875:1: rule__ListOfrequiredServices__Group_4__0__Impl : ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? ) ;
    public final void rule__ListOfrequiredServices__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2879:1: ( ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? ) )
            // InternalFoo.g:2880:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? )
            {
            // InternalFoo.g:2880:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )? )
            // InternalFoo.g:2881:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesAssignment_4_0()); 
            }
            // InternalFoo.g:2882:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFoo.g:2882:3: rule__ListOfrequiredServices__RequiredServicesAssignment_4_0
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
    // InternalFoo.g:2890:1: rule__ListOfrequiredServices__Group_4__1 : rule__ListOfrequiredServices__Group_4__1__Impl ;
    public final void rule__ListOfrequiredServices__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2894:1: ( rule__ListOfrequiredServices__Group_4__1__Impl )
            // InternalFoo.g:2895:2: rule__ListOfrequiredServices__Group_4__1__Impl
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
    // InternalFoo.g:2901:1: rule__ListOfrequiredServices__Group_4__1__Impl : ( ( rule__ListOfrequiredServices__Group_4_1__0 )* ) ;
    public final void rule__ListOfrequiredServices__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2905:1: ( ( ( rule__ListOfrequiredServices__Group_4_1__0 )* ) )
            // InternalFoo.g:2906:1: ( ( rule__ListOfrequiredServices__Group_4_1__0 )* )
            {
            // InternalFoo.g:2906:1: ( ( rule__ListOfrequiredServices__Group_4_1__0 )* )
            // InternalFoo.g:2907:2: ( rule__ListOfrequiredServices__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getGroup_4_1()); 
            }
            // InternalFoo.g:2908:2: ( rule__ListOfrequiredServices__Group_4_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalFoo.g:2908:3: rule__ListOfrequiredServices__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_31);
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
    // InternalFoo.g:2917:1: rule__ListOfrequiredServices__Group_4_1__0 : rule__ListOfrequiredServices__Group_4_1__0__Impl rule__ListOfrequiredServices__Group_4_1__1 ;
    public final void rule__ListOfrequiredServices__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2921:1: ( rule__ListOfrequiredServices__Group_4_1__0__Impl rule__ListOfrequiredServices__Group_4_1__1 )
            // InternalFoo.g:2922:2: rule__ListOfrequiredServices__Group_4_1__0__Impl rule__ListOfrequiredServices__Group_4_1__1
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
    // InternalFoo.g:2929:1: rule__ListOfrequiredServices__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ListOfrequiredServices__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2933:1: ( ( ',' ) )
            // InternalFoo.g:2934:1: ( ',' )
            {
            // InternalFoo.g:2934:1: ( ',' )
            // InternalFoo.g:2935:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:2944:1: rule__ListOfrequiredServices__Group_4_1__1 : rule__ListOfrequiredServices__Group_4_1__1__Impl ;
    public final void rule__ListOfrequiredServices__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2948:1: ( rule__ListOfrequiredServices__Group_4_1__1__Impl )
            // InternalFoo.g:2949:2: rule__ListOfrequiredServices__Group_4_1__1__Impl
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
    // InternalFoo.g:2955:1: rule__ListOfrequiredServices__Group_4_1__1__Impl : ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) ) ;
    public final void rule__ListOfrequiredServices__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2959:1: ( ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) ) )
            // InternalFoo.g:2960:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) )
            {
            // InternalFoo.g:2960:1: ( ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 ) )
            // InternalFoo.g:2961:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesAssignment_4_1_1()); 
            }
            // InternalFoo.g:2962:2: ( rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 )
            // InternalFoo.g:2962:3: rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1
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
    // InternalFoo.g:2971:1: rule__MProvidedService__Group__0 : rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1 ;
    public final void rule__MProvidedService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2975:1: ( rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1 )
            // InternalFoo.g:2976:2: rule__MProvidedService__Group__0__Impl rule__MProvidedService__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalFoo.g:2983:1: rule__MProvidedService__Group__0__Impl : ( 'service' ) ;
    public final void rule__MProvidedService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:2987:1: ( ( 'service' ) )
            // InternalFoo.g:2988:1: ( 'service' )
            {
            // InternalFoo.g:2988:1: ( 'service' )
            // InternalFoo.g:2989:2: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getServiceKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:2998:1: rule__MProvidedService__Group__1 : rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2 ;
    public final void rule__MProvidedService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3002:1: ( rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2 )
            // InternalFoo.g:3003:2: rule__MProvidedService__Group__1__Impl rule__MProvidedService__Group__2
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
    // InternalFoo.g:3010:1: rule__MProvidedService__Group__1__Impl : ( 'provided' ) ;
    public final void rule__MProvidedService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3014:1: ( ( 'provided' ) )
            // InternalFoo.g:3015:1: ( 'provided' )
            {
            // InternalFoo.g:3015:1: ( 'provided' )
            // InternalFoo.g:3016:2: 'provided'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getProvidedKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:3025:1: rule__MProvidedService__Group__2 : rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3 ;
    public final void rule__MProvidedService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3029:1: ( rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3 )
            // InternalFoo.g:3030:2: rule__MProvidedService__Group__2__Impl rule__MProvidedService__Group__3
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
    // InternalFoo.g:3037:1: rule__MProvidedService__Group__2__Impl : ( ( rule__MProvidedService__SignatureAssignment_2 ) ) ;
    public final void rule__MProvidedService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3041:1: ( ( ( rule__MProvidedService__SignatureAssignment_2 ) ) )
            // InternalFoo.g:3042:1: ( ( rule__MProvidedService__SignatureAssignment_2 ) )
            {
            // InternalFoo.g:3042:1: ( ( rule__MProvidedService__SignatureAssignment_2 ) )
            // InternalFoo.g:3043:2: ( rule__MProvidedService__SignatureAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getSignatureAssignment_2()); 
            }
            // InternalFoo.g:3044:2: ( rule__MProvidedService__SignatureAssignment_2 )
            // InternalFoo.g:3044:3: rule__MProvidedService__SignatureAssignment_2
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
    // InternalFoo.g:3052:1: rule__MProvidedService__Group__3 : rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4 ;
    public final void rule__MProvidedService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3056:1: ( rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4 )
            // InternalFoo.g:3057:2: rule__MProvidedService__Group__3__Impl rule__MProvidedService__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalFoo.g:3064:1: rule__MProvidedService__Group__3__Impl : ( '{' ) ;
    public final void rule__MProvidedService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3068:1: ( ( '{' ) )
            // InternalFoo.g:3069:1: ( '{' )
            {
            // InternalFoo.g:3069:1: ( '{' )
            // InternalFoo.g:3070:2: '{'
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
    // InternalFoo.g:3079:1: rule__MProvidedService__Group__4 : rule__MProvidedService__Group__4__Impl rule__MProvidedService__Group__5 ;
    public final void rule__MProvidedService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3083:1: ( rule__MProvidedService__Group__4__Impl rule__MProvidedService__Group__5 )
            // InternalFoo.g:3084:2: rule__MProvidedService__Group__4__Impl rule__MProvidedService__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalFoo.g:3091:1: rule__MProvidedService__Group__4__Impl : ( ( ( rule__MProvidedService__ExpressionsAssignment_4 ) ) ( ( rule__MProvidedService__ExpressionsAssignment_4 )* ) ) ;
    public final void rule__MProvidedService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3095:1: ( ( ( ( rule__MProvidedService__ExpressionsAssignment_4 ) ) ( ( rule__MProvidedService__ExpressionsAssignment_4 )* ) ) )
            // InternalFoo.g:3096:1: ( ( ( rule__MProvidedService__ExpressionsAssignment_4 ) ) ( ( rule__MProvidedService__ExpressionsAssignment_4 )* ) )
            {
            // InternalFoo.g:3096:1: ( ( ( rule__MProvidedService__ExpressionsAssignment_4 ) ) ( ( rule__MProvidedService__ExpressionsAssignment_4 )* ) )
            // InternalFoo.g:3097:2: ( ( rule__MProvidedService__ExpressionsAssignment_4 ) ) ( ( rule__MProvidedService__ExpressionsAssignment_4 )* )
            {
            // InternalFoo.g:3097:2: ( ( rule__MProvidedService__ExpressionsAssignment_4 ) )
            // InternalFoo.g:3098:3: ( rule__MProvidedService__ExpressionsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getExpressionsAssignment_4()); 
            }
            // InternalFoo.g:3099:3: ( rule__MProvidedService__ExpressionsAssignment_4 )
            // InternalFoo.g:3099:4: rule__MProvidedService__ExpressionsAssignment_4
            {
            pushFollow(FOLLOW_34);
            rule__MProvidedService__ExpressionsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMProvidedServiceAccess().getExpressionsAssignment_4()); 
            }

            }

            // InternalFoo.g:3102:2: ( ( rule__MProvidedService__ExpressionsAssignment_4 )* )
            // InternalFoo.g:3103:3: ( rule__MProvidedService__ExpressionsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMProvidedServiceAccess().getExpressionsAssignment_4()); 
            }
            // InternalFoo.g:3104:3: ( rule__MProvidedService__ExpressionsAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==38||LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalFoo.g:3104:4: rule__MProvidedService__ExpressionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_34);
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
    // InternalFoo.g:3113:1: rule__MProvidedService__Group__5 : rule__MProvidedService__Group__5__Impl ;
    public final void rule__MProvidedService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3117:1: ( rule__MProvidedService__Group__5__Impl )
            // InternalFoo.g:3118:2: rule__MProvidedService__Group__5__Impl
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
    // InternalFoo.g:3124:1: rule__MProvidedService__Group__5__Impl : ( '}' ) ;
    public final void rule__MProvidedService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3128:1: ( ( '}' ) )
            // InternalFoo.g:3129:1: ( '}' )
            {
            // InternalFoo.g:3129:1: ( '}' )
            // InternalFoo.g:3130:2: '}'
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
    // InternalFoo.g:3140:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3144:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalFoo.g:3145:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalFoo.g:3152:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3156:1: ( ( 'if' ) )
            // InternalFoo.g:3157:1: ( 'if' )
            {
            // InternalFoo.g:3157:1: ( 'if' )
            // InternalFoo.g:3158:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:3167:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3171:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalFoo.g:3172:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalFoo.g:3179:1: rule__If__Group__1__Impl : ( '(' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3183:1: ( ( '(' ) )
            // InternalFoo.g:3184:1: ( '(' )
            {
            // InternalFoo.g:3184:1: ( '(' )
            // InternalFoo.g:3185:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:3194:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3198:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalFoo.g:3199:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalFoo.g:3206:1: rule__If__Group__2__Impl : ( ( rule__If__Group_2__0 )* ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3210:1: ( ( ( rule__If__Group_2__0 )* ) )
            // InternalFoo.g:3211:1: ( ( rule__If__Group_2__0 )* )
            {
            // InternalFoo.g:3211:1: ( ( rule__If__Group_2__0 )* )
            // InternalFoo.g:3212:2: ( rule__If__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_2()); 
            }
            // InternalFoo.g:3213:2: ( rule__If__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalFoo.g:3213:3: rule__If__Group_2__0
            	    {
            	    pushFollow(FOLLOW_37);
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
    // InternalFoo.g:3221:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3225:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalFoo.g:3226:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalFoo.g:3233:1: rule__If__Group__3__Impl : ( ( rule__If__ConditionsAssignment_3 ) ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3237:1: ( ( ( rule__If__ConditionsAssignment_3 ) ) )
            // InternalFoo.g:3238:1: ( ( rule__If__ConditionsAssignment_3 ) )
            {
            // InternalFoo.g:3238:1: ( ( rule__If__ConditionsAssignment_3 ) )
            // InternalFoo.g:3239:2: ( rule__If__ConditionsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionsAssignment_3()); 
            }
            // InternalFoo.g:3240:2: ( rule__If__ConditionsAssignment_3 )
            // InternalFoo.g:3240:3: rule__If__ConditionsAssignment_3
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
    // InternalFoo.g:3248:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3252:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalFoo.g:3253:2: rule__If__Group__4__Impl rule__If__Group__5
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
    // InternalFoo.g:3260:1: rule__If__Group__4__Impl : ( ')' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3264:1: ( ( ')' ) )
            // InternalFoo.g:3265:1: ( ')' )
            {
            // InternalFoo.g:3265:1: ( ')' )
            // InternalFoo.g:3266:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:3275:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3279:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalFoo.g:3280:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalFoo.g:3287:1: rule__If__Group__5__Impl : ( '{' ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3291:1: ( ( '{' ) )
            // InternalFoo.g:3292:1: ( '{' )
            {
            // InternalFoo.g:3292:1: ( '{' )
            // InternalFoo.g:3293:2: '{'
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
    // InternalFoo.g:3302:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3306:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // InternalFoo.g:3307:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalFoo.g:3314:1: rule__If__Group__6__Impl : ( ( ( rule__If__Alternatives_6 ) ) ( ( rule__If__Alternatives_6 )* ) ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3318:1: ( ( ( ( rule__If__Alternatives_6 ) ) ( ( rule__If__Alternatives_6 )* ) ) )
            // InternalFoo.g:3319:1: ( ( ( rule__If__Alternatives_6 ) ) ( ( rule__If__Alternatives_6 )* ) )
            {
            // InternalFoo.g:3319:1: ( ( ( rule__If__Alternatives_6 ) ) ( ( rule__If__Alternatives_6 )* ) )
            // InternalFoo.g:3320:2: ( ( rule__If__Alternatives_6 ) ) ( ( rule__If__Alternatives_6 )* )
            {
            // InternalFoo.g:3320:2: ( ( rule__If__Alternatives_6 ) )
            // InternalFoo.g:3321:3: ( rule__If__Alternatives_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAlternatives_6()); 
            }
            // InternalFoo.g:3322:3: ( rule__If__Alternatives_6 )
            // InternalFoo.g:3322:4: rule__If__Alternatives_6
            {
            pushFollow(FOLLOW_34);
            rule__If__Alternatives_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getAlternatives_6()); 
            }

            }

            // InternalFoo.g:3325:2: ( ( rule__If__Alternatives_6 )* )
            // InternalFoo.g:3326:3: ( rule__If__Alternatives_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAlternatives_6()); 
            }
            // InternalFoo.g:3327:3: ( rule__If__Alternatives_6 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==38||LA27_0==42) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalFoo.g:3327:4: rule__If__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_34);
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
    // InternalFoo.g:3336:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3340:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // InternalFoo.g:3341:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_39);
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
    // InternalFoo.g:3348:1: rule__If__Group__7__Impl : ( '}' ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3352:1: ( ( '}' ) )
            // InternalFoo.g:3353:1: ( '}' )
            {
            // InternalFoo.g:3353:1: ( '}' )
            // InternalFoo.g:3354:2: '}'
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
    // InternalFoo.g:3363:1: rule__If__Group__8 : rule__If__Group__8__Impl ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3367:1: ( rule__If__Group__8__Impl )
            // InternalFoo.g:3368:2: rule__If__Group__8__Impl
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
    // InternalFoo.g:3374:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3378:1: ( ( ( rule__If__Group_8__0 )? ) )
            // InternalFoo.g:3379:1: ( ( rule__If__Group_8__0 )? )
            {
            // InternalFoo.g:3379:1: ( ( rule__If__Group_8__0 )? )
            // InternalFoo.g:3380:2: ( rule__If__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_8()); 
            }
            // InternalFoo.g:3381:2: ( rule__If__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFoo.g:3381:3: rule__If__Group_8__0
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
    // InternalFoo.g:3390:1: rule__If__Group_2__0 : rule__If__Group_2__0__Impl rule__If__Group_2__1 ;
    public final void rule__If__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3394:1: ( rule__If__Group_2__0__Impl rule__If__Group_2__1 )
            // InternalFoo.g:3395:2: rule__If__Group_2__0__Impl rule__If__Group_2__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalFoo.g:3402:1: rule__If__Group_2__0__Impl : ( ( rule__If__ConditionsAssignment_2_0 ) ) ;
    public final void rule__If__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3406:1: ( ( ( rule__If__ConditionsAssignment_2_0 ) ) )
            // InternalFoo.g:3407:1: ( ( rule__If__ConditionsAssignment_2_0 ) )
            {
            // InternalFoo.g:3407:1: ( ( rule__If__ConditionsAssignment_2_0 ) )
            // InternalFoo.g:3408:2: ( rule__If__ConditionsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionsAssignment_2_0()); 
            }
            // InternalFoo.g:3409:2: ( rule__If__ConditionsAssignment_2_0 )
            // InternalFoo.g:3409:3: rule__If__ConditionsAssignment_2_0
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
    // InternalFoo.g:3417:1: rule__If__Group_2__1 : rule__If__Group_2__1__Impl ;
    public final void rule__If__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3421:1: ( rule__If__Group_2__1__Impl )
            // InternalFoo.g:3422:2: rule__If__Group_2__1__Impl
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
    // InternalFoo.g:3428:1: rule__If__Group_2__1__Impl : ( ( rule__If__Alternatives_2_1 ) ) ;
    public final void rule__If__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3432:1: ( ( ( rule__If__Alternatives_2_1 ) ) )
            // InternalFoo.g:3433:1: ( ( rule__If__Alternatives_2_1 ) )
            {
            // InternalFoo.g:3433:1: ( ( rule__If__Alternatives_2_1 ) )
            // InternalFoo.g:3434:2: ( rule__If__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAlternatives_2_1()); 
            }
            // InternalFoo.g:3435:2: ( rule__If__Alternatives_2_1 )
            // InternalFoo.g:3435:3: rule__If__Alternatives_2_1
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


    // $ANTLR start "rule__If__Group_8__0"
    // InternalFoo.g:3444:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3448:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // InternalFoo.g:3449:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
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
    // InternalFoo.g:3456:1: rule__If__Group_8__0__Impl : ( ( 'else' ) ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3460:1: ( ( ( 'else' ) ) )
            // InternalFoo.g:3461:1: ( ( 'else' ) )
            {
            // InternalFoo.g:3461:1: ( ( 'else' ) )
            // InternalFoo.g:3462:2: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            }
            // InternalFoo.g:3463:2: ( 'else' )
            // InternalFoo.g:3463:3: 'else'
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
    // InternalFoo.g:3471:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3475:1: ( rule__If__Group_8__1__Impl )
            // InternalFoo.g:3476:2: rule__If__Group_8__1__Impl
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
    // InternalFoo.g:3482:1: rule__If__Group_8__1__Impl : ( ( rule__If__Alternatives_8_1 ) ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3486:1: ( ( ( rule__If__Alternatives_8_1 ) ) )
            // InternalFoo.g:3487:1: ( ( rule__If__Alternatives_8_1 ) )
            {
            // InternalFoo.g:3487:1: ( ( rule__If__Alternatives_8_1 ) )
            // InternalFoo.g:3488:2: ( rule__If__Alternatives_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAlternatives_8_1()); 
            }
            // InternalFoo.g:3489:2: ( rule__If__Alternatives_8_1 )
            // InternalFoo.g:3489:3: rule__If__Alternatives_8_1
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
    // InternalFoo.g:3498:1: rule__If__Group_8_1_1__0 : rule__If__Group_8_1_1__0__Impl rule__If__Group_8_1_1__1 ;
    public final void rule__If__Group_8_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3502:1: ( rule__If__Group_8_1_1__0__Impl rule__If__Group_8_1_1__1 )
            // InternalFoo.g:3503:2: rule__If__Group_8_1_1__0__Impl rule__If__Group_8_1_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFoo.g:3510:1: rule__If__Group_8_1_1__0__Impl : ( '{' ) ;
    public final void rule__If__Group_8_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3514:1: ( ( '{' ) )
            // InternalFoo.g:3515:1: ( '{' )
            {
            // InternalFoo.g:3515:1: ( '{' )
            // InternalFoo.g:3516:2: '{'
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
    // InternalFoo.g:3525:1: rule__If__Group_8_1_1__1 : rule__If__Group_8_1_1__1__Impl rule__If__Group_8_1_1__2 ;
    public final void rule__If__Group_8_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3529:1: ( rule__If__Group_8_1_1__1__Impl rule__If__Group_8_1_1__2 )
            // InternalFoo.g:3530:2: rule__If__Group_8_1_1__1__Impl rule__If__Group_8_1_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalFoo.g:3537:1: rule__If__Group_8_1_1__1__Impl : ( ( ( rule__If__Alternatives_8_1_1_1 ) ) ( ( rule__If__Alternatives_8_1_1_1 )* ) ) ;
    public final void rule__If__Group_8_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3541:1: ( ( ( ( rule__If__Alternatives_8_1_1_1 ) ) ( ( rule__If__Alternatives_8_1_1_1 )* ) ) )
            // InternalFoo.g:3542:1: ( ( ( rule__If__Alternatives_8_1_1_1 ) ) ( ( rule__If__Alternatives_8_1_1_1 )* ) )
            {
            // InternalFoo.g:3542:1: ( ( ( rule__If__Alternatives_8_1_1_1 ) ) ( ( rule__If__Alternatives_8_1_1_1 )* ) )
            // InternalFoo.g:3543:2: ( ( rule__If__Alternatives_8_1_1_1 ) ) ( ( rule__If__Alternatives_8_1_1_1 )* )
            {
            // InternalFoo.g:3543:2: ( ( rule__If__Alternatives_8_1_1_1 ) )
            // InternalFoo.g:3544:3: ( rule__If__Alternatives_8_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAlternatives_8_1_1_1()); 
            }
            // InternalFoo.g:3545:3: ( rule__If__Alternatives_8_1_1_1 )
            // InternalFoo.g:3545:4: rule__If__Alternatives_8_1_1_1
            {
            pushFollow(FOLLOW_34);
            rule__If__Alternatives_8_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getAlternatives_8_1_1_1()); 
            }

            }

            // InternalFoo.g:3548:2: ( ( rule__If__Alternatives_8_1_1_1 )* )
            // InternalFoo.g:3549:3: ( rule__If__Alternatives_8_1_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAlternatives_8_1_1_1()); 
            }
            // InternalFoo.g:3550:3: ( rule__If__Alternatives_8_1_1_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==38||LA29_0==42) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalFoo.g:3550:4: rule__If__Alternatives_8_1_1_1
            	    {
            	    pushFollow(FOLLOW_34);
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
    // InternalFoo.g:3559:1: rule__If__Group_8_1_1__2 : rule__If__Group_8_1_1__2__Impl ;
    public final void rule__If__Group_8_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3563:1: ( rule__If__Group_8_1_1__2__Impl )
            // InternalFoo.g:3564:2: rule__If__Group_8_1_1__2__Impl
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
    // InternalFoo.g:3570:1: rule__If__Group_8_1_1__2__Impl : ( '}' ) ;
    public final void rule__If__Group_8_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3574:1: ( ( '}' ) )
            // InternalFoo.g:3575:1: ( '}' )
            {
            // InternalFoo.g:3575:1: ( '}' )
            // InternalFoo.g:3576:2: '}'
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


    // $ANTLR start "rule__While__Group__0"
    // InternalFoo.g:3586:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3590:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalFoo.g:3591:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalFoo.g:3598:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3602:1: ( ( 'while' ) )
            // InternalFoo.g:3603:1: ( 'while' )
            {
            // InternalFoo.g:3603:1: ( 'while' )
            // InternalFoo.g:3604:2: 'while'
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
    // InternalFoo.g:3613:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3617:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // InternalFoo.g:3618:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalFoo.g:3625:1: rule__While__Group__1__Impl : ( '(' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3629:1: ( ( '(' ) )
            // InternalFoo.g:3630:1: ( '(' )
            {
            // InternalFoo.g:3630:1: ( '(' )
            // InternalFoo.g:3631:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:3640:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3644:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // InternalFoo.g:3645:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalFoo.g:3652:1: rule__While__Group__2__Impl : ( ( rule__While__Group_2__0 )* ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3656:1: ( ( ( rule__While__Group_2__0 )* ) )
            // InternalFoo.g:3657:1: ( ( rule__While__Group_2__0 )* )
            {
            // InternalFoo.g:3657:1: ( ( rule__While__Group_2__0 )* )
            // InternalFoo.g:3658:2: ( rule__While__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getGroup_2()); 
            }
            // InternalFoo.g:3659:2: ( rule__While__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // InternalFoo.g:3659:3: rule__While__Group_2__0
            	    {
            	    pushFollow(FOLLOW_37);
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
    // InternalFoo.g:3667:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3671:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // InternalFoo.g:3672:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalFoo.g:3679:1: rule__While__Group__3__Impl : ( ( rule__While__ConditionsAssignment_3 ) ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3683:1: ( ( ( rule__While__ConditionsAssignment_3 ) ) )
            // InternalFoo.g:3684:1: ( ( rule__While__ConditionsAssignment_3 ) )
            {
            // InternalFoo.g:3684:1: ( ( rule__While__ConditionsAssignment_3 ) )
            // InternalFoo.g:3685:2: ( rule__While__ConditionsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getConditionsAssignment_3()); 
            }
            // InternalFoo.g:3686:2: ( rule__While__ConditionsAssignment_3 )
            // InternalFoo.g:3686:3: rule__While__ConditionsAssignment_3
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
    // InternalFoo.g:3694:1: rule__While__Group__4 : rule__While__Group__4__Impl rule__While__Group__5 ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3698:1: ( rule__While__Group__4__Impl rule__While__Group__5 )
            // InternalFoo.g:3699:2: rule__While__Group__4__Impl rule__While__Group__5
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
    // InternalFoo.g:3706:1: rule__While__Group__4__Impl : ( ')' ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3710:1: ( ( ')' ) )
            // InternalFoo.g:3711:1: ( ')' )
            {
            // InternalFoo.g:3711:1: ( ')' )
            // InternalFoo.g:3712:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:3721:1: rule__While__Group__5 : rule__While__Group__5__Impl rule__While__Group__6 ;
    public final void rule__While__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3725:1: ( rule__While__Group__5__Impl rule__While__Group__6 )
            // InternalFoo.g:3726:2: rule__While__Group__5__Impl rule__While__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalFoo.g:3733:1: rule__While__Group__5__Impl : ( '{' ) ;
    public final void rule__While__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3737:1: ( ( '{' ) )
            // InternalFoo.g:3738:1: ( '{' )
            {
            // InternalFoo.g:3738:1: ( '{' )
            // InternalFoo.g:3739:2: '{'
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
    // InternalFoo.g:3748:1: rule__While__Group__6 : rule__While__Group__6__Impl rule__While__Group__7 ;
    public final void rule__While__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3752:1: ( rule__While__Group__6__Impl rule__While__Group__7 )
            // InternalFoo.g:3753:2: rule__While__Group__6__Impl rule__While__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalFoo.g:3760:1: rule__While__Group__6__Impl : ( ( ( rule__While__Alternatives_6 ) ) ( ( rule__While__Alternatives_6 )* ) ) ;
    public final void rule__While__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3764:1: ( ( ( ( rule__While__Alternatives_6 ) ) ( ( rule__While__Alternatives_6 )* ) ) )
            // InternalFoo.g:3765:1: ( ( ( rule__While__Alternatives_6 ) ) ( ( rule__While__Alternatives_6 )* ) )
            {
            // InternalFoo.g:3765:1: ( ( ( rule__While__Alternatives_6 ) ) ( ( rule__While__Alternatives_6 )* ) )
            // InternalFoo.g:3766:2: ( ( rule__While__Alternatives_6 ) ) ( ( rule__While__Alternatives_6 )* )
            {
            // InternalFoo.g:3766:2: ( ( rule__While__Alternatives_6 ) )
            // InternalFoo.g:3767:3: ( rule__While__Alternatives_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getAlternatives_6()); 
            }
            // InternalFoo.g:3768:3: ( rule__While__Alternatives_6 )
            // InternalFoo.g:3768:4: rule__While__Alternatives_6
            {
            pushFollow(FOLLOW_34);
            rule__While__Alternatives_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getAlternatives_6()); 
            }

            }

            // InternalFoo.g:3771:2: ( ( rule__While__Alternatives_6 )* )
            // InternalFoo.g:3772:3: ( rule__While__Alternatives_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getAlternatives_6()); 
            }
            // InternalFoo.g:3773:3: ( rule__While__Alternatives_6 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==38||LA31_0==42) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalFoo.g:3773:4: rule__While__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_34);
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
    // InternalFoo.g:3782:1: rule__While__Group__7 : rule__While__Group__7__Impl ;
    public final void rule__While__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3786:1: ( rule__While__Group__7__Impl )
            // InternalFoo.g:3787:2: rule__While__Group__7__Impl
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
    // InternalFoo.g:3793:1: rule__While__Group__7__Impl : ( '}' ) ;
    public final void rule__While__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3797:1: ( ( '}' ) )
            // InternalFoo.g:3798:1: ( '}' )
            {
            // InternalFoo.g:3798:1: ( '}' )
            // InternalFoo.g:3799:2: '}'
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
    // InternalFoo.g:3809:1: rule__While__Group_2__0 : rule__While__Group_2__0__Impl rule__While__Group_2__1 ;
    public final void rule__While__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3813:1: ( rule__While__Group_2__0__Impl rule__While__Group_2__1 )
            // InternalFoo.g:3814:2: rule__While__Group_2__0__Impl rule__While__Group_2__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalFoo.g:3821:1: rule__While__Group_2__0__Impl : ( ( rule__While__ConditionsAssignment_2_0 ) ) ;
    public final void rule__While__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3825:1: ( ( ( rule__While__ConditionsAssignment_2_0 ) ) )
            // InternalFoo.g:3826:1: ( ( rule__While__ConditionsAssignment_2_0 ) )
            {
            // InternalFoo.g:3826:1: ( ( rule__While__ConditionsAssignment_2_0 ) )
            // InternalFoo.g:3827:2: ( rule__While__ConditionsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getConditionsAssignment_2_0()); 
            }
            // InternalFoo.g:3828:2: ( rule__While__ConditionsAssignment_2_0 )
            // InternalFoo.g:3828:3: rule__While__ConditionsAssignment_2_0
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
    // InternalFoo.g:3836:1: rule__While__Group_2__1 : rule__While__Group_2__1__Impl ;
    public final void rule__While__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3840:1: ( rule__While__Group_2__1__Impl )
            // InternalFoo.g:3841:2: rule__While__Group_2__1__Impl
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
    // InternalFoo.g:3847:1: rule__While__Group_2__1__Impl : ( ( rule__While__Alternatives_2_1 ) ) ;
    public final void rule__While__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3851:1: ( ( ( rule__While__Alternatives_2_1 ) ) )
            // InternalFoo.g:3852:1: ( ( rule__While__Alternatives_2_1 ) )
            {
            // InternalFoo.g:3852:1: ( ( rule__While__Alternatives_2_1 ) )
            // InternalFoo.g:3853:2: ( rule__While__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getAlternatives_2_1()); 
            }
            // InternalFoo.g:3854:2: ( rule__While__Alternatives_2_1 )
            // InternalFoo.g:3854:3: rule__While__Alternatives_2_1
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


    // $ANTLR start "rule__Condition__Group__0"
    // InternalFoo.g:3863:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3867:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalFoo.g:3868:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalFoo.g:3875:1: rule__Condition__Group__0__Impl : ( ( '!' )? ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3879:1: ( ( ( '!' )? ) )
            // InternalFoo.g:3880:1: ( ( '!' )? )
            {
            // InternalFoo.g:3880:1: ( ( '!' )? )
            // InternalFoo.g:3881:2: ( '!' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExclamationMarkKeyword_0()); 
            }
            // InternalFoo.g:3882:2: ( '!' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalFoo.g:3882:3: '!'
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
    // InternalFoo.g:3890:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3894:1: ( rule__Condition__Group__1__Impl )
            // InternalFoo.g:3895:2: rule__Condition__Group__1__Impl
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
    // InternalFoo.g:3901:1: rule__Condition__Group__1__Impl : ( ( ( rule__Condition__Alternatives_1 ) ) ( ( rule__Condition__Alternatives_1 )* ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3905:1: ( ( ( ( rule__Condition__Alternatives_1 ) ) ( ( rule__Condition__Alternatives_1 )* ) ) )
            // InternalFoo.g:3906:1: ( ( ( rule__Condition__Alternatives_1 ) ) ( ( rule__Condition__Alternatives_1 )* ) )
            {
            // InternalFoo.g:3906:1: ( ( ( rule__Condition__Alternatives_1 ) ) ( ( rule__Condition__Alternatives_1 )* ) )
            // InternalFoo.g:3907:2: ( ( rule__Condition__Alternatives_1 ) ) ( ( rule__Condition__Alternatives_1 )* )
            {
            // InternalFoo.g:3907:2: ( ( rule__Condition__Alternatives_1 ) )
            // InternalFoo.g:3908:3: ( rule__Condition__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAlternatives_1()); 
            }
            // InternalFoo.g:3909:3: ( rule__Condition__Alternatives_1 )
            // InternalFoo.g:3909:4: rule__Condition__Alternatives_1
            {
            pushFollow(FOLLOW_37);
            rule__Condition__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getAlternatives_1()); 
            }

            }

            // InternalFoo.g:3912:2: ( ( rule__Condition__Alternatives_1 )* )
            // InternalFoo.g:3913:3: ( rule__Condition__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAlternatives_1()); 
            }
            // InternalFoo.g:3914:3: ( rule__Condition__Alternatives_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalFoo.g:3914:4: rule__Condition__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_37);
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
    // InternalFoo.g:3924:1: rule__Str__Group__0 : rule__Str__Group__0__Impl rule__Str__Group__1 ;
    public final void rule__Str__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3928:1: ( rule__Str__Group__0__Impl rule__Str__Group__1 )
            // InternalFoo.g:3929:2: rule__Str__Group__0__Impl rule__Str__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalFoo.g:3936:1: rule__Str__Group__0__Impl : ( ( rule__Str__ValueAssignment_0 ) ) ;
    public final void rule__Str__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3940:1: ( ( ( rule__Str__ValueAssignment_0 ) ) )
            // InternalFoo.g:3941:1: ( ( rule__Str__ValueAssignment_0 ) )
            {
            // InternalFoo.g:3941:1: ( ( rule__Str__ValueAssignment_0 ) )
            // InternalFoo.g:3942:2: ( rule__Str__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getValueAssignment_0()); 
            }
            // InternalFoo.g:3943:2: ( rule__Str__ValueAssignment_0 )
            // InternalFoo.g:3943:3: rule__Str__ValueAssignment_0
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
    // InternalFoo.g:3951:1: rule__Str__Group__1 : rule__Str__Group__1__Impl rule__Str__Group__2 ;
    public final void rule__Str__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3955:1: ( rule__Str__Group__1__Impl rule__Str__Group__2 )
            // InternalFoo.g:3956:2: rule__Str__Group__1__Impl rule__Str__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__Str__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Str__Group__2();

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
    // InternalFoo.g:3963:1: rule__Str__Group__1__Impl : ( ( rule__Str__Group_1__0 )* ) ;
    public final void rule__Str__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3967:1: ( ( ( rule__Str__Group_1__0 )* ) )
            // InternalFoo.g:3968:1: ( ( rule__Str__Group_1__0 )* )
            {
            // InternalFoo.g:3968:1: ( ( rule__Str__Group_1__0 )* )
            // InternalFoo.g:3969:2: ( rule__Str__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getGroup_1()); 
            }
            // InternalFoo.g:3970:2: ( rule__Str__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==21) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalFoo.g:3970:3: rule__Str__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
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


    // $ANTLR start "rule__Str__Group__2"
    // InternalFoo.g:3978:1: rule__Str__Group__2 : rule__Str__Group__2__Impl ;
    public final void rule__Str__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3982:1: ( rule__Str__Group__2__Impl )
            // InternalFoo.g:3983:2: rule__Str__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Str__Group__2__Impl();

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
    // $ANTLR end "rule__Str__Group__2"


    // $ANTLR start "rule__Str__Group__2__Impl"
    // InternalFoo.g:3989:1: rule__Str__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__Str__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:3993:1: ( ( ( ';' )? ) )
            // InternalFoo.g:3994:1: ( ( ';' )? )
            {
            // InternalFoo.g:3994:1: ( ( ';' )? )
            // InternalFoo.g:3995:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getSemicolonKeyword_2()); 
            }
            // InternalFoo.g:3996:2: ( ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFoo.g:3996:3: ';'
                    {
                    match(input,44,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__Str__Group__2__Impl"


    // $ANTLR start "rule__Str__Group_1__0"
    // InternalFoo.g:4005:1: rule__Str__Group_1__0 : rule__Str__Group_1__0__Impl rule__Str__Group_1__1 ;
    public final void rule__Str__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4009:1: ( rule__Str__Group_1__0__Impl rule__Str__Group_1__1 )
            // InternalFoo.g:4010:2: rule__Str__Group_1__0__Impl rule__Str__Group_1__1
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
    // InternalFoo.g:4017:1: rule__Str__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Str__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4021:1: ( ( '.' ) )
            // InternalFoo.g:4022:1: ( '.' )
            {
            // InternalFoo.g:4022:1: ( '.' )
            // InternalFoo.g:4023:2: '.'
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
    // InternalFoo.g:4032:1: rule__Str__Group_1__1 : rule__Str__Group_1__1__Impl rule__Str__Group_1__2 ;
    public final void rule__Str__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4036:1: ( rule__Str__Group_1__1__Impl rule__Str__Group_1__2 )
            // InternalFoo.g:4037:2: rule__Str__Group_1__1__Impl rule__Str__Group_1__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalFoo.g:4044:1: rule__Str__Group_1__1__Impl : ( ( rule__Str__ValueAssignment_1_1 ) ) ;
    public final void rule__Str__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4048:1: ( ( ( rule__Str__ValueAssignment_1_1 ) ) )
            // InternalFoo.g:4049:1: ( ( rule__Str__ValueAssignment_1_1 ) )
            {
            // InternalFoo.g:4049:1: ( ( rule__Str__ValueAssignment_1_1 ) )
            // InternalFoo.g:4050:2: ( rule__Str__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getValueAssignment_1_1()); 
            }
            // InternalFoo.g:4051:2: ( rule__Str__ValueAssignment_1_1 )
            // InternalFoo.g:4051:3: rule__Str__ValueAssignment_1_1
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
    // InternalFoo.g:4059:1: rule__Str__Group_1__2 : rule__Str__Group_1__2__Impl rule__Str__Group_1__3 ;
    public final void rule__Str__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4063:1: ( rule__Str__Group_1__2__Impl rule__Str__Group_1__3 )
            // InternalFoo.g:4064:2: rule__Str__Group_1__2__Impl rule__Str__Group_1__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalFoo.g:4071:1: rule__Str__Group_1__2__Impl : ( '(' ) ;
    public final void rule__Str__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4075:1: ( ( '(' ) )
            // InternalFoo.g:4076:1: ( '(' )
            {
            // InternalFoo.g:4076:1: ( '(' )
            // InternalFoo.g:4077:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getLeftParenthesisKeyword_1_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:4086:1: rule__Str__Group_1__3 : rule__Str__Group_1__3__Impl rule__Str__Group_1__4 ;
    public final void rule__Str__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4090:1: ( rule__Str__Group_1__3__Impl rule__Str__Group_1__4 )
            // InternalFoo.g:4091:2: rule__Str__Group_1__3__Impl rule__Str__Group_1__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalFoo.g:4098:1: rule__Str__Group_1__3__Impl : ( ( rule__Str__ValueAssignment_1_3 )? ) ;
    public final void rule__Str__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4102:1: ( ( ( rule__Str__ValueAssignment_1_3 )? ) )
            // InternalFoo.g:4103:1: ( ( rule__Str__ValueAssignment_1_3 )? )
            {
            // InternalFoo.g:4103:1: ( ( rule__Str__ValueAssignment_1_3 )? )
            // InternalFoo.g:4104:2: ( rule__Str__ValueAssignment_1_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getValueAssignment_1_3()); 
            }
            // InternalFoo.g:4105:2: ( rule__Str__ValueAssignment_1_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalFoo.g:4105:3: rule__Str__ValueAssignment_1_3
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
    // InternalFoo.g:4113:1: rule__Str__Group_1__4 : rule__Str__Group_1__4__Impl ;
    public final void rule__Str__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4117:1: ( rule__Str__Group_1__4__Impl )
            // InternalFoo.g:4118:2: rule__Str__Group_1__4__Impl
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
    // InternalFoo.g:4124:1: rule__Str__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Str__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4128:1: ( ( ')' ) )
            // InternalFoo.g:4129:1: ( ')' )
            {
            // InternalFoo.g:4129:1: ( ')' )
            // InternalFoo.g:4130:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrAccess().getRightParenthesisKeyword_1_4()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:4140:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4144:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalFoo.g:4145:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalFoo.g:4152:1: rule__Comparison__Group__0__Impl : ( ( rule__Comparison__LeftMemberAssignment_0 ) ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4156:1: ( ( ( rule__Comparison__LeftMemberAssignment_0 ) ) )
            // InternalFoo.g:4157:1: ( ( rule__Comparison__LeftMemberAssignment_0 ) )
            {
            // InternalFoo.g:4157:1: ( ( rule__Comparison__LeftMemberAssignment_0 ) )
            // InternalFoo.g:4158:2: ( rule__Comparison__LeftMemberAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLeftMemberAssignment_0()); 
            }
            // InternalFoo.g:4159:2: ( rule__Comparison__LeftMemberAssignment_0 )
            // InternalFoo.g:4159:3: rule__Comparison__LeftMemberAssignment_0
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
    // InternalFoo.g:4167:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4171:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // InternalFoo.g:4172:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
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
    // InternalFoo.g:4179:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Alternatives_1 ) ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4183:1: ( ( ( rule__Comparison__Alternatives_1 ) ) )
            // InternalFoo.g:4184:1: ( ( rule__Comparison__Alternatives_1 ) )
            {
            // InternalFoo.g:4184:1: ( ( rule__Comparison__Alternatives_1 ) )
            // InternalFoo.g:4185:2: ( rule__Comparison__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_1()); 
            }
            // InternalFoo.g:4186:2: ( rule__Comparison__Alternatives_1 )
            // InternalFoo.g:4186:3: rule__Comparison__Alternatives_1
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
    // InternalFoo.g:4194:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4198:1: ( rule__Comparison__Group__2__Impl )
            // InternalFoo.g:4199:2: rule__Comparison__Group__2__Impl
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
    // InternalFoo.g:4205:1: rule__Comparison__Group__2__Impl : ( ( rule__Comparison__RightMemberAssignment_2 ) ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4209:1: ( ( ( rule__Comparison__RightMemberAssignment_2 ) ) )
            // InternalFoo.g:4210:1: ( ( rule__Comparison__RightMemberAssignment_2 ) )
            {
            // InternalFoo.g:4210:1: ( ( rule__Comparison__RightMemberAssignment_2 ) )
            // InternalFoo.g:4211:2: ( rule__Comparison__RightMemberAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightMemberAssignment_2()); 
            }
            // InternalFoo.g:4212:2: ( rule__Comparison__RightMemberAssignment_2 )
            // InternalFoo.g:4212:3: rule__Comparison__RightMemberAssignment_2
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
    // InternalFoo.g:4221:1: rule__PSignature__Group__0 : rule__PSignature__Group__0__Impl rule__PSignature__Group__1 ;
    public final void rule__PSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4225:1: ( rule__PSignature__Group__0__Impl rule__PSignature__Group__1 )
            // InternalFoo.g:4226:2: rule__PSignature__Group__0__Impl rule__PSignature__Group__1
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
    // InternalFoo.g:4233:1: rule__PSignature__Group__0__Impl : ( ( rule__PSignature__TypeAssignment_0 ) ) ;
    public final void rule__PSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4237:1: ( ( ( rule__PSignature__TypeAssignment_0 ) ) )
            // InternalFoo.g:4238:1: ( ( rule__PSignature__TypeAssignment_0 ) )
            {
            // InternalFoo.g:4238:1: ( ( rule__PSignature__TypeAssignment_0 ) )
            // InternalFoo.g:4239:2: ( rule__PSignature__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getTypeAssignment_0()); 
            }
            // InternalFoo.g:4240:2: ( rule__PSignature__TypeAssignment_0 )
            // InternalFoo.g:4240:3: rule__PSignature__TypeAssignment_0
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
    // InternalFoo.g:4248:1: rule__PSignature__Group__1 : rule__PSignature__Group__1__Impl rule__PSignature__Group__2 ;
    public final void rule__PSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4252:1: ( rule__PSignature__Group__1__Impl rule__PSignature__Group__2 )
            // InternalFoo.g:4253:2: rule__PSignature__Group__1__Impl rule__PSignature__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalFoo.g:4260:1: rule__PSignature__Group__1__Impl : ( ( rule__PSignature__NameAssignment_1 ) ) ;
    public final void rule__PSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4264:1: ( ( ( rule__PSignature__NameAssignment_1 ) ) )
            // InternalFoo.g:4265:1: ( ( rule__PSignature__NameAssignment_1 ) )
            {
            // InternalFoo.g:4265:1: ( ( rule__PSignature__NameAssignment_1 ) )
            // InternalFoo.g:4266:2: ( rule__PSignature__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getNameAssignment_1()); 
            }
            // InternalFoo.g:4267:2: ( rule__PSignature__NameAssignment_1 )
            // InternalFoo.g:4267:3: rule__PSignature__NameAssignment_1
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
    // InternalFoo.g:4275:1: rule__PSignature__Group__2 : rule__PSignature__Group__2__Impl rule__PSignature__Group__3 ;
    public final void rule__PSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4279:1: ( rule__PSignature__Group__2__Impl rule__PSignature__Group__3 )
            // InternalFoo.g:4280:2: rule__PSignature__Group__2__Impl rule__PSignature__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalFoo.g:4287:1: rule__PSignature__Group__2__Impl : ( '(' ) ;
    public final void rule__PSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4291:1: ( ( '(' ) )
            // InternalFoo.g:4292:1: ( '(' )
            {
            // InternalFoo.g:4292:1: ( '(' )
            // InternalFoo.g:4293:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:4302:1: rule__PSignature__Group__3 : rule__PSignature__Group__3__Impl rule__PSignature__Group__4 ;
    public final void rule__PSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4306:1: ( rule__PSignature__Group__3__Impl rule__PSignature__Group__4 )
            // InternalFoo.g:4307:2: rule__PSignature__Group__3__Impl rule__PSignature__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalFoo.g:4314:1: rule__PSignature__Group__3__Impl : ( ( rule__PSignature__ParametersAssignment_3 )? ) ;
    public final void rule__PSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4318:1: ( ( ( rule__PSignature__ParametersAssignment_3 )? ) )
            // InternalFoo.g:4319:1: ( ( rule__PSignature__ParametersAssignment_3 )? )
            {
            // InternalFoo.g:4319:1: ( ( rule__PSignature__ParametersAssignment_3 )? )
            // InternalFoo.g:4320:2: ( rule__PSignature__ParametersAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getParametersAssignment_3()); 
            }
            // InternalFoo.g:4321:2: ( rule__PSignature__ParametersAssignment_3 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalFoo.g:4321:3: rule__PSignature__ParametersAssignment_3
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
    // InternalFoo.g:4329:1: rule__PSignature__Group__4 : rule__PSignature__Group__4__Impl rule__PSignature__Group__5 ;
    public final void rule__PSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4333:1: ( rule__PSignature__Group__4__Impl rule__PSignature__Group__5 )
            // InternalFoo.g:4334:2: rule__PSignature__Group__4__Impl rule__PSignature__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalFoo.g:4341:1: rule__PSignature__Group__4__Impl : ( ( rule__PSignature__Group_4__0 )* ) ;
    public final void rule__PSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4345:1: ( ( ( rule__PSignature__Group_4__0 )* ) )
            // InternalFoo.g:4346:1: ( ( rule__PSignature__Group_4__0 )* )
            {
            // InternalFoo.g:4346:1: ( ( rule__PSignature__Group_4__0 )* )
            // InternalFoo.g:4347:2: ( rule__PSignature__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getGroup_4()); 
            }
            // InternalFoo.g:4348:2: ( rule__PSignature__Group_4__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==35) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalFoo.g:4348:3: rule__PSignature__Group_4__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__PSignature__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalFoo.g:4356:1: rule__PSignature__Group__5 : rule__PSignature__Group__5__Impl ;
    public final void rule__PSignature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4360:1: ( rule__PSignature__Group__5__Impl )
            // InternalFoo.g:4361:2: rule__PSignature__Group__5__Impl
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
    // InternalFoo.g:4367:1: rule__PSignature__Group__5__Impl : ( ')' ) ;
    public final void rule__PSignature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4371:1: ( ( ')' ) )
            // InternalFoo.g:4372:1: ( ')' )
            {
            // InternalFoo.g:4372:1: ( ')' )
            // InternalFoo.g:4373:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:4383:1: rule__PSignature__Group_4__0 : rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1 ;
    public final void rule__PSignature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4387:1: ( rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1 )
            // InternalFoo.g:4388:2: rule__PSignature__Group_4__0__Impl rule__PSignature__Group_4__1
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
    // InternalFoo.g:4395:1: rule__PSignature__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PSignature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4399:1: ( ( ',' ) )
            // InternalFoo.g:4400:1: ( ',' )
            {
            // InternalFoo.g:4400:1: ( ',' )
            // InternalFoo.g:4401:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getCommaKeyword_4_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:4410:1: rule__PSignature__Group_4__1 : rule__PSignature__Group_4__1__Impl ;
    public final void rule__PSignature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4414:1: ( rule__PSignature__Group_4__1__Impl )
            // InternalFoo.g:4415:2: rule__PSignature__Group_4__1__Impl
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
    // InternalFoo.g:4421:1: rule__PSignature__Group_4__1__Impl : ( ( rule__PSignature__ParametersAssignment_4_1 ) ) ;
    public final void rule__PSignature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4425:1: ( ( ( rule__PSignature__ParametersAssignment_4_1 ) ) )
            // InternalFoo.g:4426:1: ( ( rule__PSignature__ParametersAssignment_4_1 ) )
            {
            // InternalFoo.g:4426:1: ( ( rule__PSignature__ParametersAssignment_4_1 ) )
            // InternalFoo.g:4427:2: ( rule__PSignature__ParametersAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPSignatureAccess().getParametersAssignment_4_1()); 
            }
            // InternalFoo.g:4428:2: ( rule__PSignature__ParametersAssignment_4_1 )
            // InternalFoo.g:4428:3: rule__PSignature__ParametersAssignment_4_1
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
    // InternalFoo.g:4437:1: rule__MRequiredService__Group__0 : rule__MRequiredService__Group__0__Impl rule__MRequiredService__Group__1 ;
    public final void rule__MRequiredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4441:1: ( rule__MRequiredService__Group__0__Impl rule__MRequiredService__Group__1 )
            // InternalFoo.g:4442:2: rule__MRequiredService__Group__0__Impl rule__MRequiredService__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalFoo.g:4449:1: rule__MRequiredService__Group__0__Impl : ( 'service' ) ;
    public final void rule__MRequiredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4453:1: ( ( 'service' ) )
            // InternalFoo.g:4454:1: ( 'service' )
            {
            // InternalFoo.g:4454:1: ( 'service' )
            // InternalFoo.g:4455:2: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRequiredServiceAccess().getServiceKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:4464:1: rule__MRequiredService__Group__1 : rule__MRequiredService__Group__1__Impl rule__MRequiredService__Group__2 ;
    public final void rule__MRequiredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4468:1: ( rule__MRequiredService__Group__1__Impl rule__MRequiredService__Group__2 )
            // InternalFoo.g:4469:2: rule__MRequiredService__Group__1__Impl rule__MRequiredService__Group__2
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
    // InternalFoo.g:4476:1: rule__MRequiredService__Group__1__Impl : ( 'required' ) ;
    public final void rule__MRequiredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4480:1: ( ( 'required' ) )
            // InternalFoo.g:4481:1: ( 'required' )
            {
            // InternalFoo.g:4481:1: ( 'required' )
            // InternalFoo.g:4482:2: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRequiredServiceAccess().getRequiredKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:4491:1: rule__MRequiredService__Group__2 : rule__MRequiredService__Group__2__Impl rule__MRequiredService__Group__3 ;
    public final void rule__MRequiredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4495:1: ( rule__MRequiredService__Group__2__Impl rule__MRequiredService__Group__3 )
            // InternalFoo.g:4496:2: rule__MRequiredService__Group__2__Impl rule__MRequiredService__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalFoo.g:4503:1: rule__MRequiredService__Group__2__Impl : ( ( rule__MRequiredService__SignatureAssignment_2 ) ) ;
    public final void rule__MRequiredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4507:1: ( ( ( rule__MRequiredService__SignatureAssignment_2 ) ) )
            // InternalFoo.g:4508:1: ( ( rule__MRequiredService__SignatureAssignment_2 ) )
            {
            // InternalFoo.g:4508:1: ( ( rule__MRequiredService__SignatureAssignment_2 ) )
            // InternalFoo.g:4509:2: ( rule__MRequiredService__SignatureAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRequiredServiceAccess().getSignatureAssignment_2()); 
            }
            // InternalFoo.g:4510:2: ( rule__MRequiredService__SignatureAssignment_2 )
            // InternalFoo.g:4510:3: rule__MRequiredService__SignatureAssignment_2
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
    // InternalFoo.g:4518:1: rule__MRequiredService__Group__3 : rule__MRequiredService__Group__3__Impl ;
    public final void rule__MRequiredService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4522:1: ( rule__MRequiredService__Group__3__Impl )
            // InternalFoo.g:4523:2: rule__MRequiredService__Group__3__Impl
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
    // InternalFoo.g:4529:1: rule__MRequiredService__Group__3__Impl : ( ';' ) ;
    public final void rule__MRequiredService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4533:1: ( ( ';' ) )
            // InternalFoo.g:4534:1: ( ';' )
            {
            // InternalFoo.g:4534:1: ( ';' )
            // InternalFoo.g:4535:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMRequiredServiceAccess().getSemicolonKeyword_3()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:4545:1: rule__RSignature__Group__0 : rule__RSignature__Group__0__Impl rule__RSignature__Group__1 ;
    public final void rule__RSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4549:1: ( rule__RSignature__Group__0__Impl rule__RSignature__Group__1 )
            // InternalFoo.g:4550:2: rule__RSignature__Group__0__Impl rule__RSignature__Group__1
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
    // InternalFoo.g:4557:1: rule__RSignature__Group__0__Impl : ( ( rule__RSignature__TypeAssignment_0 ) ) ;
    public final void rule__RSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4561:1: ( ( ( rule__RSignature__TypeAssignment_0 ) ) )
            // InternalFoo.g:4562:1: ( ( rule__RSignature__TypeAssignment_0 ) )
            {
            // InternalFoo.g:4562:1: ( ( rule__RSignature__TypeAssignment_0 ) )
            // InternalFoo.g:4563:2: ( rule__RSignature__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getTypeAssignment_0()); 
            }
            // InternalFoo.g:4564:2: ( rule__RSignature__TypeAssignment_0 )
            // InternalFoo.g:4564:3: rule__RSignature__TypeAssignment_0
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
    // InternalFoo.g:4572:1: rule__RSignature__Group__1 : rule__RSignature__Group__1__Impl rule__RSignature__Group__2 ;
    public final void rule__RSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4576:1: ( rule__RSignature__Group__1__Impl rule__RSignature__Group__2 )
            // InternalFoo.g:4577:2: rule__RSignature__Group__1__Impl rule__RSignature__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalFoo.g:4584:1: rule__RSignature__Group__1__Impl : ( ( rule__RSignature__NameAssignment_1 ) ) ;
    public final void rule__RSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4588:1: ( ( ( rule__RSignature__NameAssignment_1 ) ) )
            // InternalFoo.g:4589:1: ( ( rule__RSignature__NameAssignment_1 ) )
            {
            // InternalFoo.g:4589:1: ( ( rule__RSignature__NameAssignment_1 ) )
            // InternalFoo.g:4590:2: ( rule__RSignature__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getNameAssignment_1()); 
            }
            // InternalFoo.g:4591:2: ( rule__RSignature__NameAssignment_1 )
            // InternalFoo.g:4591:3: rule__RSignature__NameAssignment_1
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
    // InternalFoo.g:4599:1: rule__RSignature__Group__2 : rule__RSignature__Group__2__Impl rule__RSignature__Group__3 ;
    public final void rule__RSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4603:1: ( rule__RSignature__Group__2__Impl rule__RSignature__Group__3 )
            // InternalFoo.g:4604:2: rule__RSignature__Group__2__Impl rule__RSignature__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalFoo.g:4611:1: rule__RSignature__Group__2__Impl : ( '(' ) ;
    public final void rule__RSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4615:1: ( ( '(' ) )
            // InternalFoo.g:4616:1: ( '(' )
            {
            // InternalFoo.g:4616:1: ( '(' )
            // InternalFoo.g:4617:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:4626:1: rule__RSignature__Group__3 : rule__RSignature__Group__3__Impl rule__RSignature__Group__4 ;
    public final void rule__RSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4630:1: ( rule__RSignature__Group__3__Impl rule__RSignature__Group__4 )
            // InternalFoo.g:4631:2: rule__RSignature__Group__3__Impl rule__RSignature__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalFoo.g:4638:1: rule__RSignature__Group__3__Impl : ( ( rule__RSignature__ParametersAssignment_3 )? ) ;
    public final void rule__RSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4642:1: ( ( ( rule__RSignature__ParametersAssignment_3 )? ) )
            // InternalFoo.g:4643:1: ( ( rule__RSignature__ParametersAssignment_3 )? )
            {
            // InternalFoo.g:4643:1: ( ( rule__RSignature__ParametersAssignment_3 )? )
            // InternalFoo.g:4644:2: ( rule__RSignature__ParametersAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getParametersAssignment_3()); 
            }
            // InternalFoo.g:4645:2: ( rule__RSignature__ParametersAssignment_3 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalFoo.g:4645:3: rule__RSignature__ParametersAssignment_3
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
    // InternalFoo.g:4653:1: rule__RSignature__Group__4 : rule__RSignature__Group__4__Impl rule__RSignature__Group__5 ;
    public final void rule__RSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4657:1: ( rule__RSignature__Group__4__Impl rule__RSignature__Group__5 )
            // InternalFoo.g:4658:2: rule__RSignature__Group__4__Impl rule__RSignature__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalFoo.g:4665:1: rule__RSignature__Group__4__Impl : ( ( rule__RSignature__Group_4__0 )* ) ;
    public final void rule__RSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4669:1: ( ( ( rule__RSignature__Group_4__0 )* ) )
            // InternalFoo.g:4670:1: ( ( rule__RSignature__Group_4__0 )* )
            {
            // InternalFoo.g:4670:1: ( ( rule__RSignature__Group_4__0 )* )
            // InternalFoo.g:4671:2: ( rule__RSignature__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getGroup_4()); 
            }
            // InternalFoo.g:4672:2: ( rule__RSignature__Group_4__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==35) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalFoo.g:4672:3: rule__RSignature__Group_4__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__RSignature__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalFoo.g:4680:1: rule__RSignature__Group__5 : rule__RSignature__Group__5__Impl ;
    public final void rule__RSignature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4684:1: ( rule__RSignature__Group__5__Impl )
            // InternalFoo.g:4685:2: rule__RSignature__Group__5__Impl
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
    // InternalFoo.g:4691:1: rule__RSignature__Group__5__Impl : ( ')' ) ;
    public final void rule__RSignature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4695:1: ( ( ')' ) )
            // InternalFoo.g:4696:1: ( ')' )
            {
            // InternalFoo.g:4696:1: ( ')' )
            // InternalFoo.g:4697:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:4707:1: rule__RSignature__Group_4__0 : rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1 ;
    public final void rule__RSignature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4711:1: ( rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1 )
            // InternalFoo.g:4712:2: rule__RSignature__Group_4__0__Impl rule__RSignature__Group_4__1
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
    // InternalFoo.g:4719:1: rule__RSignature__Group_4__0__Impl : ( ',' ) ;
    public final void rule__RSignature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4723:1: ( ( ',' ) )
            // InternalFoo.g:4724:1: ( ',' )
            {
            // InternalFoo.g:4724:1: ( ',' )
            // InternalFoo.g:4725:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getCommaKeyword_4_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:4734:1: rule__RSignature__Group_4__1 : rule__RSignature__Group_4__1__Impl ;
    public final void rule__RSignature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4738:1: ( rule__RSignature__Group_4__1__Impl )
            // InternalFoo.g:4739:2: rule__RSignature__Group_4__1__Impl
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
    // InternalFoo.g:4745:1: rule__RSignature__Group_4__1__Impl : ( ( rule__RSignature__ParametersAssignment_4_1 ) ) ;
    public final void rule__RSignature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4749:1: ( ( ( rule__RSignature__ParametersAssignment_4_1 ) ) )
            // InternalFoo.g:4750:1: ( ( rule__RSignature__ParametersAssignment_4_1 ) )
            {
            // InternalFoo.g:4750:1: ( ( rule__RSignature__ParametersAssignment_4_1 ) )
            // InternalFoo.g:4751:2: ( rule__RSignature__ParametersAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRSignatureAccess().getParametersAssignment_4_1()); 
            }
            // InternalFoo.g:4752:2: ( rule__RSignature__ParametersAssignment_4_1 )
            // InternalFoo.g:4752:3: rule__RSignature__ParametersAssignment_4_1
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
    // InternalFoo.g:4761:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4765:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalFoo.g:4766:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalFoo.g:4773:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4777:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalFoo.g:4778:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalFoo.g:4778:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalFoo.g:4779:2: ( rule__Parameter__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            }
            // InternalFoo.g:4780:2: ( rule__Parameter__NameAssignment_0 )
            // InternalFoo.g:4780:3: rule__Parameter__NameAssignment_0
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
    // InternalFoo.g:4788:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4792:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalFoo.g:4793:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalFoo.g:4800:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4804:1: ( ( ':' ) )
            // InternalFoo.g:4805:1: ( ':' )
            {
            // InternalFoo.g:4805:1: ( ':' )
            // InternalFoo.g:4806:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalFoo.g:4815:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4819:1: ( rule__Parameter__Group__2__Impl )
            // InternalFoo.g:4820:2: rule__Parameter__Group__2__Impl
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
    // InternalFoo.g:4826:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4830:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalFoo.g:4831:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalFoo.g:4831:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalFoo.g:4832:2: ( rule__Parameter__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            }
            // InternalFoo.g:4833:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalFoo.g:4833:3: rule__Parameter__TypeAssignment_2
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
    // InternalFoo.g:4842:1: rule__DomainModel__ModelAssignment : ( ruleModel ) ;
    public final void rule__DomainModel__ModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4846:1: ( ( ruleModel ) )
            // InternalFoo.g:4847:2: ( ruleModel )
            {
            // InternalFoo.g:4847:2: ( ruleModel )
            // InternalFoo.g:4848:3: ruleModel
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
    // InternalFoo.g:4857:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4861:1: ( ( ruleQualifiedName ) )
            // InternalFoo.g:4862:2: ( ruleQualifiedName )
            {
            // InternalFoo.g:4862:2: ( ruleQualifiedName )
            // InternalFoo.g:4863:3: ruleQualifiedName
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
    // InternalFoo.g:4872:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4876:1: ( ( ruleImport ) )
            // InternalFoo.g:4877:2: ( ruleImport )
            {
            // InternalFoo.g:4877:2: ( ruleImport )
            // InternalFoo.g:4878:3: ruleImport
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
    // InternalFoo.g:4887:1: rule__Model__ComponentsAssignment_4 : ( ruleComponent ) ;
    public final void rule__Model__ComponentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4891:1: ( ( ruleComponent ) )
            // InternalFoo.g:4892:2: ( ruleComponent )
            {
            // InternalFoo.g:4892:2: ( ruleComponent )
            // InternalFoo.g:4893:3: ruleComponent
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
    // InternalFoo.g:4902:1: rule__Model__AssemblyAssignment_5 : ( ruleAssembly ) ;
    public final void rule__Model__AssemblyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4906:1: ( ( ruleAssembly ) )
            // InternalFoo.g:4907:2: ( ruleAssembly )
            {
            // InternalFoo.g:4907:2: ( ruleAssembly )
            // InternalFoo.g:4908:3: ruleAssembly
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


    // $ANTLR start "rule__Model__RefiningListAssignment_6"
    // InternalFoo.g:4917:1: rule__Model__RefiningListAssignment_6 : ( ruleRefine ) ;
    public final void rule__Model__RefiningListAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4921:1: ( ( ruleRefine ) )
            // InternalFoo.g:4922:2: ( ruleRefine )
            {
            // InternalFoo.g:4922:2: ( ruleRefine )
            // InternalFoo.g:4923:3: ruleRefine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRefiningListRefineParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRefine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRefiningListRefineParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Model__RefiningListAssignment_6"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalFoo.g:4932:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4936:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalFoo.g:4937:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalFoo.g:4937:2: ( ruleQualifiedNameWithWildcard )
            // InternalFoo.g:4938:3: ruleQualifiedNameWithWildcard
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


    // $ANTLR start "rule__Refine__EltToRefineAssignment_1"
    // InternalFoo.g:4947:1: rule__Refine__EltToRefineAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Refine__EltToRefineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4951:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:4952:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:4952:2: ( ( RULE_ID ) )
            // InternalFoo.g:4953:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefineAccess().getEltToRefineElementCrossReference_1_0()); 
            }
            // InternalFoo.g:4954:3: ( RULE_ID )
            // InternalFoo.g:4955:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefineAccess().getEltToRefineElementIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefineAccess().getEltToRefineElementIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefineAccess().getEltToRefineElementCrossReference_1_0()); 
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
    // $ANTLR end "rule__Refine__EltToRefineAssignment_1"


    // $ANTLR start "rule__Refine__RefiningEltAssignment_3"
    // InternalFoo.g:4966:1: rule__Refine__RefiningEltAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Refine__RefiningEltAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4970:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:4971:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:4971:2: ( ( RULE_ID ) )
            // InternalFoo.g:4972:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefineAccess().getRefiningEltElementCrossReference_3_0()); 
            }
            // InternalFoo.g:4973:3: ( RULE_ID )
            // InternalFoo.g:4974:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefineAccess().getRefiningEltElementIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefineAccess().getRefiningEltElementIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefineAccess().getRefiningEltElementCrossReference_3_0()); 
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
    // $ANTLR end "rule__Refine__RefiningEltAssignment_3"


    // $ANTLR start "rule__Assembly__NameAssignment_2"
    // InternalFoo.g:4985:1: rule__Assembly__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Assembly__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:4989:1: ( ( RULE_ID ) )
            // InternalFoo.g:4990:2: ( RULE_ID )
            {
            // InternalFoo.g:4990:2: ( RULE_ID )
            // InternalFoo.g:4991:3: RULE_ID
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
    // InternalFoo.g:5000:1: rule__Assembly__AttributesAssignment_5 : ( ruleComponentInstance ) ;
    public final void rule__Assembly__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5004:1: ( ( ruleComponentInstance ) )
            // InternalFoo.g:5005:2: ( ruleComponentInstance )
            {
            // InternalFoo.g:5005:2: ( ruleComponentInstance )
            // InternalFoo.g:5006:3: ruleComponentInstance
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
    // InternalFoo.g:5015:1: rule__Assembly__AttributesAssignment_6 : ( ruleComponentInstance ) ;
    public final void rule__Assembly__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5019:1: ( ( ruleComponentInstance ) )
            // InternalFoo.g:5020:2: ( ruleComponentInstance )
            {
            // InternalFoo.g:5020:2: ( ruleComponentInstance )
            // InternalFoo.g:5021:3: ruleComponentInstance
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
    // InternalFoo.g:5030:1: rule__Assembly__BindingsAssignment_8 : ( ruleBinding ) ;
    public final void rule__Assembly__BindingsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5034:1: ( ( ruleBinding ) )
            // InternalFoo.g:5035:2: ( ruleBinding )
            {
            // InternalFoo.g:5035:2: ( ruleBinding )
            // InternalFoo.g:5036:3: ruleBinding
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
    // InternalFoo.g:5045:1: rule__ComponentInstance__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ComponentInstance__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5049:1: ( ( RULE_ID ) )
            // InternalFoo.g:5050:2: ( RULE_ID )
            {
            // InternalFoo.g:5050:2: ( RULE_ID )
            // InternalFoo.g:5051:3: RULE_ID
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
    // InternalFoo.g:5060:1: rule__ComponentInstance__ComponentAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComponentInstance__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5064:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:5065:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:5065:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:5066:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentInstanceAccess().getComponentComponentCrossReference_2_0()); 
            }
            // InternalFoo.g:5067:3: ( ruleQualifiedName )
            // InternalFoo.g:5068:4: ruleQualifiedName
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
    // InternalFoo.g:5079:1: rule__Binding__BindingRequiredAssignment_0 : ( ruleBindingRequired ) ;
    public final void rule__Binding__BindingRequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5083:1: ( ( ruleBindingRequired ) )
            // InternalFoo.g:5084:2: ( ruleBindingRequired )
            {
            // InternalFoo.g:5084:2: ( ruleBindingRequired )
            // InternalFoo.g:5085:3: ruleBindingRequired
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
    // InternalFoo.g:5094:1: rule__Binding__BindingProvidedAssignment_2 : ( ruleBindingProvided ) ;
    public final void rule__Binding__BindingProvidedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5098:1: ( ( ruleBindingProvided ) )
            // InternalFoo.g:5099:2: ( ruleBindingProvided )
            {
            // InternalFoo.g:5099:2: ( ruleBindingProvided )
            // InternalFoo.g:5100:3: ruleBindingProvided
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
    // InternalFoo.g:5109:1: rule__BindingRequired__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BindingRequired__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5113:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:5114:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:5114:2: ( ( RULE_ID ) )
            // InternalFoo.g:5115:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRequiredAccess().getNameComponentInstanceCrossReference_0_0()); 
            }
            // InternalFoo.g:5116:3: ( RULE_ID )
            // InternalFoo.g:5117:4: RULE_ID
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
    // InternalFoo.g:5128:1: rule__BindingRequired__ServiceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingRequired__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5132:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:5133:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:5133:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:5134:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRequiredAccess().getServiceRSignatureCrossReference_2_0()); 
            }
            // InternalFoo.g:5135:3: ( ruleQualifiedName )
            // InternalFoo.g:5136:4: ruleQualifiedName
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
    // InternalFoo.g:5147:1: rule__BindingProvided__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BindingProvided__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5151:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:5152:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:5152:2: ( ( RULE_ID ) )
            // InternalFoo.g:5153:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingProvidedAccess().getNameComponentInstanceCrossReference_0_0()); 
            }
            // InternalFoo.g:5154:3: ( RULE_ID )
            // InternalFoo.g:5155:4: RULE_ID
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
    // InternalFoo.g:5166:1: rule__BindingProvided__ServiceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BindingProvided__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5170:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:5171:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:5171:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:5172:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingProvidedAccess().getServicePSignatureCrossReference_2_0()); 
            }
            // InternalFoo.g:5173:3: ( ruleQualifiedName )
            // InternalFoo.g:5174:4: ruleQualifiedName
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
    // InternalFoo.g:5185:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5189:1: ( ( RULE_ID ) )
            // InternalFoo.g:5190:2: ( RULE_ID )
            {
            // InternalFoo.g:5190:2: ( RULE_ID )
            // InternalFoo.g:5191:3: RULE_ID
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


    // $ANTLR start "rule__Component__ListOfPServicesAssignment_3"
    // InternalFoo.g:5200:1: rule__Component__ListOfPServicesAssignment_3 : ( ruleListOfProvidedServices ) ;
    public final void rule__Component__ListOfPServicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5204:1: ( ( ruleListOfProvidedServices ) )
            // InternalFoo.g:5205:2: ( ruleListOfProvidedServices )
            {
            // InternalFoo.g:5205:2: ( ruleListOfProvidedServices )
            // InternalFoo.g:5206:3: ruleListOfProvidedServices
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getListOfPServicesListOfProvidedServicesParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListOfProvidedServices();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getListOfPServicesListOfProvidedServicesParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Component__ListOfPServicesAssignment_3"


    // $ANTLR start "rule__Component__ListOfRServicesAssignment_4"
    // InternalFoo.g:5215:1: rule__Component__ListOfRServicesAssignment_4 : ( ruleListOfrequiredServices ) ;
    public final void rule__Component__ListOfRServicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5219:1: ( ( ruleListOfrequiredServices ) )
            // InternalFoo.g:5220:2: ( ruleListOfrequiredServices )
            {
            // InternalFoo.g:5220:2: ( ruleListOfrequiredServices )
            // InternalFoo.g:5221:3: ruleListOfrequiredServices
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getListOfRServicesListOfrequiredServicesParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListOfrequiredServices();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getListOfRServicesListOfrequiredServicesParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Component__ListOfRServicesAssignment_4"


    // $ANTLR start "rule__Component__MProvServicesAssignment_5"
    // InternalFoo.g:5230:1: rule__Component__MProvServicesAssignment_5 : ( ruleMProvidedService ) ;
    public final void rule__Component__MProvServicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5234:1: ( ( ruleMProvidedService ) )
            // InternalFoo.g:5235:2: ( ruleMProvidedService )
            {
            // InternalFoo.g:5235:2: ( ruleMProvidedService )
            // InternalFoo.g:5236:3: ruleMProvidedService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getMProvServicesMProvidedServiceParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMProvidedService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getMProvServicesMProvidedServiceParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Component__MProvServicesAssignment_5"


    // $ANTLR start "rule__Component__MReqServicesAssignment_6"
    // InternalFoo.g:5245:1: rule__Component__MReqServicesAssignment_6 : ( ruleMRequiredService ) ;
    public final void rule__Component__MReqServicesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5249:1: ( ( ruleMRequiredService ) )
            // InternalFoo.g:5250:2: ( ruleMRequiredService )
            {
            // InternalFoo.g:5250:2: ( ruleMRequiredService )
            // InternalFoo.g:5251:3: ruleMRequiredService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getMReqServicesMRequiredServiceParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMRequiredService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getMReqServicesMRequiredServiceParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Component__MReqServicesAssignment_6"


    // $ANTLR start "rule__Component__AssembliesAssignment_7_1"
    // InternalFoo.g:5260:1: rule__Component__AssembliesAssignment_7_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Component__AssembliesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5264:1: ( ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:5265:2: ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:5265:2: ( ( ruleQualifiedName ) )
            // InternalFoo.g:5266:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getAssembliesAssemblyCrossReference_7_1_0()); 
            }
            // InternalFoo.g:5267:3: ( ruleQualifiedName )
            // InternalFoo.g:5268:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getAssembliesAssemblyQualifiedNameParserRuleCall_7_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getAssembliesAssemblyQualifiedNameParserRuleCall_7_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getAssembliesAssemblyCrossReference_7_1_0()); 
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
    // $ANTLR end "rule__Component__AssembliesAssignment_7_1"


    // $ANTLR start "rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0"
    // InternalFoo.g:5279:1: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0 : ( ruleProvidedService ) ;
    public final void rule__ListOfProvidedServices__ProvidedServicesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5283:1: ( ( ruleProvidedService ) )
            // InternalFoo.g:5284:2: ( ruleProvidedService )
            {
            // InternalFoo.g:5284:2: ( ruleProvidedService )
            // InternalFoo.g:5285:3: ruleProvidedService
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
    // InternalFoo.g:5294:1: rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1 : ( ruleProvidedService ) ;
    public final void rule__ListOfProvidedServices__ProvidedServicesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5298:1: ( ( ruleProvidedService ) )
            // InternalFoo.g:5299:2: ( ruleProvidedService )
            {
            // InternalFoo.g:5299:2: ( ruleProvidedService )
            // InternalFoo.g:5300:3: ruleProvidedService
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
    // InternalFoo.g:5309:1: rule__ProvidedService__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ProvidedService__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5313:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:5314:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:5314:2: ( ( RULE_ID ) )
            // InternalFoo.g:5315:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProvidedServiceAccess().getNamePSignatureCrossReference_0()); 
            }
            // InternalFoo.g:5316:3: ( RULE_ID )
            // InternalFoo.g:5317:4: RULE_ID
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
    // InternalFoo.g:5328:1: rule__ListOfrequiredServices__RequiredServicesAssignment_4_0 : ( ruleRequiredService ) ;
    public final void rule__ListOfrequiredServices__RequiredServicesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5332:1: ( ( ruleRequiredService ) )
            // InternalFoo.g:5333:2: ( ruleRequiredService )
            {
            // InternalFoo.g:5333:2: ( ruleRequiredService )
            // InternalFoo.g:5334:3: ruleRequiredService
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
    // InternalFoo.g:5343:1: rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1 : ( ruleRequiredService ) ;
    public final void rule__ListOfrequiredServices__RequiredServicesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5347:1: ( ( ruleRequiredService ) )
            // InternalFoo.g:5348:2: ( ruleRequiredService )
            {
            // InternalFoo.g:5348:2: ( ruleRequiredService )
            // InternalFoo.g:5349:3: ruleRequiredService
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
    // InternalFoo.g:5358:1: rule__RequiredService__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RequiredService__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5362:1: ( ( ( RULE_ID ) ) )
            // InternalFoo.g:5363:2: ( ( RULE_ID ) )
            {
            // InternalFoo.g:5363:2: ( ( RULE_ID ) )
            // InternalFoo.g:5364:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameRSignatureCrossReference_0()); 
            }
            // InternalFoo.g:5365:3: ( RULE_ID )
            // InternalFoo.g:5366:4: RULE_ID
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
    // InternalFoo.g:5377:1: rule__MProvidedService__SignatureAssignment_2 : ( rulePSignature ) ;
    public final void rule__MProvidedService__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5381:1: ( ( rulePSignature ) )
            // InternalFoo.g:5382:2: ( rulePSignature )
            {
            // InternalFoo.g:5382:2: ( rulePSignature )
            // InternalFoo.g:5383:3: rulePSignature
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
    // InternalFoo.g:5392:1: rule__MProvidedService__ExpressionsAssignment_4 : ( ruleExpression ) ;
    public final void rule__MProvidedService__ExpressionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5396:1: ( ( ruleExpression ) )
            // InternalFoo.g:5397:2: ( ruleExpression )
            {
            // InternalFoo.g:5397:2: ( ruleExpression )
            // InternalFoo.g:5398:3: ruleExpression
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
    // InternalFoo.g:5407:1: rule__If__ConditionsAssignment_2_0 : ( ruleCondition ) ;
    public final void rule__If__ConditionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5411:1: ( ( ruleCondition ) )
            // InternalFoo.g:5412:2: ( ruleCondition )
            {
            // InternalFoo.g:5412:2: ( ruleCondition )
            // InternalFoo.g:5413:3: ruleCondition
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
    // InternalFoo.g:5422:1: rule__If__ConditionsAssignment_3 : ( ruleCondition ) ;
    public final void rule__If__ConditionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5426:1: ( ( ruleCondition ) )
            // InternalFoo.g:5427:2: ( ruleCondition )
            {
            // InternalFoo.g:5427:2: ( ruleCondition )
            // InternalFoo.g:5428:3: ruleCondition
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


    // $ANTLR start "rule__If__StrAssignment_6_0"
    // InternalFoo.g:5437:1: rule__If__StrAssignment_6_0 : ( ruleStr ) ;
    public final void rule__If__StrAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5441:1: ( ( ruleStr ) )
            // InternalFoo.g:5442:2: ( ruleStr )
            {
            // InternalFoo.g:5442:2: ( ruleStr )
            // InternalFoo.g:5443:3: ruleStr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getStrStrParserRuleCall_6_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getStrStrParserRuleCall_6_0_0()); 
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
    // $ANTLR end "rule__If__StrAssignment_6_0"


    // $ANTLR start "rule__If__IfAssignment_6_1"
    // InternalFoo.g:5452:1: rule__If__IfAssignment_6_1 : ( ruleIf ) ;
    public final void rule__If__IfAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5456:1: ( ( ruleIf ) )
            // InternalFoo.g:5457:2: ( ruleIf )
            {
            // InternalFoo.g:5457:2: ( ruleIf )
            // InternalFoo.g:5458:3: ruleIf
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
    // InternalFoo.g:5467:1: rule__If__WhileAssignment_6_2 : ( ruleWhile ) ;
    public final void rule__If__WhileAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5471:1: ( ( ruleWhile ) )
            // InternalFoo.g:5472:2: ( ruleWhile )
            {
            // InternalFoo.g:5472:2: ( ruleWhile )
            // InternalFoo.g:5473:3: ruleWhile
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
    // InternalFoo.g:5482:1: rule__If__ElseAssignment_8_1_0 : ( ruleIf ) ;
    public final void rule__If__ElseAssignment_8_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5486:1: ( ( ruleIf ) )
            // InternalFoo.g:5487:2: ( ruleIf )
            {
            // InternalFoo.g:5487:2: ( ruleIf )
            // InternalFoo.g:5488:3: ruleIf
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


    // $ANTLR start "rule__If__StrAssignment_8_1_1_1_0"
    // InternalFoo.g:5497:1: rule__If__StrAssignment_8_1_1_1_0 : ( ruleStr ) ;
    public final void rule__If__StrAssignment_8_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5501:1: ( ( ruleStr ) )
            // InternalFoo.g:5502:2: ( ruleStr )
            {
            // InternalFoo.g:5502:2: ( ruleStr )
            // InternalFoo.g:5503:3: ruleStr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getStrStrParserRuleCall_8_1_1_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getStrStrParserRuleCall_8_1_1_1_0_0()); 
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
    // $ANTLR end "rule__If__StrAssignment_8_1_1_1_0"


    // $ANTLR start "rule__If__IfAssignment_8_1_1_1_1"
    // InternalFoo.g:5512:1: rule__If__IfAssignment_8_1_1_1_1 : ( ruleIf ) ;
    public final void rule__If__IfAssignment_8_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5516:1: ( ( ruleIf ) )
            // InternalFoo.g:5517:2: ( ruleIf )
            {
            // InternalFoo.g:5517:2: ( ruleIf )
            // InternalFoo.g:5518:3: ruleIf
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
    // InternalFoo.g:5527:1: rule__If__WhileAssignment_8_1_1_1_2 : ( ruleWhile ) ;
    public final void rule__If__WhileAssignment_8_1_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5531:1: ( ( ruleWhile ) )
            // InternalFoo.g:5532:2: ( ruleWhile )
            {
            // InternalFoo.g:5532:2: ( ruleWhile )
            // InternalFoo.g:5533:3: ruleWhile
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
    // InternalFoo.g:5542:1: rule__While__ConditionsAssignment_2_0 : ( ruleCondition ) ;
    public final void rule__While__ConditionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5546:1: ( ( ruleCondition ) )
            // InternalFoo.g:5547:2: ( ruleCondition )
            {
            // InternalFoo.g:5547:2: ( ruleCondition )
            // InternalFoo.g:5548:3: ruleCondition
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
    // InternalFoo.g:5557:1: rule__While__ConditionsAssignment_3 : ( ruleCondition ) ;
    public final void rule__While__ConditionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5561:1: ( ( ruleCondition ) )
            // InternalFoo.g:5562:2: ( ruleCondition )
            {
            // InternalFoo.g:5562:2: ( ruleCondition )
            // InternalFoo.g:5563:3: ruleCondition
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


    // $ANTLR start "rule__While__StrAssignment_6_0"
    // InternalFoo.g:5572:1: rule__While__StrAssignment_6_0 : ( ruleStr ) ;
    public final void rule__While__StrAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5576:1: ( ( ruleStr ) )
            // InternalFoo.g:5577:2: ( ruleStr )
            {
            // InternalFoo.g:5577:2: ( ruleStr )
            // InternalFoo.g:5578:3: ruleStr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getStrStrParserRuleCall_6_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getStrStrParserRuleCall_6_0_0()); 
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
    // $ANTLR end "rule__While__StrAssignment_6_0"


    // $ANTLR start "rule__While__IfAssignment_6_1"
    // InternalFoo.g:5587:1: rule__While__IfAssignment_6_1 : ( ruleIf ) ;
    public final void rule__While__IfAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5591:1: ( ( ruleIf ) )
            // InternalFoo.g:5592:2: ( ruleIf )
            {
            // InternalFoo.g:5592:2: ( ruleIf )
            // InternalFoo.g:5593:3: ruleIf
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
    // InternalFoo.g:5602:1: rule__While__WhileAssignment_6_2 : ( ruleWhile ) ;
    public final void rule__While__WhileAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5606:1: ( ( ruleWhile ) )
            // InternalFoo.g:5607:2: ( ruleWhile )
            {
            // InternalFoo.g:5607:2: ( ruleWhile )
            // InternalFoo.g:5608:3: ruleWhile
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
    // InternalFoo.g:5617:1: rule__Condition__ConditionsAssignment_1_0 : ( ruleComparison ) ;
    public final void rule__Condition__ConditionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5621:1: ( ( ruleComparison ) )
            // InternalFoo.g:5622:2: ( ruleComparison )
            {
            // InternalFoo.g:5622:2: ( ruleComparison )
            // InternalFoo.g:5623:3: ruleComparison
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
    // InternalFoo.g:5632:1: rule__Condition__ConditionsAssignment_1_1 : ( ruleStr ) ;
    public final void rule__Condition__ConditionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5636:1: ( ( ruleStr ) )
            // InternalFoo.g:5637:2: ( ruleStr )
            {
            // InternalFoo.g:5637:2: ( ruleStr )
            // InternalFoo.g:5638:3: ruleStr
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
    // InternalFoo.g:5647:1: rule__Str__ValueAssignment_0 : ( RULE_ID ) ;
    public final void rule__Str__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5651:1: ( ( RULE_ID ) )
            // InternalFoo.g:5652:2: ( RULE_ID )
            {
            // InternalFoo.g:5652:2: ( RULE_ID )
            // InternalFoo.g:5653:3: RULE_ID
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
    // InternalFoo.g:5662:1: rule__Str__ValueAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Str__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5666:1: ( ( RULE_ID ) )
            // InternalFoo.g:5667:2: ( RULE_ID )
            {
            // InternalFoo.g:5667:2: ( RULE_ID )
            // InternalFoo.g:5668:3: RULE_ID
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
    // InternalFoo.g:5677:1: rule__Str__ValueAssignment_1_3 : ( RULE_ID ) ;
    public final void rule__Str__ValueAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5681:1: ( ( RULE_ID ) )
            // InternalFoo.g:5682:2: ( RULE_ID )
            {
            // InternalFoo.g:5682:2: ( RULE_ID )
            // InternalFoo.g:5683:3: RULE_ID
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
    // InternalFoo.g:5692:1: rule__Comparison__LeftMemberAssignment_0 : ( RULE_ID ) ;
    public final void rule__Comparison__LeftMemberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5696:1: ( ( RULE_ID ) )
            // InternalFoo.g:5697:2: ( RULE_ID )
            {
            // InternalFoo.g:5697:2: ( RULE_ID )
            // InternalFoo.g:5698:3: RULE_ID
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
    // InternalFoo.g:5707:1: rule__Comparison__RightMemberAssignment_2 : ( RULE_ID ) ;
    public final void rule__Comparison__RightMemberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5711:1: ( ( RULE_ID ) )
            // InternalFoo.g:5712:2: ( RULE_ID )
            {
            // InternalFoo.g:5712:2: ( RULE_ID )
            // InternalFoo.g:5713:3: RULE_ID
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
    // InternalFoo.g:5722:1: rule__PSignature__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__PSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5726:1: ( ( RULE_ID ) )
            // InternalFoo.g:5727:2: ( RULE_ID )
            {
            // InternalFoo.g:5727:2: ( RULE_ID )
            // InternalFoo.g:5728:3: RULE_ID
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
    // InternalFoo.g:5737:1: rule__PSignature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PSignature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5741:1: ( ( RULE_ID ) )
            // InternalFoo.g:5742:2: ( RULE_ID )
            {
            // InternalFoo.g:5742:2: ( RULE_ID )
            // InternalFoo.g:5743:3: RULE_ID
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
    // InternalFoo.g:5752:1: rule__PSignature__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__PSignature__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5756:1: ( ( ruleParameter ) )
            // InternalFoo.g:5757:2: ( ruleParameter )
            {
            // InternalFoo.g:5757:2: ( ruleParameter )
            // InternalFoo.g:5758:3: ruleParameter
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
    // InternalFoo.g:5767:1: rule__PSignature__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__PSignature__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5771:1: ( ( ruleParameter ) )
            // InternalFoo.g:5772:2: ( ruleParameter )
            {
            // InternalFoo.g:5772:2: ( ruleParameter )
            // InternalFoo.g:5773:3: ruleParameter
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
    // InternalFoo.g:5782:1: rule__MRequiredService__SignatureAssignment_2 : ( ruleRSignature ) ;
    public final void rule__MRequiredService__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5786:1: ( ( ruleRSignature ) )
            // InternalFoo.g:5787:2: ( ruleRSignature )
            {
            // InternalFoo.g:5787:2: ( ruleRSignature )
            // InternalFoo.g:5788:3: ruleRSignature
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
    // InternalFoo.g:5797:1: rule__RSignature__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__RSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5801:1: ( ( RULE_ID ) )
            // InternalFoo.g:5802:2: ( RULE_ID )
            {
            // InternalFoo.g:5802:2: ( RULE_ID )
            // InternalFoo.g:5803:3: RULE_ID
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
    // InternalFoo.g:5812:1: rule__RSignature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RSignature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5816:1: ( ( RULE_ID ) )
            // InternalFoo.g:5817:2: ( RULE_ID )
            {
            // InternalFoo.g:5817:2: ( RULE_ID )
            // InternalFoo.g:5818:3: RULE_ID
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
    // InternalFoo.g:5827:1: rule__RSignature__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__RSignature__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5831:1: ( ( ruleParameter ) )
            // InternalFoo.g:5832:2: ( ruleParameter )
            {
            // InternalFoo.g:5832:2: ( ruleParameter )
            // InternalFoo.g:5833:3: ruleParameter
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
    // InternalFoo.g:5842:1: rule__RSignature__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__RSignature__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5846:1: ( ( ruleParameter ) )
            // InternalFoo.g:5847:2: ( ruleParameter )
            {
            // InternalFoo.g:5847:2: ( ruleParameter )
            // InternalFoo.g:5848:3: ruleParameter
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
    // InternalFoo.g:5857:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5861:1: ( ( RULE_ID ) )
            // InternalFoo.g:5862:2: ( RULE_ID )
            {
            // InternalFoo.g:5862:2: ( RULE_ID )
            // InternalFoo.g:5863:3: RULE_ID
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
    // InternalFoo.g:5872:1: rule__Parameter__TypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoo.g:5876:1: ( ( RULE_ID ) )
            // InternalFoo.g:5877:2: ( RULE_ID )
            {
            // InternalFoo.g:5877:2: ( RULE_ID )
            // InternalFoo.g:5878:3: RULE_ID
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
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\6\4\2\uffff\5\4\1\47\11\4\1\47\1\4\1\50\2\4\1\50\1\4";
    static final String dfa_3s = "\1\53\1\4\1\54\1\4\1\50\1\54\2\uffff\5\4\1\47\1\4\1\50\5\4\2\50\1\47\2\50\1\54\2\50\1\54";
    static final String dfa_4s = "\6\uffff\1\2\1\1\26\uffff";
    static final String dfa_5s = "\36\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\46\uffff\1\1",
            "\1\2",
            "\1\5\6\uffff\2\7\1\10\1\11\1\12\1\13\1\14\3\uffff\1\3\22\uffff\1\6\3\uffff\1\4",
            "\1\15",
            "\1\5\6\uffff\2\7\33\uffff\1\6",
            "\1\5\6\uffff\2\7\1\20\1\21\1\22\1\23\1\24\3\uffff\1\16\22\uffff\1\6\3\uffff\1\17",
            "",
            "",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\5\6\uffff\2\7\33\uffff\1\6",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\5\6\uffff\2\7\33\uffff\1\6",
            "\1\31\43\uffff\1\32",
            "\1\33",
            "\1\5\6\uffff\2\7\33\uffff\1\6",
            "\1\32",
            "\1\5\6\uffff\2\7\10\uffff\1\3\22\uffff\1\6\3\uffff\1\4",
            "\1\34\43\uffff\1\35",
            "\1\35",
            "\1\5\6\uffff\2\7\10\uffff\1\16\22\uffff\1\6\3\uffff\1\17"
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
            return "()* loopback of 3213:2: ( rule__If__Group_2__0 )*";
        }
    }
    static final String dfa_7s = "\6\4\1\uffff\5\4\1\uffff\1\47\12\4\1\47\1\50\2\4\1\50\1\4";
    static final String dfa_8s = "\1\53\1\4\1\54\1\4\1\50\1\54\1\uffff\5\4\1\uffff\1\47\6\4\4\50\1\47\1\50\1\54\2\50\1\54";
    static final String dfa_9s = "\6\uffff\1\2\5\uffff\1\1\21\uffff";
    static final String[] dfa_10s = {
            "\1\2\46\uffff\1\1",
            "\1\2",
            "\1\5\6\uffff\2\14\1\7\1\10\1\11\1\12\1\13\3\uffff\1\3\22\uffff\1\6\3\uffff\1\4",
            "\1\15",
            "\1\5\6\uffff\2\14\33\uffff\1\6",
            "\1\5\6\uffff\2\14\1\16\1\17\1\20\1\21\1\22\3\uffff\1\23\22\uffff\1\6\3\uffff\1\24",
            "",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "",
            "\1\26",
            "\1\27",
            "\1\27",
            "\1\27",
            "\1\27",
            "\1\27",
            "\1\30",
            "\1\5\6\uffff\2\14\33\uffff\1\6",
            "\1\5\6\uffff\2\14\33\uffff\1\6",
            "\1\31\43\uffff\1\32",
            "\1\5\6\uffff\2\14\33\uffff\1\6",
            "\1\33",
            "\1\32",
            "\1\5\6\uffff\2\14\10\uffff\1\3\22\uffff\1\6\3\uffff\1\4",
            "\1\34\43\uffff\1\35",
            "\1\35",
            "\1\5\6\uffff\2\14\10\uffff\1\23\22\uffff\1\6\3\uffff\1\24"
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_5;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "()* loopback of 3659:2: ( rule__While__Group_2__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000085500000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002100100010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000012L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000044000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000044000000012L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000C4000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000C4000000012L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010800000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000000L});

}