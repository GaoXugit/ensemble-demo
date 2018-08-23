/**
 * <p>Title: Core12209901In.java</p>
 * <p>Description: 批量文件处理</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 *
 * @author Tim
 * @update 20160201
 * @version V1.0
 */
package com.dcits.ensemble.rb.model.mbsdcore;

import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.common.validate.V;

import java.io.Serializable;

/**
 * @author Tim
 * @version V1.0
 * @description 批量文件处理
 * @update 20160201
 */
public class Core12209901In extends Request {

    /**
     * @fields serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    @V(desc = "报文体")
    private Body body;

    /**
     * @return body : return the property body.
     */
    public Body getBody() {
        return body;
    }

    /**
     * @param body : set the property body.
     */
    public void setBody(Body body) {
        this.body = body;
    }

    public static class Body implements Serializable {

        private static final long serialVersionUID = 1L;
    }
}
