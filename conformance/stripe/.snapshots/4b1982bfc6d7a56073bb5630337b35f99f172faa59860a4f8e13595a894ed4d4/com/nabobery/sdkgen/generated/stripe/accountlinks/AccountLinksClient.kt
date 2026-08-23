package com.nabobery.sdkgen.generated.stripe.accountlinks

import com.nabobery.sdkgen.generated.stripe.AccountLink
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountLinksPostRequestFormX59976192
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

internal object AccountLinksCodecs {
  internal const val POSTACCOUNTLINKS_REQUEST_CODEC_ID: String = "PostAccountLinks.request"

  private val postAccountLinksRequestCodec:
      MediaTypeCodec<InlineV1AccountLinksPostRequestFormX59976192> = PostAccountLinksFormCodec

  private val postAccountLinksResponseCodecAlternative0Codec: MediaTypeCodec<AccountLink> =
      KotlinxSerializationCodec("PostAccountLinks.response.alternative0", AccountLink.Serializer, SdkJson)

  internal val postAccountLinksResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<AccountLink> =
      MediaTypeCodecRegistry.of(postAccountLinksResponseCodecAlternative0Codec)

  private val postAccountLinksResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostAccountLinks.response.alternative1", Error.Serializer, SdkJson)

  internal val postAccountLinksResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postAccountLinksResponseCodecAlternative1Codec)

  internal val postAccountLinksRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1AccountLinksPostRequestFormX59976192> =
      MediaTypeCodecRegistry.of(postAccountLinksRequestCodec)

  internal object PostAccountLinksFormCodec : MediaTypeCodec<InlineV1AccountLinksPostRequestFormX59976192> {
    override val id: String = "PostAccountLinks.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1AccountLinksPostRequestFormX59976192, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("account", request.account)
      request.collect?.let { formValue0 ->
        form.add("collect", formValue0.value)
      }
      request.collectionOptions?.let { formValue0 ->
        formValue0.fields?.let { formValue2 ->
          form.add("collection_options" + "[fields]", formValue2.value)
        }
        formValue0.futureRequirements?.let { formValue2 ->
          form.add("collection_options" + "[future_requirements]", formValue2.value)
        }
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
      request.refreshUrl?.let { formValue0 ->
        form.add("refresh_url", formValue0)
      }
      request.returnUrl?.let { formValue0 ->
        form.add("return_url", formValue0)
      }
      form.add("type", request.type.value)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1AccountLinksPostRequestFormX59976192 {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'account_links' group of Stripe API.
 */
public class AccountLinksClient(
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
      SdkExecutor(transport, authentication = this@AccountLinksClient.authentication)

  /**
   * <p>Creates an AccountLink object that includes a single-use Stripe URL that the platform can redirect their user to
   * in order to take them through the Connect Onboarding flow.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postAccountLinksWithResponse(request: InlineV1AccountLinksPostRequestFormX59976192, options: CallOptions = CallOptions()): SdkResponseResult<PostAccountLinksResponse> = executor.executeWithResponse<InlineV1AccountLinksPostRequestFormX59976192, PostAccountLinksResponse>(SdkExecutionRequest(postAccountLinksMetadata, baseUri, request, listOf(AccountLinksCodecs.POSTACCOUNTLINKS_REQUEST_CODEC_ID), emptyList()), AccountLinksCodecs.postAccountLinksRequestCodecRegistry, PostAccountLinksResponseDecoder, options)

  /**
   * Typed response alternatives for `PostAccountLinks`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostAccountLinksResponse {
    public class SuccessJson(
      public val json: AccountLink,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountLinksResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountLinksResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountLinksResponse
  }

  private object PostAccountLinksResponseDecoder : SdkResponseAlternativeDecoder<PostAccountLinksResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostAccountLinksResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostAccountLinksResponse> = when {
      alternative.id == "PostAccountLinks.response.alternative0" -> SdkResponseDecodeResult(
        value = PostAccountLinksResponse.SuccessJson(
          json = AccountLinksCodecs.postAccountLinksResponseCodecAlternative0Registry.select(listOf("PostAccountLinks.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostAccountLinks.response.alternative1" -> SdkResponseDecodeResult(
        value = PostAccountLinksResponse.DefaultJson(
          json = AccountLinksCodecs.postAccountLinksResponseCodecAlternative1Registry.select(listOf("PostAccountLinks.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostAccountLinksResponse = PostAccountLinksResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val postAccountLinksMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostAccountLinks",
          method = "POST",
          path = "/v1/account_links",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "AccountLink",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountLinks.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountLinks.response.alternative1",
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
