# Projet_WoT_Sparql
Les requettes sparql.
*******************----------------------------***************************
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

public class Partie2 {
	static final String inputFileName  = "aarhus_parking.ttl";
    
    public static void main (String args[]) {
        // create an empty model
        Model model = ModelFactory.createDefaultModel();

        InputStream in = FileManager.get().open( inputFileName );
        if (in == null) {
            throw new IllegalArgumentException( "File: " + inputFileName + " not found");
        }
        
        // read the RDF/XML file
        model.read(in, null , "TTL");
                    
        // write it to standard out
        model.write(System.out);   
        
        /*--------------L’object (streamEvent)------------------*/
        
        /*String queryString= "PREFIX ct: <http://www.insight-centre.org/citytraffic#>" + 
        		"PREFIX ns1: <http://purl.oclc.org/NET/ssnx/ssn#> " + 
        		"PREFIX prov: <http://purl.org/NET/provenance.owl#>" + 
        		"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
        		"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + 
        		"PREFIX sao: <http://iot.ee.surrey.ac.uk/citypulse/resources/ontologies/sao.ttl> " + 
        		"PREFIX tl: <http://purl.org/NET/c4dm/timeline.owl#> " + 
        		"PREFIX xml: <http://www.w3.org/XML/1998/namespace> " + 
        		"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> " + 
        		"PREFIX unit0: <http://purl.oclc.org/NET/muo/citypulse/unit/traffic> " +
        			"SELECT ?x\n" + 
        			"WHERE {?x rdf:type sao:streamEvent}";
        Query query= QueryFactory.create(queryString) ;
        QueryExecution qexec= QueryExecutionFactory.create(query, model) ;
        ResultSet results= qexec.execSelect() ;
        ResultSetFormatter.out(System.out, results, query);
        */
        
        /*--------------Temps de début (start) et temps de fin (end)-----------------*/
        /*String queryString= "PREFIX ct: <http://www.insight-centre.org/citytraffic#>" + 
        		"PREFIX ns1: <http://purl.oclc.org/NET/ssnx/ssn#> " + 
        		"PREFIX prov: <http://purl.org/NET/provenance.owl#>" + 
        		"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
        		"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + 
        		"PREFIX sao: <http://iot.ee.surrey.ac.uk/citypulse/resources/ontologies/sao.ttl> " + 
        		"PREFIX tl: <http://purl.org/NET/c4dm/timeline.owl#> " + 
        		"PREFIX xml: <http://www.w3.org/XML/1998/namespace> " + 
        		"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> " + 
        		"PREFIX unit0: <http://purl.oclc.org/NET/muo/citypulse/unit/traffic> " +
        			"SELECT ?end ?start\n" + 
        			"WHERE {?x a sao:streamEvent. ?x sao:time ?y. ?y a tl:Interval. ?y tl:end ?end. ?y tl:start ?start.}";
        Query query= QueryFactory.create(queryString) ;
        QueryExecution qexec= QueryExecutionFactory.create(query, model) ;
        ResultSet results= qexec.execSelect() ;
        ResultSetFormatter.out(System.out, results, query);
        */
        
        /*--------------Unité de mesure (hasUnitOfMeasurement)--------------*/
       /*String queryString= "PREFIX ct: <http://www.insight-centre.org/citytraffic#>" + 
        		"PREFIX ns1: <http://purl.oclc.org/NET/ssnx/ssn#> " + 
        		"PREFIX prov: <http://purl.org/NET/provenance.owl#>" + 
        		"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
        		"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + 
        		"PREFIX sao: <http://iot.ee.surrey.ac.uk/citypulse/resources/ontologies/sao.ttl> " + 
        		"PREFIX tl: <http://purl.org/NET/c4dm/timeline.owl#> " + 
        		"PREFIX xml: <http://www.w3.org/XML/1998/namespace> " + 
        		"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> " + 
        		"PREFIX unit0: <http://purl.oclc.org/NET/muo/citypulse/unit/traffic> " +
        			"SELECT ?unite\n" + 
        			"WHERE {?x sao:Point ?y. ?y a unit0:vehicle-count. ?y sao:hasUnitOfMeasurement ?unite}";
        Query query= QueryFactory.create(queryString) ;
        QueryExecution qexec= QueryExecutionFactory.create(query, model) ;
        ResultSet results= qexec.execSelect() ;
        ResultSetFormatter.out(System.out, results, query);
        */
        
        /*--------------Temps d’observation (tl:at)------------------*/
       /*String queryString= "PREFIX ct: <http://www.insight-centre.org/citytraffic#>" + 
        		"PREFIX ns1: <http://purl.oclc.org/NET/ssnx/ssn#> " + 
        		"PREFIX prov: <http://purl.org/NET/provenance.owl#>" + 
        		"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
        		"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + 
        		"PREFIX sao: <http://iot.ee.surrey.ac.uk/citypulse/resources/ontologies/sao.ttl> " + 
        		"PREFIX tl: <http://purl.org/NET/c4dm/timeline.owl#> " + 
        		"PREFIX xml: <http://www.w3.org/XML/1998/namespace> " + 
        		"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> " + 
        		"PREFIX unit0: <http://purl.oclc.org/NET/muo/citypulse/unit/traffic> " +
        			"SELECT ?temps\n" + 
        			"WHERE {?x a sao:Point. ?x sao:time ?y. ?y a tl:Instant;. ?y tl:at ?temps. }";
        Query query= QueryFactory.create(queryString) ;
        QueryExecution qexec= QueryExecutionFactory.create(query, model) ;
        ResultSet results= qexec.execSelect() ;
        ResultSetFormatter.out(System.out, results, query);
		*/
        
        /*-------------La longitude (hasLongitude)et la latitude (hasLatitude)---------------*/
        /*String queryString= "PREFIX ct: <http://www.insight-centre.org/citytraffic#>" + 
        		"PREFIX ns1: <http://purl.oclc.org/NET/ssnx/ssn#> " + 
        		"PREFIX prov: <http://purl.org/NET/provenance.owl#>" + 
        		"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
        		"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + 
        		"PREFIX sao: <http://iot.ee.surrey.ac.uk/citypulse/resources/ontologies/sao.ttl> " + 
        		"PREFIX tl: <http://purl.org/NET/c4dm/timeline.owl#> " + 
        		"PREFIX xml: <http://www.w3.org/XML/1998/namespace> " + 
        		"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> " + 
        		"PREFIX unit0: <http://purl.oclc.org/NET/muo/citypulse/unit/traffic> " +
        			"SELECT ?longitude ?latitude \n" + 
        			"WHERE {?x a sao:FeatureOfInterest. ?x ct:hasFirstNode ?y. ?y a ct:Node. ?y ct:hasLongitude ?longitude. ?y ct:hasLatitude ?latitude.}";
        Query query= QueryFactory.create(queryString) ;
        QueryExecution qexec= QueryExecutionFactory.create(query, model) ;
        ResultSet results= qexec.execSelect() ;
        ResultSetFormatter.out(System.out, results, query);
        */
        
		/*------------------------------Le nom du nœud (hasNodeName)-------------------------------------*/
        /*String queryString= "PREFIX ct: <http://www.insight-centre.org/citytraffic#>" + 
				"PREFIX ns1: <http://purl.oclc.org/NET/ssnx/ssn#> " + 
				"PREFIX prov: <http://purl.org/NET/provenance.owl#>" + 
				"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
				"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + 
				"PREFIX sao: <http://iot.ee.surrey.ac.uk/citypulse/resources/ontologies/sao.ttl> " + 
				"PREFIX tl: <http://purl.org/NET/c4dm/timeline.owl#> " + 
				"PREFIX xml: <http://www.w3.org/XML/1998/namespace> " + 
				"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> " + 
				"PREFIX unit0: <http://purl.oclc.org/NET/muo/citypulse/unit/traffic> " +
					"SELECT ?name\n" + 
					"WHERE {?x a sao:FeatureOfInterest. ?x ct:hasFirstNode ?y. ?y a ct:Node. ?y ct:hasNodeName ?name.}";
		Query query= QueryFactory.create(queryString) ;
		QueryExecution qexec= QueryExecutionFactory.create(query, model) ;
		ResultSet results= qexec.execSelect() ;
		ResultSetFormatter.out(System.out, results, query);
        */
        
        /*--------------------Les valeurs (sao:value)-----------------------*/
		/*String queryString= "PREFIX ct: <http://www.insight-centre.org/citytraffic#>" + 
				"PREFIX ns1: <http://purl.oclc.org/NET/ssnx/ssn#> " + 
				"PREFIX prov: <http://purl.org/NET/provenance.owl#>" + 
				"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
				"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + 
				"PREFIX sao: <http://iot.ee.surrey.ac.uk/citypulse/resources/ontologies/sao.ttl> " + 
				"PREFIX tl: <http://purl.org/NET/c4dm/timeline.owl#> " + 
				"PREFIX xml: <http://www.w3.org/XML/1998/namespace> " + 
				"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> " + 
				"PREFIX unit0: <http://purl.oclc.org/NET/muo/citypulse/unit/traffic> " +
					"SELECT ?value\n" + 
						"WHERE {?x a sao:Point. ?x sao:value ?value.}"; 
					//"WHERE {?x a sao:Point. ?x sao:hasUnitOfMeasurement ?y. ?x sao:time ?y. ?y a tl:Instant. ?y sao:value ?value.}"; 
		Query query= QueryFactory.create(queryString) ;
		QueryExecution qexec= QueryExecutionFactory.create(query, model) ;
		ResultSet results= qexec.execSelect() ;
		ResultSetFormatter.out(System.out, results, query);
        */

        /*-----------------------------Afiichage --------------------------------------*/
        /*String queryString= "PREFIX ct: <http://www.insight-centre.org/citytraffic#>" + 
				"PREFIX ns1: <http://purl.oclc.org/NET/ssnx/ssn#> " + 
				"PREFIX prov: <http://purl.org/NET/provenance.owl#>" + 
				"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
				"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + 
				"PREFIX sao: <http://iot.ee.surrey.ac.uk/citypulse/resources/ontologies/sao.ttl> " + 
				"PREFIX tl: <http://purl.org/NET/c4dm/timeline.owl#> " + 
				"PREFIX xml: <http://www.w3.org/XML/1998/namespace> " + 
				"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> " + 
				"PREFIX unit0: <http://purl.oclc.org/NET/muo/citypulse/unit/traffic> " +
					"SELECT ?x\n" + 
					"WHERE {?x a sao:FeatureOfInterest. ?x ct:hasFirstNode ?y.?y ct:hasLongitude ?longitude. ?y ct:hasLatitude ?latitude.}";
		Query query= QueryFactory.create(queryString) ;
		QueryExecution qexec= QueryExecutionFactory.create(query, model) ;
		ResultSet results= qexec.execSelect() ;
		ResultSetFormatter.out(System.out, results, query);
		*/
		
    }
}
*------------------------*/
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

