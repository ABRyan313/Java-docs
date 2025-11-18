# #️⃣ **Bash — Interview Notes**

## ⭐ **1. What is Bash?**

**Bash (Bourne Again SHell)** is:

* A command-line interpreter for Unix/Linux.
* A scripting language.
* Used for automation, file operations, and server DevOps tasks.

---

# ⭐ **2. Bash Basics**

## **Common Commands**

| Command        | Purpose                |
| -------------- | ---------------------- |
| `ls`           | List files             |
| `cd`           | Change directory       |
| `pwd`          | Show current directory |
| `mkdir`        | Create folder          |
| `rm`, `rm -rf` | Delete file/folder     |
| `cp`, `mv`     | Copy / move files      |
| `cat`, `less`  | Read files             |
| `touch`        | Create empty file      |

---

# ⭐ **3. Variables**

```bash
name="Ryan"
echo $name
```

* No space around `=`.
* Access with `$var`.

### **Command substitution**

```bash
today=$(date)
```

---

# ⭐ **4. Conditionals**

```bash
if [ $age -ge 18 ]; then
  echo "Adult"
else
  echo "Minor"
fi
```

**Common comparison operators:**

* Numbers → `-eq`, `-ne`, `-lt`, `-gt`
* Strings → `=`, `!=`, `-z`, `-n`

---

# ⭐ **5. Loops**

### **for loop**

```bash
for file in *.txt; do
  echo $file
done
```

### **while loop**

```bash
while read line; do
  echo "$line"
done < file.txt
```

---

# ⭐ **6. Functions**

```bash
greet() {
  echo "Hello $1"
}

greet "Ryan"
```

---

# ⭐ **7. File Permissions**

* `chmod` → change permissions
* `chown` → change owner

Permission notation:

* `r` = read
* `w` = write
* `x` = execute

Example:

```bash
chmod 755 script.sh
```

---

# ⭐ **8. Shell Scripting Structure**

Example script:

```bash
#!/bin/bash

echo "Starting deployment..."
date
```

Make it executable:

```bash
chmod +x deploy.sh
```

Run:

```bash
./deploy.sh
```

---

# ⭐ **9. Environment Variables**

```bash
export APP_ENV=production
```

To print all:

```bash
env
```

---

# ⭐ **10. Pipes & Redirections**

### Pipes

```bash
ls -l | grep ".txt"
```

### Redirections

```bash
echo "Hello" > file.txt     # overwrite  
echo "More" >> file.txt     # append  
command 2> error.log         # error output
```

---

# ⭐ **11. Process Management**

```bash
ps aux              # list processes
kill <PID>          # kill a process
top/htop            # real-time monitoring
```

---

# ⭐ **12. Package Managers**

Depends on OS:

* Ubuntu → `apt`
* CentOS → `yum`
* Arch → `pacman`

Example:

```bash
sudo apt update && sudo apt install nginx
```

---

# ⭐ **13. Cron Jobs (Automation)**

```bash
crontab -e
```

Example run script every 5 minutes:

```
*/5 * * * * /home/user/backup.sh
```

---

# 📝 **Interview Q&A**

### **Q1: Difference between Bash and Shell?**

**A:** Shell is a generic term; Bash is a specific shell implementation.

---

### **Q2: What does `#!/bin/bash` mean?**

**A:** Shebang — tells OS which interpreter to use to run the script.

---

### **Q3: How to pass arguments to a Bash script?**

```bash
./script.sh arg1 arg2
```

Inside script:

* `$1`, `$2` → first & second arguments
* `$@` → all arguments

---

### **Q4: How to debug a Bash script?**

Run with debug mode:

```bash
bash -x script.sh
```

---

### **Q5: What is the difference between `>` and `>>`?**

* `>` overwrites
* `>>` appends

---

### **Q6: How to check exit status of last command?**

```bash
echo $?
```

---

### **Q7: How to find number of lines in a file?**

```bash
wc -l file.txt
```

---

### **Q8: What is `$PATH`?**

Environment variable that defines where executable programs are searched.

---

# 🌍 **Real-World Scenarios**

### **1. Automated Backup Script**

```bash
#!/bin/bash
tar -czf backup.tar.gz /var/www/
```

---

### **2. Deploy Spring Boot App**

```bash
#!/bin/bash
git pull origin main
mvn clean install
systemctl restart app.service
```

---

### **3. Log Monitoring**

```bash
tail -f /var/log/nginx/error.log | grep "timeout"
```

---

### **4. Bulk Rename Files**

```bash
for f in *.jpg; do
  mv "$f" "img_$f"
done
```

---

### **5. Health Check Script**

```bash
if curl -s http://localhost:8080 > /dev/null; then
  echo "App is running"
else
  echo "App is down"
fi
```
Below are **Bash MCQs** and **Mock Interview Questions** in clean **Markdown format**, perfect for screening tests or interviews.

---

# #️⃣ **Bash MCQs (with Answers at the End)**

## **MCQ Set — 1 (Fundamentals)**

### **1. Which command is used to list files in a directory?**

a) show
b) list
c) ls
d) dir

---

### **2. What does `chmod 755 file.sh` do?**

a) Gives all permissions to everyone
b) Gives owner full rights, others read+execute
c) Removes write permission for all
d) Makes the file read-only

---

### **3. What symbol is used for command substitution?**

a) @()
b) $()
c) @@
d) {}

---

### **4. Which line defines the script interpreter?**

a) `#!/bin/bash`
b) `// interpreter bash`
c) `bash:`
d) `start bash:`

---

### **5. What does `2>` do in Bash?**

a) Redirects standard output
b) Redirects both stdout and stderr
c) Redirects standard error
d) Redirects input

---

## **MCQ Set — 2 (Intermediate)**

### **6. How to print all arguments passed to a script?**

a) `$*`
b) `$#`
c) `$@`
d) `$?`

---

### **7. What will this command do?**

```bash
grep "error" log.txt | wc -l
```

a) Replace error text
b) Count lines containing "error"
c) Delete error lines
d) Show only the first error

---

### **8. Which loop syntax is correct?**

a) `do for list; done`
b) `for i in list do; done`
c) `for i in list; do ... done`
d) `loop list:`

---

### **9. What does `$?` represent?**

a) Number of arguments
b) PID of script
c) Exit code of last command
d) Last printed text

---

### **10. To run a script in background, you use…**

a) `script.sh@`
b) `./script.sh --bg`
c) `./script.sh &`
d) `background ./script.sh`

---

## **MCQ Set — 3 (Advanced)**

### **11. How to schedule a cron job?**

a) `cron -add`
b) `crontab -e`
c) `crontab create`
d) `cronjob new`

---

### **12. Which command finds all `.txt` files?**

a) `find . -type txt`
b) `find . '*.txt'`
c) `find . -name "*.txt"`
d) `search "*.txt"`

---

### **13. What does `set -x` do?**

a) Prevents script from running
b) Runs script in silent mode
c) Enables debug mode
d) Prints environment variables

---

### **14. Which is valid string comparison?**

a) `[ $a == $b ]`
b) `( $a = $b )`
c) `[ $a -eq $b ]` for string
d) `[$a equals $b]`

---

### **15. What does `>&1` do?**

a) Redirect stderr to stdout
b) Redirect stdout to stderr
c) Redirect both to /dev/null
d) Redirect input to one

---

---

# ✔️ **MCQ Answers**

1. c
2. b
3. b
4. a
5. c
6. c
7. b
8. c
9. c
10. c
11. b
12. c
13. c
14. a
15. a

---

# #️⃣ **Mock Interview Questions (Bash)**

## ⭐ **Basic Level**

### **1. What is Bash and how is it different from a terminal?**

Explains the difference between shell vs terminal emulator.

---

### **2. What does the shebang (`#!/bin/bash`) do?**

---

### **3. How do you make a script executable?**

---

### **4. What are environment variables? Give examples.**

---

### **5. What is the difference between `>` and `>>`?**

---

### **6. How do you check the number of arguments passed to a script?**

---

### **7. What does `$?` contain in Bash?**

---

## ⭐ **Intermediate Level**

### **8. Write a script to read a file line by line.**

---

### **9. How do you use conditionals in Bash? Difference between `=` and `-eq`?**

---

### **10. What is the use of `set -x` and `set -e`?**

---

### **11. How do pipes work in Bash? Example?**

---

### **12. How do you schedule a script to run every day at midnight?**

---

### **13. How do you find and delete files over 10MB?**

(Hint: `find`, `-size`, `-delete`)

---

## ⭐ **Advanced Level**

### **14. Explain how to handle errors in Bash scripts.**

---

### **15. What are subshells? When are they created?**

---

### **16. What is the difference between `$*` and `$@`?**

---

### **17. How to redirect both stdout and stderr to the same file?**

---

### **18. Explain how to trap signals (SIGINT, SIGTERM) in Bash.**

---

### **19. How to write a script that monitors CPU usage and logs high usage alerts?**

---

### **20. How does Bash handle arrays? Describe with example.**

---


Below is the **clean combined format**:
Each **assignment question** is shown **first**, and its **solution appears directly under it**—all in **Markdown**.

---

# #️⃣ **Bash Assignments + Solutions (Combined Format)**

---

# ⭐ **1. Log File Analyzer**

### **Problem**

Write a script that:

* Counts how many times `"ERROR"` appears
* Extracts `"CRITICAL"` lines into `critical.log`
* Prints total line count

### ✅ **Solution**

```bash
#!/bin/bash

file=$1

if [ ! -f "$file" ]; then
  echo "File not found!"
  exit 1
fi

echo "ERROR count: $(grep -c "ERROR" "$file")"

grep "CRITICAL" "$file" > critical.log

echo "Total lines: $(wc -l < "$file")"
```

---

# ⭐ **2. Automated Backup Script**

### **Problem**

* Compress a directory
* Name file using timestamp
* Log activity
* Delete backups older than 7 days

### ✅ **Solution**

```bash
#!/bin/bash

src=$1
timestamp=$(date +"%Y-%m-%d_%H-%M")
backup_file="backup_$timestamp.tar.gz"

tar -czf "$backup_file" "$src"

echo "$(date): Backup created $backup_file" >> backup.log

find . -name "backup_*.tar.gz" -mtime +7 -delete
```

---

# ⭐ **3. System Health Monitor**

### **Problem**

Check CPU, memory, and disk usage.
If usage >80%, log warning.

### ✅ **Solution**

```bash
#!/bin/bash

cpu=$(top -bn1 | grep "Cpu(s)" | awk '{print $2}' | cut -d. -f1)
mem=$(free | grep Mem | awk '{print ($3/$2)*100}' | cut -d. -f1)
disk=$(df / | tail -1 | awk '{print $5}' | tr -d '%')

if [ $cpu -gt 80 ]; then
  echo "$(date): High CPU: $cpu%" >> alerts.log
fi

if [ $mem -gt 80 ]; then
  echo "$(date): High Memory: $mem%" >> alerts.log
fi

if [ $disk -gt 80 ]; then
  echo "$(date): High Disk: $disk%" >> alerts.log
fi
```

---

# ⭐ **4. Bulk File Renamer**

### **Problem**

* Add prefix `img_` to `.jpg` files
* Replace spaces with `_`
* Print count

### ✅ **Solution**

```bash
#!/bin/bash

count=0

for f in *.jpg; do
  new=$(echo "$f" | tr ' ' '_')
  mv "$f" "img_$new"
  count=$((count+1))
done

echo "$count files renamed."
```

---

# ⭐ **5. User Account Creation Automation**

### **Problem**

* Read usernames from file
* Create user
* Set password
* Force password reset
* Log results

### ✅ **Solution**

```bash
#!/bin/bash

file=$1

while read user; do
  if id "$user" &>/dev/null; then
    echo "$user already exists" >> user.log
  else
    useradd "$user"
    echo "Temp@123" | passwd --stdin "$user"
    chage -d 0 "$user"
    echo "Created $user" >> user.log
  fi
done < "$file"
```

---

# ⭐ **6. Web Service Health Check**

### **Problem**

Check HTTP response code.
If ≠ 200, log downtime.

### ✅ **Solution**

```bash
#!/bin/bash

url=$1

code=$(curl -o /dev/null -s -w "%{http_code}" "$url")

if [ "$code" -ne 200 ]; then
  echo "$(date): $url is DOWN (Code: $code)" >> service_down.log
fi
```

---

# ⭐ **7. Directory Synchronization Tool**

### **Problem**

Sync `src → dest` and delete removed files.

### ✅ **Solution**

```bash
#!/bin/bash

src=$1
dest=$2

rsync -av --delete "$src/" "$dest/"
```

---

# ⭐ **8. CSV Processor**

### **Problem**

* Print people older than 23
* Count people from Dhaka
* Save names to `names.txt`

### ✅ **Solution**

```bash
#!/bin/bash

file=$1

echo "People older than 23:"
awk -F',' 'NR>1 && $2 > 23 { print $1 }' "$file"

echo "People from Dhaka:"
awk -F',' '$3=="Dhaka" {count++} END {print count}' "$file"

awk -F',' 'NR>1 { print $1 }' "$file" > names.txt
```

---

# ⭐ **9. Password Generator**

### **Problem**

Generate 12-character password with:

* uppercase
* lowercase
* number
* special character

### ✅ **Solution**

```bash
#!/bin/bash

upper=$(tr -dc A-Z < /dev/urandom | head -c1)
lower=$(tr -dc a-z < /dev/urandom | head -c1)
num=$(tr -dc 0-9 < /dev/urandom | head -c1)
special=$(tr -dc '!@#$%^&*()_+=' < /dev/urandom | head -c1)
rest=$(tr -dc 'A-Za-z0-9!@#$%^&*()_+=' < /dev/urandom | head -c8)

password="$upper$lower$num$special$rest"
echo "$password"
```

---

# ⭐ **10. Cron Scheduler Setup**

### **Problem**

* Add cron job every 15 mins
* Avoid duplicate entries

### ✅ **Solution**

```bash
#!/bin/bash

script=$1

entry="*/15 * * * * $script"

(crontab -l | grep -q "$script") && { echo "Cron already exists"; exit; }

(crontab -l; echo "$entry") | crontab -
echo "Cron added"
```

---

# ⭐ **11. Directory Size Reporter**

### **Problem**

List folders with size (largest first).
Save to `sizes.txt`.

### ✅ **Solution**

```bash
#!/bin/bash

du -sh ./* | sort -hr > sizes.txt
```

---

# ⭐ **12. File Change Notifier**

### **Problem**

Monitor directory for changes and log events.

### ✅ **Solution**

```bash
#!/bin/bash

watch_dir=$1

inotifywait -m -e create -e delete -e modify "$watch_dir" |
while read dir action file; do
  echo "$(date): $file was $action" >> changes.log
done
```

---

# ⭐ **13. JSON Field Extractor**

### **Problem**

Extract values:

* `role`
* all items in `"skills"`

### ✅ **Solution**

```bash
#!/bin/bash

file=$1

echo "Role:"
jq '.role' "$file"

echo "Skills:"
jq -r '.skills[]' "$file"
```

---

# ⭐ **14. IP Scanner**

### **Problem**

Ping `.1` to `.254` and save UP hosts.

### ✅ **Solution**

```bash
#!/bin/bash

subnet=$1

> live_hosts.txt

for i in {1..254}; do
  ip="$subnet.$i"
  ping -c1 -W1 "$ip" &>/dev/null
  if [ $? -eq 0 ]; then
    echo "$ip" | tee -a live_hosts.txt
  fi
done
```

---

# ⭐ **15. Menu-Driven Program**

### **Problem**

Menu supporting:

1. date
2. list files
3. disk usage
4. exit

### ✅ **Solution**

```bash
#!/bin/bash

while true; do
  echo "1) Show date"
  echo "2) List files"
  echo "3) Show disk usage"
  echo "4) Exit"
  read -p "Choose: " choice

  case $choice in
    1) date ;;
    2) ls -l ;;
    3) df -h ;;
    4) exit 0 ;;
    *) echo "Invalid option" ;;
  esac
done
```

Below is a **CI/CD-focused Bash assignment**, designed exactly like what companies give during screening tests.
It includes **problems + solutions directly under each question** (as requested).
All content is in **Markdown**.

---

# 🚀 **CI/CD Bash Assignment (With Solutions)**

## **1. Write a Bash script that checks if a CI pipeline should run tests based on branch name.**

**Requirements:**

* If branch = `main` or `develop` → run tests
* Otherwise → skip tests
* Print the correct message

### ✅ **Solution**

```bash
#!/bin/bash

BRANCH="$1"

if [[ "$BRANCH" == "main" || "$BRANCH" == "develop" ]]; then
    echo "Running tests for branch: $BRANCH"
else
    echo "Skipping tests for branch: $BRANCH"
fi
```

---

## **2. Write a script that increments a build version in a `version.txt` file.**

**Example:**

* version.txt contains: `1.4.9`
* After running → `1.4.10`

### ✅ **Solution**

```bash
#!/bin/bash

VERSION=$(cat version.txt)

IFS='.' read -r MAJOR MINOR PATCH <<< "$VERSION"

PATCH=$((PATCH + 1))

echo "$MAJOR.$MINOR.$PATCH" > version.txt

echo "Updated version: $MAJOR.$MINOR.$PATCH"
```

---

## **3. Create a script that checks if the last command failed. If it failed, exit CI pipeline.**

### ✅ **Solution**

```bash
#!/bin/bash

some_command_here
if [[ $? -ne 0 ]]; then
    echo "ERROR: previous step failed. Stopping CI."
    exit 1
else
    echo "Step succeeded. Continuing CI."
fi
```

---

## **4. Write a script to deploy a Docker container only if image build is successful.**

### Requirements:

* Build an image
* If successful → run container
* If failed → exit pipeline

### ✅ **Solution**

```bash
#!/bin/bash

docker build -t myapp .

if [[ $? -eq 0 ]]; then
    echo "Build success! Deploying container..."
    docker run -d --name myapp_container -p 8080:8080 myapp
else
    echo "Build failed! Deployment aborted."
    exit 1
fi
```

---

## **5. Write a Bash script that validates `.env` file before deployment.**

**Rules:**

* `.env` must contain `DB_URL`, `API_KEY`
* Both must be non-empty

### ✅ **Solution**

```bash
#!/bin/bash

source .env

if [[ -z "$DB_URL" || -z "$API_KEY" ]]; then
    echo "Missing required environment variables!"
    exit 1
else
    echo ".env validation passed!"
fi
```

---

## **6. Write a Bash script to archive previous build artifacts for CI/CD logs.**

### Requirements:

* Move all files from `/build/output/` to `/build/archive/yyyy-mm-dd/`
* Create the archive directory if not exists

### ✅ **Solution**

```bash
#!/bin/bash

DATE=$(date +%F)
ARCHIVE_DIR="/build/archive/$DATE"
OUTPUT_DIR="/build/output"

mkdir -p "$ARCHIVE_DIR"

mv "$OUTPUT_DIR"/* "$ARCHIVE_DIR"/

echo "Artifacts archived to $ARCHIVE_DIR"
```

---

## **7. Write a script to send Slack notification after CI deploy.**

### Requirements:

* Accept message as argument
* Print what curl command would do (dry run)

### ✅ **Solution**

```bash
#!/bin/bash

MESSAGE="$1"
WEBHOOK_URL="https://hooks.slack.com/services/XYZ/123/ABC"

echo "Sending Slack notification:"
echo "curl -X POST -H 'Content-type: application/json' --data '{\"text\":\"$MESSAGE\"}' $WEBHOOK_URL"
```

---

## **8. Create a script that checks if required tools exist: git, docker, jq**

### Requirements:

* If missing → print error
* If all installed → success

### ✅ **Solution**

```bash
#!/bin/bash

TOOLS=("git" "docker" "jq")

for tool in "${TOOLS[@]}"; do
    if ! command -v "$tool" >/dev/null 2>&1; then
        echo "ERROR: $tool is not installed!"
        exit 1
    fi
done

echo "All required tools are installed!"
```

---

## **9. Create a Bash script that simulates a CI pipeline with steps: build → test → deploy**

### Requirements:

* Each step is a function
* Run in sequence
* If any step fails → exit pipeline

### ✅ **Solution**

```bash
#!/bin/bash

build() {
    echo "Building application..."
    return 0
}

test_app() {
    echo "Running tests..."
    return 0
}

deploy() {
    echo "Deploying application..."
    return 0
}

build || { echo "Build failed"; exit 1; }
test_app || { echo "Tests failed"; exit 1; }
deploy || { echo "Deploy failed"; exit 1; }

echo "CI pipeline completed successfully!"
```

---

## **10. Create a script to read a JSON file and extract the deployment version using jq.**

Example `config.json`:

```json
{
    "app": "inventory-service",
    "version": "3.2.1"
}
```

### Required: print → `Deploying version 3.2.1`

### ✅ **Solution**

```bash
#!/bin/bash

VERSION=$(jq -r '.version' config.json)

echo "Deploying version $VERSION"
```







