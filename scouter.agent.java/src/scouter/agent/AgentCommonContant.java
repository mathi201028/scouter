package scouter.agent;

/**
 * @author Gun Lee (gunlee01@gmail.com) on 2017. 2. 5.
 * Common constants for scouter agent.
 *
 */
public class AgentCommonContant {
    public static final String SPRING_REQUEST_MAPPING_POSTFIX_FLAG = " [:SRM]";

    /**
     * remove " [:SRM]" from service name
     */
    public static String removeSpringRequestMappingPostfixFlag(String org) {
        int pos = org.indexOf(SPRING_REQUEST_MAPPING_POSTFIX_FLAG);
        if(pos < 0) return org;
        String pre = org.substring(0, pos);
        if(org.length() > pre.length() + SPRING_REQUEST_MAPPING_POSTFIX_FLAG.length()) {
            return pre + org.substring(pos + SPRING_REQUEST_MAPPING_POSTFIX_FLAG.length());
        } else {
            return pre;
        }
    }
}
