
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pedidosAereos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pedidosAereos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pedidoAereo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}pedidoAereo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedidosAereos", propOrder = {
    "pedidoAereo"
})
public class PedidosAereos {

    protected List<PedidoAereo> pedidoAereo;

    /**
     * Gets the value of the pedidoAereo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pedidoAereo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedidoAereo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PedidoAereo }
     * 
     * 
     */
    public List<PedidoAereo> getPedidoAereo() {
        if (pedidoAereo == null) {
            pedidoAereo = new ArrayList<PedidoAereo>();
        }
        return this.pedidoAereo;
    }

}
