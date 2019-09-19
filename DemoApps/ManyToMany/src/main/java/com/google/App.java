package com.google;

import java.util.HashSet;
import java.util.Set;

import com.google.dao.Student;
import com.google.dao.StudentDAO;
import com.google.dao.course;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
       StudentDAO dao = new StudentDAO();
       course java = new course(1,"java");
       course hadoop = new course(2,"Hadoop");
       course datascience = new course(3,"DataScience");
       course spark = new course(4,"spark");
       
       
       Set<course>  saiset = new HashSet<course>();
       saiset.add(java);
       saiset.add(spark);
       
       Set<course> umeshset = new HashSet<course>();
       umeshset.add(spark);
       umeshset.add(hadoop);
       
       Set<course> laxmanset = new HashSet<course>();
       laxmanset.add(datascience);
       laxmanset.add(spark);
       
       
       Student studentumesh = new Student(1202,"umesh");
       studentumesh.setCourseSet(umeshset);
       
       Student studentsai = new Student(1201,"sai");
       studentsai.setCourseSet(saiset);
       
       Student studentlaxman = new Student(1203,"laxman");
       studentlaxman.setCourseSet(laxmanset);
     
         dao.saveOrupdate(studentsai);
         dao.saveOrupdate(studentumesh);
         dao.saveOrupdate(studentlaxman);
       
       
       

    }
}
