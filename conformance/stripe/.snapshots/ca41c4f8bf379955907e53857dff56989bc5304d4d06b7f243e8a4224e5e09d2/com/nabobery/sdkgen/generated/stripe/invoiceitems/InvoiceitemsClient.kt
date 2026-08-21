package com.nabobery.sdkgen.generated.stripe.invoiceitems

import com.nabobery.sdkgen.generated.stripe.DeletedInvoiceitem
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1InvoiceitemsGetParameterX80f313b4
import com.nabobery.sdkgen.generated.stripe.InlineV1InvoiceitemsGetResponse200JsonX966bc989
import com.nabobery.sdkgen.generated.stripe.Invoiceitem
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
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object InvoiceitemsCodecs {
  internal const val DELETEINVOICEITEMSINVOICEITEM_REQUEST_CODEC_ID: String =
      "DeleteInvoiceitemsInvoiceitem.request"

  private val deleteInvoiceitemsInvoiceitemRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteInvoiceitemsInvoiceitemFormCodec

  private val deleteInvoiceitemsInvoiceitemResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedInvoiceitem> =
      KotlinxSerializationCodec("DeleteInvoiceitemsInvoiceitem.response.alternative0", DeletedInvoiceitem.Serializer, SdkJson)

  internal val deleteInvoiceitemsInvoiceitemResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedInvoiceitem> =
      MediaTypeCodecRegistry.of(deleteInvoiceitemsInvoiceitemResponseCodecAlternative0Codec)

  private val deleteInvoiceitemsInvoiceitemResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteInvoiceitemsInvoiceitem.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteInvoiceitemsInvoiceitemResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteInvoiceitemsInvoiceitemResponseCodecAlternative1Codec)

  internal val deleteInvoiceitemsInvoiceitemRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteInvoiceitemsInvoiceitemRequestCodec)

  internal const val GETINVOICEITEMS_REQUEST_CODEC_ID: String = "GetInvoiceitems.request"

  private val getInvoiceitemsRequestCodec: MediaTypeCodec<JsonObject?> = GetInvoiceitemsFormCodec

  private val getInvoiceitemsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1InvoiceitemsGetResponse200JsonX966bc989> =
      KotlinxSerializationCodec("GetInvoiceitems.response.alternative0", InlineV1InvoiceitemsGetResponse200JsonX966bc989.Serializer, SdkJson)

  internal val getInvoiceitemsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1InvoiceitemsGetResponse200JsonX966bc989> =
      MediaTypeCodecRegistry.of(getInvoiceitemsResponseCodecAlternative0Codec)

  private val getInvoiceitemsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetInvoiceitems.response.alternative1", Error.Serializer, SdkJson)

  internal val getInvoiceitemsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getInvoiceitemsResponseCodecAlternative1Codec)

  internal val getInvoiceitemsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getInvoiceitemsRequestCodec)

  internal const val GETINVOICEITEMSINVOICEITEM_REQUEST_CODEC_ID: String =
      "GetInvoiceitemsInvoiceitem.request"

  private val getInvoiceitemsInvoiceitemRequestCodec: MediaTypeCodec<JsonObject?> =
      GetInvoiceitemsInvoiceitemFormCodec

  private val getInvoiceitemsInvoiceitemResponseCodecAlternative0Codec: MediaTypeCodec<Invoiceitem>
      =
      KotlinxSerializationCodec("GetInvoiceitemsInvoiceitem.response.alternative0", Invoiceitem.Serializer, SdkJson)

  internal val getInvoiceitemsInvoiceitemResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Invoiceitem> =
      MediaTypeCodecRegistry.of(getInvoiceitemsInvoiceitemResponseCodecAlternative0Codec)

  private val getInvoiceitemsInvoiceitemResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetInvoiceitemsInvoiceitem.response.alternative1", Error.Serializer, SdkJson)

  internal val getInvoiceitemsInvoiceitemResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getInvoiceitemsInvoiceitemResponseCodecAlternative1Codec)

  internal val getInvoiceitemsInvoiceitemRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getInvoiceitemsInvoiceitemRequestCodec)

  internal object DeleteInvoiceitemsInvoiceitemFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteInvoiceitemsInvoiceitem.request"

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

  internal object GetInvoiceitemsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetInvoiceitems.request"

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

  internal object GetInvoiceitemsInvoiceitemFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetInvoiceitemsInvoiceitem.request"

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
 * Client for the 'invoiceitems' group of Stripe API.
 */
public class InvoiceitemsClient(
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
      SdkExecutor(transport, authentication = this@InvoiceitemsClient.authentication)

  /**
   * <p>Deletes an invoice item, removing it from an invoice. Deleting invoice items is only possible when they’re not
   * attached to invoices, or if it’s attached to a draft invoice.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param invoiceitem Wire parameter `invoiceitem`.
   * @param options Execution options.
   */
  public suspend fun deleteInvoiceitemsInvoiceitemWithResponse(
    request: JsonObject? = null,
    invoiceitem: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteInvoiceitemsInvoiceitemResponse> = executor.executeWithResponse<JsonObject?, DeleteInvoiceitemsInvoiceitemResponse>(SdkExecutionRequest(deleteInvoiceitemsInvoiceitemMetadata, baseUri, request, listOf(InvoiceitemsCodecs.DELETEINVOICEITEMSINVOICEITEM_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "invoiceitem", values = listOf(invoiceitem.toString())))
  }), InvoiceitemsCodecs.deleteInvoiceitemsInvoiceitemRequestCodecRegistry, DeleteInvoiceitemsInvoiceitemResponseDecoder, options)

  /**
   * <p>Returns a list of your invoice items. Invoice items are returned sorted by creation date, with the most recently
   * created invoice items appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return invoice items that were created during the given date interval.
   * @param customer The identifier of the customer whose invoice items to return. If none is provided, returns all
   * invoice items.
   * @param customerAccount The identifier of the account representing the customer whose invoice items to return. If
   * none is provided, returns all invoice items.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param invoice Only return invoice items belonging to this invoice. If none is provided, all invoice items will be
   * returned. If specifying an invoice, no customer identifier is needed.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param pending Set to `true` to only show pending invoice items, which are not yet attached to any invoices. Set to
   * `false` to only show invoice items already attached to invoices. If unspecified, no filter is applied.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getInvoiceitemsWithResponse(
    request: JsonObject? = null,
    created: InlineV1InvoiceitemsGetParameterX80f313b4? = null,
    customer: String? = null,
    customerAccount: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    invoice: String? = null,
    limit: Int? = null,
    pending: Boolean? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetInvoiceitemsResponse> = executor.executeWithResponse<JsonObject?, GetInvoiceitemsResponse>(SdkExecutionRequest(getInvoiceitemsMetadata, baseUri, request, listOf(InvoiceitemsCodecs.GETINVOICEITEMS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer", values = customer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer_account", values = customerAccount?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "invoice", values = invoice?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "pending", values = pending?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), InvoiceitemsCodecs.getInvoiceitemsRequestCodecRegistry, GetInvoiceitemsResponseDecoder, options)

  /**
   * <p>Retrieves the invoice item with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param invoiceitem Wire parameter `invoiceitem`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getInvoiceitemsInvoiceitemWithResponse(
    request: JsonObject? = null,
    invoiceitem: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetInvoiceitemsInvoiceitemResponse> = executor.executeWithResponse<JsonObject?, GetInvoiceitemsInvoiceitemResponse>(SdkExecutionRequest(getInvoiceitemsInvoiceitemMetadata, baseUri, request, listOf(InvoiceitemsCodecs.GETINVOICEITEMSINVOICEITEM_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "invoiceitem", values = listOf(invoiceitem.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), InvoiceitemsCodecs.getInvoiceitemsInvoiceitemRequestCodecRegistry, GetInvoiceitemsInvoiceitemResponseDecoder, options)

  /**
   * Typed response alternatives for `DeleteInvoiceitemsInvoiceitem`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DeleteInvoiceitemsInvoiceitemResponse {
    public class SuccessJson(
      public val json: DeletedInvoiceitem,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteInvoiceitemsInvoiceitemResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteInvoiceitemsInvoiceitemResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteInvoiceitemsInvoiceitemResponse
  }

  private object DeleteInvoiceitemsInvoiceitemResponseDecoder : SdkResponseAlternativeDecoder<DeleteInvoiceitemsInvoiceitemResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteInvoiceitemsInvoiceitemResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteInvoiceitemsInvoiceitemResponse> = when {
      alternative.id == "DeleteInvoiceitemsInvoiceitem.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteInvoiceitemsInvoiceitemResponse.SuccessJson(
          json = InvoiceitemsCodecs.deleteInvoiceitemsInvoiceitemResponseCodecAlternative0Registry.select(listOf("DeleteInvoiceitemsInvoiceitem.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteInvoiceitemsInvoiceitem.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteInvoiceitemsInvoiceitemResponse.DefaultJson(
          json = InvoiceitemsCodecs.deleteInvoiceitemsInvoiceitemResponseCodecAlternative1Registry.select(listOf("DeleteInvoiceitemsInvoiceitem.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteInvoiceitemsInvoiceitemResponse = DeleteInvoiceitemsInvoiceitemResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetInvoiceitems`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetInvoiceitemsResponse {
    public class SuccessJson(
      public val json: InlineV1InvoiceitemsGetResponse200JsonX966bc989,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoiceitemsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoiceitemsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoiceitemsResponse
  }

  private object GetInvoiceitemsResponseDecoder : SdkResponseAlternativeDecoder<GetInvoiceitemsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetInvoiceitemsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetInvoiceitemsResponse> = when {
      alternative.id == "GetInvoiceitems.response.alternative0" -> SdkResponseDecodeResult(
        value = GetInvoiceitemsResponse.SuccessJson(
          json = InvoiceitemsCodecs.getInvoiceitemsResponseCodecAlternative0Registry.select(listOf("GetInvoiceitems.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetInvoiceitems.response.alternative1" -> SdkResponseDecodeResult(
        value = GetInvoiceitemsResponse.DefaultJson(
          json = InvoiceitemsCodecs.getInvoiceitemsResponseCodecAlternative1Registry.select(listOf("GetInvoiceitems.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetInvoiceitemsResponse = GetInvoiceitemsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetInvoiceitemsInvoiceitem`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetInvoiceitemsInvoiceitemResponse {
    public class SuccessJson(
      public val json: Invoiceitem,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoiceitemsInvoiceitemResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoiceitemsInvoiceitemResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoiceitemsInvoiceitemResponse
  }

  private object GetInvoiceitemsInvoiceitemResponseDecoder : SdkResponseAlternativeDecoder<GetInvoiceitemsInvoiceitemResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetInvoiceitemsInvoiceitemResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetInvoiceitemsInvoiceitemResponse> = when {
      alternative.id == "GetInvoiceitemsInvoiceitem.response.alternative0" -> SdkResponseDecodeResult(
        value = GetInvoiceitemsInvoiceitemResponse.SuccessJson(
          json = InvoiceitemsCodecs.getInvoiceitemsInvoiceitemResponseCodecAlternative0Registry.select(listOf("GetInvoiceitemsInvoiceitem.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetInvoiceitemsInvoiceitem.response.alternative1" -> SdkResponseDecodeResult(
        value = GetInvoiceitemsInvoiceitemResponse.DefaultJson(
          json = InvoiceitemsCodecs.getInvoiceitemsInvoiceitemResponseCodecAlternative1Registry.select(listOf("GetInvoiceitemsInvoiceitem.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetInvoiceitemsInvoiceitemResponse = GetInvoiceitemsInvoiceitemResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val deleteInvoiceitemsInvoiceitemMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteInvoiceitemsInvoiceitem",
          method = "DELETE",
          path = "/v1/invoiceitems/{invoiceitem}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedInvoiceitem",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteInvoiceitemsInvoiceitem.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteInvoiceitemsInvoiceitem.response.alternative1",
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
          safety = OperationSafety(safe = false, idempotent = true),
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

    internal val getInvoiceitemsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetInvoiceitems",
          method = "GET",
          path = "/v1/invoiceitems",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1InvoiceitemsGetResponse200JsonX966bc989",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoiceitems.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoiceitems.response.alternative1",
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

    internal val getInvoiceitemsInvoiceitemMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetInvoiceitemsInvoiceitem",
          method = "GET",
          path = "/v1/invoiceitems/{invoiceitem}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Invoiceitem",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoiceitemsInvoiceitem.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoiceitemsInvoiceitem.response.alternative1",
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
