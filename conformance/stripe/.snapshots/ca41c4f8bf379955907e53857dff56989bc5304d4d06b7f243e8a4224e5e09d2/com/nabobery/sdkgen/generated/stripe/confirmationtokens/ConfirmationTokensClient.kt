package com.nabobery.sdkgen.generated.stripe.confirmationtokens

import com.nabobery.sdkgen.generated.stripe.ConfirmationToken
import com.nabobery.sdkgen.generated.stripe.Error
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

internal object ConfirmationTokensCodecs {
  internal const val GETCONFIRMATIONTOKENSCONFIRMATIONTOKEN_REQUEST_CODEC_ID: String =
      "GetConfirmationTokensConfirmationToken.request"

  private val getConfirmationTokensConfirmationTokenRequestCodec: MediaTypeCodec<JsonObject?> =
      GetConfirmationTokensConfirmationTokenFormCodec

  private val getConfirmationTokensConfirmationTokenResponseCodecAlternative0Codec:
      MediaTypeCodec<ConfirmationToken> =
      KotlinxSerializationCodec("GetConfirmationTokensConfirmationToken.response.alternative0", ConfirmationToken.Serializer, SdkJson)

  internal val getConfirmationTokensConfirmationTokenResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ConfirmationToken> =
      MediaTypeCodecRegistry.of(getConfirmationTokensConfirmationTokenResponseCodecAlternative0Codec)

  private val getConfirmationTokensConfirmationTokenResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetConfirmationTokensConfirmationToken.response.alternative1", Error.Serializer, SdkJson)

  internal val getConfirmationTokensConfirmationTokenResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getConfirmationTokensConfirmationTokenResponseCodecAlternative1Codec)

  internal val getConfirmationTokensConfirmationTokenRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getConfirmationTokensConfirmationTokenRequestCodec)

  internal object GetConfirmationTokensConfirmationTokenFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetConfirmationTokensConfirmationToken.request"

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
 * Client for the 'confirmation_tokens' group of Stripe API.
 */
public class ConfirmationTokensClient(
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
      SdkExecutor(transport, authentication = this@ConfirmationTokensClient.authentication)

  /**
   * <p>Retrieves an existing ConfirmationToken object</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param confirmationToken Wire parameter `confirmation_token`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getConfirmationTokensConfirmationTokenWithResponse(
    request: JsonObject? = null,
    confirmationToken: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetConfirmationTokensConfirmationTokenResponse> = executor.executeWithResponse<JsonObject?, GetConfirmationTokensConfirmationTokenResponse>(SdkExecutionRequest(getConfirmationTokensConfirmationTokenMetadata, baseUri, request, listOf(ConfirmationTokensCodecs.GETCONFIRMATIONTOKENSCONFIRMATIONTOKEN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "confirmation_token", values = listOf(confirmationToken.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ConfirmationTokensCodecs.getConfirmationTokensConfirmationTokenRequestCodecRegistry, GetConfirmationTokensConfirmationTokenResponseDecoder, options)

  /**
   * Typed response alternatives for `GetConfirmationTokensConfirmationToken`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetConfirmationTokensConfirmationTokenResponse {
    public class SuccessJson(
      public val json: ConfirmationToken,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetConfirmationTokensConfirmationTokenResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetConfirmationTokensConfirmationTokenResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetConfirmationTokensConfirmationTokenResponse
  }

  private object GetConfirmationTokensConfirmationTokenResponseDecoder : SdkResponseAlternativeDecoder<GetConfirmationTokensConfirmationTokenResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetConfirmationTokensConfirmationTokenResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetConfirmationTokensConfirmationTokenResponse> = when {
      alternative.id == "GetConfirmationTokensConfirmationToken.response.alternative0" -> SdkResponseDecodeResult(
        value = GetConfirmationTokensConfirmationTokenResponse.SuccessJson(
          json = ConfirmationTokensCodecs.getConfirmationTokensConfirmationTokenResponseCodecAlternative0Registry.select(listOf("GetConfirmationTokensConfirmationToken.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetConfirmationTokensConfirmationToken.response.alternative1" -> SdkResponseDecodeResult(
        value = GetConfirmationTokensConfirmationTokenResponse.DefaultJson(
          json = ConfirmationTokensCodecs.getConfirmationTokensConfirmationTokenResponseCodecAlternative1Registry.select(listOf("GetConfirmationTokensConfirmationToken.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetConfirmationTokensConfirmationTokenResponse = GetConfirmationTokensConfirmationTokenResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getConfirmationTokensConfirmationTokenMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetConfirmationTokensConfirmationToken",
          method = "GET",
          path = "/v1/confirmation_tokens/{confirmation_token}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ConfirmationToken",
              mode = SdkResponseMode.BUFFERED,
              id = "GetConfirmationTokensConfirmationToken.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetConfirmationTokensConfirmationToken.response.alternative1",
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
