@main def hello: Unit = 

  def NoofAttendees(ticketPrice:Double):Double = 120 + (15-ticketPrice) / 5*20

  def Revenue(ticketPrice:Double):Double = NoofAttendees(ticketPrice) * ticketPrice

  def Cost(ticketPrice:Double):Double= 500 + 3 * NoofAttendees(ticketPrice)
  
  def Profit(ticketPrice:Double):Double = Revenue(ticketPrice) - Cost(ticketPrice)

  