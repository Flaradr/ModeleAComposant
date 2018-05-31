package com.project.foo.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.project.foo.services.FooGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFooParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'Assembly'", "'components'", "'bindings'", "':'", "'-'", "'Component'", "'refines'", "'assembly'", "'provided'", "'='", "','", "'required'", "'service'", "'if'", "'('", "'||'", "'&&'", "')'", "';'", "'else'", "'while'", "'!'", "'<'", "'>'", "'<='", "'>='", "'=='"
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

        public InternalFooParser(TokenStream input, FooGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";
       	}

       	@Override
       	protected FooGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainModel"
    // InternalFoo.g:64:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // InternalFoo.g:64:52: (iv_ruleDomainModel= ruleDomainModel EOF )
            // InternalFoo.g:65:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalFoo.g:71:1: ruleDomainModel returns [EObject current=null] : ( (lv_model_0_0= ruleModel ) ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_model_0_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:77:2: ( ( (lv_model_0_0= ruleModel ) ) )
            // InternalFoo.g:78:2: ( (lv_model_0_0= ruleModel ) )
            {
            // InternalFoo.g:78:2: ( (lv_model_0_0= ruleModel ) )
            // InternalFoo.g:79:3: (lv_model_0_0= ruleModel )
            {
            // InternalFoo.g:79:3: (lv_model_0_0= ruleModel )
            // InternalFoo.g:80:4: lv_model_0_0= ruleModel
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getDomainModelAccess().getModelModelParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_model_0_0=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getDomainModelRule());
              				}
              				set(
              					current,
              					"model",
              					lv_model_0_0,
              					"com.project.foo.Foo.Model");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleModel"
    // InternalFoo.g:100:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalFoo.g:100:46: (iv_ruleModel= ruleModel EOF )
            // InternalFoo.g:101:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalFoo.g:107:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_components_4_0= ruleComponent ) )* ( (lv_assembly_5_0= ruleAssembly ) )* otherlv_6= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_components_4_0 = null;

        EObject lv_assembly_5_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:113:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_components_4_0= ruleComponent ) )* ( (lv_assembly_5_0= ruleAssembly ) )* otherlv_6= '}' ) )
            // InternalFoo.g:114:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_components_4_0= ruleComponent ) )* ( (lv_assembly_5_0= ruleAssembly ) )* otherlv_6= '}' )
            {
            // InternalFoo.g:114:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_components_4_0= ruleComponent ) )* ( (lv_assembly_5_0= ruleAssembly ) )* otherlv_6= '}' )
            // InternalFoo.g:115:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_components_4_0= ruleComponent ) )* ( (lv_assembly_5_0= ruleAssembly ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
              		
            }
            // InternalFoo.g:119:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalFoo.g:120:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalFoo.g:120:4: (lv_name_1_0= ruleQualifiedName )
            // InternalFoo.g:121:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.project.foo.Foo.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalFoo.g:142:3: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFoo.g:143:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalFoo.g:143:4: (lv_imports_3_0= ruleImport )
            	    // InternalFoo.g:144:5: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_3_0,
            	      						"com.project.foo.Foo.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalFoo.g:161:3: ( (lv_components_4_0= ruleComponent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFoo.g:162:4: (lv_components_4_0= ruleComponent )
            	    {
            	    // InternalFoo.g:162:4: (lv_components_4_0= ruleComponent )
            	    // InternalFoo.g:163:5: lv_components_4_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_components_4_0=ruleComponent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"components",
            	      						lv_components_4_0,
            	      						"com.project.foo.Foo.Component");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalFoo.g:180:3: ( (lv_assembly_5_0= ruleAssembly ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFoo.g:181:4: (lv_assembly_5_0= ruleAssembly )
            	    {
            	    // InternalFoo.g:181:4: (lv_assembly_5_0= ruleAssembly )
            	    // InternalFoo.g:182:5: lv_assembly_5_0= ruleAssembly
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getAssemblyAssemblyParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_assembly_5_0=ruleAssembly();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"assembly",
            	      						lv_assembly_5_0,
            	      						"com.project.foo.Foo.Assembly");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalFoo.g:207:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalFoo.g:207:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalFoo.g:208:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalFoo.g:214:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalFoo.g:220:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalFoo.g:221:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalFoo.g:221:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalFoo.g:222:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalFoo.g:229:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFoo.g:230:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // InternalFoo.g:247:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalFoo.g:247:47: (iv_ruleImport= ruleImport EOF )
            // InternalFoo.g:248:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalFoo.g:254:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:260:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalFoo.g:261:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalFoo.g:261:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalFoo.g:262:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalFoo.g:266:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalFoo.g:267:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalFoo.g:267:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalFoo.g:268:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportRule());
              					}
              					set(
              						current,
              						"importedNamespace",
              						lv_importedNamespace_1_0,
              						"com.project.foo.Foo.QualifiedNameWithWildcard");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalFoo.g:289:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalFoo.g:289:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalFoo.g:290:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalFoo.g:296:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:302:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalFoo.g:303:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalFoo.g:303:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalFoo.g:304:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalFoo.g:314:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFoo.g:315:4: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleAssembly"
    // InternalFoo.g:325:1: entryRuleAssembly returns [EObject current=null] : iv_ruleAssembly= ruleAssembly EOF ;
    public final EObject entryRuleAssembly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembly = null;


        try {
            // InternalFoo.g:325:49: (iv_ruleAssembly= ruleAssembly EOF )
            // InternalFoo.g:326:2: iv_ruleAssembly= ruleAssembly EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssemblyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssembly=ruleAssembly();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssembly; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssembly"


    // $ANTLR start "ruleAssembly"
    // InternalFoo.g:332:1: ruleAssembly returns [EObject current=null] : ( () otherlv_1= 'Assembly' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' ( (lv_attributes_5_0= ruleComponentInstance ) ) ( (lv_attributes_6_0= ruleComponentInstance ) )+ otherlv_7= 'bindings' ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' ) ;
    public final EObject ruleAssembly() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_attributes_5_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_bindings_8_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:338:2: ( ( () otherlv_1= 'Assembly' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' ( (lv_attributes_5_0= ruleComponentInstance ) ) ( (lv_attributes_6_0= ruleComponentInstance ) )+ otherlv_7= 'bindings' ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' ) )
            // InternalFoo.g:339:2: ( () otherlv_1= 'Assembly' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' ( (lv_attributes_5_0= ruleComponentInstance ) ) ( (lv_attributes_6_0= ruleComponentInstance ) )+ otherlv_7= 'bindings' ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' )
            {
            // InternalFoo.g:339:2: ( () otherlv_1= 'Assembly' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' ( (lv_attributes_5_0= ruleComponentInstance ) ) ( (lv_attributes_6_0= ruleComponentInstance ) )+ otherlv_7= 'bindings' ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' )
            // InternalFoo.g:340:3: () otherlv_1= 'Assembly' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' ( (lv_attributes_5_0= ruleComponentInstance ) ) ( (lv_attributes_6_0= ruleComponentInstance ) )+ otherlv_7= 'bindings' ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}'
            {
            // InternalFoo.g:340:3: ()
            // InternalFoo.g:341:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAssemblyAccess().getAssemblyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssemblyAccess().getAssemblyKeyword_1());
              		
            }
            // InternalFoo.g:351:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFoo.g:352:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFoo.g:352:4: (lv_name_2_0= RULE_ID )
            // InternalFoo.g:353:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getAssemblyAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAssemblyRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAssemblyAccess().getComponentsKeyword_4());
              		
            }
            // InternalFoo.g:377:3: ( (lv_attributes_5_0= ruleComponentInstance ) )
            // InternalFoo.g:378:4: (lv_attributes_5_0= ruleComponentInstance )
            {
            // InternalFoo.g:378:4: (lv_attributes_5_0= ruleComponentInstance )
            // InternalFoo.g:379:5: lv_attributes_5_0= ruleComponentInstance
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssemblyAccess().getAttributesComponentInstanceParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_attributes_5_0=ruleComponentInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssemblyRule());
              					}
              					add(
              						current,
              						"attributes",
              						lv_attributes_5_0,
              						"com.project.foo.Foo.ComponentInstance");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFoo.g:396:3: ( (lv_attributes_6_0= ruleComponentInstance ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFoo.g:397:4: (lv_attributes_6_0= ruleComponentInstance )
            	    {
            	    // InternalFoo.g:397:4: (lv_attributes_6_0= ruleComponentInstance )
            	    // InternalFoo.g:398:5: lv_attributes_6_0= ruleComponentInstance
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAssemblyAccess().getAttributesComponentInstanceParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_attributes_6_0=ruleComponentInstance();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAssemblyRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attributes",
            	      						lv_attributes_6_0,
            	      						"com.project.foo.Foo.ComponentInstance");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getAssemblyAccess().getBindingsKeyword_7());
              		
            }
            // InternalFoo.g:419:3: ( (lv_bindings_8_0= ruleBinding ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFoo.g:420:4: (lv_bindings_8_0= ruleBinding )
            	    {
            	    // InternalFoo.g:420:4: (lv_bindings_8_0= ruleBinding )
            	    // InternalFoo.g:421:5: lv_bindings_8_0= ruleBinding
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAssemblyAccess().getBindingsBindingParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_bindings_8_0=ruleBinding();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAssemblyRule());
            	      					}
            	      					add(
            	      						current,
            	      						"bindings",
            	      						lv_bindings_8_0,
            	      						"com.project.foo.Foo.Binding");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssembly"


    // $ANTLR start "entryRuleComponentInstance"
    // InternalFoo.g:446:1: entryRuleComponentInstance returns [EObject current=null] : iv_ruleComponentInstance= ruleComponentInstance EOF ;
    public final EObject entryRuleComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstance = null;


        try {
            // InternalFoo.g:446:58: (iv_ruleComponentInstance= ruleComponentInstance EOF )
            // InternalFoo.g:447:2: iv_ruleComponentInstance= ruleComponentInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentInstanceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponentInstance=ruleComponentInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentInstance; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentInstance"


    // $ANTLR start "ruleComponentInstance"
    // InternalFoo.g:453:1: ruleComponentInstance returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleComponentInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFoo.g:459:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalFoo.g:460:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalFoo.g:460:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:461:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:461:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFoo.g:462:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFoo.g:462:4: (lv_name_0_0= RULE_ID )
            // InternalFoo.g:463:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentInstanceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentInstanceAccess().getColonKeyword_1());
              		
            }
            // InternalFoo.g:483:3: ( ( ruleQualifiedName ) )
            // InternalFoo.g:484:4: ( ruleQualifiedName )
            {
            // InternalFoo.g:484:4: ( ruleQualifiedName )
            // InternalFoo.g:485:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentInstanceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentInstanceAccess().getComponentComponentCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentInstance"


    // $ANTLR start "entryRuleBinding"
    // InternalFoo.g:503:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalFoo.g:503:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalFoo.g:504:2: iv_ruleBinding= ruleBinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinding; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalFoo.g:510:1: ruleBinding returns [EObject current=null] : ( ( (lv_bindingRequired_0_0= ruleBindingRequired ) ) otherlv_1= '-' ( (lv_bindingProvided_2_0= ruleBindingProvided ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_bindingRequired_0_0 = null;

        EObject lv_bindingProvided_2_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:516:2: ( ( ( (lv_bindingRequired_0_0= ruleBindingRequired ) ) otherlv_1= '-' ( (lv_bindingProvided_2_0= ruleBindingProvided ) ) ) )
            // InternalFoo.g:517:2: ( ( (lv_bindingRequired_0_0= ruleBindingRequired ) ) otherlv_1= '-' ( (lv_bindingProvided_2_0= ruleBindingProvided ) ) )
            {
            // InternalFoo.g:517:2: ( ( (lv_bindingRequired_0_0= ruleBindingRequired ) ) otherlv_1= '-' ( (lv_bindingProvided_2_0= ruleBindingProvided ) ) )
            // InternalFoo.g:518:3: ( (lv_bindingRequired_0_0= ruleBindingRequired ) ) otherlv_1= '-' ( (lv_bindingProvided_2_0= ruleBindingProvided ) )
            {
            // InternalFoo.g:518:3: ( (lv_bindingRequired_0_0= ruleBindingRequired ) )
            // InternalFoo.g:519:4: (lv_bindingRequired_0_0= ruleBindingRequired )
            {
            // InternalFoo.g:519:4: (lv_bindingRequired_0_0= ruleBindingRequired )
            // InternalFoo.g:520:5: lv_bindingRequired_0_0= ruleBindingRequired
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getBindingRequiredBindingRequiredParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_bindingRequired_0_0=ruleBindingRequired();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBindingRule());
              					}
              					set(
              						current,
              						"bindingRequired",
              						lv_bindingRequired_0_0,
              						"com.project.foo.Foo.BindingRequired");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getHyphenMinusKeyword_1());
              		
            }
            // InternalFoo.g:541:3: ( (lv_bindingProvided_2_0= ruleBindingProvided ) )
            // InternalFoo.g:542:4: (lv_bindingProvided_2_0= ruleBindingProvided )
            {
            // InternalFoo.g:542:4: (lv_bindingProvided_2_0= ruleBindingProvided )
            // InternalFoo.g:543:5: lv_bindingProvided_2_0= ruleBindingProvided
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getBindingProvidedBindingProvidedParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_bindingProvided_2_0=ruleBindingProvided();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBindingRule());
              					}
              					set(
              						current,
              						"bindingProvided",
              						lv_bindingProvided_2_0,
              						"com.project.foo.Foo.BindingProvided");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBindingRequired"
    // InternalFoo.g:564:1: entryRuleBindingRequired returns [EObject current=null] : iv_ruleBindingRequired= ruleBindingRequired EOF ;
    public final EObject entryRuleBindingRequired() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingRequired = null;


        try {
            // InternalFoo.g:564:56: (iv_ruleBindingRequired= ruleBindingRequired EOF )
            // InternalFoo.g:565:2: iv_ruleBindingRequired= ruleBindingRequired EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingRequiredRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBindingRequired=ruleBindingRequired();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingRequired; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBindingRequired"


    // $ANTLR start "ruleBindingRequired"
    // InternalFoo.g:571:1: ruleBindingRequired returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleBindingRequired() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFoo.g:577:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) )
            // InternalFoo.g:578:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            {
            // InternalFoo.g:578:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:579:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:579:3: ( (otherlv_0= RULE_ID ) )
            // InternalFoo.g:580:4: (otherlv_0= RULE_ID )
            {
            // InternalFoo.g:580:4: (otherlv_0= RULE_ID )
            // InternalFoo.g:581:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingRequiredRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getBindingRequiredAccess().getNameComponentInstanceCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBindingRequiredAccess().getFullStopKeyword_1());
              		
            }
            // InternalFoo.g:596:3: ( ( ruleQualifiedName ) )
            // InternalFoo.g:597:4: ( ruleQualifiedName )
            {
            // InternalFoo.g:597:4: ( ruleQualifiedName )
            // InternalFoo.g:598:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingRequiredRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingRequiredAccess().getServiceRSignatureCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBindingRequired"


    // $ANTLR start "entryRuleBindingProvided"
    // InternalFoo.g:616:1: entryRuleBindingProvided returns [EObject current=null] : iv_ruleBindingProvided= ruleBindingProvided EOF ;
    public final EObject entryRuleBindingProvided() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingProvided = null;


        try {
            // InternalFoo.g:616:56: (iv_ruleBindingProvided= ruleBindingProvided EOF )
            // InternalFoo.g:617:2: iv_ruleBindingProvided= ruleBindingProvided EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingProvidedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBindingProvided=ruleBindingProvided();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingProvided; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBindingProvided"


    // $ANTLR start "ruleBindingProvided"
    // InternalFoo.g:623:1: ruleBindingProvided returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleBindingProvided() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFoo.g:629:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) )
            // InternalFoo.g:630:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            {
            // InternalFoo.g:630:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:631:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:631:3: ( (otherlv_0= RULE_ID ) )
            // InternalFoo.g:632:4: (otherlv_0= RULE_ID )
            {
            // InternalFoo.g:632:4: (otherlv_0= RULE_ID )
            // InternalFoo.g:633:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingProvidedRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getBindingProvidedAccess().getNameComponentInstanceCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBindingProvidedAccess().getFullStopKeyword_1());
              		
            }
            // InternalFoo.g:648:3: ( ( ruleQualifiedName ) )
            // InternalFoo.g:649:4: ( ruleQualifiedName )
            {
            // InternalFoo.g:649:4: ( ruleQualifiedName )
            // InternalFoo.g:650:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingProvidedRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingProvidedAccess().getServicePSignatureCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBindingProvided"


    // $ANTLR start "entryRuleComponent"
    // InternalFoo.g:668:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalFoo.g:668:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalFoo.g:669:2: iv_ruleComponent= ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalFoo.g:675:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_listOfPServices_5_0= ruleListOfProvidedServices ) ) ( (lv_listOfRServices_6_0= ruleListOfrequiredServices ) ) ( (lv_mProvServices_7_0= ruleMProvidedService ) )+ ( (lv_mReqServices_8_0= ruleMRequiredService ) )* ( (otherlv_9= 'assembly' otherlv_10= ':' )? ( ( ruleQualifiedName ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_listOfPServices_5_0 = null;

        EObject lv_listOfRServices_6_0 = null;

        EObject lv_mProvServices_7_0 = null;

        EObject lv_mReqServices_8_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:681:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_listOfPServices_5_0= ruleListOfProvidedServices ) ) ( (lv_listOfRServices_6_0= ruleListOfrequiredServices ) ) ( (lv_mProvServices_7_0= ruleMProvidedService ) )+ ( (lv_mReqServices_8_0= ruleMRequiredService ) )* ( (otherlv_9= 'assembly' otherlv_10= ':' )? ( ( ruleQualifiedName ) ) )* otherlv_12= '}' ) )
            // InternalFoo.g:682:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_listOfPServices_5_0= ruleListOfProvidedServices ) ) ( (lv_listOfRServices_6_0= ruleListOfrequiredServices ) ) ( (lv_mProvServices_7_0= ruleMProvidedService ) )+ ( (lv_mReqServices_8_0= ruleMRequiredService ) )* ( (otherlv_9= 'assembly' otherlv_10= ':' )? ( ( ruleQualifiedName ) ) )* otherlv_12= '}' )
            {
            // InternalFoo.g:682:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_listOfPServices_5_0= ruleListOfProvidedServices ) ) ( (lv_listOfRServices_6_0= ruleListOfrequiredServices ) ) ( (lv_mProvServices_7_0= ruleMProvidedService ) )+ ( (lv_mReqServices_8_0= ruleMRequiredService ) )* ( (otherlv_9= 'assembly' otherlv_10= ':' )? ( ( ruleQualifiedName ) ) )* otherlv_12= '}' )
            // InternalFoo.g:683:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_listOfPServices_5_0= ruleListOfProvidedServices ) ) ( (lv_listOfRServices_6_0= ruleListOfrequiredServices ) ) ( (lv_mProvServices_7_0= ruleMProvidedService ) )+ ( (lv_mReqServices_8_0= ruleMRequiredService ) )* ( (otherlv_9= 'assembly' otherlv_10= ':' )? ( ( ruleQualifiedName ) ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
              		
            }
            // InternalFoo.g:687:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFoo.g:688:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFoo.g:688:4: (lv_name_1_0= RULE_ID )
            // InternalFoo.g:689:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalFoo.g:705:3: (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFoo.g:706:4: otherlv_2= 'refines' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getRefinesKeyword_2_0());
                      			
                    }
                    // InternalFoo.g:710:4: ( ( ruleQualifiedName ) )
                    // InternalFoo.g:711:5: ( ruleQualifiedName )
                    {
                    // InternalFoo.g:711:5: ( ruleQualifiedName )
                    // InternalFoo.g:712:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getComponentRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComponentAccess().getRefinedComponentComponentCrossReference_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalFoo.g:731:3: ( (lv_listOfPServices_5_0= ruleListOfProvidedServices ) )
            // InternalFoo.g:732:4: (lv_listOfPServices_5_0= ruleListOfProvidedServices )
            {
            // InternalFoo.g:732:4: (lv_listOfPServices_5_0= ruleListOfProvidedServices )
            // InternalFoo.g:733:5: lv_listOfPServices_5_0= ruleListOfProvidedServices
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentAccess().getListOfPServicesListOfProvidedServicesParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_listOfPServices_5_0=ruleListOfProvidedServices();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComponentRule());
              					}
              					set(
              						current,
              						"listOfPServices",
              						lv_listOfPServices_5_0,
              						"com.project.foo.Foo.ListOfProvidedServices");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFoo.g:750:3: ( (lv_listOfRServices_6_0= ruleListOfrequiredServices ) )
            // InternalFoo.g:751:4: (lv_listOfRServices_6_0= ruleListOfrequiredServices )
            {
            // InternalFoo.g:751:4: (lv_listOfRServices_6_0= ruleListOfrequiredServices )
            // InternalFoo.g:752:5: lv_listOfRServices_6_0= ruleListOfrequiredServices
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentAccess().getListOfRServicesListOfrequiredServicesParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_listOfRServices_6_0=ruleListOfrequiredServices();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComponentRule());
              					}
              					set(
              						current,
              						"listOfRServices",
              						lv_listOfRServices_6_0,
              						"com.project.foo.Foo.ListOfrequiredServices");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFoo.g:769:3: ( (lv_mProvServices_7_0= ruleMProvidedService ) )+
            int cnt9=0;
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
            	    // InternalFoo.g:770:4: (lv_mProvServices_7_0= ruleMProvidedService )
            	    {
            	    // InternalFoo.g:770:4: (lv_mProvServices_7_0= ruleMProvidedService )
            	    // InternalFoo.g:771:5: lv_mProvServices_7_0= ruleMProvidedService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComponentAccess().getMProvServicesMProvidedServiceParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_mProvServices_7_0=ruleMProvidedService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getComponentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"mProvServices",
            	      						lv_mProvServices_7_0,
            	      						"com.project.foo.Foo.MProvidedService");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // InternalFoo.g:788:3: ( (lv_mReqServices_8_0= ruleMRequiredService ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFoo.g:789:4: (lv_mReqServices_8_0= ruleMRequiredService )
            	    {
            	    // InternalFoo.g:789:4: (lv_mReqServices_8_0= ruleMRequiredService )
            	    // InternalFoo.g:790:5: lv_mReqServices_8_0= ruleMRequiredService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComponentAccess().getMReqServicesMRequiredServiceParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_mReqServices_8_0=ruleMRequiredService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getComponentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"mReqServices",
            	      						lv_mReqServices_8_0,
            	      						"com.project.foo.Foo.MRequiredService");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalFoo.g:807:3: ( (otherlv_9= 'assembly' otherlv_10= ':' )? ( ( ruleQualifiedName ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFoo.g:808:4: (otherlv_9= 'assembly' otherlv_10= ':' )? ( ( ruleQualifiedName ) )
            	    {
            	    // InternalFoo.g:808:4: (otherlv_9= 'assembly' otherlv_10= ':' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==24) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalFoo.g:809:5: otherlv_9= 'assembly' otherlv_10= ':'
            	            {
            	            otherlv_9=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getAssemblyKeyword_8_0_0());
            	              				
            	            }
            	            otherlv_10=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getColonKeyword_8_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalFoo.g:818:4: ( ( ruleQualifiedName ) )
            	    // InternalFoo.g:819:5: ( ruleQualifiedName )
            	    {
            	    // InternalFoo.g:819:5: ( ruleQualifiedName )
            	    // InternalFoo.g:820:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getComponentRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComponentAccess().getAssembliesAssemblyCrossReference_8_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleListOfProvidedServices"
    // InternalFoo.g:843:1: entryRuleListOfProvidedServices returns [EObject current=null] : iv_ruleListOfProvidedServices= ruleListOfProvidedServices EOF ;
    public final EObject entryRuleListOfProvidedServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfProvidedServices = null;


        try {
            // InternalFoo.g:843:63: (iv_ruleListOfProvidedServices= ruleListOfProvidedServices EOF )
            // InternalFoo.g:844:2: iv_ruleListOfProvidedServices= ruleListOfProvidedServices EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListOfProvidedServicesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListOfProvidedServices=ruleListOfProvidedServices();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListOfProvidedServices; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListOfProvidedServices"


    // $ANTLR start "ruleListOfProvidedServices"
    // InternalFoo.g:850:1: ruleListOfProvidedServices returns [EObject current=null] : (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' ) ;
    public final EObject ruleListOfProvidedServices() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_providedServices_3_0 = null;

        EObject lv_providedServices_5_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:856:2: ( (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' ) )
            // InternalFoo.g:857:2: (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' )
            {
            // InternalFoo.g:857:2: (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' )
            // InternalFoo.g:858:3: otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getListOfProvidedServicesAccess().getProvidedKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListOfProvidedServicesAccess().getEqualsSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getListOfProvidedServicesAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalFoo.g:870:3: ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* )
            // InternalFoo.g:871:4: ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )*
            {
            // InternalFoo.g:871:4: ( (lv_providedServices_3_0= ruleProvidedService ) )
            // InternalFoo.g:872:5: (lv_providedServices_3_0= ruleProvidedService )
            {
            // InternalFoo.g:872:5: (lv_providedServices_3_0= ruleProvidedService )
            // InternalFoo.g:873:6: lv_providedServices_3_0= ruleProvidedService
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_0_0());
              					
            }
            pushFollow(FOLLOW_23);
            lv_providedServices_3_0=ruleProvidedService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getListOfProvidedServicesRule());
              						}
              						add(
              							current,
              							"providedServices",
              							lv_providedServices_3_0,
              							"com.project.foo.Foo.ProvidedService");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalFoo.g:890:4: (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFoo.g:891:5: otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_4, grammarAccess.getListOfProvidedServicesAccess().getCommaKeyword_3_1_0());
            	      				
            	    }
            	    // InternalFoo.g:895:5: ( (lv_providedServices_5_0= ruleProvidedService ) )
            	    // InternalFoo.g:896:6: (lv_providedServices_5_0= ruleProvidedService )
            	    {
            	    // InternalFoo.g:896:6: (lv_providedServices_5_0= ruleProvidedService )
            	    // InternalFoo.g:897:7: lv_providedServices_5_0= ruleProvidedService
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_providedServices_5_0=ruleProvidedService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getListOfProvidedServicesRule());
            	      							}
            	      							add(
            	      								current,
            	      								"providedServices",
            	      								lv_providedServices_5_0,
            	      								"com.project.foo.Foo.ProvidedService");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getListOfProvidedServicesAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListOfProvidedServices"


    // $ANTLR start "entryRuleProvidedService"
    // InternalFoo.g:924:1: entryRuleProvidedService returns [EObject current=null] : iv_ruleProvidedService= ruleProvidedService EOF ;
    public final EObject entryRuleProvidedService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedService = null;


        try {
            // InternalFoo.g:924:56: (iv_ruleProvidedService= ruleProvidedService EOF )
            // InternalFoo.g:925:2: iv_ruleProvidedService= ruleProvidedService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProvidedServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProvidedService=ruleProvidedService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProvidedService; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvidedService"


    // $ANTLR start "ruleProvidedService"
    // InternalFoo.g:931:1: ruleProvidedService returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleProvidedService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalFoo.g:937:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalFoo.g:938:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalFoo.g:938:2: ( (otherlv_0= RULE_ID ) )
            // InternalFoo.g:939:3: (otherlv_0= RULE_ID )
            {
            // InternalFoo.g:939:3: (otherlv_0= RULE_ID )
            // InternalFoo.g:940:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getProvidedServiceRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getProvidedServiceAccess().getNamePSignatureCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProvidedService"


    // $ANTLR start "entryRuleListOfrequiredServices"
    // InternalFoo.g:954:1: entryRuleListOfrequiredServices returns [EObject current=null] : iv_ruleListOfrequiredServices= ruleListOfrequiredServices EOF ;
    public final EObject entryRuleListOfrequiredServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfrequiredServices = null;


        try {
            // InternalFoo.g:954:63: (iv_ruleListOfrequiredServices= ruleListOfrequiredServices EOF )
            // InternalFoo.g:955:2: iv_ruleListOfrequiredServices= ruleListOfrequiredServices EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListOfrequiredServicesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListOfrequiredServices=ruleListOfrequiredServices();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListOfrequiredServices; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListOfrequiredServices"


    // $ANTLR start "ruleListOfrequiredServices"
    // InternalFoo.g:961:1: ruleListOfrequiredServices returns [EObject current=null] : ( () otherlv_1= 'required' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* ) otherlv_7= '}' ) ;
    public final EObject ruleListOfrequiredServices() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_requiredServices_4_0 = null;

        EObject lv_requiredServices_6_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:967:2: ( ( () otherlv_1= 'required' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* ) otherlv_7= '}' ) )
            // InternalFoo.g:968:2: ( () otherlv_1= 'required' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* ) otherlv_7= '}' )
            {
            // InternalFoo.g:968:2: ( () otherlv_1= 'required' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* ) otherlv_7= '}' )
            // InternalFoo.g:969:3: () otherlv_1= 'required' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* ) otherlv_7= '}'
            {
            // InternalFoo.g:969:3: ()
            // InternalFoo.g:970:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListOfrequiredServicesAccess().getListOfrequiredServicesAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListOfrequiredServicesAccess().getRequiredKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getListOfrequiredServicesAccess().getEqualsSignKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,12,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getListOfrequiredServicesAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalFoo.g:988:3: ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* )
            // InternalFoo.g:989:4: ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )*
            {
            // InternalFoo.g:989:4: ( (lv_requiredServices_4_0= ruleRequiredService ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFoo.g:990:5: (lv_requiredServices_4_0= ruleRequiredService )
                    {
                    // InternalFoo.g:990:5: (lv_requiredServices_4_0= ruleRequiredService )
                    // InternalFoo.g:991:6: lv_requiredServices_4_0= ruleRequiredService
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_requiredServices_4_0=ruleRequiredService();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getListOfrequiredServicesRule());
                      						}
                      						add(
                      							current,
                      							"requiredServices",
                      							lv_requiredServices_4_0,
                      							"com.project.foo.Foo.RequiredService");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }
                    break;

            }

            // InternalFoo.g:1008:4: (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFoo.g:1009:5: otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) )
            	    {
            	    otherlv_5=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getListOfrequiredServicesAccess().getCommaKeyword_4_1_0());
            	      				
            	    }
            	    // InternalFoo.g:1013:5: ( (lv_requiredServices_6_0= ruleRequiredService ) )
            	    // InternalFoo.g:1014:6: (lv_requiredServices_6_0= ruleRequiredService )
            	    {
            	    // InternalFoo.g:1014:6: (lv_requiredServices_6_0= ruleRequiredService )
            	    // InternalFoo.g:1015:7: lv_requiredServices_6_0= ruleRequiredService
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_requiredServices_6_0=ruleRequiredService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getListOfrequiredServicesRule());
            	      							}
            	      							add(
            	      								current,
            	      								"requiredServices",
            	      								lv_requiredServices_6_0,
            	      								"com.project.foo.Foo.RequiredService");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getListOfrequiredServicesAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListOfrequiredServices"


    // $ANTLR start "entryRuleRequiredService"
    // InternalFoo.g:1042:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // InternalFoo.g:1042:56: (iv_ruleRequiredService= ruleRequiredService EOF )
            // InternalFoo.g:1043:2: iv_ruleRequiredService= ruleRequiredService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiredServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRequiredService=ruleRequiredService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiredService; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredService"


    // $ANTLR start "ruleRequiredService"
    // InternalFoo.g:1049:1: ruleRequiredService returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalFoo.g:1055:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalFoo.g:1056:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalFoo.g:1056:2: ( (otherlv_0= RULE_ID ) )
            // InternalFoo.g:1057:3: (otherlv_0= RULE_ID )
            {
            // InternalFoo.g:1057:3: (otherlv_0= RULE_ID )
            // InternalFoo.g:1058:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getRequiredServiceRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getRequiredServiceAccess().getNameRSignatureCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredService"


    // $ANTLR start "entryRuleMProvidedService"
    // InternalFoo.g:1072:1: entryRuleMProvidedService returns [EObject current=null] : iv_ruleMProvidedService= ruleMProvidedService EOF ;
    public final EObject entryRuleMProvidedService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMProvidedService = null;


        try {
            // InternalFoo.g:1072:57: (iv_ruleMProvidedService= ruleMProvidedService EOF )
            // InternalFoo.g:1073:2: iv_ruleMProvidedService= ruleMProvidedService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMProvidedServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMProvidedService=ruleMProvidedService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMProvidedService; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMProvidedService"


    // $ANTLR start "ruleMProvidedService"
    // InternalFoo.g:1079:1: ruleMProvidedService returns [EObject current=null] : (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' ( (lv_expressions_4_0= ruleExpression ) )+ otherlv_5= '}' ) ;
    public final EObject ruleMProvidedService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_signature_2_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:1085:2: ( (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' ( (lv_expressions_4_0= ruleExpression ) )+ otherlv_5= '}' ) )
            // InternalFoo.g:1086:2: (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' ( (lv_expressions_4_0= ruleExpression ) )+ otherlv_5= '}' )
            {
            // InternalFoo.g:1086:2: (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' ( (lv_expressions_4_0= ruleExpression ) )+ otherlv_5= '}' )
            // InternalFoo.g:1087:3: otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' ( (lv_expressions_4_0= ruleExpression ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMProvidedServiceAccess().getServiceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMProvidedServiceAccess().getProvidedKeyword_1());
              		
            }
            // InternalFoo.g:1095:3: ( (lv_signature_2_0= rulePSignature ) )
            // InternalFoo.g:1096:4: (lv_signature_2_0= rulePSignature )
            {
            // InternalFoo.g:1096:4: (lv_signature_2_0= rulePSignature )
            // InternalFoo.g:1097:5: lv_signature_2_0= rulePSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMProvidedServiceAccess().getSignaturePSignatureParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_signature_2_0=rulePSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMProvidedServiceRule());
              					}
              					set(
              						current,
              						"signature",
              						lv_signature_2_0,
              						"com.project.foo.Foo.PSignature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMProvidedServiceAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalFoo.g:1118:3: ( (lv_expressions_4_0= ruleExpression ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==30||LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFoo.g:1119:4: (lv_expressions_4_0= ruleExpression )
            	    {
            	    // InternalFoo.g:1119:4: (lv_expressions_4_0= ruleExpression )
            	    // InternalFoo.g:1120:5: lv_expressions_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMProvidedServiceAccess().getExpressionsExpressionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_expressions_4_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMProvidedServiceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"expressions",
            	      						lv_expressions_4_0,
            	      						"com.project.foo.Foo.Expression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMProvidedServiceAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMProvidedService"


    // $ANTLR start "entryRuleExpression"
    // InternalFoo.g:1145:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFoo.g:1145:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFoo.g:1146:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalFoo.g:1152:1: ruleExpression returns [EObject current=null] : (this_If_0= ruleIf | this_While_1= ruleWhile | this_Str_2= ruleStr ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_If_0 = null;

        EObject this_While_1 = null;

        EObject this_Str_2 = null;



        	enterRule();

        try {
            // InternalFoo.g:1158:2: ( (this_If_0= ruleIf | this_While_1= ruleWhile | this_Str_2= ruleStr ) )
            // InternalFoo.g:1159:2: (this_If_0= ruleIf | this_While_1= ruleWhile | this_Str_2= ruleStr )
            {
            // InternalFoo.g:1159:2: (this_If_0= ruleIf | this_While_1= ruleWhile | this_Str_2= ruleStr )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt17=1;
                }
                break;
            case 37:
                {
                alt17=2;
                }
                break;
            case RULE_ID:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalFoo.g:1160:3: this_If_0= ruleIf
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getIfParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_If_0=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_If_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalFoo.g:1169:3: this_While_1= ruleWhile
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getWhileParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_While_1=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_While_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalFoo.g:1178:3: this_Str_2= ruleStr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getStrParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Str_2=ruleStr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Str_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIf"
    // InternalFoo.g:1190:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalFoo.g:1190:43: (iv_ruleIf= ruleIf EOF )
            // InternalFoo.g:1191:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalFoo.g:1197:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' ) | ( (lv_if_10_0= ruleIf ) ) | ( (lv_while_11_0= ruleWhile ) ) )+ otherlv_12= '}' ( ( ( 'else' )=>otherlv_13= 'else' ) ( ( (lv_else_14_0= ruleIf ) ) | (otherlv_15= '{' ( ( ( (lv_str_16_0= ruleStr ) ) otherlv_17= ';' ) | ( (lv_if_18_0= ruleIf ) ) | ( (lv_while_19_0= ruleWhile ) ) )+ otherlv_20= '}' ) ) )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        EObject lv_conditions_2_0 = null;

        EObject lv_conditions_5_0 = null;

        EObject lv_str_8_0 = null;

        EObject lv_if_10_0 = null;

        EObject lv_while_11_0 = null;

        EObject lv_else_14_0 = null;

        EObject lv_str_16_0 = null;

        EObject lv_if_18_0 = null;

        EObject lv_while_19_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:1203:2: ( (otherlv_0= 'if' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' ) | ( (lv_if_10_0= ruleIf ) ) | ( (lv_while_11_0= ruleWhile ) ) )+ otherlv_12= '}' ( ( ( 'else' )=>otherlv_13= 'else' ) ( ( (lv_else_14_0= ruleIf ) ) | (otherlv_15= '{' ( ( ( (lv_str_16_0= ruleStr ) ) otherlv_17= ';' ) | ( (lv_if_18_0= ruleIf ) ) | ( (lv_while_19_0= ruleWhile ) ) )+ otherlv_20= '}' ) ) )? ) )
            // InternalFoo.g:1204:2: (otherlv_0= 'if' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' ) | ( (lv_if_10_0= ruleIf ) ) | ( (lv_while_11_0= ruleWhile ) ) )+ otherlv_12= '}' ( ( ( 'else' )=>otherlv_13= 'else' ) ( ( (lv_else_14_0= ruleIf ) ) | (otherlv_15= '{' ( ( ( (lv_str_16_0= ruleStr ) ) otherlv_17= ';' ) | ( (lv_if_18_0= ruleIf ) ) | ( (lv_while_19_0= ruleWhile ) ) )+ otherlv_20= '}' ) ) )? )
            {
            // InternalFoo.g:1204:2: (otherlv_0= 'if' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' ) | ( (lv_if_10_0= ruleIf ) ) | ( (lv_while_11_0= ruleWhile ) ) )+ otherlv_12= '}' ( ( ( 'else' )=>otherlv_13= 'else' ) ( ( (lv_else_14_0= ruleIf ) ) | (otherlv_15= '{' ( ( ( (lv_str_16_0= ruleStr ) ) otherlv_17= ';' ) | ( (lv_if_18_0= ruleIf ) ) | ( (lv_while_19_0= ruleWhile ) ) )+ otherlv_20= '}' ) ) )? )
            // InternalFoo.g:1205:3: otherlv_0= 'if' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' ) | ( (lv_if_10_0= ruleIf ) ) | ( (lv_while_11_0= ruleWhile ) ) )+ otherlv_12= '}' ( ( ( 'else' )=>otherlv_13= 'else' ) ( ( (lv_else_14_0= ruleIf ) ) | (otherlv_15= '{' ( ( ( (lv_str_16_0= ruleStr ) ) otherlv_17= ';' ) | ( (lv_if_18_0= ruleIf ) ) | ( (lv_while_19_0= ruleWhile ) ) )+ otherlv_20= '}' ) ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,31,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalFoo.g:1213:3: ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // InternalFoo.g:1214:4: ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' )
            	    {
            	    // InternalFoo.g:1214:4: ( (lv_conditions_2_0= ruleCondition ) )
            	    // InternalFoo.g:1215:5: (lv_conditions_2_0= ruleCondition )
            	    {
            	    // InternalFoo.g:1215:5: (lv_conditions_2_0= ruleCondition )
            	    // InternalFoo.g:1216:6: lv_conditions_2_0= ruleCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIfAccess().getConditionsConditionParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_conditions_2_0=ruleCondition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getIfRule());
            	      						}
            	      						add(
            	      							current,
            	      							"conditions",
            	      							lv_conditions_2_0,
            	      							"com.project.foo.Foo.Condition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalFoo.g:1233:4: (otherlv_3= '||' | otherlv_4= '&&' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==32) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==33) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalFoo.g:1234:5: otherlv_3= '||'
            	            {
            	            otherlv_3=(Token)match(input,32,FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_3, grammarAccess.getIfAccess().getVerticalLineVerticalLineKeyword_2_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalFoo.g:1239:5: otherlv_4= '&&'
            	            {
            	            otherlv_4=(Token)match(input,33,FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_4, grammarAccess.getIfAccess().getAmpersandAmpersandKeyword_2_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalFoo.g:1245:3: ( (lv_conditions_5_0= ruleCondition ) )
            // InternalFoo.g:1246:4: (lv_conditions_5_0= ruleCondition )
            {
            // InternalFoo.g:1246:4: (lv_conditions_5_0= ruleCondition )
            // InternalFoo.g:1247:5: lv_conditions_5_0= ruleCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getConditionsConditionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_conditions_5_0=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					add(
              						current,
              						"conditions",
              						lv_conditions_5_0,
              						"com.project.foo.Foo.Condition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,12,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalFoo.g:1272:3: ( ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' ) | ( (lv_if_10_0= ruleIf ) ) | ( (lv_while_11_0= ruleWhile ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt20=1;
                    }
                    break;
                case 30:
                    {
                    alt20=2;
                    }
                    break;
                case 37:
                    {
                    alt20=3;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalFoo.g:1273:4: ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' )
            	    {
            	    // InternalFoo.g:1273:4: ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' )
            	    // InternalFoo.g:1274:5: ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';'
            	    {
            	    // InternalFoo.g:1274:5: ( (lv_str_8_0= ruleStr ) )
            	    // InternalFoo.g:1275:6: (lv_str_8_0= ruleStr )
            	    {
            	    // InternalFoo.g:1275:6: (lv_str_8_0= ruleStr )
            	    // InternalFoo.g:1276:7: lv_str_8_0= ruleStr
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getIfAccess().getStrStrParserRuleCall_6_0_0_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_str_8_0=ruleStr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getIfRule());
            	      							}
            	      							add(
            	      								current,
            	      								"str",
            	      								lv_str_8_0,
            	      								"com.project.foo.Foo.Str");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,35,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_9, grammarAccess.getIfAccess().getSemicolonKeyword_6_0_1());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFoo.g:1299:4: ( (lv_if_10_0= ruleIf ) )
            	    {
            	    // InternalFoo.g:1299:4: ( (lv_if_10_0= ruleIf ) )
            	    // InternalFoo.g:1300:5: (lv_if_10_0= ruleIf )
            	    {
            	    // InternalFoo.g:1300:5: (lv_if_10_0= ruleIf )
            	    // InternalFoo.g:1301:6: lv_if_10_0= ruleIf
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIfAccess().getIfIfParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_if_10_0=ruleIf();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getIfRule());
            	      						}
            	      						add(
            	      							current,
            	      							"if",
            	      							lv_if_10_0,
            	      							"com.project.foo.Foo.If");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalFoo.g:1319:4: ( (lv_while_11_0= ruleWhile ) )
            	    {
            	    // InternalFoo.g:1319:4: ( (lv_while_11_0= ruleWhile ) )
            	    // InternalFoo.g:1320:5: (lv_while_11_0= ruleWhile )
            	    {
            	    // InternalFoo.g:1320:5: (lv_while_11_0= ruleWhile )
            	    // InternalFoo.g:1321:6: lv_while_11_0= ruleWhile
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIfAccess().getWhileWhileParserRuleCall_6_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_while_11_0=ruleWhile();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getIfRule());
            	      						}
            	      						add(
            	      							current,
            	      							"while",
            	      							lv_while_11_0,
            	      							"com.project.foo.Foo.While");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7());
              		
            }
            // InternalFoo.g:1343:3: ( ( ( 'else' )=>otherlv_13= 'else' ) ( ( (lv_else_14_0= ruleIf ) ) | (otherlv_15= '{' ( ( ( (lv_str_16_0= ruleStr ) ) otherlv_17= ';' ) | ( (lv_if_18_0= ruleIf ) ) | ( (lv_while_19_0= ruleWhile ) ) )+ otherlv_20= '}' ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) && (synpred1_InternalFoo())) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFoo.g:1344:4: ( ( 'else' )=>otherlv_13= 'else' ) ( ( (lv_else_14_0= ruleIf ) ) | (otherlv_15= '{' ( ( ( (lv_str_16_0= ruleStr ) ) otherlv_17= ';' ) | ( (lv_if_18_0= ruleIf ) ) | ( (lv_while_19_0= ruleWhile ) ) )+ otherlv_20= '}' ) )
                    {
                    // InternalFoo.g:1344:4: ( ( 'else' )=>otherlv_13= 'else' )
                    // InternalFoo.g:1345:5: ( 'else' )=>otherlv_13= 'else'
                    {
                    otherlv_13=(Token)match(input,36,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getIfAccess().getElseKeyword_8_0());
                      				
                    }

                    }

                    // InternalFoo.g:1351:4: ( ( (lv_else_14_0= ruleIf ) ) | (otherlv_15= '{' ( ( ( (lv_str_16_0= ruleStr ) ) otherlv_17= ';' ) | ( (lv_if_18_0= ruleIf ) ) | ( (lv_while_19_0= ruleWhile ) ) )+ otherlv_20= '}' ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==30) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==12) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalFoo.g:1352:5: ( (lv_else_14_0= ruleIf ) )
                            {
                            // InternalFoo.g:1352:5: ( (lv_else_14_0= ruleIf ) )
                            // InternalFoo.g:1353:6: (lv_else_14_0= ruleIf )
                            {
                            // InternalFoo.g:1353:6: (lv_else_14_0= ruleIf )
                            // InternalFoo.g:1354:7: lv_else_14_0= ruleIf
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getIfAccess().getElseIfParserRuleCall_8_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_else_14_0=ruleIf();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getIfRule());
                              							}
                              							set(
                              								current,
                              								"else",
                              								lv_else_14_0,
                              								"com.project.foo.Foo.If");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalFoo.g:1372:5: (otherlv_15= '{' ( ( ( (lv_str_16_0= ruleStr ) ) otherlv_17= ';' ) | ( (lv_if_18_0= ruleIf ) ) | ( (lv_while_19_0= ruleWhile ) ) )+ otherlv_20= '}' )
                            {
                            // InternalFoo.g:1372:5: (otherlv_15= '{' ( ( ( (lv_str_16_0= ruleStr ) ) otherlv_17= ';' ) | ( (lv_if_18_0= ruleIf ) ) | ( (lv_while_19_0= ruleWhile ) ) )+ otherlv_20= '}' )
                            // InternalFoo.g:1373:6: otherlv_15= '{' ( ( ( (lv_str_16_0= ruleStr ) ) otherlv_17= ';' ) | ( (lv_if_18_0= ruleIf ) ) | ( (lv_while_19_0= ruleWhile ) ) )+ otherlv_20= '}'
                            {
                            otherlv_15=(Token)match(input,12,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_15, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_1_1_0());
                              					
                            }
                            // InternalFoo.g:1377:6: ( ( ( (lv_str_16_0= ruleStr ) ) otherlv_17= ';' ) | ( (lv_if_18_0= ruleIf ) ) | ( (lv_while_19_0= ruleWhile ) ) )+
                            int cnt21=0;
                            loop21:
                            do {
                                int alt21=4;
                                switch ( input.LA(1) ) {
                                case RULE_ID:
                                    {
                                    alt21=1;
                                    }
                                    break;
                                case 30:
                                    {
                                    alt21=2;
                                    }
                                    break;
                                case 37:
                                    {
                                    alt21=3;
                                    }
                                    break;

                                }

                                switch (alt21) {
                            	case 1 :
                            	    // InternalFoo.g:1378:7: ( ( (lv_str_16_0= ruleStr ) ) otherlv_17= ';' )
                            	    {
                            	    // InternalFoo.g:1378:7: ( ( (lv_str_16_0= ruleStr ) ) otherlv_17= ';' )
                            	    // InternalFoo.g:1379:8: ( (lv_str_16_0= ruleStr ) ) otherlv_17= ';'
                            	    {
                            	    // InternalFoo.g:1379:8: ( (lv_str_16_0= ruleStr ) )
                            	    // InternalFoo.g:1380:9: (lv_str_16_0= ruleStr )
                            	    {
                            	    // InternalFoo.g:1380:9: (lv_str_16_0= ruleStr )
                            	    // InternalFoo.g:1381:10: lv_str_16_0= ruleStr
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      										newCompositeNode(grammarAccess.getIfAccess().getStrStrParserRuleCall_8_1_1_1_0_0_0());
                            	      									
                            	    }
                            	    pushFollow(FOLLOW_31);
                            	    lv_str_16_0=ruleStr();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      										if (current==null) {
                            	      											current = createModelElementForParent(grammarAccess.getIfRule());
                            	      										}
                            	      										add(
                            	      											current,
                            	      											"str",
                            	      											lv_str_16_0,
                            	      											"com.project.foo.Foo.Str");
                            	      										afterParserOrEnumRuleCall();
                            	      									
                            	    }

                            	    }


                            	    }

                            	    otherlv_17=(Token)match(input,35,FOLLOW_26); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								newLeafNode(otherlv_17, grammarAccess.getIfAccess().getSemicolonKeyword_8_1_1_1_0_1());
                            	      							
                            	    }

                            	    }


                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalFoo.g:1404:7: ( (lv_if_18_0= ruleIf ) )
                            	    {
                            	    // InternalFoo.g:1404:7: ( (lv_if_18_0= ruleIf ) )
                            	    // InternalFoo.g:1405:8: (lv_if_18_0= ruleIf )
                            	    {
                            	    // InternalFoo.g:1405:8: (lv_if_18_0= ruleIf )
                            	    // InternalFoo.g:1406:9: lv_if_18_0= ruleIf
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getIfAccess().getIfIfParserRuleCall_8_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_26);
                            	    lv_if_18_0=ruleIf();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getIfRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"if",
                            	      										lv_if_18_0,
                            	      										"com.project.foo.Foo.If");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 3 :
                            	    // InternalFoo.g:1424:7: ( (lv_while_19_0= ruleWhile ) )
                            	    {
                            	    // InternalFoo.g:1424:7: ( (lv_while_19_0= ruleWhile ) )
                            	    // InternalFoo.g:1425:8: (lv_while_19_0= ruleWhile )
                            	    {
                            	    // InternalFoo.g:1425:8: (lv_while_19_0= ruleWhile )
                            	    // InternalFoo.g:1426:9: lv_while_19_0= ruleWhile
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getIfAccess().getWhileWhileParserRuleCall_8_1_1_1_2_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_26);
                            	    lv_while_19_0=ruleWhile();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getIfRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"while",
                            	      										lv_while_19_0,
                            	      										"com.project.foo.Foo.While");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt21 >= 1 ) break loop21;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(21, input);
                                        throw eee;
                                }
                                cnt21++;
                            } while (true);

                            otherlv_20=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_20, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8_1_1_2());
                              					
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleWhile"
    // InternalFoo.g:1455:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalFoo.g:1455:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalFoo.g:1456:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalFoo.g:1462:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' ) | ( (lv_if_10_0= ruleIf ) ) | ( (lv_while_11_0= ruleWhile ) ) )+ otherlv_12= '}' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_conditions_2_0 = null;

        EObject lv_conditions_5_0 = null;

        EObject lv_str_8_0 = null;

        EObject lv_if_10_0 = null;

        EObject lv_while_11_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:1468:2: ( (otherlv_0= 'while' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' ) | ( (lv_if_10_0= ruleIf ) ) | ( (lv_while_11_0= ruleWhile ) ) )+ otherlv_12= '}' ) )
            // InternalFoo.g:1469:2: (otherlv_0= 'while' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' ) | ( (lv_if_10_0= ruleIf ) ) | ( (lv_while_11_0= ruleWhile ) ) )+ otherlv_12= '}' )
            {
            // InternalFoo.g:1469:2: (otherlv_0= 'while' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' ) | ( (lv_if_10_0= ruleIf ) ) | ( (lv_while_11_0= ruleWhile ) ) )+ otherlv_12= '}' )
            // InternalFoo.g:1470:3: otherlv_0= 'while' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' ) | ( (lv_if_10_0= ruleIf ) ) | ( (lv_while_11_0= ruleWhile ) ) )+ otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,31,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalFoo.g:1478:3: ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // InternalFoo.g:1479:4: ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' )
            	    {
            	    // InternalFoo.g:1479:4: ( (lv_conditions_2_0= ruleCondition ) )
            	    // InternalFoo.g:1480:5: (lv_conditions_2_0= ruleCondition )
            	    {
            	    // InternalFoo.g:1480:5: (lv_conditions_2_0= ruleCondition )
            	    // InternalFoo.g:1481:6: lv_conditions_2_0= ruleCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWhileAccess().getConditionsConditionParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_conditions_2_0=ruleCondition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getWhileRule());
            	      						}
            	      						add(
            	      							current,
            	      							"conditions",
            	      							lv_conditions_2_0,
            	      							"com.project.foo.Foo.Condition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalFoo.g:1498:4: (otherlv_3= '||' | otherlv_4= '&&' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==32) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==33) ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalFoo.g:1499:5: otherlv_3= '||'
            	            {
            	            otherlv_3=(Token)match(input,32,FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getVerticalLineVerticalLineKeyword_2_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalFoo.g:1504:5: otherlv_4= '&&'
            	            {
            	            otherlv_4=(Token)match(input,33,FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getAmpersandAmpersandKeyword_2_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalFoo.g:1510:3: ( (lv_conditions_5_0= ruleCondition ) )
            // InternalFoo.g:1511:4: (lv_conditions_5_0= ruleCondition )
            {
            // InternalFoo.g:1511:4: (lv_conditions_5_0= ruleCondition )
            // InternalFoo.g:1512:5: lv_conditions_5_0= ruleCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getConditionsConditionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_conditions_5_0=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					add(
              						current,
              						"conditions",
              						lv_conditions_5_0,
              						"com.project.foo.Foo.Condition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getWhileAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,12,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalFoo.g:1537:3: ( ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' ) | ( (lv_if_10_0= ruleIf ) ) | ( (lv_while_11_0= ruleWhile ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt26=1;
                    }
                    break;
                case 30:
                    {
                    alt26=2;
                    }
                    break;
                case 37:
                    {
                    alt26=3;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // InternalFoo.g:1538:4: ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' )
            	    {
            	    // InternalFoo.g:1538:4: ( ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';' )
            	    // InternalFoo.g:1539:5: ( (lv_str_8_0= ruleStr ) ) otherlv_9= ';'
            	    {
            	    // InternalFoo.g:1539:5: ( (lv_str_8_0= ruleStr ) )
            	    // InternalFoo.g:1540:6: (lv_str_8_0= ruleStr )
            	    {
            	    // InternalFoo.g:1540:6: (lv_str_8_0= ruleStr )
            	    // InternalFoo.g:1541:7: lv_str_8_0= ruleStr
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getWhileAccess().getStrStrParserRuleCall_6_0_0_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_str_8_0=ruleStr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getWhileRule());
            	      							}
            	      							add(
            	      								current,
            	      								"str",
            	      								lv_str_8_0,
            	      								"com.project.foo.Foo.Str");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,35,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_9, grammarAccess.getWhileAccess().getSemicolonKeyword_6_0_1());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFoo.g:1564:4: ( (lv_if_10_0= ruleIf ) )
            	    {
            	    // InternalFoo.g:1564:4: ( (lv_if_10_0= ruleIf ) )
            	    // InternalFoo.g:1565:5: (lv_if_10_0= ruleIf )
            	    {
            	    // InternalFoo.g:1565:5: (lv_if_10_0= ruleIf )
            	    // InternalFoo.g:1566:6: lv_if_10_0= ruleIf
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWhileAccess().getIfIfParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_if_10_0=ruleIf();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getWhileRule());
            	      						}
            	      						add(
            	      							current,
            	      							"if",
            	      							lv_if_10_0,
            	      							"com.project.foo.Foo.If");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalFoo.g:1584:4: ( (lv_while_11_0= ruleWhile ) )
            	    {
            	    // InternalFoo.g:1584:4: ( (lv_while_11_0= ruleWhile ) )
            	    // InternalFoo.g:1585:5: (lv_while_11_0= ruleWhile )
            	    {
            	    // InternalFoo.g:1585:5: (lv_while_11_0= ruleWhile )
            	    // InternalFoo.g:1586:6: lv_while_11_0= ruleWhile
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWhileAccess().getWhileWhileParserRuleCall_6_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_while_11_0=ruleWhile();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getWhileRule());
            	      						}
            	      						add(
            	      							current,
            	      							"while",
            	      							lv_while_11_0,
            	      							"com.project.foo.Foo.While");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleCondition"
    // InternalFoo.g:1612:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalFoo.g:1612:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalFoo.g:1613:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalFoo.g:1619:1: ruleCondition returns [EObject current=null] : ( (otherlv_0= '!' )? ( ( (lv_conditions_1_0= ruleComparison ) ) | ( (lv_conditions_2_0= ruleStr ) ) )+ ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_conditions_1_0 = null;

        EObject lv_conditions_2_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:1625:2: ( ( (otherlv_0= '!' )? ( ( (lv_conditions_1_0= ruleComparison ) ) | ( (lv_conditions_2_0= ruleStr ) ) )+ ) )
            // InternalFoo.g:1626:2: ( (otherlv_0= '!' )? ( ( (lv_conditions_1_0= ruleComparison ) ) | ( (lv_conditions_2_0= ruleStr ) ) )+ )
            {
            // InternalFoo.g:1626:2: ( (otherlv_0= '!' )? ( ( (lv_conditions_1_0= ruleComparison ) ) | ( (lv_conditions_2_0= ruleStr ) ) )+ )
            // InternalFoo.g:1627:3: (otherlv_0= '!' )? ( ( (lv_conditions_1_0= ruleComparison ) ) | ( (lv_conditions_2_0= ruleStr ) ) )+
            {
            // InternalFoo.g:1627:3: (otherlv_0= '!' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFoo.g:1628:4: otherlv_0= '!'
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getExclamationMarkKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalFoo.g:1633:3: ( ( (lv_conditions_1_0= ruleComparison ) ) | ( (lv_conditions_2_0= ruleStr ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    int LA28_2 = input.LA(2);

                    if ( ((LA28_2>=39 && LA28_2<=43)) ) {
                        alt28=1;
                    }
                    else if ( (LA28_2==EOF||LA28_2==RULE_ID||LA28_2==14||(LA28_2>=32 && LA28_2<=34)) ) {
                        alt28=2;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalFoo.g:1634:4: ( (lv_conditions_1_0= ruleComparison ) )
            	    {
            	    // InternalFoo.g:1634:4: ( (lv_conditions_1_0= ruleComparison ) )
            	    // InternalFoo.g:1635:5: (lv_conditions_1_0= ruleComparison )
            	    {
            	    // InternalFoo.g:1635:5: (lv_conditions_1_0= ruleComparison )
            	    // InternalFoo.g:1636:6: lv_conditions_1_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConditionAccess().getConditionsComparisonParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_conditions_1_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConditionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"conditions",
            	      							lv_conditions_1_0,
            	      							"com.project.foo.Foo.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFoo.g:1654:4: ( (lv_conditions_2_0= ruleStr ) )
            	    {
            	    // InternalFoo.g:1654:4: ( (lv_conditions_2_0= ruleStr ) )
            	    // InternalFoo.g:1655:5: (lv_conditions_2_0= ruleStr )
            	    {
            	    // InternalFoo.g:1655:5: (lv_conditions_2_0= ruleStr )
            	    // InternalFoo.g:1656:6: lv_conditions_2_0= ruleStr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConditionAccess().getConditionsStrParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_conditions_2_0=ruleStr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConditionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"conditions",
            	      							lv_conditions_2_0,
            	      							"com.project.foo.Foo.Str");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleStr"
    // InternalFoo.g:1678:1: entryRuleStr returns [EObject current=null] : iv_ruleStr= ruleStr EOF ;
    public final EObject entryRuleStr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStr = null;


        try {
            // InternalFoo.g:1678:44: (iv_ruleStr= ruleStr EOF )
            // InternalFoo.g:1679:2: iv_ruleStr= ruleStr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStr=ruleStr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStr"


    // $ANTLR start "ruleStr"
    // InternalFoo.g:1685:1: ruleStr returns [EObject current=null] : ( ( (lv_value_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_value_4_0= RULE_ID ) )? otherlv_5= ')' )* ) ;
    public final EObject ruleStr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFoo.g:1691:2: ( ( ( (lv_value_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_value_4_0= RULE_ID ) )? otherlv_5= ')' )* ) )
            // InternalFoo.g:1692:2: ( ( (lv_value_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_value_4_0= RULE_ID ) )? otherlv_5= ')' )* )
            {
            // InternalFoo.g:1692:2: ( ( (lv_value_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_value_4_0= RULE_ID ) )? otherlv_5= ')' )* )
            // InternalFoo.g:1693:3: ( (lv_value_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_value_4_0= RULE_ID ) )? otherlv_5= ')' )*
            {
            // InternalFoo.g:1693:3: ( (lv_value_0_0= RULE_ID ) )
            // InternalFoo.g:1694:4: (lv_value_0_0= RULE_ID )
            {
            // InternalFoo.g:1694:4: (lv_value_0_0= RULE_ID )
            // InternalFoo.g:1695:5: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_0_0, grammarAccess.getStrAccess().getValueIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStrRule());
              					}
              					addWithLastConsumed(
              						current,
              						"value",
              						lv_value_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalFoo.g:1711:3: (otherlv_1= '.' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_value_4_0= RULE_ID ) )? otherlv_5= ')' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==14) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalFoo.g:1712:4: otherlv_1= '.' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_value_4_0= RULE_ID ) )? otherlv_5= ')'
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getStrAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalFoo.g:1716:4: ( (lv_value_2_0= RULE_ID ) )
            	    // InternalFoo.g:1717:5: (lv_value_2_0= RULE_ID )
            	    {
            	    // InternalFoo.g:1717:5: (lv_value_2_0= RULE_ID )
            	    // InternalFoo.g:1718:6: lv_value_2_0= RULE_ID
            	    {
            	    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_value_2_0, grammarAccess.getStrAccess().getValueIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getStrRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"value",
            	      							lv_value_2_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,31,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getStrAccess().getLeftParenthesisKeyword_1_2());
            	      			
            	    }
            	    // InternalFoo.g:1738:4: ( (lv_value_4_0= RULE_ID ) )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==RULE_ID) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalFoo.g:1739:5: (lv_value_4_0= RULE_ID )
            	            {
            	            // InternalFoo.g:1739:5: (lv_value_4_0= RULE_ID )
            	            // InternalFoo.g:1740:6: lv_value_4_0= RULE_ID
            	            {
            	            lv_value_4_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(lv_value_4_0, grammarAccess.getStrAccess().getValueIDTerminalRuleCall_1_3_0());
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElement(grammarAccess.getStrRule());
            	              						}
            	              						addWithLastConsumed(
            	              							current,
            	              							"value",
            	              							lv_value_4_0,
            	              							"org.eclipse.xtext.common.Terminals.ID");
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_5=(Token)match(input,34,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getStrAccess().getRightParenthesisKeyword_1_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStr"


    // $ANTLR start "entryRuleComparison"
    // InternalFoo.g:1765:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalFoo.g:1765:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalFoo.g:1766:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalFoo.g:1772:1: ruleComparison returns [EObject current=null] : ( ( (lv_leftMember_0_0= RULE_ID ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '<=' | otherlv_4= '>=' | otherlv_5= '==' ) ( (lv_rightMember_6_0= RULE_ID ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_leftMember_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_rightMember_6_0=null;


        	enterRule();

        try {
            // InternalFoo.g:1778:2: ( ( ( (lv_leftMember_0_0= RULE_ID ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '<=' | otherlv_4= '>=' | otherlv_5= '==' ) ( (lv_rightMember_6_0= RULE_ID ) ) ) )
            // InternalFoo.g:1779:2: ( ( (lv_leftMember_0_0= RULE_ID ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '<=' | otherlv_4= '>=' | otherlv_5= '==' ) ( (lv_rightMember_6_0= RULE_ID ) ) )
            {
            // InternalFoo.g:1779:2: ( ( (lv_leftMember_0_0= RULE_ID ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '<=' | otherlv_4= '>=' | otherlv_5= '==' ) ( (lv_rightMember_6_0= RULE_ID ) ) )
            // InternalFoo.g:1780:3: ( (lv_leftMember_0_0= RULE_ID ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '<=' | otherlv_4= '>=' | otherlv_5= '==' ) ( (lv_rightMember_6_0= RULE_ID ) )
            {
            // InternalFoo.g:1780:3: ( (lv_leftMember_0_0= RULE_ID ) )
            // InternalFoo.g:1781:4: (lv_leftMember_0_0= RULE_ID )
            {
            // InternalFoo.g:1781:4: (lv_leftMember_0_0= RULE_ID )
            // InternalFoo.g:1782:5: lv_leftMember_0_0= RULE_ID
            {
            lv_leftMember_0_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_leftMember_0_0, grammarAccess.getComparisonAccess().getLeftMemberIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComparisonRule());
              					}
              					setWithLastConsumed(
              						current,
              						"leftMember",
              						lv_leftMember_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalFoo.g:1798:3: (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '<=' | otherlv_4= '>=' | otherlv_5= '==' )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt31=1;
                }
                break;
            case 40:
                {
                alt31=2;
                }
                break;
            case 41:
                {
                alt31=3;
                }
                break;
            case 42:
                {
                alt31=4;
                }
                break;
            case 43:
                {
                alt31=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalFoo.g:1799:4: otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalFoo.g:1804:4: otherlv_2= '>'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalFoo.g:1809:4: otherlv_3= '<='
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalFoo.g:1814:4: otherlv_4= '>='
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_3());
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalFoo.g:1819:4: otherlv_5= '=='
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_4());
                      			
                    }

                    }
                    break;

            }

            // InternalFoo.g:1824:3: ( (lv_rightMember_6_0= RULE_ID ) )
            // InternalFoo.g:1825:4: (lv_rightMember_6_0= RULE_ID )
            {
            // InternalFoo.g:1825:4: (lv_rightMember_6_0= RULE_ID )
            // InternalFoo.g:1826:5: lv_rightMember_6_0= RULE_ID
            {
            lv_rightMember_6_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_rightMember_6_0, grammarAccess.getComparisonAccess().getRightMemberIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComparisonRule());
              					}
              					setWithLastConsumed(
              						current,
              						"rightMember",
              						lv_rightMember_6_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePSignature"
    // InternalFoo.g:1846:1: entryRulePSignature returns [EObject current=null] : iv_rulePSignature= rulePSignature EOF ;
    public final EObject entryRulePSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePSignature = null;


        try {
            // InternalFoo.g:1846:51: (iv_rulePSignature= rulePSignature EOF )
            // InternalFoo.g:1847:2: iv_rulePSignature= rulePSignature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePSignature=rulePSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePSignature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePSignature"


    // $ANTLR start "rulePSignature"
    // InternalFoo.g:1853:1: rulePSignature returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) ;
    public final EObject rulePSignature() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:1859:2: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) )
            // InternalFoo.g:1860:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            {
            // InternalFoo.g:1860:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            // InternalFoo.g:1861:3: ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
            {
            // InternalFoo.g:1861:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalFoo.g:1862:4: (lv_type_0_0= RULE_ID )
            {
            // InternalFoo.g:1862:4: (lv_type_0_0= RULE_ID )
            // InternalFoo.g:1863:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_type_0_0, grammarAccess.getPSignatureAccess().getTypeIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPSignatureRule());
              					}
              					setWithLastConsumed(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalFoo.g:1879:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFoo.g:1880:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFoo.g:1880:4: (lv_name_1_0= RULE_ID )
            // InternalFoo.g:1881:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPSignatureAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPSignatureRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPSignatureAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalFoo.g:1901:3: ( (lv_parameters_3_0= ruleParameter ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalFoo.g:1902:4: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalFoo.g:1902:4: (lv_parameters_3_0= ruleParameter )
                    // InternalFoo.g:1903:5: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_38);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPSignatureRule());
                      					}
                      					add(
                      						current,
                      						"parameters",
                      						lv_parameters_3_0,
                      						"com.project.foo.Foo.Parameter");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalFoo.g:1920:3: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalFoo.g:1921:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getPSignatureAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalFoo.g:1925:4: ( (lv_parameters_5_0= ruleParameter ) )
            	    // InternalFoo.g:1926:5: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // InternalFoo.g:1926:5: (lv_parameters_5_0= ruleParameter )
            	    // InternalFoo.g:1927:6: lv_parameters_5_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_parameters_5_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPSignatureRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parameters",
            	      							lv_parameters_5_0,
            	      							"com.project.foo.Foo.Parameter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_6=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getPSignatureAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePSignature"


    // $ANTLR start "entryRuleMRequiredService"
    // InternalFoo.g:1953:1: entryRuleMRequiredService returns [EObject current=null] : iv_ruleMRequiredService= ruleMRequiredService EOF ;
    public final EObject entryRuleMRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMRequiredService = null;


        try {
            // InternalFoo.g:1953:57: (iv_ruleMRequiredService= ruleMRequiredService EOF )
            // InternalFoo.g:1954:2: iv_ruleMRequiredService= ruleMRequiredService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMRequiredServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMRequiredService=ruleMRequiredService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMRequiredService; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMRequiredService"


    // $ANTLR start "ruleMRequiredService"
    // InternalFoo.g:1960:1: ruleMRequiredService returns [EObject current=null] : (otherlv_0= 'service' otherlv_1= 'required' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' ) ;
    public final EObject ruleMRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_signature_2_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:1966:2: ( (otherlv_0= 'service' otherlv_1= 'required' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' ) )
            // InternalFoo.g:1967:2: (otherlv_0= 'service' otherlv_1= 'required' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' )
            {
            // InternalFoo.g:1967:2: (otherlv_0= 'service' otherlv_1= 'required' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' )
            // InternalFoo.g:1968:3: otherlv_0= 'service' otherlv_1= 'required' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMRequiredServiceAccess().getServiceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMRequiredServiceAccess().getRequiredKeyword_1());
              		
            }
            // InternalFoo.g:1976:3: ( (lv_signature_2_0= ruleRSignature ) )
            // InternalFoo.g:1977:4: (lv_signature_2_0= ruleRSignature )
            {
            // InternalFoo.g:1977:4: (lv_signature_2_0= ruleRSignature )
            // InternalFoo.g:1978:5: lv_signature_2_0= ruleRSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMRequiredServiceAccess().getSignatureRSignatureParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_signature_2_0=ruleRSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMRequiredServiceRule());
              					}
              					set(
              						current,
              						"signature",
              						lv_signature_2_0,
              						"com.project.foo.Foo.RSignature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMRequiredServiceAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMRequiredService"


    // $ANTLR start "entryRuleRSignature"
    // InternalFoo.g:2003:1: entryRuleRSignature returns [EObject current=null] : iv_ruleRSignature= ruleRSignature EOF ;
    public final EObject entryRuleRSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRSignature = null;


        try {
            // InternalFoo.g:2003:51: (iv_ruleRSignature= ruleRSignature EOF )
            // InternalFoo.g:2004:2: iv_ruleRSignature= ruleRSignature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRSignature=ruleRSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRSignature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRSignature"


    // $ANTLR start "ruleRSignature"
    // InternalFoo.g:2010:1: ruleRSignature returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleRSignature() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:2016:2: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) )
            // InternalFoo.g:2017:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            {
            // InternalFoo.g:2017:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            // InternalFoo.g:2018:3: ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
            {
            // InternalFoo.g:2018:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalFoo.g:2019:4: (lv_type_0_0= RULE_ID )
            {
            // InternalFoo.g:2019:4: (lv_type_0_0= RULE_ID )
            // InternalFoo.g:2020:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_type_0_0, grammarAccess.getRSignatureAccess().getTypeIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRSignatureRule());
              					}
              					setWithLastConsumed(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalFoo.g:2036:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFoo.g:2037:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFoo.g:2037:4: (lv_name_1_0= RULE_ID )
            // InternalFoo.g:2038:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRSignatureAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRSignatureRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRSignatureAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalFoo.g:2058:3: ( (lv_parameters_3_0= ruleParameter ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalFoo.g:2059:4: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalFoo.g:2059:4: (lv_parameters_3_0= ruleParameter )
                    // InternalFoo.g:2060:5: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_38);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRSignatureRule());
                      					}
                      					add(
                      						current,
                      						"parameters",
                      						lv_parameters_3_0,
                      						"com.project.foo.Foo.Parameter");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalFoo.g:2077:3: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==27) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalFoo.g:2078:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getRSignatureAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalFoo.g:2082:4: ( (lv_parameters_5_0= ruleParameter ) )
            	    // InternalFoo.g:2083:5: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // InternalFoo.g:2083:5: (lv_parameters_5_0= ruleParameter )
            	    // InternalFoo.g:2084:6: lv_parameters_5_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_parameters_5_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRSignatureRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parameters",
            	      							lv_parameters_5_0,
            	      							"com.project.foo.Foo.Parameter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_6=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getRSignatureAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRSignature"


    // $ANTLR start "entryRuleParameter"
    // InternalFoo.g:2110:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalFoo.g:2110:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalFoo.g:2111:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalFoo.g:2117:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalFoo.g:2123:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) )
            // InternalFoo.g:2124:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            {
            // InternalFoo.g:2124:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            // InternalFoo.g:2125:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) )
            {
            // InternalFoo.g:2125:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFoo.g:2126:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFoo.g:2126:4: (lv_name_0_0= RULE_ID )
            // InternalFoo.g:2127:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
              		
            }
            // InternalFoo.g:2147:3: ( (lv_type_2_0= RULE_ID ) )
            // InternalFoo.g:2148:4: (lv_type_2_0= RULE_ID )
            {
            // InternalFoo.g:2148:4: (lv_type_2_0= RULE_ID )
            // InternalFoo.g:2149:5: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_type_2_0, grammarAccess.getParameterAccess().getTypeIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"

    // $ANTLR start synpred1_InternalFoo
    public final void synpred1_InternalFoo_fragment() throws RecognitionException {   
        // InternalFoo.g:1345:5: ( 'else' )
        // InternalFoo.g:1345:6: 'else'
        {
        match(input,36,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalFoo

    // Delegated rules

    public final boolean synpred1_InternalFoo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalFoo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\11\4\2\uffff\1\4\1\37\1\4\1\42\1\4";
    static final String dfa_3s = "\1\46\1\4\1\53\6\4\2\uffff\1\42\1\37\3\42";
    static final String dfa_4s = "\11\uffff\1\1\1\2\5\uffff";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\41\uffff\1\1",
            "\1\2",
            "\1\2\11\uffff\1\10\21\uffff\2\11\1\12\4\uffff\1\3\1\4\1\5\1\6\1\7",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\14",
            "",
            "",
            "\1\2\33\uffff\2\11\1\12",
            "\1\15",
            "\1\16\35\uffff\1\17",
            "\1\17",
            "\1\2\11\uffff\1\10\21\uffff\2\11\1\12"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 1213:3: ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )*";
        }
    }
    static final String dfa_7s = "\11\uffff\1\2\1\1\5\uffff";
    static final String[] dfa_8s = {
            "\1\2\41\uffff\1\1",
            "\1\2",
            "\1\2\11\uffff\1\10\21\uffff\2\12\1\11\4\uffff\1\3\1\4\1\5\1\6\1\7",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\14",
            "",
            "",
            "\1\2\33\uffff\2\12\1\11",
            "\1\15",
            "\1\16\35\uffff\1\17",
            "\1\17",
            "\1\2\11\uffff\1\10\21\uffff\2\12\1\11"
    };
    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[][] dfa_8 = unpackEncodedStringArray(dfa_8s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_7;
            this.special = dfa_5;
            this.transition = dfa_8;
        }
        public String getDescription() {
            return "()* loopback of 1478:3: ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000042A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000422000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000021002010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001002010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008002010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002040000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002040002010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000006040000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002040000012L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000F8000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000408000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000408000000L});

}