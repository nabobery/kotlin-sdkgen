package io.github.nabobery.sdkgen.generated.stripe.balancesettings

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
import io.github.nabobery.sdkgen.generated.stripe.BalanceSettings
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.InlineV1BalanceSettingsPostRequestFormX9a66c4b8
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object BalanceSettingsCodecs {
  internal const val GETBALANCESETTINGS_REQUEST_CODEC_ID: String = "GetBalanceSettings.request"

  private val getBalanceSettingsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetBalanceSettingsFormCodec

  private val getBalanceSettingsResponseCodecAlternative0Codec: MediaTypeCodec<BalanceSettings> =
      KotlinxSerializationCodec("GetBalanceSettings.response.alternative0", BalanceSettings.Serializer, SdkJson)

  internal val getBalanceSettingsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BalanceSettings> =
      MediaTypeCodecRegistry.of(getBalanceSettingsResponseCodecAlternative0Codec)

  private val getBalanceSettingsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBalanceSettings.response.alternative1", Error.Serializer, SdkJson)

  internal val getBalanceSettingsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBalanceSettingsResponseCodecAlternative1Codec)

  internal val getBalanceSettingsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBalanceSettingsRequestCodec)

  internal const val POSTBALANCESETTINGS_REQUEST_CODEC_ID: String = "PostBalanceSettings.request"

  private val postBalanceSettingsRequestCodec:
      MediaTypeCodec<InlineV1BalanceSettingsPostRequestFormX9a66c4b8?> =
      PostBalanceSettingsFormCodec

  private val postBalanceSettingsResponseCodecAlternative0Codec: MediaTypeCodec<BalanceSettings> =
      KotlinxSerializationCodec("PostBalanceSettings.response.alternative0", BalanceSettings.Serializer, SdkJson)

  internal val postBalanceSettingsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BalanceSettings> =
      MediaTypeCodecRegistry.of(postBalanceSettingsResponseCodecAlternative0Codec)

  private val postBalanceSettingsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostBalanceSettings.response.alternative1", Error.Serializer, SdkJson)

  internal val postBalanceSettingsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBalanceSettingsResponseCodecAlternative1Codec)

  internal val postBalanceSettingsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BalanceSettingsPostRequestFormX9a66c4b8?> =
      MediaTypeCodecRegistry.of(postBalanceSettingsRequestCodec)

  internal object GetBalanceSettingsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBalanceSettings.request"

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

  internal object PostBalanceSettingsFormCodec : MediaTypeCodec<InlineV1BalanceSettingsPostRequestFormX9a66c4b8?> {
    override val id: String = "PostBalanceSettings.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BalanceSettingsPostRequestFormX9a66c4b8?, mediaType: String): SdkRequestBody {
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
      request.payments?.let { formValue0 ->
        formValue0.debitNegativeBalances?.let { formValue2 ->
          form.add("payments" + "[debit_negative_balances]", formValue2.toString())
        }
        formValue0.payouts?.let { formValue2 ->
          formValue2.automaticTransferRulesByCurrency?.let { formValue4 ->
            require(formValue4.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue4.branch1 != null -> {
                requireNotNull(formValue4.branch1).forEach { (formKey6, formMapValue6) ->
                  val formPrimitive6 = formMapValue6 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
                  form.add("payments" + "[payouts]" + "[automatic_transfer_rules_by_currency]" + "[" + formKey6 + "]", formPrimitive6.content)
                }
              }
              formValue4.inlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2 != null -> {
                form.add("payments" + "[payouts]" + "[automatic_transfer_rules_by_currency]", requireNotNull(formValue4.inlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X8be783b2).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
          formValue2.minimumBalanceByCurrency?.let { formValue4 ->
            require(formValue4.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue4.branch1 != null -> {
                requireNotNull(formValue4.branch1).forEach { (formKey6, formMapValue6) ->
                  val formPrimitive6 = formMapValue6 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
                  form.add("payments" + "[payouts]" + "[minimum_balance_by_currency]" + "[" + formKey6 + "]", formPrimitive6.content)
                }
              }
              formValue4.inlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417 != null -> {
                form.add("payments" + "[payouts]" + "[minimum_balance_by_currency]", requireNotNull(formValue4.inlineV1BalanceSettingsPostRequestFormPaymentsPayoutsAnyOf2X13028417).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
          formValue2.schedule?.let { formValue4 ->
            formValue4.interval?.let { formValue6 ->
              form.add("payments" + "[payouts]" + "[schedule]" + "[interval]", formValue6.value)
            }
            formValue4.monthlyPayoutDays?.let { formValue6 ->
              if (formValue6.isEmpty()) {
                form.add("payments" + "[payouts]" + "[schedule]" + "[monthly_payout_days]", "")
              } else {
                formValue6.forEachIndexed { formIndex7, formElement7 ->
                  form.add("payments" + "[payouts]" + "[schedule]" + "[monthly_payout_days]" + "[" + formIndex7 + "]", formElement7.toString())
                }
              }
            }
            formValue4.weeklyPayoutDays?.let { formValue6 ->
              if (formValue6.isEmpty()) {
                form.add("payments" + "[payouts]" + "[schedule]" + "[weekly_payout_days]", "")
              } else {
                formValue6.forEachIndexed { formIndex7, formElement7 ->
                  form.add("payments" + "[payouts]" + "[schedule]" + "[weekly_payout_days]" + "[" + formIndex7 + "]", formElement7.value)
                }
              }
            }
          }
          formValue2.statementDescriptor?.let { formValue4 ->
            form.add("payments" + "[payouts]" + "[statement_descriptor]", formValue4)
          }
        }
        formValue0.settlementTiming?.let { formValue2 ->
          formValue2.delayDaysOverride?.let { formValue4 ->
            require(formValue4.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue4.branch1 != null -> {
                form.add("payments" + "[settlement_timing]" + "[delay_days_override]", requireNotNull(formValue4.branch1).toString())
              }
              formValue4.inlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25 != null -> {
                form.add("payments" + "[settlement_timing]" + "[delay_days_override]", requireNotNull(formValue4.inlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X70c04a25).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
          formValue2.startOfDay?.let { formValue4 ->
            require(formValue4.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue4.inlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1 != null -> {
                requireNotNull(formValue4.inlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1).hour?.let { formValue7 ->
                  form.add("payments" + "[settlement_timing]" + "[start_of_day]" + "[hour]", formValue7.toString())
                }
                requireNotNull(formValue4.inlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1).minutes?.let { formValue7 ->
                  form.add("payments" + "[settlement_timing]" + "[start_of_day]" + "[minutes]", formValue7.toString())
                }
                requireNotNull(formValue4.inlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf1X8877fef1).timezone?.let { formValue7 ->
                  form.add("payments" + "[settlement_timing]" + "[start_of_day]" + "[timezone]", formValue7)
                }
              }
              formValue4.inlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d != null -> {
                form.add("payments" + "[settlement_timing]" + "[start_of_day]", requireNotNull(formValue4.inlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BalanceSettingsPostRequestFormX9a66c4b8? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'balance_settings' group of Stripe API.
 */
public class BalanceSettingsClient(
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
      SdkExecutor(transport, authentication = this@BalanceSettingsClient.authentication)

  /**
   * <p>Retrieves balance settings for a given connected account.
   * Related guide: <a href="/connect/authentication">Making API calls for connected accounts</a></p>
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
  public suspend fun getBalanceSettingsWithResponse(
    request: JsonObject? = null,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBalanceSettingsResponse> = executor.executeWithResponse<JsonObject?, GetBalanceSettingsResponse>(SdkExecutionRequest(getBalanceSettingsMetadata, baseUri, request, listOf(BalanceSettingsCodecs.GETBALANCESETTINGS_REQUEST_CODEC_ID), buildList {
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), BalanceSettingsCodecs.getBalanceSettingsRequestCodecRegistry, GetBalanceSettingsResponseDecoder, options)

  /**
   * <p>Updates balance settings for a given connected account.
   * Related guide: <a href="/connect/authentication">Making API calls for connected accounts</a></p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postBalanceSettingsWithResponse(request: InlineV1BalanceSettingsPostRequestFormX9a66c4b8? = null, options: CallOptions = CallOptions()): SdkResponseResult<PostBalanceSettingsResponse> = executor.executeWithResponse<InlineV1BalanceSettingsPostRequestFormX9a66c4b8?, PostBalanceSettingsResponse>(SdkExecutionRequest(postBalanceSettingsMetadata, baseUri, request, listOf(BalanceSettingsCodecs.POSTBALANCESETTINGS_REQUEST_CODEC_ID), emptyList()), BalanceSettingsCodecs.postBalanceSettingsRequestCodecRegistry, PostBalanceSettingsResponseDecoder, options)

  /**
   * Typed response alternatives for `GetBalanceSettings`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetBalanceSettingsResponse {
    public class SuccessJson(
      public val json: BalanceSettings,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceSettingsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceSettingsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBalanceSettingsResponse
  }

  private object GetBalanceSettingsResponseDecoder : SdkResponseAlternativeDecoder<GetBalanceSettingsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBalanceSettingsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBalanceSettingsResponse> = when {
      alternative.id == "GetBalanceSettings.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBalanceSettingsResponse.SuccessJson(
          json = BalanceSettingsCodecs.getBalanceSettingsResponseCodecAlternative0Registry.select(listOf("GetBalanceSettings.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBalanceSettings.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBalanceSettingsResponse.DefaultJson(
          json = BalanceSettingsCodecs.getBalanceSettingsResponseCodecAlternative1Registry.select(listOf("GetBalanceSettings.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBalanceSettingsResponse = GetBalanceSettingsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBalanceSettings`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostBalanceSettingsResponse {
    public class SuccessJson(
      public val json: BalanceSettings,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBalanceSettingsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBalanceSettingsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBalanceSettingsResponse
  }

  private object PostBalanceSettingsResponseDecoder : SdkResponseAlternativeDecoder<PostBalanceSettingsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBalanceSettingsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBalanceSettingsResponse> = when {
      alternative.id == "PostBalanceSettings.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBalanceSettingsResponse.SuccessJson(
          json = BalanceSettingsCodecs.postBalanceSettingsResponseCodecAlternative0Registry.select(listOf("PostBalanceSettings.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBalanceSettings.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBalanceSettingsResponse.DefaultJson(
          json = BalanceSettingsCodecs.postBalanceSettingsResponseCodecAlternative1Registry.select(listOf("PostBalanceSettings.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBalanceSettingsResponse = PostBalanceSettingsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getBalanceSettingsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBalanceSettings",
          method = "GET",
          path = "/v1/balance_settings",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BalanceSettings",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBalanceSettings.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBalanceSettings.response.alternative1",
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

    internal val postBalanceSettingsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBalanceSettings",
          method = "POST",
          path = "/v1/balance_settings",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BalanceSettings",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBalanceSettings.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBalanceSettings.response.alternative1",
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
