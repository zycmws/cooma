package com.oldratlee.cooma.ext2;

import com.oldratlee.cooma.Adaptive;
import com.oldratlee.cooma.Config;
import com.oldratlee.cooma.Extension;

/**
 * 无Default
 * 
 * @author oldratlee
 */
@Extension
public interface Ext2 {
    @Adaptive
    String echo(UrlHolder holder, String s);
    
    @Adaptive({"key1", "protocol"})
    String yell(Config config, String s);
    
    String bang(Config config, int i);
}