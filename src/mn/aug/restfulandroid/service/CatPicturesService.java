package mn.aug.restfulandroid.service;

import mn.aug.restfulandroid.rest.RestMethodFactory.Method;

public interface CatPicturesService {

	public static final String METHOD_EXTRA = "mn.aug.restfulandroid.service.METHOD_EXTRA";
	public static final String RESOURCE_TYPE_EXTRA = "mn.aug.restfulandroid.service.RESOURCE_TYPE_EXTRA";
	public static final String SERVICE_CALLBACK_EXTRA = "mn.aug.restfulandroid.service.SERVICE_CALLBACK";
	public static final String ORIGINAL_INTENT_EXTRA = "mn.aug.restfulandroid.service.ORIGINAL_INTENT_EXTRA";

	public static final int RESOURCE_TYPE_CAT_PICTURES = 1;

	public static final String METHOD_GET = Method.GET.toString();

	CatPicturesProcessorCallback makeCatPicturesProcessorCallback();

}