package com.dcits.ensemble.sequences;

import com.dcits.galaxy.business.sequences.AbstractGenerateSeq;
import com.dcits.galaxy.util.DateUtils;
import com.dcits.galaxy.util.StringUtils;

public class ReferenceSeq extends AbstractGenerateSeq {

    private String runDate;

    public ReferenceSeq(String runDate) {
        super("fm.referenceSeq." + runDate);
        this.runDate = runDate;
    }

    /**
     * 返回 yyMMdd+20位顺序号
     *
     * @return
     */
    public String getReferenceSeq() {
        return DateUtils.getDateTime(DateUtils.parse(runDate, "yyyyMMdd"), "yyMMdd")
                + StringUtils.lfillStr(String.valueOf(this.generateSeqNo()), 10, "0");
    }
}
