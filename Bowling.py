
def totalScore(frames, bonusRolls):
  if len(frames) == 0:
    return 0
  else:
    x,xs = frames[0],frames[1:]
    
    return frameScore(x,     bonusRolls) + totalScore(xs, bonusRolls)
