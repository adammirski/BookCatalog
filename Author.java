import java.time.LocalDate;
public  class Author{
    private String artistName;
    private LocalDate dob;

    public Author(String artistName, LocalDate dob) {
        this.artistName = artistName;
        this.dob = dob;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Author: " + artistName + ", dob=" + dob ;
    }

}