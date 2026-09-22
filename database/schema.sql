-- Create Database
CREATE DATABASE IF NOT EXISTS education_db;
USE education_db;

-- Create Students Table
CREATE TABLE IF NOT EXISTS students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL,
    course_code VARCHAR(20) NOT NULL,
    course_fee DECIMAL(10, 2) NOT NULL,
    payment_status VARCHAR(10) NOT NULL
);

-- Insert Initial Sample Records
INSERT INTO students (student_id, student_name, course_code, course_fee, payment_status) VALUES
(101, 'Kasuni Sara', 'ICT101', 10000.00, 'PAID'),
(102, 'Senuli Malki', 'Math102', 10000.00, 'PAID'),
(103, 'Safra Aisha', 'ICT101', 10000.00, 'PAID'),
(104, 'Aloka Nirmal', 'MATH102', 10000.00, 'UNPAID'),
(105, 'Mohomad Nazim', 'ENG103', 10000.00, 'UNPAID');
