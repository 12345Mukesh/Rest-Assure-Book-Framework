package apiendpoints;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import api.ObjectRepo.FileUtility;

import api.payload.Books;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BookPropEndPoints 
{

	 static FileUtility fu= new FileUtility();
	public static Response CreateBook(Books payload) throws IOException
	{
		
		String post=fu.ReadDatafromPropfile("post_url");
		
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when().post(post);

        return response;


    }

    public static Response GetBook(int id) throws IOException 
    {
    	String get=fu.ReadDatafromPropfile("get_url");
        Response response = given()
                .pathParam("id", id)
                .when().get(get);

        return response;


    }
    public static Response GetallBooks() throws IOException 
    {
    String getall=fu.ReadDatafromPropfile("get_all_url");
        Response response = given()

                .when().get(getall);

        return response;


    }

    public static Response UpdateBooks(int id, Books payload) throws IOException 
    {
    	String update=fu.ReadDatafromPropfile("put_url");
        Response response = given().
                contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("id", id).
                body(payload).
                when().put(update);

        return response;


    }

    public static Response DeleteBooks(int id) throws IOException 
    {
     String delete=fu.ReadDatafromPropfile("delete_url");
        Response response = given()
                .pathParam("id", id)
                .when().delete(delete);

        return response;


    }
	
	
	
	
}
