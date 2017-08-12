
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Information</title>
    </head>
    <body>
        <h1>Customer Information:</h1>
        <table style="background-color:graytext;background: green;color: white;width: 100%" border="1">
            
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Contact No:</th>
                <th>Status</th>
            </tr>
            <tr th:each="c: ${customers}">
                <td th:text="${c.customerId}"></td>
                <td th:text="${c.firstName}+' '+${c.lastName}"></td>
                <td th:text="${c.email}"></td>
                <td th:text="${c.contactNo}"></td>
                <td th:text="${c.status}"></td>
                
            </tr>
        </table>
    </body>
</html>
