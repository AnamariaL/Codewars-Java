/*Description:
For every good kata idea there seem to be quite a few bad ones!

In this kata you need to check the provided array (x) for good ideas 
'good' and bad ideas 'bad'. If there are one or two good ideas, return 
'Publish!', if there are more than 2 return 'I smell a series!'. 
If there are no good ideas, as is often the case, return 'Fail!'.*/
public class WellofIdeas_EasyVersion {
	 public static String well(String[] x) {
		  int s=0;
		    for(int i = 0;i < x.length; i++){
		       if(x[i] != "bad") s+=1;
		    }
		    if(s == 1 || s == 2) return "Publish!";
		    if(s > 2) return "I smell a series!"; 
		    return "Fail!";
		    } 
}
