package miw.apiArchitecture;

import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;
import es.upm.miw.web.http.HttpStatus;
import miw.apiArchitecture.api.ThemeResource;
import miw.apiArchitecture.api.VoteResource;
import miw.apiArchitecture.exceptions.InvalidRequestException;
import miw.apiArchitecture.exceptions.InvalidThemeFieldException;

public class Dispatcher {

	private ThemeResource themeResource = new ThemeResource();
	private VoteResource voteResource = new VoteResource();

	public void doGet(HttpRequest request, HttpResponse response) {
		// **/themes
		if ("themes".equals(request.getPath())) {
			// Injectar parámetros...
			response.setBody(themeResource.themeList().toString());
			// **/themes/1/overage
		} else if ("themes".equals(request.paths()[0]) && "overage".equals(request.paths()[2])) {
			try {
				response.setBody(themeResource.themeOverage(Integer.valueOf(request.paths()[1])));
			} catch (Exception e) {
				responseError(response, e);
			}
			// **/error
		} else {
			responseError(response, new InvalidRequestException(request.getPath()));
		}
	}

	public void doPost(HttpRequest request, HttpResponse response) {
		switch (request.getPath()) {
		case "themes":
			// Injectar parámetros...
			try {
				themeResource.createTheme(request.getParams().get("themeName"));
			} catch (InvalidThemeFieldException e) {
				this.responseError(response, e);
			}
			break;
		case "votes":
			// POST votes?themeId=*&vote=*
			String themeId = request.getParams().get("themeId");
			String vote = request.getParams().get("vote");
			try {
				voteResource.createVote(Integer.valueOf(themeId), Integer.valueOf(vote));
			} catch (Exception e) {
				responseError(response, e);
			}
			break;
		default:
			responseError(response, new InvalidRequestException(request.getPath()));
			break;
		}
	}

	public void doPut(HttpRequest request, HttpResponse response) {
		switch (request.getPath()) {
		default:
			responseError(response, new InvalidRequestException(request.getPath()));
			break;
		}
	}

	public void doDelete(HttpRequest request, HttpResponse response) {
		switch (request.getPath()) {
		default:
			responseError(response, new InvalidRequestException(request.getPath()));
			break;
		}
	}

	private void responseError(HttpResponse response, Exception e) {
		response.setBody("{\"error\":\"" + e + "\"}");
		response.setStatus(HttpStatus.BAD_REQUEST);
	}

}
