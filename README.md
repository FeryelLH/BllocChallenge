# BllocChallenge

 # Blloc Coding Challenge
Coding challenge as part of the interview process for an Android role at Blloc.

 # Specification
Build an android app that shows the most recent 20 notifications the device received.
Request Permission
When the app does NOT have notification access. Display a UI that informs the user and has a
button to grant permissions. When the user clicks the button they go into settings where they
can grant the notification permission.

 # Notifications list
When the app has notification access. The user sees their last 20 notifications or an empty state
if none. Notifications are sorted from most to least recent. If the user receives a notification the
list is updated. If they receive a notification while the app is not in the foreground, the next time
they open the app they should see the list. The notification consists of the title, content and app
icon. You can add any other information you see fit.

 # Filtering
The UI supports a way to filter the notifications list.
● All notifications (default) - shows the most recent 20 notifications
● Active only - shows only the currently active notifications (the ones show in the
notification shade)

 # Criteria
● The app meets the requirements
● Clean and maintainable code with separation of concerns. This is a small app but the
code should be written in a way to enable scaling it to a bigger app
● The app follows the android platform requirements and best practices e.g. configuration
changes, process death, localisation....
● Performance - efficient layouts, efficient use of resources (no leaks)
Resources
● Notification listener service● Requesting notification access
