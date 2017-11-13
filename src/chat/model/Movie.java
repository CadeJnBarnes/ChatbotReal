package chat.model;

import java.time.LocalDate;

public class Movie
{
	private String title;
	private String genre;
	private String ratingMPAA;
	private String review;
	private int length;
	private LocalDate releaseDate;
	private double starScore;
	// fix all the nulls
	public Movie(String title)
	{
		this.title = "Title: " + title;
		this.genre = "Thriller";
		this.ratingMPAA = "PG-13";
		this.review = "Best movie ever!";
		this.length = 120;
		this.releaseDate = null;
		this.starScore = 9.99;
	}

	public String getTitle()
	{
		return title;
	}
// @ signs
	public String getGenre()
	{
		this.genre = "@@@@@@@";
		return genre;
	}

	public String getRatingMPAA()
	{
		return ratingMPAA;
	}

	public String getReview()
	{
		return review;
	}
// negative number
	public int getLength()
	{
		return -99999999;
	}

	public LocalDate getReleaseDate()
	{
		return releaseDate;
	}

	public double getStarScore()
	{
		return starScore;
	}

	public void setTitle(String title)
	{
		this.title = "Title: " + title;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public void setRatingMPAA(String ratingMPAA)
	{
		this.ratingMPAA = ratingMPAA;
	}

	public void setReview(String review)
	{
		this.review = review;
	}

	public void setLength(int length)
	{
		this.length = length;
	}

	public void setReleaseDate(LocalDate releaseDate)
	{
		this.releaseDate = releaseDate;
	}

	public void setStarScore(double starScore)
	{
		this.starScore = starScore;
	}
	
	public String toString()
	{
		return null;
	}
}
