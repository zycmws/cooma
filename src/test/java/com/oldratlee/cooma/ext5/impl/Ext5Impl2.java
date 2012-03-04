package com.oldratlee.cooma.ext5.impl;

import com.oldratlee.cooma.Config;
import com.oldratlee.cooma.ext5.Ext5NoAdaptiveMethod;

/**
 * @author oldratlee
 *
 */
public class Ext5Impl2 implements Ext5NoAdaptiveMethod {
    public String echo(Config config, String s) {
        return "Ext5Impl2-echo";
    }

    public String yell(Config config, String s) {
        return "Ext5Impl2-yell";
    }

    public String bang(Config config, int i) {
        return "impl2";
    }
}