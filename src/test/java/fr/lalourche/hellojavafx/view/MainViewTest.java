package fr.lalourche.hellojavafx.view;
import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.base.NodeMatchers.hasText;

import org.junit.Before;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import fr.lalourche.hellojavafx.HelloJavaFx;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainViewTest extends ApplicationTest {

	@Override
	public void start(Stage stage) throws Exception 
	{
		HelloJavaFx.initStage(stage);
        stage.show();
	}
	
	@Before
	public void setUp()
	{
		TextField lastname = lookup("#result").queryFirst();
        lastname.setText("DEFAULT RESULT FOR TEST SETUP");
	}
	
	@Test
	public void click_on_start_button_shall_display_the_result()
	{
		clickOn("#button");
		
        verifyThat("#result", hasText("OK"));
	}

}