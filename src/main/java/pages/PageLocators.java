package pages;

public class PageLocators {

    // Contact Page
    protected static final String CONTACT_FORM = "//form[@id='form_contact']";
    protected static final String OFFICE_PARIS_BUTTON = "//button[normalize-space()='Paris']";
    protected static final String OFFICE_PARIS_PHONE = "//div[@id='bannerR'])/*[contains(text(), 'Tel.')]";

    // Main Page
    protected static final String AGREE_BUTTON = "//button[@id='didomi-notice-agree-button']";
    protected static final String NEWSLETTER_MENU_LiNK = "//li[@class='c-internal-links__item']//a[@aria-label='Newsletters']";
    protected static final String MAIN_CONTENT = "//main[@id='enw-main-content']";
    protected static final String CONTACT_MENU_LINK = "//a[normalize-space()='Contact']";

    // Newsletter Page
    protected static final String SELECT_NEWSLETTER = "//label[@for='34422'][normalize-space()='Select this newsletter']";
    protected static final String CLOSE_PREVIEW = "div[id='the-briefing_previews'] a[class='btn-secondary mt-6 mx-auto']";

    protected static final String BRIEFING_PLAN = "//*[contains(@label, '34433') and contains(text(), 'hidden')]";

    protected static final String EMAIL_FIELD = "//input[@title='Enter your email']";
    protected static final String EMAIL = "a@gmail.com";

    protected static final String SUBMIT_BUTTON = "//input[@value='Submit']";

    protected static final String WATCH_PLAN_PREVIEW = "//a[@href='#the-watch_previews']";
    protected static final String WATCH_SUBSCRIPTION_PLAN = "//label[@for='34422'][normalize-space()='Select this newsletter']";

    protected static final String NEWSLETTER_BLOCK = "//div[@class='wp-site-blocks']";
    protected static final String GREEN_SUBSCRIPTION_PLAN = "//label[@for='34470'][normalize-space()='Select this newsletter']";
    protected static final String WATCH_PLAN = "//*[contains(@label, '34422') and contains(text(), 'hidden')]";
    protected static final String GREEN_PLAN = "//*[contains(@label, '34470') and contains(text(), 'hidden')]";

    protected static final String THANKYOU_FORM = "//div[@id='additional-data-modal']";
}

