//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.02.23 at 11:11:43 GMT+01:00 
//


package freemind.controller.actions.generated.instance.impl;

public class TimeWindowConfigurationStorageTypeImpl
    extends freemind.controller.actions.generated.instance.impl.WindowConfigurationStorageImpl
    implements freemind.controller.actions.generated.instance.TimeWindowConfigurationStorageType, com.sun.xml.bind.JAXBObject, freemind.controller.actions.generated.instance.impl.runtime.UnmarshallableObject, freemind.controller.actions.generated.instance.impl.runtime.XMLSerializable, freemind.controller.actions.generated.instance.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _TimeWindowColumnSetting = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    public final static java.lang.Class version = (freemind.controller.actions.generated.instance.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (freemind.controller.actions.generated.instance.TimeWindowConfigurationStorageType.class);
    }

    public java.util.List getTimeWindowColumnSetting() {
        return _TimeWindowColumnSetting;
    }

    public freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingEventHandler createUnmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context) {
        return new freemind.controller.actions.generated.instance.impl.TimeWindowConfigurationStorageTypeImpl.Unmarshaller(context);
    }

    public void serializeElementBody(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _TimeWindowColumnSetting.size();
        super.serializeElementBody(context);
        while (idx1 != len1) {
            if (_TimeWindowColumnSetting.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _TimeWindowColumnSetting.get(idx1 ++)));
            } else {
                context.startElement("", "time_window_column_setting");
                int idx_0 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _TimeWindowColumnSetting.get(idx_0 ++)));
                context.endNamespaceDecls();
                int idx_1 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _TimeWindowColumnSetting.get(idx_1 ++)));
                context.endAttributes();
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _TimeWindowColumnSetting.get(idx1 ++)));
                context.endElement();
            }
        }
    }

    public void serializeAttributes(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _TimeWindowColumnSetting.size();
        super.serializeAttributes(context);
    }

    public void serializeAttributeBody(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _TimeWindowColumnSetting.size();
        super.serializeAttributeBody(context);
        while (idx1 != len1) {
            if (_TimeWindowColumnSetting.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _TimeWindowColumnSetting.get(idx1 ++)));
            } else {
                context.startElement("", "time_window_column_setting");
                int idx_0 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _TimeWindowColumnSetting.get(idx_0 ++)));
                context.endNamespaceDecls();
                int idx_1 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _TimeWindowColumnSetting.get(idx_1 ++)));
                context.endAttributes();
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _TimeWindowColumnSetting.get(idx1 ++)));
                context.endElement();
            }
        }
    }

    public void serializeURIs(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _TimeWindowColumnSetting.size();
        super.serializeURIs(context);
    }

    public java.lang.Class getPrimaryInterface() {
        return (freemind.controller.actions.generated.instance.TimeWindowConfigurationStorageType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0006\u00fa\u00ddfppsq\u0000~\u0000\u0000\u0005{:\u00eeppsq\u0000~\u0000\u0000\u0004"
+"\u0090w=ppsq\u0000~\u0000\u0000\u0002\u0011\u0091\u00a2ppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass"
+";xq\u0000~\u0000\u0003\u0001qqWppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dt"
+"t\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLc"
+"om/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0000\u00a0\u0001\u0095ppsr\u0000 com.sun.msv.datat"
+"ype.xsd.IntType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.Integ"
+"erDerivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacetst\u0000)Lcom/sun/msv/datatyp"
+"e/xsd/XSDatatypeImpl;xr\u0000*com.sun.msv.datatype.xsd.BuiltinAto"
+"micType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u0016L\u0000\nw"
+"hiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xp"
+"t\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0003intsr\u00005com.sun.msv.dat"
+"atype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun"
+".msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u0000*com.su"
+"n.msv.datatype.xsd.MaxInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.m"
+"sv.datatype.xsd.RangeFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\nlimitValuet\u0000\u0012Ljava/l"
+"ang/Object;xr\u00009com.sun.msv.datatype.xsd.DataTypeWithValueCon"
+"straintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataType"
+"WithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bb"
+"aseTypeq\u0000~\u0000\u0012L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/Conc"
+"reteType;L\u0000\tfacetNameq\u0000~\u0000\u0016xq\u0000~\u0000\u0015ppq\u0000~\u0000\u001d\u0000\u0001sr\u0000*com.sun.msv.dat"
+"atype.xsd.MinInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001fppq\u0000~\u0000\u001d\u0000\u0000sr\u0000!com"
+".sun.msv.datatype.xsd.LongType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0011q\u0000~\u0000\u0019t\u0000\u0004longq"
+"\u0000~\u0000\u001dsq\u0000~\u0000\u001eppq\u0000~\u0000\u001d\u0000\u0001sq\u0000~\u0000%ppq\u0000~\u0000\u001d\u0000\u0000sr\u0000$com.sun.msv.datatype.x"
+"sd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0011q\u0000~\u0000\u0019t\u0000\u0007integerq\u0000~\u0000\u001dsr\u0000,com.s"
+"un.msv.datatype.xsd.FractionDigitsFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005scalexr"
+"\u0000;com.sun.msv.datatype.xsd.DataTypeWithLexicalConstraintFace"
+"tT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq\u0000~\u0000\"ppq\u0000~\u0000\u001d\u0001\u0000sr\u0000#com.sun.msv.datatype.xsd.Numb"
+"erType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0013q\u0000~\u0000\u0019t\u0000\u0007decimalq\u0000~\u0000\u001dq\u0000~\u00003t\u0000\u000efractionD"
+"igits\u0000\u0000\u0000\u0000q\u0000~\u0000-t\u0000\fminInclusivesr\u0000\u000ejava.lang.Long;\u008b\u00e4\u0090\u00cc\u008f#\u00df\u0002\u0000\u0001J\u0000"
+"\u0005valuexr\u0000\u0010java.lang.Number\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0\u008b\u0002\u0000\u0000xp\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000-t\u0000\fmaxIn"
+"clusivesq\u0000~\u00007\u007f\u00ff\u00ff\u00ff\u00ff\u00ff\u00ff\u00ffq\u0000~\u0000(q\u0000~\u00006sr\u0000\u0011java.lang.Integer\u0012\u00e2\u00a0\u00a4\u00f7\u0081\u00878"
+"\u0002\u0000\u0001I\u0000\u0005valuexq\u0000~\u00008\u0080\u0000\u0000\u0000q\u0000~\u0000(q\u0000~\u0000:sq\u0000~\u0000<\u007f\u00ff\u00ff\u00ffsr\u00000com.sun.msv.gra"
+"mmar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nppsr\u0000\u001b"
+"com.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0016L\u0000\fna"
+"mespaceURIq\u0000~\u0000\u0016xpq\u0000~\u0000\u001aq\u0000~\u0000\u0019sr\u0000#com.sun.msv.grammar.SimpleNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0016L\u0000\fnamespaceURIq\u0000~\u0000\u0016xr\u0000\u001dco"
+"m.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0006heightt\u0000\u0000sq\u0000~\u0000\t\u0000\u00a0"
+" Fppq\u0000~\u0000\u000fsq\u0000~\u0000Ct\u0000\u0001yq\u0000~\u0000Gsq\u0000~\u0000\t\u0002~\u00e5\u0096ppq\u0000~\u0000\u000fsq\u0000~\u0000Ct\u0000\u0001xq\u0000~\u0000Gsq\u0000~"
+"\u0000\t\u0000\u00ea\u00c3\u00acppq\u0000~\u0000\u000fsq\u0000~\u0000Ct\u0000\u0005widthq\u0000~\u0000Gsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0001\u007f\u00a2sppsr\u0000 com.sun.msv.grammar.OneOrMor"
+"eExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001\u007f\u00a2hsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuex"
+"p\u0000psq\u0000~\u0000Q\u0001\u007f\u00a2eq\u0000~\u0000Wpsr\u0000\'com.sun.msv.grammar.trex.ElementPatte"
+"rn\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClassq\u0000~\u0000\nxr\u0000\u001ecom.sun.msv.grammar.Elemen"
+"tExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq"
+"\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u00bf\u00d17q\u0000~\u0000Wp\u0000sq\u0000~\u0000Y\u0000\u00bf\u00d1,pp\u0000sq\u0000~\u0000Q\u0000\u00bf\u00d1!ppsq\u0000~\u0000S\u0000\u00bf\u00d1\u0016q\u0000~\u0000"
+"Wpsq\u0000~\u0000\t\u0000\u00bf\u00d1\u0013q\u0000~\u0000Wpsr\u00002com.sun.msv.grammar.Expression$AnyStri"
+"ngExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000V\u0001psr\u0000 com.sun.msv.gra"
+"mmar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Dsr\u00000com.sun.msv.grammar.Ex"
+"pression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000bq\u0000~\u0000fsq\u0000"
+"~\u0000Ct\u0000Jfreemind.controller.actions.generated.instance.TimeWin"
+"dowColumnSettingTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-el"
+"ementssq\u0000~\u0000Ct\u0000\u001atime_window_column_settingq\u0000~\u0000Gsq\u0000~\u0000Y\u0000\u00bf\u00d1,q\u0000~\u0000"
+"Wp\u0000sq\u0000~\u0000Q\u0000\u00bf\u00d1!ppsq\u0000~\u0000S\u0000\u00bf\u00d1\u0016q\u0000~\u0000Wpsq\u0000~\u0000\t\u0000\u00bf\u00d1\u0013q\u0000~\u0000Wpq\u0000~\u0000aq\u0000~\u0000dq\u0000~"
+"\u0000fsq\u0000~\u0000Ct\u0000Ffreemind.controller.actions.generated.instance.Ti"
+"meWindowColumnSettingq\u0000~\u0000iq\u0000~\u0000fsr\u0000\"com.sun.msv.grammar.Expre"
+"ssionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expre"
+"ssionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPoo"
+"l$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000s[\u0000\u0005"
+"tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u000b\u0000\u0000\u00009pur\u0000![Lco"
+"m.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppppppppp"
+"ppppppppppppppppppppppppppppppppq\u0000~\u0000^q\u0000~\u0000npppppppppq\u0000~\u0000]q\u0000~\u0000"
+"mppppppppppppppppppppppppppppppq\u0000~\u0000\u0007pppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppq\u0000~\u0000Xppq\u0000~\u0000Uppq\u0000~\u0000\u0005pppppp"
+"pq\u0000~\u0000Rpppppppq\u0000~\u0000\bppppppq\u0000~\u0000\u0006pppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends freemind.controller.actions.generated.instance.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context) {
            super(context, "-----");
        }

        protected Unmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return freemind.controller.actions.generated.instance.impl.TimeWindowConfigurationStorageTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        attIdx = context.getAttribute("", "column_width");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "height");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  4 :
                        if (("time_window_column_setting" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("time_window_column_setting" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        state = 4;
                        continue outer;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        attIdx = context.getAttribute("", "column_width");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "height");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  4 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  3 :
                        if (("time_window_column_setting" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("column_width" == ___local)&&("" == ___uri)) {
                            _TimeWindowColumnSetting.add(((freemind.controller.actions.generated.instance.impl.TimeWindowColumnSettingTypeImpl) spawnChildFromEnterAttribute((freemind.controller.actions.generated.instance.impl.TimeWindowColumnSettingTypeImpl.class), 3, ___uri, ___local, ___qname)));
                            return ;
                        }
                        break;
                    case  0 :
                        if (("height" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((freemind.controller.actions.generated.instance.impl.WindowConfigurationStorageImpl)freemind.controller.actions.generated.instance.impl.TimeWindowConfigurationStorageTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  4 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        state = 4;
                        continue outer;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        attIdx = context.getAttribute("", "column_width");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "height");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  4 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        state = 4;
                        continue outer;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  2 :
                            attIdx = context.getAttribute("", "column_width");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  0 :
                            attIdx = context.getAttribute("", "height");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  4 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            state = 4;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}