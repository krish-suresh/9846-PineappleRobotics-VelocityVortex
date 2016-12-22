
package com.pineapplerobotics.velocityvortex.Stage2;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;




@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "TeleOp", group = "Linear Opmode")  // @Autonomous(...) is the other common choice

public class TeleOp extends LinearOpMode {
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("Status", "Initialized");
        telemetry.update();


        waitForStart();
        runtime.reset();


        while (opModeIsActive()) {

            telemetry.addData("Status", "Run : " + runtime.toString());
            telemetry.update();
            ////////////////////////////////////////////////////////
            //                    GAMEPAD 1                       //
            //                                                    //
            //                                                    //
            //                                                    //
            //                                                    //
            //                                                    //
            //                                                    //
            //                                                    //
            ////////////////////////////////////////////////////////


            ////////////////////////////////////////////////////////
            //                    GAMEPAD 2                       //
            //                                                    //
            //                                                    //
            //                                                    //
            //                                                    //
            //                                                    //
            //                                                    //
            //                                                    //
            ////////////////////////////////////////////////////////


        }
    }

}
