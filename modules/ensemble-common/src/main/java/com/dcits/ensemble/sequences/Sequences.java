package com.dcits.ensemble.sequences;

public class Sequences {

    /**
     *
     * @param runDate 营业日期
     * @return 返回 yyMMdd+20位顺序号
     */
    public static String getReferenceNo(String runDate) {
        ReferenceSeq seq = new ReferenceSeq(runDate);
        return seq.getReferenceSeq();
    }
}
