class Leetcode2839 {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        var setOdd = new ArrayList<Character>();
        var setEven = new ArrayList<Character>();
        setOdd.add(s1.charAt(1));
        setOdd.add(s1.charAt(3));
        setEven.add(s1.charAt(0));
        setEven.add(s1.charAt(2));

        if(setOdd.contains(s2.charAt(1))){
            setOdd.remove(Character.valueOf(s2.charAt(1)));
            if(setOdd.contains(s2.charAt(3))){
                setOdd.remove(Character.valueOf(s2.charAt(3)));
                if(setEven.contains(s2.charAt(0))){
                    setEven.remove(Character.valueOf(s2.charAt(0)));
                    if(setEven.contains(s2.charAt(2)))
                        return true;
                }
            }
        }
        return false;
    }
}
