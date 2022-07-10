@main def hello: Unit = 

  def NormalPay(h:Int):Double= h * 250.00  

  def OTPay(h:Int):Double = h * 85.00

  def Income(normal:Double, ot:Double):Double = normal + ot

  def TaxReduce(income:Double):Double = income * 12/100

  def TakeHomeSalary(income:Double, tax:Double):Double = income - tax
  