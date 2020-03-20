
package com.secusociale.portail.service.soap.certificatImmatriculation;

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
 *                   &lt;element name="idDossier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "CmGetCertificatImmatriculation")
public class CmGetCertificatImmatriculation {

    @XmlElement(namespace = "http://oracle.com/CmGetCertificatImmatriculation.xsd")
    protected CmGetCertificatImmatriculation.Input input;
    @XmlElement(namespace = "http://oracle.com/CmGetCertificatImmatriculation.xsd")
    protected CmGetCertificatImmatriculation.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propriété input.
     * 
     * @return
     *     possible object is
     *     {@link CmGetCertificatImmatriculation.Input }
     *     
     */
    public CmGetCertificatImmatriculation.Input getInput() {
        return input;
    }

    /**
     * Définit la valeur de la propriété input.
     * 
     * @param value
     *     allowed object is
     *     {@link CmGetCertificatImmatriculation.Input }
     *     
     */
    public void setInput(CmGetCertificatImmatriculation.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propriété output.
     * 
     * @return
     *     possible object is
     *     {@link CmGetCertificatImmatriculation.Output }
     *     
     */
    public CmGetCertificatImmatriculation.Output getOutput() {
        return output;
    }

    /**
     * Définit la valeur de la propriété output.
     * 
     * @param value
     *     allowed object is
     *     {@link CmGetCertificatImmatriculation.Output }
     *     
     */
    public void setOutput(CmGetCertificatImmatriculation.Output value) {
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
    public static class Input {

        @XmlElement(namespace = "http://oracle.com/CmGetCertificatImmatriculation.xsd")
        protected String idDossier;

        /**
         * Obtient la valeur de la propriété idDossier.
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
         * Définit la valeur de la propriété idDossier.
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
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "url"
    })
    public static class Output {

        @XmlElement(namespace = "http://oracle.com/CmGetCertificatImmatriculation.xsd")
        protected String url;

        /**
         * Obtient la valeur de la propriété url.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Définit la valeur de la propriété url.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

    }

}
