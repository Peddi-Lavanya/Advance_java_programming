public class StudentDetails extends HttpServlet{
protected void doPost(httpServletRequest request,httpServletResponse response)throws ServletException,IOException{
PrintWriter out=response.getWriter();
Enumeration e=request.getParameterNames();
while(e.hasMoreElement()){
String s=e.nextElement();
String value=request.getParameter(s);
System.out.println(value);
}
}
}