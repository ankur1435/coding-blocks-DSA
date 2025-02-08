package Lec35;

public interface A extends B, C {

	public void Display();
}

// An interface in Java is like a contract that tells a class, "If you're going
// to implement me, you must provide the functionality for these methods."

// It only declares methods (what needs to be done) but doesn't give the actual
// implementation (how it should be done). The class implementing the interface
// Interfaces can extend multiple interfaces (unlike classes, which can only
// extend one class).
