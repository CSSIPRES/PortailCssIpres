
package com.secusociale.portail.service.soap.demandeImmatriculation;

import java.util.ArrayList;
import java.util.List;
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
 *                   &lt;element name="employerQuery" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="regType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="employerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="typeEtablissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="employerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="hqId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nineaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ninetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="companyOriginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="legalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="taxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="taxIdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="tradeRegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="tradeRegisterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="mainRegistrationForm" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dateOfInspection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dateOfFirstHire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="businessSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="mainLineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="atRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="noOfWorkersInGenScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="noOfWorkersInBasicScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="arondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="qartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="postboxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="zoneCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="zoneIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sectorCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sectorIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="agencyCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="agencyIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="legalRepresentativeForm" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="legalRepPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cityOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="typeOfIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="identityIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ninCedeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="issuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="arondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="qartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="landLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="documents" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="demandeEcrit" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="formDemande" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="registreCommerce" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="declarationEtablissement" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="photocopieStatus" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="decretMinisteriel" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="avisImmatriculation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="dmt" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="contratsTravail" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="cni" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="carteIdentiteConsulaire" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="etatRecensement" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="attestationChomage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="bulletinsSalaire" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="cessationActivity" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="carteNationaleIdentite" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="derniersBulletins" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="manuscriteAdressee" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="passportDoc" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="pieceIdDoc" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="pieceIdGerantDoc" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="employeList" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="rechercheEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nomEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prenomEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sexe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="etatCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dateNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numRegNaiss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nomPere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prenomPere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nomMere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prenomMere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nationalite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="typePieceIdentite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ninCedeao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numPieceIdentite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="delivreLe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LieuDelivrance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="expireLe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="villeNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="paysNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="employeurPrec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="departement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="arrondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="quartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="boitePostale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="typeMouvement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="natureContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dateDebutContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dateFinContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="emploi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nonCadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ouiCadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="conventionApplicable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="salaireContractuel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="tempsTravail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="categorie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
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
 *                   &lt;element name="employerRegistrationFormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employeeRegistrationFormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="processFlowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="zoneCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="zoneIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sectorCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sectorIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="agenceCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="agenceIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tauxAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "IMMATRICULATION_INBOUND")
public class IMMATRICULATIONINBOUND {

    protected IMMATRICULATIONINBOUND.Input input;
    protected IMMATRICULATIONINBOUND.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link IMMATRICULATIONINBOUND.Input }
     *     
     */
    public IMMATRICULATIONINBOUND.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link IMMATRICULATIONINBOUND.Input }
     *     
     */
    public void setInput(IMMATRICULATIONINBOUND.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propri�t� output.
     * 
     * @return
     *     possible object is
     *     {@link IMMATRICULATIONINBOUND.Output }
     *     
     */
    public IMMATRICULATIONINBOUND.Output getOutput() {
        return output;
    }

    /**
     * D�finit la valeur de la propri�t� output.
     * 
     * @param value
     *     allowed object is
     *     {@link IMMATRICULATIONINBOUND.Output }
     *     
     */
    public void setOutput(IMMATRICULATIONINBOUND.Output value) {
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
     *         &lt;element name="employerQuery" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="regType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="employerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="typeEtablissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="employerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="hqId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nineaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ninetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="companyOriginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="legalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="taxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="taxIdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="tradeRegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="tradeRegisterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="mainRegistrationForm" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dateOfInspection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dateOfFirstHire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="businessSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="mainLineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="atRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="noOfWorkersInGenScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="noOfWorkersInBasicScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="arondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="qartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="postboxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="zoneCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="zoneIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sectorCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sectorIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="agencyCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="agencyIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="legalRepresentativeForm" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="legalRepPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cityOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="typeOfIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="identityIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ninCedeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="issuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="arondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="qartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="landLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="documents" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="demandeEcrit" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="formDemande" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="registreCommerce" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="declarationEtablissement" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="photocopieStatus" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="decretMinisteriel" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="avisImmatriculation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="dmt" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="contratsTravail" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="cni" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="carteIdentiteConsulaire" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="etatRecensement" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="attestationChomage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="bulletinsSalaire" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="cessationActivity" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="carteNationaleIdentite" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="derniersBulletins" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="manuscriteAdressee" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="passportDoc" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="pieceIdDoc" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="pieceIdGerantDoc" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="employeList" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="rechercheEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nomEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prenomEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sexe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="etatCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dateNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numRegNaiss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nomPere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prenomPere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nomMere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prenomMere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nationalite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="typePieceIdentite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ninCedeao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numPieceIdentite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="delivreLe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LieuDelivrance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="expireLe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="villeNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="paysNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="employeurPrec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="departement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="arrondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="quartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="boitePostale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="typeMouvement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="natureContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dateDebutContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dateFinContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="emploi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nonCadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ouiCadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="conventionApplicable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="salaireContractuel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="tempsTravail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="categorie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "employerQuery",
        "mainRegistrationForm",
        "legalRepresentativeForm",
        "documents",
        "employeList"
    })
    public static class Input {

        protected IMMATRICULATIONINBOUND.Input.EmployerQuery employerQuery;
        protected IMMATRICULATIONINBOUND.Input.MainRegistrationForm mainRegistrationForm;
        protected IMMATRICULATIONINBOUND.Input.LegalRepresentativeForm legalRepresentativeForm;
        protected IMMATRICULATIONINBOUND.Input.Documents documents;
        protected List<IMMATRICULATIONINBOUND.Input.EmployeList> employeList;

        /**
         * Obtient la valeur de la propri�t� employerQuery.
         * 
         * @return
         *     possible object is
         *     {@link IMMATRICULATIONINBOUND.Input.EmployerQuery }
         *     
         */
        public IMMATRICULATIONINBOUND.Input.EmployerQuery getEmployerQuery() {
            return employerQuery;
        }

        /**
         * D�finit la valeur de la propri�t� employerQuery.
         * 
         * @param value
         *     allowed object is
         *     {@link IMMATRICULATIONINBOUND.Input.EmployerQuery }
         *     
         */
        public void setEmployerQuery(IMMATRICULATIONINBOUND.Input.EmployerQuery value) {
            this.employerQuery = value;
        }

        /**
         * Obtient la valeur de la propri�t� mainRegistrationForm.
         * 
         * @return
         *     possible object is
         *     {@link IMMATRICULATIONINBOUND.Input.MainRegistrationForm }
         *     
         */
        public IMMATRICULATIONINBOUND.Input.MainRegistrationForm getMainRegistrationForm() {
            return mainRegistrationForm;
        }

        /**
         * D�finit la valeur de la propri�t� mainRegistrationForm.
         * 
         * @param value
         *     allowed object is
         *     {@link IMMATRICULATIONINBOUND.Input.MainRegistrationForm }
         *     
         */
        public void setMainRegistrationForm(IMMATRICULATIONINBOUND.Input.MainRegistrationForm value) {
            this.mainRegistrationForm = value;
        }

        /**
         * Obtient la valeur de la propri�t� legalRepresentativeForm.
         * 
         * @return
         *     possible object is
         *     {@link IMMATRICULATIONINBOUND.Input.LegalRepresentativeForm }
         *     
         */
        public IMMATRICULATIONINBOUND.Input.LegalRepresentativeForm getLegalRepresentativeForm() {
            return legalRepresentativeForm;
        }

        /**
         * D�finit la valeur de la propri�t� legalRepresentativeForm.
         * 
         * @param value
         *     allowed object is
         *     {@link IMMATRICULATIONINBOUND.Input.LegalRepresentativeForm }
         *     
         */
        public void setLegalRepresentativeForm(IMMATRICULATIONINBOUND.Input.LegalRepresentativeForm value) {
            this.legalRepresentativeForm = value;
        }

        /**
         * Obtient la valeur de la propri�t� documents.
         * 
         * @return
         *     possible object is
         *     {@link IMMATRICULATIONINBOUND.Input.Documents }
         *     
         */
        public IMMATRICULATIONINBOUND.Input.Documents getDocuments() {
            return documents;
        }

        /**
         * D�finit la valeur de la propri�t� documents.
         * 
         * @param value
         *     allowed object is
         *     {@link IMMATRICULATIONINBOUND.Input.Documents }
         *     
         */
        public void setDocuments(IMMATRICULATIONINBOUND.Input.Documents value) {
            this.documents = value;
        }

        /**
         * Gets the value of the employeList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employeList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmployeList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IMMATRICULATIONINBOUND.Input.EmployeList }
         * 
         * 
         */
        public List<IMMATRICULATIONINBOUND.Input.EmployeList> getEmployeList() {
            if (employeList == null) {
                employeList = new ArrayList<IMMATRICULATIONINBOUND.Input.EmployeList>();
            }
            return this.employeList;
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
         *         &lt;element name="demandeEcrit" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="formDemande" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="registreCommerce" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="declarationEtablissement" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="photocopieStatus" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="decretMinisteriel" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="avisImmatriculation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="dmt" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="contratsTravail" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="cni" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="carteIdentiteConsulaire" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="etatRecensement" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="attestationChomage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="bulletinsSalaire" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="cessationActivity" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="carteNationaleIdentite" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="derniersBulletins" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="manuscriteAdressee" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="passportDoc" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="pieceIdDoc" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="pieceIdGerantDoc" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
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
            "demandeEcrit",
            "formDemande",
            "registreCommerce",
            "declarationEtablissement",
            "photocopieStatus",
            "decretMinisteriel",
            "avisImmatriculation",
            "dmt",
            "contratsTravail",
            "cni",
            "carteIdentiteConsulaire",
            "etatRecensement",
            "attestationChomage",
            "bulletinsSalaire",
            "cessationActivity",
            "carteNationaleIdentite",
            "derniersBulletins",
            "manuscriteAdressee",
            "passportDoc",
            "pieceIdDoc",
            "pieceIdGerantDoc"
        })
        public static class Documents {

            protected IMMATRICULATIONINBOUND.Input.Documents.DemandeEcrit demandeEcrit;
            protected IMMATRICULATIONINBOUND.Input.Documents.FormDemande formDemande;
            protected IMMATRICULATIONINBOUND.Input.Documents.RegistreCommerce registreCommerce;
            protected IMMATRICULATIONINBOUND.Input.Documents.DeclarationEtablissement declarationEtablissement;
            protected IMMATRICULATIONINBOUND.Input.Documents.PhotocopieStatus photocopieStatus;
            protected IMMATRICULATIONINBOUND.Input.Documents.DecretMinisteriel decretMinisteriel;
            protected IMMATRICULATIONINBOUND.Input.Documents.AvisImmatriculation avisImmatriculation;
            protected IMMATRICULATIONINBOUND.Input.Documents.Dmt dmt;
            protected IMMATRICULATIONINBOUND.Input.Documents.ContratsTravail contratsTravail;
            protected IMMATRICULATIONINBOUND.Input.Documents.Cni cni;
            protected IMMATRICULATIONINBOUND.Input.Documents.CarteIdentiteConsulaire carteIdentiteConsulaire;
            protected IMMATRICULATIONINBOUND.Input.Documents.EtatRecensement etatRecensement;
            protected IMMATRICULATIONINBOUND.Input.Documents.AttestationChomage attestationChomage;
            protected IMMATRICULATIONINBOUND.Input.Documents.BulletinsSalaire bulletinsSalaire;
            protected IMMATRICULATIONINBOUND.Input.Documents.CessationActivity cessationActivity;
            protected IMMATRICULATIONINBOUND.Input.Documents.CarteNationaleIdentite carteNationaleIdentite;
            protected IMMATRICULATIONINBOUND.Input.Documents.DerniersBulletins derniersBulletins;
            protected IMMATRICULATIONINBOUND.Input.Documents.ManuscriteAdressee manuscriteAdressee;
            protected IMMATRICULATIONINBOUND.Input.Documents.PassportDoc passportDoc;
            protected IMMATRICULATIONINBOUND.Input.Documents.PieceIdDoc pieceIdDoc;
            protected IMMATRICULATIONINBOUND.Input.Documents.PieceIdGerantDoc pieceIdGerantDoc;

            /**
             * Obtient la valeur de la propri�t� demandeEcrit.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.DemandeEcrit }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.DemandeEcrit getDemandeEcrit() {
                return demandeEcrit;
            }

            /**
             * D�finit la valeur de la propri�t� demandeEcrit.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.DemandeEcrit }
             *     
             */
            public void setDemandeEcrit(IMMATRICULATIONINBOUND.Input.Documents.DemandeEcrit value) {
                this.demandeEcrit = value;
            }

            /**
             * Obtient la valeur de la propri�t� formDemande.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.FormDemande }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.FormDemande getFormDemande() {
                return formDemande;
            }

            /**
             * D�finit la valeur de la propri�t� formDemande.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.FormDemande }
             *     
             */
            public void setFormDemande(IMMATRICULATIONINBOUND.Input.Documents.FormDemande value) {
                this.formDemande = value;
            }

            /**
             * Obtient la valeur de la propri�t� registreCommerce.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.RegistreCommerce }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.RegistreCommerce getRegistreCommerce() {
                return registreCommerce;
            }

            /**
             * D�finit la valeur de la propri�t� registreCommerce.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.RegistreCommerce }
             *     
             */
            public void setRegistreCommerce(IMMATRICULATIONINBOUND.Input.Documents.RegistreCommerce value) {
                this.registreCommerce = value;
            }

            /**
             * Obtient la valeur de la propri�t� declarationEtablissement.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.DeclarationEtablissement }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.DeclarationEtablissement getDeclarationEtablissement() {
                return declarationEtablissement;
            }

            /**
             * D�finit la valeur de la propri�t� declarationEtablissement.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.DeclarationEtablissement }
             *     
             */
            public void setDeclarationEtablissement(IMMATRICULATIONINBOUND.Input.Documents.DeclarationEtablissement value) {
                this.declarationEtablissement = value;
            }

            /**
             * Obtient la valeur de la propri�t� photocopieStatus.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.PhotocopieStatus }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.PhotocopieStatus getPhotocopieStatus() {
                return photocopieStatus;
            }

            /**
             * D�finit la valeur de la propri�t� photocopieStatus.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.PhotocopieStatus }
             *     
             */
            public void setPhotocopieStatus(IMMATRICULATIONINBOUND.Input.Documents.PhotocopieStatus value) {
                this.photocopieStatus = value;
            }

            /**
             * Obtient la valeur de la propri�t� decretMinisteriel.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.DecretMinisteriel }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.DecretMinisteriel getDecretMinisteriel() {
                return decretMinisteriel;
            }

            /**
             * D�finit la valeur de la propri�t� decretMinisteriel.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.DecretMinisteriel }
             *     
             */
            public void setDecretMinisteriel(IMMATRICULATIONINBOUND.Input.Documents.DecretMinisteriel value) {
                this.decretMinisteriel = value;
            }

            /**
             * Obtient la valeur de la propri�t� avisImmatriculation.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.AvisImmatriculation }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.AvisImmatriculation getAvisImmatriculation() {
                return avisImmatriculation;
            }

            /**
             * D�finit la valeur de la propri�t� avisImmatriculation.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.AvisImmatriculation }
             *     
             */
            public void setAvisImmatriculation(IMMATRICULATIONINBOUND.Input.Documents.AvisImmatriculation value) {
                this.avisImmatriculation = value;
            }

            /**
             * Obtient la valeur de la propri�t� dmt.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.Dmt }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.Dmt getDmt() {
                return dmt;
            }

            /**
             * D�finit la valeur de la propri�t� dmt.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.Dmt }
             *     
             */
            public void setDmt(IMMATRICULATIONINBOUND.Input.Documents.Dmt value) {
                this.dmt = value;
            }

            /**
             * Obtient la valeur de la propri�t� contratsTravail.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.ContratsTravail }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.ContratsTravail getContratsTravail() {
                return contratsTravail;
            }

            /**
             * D�finit la valeur de la propri�t� contratsTravail.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.ContratsTravail }
             *     
             */
            public void setContratsTravail(IMMATRICULATIONINBOUND.Input.Documents.ContratsTravail value) {
                this.contratsTravail = value;
            }

            /**
             * Obtient la valeur de la propri�t� cni.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.Cni }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.Cni getCni() {
                return cni;
            }

            /**
             * D�finit la valeur de la propri�t� cni.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.Cni }
             *     
             */
            public void setCni(IMMATRICULATIONINBOUND.Input.Documents.Cni value) {
                this.cni = value;
            }

            /**
             * Obtient la valeur de la propri�t� carteIdentiteConsulaire.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.CarteIdentiteConsulaire }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.CarteIdentiteConsulaire getCarteIdentiteConsulaire() {
                return carteIdentiteConsulaire;
            }

            /**
             * D�finit la valeur de la propri�t� carteIdentiteConsulaire.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.CarteIdentiteConsulaire }
             *     
             */
            public void setCarteIdentiteConsulaire(IMMATRICULATIONINBOUND.Input.Documents.CarteIdentiteConsulaire value) {
                this.carteIdentiteConsulaire = value;
            }

            /**
             * Obtient la valeur de la propri�t� etatRecensement.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.EtatRecensement }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.EtatRecensement getEtatRecensement() {
                return etatRecensement;
            }

            /**
             * D�finit la valeur de la propri�t� etatRecensement.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.EtatRecensement }
             *     
             */
            public void setEtatRecensement(IMMATRICULATIONINBOUND.Input.Documents.EtatRecensement value) {
                this.etatRecensement = value;
            }

            /**
             * Obtient la valeur de la propri�t� attestationChomage.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.AttestationChomage }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.AttestationChomage getAttestationChomage() {
                return attestationChomage;
            }

            /**
             * D�finit la valeur de la propri�t� attestationChomage.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.AttestationChomage }
             *     
             */
            public void setAttestationChomage(IMMATRICULATIONINBOUND.Input.Documents.AttestationChomage value) {
                this.attestationChomage = value;
            }

            /**
             * Obtient la valeur de la propri�t� bulletinsSalaire.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.BulletinsSalaire }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.BulletinsSalaire getBulletinsSalaire() {
                return bulletinsSalaire;
            }

            /**
             * D�finit la valeur de la propri�t� bulletinsSalaire.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.BulletinsSalaire }
             *     
             */
            public void setBulletinsSalaire(IMMATRICULATIONINBOUND.Input.Documents.BulletinsSalaire value) {
                this.bulletinsSalaire = value;
            }

            /**
             * Obtient la valeur de la propri�t� cessationActivity.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.CessationActivity }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.CessationActivity getCessationActivity() {
                return cessationActivity;
            }

            /**
             * D�finit la valeur de la propri�t� cessationActivity.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.CessationActivity }
             *     
             */
            public void setCessationActivity(IMMATRICULATIONINBOUND.Input.Documents.CessationActivity value) {
                this.cessationActivity = value;
            }

            /**
             * Obtient la valeur de la propri�t� carteNationaleIdentite.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.CarteNationaleIdentite }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.CarteNationaleIdentite getCarteNationaleIdentite() {
                return carteNationaleIdentite;
            }

            /**
             * D�finit la valeur de la propri�t� carteNationaleIdentite.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.CarteNationaleIdentite }
             *     
             */
            public void setCarteNationaleIdentite(IMMATRICULATIONINBOUND.Input.Documents.CarteNationaleIdentite value) {
                this.carteNationaleIdentite = value;
            }

            /**
             * Obtient la valeur de la propri�t� derniersBulletins.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.DerniersBulletins }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.DerniersBulletins getDerniersBulletins() {
                return derniersBulletins;
            }

            /**
             * D�finit la valeur de la propri�t� derniersBulletins.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.DerniersBulletins }
             *     
             */
            public void setDerniersBulletins(IMMATRICULATIONINBOUND.Input.Documents.DerniersBulletins value) {
                this.derniersBulletins = value;
            }

            /**
             * Obtient la valeur de la propri�t� manuscriteAdressee.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.ManuscriteAdressee }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.ManuscriteAdressee getManuscriteAdressee() {
                return manuscriteAdressee;
            }

            /**
             * D�finit la valeur de la propri�t� manuscriteAdressee.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.ManuscriteAdressee }
             *     
             */
            public void setManuscriteAdressee(IMMATRICULATIONINBOUND.Input.Documents.ManuscriteAdressee value) {
                this.manuscriteAdressee = value;
            }

            /**
             * Obtient la valeur de la propri�t� passportDoc.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.PassportDoc }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.PassportDoc getPassportDoc() {
                return passportDoc;
            }

            /**
             * D�finit la valeur de la propri�t� passportDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.PassportDoc }
             *     
             */
            public void setPassportDoc(IMMATRICULATIONINBOUND.Input.Documents.PassportDoc value) {
                this.passportDoc = value;
            }

            /**
             * Obtient la valeur de la propri�t� pieceIdDoc.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.PieceIdDoc }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.PieceIdDoc getPieceIdDoc() {
                return pieceIdDoc;
            }

            /**
             * D�finit la valeur de la propri�t� pieceIdDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.PieceIdDoc }
             *     
             */
            public void setPieceIdDoc(IMMATRICULATIONINBOUND.Input.Documents.PieceIdDoc value) {
                this.pieceIdDoc = value;
            }

            /**
             * Obtient la valeur de la propri�t� pieceIdGerantDoc.
             * 
             * @return
             *     possible object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.PieceIdGerantDoc }
             *     
             */
            public IMMATRICULATIONINBOUND.Input.Documents.PieceIdGerantDoc getPieceIdGerantDoc() {
                return pieceIdGerantDoc;
            }

            /**
             * D�finit la valeur de la propri�t� pieceIdGerantDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMATRICULATIONINBOUND.Input.Documents.PieceIdGerantDoc }
             *     
             */
            public void setPieceIdGerantDoc(IMMATRICULATIONINBOUND.Input.Documents.PieceIdGerantDoc value) {
                this.pieceIdGerantDoc = value;
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class AttestationChomage {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class AvisImmatriculation {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class BulletinsSalaire {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class CarteIdentiteConsulaire {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class CarteNationaleIdentite {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class CessationActivity {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class Cni {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class ContratsTravail {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class DeclarationEtablissement {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class DecretMinisteriel {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class DemandeEcrit {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class DerniersBulletins {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class Dmt {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class EtatRecensement {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class FormDemande {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class ManuscriteAdressee {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class PassportDoc {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class PhotocopieStatus {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class PieceIdDoc {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class PieceIdGerantDoc {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class RegistreCommerce {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMATRICULATION_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

                /**
                 * Obtient la valeur de la propri�t� url.
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
                 * D�finit la valeur de la propri�t� url.
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
         *         &lt;element name="rechercheEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nomEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prenomEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sexe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="etatCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dateNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numRegNaiss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nomPere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prenomPere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nomMere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prenomMere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nationalite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="typePieceIdentite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ninCedeao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numPieceIdentite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="delivreLe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LieuDelivrance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="expireLe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="villeNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="paysNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="employeurPrec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="departement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="arrondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="quartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="boitePostale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="typeMouvement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="natureContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dateDebutContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dateFinContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="emploi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nonCadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ouiCadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="conventionApplicable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="salaireContractuel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="tempsTravail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="categorie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "rechercheEmploye",
            "nomEmploye",
            "prenomEmploye",
            "sexe",
            "etatCivil",
            "dateNaissance",
            "numRegNaiss",
            "nomPere",
            "prenomPere",
            "nomMere",
            "prenomMere",
            "nationalite",
            "typePieceIdentite",
            "nin",
            "ninCedeao",
            "numPieceIdentite",
            "delivreLe",
            "lieuDelivrance",
            "expireLe",
            "villeNaissance",
            "paysNaissance",
            "employeurPrec",
            "pays",
            "region",
            "departement",
            "arrondissement",
            "commune",
            "quartier",
            "adresse",
            "boitePostale",
            "typeMouvement",
            "natureContrat",
            "dateDebutContrat",
            "dateFinContrat",
            "profession",
            "emploi",
            "nonCadre",
            "ouiCadre",
            "conventionApplicable",
            "salaireContractuel",
            "tempsTravail",
            "categorie"
        })
        public static class EmployeList {

            protected String rechercheEmploye;
            protected String nomEmploye;
            protected String prenomEmploye;
            protected String sexe;
            protected String etatCivil;
            protected String dateNaissance;
            protected String numRegNaiss;
            protected String nomPere;
            protected String prenomPere;
            protected String nomMere;
            protected String prenomMere;
            protected String nationalite;
            protected String typePieceIdentite;
            protected String nin;
            protected String ninCedeao;
            protected String numPieceIdentite;
            protected String delivreLe;
            @XmlElement(name = "LieuDelivrance")
            protected String lieuDelivrance;
            protected String expireLe;
            protected String villeNaissance;
            protected String paysNaissance;
            protected String employeurPrec;
            protected String pays;
            protected String region;
            protected String departement;
            protected String arrondissement;
            protected String commune;
            protected String quartier;
            protected String adresse;
            protected String boitePostale;
            protected String typeMouvement;
            protected String natureContrat;
            protected String dateDebutContrat;
            protected String dateFinContrat;
            protected String profession;
            protected String emploi;
            protected String nonCadre;
            protected String ouiCadre;
            protected String conventionApplicable;
            protected String salaireContractuel;
            protected String tempsTravail;
            protected String categorie;

            /**
             * Obtient la valeur de la propri�t� rechercheEmploye.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRechercheEmploye() {
                return rechercheEmploye;
            }

            /**
             * D�finit la valeur de la propri�t� rechercheEmploye.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRechercheEmploye(String value) {
                this.rechercheEmploye = value;
            }

            /**
             * Obtient la valeur de la propri�t� nomEmploye.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNomEmploye() {
                return nomEmploye;
            }

            /**
             * D�finit la valeur de la propri�t� nomEmploye.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNomEmploye(String value) {
                this.nomEmploye = value;
            }

            /**
             * Obtient la valeur de la propri�t� prenomEmploye.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrenomEmploye() {
                return prenomEmploye;
            }

            /**
             * D�finit la valeur de la propri�t� prenomEmploye.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrenomEmploye(String value) {
                this.prenomEmploye = value;
            }

            /**
             * Obtient la valeur de la propri�t� sexe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSexe() {
                return sexe;
            }

            /**
             * D�finit la valeur de la propri�t� sexe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSexe(String value) {
                this.sexe = value;
            }

            /**
             * Obtient la valeur de la propri�t� etatCivil.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEtatCivil() {
                return etatCivil;
            }

            /**
             * D�finit la valeur de la propri�t� etatCivil.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEtatCivil(String value) {
                this.etatCivil = value;
            }

            /**
             * Obtient la valeur de la propri�t� dateNaissance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateNaissance() {
                return dateNaissance;
            }

            /**
             * D�finit la valeur de la propri�t� dateNaissance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateNaissance(String value) {
                this.dateNaissance = value;
            }

            /**
             * Obtient la valeur de la propri�t� numRegNaiss.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumRegNaiss() {
                return numRegNaiss;
            }

            /**
             * D�finit la valeur de la propri�t� numRegNaiss.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumRegNaiss(String value) {
                this.numRegNaiss = value;
            }

            /**
             * Obtient la valeur de la propri�t� nomPere.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNomPere() {
                return nomPere;
            }

            /**
             * D�finit la valeur de la propri�t� nomPere.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNomPere(String value) {
                this.nomPere = value;
            }

            /**
             * Obtient la valeur de la propri�t� prenomPere.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrenomPere() {
                return prenomPere;
            }

            /**
             * D�finit la valeur de la propri�t� prenomPere.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrenomPere(String value) {
                this.prenomPere = value;
            }

            /**
             * Obtient la valeur de la propri�t� nomMere.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNomMere() {
                return nomMere;
            }

            /**
             * D�finit la valeur de la propri�t� nomMere.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNomMere(String value) {
                this.nomMere = value;
            }

            /**
             * Obtient la valeur de la propri�t� prenomMere.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrenomMere() {
                return prenomMere;
            }

            /**
             * D�finit la valeur de la propri�t� prenomMere.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrenomMere(String value) {
                this.prenomMere = value;
            }

            /**
             * Obtient la valeur de la propri�t� nationalite.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNationalite() {
                return nationalite;
            }

            /**
             * D�finit la valeur de la propri�t� nationalite.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNationalite(String value) {
                this.nationalite = value;
            }

            /**
             * Obtient la valeur de la propri�t� typePieceIdentite.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypePieceIdentite() {
                return typePieceIdentite;
            }

            /**
             * D�finit la valeur de la propri�t� typePieceIdentite.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypePieceIdentite(String value) {
                this.typePieceIdentite = value;
            }

            /**
             * Obtient la valeur de la propri�t� nin.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNin() {
                return nin;
            }

            /**
             * D�finit la valeur de la propri�t� nin.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNin(String value) {
                this.nin = value;
            }

            /**
             * Obtient la valeur de la propri�t� ninCedeao.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNinCedeao() {
                return ninCedeao;
            }

            /**
             * D�finit la valeur de la propri�t� ninCedeao.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNinCedeao(String value) {
                this.ninCedeao = value;
            }

            /**
             * Obtient la valeur de la propri�t� numPieceIdentite.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPieceIdentite() {
                return numPieceIdentite;
            }

            /**
             * D�finit la valeur de la propri�t� numPieceIdentite.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPieceIdentite(String value) {
                this.numPieceIdentite = value;
            }

            /**
             * Obtient la valeur de la propri�t� delivreLe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDelivreLe() {
                return delivreLe;
            }

            /**
             * D�finit la valeur de la propri�t� delivreLe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDelivreLe(String value) {
                this.delivreLe = value;
            }

            /**
             * Obtient la valeur de la propri�t� lieuDelivrance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLieuDelivrance() {
                return lieuDelivrance;
            }

            /**
             * D�finit la valeur de la propri�t� lieuDelivrance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLieuDelivrance(String value) {
                this.lieuDelivrance = value;
            }

            /**
             * Obtient la valeur de la propri�t� expireLe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpireLe() {
                return expireLe;
            }

            /**
             * D�finit la valeur de la propri�t� expireLe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpireLe(String value) {
                this.expireLe = value;
            }

            /**
             * Obtient la valeur de la propri�t� villeNaissance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVilleNaissance() {
                return villeNaissance;
            }

            /**
             * D�finit la valeur de la propri�t� villeNaissance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVilleNaissance(String value) {
                this.villeNaissance = value;
            }

            /**
             * Obtient la valeur de la propri�t� paysNaissance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaysNaissance() {
                return paysNaissance;
            }

            /**
             * D�finit la valeur de la propri�t� paysNaissance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaysNaissance(String value) {
                this.paysNaissance = value;
            }

            /**
             * Obtient la valeur de la propri�t� employeurPrec.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmployeurPrec() {
                return employeurPrec;
            }

            /**
             * D�finit la valeur de la propri�t� employeurPrec.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmployeurPrec(String value) {
                this.employeurPrec = value;
            }

            /**
             * Obtient la valeur de la propri�t� pays.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPays() {
                return pays;
            }

            /**
             * D�finit la valeur de la propri�t� pays.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPays(String value) {
                this.pays = value;
            }

            /**
             * Obtient la valeur de la propri�t� region.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegion() {
                return region;
            }

            /**
             * D�finit la valeur de la propri�t� region.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegion(String value) {
                this.region = value;
            }

            /**
             * Obtient la valeur de la propri�t� departement.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartement() {
                return departement;
            }

            /**
             * D�finit la valeur de la propri�t� departement.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartement(String value) {
                this.departement = value;
            }

            /**
             * Obtient la valeur de la propri�t� arrondissement.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArrondissement() {
                return arrondissement;
            }

            /**
             * D�finit la valeur de la propri�t� arrondissement.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArrondissement(String value) {
                this.arrondissement = value;
            }

            /**
             * Obtient la valeur de la propri�t� commune.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommune() {
                return commune;
            }

            /**
             * D�finit la valeur de la propri�t� commune.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommune(String value) {
                this.commune = value;
            }

            /**
             * Obtient la valeur de la propri�t� quartier.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuartier() {
                return quartier;
            }

            /**
             * D�finit la valeur de la propri�t� quartier.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuartier(String value) {
                this.quartier = value;
            }

            /**
             * Obtient la valeur de la propri�t� adresse.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdresse() {
                return adresse;
            }

            /**
             * D�finit la valeur de la propri�t� adresse.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdresse(String value) {
                this.adresse = value;
            }

            /**
             * Obtient la valeur de la propri�t� boitePostale.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBoitePostale() {
                return boitePostale;
            }

            /**
             * D�finit la valeur de la propri�t� boitePostale.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBoitePostale(String value) {
                this.boitePostale = value;
            }

            /**
             * Obtient la valeur de la propri�t� typeMouvement.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeMouvement() {
                return typeMouvement;
            }

            /**
             * D�finit la valeur de la propri�t� typeMouvement.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeMouvement(String value) {
                this.typeMouvement = value;
            }

            /**
             * Obtient la valeur de la propri�t� natureContrat.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNatureContrat() {
                return natureContrat;
            }

            /**
             * D�finit la valeur de la propri�t� natureContrat.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNatureContrat(String value) {
                this.natureContrat = value;
            }

            /**
             * Obtient la valeur de la propri�t� dateDebutContrat.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateDebutContrat() {
                return dateDebutContrat;
            }

            /**
             * D�finit la valeur de la propri�t� dateDebutContrat.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateDebutContrat(String value) {
                this.dateDebutContrat = value;
            }

            /**
             * Obtient la valeur de la propri�t� dateFinContrat.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateFinContrat() {
                return dateFinContrat;
            }

            /**
             * D�finit la valeur de la propri�t� dateFinContrat.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateFinContrat(String value) {
                this.dateFinContrat = value;
            }

            /**
             * Obtient la valeur de la propri�t� profession.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfession() {
                return profession;
            }

            /**
             * D�finit la valeur de la propri�t� profession.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfession(String value) {
                this.profession = value;
            }

            /**
             * Obtient la valeur de la propri�t� emploi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmploi() {
                return emploi;
            }

            /**
             * D�finit la valeur de la propri�t� emploi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmploi(String value) {
                this.emploi = value;
            }

            /**
             * Obtient la valeur de la propri�t� nonCadre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNonCadre() {
                return nonCadre;
            }

            /**
             * D�finit la valeur de la propri�t� nonCadre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNonCadre(String value) {
                this.nonCadre = value;
            }

            /**
             * Obtient la valeur de la propri�t� ouiCadre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOuiCadre() {
                return ouiCadre;
            }

            /**
             * D�finit la valeur de la propri�t� ouiCadre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOuiCadre(String value) {
                this.ouiCadre = value;
            }

            /**
             * Obtient la valeur de la propri�t� conventionApplicable.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConventionApplicable() {
                return conventionApplicable;
            }

            /**
             * D�finit la valeur de la propri�t� conventionApplicable.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConventionApplicable(String value) {
                this.conventionApplicable = value;
            }

            /**
             * Obtient la valeur de la propri�t� salaireContractuel.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSalaireContractuel() {
                return salaireContractuel;
            }

            /**
             * D�finit la valeur de la propri�t� salaireContractuel.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSalaireContractuel(String value) {
                this.salaireContractuel = value;
            }

            /**
             * Obtient la valeur de la propri�t� tempsTravail.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTempsTravail() {
                return tempsTravail;
            }

            /**
             * D�finit la valeur de la propri�t� tempsTravail.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTempsTravail(String value) {
                this.tempsTravail = value;
            }

            /**
             * Obtient la valeur de la propri�t� categorie.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCategorie() {
                return categorie;
            }

            /**
             * D�finit la valeur de la propri�t� categorie.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCategorie(String value) {
                this.categorie = value;
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
         *         &lt;element name="regType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="employerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="typeEtablissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="employerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="hqId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nineaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ninetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="companyOriginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="legalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="taxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="taxIdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="tradeRegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="tradeRegisterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "regType",
            "employerType",
            "typeEtablissement",
            "employerName",
            "hqId",
            "nineaNumber",
            "ninetNumber",
            "companyOriginId",
            "legalStatus",
            "taxId",
            "taxIdDate",
            "tradeRegisterNumber",
            "tradeRegisterDate"
        })
        public static class EmployerQuery {

            protected String regType;
            protected String employerType;
            protected String typeEtablissement;
            protected String employerName;
            protected String hqId;
            protected String nineaNumber;
            protected String ninetNumber;
            protected String companyOriginId;
            protected String legalStatus;
            protected String taxId;
            protected String taxIdDate;
            protected String tradeRegisterNumber;
            protected String tradeRegisterDate;

            /**
             * Obtient la valeur de la propri�t� regType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegType() {
                return regType;
            }

            /**
             * D�finit la valeur de la propri�t� regType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegType(String value) {
                this.regType = value;
            }

            /**
             * Obtient la valeur de la propri�t� employerType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmployerType() {
                return employerType;
            }

            /**
             * D�finit la valeur de la propri�t� employerType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmployerType(String value) {
                this.employerType = value;
            }

            /**
             * Obtient la valeur de la propri�t� typeEtablissement.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeEtablissement() {
                return typeEtablissement;
            }

            /**
             * D�finit la valeur de la propri�t� typeEtablissement.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeEtablissement(String value) {
                this.typeEtablissement = value;
            }

            /**
             * Obtient la valeur de la propri�t� employerName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmployerName() {
                return employerName;
            }

            /**
             * D�finit la valeur de la propri�t� employerName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmployerName(String value) {
                this.employerName = value;
            }

            /**
             * Obtient la valeur de la propri�t� hqId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHqId() {
                return hqId;
            }

            /**
             * D�finit la valeur de la propri�t� hqId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHqId(String value) {
                this.hqId = value;
            }

            /**
             * Obtient la valeur de la propri�t� nineaNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNineaNumber() {
                return nineaNumber;
            }

            /**
             * D�finit la valeur de la propri�t� nineaNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNineaNumber(String value) {
                this.nineaNumber = value;
            }

            /**
             * Obtient la valeur de la propri�t� ninetNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNinetNumber() {
                return ninetNumber;
            }

            /**
             * D�finit la valeur de la propri�t� ninetNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNinetNumber(String value) {
                this.ninetNumber = value;
            }

            /**
             * Obtient la valeur de la propri�t� companyOriginId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompanyOriginId() {
                return companyOriginId;
            }

            /**
             * D�finit la valeur de la propri�t� companyOriginId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompanyOriginId(String value) {
                this.companyOriginId = value;
            }

            /**
             * Obtient la valeur de la propri�t� legalStatus.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLegalStatus() {
                return legalStatus;
            }

            /**
             * D�finit la valeur de la propri�t� legalStatus.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLegalStatus(String value) {
                this.legalStatus = value;
            }

            /**
             * Obtient la valeur de la propri�t� taxId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxId() {
                return taxId;
            }

            /**
             * D�finit la valeur de la propri�t� taxId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxId(String value) {
                this.taxId = value;
            }

            /**
             * Obtient la valeur de la propri�t� taxIdDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxIdDate() {
                return taxIdDate;
            }

            /**
             * D�finit la valeur de la propri�t� taxIdDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxIdDate(String value) {
                this.taxIdDate = value;
            }

            /**
             * Obtient la valeur de la propri�t� tradeRegisterNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTradeRegisterNumber() {
                return tradeRegisterNumber;
            }

            /**
             * D�finit la valeur de la propri�t� tradeRegisterNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTradeRegisterNumber(String value) {
                this.tradeRegisterNumber = value;
            }

            /**
             * Obtient la valeur de la propri�t� tradeRegisterDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTradeRegisterDate() {
                return tradeRegisterDate;
            }

            /**
             * D�finit la valeur de la propri�t� tradeRegisterDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTradeRegisterDate(String value) {
                this.tradeRegisterDate = value;
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
         *         &lt;element name="legalRepPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cityOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="typeOfIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="identityIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ninCedeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="issuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="arondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="qartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="landLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "legalRepPerson",
            "lastName",
            "firstName",
            "birthdate",
            "nationality",
            "nin",
            "placeOfBirth",
            "cityOfBirth",
            "typeOfIdentity",
            "identityIdNumber",
            "ninCedeo",
            "issuedDate",
            "expiryDate",
            "region",
            "department",
            "arondissement",
            "commune",
            "qartier",
            "address",
            "landLineNumber",
            "mobileNumber",
            "email"
        })
        public static class LegalRepresentativeForm {

            protected String legalRepPerson;
            protected String lastName;
            protected String firstName;
            protected String birthdate;
            protected String nationality;
            protected String nin;
            protected String placeOfBirth;
            protected String cityOfBirth;
            protected String typeOfIdentity;
            protected String identityIdNumber;
            protected String ninCedeo;
            protected String issuedDate;
            protected String expiryDate;
            protected String region;
            protected String department;
            protected String arondissement;
            protected String commune;
            protected String qartier;
            protected String address;
            protected String landLineNumber;
            protected String mobileNumber;
            protected String email;

            /**
             * Obtient la valeur de la propri�t� legalRepPerson.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLegalRepPerson() {
                return legalRepPerson;
            }

            /**
             * D�finit la valeur de la propri�t� legalRepPerson.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLegalRepPerson(String value) {
                this.legalRepPerson = value;
            }

            /**
             * Obtient la valeur de la propri�t� lastName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastName() {
                return lastName;
            }

            /**
             * D�finit la valeur de la propri�t� lastName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastName(String value) {
                this.lastName = value;
            }

            /**
             * Obtient la valeur de la propri�t� firstName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * D�finit la valeur de la propri�t� firstName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstName(String value) {
                this.firstName = value;
            }

            /**
             * Obtient la valeur de la propri�t� birthdate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBirthdate() {
                return birthdate;
            }

            /**
             * D�finit la valeur de la propri�t� birthdate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBirthdate(String value) {
                this.birthdate = value;
            }

            /**
             * Obtient la valeur de la propri�t� nationality.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNationality() {
                return nationality;
            }

            /**
             * D�finit la valeur de la propri�t� nationality.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNationality(String value) {
                this.nationality = value;
            }

            /**
             * Obtient la valeur de la propri�t� nin.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNin() {
                return nin;
            }

            /**
             * D�finit la valeur de la propri�t� nin.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNin(String value) {
                this.nin = value;
            }

            /**
             * Obtient la valeur de la propri�t� placeOfBirth.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceOfBirth() {
                return placeOfBirth;
            }

            /**
             * D�finit la valeur de la propri�t� placeOfBirth.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceOfBirth(String value) {
                this.placeOfBirth = value;
            }

            /**
             * Obtient la valeur de la propri�t� cityOfBirth.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityOfBirth() {
                return cityOfBirth;
            }

            /**
             * D�finit la valeur de la propri�t� cityOfBirth.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityOfBirth(String value) {
                this.cityOfBirth = value;
            }

            /**
             * Obtient la valeur de la propri�t� typeOfIdentity.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeOfIdentity() {
                return typeOfIdentity;
            }

            /**
             * D�finit la valeur de la propri�t� typeOfIdentity.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeOfIdentity(String value) {
                this.typeOfIdentity = value;
            }

            /**
             * Obtient la valeur de la propri�t� identityIdNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdentityIdNumber() {
                return identityIdNumber;
            }

            /**
             * D�finit la valeur de la propri�t� identityIdNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdentityIdNumber(String value) {
                this.identityIdNumber = value;
            }

            /**
             * Obtient la valeur de la propri�t� ninCedeo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNinCedeo() {
                return ninCedeo;
            }

            /**
             * D�finit la valeur de la propri�t� ninCedeo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNinCedeo(String value) {
                this.ninCedeo = value;
            }

            /**
             * Obtient la valeur de la propri�t� issuedDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIssuedDate() {
                return issuedDate;
            }

            /**
             * D�finit la valeur de la propri�t� issuedDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssuedDate(String value) {
                this.issuedDate = value;
            }

            /**
             * Obtient la valeur de la propri�t� expiryDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpiryDate() {
                return expiryDate;
            }

            /**
             * D�finit la valeur de la propri�t� expiryDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpiryDate(String value) {
                this.expiryDate = value;
            }

            /**
             * Obtient la valeur de la propri�t� region.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegion() {
                return region;
            }

            /**
             * D�finit la valeur de la propri�t� region.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegion(String value) {
                this.region = value;
            }

            /**
             * Obtient la valeur de la propri�t� department.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartment() {
                return department;
            }

            /**
             * D�finit la valeur de la propri�t� department.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartment(String value) {
                this.department = value;
            }

            /**
             * Obtient la valeur de la propri�t� arondissement.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArondissement() {
                return arondissement;
            }

            /**
             * D�finit la valeur de la propri�t� arondissement.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArondissement(String value) {
                this.arondissement = value;
            }

            /**
             * Obtient la valeur de la propri�t� commune.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommune() {
                return commune;
            }

            /**
             * D�finit la valeur de la propri�t� commune.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommune(String value) {
                this.commune = value;
            }

            /**
             * Obtient la valeur de la propri�t� qartier.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQartier() {
                return qartier;
            }

            /**
             * D�finit la valeur de la propri�t� qartier.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQartier(String value) {
                this.qartier = value;
            }

            /**
             * Obtient la valeur de la propri�t� address.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * D�finit la valeur de la propri�t� address.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Obtient la valeur de la propri�t� landLineNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLandLineNumber() {
                return landLineNumber;
            }

            /**
             * D�finit la valeur de la propri�t� landLineNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLandLineNumber(String value) {
                this.landLineNumber = value;
            }

            /**
             * Obtient la valeur de la propri�t� mobileNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMobileNumber() {
                return mobileNumber;
            }

            /**
             * D�finit la valeur de la propri�t� mobileNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMobileNumber(String value) {
                this.mobileNumber = value;
            }

            /**
             * Obtient la valeur de la propri�t� email.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * D�finit la valeur de la propri�t� email.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
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
         *         &lt;element name="dateOfInspection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dateOfFirstHire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="businessSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="mainLineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="atRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="noOfWorkersInGenScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="noOfWorkersInBasicScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="arondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="qartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="postboxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="zoneCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="zoneIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sectorCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sectorIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="agencyCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="agencyIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "dateOfInspection",
            "dateOfFirstHire",
            "shortName",
            "businessSector",
            "mainLineOfBusiness",
            "atRate",
            "noOfWorkersInGenScheme",
            "noOfWorkersInBasicScheme",
            "region",
            "department",
            "arondissement",
            "commune",
            "qartier",
            "address",
            "postboxNo",
            "telephone",
            "email",
            "website",
            "zoneCss",
            "zoneIpres",
            "sectorCss",
            "sectorIpres",
            "agencyCss",
            "agencyIpres"
        })
        public static class MainRegistrationForm {

            protected String dateOfInspection;
            protected String dateOfFirstHire;
            protected String shortName;
            protected String businessSector;
            protected String mainLineOfBusiness;
            protected String atRate;
            protected String noOfWorkersInGenScheme;
            protected String noOfWorkersInBasicScheme;
            protected String region;
            protected String department;
            protected String arondissement;
            protected String commune;
            protected String qartier;
            protected String address;
            protected String postboxNo;
            protected String telephone;
            protected String email;
            protected String website;
            protected String zoneCss;
            protected String zoneIpres;
            protected String sectorCss;
            protected String sectorIpres;
            protected String agencyCss;
            protected String agencyIpres;

            /**
             * Obtient la valeur de la propri�t� dateOfInspection.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateOfInspection() {
                return dateOfInspection;
            }

            /**
             * D�finit la valeur de la propri�t� dateOfInspection.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateOfInspection(String value) {
                this.dateOfInspection = value;
            }

            /**
             * Obtient la valeur de la propri�t� dateOfFirstHire.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateOfFirstHire() {
                return dateOfFirstHire;
            }

            /**
             * D�finit la valeur de la propri�t� dateOfFirstHire.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateOfFirstHire(String value) {
                this.dateOfFirstHire = value;
            }

            /**
             * Obtient la valeur de la propri�t� shortName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShortName() {
                return shortName;
            }

            /**
             * D�finit la valeur de la propri�t� shortName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShortName(String value) {
                this.shortName = value;
            }

            /**
             * Obtient la valeur de la propri�t� businessSector.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusinessSector() {
                return businessSector;
            }

            /**
             * D�finit la valeur de la propri�t� businessSector.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusinessSector(String value) {
                this.businessSector = value;
            }

            /**
             * Obtient la valeur de la propri�t� mainLineOfBusiness.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMainLineOfBusiness() {
                return mainLineOfBusiness;
            }

            /**
             * D�finit la valeur de la propri�t� mainLineOfBusiness.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMainLineOfBusiness(String value) {
                this.mainLineOfBusiness = value;
            }

            /**
             * Obtient la valeur de la propri�t� atRate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAtRate() {
                return atRate;
            }

            /**
             * D�finit la valeur de la propri�t� atRate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAtRate(String value) {
                this.atRate = value;
            }

            /**
             * Obtient la valeur de la propri�t� noOfWorkersInGenScheme.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoOfWorkersInGenScheme() {
                return noOfWorkersInGenScheme;
            }

            /**
             * D�finit la valeur de la propri�t� noOfWorkersInGenScheme.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoOfWorkersInGenScheme(String value) {
                this.noOfWorkersInGenScheme = value;
            }

            /**
             * Obtient la valeur de la propri�t� noOfWorkersInBasicScheme.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoOfWorkersInBasicScheme() {
                return noOfWorkersInBasicScheme;
            }

            /**
             * D�finit la valeur de la propri�t� noOfWorkersInBasicScheme.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoOfWorkersInBasicScheme(String value) {
                this.noOfWorkersInBasicScheme = value;
            }

            /**
             * Obtient la valeur de la propri�t� region.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegion() {
                return region;
            }

            /**
             * D�finit la valeur de la propri�t� region.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegion(String value) {
                this.region = value;
            }

            /**
             * Obtient la valeur de la propri�t� department.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartment() {
                return department;
            }

            /**
             * D�finit la valeur de la propri�t� department.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartment(String value) {
                this.department = value;
            }

            /**
             * Obtient la valeur de la propri�t� arondissement.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArondissement() {
                return arondissement;
            }

            /**
             * D�finit la valeur de la propri�t� arondissement.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArondissement(String value) {
                this.arondissement = value;
            }

            /**
             * Obtient la valeur de la propri�t� commune.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommune() {
                return commune;
            }

            /**
             * D�finit la valeur de la propri�t� commune.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommune(String value) {
                this.commune = value;
            }

            /**
             * Obtient la valeur de la propri�t� qartier.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQartier() {
                return qartier;
            }

            /**
             * D�finit la valeur de la propri�t� qartier.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQartier(String value) {
                this.qartier = value;
            }

            /**
             * Obtient la valeur de la propri�t� address.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * D�finit la valeur de la propri�t� address.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Obtient la valeur de la propri�t� postboxNo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostboxNo() {
                return postboxNo;
            }

            /**
             * D�finit la valeur de la propri�t� postboxNo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostboxNo(String value) {
                this.postboxNo = value;
            }

            /**
             * Obtient la valeur de la propri�t� telephone.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelephone() {
                return telephone;
            }

            /**
             * D�finit la valeur de la propri�t� telephone.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelephone(String value) {
                this.telephone = value;
            }

            /**
             * Obtient la valeur de la propri�t� email.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * D�finit la valeur de la propri�t� email.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
            }

            /**
             * Obtient la valeur de la propri�t� website.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWebsite() {
                return website;
            }

            /**
             * D�finit la valeur de la propri�t� website.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWebsite(String value) {
                this.website = value;
            }

            /**
             * Obtient la valeur de la propri�t� zoneCss.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZoneCss() {
                return zoneCss;
            }

            /**
             * D�finit la valeur de la propri�t� zoneCss.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZoneCss(String value) {
                this.zoneCss = value;
            }

            /**
             * Obtient la valeur de la propri�t� zoneIpres.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZoneIpres() {
                return zoneIpres;
            }

            /**
             * D�finit la valeur de la propri�t� zoneIpres.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZoneIpres(String value) {
                this.zoneIpres = value;
            }

            /**
             * Obtient la valeur de la propri�t� sectorCss.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSectorCss() {
                return sectorCss;
            }

            /**
             * D�finit la valeur de la propri�t� sectorCss.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSectorCss(String value) {
                this.sectorCss = value;
            }

            /**
             * Obtient la valeur de la propri�t� sectorIpres.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSectorIpres() {
                return sectorIpres;
            }

            /**
             * D�finit la valeur de la propri�t� sectorIpres.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSectorIpres(String value) {
                this.sectorIpres = value;
            }

            /**
             * Obtient la valeur de la propri�t� agencyCss.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgencyCss() {
                return agencyCss;
            }

            /**
             * D�finit la valeur de la propri�t� agencyCss.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgencyCss(String value) {
                this.agencyCss = value;
            }

            /**
             * Obtient la valeur de la propri�t� agencyIpres.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgencyIpres() {
                return agencyIpres;
            }

            /**
             * D�finit la valeur de la propri�t� agencyIpres.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgencyIpres(String value) {
                this.agencyIpres = value;
            }

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
     *         &lt;element name="employerRegistrationFormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employeeRegistrationFormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="processFlowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="zoneCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="zoneIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sectorCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sectorIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="agenceCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="agenceIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tauxAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "employerRegistrationFormId",
        "employeeRegistrationFormId",
        "processFlowId",
        "zoneCss",
        "zoneIpres",
        "sectorCss",
        "sectorIpres",
        "agenceCss",
        "agenceIpres",
        "tauxAt"
    })
    public static class Output {

        protected String employerRegistrationFormId;
        protected String employeeRegistrationFormId;
        protected String processFlowId;
        protected String zoneCss;
        protected String zoneIpres;
        protected String sectorCss;
        protected String sectorIpres;
        protected String agenceCss;
        protected String agenceIpres;
        protected String tauxAt;

        /**
         * Obtient la valeur de la propri�t� employerRegistrationFormId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmployerRegistrationFormId() {
            return employerRegistrationFormId;
        }

        /**
         * D�finit la valeur de la propri�t� employerRegistrationFormId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmployerRegistrationFormId(String value) {
            this.employerRegistrationFormId = value;
        }

        /**
         * Obtient la valeur de la propri�t� employeeRegistrationFormId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmployeeRegistrationFormId() {
            return employeeRegistrationFormId;
        }

        /**
         * D�finit la valeur de la propri�t� employeeRegistrationFormId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmployeeRegistrationFormId(String value) {
            this.employeeRegistrationFormId = value;
        }

        /**
         * Obtient la valeur de la propri�t� processFlowId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcessFlowId() {
            return processFlowId;
        }

        /**
         * D�finit la valeur de la propri�t� processFlowId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcessFlowId(String value) {
            this.processFlowId = value;
        }

        /**
         * Obtient la valeur de la propri�t� zoneCss.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZoneCss() {
            return zoneCss;
        }

        /**
         * D�finit la valeur de la propri�t� zoneCss.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZoneCss(String value) {
            this.zoneCss = value;
        }

        /**
         * Obtient la valeur de la propri�t� zoneIpres.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZoneIpres() {
            return zoneIpres;
        }

        /**
         * D�finit la valeur de la propri�t� zoneIpres.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZoneIpres(String value) {
            this.zoneIpres = value;
        }

        /**
         * Obtient la valeur de la propri�t� sectorCss.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSectorCss() {
            return sectorCss;
        }

        /**
         * D�finit la valeur de la propri�t� sectorCss.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSectorCss(String value) {
            this.sectorCss = value;
        }

        /**
         * Obtient la valeur de la propri�t� sectorIpres.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSectorIpres() {
            return sectorIpres;
        }

        /**
         * D�finit la valeur de la propri�t� sectorIpres.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSectorIpres(String value) {
            this.sectorIpres = value;
        }

        /**
         * Obtient la valeur de la propri�t� agenceCss.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgenceCss() {
            return agenceCss;
        }

        /**
         * D�finit la valeur de la propri�t� agenceCss.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgenceCss(String value) {
            this.agenceCss = value;
        }

        /**
         * Obtient la valeur de la propri�t� agenceIpres.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgenceIpres() {
            return agenceIpres;
        }

        /**
         * D�finit la valeur de la propri�t� agenceIpres.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgenceIpres(String value) {
            this.agenceIpres = value;
        }

        /**
         * Obtient la valeur de la propri�t� tauxAt.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTauxAt() {
            return tauxAt;
        }

        /**
         * D�finit la valeur de la propri�t� tauxAt.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTauxAt(String value) {
            this.tauxAt = value;
        }

    }

}
