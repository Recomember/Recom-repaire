package recom.interceptor;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;

@SuppressWarnings("serial")
public class ExceptionInterceptor extends AbstractInterceptor {

	private static final Logger logger = Logger.getLogger(ExceptionInterceptor.class);

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		try{
			return invocation.proceed();
		}catch(Exception e){
			//エラーログ出力
			logger.error("エラーが発生しました。", e);

		   //エラー画面に遷移
			return "../error/error.jsp";

		}

	}

}
