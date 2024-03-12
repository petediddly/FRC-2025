// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.autocommands;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.ParallelDeadlineGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.commands.autocommands.FeedOff;
import frc.robot.commands.autocommands.FeedOn;
import frc.robot.commands.autocommands.ShooterOff;
import frc.robot.commands.autocommands.ShooterOn;
import frc.robot.commands.autocommands.TimedDriveOut;
import frc.robot.commands.autocommands.FirstHalfFeed;
import frc.robot.commands.autocommands.SecondHalfFeed;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Swerve;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class FirstHalfFeed extends ParallelDeadlineGroup {

  /** Creates a new StupidDriveOut. */
  public FirstHalfFeed(Intake intake, Shooter shooter) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
        new RunFeederTillFed(shooter),
        new IntakeOn()
      );
  }
}