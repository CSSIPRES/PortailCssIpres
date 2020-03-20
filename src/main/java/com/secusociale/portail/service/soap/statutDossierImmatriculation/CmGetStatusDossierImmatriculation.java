
package com.secusociale.portail.service.soap.statutDossierImmatriculation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *                   &lt;element name="idDossierImmatriculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="codeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "Cm-GetStatusDossierImmatriculation")
public class CmGetStatusDossierImmatriculation {

    @XmlElement(namespace = "http://oracle.com/Cm-GetStatusDossierImmatriculation.xsd")
    protected CmGetStatusDossierImmatriculation.Input input;
    @XmlElement(namespace = "http://oracle.com/Cm-GetStatusDossierImmatriculation.xsd")
    protected CmGetStatusDossierImmatriculation.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propriété input.
     * 
     * @return
     *     possible object is
     *     {@link CmGetStatusDossierImmatriculation.Input }
     *     
     */
    public CmGetStatusDossierImmatriculation.Input getInput() {
        return input;
    }

    /**
     * Définit la valeur de la propriété input.
     * 
     * @param value
     *     allowed object is
     *     {@link CmGetStatusDossierImmatriculation.Input }
     *     
     */
    public void setInput(CmGetStatusDossierImmatriculation.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propriété output.
     * 
     * @return
     *     possible object is
     *     {@link CmGetStatusDossierImmatriculation.Output }
     *     
     */
    public CmGetStatusDossierImmatriculation.Output getOutput() {
        return output;
    }

    /**
     * Définit la valeur de la propriété output.
     * 
     * @param value
     *     allowed object is
     *     {@link CmGetStatusDossierImmatriculation.Output }
     *     
     */
    public void setOutput(CmGetStatusDossierImmatriculation.Output value) {
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
     *         &lt;element name="idDossierImmatriculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "idDossierImmatriculation"
    })
    public static class Input {

        @XmlElement(namespace = "http://oracle.com/Cm-GetStatusDossierImmatriculation.xsd")
        protected String idDossierImmatriculation;

        /**
         * Obtient la valeur de la propriété idDossierImmatriculation.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdDossierImmatriculation() {
            return idDossierImmatriculation;
        }

        /**
         * Définit la valeur de la propriété idDossierImmatriculation.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdDossierImmatriculation(String value) {
            this.idDossierImmatriculation = value;
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
     *         &lt;element name="codeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "codeStatus",
        "description"
    })
    public static class Output {

        @XmlElement(namespace = "http://oracle.com/Cm-GetStatusDossierImmatriculation.xsd")
        protected String codeStatus;
        @XmlElement(namespace = "http://oracle.com/Cm-GetStatusDossierImmatriculation.xsd")
        protected String description;

        /**
         * Obtient la valeur de la propriété codeStatus.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeStatus() {
            return codeStatus;
        }

        /**
         * Définit la valeur de la propriété codeStatus.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeStatus(String value) {
            this.codeStatus = value;
        }

        /**
         * Obtient la valeur de la propriété description.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Définit la valeur de la propriété description.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

    }

}
