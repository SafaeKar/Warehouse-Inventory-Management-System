1. Why did you choose a HashMap for storing the product information? What are its benefits compared to other data structures?
Reason for Choosing HashMap:

Fast Access Time: A HashMap provides average constant-time complexity (O(1)) for lookups, insertions, and deletions. This makes it very efficient for retrieving product information by ID.
Unique Keys: Each product ID can be used as a unique key in the HashMap, ensuring that there are no duplicate entries for product IDs.

2. How does using an ArrayList for daily shipments help in maintaining the order of arrivals?
Maintaining Order with ArrayList:

Insertion Order: An ArrayList maintains the order of elements as they are added. When a shipment arrives, the product ID is simply appended to the end of the list. This means that the first product ID added will be the first one in the list, preserving the order in which products arrived.
Simplicity: Using an ArrayList is straightforward and allows for easy iteration over the shipment records. It supports dynamic resizing, so there's no need to worry about the capacity unless the list grows very large.


3. What changes would you make if the products needed to be sorted by both name and ID?
Changes Required:

Composite Key: One approach would be to create a composite key by using a custom class that holds both the product name and ID. This would allow us to sort based on both attributes when needed.
Separate Lists: Alternatively, we could maintain two separate lists: one sorted by name and another by ID. Whenever a product is added or modified, we would update both lists accordingly.
Using a Priority Queue: Another approach could involve using a PriorityQueue or a sorted data structure like a TreeSet, which maintains elements in sorted order based on a defined comparator.

4. What would you do differently if products could have non-unique IDs or if shipments had to be tracked with timestamps?
Handling Non-Unique IDs:

Change the Key Structure: Instead of using a single ID as the key in the HashMap, we could use a combination of product ID and a secondary unique attribute (like a timestamp) to differentiate products. This might involve changing the data structure to store a list of products for each key.
Use a List for Each ID: Change the HashMap<Integer, List<Product>> to hold multiple products under the same ID. This allows for storing different products that share the same ID while maintaining their individual properties.
