package uk.ac.ebi.age.tools.mmode;

import java.util.List;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

public class Options
{

 @Option(name = "-h", usage = "Database base URL", metaVar = "URL")
 private String       databaseURL;

 @Option(name = "-u", usage = "User name", metaVar = "USER")
 private String       user;

 @Option(name = "-p", usage = "User password", metaVar = "PASS")
 private String       password;

 @Option(name = "-t", usage = "Timeout (sec) ", metaVar = "TIMEOUT")
 private String       timeout;

 @Argument
 private List<String> args;

 public String getDatabaseURL()
 {
  return databaseURL;
 }

 public String getUser()
 {
  return user;
 }

 public String getPassword()
 {
  return password;
 }

 public void setDatabaseURI(String databaseURI)
 {
  this.databaseURL = databaseURI;
 }
 
 public List<String> getArgs()
 {
  return args;
 }

 public String getTimeout()
 {
  return timeout;
 }
}
