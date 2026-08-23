package com.nabobery.sdkgen.generated.files

import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.FileDeleteResponse
import com.nabobery.sdkgen.generated.FileListResponse
import com.nabobery.sdkgen.generated.FileMetadata
import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.InlineFilesPostRequestMultipartX7e99eef0
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.NotFoundResponse
import com.nabobery.sdkgen.generated.PayloadTooLargeResponse
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.generated.TooManyRequestsResponse
import com.nabobery.sdkgen.generated.UnauthorizedResponse
import com.nabobery.sdkgen.runtime.BackoffHints
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.KotlinxSerializationCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.PaginationDescriptor
import com.nabobery.sdkgen.runtime.PropertyPath
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
import com.nabobery.sdkgen.runtime.bodies.MultipartBody
import com.nabobery.sdkgen.runtime.pagination.Page
import com.nabobery.sdkgen.runtime.pagination.PageEnvelope
import com.nabobery.sdkgen.runtime.pagination.PageRequest
import com.nabobery.sdkgen.runtime.pagination.PaginationEngine
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.coroutines.flow.Flow

internal object FilesCodecs {
  internal const val DELETEFILE_RESPONSE_CODEC_ID: String = "deleteFile.response"

  private val deleteFileResponseCodec: MediaTypeCodec<FileDeleteResponse> =
      KotlinxSerializationCodec(DELETEFILE_RESPONSE_CODEC_ID, FileDeleteResponse.Serializer, SdkJson)

  private val deleteFileResponseCodecAlternative0Codec: MediaTypeCodec<FileDeleteResponse> =
      KotlinxSerializationCodec("deleteFile.response.alternative0", FileDeleteResponse.Serializer, SdkJson)

  internal val deleteFileResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FileDeleteResponse> =
      MediaTypeCodecRegistry.of(deleteFileResponseCodecAlternative0Codec)

  private val deleteFileResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("deleteFile.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val deleteFileResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(deleteFileResponseCodecAlternative1Codec)

  private val deleteFileResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("deleteFile.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val deleteFileResponseCodecAlternative2Registry: MediaTypeCodecRegistry<NotFoundResponse>
      = MediaTypeCodecRegistry.of(deleteFileResponseCodecAlternative2Codec)

  private val deleteFileResponseCodecAlternative3Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("deleteFile.response.alternative3", TooManyRequestsResponse.Serializer, SdkJson)

  internal val deleteFileResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(deleteFileResponseCodecAlternative3Codec)

  private val deleteFileResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("deleteFile.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val deleteFileResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(deleteFileResponseCodecAlternative4Codec)

  internal val deleteFileRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val deleteFileResponseCodecRegistry: MediaTypeCodecRegistry<FileDeleteResponse> =
      MediaTypeCodecRegistry.of(deleteFileResponseCodec)

  private val downloadFileContentResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse>
      =
      KotlinxSerializationCodec("downloadFileContent.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val downloadFileContentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(downloadFileContentResponseCodecAlternative1Codec)

  private val downloadFileContentResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("downloadFileContent.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val downloadFileContentResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(downloadFileContentResponseCodecAlternative2Codec)

  private val downloadFileContentResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("downloadFileContent.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val downloadFileContentResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(downloadFileContentResponseCodecAlternative3Codec)

  private val downloadFileContentResponseCodecAlternative4Codec:
      MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("downloadFileContent.response.alternative4", TooManyRequestsResponse.Serializer, SdkJson)

  internal val downloadFileContentResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(downloadFileContentResponseCodecAlternative4Codec)

  private val downloadFileContentResponseCodecAlternative5Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("downloadFileContent.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  internal val downloadFileContentResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(downloadFileContentResponseCodecAlternative5Codec)

  internal val downloadFileContentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val downloadFileContentResponseCodecRegistry: MediaTypeCodecRegistry<SdkByteStream> =
      MediaTypeCodecRegistry.of()

  internal const val GETFILEMETADATA_RESPONSE_CODEC_ID: String = "getFileMetadata.response"

  private val getFileMetadataResponseCodec: MediaTypeCodec<FileMetadata> =
      KotlinxSerializationCodec(GETFILEMETADATA_RESPONSE_CODEC_ID, FileMetadata.Serializer, SdkJson)

  private val getFileMetadataResponseCodecAlternative0Codec: MediaTypeCodec<FileMetadata> =
      KotlinxSerializationCodec("getFileMetadata.response.alternative0", FileMetadata.Serializer, SdkJson)

  internal val getFileMetadataResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FileMetadata> =
      MediaTypeCodecRegistry.of(getFileMetadataResponseCodecAlternative0Codec)

  private val getFileMetadataResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getFileMetadata.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val getFileMetadataResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getFileMetadataResponseCodecAlternative1Codec)

  private val getFileMetadataResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getFileMetadata.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val getFileMetadataResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getFileMetadataResponseCodecAlternative2Codec)

  private val getFileMetadataResponseCodecAlternative3Codec: MediaTypeCodec<TooManyRequestsResponse>
      =
      KotlinxSerializationCodec("getFileMetadata.response.alternative3", TooManyRequestsResponse.Serializer, SdkJson)

  internal val getFileMetadataResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(getFileMetadataResponseCodecAlternative3Codec)

  private val getFileMetadataResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("getFileMetadata.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val getFileMetadataResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getFileMetadataResponseCodecAlternative4Codec)

  internal val getFileMetadataRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val getFileMetadataResponseCodecRegistry: MediaTypeCodecRegistry<FileMetadata> =
      MediaTypeCodecRegistry.of(getFileMetadataResponseCodec)

  internal const val LISTFILES_RESPONSE_CODEC_ID: String = "listFiles.response"

  private val listFilesResponseCodec: MediaTypeCodec<FileListResponse> =
      KotlinxSerializationCodec(LISTFILES_RESPONSE_CODEC_ID, FileListResponse.Serializer, SdkJson)

  private val listFilesResponseCodecAlternative0Codec: MediaTypeCodec<FileListResponse> =
      KotlinxSerializationCodec("listFiles.response.alternative0", FileListResponse.Serializer, SdkJson)

  internal val listFilesResponseCodecAlternative0Registry: MediaTypeCodecRegistry<FileListResponse>
      = MediaTypeCodecRegistry.of(listFilesResponseCodecAlternative0Codec)

  private val listFilesResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("listFiles.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val listFilesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(listFilesResponseCodecAlternative1Codec)

  private val listFilesResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listFiles.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val listFilesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listFilesResponseCodecAlternative2Codec)

  private val listFilesResponseCodecAlternative3Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("listFiles.response.alternative3", TooManyRequestsResponse.Serializer, SdkJson)

  internal val listFilesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(listFilesResponseCodecAlternative3Codec)

  private val listFilesResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listFiles.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val listFilesResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listFilesResponseCodecAlternative4Codec)

  internal val listFilesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listFilesResponseCodecRegistry: MediaTypeCodecRegistry<FileListResponse> =
      MediaTypeCodecRegistry.of(listFilesResponseCodec)

  internal const val UPLOADFILE_REQUEST_CODEC_ID: String = "uploadFile.request"

  private val uploadFileRequestCodec: MediaTypeCodec<InlineFilesPostRequestMultipartX7e99eef0> =
      UploadFileMultipartCodec

  internal const val UPLOADFILE_RESPONSE_CODEC_ID: String = "uploadFile.response"

  private val uploadFileResponseCodec: MediaTypeCodec<FileMetadata> =
      KotlinxSerializationCodec(UPLOADFILE_RESPONSE_CODEC_ID, FileMetadata.Serializer, SdkJson)

  private val uploadFileResponseCodecAlternative0Codec: MediaTypeCodec<FileMetadata> =
      KotlinxSerializationCodec("uploadFile.response.alternative0", FileMetadata.Serializer, SdkJson)

  internal val uploadFileResponseCodecAlternative0Registry: MediaTypeCodecRegistry<FileMetadata> =
      MediaTypeCodecRegistry.of(uploadFileResponseCodecAlternative0Codec)

  private val uploadFileResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("uploadFile.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val uploadFileResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(uploadFileResponseCodecAlternative1Codec)

  private val uploadFileResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("uploadFile.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val uploadFileResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(uploadFileResponseCodecAlternative2Codec)

  private val uploadFileResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("uploadFile.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val uploadFileResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(uploadFileResponseCodecAlternative3Codec)

  private val uploadFileResponseCodecAlternative4Codec: MediaTypeCodec<PayloadTooLargeResponse> =
      KotlinxSerializationCodec("uploadFile.response.alternative4", PayloadTooLargeResponse.Serializer, SdkJson)

  internal val uploadFileResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<PayloadTooLargeResponse> =
      MediaTypeCodecRegistry.of(uploadFileResponseCodecAlternative4Codec)

  private val uploadFileResponseCodecAlternative5Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("uploadFile.response.alternative5", TooManyRequestsResponse.Serializer, SdkJson)

  internal val uploadFileResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(uploadFileResponseCodecAlternative5Codec)

  private val uploadFileResponseCodecAlternative6Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("uploadFile.response.alternative6", InternalServerResponse.Serializer, SdkJson)

  internal val uploadFileResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(uploadFileResponseCodecAlternative6Codec)

  internal val uploadFileRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineFilesPostRequestMultipartX7e99eef0> =
      MediaTypeCodecRegistry.of(uploadFileRequestCodec)

  internal val uploadFileResponseCodecRegistry: MediaTypeCodecRegistry<FileMetadata> =
      MediaTypeCodecRegistry.of(uploadFileResponseCodec)

  internal object UploadFileMultipartCodec : MediaTypeCodec<InlineFilesPostRequestMultipartX7e99eef0> {
    override val id: String = "uploadFile.request"

    override val mediaTypes: Set<String> = setOf("multipart/form-data")

    override suspend fun encode(`value`: InlineFilesPostRequestMultipartX7e99eef0, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val multipart = MultipartBody()
      multipart.binary(name = "file", stream = request.file, mediaType = "application/octet-stream", headers = listOf())
      return multipart.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineFilesPostRequestMultipartX7e99eef0 {
      error("Multipart request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'Files' group of OpenRouter API.
 */
public class FilesClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "apiKey" to SecurityScheme.HttpBearer(),
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
   * Deletes a file owned by the requesting workspace. Deletion is irreversible.
   *
   * @param fileId Wire parameter `file_id`.
   * @param workspaceId Workspace to scope the request to. Defaults to the caller’s default workspace.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws DeleteFileApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded DeleteFileError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun deleteFile(
    fileId: String,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): FileDeleteResponse = executor.executeWithTypedErrors<Unit, DeleteFileResponse, FileDeleteResponse>(
    request = SdkExecutionRequest(deleteFileMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "file_id", values = listOf(fileId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = FilesCodecs.deleteFileRequestCodecRegistry,
    responseDecoder = DeleteFileResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DeleteFileResponse.SuccessJson -> response.json
        is DeleteFileResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteFileResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteFileResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteFileResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteFileResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DeleteFileResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DeleteFileResponse.Http401Json -> DeleteFileApiException(response, statusCode, headers)
        is DeleteFileResponse.Http404Json -> DeleteFileApiException(response, statusCode, headers)
        is DeleteFileResponse.Http429Json -> DeleteFileApiException(response, statusCode, headers)
        is DeleteFileResponse.Http500Json -> DeleteFileApiException(response, statusCode, headers)
        is DeleteFileResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a file owned by the requesting workspace. Deletion is irreversible.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param fileId Wire parameter `file_id`.
   * @param workspaceId Workspace to scope the request to. Defaults to the caller’s default workspace.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   */
  public suspend fun deleteFileWithResponse(
    fileId: String,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteFileResponse> = executor.executeWithResponse<Unit, DeleteFileResponse>(SdkExecutionRequest(deleteFileMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "file_id", values = listOf(fileId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), FilesCodecs.deleteFileRequestCodecRegistry, DeleteFileResponseDecoder, options)

  /**
   * Downloads the raw bytes of a file. Only files created server-side are downloadable; uploaded files return 400.
   *
   * @param fileId Wire parameter `file_id`.
   * @param workspaceId Workspace to scope the request to. Defaults to the caller’s default workspace.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   * @return Response body stream.
   * @throws DownloadFileContentApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded DownloadFileContentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun downloadFileContent(
    fileId: String,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkByteStream = executor.executeWithTypedErrors<Unit, DownloadFileContentResponse, SdkByteStream>(
    request = SdkExecutionRequest(downloadFileContentMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "file_id", values = listOf(fileId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = FilesCodecs.downloadFileContentRequestCodecRegistry,
    responseDecoder = DownloadFileContentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DownloadFileContentResponse.SuccessOctetStream -> response.bytes
        is DownloadFileContentResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is DownloadFileContentResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is DownloadFileContentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DownloadFileContentResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is DownloadFileContentResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is DownloadFileContentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DownloadFileContentResponse.SuccessOctetStream -> error("Runtime selected a success response for error mapping.")
        is DownloadFileContentResponse.Http400Json -> DownloadFileContentApiException(response, statusCode, headers)
        is DownloadFileContentResponse.Http401Json -> DownloadFileContentApiException(response, statusCode, headers)
        is DownloadFileContentResponse.Http404Json -> DownloadFileContentApiException(response, statusCode, headers)
        is DownloadFileContentResponse.Http429Json -> DownloadFileContentApiException(response, statusCode, headers)
        is DownloadFileContentResponse.Http500Json -> DownloadFileContentApiException(response, statusCode, headers)
        is DownloadFileContentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Downloads the raw bytes of a file. Only files created server-side are downloadable; uploaded files return 400.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param fileId Wire parameter `file_id`.
   * @param workspaceId Workspace to scope the request to. Defaults to the caller’s default workspace.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   */
  public suspend fun downloadFileContentWithResponse(
    fileId: String,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DownloadFileContentResponse> = executor.executeWithResponse<Unit, DownloadFileContentResponse>(SdkExecutionRequest(downloadFileContentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "file_id", values = listOf(fileId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), FilesCodecs.downloadFileContentRequestCodecRegistry, DownloadFileContentResponseDecoder, options)

  /**
   * Retrieves metadata for a single file owned by the requesting workspace.
   *
   * @param fileId Wire parameter `file_id`.
   * @param workspaceId Workspace to scope the request to. Defaults to the caller’s default workspace.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GetFileMetadataApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GetFileMetadataError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getFileMetadata(
    fileId: String,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): FileMetadata = executor.executeWithTypedErrors<Unit, GetFileMetadataResponse, FileMetadata>(
    request = SdkExecutionRequest(getFileMetadataMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "file_id", values = listOf(fileId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = FilesCodecs.getFileMetadataRequestCodecRegistry,
    responseDecoder = GetFileMetadataResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GetFileMetadataResponse.SuccessJson -> response.json
        is GetFileMetadataResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is GetFileMetadataResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GetFileMetadataResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is GetFileMetadataResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is GetFileMetadataResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GetFileMetadataResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GetFileMetadataResponse.Http401Json -> GetFileMetadataApiException(response, statusCode, headers)
        is GetFileMetadataResponse.Http404Json -> GetFileMetadataApiException(response, statusCode, headers)
        is GetFileMetadataResponse.Http429Json -> GetFileMetadataApiException(response, statusCode, headers)
        is GetFileMetadataResponse.Http500Json -> GetFileMetadataApiException(response, statusCode, headers)
        is GetFileMetadataResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Retrieves metadata for a single file owned by the requesting workspace.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param fileId Wire parameter `file_id`.
   * @param workspaceId Workspace to scope the request to. Defaults to the caller’s default workspace.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   */
  public suspend fun getFileMetadataWithResponse(
    fileId: String,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetFileMetadataResponse> = executor.executeWithResponse<Unit, GetFileMetadataResponse>(SdkExecutionRequest(getFileMetadataMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "file_id", values = listOf(fileId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), FilesCodecs.getFileMetadataRequestCodecRegistry, GetFileMetadataResponseDecoder, options)

  /**
   * Lists files belonging to the workspace of the authenticating API key.
   *
   * @param options Execution options, including pagination bounds.
   * @return The first decoded page.
   */
  public suspend fun listFiles(
    cursor: String? = null,
    limit: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Page<FileListResponse, FileMetadata> {
    val engine = PaginationEngine<FileListResponse, FileMetadata>(
          descriptor = requireNotNull(listFilesMetadata.pagination as? PaginationDescriptor.CursorToken),
          operationId = listFilesMetadata.operationId,
        )
    return engine.firstPage { pageRequest -> fetchlistFilesPage(Unit, cursor, limit, workspaceId, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }
  }

  /**
   * Lists files belonging to the workspace of the authenticating API key.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param cursor Opaque pagination cursor from a previous response.
   * @param limit Maximum number of files to return (1–1000).
   * @param workspaceId Workspace to scope the request to. Defaults to the caller’s default workspace.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   */
  public suspend fun listFilesWithResponse(
    cursor: String? = null,
    limit: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListFilesResponse> = executor.executeWithResponse<Unit, ListFilesResponse>(SdkExecutionRequest(listFilesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "cursor", values = cursor?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), FilesCodecs.listFilesRequestCodecRegistry, ListFilesResponseDecoder, options)

  /**
   * Returns a cold page flow for listFiles.
   *
   * @param cursor Opaque pagination cursor from a previous response.
   * @param limit Maximum number of files to return (1–1000).
   * @param workspaceId Workspace to scope the request to. Defaults to the caller’s default workspace.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options, including pagination bounds.
   */
  public fun listFilesPages(
    cursor: String? = null,
    limit: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<Page<FileListResponse, FileMetadata>> = PaginationEngine<FileListResponse, FileMetadata>(
    descriptor = requireNotNull(listFilesMetadata.pagination as? PaginationDescriptor.CursorToken),
    operationId = listFilesMetadata.operationId,
  ).pages(fetch = { pageRequest -> fetchlistFilesPage(Unit, cursor, limit, workspaceId, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  /**
   * Returns a cold item flow for listFiles.
   *
   * @param options Execution options, including pagination bounds.
   */
  public fun listFilesItems(
    cursor: String? = null,
    limit: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<FileMetadata> = PaginationEngine<FileListResponse, FileMetadata>(
    descriptor = requireNotNull(listFilesMetadata.pagination as? PaginationDescriptor.CursorToken),
    operationId = listFilesMetadata.operationId,
  ).items(fetch = { pageRequest -> fetchlistFilesPage(Unit, cursor, limit, workspaceId, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  private fun metadataForListFilesPage(
    pageRequest: PageRequest,
    cursor: String? = null,
    limit: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
  ): OperationMetadata = listFilesMetadata

  private suspend fun fetchlistFilesPage(
    request: Unit,
    cursor: String? = null,
    limit: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    pageRequest: PageRequest,
    options: CallOptions,
  ): PageEnvelope<FileListResponse, FileMetadata> {
    val pageRequestValue = when (pageRequest) {
      PageRequest.First -> request
      is PageRequest.NextCursor -> request
      is PageRequest.NextOffset -> request
      is PageRequest.NextPage -> request
      is PageRequest.NextUrl -> request
      is PageRequest.NextToken -> request
    }
    val pageMetadata = metadataForListFilesPage(pageRequest, cursor, limit, workspaceId, httpReferer, xOpenRouterCategories, xOpenRouterTitle)
    val response = executor.execute<Unit, FileListResponse>(SdkExecutionRequest(pageMetadata, baseUri, pageRequestValue, emptyList(), run {
      val effectiveCursor = when (pageRequest) {
        PageRequest.First -> cursor
        is PageRequest.NextCursor -> pageRequest.cursor
        is PageRequest.NextOffset -> cursor
        is PageRequest.NextPage -> cursor
        is PageRequest.NextUrl -> cursor
        is PageRequest.NextToken -> cursor
      }
      buildList {
        add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "cursor", values = effectiveCursor?.let { listOf(it.toString()) }.orEmpty()))
        add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
        add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
        add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
        add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
        add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
      }
    }), listOf(FilesCodecs.LISTFILES_RESPONSE_CODEC_ID), FilesCodecs.listFilesRequestCodecRegistry, FilesCodecs.listFilesResponseCodecRegistry, options)
    return PageEnvelope(value = response, items = response.data.orEmpty(), nextCursor = response.cursor)
  }

  /**
   * Uploads a file to be referenced in future API calls. The file is stored under the workspace of the authenticating
   * API key. Maximum file size: 100 MB.
   *
   * @param request Request body sent to the operation.
   * @param workspaceId Workspace to scope the request to. Defaults to the caller’s default workspace.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UploadFileApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded UploadFileError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun uploadFile(
    request: InlineFilesPostRequestMultipartX7e99eef0,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): FileMetadata = executor.executeWithTypedErrors<InlineFilesPostRequestMultipartX7e99eef0, UploadFileResponse, FileMetadata>(
    request = SdkExecutionRequest(uploadFileMetadata, baseUri, request, listOf(FilesCodecs.UPLOADFILE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = FilesCodecs.uploadFileRequestCodecRegistry,
    responseDecoder = UploadFileResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UploadFileResponse.SuccessJson -> response.json
        is UploadFileResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is UploadFileResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UploadFileResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UploadFileResponse.Http413Json -> error("Runtime selected a non-success response for success mapping.")
        is UploadFileResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is UploadFileResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is UploadFileResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UploadFileResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UploadFileResponse.Http400Json -> UploadFileApiException(response, statusCode, headers)
        is UploadFileResponse.Http401Json -> UploadFileApiException(response, statusCode, headers)
        is UploadFileResponse.Http403Json -> UploadFileApiException(response, statusCode, headers)
        is UploadFileResponse.Http413Json -> UploadFileApiException(response, statusCode, headers)
        is UploadFileResponse.Http429Json -> UploadFileApiException(response, statusCode, headers)
        is UploadFileResponse.Http500Json -> UploadFileApiException(response, statusCode, headers)
        is UploadFileResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Uploads a file to be referenced in future API calls. The file is stored under the workspace of the authenticating
   * API key. Maximum file size: 100 MB.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param workspaceId Workspace to scope the request to. Defaults to the caller’s default workspace.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   */
  public suspend fun uploadFileWithResponse(
    request: InlineFilesPostRequestMultipartX7e99eef0,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UploadFileResponse> = executor.executeWithResponse<InlineFilesPostRequestMultipartX7e99eef0, UploadFileResponse>(SdkExecutionRequest(uploadFileMetadata, baseUri, request, listOf(FilesCodecs.UPLOADFILE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), FilesCodecs.uploadFileRequestCodecRegistry, UploadFileResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `deleteFile` may expose through its typed API exception.
   */
  public sealed interface DeleteFileError

  /**
   * Typed response alternatives for `deleteFile`. Non-success alternatives are not converted into success values.
   */
  public sealed interface DeleteFileResponse {
    public class SuccessJson(
      public val json: FileDeleteResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteFileResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteFileResponse,
        DeleteFileError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteFileResponse,
        DeleteFileError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteFileResponse,
        DeleteFileError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteFileResponse,
        DeleteFileError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteFileResponse
  }

  /**
   * Raised by `deleteFile` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class DeleteFileApiException(
    public val error: DeleteFileError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "deleteFile")

  private object DeleteFileResponseDecoder : SdkResponseAlternativeDecoder<DeleteFileResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteFileResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteFileResponse> = when {
      alternative.id == "deleteFile.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteFileResponse.SuccessJson(
          json = FilesCodecs.deleteFileResponseCodecAlternative0Registry.select(listOf("deleteFile.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteFile.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteFileResponse.Http401Json(
          json = FilesCodecs.deleteFileResponseCodecAlternative1Registry.select(listOf("deleteFile.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteFile.response.alternative2" -> SdkResponseDecodeResult(
        value = DeleteFileResponse.Http404Json(
          json = FilesCodecs.deleteFileResponseCodecAlternative2Registry.select(listOf("deleteFile.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteFile.response.alternative3" -> SdkResponseDecodeResult(
        value = DeleteFileResponse.Http429Json(
          json = FilesCodecs.deleteFileResponseCodecAlternative3Registry.select(listOf("deleteFile.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteFile.response.alternative4" -> SdkResponseDecodeResult(
        value = DeleteFileResponse.Http500Json(
          json = FilesCodecs.deleteFileResponseCodecAlternative4Registry.select(listOf("deleteFile.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteFileResponse = DeleteFileResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `downloadFileContent` may expose through its typed API exception.
   */
  public sealed interface DownloadFileContentError

  /**
   * Typed response alternatives for `downloadFileContent`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface DownloadFileContentResponse {
    public class SuccessOctetStream(
      public val bytes: SdkByteStream,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DownloadFileContentResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DownloadFileContentResponse,
        DownloadFileContentError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DownloadFileContentResponse,
        DownloadFileContentError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DownloadFileContentResponse,
        DownloadFileContentError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DownloadFileContentResponse,
        DownloadFileContentError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DownloadFileContentResponse,
        DownloadFileContentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DownloadFileContentResponse
  }

  /**
   * Raised by `downloadFileContent` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class DownloadFileContentApiException(
    public val error: DownloadFileContentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "downloadFileContent")

  private object DownloadFileContentResponseDecoder : SdkResponseAlternativeDecoder<DownloadFileContentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DownloadFileContentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DownloadFileContentResponse> = when {
      alternative.id == "downloadFileContent.response.alternative0" -> SdkResponseDecodeResult(
        value = DownloadFileContentResponse.SuccessOctetStream(
          bytes = body,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = true,
      )
      alternative.id == "downloadFileContent.response.alternative1" -> SdkResponseDecodeResult(
        value = DownloadFileContentResponse.Http400Json(
          json = FilesCodecs.downloadFileContentResponseCodecAlternative1Registry.select(listOf("downloadFileContent.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "downloadFileContent.response.alternative2" -> SdkResponseDecodeResult(
        value = DownloadFileContentResponse.Http401Json(
          json = FilesCodecs.downloadFileContentResponseCodecAlternative2Registry.select(listOf("downloadFileContent.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "downloadFileContent.response.alternative3" -> SdkResponseDecodeResult(
        value = DownloadFileContentResponse.Http404Json(
          json = FilesCodecs.downloadFileContentResponseCodecAlternative3Registry.select(listOf("downloadFileContent.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "downloadFileContent.response.alternative4" -> SdkResponseDecodeResult(
        value = DownloadFileContentResponse.Http429Json(
          json = FilesCodecs.downloadFileContentResponseCodecAlternative4Registry.select(listOf("downloadFileContent.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "downloadFileContent.response.alternative5" -> SdkResponseDecodeResult(
        value = DownloadFileContentResponse.Http500Json(
          json = FilesCodecs.downloadFileContentResponseCodecAlternative5Registry.select(listOf("downloadFileContent.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DownloadFileContentResponse = DownloadFileContentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `getFileMetadata` may expose through its typed API exception.
   */
  public sealed interface GetFileMetadataError

  /**
   * Typed response alternatives for `getFileMetadata`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetFileMetadataResponse {
    public class SuccessJson(
      public val json: FileMetadata,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileMetadataResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileMetadataResponse,
        GetFileMetadataError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileMetadataResponse,
        GetFileMetadataError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileMetadataResponse,
        GetFileMetadataError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileMetadataResponse,
        GetFileMetadataError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileMetadataResponse
  }

  /**
   * Raised by `getFileMetadata` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GetFileMetadataApiException(
    public val error: GetFileMetadataError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "getFileMetadata")

  private object GetFileMetadataResponseDecoder : SdkResponseAlternativeDecoder<GetFileMetadataResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetFileMetadataResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetFileMetadataResponse> = when {
      alternative.id == "getFileMetadata.response.alternative0" -> SdkResponseDecodeResult(
        value = GetFileMetadataResponse.SuccessJson(
          json = FilesCodecs.getFileMetadataResponseCodecAlternative0Registry.select(listOf("getFileMetadata.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getFileMetadata.response.alternative1" -> SdkResponseDecodeResult(
        value = GetFileMetadataResponse.Http401Json(
          json = FilesCodecs.getFileMetadataResponseCodecAlternative1Registry.select(listOf("getFileMetadata.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getFileMetadata.response.alternative2" -> SdkResponseDecodeResult(
        value = GetFileMetadataResponse.Http404Json(
          json = FilesCodecs.getFileMetadataResponseCodecAlternative2Registry.select(listOf("getFileMetadata.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getFileMetadata.response.alternative3" -> SdkResponseDecodeResult(
        value = GetFileMetadataResponse.Http429Json(
          json = FilesCodecs.getFileMetadataResponseCodecAlternative3Registry.select(listOf("getFileMetadata.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getFileMetadata.response.alternative4" -> SdkResponseDecodeResult(
        value = GetFileMetadataResponse.Http500Json(
          json = FilesCodecs.getFileMetadataResponseCodecAlternative4Registry.select(listOf("getFileMetadata.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetFileMetadataResponse = GetFileMetadataResponse.Unknown(statusCode = statusCode, headers = headers)
  }

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

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListFilesResponse,
        ListFilesError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListFilesResponse,
        ListFilesError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListFilesResponse,
        ListFilesError

    public class Http500Json(
      public val json: InternalServerResponse,
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
        value = ListFilesResponse.Http400Json(
          json = FilesCodecs.listFilesResponseCodecAlternative1Registry.select(listOf("listFiles.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listFiles.response.alternative2" -> SdkResponseDecodeResult(
        value = ListFilesResponse.Http401Json(
          json = FilesCodecs.listFilesResponseCodecAlternative2Registry.select(listOf("listFiles.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listFiles.response.alternative3" -> SdkResponseDecodeResult(
        value = ListFilesResponse.Http429Json(
          json = FilesCodecs.listFilesResponseCodecAlternative3Registry.select(listOf("listFiles.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listFiles.response.alternative4" -> SdkResponseDecodeResult(
        value = ListFilesResponse.Http500Json(
          json = FilesCodecs.listFilesResponseCodecAlternative4Registry.select(listOf("listFiles.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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

  /**
   * Decoded non-success response alternatives that `uploadFile` may expose through its typed API exception.
   */
  public sealed interface UploadFileError

  /**
   * Typed response alternatives for `uploadFile`. Non-success alternatives are not converted into success values.
   */
  public sealed interface UploadFileResponse {
    public class SuccessJson(
      public val json: FileMetadata,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UploadFileResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UploadFileResponse,
        UploadFileError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UploadFileResponse,
        UploadFileError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UploadFileResponse,
        UploadFileError

    public class Http413Json(
      public val json: PayloadTooLargeResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UploadFileResponse,
        UploadFileError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UploadFileResponse,
        UploadFileError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UploadFileResponse,
        UploadFileError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UploadFileResponse
  }

  /**
   * Raised by `uploadFile` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class UploadFileApiException(
    public val error: UploadFileError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "uploadFile")

  private object UploadFileResponseDecoder : SdkResponseAlternativeDecoder<UploadFileResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UploadFileResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UploadFileResponse> = when {
      alternative.id == "uploadFile.response.alternative0" -> SdkResponseDecodeResult(
        value = UploadFileResponse.SuccessJson(
          json = FilesCodecs.uploadFileResponseCodecAlternative0Registry.select(listOf("uploadFile.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "uploadFile.response.alternative1" -> SdkResponseDecodeResult(
        value = UploadFileResponse.Http400Json(
          json = FilesCodecs.uploadFileResponseCodecAlternative1Registry.select(listOf("uploadFile.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "uploadFile.response.alternative2" -> SdkResponseDecodeResult(
        value = UploadFileResponse.Http401Json(
          json = FilesCodecs.uploadFileResponseCodecAlternative2Registry.select(listOf("uploadFile.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "uploadFile.response.alternative3" -> SdkResponseDecodeResult(
        value = UploadFileResponse.Http403Json(
          json = FilesCodecs.uploadFileResponseCodecAlternative3Registry.select(listOf("uploadFile.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "uploadFile.response.alternative4" -> SdkResponseDecodeResult(
        value = UploadFileResponse.Http413Json(
          json = FilesCodecs.uploadFileResponseCodecAlternative4Registry.select(listOf("uploadFile.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "uploadFile.response.alternative5" -> SdkResponseDecodeResult(
        value = UploadFileResponse.Http429Json(
          json = FilesCodecs.uploadFileResponseCodecAlternative5Registry.select(listOf("uploadFile.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "uploadFile.response.alternative6" -> SdkResponseDecodeResult(
        value = UploadFileResponse.Http500Json(
          json = FilesCodecs.uploadFileResponseCodecAlternative6Registry.select(listOf("uploadFile.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UploadFileResponse = UploadFileResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val deleteFileMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "deleteFile",
          method = "DELETE",
          path = "/files/{file_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FileDeleteResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteFile.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteFile.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteFile.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteFile.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteFile.response.alternative4",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "apiKey", scopes = emptyList()),
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

    internal val downloadFileContentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "downloadFileContent",
          method = "GET",
          path = "/files/{file_id}/content",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/octet-stream"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/octet-stream"),
              typeTag = "SdkByteStream",
              mode = SdkResponseMode.BUFFERED,
              id = "downloadFileContent.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "downloadFileContent.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "downloadFileContent.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "downloadFileContent.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "downloadFileContent.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "downloadFileContent.response.alternative5",
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
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val getFileMetadataMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "getFileMetadata",
          method = "GET",
          path = "/files/{file_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FileMetadata",
              mode = SdkResponseMode.BUFFERED,
              id = "getFileMetadata.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getFileMetadata.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getFileMetadata.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getFileMetadata.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getFileMetadata.response.alternative4",
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
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val listFilesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listFiles",
          method = "GET",
          path = "/files",
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
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listFiles.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listFiles.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listFiles.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listFiles.response.alternative4",
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
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = PaginationDescriptor.CursorToken(requestCursorParam = "cursor", requestLimitParam = "limit", responseItemsPath = PropertyPath("data"), responseNextCursorPath = PropertyPath("cursor")),
          streaming = null,
        ) }

    internal val uploadFileMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "uploadFile",
          method = "POST",
          path = "/files",
          requestMediaTypes = listOf("multipart/form-data"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FileMetadata",
              mode = SdkResponseMode.BUFFERED,
              id = "uploadFile.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "uploadFile.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "uploadFile.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "uploadFile.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 413),
              mediaTypes = listOf("application/json"),
              typeTag = "PayloadTooLargeResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "uploadFile.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "uploadFile.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "uploadFile.response.alternative6",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "apiKey", scopes = emptyList()),
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
