# COMP_055-project-tanks
groupproject-team-1-spacey created by GitHub Classroom

Part 1
The feature that I will be implementing is a leaderboard. This will be done using file IO by writing scores and appending them to a file.
It will then be able to read that file and display it in a scoreboard.

Part 2
Method named writeLeaderboard
  Create text file named leaderboard
  check if file already exists
  create a filewrite
  create a new burffered writer
  append score
  close file
  exception handling
Method named readLeaderboard
  open text file named leaderboard
  iterate through file getting the top 5 scores
  return an arraylist of the scores

Finished Implementation
1. Load Game
2. Enter the Scoreboard menu
3. See scores from previous games
To verify that the readLeaderboard method is reading scores from the file you can also change the scores in leaderboard.txt or play a game to add a score to leaderboard.txt
