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

@SuppressWarnings("all")
public class InternalFooParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'Assembly'", "'components'", "'bindings'", "':'", "'-'", "'Component'", "'refines'", "'provided'", "'='", "','", "'required'", "'service'", "'('", "')'", "';'"
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
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_2); 

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

            				newCompositeNode(grammarAccess.getDomainModelAccess().getModelModelParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_model_0_0=ruleModel();

            state._fsp--;


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


            	leaveRule();

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
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
            		
            // InternalFoo.g:119:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalFoo.g:120:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalFoo.g:120:4: (lv_name_1_0= ruleQualifiedName )
            // InternalFoo.g:121:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


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

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
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

            	    					newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


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

            	    					newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_components_4_0=ruleComponent();

            	    state._fsp--;


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

            	    					newCompositeNode(grammarAccess.getModelAccess().getAssemblyAssemblyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_assembly_5_0=ruleAssembly();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
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
            	    kw=(Token)match(input,14,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalFoo.g:266:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalFoo.g:267:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalFoo.g:267:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalFoo.g:268:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


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


            	leaveRule();

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
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

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

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
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
                    kw=(Token)match(input,16,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getAssemblyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssembly=ruleAssembly();

            state._fsp--;

             current =iv_ruleAssembly; 
            match(input,EOF,FOLLOW_2); 

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

            				current = forceCreateModelElement(
            					grammarAccess.getAssemblyAccess().getAssemblyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyAccess().getAssemblyKeyword_1());
            		
            // InternalFoo.g:351:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFoo.g:352:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFoo.g:352:4: (lv_name_2_0= RULE_ID )
            // InternalFoo.g:353:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAssemblyAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAssemblyAccess().getComponentsKeyword_4());
            		
            // InternalFoo.g:377:3: ( (lv_attributes_5_0= ruleComponentInstance ) )
            // InternalFoo.g:378:4: (lv_attributes_5_0= ruleComponentInstance )
            {
            // InternalFoo.g:378:4: (lv_attributes_5_0= ruleComponentInstance )
            // InternalFoo.g:379:5: lv_attributes_5_0= ruleComponentInstance
            {

            					newCompositeNode(grammarAccess.getAssemblyAccess().getAttributesComponentInstanceParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_3);
            lv_attributes_5_0=ruleComponentInstance();

            state._fsp--;


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

            	    					newCompositeNode(grammarAccess.getAssemblyAccess().getAttributesComponentInstanceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_attributes_6_0=ruleComponentInstance();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getAssemblyAccess().getBindingsKeyword_7());
            		
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

            	    					newCompositeNode(grammarAccess.getAssemblyAccess().getBindingsBindingParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_bindings_8_0=ruleBinding();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getComponentInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentInstance=ruleComponentInstance();

            state._fsp--;

             current =iv_ruleComponentInstance; 
            match(input,EOF,FOLLOW_2); 

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
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentInstanceAccess().getColonKeyword_1());
            		
            // InternalFoo.g:483:3: ( ( ruleQualifiedName ) )
            // InternalFoo.g:484:4: ( ruleQualifiedName )
            {
            // InternalFoo.g:484:4: ( ruleQualifiedName )
            // InternalFoo.g:485:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentInstanceAccess().getComponentComponentCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_2); 

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

            					newCompositeNode(grammarAccess.getBindingAccess().getBindingRequiredBindingRequiredParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_bindingRequired_0_0=ruleBindingRequired();

            state._fsp--;


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

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getHyphenMinusKeyword_1());
            		
            // InternalFoo.g:541:3: ( (lv_bindingProvided_2_0= ruleBindingProvided ) )
            // InternalFoo.g:542:4: (lv_bindingProvided_2_0= ruleBindingProvided )
            {
            // InternalFoo.g:542:4: (lv_bindingProvided_2_0= ruleBindingProvided )
            // InternalFoo.g:543:5: lv_bindingProvided_2_0= ruleBindingProvided
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getBindingProvidedBindingProvidedParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_bindingProvided_2_0=ruleBindingProvided();

            state._fsp--;


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


            	leaveRule();

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
             newCompositeNode(grammarAccess.getBindingRequiredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBindingRequired=ruleBindingRequired();

            state._fsp--;

             current =iv_ruleBindingRequired; 
            match(input,EOF,FOLLOW_2); 

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

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRequiredRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getBindingRequiredAccess().getNameComponentInstanceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingRequiredAccess().getFullStopKeyword_1());
            		
            // InternalFoo.g:596:3: ( ( ruleQualifiedName ) )
            // InternalFoo.g:597:4: ( ruleQualifiedName )
            {
            // InternalFoo.g:597:4: ( ruleQualifiedName )
            // InternalFoo.g:598:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRequiredRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBindingRequiredAccess().getServiceRSignatureCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getBindingProvidedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBindingProvided=ruleBindingProvided();

            state._fsp--;

             current =iv_ruleBindingProvided; 
            match(input,EOF,FOLLOW_2); 

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

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingProvidedRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getBindingProvidedAccess().getNameComponentInstanceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingProvidedAccess().getFullStopKeyword_1());
            		
            // InternalFoo.g:648:3: ( ( ruleQualifiedName ) )
            // InternalFoo.g:649:4: ( ruleQualifiedName )
            {
            // InternalFoo.g:649:4: ( ruleQualifiedName )
            // InternalFoo.g:650:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingProvidedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBindingProvidedAccess().getServicePSignatureCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFoo.g:675:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_listOfPServices_5_0= ruleListOfProvidedServices ) ) ( (lv_listOfRServices_6_0= ruleListOfrequiredServices ) ) ( (lv_mProvServices_7_0= ruleMProvidedService ) )+ ( (lv_mReqServices_8_0= ruleMRequiredService ) )* ( (lv_assembly_9_0= ruleAssembly ) )* otherlv_10= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_10=null;
        EObject lv_listOfPServices_5_0 = null;

        EObject lv_listOfRServices_6_0 = null;

        EObject lv_mProvServices_7_0 = null;

        EObject lv_mReqServices_8_0 = null;

        EObject lv_assembly_9_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:681:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_listOfPServices_5_0= ruleListOfProvidedServices ) ) ( (lv_listOfRServices_6_0= ruleListOfrequiredServices ) ) ( (lv_mProvServices_7_0= ruleMProvidedService ) )+ ( (lv_mReqServices_8_0= ruleMRequiredService ) )* ( (lv_assembly_9_0= ruleAssembly ) )* otherlv_10= '}' ) )
            // InternalFoo.g:682:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_listOfPServices_5_0= ruleListOfProvidedServices ) ) ( (lv_listOfRServices_6_0= ruleListOfrequiredServices ) ) ( (lv_mProvServices_7_0= ruleMProvidedService ) )+ ( (lv_mReqServices_8_0= ruleMRequiredService ) )* ( (lv_assembly_9_0= ruleAssembly ) )* otherlv_10= '}' )
            {
            // InternalFoo.g:682:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_listOfPServices_5_0= ruleListOfProvidedServices ) ) ( (lv_listOfRServices_6_0= ruleListOfrequiredServices ) ) ( (lv_mProvServices_7_0= ruleMProvidedService ) )+ ( (lv_mReqServices_8_0= ruleMRequiredService ) )* ( (lv_assembly_9_0= ruleAssembly ) )* otherlv_10= '}' )
            // InternalFoo.g:683:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_listOfPServices_5_0= ruleListOfProvidedServices ) ) ( (lv_listOfRServices_6_0= ruleListOfrequiredServices ) ) ( (lv_mProvServices_7_0= ruleMProvidedService ) )+ ( (lv_mReqServices_8_0= ruleMRequiredService ) )* ( (lv_assembly_9_0= ruleAssembly ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalFoo.g:687:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFoo.g:688:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFoo.g:688:4: (lv_name_1_0= RULE_ID )
            // InternalFoo.g:689:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

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
                    otherlv_2=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getRefinesKeyword_2_0());
                    			
                    // InternalFoo.g:710:4: ( ( ruleQualifiedName ) )
                    // InternalFoo.g:711:5: ( ruleQualifiedName )
                    {
                    // InternalFoo.g:711:5: ( ruleQualifiedName )
                    // InternalFoo.g:712:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentAccess().getRefinedComponentComponentCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFoo.g:731:3: ( (lv_listOfPServices_5_0= ruleListOfProvidedServices ) )
            // InternalFoo.g:732:4: (lv_listOfPServices_5_0= ruleListOfProvidedServices )
            {
            // InternalFoo.g:732:4: (lv_listOfPServices_5_0= ruleListOfProvidedServices )
            // InternalFoo.g:733:5: lv_listOfPServices_5_0= ruleListOfProvidedServices
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getListOfPServicesListOfProvidedServicesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_listOfPServices_5_0=ruleListOfProvidedServices();

            state._fsp--;


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

            // InternalFoo.g:750:3: ( (lv_listOfRServices_6_0= ruleListOfrequiredServices ) )
            // InternalFoo.g:751:4: (lv_listOfRServices_6_0= ruleListOfrequiredServices )
            {
            // InternalFoo.g:751:4: (lv_listOfRServices_6_0= ruleListOfrequiredServices )
            // InternalFoo.g:752:5: lv_listOfRServices_6_0= ruleListOfrequiredServices
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getListOfRServicesListOfrequiredServicesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_listOfRServices_6_0=ruleListOfrequiredServices();

            state._fsp--;


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

            // InternalFoo.g:769:3: ( (lv_mProvServices_7_0= ruleMProvidedService ) )+
            int cnt9=0;
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
            	    // InternalFoo.g:770:4: (lv_mProvServices_7_0= ruleMProvidedService )
            	    {
            	    // InternalFoo.g:770:4: (lv_mProvServices_7_0= ruleMProvidedService )
            	    // InternalFoo.g:771:5: lv_mProvServices_7_0= ruleMProvidedService
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getMProvServicesMProvidedServiceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_mProvServices_7_0=ruleMProvidedService();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
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

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFoo.g:789:4: (lv_mReqServices_8_0= ruleMRequiredService )
            	    {
            	    // InternalFoo.g:789:4: (lv_mReqServices_8_0= ruleMRequiredService )
            	    // InternalFoo.g:790:5: lv_mReqServices_8_0= ruleMRequiredService
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getMReqServicesMRequiredServiceParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_mReqServices_8_0=ruleMRequiredService();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalFoo.g:807:3: ( (lv_assembly_9_0= ruleAssembly ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFoo.g:808:4: (lv_assembly_9_0= ruleAssembly )
            	    {
            	    // InternalFoo.g:808:4: (lv_assembly_9_0= ruleAssembly )
            	    // InternalFoo.g:809:5: lv_assembly_9_0= ruleAssembly
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getAssemblyAssemblyParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_assembly_9_0=ruleAssembly();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assembly",
            	    						lv_assembly_9_0,
            	    						"com.project.foo.Foo.Assembly");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

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
    // InternalFoo.g:834:1: entryRuleListOfProvidedServices returns [EObject current=null] : iv_ruleListOfProvidedServices= ruleListOfProvidedServices EOF ;
    public final EObject entryRuleListOfProvidedServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfProvidedServices = null;


        try {
            // InternalFoo.g:834:63: (iv_ruleListOfProvidedServices= ruleListOfProvidedServices EOF )
            // InternalFoo.g:835:2: iv_ruleListOfProvidedServices= ruleListOfProvidedServices EOF
            {
             newCompositeNode(grammarAccess.getListOfProvidedServicesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOfProvidedServices=ruleListOfProvidedServices();

            state._fsp--;

             current =iv_ruleListOfProvidedServices; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFoo.g:841:1: ruleListOfProvidedServices returns [EObject current=null] : (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' ) ;
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
            // InternalFoo.g:847:2: ( (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' ) )
            // InternalFoo.g:848:2: (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' )
            {
            // InternalFoo.g:848:2: (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' )
            // InternalFoo.g:849:3: otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getListOfProvidedServicesAccess().getProvidedKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfProvidedServicesAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getListOfProvidedServicesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFoo.g:861:3: ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* )
            // InternalFoo.g:862:4: ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )*
            {
            // InternalFoo.g:862:4: ( (lv_providedServices_3_0= ruleProvidedService ) )
            // InternalFoo.g:863:5: (lv_providedServices_3_0= ruleProvidedService )
            {
            // InternalFoo.g:863:5: (lv_providedServices_3_0= ruleProvidedService )
            // InternalFoo.g:864:6: lv_providedServices_3_0= ruleProvidedService
            {

            						newCompositeNode(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_0_0());
            					
            pushFollow(FOLLOW_22);
            lv_providedServices_3_0=ruleProvidedService();

            state._fsp--;


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

            // InternalFoo.g:881:4: (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFoo.g:882:5: otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_3); 

            	    					newLeafNode(otherlv_4, grammarAccess.getListOfProvidedServicesAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalFoo.g:886:5: ( (lv_providedServices_5_0= ruleProvidedService ) )
            	    // InternalFoo.g:887:6: (lv_providedServices_5_0= ruleProvidedService )
            	    {
            	    // InternalFoo.g:887:6: (lv_providedServices_5_0= ruleProvidedService )
            	    // InternalFoo.g:888:7: lv_providedServices_5_0= ruleProvidedService
            	    {

            	    							newCompositeNode(grammarAccess.getListOfProvidedServicesAccess().getProvidedServicesProvidedServiceParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_22);
            	    lv_providedServices_5_0=ruleProvidedService();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getListOfProvidedServicesAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalFoo.g:915:1: entryRuleProvidedService returns [EObject current=null] : iv_ruleProvidedService= ruleProvidedService EOF ;
    public final EObject entryRuleProvidedService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedService = null;


        try {
            // InternalFoo.g:915:56: (iv_ruleProvidedService= ruleProvidedService EOF )
            // InternalFoo.g:916:2: iv_ruleProvidedService= ruleProvidedService EOF
            {
             newCompositeNode(grammarAccess.getProvidedServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvidedService=ruleProvidedService();

            state._fsp--;

             current =iv_ruleProvidedService; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFoo.g:922:1: ruleProvidedService returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleProvidedService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalFoo.g:928:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalFoo.g:929:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalFoo.g:929:2: ( (otherlv_0= RULE_ID ) )
            // InternalFoo.g:930:3: (otherlv_0= RULE_ID )
            {
            // InternalFoo.g:930:3: (otherlv_0= RULE_ID )
            // InternalFoo.g:931:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getProvidedServiceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getProvidedServiceAccess().getNamePSignatureCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

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
    // InternalFoo.g:945:1: entryRuleListOfrequiredServices returns [EObject current=null] : iv_ruleListOfrequiredServices= ruleListOfrequiredServices EOF ;
    public final EObject entryRuleListOfrequiredServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfrequiredServices = null;


        try {
            // InternalFoo.g:945:63: (iv_ruleListOfrequiredServices= ruleListOfrequiredServices EOF )
            // InternalFoo.g:946:2: iv_ruleListOfrequiredServices= ruleListOfrequiredServices EOF
            {
             newCompositeNode(grammarAccess.getListOfrequiredServicesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOfrequiredServices=ruleListOfrequiredServices();

            state._fsp--;

             current =iv_ruleListOfrequiredServices; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFoo.g:952:1: ruleListOfrequiredServices returns [EObject current=null] : ( () otherlv_1= 'required' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* ) otherlv_7= '}' ) ;
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
            // InternalFoo.g:958:2: ( ( () otherlv_1= 'required' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* ) otherlv_7= '}' ) )
            // InternalFoo.g:959:2: ( () otherlv_1= 'required' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* ) otherlv_7= '}' )
            {
            // InternalFoo.g:959:2: ( () otherlv_1= 'required' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* ) otherlv_7= '}' )
            // InternalFoo.g:960:3: () otherlv_1= 'required' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* ) otherlv_7= '}'
            {
            // InternalFoo.g:960:3: ()
            // InternalFoo.g:961:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListOfrequiredServicesAccess().getListOfrequiredServicesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getListOfrequiredServicesAccess().getRequiredKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getListOfrequiredServicesAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getListOfrequiredServicesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFoo.g:979:3: ( ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )* )
            // InternalFoo.g:980:4: ( (lv_requiredServices_4_0= ruleRequiredService ) )? (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )*
            {
            // InternalFoo.g:980:4: ( (lv_requiredServices_4_0= ruleRequiredService ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFoo.g:981:5: (lv_requiredServices_4_0= ruleRequiredService )
                    {
                    // InternalFoo.g:981:5: (lv_requiredServices_4_0= ruleRequiredService )
                    // InternalFoo.g:982:6: lv_requiredServices_4_0= ruleRequiredService
                    {

                    						newCompositeNode(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_requiredServices_4_0=ruleRequiredService();

                    state._fsp--;


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
                    break;

            }

            // InternalFoo.g:999:4: (otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFoo.g:1000:5: otherlv_5= ',' ( (lv_requiredServices_6_0= ruleRequiredService ) )
            	    {
            	    otherlv_5=(Token)match(input,26,FOLLOW_3); 

            	    					newLeafNode(otherlv_5, grammarAccess.getListOfrequiredServicesAccess().getCommaKeyword_4_1_0());
            	    				
            	    // InternalFoo.g:1004:5: ( (lv_requiredServices_6_0= ruleRequiredService ) )
            	    // InternalFoo.g:1005:6: (lv_requiredServices_6_0= ruleRequiredService )
            	    {
            	    // InternalFoo.g:1005:6: (lv_requiredServices_6_0= ruleRequiredService )
            	    // InternalFoo.g:1006:7: lv_requiredServices_6_0= ruleRequiredService
            	    {

            	    							newCompositeNode(grammarAccess.getListOfrequiredServicesAccess().getRequiredServicesRequiredServiceParserRuleCall_4_1_1_0());
            	    						
            	    pushFollow(FOLLOW_22);
            	    lv_requiredServices_6_0=ruleRequiredService();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getListOfrequiredServicesAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalFoo.g:1033:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // InternalFoo.g:1033:56: (iv_ruleRequiredService= ruleRequiredService EOF )
            // InternalFoo.g:1034:2: iv_ruleRequiredService= ruleRequiredService EOF
            {
             newCompositeNode(grammarAccess.getRequiredServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredService=ruleRequiredService();

            state._fsp--;

             current =iv_ruleRequiredService; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFoo.g:1040:1: ruleRequiredService returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalFoo.g:1046:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalFoo.g:1047:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalFoo.g:1047:2: ( (otherlv_0= RULE_ID ) )
            // InternalFoo.g:1048:3: (otherlv_0= RULE_ID )
            {
            // InternalFoo.g:1048:3: (otherlv_0= RULE_ID )
            // InternalFoo.g:1049:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRequiredServiceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRequiredServiceAccess().getNameRSignatureCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

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
    // InternalFoo.g:1063:1: entryRuleMProvidedService returns [EObject current=null] : iv_ruleMProvidedService= ruleMProvidedService EOF ;
    public final EObject entryRuleMProvidedService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMProvidedService = null;


        try {
            // InternalFoo.g:1063:57: (iv_ruleMProvidedService= ruleMProvidedService EOF )
            // InternalFoo.g:1064:2: iv_ruleMProvidedService= ruleMProvidedService EOF
            {
             newCompositeNode(grammarAccess.getMProvidedServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMProvidedService=ruleMProvidedService();

            state._fsp--;

             current =iv_ruleMProvidedService; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFoo.g:1070:1: ruleMProvidedService returns [EObject current=null] : (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleMProvidedService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_signature_2_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:1076:2: ( (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalFoo.g:1077:2: (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalFoo.g:1077:2: (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalFoo.g:1078:3: otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getMProvidedServiceAccess().getServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMProvidedServiceAccess().getProvidedKeyword_1());
            		
            // InternalFoo.g:1086:3: ( (lv_signature_2_0= rulePSignature ) )
            // InternalFoo.g:1087:4: (lv_signature_2_0= rulePSignature )
            {
            // InternalFoo.g:1087:4: (lv_signature_2_0= rulePSignature )
            // InternalFoo.g:1088:5: lv_signature_2_0= rulePSignature
            {

            					newCompositeNode(grammarAccess.getMProvidedServiceAccess().getSignaturePSignatureParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_signature_2_0=rulePSignature();

            state._fsp--;


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

            otherlv_3=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getMProvidedServiceAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMProvidedServiceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRulePSignature"
    // InternalFoo.g:1117:1: entryRulePSignature returns [EObject current=null] : iv_rulePSignature= rulePSignature EOF ;
    public final EObject entryRulePSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePSignature = null;


        try {
            // InternalFoo.g:1117:51: (iv_rulePSignature= rulePSignature EOF )
            // InternalFoo.g:1118:2: iv_rulePSignature= rulePSignature EOF
            {
             newCompositeNode(grammarAccess.getPSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePSignature=rulePSignature();

            state._fsp--;

             current =iv_rulePSignature; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFoo.g:1124:1: rulePSignature returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) ;
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
            // InternalFoo.g:1130:2: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) )
            // InternalFoo.g:1131:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            {
            // InternalFoo.g:1131:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            // InternalFoo.g:1132:3: ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
            {
            // InternalFoo.g:1132:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalFoo.g:1133:4: (lv_type_0_0= RULE_ID )
            {
            // InternalFoo.g:1133:4: (lv_type_0_0= RULE_ID )
            // InternalFoo.g:1134:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_type_0_0, grammarAccess.getPSignatureAccess().getTypeIDTerminalRuleCall_0_0());
            				

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

            // InternalFoo.g:1150:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFoo.g:1151:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFoo.g:1151:4: (lv_name_1_0= RULE_ID )
            // InternalFoo.g:1152:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPSignatureAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getPSignatureAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFoo.g:1172:3: ( (lv_parameters_3_0= ruleParameter ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFoo.g:1173:4: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalFoo.g:1173:4: (lv_parameters_3_0= ruleParameter )
                    // InternalFoo.g:1174:5: lv_parameters_3_0= ruleParameter
                    {

                    					newCompositeNode(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


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
                    break;

            }

            // InternalFoo.g:1191:3: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFoo.g:1192:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPSignatureAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalFoo.g:1196:4: ( (lv_parameters_5_0= ruleParameter ) )
            	    // InternalFoo.g:1197:5: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // InternalFoo.g:1197:5: (lv_parameters_5_0= ruleParameter )
            	    // InternalFoo.g:1198:6: lv_parameters_5_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getPSignatureAccess().getParametersParameterParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_parameters_5_0=ruleParameter();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPSignatureAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalFoo.g:1224:1: entryRuleMRequiredService returns [EObject current=null] : iv_ruleMRequiredService= ruleMRequiredService EOF ;
    public final EObject entryRuleMRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMRequiredService = null;


        try {
            // InternalFoo.g:1224:57: (iv_ruleMRequiredService= ruleMRequiredService EOF )
            // InternalFoo.g:1225:2: iv_ruleMRequiredService= ruleMRequiredService EOF
            {
             newCompositeNode(grammarAccess.getMRequiredServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMRequiredService=ruleMRequiredService();

            state._fsp--;

             current =iv_ruleMRequiredService; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFoo.g:1231:1: ruleMRequiredService returns [EObject current=null] : (otherlv_0= 'service' otherlv_1= 'required' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' ) ;
    public final EObject ruleMRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_signature_2_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:1237:2: ( (otherlv_0= 'service' otherlv_1= 'required' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' ) )
            // InternalFoo.g:1238:2: (otherlv_0= 'service' otherlv_1= 'required' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' )
            {
            // InternalFoo.g:1238:2: (otherlv_0= 'service' otherlv_1= 'required' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' )
            // InternalFoo.g:1239:3: otherlv_0= 'service' otherlv_1= 'required' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getMRequiredServiceAccess().getServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMRequiredServiceAccess().getRequiredKeyword_1());
            		
            // InternalFoo.g:1247:3: ( (lv_signature_2_0= ruleRSignature ) )
            // InternalFoo.g:1248:4: (lv_signature_2_0= ruleRSignature )
            {
            // InternalFoo.g:1248:4: (lv_signature_2_0= ruleRSignature )
            // InternalFoo.g:1249:5: lv_signature_2_0= ruleRSignature
            {

            					newCompositeNode(grammarAccess.getMRequiredServiceAccess().getSignatureRSignatureParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_signature_2_0=ruleRSignature();

            state._fsp--;


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

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMRequiredServiceAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalFoo.g:1274:1: entryRuleRSignature returns [EObject current=null] : iv_ruleRSignature= ruleRSignature EOF ;
    public final EObject entryRuleRSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRSignature = null;


        try {
            // InternalFoo.g:1274:51: (iv_ruleRSignature= ruleRSignature EOF )
            // InternalFoo.g:1275:2: iv_ruleRSignature= ruleRSignature EOF
            {
             newCompositeNode(grammarAccess.getRSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRSignature=ruleRSignature();

            state._fsp--;

             current =iv_ruleRSignature; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFoo.g:1281:1: ruleRSignature returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) ;
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
            // InternalFoo.g:1287:2: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) )
            // InternalFoo.g:1288:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            {
            // InternalFoo.g:1288:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            // InternalFoo.g:1289:3: ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
            {
            // InternalFoo.g:1289:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalFoo.g:1290:4: (lv_type_0_0= RULE_ID )
            {
            // InternalFoo.g:1290:4: (lv_type_0_0= RULE_ID )
            // InternalFoo.g:1291:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_type_0_0, grammarAccess.getRSignatureAccess().getTypeIDTerminalRuleCall_0_0());
            				

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

            // InternalFoo.g:1307:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFoo.g:1308:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFoo.g:1308:4: (lv_name_1_0= RULE_ID )
            // InternalFoo.g:1309:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRSignatureAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getRSignatureAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFoo.g:1329:3: ( (lv_parameters_3_0= ruleParameter ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFoo.g:1330:4: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalFoo.g:1330:4: (lv_parameters_3_0= ruleParameter )
                    // InternalFoo.g:1331:5: lv_parameters_3_0= ruleParameter
                    {

                    					newCompositeNode(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


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
                    break;

            }

            // InternalFoo.g:1348:3: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalFoo.g:1349:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRSignatureAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalFoo.g:1353:4: ( (lv_parameters_5_0= ruleParameter ) )
            	    // InternalFoo.g:1354:5: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // InternalFoo.g:1354:5: (lv_parameters_5_0= ruleParameter )
            	    // InternalFoo.g:1355:6: lv_parameters_5_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getRSignatureAccess().getParametersParameterParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_parameters_5_0=ruleParameter();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRSignatureAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalFoo.g:1381:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalFoo.g:1381:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalFoo.g:1382:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFoo.g:1388:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalFoo.g:1394:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) )
            // InternalFoo.g:1395:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            {
            // InternalFoo.g:1395:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            // InternalFoo.g:1396:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) )
            {
            // InternalFoo.g:1396:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFoo.g:1397:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFoo.g:1397:4: (lv_name_0_0= RULE_ID )
            // InternalFoo.g:1398:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalFoo.g:1418:3: ( (lv_type_2_0= RULE_ID ) )
            // InternalFoo.g:1419:4: (lv_type_2_0= RULE_ID )
            {
            // InternalFoo.g:1419:4: (lv_type_2_0= RULE_ID )
            // InternalFoo.g:1420:5: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getParameterAccess().getTypeIDTerminalRuleCall_2_0());
            				

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


            	leaveRule();

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

    // Delegated rules


 

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
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010022000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004002010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000044000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});

}