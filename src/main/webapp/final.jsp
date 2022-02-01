<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="NewFile.css">
</head>
<body>
	<img alt="Logo" src="schoollogo.jpg" width="250" height="220" />

	<%-- <%
int m1=Integer.parseInt(request.getParameter("english"));
int m2=Integer.parseInt(request.getParameter("math"));
int m3=Integer.parseInt(request.getParameter("science"));
int m4=Integer.parseInt(request.getParameter("drawing"));
int m5=Integer.parseInt(request.getParameter("geography"));
int total =m1+m2+m3+m4+m5; 
%><br/>
<% 
out.println("total  is: " + total);
int avg=total/5;  %><br><br/>
<%
out.println("Average is:\n" + avg);  // showing average
%><br/>
<% 
int[] nums={m1,m2,m3,m4,m5};
int max=0;
for(int i=0; i<nums.length; i++ ) {
    if(nums[i]>max) {
       max = nums[i];
    }
 }
%><br/>
<% 
out.println("Maximun score is ::"+max);
int min=nums[0];
for(int i=1; i<nums.length; i++ ) {
    if(nums[i]<min) {
       min = nums[i];
    }
 }
%><br/><br/>
<%
out.println("Minimum score is ::"+min); %>
<br/><br/>
<%
if(avg >=94 && avg <=100 )
{
    out.println(" your grade is A++ ");
%><br/><br/>
<%
    out.println(" your grade point is 4.0");
}else if (avg >= 87 && avg<=93) {
  out.println("your grade is A");
  %><br/><br/>
  <%
  out.println(" your grade point is 3.7");
} else if (avg >= 80 && avg<=86) {
   out.println("your grade is A-");
   %><br/><br/>
   <%
   out.println(" your grade point is 3.5");
} else if (avg >= 77 && avg<=79){
    out.println("your grade is B+");
    %><br/><br/>
    <%
    out.println(" your grade point is 3.2");
} else if(avg >= 73 && avg<=76){
    out.println("your grade is B");
    %><br/><br/>
    <%
    out.println(" your grade point is 3.0");
}
else if(avg >= 70 && avg<=72){
    out.println("your grade is B-");
    %><br/><br/>
    <%
    out.println(" your grade point is 2.7");
}
else if(avg >= 67 && avg<=69){
    out.println("your grade is C+");
    %><br/><br/>
    <%
    out.println(" your grade point is 2.3");
}
else if(avg >= 63 && avg<=66){
    out.println("your grade is C");
    %><br/><br/>
    <%
    out.println(" your grade point is 2.0");
}
else if(avg >= 60 && avg<=62){
    out.println("your grade is C-");
    %><br/><br/>
    <%
    out.println(" your grade point is 1.7");
}
else if(avg >= 50 && avg<=59){
    out.println("your grade is D");
    %><br/><br/>
    <%
    out.println(" your grade point is 1.0");
}
else if(avg >= 0 && avg<=49){
    out.println("your grade is F");
    %><br/><br/>
    <%
    out.println(" your grade point is 0.0");
}
%> --%>

	<h3>
		grade is
		<%=request.getParameter("grade")%></h3>
	<h3>
		min is
		<%=request.getParameter("min")%></h3>
	<h3>
		max is
		<%=request.getParameter("max")%></h3>

	<h1>Group members::</h1>
	<h6>Shilpy Nanda C0796818</h6>
	<h6>Sophiya Maharjan C0795243</h6>
	<h6>Sumandeep Kaur C0784324</h6>
	<h6>Faruk Batur C0808880</h6>
	<h6>Harpreet Kaur C0793371</h6>
	<h6>Monica Ranjan Dayal C0805547</h6>
</body>
</html>