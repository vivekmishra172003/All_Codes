# ===== IMPORT SECTION =====
# Import necessary modules for web automation

from selenium import webdriver
# 'webdriver' is the main module that controls browsers (Chrome, Firefox, etc.)
# It's like a remote control for your browser

from selenium.webdriver.common.by import By
# 'By' helps us find elements on a webpage using different methods
# Examples: By.ID, By.CLASS_NAME, By.LINK_TEXT, By.CSS_SELECTOR

from selenium.webdriver.support.ui import WebDriverWait
# 'WebDriverWait' makes the script wait for specific conditions before continuing
# This prevents errors when elements take time to load

from selenium.webdriver.support import expected_conditions as EC
# 'expected_conditions' (EC) defines what conditions to wait for
# Examples: element_to_be_clickable, visibility_of_element_located

from selenium.webdriver.chrome.service import Service
# 'Service' helps manage the ChromeDriver (the bridge between Python and Chrome)
# It handles starting/stopping the driver process

from webdriver_manager.chrome import ChromeDriverManager
# 'ChromeDriverManager' automatically downloads and manages ChromeDriver versions
# No need to manually download ChromeDriver files

import time
# 'time' module provides sleep functionality to pause execution
# Useful for waiting when explicit waits aren't suitable

# ===== MAIN FUNCTION DEFINITION =====
def automate_product_search(product_name):
    """
    This function automates searching for a product on an e-commerce website
    Parameter: product_name - the name of the product to search for
    """
    
    # ===== BROWSER SETUP =====
    # Automatically download and setup ChromeDriver
    service = Service(ChromeDriverManager().install())
    # ChromeDriverManager().install() downloads the correct ChromeDriver version
    # Service() creates a service object to manage the driver
    
    driver = webdriver.Chrome(service=service)
    # Creates a new Chrome browser instance using the service
    # This opens a new Chrome window that Python can control
    
    driver.maximize_window()
    # Makes the browser window full screen
    # Helps ensure all elements are visible and clickable
    
    # ===== MAIN AUTOMATION LOGIC =====
    try:
        # 'try' block contains the main automation code
        # If any error occurs, it will jump to the 'except' block
        
        print(f"Opening website...")
        # Print status message to console (f-string formatting)
        
        # Navigate to the demo e-commerce website
        driver.get("https://www.demoblaze.com/")
        # .get() method navigates to the specified URL
        # Like typing the URL in address bar and pressing Enter
        
        print(f"Searching for product: {product_name}")
        # Print which product we're looking for
        
        # ===== WAIT AND CLICK CATEGORY =====
        # Wait for page to load and click on 'Laptops' category
        laptops_category = WebDriverWait(driver, 10).until(
            EC.element_to_be_clickable((By.LINK_TEXT, "Laptops"))
        )
        # WebDriverWait(driver, 10) = Wait up to 10 seconds
        # .until() = Keep waiting until the condition is met
        # EC.element_to_be_clickable() = Wait until element can be clicked
        # (By.LINK_TEXT, "Laptops") = Find element with exact text "Laptops"
        
        laptops_category.click()
        # Click on the found "Laptops" link
        # This navigates to the laptops section
        
        # ===== WAIT FOR PRODUCTS TO LOAD =====
        # Wait a moment for products to load
        time.sleep(2)
        # Simple 2-second pause to ensure products load
        # Sometimes needed when explicit waits aren't sufficient
        
        # ===== PRODUCT SEARCH LOGIC =====
        # Try to find and click on the desired product
        try:
            # Inner try-except block for product-specific operations
            
            product_link = WebDriverWait(driver, 10).until(
                EC.element_to_be_clickable((By.LINK_TEXT, product_name))
            )
            # Wait for a clickable link with the exact product name
            # If product exists, this will find it; if not, it will timeout
            
            product_link.click()
            # Click on the product link to go to product details page
            
            # ===== EXTRACT PRODUCT INFORMATION =====
            # Extract product information from the product page
            product_title = WebDriverWait(driver, 10).until(
                EC.visibility_of_element_located((By.CSS_SELECTOR, "h2.name"))
            ).text
            # Wait for product title to be visible
            # (By.CSS_SELECTOR, "h2.name") = Find <h2> element with class "name"
            # .text = Get the text content of the element
            
            product_price = WebDriverWait(driver, 10).until(
                EC.visibility_of_element_located((By.CSS_SELECTOR, "h3.price-container"))
            ).text
            # Wait for price element to be visible
            # (By.CSS_SELECTOR, "h3.price-container") = Find <h3> with class "price-container"
            # .text = Get the price text
            
            # ===== DISPLAY RESULTS =====
            print(f"✅ Product Name: {product_title}")
            print(f"💰 Product Price: {product_price}")
            # Print the extracted information with emoji for better readability
            
        except Exception as product_error:
            # This except block handles cases where the specific product isn't found
            
            print(f"❌ Product '{product_name}' not found. Available products:")
            # Inform user that the product wasn't found
            
            # List available products as alternatives
            products = driver.find_elements(By.CSS_SELECTOR, "a.hrefch")
            # find_elements() (plural) finds ALL matching elements
            # Returns a list of all product links on the page
            
            for i, product in enumerate(products[:5], 1):  # Show first 5
                # enumerate() adds numbers to the list (1, 2, 3, etc.)
                # products[:5] = Take only first 5 products
                # 1 = Start numbering from 1 instead of 0
                
                print(f"  {i}. {product.text}")
                # Print each available product with a number
        
        # ===== PAUSE TO VIEW RESULTS =====
        # Keep browser open for 5 seconds to see results
        time.sleep(5)
        # 5-second pause so user can see the results before browser closes
        
    except Exception as e:
        # This except block catches any other errors in the main try block
        print(f"❌ An error occurred: {e}")
        # Print the error message for debugging
    
    finally:
        # 'finally' block ALWAYS executes, even if errors occur
        driver.quit()
        # Close the browser and end the driver process
        # Important for cleanup - prevents zombie browser processes
        
        print("Browser closed.")
        # Confirm that cleanup was completed

# ===== MAIN EXECUTION SECTION =====
# Test the function
if __name__ == "__main__":
    # This condition ensures the code only runs when script is executed directly
    # Not when imported as a module in another script
    
    print("🚀 Starting Web Automation Test...")
    print("=" * 50)
    # Print a header with 50 equal signs for visual separation
    
    # Test with different product names
    test_products = ["MacBook air", "Sony vaio i5", "Dell i7 8gb"]
    # List of products to test - some may exist, some may not
    
    for product in test_products:
        # Loop through each product in the test list
        
        print(f"\n🔍 Testing: {product}")
        # \n = New line, then print which product we're testing
        
        automate_product_search(product)
        # Call our function with the current product name
        
        print("-" * 30)
        # Print 30 dashes as a separator between tests
    
    print("\n✅ All tests completed!")
    # Final message indicating all tests are done

# ===== EXECUTION FLOW SUMMARY =====
"""
1. Import all necessary modules
2. Define the main function automate_product_search()
3. Set up Chrome browser with automatic driver management
4. Navigate to the e-commerce website
5. Click on "Laptops" category
6. Search for the specific product
7. If found: Extract and display product name and price
8. If not found: Show available alternatives
9. Close browser and clean up
10. Repeat for all test products
"""