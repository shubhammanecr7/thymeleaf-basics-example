# thymeleaf-basics-example
A simple Thymeleaf project demonstrating the usage of basic Thymeleaf expressions including #, @, and $, along with code examples to help implement them effectively. This project serves as a beginner-friendly reference for Thymeleaf.

# Thymeleaf Expression Tags Overview

Thymeleaf is a powerful templating engine that provides various expression tags to help you work with data and templates. Below is an overview of some of the primary Thymeleaf expression tags and their usage:

## `${...}`: Expression Evaluation

- Used for evaluating expressions and inserting the result into the HTML output.
- Example: `${user.firstName}` evaluates and inserts the value of `user.firstName` into the HTML.

## `*{...}`: Form Field Binding

- Used in form fields to bind data to form elements.
- Example: `*{employee.name}` binds the value of `employee.name` to a form field.

## `#{...}`: Internationalization (i18n) and Message Resolution

- Used for internationalization (i18n) and message resolution.
- Example: `#{app.welcome.message}` resolves and displays a localized welcome message.

## `@{...}`: URL Creation

- Used for creating URLs.
- Example: `@{/products/{productId}(productId=1)}` generates a URL for a product with ID 1.

## `|...|`: String Interpolation

- Used for string interpolation.
- Example: `|Hello, ${user.name}!|` creates a dynamic string greeting.

## `th:text`: Text Content Modification

- Used to set the text content of an HTML element.
- Example: `<p th:text="${user.name}"></p>` sets the text content of the `<p>` element to the value of `user.name`.

## `th:if`, `th:unless`: Conditional Rendering

- `th:if` is used for conditional rendering of elements.
- `th:unless` is used for rendering when a condition is not met.
- Example: `<div th:if="${user.isAdmin}">Admin Panel</div>` displays the "Admin Panel" div if `user.isAdmin` is true.

## `th:switch`, `th:case`: Switch-Case Conditional Rendering

- `th:switch` and `th:case` are used for switch-case style conditional rendering.
- Example:
  ```html
  <div th:switch="${dayOfWeek}">
      <p th:case="'Monday'">It's Monday!</p>
      <p th:case="'Friday'">It's Friday!</p>
      <p th:case="*">It's another day.</p>
  </div>

## th:each: Iteration
Used for iterating over collections and rendering elements for each item.
Example:
<ul>
    <li th:each="product : ${products}" th:text="${product.name}"></li>
</ul>

## th:object: Current Object
Used to set the current object for expression evaluation.
Example: <div th:object="${user}">...</div> sets the current object to user for expressions inside the <div>.
