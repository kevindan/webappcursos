<%-- 
    Document   : lugares
    Created on : 27/09/2018, 12:54:56 PM
    Author     : dacunac
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="models.Alumno"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%
    List<Alumno> alumnos = (ArrayList<Alumno>) request.getAttribute("listadoAlumnos");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%= request.getContextPath() %>/assets/css/app.css" rel="stylesheet" type="text/css"/> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
		<!-- Optional theme -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <title>Listado de Alumnos| MARKHAM COLLEGE</title>
    </head>
    
    <body>
        <%@include file="../WEB-INF/fragments/header.jspf" %>

        <section>
        	<% 
        		DecimalFormat formatodecimal = new DecimalFormat("#.00");
        		for(Alumno alumno : alumnos){        			
        	%>
        	<div class="panel panel-primary">
           		<div class="panel-heading">
           			<h4 class="ponel-heading">COD : <%=alumno.getIdAlumno()%>&nbsp;&nbsp;&nbsp; Nombres y Apellidos : <%=alumno.getNombre()+ " "+alumno.getAppaterno()+" "+alumno.getApmaterno() %></h4>
           		</div>
           		<div class="panel-body">
           			<table>
           				<thead>
           					<tr>
           						<th class="text-center">Curso</th>
           						<th class="text-center">Nota 1</th>
           						<th class="text-center">Nota 2</th>
           						<th class="text-center">Nota 3</th>
           						<th class="text-center">Nota 4</th>
           						<th class="text-center">Nota 5</th>
           						<th class="text-center">Nota 6</th>
           						<th class="text-center">Nota 7</th>
           						<th class="text-center">Promedio</th>
           						<th class="text-center">Situación</th>
           					</tr>
           				</thead>
           				<tbody>
           			<% 
           				double promedioCurso = 0.0;
           				double sumatoria=0.0;
           				double promedioGlobal = 0.0;
           				
           				String situacionCurso="";
           				String situacionGlobal="";
           				String coloClaseCurso="";
           				String coloClaseGlobal="";
           			
           				for(int i = 0; i < alumno.getCursos().size(); i++){
           					promedioCurso = (alumno.getCursos().get(i).getNota1()+
           						alumno.getCursos().get(i).getNota2()+
           						alumno.getCursos().get(i).getNota3()+
           						alumno.getCursos().get(i).getNota4()+
           						alumno.getCursos().get(i).getNota5()+
           						alumno.getCursos().get(i).getNota6()+
           						alumno.getCursos().get(i).getNota7())/7;
           					
           					sumatoria = sumatoria+promedioCurso;
           				
						if(promedioCurso >= 11){
           					situacionCurso = "Aprobado";
           					coloClaseCurso = "bg-success";
           				}else{
           					situacionCurso = "Desaprobado";
           					coloClaseCurso = "bg-danger";
           				}

           			%>
           				<tr>
           					<td><%=alumno.getCursos().get(i).getNombreCurso()%></td>
           					<td><%=alumno.getCursos().get(i).getNota1()%></td>
           					<td><%=alumno.getCursos().get(i).getNota2()%></td>
           					<td><%=alumno.getCursos().get(i).getNota3()%></td>
           					<td><%=alumno.getCursos().get(i).getNota4()%></td>
           					<td><%=alumno.getCursos().get(i).getNota5()%></td>
           					<td><%=alumno.getCursos().get(i).getNota6()%></td>
           					<td><%=alumno.getCursos().get(i).getNota7()%></td>
           					<td class="bg-warning"><%=formatodecimal.format(promedioCurso)%></td>
           					<td class="<%=coloClaseCurso%>"><%=situacionCurso%></td>
           				</tr>
           			<%		
           				} 
           				promedioGlobal = sumatoria/alumno.getCursos().size();
           				if(promedioGlobal >= 11){
           					situacionGlobal = "Aprobado";
           					coloClaseGlobal = "background-color:green;";
           				}else{
           					situacionGlobal = "Desaprobado";
           					coloClaseGlobal = "background-color:red;";
           				}
           			%>
           				</tbody>
           				<tfoot class="">
           					<tr>
           						<th colspan="8" class="text-center">Promedio General : </th>
           						<th class="text-center"style="color:black; background-color:yellow;"><%=formatodecimal.format(promedioGlobal)%></th>
           						<th class="text-center" style=" <%=coloClaseGlobal%>"><%=situacionGlobal%></th>
           					</tr>
           				</tfoot>
           			</table>
           		</div>           		
           </div>
        	<%        				
        			}        	
        	%>
        
        </section>

        <%@include file="../WEB-INF/fragments/footer.jspf" %>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </body>     
</html>