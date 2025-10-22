## 🧩 **1. What is a Set?**

A **set** is a *collection of distinct objects* (called **elements** or **members**) written inside curly brackets `{ }`.

👉 Example:

```
A = {1, 2, 3, 4, 5}
B = {apple, banana, mango}
```

Each element appears **only once**.
Order doesn’t matter, so `{1, 2, 3}` = `{3, 2, 1}` ✅

---

## 🔤 **2. Set Notations**

| Symbol | Meaning                          | Example               |
| ------ | -------------------------------- | --------------------- |
| ∈      | “is an element of”               | 3 ∈ A (3 is in set A) |
| ∉      | “is not an element of”           | 6 ∉ A                 |
| ⊂      | “is a subset of”                 | {1,2} ⊂ A             |
| ⊆      | “subset or equal”                | A ⊆ A                 |
| ⊄      | “not a subset”                   | {7,8} ⊄ A             |
| ⊃      | “is a superset of”               | A ⊃ {1,2}             |
| ∅      | “empty set” (no elements)        | B = ∅                 |
| n(A)   | Number of elements (cardinality) | n(A) = 5              |

---

## ⚙️ **3. Types of Sets**

| Type                  | Description                            | Example                                             |
| --------------------- | -------------------------------------- | --------------------------------------------------- |
| **Finite Set**        | Has a countable number of elements     | A = {1,2,3}                                         |
| **Infinite Set**      | Uncountable or endless                 | N = {1,2,3,...}                                     |
| **Empty Set (∅)**     | Contains no elements                   | {} or ∅                                             |
| **Singleton Set**     | Contains exactly one element           | A = {5}                                             |
| **Equal Sets**        | Have the same elements                 | {1,2,3} = {3,2,1}                                   |
| **Subset / Superset** | One set is part of another             | {1,2} ⊂ {1,2,3}                                     |
| **Power Set**         | All subsets of a set                   | P(A) of {1,2} = {∅, {1}, {2}, {1,2}}                |
| **Universal Set (U)** | All possible elements under discussion | If U = {1,2,3,4,5}, then A = {1,2} is a subset of U |

---

## 🔁 **4. Set Operations**

### ➕ Union (A ∪ B)

All elements from **A or B or both**.

> Example:
> A = {1, 2, 3}, B = {3, 4, 5}
> A ∪ B = {1, 2, 3, 4, 5}

---

### ✖️ Intersection (A ∩ B)

Common elements in **both** sets.

> A = {1, 2, 3}, B = {3, 4, 5}
> A ∩ B = {3}

---

### ➖ Difference (A − B)

Elements in **A but not in B**.

> A = {1, 2, 3}, B = {3, 4, 5}
> A − B = {1, 2}

---

### 🔄 Complement (A′)

Elements in the **universal set (U)** that are **not in A**.

> U = {1, 2, 3, 4, 5}, A = {1, 3, 5}
> A′ = {2, 4}

---

### ⨁ Symmetric Difference (A Δ B)

Elements in **A or B**, but **not both**.

> A = {1, 2, 3}, B = {3, 4}
> A Δ B = {1, 2, 4}

---

## 📐 **5. Venn Diagrams**

Visual way to represent sets and their relationships.

| Operation    | Diagram                                    |
| ------------ | ------------------------------------------ |
| Union        | Two circles overlapping, both areas shaded |
| Intersection | Only overlapping region shaded             |
| Difference   | Only A’s non-overlapping region shaded     |
| Complement   | Area outside A shaded                      |

*(I can generate diagrams for each if you want.)*

---

## 🧠 **6. Important Formulas**

1. **n(A ∪ B) = n(A) + n(B) − n(A ∩ B)**
2. **n(A ∪ B ∪ C) = n(A) + n(B) + n(C) − n(A ∩ B) − n(B ∩ C) − n(C ∩ A) + n(A ∩ B ∩ C)**
3. **n(A′) = n(U) − n(A)**

---

## 🧩 **7. Example MCQs**

**Q1:**
If A = {1, 2, 3} and B = {2, 3, 4}, then A ∪ B = ?
✅ **Answer:** {1, 2, 3, 4}

**Q2:**
If U = {1,2,3,4,5,6} and A = {2,4,6}, then A′ = ?
✅ **Answer:** {1,3,5}

**Q3:**
If n(A) = 20, n(B) = 15, and n(A ∩ B) = 5, then n(A ∪ B) = ?
✅ **Answer:** 20 + 15 − 5 = **30**

---
