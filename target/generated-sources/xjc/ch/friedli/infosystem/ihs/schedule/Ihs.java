//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.20 at 12:56:18 AM CEST 
//


package ch.friedli.infosystem.ihs.schedule;

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
 *                   &lt;element name="spielnr" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="heim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="gast" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="resultat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nachPenalty" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="nachVerlaengerung" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="spielort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="gespielt" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="forfait" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="livetickeron" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="resultat_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="resultat_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="resultat_v" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="resultat_p" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="abgesagt" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="verschoben" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
     *         &lt;element name="spielnr" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="heim" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="gast" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="resultat" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nachPenalty" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="nachVerlaengerung" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="spielort" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="gespielt" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="forfait" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="livetickeron" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="resultat_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="resultat_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="resultat_v" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="resultat_p" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="abgesagt" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="verschoben" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
        "resultat",
        "nachPenalty",
        "nachVerlaengerung",
        "spielort",
        "gespielt",
        "forfait",
        "livetickeron",
        "resultat1",
        "resultat2",
        "resultatV",
        "resultatP",
        "abgesagt",
        "verschoben"
    })
    public static class Spiel {

        protected short spielid;
        protected short spielnr;
        @XmlElement(required = true)
        protected String datum;
        @XmlElement(required = true)
        protected String heim;
        @XmlElement(required = true)
        protected String gast;
        @XmlElement(required = true)
        protected String resultat;
        protected byte nachPenalty;
        protected byte nachVerlaengerung;
        @XmlElement(required = true)
        protected String spielort;
        protected byte gespielt;
        protected byte forfait;
        protected byte livetickeron;
        @XmlElement(name = "resultat_1", required = true)
        protected String resultat1;
        @XmlElement(name = "resultat_2", required = true)
        protected String resultat2;
        @XmlElement(name = "resultat_v", required = true)
        protected String resultatV;
        @XmlElement(name = "resultat_p", required = true)
        protected String resultatP;
        protected byte abgesagt;
        protected byte verschoben;

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
        public short getSpielnr() {
            return spielnr;
        }

        /**
         * Sets the value of the spielnr property.
         * 
         */
        public void setSpielnr(short value) {
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
         * Gets the value of the forfait property.
         * 
         */
        public byte getForfait() {
            return forfait;
        }

        /**
         * Sets the value of the forfait property.
         * 
         */
        public void setForfait(byte value) {
            this.forfait = value;
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

        /**
         * Gets the value of the resultat1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultat1() {
            return resultat1;
        }

        /**
         * Sets the value of the resultat1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultat1(String value) {
            this.resultat1 = value;
        }

        /**
         * Gets the value of the resultat2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultat2() {
            return resultat2;
        }

        /**
         * Sets the value of the resultat2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultat2(String value) {
            this.resultat2 = value;
        }

        /**
         * Gets the value of the resultatV property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultatV() {
            return resultatV;
        }

        /**
         * Sets the value of the resultatV property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultatV(String value) {
            this.resultatV = value;
        }

        /**
         * Gets the value of the resultatP property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultatP() {
            return resultatP;
        }

        /**
         * Sets the value of the resultatP property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultatP(String value) {
            this.resultatP = value;
        }

        /**
         * Gets the value of the abgesagt property.
         * 
         */
        public byte getAbgesagt() {
            return abgesagt;
        }

        /**
         * Sets the value of the abgesagt property.
         * 
         */
        public void setAbgesagt(byte value) {
            this.abgesagt = value;
        }

        /**
         * Gets the value of the verschoben property.
         * 
         */
        public byte getVerschoben() {
            return verschoben;
        }

        /**
         * Sets the value of the verschoben property.
         * 
         */
        public void setVerschoben(byte value) {
            this.verschoben = value;
        }

    }

}
