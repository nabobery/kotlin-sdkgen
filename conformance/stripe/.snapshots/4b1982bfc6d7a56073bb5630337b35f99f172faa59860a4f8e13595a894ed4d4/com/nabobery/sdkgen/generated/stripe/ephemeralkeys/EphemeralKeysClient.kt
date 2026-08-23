package com.nabobery.sdkgen.generated.stripe.ephemeralkeys

import com.nabobery.sdkgen.generated.stripe.EphemeralKey
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1EphemeralKeysDeleteRequestFormX85408ebf
import com.nabobery.sdkgen.generated.stripe.InlineV1EphemeralKeysPostRequestFormX0d4b063f
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

internal object EphemeralKeysCodecs {
  internal const val DELETEEPHEMERALKEYSKEY_REQUEST_CODEC_ID: String =
      "DeleteEphemeralKeysKey.request"

  private val deleteEphemeralKeysKeyRequestCodec:
      MediaTypeCodec<InlineV1EphemeralKeysDeleteRequestFormX85408ebf?> =
      DeleteEphemeralKeysKeyFormCodec

  private val deleteEphemeralKeysKeyResponseCodecAlternative0Codec: MediaTypeCodec<EphemeralKey> =
      KotlinxSerializationCodec("DeleteEphemeralKeysKey.response.alternative0", EphemeralKey.Serializer, SdkJson)

  internal val deleteEphemeralKeysKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<EphemeralKey> =
      MediaTypeCodecRegistry.of(deleteEphemeralKeysKeyResponseCodecAlternative0Codec)

  private val deleteEphemeralKeysKeyResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteEphemeralKeysKey.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteEphemeralKeysKeyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteEphemeralKeysKeyResponseCodecAlternative1Codec)

  internal val deleteEphemeralKeysKeyRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1EphemeralKeysDeleteRequestFormX85408ebf?> =
      MediaTypeCodecRegistry.of(deleteEphemeralKeysKeyRequestCodec)

  internal const val POSTEPHEMERALKEYS_REQUEST_CODEC_ID: String = "PostEphemeralKeys.request"

  private val postEphemeralKeysRequestCodec:
      MediaTypeCodec<InlineV1EphemeralKeysPostRequestFormX0d4b063f?> = PostEphemeralKeysFormCodec

  private val postEphemeralKeysResponseCodecAlternative0Codec: MediaTypeCodec<EphemeralKey> =
      KotlinxSerializationCodec("PostEphemeralKeys.response.alternative0", EphemeralKey.Serializer, SdkJson)

  internal val postEphemeralKeysResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<EphemeralKey> =
      MediaTypeCodecRegistry.of(postEphemeralKeysResponseCodecAlternative0Codec)

  private val postEphemeralKeysResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostEphemeralKeys.response.alternative1", Error.Serializer, SdkJson)

  internal val postEphemeralKeysResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postEphemeralKeysResponseCodecAlternative1Codec)

  internal val postEphemeralKeysRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1EphemeralKeysPostRequestFormX0d4b063f?> =
      MediaTypeCodecRegistry.of(postEphemeralKeysRequestCodec)

  internal object DeleteEphemeralKeysKeyFormCodec : MediaTypeCodec<InlineV1EphemeralKeysDeleteRequestFormX85408ebf?> {
    override val id: String = "DeleteEphemeralKeysKey.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1EphemeralKeysDeleteRequestFormX85408ebf?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1EphemeralKeysDeleteRequestFormX85408ebf? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostEphemeralKeysFormCodec : MediaTypeCodec<InlineV1EphemeralKeysPostRequestFormX0d4b063f?> {
    override val id: String = "PostEphemeralKeys.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1EphemeralKeysPostRequestFormX0d4b063f?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.customer?.let { formValue0 ->
        form.add("customer", formValue0)
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
      request.issuingCard?.let { formValue0 ->
        form.add("issuing_card", formValue0)
      }
      request.nonce?.let { formValue0 ->
        form.add("nonce", formValue0)
      }
      request.verificationSession?.let { formValue0 ->
        form.add("verification_session", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1EphemeralKeysPostRequestFormX0d4b063f? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'ephemeral_keys' group of Stripe API.
 */
public class EphemeralKeysClient(
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
      SdkExecutor(transport, authentication = this@EphemeralKeysClient.authentication)

  /**
   * <p>Invalidates a short-lived API key for a given resource.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param key Wire parameter `key`.
   * @param options Execution options.
   */
  public suspend fun deleteEphemeralKeysKeyWithResponse(
    request: InlineV1EphemeralKeysDeleteRequestFormX85408ebf? = null,
    key: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteEphemeralKeysKeyResponse> = executor.executeWithResponse<InlineV1EphemeralKeysDeleteRequestFormX85408ebf?, DeleteEphemeralKeysKeyResponse>(SdkExecutionRequest(deleteEphemeralKeysKeyMetadata, baseUri, request, listOf(EphemeralKeysCodecs.DELETEEPHEMERALKEYSKEY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "key", values = listOf(key.toString())))
  }), EphemeralKeysCodecs.deleteEphemeralKeysKeyRequestCodecRegistry, DeleteEphemeralKeysKeyResponseDecoder, options)

  /**
   * <p>Creates a short-lived API key for a given resource.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postEphemeralKeysWithResponse(request: InlineV1EphemeralKeysPostRequestFormX0d4b063f? = null, options: CallOptions = CallOptions()): SdkResponseResult<PostEphemeralKeysResponse> = executor.executeWithResponse<InlineV1EphemeralKeysPostRequestFormX0d4b063f?, PostEphemeralKeysResponse>(SdkExecutionRequest(postEphemeralKeysMetadata, baseUri, request, listOf(EphemeralKeysCodecs.POSTEPHEMERALKEYS_REQUEST_CODEC_ID), emptyList()), EphemeralKeysCodecs.postEphemeralKeysRequestCodecRegistry, PostEphemeralKeysResponseDecoder, options)

  /**
   * Typed response alternatives for `DeleteEphemeralKeysKey`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface DeleteEphemeralKeysKeyResponse {
    public class SuccessJson(
      public val json: EphemeralKey,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteEphemeralKeysKeyResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteEphemeralKeysKeyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteEphemeralKeysKeyResponse
  }

  private object DeleteEphemeralKeysKeyResponseDecoder : SdkResponseAlternativeDecoder<DeleteEphemeralKeysKeyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteEphemeralKeysKeyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteEphemeralKeysKeyResponse> = when {
      alternative.id == "DeleteEphemeralKeysKey.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteEphemeralKeysKeyResponse.SuccessJson(
          json = EphemeralKeysCodecs.deleteEphemeralKeysKeyResponseCodecAlternative0Registry.select(listOf("DeleteEphemeralKeysKey.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteEphemeralKeysKey.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteEphemeralKeysKeyResponse.DefaultJson(
          json = EphemeralKeysCodecs.deleteEphemeralKeysKeyResponseCodecAlternative1Registry.select(listOf("DeleteEphemeralKeysKey.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteEphemeralKeysKeyResponse = DeleteEphemeralKeysKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostEphemeralKeys`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostEphemeralKeysResponse {
    public class SuccessJson(
      public val json: EphemeralKey,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostEphemeralKeysResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostEphemeralKeysResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostEphemeralKeysResponse
  }

  private object PostEphemeralKeysResponseDecoder : SdkResponseAlternativeDecoder<PostEphemeralKeysResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostEphemeralKeysResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostEphemeralKeysResponse> = when {
      alternative.id == "PostEphemeralKeys.response.alternative0" -> SdkResponseDecodeResult(
        value = PostEphemeralKeysResponse.SuccessJson(
          json = EphemeralKeysCodecs.postEphemeralKeysResponseCodecAlternative0Registry.select(listOf("PostEphemeralKeys.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostEphemeralKeys.response.alternative1" -> SdkResponseDecodeResult(
        value = PostEphemeralKeysResponse.DefaultJson(
          json = EphemeralKeysCodecs.postEphemeralKeysResponseCodecAlternative1Registry.select(listOf("PostEphemeralKeys.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostEphemeralKeysResponse = PostEphemeralKeysResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val deleteEphemeralKeysKeyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteEphemeralKeysKey",
          method = "DELETE",
          path = "/v1/ephemeral_keys/{key}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "EphemeralKey",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteEphemeralKeysKey.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteEphemeralKeysKey.response.alternative1",
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

    internal val postEphemeralKeysMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostEphemeralKeys",
          method = "POST",
          path = "/v1/ephemeral_keys",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "EphemeralKey",
              mode = SdkResponseMode.BUFFERED,
              id = "PostEphemeralKeys.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostEphemeralKeys.response.alternative1",
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
