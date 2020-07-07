import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.Strings.str;

@BTrace
public class BtraceProbe {
    @OnMethod(clazz = "com.weibo.ad.bp.superfans.configcenter.controller.ValidationController",
    method = "validateTestData", location = @Location(Kind.RETURN))
    public static void targetMethod(@Self Object self, String input, @Return AnyType result, @Duration long time){
        BTraceUtils.println();
        BTraceUtils.println();
        BTraceUtils.println("method self: " + str(self));
        BTraceUtils.println("方法调用栈: ");
        BTraceUtils.println("入参1：" + input);
        BTraceUtils.println("返回值: result=" + str(result));
        BTraceUtils.println("时间(ns): " + time);
        BTraceUtils.println();
    }
}
