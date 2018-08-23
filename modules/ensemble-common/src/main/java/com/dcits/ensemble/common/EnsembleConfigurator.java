/**   
 * <p>Title: EnsembleConfigurator.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: dcits</p>
 * @author Tim
 * @update 2014年12月17日 下午3:00:52
 * @version V1.0
 */
package com.dcits.ensemble.common;

import java.util.Properties;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;

/**
 * @description Ensemble properties属性加载
 * @version V1.0
 * @author Tim
 * @update 2014年12月17日 下午3:00:52
 */

public class EnsembleConfigurator implements InitializingBean {

	private Resource[] ensembleLocations;

	private static EnsembleConfigurator ensembleConfigurator;

	private Properties ensembleProperties = new Properties();

	public static EnsembleConfigurator getInstance() {
		if (null == ensembleConfigurator) {
			ensembleConfigurator = new EnsembleConfigurator();
		}

		return ensembleConfigurator;
	}

	public Properties getProperties() {
		return ensembleProperties;
	}

	public String getProperty(String key) {
		return ensembleProperties.getProperty(key);
	}

	public String getProperty(String key, String defaultValue) {
		return ensembleProperties.getProperty(key, defaultValue);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if (null != getEnsembleLocations()) {
			for (Resource resource : getEnsembleLocations()) {
				EnsembleConfigurator.getInstance().ensembleProperties
						.load(resource.getInputStream());
			}
		}
	}

	/**
	 * @return ensembleLocations : return the property ensembleLocations.
	 */
	public Resource[] getEnsembleLocations() {
		return ensembleLocations;
	}

	/**
	 * @param ensembleLocations
	 *            : set the property ensembleLocations.
	 */
	public void setEnsembleLocations(Resource[] ensembleLocations) {
		this.ensembleLocations = ensembleLocations;
	}
}
