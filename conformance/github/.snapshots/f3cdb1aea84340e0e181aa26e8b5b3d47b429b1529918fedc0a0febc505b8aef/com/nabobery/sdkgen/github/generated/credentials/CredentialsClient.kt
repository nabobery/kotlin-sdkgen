package com.nabobery.sdkgen.github.generated.credentials

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.InlineCredentialsRevokePostRequestJsonX93e92f16
import com.nabobery.sdkgen.github.generated.SdkJson
import com.nabobery.sdkgen.github.generated.ValidationErrorSimple
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
import com.nabobery.sdkgen.runtime.SdkApiException
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseDecodeResult
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.json.JsonObject

internal object CredentialsCodecs {
  internal const val CREDENTIALSREVOKE_REQUEST_CODEC_ID: String = "credentials/revoke.request"

  private val credentialsRevokeRequestCodec:
      MediaTypeCodec<InlineCredentialsRevokePostRequestJsonX93e92f16> =
      KotlinxSerializationCodec(CREDENTIALSREVOKE_REQUEST_CODEC_ID, InlineCredentialsRevokePostRequestJsonX93e92f16.Serializer, SdkJson)

  internal const val CREDENTIALSREVOKE_RESPONSE_CODEC_ID: String = "credentials/revoke.response"

  private val credentialsRevokeResponseCodec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec(CREDENTIALSREVOKE_RESPONSE_CODEC_ID, JsonObject.serializer(), SdkJson)

  private val credentialsRevokeResponseCodecAlternative0Codec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("credentials/revoke.response.alternative0", JsonObject.serializer(), SdkJson)

  internal val credentialsRevokeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(credentialsRevokeResponseCodecAlternative0Codec)

  private val credentialsRevokeResponseCodecAlternative1Codec: MediaTypeCodec<ValidationErrorSimple>
      =
      KotlinxSerializationCodec("credentials/revoke.response.alternative1", ValidationErrorSimple.Serializer, SdkJson)

  internal val credentialsRevokeResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ValidationErrorSimple> =
      MediaTypeCodecRegistry.of(credentialsRevokeResponseCodecAlternative1Codec)

  private val credentialsRevokeResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("credentials/revoke.response.alternative2", BasicError.Serializer, SdkJson)

  internal val credentialsRevokeResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(credentialsRevokeResponseCodecAlternative2Codec)

  internal val credentialsRevokeRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineCredentialsRevokePostRequestJsonX93e92f16> =
      MediaTypeCodecRegistry.of(credentialsRevokeRequestCodec)

  internal val credentialsRevokeResponseCodecRegistry: MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(credentialsRevokeResponseCodec)
}

/**
 * Client for the 'credentials' group of GitHub v3 REST API.
 */
public class CredentialsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@CredentialsClient.authentication)

  /**
   * Submit a list of credentials to be revoked. This endpoint is intended to revoke credentials the caller does not own
   * and may have found exposed on GitHub.com or elsewhere. It can also be used for credentials associated with an old
   * user account that you no longer have access to. Credential owners will be notified of the revocation.
   *
   * This endpoint currently accepts the following credential types:
   * - Personal access tokens (classic) (`ghp_`)
   * - Fine-grained personal access tokens (`github_pat_`)
   * - OAuth app access tokens (`gho_`)
   * - User-to-server tokens from GitHub Apps (`ghu_`)
   * - Refresh tokens from GitHub Apps (`ghr_`)
   *
   *
   * Revoked credentials may impact users on GitHub Free, Pro, & Team and GitHub Enterprise Cloud, and GitHub Enterprise
   * Cloud with Enterprise Managed Users.
   * GitHub cannot reactivate any credentials that have been revoked; new credentials will need to be generated.
   *
   * To prevent abuse, this API is limited to only 60 unauthenticated requests per hour and a max of 1000 tokens per API
   * request.
   *
   * > [!NOTE]
   * > Any authenticated requests will return a 403.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CredentialsRevokeApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CredentialsRevokeError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun credentialsRevoke(request: InlineCredentialsRevokePostRequestJsonX93e92f16, options: CallOptions = CallOptions()): JsonObject = executor.executeWithTypedErrors<InlineCredentialsRevokePostRequestJsonX93e92f16, CredentialsRevokeResponse, JsonObject>(
    request = SdkExecutionRequest(credentialsRevokeMetadata, baseUri, request, listOf(CredentialsCodecs.CREDENTIALSREVOKE_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = CredentialsCodecs.credentialsRevokeRequestCodecRegistry,
    responseDecoder = CredentialsRevokeResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CredentialsRevokeResponse.SuccessJson -> response.json
        is CredentialsRevokeResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CredentialsRevokeResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CredentialsRevokeResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CredentialsRevokeResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CredentialsRevokeResponse.Http422Json -> CredentialsRevokeApiException(response, statusCode, headers)
        is CredentialsRevokeResponse.Http500Json -> CredentialsRevokeApiException(response, statusCode, headers)
        is CredentialsRevokeResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Submit a list of credentials to be revoked. This endpoint is intended to revoke credentials the caller does not own
   * and may have found exposed on GitHub.com or elsewhere. It can also be used for credentials associated with an old
   * user account that you no longer have access to. Credential owners will be notified of the revocation.
   *
   * This endpoint currently accepts the following credential types:
   * - Personal access tokens (classic) (`ghp_`)
   * - Fine-grained personal access tokens (`github_pat_`)
   * - OAuth app access tokens (`gho_`)
   * - User-to-server tokens from GitHub Apps (`ghu_`)
   * - Refresh tokens from GitHub Apps (`ghr_`)
   *
   *
   * Revoked credentials may impact users on GitHub Free, Pro, & Team and GitHub Enterprise Cloud, and GitHub Enterprise
   * Cloud with Enterprise Managed Users.
   * GitHub cannot reactivate any credentials that have been revoked; new credentials will need to be generated.
   *
   * To prevent abuse, this API is limited to only 60 unauthenticated requests per hour and a max of 1000 tokens per API
   * request.
   *
   * > [!NOTE]
   * > Any authenticated requests will return a 403.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun credentialsRevokeWithResponse(request: InlineCredentialsRevokePostRequestJsonX93e92f16, options: CallOptions = CallOptions()): SdkResponseResult<CredentialsRevokeResponse> = executor.executeWithResponse<InlineCredentialsRevokePostRequestJsonX93e92f16, CredentialsRevokeResponse>(SdkExecutionRequest(credentialsRevokeMetadata, baseUri, request, listOf(CredentialsCodecs.CREDENTIALSREVOKE_REQUEST_CODEC_ID), emptyList()), CredentialsCodecs.credentialsRevokeRequestCodecRegistry, CredentialsRevokeResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `credentials/revoke` may expose through its typed API exception.
   */
  public sealed interface CredentialsRevokeError

  /**
   * Typed response alternatives for `credentials/revoke`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface CredentialsRevokeResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CredentialsRevokeResponse

    public class Http422Json(
      public val json: ValidationErrorSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CredentialsRevokeResponse,
        CredentialsRevokeError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CredentialsRevokeResponse,
        CredentialsRevokeError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CredentialsRevokeResponse
  }

  /**
   * Raised by `credentials/revoke` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class CredentialsRevokeApiException(
    public val error: CredentialsRevokeError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "credentials/revoke")

  private object CredentialsRevokeResponseDecoder : SdkResponseAlternativeDecoder<CredentialsRevokeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CredentialsRevokeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CredentialsRevokeResponse> = when {
      alternative.id == "credentials/revoke.response.alternative0" -> SdkResponseDecodeResult(
        value = CredentialsRevokeResponse.SuccessJson(
          json = CredentialsCodecs.credentialsRevokeResponseCodecAlternative0Registry.select(listOf("credentials/revoke.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "credentials/revoke.response.alternative1" -> SdkResponseDecodeResult(
        value = CredentialsRevokeResponse.Http422Json(
          json = CredentialsCodecs.credentialsRevokeResponseCodecAlternative1Registry.select(listOf("credentials/revoke.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "credentials/revoke.response.alternative2" -> SdkResponseDecodeResult(
        value = CredentialsRevokeResponse.Http500Json(
          json = CredentialsCodecs.credentialsRevokeResponseCodecAlternative2Registry.select(listOf("credentials/revoke.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CredentialsRevokeResponse = CredentialsRevokeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val credentialsRevokeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "credentials/revoke",
          method = "POST",
          path = "/credentials/revoke",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(202),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "JsonObject",
              mode = SdkResponseMode.BUFFERED,
              id = "credentials/revoke.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationErrorSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "credentials/revoke.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "credentials/revoke.response.alternative2",
            ),
          ),
          security = emptyList(),
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
