<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="content-wrapper">
	<div class="container-fluid">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="#">Layout</a></li>
			<li class="breadcrumb-item active">View Packages</li>
			<li class="breadcrumb-item"><a class="btn btn-primary right"
				href='<spring:url value="/Admin/Dashboard"/>'>Back</a></li>
		</ol>
		<div class="alert alert-primary text-center" role="alert">
			<h2>Posted Flight List</h2>
		</div>

		<h3
			style="color: red; background-color: white; margin-right: 150px; margin-left: 150px;">${requestScope.message}</h3>
		
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Sr No</th>
					<th scope="col"> Image</th>
					<th scope="col">Title</th>
					<th scope="col">Price</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<%
					int sr_no = 0;
				%>
				<c:forEach var="pac" items="${sessionScope.packages}">

					<tr>
						<th scope="row">${sr_no=sr_no+1}</th>
						<td><img src="data:image/jpeg;base64,${pac.imgUtility}" height=100px width=100px/></td>
						<td>${pac.title}</td>
						<td>${pac.price}</td>
						<td> <a
									href='<spring:url value="/Admin/package_delete?pid=${pac.id}"/>'><button
											type="button" class="btn btn-danger">
											<i class="far fa-trash-alt"></i>
										</button></a></td>
					</tr>
					</c:forEach>
			</tbody>
		</table>

	</div>
</div>

