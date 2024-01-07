import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://rpachallenge.com/')

WebUI.click(findTestObject('Object Repository/Page_Rpa Challenge/Page_Rpa Challenge/button_Start'))

for (def rowNum = 1; rowNum <= findTestData('DataChallenge').getRowNumbers(); rowNum++) {
    //WebUI.setText(findTestObject('Input/Address'), Address)
    WebUI.setText(findTestObject('Input/Address'), findTestData('DataChallenge').getValue(5, rowNum))

    //WebUI.setText(findTestObject('Input/Company'), CompanyName)
    WebUI.setText(findTestObject('Input/Company'), findTestData('DataChallenge').getValue(3, rowNum))

    //WebUI.setText(findTestObject('Input/Email'), Email)
    WebUI.setText(findTestObject('Input/Email'), findTestData('DataChallenge').getValue(6, rowNum))

    //WebUI.setText(findTestObject('Input/FirstName'), FirstName)
    WebUI.setText(findTestObject('Input/FirstName'), findTestData('DataChallenge').getValue(1, rowNum))

    //WebUI.setText(findTestObject('Input/LastName'), LastName)
    WebUI.setText(findTestObject('Input/LastName'), findTestData('DataChallenge').getValue(2, rowNum))

    //WebUI.setText(findTestObject('Input/Phone'), Phone)
    WebUI.setText(findTestObject('Input/Phone'), findTestData('DataChallenge').getValue(7, rowNum))

    //WebUI.setText(findTestObject('Input/Role'), Role)
    WebUI.setText(findTestObject('Input/Role'), findTestData('DataChallenge').getValue(4, rowNum))
	
    WebUI.click(findTestObject('Object Repository/Page_Rpa Challenge/Page_Rpa Challenge/input_btn uiColorButton'))
}


