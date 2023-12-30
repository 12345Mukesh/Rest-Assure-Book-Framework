package api.ObjectRepo;

public interface Routes
{

	 public static String base_url="https://fakerestapi.azurewebsites.net/api/v1/Books";
	    
	    
	    //Books module
	    public static String post_url=base_url;


	   
	    public static String get_all_url=base_url;

	    public static String get_url=base_url+"/{id}";

	    public static String put_url=base_url+"/{id}";

	    public static String delete_url=base_url+"/{id}";

	
	
}
