//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.25 at 10:45:17 PM CEST 
//


package ch.friedli.infosystem.ihs.totomat;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xmlversion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Spiel" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="spielid" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="spielnr" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="heim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="gast" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="heimshort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="gastshort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="heimkuerzel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="gastkuerzel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="liganame" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="resultat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="resultath1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="resultath2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="resultath3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="resultatv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="resultatv2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="resultatp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nachPenalty" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="nachVerlaengerung" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="spielort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="isrunning" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="gespielt" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="lastgoal" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="livetickeron" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
    "xmlversion",
    "spiel"
})
@XmlRootElement(name = "ihs")
public class Ihs {

    @XmlElement(required = true)
    protected String xmlversion;
    @XmlElement(name = "Spiel")
    protected List<Ihs.Spiel> spiel;

    /**
     * Gets the value of the xmlversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlversion() {
        return xmlversion;
    }

    /**
     * Sets the value of the xmlversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlversion(String value) {
        this.xmlversion = value;
    }

    /**
     * Gets the value of the spiel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spiel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpiel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ihs.Spiel }
     * 
     * 
     */
    public List<Ihs.Spiel> getSpiel() {
        if (spiel == null) {
            spiel = new ArrayList<Ihs.Spiel>();
        }
        return this.spiel;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="spielid" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="spielnr" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="heim" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="gast" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="heimshort" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="gastshort" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="heimkuerzel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="gastkuerzel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="liganame" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="resultat" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="resultath1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="resultath2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="resultath3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="resultatv" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="resultatv2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="resultatp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nachPenalty" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="nachVerlaengerung" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="spielort" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="isrunning" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="gespielt" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="lastgoal" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="livetickeron" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
        "spielid",
        "spielnr",
        "datum",
        "heim",
        "gast",
        "heimshort",
        "gastshort",
        "heimkuerzel",
        "gastkuerzel",
        "liganame",
        "resultat",
        "resultath1",
        "resultath2",
        "resultath3",
        "resultatv",
        "resultatv2",
        "resultatp",
        "nachPenalty",
        "nachVerlaengerung",
        "spielort",
        "isrunning",
        "gespielt",
        "lastgoal",
        "livetickeron"
    })
    public static class Spiel {

        protected short spielid;
        protected byte spielnr;
        @XmlElement(required = true)
        protected String datum;
        @XmlElement(required = true)
        protected String heim;
        @XmlElement(required = true)
        protected String gast;
        @XmlElement(required = true)
        protected String heimshort;
        @XmlElement(required = true)
        protected String gastshort;
        @XmlElement(required = true)
        protected String heimkuerzel;
        @XmlElement(required = true)
        protected String gastkuerzel;
        @XmlElement(required = true)
        protected String liganame;
        @XmlElement(required = true)
        protected String resultat;
        @XmlElement(required = true)
        protected String resultath1;
        @XmlElement(required = true)
        protected String resultath2;
        @XmlElement(required = true)
        protected String resultath3;
        @XmlElement(required = true)
        protected String resultatv;
        @XmlElement(required = true)
        protected String resultatv2;
        @XmlElement(required = true)
        protected String resultatp;
        protected byte nachPenalty;
        protected byte nachVerlaengerung;
        @XmlElement(required = true)
        protected String spielort;
        protected byte isrunning;
        protected byte gespielt;
        protected byte lastgoal;
        protected byte livetickeron;

        /**
         * Gets the value of the spielid property.
         * 
         */
        public short getSpielid() {
            return spielid;
        }

        /**
         * Sets the value of the spielid property.
         * 
         */
        public void setSpielid(short value) {
            this.spielid = value;
        }

        /**
         * Gets the value of the spielnr property.
         * 
         */
        public byte getSpielnr() {
            return spielnr;
        }

        /**
         * Sets the value of the spielnr property.
         * 
         */
        public void setSpielnr(byte value) {
            this.spielnr = value;
        }

        /**
         * Gets the value of the datum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatum() {
            return datum;
        }

        /**
         * Sets the value of the datum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatum(String value) {
            this.datum = value;
        }

        /**
         * Gets the value of the heim property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeim() {
            return heim;
        }

        /**
         * Sets the value of the heim property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeim(String value) {
            this.heim = value;
        }

        /**
         * Gets the value of the gast property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGast() {
            return gast;
        }

        /**
         * Sets the value of the gast property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGast(String value) {
            this.gast = value;
        }

        /**
         * Gets the value of the heimshort property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeimshort() {
            return heimshort;
        }

        /**
         * Sets the value of the heimshort property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeimshort(String value) {
            this.heimshort = value;
        }

        /**
         * Gets the value of the gastshort property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGastshort() {
            return gastshort;
        }

        /**
         * Sets the value of the gastshort property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGastshort(String value) {
            this.gastshort = value;
        }

        /**
         * Gets the value of the heimkuerzel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeimkuerzel() {
            return heimkuerzel;
        }

        /**
         * Sets the value of the heimkuerzel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeimkuerzel(String value) {
            this.heimkuerzel = value;
        }

        /**
         * Gets the value of the gastkuerzel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGastkuerzel() {
            return gastkuerzel;
        }

        /**
         * Sets the value of the gastkuerzel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGastkuerzel(String value) {
            this.gastkuerzel = value;
        }

        /**
         * Gets the value of the liganame property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLiganame() {
            return liganame;
        }

        /**
         * Sets the value of the liganame property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLiganame(String value) {
            this.liganame = value;
        }

        /**
         * Gets the value of the resultat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultat() {
            return resultat;
        }

        /**
         * Sets the value of the resultat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultat(String value) {
            this.resultat = value;
        }

        /**
         * Gets the value of the resultath1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultath1() {
            return resultath1;
        }

        /**
         * Sets the value of the resultath1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultath1(String value) {
            this.resultath1 = value;
        }

        /**
         * Gets the value of the resultath2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultath2() {
            return resultath2;
        }

        /**
         * Sets the value of the resultath2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultath2(String value) {
            this.resultath2 = value;
        }

        /**
         * Gets the value of the resultath3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultath3() {
            return resultath3;
        }

        /**
         * Sets the value of the resultath3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultath3(String value) {
            this.resultath3 = value;
        }

        /**
         * Gets the value of the resultatv property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultatv() {
            return resultatv;
        }

        /**
         * Sets the value of the resultatv property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultatv(String value) {
            this.resultatv = value;
        }

        /**
         * Gets the value of the resultatv2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultatv2() {
            return resultatv2;
        }

        /**
         * Sets the value of the resultatv2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultatv2(String value) {
            this.resultatv2 = value;
        }

        /**
         * Gets the value of the resultatp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultatp() {
            return resultatp;
        }

        /**
         * Sets the value of the resultatp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultatp(String value) {
            this.resultatp = value;
        }

        /**
         * Gets the value of the nachPenalty property.
         * 
         */
        public byte getNachPenalty() {
            return nachPenalty;
        }

        /**
         * Sets the value of the nachPenalty property.
         * 
         */
        public void setNachPenalty(byte value) {
            this.nachPenalty = value;
        }

        /**
         * Gets the value of the nachVerlaengerung property.
         * 
         */
        public byte getNachVerlaengerung() {
            return nachVerlaengerung;
        }

        /**
         * Sets the value of the nachVerlaengerung property.
         * 
         */
        public void setNachVerlaengerung(byte value) {
            this.nachVerlaengerung = value;
        }

        /**
         * Gets the value of the spielort property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpielort() {
            return spielort;
        }

        /**
         * Sets the value of the spielort property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpielort(String value) {
            this.spielort = value;
        }

        /**
         * Gets the value of the isrunning property.
         * 
         */
        public byte getIsrunning() {
            return isrunning;
        }

        /**
         * Sets the value of the isrunning property.
         * 
         */
        public void setIsrunning(byte value) {
            this.isrunning = value;
        }

        /**
         * Gets the value of the gespielt property.
         * 
         */
        public byte getGespielt() {
            return gespielt;
        }

        /**
         * Sets the value of the gespielt property.
         * 
         */
        public void setGespielt(byte value) {
            this.gespielt = value;
        }

        /**
         * Gets the value of the lastgoal property.
         * 
         */
        public byte getLastgoal() {
            return lastgoal;
        }

        /**
         * Sets the value of the lastgoal property.
         * 
         */
        public void setLastgoal(byte value) {
            this.lastgoal = value;
        }

        /**
         * Gets the value of the livetickeron property.
         * 
         */
        public byte getLivetickeron() {
            return livetickeron;
        }

        /**
         * Sets the value of the livetickeron property.
         * 
         */
        public void setLivetickeron(byte value) {
            this.livetickeron = value;
        }

    }

}
