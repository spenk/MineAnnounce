import java.util.logging.Logger;
public class MineAnnounce extends Plugin{
	  String name = "MineAnnounce ";
	  String version = "1.2 ";
	  String author = "by spenk ";
	  static Logger log = Logger.getLogger("Minecraft");

	  public void initialize()
	  {
		  MineAnnounceListener listener = new MineAnnounceListener();
	    log.info(this.name + " version " + this.version + " by " + this.author + " is initialized!");
	    etc.getLoader().addListener(PluginLoader.Hook.BLOCK_BROKEN, listener, this, PluginListener.Priority.MEDIUM);
	    listener.file.mkdir();
	    listener.file2.mkdir();
	    listener.load1();
	    listener.load2();
	    listener.load3();
	    listener.load4();
	  }

	  public void enable() {
	    log.info(this.name + " version " + this.version + " by " + this.author + " is enabled!");
	  }

	  public void disable() {
	    log.info(this.name + " version " + this.version + " is disabled!");
	  }
	}
