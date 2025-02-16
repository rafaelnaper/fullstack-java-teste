
package br.com.lemontech.selfbooking.wsselfbooking.beans.carro;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.lemontech.selfbooking.wsselfbooking.beans.carro package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.lemontech.selfbooking.wsselfbooking.beans.carro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Carro }
     * 
     */
    public Carro createCarro() {
        return new Carro();
    }

    /**
     * Create an instance of {@link PedidosCarros }
     * 
     */
    public PedidosCarros createPedidosCarros() {
        return new PedidosCarros();
    }

    /**
     * Create an instance of {@link PedidoCarro }
     * 
     */
    public PedidoCarro createPedidoCarro() {
        return new PedidoCarro();
    }

    /**
     * Create an instance of {@link Carros }
     * 
     */
    public Carros createCarros() {
        return new Carros();
    }

}
