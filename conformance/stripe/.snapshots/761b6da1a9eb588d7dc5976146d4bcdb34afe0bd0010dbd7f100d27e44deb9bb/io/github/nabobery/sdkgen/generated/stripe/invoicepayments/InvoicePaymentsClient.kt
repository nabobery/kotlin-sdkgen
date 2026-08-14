package io.github.nabobery.sdkgen.generated.stripe.invoicepayments

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
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicePaymentsGetParameterX2b044224
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicePaymentsGetParameterX6fbcf43a
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicePaymentsGetParameterXca144f7d
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicePaymentsGetResponse200JsonX724ce000
import io.github.nabobery.sdkgen.generated.stripe.InvoicePayment
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object InvoicePaymentsCodecs {
  internal const val GETINVOICEPAYMENTS_REQUEST_CODEC_ID: String = "GetInvoicePayments.request"

  private val getInvoicePaymentsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetInvoicePaymentsFormCodec

  private val getInvoicePaymentsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1InvoicePaymentsGetResponse200JsonX724ce000> =
      KotlinxSerializationCodec("GetInvoicePayments.response.alternative0", InlineV1InvoicePaymentsGetResponse200JsonX724ce000.Serializer, SdkJson)

  internal val getInvoicePaymentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1InvoicePaymentsGetResponse200JsonX724ce000> =
      MediaTypeCodecRegistry.of(getInvoicePaymentsResponseCodecAlternative0Codec)

  private val getInvoicePaymentsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetInvoicePayments.response.alternative1", Error.Serializer, SdkJson)

  internal val getInvoicePaymentsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getInvoicePaymentsResponseCodecAlternative1Codec)

  internal val getInvoicePaymentsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getInvoicePaymentsRequestCodec)

  internal const val GETINVOICEPAYMENTSINVOICEPAYMENT_REQUEST_CODEC_ID: String =
      "GetInvoicePaymentsInvoicePayment.request"

  private val getInvoicePaymentsInvoicePaymentRequestCodec: MediaTypeCodec<JsonObject?> =
      GetInvoicePaymentsInvoicePaymentFormCodec

  private val getInvoicePaymentsInvoicePaymentResponseCodecAlternative0Codec:
      MediaTypeCodec<InvoicePayment> =
      KotlinxSerializationCodec("GetInvoicePaymentsInvoicePayment.response.alternative0", InvoicePayment.Serializer, SdkJson)

  internal val getInvoicePaymentsInvoicePaymentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InvoicePayment> =
      MediaTypeCodecRegistry.of(getInvoicePaymentsInvoicePaymentResponseCodecAlternative0Codec)

  private val getInvoicePaymentsInvoicePaymentResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("GetInvoicePaymentsInvoicePayment.response.alternative1", Error.Serializer, SdkJson)

  internal val getInvoicePaymentsInvoicePaymentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getInvoicePaymentsInvoicePaymentResponseCodecAlternative1Codec)

  internal val getInvoicePaymentsInvoicePaymentRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getInvoicePaymentsInvoicePaymentRequestCodec)

  internal object GetInvoicePaymentsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetInvoicePayments.request"

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

  internal object GetInvoicePaymentsInvoicePaymentFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetInvoicePaymentsInvoicePayment.request"

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
 * Client for the 'invoice_payments' group of Stripe API.
 */
public class InvoicePaymentsClient(
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
      SdkExecutor(transport, authentication = this@InvoicePaymentsClient.authentication)

  /**
   * <p>When retrieving an invoice, there is an includable payments property containing the first handful of those
   * items. There is also a URL where you can retrieve the full (paginated) list of payments.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return invoice payments that were created during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param invoice The identifier of the invoice whose payments to return.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param payment The payment details of the invoice payments to return.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status The status of the invoice payments to return.
   * @param options Execution options.
   */
  public suspend fun getInvoicePaymentsWithResponse(
    request: JsonObject? = null,
    created: InlineV1InvoicePaymentsGetParameterXca144f7d? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    invoice: String? = null,
    limit: Int? = null,
    payment: InlineV1InvoicePaymentsGetParameterX2b044224? = null,
    startingAfter: String? = null,
    status: InlineV1InvoicePaymentsGetParameterX6fbcf43a? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetInvoicePaymentsResponse> = executor.executeWithResponse<JsonObject?, GetInvoicePaymentsResponse>(SdkExecutionRequest(getInvoicePaymentsMetadata, baseUri, request, listOf(InvoicePaymentsCodecs.GETINVOICEPAYMENTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "invoice", values = invoice?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "payment[payment_intent]", values = payment?.paymentIntent?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "payment[payment_record]", values = payment?.paymentRecord?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "payment[type]", values = payment?.type?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), InvoicePaymentsCodecs.getInvoicePaymentsRequestCodecRegistry, GetInvoicePaymentsResponseDecoder, options)

  /**
   * <p>Retrieves the invoice payment with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param invoicePayment Wire parameter `invoice_payment`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getInvoicePaymentsInvoicePaymentWithResponse(
    request: JsonObject? = null,
    invoicePayment: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetInvoicePaymentsInvoicePaymentResponse> = executor.executeWithResponse<JsonObject?, GetInvoicePaymentsInvoicePaymentResponse>(SdkExecutionRequest(getInvoicePaymentsInvoicePaymentMetadata, baseUri, request, listOf(InvoicePaymentsCodecs.GETINVOICEPAYMENTSINVOICEPAYMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "invoice_payment", values = listOf(invoicePayment.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), InvoicePaymentsCodecs.getInvoicePaymentsInvoicePaymentRequestCodecRegistry, GetInvoicePaymentsInvoicePaymentResponseDecoder, options)

  /**
   * Typed response alternatives for `GetInvoicePayments`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetInvoicePaymentsResponse {
    public class SuccessJson(
      public val json: InlineV1InvoicePaymentsGetResponse200JsonX724ce000,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicePaymentsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicePaymentsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicePaymentsResponse
  }

  private object GetInvoicePaymentsResponseDecoder : SdkResponseAlternativeDecoder<GetInvoicePaymentsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetInvoicePaymentsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetInvoicePaymentsResponse> = when {
      alternative.id == "GetInvoicePayments.response.alternative0" -> SdkResponseDecodeResult(
        value = GetInvoicePaymentsResponse.SuccessJson(
          json = InvoicePaymentsCodecs.getInvoicePaymentsResponseCodecAlternative0Registry.select(listOf("GetInvoicePayments.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetInvoicePayments.response.alternative1" -> SdkResponseDecodeResult(
        value = GetInvoicePaymentsResponse.DefaultJson(
          json = InvoicePaymentsCodecs.getInvoicePaymentsResponseCodecAlternative1Registry.select(listOf("GetInvoicePayments.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetInvoicePaymentsResponse = GetInvoicePaymentsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetInvoicePaymentsInvoicePayment`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetInvoicePaymentsInvoicePaymentResponse {
    public class SuccessJson(
      public val json: InvoicePayment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicePaymentsInvoicePaymentResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicePaymentsInvoicePaymentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicePaymentsInvoicePaymentResponse
  }

  private object GetInvoicePaymentsInvoicePaymentResponseDecoder : SdkResponseAlternativeDecoder<GetInvoicePaymentsInvoicePaymentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetInvoicePaymentsInvoicePaymentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetInvoicePaymentsInvoicePaymentResponse> = when {
      alternative.id == "GetInvoicePaymentsInvoicePayment.response.alternative0" -> SdkResponseDecodeResult(
        value = GetInvoicePaymentsInvoicePaymentResponse.SuccessJson(
          json = InvoicePaymentsCodecs.getInvoicePaymentsInvoicePaymentResponseCodecAlternative0Registry.select(listOf("GetInvoicePaymentsInvoicePayment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetInvoicePaymentsInvoicePayment.response.alternative1" -> SdkResponseDecodeResult(
        value = GetInvoicePaymentsInvoicePaymentResponse.DefaultJson(
          json = InvoicePaymentsCodecs.getInvoicePaymentsInvoicePaymentResponseCodecAlternative1Registry.select(listOf("GetInvoicePaymentsInvoicePayment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetInvoicePaymentsInvoicePaymentResponse = GetInvoicePaymentsInvoicePaymentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getInvoicePaymentsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetInvoicePayments",
          method = "GET",
          path = "/v1/invoice_payments",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1InvoicePaymentsGetResponse200JsonX724ce000",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoicePayments.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoicePayments.response.alternative1",
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

    internal val getInvoicePaymentsInvoicePaymentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetInvoicePaymentsInvoicePayment",
          method = "GET",
          path = "/v1/invoice_payments/{invoice_payment}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InvoicePayment",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoicePaymentsInvoicePayment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoicePaymentsInvoicePayment.response.alternative1",
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
