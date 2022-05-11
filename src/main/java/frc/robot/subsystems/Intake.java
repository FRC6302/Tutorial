// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  private CANSparkMax motorIntake = new CANSparkMax(Constants.motorIntake, MotorType.kBrushless);
  /** Creates a new Intake. */
  public Intake() {
    motorIntake.restoreFactoryDefaults();
    motorIntake.setIdleMode(IdleMode.kBrake);
    motorIntake.setInverted(false);
    motorIntake.burnFlash();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setSpeed(double speed) {
    motorIntake.set(speed);
  }

  public void stopMotor() {
    motorIntake.set(0);
  }
}
