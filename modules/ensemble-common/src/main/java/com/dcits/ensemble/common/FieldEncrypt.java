package com.dcits.ensemble.common;

import com.dcits.galaxy.business.api.IField2EncryptDecrypt;
import org.springframework.stereotype.Repository;

/**
 * Created by lixbb on 2016/1/7.
 */
@Repository
public class FieldEncrypt implements IField2EncryptDecrypt<String> {
    @Override
    public String encryptDecrypt(String fieldValue, Object[] args) {
        String ret = "<" + fieldValue + ">";
        if (args != null) {
            for (Object arg : args) {

                ret += "," + arg;

            }
        }
        return ret;
    }
}
