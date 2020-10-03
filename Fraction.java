
class Fraction{

  Integer num;
  Integer denom;

  public Fraction(int numerateur, int denominateur){
    num = numerateur;
    denom = denominateur;
  }

  @Override
  public String toString(){
    return num.toString() + "/" + denom.toString();
  }
}
