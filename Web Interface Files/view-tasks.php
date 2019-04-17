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
<table>
<tr>
<?php
foreach($userData["courses"] as $k1=>$v1) {
    if ($k1!="") {
    echo "<td valign='top'>";
    echo "<h2>";
    echo $k1;
    echo "</h2>";
    foreach($v1 as $k2=>$v2) {
        if($k2 == "Assignments"){
            echo "<h3>";
            echo $k2;
            echo ": </h3>";
            echo "<p style='height:100; overflow-x:auto;'>";
            foreach($v2 as $k3=>$v3) {
                foreach($v3 as $k4=>$v4) {
                    //if($k4 === "isGraded") {
                        //if(!$v4){
                            echo $v4;
                            echo "<br>";
                      //  }
                    //}
                }
            }
            echo "</p>";
        }
    }
    echo "</td>";
}}
?>
</tr>
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



