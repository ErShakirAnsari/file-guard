package in.jaxer;

import in.jaxer.core.utilities.ConsoleInput;

/**
 * @author Shakir
 * @date 2022-07-16
 */
public class Application
{
	public static void main(String[] args)
	{
		logln("Welcome to file-guard @v0.0.0-beta");
		logln();
		showMenu();
	}

	private static void showMenu()
	{
		logln("1 - guard file (need file name in next step)");
		logln("2 - guard all files");
		logln("3 - guard all files recursive");
		logln("4 - help");
		logln("5 - credits");
		logln("6 - exit");

		logln();
		log("Please enter your option: ");
		int userInput = getUserInput();

		logln();
		logln("Your choice was: " + userInput);
	}

	private static int getUserInput()
	{
		try (ConsoleInput consoleInput = new ConsoleInput(System.in))
		{
			return consoleInput.readInt();
		} catch (NumberFormatException numberFormatException)
		{
			log("Please enter valid option: ");
			return getUserInput();
		} catch (Exception e)
		{
			e.printStackTrace();
			return 0;
		}
	}

	private static void logln(String str)
	{
		System.out.println(str);
	}

	private static void log(String str)
	{
		System.out.print(str);
	}

	private static void logln()
	{
		System.out.println();
	}
}
