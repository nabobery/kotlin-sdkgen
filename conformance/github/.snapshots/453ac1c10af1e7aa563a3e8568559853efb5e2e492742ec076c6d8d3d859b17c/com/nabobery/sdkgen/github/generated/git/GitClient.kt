package com.nabobery.sdkgen.github.generated.git

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.Blob
import com.nabobery.sdkgen.github.generated.GitCommit
import com.nabobery.sdkgen.github.generated.GitRef
import com.nabobery.sdkgen.github.generated.GitTag
import com.nabobery.sdkgen.github.generated.GitTree
import com.nabobery.sdkgen.github.generated.InlineReposGitCommitsPostRequestJsonXa91514c0
import com.nabobery.sdkgen.github.generated.InlineReposGitRefsPatchRequestJsonX4ab04be0
import com.nabobery.sdkgen.github.generated.InlineReposGitRefsPostRequestJsonX16683b9c
import com.nabobery.sdkgen.github.generated.InlineReposGitTagsPostRequestJsonX572bdfa6
import com.nabobery.sdkgen.github.generated.InlineReposGitTreesPostRequestJsonX932af25d
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

public object GitCodecs {
  public const val GITCREATECOMMIT_REQUEST_CODEC_ID: String = "git/create-commit.request"

  private val gitCreateCommitRequestCodec:
      MediaTypeCodec<InlineReposGitCommitsPostRequestJsonXa91514c0> =
      KotlinxSerializationCodec(GITCREATECOMMIT_REQUEST_CODEC_ID, InlineReposGitCommitsPostRequestJsonXa91514c0.Serializer, SdkJson)

  public const val GITCREATECOMMIT_RESPONSE_CODEC_ID: String = "git/create-commit.response"

  private val gitCreateCommitResponseCodec: MediaTypeCodec<GitCommit> =
      KotlinxSerializationCodec(GITCREATECOMMIT_RESPONSE_CODEC_ID, GitCommit.Serializer, SdkJson)

  private val gitCreateCommitResponseCodecAlternative0Codec: MediaTypeCodec<GitCommit> =
      KotlinxSerializationCodec("git/create-commit.response.alternative0", GitCommit.Serializer, SdkJson)

  public val gitCreateCommitResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GitCommit> =
      MediaTypeCodecRegistry.of(gitCreateCommitResponseCodecAlternative0Codec)

  private val gitCreateCommitResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/create-commit.response.alternative1", BasicError.Serializer, SdkJson)

  public val gitCreateCommitResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitCreateCommitResponseCodecAlternative1Codec)

  private val gitCreateCommitResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/create-commit.response.alternative2", BasicError.Serializer, SdkJson)

  public val gitCreateCommitResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitCreateCommitResponseCodecAlternative2Codec)

  private val gitCreateCommitResponseCodecAlternative3Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("git/create-commit.response.alternative3", ValidationError.Serializer, SdkJson)

  public val gitCreateCommitResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(gitCreateCommitResponseCodecAlternative3Codec)

  public val gitCreateCommitRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposGitCommitsPostRequestJsonXa91514c0> =
      MediaTypeCodecRegistry.of(gitCreateCommitRequestCodec)

  public val gitCreateCommitResponseCodecRegistry: MediaTypeCodecRegistry<GitCommit> =
      MediaTypeCodecRegistry.of(gitCreateCommitResponseCodec)

  public const val GITCREATEREF_REQUEST_CODEC_ID: String = "git/create-ref.request"

  private val gitCreateRefRequestCodec: MediaTypeCodec<InlineReposGitRefsPostRequestJsonX16683b9c> =
      KotlinxSerializationCodec(GITCREATEREF_REQUEST_CODEC_ID, InlineReposGitRefsPostRequestJsonX16683b9c.Serializer, SdkJson)

  public const val GITCREATEREF_RESPONSE_CODEC_ID: String = "git/create-ref.response"

  private val gitCreateRefResponseCodec: MediaTypeCodec<GitRef> =
      KotlinxSerializationCodec(GITCREATEREF_RESPONSE_CODEC_ID, GitRef.Serializer, SdkJson)

  private val gitCreateRefResponseCodecAlternative0Codec: MediaTypeCodec<GitRef> =
      KotlinxSerializationCodec("git/create-ref.response.alternative0", GitRef.Serializer, SdkJson)

  public val gitCreateRefResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GitRef> =
      MediaTypeCodecRegistry.of(gitCreateRefResponseCodecAlternative0Codec)

  private val gitCreateRefResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/create-ref.response.alternative1", BasicError.Serializer, SdkJson)

  public val gitCreateRefResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitCreateRefResponseCodecAlternative1Codec)

  private val gitCreateRefResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("git/create-ref.response.alternative2", ValidationError.Serializer, SdkJson)

  public val gitCreateRefResponseCodecAlternative2Registry: MediaTypeCodecRegistry<ValidationError>
      = MediaTypeCodecRegistry.of(gitCreateRefResponseCodecAlternative2Codec)

  public val gitCreateRefRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposGitRefsPostRequestJsonX16683b9c> =
      MediaTypeCodecRegistry.of(gitCreateRefRequestCodec)

  public val gitCreateRefResponseCodecRegistry: MediaTypeCodecRegistry<GitRef> =
      MediaTypeCodecRegistry.of(gitCreateRefResponseCodec)

  public const val GITCREATETAG_REQUEST_CODEC_ID: String = "git/create-tag.request"

  private val gitCreateTagRequestCodec: MediaTypeCodec<InlineReposGitTagsPostRequestJsonX572bdfa6> =
      KotlinxSerializationCodec(GITCREATETAG_REQUEST_CODEC_ID, InlineReposGitTagsPostRequestJsonX572bdfa6.Serializer, SdkJson)

  public const val GITCREATETAG_RESPONSE_CODEC_ID: String = "git/create-tag.response"

  private val gitCreateTagResponseCodec: MediaTypeCodec<GitTag> =
      KotlinxSerializationCodec(GITCREATETAG_RESPONSE_CODEC_ID, GitTag.Serializer, SdkJson)

  private val gitCreateTagResponseCodecAlternative0Codec: MediaTypeCodec<GitTag> =
      KotlinxSerializationCodec("git/create-tag.response.alternative0", GitTag.Serializer, SdkJson)

  public val gitCreateTagResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GitTag> =
      MediaTypeCodecRegistry.of(gitCreateTagResponseCodecAlternative0Codec)

  private val gitCreateTagResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/create-tag.response.alternative1", BasicError.Serializer, SdkJson)

  public val gitCreateTagResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitCreateTagResponseCodecAlternative1Codec)

  private val gitCreateTagResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("git/create-tag.response.alternative2", ValidationError.Serializer, SdkJson)

  public val gitCreateTagResponseCodecAlternative2Registry: MediaTypeCodecRegistry<ValidationError>
      = MediaTypeCodecRegistry.of(gitCreateTagResponseCodecAlternative2Codec)

  public val gitCreateTagRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposGitTagsPostRequestJsonX572bdfa6> =
      MediaTypeCodecRegistry.of(gitCreateTagRequestCodec)

  public val gitCreateTagResponseCodecRegistry: MediaTypeCodecRegistry<GitTag> =
      MediaTypeCodecRegistry.of(gitCreateTagResponseCodec)

  public const val GITCREATETREE_REQUEST_CODEC_ID: String = "git/create-tree.request"

  private val gitCreateTreeRequestCodec: MediaTypeCodec<InlineReposGitTreesPostRequestJsonX932af25d>
      =
      KotlinxSerializationCodec(GITCREATETREE_REQUEST_CODEC_ID, InlineReposGitTreesPostRequestJsonX932af25d.Serializer, SdkJson)

  public const val GITCREATETREE_RESPONSE_CODEC_ID: String = "git/create-tree.response"

  private val gitCreateTreeResponseCodec: MediaTypeCodec<GitTree> =
      KotlinxSerializationCodec(GITCREATETREE_RESPONSE_CODEC_ID, GitTree.Serializer, SdkJson)

  private val gitCreateTreeResponseCodecAlternative0Codec: MediaTypeCodec<GitTree> =
      KotlinxSerializationCodec("git/create-tree.response.alternative0", GitTree.Serializer, SdkJson)

  public val gitCreateTreeResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GitTree> =
      MediaTypeCodecRegistry.of(gitCreateTreeResponseCodecAlternative0Codec)

  private val gitCreateTreeResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/create-tree.response.alternative1", BasicError.Serializer, SdkJson)

  public val gitCreateTreeResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitCreateTreeResponseCodecAlternative1Codec)

  private val gitCreateTreeResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/create-tree.response.alternative2", BasicError.Serializer, SdkJson)

  public val gitCreateTreeResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitCreateTreeResponseCodecAlternative2Codec)

  private val gitCreateTreeResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/create-tree.response.alternative3", BasicError.Serializer, SdkJson)

  public val gitCreateTreeResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitCreateTreeResponseCodecAlternative3Codec)

  private val gitCreateTreeResponseCodecAlternative4Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("git/create-tree.response.alternative4", ValidationError.Serializer, SdkJson)

  public val gitCreateTreeResponseCodecAlternative4Registry: MediaTypeCodecRegistry<ValidationError>
      = MediaTypeCodecRegistry.of(gitCreateTreeResponseCodecAlternative4Codec)

  public val gitCreateTreeRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposGitTreesPostRequestJsonX932af25d> =
      MediaTypeCodecRegistry.of(gitCreateTreeRequestCodec)

  public val gitCreateTreeResponseCodecRegistry: MediaTypeCodecRegistry<GitTree> =
      MediaTypeCodecRegistry.of(gitCreateTreeResponseCodec)

  private val gitDeleteRefResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/delete-ref.response.alternative1", BasicError.Serializer, SdkJson)

  public val gitDeleteRefResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitDeleteRefResponseCodecAlternative1Codec)

  public val gitDeleteRefRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val gitDeleteRefResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val GITGETBLOB_RESPONSE_CODEC_ID: String = "git/get-blob.response"

  private val gitGetBlobResponseCodec: MediaTypeCodec<Blob> =
      KotlinxSerializationCodec(GITGETBLOB_RESPONSE_CODEC_ID, Blob.Serializer, SdkJson)

  private val gitGetBlobResponseCodecAlternative0Codec: MediaTypeCodec<Blob> =
      KotlinxSerializationCodec("git/get-blob.response.alternative0", Blob.Serializer, SdkJson)

  public val gitGetBlobResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Blob> =
      MediaTypeCodecRegistry.of(gitGetBlobResponseCodecAlternative0Codec)

  private val gitGetBlobResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/get-blob.response.alternative1", BasicError.Serializer, SdkJson)

  public val gitGetBlobResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitGetBlobResponseCodecAlternative1Codec)

  private val gitGetBlobResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/get-blob.response.alternative2", BasicError.Serializer, SdkJson)

  public val gitGetBlobResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitGetBlobResponseCodecAlternative2Codec)

  private val gitGetBlobResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/get-blob.response.alternative3", BasicError.Serializer, SdkJson)

  public val gitGetBlobResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitGetBlobResponseCodecAlternative3Codec)

  private val gitGetBlobResponseCodecAlternative4Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("git/get-blob.response.alternative4", ValidationError.Serializer, SdkJson)

  public val gitGetBlobResponseCodecAlternative4Registry: MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(gitGetBlobResponseCodecAlternative4Codec)

  public val gitGetBlobRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val gitGetBlobResponseCodecRegistry: MediaTypeCodecRegistry<Blob> =
      MediaTypeCodecRegistry.of(gitGetBlobResponseCodec)

  public const val GITGETCOMMIT_RESPONSE_CODEC_ID: String = "git/get-commit.response"

  private val gitGetCommitResponseCodec: MediaTypeCodec<GitCommit> =
      KotlinxSerializationCodec(GITGETCOMMIT_RESPONSE_CODEC_ID, GitCommit.Serializer, SdkJson)

  private val gitGetCommitResponseCodecAlternative0Codec: MediaTypeCodec<GitCommit> =
      KotlinxSerializationCodec("git/get-commit.response.alternative0", GitCommit.Serializer, SdkJson)

  public val gitGetCommitResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GitCommit> =
      MediaTypeCodecRegistry.of(gitGetCommitResponseCodecAlternative0Codec)

  private val gitGetCommitResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/get-commit.response.alternative1", BasicError.Serializer, SdkJson)

  public val gitGetCommitResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitGetCommitResponseCodecAlternative1Codec)

  private val gitGetCommitResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/get-commit.response.alternative2", BasicError.Serializer, SdkJson)

  public val gitGetCommitResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitGetCommitResponseCodecAlternative2Codec)

  public val gitGetCommitRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val gitGetCommitResponseCodecRegistry: MediaTypeCodecRegistry<GitCommit> =
      MediaTypeCodecRegistry.of(gitGetCommitResponseCodec)

  public const val GITGETREF_RESPONSE_CODEC_ID: String = "git/get-ref.response"

  private val gitGetRefResponseCodec: MediaTypeCodec<GitRef> =
      KotlinxSerializationCodec(GITGETREF_RESPONSE_CODEC_ID, GitRef.Serializer, SdkJson)

  private val gitGetRefResponseCodecAlternative0Codec: MediaTypeCodec<GitRef> =
      KotlinxSerializationCodec("git/get-ref.response.alternative0", GitRef.Serializer, SdkJson)

  public val gitGetRefResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GitRef> =
      MediaTypeCodecRegistry.of(gitGetRefResponseCodecAlternative0Codec)

  private val gitGetRefResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/get-ref.response.alternative1", BasicError.Serializer, SdkJson)

  public val gitGetRefResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitGetRefResponseCodecAlternative1Codec)

  private val gitGetRefResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/get-ref.response.alternative2", BasicError.Serializer, SdkJson)

  public val gitGetRefResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitGetRefResponseCodecAlternative2Codec)

  public val gitGetRefRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val gitGetRefResponseCodecRegistry: MediaTypeCodecRegistry<GitRef> =
      MediaTypeCodecRegistry.of(gitGetRefResponseCodec)

  public const val GITGETTAG_RESPONSE_CODEC_ID: String = "git/get-tag.response"

  private val gitGetTagResponseCodec: MediaTypeCodec<GitTag> =
      KotlinxSerializationCodec(GITGETTAG_RESPONSE_CODEC_ID, GitTag.Serializer, SdkJson)

  private val gitGetTagResponseCodecAlternative0Codec: MediaTypeCodec<GitTag> =
      KotlinxSerializationCodec("git/get-tag.response.alternative0", GitTag.Serializer, SdkJson)

  public val gitGetTagResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GitTag> =
      MediaTypeCodecRegistry.of(gitGetTagResponseCodecAlternative0Codec)

  private val gitGetTagResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/get-tag.response.alternative1", BasicError.Serializer, SdkJson)

  public val gitGetTagResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitGetTagResponseCodecAlternative1Codec)

  private val gitGetTagResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/get-tag.response.alternative2", BasicError.Serializer, SdkJson)

  public val gitGetTagResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitGetTagResponseCodecAlternative2Codec)

  public val gitGetTagRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val gitGetTagResponseCodecRegistry: MediaTypeCodecRegistry<GitTag> =
      MediaTypeCodecRegistry.of(gitGetTagResponseCodec)

  public const val GITGETTREE_RESPONSE_CODEC_ID: String = "git/get-tree.response"

  private val gitGetTreeResponseCodec: MediaTypeCodec<GitTree> =
      KotlinxSerializationCodec(GITGETTREE_RESPONSE_CODEC_ID, GitTree.Serializer, SdkJson)

  private val gitGetTreeResponseCodecAlternative0Codec: MediaTypeCodec<GitTree> =
      KotlinxSerializationCodec("git/get-tree.response.alternative0", GitTree.Serializer, SdkJson)

  public val gitGetTreeResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GitTree> =
      MediaTypeCodecRegistry.of(gitGetTreeResponseCodecAlternative0Codec)

  private val gitGetTreeResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/get-tree.response.alternative1", BasicError.Serializer, SdkJson)

  public val gitGetTreeResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitGetTreeResponseCodecAlternative1Codec)

  private val gitGetTreeResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/get-tree.response.alternative2", BasicError.Serializer, SdkJson)

  public val gitGetTreeResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitGetTreeResponseCodecAlternative2Codec)

  private val gitGetTreeResponseCodecAlternative3Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("git/get-tree.response.alternative3", ValidationError.Serializer, SdkJson)

  public val gitGetTreeResponseCodecAlternative3Registry: MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(gitGetTreeResponseCodecAlternative3Codec)

  public val gitGetTreeRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val gitGetTreeResponseCodecRegistry: MediaTypeCodecRegistry<GitTree> =
      MediaTypeCodecRegistry.of(gitGetTreeResponseCodec)

  public const val GITLISTMATCHINGREFS_RESPONSE_CODEC_ID: String = "git/list-matching-refs.response"

  private val gitListMatchingRefsResponseCodec: MediaTypeCodec<List<GitRef>> =
      KotlinxSerializationCodec(GITLISTMATCHINGREFS_RESPONSE_CODEC_ID, ListSerializer(GitRef.Serializer), SdkJson)

  private val gitListMatchingRefsResponseCodecAlternative0Codec: MediaTypeCodec<List<GitRef>> =
      KotlinxSerializationCodec("git/list-matching-refs.response.alternative0", ListSerializer(GitRef.Serializer), SdkJson)

  public val gitListMatchingRefsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<GitRef>> =
      MediaTypeCodecRegistry.of(gitListMatchingRefsResponseCodecAlternative0Codec)

  private val gitListMatchingRefsResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/list-matching-refs.response.alternative1", BasicError.Serializer, SdkJson)

  public val gitListMatchingRefsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitListMatchingRefsResponseCodecAlternative1Codec)

  public val gitListMatchingRefsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val gitListMatchingRefsResponseCodecRegistry: MediaTypeCodecRegistry<List<GitRef>> =
      MediaTypeCodecRegistry.of(gitListMatchingRefsResponseCodec)

  public const val GITUPDATEREF_REQUEST_CODEC_ID: String = "git/update-ref.request"

  private val gitUpdateRefRequestCodec: MediaTypeCodec<InlineReposGitRefsPatchRequestJsonX4ab04be0>
      =
      KotlinxSerializationCodec(GITUPDATEREF_REQUEST_CODEC_ID, InlineReposGitRefsPatchRequestJsonX4ab04be0.Serializer, SdkJson)

  public const val GITUPDATEREF_RESPONSE_CODEC_ID: String = "git/update-ref.response"

  private val gitUpdateRefResponseCodec: MediaTypeCodec<GitRef> =
      KotlinxSerializationCodec(GITUPDATEREF_RESPONSE_CODEC_ID, GitRef.Serializer, SdkJson)

  private val gitUpdateRefResponseCodecAlternative0Codec: MediaTypeCodec<GitRef> =
      KotlinxSerializationCodec("git/update-ref.response.alternative0", GitRef.Serializer, SdkJson)

  public val gitUpdateRefResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GitRef> =
      MediaTypeCodecRegistry.of(gitUpdateRefResponseCodecAlternative0Codec)

  private val gitUpdateRefResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("git/update-ref.response.alternative1", BasicError.Serializer, SdkJson)

  public val gitUpdateRefResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(gitUpdateRefResponseCodecAlternative1Codec)

  private val gitUpdateRefResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("git/update-ref.response.alternative2", ValidationError.Serializer, SdkJson)

  public val gitUpdateRefResponseCodecAlternative2Registry: MediaTypeCodecRegistry<ValidationError>
      = MediaTypeCodecRegistry.of(gitUpdateRefResponseCodecAlternative2Codec)

  public val gitUpdateRefRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposGitRefsPatchRequestJsonX4ab04be0> =
      MediaTypeCodecRegistry.of(gitUpdateRefRequestCodec)

  public val gitUpdateRefResponseCodecRegistry: MediaTypeCodecRegistry<GitRef> =
      MediaTypeCodecRegistry.of(gitUpdateRefResponseCodec)
}

/**
 * Client for the 'git' group of GitHub v3 REST API.
 */
public class GitClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@GitClient.authentication)

  /**
   * Creates a new Git [commit object](https://git-scm.com/book/en/v2/Git-Internals-Git-Objects).
   *
   * **Signature verification object**
   *
   * The response will include a `verification` object that describes the result of verifying the commit's signature.
   * The following fields are included in the `verification` object:
   *
   * | Name | Type | Description |
   * | ---- | ---- | ----------- |
   * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
   * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in the
   * table below. |
   * | `signature` | `string` | The signature that was extracted from the commit. |
   * | `payload` | `string` | The value that was signed. |
   * | `verified_at` | `string` | The date the signature was verified by GitHub. |
   *
   * These are the possible values for `reason` in the `verification` object:
   *
   * | Value | Description |
   * | ----- | ----------- |
   * | `expired_key` | The key that made the signature is expired. |
   * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
   * | `gpgverify_error` | There was an error communicating with the signature verification service. |
   * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
   * | `unsigned` | The object does not include a signature. |
   * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
   * | `no_user` | No user was associated with the `committer` email address in the commit. |
   * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email
   * address is not verified on their account. |
   * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that
   * made the signature. |
   * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
   * | `malformed_signature` | There was an error parsing the signature. |
   * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the
   * signature. |
   * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GitCreateCommitApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GitCreateCommitError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gitCreateCommit(
    request: InlineReposGitCommitsPostRequestJsonXa91514c0,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): GitCommit = executor.executeWithTypedErrors<InlineReposGitCommitsPostRequestJsonXa91514c0, GitCreateCommitResponse, GitCommit>(
    request = SdkExecutionRequest(gitCreateCommitMetadata, baseUri, request, listOf(GitCodecs.GITCREATECOMMIT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = GitCodecs.gitCreateCommitRequestCodecRegistry,
    responseDecoder = GitCreateCommitResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GitCreateCommitResponse.SuccessJson -> response.json
        is GitCreateCommitResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GitCreateCommitResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is GitCreateCommitResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is GitCreateCommitResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GitCreateCommitResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GitCreateCommitResponse.Http404Json -> GitCreateCommitApiException(response, statusCode, headers)
        is GitCreateCommitResponse.Http409Json -> GitCreateCommitApiException(response, statusCode, headers)
        is GitCreateCommitResponse.Http422Json -> GitCreateCommitApiException(response, statusCode, headers)
        is GitCreateCommitResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a new Git [commit object](https://git-scm.com/book/en/v2/Git-Internals-Git-Objects).
   *
   * **Signature verification object**
   *
   * The response will include a `verification` object that describes the result of verifying the commit's signature.
   * The following fields are included in the `verification` object:
   *
   * | Name | Type | Description |
   * | ---- | ---- | ----------- |
   * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
   * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in the
   * table below. |
   * | `signature` | `string` | The signature that was extracted from the commit. |
   * | `payload` | `string` | The value that was signed. |
   * | `verified_at` | `string` | The date the signature was verified by GitHub. |
   *
   * These are the possible values for `reason` in the `verification` object:
   *
   * | Value | Description |
   * | ----- | ----------- |
   * | `expired_key` | The key that made the signature is expired. |
   * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
   * | `gpgverify_error` | There was an error communicating with the signature verification service. |
   * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
   * | `unsigned` | The object does not include a signature. |
   * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
   * | `no_user` | No user was associated with the `committer` email address in the commit. |
   * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email
   * address is not verified on their account. |
   * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that
   * made the signature. |
   * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
   * | `malformed_signature` | There was an error parsing the signature. |
   * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the
   * signature. |
   * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun gitCreateCommitWithResponse(
    request: InlineReposGitCommitsPostRequestJsonXa91514c0,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GitCreateCommitResponse> = executor.executeWithResponse<InlineReposGitCommitsPostRequestJsonXa91514c0, GitCreateCommitResponse>(SdkExecutionRequest(gitCreateCommitMetadata, baseUri, request, listOf(GitCodecs.GITCREATECOMMIT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), GitCodecs.gitCreateCommitRequestCodecRegistry, GitCreateCommitResponseDecoder, options)

  /**
   * Creates a reference for your repository. You are unable to create new references for empty repositories, even if
   * the commit SHA-1 hash used exists. Empty repositories are repositories without branches.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GitCreateRefApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GitCreateRefError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gitCreateRef(
    request: InlineReposGitRefsPostRequestJsonX16683b9c,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): GitRef = executor.executeWithTypedErrors<InlineReposGitRefsPostRequestJsonX16683b9c, GitCreateRefResponse, GitRef>(
    request = SdkExecutionRequest(gitCreateRefMetadata, baseUri, request, listOf(GitCodecs.GITCREATEREF_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = GitCodecs.gitCreateRefRequestCodecRegistry,
    responseDecoder = GitCreateRefResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GitCreateRefResponse.SuccessJson -> response.json
        is GitCreateRefResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is GitCreateRefResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is GitCreateRefResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GitCreateRefResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GitCreateRefResponse.Http409Json -> GitCreateRefApiException(response, statusCode, headers)
        is GitCreateRefResponse.Http422Json -> GitCreateRefApiException(response, statusCode, headers)
        is GitCreateRefResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a reference for your repository. You are unable to create new references for empty repositories, even if
   * the commit SHA-1 hash used exists. Empty repositories are repositories without branches.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun gitCreateRefWithResponse(
    request: InlineReposGitRefsPostRequestJsonX16683b9c,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GitCreateRefResponse> = executor.executeWithResponse<InlineReposGitRefsPostRequestJsonX16683b9c, GitCreateRefResponse>(SdkExecutionRequest(gitCreateRefMetadata, baseUri, request, listOf(GitCodecs.GITCREATEREF_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), GitCodecs.gitCreateRefRequestCodecRegistry, GitCreateRefResponseDecoder, options)

  /**
   * Note that creating a tag object does not create the reference that makes a tag in Git. If you want to create an
   * annotated tag in Git, you have to do this call to create the tag object, and then
   * [create](https://docs.github.com/rest/git/refs#create-a-reference) the `refs/tags/[tag]` reference. If you want to
   * create a lightweight tag, you only have to [create](https://docs.github.com/rest/git/refs#create-a-reference) the
   * tag reference - this call would be unnecessary.
   *
   * **Signature verification object**
   *
   * The response will include a `verification` object that describes the result of verifying the commit's signature.
   * The following fields are included in the `verification` object:
   *
   * | Name | Type | Description |
   * | ---- | ---- | ----------- |
   * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
   * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table
   * below. |
   * | `signature` | `string` | The signature that was extracted from the commit. |
   * | `payload` | `string` | The value that was signed. |
   * | `verified_at` | `string` | The date the signature was verified by GitHub. |
   *
   * These are the possible values for `reason` in the `verification` object:
   *
   * | Value | Description |
   * | ----- | ----------- |
   * | `expired_key` | The key that made the signature is expired. |
   * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
   * | `gpgverify_error` | There was an error communicating with the signature verification service. |
   * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
   * | `unsigned` | The object does not include a signature. |
   * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
   * | `no_user` | No user was associated with the `committer` email address in the commit. |
   * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email
   * address is not verified on their account. |
   * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that
   * made the signature. |
   * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
   * | `malformed_signature` | There was an error parsing the signature. |
   * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the
   * signature. |
   * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GitCreateTagApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GitCreateTagError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gitCreateTag(
    request: InlineReposGitTagsPostRequestJsonX572bdfa6,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): GitTag = executor.executeWithTypedErrors<InlineReposGitTagsPostRequestJsonX572bdfa6, GitCreateTagResponse, GitTag>(
    request = SdkExecutionRequest(gitCreateTagMetadata, baseUri, request, listOf(GitCodecs.GITCREATETAG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = GitCodecs.gitCreateTagRequestCodecRegistry,
    responseDecoder = GitCreateTagResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GitCreateTagResponse.SuccessJson -> response.json
        is GitCreateTagResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is GitCreateTagResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is GitCreateTagResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GitCreateTagResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GitCreateTagResponse.Http409Json -> GitCreateTagApiException(response, statusCode, headers)
        is GitCreateTagResponse.Http422Json -> GitCreateTagApiException(response, statusCode, headers)
        is GitCreateTagResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Note that creating a tag object does not create the reference that makes a tag in Git. If you want to create an
   * annotated tag in Git, you have to do this call to create the tag object, and then
   * [create](https://docs.github.com/rest/git/refs#create-a-reference) the `refs/tags/[tag]` reference. If you want to
   * create a lightweight tag, you only have to [create](https://docs.github.com/rest/git/refs#create-a-reference) the
   * tag reference - this call would be unnecessary.
   *
   * **Signature verification object**
   *
   * The response will include a `verification` object that describes the result of verifying the commit's signature.
   * The following fields are included in the `verification` object:
   *
   * | Name | Type | Description |
   * | ---- | ---- | ----------- |
   * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
   * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table
   * below. |
   * | `signature` | `string` | The signature that was extracted from the commit. |
   * | `payload` | `string` | The value that was signed. |
   * | `verified_at` | `string` | The date the signature was verified by GitHub. |
   *
   * These are the possible values for `reason` in the `verification` object:
   *
   * | Value | Description |
   * | ----- | ----------- |
   * | `expired_key` | The key that made the signature is expired. |
   * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
   * | `gpgverify_error` | There was an error communicating with the signature verification service. |
   * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
   * | `unsigned` | The object does not include a signature. |
   * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
   * | `no_user` | No user was associated with the `committer` email address in the commit. |
   * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email
   * address is not verified on their account. |
   * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that
   * made the signature. |
   * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
   * | `malformed_signature` | There was an error parsing the signature. |
   * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the
   * signature. |
   * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun gitCreateTagWithResponse(
    request: InlineReposGitTagsPostRequestJsonX572bdfa6,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GitCreateTagResponse> = executor.executeWithResponse<InlineReposGitTagsPostRequestJsonX572bdfa6, GitCreateTagResponse>(SdkExecutionRequest(gitCreateTagMetadata, baseUri, request, listOf(GitCodecs.GITCREATETAG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), GitCodecs.gitCreateTagRequestCodecRegistry, GitCreateTagResponseDecoder, options)

  /**
   * The tree creation API accepts nested entries. If you specify both a tree and a nested path modifying that tree,
   * this endpoint will overwrite the contents of the tree with the new path contents, and create a new tree structure.
   *
   * If you use this endpoint to add, delete, or modify the file contents in a tree, you will need to commit the tree
   * and then update a branch to point to the commit. For more information see "[Create a
   * commit](https://docs.github.com/rest/git/commits#create-a-commit)" and "[Update a
   * reference](https://docs.github.com/rest/git/refs#update-a-reference)."
   *
   * Returns an error if you try to delete a file that does not exist.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GitCreateTreeApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GitCreateTreeError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gitCreateTree(
    request: InlineReposGitTreesPostRequestJsonX932af25d,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): GitTree = executor.executeWithTypedErrors<InlineReposGitTreesPostRequestJsonX932af25d, GitCreateTreeResponse, GitTree>(
    request = SdkExecutionRequest(gitCreateTreeMetadata, baseUri, request, listOf(GitCodecs.GITCREATETREE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = GitCodecs.gitCreateTreeRequestCodecRegistry,
    responseDecoder = GitCreateTreeResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GitCreateTreeResponse.SuccessJson -> response.json
        is GitCreateTreeResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GitCreateTreeResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GitCreateTreeResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is GitCreateTreeResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is GitCreateTreeResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GitCreateTreeResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GitCreateTreeResponse.Http403Json -> GitCreateTreeApiException(response, statusCode, headers)
        is GitCreateTreeResponse.Http404Json -> GitCreateTreeApiException(response, statusCode, headers)
        is GitCreateTreeResponse.Http409Json -> GitCreateTreeApiException(response, statusCode, headers)
        is GitCreateTreeResponse.Http422Json -> GitCreateTreeApiException(response, statusCode, headers)
        is GitCreateTreeResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * The tree creation API accepts nested entries. If you specify both a tree and a nested path modifying that tree,
   * this endpoint will overwrite the contents of the tree with the new path contents, and create a new tree structure.
   *
   * If you use this endpoint to add, delete, or modify the file contents in a tree, you will need to commit the tree
   * and then update a branch to point to the commit. For more information see "[Create a
   * commit](https://docs.github.com/rest/git/commits#create-a-commit)" and "[Update a
   * reference](https://docs.github.com/rest/git/refs#update-a-reference)."
   *
   * Returns an error if you try to delete a file that does not exist.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun gitCreateTreeWithResponse(
    request: InlineReposGitTreesPostRequestJsonX932af25d,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GitCreateTreeResponse> = executor.executeWithResponse<InlineReposGitTreesPostRequestJsonX932af25d, GitCreateTreeResponse>(SdkExecutionRequest(gitCreateTreeMetadata, baseUri, request, listOf(GitCodecs.GITCREATETREE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), GitCodecs.gitCreateTreeRequestCodecRegistry, GitCreateTreeResponseDecoder, options)

  /**
   * Deletes the provided reference.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param ref The Git reference. For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws GitDeleteRefApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GitDeleteRefError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gitDeleteRef(
    owner: String,
    ref: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, GitDeleteRefResponse, Unit>(
    request = SdkExecutionRequest(gitDeleteRefMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ref", values = listOf(ref.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = GitCodecs.gitDeleteRefRequestCodecRegistry,
    responseDecoder = GitDeleteRefResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GitDeleteRefResponse.SuccessNoContent -> response.unit
        is GitDeleteRefResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is GitDeleteRefResponse.Http422NoContent -> response.unit
        is GitDeleteRefResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GitDeleteRefResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is GitDeleteRefResponse.Http409Json -> GitDeleteRefApiException(response, statusCode, headers)
        is GitDeleteRefResponse.Http422NoContent -> GitDeleteRefApiException(response, statusCode, headers)
        is GitDeleteRefResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes the provided reference.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param ref The Git reference. For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun gitDeleteRefWithResponse(
    owner: String,
    ref: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GitDeleteRefResponse> = executor.executeWithResponse<Unit, GitDeleteRefResponse>(SdkExecutionRequest(gitDeleteRefMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ref", values = listOf(ref.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), GitCodecs.gitDeleteRefRequestCodecRegistry, GitDeleteRefResponseDecoder, options)

  /**
   * The `content` in the response will always be Base64 encoded.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw blob data.
   * - **`application/vnd.github+json`**: Returns a JSON representation of the blob with `content` as a base64 encoded
   * string. This is the default if no media type is specified.
   *
   * **Note** This endpoint supports blobs up to 100 megabytes in size.
   *
   * @param fileSha Wire parameter `file_sha`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GitGetBlobApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GitGetBlobError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gitGetBlob(
    fileSha: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Blob = executor.executeWithTypedErrors<Unit, GitGetBlobResponse, Blob>(
    request = SdkExecutionRequest(gitGetBlobMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "file_sha", values = listOf(fileSha.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = GitCodecs.gitGetBlobRequestCodecRegistry,
    responseDecoder = GitGetBlobResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GitGetBlobResponse.SuccessJson -> response.json
        is GitGetBlobResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GitGetBlobResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GitGetBlobResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is GitGetBlobResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is GitGetBlobResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GitGetBlobResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GitGetBlobResponse.Http403Json -> GitGetBlobApiException(response, statusCode, headers)
        is GitGetBlobResponse.Http404Json -> GitGetBlobApiException(response, statusCode, headers)
        is GitGetBlobResponse.Http409Json -> GitGetBlobApiException(response, statusCode, headers)
        is GitGetBlobResponse.Http422Json -> GitGetBlobApiException(response, statusCode, headers)
        is GitGetBlobResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * The `content` in the response will always be Base64 encoded.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw blob data.
   * - **`application/vnd.github+json`**: Returns a JSON representation of the blob with `content` as a base64 encoded
   * string. This is the default if no media type is specified.
   *
   * **Note** This endpoint supports blobs up to 100 megabytes in size.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param fileSha Wire parameter `file_sha`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun gitGetBlobWithResponse(
    fileSha: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GitGetBlobResponse> = executor.executeWithResponse<Unit, GitGetBlobResponse>(SdkExecutionRequest(gitGetBlobMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "file_sha", values = listOf(fileSha.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), GitCodecs.gitGetBlobRequestCodecRegistry, GitGetBlobResponseDecoder, options)

  /**
   * Gets a Git [commit object](https://git-scm.com/book/en/v2/Git-Internals-Git-Objects).
   *
   * To get the contents of a commit, see "[Get a commit](/rest/commits/commits#get-a-commit)."
   *
   * **Signature verification object**
   *
   * The response will include a `verification` object that describes the result of verifying the commit's signature.
   * The following fields are included in the `verification` object:
   *
   * | Name | Type | Description |
   * | ---- | ---- | ----------- |
   * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
   * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in the
   * table below. |
   * | `signature` | `string` | The signature that was extracted from the commit. |
   * | `payload` | `string` | The value that was signed. |
   * | `verified_at` | `string` | The date the signature was verified by GitHub. |
   *
   * These are the possible values for `reason` in the `verification` object:
   *
   * | Value | Description |
   * | ----- | ----------- |
   * | `expired_key` | The key that made the signature is expired. |
   * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
   * | `gpgverify_error` | There was an error communicating with the signature verification service. |
   * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
   * | `unsigned` | The object does not include a signature. |
   * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
   * | `no_user` | No user was associated with the `committer` email address in the commit. |
   * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email
   * address is not verified on their account. |
   * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that
   * made the signature. |
   * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
   * | `malformed_signature` | There was an error parsing the signature. |
   * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the
   * signature. |
   * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
   *
   * @param commitSha The SHA of the commit.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GitGetCommitApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GitGetCommitError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gitGetCommit(
    commitSha: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): GitCommit = executor.executeWithTypedErrors<Unit, GitGetCommitResponse, GitCommit>(
    request = SdkExecutionRequest(gitGetCommitMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "commit_sha", values = listOf(commitSha.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = GitCodecs.gitGetCommitRequestCodecRegistry,
    responseDecoder = GitGetCommitResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GitGetCommitResponse.SuccessJson -> response.json
        is GitGetCommitResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GitGetCommitResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is GitGetCommitResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GitGetCommitResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GitGetCommitResponse.Http404Json -> GitGetCommitApiException(response, statusCode, headers)
        is GitGetCommitResponse.Http409Json -> GitGetCommitApiException(response, statusCode, headers)
        is GitGetCommitResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a Git [commit object](https://git-scm.com/book/en/v2/Git-Internals-Git-Objects).
   *
   * To get the contents of a commit, see "[Get a commit](/rest/commits/commits#get-a-commit)."
   *
   * **Signature verification object**
   *
   * The response will include a `verification` object that describes the result of verifying the commit's signature.
   * The following fields are included in the `verification` object:
   *
   * | Name | Type | Description |
   * | ---- | ---- | ----------- |
   * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
   * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in the
   * table below. |
   * | `signature` | `string` | The signature that was extracted from the commit. |
   * | `payload` | `string` | The value that was signed. |
   * | `verified_at` | `string` | The date the signature was verified by GitHub. |
   *
   * These are the possible values for `reason` in the `verification` object:
   *
   * | Value | Description |
   * | ----- | ----------- |
   * | `expired_key` | The key that made the signature is expired. |
   * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
   * | `gpgverify_error` | There was an error communicating with the signature verification service. |
   * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
   * | `unsigned` | The object does not include a signature. |
   * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
   * | `no_user` | No user was associated with the `committer` email address in the commit. |
   * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email
   * address is not verified on their account. |
   * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that
   * made the signature. |
   * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
   * | `malformed_signature` | There was an error parsing the signature. |
   * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the
   * signature. |
   * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param commitSha The SHA of the commit.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun gitGetCommitWithResponse(
    commitSha: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GitGetCommitResponse> = executor.executeWithResponse<Unit, GitGetCommitResponse>(SdkExecutionRequest(gitGetCommitMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "commit_sha", values = listOf(commitSha.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), GitCodecs.gitGetCommitRequestCodecRegistry, GitGetCommitResponseDecoder, options)

  /**
   * Returns a single reference from your Git database. The `:ref` in the URL must be formatted as `heads/<branch name>`
   * for branches and `tags/<tag name>` for tags. If the `:ref` doesn't match an existing ref, a `404` is returned.
   *
   * > [!NOTE]
   * > You need to explicitly [request a pull request](https://docs.github.com/rest/pulls/pulls#get-a-pull-request) to
   * trigger a test merge commit, which checks the mergeability of pull requests. For more information, see "[Checking
   * mergeability of pull
   * requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pu
   * ll-requests)".
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param ref The Git reference. For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GitGetRefApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GitGetRefError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gitGetRef(
    owner: String,
    ref: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): GitRef = executor.executeWithTypedErrors<Unit, GitGetRefResponse, GitRef>(
    request = SdkExecutionRequest(gitGetRefMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ref", values = listOf(ref.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = GitCodecs.gitGetRefRequestCodecRegistry,
    responseDecoder = GitGetRefResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GitGetRefResponse.SuccessJson -> response.json
        is GitGetRefResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GitGetRefResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is GitGetRefResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GitGetRefResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GitGetRefResponse.Http404Json -> GitGetRefApiException(response, statusCode, headers)
        is GitGetRefResponse.Http409Json -> GitGetRefApiException(response, statusCode, headers)
        is GitGetRefResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Returns a single reference from your Git database. The `:ref` in the URL must be formatted as `heads/<branch name>`
   * for branches and `tags/<tag name>` for tags. If the `:ref` doesn't match an existing ref, a `404` is returned.
   *
   * > [!NOTE]
   * > You need to explicitly [request a pull request](https://docs.github.com/rest/pulls/pulls#get-a-pull-request) to
   * trigger a test merge commit, which checks the mergeability of pull requests. For more information, see "[Checking
   * mergeability of pull
   * requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pu
   * ll-requests)".
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param ref The Git reference. For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun gitGetRefWithResponse(
    owner: String,
    ref: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GitGetRefResponse> = executor.executeWithResponse<Unit, GitGetRefResponse>(SdkExecutionRequest(gitGetRefMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ref", values = listOf(ref.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), GitCodecs.gitGetRefRequestCodecRegistry, GitGetRefResponseDecoder, options)

  /**
   * **Signature verification object**
   *
   * The response will include a `verification` object that describes the result of verifying the commit's signature.
   * The following fields are included in the `verification` object:
   *
   * | Name | Type | Description |
   * | ---- | ---- | ----------- |
   * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
   * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table
   * below. |
   * | `signature` | `string` | The signature that was extracted from the commit. |
   * | `payload` | `string` | The value that was signed. |
   * | `verified_at` | `string` | The date the signature was verified by GitHub. |
   *
   * These are the possible values for `reason` in the `verification` object:
   *
   * | Value | Description |
   * | ----- | ----------- |
   * | `expired_key` | The key that made the signature is expired. |
   * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
   * | `gpgverify_error` | There was an error communicating with the signature verification service. |
   * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
   * | `unsigned` | The object does not include a signature. |
   * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
   * | `no_user` | No user was associated with the `committer` email address in the commit. |
   * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email
   * address is not verified on their account. |
   * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that
   * made the signature. |
   * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
   * | `malformed_signature` | There was an error parsing the signature. |
   * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the
   * signature. |
   * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param tagSha Wire parameter `tag_sha`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GitGetTagApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GitGetTagError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gitGetTag(
    owner: String,
    repo: String,
    tagSha: String,
    options: CallOptions = CallOptions(),
  ): GitTag = executor.executeWithTypedErrors<Unit, GitGetTagResponse, GitTag>(
    request = SdkExecutionRequest(gitGetTagMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "tag_sha", values = listOf(tagSha.toString())))
    }),
    requestCodecs = GitCodecs.gitGetTagRequestCodecRegistry,
    responseDecoder = GitGetTagResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GitGetTagResponse.SuccessJson -> response.json
        is GitGetTagResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GitGetTagResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is GitGetTagResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GitGetTagResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GitGetTagResponse.Http404Json -> GitGetTagApiException(response, statusCode, headers)
        is GitGetTagResponse.Http409Json -> GitGetTagApiException(response, statusCode, headers)
        is GitGetTagResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * **Signature verification object**
   *
   * The response will include a `verification` object that describes the result of verifying the commit's signature.
   * The following fields are included in the `verification` object:
   *
   * | Name | Type | Description |
   * | ---- | ---- | ----------- |
   * | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
   * | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table
   * below. |
   * | `signature` | `string` | The signature that was extracted from the commit. |
   * | `payload` | `string` | The value that was signed. |
   * | `verified_at` | `string` | The date the signature was verified by GitHub. |
   *
   * These are the possible values for `reason` in the `verification` object:
   *
   * | Value | Description |
   * | ----- | ----------- |
   * | `expired_key` | The key that made the signature is expired. |
   * | `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
   * | `gpgverify_error` | There was an error communicating with the signature verification service. |
   * | `gpgverify_unavailable` | The signature verification service is currently unavailable. |
   * | `unsigned` | The object does not include a signature. |
   * | `unknown_signature_type` | A non-PGP signature was found in the commit. |
   * | `no_user` | No user was associated with the `committer` email address in the commit. |
   * | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email
   * address is not verified on their account. |
   * | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that
   * made the signature. |
   * | `unknown_key` | The key that made the signature has not been registered with any user's account. |
   * | `malformed_signature` | There was an error parsing the signature. |
   * | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the
   * signature. |
   * | `valid` | None of the above errors applied, so the signature is considered to be verified. |
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param tagSha Wire parameter `tag_sha`.
   * @param options Execution options.
   */
  public suspend fun gitGetTagWithResponse(
    owner: String,
    repo: String,
    tagSha: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GitGetTagResponse> = executor.executeWithResponse<Unit, GitGetTagResponse>(SdkExecutionRequest(gitGetTagMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "tag_sha", values = listOf(tagSha.toString())))
  }), GitCodecs.gitGetTagRequestCodecRegistry, GitGetTagResponseDecoder, options)

  /**
   * Returns a single tree using the SHA1 value or ref name for that tree.
   *
   * If `truncated` is `true` in the response then the number of items in the `tree` array exceeded our maximum limit.
   * If you need to fetch more items, use the non-recursive method of fetching trees, and fetch one sub-tree at a time.
   *
   * > [!NOTE]
   * > The limit for the `tree` array is 100,000 entries with a maximum size of 7 MB when using the `recursive`
   * parameter.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param treeSha The SHA1 value or ref (branch or tag) name of the tree.
   * @param recursive Setting this parameter to any value returns the objects or subtrees referenced by the tree
   * specified in `:tree_sha`. For example, setting `recursive` to any of the following will enable returning objects or
   * subtrees: `0`, `1`, `"true"`, and `"false"`. Omit this parameter to prevent recursively returning objects or
   * subtrees.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GitGetTreeApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GitGetTreeError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gitGetTree(
    owner: String,
    repo: String,
    treeSha: String,
    recursive: String? = null,
    options: CallOptions = CallOptions(),
  ): GitTree = executor.executeWithTypedErrors<Unit, GitGetTreeResponse, GitTree>(
    request = SdkExecutionRequest(gitGetTreeMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "tree_sha", values = listOf(treeSha.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "recursive", values = recursive?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GitCodecs.gitGetTreeRequestCodecRegistry,
    responseDecoder = GitGetTreeResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GitGetTreeResponse.SuccessJson -> response.json
        is GitGetTreeResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GitGetTreeResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is GitGetTreeResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is GitGetTreeResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GitGetTreeResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GitGetTreeResponse.Http404Json -> GitGetTreeApiException(response, statusCode, headers)
        is GitGetTreeResponse.Http409Json -> GitGetTreeApiException(response, statusCode, headers)
        is GitGetTreeResponse.Http422Json -> GitGetTreeApiException(response, statusCode, headers)
        is GitGetTreeResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Returns a single tree using the SHA1 value or ref name for that tree.
   *
   * If `truncated` is `true` in the response then the number of items in the `tree` array exceeded our maximum limit.
   * If you need to fetch more items, use the non-recursive method of fetching trees, and fetch one sub-tree at a time.
   *
   * > [!NOTE]
   * > The limit for the `tree` array is 100,000 entries with a maximum size of 7 MB when using the `recursive`
   * parameter.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param treeSha The SHA1 value or ref (branch or tag) name of the tree.
   * @param recursive Setting this parameter to any value returns the objects or subtrees referenced by the tree
   * specified in `:tree_sha`. For example, setting `recursive` to any of the following will enable returning objects or
   * subtrees: `0`, `1`, `"true"`, and `"false"`. Omit this parameter to prevent recursively returning objects or
   * subtrees.
   * @param options Execution options.
   */
  public suspend fun gitGetTreeWithResponse(
    owner: String,
    repo: String,
    treeSha: String,
    recursive: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GitGetTreeResponse> = executor.executeWithResponse<Unit, GitGetTreeResponse>(SdkExecutionRequest(gitGetTreeMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "tree_sha", values = listOf(treeSha.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "recursive", values = recursive?.let { listOf(it.toString()) }.orEmpty()))
  }), GitCodecs.gitGetTreeRequestCodecRegistry, GitGetTreeResponseDecoder, options)

  /**
   * Returns an array of references from your Git database that match the supplied name. The `:ref` in the URL must be
   * formatted as `heads/<branch name>` for branches and `tags/<tag name>` for tags. If the `:ref` doesn't exist in the
   * repository, but existing refs start with `:ref`, they will be returned as an array.
   *
   * When you use this endpoint without providing a `:ref`, it will return an array of all the references from your Git
   * database, including notes and stashes if they exist on the server. Anything in the namespace is returned, not just
   * `heads` and `tags`.
   *
   * > [!NOTE]
   * > You need to explicitly [request a pull request](https://docs.github.com/rest/pulls/pulls#get-a-pull-request) to
   * trigger a test merge commit, which checks the mergeability of pull requests. For more information, see "[Checking
   * mergeability of pull
   * requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pu
   * ll-requests)".
   *
   * If you request matching references for a branch named `feature` but the branch `feature` doesn't exist, the
   * response can still include other matching head refs that start with the word `feature`, such as `featureA` and
   * `featureB`.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param ref The Git reference. For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GitListMatchingRefsApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded GitListMatchingRefsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gitListMatchingRefs(
    owner: String,
    ref: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): List<GitRef> = executor.executeWithTypedErrors<Unit, GitListMatchingRefsResponse, List<GitRef>>(
    request = SdkExecutionRequest(gitListMatchingRefsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ref", values = listOf(ref.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = GitCodecs.gitListMatchingRefsRequestCodecRegistry,
    responseDecoder = GitListMatchingRefsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GitListMatchingRefsResponse.SuccessJson -> response.json
        is GitListMatchingRefsResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is GitListMatchingRefsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GitListMatchingRefsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GitListMatchingRefsResponse.Http409Json -> GitListMatchingRefsApiException(response, statusCode, headers)
        is GitListMatchingRefsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Returns an array of references from your Git database that match the supplied name. The `:ref` in the URL must be
   * formatted as `heads/<branch name>` for branches and `tags/<tag name>` for tags. If the `:ref` doesn't exist in the
   * repository, but existing refs start with `:ref`, they will be returned as an array.
   *
   * When you use this endpoint without providing a `:ref`, it will return an array of all the references from your Git
   * database, including notes and stashes if they exist on the server. Anything in the namespace is returned, not just
   * `heads` and `tags`.
   *
   * > [!NOTE]
   * > You need to explicitly [request a pull request](https://docs.github.com/rest/pulls/pulls#get-a-pull-request) to
   * trigger a test merge commit, which checks the mergeability of pull requests. For more information, see "[Checking
   * mergeability of pull
   * requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pu
   * ll-requests)".
   *
   * If you request matching references for a branch named `feature` but the branch `feature` doesn't exist, the
   * response can still include other matching head refs that start with the word `feature`, such as `featureA` and
   * `featureB`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param ref The Git reference. For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun gitListMatchingRefsWithResponse(
    owner: String,
    ref: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GitListMatchingRefsResponse> = executor.executeWithResponse<Unit, GitListMatchingRefsResponse>(SdkExecutionRequest(gitListMatchingRefsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ref", values = listOf(ref.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), GitCodecs.gitListMatchingRefsRequestCodecRegistry, GitListMatchingRefsResponseDecoder, options)

  /**
   * Updates the provided reference to point to a new SHA. For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param ref The Git reference. For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GitUpdateRefApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GitUpdateRefError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gitUpdateRef(
    request: InlineReposGitRefsPatchRequestJsonX4ab04be0,
    owner: String,
    ref: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): GitRef = executor.executeWithTypedErrors<InlineReposGitRefsPatchRequestJsonX4ab04be0, GitUpdateRefResponse, GitRef>(
    request = SdkExecutionRequest(gitUpdateRefMetadata, baseUri, request, listOf(GitCodecs.GITUPDATEREF_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ref", values = listOf(ref.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = GitCodecs.gitUpdateRefRequestCodecRegistry,
    responseDecoder = GitUpdateRefResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GitUpdateRefResponse.SuccessJson -> response.json
        is GitUpdateRefResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is GitUpdateRefResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is GitUpdateRefResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GitUpdateRefResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GitUpdateRefResponse.Http409Json -> GitUpdateRefApiException(response, statusCode, headers)
        is GitUpdateRefResponse.Http422Json -> GitUpdateRefApiException(response, statusCode, headers)
        is GitUpdateRefResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates the provided reference to point to a new SHA. For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param ref The Git reference. For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun gitUpdateRefWithResponse(
    request: InlineReposGitRefsPatchRequestJsonX4ab04be0,
    owner: String,
    ref: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GitUpdateRefResponse> = executor.executeWithResponse<InlineReposGitRefsPatchRequestJsonX4ab04be0, GitUpdateRefResponse>(SdkExecutionRequest(gitUpdateRefMetadata, baseUri, request, listOf(GitCodecs.GITUPDATEREF_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ref", values = listOf(ref.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), GitCodecs.gitUpdateRefRequestCodecRegistry, GitUpdateRefResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `git/create-commit` may expose through its typed API exception.
   */
  public sealed interface GitCreateCommitError

  /**
   * Typed response alternatives for `git/create-commit`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GitCreateCommitResponse {
    public class SuccessJson(
      public val json: GitCommit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateCommitResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateCommitResponse,
        GitCreateCommitError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateCommitResponse,
        GitCreateCommitError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateCommitResponse,
        GitCreateCommitError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateCommitResponse
  }

  /**
   * Raised by `git/create-commit` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class GitCreateCommitApiException(
    public val error: GitCreateCommitError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "git/create-commit")

  private object GitCreateCommitResponseDecoder : SdkResponseAlternativeDecoder<GitCreateCommitResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GitCreateCommitResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GitCreateCommitResponse> = when {
      alternative.id == "git/create-commit.response.alternative0" -> SdkResponseDecodeResult(
        value = GitCreateCommitResponse.SuccessJson(
          json = GitCodecs.gitCreateCommitResponseCodecAlternative0Registry.select(listOf("git/create-commit.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/create-commit.response.alternative1" -> SdkResponseDecodeResult(
        value = GitCreateCommitResponse.Http404Json(
          json = GitCodecs.gitCreateCommitResponseCodecAlternative1Registry.select(listOf("git/create-commit.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/create-commit.response.alternative2" -> SdkResponseDecodeResult(
        value = GitCreateCommitResponse.Http409Json(
          json = GitCodecs.gitCreateCommitResponseCodecAlternative2Registry.select(listOf("git/create-commit.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/create-commit.response.alternative3" -> SdkResponseDecodeResult(
        value = GitCreateCommitResponse.Http422Json(
          json = GitCodecs.gitCreateCommitResponseCodecAlternative3Registry.select(listOf("git/create-commit.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GitCreateCommitResponse = GitCreateCommitResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `git/create-ref` may expose through its typed API exception.
   */
  public sealed interface GitCreateRefError

  /**
   * Typed response alternatives for `git/create-ref`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GitCreateRefResponse {
    public class SuccessJson(
      public val json: GitRef,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateRefResponse

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateRefResponse,
        GitCreateRefError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateRefResponse,
        GitCreateRefError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateRefResponse
  }

  /**
   * Raised by `git/create-ref` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GitCreateRefApiException(
    public val error: GitCreateRefError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "git/create-ref")

  private object GitCreateRefResponseDecoder : SdkResponseAlternativeDecoder<GitCreateRefResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GitCreateRefResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GitCreateRefResponse> = when {
      alternative.id == "git/create-ref.response.alternative0" -> SdkResponseDecodeResult(
        value = GitCreateRefResponse.SuccessJson(
          json = GitCodecs.gitCreateRefResponseCodecAlternative0Registry.select(listOf("git/create-ref.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/create-ref.response.alternative1" -> SdkResponseDecodeResult(
        value = GitCreateRefResponse.Http409Json(
          json = GitCodecs.gitCreateRefResponseCodecAlternative1Registry.select(listOf("git/create-ref.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/create-ref.response.alternative2" -> SdkResponseDecodeResult(
        value = GitCreateRefResponse.Http422Json(
          json = GitCodecs.gitCreateRefResponseCodecAlternative2Registry.select(listOf("git/create-ref.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GitCreateRefResponse = GitCreateRefResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `git/create-tag` may expose through its typed API exception.
   */
  public sealed interface GitCreateTagError

  /**
   * Typed response alternatives for `git/create-tag`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GitCreateTagResponse {
    public class SuccessJson(
      public val json: GitTag,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateTagResponse

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateTagResponse,
        GitCreateTagError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateTagResponse,
        GitCreateTagError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateTagResponse
  }

  /**
   * Raised by `git/create-tag` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GitCreateTagApiException(
    public val error: GitCreateTagError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "git/create-tag")

  private object GitCreateTagResponseDecoder : SdkResponseAlternativeDecoder<GitCreateTagResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GitCreateTagResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GitCreateTagResponse> = when {
      alternative.id == "git/create-tag.response.alternative0" -> SdkResponseDecodeResult(
        value = GitCreateTagResponse.SuccessJson(
          json = GitCodecs.gitCreateTagResponseCodecAlternative0Registry.select(listOf("git/create-tag.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/create-tag.response.alternative1" -> SdkResponseDecodeResult(
        value = GitCreateTagResponse.Http409Json(
          json = GitCodecs.gitCreateTagResponseCodecAlternative1Registry.select(listOf("git/create-tag.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/create-tag.response.alternative2" -> SdkResponseDecodeResult(
        value = GitCreateTagResponse.Http422Json(
          json = GitCodecs.gitCreateTagResponseCodecAlternative2Registry.select(listOf("git/create-tag.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GitCreateTagResponse = GitCreateTagResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `git/create-tree` may expose through its typed API exception.
   */
  public sealed interface GitCreateTreeError

  /**
   * Typed response alternatives for `git/create-tree`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GitCreateTreeResponse {
    public class SuccessJson(
      public val json: GitTree,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateTreeResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateTreeResponse,
        GitCreateTreeError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateTreeResponse,
        GitCreateTreeError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateTreeResponse,
        GitCreateTreeError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateTreeResponse,
        GitCreateTreeError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitCreateTreeResponse
  }

  /**
   * Raised by `git/create-tree` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GitCreateTreeApiException(
    public val error: GitCreateTreeError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "git/create-tree")

  private object GitCreateTreeResponseDecoder : SdkResponseAlternativeDecoder<GitCreateTreeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GitCreateTreeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GitCreateTreeResponse> = when {
      alternative.id == "git/create-tree.response.alternative0" -> SdkResponseDecodeResult(
        value = GitCreateTreeResponse.SuccessJson(
          json = GitCodecs.gitCreateTreeResponseCodecAlternative0Registry.select(listOf("git/create-tree.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/create-tree.response.alternative1" -> SdkResponseDecodeResult(
        value = GitCreateTreeResponse.Http403Json(
          json = GitCodecs.gitCreateTreeResponseCodecAlternative1Registry.select(listOf("git/create-tree.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/create-tree.response.alternative2" -> SdkResponseDecodeResult(
        value = GitCreateTreeResponse.Http404Json(
          json = GitCodecs.gitCreateTreeResponseCodecAlternative2Registry.select(listOf("git/create-tree.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/create-tree.response.alternative3" -> SdkResponseDecodeResult(
        value = GitCreateTreeResponse.Http409Json(
          json = GitCodecs.gitCreateTreeResponseCodecAlternative3Registry.select(listOf("git/create-tree.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/create-tree.response.alternative4" -> SdkResponseDecodeResult(
        value = GitCreateTreeResponse.Http422Json(
          json = GitCodecs.gitCreateTreeResponseCodecAlternative4Registry.select(listOf("git/create-tree.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GitCreateTreeResponse = GitCreateTreeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `git/delete-ref` may expose through its typed API exception.
   */
  public sealed interface GitDeleteRefError

  /**
   * Typed response alternatives for `git/delete-ref`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GitDeleteRefResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitDeleteRefResponse

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitDeleteRefResponse,
        GitDeleteRefError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitDeleteRefResponse,
        GitDeleteRefError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitDeleteRefResponse
  }

  /**
   * Raised by `git/delete-ref` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GitDeleteRefApiException(
    public val error: GitDeleteRefError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "git/delete-ref")

  private object GitDeleteRefResponseDecoder : SdkResponseAlternativeDecoder<GitDeleteRefResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GitDeleteRefResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GitDeleteRefResponse> = when {
      alternative.id == "git/delete-ref.response.alternative0" -> SdkResponseDecodeResult(
        value = GitDeleteRefResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/delete-ref.response.alternative1" -> SdkResponseDecodeResult(
        value = GitDeleteRefResponse.Http409Json(
          json = GitCodecs.gitDeleteRefResponseCodecAlternative1Registry.select(listOf("git/delete-ref.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/delete-ref.response.alternative2" -> SdkResponseDecodeResult(
        value = GitDeleteRefResponse.Http422NoContent(
          unit = Unit,
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
    ): GitDeleteRefResponse = GitDeleteRefResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `git/get-blob` may expose through its typed API exception.
   */
  public sealed interface GitGetBlobError

  /**
   * Typed response alternatives for `git/get-blob`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GitGetBlobResponse {
    public class SuccessJson(
      public val json: Blob,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetBlobResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetBlobResponse,
        GitGetBlobError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetBlobResponse,
        GitGetBlobError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetBlobResponse,
        GitGetBlobError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetBlobResponse,
        GitGetBlobError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetBlobResponse
  }

  /**
   * Raised by `git/get-blob` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GitGetBlobApiException(
    public val error: GitGetBlobError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "git/get-blob")

  private object GitGetBlobResponseDecoder : SdkResponseAlternativeDecoder<GitGetBlobResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GitGetBlobResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GitGetBlobResponse> = when {
      alternative.id == "git/get-blob.response.alternative0" -> SdkResponseDecodeResult(
        value = GitGetBlobResponse.SuccessJson(
          json = GitCodecs.gitGetBlobResponseCodecAlternative0Registry.select(listOf("git/get-blob.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/get-blob.response.alternative1" -> SdkResponseDecodeResult(
        value = GitGetBlobResponse.Http403Json(
          json = GitCodecs.gitGetBlobResponseCodecAlternative1Registry.select(listOf("git/get-blob.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/get-blob.response.alternative2" -> SdkResponseDecodeResult(
        value = GitGetBlobResponse.Http404Json(
          json = GitCodecs.gitGetBlobResponseCodecAlternative2Registry.select(listOf("git/get-blob.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/get-blob.response.alternative3" -> SdkResponseDecodeResult(
        value = GitGetBlobResponse.Http409Json(
          json = GitCodecs.gitGetBlobResponseCodecAlternative3Registry.select(listOf("git/get-blob.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/get-blob.response.alternative4" -> SdkResponseDecodeResult(
        value = GitGetBlobResponse.Http422Json(
          json = GitCodecs.gitGetBlobResponseCodecAlternative4Registry.select(listOf("git/get-blob.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GitGetBlobResponse = GitGetBlobResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `git/get-commit` may expose through its typed API exception.
   */
  public sealed interface GitGetCommitError

  /**
   * Typed response alternatives for `git/get-commit`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GitGetCommitResponse {
    public class SuccessJson(
      public val json: GitCommit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetCommitResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetCommitResponse,
        GitGetCommitError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetCommitResponse,
        GitGetCommitError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetCommitResponse
  }

  /**
   * Raised by `git/get-commit` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GitGetCommitApiException(
    public val error: GitGetCommitError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "git/get-commit")

  private object GitGetCommitResponseDecoder : SdkResponseAlternativeDecoder<GitGetCommitResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GitGetCommitResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GitGetCommitResponse> = when {
      alternative.id == "git/get-commit.response.alternative0" -> SdkResponseDecodeResult(
        value = GitGetCommitResponse.SuccessJson(
          json = GitCodecs.gitGetCommitResponseCodecAlternative0Registry.select(listOf("git/get-commit.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/get-commit.response.alternative1" -> SdkResponseDecodeResult(
        value = GitGetCommitResponse.Http404Json(
          json = GitCodecs.gitGetCommitResponseCodecAlternative1Registry.select(listOf("git/get-commit.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/get-commit.response.alternative2" -> SdkResponseDecodeResult(
        value = GitGetCommitResponse.Http409Json(
          json = GitCodecs.gitGetCommitResponseCodecAlternative2Registry.select(listOf("git/get-commit.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GitGetCommitResponse = GitGetCommitResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `git/get-ref` may expose through its typed API exception.
   */
  public sealed interface GitGetRefError

  /**
   * Typed response alternatives for `git/get-ref`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GitGetRefResponse {
    public class SuccessJson(
      public val json: GitRef,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetRefResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetRefResponse,
        GitGetRefError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetRefResponse,
        GitGetRefError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetRefResponse
  }

  /**
   * Raised by `git/get-ref` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class GitGetRefApiException(
    public val error: GitGetRefError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "git/get-ref")

  private object GitGetRefResponseDecoder : SdkResponseAlternativeDecoder<GitGetRefResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GitGetRefResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GitGetRefResponse> = when {
      alternative.id == "git/get-ref.response.alternative0" -> SdkResponseDecodeResult(
        value = GitGetRefResponse.SuccessJson(
          json = GitCodecs.gitGetRefResponseCodecAlternative0Registry.select(listOf("git/get-ref.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/get-ref.response.alternative1" -> SdkResponseDecodeResult(
        value = GitGetRefResponse.Http404Json(
          json = GitCodecs.gitGetRefResponseCodecAlternative1Registry.select(listOf("git/get-ref.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/get-ref.response.alternative2" -> SdkResponseDecodeResult(
        value = GitGetRefResponse.Http409Json(
          json = GitCodecs.gitGetRefResponseCodecAlternative2Registry.select(listOf("git/get-ref.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GitGetRefResponse = GitGetRefResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `git/get-tag` may expose through its typed API exception.
   */
  public sealed interface GitGetTagError

  /**
   * Typed response alternatives for `git/get-tag`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GitGetTagResponse {
    public class SuccessJson(
      public val json: GitTag,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetTagResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetTagResponse,
        GitGetTagError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetTagResponse,
        GitGetTagError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetTagResponse
  }

  /**
   * Raised by `git/get-tag` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class GitGetTagApiException(
    public val error: GitGetTagError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "git/get-tag")

  private object GitGetTagResponseDecoder : SdkResponseAlternativeDecoder<GitGetTagResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GitGetTagResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GitGetTagResponse> = when {
      alternative.id == "git/get-tag.response.alternative0" -> SdkResponseDecodeResult(
        value = GitGetTagResponse.SuccessJson(
          json = GitCodecs.gitGetTagResponseCodecAlternative0Registry.select(listOf("git/get-tag.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/get-tag.response.alternative1" -> SdkResponseDecodeResult(
        value = GitGetTagResponse.Http404Json(
          json = GitCodecs.gitGetTagResponseCodecAlternative1Registry.select(listOf("git/get-tag.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/get-tag.response.alternative2" -> SdkResponseDecodeResult(
        value = GitGetTagResponse.Http409Json(
          json = GitCodecs.gitGetTagResponseCodecAlternative2Registry.select(listOf("git/get-tag.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GitGetTagResponse = GitGetTagResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `git/get-tree` may expose through its typed API exception.
   */
  public sealed interface GitGetTreeError

  /**
   * Typed response alternatives for `git/get-tree`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GitGetTreeResponse {
    public class SuccessJson(
      public val json: GitTree,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetTreeResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetTreeResponse,
        GitGetTreeError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetTreeResponse,
        GitGetTreeError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetTreeResponse,
        GitGetTreeError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitGetTreeResponse
  }

  /**
   * Raised by `git/get-tree` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GitGetTreeApiException(
    public val error: GitGetTreeError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "git/get-tree")

  private object GitGetTreeResponseDecoder : SdkResponseAlternativeDecoder<GitGetTreeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GitGetTreeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GitGetTreeResponse> = when {
      alternative.id == "git/get-tree.response.alternative0" -> SdkResponseDecodeResult(
        value = GitGetTreeResponse.SuccessJson(
          json = GitCodecs.gitGetTreeResponseCodecAlternative0Registry.select(listOf("git/get-tree.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/get-tree.response.alternative1" -> SdkResponseDecodeResult(
        value = GitGetTreeResponse.Http404Json(
          json = GitCodecs.gitGetTreeResponseCodecAlternative1Registry.select(listOf("git/get-tree.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/get-tree.response.alternative2" -> SdkResponseDecodeResult(
        value = GitGetTreeResponse.Http409Json(
          json = GitCodecs.gitGetTreeResponseCodecAlternative2Registry.select(listOf("git/get-tree.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/get-tree.response.alternative3" -> SdkResponseDecodeResult(
        value = GitGetTreeResponse.Http422Json(
          json = GitCodecs.gitGetTreeResponseCodecAlternative3Registry.select(listOf("git/get-tree.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GitGetTreeResponse = GitGetTreeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `git/list-matching-refs` may expose through its typed API exception.
   */
  public sealed interface GitListMatchingRefsError

  /**
   * Typed response alternatives for `git/list-matching-refs`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GitListMatchingRefsResponse {
    public class SuccessJson(
      public val json: List<GitRef>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitListMatchingRefsResponse

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitListMatchingRefsResponse,
        GitListMatchingRefsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitListMatchingRefsResponse
  }

  /**
   * Raised by `git/list-matching-refs` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class GitListMatchingRefsApiException(
    public val error: GitListMatchingRefsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "git/list-matching-refs")

  private object GitListMatchingRefsResponseDecoder : SdkResponseAlternativeDecoder<GitListMatchingRefsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GitListMatchingRefsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GitListMatchingRefsResponse> = when {
      alternative.id == "git/list-matching-refs.response.alternative0" -> SdkResponseDecodeResult(
        value = GitListMatchingRefsResponse.SuccessJson(
          json = GitCodecs.gitListMatchingRefsResponseCodecAlternative0Registry.select(listOf("git/list-matching-refs.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/list-matching-refs.response.alternative1" -> SdkResponseDecodeResult(
        value = GitListMatchingRefsResponse.Http409Json(
          json = GitCodecs.gitListMatchingRefsResponseCodecAlternative1Registry.select(listOf("git/list-matching-refs.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GitListMatchingRefsResponse = GitListMatchingRefsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `git/update-ref` may expose through its typed API exception.
   */
  public sealed interface GitUpdateRefError

  /**
   * Typed response alternatives for `git/update-ref`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GitUpdateRefResponse {
    public class SuccessJson(
      public val json: GitRef,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitUpdateRefResponse

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitUpdateRefResponse,
        GitUpdateRefError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitUpdateRefResponse,
        GitUpdateRefError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitUpdateRefResponse
  }

  /**
   * Raised by `git/update-ref` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GitUpdateRefApiException(
    public val error: GitUpdateRefError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "git/update-ref")

  private object GitUpdateRefResponseDecoder : SdkResponseAlternativeDecoder<GitUpdateRefResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GitUpdateRefResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GitUpdateRefResponse> = when {
      alternative.id == "git/update-ref.response.alternative0" -> SdkResponseDecodeResult(
        value = GitUpdateRefResponse.SuccessJson(
          json = GitCodecs.gitUpdateRefResponseCodecAlternative0Registry.select(listOf("git/update-ref.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/update-ref.response.alternative1" -> SdkResponseDecodeResult(
        value = GitUpdateRefResponse.Http409Json(
          json = GitCodecs.gitUpdateRefResponseCodecAlternative1Registry.select(listOf("git/update-ref.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "git/update-ref.response.alternative2" -> SdkResponseDecodeResult(
        value = GitUpdateRefResponse.Http422Json(
          json = GitCodecs.gitUpdateRefResponseCodecAlternative2Registry.select(listOf("git/update-ref.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GitUpdateRefResponse = GitUpdateRefResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val gitCreateCommitMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "git/create-commit",
          method = "POST",
          path = "/repos/{owner}/{repo}/git/commits",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "GitCommit",
              mode = SdkResponseMode.BUFFERED,
              id = "git/create-commit.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/create-commit.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/create-commit.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/create-commit.response.alternative3",
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

    public val gitCreateRefMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "git/create-ref",
          method = "POST",
          path = "/repos/{owner}/{repo}/git/refs",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "GitRef",
              mode = SdkResponseMode.BUFFERED,
              id = "git/create-ref.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/create-ref.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/create-ref.response.alternative2",
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

    public val gitCreateTagMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "git/create-tag",
          method = "POST",
          path = "/repos/{owner}/{repo}/git/tags",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "GitTag",
              mode = SdkResponseMode.BUFFERED,
              id = "git/create-tag.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/create-tag.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/create-tag.response.alternative2",
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

    public val gitCreateTreeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "git/create-tree",
          method = "POST",
          path = "/repos/{owner}/{repo}/git/trees",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "GitTree",
              mode = SdkResponseMode.BUFFERED,
              id = "git/create-tree.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/create-tree.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/create-tree.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/create-tree.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/create-tree.response.alternative4",
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

    public val gitDeleteRefMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "git/delete-ref",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/git/refs/{ref}",
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
              id = "git/delete-ref.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/delete-ref.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "git/delete-ref.response.alternative2",
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

    public val gitGetBlobMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "git/get-blob",
          method = "GET",
          path = "/repos/{owner}/{repo}/git/blobs/{file_sha}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Blob",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-blob.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-blob.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-blob.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-blob.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-blob.response.alternative4",
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

    public val gitGetCommitMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "git/get-commit",
          method = "GET",
          path = "/repos/{owner}/{repo}/git/commits/{commit_sha}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GitCommit",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-commit.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-commit.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-commit.response.alternative2",
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

    public val gitGetRefMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "git/get-ref",
          method = "GET",
          path = "/repos/{owner}/{repo}/git/ref/{ref}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GitRef",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-ref.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-ref.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-ref.response.alternative2",
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

    public val gitGetTagMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "git/get-tag",
          method = "GET",
          path = "/repos/{owner}/{repo}/git/tags/{tag_sha}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GitTag",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-tag.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-tag.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-tag.response.alternative2",
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

    public val gitGetTreeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "git/get-tree",
          method = "GET",
          path = "/repos/{owner}/{repo}/git/trees/{tree_sha}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GitTree",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-tree.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-tree.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-tree.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/get-tree.response.alternative3",
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

    public val gitListMatchingRefsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "git/list-matching-refs",
          method = "GET",
          path = "/repos/{owner}/{repo}/git/matching-refs/{ref}",
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
              id = "git/list-matching-refs.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/list-matching-refs.response.alternative1",
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

    public val gitUpdateRefMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "git/update-ref",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/git/refs/{ref}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GitRef",
              mode = SdkResponseMode.BUFFERED,
              id = "git/update-ref.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/update-ref.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "git/update-ref.response.alternative2",
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
