package nl.mdevcon.speakerslist;

import java.util.Date;

public class Speakers {
   final String name;
   final String title;
   final String synapsis;
   final Date dateSubmitted;

   public Speakers(String name, String title, String synapsis, Date dateSubmitted) {
      this.name = name;
      this.title = title;
      this.synapsis = synapsis;
      this.dateSubmitted = dateSubmitted;
   }
}
