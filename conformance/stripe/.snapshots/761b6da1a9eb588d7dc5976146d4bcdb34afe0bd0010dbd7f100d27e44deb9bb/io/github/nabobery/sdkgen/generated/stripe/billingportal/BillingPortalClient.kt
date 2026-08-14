package io.github.nabobery.sdkgen.generated.stripe.billingportal

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
import io.github.nabobery.sdkgen.generated.stripe.BillingPortalConfiguration
import io.github.nabobery.sdkgen.generated.stripe.BillingPortalSession
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalConfigurationsGetResponse200JsonXb60c6944
import io.github.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalSessionsPostRequestFormXa2072220
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject

internal object BillingPortalCodecs {
  internal const val GETBILLINGPORTALCONFIGURATIONS_REQUEST_CODEC_ID: String =
      "GetBillingPortalConfigurations.request"

  private val getBillingPortalConfigurationsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetBillingPortalConfigurationsFormCodec

  private val getBillingPortalConfigurationsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1BillingPortalConfigurationsGetResponse200JsonXb60c6944> =
      KotlinxSerializationCodec("GetBillingPortalConfigurations.response.alternative0", InlineV1BillingPortalConfigurationsGetResponse200JsonXb60c6944.Serializer, SdkJson)

  internal val getBillingPortalConfigurationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1BillingPortalConfigurationsGetResponse200JsonXb60c6944> =
      MediaTypeCodecRegistry.of(getBillingPortalConfigurationsResponseCodecAlternative0Codec)

  private val getBillingPortalConfigurationsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBillingPortalConfigurations.response.alternative1", Error.Serializer, SdkJson)

  internal val getBillingPortalConfigurationsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBillingPortalConfigurationsResponseCodecAlternative1Codec)

  internal val getBillingPortalConfigurationsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBillingPortalConfigurationsRequestCodec)

  internal const val GETBILLINGPORTALCONFIGURATIONSCONFIGURATION_REQUEST_CODEC_ID: String =
      "GetBillingPortalConfigurationsConfiguration.request"

  private val getBillingPortalConfigurationsConfigurationRequestCodec: MediaTypeCodec<JsonObject?> =
      GetBillingPortalConfigurationsConfigurationFormCodec

  private val getBillingPortalConfigurationsConfigurationResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingPortalConfiguration> =
      KotlinxSerializationCodec("GetBillingPortalConfigurationsConfiguration.response.alternative0", BillingPortalConfiguration.Serializer, SdkJson)

  internal val getBillingPortalConfigurationsConfigurationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingPortalConfiguration> =
      MediaTypeCodecRegistry.of(getBillingPortalConfigurationsConfigurationResponseCodecAlternative0Codec)

  private val getBillingPortalConfigurationsConfigurationResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBillingPortalConfigurationsConfiguration.response.alternative1", Error.Serializer, SdkJson)

  internal val getBillingPortalConfigurationsConfigurationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBillingPortalConfigurationsConfigurationResponseCodecAlternative1Codec)

  internal val getBillingPortalConfigurationsConfigurationRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBillingPortalConfigurationsConfigurationRequestCodec)

  internal const val POSTBILLINGPORTALSESSIONS_REQUEST_CODEC_ID: String =
      "PostBillingPortalSessions.request"

  private val postBillingPortalSessionsRequestCodec:
      MediaTypeCodec<InlineV1BillingPortalSessionsPostRequestFormXa2072220?> =
      PostBillingPortalSessionsFormCodec

  private val postBillingPortalSessionsResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingPortalSession> =
      KotlinxSerializationCodec("PostBillingPortalSessions.response.alternative0", BillingPortalSession.Serializer, SdkJson)

  internal val postBillingPortalSessionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingPortalSession> =
      MediaTypeCodecRegistry.of(postBillingPortalSessionsResponseCodecAlternative0Codec)

  private val postBillingPortalSessionsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostBillingPortalSessions.response.alternative1", Error.Serializer, SdkJson)

  internal val postBillingPortalSessionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBillingPortalSessionsResponseCodecAlternative1Codec)

  internal val postBillingPortalSessionsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BillingPortalSessionsPostRequestFormXa2072220?> =
      MediaTypeCodecRegistry.of(postBillingPortalSessionsRequestCodec)

  internal object GetBillingPortalConfigurationsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBillingPortalConfigurations.request"

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

  internal object GetBillingPortalConfigurationsConfigurationFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBillingPortalConfigurationsConfiguration.request"

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

  internal object PostBillingPortalSessionsFormCodec : MediaTypeCodec<InlineV1BillingPortalSessionsPostRequestFormXa2072220?> {
    override val id: String = "PostBillingPortalSessions.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BillingPortalSessionsPostRequestFormXa2072220?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.configuration?.let { formValue0 ->
        form.add("configuration", formValue0)
      }
      request.customer?.let { formValue0 ->
        form.add("customer", formValue0)
      }
      request.customerAccount?.let { formValue0 ->
        form.add("customer_account", formValue0)
      }
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.flowData?.let { formValue0 ->
        formValue0.afterCompletion?.let { formValue2 ->
          formValue2.hostedConfirmation?.let { formValue4 ->
            formValue4.customMessage?.let { formValue6 ->
              form.add("flow_data" + "[after_completion]" + "[hosted_confirmation]" + "[custom_message]", formValue6)
            }
          }
          formValue2.redirect?.let { formValue4 ->
            form.add("flow_data" + "[after_completion]" + "[redirect]" + "[return_url]", formValue4.returnUrl)
          }
          form.add("flow_data" + "[after_completion]" + "[type]", formValue2.type.value)
        }
        formValue0.subscriptionCancel?.let { formValue2 ->
          formValue2.retention?.let { formValue4 ->
            form.add("flow_data" + "[subscription_cancel]" + "[retention]" + "[coupon_offer]" + "[coupon]", formValue4.couponOffer.coupon)
            form.add("flow_data" + "[subscription_cancel]" + "[retention]" + "[type]", formValue4.type.value)
          }
          form.add("flow_data" + "[subscription_cancel]" + "[subscription]", formValue2.subscription)
        }
        formValue0.subscriptionUpdate?.let { formValue2 ->
          form.add("flow_data" + "[subscription_update]" + "[subscription]", formValue2.subscription)
        }
        formValue0.subscriptionUpdateConfirm?.let { formValue2 ->
          formValue2.discounts?.let { formValue4 ->
            if (formValue4.isEmpty()) {
              form.add("flow_data" + "[subscription_update_confirm]" + "[discounts]", "")
            } else {
              formValue4.forEachIndexed { formIndex5, formElement5 ->
                formElement5.coupon?.let { formValue7 ->
                  form.add("flow_data" + "[subscription_update_confirm]" + "[discounts]" + "[" + formIndex5 + "]" + "[coupon]", formValue7)
                }
                formElement5.promotionCode?.let { formValue7 ->
                  form.add("flow_data" + "[subscription_update_confirm]" + "[discounts]" + "[" + formIndex5 + "]" + "[promotion_code]", formValue7)
                }
              }
            }
          }
          if (formValue2.items.isEmpty()) {
            form.add("flow_data" + "[subscription_update_confirm]" + "[items]", "")
          } else {
            formValue2.items.forEachIndexed { formIndex4, formElement4 ->
              form.add("flow_data" + "[subscription_update_confirm]" + "[items]" + "[" + formIndex4 + "]" + "[id]", formElement4.id)
              formElement4.price?.let { formValue6 ->
                form.add("flow_data" + "[subscription_update_confirm]" + "[items]" + "[" + formIndex4 + "]" + "[price]", formValue6)
              }
              formElement4.quantity?.let { formValue6 ->
                form.add("flow_data" + "[subscription_update_confirm]" + "[items]" + "[" + formIndex4 + "]" + "[quantity]", formValue6.toString())
              }
            }
          }
          form.add("flow_data" + "[subscription_update_confirm]" + "[subscription]", formValue2.subscription)
        }
        form.add("flow_data" + "[type]", formValue0.type.value)
      }
      request.locale?.let { formValue0 ->
        form.add("locale", formValue0.value)
      }
      request.onBehalfOf?.let { formValue0 ->
        form.add("on_behalf_of", formValue0)
      }
      request.returnUrl?.let { formValue0 ->
        form.add("return_url", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BillingPortalSessionsPostRequestFormXa2072220? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'billing_portal' group of Stripe API.
 */
public class BillingPortalClient(
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
      SdkExecutor(transport, authentication = this@BillingPortalClient.authentication)

  /**
   * <p>Returns a list of configurations that describe the functionality of the customer portal.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param active Only return configurations that are active or inactive (e.g., pass `true` to only list active
   * configurations).
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param isDefault Only return the default or non-default configurations (e.g., pass `true` to only list the default
   * configuration).
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getBillingPortalConfigurationsWithResponse(
    request: JsonObject? = null,
    active: Boolean? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    isDefault: Boolean? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBillingPortalConfigurationsResponse> = executor.executeWithResponse<JsonObject?, GetBillingPortalConfigurationsResponse>(SdkExecutionRequest(getBillingPortalConfigurationsMetadata, baseUri, request, listOf(BillingPortalCodecs.GETBILLINGPORTALCONFIGURATIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "active", values = active?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_default", values = isDefault?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), BillingPortalCodecs.getBillingPortalConfigurationsRequestCodecRegistry, GetBillingPortalConfigurationsResponseDecoder, options)

  /**
   * <p>Retrieves a configuration that describes the functionality of the customer portal.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param configuration Wire parameter `configuration`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getBillingPortalConfigurationsConfigurationWithResponse(
    request: JsonObject? = null,
    configuration: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBillingPortalConfigurationsConfigurationResponse> = executor.executeWithResponse<JsonObject?, GetBillingPortalConfigurationsConfigurationResponse>(SdkExecutionRequest(getBillingPortalConfigurationsConfigurationMetadata, baseUri, request, listOf(BillingPortalCodecs.GETBILLINGPORTALCONFIGURATIONSCONFIGURATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration", values = listOf(configuration.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), BillingPortalCodecs.getBillingPortalConfigurationsConfigurationRequestCodecRegistry, GetBillingPortalConfigurationsConfigurationResponseDecoder, options)

  /**
   * <p>Creates a session of the customer portal.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postBillingPortalSessionsWithResponse(request: InlineV1BillingPortalSessionsPostRequestFormXa2072220? = null, options: CallOptions = CallOptions()): SdkResponseResult<PostBillingPortalSessionsResponse> = executor.executeWithResponse<InlineV1BillingPortalSessionsPostRequestFormXa2072220?, PostBillingPortalSessionsResponse>(SdkExecutionRequest(postBillingPortalSessionsMetadata, baseUri, request, listOf(BillingPortalCodecs.POSTBILLINGPORTALSESSIONS_REQUEST_CODEC_ID), emptyList()), BillingPortalCodecs.postBillingPortalSessionsRequestCodecRegistry, PostBillingPortalSessionsResponseDecoder, options)

  /**
   * Typed response alternatives for `GetBillingPortalConfigurations`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetBillingPortalConfigurationsResponse {
    public class SuccessJson(
      public val json: InlineV1BillingPortalConfigurationsGetResponse200JsonXb60c6944,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingPortalConfigurationsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingPortalConfigurationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingPortalConfigurationsResponse
  }

  private object GetBillingPortalConfigurationsResponseDecoder : SdkResponseAlternativeDecoder<GetBillingPortalConfigurationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBillingPortalConfigurationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBillingPortalConfigurationsResponse> = when {
      alternative.id == "GetBillingPortalConfigurations.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBillingPortalConfigurationsResponse.SuccessJson(
          json = BillingPortalCodecs.getBillingPortalConfigurationsResponseCodecAlternative0Registry.select(listOf("GetBillingPortalConfigurations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBillingPortalConfigurations.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBillingPortalConfigurationsResponse.DefaultJson(
          json = BillingPortalCodecs.getBillingPortalConfigurationsResponseCodecAlternative1Registry.select(listOf("GetBillingPortalConfigurations.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBillingPortalConfigurationsResponse = GetBillingPortalConfigurationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetBillingPortalConfigurationsConfiguration`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetBillingPortalConfigurationsConfigurationResponse {
    public class SuccessJson(
      public val json: BillingPortalConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingPortalConfigurationsConfigurationResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingPortalConfigurationsConfigurationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingPortalConfigurationsConfigurationResponse
  }

  private object GetBillingPortalConfigurationsConfigurationResponseDecoder : SdkResponseAlternativeDecoder<GetBillingPortalConfigurationsConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBillingPortalConfigurationsConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBillingPortalConfigurationsConfigurationResponse> = when {
      alternative.id == "GetBillingPortalConfigurationsConfiguration.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBillingPortalConfigurationsConfigurationResponse.SuccessJson(
          json = BillingPortalCodecs.getBillingPortalConfigurationsConfigurationResponseCodecAlternative0Registry.select(listOf("GetBillingPortalConfigurationsConfiguration.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBillingPortalConfigurationsConfiguration.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBillingPortalConfigurationsConfigurationResponse.DefaultJson(
          json = BillingPortalCodecs.getBillingPortalConfigurationsConfigurationResponseCodecAlternative1Registry.select(listOf("GetBillingPortalConfigurationsConfiguration.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBillingPortalConfigurationsConfigurationResponse = GetBillingPortalConfigurationsConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBillingPortalSessions`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostBillingPortalSessionsResponse {
    public class SuccessJson(
      public val json: BillingPortalSession,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingPortalSessionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingPortalSessionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingPortalSessionsResponse
  }

  private object PostBillingPortalSessionsResponseDecoder : SdkResponseAlternativeDecoder<PostBillingPortalSessionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBillingPortalSessionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBillingPortalSessionsResponse> = when {
      alternative.id == "PostBillingPortalSessions.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBillingPortalSessionsResponse.SuccessJson(
          json = BillingPortalCodecs.postBillingPortalSessionsResponseCodecAlternative0Registry.select(listOf("PostBillingPortalSessions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBillingPortalSessions.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBillingPortalSessionsResponse.DefaultJson(
          json = BillingPortalCodecs.postBillingPortalSessionsResponseCodecAlternative1Registry.select(listOf("PostBillingPortalSessions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBillingPortalSessionsResponse = PostBillingPortalSessionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getBillingPortalConfigurationsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBillingPortalConfigurations",
          method = "GET",
          path = "/v1/billing_portal/configurations",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1BillingPortalConfigurationsGetResponse200JsonXb60c6944",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingPortalConfigurations.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingPortalConfigurations.response.alternative1",
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

    internal val getBillingPortalConfigurationsConfigurationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBillingPortalConfigurationsConfiguration",
          method = "GET",
          path = "/v1/billing_portal/configurations/{configuration}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingPortalConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingPortalConfigurationsConfiguration.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingPortalConfigurationsConfiguration.response.alternative1",
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

    internal val postBillingPortalSessionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBillingPortalSessions",
          method = "POST",
          path = "/v1/billing_portal/sessions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingPortalSession",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingPortalSessions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingPortalSessions.response.alternative1",
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
