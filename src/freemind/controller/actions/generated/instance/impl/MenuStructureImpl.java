//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.02.23 at 11:11:43 GMT+01:00 
//

package freemind.controller.actions.generated.instance.impl;

public class MenuStructureImpl
		extends
		freemind.controller.actions.generated.instance.impl.MenuStructureTypeImpl
		implements
		freemind.controller.actions.generated.instance.MenuStructure,
		com.sun.xml.bind.JAXBObject,
		com.sun.xml.bind.RIElement,
		freemind.controller.actions.generated.instance.impl.runtime.UnmarshallableObject,
		freemind.controller.actions.generated.instance.impl.runtime.XMLSerializable,
		freemind.controller.actions.generated.instance.impl.runtime.ValidatableObject {

	public final static java.lang.Class version = (freemind.controller.actions.generated.instance.impl.JAXBVersion.class);
	private static com.sun.msv.grammar.Grammar schemaFragment;

	public java.lang.String ____jaxb_ri____getNamespaceURI() {
		return "";
	}

	public java.lang.String ____jaxb_ri____getLocalName() {
		return "menu_structure";
	}

	private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
		return (freemind.controller.actions.generated.instance.MenuStructure.class);
	}

	public freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingEventHandler createUnmarshaller(
			freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context) {
		return new freemind.controller.actions.generated.instance.impl.MenuStructureImpl.Unmarshaller(
				context);
	}

	public void serializeElementBody(
			freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
			throws org.xml.sax.SAXException {
		context.startElement("", "menu_structure");
		super.serializeURIs(context);
		context.endNamespaceDecls();
		super.serializeAttributes(context);
		context.endAttributes();
		super.serializeElementBody(context);
		context.endElement();
	}

	public void serializeAttributes(
			freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
			throws org.xml.sax.SAXException {
	}

	public void serializeAttributeBody(
			freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
			throws org.xml.sax.SAXException {
		context.startElement("", "menu_structure");
		super.serializeURIs(context);
		context.endNamespaceDecls();
		super.serializeAttributes(context);
		context.endAttributes();
		super.serializeElementBody(context);
		context.endElement();
	}

	public void serializeURIs(
			freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
			throws org.xml.sax.SAXException {
	}

	public java.lang.Class getPrimaryInterface() {
		return (freemind.controller.actions.generated.instance.MenuStructure.class);
	}

	public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
		if (schemaFragment == null) {
			schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer
					.deserialize(("\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
							+ "\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
							+ "grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
							+ "\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
							+ "msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
							+ "Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u0000\u00bf\u00d1Ep"
							+ "p\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.ms"
							+ "v.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004"
							+ "\u0000\u00bf\u00d1:ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom"
							+ ".sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0000\u00bf\u00d1/sr\u0000"
							+ "\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000\u0000\u00bf\u00d1,q\u0000~\u0000\u000ep\u0000sq"
							+ "\u0000~\u0000\u0007\u0000\u00bf\u00d1!ppsq\u0000~\u0000\n\u0000\u00bf\u00d1\u0016q\u0000~\u0000\u000epsr\u0000 com.sun.msv.grammar.AttributeE"
							+ "xp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0000\u00bf\u00d1\u0013q\u0000~\u0000\u000epsr\u0000"
							+ "2com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
							+ "\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\r\u0001psr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000"
							+ "\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com"
							+ ".sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~"
							+ "\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u0016q\u0000~\u0000\u001bsr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000"
							+ "\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001dx"
							+ "q\u0000~\u0000\u0018t\u0000;freemind.controller.actions.generated.instance.MenuC"
							+ "ategoryt\u0000+http://java.sun.com/jaxb/xjc/dummy-elementsq\u0000~\u0000\u001bsq"
							+ "\u0000~\u0000\u001ct\u0000\u000emenu_structuret\u0000\u0000sr\u0000\"com.sun.msv.grammar.ExpressionPo"
							+ "ol\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPo"
							+ "ol$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$Close"
							+ "dHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000%[\u0000\u0005tablet\u0000"
							+ "![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0004\u0000\u0000\u00009pur\u0000![Lcom.sun.m"
							+ "sv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppppppppppppppppp"
							+ "pppppppppppppppppppppppppq\u0000~\u0000\u0011ppppppppppq\u0000~\u0000\u0010pppppppppppppq\u0000"
							+ "~\u0000\fppppppppppq\u0000~\u0000\tpppppppppppppppppppppppppppppppppppppppppp"
							+ "pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
							+ "pppppp"));
		}
		return new com.sun.msv.verifier.regexp.REDocumentDeclaration(
				schemaFragment);
	}

	public class Unmarshaller
			extends
			freemind.controller.actions.generated.instance.impl.runtime.AbstractUnmarshallingEventHandlerImpl {

		public Unmarshaller(
				freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context) {
			super(context, "----");
		}

		protected Unmarshaller(
				freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context,
				int startState) {
			this(context);
			state = startState;
		}

		public java.lang.Object owner() {
			return freemind.controller.actions.generated.instance.impl.MenuStructureImpl.this;
		}

		public void enterElement(java.lang.String ___uri,
				java.lang.String ___local, java.lang.String ___qname,
				org.xml.sax.Attributes __atts) throws org.xml.sax.SAXException {
			int attIdx;
			outer: while (true) {
				switch (state) {
				case 0:
					if (("menu_structure" == ___local) && ("" == ___uri)) {
						context.pushAttributes(__atts, false);
						state = 1;
						return;
					}
					break;
				case 3:
					revertToParentFromEnterElement(___uri, ___local, ___qname,
							__atts);
					return;
				case 1:
					if (("menu_category" == ___local) && ("" == ___uri)) {
						spawnHandlerFromEnterElement(
								(((freemind.controller.actions.generated.instance.impl.MenuStructureTypeImpl) freemind.controller.actions.generated.instance.impl.MenuStructureImpl.this).new Unmarshaller(
										context)), 2, ___uri, ___local,
								___qname, __atts);
						return;
					}
					spawnHandlerFromEnterElement(
							(((freemind.controller.actions.generated.instance.impl.MenuStructureTypeImpl) freemind.controller.actions.generated.instance.impl.MenuStructureImpl.this).new Unmarshaller(
									context)), 2, ___uri, ___local, ___qname,
							__atts);
					return;
				}
				super.enterElement(___uri, ___local, ___qname, __atts);
				break;
			}
		}

		public void leaveElement(java.lang.String ___uri,
				java.lang.String ___local, java.lang.String ___qname)
				throws org.xml.sax.SAXException {
			int attIdx;
			outer: while (true) {
				switch (state) {
				case 2:
					if (("menu_structure" == ___local) && ("" == ___uri)) {
						context.popAttributes();
						state = 3;
						return;
					}
					break;
				case 3:
					revertToParentFromLeaveElement(___uri, ___local, ___qname);
					return;
				case 1:
					spawnHandlerFromLeaveElement(
							(((freemind.controller.actions.generated.instance.impl.MenuStructureTypeImpl) freemind.controller.actions.generated.instance.impl.MenuStructureImpl.this).new Unmarshaller(
									context)), 2, ___uri, ___local, ___qname);
					return;
				}
				super.leaveElement(___uri, ___local, ___qname);
				break;
			}
		}

		public void enterAttribute(java.lang.String ___uri,
				java.lang.String ___local, java.lang.String ___qname)
				throws org.xml.sax.SAXException {
			int attIdx;
			outer: while (true) {
				switch (state) {
				case 3:
					revertToParentFromEnterAttribute(___uri, ___local, ___qname);
					return;
				case 1:
					spawnHandlerFromEnterAttribute(
							(((freemind.controller.actions.generated.instance.impl.MenuStructureTypeImpl) freemind.controller.actions.generated.instance.impl.MenuStructureImpl.this).new Unmarshaller(
									context)), 2, ___uri, ___local, ___qname);
					return;
				}
				super.enterAttribute(___uri, ___local, ___qname);
				break;
			}
		}

		public void leaveAttribute(java.lang.String ___uri,
				java.lang.String ___local, java.lang.String ___qname)
				throws org.xml.sax.SAXException {
			int attIdx;
			outer: while (true) {
				switch (state) {
				case 3:
					revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
					return;
				case 1:
					spawnHandlerFromLeaveAttribute(
							(((freemind.controller.actions.generated.instance.impl.MenuStructureTypeImpl) freemind.controller.actions.generated.instance.impl.MenuStructureImpl.this).new Unmarshaller(
									context)), 2, ___uri, ___local, ___qname);
					return;
				}
				super.leaveAttribute(___uri, ___local, ___qname);
				break;
			}
		}

		public void handleText(final java.lang.String value)
				throws org.xml.sax.SAXException {
			int attIdx;
			outer: while (true) {
				try {
					switch (state) {
					case 3:
						revertToParentFromText(value);
						return;
					case 1:
						spawnHandlerFromText(
								(((freemind.controller.actions.generated.instance.impl.MenuStructureTypeImpl) freemind.controller.actions.generated.instance.impl.MenuStructureImpl.this).new Unmarshaller(
										context)), 2, value);
						return;
					}
				} catch (java.lang.RuntimeException e) {
					handleUnexpectedTextException(value, e);
				}
				break;
			}
		}

	}

}
