package model.data_structures;

import java.sql.Time;
import java.util.Comparator;
import java.util.Date;

public class YoutubeVideo implements Comparable <YoutubeVideo>
{
	private String id;
	
	private Date trending_date;
	
	private String titulo;
	
	private String tituloCanal;
	
	private int idCategoria;
	
	private Date tiempoPub;
	
	private String tags;
	
	private int views;
	
	private int likes;
	
	private int dislikes;
	
	private int comentarios;
	
	private String link;
	
	private boolean comentariosDesac;
	
	private boolean ratingsDesac;
	
	private boolean error;
	
	private String descripcion;
	
	private String pais;
	
	private String llave;
	
	
	public YoutubeVideo(String pId, Date ptrending, String pTitulo,String pTituloCanal, int pIdCategoria,Date pTiempoPub, String pTags, 
			int pViews,int  pLikes, int pDislikes, int pComentarios, String pLink, boolean pComentariosDesac, boolean pRatingsDesac, 
			boolean pError, String pDescripcion, String pPais, String pLLave)
	{
		id=pId ;
		
		trending_date=ptrending;
		
		titulo= pTitulo;
		
		tituloCanal= pTituloCanal;
		
		idCategoria= pIdCategoria;
		
		tiempoPub=pTiempoPub;
		
		tags=pTags;
		
		views= pViews;
		
		likes=pLikes;
		
		dislikes=pDislikes;
		
		comentarios=pComentarios;
		
		link=pLink;
		
		comentariosDesac= pComentariosDesac;
		
		ratingsDesac= pRatingsDesac ;
		
		error=pError;
		
		descripcion=pDescripcion;
		
		pais=pPais;
		
		llave=pLLave;
	}
	
	public Date darTrendingDate()
	{
		return trending_date;
	}


	@Override
	public int compareTo(YoutubeVideo otro) 
	{
		return this.trending_date.compareTo(otro.darTrendingDate());
	}

	public String toString ()
	{
		String info= "\n Título: " + titulo + "\n Views: " + views + "\n Likes: " + likes
		+ "\n Dislikes: " + dislikes;
		return info;
	}
	
	/** Comparador alterno de 2 videos por número de likes
	 * 
	 * @author DaniU
	 *
	 */
	 
}
