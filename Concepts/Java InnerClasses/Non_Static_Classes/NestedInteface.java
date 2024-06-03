/*
 
    Definition: Nested interfaces are interfaces declared within another interface or class.

     Nested interfaces cannot be accessed directly; they must be referred to by the outer interface or class that encloses them.

     Points :
     1) The nested interface must be public and static if it is declared inside the interface, but it can have any access modifier if declared within the class.
     2) Nested interfaces are declared static

        Within an Interface:
        Always public and static.
        Accessible to the whole package and beyond if the outer interface is public.
        
        Within a Class:
        Can have public, protected, private, or default access modifiers.
        If public, accessible to the whole package and beyond.
        If protected or default (no modifier), accessible within the same package.
        If private, accessible only within the outer class.

 */



 interface Rapper
 {
    abstract void rap();
    abstract void freestyle();
    abstract void perform();


    interface Lyricist
    {
        abstract void writeLyrics();
        abstract void constructBars();
    }

    interface GhostWriter
    {
        abstract void developFlow();
        abstract void deliverDissLines();
    }

 } 


  class LyricistRapper implements Rapper.Lyricist {
    @Override
    public void writeLyrics() {
        System.out.println("Lyricist is writing lyrics...");
    }

  
    @Override
    public void constructBars() {
        System.out.println("Lyricist is constructing bars...");
    }
}


 class GhostWriter implements Rapper.GhostWriter {
    @Override
    public void developFlow() {
        System.out.println("GhostWriter is developing flow...");
    }

  
    @Override
    public void deliverDissLines() {
        System.out.println("Battle Rapper is delivering diss lines...");
        }
}


 class Artist implements Rapper
 {

    @Override
    public void rap() {
       System.out.println("Say, drake, I hear you like 'em young\n" + //
                          "You better not ever go to cell block one\n" + //
                          "To any bitch that talk to him and they in love\n" + //
                          "Just make sure you hide your lil' sister from him");
    }

    @Override
    public void freestyle() {
        System.out.println("Stuntin' on the bitches, come back to the 6s\n" + //
                            "I spit 3s like I'm playin' with the Sixers\n" + //
                            "Bad bitch like she playin' with the mixes\n" + //
                            "Bad bitches keep playin' with my jig, uh\n" + //
                            "Bad bitch wanna get on my Insta'\n" + //
                            "Told the bitch to keep chillin' and keep quiet");
    }

    @Override
    public void perform() {
    System.out.println("[Snoop Dogg]\n" + //
                    "I'm representing for them gangstas all across the\n" + //
                    "world\n" + //
                    "Still hitting them corners in them low low's girl");
    }

    
 }
public class NestedInteface 
{

    public static void main(String[] args) {


    Rapper rapper = new Artist();
    rapper.freestyle();
    rapper.rap();
    rapper.perform();


    // Lyricist Rapper
    Rapper.Lyricist lyricist = new LyricistRapper();
    lyricist.writeLyrics();
    lyricist.constructBars();

   // GhostWriter Rapper
   Rapper.GhostWriter ghostWriter = new GhostWriter();
   ghostWriter.developFlow();
   ghostWriter.deliverDissLines();

    System.out.println();

   American_President.FreeinSlaves abrahamLincon = new AbrahamLincon();
   abrahamLincon.freeSlave();

   Drivable.Car car = new Drivable.Car();
   car.drive();



}

}



class American_President 
{

    // private interface FreeinSlaves       // will not be visible
    public  interface FreeinSlaves
    {
        abstract void freeSlave();
    }

}

class AbrahamLincon implements American_President.FreeinSlaves  {

    @Override
    public void freeSlave() {
        System.out.println("Please Let my Niggas Free...");
    }

}



interface Drivable {

    class Car {
        void drive()
        {
            System.out.println("Driving");
        }
    }
}



/*
    Proper Example of interface within class 

    class OuterClass {
    // Private nested interface
    private interface InnerInterface {
        void innerMethod();
    }

    // Implementing the private interface within the same class
    private class InnerClass implements InnerInterface {
        @Override
        public void innerMethod() {
            System.out.println("Inner method implementation");
        }
    }

    public void useInnerClass() {
        InnerInterface inner = new InnerClass();
        inner.innerMethod();
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.useInnerClass();

        // The following line would cause a compile-time error because InnerInterface is private
        // OuterClass.InnerInterface inner = outer.new InnerClass();
    }
}









        <<<<------------------  Real Life Scenario  -------------------->>>>




        

        // Outer interface representing the entire music production process
interface MusicProduction {
    void produceTrack();

    // Nested interface for Producers
    interface Producer {
        void createBeat();
        void mixTrack();
    }

    // Nested interface for Sound Engineers
    interface SoundEngineer {
        void recordVocals();
        void masterTrack();
    }

    // Nested interface for Artists
    interface Artist {
        void writeLyrics();
        void perform();
    }
}

// Implementation of the Producer interface
class HipHopProducer implements MusicProduction.Producer {
    @Override
    public void createBeat() {
        System.out.println("Creating a hip-hop beat...");
    }

    @Override
    public void mixTrack() {
        System.out.println("Mixing the track...");
    }
}

// Implementation of the Sound Engineer interface
class RecordingEngineer implements MusicProduction.SoundEngineer {
    @Override
    public void recordVocals() {
        System.out.println("Recording vocals...");
    }

    @Override
    public void masterTrack() {
        System.out.println("Mastering the track...");
    }
}

// Implementation of the Artist interface
class HipHopArtist implements MusicProduction.Artist {
    @Override
    public void writeLyrics() {
        System.out.println("Writing hip-hop lyrics...");
    }

    @Override
    public void perform() {
        System.out.println("Performing the track...");
    }
}

// Main class to demonstrate the usage of nested interfaces
public class MusicProductionSystem {
    public static void main(String[] args) {
        // Producer instance
        MusicProduction.Producer producer = new HipHopProducer();
        producer.createBeat();
        producer.mixTrack();

        // Sound Engineer instance
        MusicProduction.SoundEngineer engineer = new RecordingEngineer();
        engineer.recordVocals();
        engineer.masterTrack();

        // Artist instance
        MusicProduction.Artist artist = new HipHopArtist();
        artist.writeLyrics();
        artist.perform();
    }
}




 */