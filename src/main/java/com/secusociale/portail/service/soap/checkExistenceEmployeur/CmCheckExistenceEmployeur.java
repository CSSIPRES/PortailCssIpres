
package com.secusociale.portail.service.soap.checkExistenceEmployeur;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="input" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="taxpayerIdentifierType" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="8"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="taxpayerIdentifierValue" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="16"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="taxpayerName" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="254"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="checkUsingTaxpayerIDOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="fuzzySearchUsage" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="C1AP"/>
 *                         &lt;enumeration value="C1NA"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="output" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="isTaxpayerIdentifierExist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="isTaxpayerNameExist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="personId" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="dateTimeTagFormat" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="xsd:strict" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "input",
    "output"
})
@XmlRootElement(name = "CmCheckExistenceEmployeur")
public class CmCheckExistenceEmployeur {

    @XmlElement(namespace = "http://oracle.com/CmCheckExistenceEmployeur.xsd")
    protected CmCheckExistenceEmployeur.Input input;
    @XmlElement(namespace = "http://oracle.com/CmCheckExistenceEmployeur.xsd")
    protected CmCheckExistenceEmployeur.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propriété input.
     * 
     * @return
     *     possible object is
     *     {@link CmCheckExistenceEmployeur.Input }
     *     
     */
    public CmCheckExistenceEmployeur.Input getInput() {
        return input;
    }

    /**
     * Définit la valeur de la propriété input.
     * 
     * @param value
     *     allowed object is
     *     {@link CmCheckExistenceEmployeur.Input }
     *     
     */
    public void setInput(CmCheckExistenceEmployeur.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propriété output.
     * 
     * @return
     *     possible object is
     *     {@link CmCheckExistenceEmployeur.Output }
     *     
     */
    public CmCheckExistenceEmployeur.Output getOutput() {
        return output;
    }

    /**
     * Définit la valeur de la propriété output.
     * 
     * @param value
     *     allowed object is
     *     {@link CmCheckExistenceEmployeur.Output }
     *     
     */
    public void setOutput(CmCheckExistenceEmployeur.Output value) {
        this.output = value;
    }

    /**
     * Obtient la valeur de la propriété dateTimeTagFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeTagFormat() {
        if (dateTimeTagFormat == null) {
            return "xsd:strict";
        } else {
            return dateTimeTagFormat;
        }
    }

    /**
     * Définit la valeur de la propriété dateTimeTagFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeTagFormat(String value) {
        this.dateTimeTagFormat = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="taxpayerIdentifierType" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="8"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="taxpayerIdentifierValue" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="16"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="taxpayerName" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="254"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="checkUsingTaxpayerIDOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="fuzzySearchUsage" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="C1AP"/>
     *               &lt;enumeration value="C1NA"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxpayerIdentifierType",
        "taxpayerIdentifierValue",
        "taxpayerName",
        "checkUsingTaxpayerIDOnly",
        "fuzzySearchUsage"
    })
    public static class Input {

        @XmlElement(namespace = "http://oracle.com/CmCheckExistenceEmployeur.xsd")
        protected String taxpayerIdentifierType;
        @XmlElement(namespace = "http://oracle.com/CmCheckExistenceEmployeur.xsd")
        protected String taxpayerIdentifierValue;
        @XmlElement(namespace = "http://oracle.com/CmCheckExistenceEmployeur.xsd")
        protected String taxpayerName;
        @XmlElementRef(name = "checkUsingTaxpayerIDOnly", namespace = "http://oracle.com/CmCheckExistenceEmployeur.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> checkUsingTaxpayerIDOnly;
        @XmlElement(namespace = "http://oracle.com/CmCheckExistenceEmployeur.xsd")
        protected String fuzzySearchUsage;

        /**
         * Obtient la valeur de la propriété taxpayerIdentifierType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxpayerIdentifierType() {
            return taxpayerIdentifierType;
        }

        /**
         * Définit la valeur de la propriété taxpayerIdentifierType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxpayerIdentifierType(String value) {
            this.taxpayerIdentifierType = value;
        }

        /**
         * Obtient la valeur de la propriété taxpayerIdentifierValue.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxpayerIdentifierValue() {
            return taxpayerIdentifierValue;
        }

        /**
         * Définit la valeur de la propriété taxpayerIdentifierValue.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxpayerIdentifierValue(String value) {
            this.taxpayerIdentifierValue = value;
        }

        /**
         * Obtient la valeur de la propriété taxpayerName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxpayerName() {
            return taxpayerName;
        }

        /**
         * Définit la valeur de la propriété taxpayerName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxpayerName(String value) {
            this.taxpayerName = value;
        }

        /**
         * Obtient la valeur de la propriété checkUsingTaxpayerIDOnly.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getCheckUsingTaxpayerIDOnly() {
            return checkUsingTaxpayerIDOnly;
        }

        /**
         * Définit la valeur de la propriété checkUsingTaxpayerIDOnly.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setCheckUsingTaxpayerIDOnly(JAXBElement<Boolean> value) {
            this.checkUsingTaxpayerIDOnly = value;
        }

        /**
         * Obtient la valeur de la propriété fuzzySearchUsage.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFuzzySearchUsage() {
            return fuzzySearchUsage;
        }

        /**
         * Définit la valeur de la propriété fuzzySearchUsage.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFuzzySearchUsage(String value) {
            this.fuzzySearchUsage = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="isTaxpayerIdentifierExist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="isTaxpayerNameExist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="personId" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "isTaxpayerIdentifierExist",
        "isTaxpayerNameExist",
        "personId"
    })
    public static class Output {

        @XmlElementRef(name = "isTaxpayerIdentifierExist", namespace = "http://oracle.com/CmCheckExistenceEmployeur.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> isTaxpayerIdentifierExist;
        @XmlElementRef(name = "isTaxpayerNameExist", namespace = "http://oracle.com/CmCheckExistenceEmployeur.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> isTaxpayerNameExist;
        @XmlElement(namespace = "http://oracle.com/CmCheckExistenceEmployeur.xsd")
        protected String personId;

        /**
         * Obtient la valeur de la propriété isTaxpayerIdentifierExist.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getIsTaxpayerIdentifierExist() {
            return isTaxpayerIdentifierExist;
        }

        /**
         * Définit la valeur de la propriété isTaxpayerIdentifierExist.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setIsTaxpayerIdentifierExist(JAXBElement<Boolean> value) {
            this.isTaxpayerIdentifierExist = value;
        }

        /**
         * Obtient la valeur de la propriété isTaxpayerNameExist.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getIsTaxpayerNameExist() {
            return isTaxpayerNameExist;
        }

        /**
         * Définit la valeur de la propriété isTaxpayerNameExist.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setIsTaxpayerNameExist(JAXBElement<Boolean> value) {
            this.isTaxpayerNameExist = value;
        }

        /**
         * Obtient la valeur de la propriété personId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPersonId() {
            return personId;
        }

        /**
         * Définit la valeur de la propriété personId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPersonId(String value) {
            this.personId = value;
        }

    }

}
