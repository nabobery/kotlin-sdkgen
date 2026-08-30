package com.nabobery.sdkgen.generated.files

import com.nabobery.sdkgen.generated.ErrorResponse
import com.nabobery.sdkgen.generated.FileBucket
import com.nabobery.sdkgen.generated.FileListResponse
import com.nabobery.sdkgen.generated.FileListResponseSerializer
import com.nabobery.sdkgen.generated.PageShape
import com.nabobery.sdkgen.generated.PageSort
import com.nabobery.sdkgen.generated.SdkJson
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
import com.nabobery.sdkgen.runtime.SdkClientConfig
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkParameterLocation
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
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

internal object FilesCodecs {
  internal const val LISTFILES_RESPONSE_CODEC_ID: String = "listFiles.response"

  private val listFilesResponseCodec: MediaTypeCodec<FileListResponse> =
      KotlinxSerializationCodec(LISTFILES_RESPONSE_CODEC_ID, FileListResponseSerializer, SdkJson)

  private val listFilesResponseCodecAlternative0Codec: MediaTypeCodec<FileListResponse> =
      KotlinxSerializationCodec("listFiles.response.alternative0", FileListResponseSerializer, SdkJson)

  internal val listFilesResponseCodecAlternative0Registry: MediaTypeCodecRegistry<FileListResponse>
      = MediaTypeCodecRegistry.of(listFilesResponseCodecAlternative0Codec)

  private val listFilesResponseCodecAlternative1Codec: MediaTypeCodec<ErrorResponse> =
      KotlinxSerializationCodec("listFiles.response.alternative1", ErrorResponse.Serializer, SdkJson)

  internal val listFilesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<ErrorResponse> =
      MediaTypeCodecRegistry.of(listFilesResponseCodecAlternative1Codec)

  internal val listFilesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listFilesResponseCodecRegistry: MediaTypeCodecRegistry<FileListResponse> =
      MediaTypeCodecRegistry.of(listFilesResponseCodec)
}

/**
 * Client for the 'files' group of Streaming Fixture.
 */
public class FilesClient private constructor(
  transport: SdkTransport,
  private val baseUri: String,
  private val clientConfig: SdkClientConfig,
  credentialProviders: Map<String, CredentialProvider>,
  trustedHosts: TrustedHosts?,
  authentication: SdkAuthentication?,
  marker: Unit,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "apiKey" to SecurityScheme.ApiKey(location = SecurityScheme.ApiKeyLocation.HEADER, parameterName = "Authorization"),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor = SdkExecutor(
        transport,
        authentication = this@FilesClient.authentication,
        requestHook = clientConfig.requestHook,
        retryBudget = clientConfig.retryBudget,
        logicalMiddleware = clientConfig.logicalMiddleware,
        attemptMiddleware = clientConfig.attemptMiddleware,
        observers = clientConfig.observers,
        productToken = clientConfig.productToken ?: SdkExecutor.DEFAULT_PRODUCT_TOKEN,
      )

  public constructor(
    transport: SdkTransport,
    baseUri: String,
    credentialProviders: Map<String, CredentialProvider> = emptyMap(),
    trustedHosts: TrustedHosts? = null,
    authentication: SdkAuthentication? = null,
  ) : this(transport, baseUri, SdkClientConfig(), credentialProviders, trustedHosts, authentication, Unit)

  public constructor(
    transport: SdkTransport,
    baseUri: String,
    clientConfig: SdkClientConfig,
    credentialProviders: Map<String, CredentialProvider> = emptyMap(),
    trustedHosts: TrustedHosts? = null,
    authentication: SdkAuthentication? = null,
  ) : this(transport, baseUri, clientConfig, credentialProviders, trustedHosts, authentication, Unit)

  /**
   * Lists files in the negotiated page shape.
   *
   * @param bucket Wire parameter `bucket`.
   * @param shape Wire parameter `shape`.
   * @param sort Wire parameter `sort`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ListFilesApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded ListFilesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listFiles(
    bucket: FileBucket,
    shape: PageShape? = null,
    sort: List<PageSort>? = null,
    options: CallOptions = CallOptions(),
  ): FileListResponse = executor.executeWithTypedErrors<Unit, ListFilesResponse, FileListResponse>(
    request = SdkExecutionRequest(listFilesMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "bucket", values = listOf(bucket.value)))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "shape", values = shape?.let { listOf(it.value) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.joinToString(",") { item -> item.value }) }.orEmpty()))
    }),
    requestCodecs = FilesCodecs.listFilesRequestCodecRegistry,
    responseDecoder = ListFilesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ListFilesResponse.SuccessJson -> response.json
        is ListFilesResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ListFilesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ListFilesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ListFilesResponse.Http401Json -> ListFilesApiException(response, statusCode, headers)
        is ListFilesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = clientConfig.resolveCallOptions(options),
  )

  /**
   * Lists files in the negotiated page shape.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param bucket Wire parameter `bucket`.
   * @param shape Wire parameter `shape`.
   * @param sort Wire parameter `sort`.
   * @param options Execution options.
   */
  public suspend fun listFilesWithResponse(
    bucket: FileBucket,
    shape: PageShape? = null,
    sort: List<PageSort>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListFilesResponse> = executor.executeWithResponse<Unit, ListFilesResponse>(SdkExecutionRequest(listFilesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "bucket", values = listOf(bucket.value)))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "shape", values = shape?.let { listOf(it.value) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.joinToString(",") { item -> item.value }) }.orEmpty()))
  }), FilesCodecs.listFilesRequestCodecRegistry, ListFilesResponseDecoder, clientConfig.resolveCallOptions(options))

  /**
   * Decoded non-success response alternatives that `listFiles` may expose through its typed API exception.
   */
  public sealed interface ListFilesError

  /**
   * Typed response alternatives for `listFiles`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListFilesResponse {
    public class SuccessJson(
      public val json: FileListResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListFilesResponse

    public class Http401Json(
      public val json: ErrorResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListFilesResponse,
        ListFilesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListFilesResponse
  }

  /**
   * Raised by `listFiles` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class ListFilesApiException(
    public val error: ListFilesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listFiles")

  private object ListFilesResponseDecoder : SdkResponseAlternativeDecoder<ListFilesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListFilesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListFilesResponse> = when {
      alternative.id == "listFiles.response.alternative0" -> SdkResponseDecodeResult(
        value = ListFilesResponse.SuccessJson(
          json = FilesCodecs.listFilesResponseCodecAlternative0Registry.select(listOf("listFiles.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listFiles.response.alternative1" -> SdkResponseDecodeResult(
        value = ListFilesResponse.Http401Json(
          json = FilesCodecs.listFilesResponseCodecAlternative1Registry.select(listOf("listFiles.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListFilesResponse = ListFilesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val listFilesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listFiles",
          method = "GET",
          path = "/files/{bucket}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FileListResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listFiles.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "ErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listFiles.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "apiKey", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 3,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }
  }
}
