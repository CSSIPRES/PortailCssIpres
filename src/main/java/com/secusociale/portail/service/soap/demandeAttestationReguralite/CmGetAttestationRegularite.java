
package com.secusociale.portail.service.soap.demandeAttestationReguralite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
 *                   &lt;element name="typeIdentifiant">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="CDAO"/>
 *                         &lt;enumeration value="TRN"/>
 *                         &lt;enumeration value="NIN"/>
 *                         &lt;enumeration value="PASS"/>
 *                         &lt;enumeration value="PIN"/>
 *                         &lt;enumeration value="ANC"/>
 *                         &lt;enumeration value="SCI"/>
 *                         &lt;enumeration value="ANI"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="numeroIdentifiant">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
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
 *                   &lt;element name="idDossier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "CmGetAttestationRegularite")
public class CmGetAttestationRegularite {

    @XmlElement(namespace = "http://oracle.com/CmGetAttestationRegularite.xsd")
    protected CmGetAttestationRegularite.Input input;
    @XmlElement(namespace = "http://oracle.com/CmGetAttestationRegularite.xsd")
    protected CmGetAttestationRegularite.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link CmGetAttestationRegularite.Input }
     *     
     */
    public CmGetAttestationRegularite.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link CmGetAttestationRegularite.Input }
     *     
     */
    public void setInput(CmGetAttestationRegularite.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propri�t� output.
     * 
     * @return
     *     possible object is
     *     {@link CmGetAttestationRegularite.Output }
     *     
     */
    public CmGetAttestationRegularite.Output getOutput() {
        return output;
    }

    /**
     * D�finit la valeur de la propri�t� output.
     * 
     * @param value
     *     allowed object is
     *     {@link CmGetAttestationRegularite.Output }
     *     
     */
    public void setOutput(CmGetAttestationRegularite.Output value) {
        this.output = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateTimeTagFormat.
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
     * D�finit la valeur de la propri�t� dateTimeTagFormat.
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
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="typeIdentifiant">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="CDAO"/>
     *               &lt;enumeration value="TRN"/>
     *               &lt;enumeration value="NIN"/>
     *               &lt;enumeration value="PASS"/>
     *               &lt;enumeration value="PIN"/>
     *               &lt;enumeration value="ANC"/>
     *               &lt;enumeration value="SCI"/>
     *               &lt;enumeration value="ANI"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="numeroIdentifiant">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
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
        "typeIdentifiant",
        "numeroIdentifiant"
    })
    public static class Input {

        @XmlElement(namespace = "http://oracle.com/CmGetAttestationRegularite.xsd", required = true)
        protected String typeIdentifiant;
        @XmlElement(namespace = "http://oracle.com/CmGetAttestationRegularite.xsd", required = true)
        protected String numeroIdentifiant;

        /**
         * Obtient la valeur de la propri�t� typeIdentifiant.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeIdentifiant() {
            return typeIdentifiant;
        }

        /**
         * D�finit la valeur de la propri�t� typeIdentifiant.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeIdentifiant(String value) {
            this.typeIdentifiant = value;
        }

        /**
         * Obtient la valeur de la propri�t� numeroIdentifiant.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroIdentifiant() {
            return numeroIdentifiant;
        }

        /**
         * D�finit la valeur de la propri�t� numeroIdentifiant.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroIdentifiant(String value) {
            this.numeroIdentifiant = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="idDossier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "idDossier"
    })
    public static class Output {

        @XmlElement(namespace = "http://oracle.com/CmGetAttestationRegularite.xsd")
        protected String idDossier;

        /**
         * Obtient la valeur de la propri�t� idDossier.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdDossier() {
            return idDossier;
        }

        /**
         * D�finit la valeur de la propri�t� idDossier.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdDossier(String value) {
            this.idDossier = value;
        }

    }

}
