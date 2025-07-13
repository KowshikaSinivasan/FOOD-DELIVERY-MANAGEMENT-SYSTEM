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

## 📁 Project Structure

Food-Delivery-DBMS/
├── src/
│ ├── LoginPage.java
│ ├── CustomerModule.java
│ ├── RestaurantModule.java
│ ├── DriverModule.java
│ └── utils/
│ └── DBConnection.java
├── database/
│ ├── schema.sql
│ ├── constraints.sql
│ └── triggers.sql
├── assets/
│ ├── ER_Diagram.png
│ └── screenshots/
├── README.md
└── .gitignore

---

## 📸 Screenshots


---
## 📌 How to Run
Open the project in NetBeans IDE

Configure the Oracle SQL Plus connection in DBConnection.java

Run schema.sql in SQL Plus to create tables and constraints

Launch the application from LoginPage.java

---

## 📜 License
This project is part of an academic submission and is for educational use only.