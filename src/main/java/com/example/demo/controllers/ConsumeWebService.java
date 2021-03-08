package com.example.demo.controllers;

import java.nio.charset.Charset;

import java.util.Arrays;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entities.Issue;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

/*
final String uri = " https://api.github.com/repos/ " + repos.getUsername () + "/" + repos.getReposName ();
    	LOGGER.info ("uri ->" + uri); RestTemplate restTemplate = new RestTemplate ();
    	HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory ();
    	restTemplate.setRequestFactory (requestFactory); 
    	HttpHeaders headers = new HttpHeaders ();
    	headers.add ("Authorization", "token" + tokenGithub);
    	HttpEntity <RRepos> request = new HttpEntity <> (repos, headers); 
    	ReposResponse result = restTemplate.patchForObject (uri, request, ReposResponse.class);


	
}
*/

@RestController
public class ConsumeWebService {
	
	   @Autowired
	   private RestTemplate restTemplate;
	
	HttpHeaders createHeaders(String username, String password){
		   return new HttpHeaders() {{
		         String auth = username + ":" + password;
		         byte[] encodedAuth = Base64.encodeBase64( 
		            auth.getBytes(Charset.forName("US-ASCII")) );
		         String authHeader = "Basic " + new String( encodedAuth );
		         set( "Authorization", authHeader );
		      }};
		}


   @RequestMapping(value = "/issue")
   public String getIssueList() {
      HttpHeaders headers = new HttpHeaders();
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
      HttpEntity<String> entity = new HttpEntity<String>(headers);
      
      return restTemplate.exchange("https://eklas.atlassian.net/rest/api/2/issue/MFP-2", HttpMethod.GET, new HttpEntity<String>(createHeaders("eklasur.rahman@northsouth.edu", "mE3gd4uvH81thng7TeJOC2B2")), String.class).getBody();
   }
   
   @RequestBody
   @RequestMapping(value = "/createIssue", method = RequestMethod.POST)
      public String createProducts(@RequestBody Issue issue) {
	   
         HttpHeaders headers = new HttpHeaders();
         headers.createHeaders("eklasur.rahman@northsouth.edu", "mE3gd4uvH81thng7TeJOC2B2");
         headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
         
        HttpEntity<Issue> entity = new HttpEntity<Issue>(issue,headers);
        
         return restTemplate.exchange(
            "https://eklas.atlassian.net/rest/api/3/issue", HttpMethod.POST, new HttpEntity<Issue>(createHeaders("eklasur.rahman@northsouth.edu", "mE3gd4uvH81thng7TeJOC2B2")), Issue.class).getBody();
      }
   }
   
/*
@RequestBody
   @RequestMapping(value = "/createIssue", method = RequestMethod.POST)
      public ResponseEntity<Reponse> createIssue(@RequestBody Issue issue) {
	     Reponse resp = new Reponse();
	   	 resp.setNombre("Consume Web Service");
	   	 resp.setRegistros_status("SUCCESS");
         HttpHeaders headers = new HttpHeaders();
         headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
         HttpEntity<Issue> entity = new HttpEntity<Issue>(issue,headers);
         System.out.println(issue.toString());
         restTemplate.exchange("https://eklas.atlassian.net/rest/api/3/issue", HttpMethod.POST, new HttpEntity<String>(createHeaders("eklasur.rahman@northsouth.edu", "mE3gd4uvH81thng7TeJOC2B2")), String.class).getBody();
         return new ResponseEntity<Reponse>(resp, HttpStatus.OK);
      }
*/
   
   