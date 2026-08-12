package com.nabobery.sdkgen.generated.stripe.apps

import com.nabobery.sdkgen.generated.stripe.AppsSecret
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1AppsSecretsDeletePostRequestFormX830ea2e0
import com.nabobery.sdkgen.generated.stripe.InlineV1AppsSecretsFindGetParameterXee274290
import com.nabobery.sdkgen.generated.stripe.InlineV1AppsSecretsGetParameterX84fc5e2f
import com.nabobery.sdkgen.generated.stripe.InlineV1AppsSecretsGetResponse200JsonXc007a2c4
import com.nabobery.sdkgen.generated.stripe.InlineV1AppsSecretsPostRequestFormX4943ad1c
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

internal object AppsCodecs {
  internal const val GETAPPSSECRETS_REQUEST_CODEC_ID: String = "GetAppsSecrets.request"

  private val getAppsSecretsRequestCodec: MediaTypeCodec<JsonObject?> = GetAppsSecretsFormCodec

  private val getAppsSecretsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1AppsSecretsGetResponse200JsonXc007a2c4> =
      KotlinxSerializationCodec("GetAppsSecrets.response.alternative0", InlineV1AppsSecretsGetResponse200JsonXc007a2c4.Serializer, SdkJson)

  internal val getAppsSecretsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1AppsSecretsGetResponse200JsonXc007a2c4> =
      MediaTypeCodecRegistry.of(getAppsSecretsResponseCodecAlternative0Codec)

  private val getAppsSecretsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetAppsSecrets.response.alternative1", Error.Serializer, SdkJson)

  internal val getAppsSecretsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getAppsSecretsResponseCodecAlternative1Codec)

  internal val getAppsSecretsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getAppsSecretsRequestCodec)

  internal const val GETAPPSSECRETSFIND_REQUEST_CODEC_ID: String = "GetAppsSecretsFind.request"

  private val getAppsSecretsFindRequestCodec: MediaTypeCodec<JsonObject?> =
      GetAppsSecretsFindFormCodec

  private val getAppsSecretsFindResponseCodecAlternative0Codec: MediaTypeCodec<AppsSecret> =
      KotlinxSerializationCodec("GetAppsSecretsFind.response.alternative0", AppsSecret.Serializer, SdkJson)

  internal val getAppsSecretsFindResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<AppsSecret> =
      MediaTypeCodecRegistry.of(getAppsSecretsFindResponseCodecAlternative0Codec)

  private val getAppsSecretsFindResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetAppsSecretsFind.response.alternative1", Error.Serializer, SdkJson)

  internal val getAppsSecretsFindResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getAppsSecretsFindResponseCodecAlternative1Codec)

  internal val getAppsSecretsFindRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getAppsSecretsFindRequestCodec)

  internal const val POSTAPPSSECRETS_REQUEST_CODEC_ID: String = "PostAppsSecrets.request"

  private val postAppsSecretsRequestCodec:
      MediaTypeCodec<InlineV1AppsSecretsPostRequestFormX4943ad1c> = PostAppsSecretsFormCodec

  private val postAppsSecretsResponseCodecAlternative0Codec: MediaTypeCodec<AppsSecret> =
      KotlinxSerializationCodec("PostAppsSecrets.response.alternative0", AppsSecret.Serializer, SdkJson)

  internal val postAppsSecretsResponseCodecAlternative0Registry: MediaTypeCodecRegistry<AppsSecret>
      = MediaTypeCodecRegistry.of(postAppsSecretsResponseCodecAlternative0Codec)

  private val postAppsSecretsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostAppsSecrets.response.alternative1", Error.Serializer, SdkJson)

  internal val postAppsSecretsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postAppsSecretsResponseCodecAlternative1Codec)

  internal val postAppsSecretsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1AppsSecretsPostRequestFormX4943ad1c> =
      MediaTypeCodecRegistry.of(postAppsSecretsRequestCodec)

  internal const val POSTAPPSSECRETSDELETE_REQUEST_CODEC_ID: String =
      "PostAppsSecretsDelete.request"

  private val postAppsSecretsDeleteRequestCodec:
      MediaTypeCodec<InlineV1AppsSecretsDeletePostRequestFormX830ea2e0> =
      PostAppsSecretsDeleteFormCodec

  private val postAppsSecretsDeleteResponseCodecAlternative0Codec: MediaTypeCodec<AppsSecret> =
      KotlinxSerializationCodec("PostAppsSecretsDelete.response.alternative0", AppsSecret.Serializer, SdkJson)

  internal val postAppsSecretsDeleteResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<AppsSecret> =
      MediaTypeCodecRegistry.of(postAppsSecretsDeleteResponseCodecAlternative0Codec)

  private val postAppsSecretsDeleteResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostAppsSecretsDelete.response.alternative1", Error.Serializer, SdkJson)

  internal val postAppsSecretsDeleteResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(postAppsSecretsDeleteResponseCodecAlternative1Codec)

  internal val postAppsSecretsDeleteRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1AppsSecretsDeletePostRequestFormX830ea2e0> =
      MediaTypeCodecRegistry.of(postAppsSecretsDeleteRequestCodec)

  internal object GetAppsSecretsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetAppsSecrets.request"

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

  internal object GetAppsSecretsFindFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetAppsSecretsFind.request"

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

  internal object PostAppsSecretsFormCodec : MediaTypeCodec<InlineV1AppsSecretsPostRequestFormX4943ad1c> {
    override val id: String = "PostAppsSecrets.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1AppsSecretsPostRequestFormX4943ad1c, mediaType: String): SdkRequestBody {
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
      request.expiresAt?.let { formValue0 ->
        form.add("expires_at", formValue0.toString())
      }
      form.add("name", request.name)
      form.add("payload", request.payload)
      form.add("scope" + "[type]", request.scope.type.value)
      request.scope.user?.let { formValue1 ->
        form.add("scope" + "[user]", formValue1)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1AppsSecretsPostRequestFormX4943ad1c {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostAppsSecretsDeleteFormCodec : MediaTypeCodec<InlineV1AppsSecretsDeletePostRequestFormX830ea2e0> {
    override val id: String = "PostAppsSecretsDelete.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1AppsSecretsDeletePostRequestFormX830ea2e0, mediaType: String): SdkRequestBody {
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
      form.add("name", request.name)
      form.add("scope" + "[type]", request.scope.type.value)
      request.scope.user?.let { formValue1 ->
        form.add("scope" + "[user]", formValue1)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1AppsSecretsDeletePostRequestFormX830ea2e0 {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'apps' group of Stripe API.
 */
public class AppsClient(
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
      SdkExecutor(transport, authentication = this@AppsClient.authentication)

  /**
   * <p>List all secrets stored on the given scope.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param scope Specifies the scoping of the secret. Requests originating from UI extensions can only access
   * account-scoped secrets or secrets scoped to their own user.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getAppsSecretsWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    scope: InlineV1AppsSecretsGetParameterX84fc5e2f,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetAppsSecretsResponse> = executor.executeWithResponse<JsonObject?, GetAppsSecretsResponse>(SdkExecutionRequest(getAppsSecretsMetadata, baseUri, request, listOf(AppsCodecs.GETAPPSSECRETS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "scope[type]", values = scope.type?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "scope[user]", values = scope.user?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), AppsCodecs.getAppsSecretsRequestCodecRegistry, GetAppsSecretsResponseDecoder, options)

  /**
   * <p>Finds a secret in the secret store by name and scope.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param expand Specifies which fields in the response should be expanded.
   * @param name A name for the secret that's unique within the scope.
   * @param scope Specifies the scoping of the secret. Requests originating from UI extensions can only access
   * account-scoped secrets or secrets scoped to their own user.
   * @param options Execution options.
   */
  public suspend fun getAppsSecretsFindWithResponse(
    request: JsonObject? = null,
    expand: List<String>? = null,
    name: String,
    scope: InlineV1AppsSecretsFindGetParameterXee274290,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetAppsSecretsFindResponse> = executor.executeWithResponse<JsonObject?, GetAppsSecretsFindResponse>(SdkExecutionRequest(getAppsSecretsFindMetadata, baseUri, request, listOf(AppsCodecs.GETAPPSSECRETSFIND_REQUEST_CODEC_ID), buildList {
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "scope[type]", values = scope.type?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "scope[user]", values = scope.user?.let { listOf(it.toString()) }.orEmpty()))
  }), AppsCodecs.getAppsSecretsFindRequestCodecRegistry, GetAppsSecretsFindResponseDecoder, options)

  /**
   * <p>Create or replace a secret in the secret store.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postAppsSecretsWithResponse(request: InlineV1AppsSecretsPostRequestFormX4943ad1c, options: CallOptions = CallOptions()): SdkResponseResult<PostAppsSecretsResponse> = executor.executeWithResponse<InlineV1AppsSecretsPostRequestFormX4943ad1c, PostAppsSecretsResponse>(SdkExecutionRequest(postAppsSecretsMetadata, baseUri, request, listOf(AppsCodecs.POSTAPPSSECRETS_REQUEST_CODEC_ID), emptyList()), AppsCodecs.postAppsSecretsRequestCodecRegistry, PostAppsSecretsResponseDecoder, options)

  /**
   * <p>Deletes a secret from the secret store by name and scope.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postAppsSecretsDeleteWithResponse(request: InlineV1AppsSecretsDeletePostRequestFormX830ea2e0, options: CallOptions = CallOptions()): SdkResponseResult<PostAppsSecretsDeleteResponse> = executor.executeWithResponse<InlineV1AppsSecretsDeletePostRequestFormX830ea2e0, PostAppsSecretsDeleteResponse>(SdkExecutionRequest(postAppsSecretsDeleteMetadata, baseUri, request, listOf(AppsCodecs.POSTAPPSSECRETSDELETE_REQUEST_CODEC_ID), emptyList()), AppsCodecs.postAppsSecretsDeleteRequestCodecRegistry, PostAppsSecretsDeleteResponseDecoder, options)

  /**
   * Typed response alternatives for `GetAppsSecrets`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetAppsSecretsResponse {
    public class SuccessJson(
      public val json: InlineV1AppsSecretsGetResponse200JsonXc007a2c4,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAppsSecretsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAppsSecretsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAppsSecretsResponse
  }

  private object GetAppsSecretsResponseDecoder : SdkResponseAlternativeDecoder<GetAppsSecretsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetAppsSecretsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetAppsSecretsResponse> = when {
      alternative.id == "GetAppsSecrets.response.alternative0" -> SdkResponseDecodeResult(
        value = GetAppsSecretsResponse.SuccessJson(
          json = AppsCodecs.getAppsSecretsResponseCodecAlternative0Registry.select(listOf("GetAppsSecrets.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetAppsSecrets.response.alternative1" -> SdkResponseDecodeResult(
        value = GetAppsSecretsResponse.DefaultJson(
          json = AppsCodecs.getAppsSecretsResponseCodecAlternative1Registry.select(listOf("GetAppsSecrets.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetAppsSecretsResponse = GetAppsSecretsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetAppsSecretsFind`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetAppsSecretsFindResponse {
    public class SuccessJson(
      public val json: AppsSecret,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAppsSecretsFindResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAppsSecretsFindResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAppsSecretsFindResponse
  }

  private object GetAppsSecretsFindResponseDecoder : SdkResponseAlternativeDecoder<GetAppsSecretsFindResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetAppsSecretsFindResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetAppsSecretsFindResponse> = when {
      alternative.id == "GetAppsSecretsFind.response.alternative0" -> SdkResponseDecodeResult(
        value = GetAppsSecretsFindResponse.SuccessJson(
          json = AppsCodecs.getAppsSecretsFindResponseCodecAlternative0Registry.select(listOf("GetAppsSecretsFind.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetAppsSecretsFind.response.alternative1" -> SdkResponseDecodeResult(
        value = GetAppsSecretsFindResponse.DefaultJson(
          json = AppsCodecs.getAppsSecretsFindResponseCodecAlternative1Registry.select(listOf("GetAppsSecretsFind.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetAppsSecretsFindResponse = GetAppsSecretsFindResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostAppsSecrets`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostAppsSecretsResponse {
    public class SuccessJson(
      public val json: AppsSecret,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAppsSecretsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAppsSecretsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAppsSecretsResponse
  }

  private object PostAppsSecretsResponseDecoder : SdkResponseAlternativeDecoder<PostAppsSecretsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostAppsSecretsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostAppsSecretsResponse> = when {
      alternative.id == "PostAppsSecrets.response.alternative0" -> SdkResponseDecodeResult(
        value = PostAppsSecretsResponse.SuccessJson(
          json = AppsCodecs.postAppsSecretsResponseCodecAlternative0Registry.select(listOf("PostAppsSecrets.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostAppsSecrets.response.alternative1" -> SdkResponseDecodeResult(
        value = PostAppsSecretsResponse.DefaultJson(
          json = AppsCodecs.postAppsSecretsResponseCodecAlternative1Registry.select(listOf("PostAppsSecrets.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostAppsSecretsResponse = PostAppsSecretsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostAppsSecretsDelete`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostAppsSecretsDeleteResponse {
    public class SuccessJson(
      public val json: AppsSecret,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAppsSecretsDeleteResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAppsSecretsDeleteResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAppsSecretsDeleteResponse
  }

  private object PostAppsSecretsDeleteResponseDecoder : SdkResponseAlternativeDecoder<PostAppsSecretsDeleteResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostAppsSecretsDeleteResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostAppsSecretsDeleteResponse> = when {
      alternative.id == "PostAppsSecretsDelete.response.alternative0" -> SdkResponseDecodeResult(
        value = PostAppsSecretsDeleteResponse.SuccessJson(
          json = AppsCodecs.postAppsSecretsDeleteResponseCodecAlternative0Registry.select(listOf("PostAppsSecretsDelete.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostAppsSecretsDelete.response.alternative1" -> SdkResponseDecodeResult(
        value = PostAppsSecretsDeleteResponse.DefaultJson(
          json = AppsCodecs.postAppsSecretsDeleteResponseCodecAlternative1Registry.select(listOf("PostAppsSecretsDelete.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostAppsSecretsDeleteResponse = PostAppsSecretsDeleteResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getAppsSecretsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetAppsSecrets",
          method = "GET",
          path = "/v1/apps/secrets",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1AppsSecretsGetResponse200JsonXc007a2c4",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAppsSecrets.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAppsSecrets.response.alternative1",
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

    internal val getAppsSecretsFindMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetAppsSecretsFind",
          method = "GET",
          path = "/v1/apps/secrets/find",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "AppsSecret",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAppsSecretsFind.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAppsSecretsFind.response.alternative1",
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

    internal val postAppsSecretsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostAppsSecrets",
          method = "POST",
          path = "/v1/apps/secrets",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "AppsSecret",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAppsSecrets.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAppsSecrets.response.alternative1",
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

    internal val postAppsSecretsDeleteMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostAppsSecretsDelete",
          method = "POST",
          path = "/v1/apps/secrets/delete",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "AppsSecret",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAppsSecretsDelete.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAppsSecretsDelete.response.alternative1",
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
