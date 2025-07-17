## 📦 Data & Storage

- **Searching text in massive data?** → *Inverted Index*
- **ACID matters?** → *RDBMS*
- **Messy/flexible schema?** → *NoSQL*
- **Need to store videos, images, big blobs?** → *Object Storage (S3, GCS)*
- **Global access?** → *CDN*

---

## 🚀 Performance & Scaling

- **Mostly reads?** → *Read-through Cache (Redis)*
- **Mostly writes?** → *Async Queues (Kafka, RabbitMQ)*
- **Database scaling?**
  - *NoSQL* → Horizontal Scaling
  - *RDBMS* → Vertical Scaling or Sharding
- **Low latency?** → *CDN + Load Balancer + Cache*
- **Slow queries?** → *Use Indexes* (single/multi-column, covering indexes)

---

## ⚖️ Load Management & Scaling

- **Too much traffic on one service?** → *Rate Limiting*
- **Smart request routing across servers?** → *Consistent Hashing*
- **Willing to trade consistency for uptime?** → *Eventual Consistency*
- **Cache getting full?** → *LRU (default)* or use *custom eviction*

---

## 💪 Reliability & Fault Tolerance

- **Need High Availability?** → *Load Balancer + Replication*
- **Protect writes?** → *Write-through Cache + Replica*
- **Ensure data sync across systems?** → *Checksums / Hashing*

---

## 📡 Real-Time Communication

- **Live updates (chat, notifications)?** → *WebSockets*
- **Video/audio call?** → *WebRTC*

---

## 🔍 Observability

- **Debugging & system health?** → *Centralized Logging/Monitoring (ELK, Grafana)*
- **Trace bottlenecks across services?** → *Distributed Tracing (OpenTelemetry, Jaeger)*

---

## 🧠 Advanced Patterns

- **Circuit Breaker** → Isolate failing components to prevent cascading failures
- **Bulkhead** → Partition system resources to contain failures
- **Throttling** → Limit usage to protect downstream systems

---

## 📝 What to Remember

- Start with the **problem type** (read-heavy, write-heavy, low latency, real-time)
- Pick the right **primitive** → Queue, cache, balancer, tracing, etc.
- Think in **trade-offs** → Latency, consistency, availability, durability, cost

---

## ➕ What would you add to this list?
```

Let me know if you want this saved as a file or extended with diagrams.
