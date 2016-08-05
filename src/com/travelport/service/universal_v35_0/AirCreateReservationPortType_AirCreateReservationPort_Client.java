
package com.travelport.service.universal_v35_0;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-05-15T12:41:57.680-06:00
 * Generated source version: 3.1.5
 * 
 */
public final class AirCreateReservationPortType_AirCreateReservationPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.travelport.com/service/universal_v35_0", "AirService");

    private AirCreateReservationPortType_AirCreateReservationPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AirService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        AirService ss = new AirService(wsdlURL, SERVICE_NAME);
        AirCreateReservationPortType port = ss.getAirCreateReservationPort();  
        
        {
        System.out.println("Invoking service...");
        com.travelport.schema.universal_v35_0.AirCreateReservationReq _service_parameters = null;
        com.travelport.schema.universal_v35_0.SupportedVersions _service_supportedVersions = null;
        try {
            com.travelport.schema.universal_v35_0.AirCreateReservationRsp _service__return = port.service(_service_parameters, _service_supportedVersions);
            System.out.println("service.result=" + _service__return);

        } catch (AvailabilityFaultMessage e) { 
            System.out.println("Expected exception: AvailabilityFaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (AirFaultMessage e) { 
            System.out.println("Expected exception: AirFaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}