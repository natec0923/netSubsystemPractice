// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTableValue;
import frc.robot.Constants;

public class LimelightSubsystem extends SubsystemBase {
  public static NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
  public static NetworkTableEntry tx = table.getEntry("tx");
  public static NetworkTableEntry ty = table.getEntry("ty");
  public static NetworkTableEntry ta = table.getEntry("ta");
  public static double limelightX = tx.getDouble(0.0);
  public static double limelightY = ty.getDouble(0.0);
  public static double limelightArea = ta.getDouble(0.0);
 

  /** Creates a new LimelightSubsystem. */
  public LimelightSubsystem(){
    findLimelightValues();
    
  }
  

  private void findLimelightValues(){
    getLimelightX();
    getLimelightY();
  }
  public static double getLimelightX(){
    return limelightX = tx.getDouble(0.0);
  }
  public static double getLimelightY(){
    return limelightY = ty.getDouble(0.0);
  }
  public static void turnLedON(){
    table.getEntry("camMode").setNumber(Constants.VISION_PROCESSOR);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
