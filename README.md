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

## `th:each`: Iterating Over Collections

- `th:each` is used for iterating over collections (e.g., lists, arrays, sets) and rendering elements for each item in the collection.
- It allows you to dynamically generate content based on the elements in the collection.

**Example:**

```html
<ul>
    <li th:each="product : ${products}" th:text="${product.name}"></li>
</ul>

## Thymeleaf `th:object` Attribute

Thymeleaf, a versatile templating engine, provides the `th:object` attribute, which is a powerful tool for setting the current object for expression evaluation within a specific scope in your templates.

## Usage

- `th:object` is used to establish a new context for expressions within a specific HTML element or a block of HTML.
- It allows you to change the context in which expressions are evaluated, which can be especially useful when dealing with nested objects or iterating over collections.

## Example

Consider a scenario where you have a `User` object with properties like `name` and `email`. You want to display these properties within a specific HTML block. Here's how `th:object` can be used:

```html
<div th:object="${user}">
    <p>Name: <span th:text="*{name}"></span></p>
    <p>Email: <span th:text="*{email}"></span></p>
</div>

