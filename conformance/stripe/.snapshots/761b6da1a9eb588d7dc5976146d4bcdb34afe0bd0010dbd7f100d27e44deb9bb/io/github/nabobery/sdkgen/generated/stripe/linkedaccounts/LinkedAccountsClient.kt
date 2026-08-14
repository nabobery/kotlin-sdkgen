package io.github.nabobery.sdkgen.generated.stripe.linkedaccounts

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
import io.github.nabobery.sdkgen.generated.stripe.FinancialConnectionsAccount
import io.github.nabobery.sdkgen.generated.stripe.InlineV1LinkedAccountsDisconnectPostRequestFormX878f78a2
import io.github.nabobery.sdkgen.generated.stripe.InlineV1LinkedAccountsGetParameterXeee0dd3e
import io.github.nabobery.sdkgen.generated.stripe.InlineV1LinkedAccountsGetResponse200JsonX46a0930a
import io.github.nabobery.sdkgen.generated.stripe.InlineV1LinkedAccountsOwnersGetResponse200JsonXcbc2ffa0
import io.github.nabobery.sdkgen.generated.stripe.InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject

internal object LinkedAccountsCodecs {
  internal const val GETLINKEDACCOUNTS_REQUEST_CODEC_ID: String = "GetLinkedAccounts.request"

  private val getLinkedAccountsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetLinkedAccountsFormCodec

  private val getLinkedAccountsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1LinkedAccountsGetResponse200JsonX46a0930a> =
      KotlinxSerializationCodec("GetLinkedAccounts.response.alternative0", InlineV1LinkedAccountsGetResponse200JsonX46a0930a.Serializer, SdkJson)

  internal val getLinkedAccountsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1LinkedAccountsGetResponse200JsonX46a0930a> =
      MediaTypeCodecRegistry.of(getLinkedAccountsResponseCodecAlternative0Codec)

  private val getLinkedAccountsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetLinkedAccounts.response.alternative1", Error.Serializer, SdkJson)

  internal val getLinkedAccountsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getLinkedAccountsResponseCodecAlternative1Codec)

  internal val getLinkedAccountsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getLinkedAccountsRequestCodec)

  internal const val GETLINKEDACCOUNTSACCOUNT_REQUEST_CODEC_ID: String =
      "GetLinkedAccountsAccount.request"

  private val getLinkedAccountsAccountRequestCodec: MediaTypeCodec<JsonObject?> =
      GetLinkedAccountsAccountFormCodec

  private val getLinkedAccountsAccountResponseCodecAlternative0Codec:
      MediaTypeCodec<FinancialConnectionsAccount> =
      KotlinxSerializationCodec("GetLinkedAccountsAccount.response.alternative0", FinancialConnectionsAccount.Serializer, SdkJson)

  internal val getLinkedAccountsAccountResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FinancialConnectionsAccount> =
      MediaTypeCodecRegistry.of(getLinkedAccountsAccountResponseCodecAlternative0Codec)

  private val getLinkedAccountsAccountResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetLinkedAccountsAccount.response.alternative1", Error.Serializer, SdkJson)

  internal val getLinkedAccountsAccountResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getLinkedAccountsAccountResponseCodecAlternative1Codec)

  internal val getLinkedAccountsAccountRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getLinkedAccountsAccountRequestCodec)

  internal const val GETLINKEDACCOUNTSACCOUNTOWNERS_REQUEST_CODEC_ID: String =
      "GetLinkedAccountsAccountOwners.request"

  private val getLinkedAccountsAccountOwnersRequestCodec: MediaTypeCodec<JsonObject?> =
      GetLinkedAccountsAccountOwnersFormCodec

  private val getLinkedAccountsAccountOwnersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1LinkedAccountsOwnersGetResponse200JsonXcbc2ffa0> =
      KotlinxSerializationCodec("GetLinkedAccountsAccountOwners.response.alternative0", InlineV1LinkedAccountsOwnersGetResponse200JsonXcbc2ffa0.Serializer, SdkJson)

  internal val getLinkedAccountsAccountOwnersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1LinkedAccountsOwnersGetResponse200JsonXcbc2ffa0> =
      MediaTypeCodecRegistry.of(getLinkedAccountsAccountOwnersResponseCodecAlternative0Codec)

  private val getLinkedAccountsAccountOwnersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetLinkedAccountsAccountOwners.response.alternative1", Error.Serializer, SdkJson)

  internal val getLinkedAccountsAccountOwnersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getLinkedAccountsAccountOwnersResponseCodecAlternative1Codec)

  internal val getLinkedAccountsAccountOwnersRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getLinkedAccountsAccountOwnersRequestCodec)

  internal const val POSTLINKEDACCOUNTSACCOUNTDISCONNECT_REQUEST_CODEC_ID: String =
      "PostLinkedAccountsAccountDisconnect.request"

  private val postLinkedAccountsAccountDisconnectRequestCodec:
      MediaTypeCodec<InlineV1LinkedAccountsDisconnectPostRequestFormX878f78a2?> =
      PostLinkedAccountsAccountDisconnectFormCodec

  private val postLinkedAccountsAccountDisconnectResponseCodecAlternative0Codec:
      MediaTypeCodec<FinancialConnectionsAccount> =
      KotlinxSerializationCodec("PostLinkedAccountsAccountDisconnect.response.alternative0", FinancialConnectionsAccount.Serializer, SdkJson)

  internal val postLinkedAccountsAccountDisconnectResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FinancialConnectionsAccount> =
      MediaTypeCodecRegistry.of(postLinkedAccountsAccountDisconnectResponseCodecAlternative0Codec)

  private val postLinkedAccountsAccountDisconnectResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostLinkedAccountsAccountDisconnect.response.alternative1", Error.Serializer, SdkJson)

  internal val postLinkedAccountsAccountDisconnectResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postLinkedAccountsAccountDisconnectResponseCodecAlternative1Codec)

  internal val postLinkedAccountsAccountDisconnectRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1LinkedAccountsDisconnectPostRequestFormX878f78a2?> =
      MediaTypeCodecRegistry.of(postLinkedAccountsAccountDisconnectRequestCodec)

  internal const val POSTLINKEDACCOUNTSACCOUNTREFRESH_REQUEST_CODEC_ID: String =
      "PostLinkedAccountsAccountRefresh.request"

  private val postLinkedAccountsAccountRefreshRequestCodec:
      MediaTypeCodec<InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c> =
      PostLinkedAccountsAccountRefreshFormCodec

  private val postLinkedAccountsAccountRefreshResponseCodecAlternative0Codec:
      MediaTypeCodec<FinancialConnectionsAccount> =
      KotlinxSerializationCodec("PostLinkedAccountsAccountRefresh.response.alternative0", FinancialConnectionsAccount.Serializer, SdkJson)

  internal val postLinkedAccountsAccountRefreshResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FinancialConnectionsAccount> =
      MediaTypeCodecRegistry.of(postLinkedAccountsAccountRefreshResponseCodecAlternative0Codec)

  private val postLinkedAccountsAccountRefreshResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("PostLinkedAccountsAccountRefresh.response.alternative1", Error.Serializer, SdkJson)

  internal val postLinkedAccountsAccountRefreshResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postLinkedAccountsAccountRefreshResponseCodecAlternative1Codec)

  internal val postLinkedAccountsAccountRefreshRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c> =
      MediaTypeCodecRegistry.of(postLinkedAccountsAccountRefreshRequestCodec)

  internal object GetLinkedAccountsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetLinkedAccounts.request"

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

  internal object GetLinkedAccountsAccountFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetLinkedAccountsAccount.request"

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

  internal object GetLinkedAccountsAccountOwnersFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetLinkedAccountsAccountOwners.request"

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

  internal object PostLinkedAccountsAccountDisconnectFormCodec : MediaTypeCodec<InlineV1LinkedAccountsDisconnectPostRequestFormX878f78a2?> {
    override val id: String = "PostLinkedAccountsAccountDisconnect.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1LinkedAccountsDisconnectPostRequestFormX878f78a2?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1LinkedAccountsDisconnectPostRequestFormX878f78a2? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostLinkedAccountsAccountRefreshFormCodec : MediaTypeCodec<InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c> {
    override val id: String = "PostLinkedAccountsAccountRefresh.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      if (request.features.isEmpty()) {
        form.add("features", "")
      } else {
        request.features.forEachIndexed { formIndex0, formElement0 ->
          form.add("features" + "[" + formIndex0 + "]", formElement0.value)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'linked_accounts' group of Stripe API.
 */
public class LinkedAccountsClient(
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
      SdkExecutor(transport, authentication = this@LinkedAccountsClient.authentication)

  /**
   * <p>Returns a list of Financial Connections <code>Account</code> objects.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param accountHolder If present, only return accounts that belong to the specified account holder.
   * `account_holder[customer]` and `account_holder[account]` are mutually exclusive.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param session If present, only return accounts that were collected as part of the given session.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getLinkedAccountsWithResponse(
    request: JsonObject? = null,
    accountHolder: InlineV1LinkedAccountsGetParameterXeee0dd3e? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    session: String? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetLinkedAccountsResponse> = executor.executeWithResponse<JsonObject?, GetLinkedAccountsResponse>(SdkExecutionRequest(getLinkedAccountsMetadata, baseUri, request, listOf(LinkedAccountsCodecs.GETLINKEDACCOUNTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "account_holder[account]", values = accountHolder?.account?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "account_holder[customer]", values = accountHolder?.customer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "account_holder[customer_account]", values = accountHolder?.customerAccount?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "session", values = session?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), LinkedAccountsCodecs.getLinkedAccountsRequestCodecRegistry, GetLinkedAccountsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an Financial Connections <code>Account</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getLinkedAccountsAccountWithResponse(
    request: JsonObject? = null,
    account: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetLinkedAccountsAccountResponse> = executor.executeWithResponse<JsonObject?, GetLinkedAccountsAccountResponse>(SdkExecutionRequest(getLinkedAccountsAccountMetadata, baseUri, request, listOf(LinkedAccountsCodecs.GETLINKEDACCOUNTSACCOUNT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), LinkedAccountsCodecs.getLinkedAccountsAccountRequestCodecRegistry, GetLinkedAccountsAccountResponseDecoder, options)

  /**
   * <p>Lists all owners for a given <code>Account</code></p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param ownership The ID of the ownership object to fetch owners from.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getLinkedAccountsAccountOwnersWithResponse(
    request: JsonObject? = null,
    account: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    ownership: String,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetLinkedAccountsAccountOwnersResponse> = executor.executeWithResponse<JsonObject?, GetLinkedAccountsAccountOwnersResponse>(SdkExecutionRequest(getLinkedAccountsAccountOwnersMetadata, baseUri, request, listOf(LinkedAccountsCodecs.GETLINKEDACCOUNTSACCOUNTOWNERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ownership", values = listOf(ownership.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), LinkedAccountsCodecs.getLinkedAccountsAccountOwnersRequestCodecRegistry, GetLinkedAccountsAccountOwnersResponseDecoder, options)

  /**
   * <p>Disables your access to a Financial Connections <code>Account</code>. You will no longer be able to access data
   * associated with the account (e.g. balances, transactions).</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param options Execution options.
   */
  public suspend fun postLinkedAccountsAccountDisconnectWithResponse(
    request: InlineV1LinkedAccountsDisconnectPostRequestFormX878f78a2? = null,
    account: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostLinkedAccountsAccountDisconnectResponse> = executor.executeWithResponse<InlineV1LinkedAccountsDisconnectPostRequestFormX878f78a2?, PostLinkedAccountsAccountDisconnectResponse>(SdkExecutionRequest(postLinkedAccountsAccountDisconnectMetadata, baseUri, request, listOf(LinkedAccountsCodecs.POSTLINKEDACCOUNTSACCOUNTDISCONNECT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
  }), LinkedAccountsCodecs.postLinkedAccountsAccountDisconnectRequestCodecRegistry, PostLinkedAccountsAccountDisconnectResponseDecoder, options)

  /**
   * <p>Refreshes the data associated with a Financial Connections <code>Account</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param options Execution options.
   */
  public suspend fun postLinkedAccountsAccountRefreshWithResponse(
    request: InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c,
    account: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostLinkedAccountsAccountRefreshResponse> = executor.executeWithResponse<InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c, PostLinkedAccountsAccountRefreshResponse>(SdkExecutionRequest(postLinkedAccountsAccountRefreshMetadata, baseUri, request, listOf(LinkedAccountsCodecs.POSTLINKEDACCOUNTSACCOUNTREFRESH_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
  }), LinkedAccountsCodecs.postLinkedAccountsAccountRefreshRequestCodecRegistry, PostLinkedAccountsAccountRefreshResponseDecoder, options)

  /**
   * Typed response alternatives for `GetLinkedAccounts`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetLinkedAccountsResponse {
    public class SuccessJson(
      public val json: InlineV1LinkedAccountsGetResponse200JsonX46a0930a,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetLinkedAccountsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetLinkedAccountsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetLinkedAccountsResponse
  }

  private object GetLinkedAccountsResponseDecoder : SdkResponseAlternativeDecoder<GetLinkedAccountsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetLinkedAccountsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetLinkedAccountsResponse> = when {
      alternative.id == "GetLinkedAccounts.response.alternative0" -> SdkResponseDecodeResult(
        value = GetLinkedAccountsResponse.SuccessJson(
          json = LinkedAccountsCodecs.getLinkedAccountsResponseCodecAlternative0Registry.select(listOf("GetLinkedAccounts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetLinkedAccounts.response.alternative1" -> SdkResponseDecodeResult(
        value = GetLinkedAccountsResponse.DefaultJson(
          json = LinkedAccountsCodecs.getLinkedAccountsResponseCodecAlternative1Registry.select(listOf("GetLinkedAccounts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetLinkedAccountsResponse = GetLinkedAccountsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetLinkedAccountsAccount`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetLinkedAccountsAccountResponse {
    public class SuccessJson(
      public val json: FinancialConnectionsAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetLinkedAccountsAccountResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetLinkedAccountsAccountResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetLinkedAccountsAccountResponse
  }

  private object GetLinkedAccountsAccountResponseDecoder : SdkResponseAlternativeDecoder<GetLinkedAccountsAccountResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetLinkedAccountsAccountResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetLinkedAccountsAccountResponse> = when {
      alternative.id == "GetLinkedAccountsAccount.response.alternative0" -> SdkResponseDecodeResult(
        value = GetLinkedAccountsAccountResponse.SuccessJson(
          json = LinkedAccountsCodecs.getLinkedAccountsAccountResponseCodecAlternative0Registry.select(listOf("GetLinkedAccountsAccount.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetLinkedAccountsAccount.response.alternative1" -> SdkResponseDecodeResult(
        value = GetLinkedAccountsAccountResponse.DefaultJson(
          json = LinkedAccountsCodecs.getLinkedAccountsAccountResponseCodecAlternative1Registry.select(listOf("GetLinkedAccountsAccount.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetLinkedAccountsAccountResponse = GetLinkedAccountsAccountResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetLinkedAccountsAccountOwners`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetLinkedAccountsAccountOwnersResponse {
    public class SuccessJson(
      public val json: InlineV1LinkedAccountsOwnersGetResponse200JsonXcbc2ffa0,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetLinkedAccountsAccountOwnersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetLinkedAccountsAccountOwnersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetLinkedAccountsAccountOwnersResponse
  }

  private object GetLinkedAccountsAccountOwnersResponseDecoder : SdkResponseAlternativeDecoder<GetLinkedAccountsAccountOwnersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetLinkedAccountsAccountOwnersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetLinkedAccountsAccountOwnersResponse> = when {
      alternative.id == "GetLinkedAccountsAccountOwners.response.alternative0" -> SdkResponseDecodeResult(
        value = GetLinkedAccountsAccountOwnersResponse.SuccessJson(
          json = LinkedAccountsCodecs.getLinkedAccountsAccountOwnersResponseCodecAlternative0Registry.select(listOf("GetLinkedAccountsAccountOwners.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetLinkedAccountsAccountOwners.response.alternative1" -> SdkResponseDecodeResult(
        value = GetLinkedAccountsAccountOwnersResponse.DefaultJson(
          json = LinkedAccountsCodecs.getLinkedAccountsAccountOwnersResponseCodecAlternative1Registry.select(listOf("GetLinkedAccountsAccountOwners.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetLinkedAccountsAccountOwnersResponse = GetLinkedAccountsAccountOwnersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostLinkedAccountsAccountDisconnect`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostLinkedAccountsAccountDisconnectResponse {
    public class SuccessJson(
      public val json: FinancialConnectionsAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostLinkedAccountsAccountDisconnectResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostLinkedAccountsAccountDisconnectResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostLinkedAccountsAccountDisconnectResponse
  }

  private object PostLinkedAccountsAccountDisconnectResponseDecoder : SdkResponseAlternativeDecoder<PostLinkedAccountsAccountDisconnectResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostLinkedAccountsAccountDisconnectResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostLinkedAccountsAccountDisconnectResponse> = when {
      alternative.id == "PostLinkedAccountsAccountDisconnect.response.alternative0" -> SdkResponseDecodeResult(
        value = PostLinkedAccountsAccountDisconnectResponse.SuccessJson(
          json = LinkedAccountsCodecs.postLinkedAccountsAccountDisconnectResponseCodecAlternative0Registry.select(listOf("PostLinkedAccountsAccountDisconnect.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostLinkedAccountsAccountDisconnect.response.alternative1" -> SdkResponseDecodeResult(
        value = PostLinkedAccountsAccountDisconnectResponse.DefaultJson(
          json = LinkedAccountsCodecs.postLinkedAccountsAccountDisconnectResponseCodecAlternative1Registry.select(listOf("PostLinkedAccountsAccountDisconnect.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostLinkedAccountsAccountDisconnectResponse = PostLinkedAccountsAccountDisconnectResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostLinkedAccountsAccountRefresh`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostLinkedAccountsAccountRefreshResponse {
    public class SuccessJson(
      public val json: FinancialConnectionsAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostLinkedAccountsAccountRefreshResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostLinkedAccountsAccountRefreshResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostLinkedAccountsAccountRefreshResponse
  }

  private object PostLinkedAccountsAccountRefreshResponseDecoder : SdkResponseAlternativeDecoder<PostLinkedAccountsAccountRefreshResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostLinkedAccountsAccountRefreshResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostLinkedAccountsAccountRefreshResponse> = when {
      alternative.id == "PostLinkedAccountsAccountRefresh.response.alternative0" -> SdkResponseDecodeResult(
        value = PostLinkedAccountsAccountRefreshResponse.SuccessJson(
          json = LinkedAccountsCodecs.postLinkedAccountsAccountRefreshResponseCodecAlternative0Registry.select(listOf("PostLinkedAccountsAccountRefresh.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostLinkedAccountsAccountRefresh.response.alternative1" -> SdkResponseDecodeResult(
        value = PostLinkedAccountsAccountRefreshResponse.DefaultJson(
          json = LinkedAccountsCodecs.postLinkedAccountsAccountRefreshResponseCodecAlternative1Registry.select(listOf("PostLinkedAccountsAccountRefresh.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostLinkedAccountsAccountRefreshResponse = PostLinkedAccountsAccountRefreshResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getLinkedAccountsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetLinkedAccounts",
          method = "GET",
          path = "/v1/linked_accounts",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1LinkedAccountsGetResponse200JsonX46a0930a",
              mode = SdkResponseMode.BUFFERED,
              id = "GetLinkedAccounts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetLinkedAccounts.response.alternative1",
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

    internal val getLinkedAccountsAccountMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetLinkedAccountsAccount",
          method = "GET",
          path = "/v1/linked_accounts/{account}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FinancialConnectionsAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "GetLinkedAccountsAccount.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetLinkedAccountsAccount.response.alternative1",
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

    internal val getLinkedAccountsAccountOwnersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetLinkedAccountsAccountOwners",
          method = "GET",
          path = "/v1/linked_accounts/{account}/owners",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1LinkedAccountsOwnersGetResponse200JsonXcbc2ffa0",
              mode = SdkResponseMode.BUFFERED,
              id = "GetLinkedAccountsAccountOwners.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetLinkedAccountsAccountOwners.response.alternative1",
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

    internal val postLinkedAccountsAccountDisconnectMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostLinkedAccountsAccountDisconnect",
          method = "POST",
          path = "/v1/linked_accounts/{account}/disconnect",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FinancialConnectionsAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "PostLinkedAccountsAccountDisconnect.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostLinkedAccountsAccountDisconnect.response.alternative1",
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
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val postLinkedAccountsAccountRefreshMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostLinkedAccountsAccountRefresh",
          method = "POST",
          path = "/v1/linked_accounts/{account}/refresh",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FinancialConnectionsAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "PostLinkedAccountsAccountRefresh.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostLinkedAccountsAccountRefresh.response.alternative1",
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
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }
  }
}
