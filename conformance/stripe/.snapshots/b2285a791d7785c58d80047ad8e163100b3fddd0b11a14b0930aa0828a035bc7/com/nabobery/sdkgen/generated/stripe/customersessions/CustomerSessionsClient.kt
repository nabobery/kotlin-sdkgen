package com.nabobery.sdkgen.generated.stripe.customersessions

import com.nabobery.sdkgen.generated.stripe.CustomerSession
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1CustomerSessionsPostRequestFormXcbc880da
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
import com.nabobery.sdkgen.runtime.SdkRequestBody
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

public object CustomerSessionsCodecs {
  public const val POSTCUSTOMERSESSIONS_REQUEST_CODEC_ID: String = "PostCustomerSessions.request"

  private val postCustomerSessionsRequestCodec:
      MediaTypeCodec<InlineV1CustomerSessionsPostRequestFormXcbc880da> =
      PostCustomerSessionsFormCodec

  private val postCustomerSessionsResponseCodecAlternative0Codec: MediaTypeCodec<CustomerSession> =
      KotlinxSerializationCodec("PostCustomerSessions.response.alternative0", CustomerSession.Serializer, SdkJson)

  public val postCustomerSessionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CustomerSession> =
      MediaTypeCodecRegistry.of(postCustomerSessionsResponseCodecAlternative0Codec)

  private val postCustomerSessionsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCustomerSessions.response.alternative1", Error.Serializer, SdkJson)

  public val postCustomerSessionsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCustomerSessionsResponseCodecAlternative1Codec)

  public val postCustomerSessionsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomerSessionsPostRequestFormXcbc880da> =
      MediaTypeCodecRegistry.of(postCustomerSessionsRequestCodec)

  public object PostCustomerSessionsFormCodec : MediaTypeCodec<InlineV1CustomerSessionsPostRequestFormXcbc880da> {
    override val id: String = "PostCustomerSessions.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomerSessionsPostRequestFormXcbc880da, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.components.buyButton?.let { formValue1 ->
        form.add("components" + "[buy_button]" + "[enabled]", formValue1.enabled.toString())
      }
      request.components.customerSheet?.let { formValue1 ->
        form.add("components" + "[customer_sheet]" + "[enabled]", formValue1.enabled.toString())
        formValue1.features?.let { formValue3 ->
          formValue3.paymentMethodAllowRedisplayFilters?.let { formValue5 ->
            if (formValue5.isEmpty()) {
              form.add("components" + "[customer_sheet]" + "[features]" + "[payment_method_allow_redisplay_filters]", "")
            } else {
              formValue5.forEachIndexed { formIndex6, formElement6 ->
                form.add("components" + "[customer_sheet]" + "[features]" + "[payment_method_allow_redisplay_filters]" + "[" + formIndex6 + "]", formElement6.value)
              }
            }
          }
          formValue3.paymentMethodRemove?.let { formValue5 ->
            form.add("components" + "[customer_sheet]" + "[features]" + "[payment_method_remove]", formValue5.value)
          }
        }
      }
      request.components.mobilePaymentElement?.let { formValue1 ->
        form.add("components" + "[mobile_payment_element]" + "[enabled]", formValue1.enabled.toString())
        formValue1.features?.let { formValue3 ->
          formValue3.paymentMethodAllowRedisplayFilters?.let { formValue5 ->
            if (formValue5.isEmpty()) {
              form.add("components" + "[mobile_payment_element]" + "[features]" + "[payment_method_allow_redisplay_filters]", "")
            } else {
              formValue5.forEachIndexed { formIndex6, formElement6 ->
                form.add("components" + "[mobile_payment_element]" + "[features]" + "[payment_method_allow_redisplay_filters]" + "[" + formIndex6 + "]", formElement6.value)
              }
            }
          }
          formValue3.paymentMethodRedisplay?.let { formValue5 ->
            form.add("components" + "[mobile_payment_element]" + "[features]" + "[payment_method_redisplay]", formValue5.value)
          }
          formValue3.paymentMethodRemove?.let { formValue5 ->
            form.add("components" + "[mobile_payment_element]" + "[features]" + "[payment_method_remove]", formValue5.value)
          }
          formValue3.paymentMethodSave?.let { formValue5 ->
            form.add("components" + "[mobile_payment_element]" + "[features]" + "[payment_method_save]", formValue5.value)
          }
          formValue3.paymentMethodSaveAllowRedisplayOverride?.let { formValue5 ->
            form.add("components" + "[mobile_payment_element]" + "[features]" + "[payment_method_save_allow_redisplay_override]", formValue5.value)
          }
        }
      }
      request.components.paymentElement?.let { formValue1 ->
        form.add("components" + "[payment_element]" + "[enabled]", formValue1.enabled.toString())
        formValue1.features?.let { formValue3 ->
          formValue3.paymentMethodAllowRedisplayFilters?.let { formValue5 ->
            if (formValue5.isEmpty()) {
              form.add("components" + "[payment_element]" + "[features]" + "[payment_method_allow_redisplay_filters]", "")
            } else {
              formValue5.forEachIndexed { formIndex6, formElement6 ->
                form.add("components" + "[payment_element]" + "[features]" + "[payment_method_allow_redisplay_filters]" + "[" + formIndex6 + "]", formElement6.value)
              }
            }
          }
          formValue3.paymentMethodRedisplay?.let { formValue5 ->
            form.add("components" + "[payment_element]" + "[features]" + "[payment_method_redisplay]", formValue5.value)
          }
          formValue3.paymentMethodRedisplayLimit?.let { formValue5 ->
            form.add("components" + "[payment_element]" + "[features]" + "[payment_method_redisplay_limit]", formValue5.toString())
          }
          formValue3.paymentMethodRemove?.let { formValue5 ->
            form.add("components" + "[payment_element]" + "[features]" + "[payment_method_remove]", formValue5.value)
          }
          formValue3.paymentMethodSave?.let { formValue5 ->
            form.add("components" + "[payment_element]" + "[features]" + "[payment_method_save]", formValue5.value)
          }
          formValue3.paymentMethodSaveUsage?.let { formValue5 ->
            form.add("components" + "[payment_element]" + "[features]" + "[payment_method_save_usage]", formValue5.value)
          }
        }
      }
      request.components.pricingTable?.let { formValue1 ->
        form.add("components" + "[pricing_table]" + "[enabled]", formValue1.enabled.toString())
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
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomerSessionsPostRequestFormXcbc880da {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'customer_sessions' group of Stripe API.
 */
public class CustomerSessionsClient(
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
      SdkExecutor(transport, authentication = this@CustomerSessionsClient.authentication)

  /**
   * <p>Creates a Customer Session object that includes a single-use client secret that you can use on your front-end to
   * grant client-side API access for certain customer resources.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postCustomerSessionsWithResponse(request: InlineV1CustomerSessionsPostRequestFormXcbc880da, options: CallOptions = CallOptions()): SdkResponseResult<PostCustomerSessionsResponse> = executor.executeWithResponse<InlineV1CustomerSessionsPostRequestFormXcbc880da, PostCustomerSessionsResponse>(SdkExecutionRequest(postCustomerSessionsMetadata, baseUri, request, listOf(CustomerSessionsCodecs.POSTCUSTOMERSESSIONS_REQUEST_CODEC_ID), emptyList()), CustomerSessionsCodecs.postCustomerSessionsRequestCodecRegistry, PostCustomerSessionsResponseDecoder, options)

  /**
   * Typed response alternatives for `PostCustomerSessions`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostCustomerSessionsResponse {
    public class SuccessJson(
      public val json: CustomerSession,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomerSessionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomerSessionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomerSessionsResponse
  }

  private object PostCustomerSessionsResponseDecoder : SdkResponseAlternativeDecoder<PostCustomerSessionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCustomerSessionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCustomerSessionsResponse> = when {
      alternative.id == "PostCustomerSessions.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCustomerSessionsResponse.SuccessJson(
          json = CustomerSessionsCodecs.postCustomerSessionsResponseCodecAlternative0Registry.select(listOf("PostCustomerSessions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCustomerSessions.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCustomerSessionsResponse.DefaultJson(
          json = CustomerSessionsCodecs.postCustomerSessionsResponseCodecAlternative1Registry.select(listOf("PostCustomerSessions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCustomerSessionsResponse = PostCustomerSessionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val postCustomerSessionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCustomerSessions",
          method = "POST",
          path = "/v1/customer_sessions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CustomerSession",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomerSessions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomerSessions.response.alternative1",
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
