package io.github.nabobery.sdkgen.generated.stripe.filelinks

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
import io.github.nabobery.sdkgen.generated.stripe.FileLink
import io.github.nabobery.sdkgen.generated.stripe.InlineV1FileLinksGetParameterX2ba015a8
import io.github.nabobery.sdkgen.generated.stripe.InlineV1FileLinksGetResponse200JsonXb271080c
import io.github.nabobery.sdkgen.generated.stripe.InlineV1FileLinksPostRequestFormXc54383d7
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object FileLinksCodecs {
  internal const val GETFILELINKS_REQUEST_CODEC_ID: String = "GetFileLinks.request"

  private val getFileLinksRequestCodec: MediaTypeCodec<JsonObject?> = GetFileLinksFormCodec

  private val getFileLinksResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1FileLinksGetResponse200JsonXb271080c> =
      KotlinxSerializationCodec("GetFileLinks.response.alternative0", InlineV1FileLinksGetResponse200JsonXb271080c.Serializer, SdkJson)

  internal val getFileLinksResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1FileLinksGetResponse200JsonXb271080c> =
      MediaTypeCodecRegistry.of(getFileLinksResponseCodecAlternative0Codec)

  private val getFileLinksResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetFileLinks.response.alternative1", Error.Serializer, SdkJson)

  internal val getFileLinksResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getFileLinksResponseCodecAlternative1Codec)

  internal val getFileLinksRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getFileLinksRequestCodec)

  internal const val GETFILELINKSLINK_REQUEST_CODEC_ID: String = "GetFileLinksLink.request"

  private val getFileLinksLinkRequestCodec: MediaTypeCodec<JsonObject?> = GetFileLinksLinkFormCodec

  private val getFileLinksLinkResponseCodecAlternative0Codec: MediaTypeCodec<FileLink> =
      KotlinxSerializationCodec("GetFileLinksLink.response.alternative0", FileLink.Serializer, SdkJson)

  internal val getFileLinksLinkResponseCodecAlternative0Registry: MediaTypeCodecRegistry<FileLink> =
      MediaTypeCodecRegistry.of(getFileLinksLinkResponseCodecAlternative0Codec)

  private val getFileLinksLinkResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetFileLinksLink.response.alternative1", Error.Serializer, SdkJson)

  internal val getFileLinksLinkResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getFileLinksLinkResponseCodecAlternative1Codec)

  internal val getFileLinksLinkRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getFileLinksLinkRequestCodec)

  internal const val POSTFILELINKS_REQUEST_CODEC_ID: String = "PostFileLinks.request"

  private val postFileLinksRequestCodec: MediaTypeCodec<InlineV1FileLinksPostRequestFormXc54383d7> =
      PostFileLinksFormCodec

  private val postFileLinksResponseCodecAlternative0Codec: MediaTypeCodec<FileLink> =
      KotlinxSerializationCodec("PostFileLinks.response.alternative0", FileLink.Serializer, SdkJson)

  internal val postFileLinksResponseCodecAlternative0Registry: MediaTypeCodecRegistry<FileLink> =
      MediaTypeCodecRegistry.of(postFileLinksResponseCodecAlternative0Codec)

  private val postFileLinksResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostFileLinks.response.alternative1", Error.Serializer, SdkJson)

  internal val postFileLinksResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postFileLinksResponseCodecAlternative1Codec)

  internal val postFileLinksRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1FileLinksPostRequestFormXc54383d7> =
      MediaTypeCodecRegistry.of(postFileLinksRequestCodec)

  internal object GetFileLinksFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetFileLinks.request"

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

  internal object GetFileLinksLinkFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetFileLinksLink.request"

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

  internal object PostFileLinksFormCodec : MediaTypeCodec<InlineV1FileLinksPostRequestFormXc54383d7> {
    override val id: String = "PostFileLinks.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1FileLinksPostRequestFormXc54383d7, mediaType: String): SdkRequestBody {
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
      form.add("file", request.file)
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1FileLinksPostRequestFormXc54383d7 {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'file_links' group of Stripe API.
 */
public class FileLinksClient(
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
      SdkExecutor(transport, authentication = this@FileLinksClient.authentication)

  /**
   * <p>Returns a list of file links.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return links that were created during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param expired Filter links by their expiration status. By default, Stripe returns all links.
   * @param file Only return links for the given file.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getFileLinksWithResponse(
    request: JsonObject? = null,
    created: InlineV1FileLinksGetParameterX2ba015a8? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    expired: Boolean? = null,
    `file`: String? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetFileLinksResponse> = executor.executeWithResponse<JsonObject?, GetFileLinksResponse>(SdkExecutionRequest(getFileLinksMetadata, baseUri, request, listOf(FileLinksCodecs.GETFILELINKS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expired", values = expired?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "file", values = file?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), FileLinksCodecs.getFileLinksRequestCodecRegistry, GetFileLinksResponseDecoder, options)

  /**
   * <p>Retrieves the file link with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param link Wire parameter `link`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getFileLinksLinkWithResponse(
    request: JsonObject? = null,
    link: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetFileLinksLinkResponse> = executor.executeWithResponse<JsonObject?, GetFileLinksLinkResponse>(SdkExecutionRequest(getFileLinksLinkMetadata, baseUri, request, listOf(FileLinksCodecs.GETFILELINKSLINK_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "link", values = listOf(link.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), FileLinksCodecs.getFileLinksLinkRequestCodecRegistry, GetFileLinksLinkResponseDecoder, options)

  /**
   * <p>Creates a new file link object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postFileLinksWithResponse(request: InlineV1FileLinksPostRequestFormXc54383d7, options: CallOptions = CallOptions()): SdkResponseResult<PostFileLinksResponse> = executor.executeWithResponse<InlineV1FileLinksPostRequestFormXc54383d7, PostFileLinksResponse>(SdkExecutionRequest(postFileLinksMetadata, baseUri, request, listOf(FileLinksCodecs.POSTFILELINKS_REQUEST_CODEC_ID), emptyList()), FileLinksCodecs.postFileLinksRequestCodecRegistry, PostFileLinksResponseDecoder, options)

  /**
   * Typed response alternatives for `GetFileLinks`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetFileLinksResponse {
    public class SuccessJson(
      public val json: InlineV1FileLinksGetResponse200JsonXb271080c,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileLinksResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileLinksResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileLinksResponse
  }

  private object GetFileLinksResponseDecoder : SdkResponseAlternativeDecoder<GetFileLinksResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetFileLinksResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetFileLinksResponse> = when {
      alternative.id == "GetFileLinks.response.alternative0" -> SdkResponseDecodeResult(
        value = GetFileLinksResponse.SuccessJson(
          json = FileLinksCodecs.getFileLinksResponseCodecAlternative0Registry.select(listOf("GetFileLinks.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetFileLinks.response.alternative1" -> SdkResponseDecodeResult(
        value = GetFileLinksResponse.DefaultJson(
          json = FileLinksCodecs.getFileLinksResponseCodecAlternative1Registry.select(listOf("GetFileLinks.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetFileLinksResponse = GetFileLinksResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetFileLinksLink`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetFileLinksLinkResponse {
    public class SuccessJson(
      public val json: FileLink,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileLinksLinkResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileLinksLinkResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileLinksLinkResponse
  }

  private object GetFileLinksLinkResponseDecoder : SdkResponseAlternativeDecoder<GetFileLinksLinkResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetFileLinksLinkResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetFileLinksLinkResponse> = when {
      alternative.id == "GetFileLinksLink.response.alternative0" -> SdkResponseDecodeResult(
        value = GetFileLinksLinkResponse.SuccessJson(
          json = FileLinksCodecs.getFileLinksLinkResponseCodecAlternative0Registry.select(listOf("GetFileLinksLink.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetFileLinksLink.response.alternative1" -> SdkResponseDecodeResult(
        value = GetFileLinksLinkResponse.DefaultJson(
          json = FileLinksCodecs.getFileLinksLinkResponseCodecAlternative1Registry.select(listOf("GetFileLinksLink.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetFileLinksLinkResponse = GetFileLinksLinkResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostFileLinks`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostFileLinksResponse {
    public class SuccessJson(
      public val json: FileLink,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFileLinksResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFileLinksResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFileLinksResponse
  }

  private object PostFileLinksResponseDecoder : SdkResponseAlternativeDecoder<PostFileLinksResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostFileLinksResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostFileLinksResponse> = when {
      alternative.id == "PostFileLinks.response.alternative0" -> SdkResponseDecodeResult(
        value = PostFileLinksResponse.SuccessJson(
          json = FileLinksCodecs.postFileLinksResponseCodecAlternative0Registry.select(listOf("PostFileLinks.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostFileLinks.response.alternative1" -> SdkResponseDecodeResult(
        value = PostFileLinksResponse.DefaultJson(
          json = FileLinksCodecs.postFileLinksResponseCodecAlternative1Registry.select(listOf("PostFileLinks.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostFileLinksResponse = PostFileLinksResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getFileLinksMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetFileLinks",
          method = "GET",
          path = "/v1/file_links",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1FileLinksGetResponse200JsonXb271080c",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFileLinks.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFileLinks.response.alternative1",
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

    internal val getFileLinksLinkMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetFileLinksLink",
          method = "GET",
          path = "/v1/file_links/{link}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FileLink",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFileLinksLink.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFileLinksLink.response.alternative1",
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

    internal val postFileLinksMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostFileLinks",
          method = "POST",
          path = "/v1/file_links",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FileLink",
              mode = SdkResponseMode.BUFFERED,
              id = "PostFileLinks.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostFileLinks.response.alternative1",
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
