
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.identifier);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Archive other = (Archive) obj;
        if (!Objects.equals(this.identifier, other.identifier)) {
            return false;
        }
        return true;
    }
    
    
//    public boolean equals(Object compared){
//        if(this == compared){
//            return true;
//        }
//        
//        if(!(compared instanceof Archive)) {
//            return false;
//        }
//        
//        Archive comparedArchive = (Archive) compared;
//        
//        return this.identifier.equals(comparedArchive.identifier);
//               // && this.name.equals(comparedArchive.name);
//    }
    
    public String toString(){
        return this.identifier + ": " + this.name;
    }
}
