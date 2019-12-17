import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.cermati.com/gabung')

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/input__email'), 
    email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/input__password'), 
    password)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/input__confirmPassword'), 
    confirmPassword)

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/input__firstName'), 
    firstName)

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/input__lastName'), 
    lastName)

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/input__mobilePhone'), 
    phoneNumber)

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/input__residenceCity'), 
    city)

WebUI.click(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/div_KOTA BOGOR'))

WebUI.click(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/button_Daftar Akun'))

WebUI.click(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit Pinjaman Tabungan dan Promo Terbaik - Cermati/button_Nanti Saja'))

