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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'refine'", "'with'", "'Assembly'", "'components'", "'bindings'", "':'", "'-'", "'Component'", "'assembly'", "'provided'", "'='", "','", "'required'", "'service'", "'if'", "'('", "'||'", "'&&'", "')'", "'else'", "'while'", "'!'", "';'", "'<'", "'>'", "'<='", "'>='", "'=='"
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
    // InternalFoo.g:107:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_components_4_0= ruleComponent ) )* ( (lv_assembly_5_0= ruleAssembly ) )* ( (lv_refiningList_6_0= ruleRefine ) )* otherlv_7= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_components_4_0 = null;

        EObject lv_assembly_5_0 = null;

        EObject lv_refiningList_6_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:113:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_components_4_0= ruleComponent ) )* ( (lv_assembly_5_0= ruleAssembly ) )* ( (lv_refiningList_6_0= ruleRefine ) )* otherlv_7= '}' ) )
            // InternalFoo.g:114:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_components_4_0= ruleComponent ) )* ( (lv_assembly_5_0= ruleAssembly ) )* ( (lv_refiningList_6_0= ruleRefine ) )* otherlv_7= '}' )
            {
            // InternalFoo.g:114:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_components_4_0= ruleComponent ) )* ( (lv_assembly_5_0= ruleAssembly ) )* ( (lv_refiningList_6_0= ruleRefine ) )* otherlv_7= '}' )
            // InternalFoo.g:115:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_components_4_0= ruleComponent ) )* ( (lv_assembly_5_0= ruleAssembly ) )* ( (lv_refiningList_6_0= ruleRefine ) )* otherlv_7= '}'
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

                if ( (LA2_0==24) ) {
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

                if ( (LA3_0==19) ) {
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

            // InternalFoo.g:199:3: ( (lv_refiningList_6_0= ruleRefine ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFoo.g:200:4: (lv_refiningList_6_0= ruleRefine )
            	    {
            	    // InternalFoo.g:200:4: (lv_refiningList_6_0= ruleRefine )
            	    // InternalFoo.g:201:5: lv_refiningList_6_0= ruleRefine
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getRefiningListRefineParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_refiningList_6_0=ruleRefine();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"refiningList",
            	      						lv_refiningList_6_0,
            	      						"com.project.foo.Foo.Refine");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7());
              		
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
    // InternalFoo.g:226:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalFoo.g:226:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalFoo.g:227:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalFoo.g:233:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalFoo.g:239:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalFoo.g:240:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalFoo.g:240:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalFoo.g:241:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalFoo.g:248:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFoo.g:249:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalFoo.g:266:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalFoo.g:266:47: (iv_ruleImport= ruleImport EOF )
            // InternalFoo.g:267:2: iv_ruleImport= ruleImport EOF
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
    // InternalFoo.g:273:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:279:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalFoo.g:280:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalFoo.g:280:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalFoo.g:281:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalFoo.g:285:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalFoo.g:286:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalFoo.g:286:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalFoo.g:287:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalFoo.g:308:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalFoo.g:308:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalFoo.g:309:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalFoo.g:315:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:321:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalFoo.g:322:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalFoo.g:322:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalFoo.g:323:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_10);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalFoo.g:333:3: (kw= '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFoo.g:334:4: kw= '.*'
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


    // $ANTLR start "entryRuleRefine"
    // InternalFoo.g:344:1: entryRuleRefine returns [EObject current=null] : iv_ruleRefine= ruleRefine EOF ;
    public final EObject entryRuleRefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefine = null;


        try {
            // InternalFoo.g:344:47: (iv_ruleRefine= ruleRefine EOF )
            // InternalFoo.g:345:2: iv_ruleRefine= ruleRefine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefine=ruleRefine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefine; 
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
    // $ANTLR end "entryRuleRefine"


    // $ANTLR start "ruleRefine"
    // InternalFoo.g:351:1: ruleRefine returns [EObject current=null] : (otherlv_0= 'refine' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleRefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalFoo.g:357:2: ( (otherlv_0= 'refine' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalFoo.g:358:2: (otherlv_0= 'refine' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalFoo.g:358:2: (otherlv_0= 'refine' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) )
            // InternalFoo.g:359:3: otherlv_0= 'refine' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRefineAccess().getRefineKeyword_0());
              		
            }
            // InternalFoo.g:363:3: ( (otherlv_1= RULE_ID ) )
            // InternalFoo.g:364:4: (otherlv_1= RULE_ID )
            {
            // InternalFoo.g:364:4: (otherlv_1= RULE_ID )
            // InternalFoo.g:365:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRefineRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getRefineAccess().getEltToRefineElementCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRefineAccess().getWithKeyword_2());
              		
            }
            // InternalFoo.g:380:3: ( (otherlv_3= RULE_ID ) )
            // InternalFoo.g:381:4: (otherlv_3= RULE_ID )
            {
            // InternalFoo.g:381:4: (otherlv_3= RULE_ID )
            // InternalFoo.g:382:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRefineRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getRefineAccess().getRefiningEltElementCrossReference_3_0());
              				
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
    // $ANTLR end "ruleRefine"


    // $ANTLR start "entryRuleAssembly"
    // InternalFoo.g:397:1: entryRuleAssembly returns [EObject current=null] : iv_ruleAssembly= ruleAssembly EOF ;
    public final EObject entryRuleAssembly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembly = null;


        try {
            // InternalFoo.g:397:49: (iv_ruleAssembly= ruleAssembly EOF )
            // InternalFoo.g:398:2: iv_ruleAssembly= ruleAssembly EOF
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
    // InternalFoo.g:404:1: ruleAssembly returns [EObject current=null] : ( () otherlv_1= 'Assembly' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' ( (lv_attributes_5_0= ruleComponentInstance ) ) ( (lv_attributes_6_0= ruleComponentInstance ) )+ otherlv_7= 'bindings' ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' ) ;
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
            // InternalFoo.g:410:2: ( ( () otherlv_1= 'Assembly' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' ( (lv_attributes_5_0= ruleComponentInstance ) ) ( (lv_attributes_6_0= ruleComponentInstance ) )+ otherlv_7= 'bindings' ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' ) )
            // InternalFoo.g:411:2: ( () otherlv_1= 'Assembly' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' ( (lv_attributes_5_0= ruleComponentInstance ) ) ( (lv_attributes_6_0= ruleComponentInstance ) )+ otherlv_7= 'bindings' ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' )
            {
            // InternalFoo.g:411:2: ( () otherlv_1= 'Assembly' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' ( (lv_attributes_5_0= ruleComponentInstance ) ) ( (lv_attributes_6_0= ruleComponentInstance ) )+ otherlv_7= 'bindings' ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' )
            // InternalFoo.g:412:3: () otherlv_1= 'Assembly' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' ( (lv_attributes_5_0= ruleComponentInstance ) ) ( (lv_attributes_6_0= ruleComponentInstance ) )+ otherlv_7= 'bindings' ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}'
            {
            // InternalFoo.g:412:3: ()
            // InternalFoo.g:413:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAssemblyAccess().getAssemblyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssemblyAccess().getAssemblyKeyword_1());
              		
            }
            // InternalFoo.g:423:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFoo.g:424:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFoo.g:424:4: (lv_name_2_0= RULE_ID )
            // InternalFoo.g:425:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,12,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAssemblyAccess().getComponentsKeyword_4());
              		
            }
            // InternalFoo.g:449:3: ( (lv_attributes_5_0= ruleComponentInstance ) )
            // InternalFoo.g:450:4: (lv_attributes_5_0= ruleComponentInstance )
            {
            // InternalFoo.g:450:4: (lv_attributes_5_0= ruleComponentInstance )
            // InternalFoo.g:451:5: lv_attributes_5_0= ruleComponentInstance
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

            // InternalFoo.g:468:3: ( (lv_attributes_6_0= ruleComponentInstance ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFoo.g:469:4: (lv_attributes_6_0= ruleComponentInstance )
            	    {
            	    // InternalFoo.g:469:4: (lv_attributes_6_0= ruleComponentInstance )
            	    // InternalFoo.g:470:5: lv_attributes_6_0= ruleComponentInstance
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAssemblyAccess().getAttributesComponentInstanceParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
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
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getAssemblyAccess().getBindingsKeyword_7());
              		
            }
            // InternalFoo.g:491:3: ( (lv_bindings_8_0= ruleBinding ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFoo.g:492:4: (lv_bindings_8_0= ruleBinding )
            	    {
            	    // InternalFoo.g:492:4: (lv_bindings_8_0= ruleBinding )
            	    // InternalFoo.g:493:5: lv_bindings_8_0= ruleBinding
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAssemblyAccess().getBindingsBindingParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
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
            	    break loop8;
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
    // InternalFoo.g:518:1: entryRuleComponentInstance returns [EObject current=null] : iv_ruleComponentInstance= ruleComponentInstance EOF ;
    public final EObject entryRuleComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstance = null;


        try {
            // InternalFoo.g:518:58: (iv_ruleComponentInstance= ruleComponentInstance EOF )
            // InternalFoo.g:519:2: iv_ruleComponentInstance= ruleComponentInstance EOF
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
    // InternalFoo.g:525:1: ruleComponentInstance returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleComponentInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFoo.g:531:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalFoo.g:532:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalFoo.g:532:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:533:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:533:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFoo.g:534:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFoo.g:534:4: (lv_name_0_0= RULE_ID )
            // InternalFoo.g:535:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentInstanceAccess().getColonKeyword_1());
              		
            }
            // InternalFoo.g:555:3: ( ( ruleQualifiedName ) )
            // InternalFoo.g:556:4: ( ruleQualifiedName )
            {
            // InternalFoo.g:556:4: ( ruleQualifiedName )
            // InternalFoo.g:557:5: ruleQualifiedName
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
    // InternalFoo.g:575:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalFoo.g:575:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalFoo.g:576:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalFoo.g:582:1: ruleBinding returns [EObject current=null] : ( ( (lv_bindingRequired_0_0= ruleBindingRequired ) ) otherlv_1= '-' ( (lv_bindingProvided_2_0= ruleBindingProvided ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_bindingRequired_0_0 = null;

        EObject lv_bindingProvided_2_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:588:2: ( ( ( (lv_bindingRequired_0_0= ruleBindingRequired ) ) otherlv_1= '-' ( (lv_bindingProvided_2_0= ruleBindingProvided ) ) ) )
            // InternalFoo.g:589:2: ( ( (lv_bindingRequired_0_0= ruleBindingRequired ) ) otherlv_1= '-' ( (lv_bindingProvided_2_0= ruleBindingProvided ) ) )
            {
            // InternalFoo.g:589:2: ( ( (lv_bindingRequired_0_0= ruleBindingRequired ) ) otherlv_1= '-' ( (lv_bindingProvided_2_0= ruleBindingProvided ) ) )
            // InternalFoo.g:590:3: ( (lv_bindingRequired_0_0= ruleBindingRequired ) ) otherlv_1= '-' ( (lv_bindingProvided_2_0= ruleBindingProvided ) )
            {
            // InternalFoo.g:590:3: ( (lv_bindingRequired_0_0= ruleBindingRequired ) )
            // InternalFoo.g:591:4: (lv_bindingRequired_0_0= ruleBindingRequired )
            {
            // InternalFoo.g:591:4: (lv_bindingRequired_0_0= ruleBindingRequired )
            // InternalFoo.g:592:5: lv_bindingRequired_0_0= ruleBindingRequired
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getBindingRequiredBindingRequiredParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            otherlv_1=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getHyphenMinusKeyword_1());
              		
            }
            // InternalFoo.g:613:3: ( (lv_bindingProvided_2_0= ruleBindingProvided ) )
            // InternalFoo.g:614:4: (lv_bindingProvided_2_0= ruleBindingProvided )
            {
            // InternalFoo.g:614:4: (lv_bindingProvided_2_0= ruleBindingProvided )
            // InternalFoo.g:615:5: lv_bindingProvided_2_0= ruleBindingProvided
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
    // InternalFoo.g:636:1: entryRuleBindingRequired returns [EObject current=null] : iv_ruleBindingRequired= ruleBindingRequired EOF ;
    public final EObject entryRuleBindingRequired() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingRequired = null;


        try {
            // InternalFoo.g:636:56: (iv_ruleBindingRequired= ruleBindingRequired EOF )
            // InternalFoo.g:637:2: iv_ruleBindingRequired= ruleBindingRequired EOF
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
    // InternalFoo.g:643:1: ruleBindingRequired returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleBindingRequired() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFoo.g:649:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) )
            // InternalFoo.g:650:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            {
            // InternalFoo.g:650:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:651:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:651:3: ( (otherlv_0= RULE_ID ) )
            // InternalFoo.g:652:4: (otherlv_0= RULE_ID )
            {
            // InternalFoo.g:652:4: (otherlv_0= RULE_ID )
            // InternalFoo.g:653:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingRequiredRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getBindingRequiredAccess().getNameComponentInstanceCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBindingRequiredAccess().getFullStopKeyword_1());
              		
            }
            // InternalFoo.g:668:3: ( ( ruleQualifiedName ) )
            // InternalFoo.g:669:4: ( ruleQualifiedName )
            {
            // InternalFoo.g:669:4: ( ruleQualifiedName )
            // InternalFoo.g:670:5: ruleQualifiedName
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
    // InternalFoo.g:688:1: entryRuleBindingProvided returns [EObject current=null] : iv_ruleBindingProvided= ruleBindingProvided EOF ;
    public final EObject entryRuleBindingProvided() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingProvided = null;


        try {
            // InternalFoo.g:688:56: (iv_ruleBindingProvided= ruleBindingProvided EOF )
            // InternalFoo.g:689:2: iv_ruleBindingProvided= ruleBindingProvided EOF
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
    // InternalFoo.g:695:1: ruleBindingProvided returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleBindingProvided() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFoo.g:701:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) )
            // InternalFoo.g:702:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            {
            // InternalFoo.g:702:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:703:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:703:3: ( (otherlv_0= RULE_ID ) )
            // InternalFoo.g:704:4: (otherlv_0= RULE_ID )
            {
            // InternalFoo.g:704:4: (otherlv_0= RULE_ID )
            // InternalFoo.g:705:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingProvidedRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getBindingProvidedAccess().getNameComponentInstanceCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBindingProvidedAccess().getFullStopKeyword_1());
              		
            }
            // InternalFoo.g:720:3: ( ( ruleQualifiedName ) )
            // InternalFoo.g:721:4: ( ruleQualifiedName )
            {
            // InternalFoo.g:721:4: ( ruleQualifiedName )
            // InternalFoo.g:722:5: ruleQualifiedName
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
    // InternalFoo.g:740:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalFoo.g:740:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalFoo.g:741:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalFoo.g:747:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_listOfPServices_3_0= ruleListOfProvidedServices ) ) ( (lv_listOfRServices_4_0= ruleListOfrequiredServices ) ) ( (lv_mProvServices_5_0= ruleMProvidedService ) )+ ( (lv_mReqServices_6_0= ruleMRequiredService ) )* ( (otherlv_7= 'assembly' otherlv_8= ':' )? ( ( ruleQualifiedName ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_listOfPServices_3_0 = null;

        EObject lv_listOfRServices_4_0 = null;

        EObject lv_mProvServices_5_0 = null;

        EObject lv_mReqServices_6_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:753:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_listOfPServices_3_0= ruleListOfProvidedServices ) ) ( (lv_listOfRServices_4_0= ruleListOfrequiredServices ) ) ( (lv_mProvServices_5_0= ruleMProvidedService ) )+ ( (lv_mReqServices_6_0= ruleMRequiredService ) )* ( (otherlv_7= 'assembly' otherlv_8= ':' )? ( ( ruleQualifiedName ) ) )* otherlv_10= '}' ) )
            // InternalFoo.g:754:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_listOfPServices_3_0= ruleListOfProvidedServices ) ) ( (lv_listOfRServices_4_0= ruleListOfrequiredServices ) ) ( (lv_mProvServices_5_0= ruleMProvidedService ) )+ ( (lv_mReqServices_6_0= ruleMRequiredService ) )* ( (otherlv_7= 'assembly' otherlv_8= ':' )? ( ( ruleQualifiedName ) ) )* otherlv_10= '}' )
            {
            // InternalFoo.g:754:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_listOfPServices_3_0= ruleListOfProvidedServices ) ) ( (lv_listOfRServices_4_0= ruleListOfrequiredServices ) ) ( (lv_mProvServices_5_0= ruleMProvidedService ) )+ ( (lv_mReqServices_6_0= ruleMRequiredService ) )* ( (otherlv_7= 'assembly' otherlv_8= ':' )? ( ( ruleQualifiedName ) ) )* otherlv_10= '}' )
            // InternalFoo.g:755:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_listOfPServices_3_0= ruleListOfProvidedServices ) ) ( (lv_listOfRServices_4_0= ruleListOfrequiredServices ) ) ( (lv_mProvServices_5_0= ruleMProvidedService ) )+ ( (lv_mReqServices_6_0= ruleMRequiredService ) )* ( (otherlv_7= 'assembly' otherlv_8= ':' )? ( ( ruleQualifiedName ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
              		
            }
            // InternalFoo.g:759:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFoo.g:760:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFoo.g:760:4: (lv_name_1_0= RULE_ID )
            // InternalFoo.g:761:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,12,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalFoo.g:781:3: ( (lv_listOfPServices_3_0= ruleListOfProvidedServices ) )
            // InternalFoo.g:782:4: (lv_listOfPServices_3_0= ruleListOfProvidedServices )
            {
            // InternalFoo.g:782:4: (lv_listOfPServices_3_0= ruleListOfProvidedServices )
            // InternalFoo.g:783:5: lv_listOfPServices_3_0= ruleListOfProvidedServices
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentAccess().getListOfPServicesListOfProvidedServicesParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_listOfPServices_3_0=ruleListOfProvidedServices();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComponentRule());
              					}
              					set(
              						current,
              						"listOfPServices",
              						lv_listOfPServices_3_0,
              						"com.project.foo.Foo.ListOfProvidedServices");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFoo.g:800:3: ( (lv_listOfRServices_4_0= ruleListOfrequiredServices ) )
            // InternalFoo.g:801:4: (lv_listOfRServices_4_0= ruleListOfrequiredServices )
            {
            // InternalFoo.g:801:4: (lv_listOfRServices_4_0= ruleListOfrequiredServices )
            // InternalFoo.g:802:5: lv_listOfRServices_4_0= ruleListOfrequiredServices
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentAccess().getListOfRServicesListOfrequiredServicesParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_listOfRServices_4_0=ruleListOfrequiredServices();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComponentRule());
              					}
              					set(
              						current,
              						"listOfRServices",
              						lv_listOfRServices_4_0,
              						"com.project.foo.Foo.ListOfrequiredServices");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFoo.g:819:3: ( (lv_mProvServices_5_0= ruleMProvidedService ) )+
            int cnt9=0;
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
            	    // InternalFoo.g:820:4: (lv_mProvServices_5_0= ruleMProvidedService )
            	    {
            	    // InternalFoo.g:820:4: (lv_mProvServices_5_0= ruleMProvidedService )
            	    // InternalFoo.g:821:5: lv_mProvServices_5_0= ruleMProvidedService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComponentAccess().getMProvServicesMProvidedServiceParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_mProvServices_5_0=ruleMProvidedService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getComponentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"mProvServices",
            	      						lv_mProvServices_5_0,
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

            // InternalFoo.g:838:3: ( (lv_mReqServices_6_0= ruleMRequiredService ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFoo.g:839:4: (lv_mReqServices_6_0= ruleMRequiredService )
            	    {
            	    // InternalFoo.g:839:4: (lv_mReqServices_6_0= ruleMRequiredService )
            	    // InternalFoo.g:840:5: lv_mReqServices_6_0= ruleMRequiredService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComponentAccess().getMReqServicesMRequiredServiceParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_mReqServices_6_0=ruleMRequiredService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getComponentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"mReqServices",
            	      						lv_mReqServices_6_0,
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

            // InternalFoo.g:857:3: ( (otherlv_7= 'assembly' otherlv_8= ':' )? ( ( ruleQualifiedName ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFoo.g:858:4: (otherlv_7= 'assembly' otherlv_8= ':' )? ( ( ruleQualifiedName ) )
            	    {
            	    // InternalFoo.g:858:4: (otherlv_7= 'assembly' otherlv_8= ':' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==25) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalFoo.g:859:5: otherlv_7= 'assembly' otherlv_8= ':'
            	            {
            	            otherlv_7=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getAssemblyKeyword_7_0_0());
            	              				
            	            }
            	            otherlv_8=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getColonKeyword_7_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalFoo.g:868:4: ( ( ruleQualifiedName ) )
            	    // InternalFoo.g:869:5: ( ruleQualifiedName )
            	    {
            	    // InternalFoo.g:869:5: ( ruleQualifiedName )
            	    // InternalFoo.g:870:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getComponentRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComponentAccess().getAssembliesAssemblyCrossReference_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
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

            otherlv_10=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8());
              		
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
    // InternalFoo.g:893:1: entryRuleListOfProvidedServices returns [EObject current=null] : iv_ruleListOfProvidedServices= ruleListOfProvidedServices EOF ;
    public final EObject entryRuleListOfProvidedServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfProvidedServices = null;


        try {
            // InternalFoo.g:893:63: (iv_ruleListOfProvidedServices= ruleListOfProvidedServices EOF )
            // InternalFoo.g:894:2: iv_ruleListOfProvidedServices= ruleListOfProvidedServices EOF
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
    // InternalFoo.g:900:1: ruleListOfProvidedServices returns [EObject current=null] : (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' ) ;
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
            // InternalFoo.g:906:2: ( (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' ) )
            // InternalFoo.g:907:2: (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' )
            {
            // InternalFoo.g:907:2: (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' )
            // InternalFoo.g:908:3: otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getListOfProvidedServicesAccess().getProvidedKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListOfProvidedServicesAccess().getEqualsSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getListOfProvidedServicesAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalFoo.g:920:3: ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* )
            // InternalFoo.g:921:4: ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )*
            {
            // InternalFoo.g:921:4: ( (lv_providedServices_3_0= ruleProvidedService ) )
            // InternalFoo.g:922:5: (lv_providedServices_3_0= ruleProvidedService )
            {
            // InternalFoo.g:922:5: (lv_providedServices_3_0= ruleProvidedService )
            // InternalFoo.g:923:6: lv_providedServices_3_0= ruleProvidedService
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_0_0());
              					
            }
            pushFollow(FOLLOW_24);
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

            // InternalFoo.g:940:4: (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFoo.g:941:5: otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_4, grammarAccess.getListOfProvidedServicesAccess().getCommaKeyword_3_1_0());
            	      				
            	    }
            	    // InternalFoo.g:945:5: ( (lv_providedServices_5_0= ruleProvidedService ) )
            	    // InternalFoo.g:946:6: (lv_providedServices_5_0= ruleProvidedService )
            	    {
            	    // InternalFoo.g:946:6: (lv_providedServices_5_0= ruleProvidedService )
            	    // InternalFoo.g:947:7: lv_providedServices_5_0= ruleProvidedService
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_24);
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
    // InternalFoo.g:974:1: entryRuleProvidedService returns [EObject current=null] : iv_ruleProvidedService= ruleProvidedService EOF ;
    public final EObject entryRuleProvidedService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedService = null;


        try {
            // InternalFoo.g:974:56: (iv_ruleProvidedService= ruleProvidedService EOF )
            // InternalFoo.g:975:2: iv_ruleProvidedService= ruleProvidedService EOF
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
    // InternalFoo.g:981:1: ruleProvidedService returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleProvidedService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalFoo.g:987:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalFoo.g:988:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalFoo.g:988:2: ( (otherlv_0= RULE_ID ) )
            // InternalFoo.g:989:3: (otherlv_0= RULE_ID )
            {
            // InternalFoo.g:989:3: (otherlv_0= RULE_ID )
            // InternalFoo.g:990:4: otherlv_0= RULE_ID
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
    // InternalFoo.g:1004:1: entryRuleListOfrequiredServices returns [EObject current=null] : iv_ruleListOfrequiredServices= ruleListOfrequiredServices EOF ;
    public final EObject entryRuleListOfrequiredServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfrequiredServices = null;


        try {
            // InternalFoo.g:1004:63: (iv_ruleListOfrequiredServices= ruleListOfrequiredServices EOF )
            // InternalFoo.g:1005:2: iv_ruleListOfrequiredServices= ruleListOfrequiredServices EOF
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
    // InternalFoo.g:1011:1: ruleListOfrequiredServices returns [EObject current=null] : ( () otherlv_1= 'required' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* ) otherlv_7= '}' ) ;
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
            // InternalFoo.g:1017:2: ( ( () otherlv_1= 'required' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* ) otherlv_7= '}' ) )
            // InternalFoo.g:1018:2: ( () otherlv_1= 'required' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* ) otherlv_7= '}' )
            {
            // InternalFoo.g:1018:2: ( () otherlv_1= 'required' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* ) otherlv_7= '}' )
            // InternalFoo.g:1019:3: () otherlv_1= 'required' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* ) otherlv_7= '}'
            {
            // InternalFoo.g:1019:3: ()
            // InternalFoo.g:1020:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListOfrequiredServicesAccess().getListOfrequiredServicesAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListOfrequiredServicesAccess().getRequiredKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getListOfrequiredServicesAccess().getEqualsSignKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,12,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getListOfrequiredServicesAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalFoo.g:1038:3: ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* )
            // InternalFoo.g:1039:4: ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )*
            {
            // InternalFoo.g:1039:4: ( (lv_requiredServices_4_0= ruleRequiredService ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFoo.g:1040:5: (lv_requiredServices_4_0= ruleRequiredService )
                    {
                    // InternalFoo.g:1040:5: (lv_requiredServices_4_0= ruleRequiredService )
                    // InternalFoo.g:1041:6: lv_requiredServices_4_0= ruleRequiredService
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
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

            // InternalFoo.g:1058:4: (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFoo.g:1059:5: otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) )
            	    {
            	    otherlv_5=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getListOfrequiredServicesAccess().getCommaKeyword_4_1_0());
            	      				
            	    }
            	    // InternalFoo.g:1063:5: ( (lv_requiredServices_6_0= ruleRequiredService ) )
            	    // InternalFoo.g:1064:6: (lv_requiredServices_6_0= ruleRequiredService )
            	    {
            	    // InternalFoo.g:1064:6: (lv_requiredServices_6_0= ruleRequiredService )
            	    // InternalFoo.g:1065:7: lv_requiredServices_6_0= ruleRequiredService
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_24);
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
    // InternalFoo.g:1092:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // InternalFoo.g:1092:56: (iv_ruleRequiredService= ruleRequiredService EOF )
            // InternalFoo.g:1093:2: iv_ruleRequiredService= ruleRequiredService EOF
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
    // InternalFoo.g:1099:1: ruleRequiredService returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalFoo.g:1105:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalFoo.g:1106:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalFoo.g:1106:2: ( (otherlv_0= RULE_ID ) )
            // InternalFoo.g:1107:3: (otherlv_0= RULE_ID )
            {
            // InternalFoo.g:1107:3: (otherlv_0= RULE_ID )
            // InternalFoo.g:1108:4: otherlv_0= RULE_ID
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
    // InternalFoo.g:1122:1: entryRuleMProvidedService returns [EObject current=null] : iv_ruleMProvidedService= ruleMProvidedService EOF ;
    public final EObject entryRuleMProvidedService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMProvidedService = null;


        try {
            // InternalFoo.g:1122:57: (iv_ruleMProvidedService= ruleMProvidedService EOF )
            // InternalFoo.g:1123:2: iv_ruleMProvidedService= ruleMProvidedService EOF
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
    // InternalFoo.g:1129:1: ruleMProvidedService returns [EObject current=null] : (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' ( (lv_expressions_4_0= ruleExpression ) )+ otherlv_5= '}' ) ;
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
            // InternalFoo.g:1135:2: ( (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' ( (lv_expressions_4_0= ruleExpression ) )+ otherlv_5= '}' ) )
            // InternalFoo.g:1136:2: (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' ( (lv_expressions_4_0= ruleExpression ) )+ otherlv_5= '}' )
            {
            // InternalFoo.g:1136:2: (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' ( (lv_expressions_4_0= ruleExpression ) )+ otherlv_5= '}' )
            // InternalFoo.g:1137:3: otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' ( (lv_expressions_4_0= ruleExpression ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMProvidedServiceAccess().getServiceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMProvidedServiceAccess().getProvidedKeyword_1());
              		
            }
            // InternalFoo.g:1145:3: ( (lv_signature_2_0= rulePSignature ) )
            // InternalFoo.g:1146:4: (lv_signature_2_0= rulePSignature )
            {
            // InternalFoo.g:1146:4: (lv_signature_2_0= rulePSignature )
            // InternalFoo.g:1147:5: lv_signature_2_0= rulePSignature
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

            otherlv_3=(Token)match(input,12,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMProvidedServiceAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalFoo.g:1168:3: ( (lv_expressions_4_0= ruleExpression ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==31||LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFoo.g:1169:4: (lv_expressions_4_0= ruleExpression )
            	    {
            	    // InternalFoo.g:1169:4: (lv_expressions_4_0= ruleExpression )
            	    // InternalFoo.g:1170:5: lv_expressions_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMProvidedServiceAccess().getExpressionsExpressionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
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
    // InternalFoo.g:1195:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFoo.g:1195:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFoo.g:1196:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalFoo.g:1202:1: ruleExpression returns [EObject current=null] : (this_If_0= ruleIf | this_While_1= ruleWhile | this_Str_2= ruleStr ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_If_0 = null;

        EObject this_While_1 = null;

        EObject this_Str_2 = null;



        	enterRule();

        try {
            // InternalFoo.g:1208:2: ( (this_If_0= ruleIf | this_While_1= ruleWhile | this_Str_2= ruleStr ) )
            // InternalFoo.g:1209:2: (this_If_0= ruleIf | this_While_1= ruleWhile | this_Str_2= ruleStr )
            {
            // InternalFoo.g:1209:2: (this_If_0= ruleIf | this_While_1= ruleWhile | this_Str_2= ruleStr )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 31:
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
                    // InternalFoo.g:1210:3: this_If_0= ruleIf
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
                    // InternalFoo.g:1219:3: this_While_1= ruleWhile
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
                    // InternalFoo.g:1228:3: this_Str_2= ruleStr
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
    // InternalFoo.g:1240:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalFoo.g:1240:43: (iv_ruleIf= ruleIf EOF )
            // InternalFoo.g:1241:2: iv_ruleIf= ruleIf EOF
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
    // InternalFoo.g:1247:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( (lv_str_8_0= ruleStr ) ) | ( (lv_if_9_0= ruleIf ) ) | ( (lv_while_10_0= ruleWhile ) ) )+ otherlv_11= '}' ( ( ( 'else' )=>otherlv_12= 'else' ) ( ( (lv_else_13_0= ruleIf ) ) | (otherlv_14= '{' ( ( (lv_str_15_0= ruleStr ) ) | ( (lv_if_16_0= ruleIf ) ) | ( (lv_while_17_0= ruleWhile ) ) )+ otherlv_18= '}' ) ) )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_18=null;
        EObject lv_conditions_2_0 = null;

        EObject lv_conditions_5_0 = null;

        EObject lv_str_8_0 = null;

        EObject lv_if_9_0 = null;

        EObject lv_while_10_0 = null;

        EObject lv_else_13_0 = null;

        EObject lv_str_15_0 = null;

        EObject lv_if_16_0 = null;

        EObject lv_while_17_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:1253:2: ( (otherlv_0= 'if' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( (lv_str_8_0= ruleStr ) ) | ( (lv_if_9_0= ruleIf ) ) | ( (lv_while_10_0= ruleWhile ) ) )+ otherlv_11= '}' ( ( ( 'else' )=>otherlv_12= 'else' ) ( ( (lv_else_13_0= ruleIf ) ) | (otherlv_14= '{' ( ( (lv_str_15_0= ruleStr ) ) | ( (lv_if_16_0= ruleIf ) ) | ( (lv_while_17_0= ruleWhile ) ) )+ otherlv_18= '}' ) ) )? ) )
            // InternalFoo.g:1254:2: (otherlv_0= 'if' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( (lv_str_8_0= ruleStr ) ) | ( (lv_if_9_0= ruleIf ) ) | ( (lv_while_10_0= ruleWhile ) ) )+ otherlv_11= '}' ( ( ( 'else' )=>otherlv_12= 'else' ) ( ( (lv_else_13_0= ruleIf ) ) | (otherlv_14= '{' ( ( (lv_str_15_0= ruleStr ) ) | ( (lv_if_16_0= ruleIf ) ) | ( (lv_while_17_0= ruleWhile ) ) )+ otherlv_18= '}' ) ) )? )
            {
            // InternalFoo.g:1254:2: (otherlv_0= 'if' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( (lv_str_8_0= ruleStr ) ) | ( (lv_if_9_0= ruleIf ) ) | ( (lv_while_10_0= ruleWhile ) ) )+ otherlv_11= '}' ( ( ( 'else' )=>otherlv_12= 'else' ) ( ( (lv_else_13_0= ruleIf ) ) | (otherlv_14= '{' ( ( (lv_str_15_0= ruleStr ) ) | ( (lv_if_16_0= ruleIf ) ) | ( (lv_while_17_0= ruleWhile ) ) )+ otherlv_18= '}' ) ) )? )
            // InternalFoo.g:1255:3: otherlv_0= 'if' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( (lv_str_8_0= ruleStr ) ) | ( (lv_if_9_0= ruleIf ) ) | ( (lv_while_10_0= ruleWhile ) ) )+ otherlv_11= '}' ( ( ( 'else' )=>otherlv_12= 'else' ) ( ( (lv_else_13_0= ruleIf ) ) | (otherlv_14= '{' ( ( (lv_str_15_0= ruleStr ) ) | ( (lv_if_16_0= ruleIf ) ) | ( (lv_while_17_0= ruleWhile ) ) )+ otherlv_18= '}' ) ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalFoo.g:1263:3: ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // InternalFoo.g:1264:4: ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' )
            	    {
            	    // InternalFoo.g:1264:4: ( (lv_conditions_2_0= ruleCondition ) )
            	    // InternalFoo.g:1265:5: (lv_conditions_2_0= ruleCondition )
            	    {
            	    // InternalFoo.g:1265:5: (lv_conditions_2_0= ruleCondition )
            	    // InternalFoo.g:1266:6: lv_conditions_2_0= ruleCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIfAccess().getConditionsConditionParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
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

            	    // InternalFoo.g:1283:4: (otherlv_3= '||' | otherlv_4= '&&' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==33) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==34) ) {
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
            	            // InternalFoo.g:1284:5: otherlv_3= '||'
            	            {
            	            otherlv_3=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_3, grammarAccess.getIfAccess().getVerticalLineVerticalLineKeyword_2_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalFoo.g:1289:5: otherlv_4= '&&'
            	            {
            	            otherlv_4=(Token)match(input,34,FOLLOW_29); if (state.failed) return current;
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

            // InternalFoo.g:1295:3: ( (lv_conditions_5_0= ruleCondition ) )
            // InternalFoo.g:1296:4: (lv_conditions_5_0= ruleCondition )
            {
            // InternalFoo.g:1296:4: (lv_conditions_5_0= ruleCondition )
            // InternalFoo.g:1297:5: lv_conditions_5_0= ruleCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getConditionsConditionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            otherlv_6=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,12,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalFoo.g:1322:3: ( ( (lv_str_8_0= ruleStr ) ) | ( (lv_if_9_0= ruleIf ) ) | ( (lv_while_10_0= ruleWhile ) ) )+
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
                case 31:
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
            	    // InternalFoo.g:1323:4: ( (lv_str_8_0= ruleStr ) )
            	    {
            	    // InternalFoo.g:1323:4: ( (lv_str_8_0= ruleStr ) )
            	    // InternalFoo.g:1324:5: (lv_str_8_0= ruleStr )
            	    {
            	    // InternalFoo.g:1324:5: (lv_str_8_0= ruleStr )
            	    // InternalFoo.g:1325:6: lv_str_8_0= ruleStr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIfAccess().getStrStrParserRuleCall_6_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
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


            	    }
            	    break;
            	case 2 :
            	    // InternalFoo.g:1343:4: ( (lv_if_9_0= ruleIf ) )
            	    {
            	    // InternalFoo.g:1343:4: ( (lv_if_9_0= ruleIf ) )
            	    // InternalFoo.g:1344:5: (lv_if_9_0= ruleIf )
            	    {
            	    // InternalFoo.g:1344:5: (lv_if_9_0= ruleIf )
            	    // InternalFoo.g:1345:6: lv_if_9_0= ruleIf
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIfAccess().getIfIfParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_if_9_0=ruleIf();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getIfRule());
            	      						}
            	      						add(
            	      							current,
            	      							"if",
            	      							lv_if_9_0,
            	      							"com.project.foo.Foo.If");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalFoo.g:1363:4: ( (lv_while_10_0= ruleWhile ) )
            	    {
            	    // InternalFoo.g:1363:4: ( (lv_while_10_0= ruleWhile ) )
            	    // InternalFoo.g:1364:5: (lv_while_10_0= ruleWhile )
            	    {
            	    // InternalFoo.g:1364:5: (lv_while_10_0= ruleWhile )
            	    // InternalFoo.g:1365:6: lv_while_10_0= ruleWhile
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIfAccess().getWhileWhileParserRuleCall_6_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_while_10_0=ruleWhile();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getIfRule());
            	      						}
            	      						add(
            	      							current,
            	      							"while",
            	      							lv_while_10_0,
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

            otherlv_11=(Token)match(input,13,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7());
              		
            }
            // InternalFoo.g:1387:3: ( ( ( 'else' )=>otherlv_12= 'else' ) ( ( (lv_else_13_0= ruleIf ) ) | (otherlv_14= '{' ( ( (lv_str_15_0= ruleStr ) ) | ( (lv_if_16_0= ruleIf ) ) | ( (lv_while_17_0= ruleWhile ) ) )+ otherlv_18= '}' ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) && (synpred1_InternalFoo())) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFoo.g:1388:4: ( ( 'else' )=>otherlv_12= 'else' ) ( ( (lv_else_13_0= ruleIf ) ) | (otherlv_14= '{' ( ( (lv_str_15_0= ruleStr ) ) | ( (lv_if_16_0= ruleIf ) ) | ( (lv_while_17_0= ruleWhile ) ) )+ otherlv_18= '}' ) )
                    {
                    // InternalFoo.g:1388:4: ( ( 'else' )=>otherlv_12= 'else' )
                    // InternalFoo.g:1389:5: ( 'else' )=>otherlv_12= 'else'
                    {
                    otherlv_12=(Token)match(input,36,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getIfAccess().getElseKeyword_8_0());
                      				
                    }

                    }

                    // InternalFoo.g:1395:4: ( ( (lv_else_13_0= ruleIf ) ) | (otherlv_14= '{' ( ( (lv_str_15_0= ruleStr ) ) | ( (lv_if_16_0= ruleIf ) ) | ( (lv_while_17_0= ruleWhile ) ) )+ otherlv_18= '}' ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==31) ) {
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
                            // InternalFoo.g:1396:5: ( (lv_else_13_0= ruleIf ) )
                            {
                            // InternalFoo.g:1396:5: ( (lv_else_13_0= ruleIf ) )
                            // InternalFoo.g:1397:6: (lv_else_13_0= ruleIf )
                            {
                            // InternalFoo.g:1397:6: (lv_else_13_0= ruleIf )
                            // InternalFoo.g:1398:7: lv_else_13_0= ruleIf
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getIfAccess().getElseIfParserRuleCall_8_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_else_13_0=ruleIf();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getIfRule());
                              							}
                              							set(
                              								current,
                              								"else",
                              								lv_else_13_0,
                              								"com.project.foo.Foo.If");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalFoo.g:1416:5: (otherlv_14= '{' ( ( (lv_str_15_0= ruleStr ) ) | ( (lv_if_16_0= ruleIf ) ) | ( (lv_while_17_0= ruleWhile ) ) )+ otherlv_18= '}' )
                            {
                            // InternalFoo.g:1416:5: (otherlv_14= '{' ( ( (lv_str_15_0= ruleStr ) ) | ( (lv_if_16_0= ruleIf ) ) | ( (lv_while_17_0= ruleWhile ) ) )+ otherlv_18= '}' )
                            // InternalFoo.g:1417:6: otherlv_14= '{' ( ( (lv_str_15_0= ruleStr ) ) | ( (lv_if_16_0= ruleIf ) ) | ( (lv_while_17_0= ruleWhile ) ) )+ otherlv_18= '}'
                            {
                            otherlv_14=(Token)match(input,12,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_14, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_1_1_0());
                              					
                            }
                            // InternalFoo.g:1421:6: ( ( (lv_str_15_0= ruleStr ) ) | ( (lv_if_16_0= ruleIf ) ) | ( (lv_while_17_0= ruleWhile ) ) )+
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
                                case 31:
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
                            	    // InternalFoo.g:1422:7: ( (lv_str_15_0= ruleStr ) )
                            	    {
                            	    // InternalFoo.g:1422:7: ( (lv_str_15_0= ruleStr ) )
                            	    // InternalFoo.g:1423:8: (lv_str_15_0= ruleStr )
                            	    {
                            	    // InternalFoo.g:1423:8: (lv_str_15_0= ruleStr )
                            	    // InternalFoo.g:1424:9: lv_str_15_0= ruleStr
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getIfAccess().getStrStrParserRuleCall_8_1_1_1_0_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_27);
                            	    lv_str_15_0=ruleStr();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getIfRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"str",
                            	      										lv_str_15_0,
                            	      										"com.project.foo.Foo.Str");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalFoo.g:1442:7: ( (lv_if_16_0= ruleIf ) )
                            	    {
                            	    // InternalFoo.g:1442:7: ( (lv_if_16_0= ruleIf ) )
                            	    // InternalFoo.g:1443:8: (lv_if_16_0= ruleIf )
                            	    {
                            	    // InternalFoo.g:1443:8: (lv_if_16_0= ruleIf )
                            	    // InternalFoo.g:1444:9: lv_if_16_0= ruleIf
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getIfAccess().getIfIfParserRuleCall_8_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_27);
                            	    lv_if_16_0=ruleIf();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getIfRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"if",
                            	      										lv_if_16_0,
                            	      										"com.project.foo.Foo.If");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 3 :
                            	    // InternalFoo.g:1462:7: ( (lv_while_17_0= ruleWhile ) )
                            	    {
                            	    // InternalFoo.g:1462:7: ( (lv_while_17_0= ruleWhile ) )
                            	    // InternalFoo.g:1463:8: (lv_while_17_0= ruleWhile )
                            	    {
                            	    // InternalFoo.g:1463:8: (lv_while_17_0= ruleWhile )
                            	    // InternalFoo.g:1464:9: lv_while_17_0= ruleWhile
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getIfAccess().getWhileWhileParserRuleCall_8_1_1_1_2_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_27);
                            	    lv_while_17_0=ruleWhile();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getIfRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"while",
                            	      										lv_while_17_0,
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

                            otherlv_18=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_18, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8_1_1_2());
                              					
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
    // InternalFoo.g:1493:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalFoo.g:1493:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalFoo.g:1494:2: iv_ruleWhile= ruleWhile EOF
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
    // InternalFoo.g:1500:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( (lv_str_8_0= ruleStr ) ) | ( (lv_if_9_0= ruleIf ) ) | ( (lv_while_10_0= ruleWhile ) ) )+ otherlv_11= '}' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        EObject lv_conditions_2_0 = null;

        EObject lv_conditions_5_0 = null;

        EObject lv_str_8_0 = null;

        EObject lv_if_9_0 = null;

        EObject lv_while_10_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:1506:2: ( (otherlv_0= 'while' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( (lv_str_8_0= ruleStr ) ) | ( (lv_if_9_0= ruleIf ) ) | ( (lv_while_10_0= ruleWhile ) ) )+ otherlv_11= '}' ) )
            // InternalFoo.g:1507:2: (otherlv_0= 'while' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( (lv_str_8_0= ruleStr ) ) | ( (lv_if_9_0= ruleIf ) ) | ( (lv_while_10_0= ruleWhile ) ) )+ otherlv_11= '}' )
            {
            // InternalFoo.g:1507:2: (otherlv_0= 'while' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( (lv_str_8_0= ruleStr ) ) | ( (lv_if_9_0= ruleIf ) ) | ( (lv_while_10_0= ruleWhile ) ) )+ otherlv_11= '}' )
            // InternalFoo.g:1508:3: otherlv_0= 'while' otherlv_1= '(' ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )* ( (lv_conditions_5_0= ruleCondition ) ) otherlv_6= ')' otherlv_7= '{' ( ( (lv_str_8_0= ruleStr ) ) | ( (lv_if_9_0= ruleIf ) ) | ( (lv_while_10_0= ruleWhile ) ) )+ otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalFoo.g:1516:3: ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // InternalFoo.g:1517:4: ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' )
            	    {
            	    // InternalFoo.g:1517:4: ( (lv_conditions_2_0= ruleCondition ) )
            	    // InternalFoo.g:1518:5: (lv_conditions_2_0= ruleCondition )
            	    {
            	    // InternalFoo.g:1518:5: (lv_conditions_2_0= ruleCondition )
            	    // InternalFoo.g:1519:6: lv_conditions_2_0= ruleCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWhileAccess().getConditionsConditionParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
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

            	    // InternalFoo.g:1536:4: (otherlv_3= '||' | otherlv_4= '&&' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==33) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==34) ) {
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
            	            // InternalFoo.g:1537:5: otherlv_3= '||'
            	            {
            	            otherlv_3=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getVerticalLineVerticalLineKeyword_2_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalFoo.g:1542:5: otherlv_4= '&&'
            	            {
            	            otherlv_4=(Token)match(input,34,FOLLOW_29); if (state.failed) return current;
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

            // InternalFoo.g:1548:3: ( (lv_conditions_5_0= ruleCondition ) )
            // InternalFoo.g:1549:4: (lv_conditions_5_0= ruleCondition )
            {
            // InternalFoo.g:1549:4: (lv_conditions_5_0= ruleCondition )
            // InternalFoo.g:1550:5: lv_conditions_5_0= ruleCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getConditionsConditionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            otherlv_6=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getWhileAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,12,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalFoo.g:1575:3: ( ( (lv_str_8_0= ruleStr ) ) | ( (lv_if_9_0= ruleIf ) ) | ( (lv_while_10_0= ruleWhile ) ) )+
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
                case 31:
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
            	    // InternalFoo.g:1576:4: ( (lv_str_8_0= ruleStr ) )
            	    {
            	    // InternalFoo.g:1576:4: ( (lv_str_8_0= ruleStr ) )
            	    // InternalFoo.g:1577:5: (lv_str_8_0= ruleStr )
            	    {
            	    // InternalFoo.g:1577:5: (lv_str_8_0= ruleStr )
            	    // InternalFoo.g:1578:6: lv_str_8_0= ruleStr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWhileAccess().getStrStrParserRuleCall_6_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
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


            	    }
            	    break;
            	case 2 :
            	    // InternalFoo.g:1596:4: ( (lv_if_9_0= ruleIf ) )
            	    {
            	    // InternalFoo.g:1596:4: ( (lv_if_9_0= ruleIf ) )
            	    // InternalFoo.g:1597:5: (lv_if_9_0= ruleIf )
            	    {
            	    // InternalFoo.g:1597:5: (lv_if_9_0= ruleIf )
            	    // InternalFoo.g:1598:6: lv_if_9_0= ruleIf
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWhileAccess().getIfIfParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_if_9_0=ruleIf();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getWhileRule());
            	      						}
            	      						add(
            	      							current,
            	      							"if",
            	      							lv_if_9_0,
            	      							"com.project.foo.Foo.If");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalFoo.g:1616:4: ( (lv_while_10_0= ruleWhile ) )
            	    {
            	    // InternalFoo.g:1616:4: ( (lv_while_10_0= ruleWhile ) )
            	    // InternalFoo.g:1617:5: (lv_while_10_0= ruleWhile )
            	    {
            	    // InternalFoo.g:1617:5: (lv_while_10_0= ruleWhile )
            	    // InternalFoo.g:1618:6: lv_while_10_0= ruleWhile
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWhileAccess().getWhileWhileParserRuleCall_6_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_while_10_0=ruleWhile();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getWhileRule());
            	      						}
            	      						add(
            	      							current,
            	      							"while",
            	      							lv_while_10_0,
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

            otherlv_11=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_7());
              		
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
    // InternalFoo.g:1644:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalFoo.g:1644:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalFoo.g:1645:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalFoo.g:1651:1: ruleCondition returns [EObject current=null] : ( (otherlv_0= '!' )? ( ( (lv_conditions_1_0= ruleComparison ) ) | ( (lv_conditions_2_0= ruleStr ) ) )+ ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_conditions_1_0 = null;

        EObject lv_conditions_2_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:1657:2: ( ( (otherlv_0= '!' )? ( ( (lv_conditions_1_0= ruleComparison ) ) | ( (lv_conditions_2_0= ruleStr ) ) )+ ) )
            // InternalFoo.g:1658:2: ( (otherlv_0= '!' )? ( ( (lv_conditions_1_0= ruleComparison ) ) | ( (lv_conditions_2_0= ruleStr ) ) )+ )
            {
            // InternalFoo.g:1658:2: ( (otherlv_0= '!' )? ( ( (lv_conditions_1_0= ruleComparison ) ) | ( (lv_conditions_2_0= ruleStr ) ) )+ )
            // InternalFoo.g:1659:3: (otherlv_0= '!' )? ( ( (lv_conditions_1_0= ruleComparison ) ) | ( (lv_conditions_2_0= ruleStr ) ) )+
            {
            // InternalFoo.g:1659:3: (otherlv_0= '!' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFoo.g:1660:4: otherlv_0= '!'
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getExclamationMarkKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalFoo.g:1665:3: ( ( (lv_conditions_1_0= ruleComparison ) ) | ( (lv_conditions_2_0= ruleStr ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    int LA28_2 = input.LA(2);

                    if ( ((LA28_2>=40 && LA28_2<=44)) ) {
                        alt28=1;
                    }
                    else if ( (LA28_2==EOF||LA28_2==RULE_ID||LA28_2==14||(LA28_2>=33 && LA28_2<=35)||LA28_2==39) ) {
                        alt28=2;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalFoo.g:1666:4: ( (lv_conditions_1_0= ruleComparison ) )
            	    {
            	    // InternalFoo.g:1666:4: ( (lv_conditions_1_0= ruleComparison ) )
            	    // InternalFoo.g:1667:5: (lv_conditions_1_0= ruleComparison )
            	    {
            	    // InternalFoo.g:1667:5: (lv_conditions_1_0= ruleComparison )
            	    // InternalFoo.g:1668:6: lv_conditions_1_0= ruleComparison
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
            	    // InternalFoo.g:1686:4: ( (lv_conditions_2_0= ruleStr ) )
            	    {
            	    // InternalFoo.g:1686:4: ( (lv_conditions_2_0= ruleStr ) )
            	    // InternalFoo.g:1687:5: (lv_conditions_2_0= ruleStr )
            	    {
            	    // InternalFoo.g:1687:5: (lv_conditions_2_0= ruleStr )
            	    // InternalFoo.g:1688:6: lv_conditions_2_0= ruleStr
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
    // InternalFoo.g:1710:1: entryRuleStr returns [EObject current=null] : iv_ruleStr= ruleStr EOF ;
    public final EObject entryRuleStr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStr = null;


        try {
            // InternalFoo.g:1710:44: (iv_ruleStr= ruleStr EOF )
            // InternalFoo.g:1711:2: iv_ruleStr= ruleStr EOF
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
    // InternalFoo.g:1717:1: ruleStr returns [EObject current=null] : ( ( (lv_value_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_value_4_0= RULE_ID ) )? otherlv_5= ')' )* (otherlv_6= ';' )? ) ;
    public final EObject ruleStr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalFoo.g:1723:2: ( ( ( (lv_value_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_value_4_0= RULE_ID ) )? otherlv_5= ')' )* (otherlv_6= ';' )? ) )
            // InternalFoo.g:1724:2: ( ( (lv_value_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_value_4_0= RULE_ID ) )? otherlv_5= ')' )* (otherlv_6= ';' )? )
            {
            // InternalFoo.g:1724:2: ( ( (lv_value_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_value_4_0= RULE_ID ) )? otherlv_5= ')' )* (otherlv_6= ';' )? )
            // InternalFoo.g:1725:3: ( (lv_value_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_value_4_0= RULE_ID ) )? otherlv_5= ')' )* (otherlv_6= ';' )?
            {
            // InternalFoo.g:1725:3: ( (lv_value_0_0= RULE_ID ) )
            // InternalFoo.g:1726:4: (lv_value_0_0= RULE_ID )
            {
            // InternalFoo.g:1726:4: (lv_value_0_0= RULE_ID )
            // InternalFoo.g:1727:5: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
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

            // InternalFoo.g:1743:3: (otherlv_1= '.' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_value_4_0= RULE_ID ) )? otherlv_5= ')' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==14) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalFoo.g:1744:4: otherlv_1= '.' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_value_4_0= RULE_ID ) )? otherlv_5= ')'
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getStrAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalFoo.g:1748:4: ( (lv_value_2_0= RULE_ID ) )
            	    // InternalFoo.g:1749:5: (lv_value_2_0= RULE_ID )
            	    {
            	    // InternalFoo.g:1749:5: (lv_value_2_0= RULE_ID )
            	    // InternalFoo.g:1750:6: lv_value_2_0= RULE_ID
            	    {
            	    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
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

            	    otherlv_3=(Token)match(input,32,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getStrAccess().getLeftParenthesisKeyword_1_2());
            	      			
            	    }
            	    // InternalFoo.g:1770:4: ( (lv_value_4_0= RULE_ID ) )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==RULE_ID) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalFoo.g:1771:5: (lv_value_4_0= RULE_ID )
            	            {
            	            // InternalFoo.g:1771:5: (lv_value_4_0= RULE_ID )
            	            // InternalFoo.g:1772:6: lv_value_4_0= RULE_ID
            	            {
            	            lv_value_4_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
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

            	    otherlv_5=(Token)match(input,35,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getStrAccess().getRightParenthesisKeyword_1_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalFoo.g:1793:3: (otherlv_6= ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalFoo.g:1794:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getStrAccess().getSemicolonKeyword_2());
                      			
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
    // $ANTLR end "ruleStr"


    // $ANTLR start "entryRuleComparison"
    // InternalFoo.g:1803:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalFoo.g:1803:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalFoo.g:1804:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalFoo.g:1810:1: ruleComparison returns [EObject current=null] : ( ( (lv_leftMember_0_0= RULE_ID ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '<=' | otherlv_4= '>=' | otherlv_5= '==' ) ( (lv_rightMember_6_0= RULE_ID ) ) ) ;
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
            // InternalFoo.g:1816:2: ( ( ( (lv_leftMember_0_0= RULE_ID ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '<=' | otherlv_4= '>=' | otherlv_5= '==' ) ( (lv_rightMember_6_0= RULE_ID ) ) ) )
            // InternalFoo.g:1817:2: ( ( (lv_leftMember_0_0= RULE_ID ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '<=' | otherlv_4= '>=' | otherlv_5= '==' ) ( (lv_rightMember_6_0= RULE_ID ) ) )
            {
            // InternalFoo.g:1817:2: ( ( (lv_leftMember_0_0= RULE_ID ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '<=' | otherlv_4= '>=' | otherlv_5= '==' ) ( (lv_rightMember_6_0= RULE_ID ) ) )
            // InternalFoo.g:1818:3: ( (lv_leftMember_0_0= RULE_ID ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '<=' | otherlv_4= '>=' | otherlv_5= '==' ) ( (lv_rightMember_6_0= RULE_ID ) )
            {
            // InternalFoo.g:1818:3: ( (lv_leftMember_0_0= RULE_ID ) )
            // InternalFoo.g:1819:4: (lv_leftMember_0_0= RULE_ID )
            {
            // InternalFoo.g:1819:4: (lv_leftMember_0_0= RULE_ID )
            // InternalFoo.g:1820:5: lv_leftMember_0_0= RULE_ID
            {
            lv_leftMember_0_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
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

            // InternalFoo.g:1836:3: (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '<=' | otherlv_4= '>=' | otherlv_5= '==' )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt32=1;
                }
                break;
            case 41:
                {
                alt32=2;
                }
                break;
            case 42:
                {
                alt32=3;
                }
                break;
            case 43:
                {
                alt32=4;
                }
                break;
            case 44:
                {
                alt32=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalFoo.g:1837:4: otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalFoo.g:1842:4: otherlv_2= '>'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalFoo.g:1847:4: otherlv_3= '<='
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalFoo.g:1852:4: otherlv_4= '>='
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_3());
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalFoo.g:1857:4: otherlv_5= '=='
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_4());
                      			
                    }

                    }
                    break;

            }

            // InternalFoo.g:1862:3: ( (lv_rightMember_6_0= RULE_ID ) )
            // InternalFoo.g:1863:4: (lv_rightMember_6_0= RULE_ID )
            {
            // InternalFoo.g:1863:4: (lv_rightMember_6_0= RULE_ID )
            // InternalFoo.g:1864:5: lv_rightMember_6_0= RULE_ID
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
    // InternalFoo.g:1884:1: entryRulePSignature returns [EObject current=null] : iv_rulePSignature= rulePSignature EOF ;
    public final EObject entryRulePSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePSignature = null;


        try {
            // InternalFoo.g:1884:51: (iv_rulePSignature= rulePSignature EOF )
            // InternalFoo.g:1885:2: iv_rulePSignature= rulePSignature EOF
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
    // InternalFoo.g:1891:1: rulePSignature returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) ;
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
            // InternalFoo.g:1897:2: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) )
            // InternalFoo.g:1898:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            {
            // InternalFoo.g:1898:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            // InternalFoo.g:1899:3: ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
            {
            // InternalFoo.g:1899:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalFoo.g:1900:4: (lv_type_0_0= RULE_ID )
            {
            // InternalFoo.g:1900:4: (lv_type_0_0= RULE_ID )
            // InternalFoo.g:1901:5: lv_type_0_0= RULE_ID
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

            // InternalFoo.g:1917:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFoo.g:1918:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFoo.g:1918:4: (lv_name_1_0= RULE_ID )
            // InternalFoo.g:1919:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,32,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPSignatureAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalFoo.g:1939:3: ( (lv_parameters_3_0= ruleParameter ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFoo.g:1940:4: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalFoo.g:1940:4: (lv_parameters_3_0= ruleParameter )
                    // InternalFoo.g:1941:5: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_39);
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

            // InternalFoo.g:1958:3: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==28) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalFoo.g:1959:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getPSignatureAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalFoo.g:1963:4: ( (lv_parameters_5_0= ruleParameter ) )
            	    // InternalFoo.g:1964:5: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // InternalFoo.g:1964:5: (lv_parameters_5_0= ruleParameter )
            	    // InternalFoo.g:1965:6: lv_parameters_5_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop34;
                }
            } while (true);

            otherlv_6=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalFoo.g:1991:1: entryRuleMRequiredService returns [EObject current=null] : iv_ruleMRequiredService= ruleMRequiredService EOF ;
    public final EObject entryRuleMRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMRequiredService = null;


        try {
            // InternalFoo.g:1991:57: (iv_ruleMRequiredService= ruleMRequiredService EOF )
            // InternalFoo.g:1992:2: iv_ruleMRequiredService= ruleMRequiredService EOF
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
    // InternalFoo.g:1998:1: ruleMRequiredService returns [EObject current=null] : (otherlv_0= 'service' otherlv_1= 'required' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' ) ;
    public final EObject ruleMRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_signature_2_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:2004:2: ( (otherlv_0= 'service' otherlv_1= 'required' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' ) )
            // InternalFoo.g:2005:2: (otherlv_0= 'service' otherlv_1= 'required' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' )
            {
            // InternalFoo.g:2005:2: (otherlv_0= 'service' otherlv_1= 'required' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' )
            // InternalFoo.g:2006:3: otherlv_0= 'service' otherlv_1= 'required' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMRequiredServiceAccess().getServiceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMRequiredServiceAccess().getRequiredKeyword_1());
              		
            }
            // InternalFoo.g:2014:3: ( (lv_signature_2_0= ruleRSignature ) )
            // InternalFoo.g:2015:4: (lv_signature_2_0= ruleRSignature )
            {
            // InternalFoo.g:2015:4: (lv_signature_2_0= ruleRSignature )
            // InternalFoo.g:2016:5: lv_signature_2_0= ruleRSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMRequiredServiceAccess().getSignatureRSignatureParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_40);
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

            otherlv_3=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
    // InternalFoo.g:2041:1: entryRuleRSignature returns [EObject current=null] : iv_ruleRSignature= ruleRSignature EOF ;
    public final EObject entryRuleRSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRSignature = null;


        try {
            // InternalFoo.g:2041:51: (iv_ruleRSignature= ruleRSignature EOF )
            // InternalFoo.g:2042:2: iv_ruleRSignature= ruleRSignature EOF
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
    // InternalFoo.g:2048:1: ruleRSignature returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) ;
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
            // InternalFoo.g:2054:2: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) )
            // InternalFoo.g:2055:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            {
            // InternalFoo.g:2055:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            // InternalFoo.g:2056:3: ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
            {
            // InternalFoo.g:2056:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalFoo.g:2057:4: (lv_type_0_0= RULE_ID )
            {
            // InternalFoo.g:2057:4: (lv_type_0_0= RULE_ID )
            // InternalFoo.g:2058:5: lv_type_0_0= RULE_ID
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

            // InternalFoo.g:2074:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFoo.g:2075:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFoo.g:2075:4: (lv_name_1_0= RULE_ID )
            // InternalFoo.g:2076:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,32,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRSignatureAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalFoo.g:2096:3: ( (lv_parameters_3_0= ruleParameter ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFoo.g:2097:4: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalFoo.g:2097:4: (lv_parameters_3_0= ruleParameter )
                    // InternalFoo.g:2098:5: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_39);
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

            // InternalFoo.g:2115:3: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==28) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalFoo.g:2116:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getRSignatureAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalFoo.g:2120:4: ( (lv_parameters_5_0= ruleParameter ) )
            	    // InternalFoo.g:2121:5: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // InternalFoo.g:2121:5: (lv_parameters_5_0= ruleParameter )
            	    // InternalFoo.g:2122:6: lv_parameters_5_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop36;
                }
            } while (true);

            otherlv_6=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalFoo.g:2148:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalFoo.g:2148:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalFoo.g:2149:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalFoo.g:2155:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalFoo.g:2161:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) )
            // InternalFoo.g:2162:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            {
            // InternalFoo.g:2162:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            // InternalFoo.g:2163:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) )
            {
            // InternalFoo.g:2163:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFoo.g:2164:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFoo.g:2164:4: (lv_name_0_0= RULE_ID )
            // InternalFoo.g:2165:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
              		
            }
            // InternalFoo.g:2185:3: ( (lv_type_2_0= RULE_ID ) )
            // InternalFoo.g:2186:4: (lv_type_2_0= RULE_ID )
            {
            // InternalFoo.g:2186:4: (lv_type_2_0= RULE_ID )
            // InternalFoo.g:2187:5: lv_type_2_0= RULE_ID
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
        // InternalFoo.g:1389:5: ( 'else' )
        // InternalFoo.g:1389:6: 'else'
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
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\5\4\1\uffff\5\4\1\uffff\1\40\2\4\1\43\1\4";
    static final String dfa_3s = "\1\46\1\4\1\54\1\4\1\43\1\uffff\5\4\1\uffff\1\40\3\43\1\47";
    static final String dfa_4s = "\5\uffff\1\2\5\uffff\1\1\5\uffff";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\41\uffff\1\1",
            "\1\2",
            "\1\2\11\uffff\1\3\22\uffff\2\13\1\5\3\uffff\1\4\1\6\1\7\1\10\1\11\1\12",
            "\1\14",
            "\1\2\34\uffff\2\13\1\5",
            "",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "",
            "\1\16",
            "\1\2\34\uffff\2\13\1\5",
            "\1\17\36\uffff\1\20",
            "\1\20",
            "\1\2\11\uffff\1\3\22\uffff\2\13\1\5\3\uffff\1\4"
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
            return "()* loopback of 1263:3: ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )*";
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 1516:3: ( ( (lv_conditions_2_0= ruleCondition ) ) (otherlv_3= '||' | otherlv_4= '&&' ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000010AA000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000010A2000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000A2000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000042002010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002002010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010002010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002080000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002080002010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000006080000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002080000012L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000004002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00001F0000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000810000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});

}