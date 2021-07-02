package requisicaoHTTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpURLConnectionRequisicao {

	private static StringBuffer leituraConexao(String cnpj)  {
		URL url;
		// Criação de uma solicitação
		try {
			url = new URL("https://receitaws.com.br/v1/cnpj/" + cnpj);
			System.out.println("URL: " + url);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setConnectTimeout(5000);
			con.setReadTimeout(5000);

			int status = con.getResponseCode();

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
			return content;
			// erros
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		String cnpjAmor = "30885426000130";
		System.out.println(HttpURLConnectionRequisicao.leituraConexao(cnpjAmor));
	}
}
