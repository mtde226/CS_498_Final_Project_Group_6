
<?php

$username = $_POST["user"];
echo 'Hello ' . $username;

$userData = file_get_contents("userData.json");
$arr = json_decode($userData, true);
if (array_search($username, $arr) == FALSE)
{
        echo 'User not found.';
        // revert to homepage
        header("Location: home.html");
        exit();
}
?>

<html>
<html lang="en">
<head>
<meta charset="utf-8"/>
<title>Homework Planner</title>
<style>
    form {display: inline;}
</style>
</head>
<body>

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

