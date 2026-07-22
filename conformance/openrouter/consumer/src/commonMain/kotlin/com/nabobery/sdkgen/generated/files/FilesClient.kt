package com.nabobery.sdkgen.generated.files

import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.FileDeleteResponse
import com.nabobery.sdkgen.generated.FileListResponse
import com.nabobery.sdkgen.generated.FileMetadata
import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema
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
import com.nabobery.sdkgen.runtime.bodies.MultipartBody
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set

public object FilesCodecs {
  public const val DELETEFILE_RESPONSE_CODEC_ID: String = "deleteFile.response"

  private val deleteFileResponseCodec: MediaTypeCodec<FileDeleteResponse> =
      KotlinxSerializationCodec(DELETEFILE_RESPONSE_CODEC_ID, FileDeleteResponse.Serializer, SdkJson)

  private val deleteFileResponseCodecAlternative0Codec: MediaTypeCodec<FileDeleteResponse> =
      KotlinxSerializationCodec("deleteFile.response.alternative0", FileDeleteResponse.Serializer, SdkJson)

  public val deleteFileResponseCodecAlternative0Registry: MediaTypeCodecRegistry<FileDeleteResponse>
      = MediaTypeCodecRegistry.of(deleteFileResponseCodecAlternative0Codec)

  private val deleteFileResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("deleteFile.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val deleteFileResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(deleteFileResponseCodecAlternative1Codec)

  private val deleteFileResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("deleteFile.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  public val deleteFileResponseCodecAlternative2Registry: MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(deleteFileResponseCodecAlternative2Codec)

  private val deleteFileResponseCodecAlternative3Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("deleteFile.response.alternative3", TooManyRequestsResponse.Serializer, SdkJson)

  public val deleteFileResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(deleteFileResponseCodecAlternative3Codec)

  private val deleteFileResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("deleteFile.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val deleteFileResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(deleteFileResponseCodecAlternative4Codec)

  public val deleteFileRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val deleteFileResponseCodecRegistry: MediaTypeCodecRegistry<FileDeleteResponse> =
      MediaTypeCodecRegistry.of(deleteFileResponseCodec)

  private val downloadFileContentResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse>
      =
      KotlinxSerializationCodec("downloadFileContent.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val downloadFileContentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(downloadFileContentResponseCodecAlternative1Codec)

  private val downloadFileContentResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("downloadFileContent.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val downloadFileContentResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(downloadFileContentResponseCodecAlternative2Codec)

  private val downloadFileContentResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("downloadFileContent.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  public val downloadFileContentResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(downloadFileContentResponseCodecAlternative3Codec)

  private val downloadFileContentResponseCodecAlternative4Codec:
      MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("downloadFileContent.response.alternative4", TooManyRequestsResponse.Serializer,
        SdkJson)

  public val downloadFileContentResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(downloadFileContentResponseCodecAlternative4Codec)

  private val downloadFileContentResponseCodecAlternative5Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("downloadFileContent.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  public val downloadFileContentResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(downloadFileContentResponseCodecAlternative5Codec)

  public val downloadFileContentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val downloadFileContentResponseCodecRegistry: MediaTypeCodecRegistry<SdkByteStream> =
      MediaTypeCodecRegistry.of()

  public const val GETFILEMETADATA_RESPONSE_CODEC_ID: String = "getFileMetadata.response"

  private val getFileMetadataResponseCodec: MediaTypeCodec<FileMetadata> =
      KotlinxSerializationCodec(GETFILEMETADATA_RESPONSE_CODEC_ID, FileMetadata.Serializer, SdkJson)

  private val getFileMetadataResponseCodecAlternative0Codec: MediaTypeCodec<FileMetadata> =
      KotlinxSerializationCodec("getFileMetadata.response.alternative0", FileMetadata.Serializer, SdkJson)

  public val getFileMetadataResponseCodecAlternative0Registry: MediaTypeCodecRegistry<FileMetadata>
      = MediaTypeCodecRegistry.of(getFileMetadataResponseCodecAlternative0Codec)

  private val getFileMetadataResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getFileMetadata.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val getFileMetadataResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getFileMetadataResponseCodecAlternative1Codec)

  private val getFileMetadataResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getFileMetadata.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  public val getFileMetadataResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getFileMetadataResponseCodecAlternative2Codec)

  private val getFileMetadataResponseCodecAlternative3Codec: MediaTypeCodec<TooManyRequestsResponse>
      =
      KotlinxSerializationCodec("getFileMetadata.response.alternative3", TooManyRequestsResponse.Serializer, SdkJson)

  public val getFileMetadataResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(getFileMetadataResponseCodecAlternative3Codec)

  private val getFileMetadataResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("getFileMetadata.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val getFileMetadataResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getFileMetadataResponseCodecAlternative4Codec)

  public val getFileMetadataRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val getFileMetadataResponseCodecRegistry: MediaTypeCodecRegistry<FileMetadata> =
      MediaTypeCodecRegistry.of(getFileMetadataResponseCodec)

  public const val LISTFILES_RESPONSE_CODEC_ID: String = "listFiles.response"

  private val listFilesResponseCodec: MediaTypeCodec<FileListResponse> =
      KotlinxSerializationCodec(LISTFILES_RESPONSE_CODEC_ID, FileListResponse.Serializer, SdkJson)

  private val listFilesResponseCodecAlternative0Codec: MediaTypeCodec<FileListResponse> =
      KotlinxSerializationCodec("listFiles.response.alternative0", FileListResponse.Serializer, SdkJson)

  public val listFilesResponseCodecAlternative0Registry: MediaTypeCodecRegistry<FileListResponse> =
      MediaTypeCodecRegistry.of(listFilesResponseCodecAlternative0Codec)

  private val listFilesResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("listFiles.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val listFilesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BadRequestResponse>
      = MediaTypeCodecRegistry.of(listFilesResponseCodecAlternative1Codec)

  private val listFilesResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listFiles.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val listFilesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listFilesResponseCodecAlternative2Codec)

  private val listFilesResponseCodecAlternative3Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("listFiles.response.alternative3", TooManyRequestsResponse.Serializer, SdkJson)

  public val listFilesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(listFilesResponseCodecAlternative3Codec)

  private val listFilesResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listFiles.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val listFilesResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listFilesResponseCodecAlternative4Codec)

  public val listFilesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listFilesResponseCodecRegistry: MediaTypeCodecRegistry<FileListResponse> =
      MediaTypeCodecRegistry.of(listFilesResponseCodec)

  public const val UPLOADFILE_REQUEST_CODEC_ID: String = "uploadFile.request"

  private val uploadFileRequestCodec:
      MediaTypeCodec<InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema> =
      UploadFileMultipartCodec

  public const val UPLOADFILE_RESPONSE_CODEC_ID: String = "uploadFile.response"

  private val uploadFileResponseCodec: MediaTypeCodec<FileMetadata> =
      KotlinxSerializationCodec(UPLOADFILE_RESPONSE_CODEC_ID, FileMetadata.Serializer, SdkJson)

  private val uploadFileResponseCodecAlternative0Codec: MediaTypeCodec<FileMetadata> =
      KotlinxSerializationCodec("uploadFile.response.alternative0", FileMetadata.Serializer, SdkJson)

  public val uploadFileResponseCodecAlternative0Registry: MediaTypeCodecRegistry<FileMetadata> =
      MediaTypeCodecRegistry.of(uploadFileResponseCodecAlternative0Codec)

  private val uploadFileResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("uploadFile.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val uploadFileResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BadRequestResponse>
      = MediaTypeCodecRegistry.of(uploadFileResponseCodecAlternative1Codec)

  private val uploadFileResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("uploadFile.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val uploadFileResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(uploadFileResponseCodecAlternative2Codec)

  private val uploadFileResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("uploadFile.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  public val uploadFileResponseCodecAlternative3Registry: MediaTypeCodecRegistry<ForbiddenResponse>
      = MediaTypeCodecRegistry.of(uploadFileResponseCodecAlternative3Codec)

  private val uploadFileResponseCodecAlternative4Codec: MediaTypeCodec<PayloadTooLargeResponse> =
      KotlinxSerializationCodec("uploadFile.response.alternative4", PayloadTooLargeResponse.Serializer, SdkJson)

  public val uploadFileResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<PayloadTooLargeResponse> =
      MediaTypeCodecRegistry.of(uploadFileResponseCodecAlternative4Codec)

  private val uploadFileResponseCodecAlternative5Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("uploadFile.response.alternative5", TooManyRequestsResponse.Serializer, SdkJson)

  public val uploadFileResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(uploadFileResponseCodecAlternative5Codec)

  private val uploadFileResponseCodecAlternative6Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("uploadFile.response.alternative6", InternalServerResponse.Serializer, SdkJson)

  public val uploadFileResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(uploadFileResponseCodecAlternative6Codec)

  public val uploadFileRequestCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema> =
      MediaTypeCodecRegistry.of(uploadFileRequestCodec)

  public val uploadFileResponseCodecRegistry: MediaTypeCodecRegistry<FileMetadata> =
      MediaTypeCodecRegistry.of(uploadFileResponseCodec)

  public object UploadFileMultipartCodec : MediaTypeCodec<InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema> {
    override val id: String = "uploadFile.request"

    override val mediaTypes: Set<String> = setOf("multipart/form-data")

    override suspend fun encode(`value`: InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema,
      mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val multipart = MultipartBody()
      multipart.binary(name = "file", stream = request.file, mediaType = "application/octet-stream", headers = listOf())
      return multipart.build()
    }

    override suspend fun decode(body: SdkByteStream,
      mediaType: String?): InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema {
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
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
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
  ): FileDeleteResponse = executor.execute<Unit, FileDeleteResponse>(SdkExecutionRequest(deleteFileMetadata, baseUri,
    Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "file_id", values = listOf(fileId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(FilesCodecs.DELETEFILE_RESPONSE_CODEC_ID), FilesCodecs.deleteFileRequestCodecRegistry, FilesCodecs
    .deleteFileResponseCodecRegistry, options)

  /**
   * Deletes a file owned by the requesting workspace. Deletion is irreversible.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun deleteFileWithResponse(
    fileId: String,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteFileResponse> = executor.executeWithResponse<Unit,
    DeleteFileResponse>(SdkExecutionRequest(deleteFileMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "file_id", values = listOf(fileId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), FilesCodecs.deleteFileRequestCodecRegistry, DeleteFileResponseDecoder, options)

  /**
   * Downloads the raw bytes of a file. Only files created server-side are downloadable; uploaded files return 400.
   *
   * @param options Execution options.
   * @return Response body stream.
   * @throws SdkApiException When the service returns a non-success response.
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
  ): SdkByteStream = executor.executeRaw<Unit>(SdkExecutionRequest(downloadFileContentMetadata, baseUri, Unit,
    emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "file_id", values = listOf(fileId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), FilesCodecs.downloadFileContentRequestCodecRegistry, options)

  /**
   * Downloads the raw bytes of a file. Only files created server-side are downloadable; uploaded files return 400.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun downloadFileContentWithResponse(
    fileId: String,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DownloadFileContentResponse> = executor.executeWithResponse<Unit,
    DownloadFileContentResponse>(SdkExecutionRequest(downloadFileContentMetadata, baseUri, Unit, emptyList(),
      buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "file_id", values = listOf(fileId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), FilesCodecs.downloadFileContentRequestCodecRegistry, DownloadFileContentResponseDecoder, options)

  /**
   * Retrieves metadata for a single file owned by the requesting workspace.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
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
  ): FileMetadata = executor.execute<Unit, FileMetadata>(SdkExecutionRequest(getFileMetadataMetadata, baseUri, Unit,
    emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "file_id", values = listOf(fileId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(FilesCodecs.GETFILEMETADATA_RESPONSE_CODEC_ID), FilesCodecs.getFileMetadataRequestCodecRegistry,
    FilesCodecs.getFileMetadataResponseCodecRegistry, options)

  /**
   * Retrieves metadata for a single file owned by the requesting workspace.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getFileMetadataWithResponse(
    fileId: String,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetFileMetadataResponse> = executor.executeWithResponse<Unit,
    GetFileMetadataResponse>(SdkExecutionRequest(getFileMetadataMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "file_id", values = listOf(fileId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), FilesCodecs.getFileMetadataRequestCodecRegistry, GetFileMetadataResponseDecoder, options)

  /**
   * Lists files belonging to the workspace of the authenticating API key.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listFiles(
    cursor: String? = null,
    limit: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): FileListResponse = executor.execute<Unit, FileListResponse>(SdkExecutionRequest(listFilesMetadata, baseUri, Unit,
    emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "cursor", values = cursor?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(FilesCodecs.LISTFILES_RESPONSE_CODEC_ID), FilesCodecs.listFilesRequestCodecRegistry, FilesCodecs
    .listFilesResponseCodecRegistry, options)

  /**
   * Lists files belonging to the workspace of the authenticating API key.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listFilesWithResponse(
    cursor: String? = null,
    limit: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListFilesResponse> = executor.executeWithResponse<Unit,
    ListFilesResponse>(SdkExecutionRequest(listFilesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "cursor", values = cursor?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), FilesCodecs.listFilesRequestCodecRegistry, ListFilesResponseDecoder, options)

  /**
   * Uploads a file to be referenced in future API calls. The file is stored under the workspace of the authenticating
   * API key. Maximum file size: 100 MB.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun uploadFile(
    request: InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): FileMetadata = executor.execute<InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema,
    FileMetadata>(SdkExecutionRequest(uploadFileMetadata, baseUri, request, listOf(FilesCodecs
      .UPLOADFILE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(FilesCodecs.UPLOADFILE_RESPONSE_CODEC_ID), FilesCodecs.uploadFileRequestCodecRegistry, FilesCodecs
    .uploadFileResponseCodecRegistry, options)

  /**
   * Uploads a file to be referenced in future API calls. The file is stored under the workspace of the authenticating
   * API key. Maximum file size: 100 MB.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun uploadFileWithResponse(
    request: InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UploadFileResponse> = executor
    .executeWithResponse<InlinePathsFilesPostRequestBodyContentMultipartFormDataSchema,
      UploadFileResponse>(SdkExecutionRequest(uploadFileMetadata, baseUri, request, listOf(FilesCodecs
        .UPLOADFILE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), FilesCodecs.uploadFileRequestCodecRegistry, UploadFileResponseDecoder, options)

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
    ) : DeleteFileResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteFileResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteFileResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteFileResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteFileResponse
  }

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
          json = FilesCodecs.deleteFileResponseCodecAlternative0Registry
            .select(listOf("deleteFile.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteFile.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteFileResponse.Http401Json(
          json = FilesCodecs.deleteFileResponseCodecAlternative1Registry
            .select(listOf("deleteFile.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteFile.response.alternative2" -> SdkResponseDecodeResult(
        value = DeleteFileResponse.Http404Json(
          json = FilesCodecs.deleteFileResponseCodecAlternative2Registry
            .select(listOf("deleteFile.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteFile.response.alternative3" -> SdkResponseDecodeResult(
        value = DeleteFileResponse.Http429Json(
          json = FilesCodecs.deleteFileResponseCodecAlternative3Registry
            .select(listOf("deleteFile.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteFile.response.alternative4" -> SdkResponseDecodeResult(
        value = DeleteFileResponse.Http500Json(
          json = FilesCodecs.deleteFileResponseCodecAlternative4Registry
            .select(listOf("deleteFile.response.alternative4"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
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
    ) : DownloadFileContentResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DownloadFileContentResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DownloadFileContentResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DownloadFileContentResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DownloadFileContentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DownloadFileContentResponse
  }

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
          json = FilesCodecs.downloadFileContentResponseCodecAlternative1Registry
            .select(listOf("downloadFileContent.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "downloadFileContent.response.alternative2" -> SdkResponseDecodeResult(
        value = DownloadFileContentResponse.Http401Json(
          json = FilesCodecs.downloadFileContentResponseCodecAlternative2Registry
            .select(listOf("downloadFileContent.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "downloadFileContent.response.alternative3" -> SdkResponseDecodeResult(
        value = DownloadFileContentResponse.Http404Json(
          json = FilesCodecs.downloadFileContentResponseCodecAlternative3Registry
            .select(listOf("downloadFileContent.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "downloadFileContent.response.alternative4" -> SdkResponseDecodeResult(
        value = DownloadFileContentResponse.Http429Json(
          json = FilesCodecs.downloadFileContentResponseCodecAlternative4Registry
            .select(listOf("downloadFileContent.response.alternative4"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "downloadFileContent.response.alternative5" -> SdkResponseDecodeResult(
        value = DownloadFileContentResponse.Http500Json(
          json = FilesCodecs.downloadFileContentResponseCodecAlternative5Registry
            .select(listOf("downloadFileContent.response.alternative5"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
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
    ) : GetFileMetadataResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileMetadataResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileMetadataResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileMetadataResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFileMetadataResponse
  }

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
          json = FilesCodecs.getFileMetadataResponseCodecAlternative0Registry
            .select(listOf("getFileMetadata.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getFileMetadata.response.alternative1" -> SdkResponseDecodeResult(
        value = GetFileMetadataResponse.Http401Json(
          json = FilesCodecs.getFileMetadataResponseCodecAlternative1Registry
            .select(listOf("getFileMetadata.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getFileMetadata.response.alternative2" -> SdkResponseDecodeResult(
        value = GetFileMetadataResponse.Http404Json(
          json = FilesCodecs.getFileMetadataResponseCodecAlternative2Registry
            .select(listOf("getFileMetadata.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getFileMetadata.response.alternative3" -> SdkResponseDecodeResult(
        value = GetFileMetadataResponse.Http429Json(
          json = FilesCodecs.getFileMetadataResponseCodecAlternative3Registry
            .select(listOf("getFileMetadata.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getFileMetadata.response.alternative4" -> SdkResponseDecodeResult(
        value = GetFileMetadataResponse.Http500Json(
          json = FilesCodecs.getFileMetadataResponseCodecAlternative4Registry
            .select(listOf("getFileMetadata.response.alternative4"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
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
    ) : ListFilesResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListFilesResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListFilesResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListFilesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListFilesResponse
  }

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
          json = FilesCodecs.listFilesResponseCodecAlternative0Registry
            .select(listOf("listFiles.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listFiles.response.alternative1" -> SdkResponseDecodeResult(
        value = ListFilesResponse.Http400Json(
          json = FilesCodecs.listFilesResponseCodecAlternative1Registry
            .select(listOf("listFiles.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listFiles.response.alternative2" -> SdkResponseDecodeResult(
        value = ListFilesResponse.Http401Json(
          json = FilesCodecs.listFilesResponseCodecAlternative2Registry
            .select(listOf("listFiles.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listFiles.response.alternative3" -> SdkResponseDecodeResult(
        value = ListFilesResponse.Http429Json(
          json = FilesCodecs.listFilesResponseCodecAlternative3Registry
            .select(listOf("listFiles.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listFiles.response.alternative4" -> SdkResponseDecodeResult(
        value = ListFilesResponse.Http500Json(
          json = FilesCodecs.listFilesResponseCodecAlternative4Registry
            .select(listOf("listFiles.response.alternative4"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
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
    ) : UploadFileResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UploadFileResponse

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UploadFileResponse

    public class Http413Json(
      public val json: PayloadTooLargeResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UploadFileResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UploadFileResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UploadFileResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UploadFileResponse
  }

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
          json = FilesCodecs.uploadFileResponseCodecAlternative0Registry
            .select(listOf("uploadFile.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "uploadFile.response.alternative1" -> SdkResponseDecodeResult(
        value = UploadFileResponse.Http400Json(
          json = FilesCodecs.uploadFileResponseCodecAlternative1Registry
            .select(listOf("uploadFile.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "uploadFile.response.alternative2" -> SdkResponseDecodeResult(
        value = UploadFileResponse.Http401Json(
          json = FilesCodecs.uploadFileResponseCodecAlternative2Registry
            .select(listOf("uploadFile.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "uploadFile.response.alternative3" -> SdkResponseDecodeResult(
        value = UploadFileResponse.Http403Json(
          json = FilesCodecs.uploadFileResponseCodecAlternative3Registry
            .select(listOf("uploadFile.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "uploadFile.response.alternative4" -> SdkResponseDecodeResult(
        value = UploadFileResponse.Http413Json(
          json = FilesCodecs.uploadFileResponseCodecAlternative4Registry
            .select(listOf("uploadFile.response.alternative4"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "uploadFile.response.alternative5" -> SdkResponseDecodeResult(
        value = UploadFileResponse.Http429Json(
          json = FilesCodecs.uploadFileResponseCodecAlternative5Registry
            .select(listOf("uploadFile.response.alternative5"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "uploadFile.response.alternative6" -> SdkResponseDecodeResult(
        value = UploadFileResponse.Http500Json(
          json = FilesCodecs.uploadFileResponseCodecAlternative6Registry
            .select(listOf("uploadFile.response.alternative6"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
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
    public val deleteFileMetadata: OperationMetadata = OperationMetadata(
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
        )

    public val downloadFileContentMetadata: OperationMetadata = OperationMetadata(
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
        )

    public val getFileMetadataMetadata: OperationMetadata = OperationMetadata(
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
        )

    public val listFilesMetadata: OperationMetadata = OperationMetadata(
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
          pagination = null,
          streaming = null,
        )

    public val uploadFileMetadata: OperationMetadata = OperationMetadata(
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
        )
  }
}
