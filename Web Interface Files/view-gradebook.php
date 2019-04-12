<?php 
$userData = file_get_contents('userData.json');
$userData = json_decode($userData, true);
function letterGrade($pts){
    if($pts >= 90) {return "A";}
    elseif($pts >= 80) {return "B";}
    elseif($pts >= 70) {return "C";}
    elseif($pts >= 60) {return "D";}
    else {return "E";}
}
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

<h2 id="htwo">Grades:</h2>
<table valign="top">
<tr>
<?php
foreach($userData["courses"] as $k1=>$v1) {
    if ($k1!="") {
    echo "<td valign='top'>";
    echo "<h2>";
    echo $k1;
    echo "</h2>";
    $examEarned = 0.0;
    $examPoss = 0.0;
    $assgnEarned = 0.0;
    $assgnPoss = 0.0;
    $quizEarned = 0.0;
    $quizPoss = 0.0;
    foreach($v1 as $k2=>$v2) {
        if($k2 == "Exams"){
            echo "<h3 valign='top'>";
            echo $k2;
            echo ": </h3>";
            echo "<p style='height:100; overflow-x:auto;'>";
            foreach($v2 as $k3=>$v3) {
                foreach($v3 as $k4=>$v4) {
                    if($k4 == "ptsPossible") {$examPoss = $examPoss + floatval($v4);}
                    if($k4 == "ptsEarned") {$examEarned = $examEarned + floatval($v4);}
                    echo $v4;
                    echo "<br>";
                }
            }
            echo "</p>";
        }
        if($k2 == "Assignments"){
            echo "<h3 valign='top'>";
            echo $k2;
            echo ": </h3>";
            echo "<p style='height:100; overflow-x:auto;'>";
            foreach($v2 as $k3=>$v3) {
                foreach($v3 as $k4=>$v4) {
                    if($k4 == "ptsPossible") {$assgnPoss = $assgnPoss + floatval($v4);}
                    if($k4 == "ptsEarned") {$assgnEarned = $assgnEarned + floatval($v4);}
                    echo $v4;
                    echo "<br>";
                }
            }
            echo "</p>";
        }
        if($k2 == "Quizzes"){
            echo "<h3>";
            echo $k2;
            echo ": </h3>";
            echo "<p style='height:100; overflow-x:auto;'>";
            foreach($v2 as $k3=>$v3) {
                foreach($v3 as $k4=>$v4) {
                    if($k4 == "ptsPossible") {$quizPoss = $quizPoss + floatval($v4);}
                    if($k4 == "ptsEarned") {$quizEarned = $quizEarned + floatval($v4);}
                    echo $v4;
                    echo "<br>";
                }
            }
           echo "</p>";
        }
        if($k2 == "aweight") {$assgnWgt = floatval($v2);}
        if($k2 == "eweight") {$examWgt = floatval($v2);}
        if($k2 == "qweight") {$quizWgt = floatval($v2);}
    }
    $examPts = $examWgt * ($examEarned/$examPoss);
    $assgnPts = $assgnWgt * ($assgnEarned/$assgnPoss);
    $quizPts = $quizWgt * ($quizEarned/$quizPoss);
    
    echo "<h3> Overall Grade: </h3>";
    echo ($examPts + $assgnPts + $quizPts);
    echo "\t";
    echo letterGrade(($examPts + $assgnPts + $quizPts));
    echo "<br>";
    echo "</td>";
}
}
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

