package com.pineapplerobotics.velocityvortex.auto;

import com.pineapplerobotics.velocityvortex.javacodeclasses.resources.enums.PublicEnums;
import com.pineapplerobotics.velocityvortex.javacodeclasses.resources.Auto;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

/**
 * Created by krisu on 11/10/2016.
 */
@Autonomous(name = "Red Auto", group = "PineappleRobotics")
public class RedAuto extends Auto {
    public RedAuto(){super(PublicEnums.AllianceColor.RED);}
}
