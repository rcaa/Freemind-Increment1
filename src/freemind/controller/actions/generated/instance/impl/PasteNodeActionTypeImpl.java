//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.02.23 at 11:11:43 GMT+01:00 
//


package freemind.controller.actions.generated.instance.impl;

public class PasteNodeActionTypeImpl
    extends freemind.controller.actions.generated.instance.impl.NodeActionImpl
    implements freemind.controller.actions.generated.instance.PasteNodeActionType, com.sun.xml.bind.JAXBObject, freemind.controller.actions.generated.instance.impl.runtime.UnmarshallableObject, freemind.controller.actions.generated.instance.impl.runtime.XMLSerializable, freemind.controller.actions.generated.instance.impl.runtime.ValidatableObject
{

    protected freemind.controller.actions.generated.instance.TransferableContentType _TransferableContent;
    protected boolean has_AsSibling;
    protected boolean _AsSibling;
    protected boolean has_IsLeft;
    protected boolean _IsLeft;
    public final static java.lang.Class version = (freemind.controller.actions.generated.instance.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (freemind.controller.actions.generated.instance.PasteNodeActionType.class);
    }

    public freemind.controller.actions.generated.instance.TransferableContentType getTransferableContent() {
        return _TransferableContent;
    }

    public void setTransferableContent(freemind.controller.actions.generated.instance.TransferableContentType value) {
        _TransferableContent = value;
    }

    public boolean isAsSibling() {
        return _AsSibling;
    }

    public void setAsSibling(boolean value) {
        _AsSibling = value;
        has_AsSibling = true;
    }

    public boolean isIsLeft() {
        return _IsLeft;
    }

    public void setIsLeft(boolean value) {
        _IsLeft = value;
        has_IsLeft = true;
    }

    public freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingEventHandler createUnmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context) {
        return new freemind.controller.actions.generated.instance.impl.PasteNodeActionTypeImpl.Unmarshaller(context);
    }

    public void serializeElementBody(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeElementBody(context);
        if (_TransferableContent instanceof javax.xml.bind.Element) {
            context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _TransferableContent));
        } else {
            context.startElement("", "transferable_content");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _TransferableContent));
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _TransferableContent));
            context.endAttributes();
            context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _TransferableContent));
            context.endElement();
        }
    }

    public void serializeAttributes(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startAttribute("", "asSibling");
        try {
            context.text(javax.xml.bind.DatatypeConverter.printBoolean(((boolean) _AsSibling)));
        } catch (java.lang.Exception e) {
            freemind.controller.actions.generated.instance.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        context.startAttribute("", "isLeft");
        try {
            context.text(javax.xml.bind.DatatypeConverter.printBoolean(((boolean) _IsLeft)));
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
        if (_TransferableContent instanceof javax.xml.bind.Element) {
            context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _TransferableContent));
        } else {
            context.startElement("", "transferable_content");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _TransferableContent));
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _TransferableContent));
            context.endAttributes();
            context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _TransferableContent));
            context.endElement();
        }
    }

    public void serializeURIs(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeURIs(context);
    }

    public java.lang.Class getPrimaryInterface() {
        return (freemind.controller.actions.generated.instance.PasteNodeActionType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\n%Pxppsq\u0000~\u0000\u0000\u0006\u00e6H\u00b7ppsq\u0000~\u0000\u0000\u0004"
+"\u00b9\u00b1\rppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000"
+"~\u0000\u0002L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xq\u0000~\u0000\u0003\u0003:\u000e\u00a3p"
+"psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/rela"
+"xng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/u"
+"til/StringPair;xq\u0000~\u0000\u0003\u0001\u0086\u00d4\u0094ppsr\u0000#com.sun.msv.datatype.xsd.Stri"
+"ngType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv.datatype.xs"
+"d.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.C"
+"oncreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatyp"
+"eImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeN"
+"ameq\u0000~\u0000\u0013L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpace"
+"Processor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006stringsr\u00005"
+"com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0"
+"\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0013L\u0000\fnamespaceURIq\u0000~\u0000\u0013xpq\u0000~\u0000\u0017q\u0000~\u0000\u0016sr\u0000#com."
+"sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0013L"
+"\u0000\fnamespaceURIq\u0000~\u0000\u0013xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xpt\u0000\u0004nodet\u0000\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"q\u0000~\u0000\u0001\u0001\u007f\u00a2eppsr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClassq\u0000~\u0000\txr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~"
+"\u0000\u0003\u0000\u00bf\u00d17pp\u0000sq\u0000~\u0000&\u0000\u00bf\u00d1,pp\u0000sq\u0000~\u0000$\u0000\u00bf\u00d1!ppsr\u0000 com.sun.msv.grammar.On"
+"eOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u00bf\u00d1\u0016sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005"
+"valuexp\u0000psq\u0000~\u0000\b\u0000\u00bf\u00d1\u0013q\u0000~\u0000/psr\u00002com.sun.msv.grammar.Expression$"
+"AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000.\u0001psr\u0000 com.sun."
+"msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000 sr\u00000com.sun.msv.gra"
+"mmar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u00003q"
+"\u0000~\u00007sq\u0000~\u0000\u001ft\u0000Ffreemind.controller.actions.generated.instance."
+"TransferableContentTypet\u0000+http://java.sun.com/jaxb/xjc/dummy"
+"-elementssq\u0000~\u0000\u001ft\u0000\u0014transferable_contentq\u0000~\u0000#sq\u0000~\u0000&\u0000\u00bf\u00d1,pp\u0000sq\u0000~"
+"\u0000$\u0000\u00bf\u00d1!ppsq\u0000~\u0000+\u0000\u00bf\u00d1\u0016q\u0000~\u0000/psq\u0000~\u0000\b\u0000\u00bf\u00d1\u0013q\u0000~\u0000/pq\u0000~\u00002q\u0000~\u00005q\u0000~\u00007sq\u0000~\u0000"
+"\u001ft\u0000Bfreemind.controller.actions.generated.instance.Transfera"
+"bleContentq\u0000~\u0000:sq\u0000~\u0000\b\u0002,\u0097\u00a5ppsq\u0000~\u0000\u000b\u0001\u00d8\u00d3\u00afppsr\u0000$com.sun.msv.datat"
+"ype.xsd.BooleanType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0010q\u0000~\u0000\u0016t\u0000\u0007booleansr\u00005com.s"
+"un.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"q\u0000~\u0000\u0019q\u0000~\u0000\u001csq\u0000~\u0000\u001dq\u0000~\u0000Gq\u0000~\u0000\u0016sq\u0000~\u0000\u001ft\u0000\tasSiblingq\u0000~\u0000#sq\u0000~\u0000\b\u0003?\u0007\u00bcp"
+"pq\u0000~\u0000Dsq\u0000~\u0000\u001ft\u0000\u0006isLeftq\u0000~\u0000#sr\u0000\"com.sun.msv.grammar.Expression"
+"Pool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expression"
+"Pool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$Clo"
+"sedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000Q[\u0000\u0005table"
+"t\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\b\u0000\u0000\u00009pur\u0000![Lcom.sun"
+".msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppppppppppppppp"
+"ppppq\u0000~\u0000\u0006ppppppppppppppppppppppq\u0000~\u0000-q\u0000~\u0000?pppppppppq\u0000~\u0000*q\u0000~\u0000>"
+"ppppppppppppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000\u0005ppp"
+"ppppppppppppppppppppppppppppppppppq\u0000~\u0000%ppppppppppppppppppppq"
+"\u0000~\u0000\u0007pppppppppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends freemind.controller.actions.generated.instance.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context) {
            super(context, "-----------");
        }

        protected Unmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return freemind.controller.actions.generated.instance.impl.PasteNodeActionTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  8 :
                        attIdx = context.getAttribute("", "TransferableAsDrop");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Transferable");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "TransferableAsRTF");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "TransferableAsHtml");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "TransferableAsPlainText");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("TransferableAsFileList" == ___local)&&("" == ___uri)) {
                            _TransferableContent = ((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl) spawnChildFromEnterElement((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _TransferableContent = ((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl) spawnChildFromEnterElement((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl.class), 9, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  6 :
                        attIdx = context.getAttribute("", "node");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "isLeft");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText0(v);
                            state = 6;
                            continue outer;
                        }
                        break;
                    case  10 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "asSibling");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  7 :
                        if (("transferable_content" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 8;
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText0(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _IsLeft = javax.xml.bind.DatatypeConverter.parseBoolean(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_IsLeft = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _AsSibling = javax.xml.bind.DatatypeConverter.parseBoolean(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_AsSibling = true;
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
                    case  8 :
                        attIdx = context.getAttribute("", "TransferableAsDrop");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Transferable");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "TransferableAsRTF");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "TransferableAsHtml");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "TransferableAsPlainText");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _TransferableContent = ((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl) spawnChildFromLeaveElement((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl.class), 9, ___uri, ___local, ___qname));
                        return ;
                    case  6 :
                        attIdx = context.getAttribute("", "node");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "isLeft");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText0(v);
                            state = 6;
                            continue outer;
                        }
                        break;
                    case  9 :
                        if (("transferable_content" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 10;
                            return ;
                        }
                        break;
                    case  10 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "asSibling");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
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
                    case  8 :
                        if (("TransferableAsDrop" == ___local)&&("" == ___uri)) {
                            _TransferableContent = ((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl) spawnChildFromEnterAttribute((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl.class), 9, ___uri, ___local, ___qname));
                            return ;
                        }
                        if (("Transferable" == ___local)&&("" == ___uri)) {
                            _TransferableContent = ((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl) spawnChildFromEnterAttribute((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl.class), 9, ___uri, ___local, ___qname));
                            return ;
                        }
                        if (("TransferableAsRTF" == ___local)&&("" == ___uri)) {
                            _TransferableContent = ((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl) spawnChildFromEnterAttribute((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl.class), 9, ___uri, ___local, ___qname));
                            return ;
                        }
                        if (("TransferableAsHtml" == ___local)&&("" == ___uri)) {
                            _TransferableContent = ((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl) spawnChildFromEnterAttribute((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl.class), 9, ___uri, ___local, ___qname));
                            return ;
                        }
                        if (("TransferableAsPlainText" == ___local)&&("" == ___uri)) {
                            _TransferableContent = ((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl) spawnChildFromEnterAttribute((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl.class), 9, ___uri, ___local, ___qname));
                            return ;
                        }
                        _TransferableContent = ((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl) spawnChildFromEnterAttribute((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl.class), 9, ___uri, ___local, ___qname));
                        return ;
                    case  6 :
                        if (("node" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((freemind.controller.actions.generated.instance.impl.NodeActionImpl)freemind.controller.actions.generated.instance.impl.PasteNodeActionTypeImpl.this).new Unmarshaller(context)), 7, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        if (("isLeft" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        break;
                    case  10 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        if (("asSibling" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        break;
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
                    case  8 :
                        attIdx = context.getAttribute("", "TransferableAsDrop");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Transferable");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "TransferableAsRTF");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "TransferableAsHtml");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "TransferableAsPlainText");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _TransferableContent = ((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl) spawnChildFromLeaveAttribute((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl.class), 9, ___uri, ___local, ___qname));
                        return ;
                    case  2 :
                        if (("asSibling" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("", "node");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "isLeft");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText0(v);
                            state = 6;
                            continue outer;
                        }
                        break;
                    case  10 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "asSibling");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  5 :
                        if (("isLeft" == ___local)&&("" == ___uri)) {
                            state = 6;
                            return ;
                        }
                        break;
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
                        case  8 :
                            attIdx = context.getAttribute("", "TransferableAsDrop");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "Transferable");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "TransferableAsRTF");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "TransferableAsHtml");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "TransferableAsPlainText");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _TransferableContent = ((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl) spawnChildFromText((freemind.controller.actions.generated.instance.impl.TransferableContentTypeImpl.class), 9, value));
                            return ;
                        case  6 :
                            attIdx = context.getAttribute("", "node");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  3 :
                            attIdx = context.getAttribute("", "isLeft");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText0(v);
                                state = 6;
                                continue outer;
                            }
                            break;
                        case  4 :
                            eatText0(value);
                            state = 5;
                            return ;
                        case  1 :
                            eatText1(value);
                            state = 2;
                            return ;
                        case  10 :
                            revertToParentFromText(value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "asSibling");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 3;
                                continue outer;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
