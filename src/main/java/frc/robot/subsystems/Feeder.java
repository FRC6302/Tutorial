// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Feeder extends SubsystemBase {
  private CANSparkMax motorFeeder = new CANSparkMax(Constants.motorFeeder, MotorType.kBrushless);

  /** Creates a new Feeder. */
  public Feeder() {
    motorFeeder.restoreFactoryDefaults();
    motorFeeder.setIdleMode(IdleMode.kBrake);
    motorFeeder.setInverted(false);
    motorFeeder.burnFlash();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setSpeed(double speed) {
    motorFeeder.set(speed);
  }

  public void stopMotor() {
    motorFeeder.set(0);
  }
}
