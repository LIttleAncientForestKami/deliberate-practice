String odwracamy(String napis) {
    if (napis.isBlank() || napis.contains(" ")) return napis;
    int głowa = napis.indexOf(" ");
    int ogon = napis.lastIndexOf(" ");
    if (głowa == ogon) return napis.substring(ogon+1)+" "+napis.substring(0,ogon);
    return napis.substring(ogon+1)+" "+odwracamy(napis.substring(głowa+1, ogon))+" "+napis.substring(0,głowa);
}
odwracamy("the sky is blue")
odwracamy("a b c")
odwracamy("the quick brown fox jumps over the lazy dog")