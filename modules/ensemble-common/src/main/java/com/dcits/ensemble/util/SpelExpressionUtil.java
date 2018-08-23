package com.dcits.ensemble.util;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Map;

/**
 * ensemble Created by cheng.liang on 2015/8/11.
 */
public class SpelExpressionUtil {

    public static <T> T eval(Class<T> T, String expr, Map<String, Object> args) {

        return eval(T, expr, args, null);
    }
    public static <T> T eval(Class<T> T, String expr, Map<String, Object> args, Object rootObj) {
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context;
        if (null == rootObj)
            context = new StandardEvaluationContext();
        else
            context = new StandardEvaluationContext(rootObj);

        for (Map.Entry<String, Object> entry : args.entrySet()) {
            context.setVariable(entry.getKey(), entry.getValue());
        }
        return parser.parseExpression(expr).getValue(context, T);
    }
}
