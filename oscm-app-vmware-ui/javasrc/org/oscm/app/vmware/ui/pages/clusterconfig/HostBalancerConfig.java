/*******************************************************************************
 *                                                                              
 *  COPYRIGHT (C) 2012 FUJITSU Limited - ALL RIGHTS RESERVED.                  
 *                                                                              
 *  Creation Date: 04.07.2012                                                      
 *                                                                              
 *******************************************************************************/
package org.oscm.app.vmware.ui.pages.clusterconfig;

import org.apache.commons.configuration.HierarchicalConfiguration;

/**
 * Reflects the host balancer configuration.
 * 
 * @author soehnges
 */
public class HostBalancerConfig {

    private HierarchicalConfiguration xmlConfig;

    public HostBalancerConfig(HierarchicalConfiguration xmlConfig) {
        this.xmlConfig = xmlConfig;
    }

    public String getBalancer() {
        return xmlConfig.getString("[@class]");
    }

    public void setBalancer(String value) {
        xmlConfig.setProperty("[@class]", value);
    }

    public String getMemoryWeight() {
        return xmlConfig.getString("[@memoryWeight]");
    }

    public void setMemoryWeight(String value) {
        xmlConfig.setProperty("[@memoryWeight]", value);
    }

    public String getCpuWeight() {
        return xmlConfig.getString("[@cpuWeight]");
    }

    public void setCpuWeight(String value) {
        xmlConfig.setProperty("[@cpuWeight]", value);
    }

    public String getVmWeight() {
        return xmlConfig.getString("[@vmWeight]");
    }

    public void setVmWeight(String value) {
        xmlConfig.setProperty("[@vmWeight]", value);
    }

}
