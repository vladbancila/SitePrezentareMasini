package domain;

import java.util.ArrayList;
import java.util.List;

public class Service {

	public static List<Produs> produse;

	static {
		produse = new ArrayList<Produs>();
		produse.add(new Produs(0, "Masina1", "Foarte rapida", "http://www.gadget-talk.ro/wp-content/uploads/2013/03/Masina-Aston-Martin-Rapide-S-GT.jpg"));
		produse.add(new Produs(1, "Masina2", "Foarte rapida", "http://tb.bizwiz.ro/Tu-ce-masina-conduci--Bentley--preferata-romanilor-cu-bani/ee933f07cd7847769/588/331/2/70/Tu-ce-masina-conduci--Bentley--preferata-romanilor-cu-bani.jpg"));
		produse.add(new Produs(2, "Masina3", "Foarte rapida", "http://web3.protv.ro/assets/incont/2012/05/12/image_galleries/22095/lux-pentru-miliardarii-lumii-cea-mai-rapida-masina-electrica-are-1088-cai-putere-costa-1-milion-de-dolari_12_size9.jpg"));
		produse.add(new Produs(3, "Masina4", "Foarte rapida", "http://www.ziuaconstanta.ro/images/stories/2009/06/online/masina.jpg"));
		produse.add(new Produs(4, "Masina5", "Foarte rapida", "https://www.odat.ro/wp-content/uploads/2014/03/imagine-cu-prototip-de-masina-1024x575.jpg"));
		produse.add(new Produs(5, "Masina6", "Foarte rapida", "http://static2.playtech.ro/wp-content/uploads/2015/07/Cele-mai-rapide-masini-1.jpg"));
		produse.add(new Produs(6, "Masina7", "Foarte rapida", "http://incomemagazine.ro/asset1/2011/11/1/12697/cele-mai-vandute-masini-de-lux-in-2011_article-main-image.jpg"));
		produse.add(new Produs(7, "Masina8", "Foarte rapida", "http://www.4tuning.ro/images/fete-si-masini/fete-si-masini-9ca0798c64f05fc1d-0-0-0-0-0.jpg"));
		produse.add(new Produs(8, "Masina9", "Foarte rapida", "http://storage0.dms.mpinteractiv.ro/media/2/41/1823/13490998/21/masini-romanesti-promotor-ro-1-decembrie-2015.jpg"));
		produse.add(new Produs(9, "Masina10", "Foarte rapida", "http://www.rentacar-topcars.ro/poze/47_mercedes-benz-e-class-0.jpg"));
		produse.add(new Produs(10, "Masina11", "Foarte rapida", "http://www.auto-bild.ro/wp-content/uploads/2014/01/Mercedes-Benz-E-Class_Coupe_2014_1024x768_wallpaper_0f-636x400.jpg"));
		produse.add(new Produs(11, "Masina12", "Foarte rapida", "http://web3.protv.ro/assets/incont/2010/05/28/image_galleries/4428/cele-mai-tari-masini-din-ultimii-10-ani-galerie-foto_1.jpg"));
		
		
	}

	public static List<Produs> getProduse() {
		return produse;
	}
	
}
