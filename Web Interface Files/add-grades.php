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
<form action='graded.php' method='post'>
<select name='selected_course'>
<?php 
$userData = file_get_contents('userData.json');
$userData = json_decode($userData);
var_dump($userData);
foreach($userData->courses as $key=>$value) { 
echo "<option value='"; echo $key; echo "'>"; echo $key; echo "</option>";
} ?>
</select>
<h3>What is this grade for?</h3>
<input type='text' name='label'>
<h3>How many points did you receive?</h3>
<input type='number' min="0" name='score'>
<h3>How many points is this out of?</h3>
<input type='number' min="0" name='weight'>
<h3>Which category does this fall under?</h3>
<select name='category'>
<option value='Assignments'>Assignments</option>
<option value='Exams'>Exams</option>
<option value='Quizzes'>Quizzes</option>
</select>
<input type='submit' value='Continue'>
</form>

</body>
</html>
