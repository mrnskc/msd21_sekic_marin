# Exercise4.md

Um schneller auf Fehler in der Software zu kommen. Bzw. damit man den "Flow" oder Ablauf der Software besser nachvollziehen kann.

Log Levels:
ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATAL

Die Log Levels werden nach Reihenfolge (siehe oben) von links nach rechts berücksichtigt.
D.h. loggt man INFO dann werden auch WARN, ERROR und FATAL geloggt.

Appenders – Where to print logs. We can have multiple appenders.
Loggers – From where to log and what to log