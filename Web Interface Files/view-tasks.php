<?php 
$userData = file_get_contents('userData.json');
$userData = json_decode($userData, true);
?>

<html lang="en">
<head>
<meta charset="utf-8"/>
<title>Homework Planner</title>
<style>
    form {display: inline;}
</style>
</head>
<body>

<h2 id="htwo">Upcoming tasks:</h2>
<table style="width:100%">
<tr>
<?php 
foreach($userData["courses"] as $k=>$v){
    foreach($v as $k2=>$v2){
        echo "<td>";
        echo $v2;
        echo "</td>";
    }
}
?>
</tr>
<?php
foreach($userData["assignments"] as $k1=>$v1) {
    foreach($v1 as $k2=>$v2) {
        echo $k2;
        echo ": ";
        echo $v2;
        echo "<br>";
    }
    echo "<br>";
}
?>
</table>
<p id="par">
What would you like to do now?<br><br>
<form action="add-assignment.php" method="post">
<input type="submit" value="Add Assignments">
</form>
<form action="view-tasks.php" method="post">
<input type="submit" value="View Tasks">
</form>
<form action="add-grades.php" method="post">
<input type="submit" value="Add Grades">
</form>
<form action="view-gradebook.php" method="post">
<input type="submit" value="View Gradebook">
</form>
</p>

</body>
</html>
