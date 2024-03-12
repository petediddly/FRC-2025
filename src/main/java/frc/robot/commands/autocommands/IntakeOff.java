// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.autocommands;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Intake;

public class IntakeOff extends Command {
  /** Creates a new TimedDriveOut. */
  private Intake intake;
  
  public IntakeOff(Intake intake) {
    this.intake = intake;

    addRequirements(intake);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intake.intakeOff();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
      intake.intakeOff();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}