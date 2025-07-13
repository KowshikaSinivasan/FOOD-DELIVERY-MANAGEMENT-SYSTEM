# 🍽️ Food Delivery Management System

A comprehensive **Food Delivery Management System** developed as an academic **DBMS mini-project**. The system efficiently handles food orders, payments, memberships, and delivery management, simulating a real-world food delivery service using a modular design. The backend is powered by **Oracle SQL Plus**, and the application is built using **Java (NetBeans IDE)** and **Swing GUI** components.

---

## 📌 Problem Statement

To design a **Food Delivery Management System** and analyze the data, identifying:
- Constraints among attributes
- Dependencies among attributes
- Efficient organization and management of structured data using SQL-based relational database design

---

## 📖 Extended Exploration

The **Food Delivery Management System (FDMS)** is a comprehensive framework designed to:
- Manage customers, restaurants, drivers, and orders
- Integrate various modules with relational constraints
- Ensure smooth order processing and delivery flow
- Enforce data integrity using SQL constraints and relationships

This system includes:
- Structured schema with primary keys, foreign keys, and check constraints
- Role-based modules for customer, restaurant, and delivery driver
- GUI application for login, placing orders, and managing data

---

## 🧱 Tech Stack

- **Frontend**: Java Swing (`javax.swing`)
- **Backend**: Java JDBC (`java.sql`)
- **Database**: Oracle SQL Plus
- **IDE Used**: NetBeans

---

## 🗃️ Database Schema Overview

### 🔹 `ORDERS`
- Fields: `Oid`, `Cid`, `Rid`, `Did`, `status`, `order_date_time`, `del_date_time`, `Orating`, `price`
- Constraints:
  - `Oid` starts with 'O'
  - Valid order statuses and ratings
  - Delivery time must be after order time

### 🔹 `ORDER_DETAILS`
- Fields: `Oid`, `Iid`, `price`, `Qty`
- Primary Key: (`Oid`, `Iid`)
- Constraints:
  - Positive price and quantity
  - `Oid` must match format

### 🔹 `ITEM`
- Fields: `Iid`, name, description, price, category (Veg/Non-Veg), type (starter, main course), cuisine, rating, guilt-free status, Jain food status
- Constraints:
  - Valid categories
  - Ratings between 1 and 5
  - Positive price

### 🔹 `MENU`
- Maps items to restaurants
- Fields: `Rid`, `Iid`, availability time
- Constraints:
  - Valid foreign key references to `ITEM` and `RESTAURANT`

### 🔹 `PAYMENT`
- Fields: `Pid`, `Oid`, `status`, `type` (cash, card, online)
- Constraints:
  - Valid statuses (success, pending)
  - Only allowed payment types

### 🔹 `MEMBERSHIP`
- Fields: `Mid`, `Cid`, type (Gold/Silver/Platinum), start date, end date, active status
- Constraints:
  - Logical date ranges
  - Valid membership types

---

## 🧩 Modular Design

### 👥 Customer Module
- User registration and login
- Browse restaurants and menus
- Place and track orders
- Give ratings and feedback
- Access membership benefits

### 🍴 Restaurant Module
- Manage item listings and availability
- Handle incoming orders
- Track performance and reviews

### 🚗 Driver Module
- View assigned deliveries
- Update order status
- Navigate delivery routes

---

## 🔐 Key Features

- 🔐 **Secure Login System** using Swing GUI
- 📦 **Order Management** with status updates and tracking
- 🧾 **Payment Integration** with support for multiple types
- ⭐ **Membership Tier System** (Gold, Silver, Platinum)
- 🧠 **SQL Constraints & Data Integrity**
- 📊 **Realistic Entity-Relationship Schema**

---

## 📸 Screenshots
LOGIN PAGE

<img width="1006" height="647" alt="image" src="https://github.com/user-attachments/assets/f350f559-39fd-40a0-8350-898455fad5cf" />

SIGN-UP PAGE

<img width="892" height="743" alt="image" src="https://github.com/user-attachments/assets/06fb8b7e-48c2-44ec-be80-c1057022ae98" />

CUSTOMER SIGN-UP PAGE

<img width="923" height="761" alt="image" src="https://github.com/user-attachments/assets/95a57fad-c3a0-47ce-8f85-0b26b8a2f47b" />

RESTAURANT SIGN-UP PAGE

<img width="1008" height="887" alt="image" src="https://github.com/user-attachments/assets/f261e8f1-acab-4b40-a9b1-08f6f86a5c1b" />

DELIVERY PARTNES SIGN-UP PAGE

<img width="1519" height="830" alt="image" src="https://github.com/user-attachments/assets/d7d7303f-6b8c-429b-9dbd-7346c583c85f" />

TRACK ORDERS

<img width="405" height="273" alt="image" src="https://github.com/user-attachments/assets/69473a7f-23cf-4df2-a9c4-d77a8776e663" />

CANCELLING SHIPPED ORDERS

<img width="1014" height="844" alt="image" src="https://github.com/user-attachments/assets/8ced8fc8-a82c-49a0-8e30-44865e1f4266" />

RESTAURANT VIEW ORDER

<img width="848" height="697" alt="image" src="https://github.com/user-attachments/assets/718210dc-2eee-4dcd-b9b2-33f2611178db" />

RESTAURANT-ADD/REMOVE AN ITEM 

<img width="740" height="688" alt="image" src="https://github.com/user-attachments/assets/82d790c5-2bc9-43c8-9724-1091eff1b7f1" />

---
## 📌 How to Run
Open the project in NetBeans IDE

Configure the Oracle SQL Plus connection in DBConnection.java

Run schema.sql in SQL Plus to create tables and constraints

Launch the application from LoginPage.java

---
---

## 📄 Documentation & Walkthrough

For a complete understanding of the project—including:

- Entity-Relationship (ER) Diagram
- Attribute-level details of all tables
- Schema structure and constraints
- Database connection flow using Java and Oracle SQL Plus
- Module-wise functionality and backend interaction
- Screenshots of the UI (Login, Order placement, etc.)

📌 Refer to: [`.Project_Documentation.pptx`](.Project_Documentation.pptx)

This presentation provides a detailed breakdown of how the Food Delivery Management System is designed and implemented.
---
## 📜 License
This project is part of an academic submission and is for educational use only.
