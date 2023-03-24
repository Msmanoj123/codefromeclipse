package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomdemoqa {

        public WebDriver driver2;
        public pomdemoqa(WebDriver driver) {
            driver2=driver;
            PageFactory.initElements(driver2, this);
        }
        @FindBy(xpath="(//div[@class='avatar mx-auto white'])[1]")
        public WebElement elementstab;
        @FindBy(id="item-0")
        public WebElement textbox;
        @FindBy(id="userName")
        public WebElement username;
        @FindBy(id="userEmail")
        public WebElement email;
        @FindBy(id="currentAddress")
        public WebElement caddress;
        @FindBy(id="permanentAddress")
        public WebElement paddress;
        @FindBy(id="submit")
        public WebElement submitbutton;
        @FindBy(id="item-1")
        public WebElement chbox;
        @FindBy(xpath="//span[@class='rct-checkbox']")
        public WebElement checkbox;
        @FindBy(xpath="//input[@type='checkbox']")
        public WebElement nocheckbox;
        @FindBy(id="item-2")
        public WebElement radiobutton;
        @FindBy(xpath="//label[@for='yesRadio']")
        public WebElement yes;
        @FindBy(xpath="//label[@for='impressiveRadio']")
        public WebElement impressive;
        @FindBy(xpath="//label[@for='noRadio']")
        public WebElement no;
        @FindBy(xpath="//p//span")
        public WebElement selectedbutton;
        @FindBy(id="item-7")
        public WebElement uploadbutton;
        @FindBy(id="uploadFile")
        public WebElement choosefile;
        @FindBy(xpath="//p[@id='uploadedFilePath']")
        public WebElement checking;
        @FindBy(xpath="(//div[@class='avatar mx-auto white'])[2]")
        public WebElement formstab;
        @FindBy(xpath="(//li[@id='item-0'])[2]")
        public WebElement practiceform;
        @FindBy(id="firstName")
        public WebElement fname;
        @FindBy(id="lastName")
        public WebElement lname;
        @FindBy(id="userEmail")
        public WebElement emailid;
        @FindBy(xpath="//label[@for='gender-radio-1']")
        public WebElement male;
        @FindBy(id="userNumber")
        public WebElement phnumber;
        @FindBy(id="dateOfBirthInput")
        public WebElement date;
        @FindBy(xpath="//div[@aria-label='Choose Friday, February 3rd, 2023']")
        public WebElement feb3;
        @FindBy(xpath="//div[@id='subjectsWrapper']//div[@class='col-md-9 col-sm-12']")
        public WebElement subjects;
        @FindBy(xpath="(//div[@id='hobbiesWrapper']//div[@class='col-md-9 col-sm-12']//input)[1]")
        public WebElement sports;
        @FindBy(id="uploadPicture")
        public WebElement upload;
        @FindBy(id="currentAddress")
        public WebElement cureent;
        @FindBy(id="state")
        public WebElement state;
        @FindBy(xpath="(//div[@class='col-md-4 col-sm-12'])[2]")
        public WebElement city;
        @FindBy(id="submit")
        public WebElement submit;
        @FindBy(xpath="(//div[@class='avatar mx-auto white'])[3]")
        public WebElement alertframewindow;
        @FindBy(xpath="(//li[@id='item-1'])[2]")
        public WebElement alert;
        @FindBy(id="alertButton")
        public WebElement alertbutton;
        @FindBy(id="timerAlertButton")
        public WebElement timedalert;
        @FindBy(id="confirmButton")
        public WebElement confirmbuttonalert;
        @FindBy(xpath="//span[@id='confirmResult']")
        public WebElement confirmresult;
        @FindBy(id="promtButton")
        public WebElement promtalert;
        @FindBy(xpath="//span[@id='promptResult']")
        public WebElement promtresult;
        @FindBy(xpath="(//li[@id='item-0'])[3]")
        public WebElement browserwindows;
        @FindBy(id="sampleHeading")
        public WebElement heading;
        @FindBy(xpath="//span[normalize-space()='Frames']")
        public WebElement frame;
        @FindBy(xpath="(//li[@id='item-3'])[1]")
        public WebElement webtables;
        @FindBy(id="addNewRecordButton")
        public WebElement addbutton;
        @FindBy(id="submit")
        public WebElement webtablessubmit;
        @FindBy(xpath="//div[@class='rt-tbody']")
        public WebElement webtablesbody;
        @FindBy(xpath="(//input)[3]")
        public WebElement body1;
        @FindBy(xpath="(//input)[4]")
        public WebElement body2;
        @FindBy(xpath="(//input)[5]")
        public WebElement body3;
        @FindBy(xpath="(//input)[6]")
        public WebElement body4;
        @FindBy(xpath="(//input)[7]")
        public WebElement body5;
        @FindBy(xpath="(//input)[8]")
        public WebElement body6;
        @FindBy(xpath="(//li[@id='item-4'])[1]")
        public WebElement buttons;
        @FindBy(xpath="(//div[@class='col-12 mt-4 col-md-6']//div[2]//div//button)[1]")
        public WebElement doubleclick;
        @FindBy(xpath="(//div[@class='col-12 mt-4 col-md-6']//div[2]//div//button)[2]")
        public WebElement rightclick;
        @FindBy(xpath="(//div[@class='col-12 mt-4 col-md-6']//div[2]//div//button)[3]")
        public WebElement dynamicclick;
        @FindBy(xpath="//p")
        public WebElement text;
        @FindBy(xpath="(//div[@class='avatar mx-auto white'])[5]")
        public WebElement interactions;
        @FindBy(xpath="(//li[@id='item-3'])[4]")
        public WebElement draganddrop;
        @FindBy(xpath="//div[@id='draggable']")
        public WebElement drag;
        @FindBy(xpath="//div[@id='simpleDropContainer']//div[@id='droppable']")
        public WebElement drop;
        @FindBy(xpath="(//p[normalize-space()='Dropped!'])[1]")
        public WebElement droppable;
        @FindBy(xpath="(//li[@id='item-3'])[2]")
        public WebElement nestedframe;
        @FindBy(xpath="//body[.='Parent frame']")
        public WebElement ptext;
        @FindBy(xpath="//p[normalize-space()='Child Iframe']")
        public WebElement ctext;
        @FindBy(xpath="//iframe[@srcdoc='<p>Child Iframe</p>']")
        public WebElement childframe;
        @FindBy(xpath="(//li[@id='item-4'])[2]")
        public WebElement modaldailog;
        @FindBy(xpath="//button[@id='showSmallModal']")
        public WebElement smalldailog;
        @FindBy(xpath="(//div[@class='modal-body'])[1]")
        public WebElement smalldailogtext;
        @FindBy(xpath="//button[@id='closeSmallModal']")
        public WebElement button;
        @FindBy(xpath="(//div[@class='avatar mx-auto white'])[4]")
        public WebElement widgets;
        @FindBy(xpath="(//li[@id='item-3'])[3]")
        public WebElement slider;
        @FindBy(xpath="//input[@type='range']")
        public WebElement slider1;
        @FindBy(id = "sliderValue")
        public WebElement slidervalue;
        @FindBy(xpath = "(//li[@id='item-4'])[3]")
        public WebElement progressivebar;
        @FindBy(xpath = "//button[@id='startStopButton']")
        public WebElement progressivestart;
        @FindBy(xpath = "//button[@id='resetButton']")
        public WebElement progressivereset;
        @FindBy(xpath = "//div[@role='progressbar']")
        public WebElement progressivestyle;
        @FindBy(xpath = "(//li[@id='item-6'])[2]")
        public WebElement tooltips;
        @FindBy(xpath = "//button[@id='toolTipButton']")
        public WebElement toolTipButton;
        @FindBy(xpath = "//input[@id='toolTipTextField']")
        public WebElement toolTipTextField;
        @FindBy(xpath = "(//li[@id='item-2'])[3]")
        public WebElement datepicker;
        @FindBy(xpath = "//input[@id='datePickerMonthYearInput']")
        public WebElement Datepick;
        @FindBy(xpath = "//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']")
        public WebElement month;
        @FindBy(xpath = "//button[@aria-label='Next Month']")
        public WebElement nextmonth;
        @FindBy(xpath = "(//li[@id='item-2'])[4]")
        public WebElement resizeable;
        @FindBy(xpath = "//div[@id='resizableBoxWithRestriction']//span[@class='react-resizable-handle react-resizable-handle-se']")
        public WebElement resize;
        @FindBy(xpath = "(//li[@id='item-1'])[4]")
        public WebElement selectable;
        @FindBy(xpath = "//a[@id='demo-tab-grid']")
        public WebElement selectablegrid;
        @FindBy(xpath = "(//li[@id='item-8'])[2]")
        public WebElement selectmenu;
        @FindBy(id = "withOptGroup")
        public WebElement divdrop1;
        @FindBy(id = "selectOne")
        public WebElement divdrop2;
        @FindBy(xpath = "//select[@id='oldSelectMenu']")
        public WebElement stdrop;
        @FindBy(xpath = "(//div[contains(@class,'css-2b097c-container')])[3]")
        public WebElement divdrop3;
        @FindBy(xpath = "//select[@id='cars']")
        public WebElement stdrop2;
        @FindBy(xpath = "//span[normalize-space()='Auto Complete']")
        public WebElement autocomplete;
        @FindBy(xpath = "(//div[contains(@class,'auto-complete__value-container ')])[1]")
        public WebElement autocompletemulti;
        @FindBy(xpath = "//div[@class='auto-complete__value-container css-1hwfws3']")
        public WebElement autocompletesingle;
        @FindBy(xpath = "//div[contains(@class,'element-list collapse show')]//li[@id='item-4']")
        public WebElement dragby;
        @FindBy(xpath = "//div[@id='dragBox']")
        public WebElement dragbox;
        @FindBy(xpath = "//input[@id='dateAndTimePickerInput']")
        public WebElement datetime;
        @FindBy(xpath = "//li[normalize-space()='16:15']")
        public WebElement time;
        @FindBy(xpath = "(//li[@id='item-5'])[2]")
        public WebElement tabs;
        @FindBy(xpath = "(//li[@id='item-7'])[2]")
        public WebElement menu;
        @FindBy(xpath = "//a[normalize-space()='Main Item 2']")
        public WebElement menuitem2;
        @FindBy(xpath = "//a[normalize-space()='SUB SUB LIST »']")
        public WebElement sublist;
        @FindBy(xpath = "//a[normalize-space()='Sub Sub Item 2']")
        public WebElement subitem;
        @FindBy(xpath = "(//li[@id='item-0'])[5]")
        public WebElement sorttab;
        @FindBy(xpath = "(//div[@class='vertical-list-container mt-4']//div)[1]")
        public WebElement sortsource;
        @FindBy(xpath = "(//div[normalize-space()='Six'])[1]")
        public WebElement sorttrg;
    }
