class UniqueEmailAddresses {
    fun numUniqueEmails(emails: Array<String>): Int {
        val seen = mutableSetOf<String>()
        for (email in emails) {
            val parts = email.split("@")
            var local = parts[0]
            val domain = parts[1]
            if ('+' in local) {
                local = local.substringBefore('+')
            }
            local = local.replace(".", "")
            seen.add("$local@$domain")
        }
        return seen.size
    }
}
