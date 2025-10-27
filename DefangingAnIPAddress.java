class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        var sb = new StringBuilder();
        for(char c : address.toCharArray()){
            if(c=='.')
                sb.append("[.]");
            else
                sb.append(c);
        }
        return new String(sb);
    }
}
