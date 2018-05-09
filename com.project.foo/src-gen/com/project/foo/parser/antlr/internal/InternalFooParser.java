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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'static'", "'extension'", "'.*'", "'Assembly'", "'components'", "'bindings'", "':'", "'-'", "'Component'", "'provided'", "'='", "','", "'requiered'", "'service'", "'('", "')'", "';'"
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
    // InternalFoo.g:71:1: ruleDomainModel returns [EObject current=null] : ( (lv_models_0_0= ruleModel ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_models_0_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:77:2: ( ( (lv_models_0_0= ruleModel ) )* )
            // InternalFoo.g:78:2: ( (lv_models_0_0= ruleModel ) )*
            {
            // InternalFoo.g:78:2: ( (lv_models_0_0= ruleModel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFoo.g:79:3: (lv_models_0_0= ruleModel )
            	    {
            	    // InternalFoo.g:79:3: (lv_models_0_0= ruleModel )
            	    // InternalFoo.g:80:4: lv_models_0_0= ruleModel
            	    {

            	    				newCompositeNode(grammarAccess.getDomainModelAccess().getModelsModelParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_models_0_0=ruleModel();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"models",
            	    					lv_models_0_0,
            	    					"com.project.foo.Foo.Model");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // InternalFoo.g:107:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_component_4_0= ruleComponent ) )* ( (lv_assembly_5_0= ruleAssembly ) )* otherlv_6= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_component_4_0 = null;

        EObject lv_assembly_5_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:113:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_component_4_0= ruleComponent ) )* ( (lv_assembly_5_0= ruleAssembly ) )* otherlv_6= '}' ) )
            // InternalFoo.g:114:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_component_4_0= ruleComponent ) )* ( (lv_assembly_5_0= ruleAssembly ) )* otherlv_6= '}' )
            {
            // InternalFoo.g:114:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_component_4_0= ruleComponent ) )* ( (lv_assembly_5_0= ruleAssembly ) )* otherlv_6= '}' )
            // InternalFoo.g:115:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_component_4_0= ruleComponent ) )* ( (lv_assembly_5_0= ruleAssembly ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
            		
            // InternalFoo.g:119:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalFoo.g:120:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalFoo.g:120:4: (lv_name_1_0= ruleQualifiedName )
            // InternalFoo.g:121:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFoo.g:142:3: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFoo.g:143:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalFoo.g:143:4: (lv_imports_3_0= ruleImport )
            	    // InternalFoo.g:144:5: lv_imports_3_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    break loop2;
                }
            } while (true);

            // InternalFoo.g:161:3: ( (lv_component_4_0= ruleComponent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFoo.g:162:4: (lv_component_4_0= ruleComponent )
            	    {
            	    // InternalFoo.g:162:4: (lv_component_4_0= ruleComponent )
            	    // InternalFoo.g:163:5: lv_component_4_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getComponentComponentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_component_4_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"component",
            	    						lv_component_4_0,
            	    						"com.project.foo.Foo.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalFoo.g:180:3: ( (lv_assembly_5_0= ruleAssembly ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFoo.g:181:4: (lv_assembly_5_0= ruleAssembly )
            	    {
            	    // InternalFoo.g:181:4: (lv_assembly_5_0= ruleAssembly )
            	    // InternalFoo.g:182:5: lv_assembly_5_0= ruleAssembly
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getAssemblyAssemblyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
            	    break loop4;
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
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalFoo.g:229:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==RULE_ID) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalFoo.g:230:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalFoo.g:254:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'static' otherlv_2= 'extension' ( (lv_importedNamespace_3_0= ruleFqnWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_3_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:260:2: ( (otherlv_0= 'import' otherlv_1= 'static' otherlv_2= 'extension' ( (lv_importedNamespace_3_0= ruleFqnWithWildCard ) ) ) )
            // InternalFoo.g:261:2: (otherlv_0= 'import' otherlv_1= 'static' otherlv_2= 'extension' ( (lv_importedNamespace_3_0= ruleFqnWithWildCard ) ) )
            {
            // InternalFoo.g:261:2: (otherlv_0= 'import' otherlv_1= 'static' otherlv_2= 'extension' ( (lv_importedNamespace_3_0= ruleFqnWithWildCard ) ) )
            // InternalFoo.g:262:3: otherlv_0= 'import' otherlv_1= 'static' otherlv_2= 'extension' ( (lv_importedNamespace_3_0= ruleFqnWithWildCard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getStaticKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getExtensionKeyword_2());
            		
            // InternalFoo.g:274:3: ( (lv_importedNamespace_3_0= ruleFqnWithWildCard ) )
            // InternalFoo.g:275:4: (lv_importedNamespace_3_0= ruleFqnWithWildCard )
            {
            // InternalFoo.g:275:4: (lv_importedNamespace_3_0= ruleFqnWithWildCard )
            // InternalFoo.g:276:5: lv_importedNamespace_3_0= ruleFqnWithWildCard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_3_0=ruleFqnWithWildCard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_3_0,
            						"com.project.foo.Foo.FqnWithWildCard");
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


    // $ANTLR start "entryRuleFqnWithWildCard"
    // InternalFoo.g:297:1: entryRuleFqnWithWildCard returns [String current=null] : iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF ;
    public final String entryRuleFqnWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFqnWithWildCard = null;


        try {
            // InternalFoo.g:297:55: (iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF )
            // InternalFoo.g:298:2: iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getFqnWithWildCardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFqnWithWildCard=ruleFqnWithWildCard();

            state._fsp--;

             current =iv_ruleFqnWithWildCard.getText(); 
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
    // $ANTLR end "entryRuleFqnWithWildCard"


    // $ANTLR start "ruleFqnWithWildCard"
    // InternalFoo.g:304:1: ruleFqnWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFqnWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:310:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalFoo.g:311:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalFoo.g:311:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalFoo.g:312:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getFqnWithWildCardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalFoo.g:322:3: (kw= '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFoo.g:323:4: kw= '.*'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleFqnWithWildCard"


    // $ANTLR start "entryRuleAssembly"
    // InternalFoo.g:333:1: entryRuleAssembly returns [EObject current=null] : iv_ruleAssembly= ruleAssembly EOF ;
    public final EObject entryRuleAssembly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembly = null;


        try {
            // InternalFoo.g:333:49: (iv_ruleAssembly= ruleAssembly EOF )
            // InternalFoo.g:334:2: iv_ruleAssembly= ruleAssembly EOF
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
    // InternalFoo.g:340:1: ruleAssembly returns [EObject current=null] : ( () otherlv_1= 'Assembly' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' ( (lv_attributes_5_0= ruleComponentAttribute ) ) ( (lv_attributes_6_0= ruleComponentAttribute ) )+ otherlv_7= 'bindings' ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' ) ;
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
            // InternalFoo.g:346:2: ( ( () otherlv_1= 'Assembly' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' ( (lv_attributes_5_0= ruleComponentAttribute ) ) ( (lv_attributes_6_0= ruleComponentAttribute ) )+ otherlv_7= 'bindings' ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' ) )
            // InternalFoo.g:347:2: ( () otherlv_1= 'Assembly' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' ( (lv_attributes_5_0= ruleComponentAttribute ) ) ( (lv_attributes_6_0= ruleComponentAttribute ) )+ otherlv_7= 'bindings' ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' )
            {
            // InternalFoo.g:347:2: ( () otherlv_1= 'Assembly' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' ( (lv_attributes_5_0= ruleComponentAttribute ) ) ( (lv_attributes_6_0= ruleComponentAttribute ) )+ otherlv_7= 'bindings' ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' )
            // InternalFoo.g:348:3: () otherlv_1= 'Assembly' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' ( (lv_attributes_5_0= ruleComponentAttribute ) ) ( (lv_attributes_6_0= ruleComponentAttribute ) )+ otherlv_7= 'bindings' ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}'
            {
            // InternalFoo.g:348:3: ()
            // InternalFoo.g:349:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssemblyAccess().getAssemblyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyAccess().getAssemblyKeyword_1());
            		
            // InternalFoo.g:359:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFoo.g:360:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFoo.g:360:4: (lv_name_2_0= RULE_ID )
            // InternalFoo.g:361:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getAssemblyAccess().getComponentsKeyword_4());
            		
            // InternalFoo.g:385:3: ( (lv_attributes_5_0= ruleComponentAttribute ) )
            // InternalFoo.g:386:4: (lv_attributes_5_0= ruleComponentAttribute )
            {
            // InternalFoo.g:386:4: (lv_attributes_5_0= ruleComponentAttribute )
            // InternalFoo.g:387:5: lv_attributes_5_0= ruleComponentAttribute
            {

            					newCompositeNode(grammarAccess.getAssemblyAccess().getAttributesComponentAttributeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_4);
            lv_attributes_5_0=ruleComponentAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyRule());
            					}
            					add(
            						current,
            						"attributes",
            						lv_attributes_5_0,
            						"com.project.foo.Foo.ComponentAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFoo.g:404:3: ( (lv_attributes_6_0= ruleComponentAttribute ) )+
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
            	    // InternalFoo.g:405:4: (lv_attributes_6_0= ruleComponentAttribute )
            	    {
            	    // InternalFoo.g:405:4: (lv_attributes_6_0= ruleComponentAttribute )
            	    // InternalFoo.g:406:5: lv_attributes_6_0= ruleComponentAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAssemblyAccess().getAttributesComponentAttributeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_attributes_6_0=ruleComponentAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssemblyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_6_0,
            	    						"com.project.foo.Foo.ComponentAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getAssemblyAccess().getBindingsKeyword_7());
            		
            // InternalFoo.g:427:3: ( (lv_bindings_8_0= ruleBinding ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFoo.g:428:4: (lv_bindings_8_0= ruleBinding )
            	    {
            	    // InternalFoo.g:428:4: (lv_bindings_8_0= ruleBinding )
            	    // InternalFoo.g:429:5: lv_bindings_8_0= ruleBinding
            	    {

            	    					newCompositeNode(grammarAccess.getAssemblyAccess().getBindingsBindingParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop8;
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


    // $ANTLR start "entryRuleComponentAttribute"
    // InternalFoo.g:454:1: entryRuleComponentAttribute returns [EObject current=null] : iv_ruleComponentAttribute= ruleComponentAttribute EOF ;
    public final EObject entryRuleComponentAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentAttribute = null;


        try {
            // InternalFoo.g:454:59: (iv_ruleComponentAttribute= ruleComponentAttribute EOF )
            // InternalFoo.g:455:2: iv_ruleComponentAttribute= ruleComponentAttribute EOF
            {
             newCompositeNode(grammarAccess.getComponentAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentAttribute=ruleComponentAttribute();

            state._fsp--;

             current =iv_ruleComponentAttribute; 
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
    // $ANTLR end "entryRuleComponentAttribute"


    // $ANTLR start "ruleComponentAttribute"
    // InternalFoo.g:461:1: ruleComponentAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleComponentAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFoo.g:467:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalFoo.g:468:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalFoo.g:468:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:469:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:469:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFoo.g:470:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFoo.g:470:4: (lv_name_0_0= RULE_ID )
            // InternalFoo.g:471:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getComponentAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAttributeAccess().getColonKeyword_1());
            		
            // InternalFoo.g:491:3: ( ( ruleQualifiedName ) )
            // InternalFoo.g:492:4: ( ruleQualifiedName )
            {
            // InternalFoo.g:492:4: ( ruleQualifiedName )
            // InternalFoo.g:493:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentAttributeAccess().getComposantComponentCrossReference_2_0());
            				
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
    // $ANTLR end "ruleComponentAttribute"


    // $ANTLR start "entryRuleBinding"
    // InternalFoo.g:511:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalFoo.g:511:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalFoo.g:512:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalFoo.g:518:1: ruleBinding returns [EObject current=null] : ( ( (lv_mG_0_0= ruleBindingRequiered ) ) otherlv_1= '-' ( (lv_mD_2_0= ruleBindingProvided ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_mG_0_0 = null;

        EObject lv_mD_2_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:524:2: ( ( ( (lv_mG_0_0= ruleBindingRequiered ) ) otherlv_1= '-' ( (lv_mD_2_0= ruleBindingProvided ) ) ) )
            // InternalFoo.g:525:2: ( ( (lv_mG_0_0= ruleBindingRequiered ) ) otherlv_1= '-' ( (lv_mD_2_0= ruleBindingProvided ) ) )
            {
            // InternalFoo.g:525:2: ( ( (lv_mG_0_0= ruleBindingRequiered ) ) otherlv_1= '-' ( (lv_mD_2_0= ruleBindingProvided ) ) )
            // InternalFoo.g:526:3: ( (lv_mG_0_0= ruleBindingRequiered ) ) otherlv_1= '-' ( (lv_mD_2_0= ruleBindingProvided ) )
            {
            // InternalFoo.g:526:3: ( (lv_mG_0_0= ruleBindingRequiered ) )
            // InternalFoo.g:527:4: (lv_mG_0_0= ruleBindingRequiered )
            {
            // InternalFoo.g:527:4: (lv_mG_0_0= ruleBindingRequiered )
            // InternalFoo.g:528:5: lv_mG_0_0= ruleBindingRequiered
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getMGBindingRequieredParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_mG_0_0=ruleBindingRequiered();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"mG",
            						lv_mG_0_0,
            						"com.project.foo.Foo.BindingRequiered");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getHyphenMinusKeyword_1());
            		
            // InternalFoo.g:549:3: ( (lv_mD_2_0= ruleBindingProvided ) )
            // InternalFoo.g:550:4: (lv_mD_2_0= ruleBindingProvided )
            {
            // InternalFoo.g:550:4: (lv_mD_2_0= ruleBindingProvided )
            // InternalFoo.g:551:5: lv_mD_2_0= ruleBindingProvided
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getMDBindingProvidedParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_mD_2_0=ruleBindingProvided();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"mD",
            						lv_mD_2_0,
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


    // $ANTLR start "entryRuleBindingRequiered"
    // InternalFoo.g:572:1: entryRuleBindingRequiered returns [EObject current=null] : iv_ruleBindingRequiered= ruleBindingRequiered EOF ;
    public final EObject entryRuleBindingRequiered() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingRequiered = null;


        try {
            // InternalFoo.g:572:57: (iv_ruleBindingRequiered= ruleBindingRequiered EOF )
            // InternalFoo.g:573:2: iv_ruleBindingRequiered= ruleBindingRequiered EOF
            {
             newCompositeNode(grammarAccess.getBindingRequieredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBindingRequiered=ruleBindingRequiered();

            state._fsp--;

             current =iv_ruleBindingRequiered; 
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
    // $ANTLR end "entryRuleBindingRequiered"


    // $ANTLR start "ruleBindingRequiered"
    // InternalFoo.g:579:1: ruleBindingRequiered returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleBindingRequiered() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFoo.g:585:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) )
            // InternalFoo.g:586:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            {
            // InternalFoo.g:586:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:587:3: ( ( ruleQualifiedName ) ) otherlv_1= '.' ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:587:3: ( ( ruleQualifiedName ) )
            // InternalFoo.g:588:4: ( ruleQualifiedName )
            {
            // InternalFoo.g:588:4: ( ruleQualifiedName )
            // InternalFoo.g:589:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRequieredRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBindingRequieredAccess().getIdComponentAttributeCrossReference_0_0());
            				
            pushFollow(FOLLOW_18);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingRequieredAccess().getFullStopKeyword_1());
            		
            // InternalFoo.g:607:3: ( ( ruleQualifiedName ) )
            // InternalFoo.g:608:4: ( ruleQualifiedName )
            {
            // InternalFoo.g:608:4: ( ruleQualifiedName )
            // InternalFoo.g:609:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRequieredRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBindingRequieredAccess().getTypeRequieredServiceCrossReference_2_0());
            				
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
    // $ANTLR end "ruleBindingRequiered"


    // $ANTLR start "entryRuleBindingProvided"
    // InternalFoo.g:627:1: entryRuleBindingProvided returns [EObject current=null] : iv_ruleBindingProvided= ruleBindingProvided EOF ;
    public final EObject entryRuleBindingProvided() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingProvided = null;


        try {
            // InternalFoo.g:627:56: (iv_ruleBindingProvided= ruleBindingProvided EOF )
            // InternalFoo.g:628:2: iv_ruleBindingProvided= ruleBindingProvided EOF
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
    // InternalFoo.g:634:1: ruleBindingProvided returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleBindingProvided() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFoo.g:640:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) ) )
            // InternalFoo.g:641:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            {
            // InternalFoo.g:641:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) )
            // InternalFoo.g:642:3: ( ( ruleQualifiedName ) ) otherlv_1= '.' ( ( ruleQualifiedName ) )
            {
            // InternalFoo.g:642:3: ( ( ruleQualifiedName ) )
            // InternalFoo.g:643:4: ( ruleQualifiedName )
            {
            // InternalFoo.g:643:4: ( ruleQualifiedName )
            // InternalFoo.g:644:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingProvidedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBindingProvidedAccess().getIdComponentAttributeCrossReference_0_0());
            				
            pushFollow(FOLLOW_18);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingProvidedAccess().getFullStopKeyword_1());
            		
            // InternalFoo.g:662:3: ( ( ruleQualifiedName ) )
            // InternalFoo.g:663:4: ( ruleQualifiedName )
            {
            // InternalFoo.g:663:4: ( ruleQualifiedName )
            // InternalFoo.g:664:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingProvidedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBindingProvidedAccess().getTypeProvidedServiceCrossReference_2_0());
            				
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
    // InternalFoo.g:682:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalFoo.g:682:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalFoo.g:683:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalFoo.g:689:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_provided_3_0= ruleProvided ) ) ( (lv_requiered_4_0= ruleRequiered ) ) ( (lv_mProvServices_5_0= ruleMProvidedService ) )+ ( (lv_mReqServices_6_0= ruleMRequieredService ) )* otherlv_7= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_provided_3_0 = null;

        EObject lv_requiered_4_0 = null;

        EObject lv_mProvServices_5_0 = null;

        EObject lv_mReqServices_6_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:695:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_provided_3_0= ruleProvided ) ) ( (lv_requiered_4_0= ruleRequiered ) ) ( (lv_mProvServices_5_0= ruleMProvidedService ) )+ ( (lv_mReqServices_6_0= ruleMRequieredService ) )* otherlv_7= '}' ) )
            // InternalFoo.g:696:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_provided_3_0= ruleProvided ) ) ( (lv_requiered_4_0= ruleRequiered ) ) ( (lv_mProvServices_5_0= ruleMProvidedService ) )+ ( (lv_mReqServices_6_0= ruleMRequieredService ) )* otherlv_7= '}' )
            {
            // InternalFoo.g:696:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_provided_3_0= ruleProvided ) ) ( (lv_requiered_4_0= ruleRequiered ) ) ( (lv_mProvServices_5_0= ruleMProvidedService ) )+ ( (lv_mReqServices_6_0= ruleMRequieredService ) )* otherlv_7= '}' )
            // InternalFoo.g:697:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_provided_3_0= ruleProvided ) ) ( (lv_requiered_4_0= ruleRequiered ) ) ( (lv_mProvServices_5_0= ruleMProvidedService ) )+ ( (lv_mReqServices_6_0= ruleMRequieredService ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalFoo.g:701:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFoo.g:702:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFoo.g:702:4: (lv_name_1_0= RULE_ID )
            // InternalFoo.g:703:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFoo.g:723:3: ( (lv_provided_3_0= ruleProvided ) )
            // InternalFoo.g:724:4: (lv_provided_3_0= ruleProvided )
            {
            // InternalFoo.g:724:4: (lv_provided_3_0= ruleProvided )
            // InternalFoo.g:725:5: lv_provided_3_0= ruleProvided
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getProvidedProvidedParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_provided_3_0=ruleProvided();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"provided",
            						lv_provided_3_0,
            						"com.project.foo.Foo.Provided");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFoo.g:742:3: ( (lv_requiered_4_0= ruleRequiered ) )
            // InternalFoo.g:743:4: (lv_requiered_4_0= ruleRequiered )
            {
            // InternalFoo.g:743:4: (lv_requiered_4_0= ruleRequiered )
            // InternalFoo.g:744:5: lv_requiered_4_0= ruleRequiered
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getRequieredRequieredParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_requiered_4_0=ruleRequiered();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"requiered",
            						lv_requiered_4_0,
            						"com.project.foo.Foo.Requiered");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFoo.g:761:3: ( (lv_mProvServices_5_0= ruleMProvidedService ) )+
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
            	    // InternalFoo.g:762:4: (lv_mProvServices_5_0= ruleMProvidedService )
            	    {
            	    // InternalFoo.g:762:4: (lv_mProvServices_5_0= ruleMProvidedService )
            	    // InternalFoo.g:763:5: lv_mProvServices_5_0= ruleMProvidedService
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getMProvServicesMProvidedServiceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_mProvServices_5_0=ruleMProvidedService();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // InternalFoo.g:780:3: ( (lv_mReqServices_6_0= ruleMRequieredService ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFoo.g:781:4: (lv_mReqServices_6_0= ruleMRequieredService )
            	    {
            	    // InternalFoo.g:781:4: (lv_mReqServices_6_0= ruleMRequieredService )
            	    // InternalFoo.g:782:5: lv_mReqServices_6_0= ruleMRequieredService
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getMReqServicesMRequieredServiceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_mReqServices_6_0=ruleMRequieredService();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mReqServices",
            	    						lv_mReqServices_6_0,
            	    						"com.project.foo.Foo.MRequieredService");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleProvided"
    // InternalFoo.g:807:1: entryRuleProvided returns [EObject current=null] : iv_ruleProvided= ruleProvided EOF ;
    public final EObject entryRuleProvided() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvided = null;


        try {
            // InternalFoo.g:807:49: (iv_ruleProvided= ruleProvided EOF )
            // InternalFoo.g:808:2: iv_ruleProvided= ruleProvided EOF
            {
             newCompositeNode(grammarAccess.getProvidedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvided=ruleProvided();

            state._fsp--;

             current =iv_ruleProvided; 
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
    // $ANTLR end "entryRuleProvided"


    // $ANTLR start "ruleProvided"
    // InternalFoo.g:814:1: ruleProvided returns [EObject current=null] : (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' ) ;
    public final EObject ruleProvided() throws RecognitionException {
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
            // InternalFoo.g:820:2: ( (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' ) )
            // InternalFoo.g:821:2: (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' )
            {
            // InternalFoo.g:821:2: (otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}' )
            // InternalFoo.g:822:3: otherlv_0= 'provided' otherlv_1= '=' otherlv_2= '{' ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedAccess().getProvidedKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getProvidedAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProvidedAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFoo.g:834:3: ( ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )* )
            // InternalFoo.g:835:4: ( (lv_providedServices_3_0= ruleProvidedService ) ) (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )*
            {
            // InternalFoo.g:835:4: ( (lv_providedServices_3_0= ruleProvidedService ) )
            // InternalFoo.g:836:5: (lv_providedServices_3_0= ruleProvidedService )
            {
            // InternalFoo.g:836:5: (lv_providedServices_3_0= ruleProvidedService )
            // InternalFoo.g:837:6: lv_providedServices_3_0= ruleProvidedService
            {

            						newCompositeNode(grammarAccess.getProvidedAccess().getProvidedServicesProvidedServiceParserRuleCall_3_0_0());
            					
            pushFollow(FOLLOW_24);
            lv_providedServices_3_0=ruleProvidedService();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getProvidedRule());
            						}
            						add(
            							current,
            							"providedServices",
            							lv_providedServices_3_0,
            							"com.project.foo.Foo.ProvidedService");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalFoo.g:854:4: (otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFoo.g:855:5: otherlv_4= ',' ( (lv_providedServices_5_0= ruleProvidedService ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_4); 

            	    					newLeafNode(otherlv_4, grammarAccess.getProvidedAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalFoo.g:859:5: ( (lv_providedServices_5_0= ruleProvidedService ) )
            	    // InternalFoo.g:860:6: (lv_providedServices_5_0= ruleProvidedService )
            	    {
            	    // InternalFoo.g:860:6: (lv_providedServices_5_0= ruleProvidedService )
            	    // InternalFoo.g:861:7: lv_providedServices_5_0= ruleProvidedService
            	    {

            	    							newCompositeNode(grammarAccess.getProvidedAccess().getProvidedServicesProvidedServiceParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_24);
            	    lv_providedServices_5_0=ruleProvidedService();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProvidedRule());
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
            	    break loop11;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProvidedAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProvided"


    // $ANTLR start "entryRuleProvidedService"
    // InternalFoo.g:888:1: entryRuleProvidedService returns [EObject current=null] : iv_ruleProvidedService= ruleProvidedService EOF ;
    public final EObject entryRuleProvidedService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedService = null;


        try {
            // InternalFoo.g:888:56: (iv_ruleProvidedService= ruleProvidedService EOF )
            // InternalFoo.g:889:2: iv_ruleProvidedService= ruleProvidedService EOF
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
    // InternalFoo.g:895:1: ruleProvidedService returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProvidedService() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalFoo.g:901:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalFoo.g:902:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalFoo.g:902:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalFoo.g:903:3: (lv_name_0_0= RULE_ID )
            {
            // InternalFoo.g:903:3: (lv_name_0_0= RULE_ID )
            // InternalFoo.g:904:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getProvidedServiceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getProvidedServiceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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


    // $ANTLR start "entryRuleRequiered"
    // InternalFoo.g:923:1: entryRuleRequiered returns [EObject current=null] : iv_ruleRequiered= ruleRequiered EOF ;
    public final EObject entryRuleRequiered() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiered = null;


        try {
            // InternalFoo.g:923:50: (iv_ruleRequiered= ruleRequiered EOF )
            // InternalFoo.g:924:2: iv_ruleRequiered= ruleRequiered EOF
            {
             newCompositeNode(grammarAccess.getRequieredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiered=ruleRequiered();

            state._fsp--;

             current =iv_ruleRequiered; 
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
    // $ANTLR end "entryRuleRequiered"


    // $ANTLR start "ruleRequiered"
    // InternalFoo.g:930:1: ruleRequiered returns [EObject current=null] : ( () otherlv_1= 'requiered' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requieredServices_4_0= ruleRequieredService ) )? (otherlv_5= ',' ( (lv_requieredServices_6_0= ruleRequieredService ) ) )* ) otherlv_7= '}' ) ;
    public final EObject ruleRequiered() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_requieredServices_4_0 = null;

        EObject lv_requieredServices_6_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:936:2: ( ( () otherlv_1= 'requiered' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requieredServices_4_0= ruleRequieredService ) )? (otherlv_5= ',' ( (lv_requieredServices_6_0= ruleRequieredService ) ) )* ) otherlv_7= '}' ) )
            // InternalFoo.g:937:2: ( () otherlv_1= 'requiered' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requieredServices_4_0= ruleRequieredService ) )? (otherlv_5= ',' ( (lv_requieredServices_6_0= ruleRequieredService ) ) )* ) otherlv_7= '}' )
            {
            // InternalFoo.g:937:2: ( () otherlv_1= 'requiered' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requieredServices_4_0= ruleRequieredService ) )? (otherlv_5= ',' ( (lv_requieredServices_6_0= ruleRequieredService ) ) )* ) otherlv_7= '}' )
            // InternalFoo.g:938:3: () otherlv_1= 'requiered' otherlv_2= '=' otherlv_3= '{' ( ( (lv_requieredServices_4_0= ruleRequieredService ) )? (otherlv_5= ',' ( (lv_requieredServices_6_0= ruleRequieredService ) ) )* ) otherlv_7= '}'
            {
            // InternalFoo.g:938:3: ()
            // InternalFoo.g:939:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequieredAccess().getRequieredAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getRequieredAccess().getRequieredKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRequieredAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getRequieredAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFoo.g:957:3: ( ( (lv_requieredServices_4_0= ruleRequieredService ) )? (otherlv_5= ',' ( (lv_requieredServices_6_0= ruleRequieredService ) ) )* )
            // InternalFoo.g:958:4: ( (lv_requieredServices_4_0= ruleRequieredService ) )? (otherlv_5= ',' ( (lv_requieredServices_6_0= ruleRequieredService ) ) )*
            {
            // InternalFoo.g:958:4: ( (lv_requieredServices_4_0= ruleRequieredService ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFoo.g:959:5: (lv_requieredServices_4_0= ruleRequieredService )
                    {
                    // InternalFoo.g:959:5: (lv_requieredServices_4_0= ruleRequieredService )
                    // InternalFoo.g:960:6: lv_requieredServices_4_0= ruleRequieredService
                    {

                    						newCompositeNode(grammarAccess.getRequieredAccess().getRequieredServicesRequieredServiceParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_requieredServices_4_0=ruleRequieredService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequieredRule());
                    						}
                    						add(
                    							current,
                    							"requieredServices",
                    							lv_requieredServices_4_0,
                    							"com.project.foo.Foo.RequieredService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalFoo.g:977:4: (otherlv_5= ',' ( (lv_requieredServices_6_0= ruleRequieredService ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFoo.g:978:5: otherlv_5= ',' ( (lv_requieredServices_6_0= ruleRequieredService ) )
            	    {
            	    otherlv_5=(Token)match(input,27,FOLLOW_4); 

            	    					newLeafNode(otherlv_5, grammarAccess.getRequieredAccess().getCommaKeyword_4_1_0());
            	    				
            	    // InternalFoo.g:982:5: ( (lv_requieredServices_6_0= ruleRequieredService ) )
            	    // InternalFoo.g:983:6: (lv_requieredServices_6_0= ruleRequieredService )
            	    {
            	    // InternalFoo.g:983:6: (lv_requieredServices_6_0= ruleRequieredService )
            	    // InternalFoo.g:984:7: lv_requieredServices_6_0= ruleRequieredService
            	    {

            	    							newCompositeNode(grammarAccess.getRequieredAccess().getRequieredServicesRequieredServiceParserRuleCall_4_1_1_0());
            	    						
            	    pushFollow(FOLLOW_24);
            	    lv_requieredServices_6_0=ruleRequieredService();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getRequieredRule());
            	    							}
            	    							add(
            	    								current,
            	    								"requieredServices",
            	    								lv_requieredServices_6_0,
            	    								"com.project.foo.Foo.RequieredService");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRequieredAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRequiered"


    // $ANTLR start "entryRuleRequieredService"
    // InternalFoo.g:1011:1: entryRuleRequieredService returns [EObject current=null] : iv_ruleRequieredService= ruleRequieredService EOF ;
    public final EObject entryRuleRequieredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequieredService = null;


        try {
            // InternalFoo.g:1011:57: (iv_ruleRequieredService= ruleRequieredService EOF )
            // InternalFoo.g:1012:2: iv_ruleRequieredService= ruleRequieredService EOF
            {
             newCompositeNode(grammarAccess.getRequieredServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequieredService=ruleRequieredService();

            state._fsp--;

             current =iv_ruleRequieredService; 
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
    // $ANTLR end "entryRuleRequieredService"


    // $ANTLR start "ruleRequieredService"
    // InternalFoo.g:1018:1: ruleRequieredService returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRequieredService() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalFoo.g:1024:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalFoo.g:1025:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalFoo.g:1025:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalFoo.g:1026:3: (lv_name_0_0= RULE_ID )
            {
            // InternalFoo.g:1026:3: (lv_name_0_0= RULE_ID )
            // InternalFoo.g:1027:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getRequieredServiceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRequieredServiceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleRequieredService"


    // $ANTLR start "entryRuleMProvidedService"
    // InternalFoo.g:1046:1: entryRuleMProvidedService returns [EObject current=null] : iv_ruleMProvidedService= ruleMProvidedService EOF ;
    public final EObject entryRuleMProvidedService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMProvidedService = null;


        try {
            // InternalFoo.g:1046:57: (iv_ruleMProvidedService= ruleMProvidedService EOF )
            // InternalFoo.g:1047:2: iv_ruleMProvidedService= ruleMProvidedService EOF
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
    // InternalFoo.g:1053:1: ruleMProvidedService returns [EObject current=null] : (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleMProvidedService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_signature_2_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:1059:2: ( (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalFoo.g:1060:2: (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalFoo.g:1060:2: (otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalFoo.g:1061:3: otherlv_0= 'service' otherlv_1= 'provided' ( (lv_signature_2_0= rulePSignature ) ) otherlv_3= '{' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMProvidedServiceAccess().getServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMProvidedServiceAccess().getProvidedKeyword_1());
            		
            // InternalFoo.g:1069:3: ( (lv_signature_2_0= rulePSignature ) )
            // InternalFoo.g:1070:4: (lv_signature_2_0= rulePSignature )
            {
            // InternalFoo.g:1070:4: (lv_signature_2_0= rulePSignature )
            // InternalFoo.g:1071:5: lv_signature_2_0= rulePSignature
            {

            					newCompositeNode(grammarAccess.getMProvidedServiceAccess().getSignaturePSignatureParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,12,FOLLOW_26); 

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
    // InternalFoo.g:1100:1: entryRulePSignature returns [EObject current=null] : iv_rulePSignature= rulePSignature EOF ;
    public final EObject entryRulePSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePSignature = null;


        try {
            // InternalFoo.g:1100:51: (iv_rulePSignature= rulePSignature EOF )
            // InternalFoo.g:1101:2: iv_rulePSignature= rulePSignature EOF
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
    // InternalFoo.g:1107:1: rulePSignature returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )? (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* otherlv_6= ')' ) ;
    public final EObject rulePSignature() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:1113:2: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )? (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* otherlv_6= ')' ) )
            // InternalFoo.g:1114:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )? (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* otherlv_6= ')' )
            {
            // InternalFoo.g:1114:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )? (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* otherlv_6= ')' )
            // InternalFoo.g:1115:3: ( (lv_type_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )? (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* otherlv_6= ')'
            {
            // InternalFoo.g:1115:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalFoo.g:1116:4: (lv_type_0_0= RULE_ID )
            {
            // InternalFoo.g:1116:4: (lv_type_0_0= RULE_ID )
            // InternalFoo.g:1117:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            // InternalFoo.g:1133:3: ( (otherlv_1= RULE_ID ) )
            // InternalFoo.g:1134:4: (otherlv_1= RULE_ID )
            {
            // InternalFoo.g:1134:4: (otherlv_1= RULE_ID )
            // InternalFoo.g:1135:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPSignatureRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getPSignatureAccess().getNameProvidedServiceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getPSignatureAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFoo.g:1150:3: ( (lv_attributes_3_0= ruleAttribute ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFoo.g:1151:4: (lv_attributes_3_0= ruleAttribute )
                    {
                    // InternalFoo.g:1151:4: (lv_attributes_3_0= ruleAttribute )
                    // InternalFoo.g:1152:5: lv_attributes_3_0= ruleAttribute
                    {

                    					newCompositeNode(grammarAccess.getPSignatureAccess().getAttributesAttributeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_attributes_3_0=ruleAttribute();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPSignatureRule());
                    					}
                    					add(
                    						current,
                    						"attributes",
                    						lv_attributes_3_0,
                    						"com.project.foo.Foo.Attribute");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFoo.g:1169:3: (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFoo.g:1170:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPSignatureAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalFoo.g:1174:4: ( (lv_attributes_5_0= ruleAttribute ) )
            	    // InternalFoo.g:1175:5: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalFoo.g:1175:5: (lv_attributes_5_0= ruleAttribute )
            	    // InternalFoo.g:1176:6: lv_attributes_5_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getPSignatureAccess().getAttributesAttributeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPSignatureRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_5_0,
            	    							"com.project.foo.Foo.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMRequieredService"
    // InternalFoo.g:1202:1: entryRuleMRequieredService returns [EObject current=null] : iv_ruleMRequieredService= ruleMRequieredService EOF ;
    public final EObject entryRuleMRequieredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMRequieredService = null;


        try {
            // InternalFoo.g:1202:58: (iv_ruleMRequieredService= ruleMRequieredService EOF )
            // InternalFoo.g:1203:2: iv_ruleMRequieredService= ruleMRequieredService EOF
            {
             newCompositeNode(grammarAccess.getMRequieredServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMRequieredService=ruleMRequieredService();

            state._fsp--;

             current =iv_ruleMRequieredService; 
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
    // $ANTLR end "entryRuleMRequieredService"


    // $ANTLR start "ruleMRequieredService"
    // InternalFoo.g:1209:1: ruleMRequieredService returns [EObject current=null] : (otherlv_0= 'service' otherlv_1= 'requiered' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' ) ;
    public final EObject ruleMRequieredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_signature_2_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:1215:2: ( (otherlv_0= 'service' otherlv_1= 'requiered' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' ) )
            // InternalFoo.g:1216:2: (otherlv_0= 'service' otherlv_1= 'requiered' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' )
            {
            // InternalFoo.g:1216:2: (otherlv_0= 'service' otherlv_1= 'requiered' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';' )
            // InternalFoo.g:1217:3: otherlv_0= 'service' otherlv_1= 'requiered' ( (lv_signature_2_0= ruleRSignature ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getMRequieredServiceAccess().getServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMRequieredServiceAccess().getRequieredKeyword_1());
            		
            // InternalFoo.g:1225:3: ( (lv_signature_2_0= ruleRSignature ) )
            // InternalFoo.g:1226:4: (lv_signature_2_0= ruleRSignature )
            {
            // InternalFoo.g:1226:4: (lv_signature_2_0= ruleRSignature )
            // InternalFoo.g:1227:5: lv_signature_2_0= ruleRSignature
            {

            					newCompositeNode(grammarAccess.getMRequieredServiceAccess().getSignatureRSignatureParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_signature_2_0=ruleRSignature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMRequieredServiceRule());
            					}
            					set(
            						current,
            						"signature",
            						lv_signature_2_0,
            						"com.project.foo.Foo.RSignature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMRequieredServiceAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleMRequieredService"


    // $ANTLR start "entryRuleRSignature"
    // InternalFoo.g:1252:1: entryRuleRSignature returns [EObject current=null] : iv_ruleRSignature= ruleRSignature EOF ;
    public final EObject entryRuleRSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRSignature = null;


        try {
            // InternalFoo.g:1252:51: (iv_ruleRSignature= ruleRSignature EOF )
            // InternalFoo.g:1253:2: iv_ruleRSignature= ruleRSignature EOF
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
    // InternalFoo.g:1259:1: ruleRSignature returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )? (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleRSignature() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalFoo.g:1265:2: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )? (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* otherlv_6= ')' ) )
            // InternalFoo.g:1266:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )? (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* otherlv_6= ')' )
            {
            // InternalFoo.g:1266:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )? (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* otherlv_6= ')' )
            // InternalFoo.g:1267:3: ( (lv_type_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_attributes_3_0= ruleAttribute ) )? (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* otherlv_6= ')'
            {
            // InternalFoo.g:1267:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalFoo.g:1268:4: (lv_type_0_0= RULE_ID )
            {
            // InternalFoo.g:1268:4: (lv_type_0_0= RULE_ID )
            // InternalFoo.g:1269:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            // InternalFoo.g:1285:3: ( (otherlv_1= RULE_ID ) )
            // InternalFoo.g:1286:4: (otherlv_1= RULE_ID )
            {
            // InternalFoo.g:1286:4: (otherlv_1= RULE_ID )
            // InternalFoo.g:1287:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRSignatureRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getRSignatureAccess().getNameRequieredServiceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getRSignatureAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFoo.g:1302:3: ( (lv_attributes_3_0= ruleAttribute ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFoo.g:1303:4: (lv_attributes_3_0= ruleAttribute )
                    {
                    // InternalFoo.g:1303:4: (lv_attributes_3_0= ruleAttribute )
                    // InternalFoo.g:1304:5: lv_attributes_3_0= ruleAttribute
                    {

                    					newCompositeNode(grammarAccess.getRSignatureAccess().getAttributesAttributeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_attributes_3_0=ruleAttribute();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRSignatureRule());
                    					}
                    					add(
                    						current,
                    						"attributes",
                    						lv_attributes_3_0,
                    						"com.project.foo.Foo.Attribute");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFoo.g:1321:3: (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalFoo.g:1322:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRSignatureAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalFoo.g:1326:4: ( (lv_attributes_5_0= ruleAttribute ) )
            	    // InternalFoo.g:1327:5: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalFoo.g:1327:5: (lv_attributes_5_0= ruleAttribute )
            	    // InternalFoo.g:1328:6: lv_attributes_5_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getRSignatureAccess().getAttributesAttributeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRSignatureRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_5_0,
            	    							"com.project.foo.Foo.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAttribute"
    // InternalFoo.g:1354:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalFoo.g:1354:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalFoo.g:1355:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalFoo.g:1361:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalFoo.g:1367:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) )
            // InternalFoo.g:1368:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            {
            // InternalFoo.g:1368:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            // InternalFoo.g:1369:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) )
            {
            // InternalFoo.g:1369:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFoo.g:1370:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFoo.g:1370:4: (lv_name_0_0= RULE_ID )
            // InternalFoo.g:1371:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalFoo.g:1391:3: ( (lv_type_2_0= RULE_ID ) )
            // InternalFoo.g:1392:4: (lv_type_2_0= RULE_ID )
            {
            // InternalFoo.g:1392:4: (lv_type_2_0= RULE_ID )
            // InternalFoo.g:1393:5: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
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
    // $ANTLR end "ruleAttribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000108A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001082000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008002010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000088000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});

}