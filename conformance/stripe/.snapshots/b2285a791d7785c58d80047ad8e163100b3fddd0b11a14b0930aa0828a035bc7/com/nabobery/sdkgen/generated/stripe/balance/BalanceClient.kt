package com.nabobery.sdkgen.generated.stripe.balance

import com.nabobery.sdkgen.generated.stripe.Balance
import com.nabobery.sdkgen.generated.stripe.BalanceTransaction
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1BalanceHistoryGetParameterXc82176db
import com.nabobery.sdkgen.generated.stripe.InlineV1BalanceHistoryGetResponse200JsonXee492d75
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

public object BalanceCodecs {
  public const val GETBALANCE_REQUEST_CODEC_ID: String = "GetBalance.request"

  private val getBalanceRequestCodec: MediaTypeCodec<JsonObject?> = GetBalanceFormCodec

  private val getBalanceResponseCodecAlternative0Codec: MediaTypeCodec<Balance> =
      KotlinxSerializationCodec("GetBalance.response.alternative0", Balance.Serializer, SdkJson)

  public val getBalanceResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Balance> =
      MediaTypeCodecRegistry.of(getBalanceResponseCodecAlternative0Codec)

  private val getBalanceResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBalance.response.alternative1", Error.Serializer, SdkJson)

  public val getBalanceResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBalanceResponseCodecAlternative1Codec)

  public val getBalanceRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBalanceRequestCodec)

  public const val GETBALANCEHISTORY_REQUEST_CODEC_ID: String = "GetBalanceHistory.request"

  private val getBalanceHistoryRequestCodec: MediaTypeCodec<JsonObject?> =
      GetBalanceHistoryFormCodec

  private val getBalanceHistoryResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1BalanceHistoryGetResponse200JsonXee492d75> =
      KotlinxSerializationCodec("GetBalanceHistory.response.alternative0", InlineV1BalanceHistoryGetResponse200JsonXee492d75.Serializer, SdkJson)

  public val getBalanceHistoryResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1BalanceHistoryGetResponse200JsonXee492d75> =
      MediaTypeCodecRegistry.of(getBalanceHistoryResponseCodecAlternative0Codec)

  private val getBalanceHistoryResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBalanceHistory.response.alternative1", Error.Serializer, SdkJson)

  public val getBalanceHistoryResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBalanceHistoryResponseCodecAlternative1Codec)

  public val getBalanceHistoryRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBalanceHistoryRequestCodec)

  public const val GETBALANCEHISTORYID_REQUEST_CODEC_ID: String = "GetBalanceHistoryId.request"

  private val getBalanceHistoryIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetBalanceHistoryIdFormCodec

  private val getBalanceHistoryIdResponseCodecAlternative0Codec: MediaTypeCodec<BalanceTransaction>
      =
      KotlinxSerializationCodec("GetBalanceHistoryId.response.alternative0", BalanceTransaction.Serializer, SdkJson)

  public val getBalanceHistoryIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BalanceTransaction> =
      MediaTypeCodecRegistry.of(getBalanceHistoryIdResponseCodecAlternative0Codec)

  private val getBalanceHistoryIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBalanceHistoryId.response.alternative1", Error.Serializer, SdkJson)

  public val getBalanceHistoryIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBalanceHistoryIdResponseCodecAlternative1Codec)

  public val getBalanceHistoryIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBalanceHistoryIdRequestCodec)

  public object GetBalanceFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBalance.request"

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

  public object GetBalanceHistoryFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBalanceHistory.request"

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

  public object GetBalanceHistoryIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBalanceHistoryId.request"

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
 * Client for the 'balance' group of Stripe API.
 */
public class BalanceClient(
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
      SdkExecutor(transport, authentication = this@BalanceClient.authentication)

  /**
   * <p>Retrieves the current account balance, based on the authentication that was used to make the request.
   * For a sample request, see <a href="/docs/connect/account-balances#accounting-for-negative-balances">Accounting for
   * negative balances</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getBalanceWithResponse(
    request: JsonObject? = null,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBalanceResponse> = executor.executeWithResponse<JsonObject?, GetBalanceResponse>(SdkExecutionRequest(getBalanceMetadata, baseUri, request, listOf(BalanceCodecs.GETBALANCE_REQUEST_CODEC_ID), buildList {
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), BalanceCodecs.getBalanceRequestCodecRegistry, GetBalanceResponseDecoder, options)

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
  public suspend fun getBalanceHistoryWithResponse(
    request: JsonObject? = null,
    created: InlineV1BalanceHistoryGetParameterXc82176db? = null,
    currency: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    payout: String? = null,
    source: String? = null,
    startingAfter: String? = null,
    type: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBalanceHistoryResponse> = executor.executeWithResponse<JsonObject?, GetBalanceHistoryResponse>(SdkExecutionRequest(getBalanceHistoryMetadata, baseUri, request, listOf(BalanceCodecs.GETBALANCEHISTORY_REQUEST_CODEC_ID), buildList {
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
  }), BalanceCodecs.getBalanceHistoryRequestCodecRegistry, GetBalanceHistoryResponseDecoder, options)

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
  public suspend fun getBalanceHistoryIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBalanceHistoryIdResponse> = executor.executeWithResponse<JsonObject?, GetBalanceHistoryIdResponse>(SdkExecutionRequest(getBalanceHistoryIdMetadata, baseUri, request, listOf(BalanceCodecs.GETBALANCEHISTORYID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), BalanceCodecs.getBalanceHistoryIdRequestCodecRegistry, GetBalanceHistoryIdResponseDecoder, options)

  /**
   * Typed response alternatives for `GetBalance`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetBalanceResponse {
    public class SuccessJson(
      public val json: Balance,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceResponse
  }

  private object GetBalanceResponseDecoder : SdkResponseAlternativeDecoder<GetBalanceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBalanceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBalanceResponse> = when {
      alternative.id == "GetBalance.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBalanceResponse.SuccessJson(
          json = BalanceCodecs.getBalanceResponseCodecAlternative0Registry.select(listOf("GetBalance.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBalance.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBalanceResponse.DefaultJson(
          json = BalanceCodecs.getBalanceResponseCodecAlternative1Registry.select(listOf("GetBalance.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBalanceResponse = GetBalanceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetBalanceHistory`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetBalanceHistoryResponse {
    public class SuccessJson(
      public val json: InlineV1BalanceHistoryGetResponse200JsonXee492d75,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceHistoryResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceHistoryResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceHistoryResponse
  }

  private object GetBalanceHistoryResponseDecoder : SdkResponseAlternativeDecoder<GetBalanceHistoryResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBalanceHistoryResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBalanceHistoryResponse> = when {
      alternative.id == "GetBalanceHistory.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBalanceHistoryResponse.SuccessJson(
          json = BalanceCodecs.getBalanceHistoryResponseCodecAlternative0Registry.select(listOf("GetBalanceHistory.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBalanceHistory.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBalanceHistoryResponse.DefaultJson(
          json = BalanceCodecs.getBalanceHistoryResponseCodecAlternative1Registry.select(listOf("GetBalanceHistory.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBalanceHistoryResponse = GetBalanceHistoryResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetBalanceHistoryId`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetBalanceHistoryIdResponse {
    public class SuccessJson(
      public val json: BalanceTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceHistoryIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceHistoryIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceHistoryIdResponse
  }

  private object GetBalanceHistoryIdResponseDecoder : SdkResponseAlternativeDecoder<GetBalanceHistoryIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBalanceHistoryIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBalanceHistoryIdResponse> = when {
      alternative.id == "GetBalanceHistoryId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBalanceHistoryIdResponse.SuccessJson(
          json = BalanceCodecs.getBalanceHistoryIdResponseCodecAlternative0Registry.select(listOf("GetBalanceHistoryId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBalanceHistoryId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBalanceHistoryIdResponse.DefaultJson(
          json = BalanceCodecs.getBalanceHistoryIdResponseCodecAlternative1Registry.select(listOf("GetBalanceHistoryId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBalanceHistoryIdResponse = GetBalanceHistoryIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getBalanceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBalance",
          method = "GET",
          path = "/v1/balance",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Balance",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBalance.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBalance.response.alternative1",
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

    public val getBalanceHistoryMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBalanceHistory",
          method = "GET",
          path = "/v1/balance/history",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1BalanceHistoryGetResponse200JsonXee492d75",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBalanceHistory.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBalanceHistory.response.alternative1",
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

    public val getBalanceHistoryIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBalanceHistoryId",
          method = "GET",
          path = "/v1/balance/history/{id}",
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
              id = "GetBalanceHistoryId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBalanceHistoryId.response.alternative1",
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
