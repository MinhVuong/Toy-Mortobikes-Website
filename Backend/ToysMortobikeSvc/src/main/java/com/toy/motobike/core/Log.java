package com.toy.motobike.core;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author VuongTM
 */
public class Log {
    public static final String TAB = "\t";
    private final SimpleDateFormat timeFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
    
    private final String timeStart;
    private String timeEnd;
    private StringBuilder log;

    public Log() {
        timeStart = this.timeFormatter.format(new Date());
        log = new StringBuilder();
    }
    
    /**
     * 
     * @return 
     */
    public String writeLog() {
        timeEnd = this.timeFormatter.format(new Date());
        String str = timeStart + TAB;
        str += timeEnd + TAB;
        str += this.log.toString();
        return str;
    }
    
    /**
     * 
     * @param key
     * @param value
     */
    public void appendKeyValue(String key, Object value) {
        log.append(key).append("=").append(value).append(TAB);
    }
    
    public void appendValue(String value) {
        log.append(value).append(TAB);
    }
}
