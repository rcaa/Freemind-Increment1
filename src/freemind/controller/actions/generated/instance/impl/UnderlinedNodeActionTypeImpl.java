//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.02.23 at 11:11:43 GMT+01:00 
//


package freemind.controller.actions.generated.instance.impl;

public class UnderlinedNodeActionTypeImpl
    extends freemind.controller.actions.generated.instance.impl.FormatNodeActionImpl
    implements freemind.controller.actions.generated.instance.UnderlinedNodeActionType, com.sun.xml.bind.JAXBObject, freemind.controller.actions.generated.instance.impl.runtime.UnmarshallableObject, freemind.controller.actions.generated.instance.impl.runtime.XMLSerializable, freemind.controller.actions.generated.instance.impl.runtime.ValidatableObject
{

    protected boolean has_Underlined;
    protected boolean _Underlined;
    public final static java.lang.Class version = (freemind.controller.actions.generated.instance.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (freemind.controller.actions.generated.instance.UnderlinedNodeActionType.class);
    }

    public boolean isUnderlined() {
        return _Underlined;
    }

    public void setUnderlined(boolean value) {
        _Underlined = value;
        has_Underlined = true;
    }

    public freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingEventHandler createUnmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context) {
        return new freemind.controller.actions.generated.instance.impl.UnderlinedNodeActionTypeImpl.Unmarshaller(context);
    }

    public void serializeElementBody(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeElementBody(context);
    }

    public void serializeAttributes(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startAttribute("", "underlined");
        try {
            context.text(javax.xml.bind.DatatypeConverter.printBoolean(((boolean) _Underlined)));
        } catch (java.lang.Exception e) {
            freemind.controller.actions.generated.instance.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        super.serializeAttributes(context);
    }

    public void serializeAttributeBody(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeAttributeBody(context);
    }

    public void serializeURIs(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeURIs(context);
    }

    public java.lang.Class getPrimaryInterface() {
        return (freemind.controller.actions.generated.instance.UnderlinedNodeActionType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0005{\u0016Jppsr\u0000 com.sun.msv.gra"
+"mmar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClasst\u0000\u001fLcom/s"
+"un/msv/grammar/NameClass;xq\u0000~\u0000\u0003\u0003:\u000e\u00a3ppsr\u0000\u001bcom.sun.msv.grammar"
+".DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000"
+"\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0001\u0086\u00d4"
+"\u0094ppsr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAl"
+"waysValidxr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnames"
+"paceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u0011L\u0000\nwhiteSpacet\u0000."
+"Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://ww"
+"w.w3.org/2001/XMLSchemat\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd"
+".WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.data"
+"type.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.gr"
+"ammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nppsr\u0000"
+"\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0011L\u0000\fn"
+"amespaceURIq\u0000~\u0000\u0011xpq\u0000~\u0000\u0015q\u0000~\u0000\u0014sr\u0000#com.sun.msv.grammar.SimpleNa"
+"meClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0011L\u0000\fnamespaceURIq\u0000~\u0000\u0011xr\u0000\u001dc"
+"om.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004nodet\u0000\u0000sq\u0000~\u0000\u0006\u0002A\u0007"
+"\u00a2ppsq\u0000~\u0000\t\u0001\u00d8\u00d3\u00afppsr\u0000$com.sun.msv.datatype.xsd.BooleanType\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u000eq\u0000~\u0000\u0014t\u0000\u0007booleansr\u00005com.sun.msv.datatype.xsd.Whit"
+"eSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0017q\u0000~\u0000\u001asq\u0000~\u0000\u001bq\u0000~\u0000&q\u0000~"
+"\u0000\u0014sq\u0000~\u0000\u001dt\u0000\nunderlinedq\u0000~\u0000!sr\u0000\"com.sun.msv.grammar.Expression"
+"Pool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expression"
+"Pool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$Clo"
+"sedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000-[\u0000\u0005table"
+"t\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0001\u0000\u0000\u00009pur\u0000![Lcom.sun"
+".msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"ppppppppppppppppppq\u0000~\u0000\u0005ppppppppppppppppppppppppppppppppp"));
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
            return freemind.controller.actions.generated.instance.impl.UnderlinedNodeActionTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        attIdx = context.getAttribute("", "node");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "underlined");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText0(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  4 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText0(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Underlined = javax.xml.bind.DatatypeConverter.parseBoolean(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_Underlined = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        attIdx = context.getAttribute("", "node");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "underlined");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText0(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  4 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
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
                    case  3 :
                        if (("node" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((freemind.controller.actions.generated.instance.impl.FormatNodeActionImpl)freemind.controller.actions.generated.instance.impl.UnderlinedNodeActionTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("underlined" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        break;
                    case  4 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
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
                        if (("underlined" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "node");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "underlined");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText0(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  4 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
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
                        case  3 :
                            attIdx = context.getAttribute("", "node");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  1 :
                            eatText0(value);
                            state = 2;
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "underlined");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText0(v);
                                state = 3;
                                continue outer;
                            }
                            break;
                        case  4 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
