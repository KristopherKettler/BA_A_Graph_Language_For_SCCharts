package info.scce.cinco.product.scchart.mglid.mcam.cli;

public class CliMain {
	public static void main(String[] args) {

		CliExecution cliExecution = new CliExecution(args);
		cliExecution.executeCall();

		System.exit(0);
	}
}
