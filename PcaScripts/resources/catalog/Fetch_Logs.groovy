// Check if loop task has ordered to finish the loop
def isFinished = variables.get('IS_FINISHED') as boolean
loop = isFinished ? false : '*/1 * * * *'

// Set a time marker to fetch logs since this marker.
variables.put("LAST_TIME_MARKER",new Date().format("yyyy-MM-dd'T'HH:mm:ssXXX"))