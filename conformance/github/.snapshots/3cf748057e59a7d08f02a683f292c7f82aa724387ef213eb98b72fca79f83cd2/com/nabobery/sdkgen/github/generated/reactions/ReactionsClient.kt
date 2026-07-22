package com.nabobery.sdkgen.github.generated.reactions

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.InlineReposCommentsReactionsGetParameterXb3630885
import com.nabobery.sdkgen.github.generated.InlineReposCommentsReactionsPostRequestJsonX6ceb60a7
import com.nabobery.sdkgen.github.generated.InlineReposIssuesCommentsReactionsGetParameterX82035019
import com.nabobery.sdkgen.github.generated.InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2
import com.nabobery.sdkgen.github.generated.InlineReposIssuesReactionsGetParameterX2abb93b4
import com.nabobery.sdkgen.github.generated.InlineReposIssuesReactionsPostRequestJsonXf44d88e2
import com.nabobery.sdkgen.github.generated.InlineReposPullsCommentsReactionsGetParameterX208077cb
import com.nabobery.sdkgen.github.generated.InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa
import com.nabobery.sdkgen.github.generated.InlineReposReleasesReactionsGetParameterXc71332b9
import com.nabobery.sdkgen.github.generated.InlineReposReleasesReactionsPostRequestJsonX6b169b78
import com.nabobery.sdkgen.github.generated.Reaction
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
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer

public object ReactionsCodecs {
  public const val REACTIONSCREATEFORCOMMITCOMMENT_REQUEST_CODEC_ID: String =
      "reactions/create-for-commit-comment.request"

  private val reactionsCreateForCommitCommentRequestCodec:
      MediaTypeCodec<InlineReposCommentsReactionsPostRequestJsonX6ceb60a7> =
      KotlinxSerializationCodec(REACTIONSCREATEFORCOMMITCOMMENT_REQUEST_CODEC_ID, InlineReposCommentsReactionsPostRequestJsonX6ceb60a7.Serializer, SdkJson)

  public const val REACTIONSCREATEFORCOMMITCOMMENT_RESPONSE_CODEC_ID: String =
      "reactions/create-for-commit-comment.response"

  private val reactionsCreateForCommitCommentResponseCodec: MediaTypeCodec<Reaction> =
      KotlinxSerializationCodec(REACTIONSCREATEFORCOMMITCOMMENT_RESPONSE_CODEC_ID, Reaction.Serializer, SdkJson)

  private val reactionsCreateForCommitCommentResponseCodecAlternative0Codec:
      MediaTypeCodec<Reaction> =
      KotlinxSerializationCodec("reactions/create-for-commit-comment.response.alternative0", Reaction.Serializer, SdkJson)

  public val reactionsCreateForCommitCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Reaction> =
      MediaTypeCodecRegistry.of(reactionsCreateForCommitCommentResponseCodecAlternative0Codec)

  private val reactionsCreateForCommitCommentResponseCodecAlternative1Codec:
      MediaTypeCodec<Reaction> =
      KotlinxSerializationCodec("reactions/create-for-commit-comment.response.alternative1", Reaction.Serializer, SdkJson)

  public val reactionsCreateForCommitCommentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Reaction> =
      MediaTypeCodecRegistry.of(reactionsCreateForCommitCommentResponseCodecAlternative1Codec)

  private val reactionsCreateForCommitCommentResponseCodecAlternative2Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("reactions/create-for-commit-comment.response.alternative2", ValidationError.Serializer, SdkJson)

  public val reactionsCreateForCommitCommentResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(reactionsCreateForCommitCommentResponseCodecAlternative2Codec)

  public val reactionsCreateForCommitCommentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCommentsReactionsPostRequestJsonX6ceb60a7> =
      MediaTypeCodecRegistry.of(reactionsCreateForCommitCommentRequestCodec)

  public val reactionsCreateForCommitCommentResponseCodecRegistry: MediaTypeCodecRegistry<Reaction>
      = MediaTypeCodecRegistry.of(reactionsCreateForCommitCommentResponseCodec)

  public const val REACTIONSCREATEFORISSUE_REQUEST_CODEC_ID: String =
      "reactions/create-for-issue.request"

  private val reactionsCreateForIssueRequestCodec:
      MediaTypeCodec<InlineReposIssuesReactionsPostRequestJsonXf44d88e2> =
      KotlinxSerializationCodec(REACTIONSCREATEFORISSUE_REQUEST_CODEC_ID, InlineReposIssuesReactionsPostRequestJsonXf44d88e2.Serializer, SdkJson)

  public const val REACTIONSCREATEFORISSUE_RESPONSE_CODEC_ID: String =
      "reactions/create-for-issue.response"

  private val reactionsCreateForIssueResponseCodec: MediaTypeCodec<Reaction> =
      KotlinxSerializationCodec(REACTIONSCREATEFORISSUE_RESPONSE_CODEC_ID, Reaction.Serializer, SdkJson)

  private val reactionsCreateForIssueResponseCodecAlternative0Codec: MediaTypeCodec<Reaction> =
      KotlinxSerializationCodec("reactions/create-for-issue.response.alternative0", Reaction.Serializer, SdkJson)

  public val reactionsCreateForIssueResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Reaction> =
      MediaTypeCodecRegistry.of(reactionsCreateForIssueResponseCodecAlternative0Codec)

  private val reactionsCreateForIssueResponseCodecAlternative1Codec: MediaTypeCodec<Reaction> =
      KotlinxSerializationCodec("reactions/create-for-issue.response.alternative1", Reaction.Serializer, SdkJson)

  public val reactionsCreateForIssueResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Reaction> =
      MediaTypeCodecRegistry.of(reactionsCreateForIssueResponseCodecAlternative1Codec)

  private val reactionsCreateForIssueResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError>
      =
      KotlinxSerializationCodec("reactions/create-for-issue.response.alternative2", ValidationError.Serializer, SdkJson)

  public val reactionsCreateForIssueResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(reactionsCreateForIssueResponseCodecAlternative2Codec)

  public val reactionsCreateForIssueRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposIssuesReactionsPostRequestJsonXf44d88e2> =
      MediaTypeCodecRegistry.of(reactionsCreateForIssueRequestCodec)

  public val reactionsCreateForIssueResponseCodecRegistry: MediaTypeCodecRegistry<Reaction> =
      MediaTypeCodecRegistry.of(reactionsCreateForIssueResponseCodec)

  public const val REACTIONSCREATEFORISSUECOMMENT_REQUEST_CODEC_ID: String =
      "reactions/create-for-issue-comment.request"

  private val reactionsCreateForIssueCommentRequestCodec:
      MediaTypeCodec<InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2> =
      KotlinxSerializationCodec(REACTIONSCREATEFORISSUECOMMENT_REQUEST_CODEC_ID, InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2.Serializer, SdkJson)

  public const val REACTIONSCREATEFORISSUECOMMENT_RESPONSE_CODEC_ID: String =
      "reactions/create-for-issue-comment.response"

  private val reactionsCreateForIssueCommentResponseCodec: MediaTypeCodec<Reaction> =
      KotlinxSerializationCodec(REACTIONSCREATEFORISSUECOMMENT_RESPONSE_CODEC_ID, Reaction.Serializer, SdkJson)

  private val reactionsCreateForIssueCommentResponseCodecAlternative0Codec: MediaTypeCodec<Reaction>
      =
      KotlinxSerializationCodec("reactions/create-for-issue-comment.response.alternative0", Reaction.Serializer, SdkJson)

  public val reactionsCreateForIssueCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Reaction> =
      MediaTypeCodecRegistry.of(reactionsCreateForIssueCommentResponseCodecAlternative0Codec)

  private val reactionsCreateForIssueCommentResponseCodecAlternative1Codec: MediaTypeCodec<Reaction>
      =
      KotlinxSerializationCodec("reactions/create-for-issue-comment.response.alternative1", Reaction.Serializer, SdkJson)

  public val reactionsCreateForIssueCommentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Reaction> =
      MediaTypeCodecRegistry.of(reactionsCreateForIssueCommentResponseCodecAlternative1Codec)

  private val reactionsCreateForIssueCommentResponseCodecAlternative2Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("reactions/create-for-issue-comment.response.alternative2", ValidationError.Serializer, SdkJson)

  public val reactionsCreateForIssueCommentResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(reactionsCreateForIssueCommentResponseCodecAlternative2Codec)

  public val reactionsCreateForIssueCommentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2> =
      MediaTypeCodecRegistry.of(reactionsCreateForIssueCommentRequestCodec)

  public val reactionsCreateForIssueCommentResponseCodecRegistry: MediaTypeCodecRegistry<Reaction> =
      MediaTypeCodecRegistry.of(reactionsCreateForIssueCommentResponseCodec)

  public const val REACTIONSCREATEFORPULLREQUESTREVIEWCOMMENT_REQUEST_CODEC_ID: String =
      "reactions/create-for-pull-request-review-comment.request"

  private val reactionsCreateForPullRequestReviewCommentRequestCodec:
      MediaTypeCodec<InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa> =
      KotlinxSerializationCodec(REACTIONSCREATEFORPULLREQUESTREVIEWCOMMENT_REQUEST_CODEC_ID, InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa.Serializer, SdkJson)

  public const val REACTIONSCREATEFORPULLREQUESTREVIEWCOMMENT_RESPONSE_CODEC_ID: String =
      "reactions/create-for-pull-request-review-comment.response"

  private val reactionsCreateForPullRequestReviewCommentResponseCodec: MediaTypeCodec<Reaction> =
      KotlinxSerializationCodec(REACTIONSCREATEFORPULLREQUESTREVIEWCOMMENT_RESPONSE_CODEC_ID, Reaction.Serializer, SdkJson)

  private val reactionsCreateForPullRequestReviewCommentResponseCodecAlternative0Codec:
      MediaTypeCodec<Reaction> =
      KotlinxSerializationCodec("reactions/create-for-pull-request-review-comment.response.alternative0", Reaction.Serializer, SdkJson)

  public val reactionsCreateForPullRequestReviewCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Reaction> =
      MediaTypeCodecRegistry.of(reactionsCreateForPullRequestReviewCommentResponseCodecAlternative0Codec)

  private val reactionsCreateForPullRequestReviewCommentResponseCodecAlternative1Codec:
      MediaTypeCodec<Reaction> =
      KotlinxSerializationCodec("reactions/create-for-pull-request-review-comment.response.alternative1", Reaction.Serializer, SdkJson)

  public val reactionsCreateForPullRequestReviewCommentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Reaction> =
      MediaTypeCodecRegistry.of(reactionsCreateForPullRequestReviewCommentResponseCodecAlternative1Codec)

  private val reactionsCreateForPullRequestReviewCommentResponseCodecAlternative2Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("reactions/create-for-pull-request-review-comment.response.alternative2", ValidationError.Serializer, SdkJson)

  public val reactionsCreateForPullRequestReviewCommentResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(reactionsCreateForPullRequestReviewCommentResponseCodecAlternative2Codec)

  public val reactionsCreateForPullRequestReviewCommentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa> =
      MediaTypeCodecRegistry.of(reactionsCreateForPullRequestReviewCommentRequestCodec)

  public val reactionsCreateForPullRequestReviewCommentResponseCodecRegistry:
      MediaTypeCodecRegistry<Reaction> =
      MediaTypeCodecRegistry.of(reactionsCreateForPullRequestReviewCommentResponseCodec)

  public const val REACTIONSCREATEFORRELEASE_REQUEST_CODEC_ID: String =
      "reactions/create-for-release.request"

  private val reactionsCreateForReleaseRequestCodec:
      MediaTypeCodec<InlineReposReleasesReactionsPostRequestJsonX6b169b78> =
      KotlinxSerializationCodec(REACTIONSCREATEFORRELEASE_REQUEST_CODEC_ID, InlineReposReleasesReactionsPostRequestJsonX6b169b78.Serializer, SdkJson)

  public const val REACTIONSCREATEFORRELEASE_RESPONSE_CODEC_ID: String =
      "reactions/create-for-release.response"

  private val reactionsCreateForReleaseResponseCodec: MediaTypeCodec<Reaction> =
      KotlinxSerializationCodec(REACTIONSCREATEFORRELEASE_RESPONSE_CODEC_ID, Reaction.Serializer, SdkJson)

  private val reactionsCreateForReleaseResponseCodecAlternative0Codec: MediaTypeCodec<Reaction> =
      KotlinxSerializationCodec("reactions/create-for-release.response.alternative0", Reaction.Serializer, SdkJson)

  public val reactionsCreateForReleaseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Reaction> =
      MediaTypeCodecRegistry.of(reactionsCreateForReleaseResponseCodecAlternative0Codec)

  private val reactionsCreateForReleaseResponseCodecAlternative1Codec: MediaTypeCodec<Reaction> =
      KotlinxSerializationCodec("reactions/create-for-release.response.alternative1", Reaction.Serializer, SdkJson)

  public val reactionsCreateForReleaseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Reaction> =
      MediaTypeCodecRegistry.of(reactionsCreateForReleaseResponseCodecAlternative1Codec)

  private val reactionsCreateForReleaseResponseCodecAlternative2Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("reactions/create-for-release.response.alternative2", ValidationError.Serializer, SdkJson)

  public val reactionsCreateForReleaseResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(reactionsCreateForReleaseResponseCodecAlternative2Codec)

  public val reactionsCreateForReleaseRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposReleasesReactionsPostRequestJsonX6b169b78> =
      MediaTypeCodecRegistry.of(reactionsCreateForReleaseRequestCodec)

  public val reactionsCreateForReleaseResponseCodecRegistry: MediaTypeCodecRegistry<Reaction> =
      MediaTypeCodecRegistry.of(reactionsCreateForReleaseResponseCodec)

  public val reactionsDeleteForCommitCommentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val reactionsDeleteForCommitCommentResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val reactionsDeleteForIssueRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val reactionsDeleteForIssueResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val reactionsDeleteForIssueCommentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val reactionsDeleteForIssueCommentResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val reactionsDeleteForPullRequestCommentRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public val reactionsDeleteForPullRequestCommentResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public val reactionsDeleteForReleaseRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val reactionsDeleteForReleaseResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val REACTIONSLISTFORCOMMITCOMMENT_RESPONSE_CODEC_ID: String =
      "reactions/list-for-commit-comment.response"

  private val reactionsListForCommitCommentResponseCodec: MediaTypeCodec<List<Reaction>> =
      KotlinxSerializationCodec(REACTIONSLISTFORCOMMITCOMMENT_RESPONSE_CODEC_ID, ListSerializer(Reaction.Serializer), SdkJson)

  private val reactionsListForCommitCommentResponseCodecAlternative0Codec:
      MediaTypeCodec<List<Reaction>> =
      KotlinxSerializationCodec("reactions/list-for-commit-comment.response.alternative0", ListSerializer(Reaction.Serializer), SdkJson)

  public val reactionsListForCommitCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Reaction>> =
      MediaTypeCodecRegistry.of(reactionsListForCommitCommentResponseCodecAlternative0Codec)

  private val reactionsListForCommitCommentResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("reactions/list-for-commit-comment.response.alternative1", BasicError.Serializer, SdkJson)

  public val reactionsListForCommitCommentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(reactionsListForCommitCommentResponseCodecAlternative1Codec)

  public val reactionsListForCommitCommentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val reactionsListForCommitCommentResponseCodecRegistry:
      MediaTypeCodecRegistry<List<Reaction>> =
      MediaTypeCodecRegistry.of(reactionsListForCommitCommentResponseCodec)

  public const val REACTIONSLISTFORISSUE_RESPONSE_CODEC_ID: String =
      "reactions/list-for-issue.response"

  private val reactionsListForIssueResponseCodec: MediaTypeCodec<List<Reaction>> =
      KotlinxSerializationCodec(REACTIONSLISTFORISSUE_RESPONSE_CODEC_ID, ListSerializer(Reaction.Serializer), SdkJson)

  private val reactionsListForIssueResponseCodecAlternative0Codec: MediaTypeCodec<List<Reaction>> =
      KotlinxSerializationCodec("reactions/list-for-issue.response.alternative0", ListSerializer(Reaction.Serializer), SdkJson)

  public val reactionsListForIssueResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Reaction>> =
      MediaTypeCodecRegistry.of(reactionsListForIssueResponseCodecAlternative0Codec)

  private val reactionsListForIssueResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("reactions/list-for-issue.response.alternative1", BasicError.Serializer, SdkJson)

  public val reactionsListForIssueResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(reactionsListForIssueResponseCodecAlternative1Codec)

  private val reactionsListForIssueResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("reactions/list-for-issue.response.alternative2", BasicError.Serializer, SdkJson)

  public val reactionsListForIssueResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(reactionsListForIssueResponseCodecAlternative2Codec)

  public val reactionsListForIssueRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val reactionsListForIssueResponseCodecRegistry: MediaTypeCodecRegistry<List<Reaction>> =
      MediaTypeCodecRegistry.of(reactionsListForIssueResponseCodec)

  public const val REACTIONSLISTFORISSUECOMMENT_RESPONSE_CODEC_ID: String =
      "reactions/list-for-issue-comment.response"

  private val reactionsListForIssueCommentResponseCodec: MediaTypeCodec<List<Reaction>> =
      KotlinxSerializationCodec(REACTIONSLISTFORISSUECOMMENT_RESPONSE_CODEC_ID, ListSerializer(Reaction.Serializer), SdkJson)

  private val reactionsListForIssueCommentResponseCodecAlternative0Codec:
      MediaTypeCodec<List<Reaction>> =
      KotlinxSerializationCodec("reactions/list-for-issue-comment.response.alternative0", ListSerializer(Reaction.Serializer), SdkJson)

  public val reactionsListForIssueCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Reaction>> =
      MediaTypeCodecRegistry.of(reactionsListForIssueCommentResponseCodecAlternative0Codec)

  private val reactionsListForIssueCommentResponseCodecAlternative1Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("reactions/list-for-issue-comment.response.alternative1", BasicError.Serializer, SdkJson)

  public val reactionsListForIssueCommentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(reactionsListForIssueCommentResponseCodecAlternative1Codec)

  public val reactionsListForIssueCommentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val reactionsListForIssueCommentResponseCodecRegistry:
      MediaTypeCodecRegistry<List<Reaction>> =
      MediaTypeCodecRegistry.of(reactionsListForIssueCommentResponseCodec)

  public const val REACTIONSLISTFORPULLREQUESTREVIEWCOMMENT_RESPONSE_CODEC_ID: String =
      "reactions/list-for-pull-request-review-comment.response"

  private val reactionsListForPullRequestReviewCommentResponseCodec: MediaTypeCodec<List<Reaction>>
      =
      KotlinxSerializationCodec(REACTIONSLISTFORPULLREQUESTREVIEWCOMMENT_RESPONSE_CODEC_ID, ListSerializer(Reaction.Serializer), SdkJson)

  private val reactionsListForPullRequestReviewCommentResponseCodecAlternative0Codec:
      MediaTypeCodec<List<Reaction>> =
      KotlinxSerializationCodec("reactions/list-for-pull-request-review-comment.response.alternative0", ListSerializer(Reaction.Serializer), SdkJson)

  public val reactionsListForPullRequestReviewCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Reaction>> =
      MediaTypeCodecRegistry.of(reactionsListForPullRequestReviewCommentResponseCodecAlternative0Codec)

  private val reactionsListForPullRequestReviewCommentResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("reactions/list-for-pull-request-review-comment.response.alternative1", BasicError.Serializer, SdkJson)

  public val reactionsListForPullRequestReviewCommentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(reactionsListForPullRequestReviewCommentResponseCodecAlternative1Codec)

  public val reactionsListForPullRequestReviewCommentRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val reactionsListForPullRequestReviewCommentResponseCodecRegistry:
      MediaTypeCodecRegistry<List<Reaction>> =
      MediaTypeCodecRegistry.of(reactionsListForPullRequestReviewCommentResponseCodec)

  public const val REACTIONSLISTFORRELEASE_RESPONSE_CODEC_ID: String =
      "reactions/list-for-release.response"

  private val reactionsListForReleaseResponseCodec: MediaTypeCodec<List<Reaction>> =
      KotlinxSerializationCodec(REACTIONSLISTFORRELEASE_RESPONSE_CODEC_ID, ListSerializer(Reaction.Serializer), SdkJson)

  private val reactionsListForReleaseResponseCodecAlternative0Codec: MediaTypeCodec<List<Reaction>>
      =
      KotlinxSerializationCodec("reactions/list-for-release.response.alternative0", ListSerializer(Reaction.Serializer), SdkJson)

  public val reactionsListForReleaseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Reaction>> =
      MediaTypeCodecRegistry.of(reactionsListForReleaseResponseCodecAlternative0Codec)

  private val reactionsListForReleaseResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("reactions/list-for-release.response.alternative1", BasicError.Serializer, SdkJson)

  public val reactionsListForReleaseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(reactionsListForReleaseResponseCodecAlternative1Codec)

  public val reactionsListForReleaseRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val reactionsListForReleaseResponseCodecRegistry: MediaTypeCodecRegistry<List<Reaction>> =
      MediaTypeCodecRegistry.of(reactionsListForReleaseResponseCodec)
}

/**
 * Client for the 'reactions' group of GitHub v3 REST API.
 */
public class ReactionsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@ReactionsClient.authentication)

  /**
   * Create a reaction to a [commit comment](https://docs.github.com/rest/commits/comments#get-a-commit-comment). A
   * response with an HTTP `200` status means that you already added the reaction type to this commit comment.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ReactionsCreateForCommitCommentApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded ReactionsCreateForCommitCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun reactionsCreateForCommitComment(
    request: InlineReposCommentsReactionsPostRequestJsonX6ceb60a7,
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Reaction = executor.executeWithTypedErrors<InlineReposCommentsReactionsPostRequestJsonX6ceb60a7, ReactionsCreateForCommitCommentResponse, Reaction>(
    request = SdkExecutionRequest(reactionsCreateForCommitCommentMetadata, baseUri, request, listOf(ReactionsCodecs.REACTIONSCREATEFORCOMMITCOMMENT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = ReactionsCodecs.reactionsCreateForCommitCommentRequestCodecRegistry,
    responseDecoder = ReactionsCreateForCommitCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ReactionsCreateForCommitCommentResponse.SuccessJson -> response.json
        is ReactionsCreateForCommitCommentResponse.SuccessJson2 -> response.json
        is ReactionsCreateForCommitCommentResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is ReactionsCreateForCommitCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ReactionsCreateForCommitCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ReactionsCreateForCommitCommentResponse.SuccessJson2 -> error("Runtime selected a success response for error mapping.")
        is ReactionsCreateForCommitCommentResponse.Http422Json -> ReactionsCreateForCommitCommentApiException(response, statusCode, headers)
        is ReactionsCreateForCommitCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Create a reaction to a [commit comment](https://docs.github.com/rest/commits/comments#get-a-commit-comment). A
   * response with an HTTP `200` status means that you already added the reaction type to this commit comment.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun reactionsCreateForCommitCommentWithResponse(
    request: InlineReposCommentsReactionsPostRequestJsonX6ceb60a7,
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ReactionsCreateForCommitCommentResponse> = executor.executeWithResponse<InlineReposCommentsReactionsPostRequestJsonX6ceb60a7, ReactionsCreateForCommitCommentResponse>(SdkExecutionRequest(reactionsCreateForCommitCommentMetadata, baseUri, request, listOf(ReactionsCodecs.REACTIONSCREATEFORCOMMITCOMMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReactionsCodecs.reactionsCreateForCommitCommentRequestCodecRegistry, ReactionsCreateForCommitCommentResponseDecoder, options)

  /**
   * Create a reaction to an [issue](https://docs.github.com/rest/issues/issues#get-an-issue). A response with an HTTP
   * `200` status means that you already added the reaction type to this issue.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ReactionsCreateForIssueApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ReactionsCreateForIssueError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun reactionsCreateForIssue(
    request: InlineReposIssuesReactionsPostRequestJsonXf44d88e2,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Reaction = executor.executeWithTypedErrors<InlineReposIssuesReactionsPostRequestJsonXf44d88e2, ReactionsCreateForIssueResponse, Reaction>(
    request = SdkExecutionRequest(reactionsCreateForIssueMetadata, baseUri, request, listOf(ReactionsCodecs.REACTIONSCREATEFORISSUE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = ReactionsCodecs.reactionsCreateForIssueRequestCodecRegistry,
    responseDecoder = ReactionsCreateForIssueResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ReactionsCreateForIssueResponse.SuccessJson -> response.json
        is ReactionsCreateForIssueResponse.SuccessJson2 -> response.json
        is ReactionsCreateForIssueResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is ReactionsCreateForIssueResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ReactionsCreateForIssueResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ReactionsCreateForIssueResponse.SuccessJson2 -> error("Runtime selected a success response for error mapping.")
        is ReactionsCreateForIssueResponse.Http422Json -> ReactionsCreateForIssueApiException(response, statusCode, headers)
        is ReactionsCreateForIssueResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Create a reaction to an [issue](https://docs.github.com/rest/issues/issues#get-an-issue). A response with an HTTP
   * `200` status means that you already added the reaction type to this issue.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun reactionsCreateForIssueWithResponse(
    request: InlineReposIssuesReactionsPostRequestJsonXf44d88e2,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ReactionsCreateForIssueResponse> = executor.executeWithResponse<InlineReposIssuesReactionsPostRequestJsonXf44d88e2, ReactionsCreateForIssueResponse>(SdkExecutionRequest(reactionsCreateForIssueMetadata, baseUri, request, listOf(ReactionsCodecs.REACTIONSCREATEFORISSUE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReactionsCodecs.reactionsCreateForIssueRequestCodecRegistry, ReactionsCreateForIssueResponseDecoder, options)

  /**
   * Create a reaction to an [issue comment](https://docs.github.com/rest/issues/comments#get-an-issue-comment). A
   * response with an HTTP `200` status means that you already added the reaction type to this issue comment.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ReactionsCreateForIssueCommentApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded ReactionsCreateForIssueCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun reactionsCreateForIssueComment(
    request: InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2,
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Reaction = executor.executeWithTypedErrors<InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2, ReactionsCreateForIssueCommentResponse, Reaction>(
    request = SdkExecutionRequest(reactionsCreateForIssueCommentMetadata, baseUri, request, listOf(ReactionsCodecs.REACTIONSCREATEFORISSUECOMMENT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = ReactionsCodecs.reactionsCreateForIssueCommentRequestCodecRegistry,
    responseDecoder = ReactionsCreateForIssueCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ReactionsCreateForIssueCommentResponse.SuccessJson -> response.json
        is ReactionsCreateForIssueCommentResponse.SuccessJson2 -> response.json
        is ReactionsCreateForIssueCommentResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is ReactionsCreateForIssueCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ReactionsCreateForIssueCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ReactionsCreateForIssueCommentResponse.SuccessJson2 -> error("Runtime selected a success response for error mapping.")
        is ReactionsCreateForIssueCommentResponse.Http422Json -> ReactionsCreateForIssueCommentApiException(response, statusCode, headers)
        is ReactionsCreateForIssueCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Create a reaction to an [issue comment](https://docs.github.com/rest/issues/comments#get-an-issue-comment). A
   * response with an HTTP `200` status means that you already added the reaction type to this issue comment.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun reactionsCreateForIssueCommentWithResponse(
    request: InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2,
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ReactionsCreateForIssueCommentResponse> = executor.executeWithResponse<InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2, ReactionsCreateForIssueCommentResponse>(SdkExecutionRequest(reactionsCreateForIssueCommentMetadata, baseUri, request, listOf(ReactionsCodecs.REACTIONSCREATEFORISSUECOMMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReactionsCodecs.reactionsCreateForIssueCommentRequestCodecRegistry, ReactionsCreateForIssueCommentResponseDecoder, options)

  /**
   * Create a reaction to a [pull request review
   * comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request). A response with an
   * HTTP `200` status means that you already added the reaction type to this pull request review comment.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ReactionsCreateForPullRequestReviewCommentApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded ReactionsCreateForPullRequestReviewCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun reactionsCreateForPullRequestReviewComment(
    request: InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa,
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Reaction = executor.executeWithTypedErrors<InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa, ReactionsCreateForPullRequestReviewCommentResponse, Reaction>(
    request = SdkExecutionRequest(reactionsCreateForPullRequestReviewCommentMetadata, baseUri, request, listOf(ReactionsCodecs.REACTIONSCREATEFORPULLREQUESTREVIEWCOMMENT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = ReactionsCodecs.reactionsCreateForPullRequestReviewCommentRequestCodecRegistry,
    responseDecoder = ReactionsCreateForPullRequestReviewCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ReactionsCreateForPullRequestReviewCommentResponse.SuccessJson -> response.json
        is ReactionsCreateForPullRequestReviewCommentResponse.SuccessJson2 -> response.json
        is ReactionsCreateForPullRequestReviewCommentResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is ReactionsCreateForPullRequestReviewCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ReactionsCreateForPullRequestReviewCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ReactionsCreateForPullRequestReviewCommentResponse.SuccessJson2 -> error("Runtime selected a success response for error mapping.")
        is ReactionsCreateForPullRequestReviewCommentResponse.Http422Json -> ReactionsCreateForPullRequestReviewCommentApiException(response, statusCode, headers)
        is ReactionsCreateForPullRequestReviewCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Create a reaction to a [pull request review
   * comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request). A response with an
   * HTTP `200` status means that you already added the reaction type to this pull request review comment.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun reactionsCreateForPullRequestReviewCommentWithResponse(
    request: InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa,
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ReactionsCreateForPullRequestReviewCommentResponse> = executor.executeWithResponse<InlineReposPullsCommentsReactionsPostRequestJsonXa49c8dfa, ReactionsCreateForPullRequestReviewCommentResponse>(SdkExecutionRequest(reactionsCreateForPullRequestReviewCommentMetadata, baseUri, request, listOf(ReactionsCodecs.REACTIONSCREATEFORPULLREQUESTREVIEWCOMMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReactionsCodecs.reactionsCreateForPullRequestReviewCommentRequestCodecRegistry, ReactionsCreateForPullRequestReviewCommentResponseDecoder, options)

  /**
   * Create a reaction to a [release](https://docs.github.com/rest/releases/releases#get-a-release). A response with a
   * `Status: 200 OK` means that you already added the reaction type to this release.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ReactionsCreateForReleaseApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ReactionsCreateForReleaseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun reactionsCreateForRelease(
    request: InlineReposReleasesReactionsPostRequestJsonX6b169b78,
    owner: String,
    releaseId: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Reaction = executor.executeWithTypedErrors<InlineReposReleasesReactionsPostRequestJsonX6b169b78, ReactionsCreateForReleaseResponse, Reaction>(
    request = SdkExecutionRequest(reactionsCreateForReleaseMetadata, baseUri, request, listOf(ReactionsCodecs.REACTIONSCREATEFORRELEASE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "release_id", values = listOf(releaseId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = ReactionsCodecs.reactionsCreateForReleaseRequestCodecRegistry,
    responseDecoder = ReactionsCreateForReleaseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ReactionsCreateForReleaseResponse.SuccessJson -> response.json
        is ReactionsCreateForReleaseResponse.SuccessJson2 -> response.json
        is ReactionsCreateForReleaseResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is ReactionsCreateForReleaseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ReactionsCreateForReleaseResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ReactionsCreateForReleaseResponse.SuccessJson2 -> error("Runtime selected a success response for error mapping.")
        is ReactionsCreateForReleaseResponse.Http422Json -> ReactionsCreateForReleaseApiException(response, statusCode, headers)
        is ReactionsCreateForReleaseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Create a reaction to a [release](https://docs.github.com/rest/releases/releases#get-a-release). A response with a
   * `Status: 200 OK` means that you already added the reaction type to this release.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun reactionsCreateForReleaseWithResponse(
    request: InlineReposReleasesReactionsPostRequestJsonX6b169b78,
    owner: String,
    releaseId: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ReactionsCreateForReleaseResponse> = executor.executeWithResponse<InlineReposReleasesReactionsPostRequestJsonX6b169b78, ReactionsCreateForReleaseResponse>(SdkExecutionRequest(reactionsCreateForReleaseMetadata, baseUri, request, listOf(ReactionsCodecs.REACTIONSCREATEFORRELEASE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "release_id", values = listOf(releaseId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReactionsCodecs.reactionsCreateForReleaseRequestCodecRegistry, ReactionsCreateForReleaseResponseDecoder, options)

  /**
   * > [!NOTE]
   * > You can also specify a repository by `repository_id` using the route `DELETE
   * /repositories/:repository_id/comments/:comment_id/reactions/:reaction_id`.
   *
   * Delete a reaction to a [commit comment](https://docs.github.com/rest/commits/comments#get-a-commit-comment).
   *
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun reactionsDeleteForCommitComment(
    commentId: Long,
    owner: String,
    reactionId: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(reactionsDeleteForCommitCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reaction_id", values = listOf(reactionId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReactionsCodecs.reactionsDeleteForCommitCommentRequestCodecRegistry, options)

  /**
   * > [!NOTE]
   * > You can also specify a repository by `repository_id` using the route `DELETE
   * /repositories/:repository_id/comments/:comment_id/reactions/:reaction_id`.
   *
   * Delete a reaction to a [commit comment](https://docs.github.com/rest/commits/comments#get-a-commit-comment).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun reactionsDeleteForCommitCommentWithResponse(
    commentId: Long,
    owner: String,
    reactionId: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ReactionsDeleteForCommitCommentResponse> = executor.executeWithResponse<Unit, ReactionsDeleteForCommitCommentResponse>(SdkExecutionRequest(reactionsDeleteForCommitCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reaction_id", values = listOf(reactionId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReactionsCodecs.reactionsDeleteForCommitCommentRequestCodecRegistry, ReactionsDeleteForCommitCommentResponseDecoder, options)

  /**
   * > [!NOTE]
   * > You can also specify a repository by `repository_id` using the route `DELETE
   * /repositories/:repository_id/issues/:issue_number/reactions/:reaction_id`.
   *
   * Delete a reaction to an [issue](https://docs.github.com/rest/issues/issues#get-an-issue).
   *
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun reactionsDeleteForIssue(
    issueNumber: Int,
    owner: String,
    reactionId: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(reactionsDeleteForIssueMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reaction_id", values = listOf(reactionId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReactionsCodecs.reactionsDeleteForIssueRequestCodecRegistry, options)

  /**
   * > [!NOTE]
   * > You can also specify a repository by `repository_id` using the route `DELETE
   * /repositories/:repository_id/issues/:issue_number/reactions/:reaction_id`.
   *
   * Delete a reaction to an [issue](https://docs.github.com/rest/issues/issues#get-an-issue).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun reactionsDeleteForIssueWithResponse(
    issueNumber: Int,
    owner: String,
    reactionId: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ReactionsDeleteForIssueResponse> = executor.executeWithResponse<Unit, ReactionsDeleteForIssueResponse>(SdkExecutionRequest(reactionsDeleteForIssueMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reaction_id", values = listOf(reactionId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReactionsCodecs.reactionsDeleteForIssueRequestCodecRegistry, ReactionsDeleteForIssueResponseDecoder, options)

  /**
   * > [!NOTE]
   * > You can also specify a repository by `repository_id` using the route `DELETE delete
   * /repositories/:repository_id/issues/comments/:comment_id/reactions/:reaction_id`.
   *
   * Delete a reaction to an [issue comment](https://docs.github.com/rest/issues/comments#get-an-issue-comment).
   *
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun reactionsDeleteForIssueComment(
    commentId: Long,
    owner: String,
    reactionId: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(reactionsDeleteForIssueCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reaction_id", values = listOf(reactionId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReactionsCodecs.reactionsDeleteForIssueCommentRequestCodecRegistry, options)

  /**
   * > [!NOTE]
   * > You can also specify a repository by `repository_id` using the route `DELETE delete
   * /repositories/:repository_id/issues/comments/:comment_id/reactions/:reaction_id`.
   *
   * Delete a reaction to an [issue comment](https://docs.github.com/rest/issues/comments#get-an-issue-comment).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun reactionsDeleteForIssueCommentWithResponse(
    commentId: Long,
    owner: String,
    reactionId: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ReactionsDeleteForIssueCommentResponse> = executor.executeWithResponse<Unit, ReactionsDeleteForIssueCommentResponse>(SdkExecutionRequest(reactionsDeleteForIssueCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reaction_id", values = listOf(reactionId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReactionsCodecs.reactionsDeleteForIssueCommentRequestCodecRegistry, ReactionsDeleteForIssueCommentResponseDecoder, options)

  /**
   * > [!NOTE]
   * > You can also specify a repository by `repository_id` using the route `DELETE
   * /repositories/:repository_id/pulls/comments/:comment_id/reactions/:reaction_id.`
   *
   * Delete a reaction to a [pull request review
   * comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request).
   *
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun reactionsDeleteForPullRequestComment(
    commentId: Long,
    owner: String,
    reactionId: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(reactionsDeleteForPullRequestCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reaction_id", values = listOf(reactionId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReactionsCodecs.reactionsDeleteForPullRequestCommentRequestCodecRegistry, options)

  /**
   * > [!NOTE]
   * > You can also specify a repository by `repository_id` using the route `DELETE
   * /repositories/:repository_id/pulls/comments/:comment_id/reactions/:reaction_id.`
   *
   * Delete a reaction to a [pull request review
   * comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun reactionsDeleteForPullRequestCommentWithResponse(
    commentId: Long,
    owner: String,
    reactionId: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ReactionsDeleteForPullRequestCommentResponse> = executor.executeWithResponse<Unit, ReactionsDeleteForPullRequestCommentResponse>(SdkExecutionRequest(reactionsDeleteForPullRequestCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reaction_id", values = listOf(reactionId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReactionsCodecs.reactionsDeleteForPullRequestCommentRequestCodecRegistry, ReactionsDeleteForPullRequestCommentResponseDecoder, options)

  /**
   * > [!NOTE]
   * > You can also specify a repository by `repository_id` using the route `DELETE delete
   * /repositories/:repository_id/releases/:release_id/reactions/:reaction_id`.
   *
   * Delete a reaction to a [release](https://docs.github.com/rest/releases/releases#get-a-release).
   *
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun reactionsDeleteForRelease(
    owner: String,
    reactionId: Int,
    releaseId: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(reactionsDeleteForReleaseMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reaction_id", values = listOf(reactionId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "release_id", values = listOf(releaseId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReactionsCodecs.reactionsDeleteForReleaseRequestCodecRegistry, options)

  /**
   * > [!NOTE]
   * > You can also specify a repository by `repository_id` using the route `DELETE delete
   * /repositories/:repository_id/releases/:release_id/reactions/:reaction_id`.
   *
   * Delete a reaction to a [release](https://docs.github.com/rest/releases/releases#get-a-release).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun reactionsDeleteForReleaseWithResponse(
    owner: String,
    reactionId: Int,
    releaseId: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ReactionsDeleteForReleaseResponse> = executor.executeWithResponse<Unit, ReactionsDeleteForReleaseResponse>(SdkExecutionRequest(reactionsDeleteForReleaseMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reaction_id", values = listOf(reactionId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "release_id", values = listOf(releaseId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReactionsCodecs.reactionsDeleteForReleaseRequestCodecRegistry, ReactionsDeleteForReleaseResponseDecoder, options)

  /**
   * List the reactions to a [commit comment](https://docs.github.com/rest/commits/comments#get-a-commit-comment).
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ReactionsListForCommitCommentApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded ReactionsListForCommitCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun reactionsListForCommitComment(
    commentId: Long,
    owner: String,
    repo: String,
    content: InlineReposCommentsReactionsGetParameterXb3630885? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Reaction> = executor.executeWithTypedErrors<Unit, ReactionsListForCommitCommentResponse, List<Reaction>>(
    request = SdkExecutionRequest(reactionsListForCommitCommentMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "content", values = content?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ReactionsCodecs.reactionsListForCommitCommentRequestCodecRegistry,
    responseDecoder = ReactionsListForCommitCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ReactionsListForCommitCommentResponse.SuccessJson -> response.json
        is ReactionsListForCommitCommentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ReactionsListForCommitCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ReactionsListForCommitCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ReactionsListForCommitCommentResponse.Http404Json -> ReactionsListForCommitCommentApiException(response, statusCode, headers)
        is ReactionsListForCommitCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List the reactions to a [commit comment](https://docs.github.com/rest/commits/comments#get-a-commit-comment).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun reactionsListForCommitCommentWithResponse(
    commentId: Long,
    owner: String,
    repo: String,
    content: InlineReposCommentsReactionsGetParameterXb3630885? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ReactionsListForCommitCommentResponse> = executor.executeWithResponse<Unit, ReactionsListForCommitCommentResponse>(SdkExecutionRequest(reactionsListForCommitCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "content", values = content?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ReactionsCodecs.reactionsListForCommitCommentRequestCodecRegistry, ReactionsListForCommitCommentResponseDecoder, options)

  /**
   * List the reactions to an [issue](https://docs.github.com/rest/issues/issues#get-an-issue).
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ReactionsListForIssueApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ReactionsListForIssueError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun reactionsListForIssue(
    issueNumber: Int,
    owner: String,
    repo: String,
    content: InlineReposIssuesReactionsGetParameterX2abb93b4? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Reaction> = executor.executeWithTypedErrors<Unit, ReactionsListForIssueResponse, List<Reaction>>(
    request = SdkExecutionRequest(reactionsListForIssueMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "content", values = content?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ReactionsCodecs.reactionsListForIssueRequestCodecRegistry,
    responseDecoder = ReactionsListForIssueResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ReactionsListForIssueResponse.SuccessJson -> response.json
        is ReactionsListForIssueResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ReactionsListForIssueResponse.Http410Json -> error("Runtime selected a non-success response for success mapping.")
        is ReactionsListForIssueResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ReactionsListForIssueResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ReactionsListForIssueResponse.Http404Json -> ReactionsListForIssueApiException(response, statusCode, headers)
        is ReactionsListForIssueResponse.Http410Json -> ReactionsListForIssueApiException(response, statusCode, headers)
        is ReactionsListForIssueResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List the reactions to an [issue](https://docs.github.com/rest/issues/issues#get-an-issue).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun reactionsListForIssueWithResponse(
    issueNumber: Int,
    owner: String,
    repo: String,
    content: InlineReposIssuesReactionsGetParameterX2abb93b4? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ReactionsListForIssueResponse> = executor.executeWithResponse<Unit, ReactionsListForIssueResponse>(SdkExecutionRequest(reactionsListForIssueMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "content", values = content?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ReactionsCodecs.reactionsListForIssueRequestCodecRegistry, ReactionsListForIssueResponseDecoder, options)

  /**
   * List the reactions to an [issue comment](https://docs.github.com/rest/issues/comments#get-an-issue-comment).
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ReactionsListForIssueCommentApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded ReactionsListForIssueCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun reactionsListForIssueComment(
    commentId: Long,
    owner: String,
    repo: String,
    content: InlineReposIssuesCommentsReactionsGetParameterX82035019? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Reaction> = executor.executeWithTypedErrors<Unit, ReactionsListForIssueCommentResponse, List<Reaction>>(
    request = SdkExecutionRequest(reactionsListForIssueCommentMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "content", values = content?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ReactionsCodecs.reactionsListForIssueCommentRequestCodecRegistry,
    responseDecoder = ReactionsListForIssueCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ReactionsListForIssueCommentResponse.SuccessJson -> response.json
        is ReactionsListForIssueCommentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ReactionsListForIssueCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ReactionsListForIssueCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ReactionsListForIssueCommentResponse.Http404Json -> ReactionsListForIssueCommentApiException(response, statusCode, headers)
        is ReactionsListForIssueCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List the reactions to an [issue comment](https://docs.github.com/rest/issues/comments#get-an-issue-comment).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun reactionsListForIssueCommentWithResponse(
    commentId: Long,
    owner: String,
    repo: String,
    content: InlineReposIssuesCommentsReactionsGetParameterX82035019? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ReactionsListForIssueCommentResponse> = executor.executeWithResponse<Unit, ReactionsListForIssueCommentResponse>(SdkExecutionRequest(reactionsListForIssueCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "content", values = content?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ReactionsCodecs.reactionsListForIssueCommentRequestCodecRegistry, ReactionsListForIssueCommentResponseDecoder, options)

  /**
   * List the reactions to a [pull request review
   * comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request).
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ReactionsListForPullRequestReviewCommentApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded ReactionsListForPullRequestReviewCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun reactionsListForPullRequestReviewComment(
    commentId: Long,
    owner: String,
    repo: String,
    content: InlineReposPullsCommentsReactionsGetParameterX208077cb? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Reaction> = executor.executeWithTypedErrors<Unit, ReactionsListForPullRequestReviewCommentResponse, List<Reaction>>(
    request = SdkExecutionRequest(reactionsListForPullRequestReviewCommentMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "content", values = content?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ReactionsCodecs.reactionsListForPullRequestReviewCommentRequestCodecRegistry,
    responseDecoder = ReactionsListForPullRequestReviewCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ReactionsListForPullRequestReviewCommentResponse.SuccessJson -> response.json
        is ReactionsListForPullRequestReviewCommentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ReactionsListForPullRequestReviewCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ReactionsListForPullRequestReviewCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ReactionsListForPullRequestReviewCommentResponse.Http404Json -> ReactionsListForPullRequestReviewCommentApiException(response, statusCode, headers)
        is ReactionsListForPullRequestReviewCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List the reactions to a [pull request review
   * comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun reactionsListForPullRequestReviewCommentWithResponse(
    commentId: Long,
    owner: String,
    repo: String,
    content: InlineReposPullsCommentsReactionsGetParameterX208077cb? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ReactionsListForPullRequestReviewCommentResponse> = executor.executeWithResponse<Unit, ReactionsListForPullRequestReviewCommentResponse>(SdkExecutionRequest(reactionsListForPullRequestReviewCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "content", values = content?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ReactionsCodecs.reactionsListForPullRequestReviewCommentRequestCodecRegistry, ReactionsListForPullRequestReviewCommentResponseDecoder, options)

  /**
   * List the reactions to a [release](https://docs.github.com/rest/releases/releases#get-a-release).
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ReactionsListForReleaseApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ReactionsListForReleaseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun reactionsListForRelease(
    owner: String,
    releaseId: Int,
    repo: String,
    content: InlineReposReleasesReactionsGetParameterXc71332b9? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Reaction> = executor.executeWithTypedErrors<Unit, ReactionsListForReleaseResponse, List<Reaction>>(
    request = SdkExecutionRequest(reactionsListForReleaseMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "release_id", values = listOf(releaseId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "content", values = content?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ReactionsCodecs.reactionsListForReleaseRequestCodecRegistry,
    responseDecoder = ReactionsListForReleaseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ReactionsListForReleaseResponse.SuccessJson -> response.json
        is ReactionsListForReleaseResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ReactionsListForReleaseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ReactionsListForReleaseResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ReactionsListForReleaseResponse.Http404Json -> ReactionsListForReleaseApiException(response, statusCode, headers)
        is ReactionsListForReleaseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List the reactions to a [release](https://docs.github.com/rest/releases/releases#get-a-release).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun reactionsListForReleaseWithResponse(
    owner: String,
    releaseId: Int,
    repo: String,
    content: InlineReposReleasesReactionsGetParameterXc71332b9? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ReactionsListForReleaseResponse> = executor.executeWithResponse<Unit, ReactionsListForReleaseResponse>(SdkExecutionRequest(reactionsListForReleaseMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "release_id", values = listOf(releaseId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "content", values = content?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ReactionsCodecs.reactionsListForReleaseRequestCodecRegistry, ReactionsListForReleaseResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `reactions/create-for-commit-comment` may expose through its typed
   * API exception.
   */
  public sealed interface ReactionsCreateForCommitCommentError

  /**
   * Typed response alternatives for `reactions/create-for-commit-comment`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface ReactionsCreateForCommitCommentResponse {
    public class SuccessJson(
      public val json: Reaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForCommitCommentResponse

    public class SuccessJson2(
      public val json: Reaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForCommitCommentResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForCommitCommentResponse,
        ReactionsCreateForCommitCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForCommitCommentResponse
  }

  /**
   * Raised by `reactions/create-for-commit-comment` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class ReactionsCreateForCommitCommentApiException(
    public val error: ReactionsCreateForCommitCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "reactions/create-for-commit-comment")

  private object ReactionsCreateForCommitCommentResponseDecoder : SdkResponseAlternativeDecoder<ReactionsCreateForCommitCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ReactionsCreateForCommitCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ReactionsCreateForCommitCommentResponse> = when {
      alternative.id == "reactions/create-for-commit-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = ReactionsCreateForCommitCommentResponse.SuccessJson(
          json = ReactionsCodecs.reactionsCreateForCommitCommentResponseCodecAlternative0Registry.select(listOf("reactions/create-for-commit-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/create-for-commit-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = ReactionsCreateForCommitCommentResponse.SuccessJson2(
          json = ReactionsCodecs.reactionsCreateForCommitCommentResponseCodecAlternative1Registry.select(listOf("reactions/create-for-commit-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/create-for-commit-comment.response.alternative2" -> SdkResponseDecodeResult(
        value = ReactionsCreateForCommitCommentResponse.Http422Json(
          json = ReactionsCodecs.reactionsCreateForCommitCommentResponseCodecAlternative2Registry.select(listOf("reactions/create-for-commit-comment.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ReactionsCreateForCommitCommentResponse = ReactionsCreateForCommitCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `reactions/create-for-issue` may expose through its typed API
   * exception.
   */
  public sealed interface ReactionsCreateForIssueError

  /**
   * Typed response alternatives for `reactions/create-for-issue`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ReactionsCreateForIssueResponse {
    public class SuccessJson(
      public val json: Reaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForIssueResponse

    public class SuccessJson2(
      public val json: Reaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForIssueResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForIssueResponse,
        ReactionsCreateForIssueError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForIssueResponse
  }

  /**
   * Raised by `reactions/create-for-issue` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ReactionsCreateForIssueApiException(
    public val error: ReactionsCreateForIssueError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "reactions/create-for-issue")

  private object ReactionsCreateForIssueResponseDecoder : SdkResponseAlternativeDecoder<ReactionsCreateForIssueResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ReactionsCreateForIssueResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ReactionsCreateForIssueResponse> = when {
      alternative.id == "reactions/create-for-issue.response.alternative0" -> SdkResponseDecodeResult(
        value = ReactionsCreateForIssueResponse.SuccessJson(
          json = ReactionsCodecs.reactionsCreateForIssueResponseCodecAlternative0Registry.select(listOf("reactions/create-for-issue.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/create-for-issue.response.alternative1" -> SdkResponseDecodeResult(
        value = ReactionsCreateForIssueResponse.SuccessJson2(
          json = ReactionsCodecs.reactionsCreateForIssueResponseCodecAlternative1Registry.select(listOf("reactions/create-for-issue.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/create-for-issue.response.alternative2" -> SdkResponseDecodeResult(
        value = ReactionsCreateForIssueResponse.Http422Json(
          json = ReactionsCodecs.reactionsCreateForIssueResponseCodecAlternative2Registry.select(listOf("reactions/create-for-issue.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ReactionsCreateForIssueResponse = ReactionsCreateForIssueResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `reactions/create-for-issue-comment` may expose through its typed
   * API exception.
   */
  public sealed interface ReactionsCreateForIssueCommentError

  /**
   * Typed response alternatives for `reactions/create-for-issue-comment`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface ReactionsCreateForIssueCommentResponse {
    public class SuccessJson(
      public val json: Reaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForIssueCommentResponse

    public class SuccessJson2(
      public val json: Reaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForIssueCommentResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForIssueCommentResponse,
        ReactionsCreateForIssueCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForIssueCommentResponse
  }

  /**
   * Raised by `reactions/create-for-issue-comment` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class ReactionsCreateForIssueCommentApiException(
    public val error: ReactionsCreateForIssueCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "reactions/create-for-issue-comment")

  private object ReactionsCreateForIssueCommentResponseDecoder : SdkResponseAlternativeDecoder<ReactionsCreateForIssueCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ReactionsCreateForIssueCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ReactionsCreateForIssueCommentResponse> = when {
      alternative.id == "reactions/create-for-issue-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = ReactionsCreateForIssueCommentResponse.SuccessJson(
          json = ReactionsCodecs.reactionsCreateForIssueCommentResponseCodecAlternative0Registry.select(listOf("reactions/create-for-issue-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/create-for-issue-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = ReactionsCreateForIssueCommentResponse.SuccessJson2(
          json = ReactionsCodecs.reactionsCreateForIssueCommentResponseCodecAlternative1Registry.select(listOf("reactions/create-for-issue-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/create-for-issue-comment.response.alternative2" -> SdkResponseDecodeResult(
        value = ReactionsCreateForIssueCommentResponse.Http422Json(
          json = ReactionsCodecs.reactionsCreateForIssueCommentResponseCodecAlternative2Registry.select(listOf("reactions/create-for-issue-comment.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ReactionsCreateForIssueCommentResponse = ReactionsCreateForIssueCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `reactions/create-for-pull-request-review-comment` may expose
   * through its typed API exception.
   */
  public sealed interface ReactionsCreateForPullRequestReviewCommentError

  /**
   * Typed response alternatives for `reactions/create-for-pull-request-review-comment`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface ReactionsCreateForPullRequestReviewCommentResponse {
    public class SuccessJson(
      public val json: Reaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForPullRequestReviewCommentResponse

    public class SuccessJson2(
      public val json: Reaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForPullRequestReviewCommentResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForPullRequestReviewCommentResponse,
        ReactionsCreateForPullRequestReviewCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForPullRequestReviewCommentResponse
  }

  /**
   * Raised by `reactions/create-for-pull-request-review-comment` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class ReactionsCreateForPullRequestReviewCommentApiException(
    public val error: ReactionsCreateForPullRequestReviewCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "reactions/create-for-pull-request-review-comment")

  private object ReactionsCreateForPullRequestReviewCommentResponseDecoder : SdkResponseAlternativeDecoder<ReactionsCreateForPullRequestReviewCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ReactionsCreateForPullRequestReviewCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ReactionsCreateForPullRequestReviewCommentResponse> = when {
      alternative.id == "reactions/create-for-pull-request-review-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = ReactionsCreateForPullRequestReviewCommentResponse.SuccessJson(
          json = ReactionsCodecs.reactionsCreateForPullRequestReviewCommentResponseCodecAlternative0Registry.select(listOf("reactions/create-for-pull-request-review-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/create-for-pull-request-review-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = ReactionsCreateForPullRequestReviewCommentResponse.SuccessJson2(
          json = ReactionsCodecs.reactionsCreateForPullRequestReviewCommentResponseCodecAlternative1Registry.select(listOf("reactions/create-for-pull-request-review-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/create-for-pull-request-review-comment.response.alternative2" -> SdkResponseDecodeResult(
        value = ReactionsCreateForPullRequestReviewCommentResponse.Http422Json(
          json = ReactionsCodecs.reactionsCreateForPullRequestReviewCommentResponseCodecAlternative2Registry.select(listOf("reactions/create-for-pull-request-review-comment.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ReactionsCreateForPullRequestReviewCommentResponse = ReactionsCreateForPullRequestReviewCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `reactions/create-for-release` may expose through its typed API
   * exception.
   */
  public sealed interface ReactionsCreateForReleaseError

  /**
   * Typed response alternatives for `reactions/create-for-release`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ReactionsCreateForReleaseResponse {
    public class SuccessJson(
      public val json: Reaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForReleaseResponse

    public class SuccessJson2(
      public val json: Reaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForReleaseResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForReleaseResponse,
        ReactionsCreateForReleaseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsCreateForReleaseResponse
  }

  /**
   * Raised by `reactions/create-for-release` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class ReactionsCreateForReleaseApiException(
    public val error: ReactionsCreateForReleaseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "reactions/create-for-release")

  private object ReactionsCreateForReleaseResponseDecoder : SdkResponseAlternativeDecoder<ReactionsCreateForReleaseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ReactionsCreateForReleaseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ReactionsCreateForReleaseResponse> = when {
      alternative.id == "reactions/create-for-release.response.alternative0" -> SdkResponseDecodeResult(
        value = ReactionsCreateForReleaseResponse.SuccessJson(
          json = ReactionsCodecs.reactionsCreateForReleaseResponseCodecAlternative0Registry.select(listOf("reactions/create-for-release.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/create-for-release.response.alternative1" -> SdkResponseDecodeResult(
        value = ReactionsCreateForReleaseResponse.SuccessJson2(
          json = ReactionsCodecs.reactionsCreateForReleaseResponseCodecAlternative1Registry.select(listOf("reactions/create-for-release.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/create-for-release.response.alternative2" -> SdkResponseDecodeResult(
        value = ReactionsCreateForReleaseResponse.Http422Json(
          json = ReactionsCodecs.reactionsCreateForReleaseResponseCodecAlternative2Registry.select(listOf("reactions/create-for-release.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ReactionsCreateForReleaseResponse = ReactionsCreateForReleaseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `reactions/delete-for-commit-comment`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface ReactionsDeleteForCommitCommentResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsDeleteForCommitCommentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsDeleteForCommitCommentResponse
  }

  private object ReactionsDeleteForCommitCommentResponseDecoder : SdkResponseAlternativeDecoder<ReactionsDeleteForCommitCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ReactionsDeleteForCommitCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ReactionsDeleteForCommitCommentResponse> = when {
      alternative.id == "reactions/delete-for-commit-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = ReactionsDeleteForCommitCommentResponse.SuccessNoContent(
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
    ): ReactionsDeleteForCommitCommentResponse = ReactionsDeleteForCommitCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `reactions/delete-for-issue`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ReactionsDeleteForIssueResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsDeleteForIssueResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsDeleteForIssueResponse
  }

  private object ReactionsDeleteForIssueResponseDecoder : SdkResponseAlternativeDecoder<ReactionsDeleteForIssueResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ReactionsDeleteForIssueResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ReactionsDeleteForIssueResponse> = when {
      alternative.id == "reactions/delete-for-issue.response.alternative0" -> SdkResponseDecodeResult(
        value = ReactionsDeleteForIssueResponse.SuccessNoContent(
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
    ): ReactionsDeleteForIssueResponse = ReactionsDeleteForIssueResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `reactions/delete-for-issue-comment`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface ReactionsDeleteForIssueCommentResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsDeleteForIssueCommentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsDeleteForIssueCommentResponse
  }

  private object ReactionsDeleteForIssueCommentResponseDecoder : SdkResponseAlternativeDecoder<ReactionsDeleteForIssueCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ReactionsDeleteForIssueCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ReactionsDeleteForIssueCommentResponse> = when {
      alternative.id == "reactions/delete-for-issue-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = ReactionsDeleteForIssueCommentResponse.SuccessNoContent(
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
    ): ReactionsDeleteForIssueCommentResponse = ReactionsDeleteForIssueCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `reactions/delete-for-pull-request-comment`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface ReactionsDeleteForPullRequestCommentResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsDeleteForPullRequestCommentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsDeleteForPullRequestCommentResponse
  }

  private object ReactionsDeleteForPullRequestCommentResponseDecoder : SdkResponseAlternativeDecoder<ReactionsDeleteForPullRequestCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ReactionsDeleteForPullRequestCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ReactionsDeleteForPullRequestCommentResponse> = when {
      alternative.id == "reactions/delete-for-pull-request-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = ReactionsDeleteForPullRequestCommentResponse.SuccessNoContent(
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
    ): ReactionsDeleteForPullRequestCommentResponse = ReactionsDeleteForPullRequestCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `reactions/delete-for-release`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ReactionsDeleteForReleaseResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsDeleteForReleaseResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsDeleteForReleaseResponse
  }

  private object ReactionsDeleteForReleaseResponseDecoder : SdkResponseAlternativeDecoder<ReactionsDeleteForReleaseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ReactionsDeleteForReleaseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ReactionsDeleteForReleaseResponse> = when {
      alternative.id == "reactions/delete-for-release.response.alternative0" -> SdkResponseDecodeResult(
        value = ReactionsDeleteForReleaseResponse.SuccessNoContent(
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
    ): ReactionsDeleteForReleaseResponse = ReactionsDeleteForReleaseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `reactions/list-for-commit-comment` may expose through its typed API
   * exception.
   */
  public sealed interface ReactionsListForCommitCommentError

  /**
   * Typed response alternatives for `reactions/list-for-commit-comment`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface ReactionsListForCommitCommentResponse {
    public class SuccessJson(
      public val json: List<Reaction>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForCommitCommentResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForCommitCommentResponse,
        ReactionsListForCommitCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForCommitCommentResponse
  }

  /**
   * Raised by `reactions/list-for-commit-comment` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class ReactionsListForCommitCommentApiException(
    public val error: ReactionsListForCommitCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "reactions/list-for-commit-comment")

  private object ReactionsListForCommitCommentResponseDecoder : SdkResponseAlternativeDecoder<ReactionsListForCommitCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ReactionsListForCommitCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ReactionsListForCommitCommentResponse> = when {
      alternative.id == "reactions/list-for-commit-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = ReactionsListForCommitCommentResponse.SuccessJson(
          json = ReactionsCodecs.reactionsListForCommitCommentResponseCodecAlternative0Registry.select(listOf("reactions/list-for-commit-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/list-for-commit-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = ReactionsListForCommitCommentResponse.Http404Json(
          json = ReactionsCodecs.reactionsListForCommitCommentResponseCodecAlternative1Registry.select(listOf("reactions/list-for-commit-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ReactionsListForCommitCommentResponse = ReactionsListForCommitCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `reactions/list-for-issue` may expose through its typed API
   * exception.
   */
  public sealed interface ReactionsListForIssueError

  /**
   * Typed response alternatives for `reactions/list-for-issue`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ReactionsListForIssueResponse {
    public class SuccessJson(
      public val json: List<Reaction>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForIssueResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForIssueResponse,
        ReactionsListForIssueError

    public class Http410Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForIssueResponse,
        ReactionsListForIssueError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForIssueResponse
  }

  /**
   * Raised by `reactions/list-for-issue` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ReactionsListForIssueApiException(
    public val error: ReactionsListForIssueError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "reactions/list-for-issue")

  private object ReactionsListForIssueResponseDecoder : SdkResponseAlternativeDecoder<ReactionsListForIssueResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ReactionsListForIssueResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ReactionsListForIssueResponse> = when {
      alternative.id == "reactions/list-for-issue.response.alternative0" -> SdkResponseDecodeResult(
        value = ReactionsListForIssueResponse.SuccessJson(
          json = ReactionsCodecs.reactionsListForIssueResponseCodecAlternative0Registry.select(listOf("reactions/list-for-issue.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/list-for-issue.response.alternative1" -> SdkResponseDecodeResult(
        value = ReactionsListForIssueResponse.Http404Json(
          json = ReactionsCodecs.reactionsListForIssueResponseCodecAlternative1Registry.select(listOf("reactions/list-for-issue.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/list-for-issue.response.alternative2" -> SdkResponseDecodeResult(
        value = ReactionsListForIssueResponse.Http410Json(
          json = ReactionsCodecs.reactionsListForIssueResponseCodecAlternative2Registry.select(listOf("reactions/list-for-issue.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ReactionsListForIssueResponse = ReactionsListForIssueResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `reactions/list-for-issue-comment` may expose through its typed API
   * exception.
   */
  public sealed interface ReactionsListForIssueCommentError

  /**
   * Typed response alternatives for `reactions/list-for-issue-comment`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ReactionsListForIssueCommentResponse {
    public class SuccessJson(
      public val json: List<Reaction>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForIssueCommentResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForIssueCommentResponse,
        ReactionsListForIssueCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForIssueCommentResponse
  }

  /**
   * Raised by `reactions/list-for-issue-comment` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class ReactionsListForIssueCommentApiException(
    public val error: ReactionsListForIssueCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "reactions/list-for-issue-comment")

  private object ReactionsListForIssueCommentResponseDecoder : SdkResponseAlternativeDecoder<ReactionsListForIssueCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ReactionsListForIssueCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ReactionsListForIssueCommentResponse> = when {
      alternative.id == "reactions/list-for-issue-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = ReactionsListForIssueCommentResponse.SuccessJson(
          json = ReactionsCodecs.reactionsListForIssueCommentResponseCodecAlternative0Registry.select(listOf("reactions/list-for-issue-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/list-for-issue-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = ReactionsListForIssueCommentResponse.Http404Json(
          json = ReactionsCodecs.reactionsListForIssueCommentResponseCodecAlternative1Registry.select(listOf("reactions/list-for-issue-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ReactionsListForIssueCommentResponse = ReactionsListForIssueCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `reactions/list-for-pull-request-review-comment` may expose through
   * its typed API exception.
   */
  public sealed interface ReactionsListForPullRequestReviewCommentError

  /**
   * Typed response alternatives for `reactions/list-for-pull-request-review-comment`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface ReactionsListForPullRequestReviewCommentResponse {
    public class SuccessJson(
      public val json: List<Reaction>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForPullRequestReviewCommentResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForPullRequestReviewCommentResponse,
        ReactionsListForPullRequestReviewCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForPullRequestReviewCommentResponse
  }

  /**
   * Raised by `reactions/list-for-pull-request-review-comment` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class ReactionsListForPullRequestReviewCommentApiException(
    public val error: ReactionsListForPullRequestReviewCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "reactions/list-for-pull-request-review-comment")

  private object ReactionsListForPullRequestReviewCommentResponseDecoder : SdkResponseAlternativeDecoder<ReactionsListForPullRequestReviewCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ReactionsListForPullRequestReviewCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ReactionsListForPullRequestReviewCommentResponse> = when {
      alternative.id == "reactions/list-for-pull-request-review-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = ReactionsListForPullRequestReviewCommentResponse.SuccessJson(
          json = ReactionsCodecs.reactionsListForPullRequestReviewCommentResponseCodecAlternative0Registry.select(listOf("reactions/list-for-pull-request-review-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/list-for-pull-request-review-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = ReactionsListForPullRequestReviewCommentResponse.Http404Json(
          json = ReactionsCodecs.reactionsListForPullRequestReviewCommentResponseCodecAlternative1Registry.select(listOf("reactions/list-for-pull-request-review-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ReactionsListForPullRequestReviewCommentResponse = ReactionsListForPullRequestReviewCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `reactions/list-for-release` may expose through its typed API
   * exception.
   */
  public sealed interface ReactionsListForReleaseError

  /**
   * Typed response alternatives for `reactions/list-for-release`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ReactionsListForReleaseResponse {
    public class SuccessJson(
      public val json: List<Reaction>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForReleaseResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForReleaseResponse,
        ReactionsListForReleaseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ReactionsListForReleaseResponse
  }

  /**
   * Raised by `reactions/list-for-release` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ReactionsListForReleaseApiException(
    public val error: ReactionsListForReleaseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "reactions/list-for-release")

  private object ReactionsListForReleaseResponseDecoder : SdkResponseAlternativeDecoder<ReactionsListForReleaseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ReactionsListForReleaseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ReactionsListForReleaseResponse> = when {
      alternative.id == "reactions/list-for-release.response.alternative0" -> SdkResponseDecodeResult(
        value = ReactionsListForReleaseResponse.SuccessJson(
          json = ReactionsCodecs.reactionsListForReleaseResponseCodecAlternative0Registry.select(listOf("reactions/list-for-release.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "reactions/list-for-release.response.alternative1" -> SdkResponseDecodeResult(
        value = ReactionsListForReleaseResponse.Http404Json(
          json = ReactionsCodecs.reactionsListForReleaseResponseCodecAlternative1Registry.select(listOf("reactions/list-for-release.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ReactionsListForReleaseResponse = ReactionsListForReleaseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val reactionsCreateForCommitCommentMetadata: OperationMetadata = OperationMetadata(
          operationId = "reactions/create-for-commit-comment",
          method = "POST",
          path = "/repos/{owner}/{repo}/comments/{comment_id}/reactions",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Reaction",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/create-for-commit-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "Reaction",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/create-for-commit-comment.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/create-for-commit-comment.response.alternative2",
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
        )

    public val reactionsCreateForIssueMetadata: OperationMetadata = OperationMetadata(
          operationId = "reactions/create-for-issue",
          method = "POST",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/reactions",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Reaction",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/create-for-issue.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "Reaction",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/create-for-issue.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/create-for-issue.response.alternative2",
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
        )

    public val reactionsCreateForIssueCommentMetadata: OperationMetadata = OperationMetadata(
          operationId = "reactions/create-for-issue-comment",
          method = "POST",
          path = "/repos/{owner}/{repo}/issues/comments/{comment_id}/reactions",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Reaction",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/create-for-issue-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "Reaction",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/create-for-issue-comment.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/create-for-issue-comment.response.alternative2",
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
        )

    public val reactionsCreateForPullRequestReviewCommentMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "reactions/create-for-pull-request-review-comment",
          method = "POST",
          path = "/repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Reaction",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/create-for-pull-request-review-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "Reaction",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/create-for-pull-request-review-comment.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/create-for-pull-request-review-comment.response.alternative2",
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
        )

    public val reactionsCreateForReleaseMetadata: OperationMetadata = OperationMetadata(
          operationId = "reactions/create-for-release",
          method = "POST",
          path = "/repos/{owner}/{repo}/releases/{release_id}/reactions",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Reaction",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/create-for-release.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "Reaction",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/create-for-release.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/create-for-release.response.alternative2",
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
        )

    public val reactionsDeleteForCommitCommentMetadata: OperationMetadata = OperationMetadata(
          operationId = "reactions/delete-for-commit-comment",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/comments/{comment_id}/reactions/{reaction_id}",
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
              id = "reactions/delete-for-commit-comment.response.alternative0",
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
        )

    public val reactionsDeleteForIssueMetadata: OperationMetadata = OperationMetadata(
          operationId = "reactions/delete-for-issue",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/reactions/{reaction_id}",
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
              id = "reactions/delete-for-issue.response.alternative0",
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
        )

    public val reactionsDeleteForIssueCommentMetadata: OperationMetadata = OperationMetadata(
          operationId = "reactions/delete-for-issue-comment",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/issues/comments/{comment_id}/reactions/{reaction_id}",
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
              id = "reactions/delete-for-issue-comment.response.alternative0",
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
        )

    public val reactionsDeleteForPullRequestCommentMetadata: OperationMetadata = OperationMetadata(
          operationId = "reactions/delete-for-pull-request-comment",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions/{reaction_id}",
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
              id = "reactions/delete-for-pull-request-comment.response.alternative0",
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
        )

    public val reactionsDeleteForReleaseMetadata: OperationMetadata = OperationMetadata(
          operationId = "reactions/delete-for-release",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/releases/{release_id}/reactions/{reaction_id}",
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
              id = "reactions/delete-for-release.response.alternative0",
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
        )

    public val reactionsListForCommitCommentMetadata: OperationMetadata = OperationMetadata(
          operationId = "reactions/list-for-commit-comment",
          method = "GET",
          path = "/repos/{owner}/{repo}/comments/{comment_id}/reactions",
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
              id = "reactions/list-for-commit-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/list-for-commit-comment.response.alternative1",
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
        )

    public val reactionsListForIssueMetadata: OperationMetadata = OperationMetadata(
          operationId = "reactions/list-for-issue",
          method = "GET",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/reactions",
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
              id = "reactions/list-for-issue.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/list-for-issue.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 410),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/list-for-issue.response.alternative2",
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
        )

    public val reactionsListForIssueCommentMetadata: OperationMetadata = OperationMetadata(
          operationId = "reactions/list-for-issue-comment",
          method = "GET",
          path = "/repos/{owner}/{repo}/issues/comments/{comment_id}/reactions",
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
              id = "reactions/list-for-issue-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/list-for-issue-comment.response.alternative1",
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
        )

    public val reactionsListForPullRequestReviewCommentMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "reactions/list-for-pull-request-review-comment",
          method = "GET",
          path = "/repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions",
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
              id = "reactions/list-for-pull-request-review-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/list-for-pull-request-review-comment.response.alternative1",
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
        )

    public val reactionsListForReleaseMetadata: OperationMetadata = OperationMetadata(
          operationId = "reactions/list-for-release",
          method = "GET",
          path = "/repos/{owner}/{repo}/releases/{release_id}/reactions",
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
              id = "reactions/list-for-release.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "reactions/list-for-release.response.alternative1",
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
        )
  }
}
