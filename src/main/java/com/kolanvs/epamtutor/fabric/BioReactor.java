package com.kolanvs.epamtutor.fabric;

import com.kolanvs.epamtutor.beans.Citizen;
import com.kolanvs.epamtutor.beans.Human;
import com.kolanvs.epamtutor.beans.SuperHero;

public class BioReactor {
    public static Human getHuman(String type) {
        if(type.equals("SuperHero")) {
            return new SuperHero();
        } else {
            return new Citizen();
        }
    }
}
