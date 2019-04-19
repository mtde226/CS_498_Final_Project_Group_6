<!--
If the user selects the 'Add Assignment' option, they are
redirected to this page, which collects information about the
assignment via HTML form
-->

<html lang="en">
<head>
<meta charset="utf-8"/>
<title>Homework Planner</title>
<style>
    form {display: inline;}
</style>
</head>
<body>

<h3>Which course is this for?</h3>
<form action='assigned.php' method='post'>
<select name='selected_course'>
<?php 
$userData = file_get_contents('userData.json');
$userData = json_decode($userData);
var_dump($userData);
foreach($userData->courses as $key=>$value) { 
echo "<option value='"; echo $key; echo "'>"; echo $key; echo "</option>";
} ?>
</select>
<h3>What is the assignment?</h3>
<input type='text' name='label'>
<h3>When is it due?</h3>
<input type='date' name='dueDate'>
<input type='time' name='dueTime'>
<input type='submit' value='Continue'>
</form>

</body>
</html>
