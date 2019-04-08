// Try edit msg

var userData = JSON.parse(data);
for (int k = 0; k < userData.length; k++) {
  for (var i = 0; i < courses.length; i++) {
    for (var j = 0; userData[0].courses[i].assignments.length; j++) {
      userData[0].courses[i].assignment_earned += userData[0].courses[i].assignments[j].points_earned;
      userData[0].courses[i].assignment_total += userData[0].courses[i].assignments[j].points_total;
      var grade = userData[0].courses[i].assignments[j]/userData[0].courses[i].assignments[j].points_total;
      if (grade > 0.90)
        courses[i].assignments[j].grade = 'A';
      else if (grade > 0.80)
        courses[i].assignments[j].grade = 'B';
      else if (grade > 0.70)
        courses[i].assignments[j].grade = 'C';
      else if (grade > 0.60)
        courses[i].assignments[j].grade = 'D';
      else
        courses[i].assignments[j].grade = 'F';
    }
    for (var j = 0; userData[0].courses[i].exams.length; i++) {
      userData[0].courses[i].exams_earned += userData[0].courses[i].exams[j].points_earned;
      userData[0].courses[i].exams_total += userData[0].courses[i].exams[j].points_total;
      var grade = userData[0].courses[i].exams[j]/userData[0].courses[i].exams[j].points_total;
      if (grade > 0.90)
        userData[0].courses[i].exams[j].grade = 'A';
      else if (grade > 0.80)
        userData[0].courses[i].exams[j].grade = 'B';
      else if (grade > 0.70)
        userData[0].courses[i].exams[j].grade = 'C';
      else if (grade > 0.60)
        userData[0].courses[i].exams[j].grade = 'D';
      else
        userData[0].courses[i].exams[j].grade = 'F';
    }
    for (var j = 0; userData[0].courses[i].quizes.length; i++) {
      userData[0].courses[i].quizes_earned += userData[0].courses[i].quizes[j].points_earned;
      userData[0].courses[i].quizes_total += userData[0].courses[i].quizes[j].points_total;
      var grade = userData[0].courses[i].quizes[j]/userData[0].courses[i].quizes[j].points_total;
      if (grade > 0.90)
        userData[0].courses[i].quizes[j].grade = 'A';
      else if (grade > 0.80)
        userData[0].courses[i].quizes[j].grade = 'B';
      else if (grade > 0.70)
        userData[0].courses[i].quizes[j].grade = 'C';
      else if (grade > 0.60)
        userData[0].courses[i].quizes[j].grade = 'D';
      else
        userData[0].courses[i].quizes[j].grade = 'F';
    }
    var grade_Percent = userData[0].courses[i].assignment_earned/userData[0].courses[i].assignment_total*userData[0].courses[i].assignment_weight + userData[0].courses[i].exams_earned/userData[0].courses[i].exams_total*userData[0].courses[i].exams_weight + userData[0].courses[i].quizes_earned/userData[0].courses[i].quizes_total*userData[0].courses[i].quizes_weight;
    if (grade_Percent > 0.90)
        userData[0].courses[i].grade = 'A';
      else if (grade_Percent > 0.80)
        userData[0].courses[i].grade = 'B';
      else if (grade_Percent > 0.70)
        userData[0].courses[i].grade = 'C';
      else if (grade_Percent > 0.60)
        userData[0].courses[i].grade = 'D';
      else
        userData[0].courses[i].grade = 'F';
  }
}
