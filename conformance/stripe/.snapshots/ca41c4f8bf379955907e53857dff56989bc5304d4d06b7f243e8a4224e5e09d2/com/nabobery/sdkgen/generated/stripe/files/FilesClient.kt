package com.nabobery.sdkgen.generated.stripe.files

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.File
import com.nabobery.sdkgen.generated.stripe.InlineV1FilesGetParameterX66bae549
import com.nabobery.sdkgen.generated.stripe.InlineV1FilesGetParameterX84eedc8d
import com.nabobery.sdkgen.generated.stripe.InlineV1FilesGetResponse200JsonX77e9a67a
import com.nabobery.sdkgen.generated.stripe.InlineV1FilesPostRequestMultipartXeb3cb5d1
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
import com.nabobery.sdkgen.runtime.bodies.MultipartBody
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object FilesCodecs {
  internal const val GETFILES_REQUEST_CODEC_ID: String = "GetFiles.request"

  private val getFilesRequestCodec: MediaTypeCodec<JsonObject?> = GetFilesFormCodec

  private val getFilesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1FilesGetResponse200JsonX77e9a67a> =
      KotlinxSerializationCodec("GetFiles.response.alternative0", InlineV1FilesGetResponse200JsonX77e9a67a.Serializer, SdkJson)

  internal val getFilesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1FilesGetResponse200JsonX77e9a67a> =
      MediaTypeCodecRegistry.of(getFilesResponseCodecAlternative0Codec)

  private val getFilesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetFiles.response.alternative1", Error.Serializer, SdkJson)

  internal val getFilesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getFilesResponseCodecAlternative1Codec)

  internal val getFilesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getFilesRequestCodec)

  internal const val GETFILESFILE_REQUEST_CODEC_ID: String = "GetFilesFile.request"

  private val getFilesFileRequestCodec: MediaTypeCodec<JsonObject?> = GetFilesFileFormCodec

  private val getFilesFileResponseCodecAlternative0Codec: MediaTypeCodec<File> =
      KotlinxSerializationCodec("GetFilesFile.response.alternative0", File.Serializer, SdkJson)

  internal val getFilesFileResponseCodecAlternative0Registry: MediaTypeCodecRegistry<File> =
      MediaTypeCodecRegistry.of(getFilesFileResponseCodecAlternative0Codec)

  private val getFilesFileResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetFilesFile.response.alternative1", Error.Serializer, SdkJson)

  internal val getFilesFileResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getFilesFileResponseCodecAlternative1Codec)

  internal val getFilesFileRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getFilesFileRequestCodec)

  internal const val POSTFILES_REQUEST_CODEC_ID: String = "PostFiles.request"

  private val postFilesRequestCodec: MediaTypeCodec<InlineV1FilesPostRequestMultipartXeb3cb5d1> =
      PostFilesMultipartCodec

  private val postFilesResponseCodecAlternative0Codec: MediaTypeCodec<File> =
      KotlinxSerializationCodec("PostFiles.response.alternative0", File.Serializer, SdkJson)

  internal val postFilesResponseCodecAlternative0Registry: MediaTypeCodecRegistry<File> =
      MediaTypeCodecRegistry.of(postFilesResponseCodecAlternative0Codec)

  private val postFilesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostFiles.response.alternative1", Error.Serializer, SdkJson)

  internal val postFilesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postFilesResponseCodecAlternative1Codec)

  internal val postFilesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1FilesPostRequestMultipartXeb3cb5d1> =
      MediaTypeCodecRegistry.of(postFilesRequestCodec)

  internal object GetFilesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetFiles.request"

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

  internal object GetFilesFileFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetFilesFile.request"

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

  internal object PostFilesMultipartCodec : MediaTypeCodec<InlineV1FilesPostRequestMultipartXeb3cb5d1> {
    override val id: String = "PostFiles.request"

    override val mediaTypes: Set<String> = setOf("multipart/form-data")

    override suspend fun encode(`value`: InlineV1FilesPostRequestMultipartXeb3cb5d1, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val multipart = MultipartBody()
      request.expand?.let {
        if (it.isEmpty()) {
          multipart.text(name = "expand", value = "", mediaType = "text/plain", headers = listOf())
        } else {
          it.forEachIndexed { index, element ->
            multipart.text(name = "expand" + "[" + index + "]", value = element, mediaType = "text/plain", headers = listOf())
          }
        }
      }
      multipart.binary(name = "file", stream = request.file, mediaType = "application/octet-stream", headers = listOf())
      request.fileLinkData?.let {
        multipart.bytes(name = "file_link_data", value = SdkJson.encodeToString(it).encodeToByteArray(), mediaType = "application/json", headers = listOf())
      }
      multipart.bytes(name = "purpose", value = SdkJson.encodeToString(request.purpose).encodeToByteArray(), mediaType = "text/plain", headers = listOf())
      return multipart.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1FilesPostRequestMultipartXeb3cb5d1 {
      error("Multipart request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'files' group of Stripe API.
 */
public class FilesClient(
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
      SdkExecutor(transport, authentication = this@FilesClient.authentication)

  /**
   * <p>Returns a list of the files that your account has access to. Stripe sorts and returns the files by their
   * creation dates, placing the most recently created files at the top.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return files that were created during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param purpose Filter queries by the file purpose. If you don't provide a purpose, the queries return unfiltered
   * files.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getFilesWithResponse(
    request: JsonObject? = null,
    created: InlineV1FilesGetParameterX84eedc8d? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    purpose: InlineV1FilesGetParameterX66bae549? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetFilesResponse> = executor.executeWithResponse<JsonObject?, GetFilesResponse>(SdkExecutionRequest(getFilesMetadata, baseUri, request, listOf(FilesCodecs.GETFILES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "purpose", values = purpose?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), FilesCodecs.getFilesRequestCodecRegistry, GetFilesResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing file object. After you supply a unique file ID, Stripe returns the
   * corresponding file object. Learn how to <a href="/docs/file-upload#download-file-contents">access file
   * contents</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param file Wire parameter `file`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getFilesFileWithResponse(
    request: JsonObject? = null,
    `file`: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetFilesFileResponse> = executor.executeWithResponse<JsonObject?, GetFilesFileResponse>(SdkExecutionRequest(getFilesFileMetadata, baseUri, request, listOf(FilesCodecs.GETFILESFILE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "file", values = listOf(file.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), FilesCodecs.getFilesFileRequestCodecRegistry, GetFilesFileResponseDecoder, options)

  /**
   * <p>To upload a file to Stripe, you need to send a request of type <code>multipart/form-data</code>. Include the
   * file you want to upload in the request, and the parameters for creating a file.</p>
   *
   * <p>All of Stripe’s officially supported Client libraries support sending <code>multipart/form-data</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postFilesWithResponse(request: InlineV1FilesPostRequestMultipartXeb3cb5d1, options: CallOptions = CallOptions()): SdkResponseResult<PostFilesResponse> = executor.executeWithResponse<InlineV1FilesPostRequestMultipartXeb3cb5d1, PostFilesResponse>(SdkExecutionRequest(postFilesMetadata, baseUri, request, listOf(FilesCodecs.POSTFILES_REQUEST_CODEC_ID), emptyList()), FilesCodecs.postFilesRequestCodecRegistry, PostFilesResponseDecoder, options)

  /**
   * Typed response alternatives for `GetFiles`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetFilesResponse {
    public class SuccessJson(
      public val json: InlineV1FilesGetResponse200JsonX77e9a67a,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFilesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFilesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFilesResponse
  }

  private object GetFilesResponseDecoder : SdkResponseAlternativeDecoder<GetFilesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetFilesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetFilesResponse> = when {
      alternative.id == "GetFiles.response.alternative0" -> SdkResponseDecodeResult(
        value = GetFilesResponse.SuccessJson(
          json = FilesCodecs.getFilesResponseCodecAlternative0Registry.select(listOf("GetFiles.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetFiles.response.alternative1" -> SdkResponseDecodeResult(
        value = GetFilesResponse.DefaultJson(
          json = FilesCodecs.getFilesResponseCodecAlternative1Registry.select(listOf("GetFiles.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetFilesResponse = GetFilesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetFilesFile`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetFilesFileResponse {
    public class SuccessJson(
      public val json: File,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFilesFileResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFilesFileResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFilesFileResponse
  }

  private object GetFilesFileResponseDecoder : SdkResponseAlternativeDecoder<GetFilesFileResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetFilesFileResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetFilesFileResponse> = when {
      alternative.id == "GetFilesFile.response.alternative0" -> SdkResponseDecodeResult(
        value = GetFilesFileResponse.SuccessJson(
          json = FilesCodecs.getFilesFileResponseCodecAlternative0Registry.select(listOf("GetFilesFile.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetFilesFile.response.alternative1" -> SdkResponseDecodeResult(
        value = GetFilesFileResponse.DefaultJson(
          json = FilesCodecs.getFilesFileResponseCodecAlternative1Registry.select(listOf("GetFilesFile.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetFilesFileResponse = GetFilesFileResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostFiles`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostFilesResponse {
    public class SuccessJson(
      public val json: File,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFilesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFilesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFilesResponse
  }

  private object PostFilesResponseDecoder : SdkResponseAlternativeDecoder<PostFilesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostFilesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostFilesResponse> = when {
      alternative.id == "PostFiles.response.alternative0" -> SdkResponseDecodeResult(
        value = PostFilesResponse.SuccessJson(
          json = FilesCodecs.postFilesResponseCodecAlternative0Registry.select(listOf("PostFiles.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostFiles.response.alternative1" -> SdkResponseDecodeResult(
        value = PostFilesResponse.DefaultJson(
          json = FilesCodecs.postFilesResponseCodecAlternative1Registry.select(listOf("PostFiles.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostFilesResponse = PostFilesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getFilesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetFiles",
          method = "GET",
          path = "/v1/files",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1FilesGetResponse200JsonX77e9a67a",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFiles.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFiles.response.alternative1",
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

    internal val getFilesFileMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetFilesFile",
          method = "GET",
          path = "/v1/files/{file}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "File",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFilesFile.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFilesFile.response.alternative1",
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

    internal val postFilesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostFiles",
          method = "POST",
          path = "/v1/files",
          requestMediaTypes = listOf("multipart/form-data"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "File",
              mode = SdkResponseMode.BUFFERED,
              id = "PostFiles.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostFiles.response.alternative1",
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
