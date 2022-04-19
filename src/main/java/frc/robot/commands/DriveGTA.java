// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;

public class DriveGTA extends CommandBase {
  DriveTrain driveTrain;
  /** Creates a new DriveGTA. */
  public DriveGTA(DriveTrain dt) {
    // Use addRequirements() here to declare subsystem dependencies.
    driveTrain = dt;

    addRequirements(driveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double turnRate = Robot.m_robotContainer.driverController.getRightX();
    double forwardSpeed = Robot.m_robotContainer.driverController.getRightTriggerAxis();
    double reverseSpeed = Robot.m_robotContainer.driverController.getLeftTriggerAxis();

    driveTrain.setMotors(forwardSpeed - reverseSpeed - turnRate, forwardSpeed - reverseSpeed + turnRate);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
