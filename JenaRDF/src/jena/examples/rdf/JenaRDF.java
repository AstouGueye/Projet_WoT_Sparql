package jena.examples.rdf;

import java.io.InputStream;


import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;

public class JenaRDF {
		static final String inputFileName  = "exo1.rdf";
        
	    public static void main (String args[]) {
	        // create an empty model
	        Model model = ModelFactory.createDefaultModel();

	        InputStream in = FileManager.get().open( inputFileName );
	        if (in == null) {
	            throw new IllegalArgumentException( "File: " + inputFileName + " not found");
	        }
	        
	        // read the RDF/XML file
	        model.read(in, "TTL");
	                    
	        // write it to standard out
	        model.write(System.out);   
	        
	        // Construction de la requête String 
	        String queryString= "PREFIX rdf:<http://purl.org/dc/elements/1.1/>"
	        		+ "SELECT ?type\n"
	        		+ "WHERE {<http://www.example.org/ex/webDonnees.html> "
	        		+ " rdf:type ?type}";
	        Query query= QueryFactory.create(queryString) ;
	        QueryExecution qexec= QueryExecutionFactory.create(query, model) ;
	        ResultSet results= qexec.execSelect() ;
	        ResultSetFormatter.out(System.out, results, query);
	        
	
	    }
	
	}
