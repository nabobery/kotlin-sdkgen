package com.nabobery.sdkgen.github.generated.migrations

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.Import
import com.nabobery.sdkgen.github.generated.InlineOrgsMigrationsGetParameterItemX48ce57dc
import com.nabobery.sdkgen.github.generated.InlineOrgsMigrationsGetParameterItemX712e3bb0
import com.nabobery.sdkgen.github.generated.InlineOrgsMigrationsPostRequestJsonX5797c146
import com.nabobery.sdkgen.github.generated.InlineReposImportAuthorsPatchRequestJsonXe206de08
import com.nabobery.sdkgen.github.generated.InlineReposImportLfsPatchRequestJsonX10e52359
import com.nabobery.sdkgen.github.generated.InlineReposImportPatchRequestJsonX9aa72b45
import com.nabobery.sdkgen.github.generated.InlineReposImportPutRequestJsonXdd1ac961
import com.nabobery.sdkgen.github.generated.InlineUserMigrationsPostRequestJsonXeb2296ad
import com.nabobery.sdkgen.github.generated.Migration
import com.nabobery.sdkgen.github.generated.MinimalRepository
import com.nabobery.sdkgen.github.generated.PorterAuthor
import com.nabobery.sdkgen.github.generated.PorterLargeFile
import com.nabobery.sdkgen.github.generated.SdkJson
import com.nabobery.sdkgen.github.generated.ValidationError
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
import com.nabobery.sdkgen.runtime.SdkParameterLocation
import com.nabobery.sdkgen.runtime.SdkRequestParameter
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
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.nullable

public object MigrationsCodecs {
  private val migrationsCancelImportResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/cancel-import.response.alternative1", BasicError.Serializer, SdkJson)

  public val migrationsCancelImportResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsCancelImportResponseCodecAlternative1Codec)

  public val migrationsCancelImportRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val migrationsCancelImportResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val migrationsDeleteArchiveForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/delete-archive-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val migrationsDeleteArchiveForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsDeleteArchiveForAuthenticatedUserResponseCodecAlternative2Codec)

  private val migrationsDeleteArchiveForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/delete-archive-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val migrationsDeleteArchiveForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsDeleteArchiveForAuthenticatedUserResponseCodecAlternative3Codec)

  private val migrationsDeleteArchiveForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/delete-archive-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val migrationsDeleteArchiveForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsDeleteArchiveForAuthenticatedUserResponseCodecAlternative4Codec)

  public val migrationsDeleteArchiveForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val migrationsDeleteArchiveForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  private val migrationsDeleteArchiveForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/delete-archive-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  public val migrationsDeleteArchiveForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsDeleteArchiveForOrgResponseCodecAlternative1Codec)

  public val migrationsDeleteArchiveForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val migrationsDeleteArchiveForOrgResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val migrationsDownloadArchiveForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/download-archive-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  public val migrationsDownloadArchiveForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsDownloadArchiveForOrgResponseCodecAlternative1Codec)

  public val migrationsDownloadArchiveForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val migrationsDownloadArchiveForOrgResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val migrationsGetArchiveForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/get-archive-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val migrationsGetArchiveForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsGetArchiveForAuthenticatedUserResponseCodecAlternative2Codec)

  private val migrationsGetArchiveForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/get-archive-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val migrationsGetArchiveForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsGetArchiveForAuthenticatedUserResponseCodecAlternative3Codec)

  public val migrationsGetArchiveForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val migrationsGetArchiveForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val MIGRATIONSGETCOMMITAUTHORS_RESPONSE_CODEC_ID: String =
      "migrations/get-commit-authors.response"

  private val migrationsGetCommitAuthorsResponseCodec: MediaTypeCodec<List<PorterAuthor>> =
      KotlinxSerializationCodec(MIGRATIONSGETCOMMITAUTHORS_RESPONSE_CODEC_ID, ListSerializer(PorterAuthor.Serializer), SdkJson)

  private val migrationsGetCommitAuthorsResponseCodecAlternative0Codec:
      MediaTypeCodec<List<PorterAuthor>> =
      KotlinxSerializationCodec("migrations/get-commit-authors.response.alternative0", ListSerializer(PorterAuthor.Serializer), SdkJson)

  public val migrationsGetCommitAuthorsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<PorterAuthor>> =
      MediaTypeCodecRegistry.of(migrationsGetCommitAuthorsResponseCodecAlternative0Codec)

  private val migrationsGetCommitAuthorsResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/get-commit-authors.response.alternative1", BasicError.Serializer, SdkJson)

  public val migrationsGetCommitAuthorsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsGetCommitAuthorsResponseCodecAlternative1Codec)

  private val migrationsGetCommitAuthorsResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/get-commit-authors.response.alternative2", BasicError.Serializer, SdkJson)

  public val migrationsGetCommitAuthorsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsGetCommitAuthorsResponseCodecAlternative2Codec)

  public val migrationsGetCommitAuthorsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val migrationsGetCommitAuthorsResponseCodecRegistry:
      MediaTypeCodecRegistry<List<PorterAuthor>> =
      MediaTypeCodecRegistry.of(migrationsGetCommitAuthorsResponseCodec)

  public const val MIGRATIONSGETIMPORTSTATUS_RESPONSE_CODEC_ID: String =
      "migrations/get-import-status.response"

  private val migrationsGetImportStatusResponseCodec: MediaTypeCodec<Import> =
      KotlinxSerializationCodec(MIGRATIONSGETIMPORTSTATUS_RESPONSE_CODEC_ID, Import.Serializer, SdkJson)

  private val migrationsGetImportStatusResponseCodecAlternative0Codec: MediaTypeCodec<Import> =
      KotlinxSerializationCodec("migrations/get-import-status.response.alternative0", Import.Serializer, SdkJson)

  public val migrationsGetImportStatusResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Import> =
      MediaTypeCodecRegistry.of(migrationsGetImportStatusResponseCodecAlternative0Codec)

  private val migrationsGetImportStatusResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/get-import-status.response.alternative1", BasicError.Serializer, SdkJson)

  public val migrationsGetImportStatusResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsGetImportStatusResponseCodecAlternative1Codec)

  private val migrationsGetImportStatusResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/get-import-status.response.alternative2", BasicError.Serializer, SdkJson)

  public val migrationsGetImportStatusResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsGetImportStatusResponseCodecAlternative2Codec)

  public val migrationsGetImportStatusRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val migrationsGetImportStatusResponseCodecRegistry: MediaTypeCodecRegistry<Import> =
      MediaTypeCodecRegistry.of(migrationsGetImportStatusResponseCodec)

  public const val MIGRATIONSGETLARGEFILES_RESPONSE_CODEC_ID: String =
      "migrations/get-large-files.response"

  private val migrationsGetLargeFilesResponseCodec: MediaTypeCodec<List<PorterLargeFile>> =
      KotlinxSerializationCodec(MIGRATIONSGETLARGEFILES_RESPONSE_CODEC_ID, ListSerializer(PorterLargeFile.Serializer), SdkJson)

  private val migrationsGetLargeFilesResponseCodecAlternative0Codec:
      MediaTypeCodec<List<PorterLargeFile>> =
      KotlinxSerializationCodec("migrations/get-large-files.response.alternative0", ListSerializer(PorterLargeFile.Serializer), SdkJson)

  public val migrationsGetLargeFilesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<PorterLargeFile>> =
      MediaTypeCodecRegistry.of(migrationsGetLargeFilesResponseCodecAlternative0Codec)

  private val migrationsGetLargeFilesResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/get-large-files.response.alternative1", BasicError.Serializer, SdkJson)

  public val migrationsGetLargeFilesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsGetLargeFilesResponseCodecAlternative1Codec)

  public val migrationsGetLargeFilesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val migrationsGetLargeFilesResponseCodecRegistry:
      MediaTypeCodecRegistry<List<PorterLargeFile>> =
      MediaTypeCodecRegistry.of(migrationsGetLargeFilesResponseCodec)

  public const val MIGRATIONSGETSTATUSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "migrations/get-status-for-authenticated-user.response"

  private val migrationsGetStatusForAuthenticatedUserResponseCodec: MediaTypeCodec<Migration> =
      KotlinxSerializationCodec(MIGRATIONSGETSTATUSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, Migration.Serializer, SdkJson)

  private val migrationsGetStatusForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<Migration> =
      KotlinxSerializationCodec("migrations/get-status-for-authenticated-user.response.alternative0", Migration.Serializer, SdkJson)

  public val migrationsGetStatusForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Migration> =
      MediaTypeCodecRegistry.of(migrationsGetStatusForAuthenticatedUserResponseCodecAlternative0Codec)

  private val migrationsGetStatusForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/get-status-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val migrationsGetStatusForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsGetStatusForAuthenticatedUserResponseCodecAlternative2Codec)

  private val migrationsGetStatusForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/get-status-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val migrationsGetStatusForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsGetStatusForAuthenticatedUserResponseCodecAlternative3Codec)

  private val migrationsGetStatusForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/get-status-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val migrationsGetStatusForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsGetStatusForAuthenticatedUserResponseCodecAlternative4Codec)

  public val migrationsGetStatusForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val migrationsGetStatusForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Migration> =
      MediaTypeCodecRegistry.of(migrationsGetStatusForAuthenticatedUserResponseCodec)

  public const val MIGRATIONSGETSTATUSFORORG_RESPONSE_CODEC_ID: String =
      "migrations/get-status-for-org.response"

  private val migrationsGetStatusForOrgResponseCodec: MediaTypeCodec<Migration> =
      KotlinxSerializationCodec(MIGRATIONSGETSTATUSFORORG_RESPONSE_CODEC_ID, Migration.Serializer, SdkJson)

  private val migrationsGetStatusForOrgResponseCodecAlternative0Codec: MediaTypeCodec<Migration> =
      KotlinxSerializationCodec("migrations/get-status-for-org.response.alternative0", Migration.Serializer, SdkJson)

  public val migrationsGetStatusForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Migration> =
      MediaTypeCodecRegistry.of(migrationsGetStatusForOrgResponseCodecAlternative0Codec)

  private val migrationsGetStatusForOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/get-status-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  public val migrationsGetStatusForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsGetStatusForOrgResponseCodecAlternative1Codec)

  public val migrationsGetStatusForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val migrationsGetStatusForOrgResponseCodecRegistry: MediaTypeCodecRegistry<Migration> =
      MediaTypeCodecRegistry.of(migrationsGetStatusForOrgResponseCodec)

  public const val MIGRATIONSLISTFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "migrations/list-for-authenticated-user.response"

  private val migrationsListForAuthenticatedUserResponseCodec: MediaTypeCodec<List<Migration>> =
      KotlinxSerializationCodec(MIGRATIONSLISTFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(Migration.Serializer), SdkJson)

  private val migrationsListForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<Migration>> =
      KotlinxSerializationCodec("migrations/list-for-authenticated-user.response.alternative0", ListSerializer(Migration.Serializer), SdkJson)

  public val migrationsListForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Migration>> =
      MediaTypeCodecRegistry.of(migrationsListForAuthenticatedUserResponseCodecAlternative0Codec)

  private val migrationsListForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/list-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val migrationsListForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsListForAuthenticatedUserResponseCodecAlternative2Codec)

  private val migrationsListForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/list-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val migrationsListForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsListForAuthenticatedUserResponseCodecAlternative3Codec)

  public val migrationsListForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val migrationsListForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<Migration>> =
      MediaTypeCodecRegistry.of(migrationsListForAuthenticatedUserResponseCodec)

  public const val MIGRATIONSLISTFORORG_RESPONSE_CODEC_ID: String =
      "migrations/list-for-org.response"

  private val migrationsListForOrgResponseCodec: MediaTypeCodec<List<Migration>> =
      KotlinxSerializationCodec(MIGRATIONSLISTFORORG_RESPONSE_CODEC_ID, ListSerializer(Migration.Serializer), SdkJson)

  private val migrationsListForOrgResponseCodecAlternative0Codec: MediaTypeCodec<List<Migration>> =
      KotlinxSerializationCodec("migrations/list-for-org.response.alternative0", ListSerializer(Migration.Serializer), SdkJson)

  public val migrationsListForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Migration>> =
      MediaTypeCodecRegistry.of(migrationsListForOrgResponseCodecAlternative0Codec)

  public val migrationsListForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val migrationsListForOrgResponseCodecRegistry: MediaTypeCodecRegistry<List<Migration>> =
      MediaTypeCodecRegistry.of(migrationsListForOrgResponseCodec)

  public const val MIGRATIONSLISTREPOSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "migrations/list-repos-for-authenticated-user.response"

  private val migrationsListReposForAuthenticatedUserResponseCodec:
      MediaTypeCodec<List<MinimalRepository>> =
      KotlinxSerializationCodec(MIGRATIONSLISTREPOSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(MinimalRepository.Serializer), SdkJson)

  private val migrationsListReposForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<MinimalRepository>> =
      KotlinxSerializationCodec("migrations/list-repos-for-authenticated-user.response.alternative0", ListSerializer(MinimalRepository.Serializer), SdkJson)

  public val migrationsListReposForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<MinimalRepository>> =
      MediaTypeCodecRegistry.of(migrationsListReposForAuthenticatedUserResponseCodecAlternative0Codec)

  private val migrationsListReposForAuthenticatedUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/list-repos-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

  public val migrationsListReposForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsListReposForAuthenticatedUserResponseCodecAlternative1Codec)

  public val migrationsListReposForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val migrationsListReposForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<MinimalRepository>> =
      MediaTypeCodecRegistry.of(migrationsListReposForAuthenticatedUserResponseCodec)

  public const val MIGRATIONSLISTREPOSFORORG_RESPONSE_CODEC_ID: String =
      "migrations/list-repos-for-org.response"

  private val migrationsListReposForOrgResponseCodec: MediaTypeCodec<List<MinimalRepository>> =
      KotlinxSerializationCodec(MIGRATIONSLISTREPOSFORORG_RESPONSE_CODEC_ID, ListSerializer(MinimalRepository.Serializer), SdkJson)

  private val migrationsListReposForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<List<MinimalRepository>> =
      KotlinxSerializationCodec("migrations/list-repos-for-org.response.alternative0", ListSerializer(MinimalRepository.Serializer), SdkJson)

  public val migrationsListReposForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<MinimalRepository>> =
      MediaTypeCodecRegistry.of(migrationsListReposForOrgResponseCodecAlternative0Codec)

  private val migrationsListReposForOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/list-repos-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  public val migrationsListReposForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsListReposForOrgResponseCodecAlternative1Codec)

  public val migrationsListReposForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val migrationsListReposForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<List<MinimalRepository>> =
      MediaTypeCodecRegistry.of(migrationsListReposForOrgResponseCodec)

  public const val MIGRATIONSMAPCOMMITAUTHOR_REQUEST_CODEC_ID: String =
      "migrations/map-commit-author.request"

  private val migrationsMapCommitAuthorRequestCodec:
      MediaTypeCodec<InlineReposImportAuthorsPatchRequestJsonXe206de08?> =
      KotlinxSerializationCodec(MIGRATIONSMAPCOMMITAUTHOR_REQUEST_CODEC_ID, InlineReposImportAuthorsPatchRequestJsonXe206de08.Serializer.nullable, SdkJson)

  public const val MIGRATIONSMAPCOMMITAUTHOR_RESPONSE_CODEC_ID: String =
      "migrations/map-commit-author.response"

  private val migrationsMapCommitAuthorResponseCodec: MediaTypeCodec<PorterAuthor> =
      KotlinxSerializationCodec(MIGRATIONSMAPCOMMITAUTHOR_RESPONSE_CODEC_ID, PorterAuthor.Serializer, SdkJson)

  private val migrationsMapCommitAuthorResponseCodecAlternative0Codec: MediaTypeCodec<PorterAuthor>
      =
      KotlinxSerializationCodec("migrations/map-commit-author.response.alternative0", PorterAuthor.Serializer, SdkJson)

  public val migrationsMapCommitAuthorResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PorterAuthor> =
      MediaTypeCodecRegistry.of(migrationsMapCommitAuthorResponseCodecAlternative0Codec)

  private val migrationsMapCommitAuthorResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/map-commit-author.response.alternative1", BasicError.Serializer, SdkJson)

  public val migrationsMapCommitAuthorResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsMapCommitAuthorResponseCodecAlternative1Codec)

  private val migrationsMapCommitAuthorResponseCodecAlternative2Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("migrations/map-commit-author.response.alternative2", ValidationError.Serializer, SdkJson)

  public val migrationsMapCommitAuthorResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(migrationsMapCommitAuthorResponseCodecAlternative2Codec)

  private val migrationsMapCommitAuthorResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/map-commit-author.response.alternative3", BasicError.Serializer, SdkJson)

  public val migrationsMapCommitAuthorResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsMapCommitAuthorResponseCodecAlternative3Codec)

  public val migrationsMapCommitAuthorRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposImportAuthorsPatchRequestJsonXe206de08?> =
      MediaTypeCodecRegistry.of(migrationsMapCommitAuthorRequestCodec)

  public val migrationsMapCommitAuthorResponseCodecRegistry: MediaTypeCodecRegistry<PorterAuthor> =
      MediaTypeCodecRegistry.of(migrationsMapCommitAuthorResponseCodec)

  public const val MIGRATIONSSETLFSPREFERENCE_REQUEST_CODEC_ID: String =
      "migrations/set-lfs-preference.request"

  private val migrationsSetLfsPreferenceRequestCodec:
      MediaTypeCodec<InlineReposImportLfsPatchRequestJsonX10e52359> =
      KotlinxSerializationCodec(MIGRATIONSSETLFSPREFERENCE_REQUEST_CODEC_ID, InlineReposImportLfsPatchRequestJsonX10e52359.Serializer, SdkJson)

  public const val MIGRATIONSSETLFSPREFERENCE_RESPONSE_CODEC_ID: String =
      "migrations/set-lfs-preference.response"

  private val migrationsSetLfsPreferenceResponseCodec: MediaTypeCodec<Import> =
      KotlinxSerializationCodec(MIGRATIONSSETLFSPREFERENCE_RESPONSE_CODEC_ID, Import.Serializer, SdkJson)

  private val migrationsSetLfsPreferenceResponseCodecAlternative0Codec: MediaTypeCodec<Import> =
      KotlinxSerializationCodec("migrations/set-lfs-preference.response.alternative0", Import.Serializer, SdkJson)

  public val migrationsSetLfsPreferenceResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Import> =
      MediaTypeCodecRegistry.of(migrationsSetLfsPreferenceResponseCodecAlternative0Codec)

  private val migrationsSetLfsPreferenceResponseCodecAlternative1Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("migrations/set-lfs-preference.response.alternative1", ValidationError.Serializer, SdkJson)

  public val migrationsSetLfsPreferenceResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(migrationsSetLfsPreferenceResponseCodecAlternative1Codec)

  private val migrationsSetLfsPreferenceResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/set-lfs-preference.response.alternative2", BasicError.Serializer, SdkJson)

  public val migrationsSetLfsPreferenceResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsSetLfsPreferenceResponseCodecAlternative2Codec)

  public val migrationsSetLfsPreferenceRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposImportLfsPatchRequestJsonX10e52359> =
      MediaTypeCodecRegistry.of(migrationsSetLfsPreferenceRequestCodec)

  public val migrationsSetLfsPreferenceResponseCodecRegistry: MediaTypeCodecRegistry<Import> =
      MediaTypeCodecRegistry.of(migrationsSetLfsPreferenceResponseCodec)

  public const val MIGRATIONSSTARTFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "migrations/start-for-authenticated-user.request"

  private val migrationsStartForAuthenticatedUserRequestCodec:
      MediaTypeCodec<InlineUserMigrationsPostRequestJsonXeb2296ad> =
      KotlinxSerializationCodec(MIGRATIONSSTARTFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineUserMigrationsPostRequestJsonXeb2296ad.Serializer, SdkJson)

  public const val MIGRATIONSSTARTFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "migrations/start-for-authenticated-user.response"

  private val migrationsStartForAuthenticatedUserResponseCodec: MediaTypeCodec<Migration> =
      KotlinxSerializationCodec(MIGRATIONSSTARTFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, Migration.Serializer, SdkJson)

  private val migrationsStartForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<Migration> =
      KotlinxSerializationCodec("migrations/start-for-authenticated-user.response.alternative0", Migration.Serializer, SdkJson)

  public val migrationsStartForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Migration> =
      MediaTypeCodecRegistry.of(migrationsStartForAuthenticatedUserResponseCodecAlternative0Codec)

  private val migrationsStartForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/start-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val migrationsStartForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsStartForAuthenticatedUserResponseCodecAlternative2Codec)

  private val migrationsStartForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/start-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val migrationsStartForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsStartForAuthenticatedUserResponseCodecAlternative3Codec)

  private val migrationsStartForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("migrations/start-for-authenticated-user.response.alternative4", ValidationError.Serializer, SdkJson)

  public val migrationsStartForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(migrationsStartForAuthenticatedUserResponseCodecAlternative4Codec)

  public val migrationsStartForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUserMigrationsPostRequestJsonXeb2296ad> =
      MediaTypeCodecRegistry.of(migrationsStartForAuthenticatedUserRequestCodec)

  public val migrationsStartForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Migration> =
      MediaTypeCodecRegistry.of(migrationsStartForAuthenticatedUserResponseCodec)

  public const val MIGRATIONSSTARTFORORG_REQUEST_CODEC_ID: String =
      "migrations/start-for-org.request"

  private val migrationsStartForOrgRequestCodec:
      MediaTypeCodec<InlineOrgsMigrationsPostRequestJsonX5797c146> =
      KotlinxSerializationCodec(MIGRATIONSSTARTFORORG_REQUEST_CODEC_ID, InlineOrgsMigrationsPostRequestJsonX5797c146.Serializer, SdkJson)

  public const val MIGRATIONSSTARTFORORG_RESPONSE_CODEC_ID: String =
      "migrations/start-for-org.response"

  private val migrationsStartForOrgResponseCodec: MediaTypeCodec<Migration> =
      KotlinxSerializationCodec(MIGRATIONSSTARTFORORG_RESPONSE_CODEC_ID, Migration.Serializer, SdkJson)

  private val migrationsStartForOrgResponseCodecAlternative0Codec: MediaTypeCodec<Migration> =
      KotlinxSerializationCodec("migrations/start-for-org.response.alternative0", Migration.Serializer, SdkJson)

  public val migrationsStartForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Migration> =
      MediaTypeCodecRegistry.of(migrationsStartForOrgResponseCodecAlternative0Codec)

  private val migrationsStartForOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/start-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  public val migrationsStartForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsStartForOrgResponseCodecAlternative1Codec)

  private val migrationsStartForOrgResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("migrations/start-for-org.response.alternative2", ValidationError.Serializer, SdkJson)

  public val migrationsStartForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(migrationsStartForOrgResponseCodecAlternative2Codec)

  public val migrationsStartForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsMigrationsPostRequestJsonX5797c146> =
      MediaTypeCodecRegistry.of(migrationsStartForOrgRequestCodec)

  public val migrationsStartForOrgResponseCodecRegistry: MediaTypeCodecRegistry<Migration> =
      MediaTypeCodecRegistry.of(migrationsStartForOrgResponseCodec)

  public const val MIGRATIONSSTARTIMPORT_REQUEST_CODEC_ID: String =
      "migrations/start-import.request"

  private val migrationsStartImportRequestCodec:
      MediaTypeCodec<InlineReposImportPutRequestJsonXdd1ac961> =
      KotlinxSerializationCodec(MIGRATIONSSTARTIMPORT_REQUEST_CODEC_ID, InlineReposImportPutRequestJsonXdd1ac961.Serializer, SdkJson)

  public const val MIGRATIONSSTARTIMPORT_RESPONSE_CODEC_ID: String =
      "migrations/start-import.response"

  private val migrationsStartImportResponseCodec: MediaTypeCodec<Import> =
      KotlinxSerializationCodec(MIGRATIONSSTARTIMPORT_RESPONSE_CODEC_ID, Import.Serializer, SdkJson)

  private val migrationsStartImportResponseCodecAlternative0Codec: MediaTypeCodec<Import> =
      KotlinxSerializationCodec("migrations/start-import.response.alternative0", Import.Serializer, SdkJson)

  public val migrationsStartImportResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Import>
      = MediaTypeCodecRegistry.of(migrationsStartImportResponseCodecAlternative0Codec)

  private val migrationsStartImportResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/start-import.response.alternative1", BasicError.Serializer, SdkJson)

  public val migrationsStartImportResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsStartImportResponseCodecAlternative1Codec)

  private val migrationsStartImportResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("migrations/start-import.response.alternative2", ValidationError.Serializer, SdkJson)

  public val migrationsStartImportResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(migrationsStartImportResponseCodecAlternative2Codec)

  private val migrationsStartImportResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/start-import.response.alternative3", BasicError.Serializer, SdkJson)

  public val migrationsStartImportResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsStartImportResponseCodecAlternative3Codec)

  public val migrationsStartImportRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposImportPutRequestJsonXdd1ac961> =
      MediaTypeCodecRegistry.of(migrationsStartImportRequestCodec)

  public val migrationsStartImportResponseCodecRegistry: MediaTypeCodecRegistry<Import> =
      MediaTypeCodecRegistry.of(migrationsStartImportResponseCodec)

  private val migrationsUnlockRepoForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/unlock-repo-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val migrationsUnlockRepoForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsUnlockRepoForAuthenticatedUserResponseCodecAlternative2Codec)

  private val migrationsUnlockRepoForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/unlock-repo-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val migrationsUnlockRepoForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsUnlockRepoForAuthenticatedUserResponseCodecAlternative3Codec)

  private val migrationsUnlockRepoForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/unlock-repo-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val migrationsUnlockRepoForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsUnlockRepoForAuthenticatedUserResponseCodecAlternative4Codec)

  public val migrationsUnlockRepoForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val migrationsUnlockRepoForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  private val migrationsUnlockRepoForOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/unlock-repo-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  public val migrationsUnlockRepoForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsUnlockRepoForOrgResponseCodecAlternative1Codec)

  public val migrationsUnlockRepoForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val migrationsUnlockRepoForOrgResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val MIGRATIONSUPDATEIMPORT_REQUEST_CODEC_ID: String =
      "migrations/update-import.request"

  private val migrationsUpdateImportRequestCodec:
      MediaTypeCodec<InlineReposImportPatchRequestJsonX9aa72b45?> =
      KotlinxSerializationCodec(MIGRATIONSUPDATEIMPORT_REQUEST_CODEC_ID, InlineReposImportPatchRequestJsonX9aa72b45.Serializer.nullable, SdkJson)

  public const val MIGRATIONSUPDATEIMPORT_RESPONSE_CODEC_ID: String =
      "migrations/update-import.response"

  private val migrationsUpdateImportResponseCodec: MediaTypeCodec<Import> =
      KotlinxSerializationCodec(MIGRATIONSUPDATEIMPORT_RESPONSE_CODEC_ID, Import.Serializer, SdkJson)

  private val migrationsUpdateImportResponseCodecAlternative0Codec: MediaTypeCodec<Import> =
      KotlinxSerializationCodec("migrations/update-import.response.alternative0", Import.Serializer, SdkJson)

  public val migrationsUpdateImportResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Import>
      = MediaTypeCodecRegistry.of(migrationsUpdateImportResponseCodecAlternative0Codec)

  private val migrationsUpdateImportResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("migrations/update-import.response.alternative1", BasicError.Serializer, SdkJson)

  public val migrationsUpdateImportResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(migrationsUpdateImportResponseCodecAlternative1Codec)

  public val migrationsUpdateImportRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposImportPatchRequestJsonX9aa72b45?> =
      MediaTypeCodecRegistry.of(migrationsUpdateImportRequestCodec)

  public val migrationsUpdateImportResponseCodecRegistry: MediaTypeCodecRegistry<Import> =
      MediaTypeCodecRegistry.of(migrationsUpdateImportResponseCodec)
}

/**
 * Client for the 'migrations' group of GitHub v3 REST API.
 */
public class MigrationsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@MigrationsClient.authentication)

  /**
   * Stop an import for a repository.
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws MigrationsCancelImportApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded MigrationsCancelImportError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsCancelImport(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, MigrationsCancelImportResponse, Unit>(
    request = SdkExecutionRequest(migrationsCancelImportMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = MigrationsCodecs.migrationsCancelImportRequestCodecRegistry,
    responseDecoder = MigrationsCancelImportResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsCancelImportResponse.SuccessNoContent -> response.unit
        is MigrationsCancelImportResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsCancelImportResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsCancelImportResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is MigrationsCancelImportResponse.Http503Json -> MigrationsCancelImportApiException(response, statusCode, headers)
        is MigrationsCancelImportResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Stop an import for a repository.
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun migrationsCancelImportWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsCancelImportResponse> = executor.executeWithResponse<Unit, MigrationsCancelImportResponse>(SdkExecutionRequest(migrationsCancelImportMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), MigrationsCodecs.migrationsCancelImportRequestCodecRegistry, MigrationsCancelImportResponseDecoder, options)

  /**
   * Deletes a previous migration archive. Downloadable migration archives are automatically deleted after seven days.
   * Migration metadata, which is returned in the [List user
   * migrations](https://docs.github.com/rest/migrations/users#list-user-migrations) and [Get a user migration
   * status](https://docs.github.com/rest/migrations/users#get-a-user-migration-status) endpoints, will continue to be
   * available even after an archive is deleted.
   *
   * @param migrationId The unique identifier of the migration.
   * @param options Execution options.
   * @return No response body.
   * @throws MigrationsDeleteArchiveForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded MigrationsDeleteArchiveForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsDeleteArchiveForAuthenticatedUser(migrationId: Int, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, MigrationsDeleteArchiveForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(migrationsDeleteArchiveForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
    }),
    requestCodecs = MigrationsCodecs.migrationsDeleteArchiveForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = MigrationsDeleteArchiveForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsDeleteArchiveForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is MigrationsDeleteArchiveForAuthenticatedUserResponse.Http304NoContent -> response.unit
        is MigrationsDeleteArchiveForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsDeleteArchiveForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsDeleteArchiveForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsDeleteArchiveForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsDeleteArchiveForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is MigrationsDeleteArchiveForAuthenticatedUserResponse.Http304NoContent -> MigrationsDeleteArchiveForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsDeleteArchiveForAuthenticatedUserResponse.Http401Json -> MigrationsDeleteArchiveForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsDeleteArchiveForAuthenticatedUserResponse.Http403Json -> MigrationsDeleteArchiveForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsDeleteArchiveForAuthenticatedUserResponse.Http404Json -> MigrationsDeleteArchiveForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsDeleteArchiveForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a previous migration archive. Downloadable migration archives are automatically deleted after seven days.
   * Migration metadata, which is returned in the [List user
   * migrations](https://docs.github.com/rest/migrations/users#list-user-migrations) and [Get a user migration
   * status](https://docs.github.com/rest/migrations/users#get-a-user-migration-status) endpoints, will continue to be
   * available even after an archive is deleted.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param migrationId The unique identifier of the migration.
   * @param options Execution options.
   */
  public suspend fun migrationsDeleteArchiveForAuthenticatedUserWithResponse(migrationId: Int, options: CallOptions = CallOptions()): SdkResponseResult<MigrationsDeleteArchiveForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, MigrationsDeleteArchiveForAuthenticatedUserResponse>(SdkExecutionRequest(migrationsDeleteArchiveForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
  }), MigrationsCodecs.migrationsDeleteArchiveForAuthenticatedUserRequestCodecRegistry, MigrationsDeleteArchiveForAuthenticatedUserResponseDecoder, options)

  /**
   * Deletes a previous migration archive. Migration archives are automatically deleted after seven days.
   *
   * @param migrationId The unique identifier of the migration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws MigrationsDeleteArchiveForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded MigrationsDeleteArchiveForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsDeleteArchiveForOrg(
    migrationId: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, MigrationsDeleteArchiveForOrgResponse, Unit>(
    request = SdkExecutionRequest(migrationsDeleteArchiveForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = MigrationsCodecs.migrationsDeleteArchiveForOrgRequestCodecRegistry,
    responseDecoder = MigrationsDeleteArchiveForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsDeleteArchiveForOrgResponse.SuccessNoContent -> response.unit
        is MigrationsDeleteArchiveForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsDeleteArchiveForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsDeleteArchiveForOrgResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is MigrationsDeleteArchiveForOrgResponse.Http404Json -> MigrationsDeleteArchiveForOrgApiException(response, statusCode, headers)
        is MigrationsDeleteArchiveForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a previous migration archive. Migration archives are automatically deleted after seven days.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param migrationId The unique identifier of the migration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun migrationsDeleteArchiveForOrgWithResponse(
    migrationId: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsDeleteArchiveForOrgResponse> = executor.executeWithResponse<Unit, MigrationsDeleteArchiveForOrgResponse>(SdkExecutionRequest(migrationsDeleteArchiveForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), MigrationsCodecs.migrationsDeleteArchiveForOrgRequestCodecRegistry, MigrationsDeleteArchiveForOrgResponseDecoder, options)

  /**
   * Fetches the URL to a migration archive.
   *
   * @param migrationId The unique identifier of the migration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws MigrationsDownloadArchiveForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded MigrationsDownloadArchiveForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsDownloadArchiveForOrg(
    migrationId: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, MigrationsDownloadArchiveForOrgResponse, Unit>(
    request = SdkExecutionRequest(migrationsDownloadArchiveForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = MigrationsCodecs.migrationsDownloadArchiveForOrgRequestCodecRegistry,
    responseDecoder = MigrationsDownloadArchiveForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsDownloadArchiveForOrgResponse.Http302NoContent -> response.unit
        is MigrationsDownloadArchiveForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsDownloadArchiveForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsDownloadArchiveForOrgResponse.Http302NoContent -> MigrationsDownloadArchiveForOrgApiException(response, statusCode, headers)
        is MigrationsDownloadArchiveForOrgResponse.Http404Json -> MigrationsDownloadArchiveForOrgApiException(response, statusCode, headers)
        is MigrationsDownloadArchiveForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Fetches the URL to a migration archive.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param migrationId The unique identifier of the migration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun migrationsDownloadArchiveForOrgWithResponse(
    migrationId: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsDownloadArchiveForOrgResponse> = executor.executeWithResponse<Unit, MigrationsDownloadArchiveForOrgResponse>(SdkExecutionRequest(migrationsDownloadArchiveForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), MigrationsCodecs.migrationsDownloadArchiveForOrgRequestCodecRegistry, MigrationsDownloadArchiveForOrgResponseDecoder, options)

  /**
   * Fetches the URL to download the migration archive as a `tar.gz` file. Depending on the resources your repository
   * uses, the migration archive can contain JSON files with data for these objects:
   *
   * *   attachments
   * *   bases
   * *   commit\_comments
   * *   issue\_comments
   * *   issue\_events
   * *   issues
   * *   milestones
   * *   organizations
   * *   projects
   * *   protected\_branches
   * *   pull\_request\_reviews
   * *   pull\_requests
   * *   releases
   * *   repositories
   * *   review\_comments
   * *   schema
   * *   users
   *
   * The archive will also contain an `attachments` directory that includes all attachment files uploaded to GitHub.com
   * and a `repositories` directory that contains the repository's Git data.
   *
   * @param migrationId The unique identifier of the migration.
   * @param options Execution options.
   * @return No response body.
   * @throws MigrationsGetArchiveForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded MigrationsGetArchiveForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsGetArchiveForAuthenticatedUser(migrationId: Int, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, MigrationsGetArchiveForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(migrationsGetArchiveForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
    }),
    requestCodecs = MigrationsCodecs.migrationsGetArchiveForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = MigrationsGetArchiveForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsGetArchiveForAuthenticatedUserResponse.Http302NoContent -> response.unit
        is MigrationsGetArchiveForAuthenticatedUserResponse.Http304NoContent -> response.unit
        is MigrationsGetArchiveForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsGetArchiveForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsGetArchiveForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsGetArchiveForAuthenticatedUserResponse.Http302NoContent -> MigrationsGetArchiveForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsGetArchiveForAuthenticatedUserResponse.Http304NoContent -> MigrationsGetArchiveForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsGetArchiveForAuthenticatedUserResponse.Http401Json -> MigrationsGetArchiveForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsGetArchiveForAuthenticatedUserResponse.Http403Json -> MigrationsGetArchiveForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsGetArchiveForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Fetches the URL to download the migration archive as a `tar.gz` file. Depending on the resources your repository
   * uses, the migration archive can contain JSON files with data for these objects:
   *
   * *   attachments
   * *   bases
   * *   commit\_comments
   * *   issue\_comments
   * *   issue\_events
   * *   issues
   * *   milestones
   * *   organizations
   * *   projects
   * *   protected\_branches
   * *   pull\_request\_reviews
   * *   pull\_requests
   * *   releases
   * *   repositories
   * *   review\_comments
   * *   schema
   * *   users
   *
   * The archive will also contain an `attachments` directory that includes all attachment files uploaded to GitHub.com
   * and a `repositories` directory that contains the repository's Git data.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param migrationId The unique identifier of the migration.
   * @param options Execution options.
   */
  public suspend fun migrationsGetArchiveForAuthenticatedUserWithResponse(migrationId: Int, options: CallOptions = CallOptions()): SdkResponseResult<MigrationsGetArchiveForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, MigrationsGetArchiveForAuthenticatedUserResponse>(SdkExecutionRequest(migrationsGetArchiveForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
  }), MigrationsCodecs.migrationsGetArchiveForAuthenticatedUserRequestCodecRegistry, MigrationsGetArchiveForAuthenticatedUserResponseDecoder, options)

  /**
   * Each type of source control system represents authors in a different way. For example, a Git commit author has a
   * display name and an email address, but a Subversion commit author just has a username. The GitHub Importer will
   * make the author information valid, but the author might not be correct. For example, it will change the bare
   * Subversion username `hubot` into something like `hubot <hubot@12341234-abab-fefe-8787-fedcba987654>`.
   *
   * This endpoint and the [Map a commit
   * author](https://docs.github.com/rest/migrations/source-imports#map-a-commit-author) endpoint allow you to provide
   * correct Git author information.
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param since A user ID. Only return users with an ID greater than this ID.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MigrationsGetCommitAuthorsApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded MigrationsGetCommitAuthorsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsGetCommitAuthors(
    owner: String,
    repo: String,
    since: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<PorterAuthor> = executor.executeWithTypedErrors<Unit, MigrationsGetCommitAuthorsResponse, List<PorterAuthor>>(
    request = SdkExecutionRequest(migrationsGetCommitAuthorsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = MigrationsCodecs.migrationsGetCommitAuthorsRequestCodecRegistry,
    responseDecoder = MigrationsGetCommitAuthorsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsGetCommitAuthorsResponse.SuccessJson -> response.json
        is MigrationsGetCommitAuthorsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsGetCommitAuthorsResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsGetCommitAuthorsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsGetCommitAuthorsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MigrationsGetCommitAuthorsResponse.Http404Json -> MigrationsGetCommitAuthorsApiException(response, statusCode, headers)
        is MigrationsGetCommitAuthorsResponse.Http503Json -> MigrationsGetCommitAuthorsApiException(response, statusCode, headers)
        is MigrationsGetCommitAuthorsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Each type of source control system represents authors in a different way. For example, a Git commit author has a
   * display name and an email address, but a Subversion commit author just has a username. The GitHub Importer will
   * make the author information valid, but the author might not be correct. For example, it will change the bare
   * Subversion username `hubot` into something like `hubot <hubot@12341234-abab-fefe-8787-fedcba987654>`.
   *
   * This endpoint and the [Map a commit
   * author](https://docs.github.com/rest/migrations/source-imports#map-a-commit-author) endpoint allow you to provide
   * correct Git author information.
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param since A user ID. Only return users with an ID greater than this ID.
   * @param options Execution options.
   */
  public suspend fun migrationsGetCommitAuthorsWithResponse(
    owner: String,
    repo: String,
    since: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsGetCommitAuthorsResponse> = executor.executeWithResponse<Unit, MigrationsGetCommitAuthorsResponse>(SdkExecutionRequest(migrationsGetCommitAuthorsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
  }), MigrationsCodecs.migrationsGetCommitAuthorsRequestCodecRegistry, MigrationsGetCommitAuthorsResponseDecoder, options)

  /**
   * View the progress of an import.
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * **Import status**
   *
   * This section includes details about the possible values of the `status` field of the Import Progress response.
   *
   * An import that does not have errors will progress through these steps:
   *
   * *   `detecting` - the "detection" step of the import is in progress because the request did not include a `vcs`
   * parameter. The import is identifying the type of source control present at the URL.
   * *   `importing` - the "raw" step of the import is in progress. This is where commit data is fetched from the
   * original repository. The import progress response will include `commit_count` (the total number of raw commits that
   * will be imported) and `percent` (0 - 100, the current progress through the import).
   * *   `mapping` - the "rewrite" step of the import is in progress. This is where SVN branches are converted to Git
   * branches, and where author updates are applied. The import progress response does not include progress information.
   * *   `pushing` - the "push" step of the import is in progress. This is where the importer updates the repository on
   * GitHub. The import progress response will include `push_percent`, which is the percent value reported by `git push`
   * when it is "Writing objects".
   * *   `complete` - the import is complete, and the repository is ready on GitHub.
   *
   * If there are problems, you will see one of these in the `status` field:
   *
   * *   `auth_failed` - the import requires authentication in order to connect to the original repository. To update
   * authentication for the import, please see the [Update an
   * import](https://docs.github.com/rest/migrations/source-imports#update-an-import) section.
   * *   `error` - the import encountered an error. The import progress response will include the `failed_step` and an
   * error message. Contact [GitHub Support](https://support.github.com/contact?tags=dotcom-rest-api) for more
   * information.
   * *   `detection_needs_auth` - the importer requires authentication for the originating repository to continue
   * detection. To update authentication for the import, please see the [Update an
   * import](https://docs.github.com/rest/migrations/source-imports#update-an-import) section.
   * *   `detection_found_nothing` - the importer didn't recognize any source control at the URL. To resolve, [Cancel
   * the import](https://docs.github.com/rest/migrations/source-imports#cancel-an-import) and
   * [retry](https://docs.github.com/rest/migrations/source-imports#start-an-import) with the correct URL.
   * *   `detection_found_multiple` - the importer found several projects or repositories at the provided URL. When this
   * is the case, the Import Progress response will also include a `project_choices` field with the possible project
   * choices as values. To update project choice, please see the [Update an
   * import](https://docs.github.com/rest/migrations/source-imports#update-an-import) section.
   *
   * **The project_choices field**
   *
   * When multiple projects are found at the provided URL, the response hash will include a `project_choices` field, the
   * value of which is an array of hashes each representing a project choice. The exact key/value pairs of the project
   * hashes will differ depending on the version control type.
   *
   * **Git LFS related fields**
   *
   * This section includes details about Git LFS related fields that may be present in the Import Progress response.
   *
   * *   `use_lfs` - describes whether the import has been opted in or out of using Git LFS. The value can be `opt_in`,
   * `opt_out`, or `undecided` if no action has been taken.
   * *   `has_large_files` - the boolean value describing whether files larger than 100MB were found during the
   * `importing` step.
   * *   `large_files_size` - the total size in gigabytes of files larger than 100MB found in the originating
   * repository.
   * *   `large_files_count` - the total number of files larger than 100MB found in the originating repository. To see a
   * list of these files, make a "Get Large Files" request.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MigrationsGetImportStatusApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded MigrationsGetImportStatusError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsGetImportStatus(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Import = executor.executeWithTypedErrors<Unit, MigrationsGetImportStatusResponse, Import>(
    request = SdkExecutionRequest(migrationsGetImportStatusMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = MigrationsCodecs.migrationsGetImportStatusRequestCodecRegistry,
    responseDecoder = MigrationsGetImportStatusResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsGetImportStatusResponse.SuccessJson -> response.json
        is MigrationsGetImportStatusResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsGetImportStatusResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsGetImportStatusResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsGetImportStatusResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MigrationsGetImportStatusResponse.Http404Json -> MigrationsGetImportStatusApiException(response, statusCode, headers)
        is MigrationsGetImportStatusResponse.Http503Json -> MigrationsGetImportStatusApiException(response, statusCode, headers)
        is MigrationsGetImportStatusResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * View the progress of an import.
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * **Import status**
   *
   * This section includes details about the possible values of the `status` field of the Import Progress response.
   *
   * An import that does not have errors will progress through these steps:
   *
   * *   `detecting` - the "detection" step of the import is in progress because the request did not include a `vcs`
   * parameter. The import is identifying the type of source control present at the URL.
   * *   `importing` - the "raw" step of the import is in progress. This is where commit data is fetched from the
   * original repository. The import progress response will include `commit_count` (the total number of raw commits that
   * will be imported) and `percent` (0 - 100, the current progress through the import).
   * *   `mapping` - the "rewrite" step of the import is in progress. This is where SVN branches are converted to Git
   * branches, and where author updates are applied. The import progress response does not include progress information.
   * *   `pushing` - the "push" step of the import is in progress. This is where the importer updates the repository on
   * GitHub. The import progress response will include `push_percent`, which is the percent value reported by `git push`
   * when it is "Writing objects".
   * *   `complete` - the import is complete, and the repository is ready on GitHub.
   *
   * If there are problems, you will see one of these in the `status` field:
   *
   * *   `auth_failed` - the import requires authentication in order to connect to the original repository. To update
   * authentication for the import, please see the [Update an
   * import](https://docs.github.com/rest/migrations/source-imports#update-an-import) section.
   * *   `error` - the import encountered an error. The import progress response will include the `failed_step` and an
   * error message. Contact [GitHub Support](https://support.github.com/contact?tags=dotcom-rest-api) for more
   * information.
   * *   `detection_needs_auth` - the importer requires authentication for the originating repository to continue
   * detection. To update authentication for the import, please see the [Update an
   * import](https://docs.github.com/rest/migrations/source-imports#update-an-import) section.
   * *   `detection_found_nothing` - the importer didn't recognize any source control at the URL. To resolve, [Cancel
   * the import](https://docs.github.com/rest/migrations/source-imports#cancel-an-import) and
   * [retry](https://docs.github.com/rest/migrations/source-imports#start-an-import) with the correct URL.
   * *   `detection_found_multiple` - the importer found several projects or repositories at the provided URL. When this
   * is the case, the Import Progress response will also include a `project_choices` field with the possible project
   * choices as values. To update project choice, please see the [Update an
   * import](https://docs.github.com/rest/migrations/source-imports#update-an-import) section.
   *
   * **The project_choices field**
   *
   * When multiple projects are found at the provided URL, the response hash will include a `project_choices` field, the
   * value of which is an array of hashes each representing a project choice. The exact key/value pairs of the project
   * hashes will differ depending on the version control type.
   *
   * **Git LFS related fields**
   *
   * This section includes details about Git LFS related fields that may be present in the Import Progress response.
   *
   * *   `use_lfs` - describes whether the import has been opted in or out of using Git LFS. The value can be `opt_in`,
   * `opt_out`, or `undecided` if no action has been taken.
   * *   `has_large_files` - the boolean value describing whether files larger than 100MB were found during the
   * `importing` step.
   * *   `large_files_size` - the total size in gigabytes of files larger than 100MB found in the originating
   * repository.
   * *   `large_files_count` - the total number of files larger than 100MB found in the originating repository. To see a
   * list of these files, make a "Get Large Files" request.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun migrationsGetImportStatusWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsGetImportStatusResponse> = executor.executeWithResponse<Unit, MigrationsGetImportStatusResponse>(SdkExecutionRequest(migrationsGetImportStatusMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), MigrationsCodecs.migrationsGetImportStatusRequestCodecRegistry, MigrationsGetImportStatusResponseDecoder, options)

  /**
   * List files larger than 100MB found during the import
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MigrationsGetLargeFilesApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded MigrationsGetLargeFilesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsGetLargeFiles(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): List<PorterLargeFile> = executor.executeWithTypedErrors<Unit, MigrationsGetLargeFilesResponse, List<PorterLargeFile>>(
    request = SdkExecutionRequest(migrationsGetLargeFilesMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = MigrationsCodecs.migrationsGetLargeFilesRequestCodecRegistry,
    responseDecoder = MigrationsGetLargeFilesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsGetLargeFilesResponse.SuccessJson -> response.json
        is MigrationsGetLargeFilesResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsGetLargeFilesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsGetLargeFilesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MigrationsGetLargeFilesResponse.Http503Json -> MigrationsGetLargeFilesApiException(response, statusCode, headers)
        is MigrationsGetLargeFilesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List files larger than 100MB found during the import
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun migrationsGetLargeFilesWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsGetLargeFilesResponse> = executor.executeWithResponse<Unit, MigrationsGetLargeFilesResponse>(SdkExecutionRequest(migrationsGetLargeFilesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), MigrationsCodecs.migrationsGetLargeFilesRequestCodecRegistry, MigrationsGetLargeFilesResponseDecoder, options)

  /**
   * Fetches a single user migration. The response includes the `state` of the migration, which can be one of the
   * following values:
   *
   * *   `pending` - the migration hasn't started yet.
   * *   `exporting` - the migration is in progress.
   * *   `exported` - the migration finished successfully.
   * *   `failed` - the migration failed.
   *
   * Once the migration has been `exported` you can [download the migration
   * archive](https://docs.github.com/rest/migrations/users#download-a-user-migration-archive).
   *
   * @param migrationId The unique identifier of the migration.
   * @param exclude Wire parameter `exclude`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MigrationsGetStatusForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded MigrationsGetStatusForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsGetStatusForAuthenticatedUser(
    migrationId: Int,
    exclude: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): Migration = executor.executeWithTypedErrors<Unit, MigrationsGetStatusForAuthenticatedUserResponse, Migration>(
    request = SdkExecutionRequest(migrationsGetStatusForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exclude", values = exclude?.map { it.toString() }.orEmpty()))
    }),
    requestCodecs = MigrationsCodecs.migrationsGetStatusForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = MigrationsGetStatusForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsGetStatusForAuthenticatedUserResponse.SuccessJson -> response.json
        is MigrationsGetStatusForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsGetStatusForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsGetStatusForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsGetStatusForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsGetStatusForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsGetStatusForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MigrationsGetStatusForAuthenticatedUserResponse.Http304NoContent -> MigrationsGetStatusForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsGetStatusForAuthenticatedUserResponse.Http401Json -> MigrationsGetStatusForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsGetStatusForAuthenticatedUserResponse.Http403Json -> MigrationsGetStatusForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsGetStatusForAuthenticatedUserResponse.Http404Json -> MigrationsGetStatusForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsGetStatusForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Fetches a single user migration. The response includes the `state` of the migration, which can be one of the
   * following values:
   *
   * *   `pending` - the migration hasn't started yet.
   * *   `exporting` - the migration is in progress.
   * *   `exported` - the migration finished successfully.
   * *   `failed` - the migration failed.
   *
   * Once the migration has been `exported` you can [download the migration
   * archive](https://docs.github.com/rest/migrations/users#download-a-user-migration-archive).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param migrationId The unique identifier of the migration.
   * @param exclude Wire parameter `exclude`.
   * @param options Execution options.
   */
  public suspend fun migrationsGetStatusForAuthenticatedUserWithResponse(
    migrationId: Int,
    exclude: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsGetStatusForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, MigrationsGetStatusForAuthenticatedUserResponse>(SdkExecutionRequest(migrationsGetStatusForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exclude", values = exclude?.map { it.toString() }.orEmpty()))
  }), MigrationsCodecs.migrationsGetStatusForAuthenticatedUserRequestCodecRegistry, MigrationsGetStatusForAuthenticatedUserResponseDecoder, options)

  /**
   * Fetches the status of a migration.
   *
   * The `state` of a migration can be one of the following values:
   *
   * *   `pending`, which means the migration hasn't started yet.
   * *   `exporting`, which means the migration is in progress.
   * *   `exported`, which means the migration finished successfully.
   * *   `failed`, which means the migration failed.
   *
   * @param migrationId The unique identifier of the migration.
   * @param org The organization name. The name is not case sensitive.
   * @param exclude Exclude attributes from the API response to improve performance
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MigrationsGetStatusForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded MigrationsGetStatusForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsGetStatusForOrg(
    migrationId: Int,
    org: String,
    exclude: List<InlineOrgsMigrationsGetParameterItemX48ce57dc>? = null,
    options: CallOptions = CallOptions(),
  ): Migration = executor.executeWithTypedErrors<Unit, MigrationsGetStatusForOrgResponse, Migration>(
    request = SdkExecutionRequest(migrationsGetStatusForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exclude", values = exclude?.map { it.toString() }.orEmpty()))
    }),
    requestCodecs = MigrationsCodecs.migrationsGetStatusForOrgRequestCodecRegistry,
    responseDecoder = MigrationsGetStatusForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsGetStatusForOrgResponse.SuccessJson -> response.json
        is MigrationsGetStatusForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsGetStatusForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsGetStatusForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MigrationsGetStatusForOrgResponse.Http404Json -> MigrationsGetStatusForOrgApiException(response, statusCode, headers)
        is MigrationsGetStatusForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Fetches the status of a migration.
   *
   * The `state` of a migration can be one of the following values:
   *
   * *   `pending`, which means the migration hasn't started yet.
   * *   `exporting`, which means the migration is in progress.
   * *   `exported`, which means the migration finished successfully.
   * *   `failed`, which means the migration failed.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param migrationId The unique identifier of the migration.
   * @param org The organization name. The name is not case sensitive.
   * @param exclude Exclude attributes from the API response to improve performance
   * @param options Execution options.
   */
  public suspend fun migrationsGetStatusForOrgWithResponse(
    migrationId: Int,
    org: String,
    exclude: List<InlineOrgsMigrationsGetParameterItemX48ce57dc>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsGetStatusForOrgResponse> = executor.executeWithResponse<Unit, MigrationsGetStatusForOrgResponse>(SdkExecutionRequest(migrationsGetStatusForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exclude", values = exclude?.map { it.toString() }.orEmpty()))
  }), MigrationsCodecs.migrationsGetStatusForOrgRequestCodecRegistry, MigrationsGetStatusForOrgResponseDecoder, options)

  /**
   * Lists all migrations a user has started.
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MigrationsListForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded MigrationsListForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsListForAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Migration> = executor.executeWithTypedErrors<Unit, MigrationsListForAuthenticatedUserResponse, List<Migration>>(
    request = SdkExecutionRequest(migrationsListForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = MigrationsCodecs.migrationsListForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = MigrationsListForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsListForAuthenticatedUserResponse.SuccessJson -> response.json
        is MigrationsListForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsListForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsListForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsListForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsListForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MigrationsListForAuthenticatedUserResponse.Http304NoContent -> MigrationsListForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsListForAuthenticatedUserResponse.Http401Json -> MigrationsListForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsListForAuthenticatedUserResponse.Http403Json -> MigrationsListForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsListForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all migrations a user has started.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun migrationsListForAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsListForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, MigrationsListForAuthenticatedUserResponse>(SdkExecutionRequest(migrationsListForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), MigrationsCodecs.migrationsListForAuthenticatedUserRequestCodecRegistry, MigrationsListForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists the most recent migrations, including both exports (which can be started through the REST API) and imports
   * (which cannot be started using the REST API).
   *
   * A list of `repositories` is only returned for export migrations.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param exclude Exclude attributes from the API response to improve performance
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsListForOrg(
    org: String,
    exclude: List<InlineOrgsMigrationsGetParameterItemX712e3bb0>? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Migration> = executor.execute<Unit, List<Migration>>(SdkExecutionRequest(migrationsListForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exclude", values = exclude?.map { it.toString() }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(MigrationsCodecs.MIGRATIONSLISTFORORG_RESPONSE_CODEC_ID), MigrationsCodecs.migrationsListForOrgRequestCodecRegistry, MigrationsCodecs.migrationsListForOrgResponseCodecRegistry, options)

  /**
   * Lists the most recent migrations, including both exports (which can be started through the REST API) and imports
   * (which cannot be started using the REST API).
   *
   * A list of `repositories` is only returned for export migrations.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param exclude Exclude attributes from the API response to improve performance
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun migrationsListForOrgWithResponse(
    org: String,
    exclude: List<InlineOrgsMigrationsGetParameterItemX712e3bb0>? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsListForOrgResponse> = executor.executeWithResponse<Unit, MigrationsListForOrgResponse>(SdkExecutionRequest(migrationsListForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exclude", values = exclude?.map { it.toString() }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), MigrationsCodecs.migrationsListForOrgRequestCodecRegistry, MigrationsListForOrgResponseDecoder, options)

  /**
   * Lists all the repositories for this user migration.
   *
   * @param migrationId The unique identifier of the migration.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MigrationsListReposForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded MigrationsListReposForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsListReposForAuthenticatedUser(
    migrationId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<MinimalRepository> = executor.executeWithTypedErrors<Unit, MigrationsListReposForAuthenticatedUserResponse, List<MinimalRepository>>(
    request = SdkExecutionRequest(migrationsListReposForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = MigrationsCodecs.migrationsListReposForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = MigrationsListReposForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsListReposForAuthenticatedUserResponse.SuccessJson -> response.json
        is MigrationsListReposForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsListReposForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsListReposForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MigrationsListReposForAuthenticatedUserResponse.Http404Json -> MigrationsListReposForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsListReposForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all the repositories for this user migration.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param migrationId The unique identifier of the migration.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun migrationsListReposForAuthenticatedUserWithResponse(
    migrationId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsListReposForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, MigrationsListReposForAuthenticatedUserResponse>(SdkExecutionRequest(migrationsListReposForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), MigrationsCodecs.migrationsListReposForAuthenticatedUserRequestCodecRegistry, MigrationsListReposForAuthenticatedUserResponseDecoder, options)

  /**
   * List all the repositories for this organization migration.
   *
   * @param migrationId The unique identifier of the migration.
   * @param org The organization name. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MigrationsListReposForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded MigrationsListReposForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsListReposForOrg(
    migrationId: Int,
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<MinimalRepository> = executor.executeWithTypedErrors<Unit, MigrationsListReposForOrgResponse, List<MinimalRepository>>(
    request = SdkExecutionRequest(migrationsListReposForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = MigrationsCodecs.migrationsListReposForOrgRequestCodecRegistry,
    responseDecoder = MigrationsListReposForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsListReposForOrgResponse.SuccessJson -> response.json
        is MigrationsListReposForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsListReposForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsListReposForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MigrationsListReposForOrgResponse.Http404Json -> MigrationsListReposForOrgApiException(response, statusCode, headers)
        is MigrationsListReposForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all the repositories for this organization migration.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param migrationId The unique identifier of the migration.
   * @param org The organization name. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun migrationsListReposForOrgWithResponse(
    migrationId: Int,
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsListReposForOrgResponse> = executor.executeWithResponse<Unit, MigrationsListReposForOrgResponse>(SdkExecutionRequest(migrationsListReposForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), MigrationsCodecs.migrationsListReposForOrgRequestCodecRegistry, MigrationsListReposForOrgResponseDecoder, options)

  /**
   * Update an author's identity for the import. Your application can continue updating authors any time before you push
   * new commits to the repository.
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * @param request Request body sent to the operation.
   * @param authorId Wire parameter `author_id`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MigrationsMapCommitAuthorApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded MigrationsMapCommitAuthorError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsMapCommitAuthor(
    request: InlineReposImportAuthorsPatchRequestJsonXe206de08? = null,
    authorId: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): PorterAuthor = executor.executeWithTypedErrors<InlineReposImportAuthorsPatchRequestJsonXe206de08?, MigrationsMapCommitAuthorResponse, PorterAuthor>(
    request = SdkExecutionRequest(migrationsMapCommitAuthorMetadata, baseUri, request, listOf(MigrationsCodecs.MIGRATIONSMAPCOMMITAUTHOR_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "author_id", values = listOf(authorId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = MigrationsCodecs.migrationsMapCommitAuthorRequestCodecRegistry,
    responseDecoder = MigrationsMapCommitAuthorResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsMapCommitAuthorResponse.SuccessJson -> response.json
        is MigrationsMapCommitAuthorResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsMapCommitAuthorResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsMapCommitAuthorResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsMapCommitAuthorResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsMapCommitAuthorResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MigrationsMapCommitAuthorResponse.Http404Json -> MigrationsMapCommitAuthorApiException(response, statusCode, headers)
        is MigrationsMapCommitAuthorResponse.Http422Json -> MigrationsMapCommitAuthorApiException(response, statusCode, headers)
        is MigrationsMapCommitAuthorResponse.Http503Json -> MigrationsMapCommitAuthorApiException(response, statusCode, headers)
        is MigrationsMapCommitAuthorResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Update an author's identity for the import. Your application can continue updating authors any time before you push
   * new commits to the repository.
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param authorId Wire parameter `author_id`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun migrationsMapCommitAuthorWithResponse(
    request: InlineReposImportAuthorsPatchRequestJsonXe206de08? = null,
    authorId: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsMapCommitAuthorResponse> = executor.executeWithResponse<InlineReposImportAuthorsPatchRequestJsonXe206de08?, MigrationsMapCommitAuthorResponse>(SdkExecutionRequest(migrationsMapCommitAuthorMetadata, baseUri, request, listOf(MigrationsCodecs.MIGRATIONSMAPCOMMITAUTHOR_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "author_id", values = listOf(authorId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), MigrationsCodecs.migrationsMapCommitAuthorRequestCodecRegistry, MigrationsMapCommitAuthorResponseDecoder, options)

  /**
   * You can import repositories from Subversion, Mercurial, and TFS that include files larger than 100MB. This ability
   * is powered by [Git LFS](https://git-lfs.com).
   *
   * You can learn more about our LFS feature and working with large files [on our help
   * site](https://docs.github.com/repositories/working-with-files/managing-large-files).
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MigrationsSetLfsPreferenceApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded MigrationsSetLfsPreferenceError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsSetLfsPreference(
    request: InlineReposImportLfsPatchRequestJsonX10e52359,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Import = executor.executeWithTypedErrors<InlineReposImportLfsPatchRequestJsonX10e52359, MigrationsSetLfsPreferenceResponse, Import>(
    request = SdkExecutionRequest(migrationsSetLfsPreferenceMetadata, baseUri, request, listOf(MigrationsCodecs.MIGRATIONSSETLFSPREFERENCE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = MigrationsCodecs.migrationsSetLfsPreferenceRequestCodecRegistry,
    responseDecoder = MigrationsSetLfsPreferenceResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsSetLfsPreferenceResponse.SuccessJson -> response.json
        is MigrationsSetLfsPreferenceResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsSetLfsPreferenceResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsSetLfsPreferenceResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsSetLfsPreferenceResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MigrationsSetLfsPreferenceResponse.Http422Json -> MigrationsSetLfsPreferenceApiException(response, statusCode, headers)
        is MigrationsSetLfsPreferenceResponse.Http503Json -> MigrationsSetLfsPreferenceApiException(response, statusCode, headers)
        is MigrationsSetLfsPreferenceResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * You can import repositories from Subversion, Mercurial, and TFS that include files larger than 100MB. This ability
   * is powered by [Git LFS](https://git-lfs.com).
   *
   * You can learn more about our LFS feature and working with large files [on our help
   * site](https://docs.github.com/repositories/working-with-files/managing-large-files).
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun migrationsSetLfsPreferenceWithResponse(
    request: InlineReposImportLfsPatchRequestJsonX10e52359,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsSetLfsPreferenceResponse> = executor.executeWithResponse<InlineReposImportLfsPatchRequestJsonX10e52359, MigrationsSetLfsPreferenceResponse>(SdkExecutionRequest(migrationsSetLfsPreferenceMetadata, baseUri, request, listOf(MigrationsCodecs.MIGRATIONSSETLFSPREFERENCE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), MigrationsCodecs.migrationsSetLfsPreferenceRequestCodecRegistry, MigrationsSetLfsPreferenceResponseDecoder, options)

  /**
   * Initiates the generation of a user migration archive.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MigrationsStartForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded MigrationsStartForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsStartForAuthenticatedUser(request: InlineUserMigrationsPostRequestJsonXeb2296ad, options: CallOptions = CallOptions()): Migration = executor.executeWithTypedErrors<InlineUserMigrationsPostRequestJsonXeb2296ad, MigrationsStartForAuthenticatedUserResponse, Migration>(
    request = SdkExecutionRequest(migrationsStartForAuthenticatedUserMetadata, baseUri, request, listOf(MigrationsCodecs.MIGRATIONSSTARTFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = MigrationsCodecs.migrationsStartForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = MigrationsStartForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsStartForAuthenticatedUserResponse.SuccessJson -> response.json
        is MigrationsStartForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsStartForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsStartForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsStartForAuthenticatedUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsStartForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsStartForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MigrationsStartForAuthenticatedUserResponse.Http304NoContent -> MigrationsStartForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsStartForAuthenticatedUserResponse.Http401Json -> MigrationsStartForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsStartForAuthenticatedUserResponse.Http403Json -> MigrationsStartForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsStartForAuthenticatedUserResponse.Http422Json -> MigrationsStartForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsStartForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Initiates the generation of a user migration archive.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun migrationsStartForAuthenticatedUserWithResponse(request: InlineUserMigrationsPostRequestJsonXeb2296ad, options: CallOptions = CallOptions()): SdkResponseResult<MigrationsStartForAuthenticatedUserResponse> = executor.executeWithResponse<InlineUserMigrationsPostRequestJsonXeb2296ad, MigrationsStartForAuthenticatedUserResponse>(SdkExecutionRequest(migrationsStartForAuthenticatedUserMetadata, baseUri, request, listOf(MigrationsCodecs.MIGRATIONSSTARTFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()), MigrationsCodecs.migrationsStartForAuthenticatedUserRequestCodecRegistry, MigrationsStartForAuthenticatedUserResponseDecoder, options)

  /**
   * Initiates the generation of a migration archive.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MigrationsStartForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded MigrationsStartForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsStartForOrg(
    request: InlineOrgsMigrationsPostRequestJsonX5797c146,
    org: String,
    options: CallOptions = CallOptions(),
  ): Migration = executor.executeWithTypedErrors<InlineOrgsMigrationsPostRequestJsonX5797c146, MigrationsStartForOrgResponse, Migration>(
    request = SdkExecutionRequest(migrationsStartForOrgMetadata, baseUri, request, listOf(MigrationsCodecs.MIGRATIONSSTARTFORORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = MigrationsCodecs.migrationsStartForOrgRequestCodecRegistry,
    responseDecoder = MigrationsStartForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsStartForOrgResponse.SuccessJson -> response.json
        is MigrationsStartForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsStartForOrgResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsStartForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsStartForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MigrationsStartForOrgResponse.Http404Json -> MigrationsStartForOrgApiException(response, statusCode, headers)
        is MigrationsStartForOrgResponse.Http422Json -> MigrationsStartForOrgApiException(response, statusCode, headers)
        is MigrationsStartForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Initiates the generation of a migration archive.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun migrationsStartForOrgWithResponse(
    request: InlineOrgsMigrationsPostRequestJsonX5797c146,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsStartForOrgResponse> = executor.executeWithResponse<InlineOrgsMigrationsPostRequestJsonX5797c146, MigrationsStartForOrgResponse>(SdkExecutionRequest(migrationsStartForOrgMetadata, baseUri, request, listOf(MigrationsCodecs.MIGRATIONSSTARTFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), MigrationsCodecs.migrationsStartForOrgRequestCodecRegistry, MigrationsStartForOrgResponseDecoder, options)

  /**
   * Start a source import to a GitHub repository using GitHub Importer.
   * Importing into a GitHub repository with GitHub Actions enabled is not supported and will
   * return a status `422 Unprocessable Entity` response.
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MigrationsStartImportApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded MigrationsStartImportError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsStartImport(
    request: InlineReposImportPutRequestJsonXdd1ac961,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Import = executor.executeWithTypedErrors<InlineReposImportPutRequestJsonXdd1ac961, MigrationsStartImportResponse, Import>(
    request = SdkExecutionRequest(migrationsStartImportMetadata, baseUri, request, listOf(MigrationsCodecs.MIGRATIONSSTARTIMPORT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = MigrationsCodecs.migrationsStartImportRequestCodecRegistry,
    responseDecoder = MigrationsStartImportResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsStartImportResponse.SuccessJson -> response.json
        is MigrationsStartImportResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsStartImportResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsStartImportResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsStartImportResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsStartImportResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MigrationsStartImportResponse.Http404Json -> MigrationsStartImportApiException(response, statusCode, headers)
        is MigrationsStartImportResponse.Http422Json -> MigrationsStartImportApiException(response, statusCode, headers)
        is MigrationsStartImportResponse.Http503Json -> MigrationsStartImportApiException(response, statusCode, headers)
        is MigrationsStartImportResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Start a source import to a GitHub repository using GitHub Importer.
   * Importing into a GitHub repository with GitHub Actions enabled is not supported and will
   * return a status `422 Unprocessable Entity` response.
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun migrationsStartImportWithResponse(
    request: InlineReposImportPutRequestJsonXdd1ac961,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsStartImportResponse> = executor.executeWithResponse<InlineReposImportPutRequestJsonXdd1ac961, MigrationsStartImportResponse>(SdkExecutionRequest(migrationsStartImportMetadata, baseUri, request, listOf(MigrationsCodecs.MIGRATIONSSTARTIMPORT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), MigrationsCodecs.migrationsStartImportRequestCodecRegistry, MigrationsStartImportResponseDecoder, options)

  /**
   * Unlocks a repository. You can lock repositories when you [start a user
   * migration](https://docs.github.com/rest/migrations/users#start-a-user-migration). Once the migration is complete
   * you can unlock each repository to begin using it again or [delete the
   * repository](https://docs.github.com/rest/repos/repos#delete-a-repository) if you no longer need the source data.
   * Returns a status of `404 Not Found` if the repository is not locked.
   *
   * @param migrationId The unique identifier of the migration.
   * @param repoName repo_name parameter
   * @param options Execution options.
   * @return No response body.
   * @throws MigrationsUnlockRepoForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded MigrationsUnlockRepoForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsUnlockRepoForAuthenticatedUser(
    migrationId: Int,
    repoName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, MigrationsUnlockRepoForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(migrationsUnlockRepoForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo_name", values = listOf(repoName.toString())))
    }),
    requestCodecs = MigrationsCodecs.migrationsUnlockRepoForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = MigrationsUnlockRepoForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsUnlockRepoForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is MigrationsUnlockRepoForAuthenticatedUserResponse.Http304NoContent -> response.unit
        is MigrationsUnlockRepoForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsUnlockRepoForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsUnlockRepoForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsUnlockRepoForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsUnlockRepoForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is MigrationsUnlockRepoForAuthenticatedUserResponse.Http304NoContent -> MigrationsUnlockRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsUnlockRepoForAuthenticatedUserResponse.Http401Json -> MigrationsUnlockRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsUnlockRepoForAuthenticatedUserResponse.Http403Json -> MigrationsUnlockRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsUnlockRepoForAuthenticatedUserResponse.Http404Json -> MigrationsUnlockRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is MigrationsUnlockRepoForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Unlocks a repository. You can lock repositories when you [start a user
   * migration](https://docs.github.com/rest/migrations/users#start-a-user-migration). Once the migration is complete
   * you can unlock each repository to begin using it again or [delete the
   * repository](https://docs.github.com/rest/repos/repos#delete-a-repository) if you no longer need the source data.
   * Returns a status of `404 Not Found` if the repository is not locked.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param migrationId The unique identifier of the migration.
   * @param repoName repo_name parameter
   * @param options Execution options.
   */
  public suspend fun migrationsUnlockRepoForAuthenticatedUserWithResponse(
    migrationId: Int,
    repoName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsUnlockRepoForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, MigrationsUnlockRepoForAuthenticatedUserResponse>(SdkExecutionRequest(migrationsUnlockRepoForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo_name", values = listOf(repoName.toString())))
  }), MigrationsCodecs.migrationsUnlockRepoForAuthenticatedUserRequestCodecRegistry, MigrationsUnlockRepoForAuthenticatedUserResponseDecoder, options)

  /**
   * Unlocks a repository that was locked for migration. You should unlock each migrated repository and [delete
   * them](https://docs.github.com/rest/repos/repos#delete-a-repository) when the migration is complete and you no
   * longer need the source data.
   *
   * @param migrationId The unique identifier of the migration.
   * @param org The organization name. The name is not case sensitive.
   * @param repoName repo_name parameter
   * @param options Execution options.
   * @return No response body.
   * @throws MigrationsUnlockRepoForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded MigrationsUnlockRepoForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsUnlockRepoForOrg(
    migrationId: Int,
    org: String,
    repoName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, MigrationsUnlockRepoForOrgResponse, Unit>(
    request = SdkExecutionRequest(migrationsUnlockRepoForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo_name", values = listOf(repoName.toString())))
    }),
    requestCodecs = MigrationsCodecs.migrationsUnlockRepoForOrgRequestCodecRegistry,
    responseDecoder = MigrationsUnlockRepoForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsUnlockRepoForOrgResponse.SuccessNoContent -> response.unit
        is MigrationsUnlockRepoForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsUnlockRepoForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsUnlockRepoForOrgResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is MigrationsUnlockRepoForOrgResponse.Http404Json -> MigrationsUnlockRepoForOrgApiException(response, statusCode, headers)
        is MigrationsUnlockRepoForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Unlocks a repository that was locked for migration. You should unlock each migrated repository and [delete
   * them](https://docs.github.com/rest/repos/repos#delete-a-repository) when the migration is complete and you no
   * longer need the source data.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param migrationId The unique identifier of the migration.
   * @param org The organization name. The name is not case sensitive.
   * @param repoName repo_name parameter
   * @param options Execution options.
   */
  public suspend fun migrationsUnlockRepoForOrgWithResponse(
    migrationId: Int,
    org: String,
    repoName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsUnlockRepoForOrgResponse> = executor.executeWithResponse<Unit, MigrationsUnlockRepoForOrgResponse>(SdkExecutionRequest(migrationsUnlockRepoForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "migration_id", values = listOf(migrationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo_name", values = listOf(repoName.toString())))
  }), MigrationsCodecs.migrationsUnlockRepoForOrgRequestCodecRegistry, MigrationsUnlockRepoForOrgResponseDecoder, options)

  /**
   * An import can be updated with credentials or a project choice by passing in the appropriate parameters in this API
   * request. If no parameters are provided, the import will be restarted.
   *
   * Some servers (e.g. TFS servers) can have several projects at a single URL. In those cases the import progress will
   * have the status `detection_found_multiple` and the Import Progress response will include a `project_choices` array.
   * You can select the project to import by providing one of the objects in the `project_choices` array in the update
   * request.
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MigrationsUpdateImportApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded MigrationsUpdateImportError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun migrationsUpdateImport(
    request: InlineReposImportPatchRequestJsonX9aa72b45? = null,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Import = executor.executeWithTypedErrors<InlineReposImportPatchRequestJsonX9aa72b45?, MigrationsUpdateImportResponse, Import>(
    request = SdkExecutionRequest(migrationsUpdateImportMetadata, baseUri, request, listOf(MigrationsCodecs.MIGRATIONSUPDATEIMPORT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = MigrationsCodecs.migrationsUpdateImportRequestCodecRegistry,
    responseDecoder = MigrationsUpdateImportResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MigrationsUpdateImportResponse.SuccessJson -> response.json
        is MigrationsUpdateImportResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is MigrationsUpdateImportResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MigrationsUpdateImportResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MigrationsUpdateImportResponse.Http503Json -> MigrationsUpdateImportApiException(response, statusCode, headers)
        is MigrationsUpdateImportResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * An import can be updated with credentials or a project choice by passing in the appropriate parameters in this API
   * request. If no parameters are provided, the import will be restarted.
   *
   * Some servers (e.g. TFS servers) can have several projects at a single URL. In those cases the import progress will
   * have the status `detection_found_multiple` and the Import Progress response will include a `project_choices` array.
   * You can select the project to import by providing one of the objects in the `project_choices` array in the update
   * request.
   *
   * > [!WARNING]
   * > **Endpoint closing down notice:** Due to very low levels of usage and available alternatives, this endpoint is
   * closing down and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives,
   * see the [changelog](https://gh.io/source-imports-api-deprecation).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun migrationsUpdateImportWithResponse(
    request: InlineReposImportPatchRequestJsonX9aa72b45? = null,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<MigrationsUpdateImportResponse> = executor.executeWithResponse<InlineReposImportPatchRequestJsonX9aa72b45?, MigrationsUpdateImportResponse>(SdkExecutionRequest(migrationsUpdateImportMetadata, baseUri, request, listOf(MigrationsCodecs.MIGRATIONSUPDATEIMPORT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), MigrationsCodecs.migrationsUpdateImportRequestCodecRegistry, MigrationsUpdateImportResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `migrations/cancel-import` may expose through its typed API
   * exception.
   */
  public sealed interface MigrationsCancelImportError

  /**
   * Typed response alternatives for `migrations/cancel-import`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface MigrationsCancelImportResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsCancelImportResponse

    public class Http503Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsCancelImportResponse,
        MigrationsCancelImportError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsCancelImportResponse
  }

  /**
   * Raised by `migrations/cancel-import` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class MigrationsCancelImportApiException(
    public val error: MigrationsCancelImportError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/cancel-import")

  private object MigrationsCancelImportResponseDecoder : SdkResponseAlternativeDecoder<MigrationsCancelImportResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsCancelImportResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsCancelImportResponse> = when {
      alternative.id == "migrations/cancel-import.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsCancelImportResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/cancel-import.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsCancelImportResponse.Http503Json(
          json = MigrationsCodecs.migrationsCancelImportResponseCodecAlternative1Registry.select(listOf("migrations/cancel-import.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsCancelImportResponse = MigrationsCancelImportResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/delete-archive-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface MigrationsDeleteArchiveForAuthenticatedUserError

  /**
   * Typed response alternatives for `migrations/delete-archive-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface MigrationsDeleteArchiveForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsDeleteArchiveForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsDeleteArchiveForAuthenticatedUserResponse,
        MigrationsDeleteArchiveForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsDeleteArchiveForAuthenticatedUserResponse,
        MigrationsDeleteArchiveForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsDeleteArchiveForAuthenticatedUserResponse,
        MigrationsDeleteArchiveForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsDeleteArchiveForAuthenticatedUserResponse,
        MigrationsDeleteArchiveForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsDeleteArchiveForAuthenticatedUserResponse
  }

  /**
   * Raised by `migrations/delete-archive-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class MigrationsDeleteArchiveForAuthenticatedUserApiException(
    public val error: MigrationsDeleteArchiveForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/delete-archive-for-authenticated-user")

  private object MigrationsDeleteArchiveForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<MigrationsDeleteArchiveForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsDeleteArchiveForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsDeleteArchiveForAuthenticatedUserResponse> = when {
      alternative.id == "migrations/delete-archive-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsDeleteArchiveForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/delete-archive-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsDeleteArchiveForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/delete-archive-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = MigrationsDeleteArchiveForAuthenticatedUserResponse.Http401Json(
          json = MigrationsCodecs.migrationsDeleteArchiveForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("migrations/delete-archive-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/delete-archive-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = MigrationsDeleteArchiveForAuthenticatedUserResponse.Http403Json(
          json = MigrationsCodecs.migrationsDeleteArchiveForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("migrations/delete-archive-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/delete-archive-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = MigrationsDeleteArchiveForAuthenticatedUserResponse.Http404Json(
          json = MigrationsCodecs.migrationsDeleteArchiveForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("migrations/delete-archive-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsDeleteArchiveForAuthenticatedUserResponse = MigrationsDeleteArchiveForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/delete-archive-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface MigrationsDeleteArchiveForOrgError

  /**
   * Typed response alternatives for `migrations/delete-archive-for-org`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface MigrationsDeleteArchiveForOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsDeleteArchiveForOrgResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsDeleteArchiveForOrgResponse,
        MigrationsDeleteArchiveForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsDeleteArchiveForOrgResponse
  }

  /**
   * Raised by `migrations/delete-archive-for-org` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class MigrationsDeleteArchiveForOrgApiException(
    public val error: MigrationsDeleteArchiveForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/delete-archive-for-org")

  private object MigrationsDeleteArchiveForOrgResponseDecoder : SdkResponseAlternativeDecoder<MigrationsDeleteArchiveForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsDeleteArchiveForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsDeleteArchiveForOrgResponse> = when {
      alternative.id == "migrations/delete-archive-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsDeleteArchiveForOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/delete-archive-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsDeleteArchiveForOrgResponse.Http404Json(
          json = MigrationsCodecs.migrationsDeleteArchiveForOrgResponseCodecAlternative1Registry.select(listOf("migrations/delete-archive-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsDeleteArchiveForOrgResponse = MigrationsDeleteArchiveForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/download-archive-for-org` may expose through its typed
   * API exception.
   */
  public sealed interface MigrationsDownloadArchiveForOrgError

  /**
   * Typed response alternatives for `migrations/download-archive-for-org`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface MigrationsDownloadArchiveForOrgResponse {
    public class Http302NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsDownloadArchiveForOrgResponse,
        MigrationsDownloadArchiveForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsDownloadArchiveForOrgResponse,
        MigrationsDownloadArchiveForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsDownloadArchiveForOrgResponse
  }

  /**
   * Raised by `migrations/download-archive-for-org` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class MigrationsDownloadArchiveForOrgApiException(
    public val error: MigrationsDownloadArchiveForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/download-archive-for-org")

  private object MigrationsDownloadArchiveForOrgResponseDecoder : SdkResponseAlternativeDecoder<MigrationsDownloadArchiveForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsDownloadArchiveForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsDownloadArchiveForOrgResponse> = when {
      alternative.id == "migrations/download-archive-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsDownloadArchiveForOrgResponse.Http302NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/download-archive-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsDownloadArchiveForOrgResponse.Http404Json(
          json = MigrationsCodecs.migrationsDownloadArchiveForOrgResponseCodecAlternative1Registry.select(listOf("migrations/download-archive-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsDownloadArchiveForOrgResponse = MigrationsDownloadArchiveForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/get-archive-for-authenticated-user` may expose through
   * its typed API exception.
   */
  public sealed interface MigrationsGetArchiveForAuthenticatedUserError

  /**
   * Typed response alternatives for `migrations/get-archive-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface MigrationsGetArchiveForAuthenticatedUserResponse {
    public class Http302NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetArchiveForAuthenticatedUserResponse,
        MigrationsGetArchiveForAuthenticatedUserError

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetArchiveForAuthenticatedUserResponse,
        MigrationsGetArchiveForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetArchiveForAuthenticatedUserResponse,
        MigrationsGetArchiveForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetArchiveForAuthenticatedUserResponse,
        MigrationsGetArchiveForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetArchiveForAuthenticatedUserResponse
  }

  /**
   * Raised by `migrations/get-archive-for-authenticated-user` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class MigrationsGetArchiveForAuthenticatedUserApiException(
    public val error: MigrationsGetArchiveForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/get-archive-for-authenticated-user")

  private object MigrationsGetArchiveForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<MigrationsGetArchiveForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsGetArchiveForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsGetArchiveForAuthenticatedUserResponse> = when {
      alternative.id == "migrations/get-archive-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsGetArchiveForAuthenticatedUserResponse.Http302NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/get-archive-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsGetArchiveForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/get-archive-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = MigrationsGetArchiveForAuthenticatedUserResponse.Http401Json(
          json = MigrationsCodecs.migrationsGetArchiveForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("migrations/get-archive-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/get-archive-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = MigrationsGetArchiveForAuthenticatedUserResponse.Http403Json(
          json = MigrationsCodecs.migrationsGetArchiveForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("migrations/get-archive-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsGetArchiveForAuthenticatedUserResponse = MigrationsGetArchiveForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/get-commit-authors` may expose through its typed API
   * exception.
   */
  public sealed interface MigrationsGetCommitAuthorsError

  /**
   * Typed response alternatives for `migrations/get-commit-authors`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface MigrationsGetCommitAuthorsResponse {
    public class SuccessJson(
      public val json: List<PorterAuthor>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetCommitAuthorsResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetCommitAuthorsResponse,
        MigrationsGetCommitAuthorsError

    public class Http503Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetCommitAuthorsResponse,
        MigrationsGetCommitAuthorsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetCommitAuthorsResponse
  }

  /**
   * Raised by `migrations/get-commit-authors` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class MigrationsGetCommitAuthorsApiException(
    public val error: MigrationsGetCommitAuthorsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/get-commit-authors")

  private object MigrationsGetCommitAuthorsResponseDecoder : SdkResponseAlternativeDecoder<MigrationsGetCommitAuthorsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsGetCommitAuthorsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsGetCommitAuthorsResponse> = when {
      alternative.id == "migrations/get-commit-authors.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsGetCommitAuthorsResponse.SuccessJson(
          json = MigrationsCodecs.migrationsGetCommitAuthorsResponseCodecAlternative0Registry.select(listOf("migrations/get-commit-authors.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/get-commit-authors.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsGetCommitAuthorsResponse.Http404Json(
          json = MigrationsCodecs.migrationsGetCommitAuthorsResponseCodecAlternative1Registry.select(listOf("migrations/get-commit-authors.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/get-commit-authors.response.alternative2" -> SdkResponseDecodeResult(
        value = MigrationsGetCommitAuthorsResponse.Http503Json(
          json = MigrationsCodecs.migrationsGetCommitAuthorsResponseCodecAlternative2Registry.select(listOf("migrations/get-commit-authors.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsGetCommitAuthorsResponse = MigrationsGetCommitAuthorsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/get-import-status` may expose through its typed API
   * exception.
   */
  public sealed interface MigrationsGetImportStatusError

  /**
   * Typed response alternatives for `migrations/get-import-status`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface MigrationsGetImportStatusResponse {
    public class SuccessJson(
      public val json: Import,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetImportStatusResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetImportStatusResponse,
        MigrationsGetImportStatusError

    public class Http503Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetImportStatusResponse,
        MigrationsGetImportStatusError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetImportStatusResponse
  }

  /**
   * Raised by `migrations/get-import-status` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class MigrationsGetImportStatusApiException(
    public val error: MigrationsGetImportStatusError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/get-import-status")

  private object MigrationsGetImportStatusResponseDecoder : SdkResponseAlternativeDecoder<MigrationsGetImportStatusResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsGetImportStatusResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsGetImportStatusResponse> = when {
      alternative.id == "migrations/get-import-status.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsGetImportStatusResponse.SuccessJson(
          json = MigrationsCodecs.migrationsGetImportStatusResponseCodecAlternative0Registry.select(listOf("migrations/get-import-status.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/get-import-status.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsGetImportStatusResponse.Http404Json(
          json = MigrationsCodecs.migrationsGetImportStatusResponseCodecAlternative1Registry.select(listOf("migrations/get-import-status.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/get-import-status.response.alternative2" -> SdkResponseDecodeResult(
        value = MigrationsGetImportStatusResponse.Http503Json(
          json = MigrationsCodecs.migrationsGetImportStatusResponseCodecAlternative2Registry.select(listOf("migrations/get-import-status.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsGetImportStatusResponse = MigrationsGetImportStatusResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/get-large-files` may expose through its typed API
   * exception.
   */
  public sealed interface MigrationsGetLargeFilesError

  /**
   * Typed response alternatives for `migrations/get-large-files`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface MigrationsGetLargeFilesResponse {
    public class SuccessJson(
      public val json: List<PorterLargeFile>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetLargeFilesResponse

    public class Http503Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetLargeFilesResponse,
        MigrationsGetLargeFilesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetLargeFilesResponse
  }

  /**
   * Raised by `migrations/get-large-files` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class MigrationsGetLargeFilesApiException(
    public val error: MigrationsGetLargeFilesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/get-large-files")

  private object MigrationsGetLargeFilesResponseDecoder : SdkResponseAlternativeDecoder<MigrationsGetLargeFilesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsGetLargeFilesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsGetLargeFilesResponse> = when {
      alternative.id == "migrations/get-large-files.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsGetLargeFilesResponse.SuccessJson(
          json = MigrationsCodecs.migrationsGetLargeFilesResponseCodecAlternative0Registry.select(listOf("migrations/get-large-files.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/get-large-files.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsGetLargeFilesResponse.Http503Json(
          json = MigrationsCodecs.migrationsGetLargeFilesResponseCodecAlternative1Registry.select(listOf("migrations/get-large-files.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsGetLargeFilesResponse = MigrationsGetLargeFilesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/get-status-for-authenticated-user` may expose through
   * its typed API exception.
   */
  public sealed interface MigrationsGetStatusForAuthenticatedUserError

  /**
   * Typed response alternatives for `migrations/get-status-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface MigrationsGetStatusForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: Migration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetStatusForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetStatusForAuthenticatedUserResponse,
        MigrationsGetStatusForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetStatusForAuthenticatedUserResponse,
        MigrationsGetStatusForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetStatusForAuthenticatedUserResponse,
        MigrationsGetStatusForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetStatusForAuthenticatedUserResponse,
        MigrationsGetStatusForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetStatusForAuthenticatedUserResponse
  }

  /**
   * Raised by `migrations/get-status-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class MigrationsGetStatusForAuthenticatedUserApiException(
    public val error: MigrationsGetStatusForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/get-status-for-authenticated-user")

  private object MigrationsGetStatusForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<MigrationsGetStatusForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsGetStatusForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsGetStatusForAuthenticatedUserResponse> = when {
      alternative.id == "migrations/get-status-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsGetStatusForAuthenticatedUserResponse.SuccessJson(
          json = MigrationsCodecs.migrationsGetStatusForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("migrations/get-status-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/get-status-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsGetStatusForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/get-status-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = MigrationsGetStatusForAuthenticatedUserResponse.Http401Json(
          json = MigrationsCodecs.migrationsGetStatusForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("migrations/get-status-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/get-status-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = MigrationsGetStatusForAuthenticatedUserResponse.Http403Json(
          json = MigrationsCodecs.migrationsGetStatusForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("migrations/get-status-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/get-status-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = MigrationsGetStatusForAuthenticatedUserResponse.Http404Json(
          json = MigrationsCodecs.migrationsGetStatusForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("migrations/get-status-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsGetStatusForAuthenticatedUserResponse = MigrationsGetStatusForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/get-status-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface MigrationsGetStatusForOrgError

  /**
   * Typed response alternatives for `migrations/get-status-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface MigrationsGetStatusForOrgResponse {
    public class SuccessJson(
      public val json: Migration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetStatusForOrgResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetStatusForOrgResponse,
        MigrationsGetStatusForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsGetStatusForOrgResponse
  }

  /**
   * Raised by `migrations/get-status-for-org` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class MigrationsGetStatusForOrgApiException(
    public val error: MigrationsGetStatusForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/get-status-for-org")

  private object MigrationsGetStatusForOrgResponseDecoder : SdkResponseAlternativeDecoder<MigrationsGetStatusForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsGetStatusForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsGetStatusForOrgResponse> = when {
      alternative.id == "migrations/get-status-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsGetStatusForOrgResponse.SuccessJson(
          json = MigrationsCodecs.migrationsGetStatusForOrgResponseCodecAlternative0Registry.select(listOf("migrations/get-status-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/get-status-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsGetStatusForOrgResponse.Http404Json(
          json = MigrationsCodecs.migrationsGetStatusForOrgResponseCodecAlternative1Registry.select(listOf("migrations/get-status-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsGetStatusForOrgResponse = MigrationsGetStatusForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/list-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface MigrationsListForAuthenticatedUserError

  /**
   * Typed response alternatives for `migrations/list-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface MigrationsListForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<Migration>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsListForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsListForAuthenticatedUserResponse,
        MigrationsListForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsListForAuthenticatedUserResponse,
        MigrationsListForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsListForAuthenticatedUserResponse,
        MigrationsListForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsListForAuthenticatedUserResponse
  }

  /**
   * Raised by `migrations/list-for-authenticated-user` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class MigrationsListForAuthenticatedUserApiException(
    public val error: MigrationsListForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/list-for-authenticated-user")

  private object MigrationsListForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<MigrationsListForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsListForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsListForAuthenticatedUserResponse> = when {
      alternative.id == "migrations/list-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsListForAuthenticatedUserResponse.SuccessJson(
          json = MigrationsCodecs.migrationsListForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("migrations/list-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/list-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsListForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/list-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = MigrationsListForAuthenticatedUserResponse.Http401Json(
          json = MigrationsCodecs.migrationsListForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("migrations/list-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/list-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = MigrationsListForAuthenticatedUserResponse.Http403Json(
          json = MigrationsCodecs.migrationsListForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("migrations/list-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsListForAuthenticatedUserResponse = MigrationsListForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `migrations/list-for-org`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface MigrationsListForOrgResponse {
    public class SuccessJson(
      public val json: List<Migration>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsListForOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsListForOrgResponse
  }

  private object MigrationsListForOrgResponseDecoder : SdkResponseAlternativeDecoder<MigrationsListForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsListForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsListForOrgResponse> = when {
      alternative.id == "migrations/list-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsListForOrgResponse.SuccessJson(
          json = MigrationsCodecs.migrationsListForOrgResponseCodecAlternative0Registry.select(listOf("migrations/list-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsListForOrgResponse = MigrationsListForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/list-repos-for-authenticated-user` may expose through
   * its typed API exception.
   */
  public sealed interface MigrationsListReposForAuthenticatedUserError

  /**
   * Typed response alternatives for `migrations/list-repos-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface MigrationsListReposForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<MinimalRepository>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsListReposForAuthenticatedUserResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsListReposForAuthenticatedUserResponse,
        MigrationsListReposForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsListReposForAuthenticatedUserResponse
  }

  /**
   * Raised by `migrations/list-repos-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class MigrationsListReposForAuthenticatedUserApiException(
    public val error: MigrationsListReposForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/list-repos-for-authenticated-user")

  private object MigrationsListReposForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<MigrationsListReposForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsListReposForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsListReposForAuthenticatedUserResponse> = when {
      alternative.id == "migrations/list-repos-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsListReposForAuthenticatedUserResponse.SuccessJson(
          json = MigrationsCodecs.migrationsListReposForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("migrations/list-repos-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/list-repos-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsListReposForAuthenticatedUserResponse.Http404Json(
          json = MigrationsCodecs.migrationsListReposForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("migrations/list-repos-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsListReposForAuthenticatedUserResponse = MigrationsListReposForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/list-repos-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface MigrationsListReposForOrgError

  /**
   * Typed response alternatives for `migrations/list-repos-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface MigrationsListReposForOrgResponse {
    public class SuccessJson(
      public val json: List<MinimalRepository>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsListReposForOrgResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsListReposForOrgResponse,
        MigrationsListReposForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsListReposForOrgResponse
  }

  /**
   * Raised by `migrations/list-repos-for-org` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class MigrationsListReposForOrgApiException(
    public val error: MigrationsListReposForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/list-repos-for-org")

  private object MigrationsListReposForOrgResponseDecoder : SdkResponseAlternativeDecoder<MigrationsListReposForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsListReposForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsListReposForOrgResponse> = when {
      alternative.id == "migrations/list-repos-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsListReposForOrgResponse.SuccessJson(
          json = MigrationsCodecs.migrationsListReposForOrgResponseCodecAlternative0Registry.select(listOf("migrations/list-repos-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/list-repos-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsListReposForOrgResponse.Http404Json(
          json = MigrationsCodecs.migrationsListReposForOrgResponseCodecAlternative1Registry.select(listOf("migrations/list-repos-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsListReposForOrgResponse = MigrationsListReposForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/map-commit-author` may expose through its typed API
   * exception.
   */
  public sealed interface MigrationsMapCommitAuthorError

  /**
   * Typed response alternatives for `migrations/map-commit-author`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface MigrationsMapCommitAuthorResponse {
    public class SuccessJson(
      public val json: PorterAuthor,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsMapCommitAuthorResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsMapCommitAuthorResponse,
        MigrationsMapCommitAuthorError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsMapCommitAuthorResponse,
        MigrationsMapCommitAuthorError

    public class Http503Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsMapCommitAuthorResponse,
        MigrationsMapCommitAuthorError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsMapCommitAuthorResponse
  }

  /**
   * Raised by `migrations/map-commit-author` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class MigrationsMapCommitAuthorApiException(
    public val error: MigrationsMapCommitAuthorError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/map-commit-author")

  private object MigrationsMapCommitAuthorResponseDecoder : SdkResponseAlternativeDecoder<MigrationsMapCommitAuthorResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsMapCommitAuthorResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsMapCommitAuthorResponse> = when {
      alternative.id == "migrations/map-commit-author.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsMapCommitAuthorResponse.SuccessJson(
          json = MigrationsCodecs.migrationsMapCommitAuthorResponseCodecAlternative0Registry.select(listOf("migrations/map-commit-author.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/map-commit-author.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsMapCommitAuthorResponse.Http404Json(
          json = MigrationsCodecs.migrationsMapCommitAuthorResponseCodecAlternative1Registry.select(listOf("migrations/map-commit-author.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/map-commit-author.response.alternative2" -> SdkResponseDecodeResult(
        value = MigrationsMapCommitAuthorResponse.Http422Json(
          json = MigrationsCodecs.migrationsMapCommitAuthorResponseCodecAlternative2Registry.select(listOf("migrations/map-commit-author.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/map-commit-author.response.alternative3" -> SdkResponseDecodeResult(
        value = MigrationsMapCommitAuthorResponse.Http503Json(
          json = MigrationsCodecs.migrationsMapCommitAuthorResponseCodecAlternative3Registry.select(listOf("migrations/map-commit-author.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsMapCommitAuthorResponse = MigrationsMapCommitAuthorResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/set-lfs-preference` may expose through its typed API
   * exception.
   */
  public sealed interface MigrationsSetLfsPreferenceError

  /**
   * Typed response alternatives for `migrations/set-lfs-preference`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface MigrationsSetLfsPreferenceResponse {
    public class SuccessJson(
      public val json: Import,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsSetLfsPreferenceResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsSetLfsPreferenceResponse,
        MigrationsSetLfsPreferenceError

    public class Http503Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsSetLfsPreferenceResponse,
        MigrationsSetLfsPreferenceError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsSetLfsPreferenceResponse
  }

  /**
   * Raised by `migrations/set-lfs-preference` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class MigrationsSetLfsPreferenceApiException(
    public val error: MigrationsSetLfsPreferenceError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/set-lfs-preference")

  private object MigrationsSetLfsPreferenceResponseDecoder : SdkResponseAlternativeDecoder<MigrationsSetLfsPreferenceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsSetLfsPreferenceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsSetLfsPreferenceResponse> = when {
      alternative.id == "migrations/set-lfs-preference.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsSetLfsPreferenceResponse.SuccessJson(
          json = MigrationsCodecs.migrationsSetLfsPreferenceResponseCodecAlternative0Registry.select(listOf("migrations/set-lfs-preference.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/set-lfs-preference.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsSetLfsPreferenceResponse.Http422Json(
          json = MigrationsCodecs.migrationsSetLfsPreferenceResponseCodecAlternative1Registry.select(listOf("migrations/set-lfs-preference.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/set-lfs-preference.response.alternative2" -> SdkResponseDecodeResult(
        value = MigrationsSetLfsPreferenceResponse.Http503Json(
          json = MigrationsCodecs.migrationsSetLfsPreferenceResponseCodecAlternative2Registry.select(listOf("migrations/set-lfs-preference.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsSetLfsPreferenceResponse = MigrationsSetLfsPreferenceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/start-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface MigrationsStartForAuthenticatedUserError

  /**
   * Typed response alternatives for `migrations/start-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface MigrationsStartForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: Migration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsStartForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsStartForAuthenticatedUserResponse,
        MigrationsStartForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsStartForAuthenticatedUserResponse,
        MigrationsStartForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsStartForAuthenticatedUserResponse,
        MigrationsStartForAuthenticatedUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsStartForAuthenticatedUserResponse,
        MigrationsStartForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsStartForAuthenticatedUserResponse
  }

  /**
   * Raised by `migrations/start-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class MigrationsStartForAuthenticatedUserApiException(
    public val error: MigrationsStartForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/start-for-authenticated-user")

  private object MigrationsStartForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<MigrationsStartForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsStartForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsStartForAuthenticatedUserResponse> = when {
      alternative.id == "migrations/start-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsStartForAuthenticatedUserResponse.SuccessJson(
          json = MigrationsCodecs.migrationsStartForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("migrations/start-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/start-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsStartForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/start-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = MigrationsStartForAuthenticatedUserResponse.Http401Json(
          json = MigrationsCodecs.migrationsStartForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("migrations/start-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/start-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = MigrationsStartForAuthenticatedUserResponse.Http403Json(
          json = MigrationsCodecs.migrationsStartForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("migrations/start-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/start-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = MigrationsStartForAuthenticatedUserResponse.Http422Json(
          json = MigrationsCodecs.migrationsStartForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("migrations/start-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsStartForAuthenticatedUserResponse = MigrationsStartForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/start-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface MigrationsStartForOrgError

  /**
   * Typed response alternatives for `migrations/start-for-org`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface MigrationsStartForOrgResponse {
    public class SuccessJson(
      public val json: Migration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsStartForOrgResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsStartForOrgResponse,
        MigrationsStartForOrgError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsStartForOrgResponse,
        MigrationsStartForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsStartForOrgResponse
  }

  /**
   * Raised by `migrations/start-for-org` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class MigrationsStartForOrgApiException(
    public val error: MigrationsStartForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/start-for-org")

  private object MigrationsStartForOrgResponseDecoder : SdkResponseAlternativeDecoder<MigrationsStartForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsStartForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsStartForOrgResponse> = when {
      alternative.id == "migrations/start-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsStartForOrgResponse.SuccessJson(
          json = MigrationsCodecs.migrationsStartForOrgResponseCodecAlternative0Registry.select(listOf("migrations/start-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/start-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsStartForOrgResponse.Http404Json(
          json = MigrationsCodecs.migrationsStartForOrgResponseCodecAlternative1Registry.select(listOf("migrations/start-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/start-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = MigrationsStartForOrgResponse.Http422Json(
          json = MigrationsCodecs.migrationsStartForOrgResponseCodecAlternative2Registry.select(listOf("migrations/start-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsStartForOrgResponse = MigrationsStartForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/start-import` may expose through its typed API
   * exception.
   */
  public sealed interface MigrationsStartImportError

  /**
   * Typed response alternatives for `migrations/start-import`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface MigrationsStartImportResponse {
    public class SuccessJson(
      public val json: Import,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsStartImportResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsStartImportResponse,
        MigrationsStartImportError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsStartImportResponse,
        MigrationsStartImportError

    public class Http503Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsStartImportResponse,
        MigrationsStartImportError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsStartImportResponse
  }

  /**
   * Raised by `migrations/start-import` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class MigrationsStartImportApiException(
    public val error: MigrationsStartImportError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/start-import")

  private object MigrationsStartImportResponseDecoder : SdkResponseAlternativeDecoder<MigrationsStartImportResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsStartImportResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsStartImportResponse> = when {
      alternative.id == "migrations/start-import.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsStartImportResponse.SuccessJson(
          json = MigrationsCodecs.migrationsStartImportResponseCodecAlternative0Registry.select(listOf("migrations/start-import.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/start-import.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsStartImportResponse.Http404Json(
          json = MigrationsCodecs.migrationsStartImportResponseCodecAlternative1Registry.select(listOf("migrations/start-import.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/start-import.response.alternative2" -> SdkResponseDecodeResult(
        value = MigrationsStartImportResponse.Http422Json(
          json = MigrationsCodecs.migrationsStartImportResponseCodecAlternative2Registry.select(listOf("migrations/start-import.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/start-import.response.alternative3" -> SdkResponseDecodeResult(
        value = MigrationsStartImportResponse.Http503Json(
          json = MigrationsCodecs.migrationsStartImportResponseCodecAlternative3Registry.select(listOf("migrations/start-import.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsStartImportResponse = MigrationsStartImportResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/unlock-repo-for-authenticated-user` may expose through
   * its typed API exception.
   */
  public sealed interface MigrationsUnlockRepoForAuthenticatedUserError

  /**
   * Typed response alternatives for `migrations/unlock-repo-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface MigrationsUnlockRepoForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsUnlockRepoForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsUnlockRepoForAuthenticatedUserResponse,
        MigrationsUnlockRepoForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsUnlockRepoForAuthenticatedUserResponse,
        MigrationsUnlockRepoForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsUnlockRepoForAuthenticatedUserResponse,
        MigrationsUnlockRepoForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsUnlockRepoForAuthenticatedUserResponse,
        MigrationsUnlockRepoForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsUnlockRepoForAuthenticatedUserResponse
  }

  /**
   * Raised by `migrations/unlock-repo-for-authenticated-user` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class MigrationsUnlockRepoForAuthenticatedUserApiException(
    public val error: MigrationsUnlockRepoForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/unlock-repo-for-authenticated-user")

  private object MigrationsUnlockRepoForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<MigrationsUnlockRepoForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsUnlockRepoForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsUnlockRepoForAuthenticatedUserResponse> = when {
      alternative.id == "migrations/unlock-repo-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsUnlockRepoForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/unlock-repo-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsUnlockRepoForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/unlock-repo-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = MigrationsUnlockRepoForAuthenticatedUserResponse.Http401Json(
          json = MigrationsCodecs.migrationsUnlockRepoForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("migrations/unlock-repo-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/unlock-repo-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = MigrationsUnlockRepoForAuthenticatedUserResponse.Http403Json(
          json = MigrationsCodecs.migrationsUnlockRepoForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("migrations/unlock-repo-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/unlock-repo-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = MigrationsUnlockRepoForAuthenticatedUserResponse.Http404Json(
          json = MigrationsCodecs.migrationsUnlockRepoForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("migrations/unlock-repo-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsUnlockRepoForAuthenticatedUserResponse = MigrationsUnlockRepoForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/unlock-repo-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface MigrationsUnlockRepoForOrgError

  /**
   * Typed response alternatives for `migrations/unlock-repo-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface MigrationsUnlockRepoForOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsUnlockRepoForOrgResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsUnlockRepoForOrgResponse,
        MigrationsUnlockRepoForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsUnlockRepoForOrgResponse
  }

  /**
   * Raised by `migrations/unlock-repo-for-org` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class MigrationsUnlockRepoForOrgApiException(
    public val error: MigrationsUnlockRepoForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/unlock-repo-for-org")

  private object MigrationsUnlockRepoForOrgResponseDecoder : SdkResponseAlternativeDecoder<MigrationsUnlockRepoForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsUnlockRepoForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsUnlockRepoForOrgResponse> = when {
      alternative.id == "migrations/unlock-repo-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsUnlockRepoForOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/unlock-repo-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsUnlockRepoForOrgResponse.Http404Json(
          json = MigrationsCodecs.migrationsUnlockRepoForOrgResponseCodecAlternative1Registry.select(listOf("migrations/unlock-repo-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsUnlockRepoForOrgResponse = MigrationsUnlockRepoForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `migrations/update-import` may expose through its typed API
   * exception.
   */
  public sealed interface MigrationsUpdateImportError

  /**
   * Typed response alternatives for `migrations/update-import`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface MigrationsUpdateImportResponse {
    public class SuccessJson(
      public val json: Import,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsUpdateImportResponse

    public class Http503Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsUpdateImportResponse,
        MigrationsUpdateImportError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MigrationsUpdateImportResponse
  }

  /**
   * Raised by `migrations/update-import` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class MigrationsUpdateImportApiException(
    public val error: MigrationsUpdateImportError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "migrations/update-import")

  private object MigrationsUpdateImportResponseDecoder : SdkResponseAlternativeDecoder<MigrationsUpdateImportResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MigrationsUpdateImportResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MigrationsUpdateImportResponse> = when {
      alternative.id == "migrations/update-import.response.alternative0" -> SdkResponseDecodeResult(
        value = MigrationsUpdateImportResponse.SuccessJson(
          json = MigrationsCodecs.migrationsUpdateImportResponseCodecAlternative0Registry.select(listOf("migrations/update-import.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "migrations/update-import.response.alternative1" -> SdkResponseDecodeResult(
        value = MigrationsUpdateImportResponse.Http503Json(
          json = MigrationsCodecs.migrationsUpdateImportResponseCodecAlternative1Registry.select(listOf("migrations/update-import.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MigrationsUpdateImportResponse = MigrationsUpdateImportResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val migrationsCancelImportMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/cancel-import",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/import",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/cancel-import.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/cancel-import.response.alternative1",
            ),
          ),
          security = emptyList(),
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

    public val migrationsDeleteArchiveForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/delete-archive-for-authenticated-user",
          method = "DELETE",
          path = "/user/migrations/{migration_id}/archive",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/delete-archive-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/delete-archive-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/delete-archive-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/delete-archive-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/delete-archive-for-authenticated-user.response.alternative4",
            ),
          ),
          security = emptyList(),
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

    public val migrationsDeleteArchiveForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/delete-archive-for-org",
          method = "DELETE",
          path = "/orgs/{org}/migrations/{migration_id}/archive",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/delete-archive-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/delete-archive-for-org.response.alternative1",
            ),
          ),
          security = emptyList(),
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

    public val migrationsDownloadArchiveForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/download-archive-for-org",
          method = "GET",
          path = "/orgs/{org}/migrations/{migration_id}/archive",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 302),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/download-archive-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/download-archive-for-org.response.alternative1",
            ),
          ),
          security = emptyList(),
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

    public val migrationsGetArchiveForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/get-archive-for-authenticated-user",
          method = "GET",
          path = "/user/migrations/{migration_id}/archive",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 302),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-archive-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-archive-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-archive-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-archive-for-authenticated-user.response.alternative3",
            ),
          ),
          security = emptyList(),
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

    public val migrationsGetCommitAuthorsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/get-commit-authors",
          method = "GET",
          path = "/repos/{owner}/{repo}/import/authors",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-commit-authors.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-commit-authors.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-commit-authors.response.alternative2",
            ),
          ),
          security = emptyList(),
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

    public val migrationsGetImportStatusMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/get-import-status",
          method = "GET",
          path = "/repos/{owner}/{repo}/import",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Import",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-import-status.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-import-status.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-import-status.response.alternative2",
            ),
          ),
          security = emptyList(),
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

    public val migrationsGetLargeFilesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/get-large-files",
          method = "GET",
          path = "/repos/{owner}/{repo}/import/large_files",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-large-files.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-large-files.response.alternative1",
            ),
          ),
          security = emptyList(),
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

    public val migrationsGetStatusForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/get-status-for-authenticated-user",
          method = "GET",
          path = "/user/migrations/{migration_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Migration",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-status-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-status-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-status-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-status-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-status-for-authenticated-user.response.alternative4",
            ),
          ),
          security = emptyList(),
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

    public val migrationsGetStatusForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/get-status-for-org",
          method = "GET",
          path = "/orgs/{org}/migrations/{migration_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Migration",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-status-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/get-status-for-org.response.alternative1",
            ),
          ),
          security = emptyList(),
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

    public val migrationsListForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/list-for-authenticated-user",
          method = "GET",
          path = "/user/migrations",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/list-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/list-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/list-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/list-for-authenticated-user.response.alternative3",
            ),
          ),
          security = emptyList(),
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

    public val migrationsListForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/list-for-org",
          method = "GET",
          path = "/orgs/{org}/migrations",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/list-for-org.response.alternative0",
            ),
          ),
          security = emptyList(),
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

    public val migrationsListReposForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/list-repos-for-authenticated-user",
          method = "GET",
          path = "/user/migrations/{migration_id}/repositories",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/list-repos-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/list-repos-for-authenticated-user.response.alternative1",
            ),
          ),
          security = emptyList(),
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

    public val migrationsListReposForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/list-repos-for-org",
          method = "GET",
          path = "/orgs/{org}/migrations/{migration_id}/repositories",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/list-repos-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/list-repos-for-org.response.alternative1",
            ),
          ),
          security = emptyList(),
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

    public val migrationsMapCommitAuthorMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/map-commit-author",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/import/authors/{author_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PorterAuthor",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/map-commit-author.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/map-commit-author.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/map-commit-author.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/map-commit-author.response.alternative3",
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

    public val migrationsSetLfsPreferenceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/set-lfs-preference",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/import/lfs",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Import",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/set-lfs-preference.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/set-lfs-preference.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/set-lfs-preference.response.alternative2",
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

    public val migrationsStartForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/start-for-authenticated-user",
          method = "POST",
          path = "/user/migrations",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "Migration",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/start-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/start-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/start-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/start-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/start-for-authenticated-user.response.alternative4",
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

    public val migrationsStartForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/start-for-org",
          method = "POST",
          path = "/orgs/{org}/migrations",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "Migration",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/start-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/start-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/start-for-org.response.alternative2",
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

    public val migrationsStartImportMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/start-import",
          method = "PUT",
          path = "/repos/{owner}/{repo}/import",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "Import",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/start-import.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/start-import.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/start-import.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/start-import.response.alternative3",
            ),
          ),
          security = emptyList(),
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

    public val migrationsUnlockRepoForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/unlock-repo-for-authenticated-user",
          method = "DELETE",
          path = "/user/migrations/{migration_id}/repos/{repo_name}/lock",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/unlock-repo-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/unlock-repo-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/unlock-repo-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/unlock-repo-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/unlock-repo-for-authenticated-user.response.alternative4",
            ),
          ),
          security = emptyList(),
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

    public val migrationsUnlockRepoForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/unlock-repo-for-org",
          method = "DELETE",
          path = "/orgs/{org}/migrations/{migration_id}/repos/{repo_name}/lock",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/unlock-repo-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/unlock-repo-for-org.response.alternative1",
            ),
          ),
          security = emptyList(),
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

    public val migrationsUpdateImportMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "migrations/update-import",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/import",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Import",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/update-import.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "migrations/update-import.response.alternative1",
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
