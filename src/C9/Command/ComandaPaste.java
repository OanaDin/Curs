package C9.Command;

public class ComandaPaste implements IComanda {
	private String tipPaste;
	private Bucatar bucatar;//referinta a executantului

	public ComandaPaste(String tipPaste, Bucatar bucatar) {
		super();
		this.tipPaste = tipPaste;
		this.bucatar = bucatar;
	}

	@Override
	public void prelucreaza() {
		this.bucatar.preparaPaste(tipPaste);
	}

}
