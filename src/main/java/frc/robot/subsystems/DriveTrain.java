// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  private CANSparkMax motorFL = new CANSparkMax(Constants.motorFL, MotorType.kBrushless);
  private CANSparkMax motorBL = new CANSparkMax(Constants.motorBL, MotorType.kBrushless);
  private CANSparkMax motorFR = new CANSparkMax(Constants.motorFR, MotorType.kBrushless);
  private CANSparkMax motorBR = new CANSparkMax(Constants.motorBR, MotorType.kBrushless);


  /** Creates a new DriveTrain. */
  public DriveTrain() {
    motorFL.restoreFactoryDefaults();
    motorBL.restoreFactoryDefaults();
    motorFR.restoreFactoryDefaults();
    motorBR.restoreFactoryDefaults();

    motorFL.setIdleMode(IdleMode.kBrake);
    motorBL.setIdleMode(IdleMode.kBrake);
    motorFR.setIdleMode(IdleMode.kBrake);
    motorBR.setIdleMode(IdleMode.kBrake);

    motorFL.setInverted(false);
    motorBL.setInverted(false);
    motorFR.setInverted(true);
    motorBR.setInverted(true);

    motorFL.burnFlash();
    motorBL.burnFlash();
    motorFR.burnFlash();
    motorBR.burnFlash();
 
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setMotors(double leftSpeed, double rightSpeed) {
    motorFL.set(leftSpeed);
    motorBL.set(leftSpeed);
    motorFR.set(rightSpeed);
    motorBR.set(rightSpeed);
  }
}
