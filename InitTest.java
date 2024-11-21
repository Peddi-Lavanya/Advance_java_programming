@WebServlet(
        {urlPatterns={/InitTest},
        initParams={
		@WebInitParam(name="email",value="Lavanya@gmail.com")
		})
public class InitTest extends HttpServlet{
protected void doPost(httpServletRequest request,httpServletResponse response)throws ServletException,IOException{
PrintWriter out=response.getWriter();
System.out.println(<font color=red size=25><marquee>Welcome to tall grass</marquee></font>);
ServletConfig config=getServletConfig();
String name=config.getInitParameters("email");
System.out.println(name);
}
}