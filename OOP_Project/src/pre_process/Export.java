package pre_process;

import java.util.List;

public interface Export extends Convention{
	
	public String replace(String st);
	public List<String> output(List<String> list);
}