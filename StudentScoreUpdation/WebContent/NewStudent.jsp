<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Student Score Updated Form</title>		
</head>
<body>
<form action="details.obj">	
		<h1 align="center" color="red"><mark>New Student Score Updated Form</mark></h1>   								<!--open form-->
		<table align="center" width="90%" border="5" background-color=rgb{153,204,253}>	
		   <tr>		
				<td align="left">Studentname <sup>*</sup></td>
				<td>
					<input type="text" name="txtname" id="txtname" required/></textarea>
				</td>
			</tr>
			<tr>
				<td align="left">Age <sup>*</sup></td>
				<td>
					<input type="text" name="txtage" id="txtage" required/></textarea>
				</td>
			</tr>
			<tr>
				<td align="left">State<sup>*</sup></td>
				<td>
					<select id="state" name="state" required>
					<OPTION VALUE="Tamilnadu">Tamilnadu</OPTION>
					<OPTION VALUE="Karnataka">Karnataka</OPTION>
					<OPTION VALUE="Pune">Pune</OPTION>
					<OPTION VALUE="Mumbai">Mumbai</OPTION>
					</select>
				</td>
				
			</tr>
			<tr>
				<td  align="left">Gender <sup>*</sup></td>
				<td>
					<input type="text" name="txtgen" id="txtgen" required/></textarea>
				</td>
			</tr>
			<tr>
				<td  align="left">No of Subjects scored Centum<sup>*</sup></td>
				<td>
					<input type="text" name="txtno" id="txtno"  required/>
				</td>
			</tr>
			<tr>
				<td  align="left">No Of attempts <sup>*</sup></td>
				<td>
					<input type="text" name="txtatt" id="txtatt"  required/>
				</td>
			</tr>
			<tr>
				<td  align="left">Total subject Scores<sup>*</sup></td>
				<td>
					<input type="text" name="txttot" id="txttot"  required/>
				</td>
			</tr>
			<tr><td  colspan="2" align="center"><mark><input type="submit" value="SubmitStudentData"></td></tr>
			</table>
			</form>
</body>
</html>