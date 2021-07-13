package core;

public class Logger {

	private String driverName;

	public Logger(String driverName) {
		this.driverName = driverName;

	}

<<<<<<< HEAD
	public void log(Log l) {
		System.out.println(l);
	}

//	public Log[] getLogs() {
//		return 0;
//	}
=======
	public static void log(Log log) {
		System.out.println(log);
	}

	public Log[] getLogs() {
		return null;
	}
>>>>>>> branch 'master' of https://github.com/Exseibar/MyRepository.git
}
