@main def hello: Unit = 
  var i, j = 2;
  var m, n = 5;
  var f = 12.0f;
  var g = 4.0f;
  var c:Int = 'X';
  var k:Float = 2;

  var expression1 = k + 12 * m;
  var expression2 = m / j;
  var expression3 = n % j;
  var expression4 = m / j * j;
  var expression5 = f + 10 * 5 + g;
  var expression6 = (i+1) * n;

  /*
  println(expression1)
  println(expression2)
  println(expression3)
  println(expression4)
  println(expression5)
  println(expression6)
  */
  
  var (a:Int, b:Int, d:Int) = (2, 3, 5);
  c = 4;
  k = 4.3f;

  println((b-1) * a + c * d)
  println(a+1)
  println(-2 * (g-k) + c)
  c = c+1
  println(c)
  println(c * a)
  

  
