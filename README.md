# TestingLog4j2

Here is a sample [.properties file](src/conf/log4j2.properties) for [log4j2](https://logging.apache.org/log4j/2.x/) writing on syslog. 

## Running
gradle runShadow

Expected output on `/var/log/syslog`:

```
___DATE_HOUR___ ___HOSTNAME___ TestingLog4j2[___PID___] Starting application
___DATE_HOUR___ ___HOSTNAME___ TestingLog4j2[___PID___] This is a debug message
___DATE_HOUR___ ___HOSTNAME___ TestingLog4j2[___PID___] This is an info message
___DATE_HOUR___ ___HOSTNAME___ TestingLog4j2[___PID___] This is a warn message
___DATE_HOUR___ ___HOSTNAME___ TestingLog4j2[___PID___] This is an error message
___DATE_HOUR___ ___HOSTNAME___ TestingLog4j2[___PID___] This is a fatal message
___DATE_HOUR___ ___HOSTNAME___ TestingLog4j2[___PID___] Execution completed

```