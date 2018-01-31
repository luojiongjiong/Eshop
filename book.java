import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

public class book {
    private String name;

    public static void main(String[] args) {
        String age = "sfreogjrioegjioer";
        System.out.println("sfheuw");
        age = getInfr(age);
    }


    public static String getInfr(String age) {
        return age.substring(0, age.length() - 2);
    }

    public Integer setCount(Integer i) {
        return i;
    }

    public String getName(String name) {
        return this.name = name;
    }

    public boolean getOffset() {
        return false;
    }
}
      /*  public Object login (String loginacct, String userpswd, HttpSession session){
            // start();

            try {
                Member member = memberService.queryMemberByLogin(loginacct);

                if (member != null) {
                    if (userpswd.equals(member.getUserpswd())) {

                        session.setAttribute(Const.LOGIN_MEMBER, member);

                        //success(true);
                    } else {
                        //success(false);
                    }

                } else {
                    //success(false);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            return "";
        }*/
