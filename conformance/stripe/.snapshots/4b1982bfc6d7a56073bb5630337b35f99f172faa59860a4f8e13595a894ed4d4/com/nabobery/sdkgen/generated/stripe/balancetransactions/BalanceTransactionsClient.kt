package com.nabobery.sdkgen.generated.stripe.balancetransactions

import com.nabobery.sdkgen.generated.stripe.BalanceTransaction
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1BalanceTransactionsGetParameterX9b5f3353
import com.nabobery.sdkgen.generated.stripe.InlineV1BalanceTransactionsGetResponse200JsonXbae45400
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
import kotlinx.serialization.json.JsonPrimitive

internal object BalanceTransactionsCodecs {
  internal const val GETBALANCETRANSACTIONS_REQUEST_CODEC_ID: String =
      "GetBalanceTransactions.request"

  private val getBalanceTransactionsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetBalanceTransactionsFormCodec

  private val getBalanceTransactionsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1BalanceTransactionsGetResponse200JsonXbae45400> =
      KotlinxSerializationCodec("GetBalanceTransactions.response.alternative0", InlineV1BalanceTransactionsGetResponse200JsonXbae45400.Serializer, SdkJson)

  internal val getBalanceTransactionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1BalanceTransactionsGetResponse200JsonXbae45400> =
      MediaTypeCodecRegistry.of(getBalanceTransactionsResponseCodecAlternative0Codec)

  private val getBalanceTransactionsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBalanceTransactions.response.alternative1", Error.Serializer, SdkJson)

  internal val getBalanceTransactionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBalanceTransactionsResponseCodecAlternative1Codec)

  internal val getBalanceTransactionsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBalanceTransactionsRequestCodec)

  internal const val GETBALANCETRANSACTIONSID_REQUEST_CODEC_ID: String =
      "GetBalanceTransactionsId.request"

  private val getBalanceTransactionsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetBalanceTransactionsIdFormCodec

  private val getBalanceTransactionsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<BalanceTransaction> =
      KotlinxSerializationCodec("GetBalanceTransactionsId.response.alternative0", BalanceTransaction.Serializer, SdkJson)

  internal val getBalanceTransactionsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BalanceTransaction> =
      MediaTypeCodecRegistry.of(getBalanceTransactionsIdResponseCodecAlternative0Codec)

  private val getBalanceTransactionsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBalanceTransactionsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getBalanceTransactionsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBalanceTransactionsIdResponseCodecAlternative1Codec)

  internal val getBalanceTransactionsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBalanceTransactionsIdRequestCodec)

  internal object GetBalanceTransactionsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBalanceTransactions.request"

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

  internal object GetBalanceTransactionsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBalanceTransactionsId.request"

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
 * Client for the 'balance_transactions' group of Stripe API.
 */
public class BalanceTransactionsClient(
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
      SdkExecutor(transport, authentication = this@BalanceTransactionsClient.authentication)

  /**
   * <p>Returns a list of transactions that have contributed to the Stripe account balance (for example, charges,
   * transfers, and so on). The transactions return in sorted order, with the most recent transactions appearing
   * first.</p>
   *
   * <p>The previous name of this endpoint was “Balance history,” and it used the path
   * <code>/v1/balance/history</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return transactions that were created during the given date interval.
   * @param currency Only return transactions in a certain currency. Three-letter [ISO currency
   * code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported
   * currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param payout For automatic Stripe payouts only, only returns transactions that were paid out on the specified
   * payout ID.
   * @param source Only returns transactions associated with the given object.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param type Only returns transactions of the given type. One of: `tax_fund`, `adjustment`, `advance`,
   * `advance_funding`, `anticipation_repayment`, `application_fee`, `application_fee_refund`, `charge`,
   * `climate_order_purchase`, `climate_order_refund`, `connect_collection_transfer`, `contribution`,
   * `inbound_transfer`, `inbound_transfer_reversal`, `issuing_authorization_hold`, `issuing_authorization_release`,
   * `issuing_dispute`, `issuing_transaction`, `obligation_outbound`, `obligation_reversal_inbound`, `payment`,
   * `payment_failure_refund`, `payment_network_reserve_hold`, `payment_network_reserve_release`, `payment_refund`,
   * `payment_reversal`, `payment_unreconciled`, `payout`, `payout_cancel`, `payout_failure`,
   * `payout_minimum_balance_hold`, `payout_minimum_balance_release`, `refund`, `refund_failure`, `reserve_transaction`,
   * `reserved_funds`, `reserve_hold`, `reserve_release`, `stripe_fee`, `stripe_fx_fee`, `stripe_balance_payment_debit`,
   * `stripe_balance_payment_debit_reversal`, `tax_fee`, `topup`, `topup_reversal`, `transfer`, `transfer_cancel`,
   * `transfer_failure`, `transfer_refund`, or `fee_credit_funding`.
   * @param options Execution options.
   */
  public suspend fun getBalanceTransactionsWithResponse(
    request: JsonObject? = null,
    created: InlineV1BalanceTransactionsGetParameterX9b5f3353? = null,
    currency: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    payout: String? = null,
    source: String? = null,
    startingAfter: String? = null,
    type: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBalanceTransactionsResponse> = executor.executeWithResponse<JsonObject?, GetBalanceTransactionsResponse>(SdkExecutionRequest(getBalanceTransactionsMetadata, baseUri, request, listOf(BalanceTransactionsCodecs.GETBALANCETRANSACTIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "currency", values = currency?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "payout", values = payout?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "source", values = source?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "type", values = type?.let { listOf(it.toString()) }.orEmpty()))
  }), BalanceTransactionsCodecs.getBalanceTransactionsRequestCodecRegistry, GetBalanceTransactionsResponseDecoder, options)

  /**
   * <p>Retrieves the balance transaction with the given ID.</p>
   *
   * <p>Note that this endpoint previously used the path <code>/v1/balance/history/:id</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getBalanceTransactionsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBalanceTransactionsIdResponse> = executor.executeWithResponse<JsonObject?, GetBalanceTransactionsIdResponse>(SdkExecutionRequest(getBalanceTransactionsIdMetadata, baseUri, request, listOf(BalanceTransactionsCodecs.GETBALANCETRANSACTIONSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), BalanceTransactionsCodecs.getBalanceTransactionsIdRequestCodecRegistry, GetBalanceTransactionsIdResponseDecoder, options)

  /**
   * Typed response alternatives for `GetBalanceTransactions`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetBalanceTransactionsResponse {
    public class SuccessJson(
      public val json: InlineV1BalanceTransactionsGetResponse200JsonXbae45400,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceTransactionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceTransactionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceTransactionsResponse
  }

  private object GetBalanceTransactionsResponseDecoder : SdkResponseAlternativeDecoder<GetBalanceTransactionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBalanceTransactionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBalanceTransactionsResponse> = when {
      alternative.id == "GetBalanceTransactions.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBalanceTransactionsResponse.SuccessJson(
          json = BalanceTransactionsCodecs.getBalanceTransactionsResponseCodecAlternative0Registry.select(listOf("GetBalanceTransactions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBalanceTransactions.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBalanceTransactionsResponse.DefaultJson(
          json = BalanceTransactionsCodecs.getBalanceTransactionsResponseCodecAlternative1Registry.select(listOf("GetBalanceTransactions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBalanceTransactionsResponse = GetBalanceTransactionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetBalanceTransactionsId`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetBalanceTransactionsIdResponse {
    public class SuccessJson(
      public val json: BalanceTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceTransactionsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceTransactionsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceTransactionsIdResponse
  }

  private object GetBalanceTransactionsIdResponseDecoder : SdkResponseAlternativeDecoder<GetBalanceTransactionsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBalanceTransactionsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBalanceTransactionsIdResponse> = when {
      alternative.id == "GetBalanceTransactionsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBalanceTransactionsIdResponse.SuccessJson(
          json = BalanceTransactionsCodecs.getBalanceTransactionsIdResponseCodecAlternative0Registry.select(listOf("GetBalanceTransactionsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBalanceTransactionsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBalanceTransactionsIdResponse.DefaultJson(
          json = BalanceTransactionsCodecs.getBalanceTransactionsIdResponseCodecAlternative1Registry.select(listOf("GetBalanceTransactionsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBalanceTransactionsIdResponse = GetBalanceTransactionsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getBalanceTransactionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBalanceTransactions",
          method = "GET",
          path = "/v1/balance_transactions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1BalanceTransactionsGetResponse200JsonXbae45400",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBalanceTransactions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBalanceTransactions.response.alternative1",
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

    internal val getBalanceTransactionsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBalanceTransactionsId",
          method = "GET",
          path = "/v1/balance_transactions/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BalanceTransaction",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBalanceTransactionsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBalanceTransactionsId.response.alternative1",
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
