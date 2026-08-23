package com.nabobery.sdkgen.generated.stripe.exchangerates

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.ExchangeRate
import com.nabobery.sdkgen.generated.stripe.InlineV1ExchangeRatesGetResponse200JsonXfadae399
import com.nabobery.sdkgen.generated.stripe.SdkJson
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
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject

internal object ExchangeRatesCodecs {
  internal const val GETEXCHANGERATES_REQUEST_CODEC_ID: String = "GetExchangeRates.request"

  private val getExchangeRatesRequestCodec: MediaTypeCodec<JsonObject?> = GetExchangeRatesFormCodec

  private val getExchangeRatesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ExchangeRatesGetResponse200JsonXfadae399> =
      KotlinxSerializationCodec("GetExchangeRates.response.alternative0", InlineV1ExchangeRatesGetResponse200JsonXfadae399.Serializer, SdkJson)

  internal val getExchangeRatesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ExchangeRatesGetResponse200JsonXfadae399> =
      MediaTypeCodecRegistry.of(getExchangeRatesResponseCodecAlternative0Codec)

  private val getExchangeRatesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetExchangeRates.response.alternative1", Error.Serializer, SdkJson)

  internal val getExchangeRatesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getExchangeRatesResponseCodecAlternative1Codec)

  internal val getExchangeRatesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getExchangeRatesRequestCodec)

  internal const val GETEXCHANGERATESRATEID_REQUEST_CODEC_ID: String =
      "GetExchangeRatesRateId.request"

  private val getExchangeRatesRateIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetExchangeRatesRateIdFormCodec

  private val getExchangeRatesRateIdResponseCodecAlternative0Codec: MediaTypeCodec<ExchangeRate> =
      KotlinxSerializationCodec("GetExchangeRatesRateId.response.alternative0", ExchangeRate.Serializer, SdkJson)

  internal val getExchangeRatesRateIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ExchangeRate> =
      MediaTypeCodecRegistry.of(getExchangeRatesRateIdResponseCodecAlternative0Codec)

  private val getExchangeRatesRateIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetExchangeRatesRateId.response.alternative1", Error.Serializer, SdkJson)

  internal val getExchangeRatesRateIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getExchangeRatesRateIdResponseCodecAlternative1Codec)

  internal val getExchangeRatesRateIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getExchangeRatesRateIdRequestCodec)

  internal object GetExchangeRatesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetExchangeRates.request"

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

  internal object GetExchangeRatesRateIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetExchangeRatesRateId.request"

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
 * Client for the 'exchange_rates' group of Stripe API.
 */
public class ExchangeRatesClient(
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
      SdkExecutor(transport, authentication = this@ExchangeRatesClient.authentication)

  /**
   * <p>[Deprecated] The <code>ExchangeRate</code> APIs are deprecated. Please use the <a
   * href="https://docs.stripe.com/payments/currencies/localize-prices/fx-quotes-api">FX Quotes API</a> instead.</p>
   *
   * <p>Returns a list of objects that contain the rates at which foreign currencies are converted to one another. Only
   * shows the currencies for which Stripe supports.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param endingBefore A cursor for use in pagination. `ending_before` is the currency that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with the exchange rate for
   * currency X your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the
   * list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and total number of
   * supported payout currencies, and the default is the max.
   * @param startingAfter A cursor for use in pagination. `starting_after` is the currency that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with the exchange rate for
   * currency X, your subsequent call can include `starting_after=X` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getExchangeRatesWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetExchangeRatesResponse> = executor.executeWithResponse<JsonObject?, GetExchangeRatesResponse>(SdkExecutionRequest(getExchangeRatesMetadata, baseUri, request, listOf(ExchangeRatesCodecs.GETEXCHANGERATES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), ExchangeRatesCodecs.getExchangeRatesRequestCodecRegistry, GetExchangeRatesResponseDecoder, options)

  /**
   * <p>[Deprecated] The <code>ExchangeRate</code> APIs are deprecated. Please use the <a
   * href="https://docs.stripe.com/payments/currencies/localize-prices/fx-quotes-api">FX Quotes API</a> instead.</p>
   *
   * <p>Retrieves the exchange rates from the given currency to every supported currency.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param rateId Wire parameter `rate_id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getExchangeRatesRateIdWithResponse(
    request: JsonObject? = null,
    rateId: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetExchangeRatesRateIdResponse> = executor.executeWithResponse<JsonObject?, GetExchangeRatesRateIdResponse>(SdkExecutionRequest(getExchangeRatesRateIdMetadata, baseUri, request, listOf(ExchangeRatesCodecs.GETEXCHANGERATESRATEID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "rate_id", values = listOf(rateId.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ExchangeRatesCodecs.getExchangeRatesRateIdRequestCodecRegistry, GetExchangeRatesRateIdResponseDecoder, options)

  /**
   * Typed response alternatives for `GetExchangeRates`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetExchangeRatesResponse {
    public class SuccessJson(
      public val json: InlineV1ExchangeRatesGetResponse200JsonXfadae399,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetExchangeRatesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetExchangeRatesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetExchangeRatesResponse
  }

  private object GetExchangeRatesResponseDecoder : SdkResponseAlternativeDecoder<GetExchangeRatesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetExchangeRatesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetExchangeRatesResponse> = when {
      alternative.id == "GetExchangeRates.response.alternative0" -> SdkResponseDecodeResult(
        value = GetExchangeRatesResponse.SuccessJson(
          json = ExchangeRatesCodecs.getExchangeRatesResponseCodecAlternative0Registry.select(listOf("GetExchangeRates.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetExchangeRates.response.alternative1" -> SdkResponseDecodeResult(
        value = GetExchangeRatesResponse.DefaultJson(
          json = ExchangeRatesCodecs.getExchangeRatesResponseCodecAlternative1Registry.select(listOf("GetExchangeRates.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetExchangeRatesResponse = GetExchangeRatesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetExchangeRatesRateId`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetExchangeRatesRateIdResponse {
    public class SuccessJson(
      public val json: ExchangeRate,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetExchangeRatesRateIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetExchangeRatesRateIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetExchangeRatesRateIdResponse
  }

  private object GetExchangeRatesRateIdResponseDecoder : SdkResponseAlternativeDecoder<GetExchangeRatesRateIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetExchangeRatesRateIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetExchangeRatesRateIdResponse> = when {
      alternative.id == "GetExchangeRatesRateId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetExchangeRatesRateIdResponse.SuccessJson(
          json = ExchangeRatesCodecs.getExchangeRatesRateIdResponseCodecAlternative0Registry.select(listOf("GetExchangeRatesRateId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetExchangeRatesRateId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetExchangeRatesRateIdResponse.DefaultJson(
          json = ExchangeRatesCodecs.getExchangeRatesRateIdResponseCodecAlternative1Registry.select(listOf("GetExchangeRatesRateId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetExchangeRatesRateIdResponse = GetExchangeRatesRateIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getExchangeRatesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetExchangeRates",
          method = "GET",
          path = "/v1/exchange_rates",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ExchangeRatesGetResponse200JsonXfadae399",
              mode = SdkResponseMode.BUFFERED,
              id = "GetExchangeRates.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetExchangeRates.response.alternative1",
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

    internal val getExchangeRatesRateIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetExchangeRatesRateId",
          method = "GET",
          path = "/v1/exchange_rates/{rate_id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ExchangeRate",
              mode = SdkResponseMode.BUFFERED,
              id = "GetExchangeRatesRateId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetExchangeRatesRateId.response.alternative1",
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
