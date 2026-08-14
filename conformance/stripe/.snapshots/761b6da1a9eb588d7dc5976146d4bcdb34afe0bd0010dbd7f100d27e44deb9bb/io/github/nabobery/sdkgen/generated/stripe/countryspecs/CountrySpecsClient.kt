package io.github.nabobery.sdkgen.generated.stripe.countryspecs

import com.nabobery.sdkgen.runtime.BackoffHints
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.KotlinxSerializationCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.ResponseAlternative
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkParameterLocation
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkRequestParameter
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseDecodeResult
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SecurityRequirement
import com.nabobery.sdkgen.runtime.SecuritySchemeRef
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.SecurityScheme
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeAuthentication
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeBinding
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import com.nabobery.sdkgen.runtime.bodies.FormUrlEncodedBody
import io.github.nabobery.sdkgen.generated.stripe.CountrySpec
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CountrySpecsGetResponse200JsonXae746a8b
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject

internal object CountrySpecsCodecs {
  internal const val GETCOUNTRYSPECS_REQUEST_CODEC_ID: String = "GetCountrySpecs.request"

  private val getCountrySpecsRequestCodec: MediaTypeCodec<JsonObject?> = GetCountrySpecsFormCodec

  private val getCountrySpecsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CountrySpecsGetResponse200JsonXae746a8b> =
      KotlinxSerializationCodec("GetCountrySpecs.response.alternative0", InlineV1CountrySpecsGetResponse200JsonXae746a8b.Serializer, SdkJson)

  internal val getCountrySpecsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CountrySpecsGetResponse200JsonXae746a8b> =
      MediaTypeCodecRegistry.of(getCountrySpecsResponseCodecAlternative0Codec)

  private val getCountrySpecsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCountrySpecs.response.alternative1", Error.Serializer, SdkJson)

  internal val getCountrySpecsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCountrySpecsResponseCodecAlternative1Codec)

  internal val getCountrySpecsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCountrySpecsRequestCodec)

  internal const val GETCOUNTRYSPECSCOUNTRY_REQUEST_CODEC_ID: String =
      "GetCountrySpecsCountry.request"

  private val getCountrySpecsCountryRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCountrySpecsCountryFormCodec

  private val getCountrySpecsCountryResponseCodecAlternative0Codec: MediaTypeCodec<CountrySpec> =
      KotlinxSerializationCodec("GetCountrySpecsCountry.response.alternative0", CountrySpec.Serializer, SdkJson)

  internal val getCountrySpecsCountryResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CountrySpec> =
      MediaTypeCodecRegistry.of(getCountrySpecsCountryResponseCodecAlternative0Codec)

  private val getCountrySpecsCountryResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCountrySpecsCountry.response.alternative1", Error.Serializer, SdkJson)

  internal val getCountrySpecsCountryResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCountrySpecsCountryResponseCodecAlternative1Codec)

  internal val getCountrySpecsCountryRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCountrySpecsCountryRequestCodec)

  internal object GetCountrySpecsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCountrySpecs.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object GetCountrySpecsCountryFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCountrySpecsCountry.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'country_specs' group of Stripe API.
 */
public class CountrySpecsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "basicAuth" to SecurityScheme.HttpBasic,
        "bearerAuth" to SecurityScheme.HttpBearer(),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@CountrySpecsClient.authentication)

  /**
   * <p>Lists all Country Spec objects available in the API.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getCountrySpecsWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCountrySpecsResponse> = executor.executeWithResponse<JsonObject?, GetCountrySpecsResponse>(SdkExecutionRequest(getCountrySpecsMetadata, baseUri, request, listOf(CountrySpecsCodecs.GETCOUNTRYSPECS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), CountrySpecsCodecs.getCountrySpecsRequestCodecRegistry, GetCountrySpecsResponseDecoder, options)

  /**
   * <p>Returns a Country Spec for a given Country code.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param country Wire parameter `country`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCountrySpecsCountryWithResponse(
    request: JsonObject? = null,
    country: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCountrySpecsCountryResponse> = executor.executeWithResponse<JsonObject?, GetCountrySpecsCountryResponse>(SdkExecutionRequest(getCountrySpecsCountryMetadata, baseUri, request, listOf(CountrySpecsCodecs.GETCOUNTRYSPECSCOUNTRY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "country", values = listOf(country.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CountrySpecsCodecs.getCountrySpecsCountryRequestCodecRegistry, GetCountrySpecsCountryResponseDecoder, options)

  /**
   * Typed response alternatives for `GetCountrySpecs`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetCountrySpecsResponse {
    public class SuccessJson(
      public val json: InlineV1CountrySpecsGetResponse200JsonXae746a8b,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCountrySpecsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCountrySpecsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCountrySpecsResponse
  }

  private object GetCountrySpecsResponseDecoder : SdkResponseAlternativeDecoder<GetCountrySpecsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCountrySpecsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCountrySpecsResponse> = when {
      alternative.id == "GetCountrySpecs.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCountrySpecsResponse.SuccessJson(
          json = CountrySpecsCodecs.getCountrySpecsResponseCodecAlternative0Registry.select(listOf("GetCountrySpecs.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCountrySpecs.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCountrySpecsResponse.DefaultJson(
          json = CountrySpecsCodecs.getCountrySpecsResponseCodecAlternative1Registry.select(listOf("GetCountrySpecs.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GetCountrySpecsResponse = GetCountrySpecsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCountrySpecsCountry`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetCountrySpecsCountryResponse {
    public class SuccessJson(
      public val json: CountrySpec,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCountrySpecsCountryResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCountrySpecsCountryResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCountrySpecsCountryResponse
  }

  private object GetCountrySpecsCountryResponseDecoder : SdkResponseAlternativeDecoder<GetCountrySpecsCountryResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCountrySpecsCountryResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCountrySpecsCountryResponse> = when {
      alternative.id == "GetCountrySpecsCountry.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCountrySpecsCountryResponse.SuccessJson(
          json = CountrySpecsCodecs.getCountrySpecsCountryResponseCodecAlternative0Registry.select(listOf("GetCountrySpecsCountry.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCountrySpecsCountry.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCountrySpecsCountryResponse.DefaultJson(
          json = CountrySpecsCodecs.getCountrySpecsCountryResponseCodecAlternative1Registry.select(listOf("GetCountrySpecsCountry.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GetCountrySpecsCountryResponse = GetCountrySpecsCountryResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getCountrySpecsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCountrySpecs",
          method = "GET",
          path = "/v1/country_specs",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CountrySpecsGetResponse200JsonXae746a8b",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCountrySpecs.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCountrySpecs.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val getCountrySpecsCountryMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCountrySpecsCountry",
          method = "GET",
          path = "/v1/country_specs/{country}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CountrySpec",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCountrySpecsCountry.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCountrySpecsCountry.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }
  }
}
