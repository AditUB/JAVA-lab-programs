
class Staff
{
    public int staffid;
    public String name;
    public int Phone;
    public int Salary;
    Staff(int staffid,String name,int Phone,int Salary)
    {
        this.staffid=staffid;
        this.name=name;
        this.Phone=Phone;
        this.Salary=Salary;
    }

}
class Teaching extends Staff
{
    public String Domain;
    public String Publication;

    public Teaching(int staffid,String name,int Phone,int Salary,String Domain,String Publications)
    {
        super(staffid,name,Phone,Salary);
        this.Domain=Domain;
        this.Publication=Publications;
    }
    public String toString()
    {
        return ("Staff id"+staffid+"Staff name:"+name+"Phone no"+Phone+"Salary"+Salary+" Teaching "+Domain+"Publications"+Publication);
    }
}
class Technical extends Staff
{
    String skill;

    Technical(int id,String name,int Phone,int Salary,String Skill)
    {
        super(id,name,Phone,Salary);
        this.skill=Skill;
    }
    public String toString()
    {
        return "Staff id"+staffid+"Staff name:"+name+"Phone no"+Phone+"Salary"+Salary+"Skill"+skill;
    }
}
class Contract extends Staff
{
    int period;
    Contract(int staffid,String name,int Phone,int Salary,int period)
    {
        super(staffid,name,Phone,Salary);
        this.period=period;
    }
    public String toString()
    {
        return "Staff id"+staffid+"Staff name:"+name+"Phone no"+Phone+"Salary"+Salary+"Contract"+period;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Teaching obj1=new Teaching(7,"Mr Jackson",1222212,200000,"Unit Testing","Selenium");
        Technical obj2=new Technical(4,"Ms Sunday",1233333,230000,"Problem Solving");
        Contract obj3=new Contract(9,"Mr John",2342342,230000,5);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
