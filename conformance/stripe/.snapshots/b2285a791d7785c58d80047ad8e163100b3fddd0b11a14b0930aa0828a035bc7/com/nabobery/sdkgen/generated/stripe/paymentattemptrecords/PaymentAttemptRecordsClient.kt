package com.nabobery.sdkgen.generated.stripe.paymentattemptrecords

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentAttemptRecordsGetResponse200JsonXdec7748d
import com.nabobery.sdkgen.generated.stripe.PaymentAttemptRecord
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

public object PaymentAttemptRecordsCodecs {
  public const val GETPAYMENTATTEMPTRECORDS_REQUEST_CODEC_ID: String =
      "GetPaymentAttemptRecords.request"

  private val getPaymentAttemptRecordsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPaymentAttemptRecordsFormCodec

  private val getPaymentAttemptRecordsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1PaymentAttemptRecordsGetResponse200JsonXdec7748d> =
      KotlinxSerializationCodec("GetPaymentAttemptRecords.response.alternative0", InlineV1PaymentAttemptRecordsGetResponse200JsonXdec7748d.Serializer, SdkJson)

  public val getPaymentAttemptRecordsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1PaymentAttemptRecordsGetResponse200JsonXdec7748d> =
      MediaTypeCodecRegistry.of(getPaymentAttemptRecordsResponseCodecAlternative0Codec)

  private val getPaymentAttemptRecordsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentAttemptRecords.response.alternative1", Error.Serializer, SdkJson)

  public val getPaymentAttemptRecordsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentAttemptRecordsResponseCodecAlternative1Codec)

  public val getPaymentAttemptRecordsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentAttemptRecordsRequestCodec)

  public const val GETPAYMENTATTEMPTRECORDSID_REQUEST_CODEC_ID: String =
      "GetPaymentAttemptRecordsId.request"

  private val getPaymentAttemptRecordsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPaymentAttemptRecordsIdFormCodec

  private val getPaymentAttemptRecordsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentAttemptRecord> =
      KotlinxSerializationCodec("GetPaymentAttemptRecordsId.response.alternative0", PaymentAttemptRecord.Serializer, SdkJson)

  public val getPaymentAttemptRecordsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentAttemptRecord> =
      MediaTypeCodecRegistry.of(getPaymentAttemptRecordsIdResponseCodecAlternative0Codec)

  private val getPaymentAttemptRecordsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentAttemptRecordsId.response.alternative1", Error.Serializer, SdkJson)

  public val getPaymentAttemptRecordsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentAttemptRecordsIdResponseCodecAlternative1Codec)

  public val getPaymentAttemptRecordsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentAttemptRecordsIdRequestCodec)

  public object GetPaymentAttemptRecordsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentAttemptRecords.request"

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

  public object GetPaymentAttemptRecordsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentAttemptRecordsId.request"

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
 * Client for the 'payment_attempt_records' group of Stripe API.
 */
public class PaymentAttemptRecordsClient(
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
      SdkExecutor(transport, authentication = this@PaymentAttemptRecordsClient.authentication)

  /**
   * <p>List all the Payment Attempt Records attached to the specified Payment Record.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param paymentRecord The ID of the Payment Record.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getPaymentAttemptRecordsWithResponse(
    request: JsonObject? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    paymentRecord: String,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentAttemptRecordsResponse> = executor.executeWithResponse<JsonObject?, GetPaymentAttemptRecordsResponse>(SdkExecutionRequest(getPaymentAttemptRecordsMetadata, baseUri, request, listOf(PaymentAttemptRecordsCodecs.GETPAYMENTATTEMPTRECORDS_REQUEST_CODEC_ID), buildList {
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "payment_record", values = listOf(paymentRecord.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), PaymentAttemptRecordsCodecs.getPaymentAttemptRecordsRequestCodecRegistry, GetPaymentAttemptRecordsResponseDecoder, options)

  /**
   * <p>Retrieves a Payment Attempt Record with the given ID</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The ID of the Payment Attempt Record.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getPaymentAttemptRecordsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentAttemptRecordsIdResponse> = executor.executeWithResponse<JsonObject?, GetPaymentAttemptRecordsIdResponse>(SdkExecutionRequest(getPaymentAttemptRecordsIdMetadata, baseUri, request, listOf(PaymentAttemptRecordsCodecs.GETPAYMENTATTEMPTRECORDSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), PaymentAttemptRecordsCodecs.getPaymentAttemptRecordsIdRequestCodecRegistry, GetPaymentAttemptRecordsIdResponseDecoder, options)

  /**
   * Typed response alternatives for `GetPaymentAttemptRecords`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetPaymentAttemptRecordsResponse {
    public class SuccessJson(
      public val json: InlineV1PaymentAttemptRecordsGetResponse200JsonXdec7748d,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentAttemptRecordsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentAttemptRecordsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentAttemptRecordsResponse
  }

  private object GetPaymentAttemptRecordsResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentAttemptRecordsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentAttemptRecordsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentAttemptRecordsResponse> = when {
      alternative.id == "GetPaymentAttemptRecords.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentAttemptRecordsResponse.SuccessJson(
          json = PaymentAttemptRecordsCodecs.getPaymentAttemptRecordsResponseCodecAlternative0Registry.select(listOf("GetPaymentAttemptRecords.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentAttemptRecords.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentAttemptRecordsResponse.DefaultJson(
          json = PaymentAttemptRecordsCodecs.getPaymentAttemptRecordsResponseCodecAlternative1Registry.select(listOf("GetPaymentAttemptRecords.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentAttemptRecordsResponse = GetPaymentAttemptRecordsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetPaymentAttemptRecordsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetPaymentAttemptRecordsIdResponse {
    public class SuccessJson(
      public val json: PaymentAttemptRecord,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentAttemptRecordsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentAttemptRecordsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentAttemptRecordsIdResponse
  }

  private object GetPaymentAttemptRecordsIdResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentAttemptRecordsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentAttemptRecordsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentAttemptRecordsIdResponse> = when {
      alternative.id == "GetPaymentAttemptRecordsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentAttemptRecordsIdResponse.SuccessJson(
          json = PaymentAttemptRecordsCodecs.getPaymentAttemptRecordsIdResponseCodecAlternative0Registry.select(listOf("GetPaymentAttemptRecordsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentAttemptRecordsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentAttemptRecordsIdResponse.DefaultJson(
          json = PaymentAttemptRecordsCodecs.getPaymentAttemptRecordsIdResponseCodecAlternative1Registry.select(listOf("GetPaymentAttemptRecordsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentAttemptRecordsIdResponse = GetPaymentAttemptRecordsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getPaymentAttemptRecordsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentAttemptRecords",
          method = "GET",
          path = "/v1/payment_attempt_records",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1PaymentAttemptRecordsGetResponse200JsonXdec7748d",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentAttemptRecords.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentAttemptRecords.response.alternative1",
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

    public val getPaymentAttemptRecordsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentAttemptRecordsId",
          method = "GET",
          path = "/v1/payment_attempt_records/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentAttemptRecord",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentAttemptRecordsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentAttemptRecordsId.response.alternative1",
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
