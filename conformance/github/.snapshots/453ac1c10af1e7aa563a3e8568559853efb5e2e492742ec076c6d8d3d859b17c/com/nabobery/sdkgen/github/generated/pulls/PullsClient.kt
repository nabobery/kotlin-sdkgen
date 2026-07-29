package com.nabobery.sdkgen.github.generated.pulls

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.Commit
import com.nabobery.sdkgen.github.generated.DiffEntry
import com.nabobery.sdkgen.github.generated.InlineReposPullsCommentsGetParameterX049d1ea8
import com.nabobery.sdkgen.github.generated.InlineReposPullsCommentsGetParameterX17a2b6c2
import com.nabobery.sdkgen.github.generated.InlineReposPullsCommentsGetParameterXaeb435e8
import com.nabobery.sdkgen.github.generated.InlineReposPullsCommentsPatchRequestJsonX088a1aad
import com.nabobery.sdkgen.github.generated.InlineReposPullsCommentsPostRequestJsonXc95c58c9
import com.nabobery.sdkgen.github.generated.InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad
import com.nabobery.sdkgen.github.generated.InlineReposPullsGetParameterXc701184e
import com.nabobery.sdkgen.github.generated.InlineReposPullsGetParameterXd8f86f5c
import com.nabobery.sdkgen.github.generated.InlineReposPullsGetParameterXe9f738bf
import com.nabobery.sdkgen.github.generated.InlineReposPullsMergePutRequestJsonX82e311a9
import com.nabobery.sdkgen.github.generated.InlineReposPullsMergePutResponse405JsonX8a40593a
import com.nabobery.sdkgen.github.generated.InlineReposPullsMergePutResponse409JsonXecbc830b
import com.nabobery.sdkgen.github.generated.InlineReposPullsRequestedReviewersDeleteRequestJsonX9231ce20
import com.nabobery.sdkgen.github.generated.InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32
import com.nabobery.sdkgen.github.generated.InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c
import com.nabobery.sdkgen.github.generated.InlineReposPullsReviewsEventsPostRequestJsonX992628ca
import com.nabobery.sdkgen.github.generated.InlineReposPullsReviewsPostRequestJsonX257d334c
import com.nabobery.sdkgen.github.generated.InlineReposPullsReviewsPutRequestJsonX36eb5f0e
import com.nabobery.sdkgen.github.generated.InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df
import com.nabobery.sdkgen.github.generated.InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff
import com.nabobery.sdkgen.github.generated.InlineServiceUnavailableResponseJsonX4cf316d5
import com.nabobery.sdkgen.github.generated.InlineSortParameterX37db756f
import com.nabobery.sdkgen.github.generated.PullRequestMergeResult
import com.nabobery.sdkgen.github.generated.PullRequestReview
import com.nabobery.sdkgen.github.generated.PullRequestReviewComment
import com.nabobery.sdkgen.github.generated.PullRequestReviewRequest
import com.nabobery.sdkgen.github.generated.PullRequestSimple
import com.nabobery.sdkgen.github.generated.ReviewComment
import com.nabobery.sdkgen.github.generated.SdkJson
import com.nabobery.sdkgen.github.generated.ValidationError
import com.nabobery.sdkgen.github.generated.ValidationErrorSimple
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
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.nullable

public object PullsCodecs {
  public val pullsCheckIfMergedRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val pullsCheckIfMergedResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val PULLSCREATEREPLYFORREVIEWCOMMENT_REQUEST_CODEC_ID: String =
      "pulls/create-reply-for-review-comment.request"

  private val pullsCreateReplyForReviewCommentRequestCodec:
      MediaTypeCodec<InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad> =
      KotlinxSerializationCodec(PULLSCREATEREPLYFORREVIEWCOMMENT_REQUEST_CODEC_ID, InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad.Serializer, SdkJson)

  public const val PULLSCREATEREPLYFORREVIEWCOMMENT_RESPONSE_CODEC_ID: String =
      "pulls/create-reply-for-review-comment.response"

  private val pullsCreateReplyForReviewCommentResponseCodec:
      MediaTypeCodec<PullRequestReviewComment> =
      KotlinxSerializationCodec(PULLSCREATEREPLYFORREVIEWCOMMENT_RESPONSE_CODEC_ID, PullRequestReviewComment.Serializer, SdkJson)

  private val pullsCreateReplyForReviewCommentResponseCodecAlternative0Codec:
      MediaTypeCodec<PullRequestReviewComment> =
      KotlinxSerializationCodec("pulls/create-reply-for-review-comment.response.alternative0", PullRequestReviewComment.Serializer, SdkJson)

  public val pullsCreateReplyForReviewCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PullRequestReviewComment> =
      MediaTypeCodecRegistry.of(pullsCreateReplyForReviewCommentResponseCodecAlternative0Codec)

  private val pullsCreateReplyForReviewCommentResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/create-reply-for-review-comment.response.alternative1", BasicError.Serializer, SdkJson)

  public val pullsCreateReplyForReviewCommentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(pullsCreateReplyForReviewCommentResponseCodecAlternative1Codec)

  public val pullsCreateReplyForReviewCommentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad> =
      MediaTypeCodecRegistry.of(pullsCreateReplyForReviewCommentRequestCodec)

  public val pullsCreateReplyForReviewCommentResponseCodecRegistry:
      MediaTypeCodecRegistry<PullRequestReviewComment> =
      MediaTypeCodecRegistry.of(pullsCreateReplyForReviewCommentResponseCodec)

  public const val PULLSCREATEREVIEW_REQUEST_CODEC_ID: String = "pulls/create-review.request"

  private val pullsCreateReviewRequestCodec:
      MediaTypeCodec<InlineReposPullsReviewsPostRequestJsonX257d334c?> =
      KotlinxSerializationCodec(PULLSCREATEREVIEW_REQUEST_CODEC_ID, InlineReposPullsReviewsPostRequestJsonX257d334c.Serializer.nullable, SdkJson)

  public const val PULLSCREATEREVIEW_RESPONSE_CODEC_ID: String = "pulls/create-review.response"

  private val pullsCreateReviewResponseCodec: MediaTypeCodec<PullRequestReview> =
      KotlinxSerializationCodec(PULLSCREATEREVIEW_RESPONSE_CODEC_ID, PullRequestReview.Serializer, SdkJson)

  private val pullsCreateReviewResponseCodecAlternative0Codec: MediaTypeCodec<PullRequestReview> =
      KotlinxSerializationCodec("pulls/create-review.response.alternative0", PullRequestReview.Serializer, SdkJson)

  public val pullsCreateReviewResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PullRequestReview> =
      MediaTypeCodecRegistry.of(pullsCreateReviewResponseCodecAlternative0Codec)

  private val pullsCreateReviewResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/create-review.response.alternative1", BasicError.Serializer, SdkJson)

  public val pullsCreateReviewResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(pullsCreateReviewResponseCodecAlternative1Codec)

  private val pullsCreateReviewResponseCodecAlternative2Codec: MediaTypeCodec<ValidationErrorSimple>
      =
      KotlinxSerializationCodec("pulls/create-review.response.alternative2", ValidationErrorSimple.Serializer, SdkJson)

  public val pullsCreateReviewResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationErrorSimple> =
      MediaTypeCodecRegistry.of(pullsCreateReviewResponseCodecAlternative2Codec)

  public val pullsCreateReviewRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposPullsReviewsPostRequestJsonX257d334c?> =
      MediaTypeCodecRegistry.of(pullsCreateReviewRequestCodec)

  public val pullsCreateReviewResponseCodecRegistry: MediaTypeCodecRegistry<PullRequestReview> =
      MediaTypeCodecRegistry.of(pullsCreateReviewResponseCodec)

  public const val PULLSCREATEREVIEWCOMMENT_REQUEST_CODEC_ID: String =
      "pulls/create-review-comment.request"

  private val pullsCreateReviewCommentRequestCodec:
      MediaTypeCodec<InlineReposPullsCommentsPostRequestJsonXc95c58c9> =
      KotlinxSerializationCodec(PULLSCREATEREVIEWCOMMENT_REQUEST_CODEC_ID, InlineReposPullsCommentsPostRequestJsonXc95c58c9.Serializer, SdkJson)

  public const val PULLSCREATEREVIEWCOMMENT_RESPONSE_CODEC_ID: String =
      "pulls/create-review-comment.response"

  private val pullsCreateReviewCommentResponseCodec: MediaTypeCodec<PullRequestReviewComment> =
      KotlinxSerializationCodec(PULLSCREATEREVIEWCOMMENT_RESPONSE_CODEC_ID, PullRequestReviewComment.Serializer, SdkJson)

  private val pullsCreateReviewCommentResponseCodecAlternative0Codec:
      MediaTypeCodec<PullRequestReviewComment> =
      KotlinxSerializationCodec("pulls/create-review-comment.response.alternative0", PullRequestReviewComment.Serializer, SdkJson)

  public val pullsCreateReviewCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PullRequestReviewComment> =
      MediaTypeCodecRegistry.of(pullsCreateReviewCommentResponseCodecAlternative0Codec)

  private val pullsCreateReviewCommentResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/create-review-comment.response.alternative1", BasicError.Serializer, SdkJson)

  public val pullsCreateReviewCommentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(pullsCreateReviewCommentResponseCodecAlternative1Codec)

  private val pullsCreateReviewCommentResponseCodecAlternative2Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("pulls/create-review-comment.response.alternative2", ValidationError.Serializer, SdkJson)

  public val pullsCreateReviewCommentResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(pullsCreateReviewCommentResponseCodecAlternative2Codec)

  public val pullsCreateReviewCommentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposPullsCommentsPostRequestJsonXc95c58c9> =
      MediaTypeCodecRegistry.of(pullsCreateReviewCommentRequestCodec)

  public val pullsCreateReviewCommentResponseCodecRegistry:
      MediaTypeCodecRegistry<PullRequestReviewComment> =
      MediaTypeCodecRegistry.of(pullsCreateReviewCommentResponseCodec)

  public const val PULLSDELETEPENDINGREVIEW_RESPONSE_CODEC_ID: String =
      "pulls/delete-pending-review.response"

  private val pullsDeletePendingReviewResponseCodec: MediaTypeCodec<PullRequestReview> =
      KotlinxSerializationCodec(PULLSDELETEPENDINGREVIEW_RESPONSE_CODEC_ID, PullRequestReview.Serializer, SdkJson)

  private val pullsDeletePendingReviewResponseCodecAlternative0Codec:
      MediaTypeCodec<PullRequestReview> =
      KotlinxSerializationCodec("pulls/delete-pending-review.response.alternative0", PullRequestReview.Serializer, SdkJson)

  public val pullsDeletePendingReviewResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PullRequestReview> =
      MediaTypeCodecRegistry.of(pullsDeletePendingReviewResponseCodecAlternative0Codec)

  private val pullsDeletePendingReviewResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/delete-pending-review.response.alternative1", BasicError.Serializer, SdkJson)

  public val pullsDeletePendingReviewResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(pullsDeletePendingReviewResponseCodecAlternative1Codec)

  private val pullsDeletePendingReviewResponseCodecAlternative2Codec:
      MediaTypeCodec<ValidationErrorSimple> =
      KotlinxSerializationCodec("pulls/delete-pending-review.response.alternative2", ValidationErrorSimple.Serializer, SdkJson)

  public val pullsDeletePendingReviewResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationErrorSimple> =
      MediaTypeCodecRegistry.of(pullsDeletePendingReviewResponseCodecAlternative2Codec)

  public val pullsDeletePendingReviewRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val pullsDeletePendingReviewResponseCodecRegistry:
      MediaTypeCodecRegistry<PullRequestReview> =
      MediaTypeCodecRegistry.of(pullsDeletePendingReviewResponseCodec)

  private val pullsDeleteReviewCommentResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/delete-review-comment.response.alternative1", BasicError.Serializer, SdkJson)

  public val pullsDeleteReviewCommentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(pullsDeleteReviewCommentResponseCodecAlternative1Codec)

  public val pullsDeleteReviewCommentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val pullsDeleteReviewCommentResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val PULLSDISMISSREVIEW_REQUEST_CODEC_ID: String = "pulls/dismiss-review.request"

  private val pullsDismissReviewRequestCodec:
      MediaTypeCodec<InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c> =
      KotlinxSerializationCodec(PULLSDISMISSREVIEW_REQUEST_CODEC_ID, InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c.Serializer, SdkJson)

  public const val PULLSDISMISSREVIEW_RESPONSE_CODEC_ID: String = "pulls/dismiss-review.response"

  private val pullsDismissReviewResponseCodec: MediaTypeCodec<PullRequestReview> =
      KotlinxSerializationCodec(PULLSDISMISSREVIEW_RESPONSE_CODEC_ID, PullRequestReview.Serializer, SdkJson)

  private val pullsDismissReviewResponseCodecAlternative0Codec: MediaTypeCodec<PullRequestReview> =
      KotlinxSerializationCodec("pulls/dismiss-review.response.alternative0", PullRequestReview.Serializer, SdkJson)

  public val pullsDismissReviewResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PullRequestReview> =
      MediaTypeCodecRegistry.of(pullsDismissReviewResponseCodecAlternative0Codec)

  private val pullsDismissReviewResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/dismiss-review.response.alternative1", BasicError.Serializer, SdkJson)

  public val pullsDismissReviewResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(pullsDismissReviewResponseCodecAlternative1Codec)

  private val pullsDismissReviewResponseCodecAlternative2Codec:
      MediaTypeCodec<ValidationErrorSimple> =
      KotlinxSerializationCodec("pulls/dismiss-review.response.alternative2", ValidationErrorSimple.Serializer, SdkJson)

  public val pullsDismissReviewResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationErrorSimple> =
      MediaTypeCodecRegistry.of(pullsDismissReviewResponseCodecAlternative2Codec)

  public val pullsDismissReviewRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c> =
      MediaTypeCodecRegistry.of(pullsDismissReviewRequestCodec)

  public val pullsDismissReviewResponseCodecRegistry: MediaTypeCodecRegistry<PullRequestReview> =
      MediaTypeCodecRegistry.of(pullsDismissReviewResponseCodec)

  public const val PULLSGETREVIEW_RESPONSE_CODEC_ID: String = "pulls/get-review.response"

  private val pullsGetReviewResponseCodec: MediaTypeCodec<PullRequestReview> =
      KotlinxSerializationCodec(PULLSGETREVIEW_RESPONSE_CODEC_ID, PullRequestReview.Serializer, SdkJson)

  private val pullsGetReviewResponseCodecAlternative0Codec: MediaTypeCodec<PullRequestReview> =
      KotlinxSerializationCodec("pulls/get-review.response.alternative0", PullRequestReview.Serializer, SdkJson)

  public val pullsGetReviewResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PullRequestReview> =
      MediaTypeCodecRegistry.of(pullsGetReviewResponseCodecAlternative0Codec)

  private val pullsGetReviewResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/get-review.response.alternative1", BasicError.Serializer, SdkJson)

  public val pullsGetReviewResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(pullsGetReviewResponseCodecAlternative1Codec)

  public val pullsGetReviewRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val pullsGetReviewResponseCodecRegistry: MediaTypeCodecRegistry<PullRequestReview> =
      MediaTypeCodecRegistry.of(pullsGetReviewResponseCodec)

  public const val PULLSGETREVIEWCOMMENT_RESPONSE_CODEC_ID: String =
      "pulls/get-review-comment.response"

  private val pullsGetReviewCommentResponseCodec: MediaTypeCodec<PullRequestReviewComment> =
      KotlinxSerializationCodec(PULLSGETREVIEWCOMMENT_RESPONSE_CODEC_ID, PullRequestReviewComment.Serializer, SdkJson)

  private val pullsGetReviewCommentResponseCodecAlternative0Codec:
      MediaTypeCodec<PullRequestReviewComment> =
      KotlinxSerializationCodec("pulls/get-review-comment.response.alternative0", PullRequestReviewComment.Serializer, SdkJson)

  public val pullsGetReviewCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PullRequestReviewComment> =
      MediaTypeCodecRegistry.of(pullsGetReviewCommentResponseCodecAlternative0Codec)

  private val pullsGetReviewCommentResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/get-review-comment.response.alternative1", BasicError.Serializer, SdkJson)

  public val pullsGetReviewCommentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(pullsGetReviewCommentResponseCodecAlternative1Codec)

  public val pullsGetReviewCommentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val pullsGetReviewCommentResponseCodecRegistry:
      MediaTypeCodecRegistry<PullRequestReviewComment> =
      MediaTypeCodecRegistry.of(pullsGetReviewCommentResponseCodec)

  public const val PULLSLIST_RESPONSE_CODEC_ID: String = "pulls/list.response"

  private val pullsListResponseCodec: MediaTypeCodec<List<PullRequestSimple>> =
      KotlinxSerializationCodec(PULLSLIST_RESPONSE_CODEC_ID, ListSerializer(PullRequestSimple.Serializer), SdkJson)

  private val pullsListResponseCodecAlternative0Codec: MediaTypeCodec<List<PullRequestSimple>> =
      KotlinxSerializationCodec("pulls/list.response.alternative0", ListSerializer(PullRequestSimple.Serializer), SdkJson)

  public val pullsListResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<PullRequestSimple>> =
      MediaTypeCodecRegistry.of(pullsListResponseCodecAlternative0Codec)

  private val pullsListResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("pulls/list.response.alternative2", ValidationError.Serializer, SdkJson)

  public val pullsListResponseCodecAlternative2Registry: MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(pullsListResponseCodecAlternative2Codec)

  public val pullsListRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val pullsListResponseCodecRegistry: MediaTypeCodecRegistry<List<PullRequestSimple>> =
      MediaTypeCodecRegistry.of(pullsListResponseCodec)

  public const val PULLSLISTCOMMENTSFORREVIEW_RESPONSE_CODEC_ID: String =
      "pulls/list-comments-for-review.response"

  private val pullsListCommentsForReviewResponseCodec: MediaTypeCodec<List<ReviewComment>> =
      KotlinxSerializationCodec(PULLSLISTCOMMENTSFORREVIEW_RESPONSE_CODEC_ID, ListSerializer(ReviewComment.Serializer), SdkJson)

  private val pullsListCommentsForReviewResponseCodecAlternative0Codec:
      MediaTypeCodec<List<ReviewComment>> =
      KotlinxSerializationCodec("pulls/list-comments-for-review.response.alternative0", ListSerializer(ReviewComment.Serializer), SdkJson)

  public val pullsListCommentsForReviewResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<ReviewComment>> =
      MediaTypeCodecRegistry.of(pullsListCommentsForReviewResponseCodecAlternative0Codec)

  private val pullsListCommentsForReviewResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/list-comments-for-review.response.alternative1", BasicError.Serializer, SdkJson)

  public val pullsListCommentsForReviewResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(pullsListCommentsForReviewResponseCodecAlternative1Codec)

  public val pullsListCommentsForReviewRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val pullsListCommentsForReviewResponseCodecRegistry:
      MediaTypeCodecRegistry<List<ReviewComment>> =
      MediaTypeCodecRegistry.of(pullsListCommentsForReviewResponseCodec)

  public const val PULLSLISTCOMMITS_RESPONSE_CODEC_ID: String = "pulls/list-commits.response"

  private val pullsListCommitsResponseCodec: MediaTypeCodec<List<Commit>> =
      KotlinxSerializationCodec(PULLSLISTCOMMITS_RESPONSE_CODEC_ID, ListSerializer(Commit.Serializer), SdkJson)

  private val pullsListCommitsResponseCodecAlternative0Codec: MediaTypeCodec<List<Commit>> =
      KotlinxSerializationCodec("pulls/list-commits.response.alternative0", ListSerializer(Commit.Serializer), SdkJson)

  public val pullsListCommitsResponseCodecAlternative0Registry: MediaTypeCodecRegistry<List<Commit>>
      = MediaTypeCodecRegistry.of(pullsListCommitsResponseCodecAlternative0Codec)

  public val pullsListCommitsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val pullsListCommitsResponseCodecRegistry: MediaTypeCodecRegistry<List<Commit>> =
      MediaTypeCodecRegistry.of(pullsListCommitsResponseCodec)

  public const val PULLSLISTFILES_RESPONSE_CODEC_ID: String = "pulls/list-files.response"

  private val pullsListFilesResponseCodec: MediaTypeCodec<List<DiffEntry>> =
      KotlinxSerializationCodec(PULLSLISTFILES_RESPONSE_CODEC_ID, ListSerializer(DiffEntry.Serializer), SdkJson)

  private val pullsListFilesResponseCodecAlternative0Codec: MediaTypeCodec<List<DiffEntry>> =
      KotlinxSerializationCodec("pulls/list-files.response.alternative0", ListSerializer(DiffEntry.Serializer), SdkJson)

  public val pullsListFilesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<DiffEntry>> =
      MediaTypeCodecRegistry.of(pullsListFilesResponseCodecAlternative0Codec)

  private val pullsListFilesResponseCodecAlternative1Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("pulls/list-files.response.alternative1", ValidationError.Serializer, SdkJson)

  public val pullsListFilesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(pullsListFilesResponseCodecAlternative1Codec)

  private val pullsListFilesResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/list-files.response.alternative2", BasicError.Serializer, SdkJson)

  public val pullsListFilesResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(pullsListFilesResponseCodecAlternative2Codec)

  private val pullsListFilesResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("pulls/list-files.response.alternative3", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val pullsListFilesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(pullsListFilesResponseCodecAlternative3Codec)

  public val pullsListFilesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val pullsListFilesResponseCodecRegistry: MediaTypeCodecRegistry<List<DiffEntry>> =
      MediaTypeCodecRegistry.of(pullsListFilesResponseCodec)

  public const val PULLSLISTREQUESTEDREVIEWERS_RESPONSE_CODEC_ID: String =
      "pulls/list-requested-reviewers.response"

  private val pullsListRequestedReviewersResponseCodec: MediaTypeCodec<PullRequestReviewRequest> =
      KotlinxSerializationCodec(PULLSLISTREQUESTEDREVIEWERS_RESPONSE_CODEC_ID, PullRequestReviewRequest.Serializer, SdkJson)

  private val pullsListRequestedReviewersResponseCodecAlternative0Codec:
      MediaTypeCodec<PullRequestReviewRequest> =
      KotlinxSerializationCodec("pulls/list-requested-reviewers.response.alternative0", PullRequestReviewRequest.Serializer, SdkJson)

  public val pullsListRequestedReviewersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PullRequestReviewRequest> =
      MediaTypeCodecRegistry.of(pullsListRequestedReviewersResponseCodecAlternative0Codec)

  public val pullsListRequestedReviewersRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val pullsListRequestedReviewersResponseCodecRegistry:
      MediaTypeCodecRegistry<PullRequestReviewRequest> =
      MediaTypeCodecRegistry.of(pullsListRequestedReviewersResponseCodec)

  public const val PULLSLISTREVIEWCOMMENTS_RESPONSE_CODEC_ID: String =
      "pulls/list-review-comments.response"

  private val pullsListReviewCommentsResponseCodec: MediaTypeCodec<List<PullRequestReviewComment>> =
      KotlinxSerializationCodec(PULLSLISTREVIEWCOMMENTS_RESPONSE_CODEC_ID, ListSerializer(PullRequestReviewComment.Serializer), SdkJson)

  private val pullsListReviewCommentsResponseCodecAlternative0Codec:
      MediaTypeCodec<List<PullRequestReviewComment>> =
      KotlinxSerializationCodec("pulls/list-review-comments.response.alternative0", ListSerializer(PullRequestReviewComment.Serializer), SdkJson)

  public val pullsListReviewCommentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<PullRequestReviewComment>> =
      MediaTypeCodecRegistry.of(pullsListReviewCommentsResponseCodecAlternative0Codec)

  public val pullsListReviewCommentsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val pullsListReviewCommentsResponseCodecRegistry:
      MediaTypeCodecRegistry<List<PullRequestReviewComment>> =
      MediaTypeCodecRegistry.of(pullsListReviewCommentsResponseCodec)

  public const val PULLSLISTREVIEWCOMMENTSFORREPO_RESPONSE_CODEC_ID: String =
      "pulls/list-review-comments-for-repo.response"

  private val pullsListReviewCommentsForRepoResponseCodec:
      MediaTypeCodec<List<PullRequestReviewComment>> =
      KotlinxSerializationCodec(PULLSLISTREVIEWCOMMENTSFORREPO_RESPONSE_CODEC_ID, ListSerializer(PullRequestReviewComment.Serializer), SdkJson)

  private val pullsListReviewCommentsForRepoResponseCodecAlternative0Codec:
      MediaTypeCodec<List<PullRequestReviewComment>> =
      KotlinxSerializationCodec("pulls/list-review-comments-for-repo.response.alternative0", ListSerializer(PullRequestReviewComment.Serializer), SdkJson)

  public val pullsListReviewCommentsForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<PullRequestReviewComment>> =
      MediaTypeCodecRegistry.of(pullsListReviewCommentsForRepoResponseCodecAlternative0Codec)

  public val pullsListReviewCommentsForRepoRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val pullsListReviewCommentsForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<List<PullRequestReviewComment>> =
      MediaTypeCodecRegistry.of(pullsListReviewCommentsForRepoResponseCodec)

  public const val PULLSLISTREVIEWS_RESPONSE_CODEC_ID: String = "pulls/list-reviews.response"

  private val pullsListReviewsResponseCodec: MediaTypeCodec<List<PullRequestReview>> =
      KotlinxSerializationCodec(PULLSLISTREVIEWS_RESPONSE_CODEC_ID, ListSerializer(PullRequestReview.Serializer), SdkJson)

  private val pullsListReviewsResponseCodecAlternative0Codec:
      MediaTypeCodec<List<PullRequestReview>> =
      KotlinxSerializationCodec("pulls/list-reviews.response.alternative0", ListSerializer(PullRequestReview.Serializer), SdkJson)

  public val pullsListReviewsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<PullRequestReview>> =
      MediaTypeCodecRegistry.of(pullsListReviewsResponseCodecAlternative0Codec)

  public val pullsListReviewsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val pullsListReviewsResponseCodecRegistry: MediaTypeCodecRegistry<List<PullRequestReview>>
      = MediaTypeCodecRegistry.of(pullsListReviewsResponseCodec)

  public const val PULLSMERGE_REQUEST_CODEC_ID: String = "pulls/merge.request"

  private val pullsMergeRequestCodec: MediaTypeCodec<InlineReposPullsMergePutRequestJsonX82e311a9?>
      =
      KotlinxSerializationCodec(PULLSMERGE_REQUEST_CODEC_ID, InlineReposPullsMergePutRequestJsonX82e311a9.Serializer.nullable, SdkJson)

  public const val PULLSMERGE_RESPONSE_CODEC_ID: String = "pulls/merge.response"

  private val pullsMergeResponseCodec: MediaTypeCodec<PullRequestMergeResult> =
      KotlinxSerializationCodec(PULLSMERGE_RESPONSE_CODEC_ID, PullRequestMergeResult.Serializer, SdkJson)

  private val pullsMergeResponseCodecAlternative0Codec: MediaTypeCodec<PullRequestMergeResult> =
      KotlinxSerializationCodec("pulls/merge.response.alternative0", PullRequestMergeResult.Serializer, SdkJson)

  public val pullsMergeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PullRequestMergeResult> =
      MediaTypeCodecRegistry.of(pullsMergeResponseCodecAlternative0Codec)

  private val pullsMergeResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/merge.response.alternative1", BasicError.Serializer, SdkJson)

  public val pullsMergeResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(pullsMergeResponseCodecAlternative1Codec)

  private val pullsMergeResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/merge.response.alternative2", BasicError.Serializer, SdkJson)

  public val pullsMergeResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(pullsMergeResponseCodecAlternative2Codec)

  private val pullsMergeResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineReposPullsMergePutResponse405JsonX8a40593a> =
      KotlinxSerializationCodec("pulls/merge.response.alternative3", InlineReposPullsMergePutResponse405JsonX8a40593a.Serializer, SdkJson)

  public val pullsMergeResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineReposPullsMergePutResponse405JsonX8a40593a> =
      MediaTypeCodecRegistry.of(pullsMergeResponseCodecAlternative3Codec)

  private val pullsMergeResponseCodecAlternative4Codec:
      MediaTypeCodec<InlineReposPullsMergePutResponse409JsonXecbc830b> =
      KotlinxSerializationCodec("pulls/merge.response.alternative4", InlineReposPullsMergePutResponse409JsonXecbc830b.Serializer, SdkJson)

  public val pullsMergeResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InlineReposPullsMergePutResponse409JsonXecbc830b> =
      MediaTypeCodecRegistry.of(pullsMergeResponseCodecAlternative4Codec)

  private val pullsMergeResponseCodecAlternative5Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("pulls/merge.response.alternative5", ValidationError.Serializer, SdkJson)

  public val pullsMergeResponseCodecAlternative5Registry: MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(pullsMergeResponseCodecAlternative5Codec)

  public val pullsMergeRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposPullsMergePutRequestJsonX82e311a9?> =
      MediaTypeCodecRegistry.of(pullsMergeRequestCodec)

  public val pullsMergeResponseCodecRegistry: MediaTypeCodecRegistry<PullRequestMergeResult> =
      MediaTypeCodecRegistry.of(pullsMergeResponseCodec)

  public const val PULLSREMOVEREQUESTEDREVIEWERS_REQUEST_CODEC_ID: String =
      "pulls/remove-requested-reviewers.request"

  private val pullsRemoveRequestedReviewersRequestCodec:
      MediaTypeCodec<InlineReposPullsRequestedReviewersDeleteRequestJsonX9231ce20> =
      KotlinxSerializationCodec(PULLSREMOVEREQUESTEDREVIEWERS_REQUEST_CODEC_ID, InlineReposPullsRequestedReviewersDeleteRequestJsonX9231ce20.Serializer, SdkJson)

  public const val PULLSREMOVEREQUESTEDREVIEWERS_RESPONSE_CODEC_ID: String =
      "pulls/remove-requested-reviewers.response"

  private val pullsRemoveRequestedReviewersResponseCodec: MediaTypeCodec<PullRequestSimple> =
      KotlinxSerializationCodec(PULLSREMOVEREQUESTEDREVIEWERS_RESPONSE_CODEC_ID, PullRequestSimple.Serializer, SdkJson)

  private val pullsRemoveRequestedReviewersResponseCodecAlternative0Codec:
      MediaTypeCodec<PullRequestSimple> =
      KotlinxSerializationCodec("pulls/remove-requested-reviewers.response.alternative0", PullRequestSimple.Serializer, SdkJson)

  public val pullsRemoveRequestedReviewersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PullRequestSimple> =
      MediaTypeCodecRegistry.of(pullsRemoveRequestedReviewersResponseCodecAlternative0Codec)

  private val pullsRemoveRequestedReviewersResponseCodecAlternative1Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("pulls/remove-requested-reviewers.response.alternative1", ValidationError.Serializer, SdkJson)

  public val pullsRemoveRequestedReviewersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(pullsRemoveRequestedReviewersResponseCodecAlternative1Codec)

  public val pullsRemoveRequestedReviewersRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposPullsRequestedReviewersDeleteRequestJsonX9231ce20> =
      MediaTypeCodecRegistry.of(pullsRemoveRequestedReviewersRequestCodec)

  public val pullsRemoveRequestedReviewersResponseCodecRegistry:
      MediaTypeCodecRegistry<PullRequestSimple> =
      MediaTypeCodecRegistry.of(pullsRemoveRequestedReviewersResponseCodec)

  public const val PULLSREQUESTREVIEWERS_REQUEST_CODEC_ID: String =
      "pulls/request-reviewers.request"

  private val pullsRequestReviewersRequestCodec:
      MediaTypeCodec<InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32?> =
      KotlinxSerializationCodec(PULLSREQUESTREVIEWERS_REQUEST_CODEC_ID, InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32.Serializer.nullable, SdkJson)

  public const val PULLSREQUESTREVIEWERS_RESPONSE_CODEC_ID: String =
      "pulls/request-reviewers.response"

  private val pullsRequestReviewersResponseCodec: MediaTypeCodec<PullRequestSimple> =
      KotlinxSerializationCodec(PULLSREQUESTREVIEWERS_RESPONSE_CODEC_ID, PullRequestSimple.Serializer, SdkJson)

  private val pullsRequestReviewersResponseCodecAlternative0Codec: MediaTypeCodec<PullRequestSimple>
      =
      KotlinxSerializationCodec("pulls/request-reviewers.response.alternative0", PullRequestSimple.Serializer, SdkJson)

  public val pullsRequestReviewersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PullRequestSimple> =
      MediaTypeCodecRegistry.of(pullsRequestReviewersResponseCodecAlternative0Codec)

  private val pullsRequestReviewersResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/request-reviewers.response.alternative1", BasicError.Serializer, SdkJson)

  public val pullsRequestReviewersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(pullsRequestReviewersResponseCodecAlternative1Codec)

  public val pullsRequestReviewersRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32?> =
      MediaTypeCodecRegistry.of(pullsRequestReviewersRequestCodec)

  public val pullsRequestReviewersResponseCodecRegistry: MediaTypeCodecRegistry<PullRequestSimple> =
      MediaTypeCodecRegistry.of(pullsRequestReviewersResponseCodec)

  public const val PULLSSUBMITREVIEW_REQUEST_CODEC_ID: String = "pulls/submit-review.request"

  private val pullsSubmitReviewRequestCodec:
      MediaTypeCodec<InlineReposPullsReviewsEventsPostRequestJsonX992628ca> =
      KotlinxSerializationCodec(PULLSSUBMITREVIEW_REQUEST_CODEC_ID, InlineReposPullsReviewsEventsPostRequestJsonX992628ca.Serializer, SdkJson)

  public const val PULLSSUBMITREVIEW_RESPONSE_CODEC_ID: String = "pulls/submit-review.response"

  private val pullsSubmitReviewResponseCodec: MediaTypeCodec<PullRequestReview> =
      KotlinxSerializationCodec(PULLSSUBMITREVIEW_RESPONSE_CODEC_ID, PullRequestReview.Serializer, SdkJson)

  private val pullsSubmitReviewResponseCodecAlternative0Codec: MediaTypeCodec<PullRequestReview> =
      KotlinxSerializationCodec("pulls/submit-review.response.alternative0", PullRequestReview.Serializer, SdkJson)

  public val pullsSubmitReviewResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PullRequestReview> =
      MediaTypeCodecRegistry.of(pullsSubmitReviewResponseCodecAlternative0Codec)

  private val pullsSubmitReviewResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/submit-review.response.alternative1", BasicError.Serializer, SdkJson)

  public val pullsSubmitReviewResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(pullsSubmitReviewResponseCodecAlternative1Codec)

  private val pullsSubmitReviewResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/submit-review.response.alternative2", BasicError.Serializer, SdkJson)

  public val pullsSubmitReviewResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(pullsSubmitReviewResponseCodecAlternative2Codec)

  private val pullsSubmitReviewResponseCodecAlternative3Codec: MediaTypeCodec<ValidationErrorSimple>
      =
      KotlinxSerializationCodec("pulls/submit-review.response.alternative3", ValidationErrorSimple.Serializer, SdkJson)

  public val pullsSubmitReviewResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationErrorSimple> =
      MediaTypeCodecRegistry.of(pullsSubmitReviewResponseCodecAlternative3Codec)

  public val pullsSubmitReviewRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposPullsReviewsEventsPostRequestJsonX992628ca> =
      MediaTypeCodecRegistry.of(pullsSubmitReviewRequestCodec)

  public val pullsSubmitReviewResponseCodecRegistry: MediaTypeCodecRegistry<PullRequestReview> =
      MediaTypeCodecRegistry.of(pullsSubmitReviewResponseCodec)

  public const val PULLSUPDATEBRANCH_REQUEST_CODEC_ID: String = "pulls/update-branch.request"

  private val pullsUpdateBranchRequestCodec:
      MediaTypeCodec<InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df?> =
      KotlinxSerializationCodec(PULLSUPDATEBRANCH_REQUEST_CODEC_ID, InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df.Serializer.nullable, SdkJson)

  public const val PULLSUPDATEBRANCH_RESPONSE_CODEC_ID: String = "pulls/update-branch.response"

  private val pullsUpdateBranchResponseCodec:
      MediaTypeCodec<InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff> =
      KotlinxSerializationCodec(PULLSUPDATEBRANCH_RESPONSE_CODEC_ID, InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff.Serializer, SdkJson)

  private val pullsUpdateBranchResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff> =
      KotlinxSerializationCodec("pulls/update-branch.response.alternative0", InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff.Serializer, SdkJson)

  public val pullsUpdateBranchResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff> =
      MediaTypeCodecRegistry.of(pullsUpdateBranchResponseCodecAlternative0Codec)

  private val pullsUpdateBranchResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("pulls/update-branch.response.alternative1", BasicError.Serializer, SdkJson)

  public val pullsUpdateBranchResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(pullsUpdateBranchResponseCodecAlternative1Codec)

  private val pullsUpdateBranchResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("pulls/update-branch.response.alternative2", ValidationError.Serializer, SdkJson)

  public val pullsUpdateBranchResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(pullsUpdateBranchResponseCodecAlternative2Codec)

  public val pullsUpdateBranchRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df?> =
      MediaTypeCodecRegistry.of(pullsUpdateBranchRequestCodec)

  public val pullsUpdateBranchResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff> =
      MediaTypeCodecRegistry.of(pullsUpdateBranchResponseCodec)

  public const val PULLSUPDATEREVIEW_REQUEST_CODEC_ID: String = "pulls/update-review.request"

  private val pullsUpdateReviewRequestCodec:
      MediaTypeCodec<InlineReposPullsReviewsPutRequestJsonX36eb5f0e> =
      KotlinxSerializationCodec(PULLSUPDATEREVIEW_REQUEST_CODEC_ID, InlineReposPullsReviewsPutRequestJsonX36eb5f0e.Serializer, SdkJson)

  public const val PULLSUPDATEREVIEW_RESPONSE_CODEC_ID: String = "pulls/update-review.response"

  private val pullsUpdateReviewResponseCodec: MediaTypeCodec<PullRequestReview> =
      KotlinxSerializationCodec(PULLSUPDATEREVIEW_RESPONSE_CODEC_ID, PullRequestReview.Serializer, SdkJson)

  private val pullsUpdateReviewResponseCodecAlternative0Codec: MediaTypeCodec<PullRequestReview> =
      KotlinxSerializationCodec("pulls/update-review.response.alternative0", PullRequestReview.Serializer, SdkJson)

  public val pullsUpdateReviewResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PullRequestReview> =
      MediaTypeCodecRegistry.of(pullsUpdateReviewResponseCodecAlternative0Codec)

  private val pullsUpdateReviewResponseCodecAlternative1Codec: MediaTypeCodec<ValidationErrorSimple>
      =
      KotlinxSerializationCodec("pulls/update-review.response.alternative1", ValidationErrorSimple.Serializer, SdkJson)

  public val pullsUpdateReviewResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ValidationErrorSimple> =
      MediaTypeCodecRegistry.of(pullsUpdateReviewResponseCodecAlternative1Codec)

  public val pullsUpdateReviewRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposPullsReviewsPutRequestJsonX36eb5f0e> =
      MediaTypeCodecRegistry.of(pullsUpdateReviewRequestCodec)

  public val pullsUpdateReviewResponseCodecRegistry: MediaTypeCodecRegistry<PullRequestReview> =
      MediaTypeCodecRegistry.of(pullsUpdateReviewResponseCodec)

  public const val PULLSUPDATEREVIEWCOMMENT_REQUEST_CODEC_ID: String =
      "pulls/update-review-comment.request"

  private val pullsUpdateReviewCommentRequestCodec:
      MediaTypeCodec<InlineReposPullsCommentsPatchRequestJsonX088a1aad> =
      KotlinxSerializationCodec(PULLSUPDATEREVIEWCOMMENT_REQUEST_CODEC_ID, InlineReposPullsCommentsPatchRequestJsonX088a1aad.Serializer, SdkJson)

  public const val PULLSUPDATEREVIEWCOMMENT_RESPONSE_CODEC_ID: String =
      "pulls/update-review-comment.response"

  private val pullsUpdateReviewCommentResponseCodec: MediaTypeCodec<PullRequestReviewComment> =
      KotlinxSerializationCodec(PULLSUPDATEREVIEWCOMMENT_RESPONSE_CODEC_ID, PullRequestReviewComment.Serializer, SdkJson)

  private val pullsUpdateReviewCommentResponseCodecAlternative0Codec:
      MediaTypeCodec<PullRequestReviewComment> =
      KotlinxSerializationCodec("pulls/update-review-comment.response.alternative0", PullRequestReviewComment.Serializer, SdkJson)

  public val pullsUpdateReviewCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PullRequestReviewComment> =
      MediaTypeCodecRegistry.of(pullsUpdateReviewCommentResponseCodecAlternative0Codec)

  public val pullsUpdateReviewCommentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposPullsCommentsPatchRequestJsonX088a1aad> =
      MediaTypeCodecRegistry.of(pullsUpdateReviewCommentRequestCodec)

  public val pullsUpdateReviewCommentResponseCodecRegistry:
      MediaTypeCodecRegistry<PullRequestReviewComment> =
      MediaTypeCodecRegistry.of(pullsUpdateReviewCommentResponseCodec)
}

/**
 * Client for the 'pulls' group of GitHub v3 REST API.
 */
public class PullsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@PullsClient.authentication)

  /**
   * Checks if a pull request has been merged into the base branch. The HTTP status of the response indicates whether or
   * not the pull request has been merged; the response body is empty.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws PullsCheckIfMergedApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded PullsCheckIfMergedError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsCheckIfMerged(
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, PullsCheckIfMergedResponse, Unit>(
    request = SdkExecutionRequest(pullsCheckIfMergedMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = PullsCodecs.pullsCheckIfMergedRequestCodecRegistry,
    responseDecoder = PullsCheckIfMergedResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsCheckIfMergedResponse.SuccessNoContent -> response.unit
        is PullsCheckIfMergedResponse.Http404NoContent -> response.unit
        is PullsCheckIfMergedResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsCheckIfMergedResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PullsCheckIfMergedResponse.Http404NoContent -> PullsCheckIfMergedApiException(response, statusCode, headers)
        is PullsCheckIfMergedResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Checks if a pull request has been merged into the base branch. The HTTP status of the response indicates whether or
   * not the pull request has been merged; the response body is empty.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun pullsCheckIfMergedWithResponse(
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsCheckIfMergedResponse> = executor.executeWithResponse<Unit, PullsCheckIfMergedResponse>(SdkExecutionRequest(pullsCheckIfMergedMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), PullsCodecs.pullsCheckIfMergedRequestCodecRegistry, PullsCheckIfMergedResponseDecoder, options)

  /**
   * Creates a reply to a review comment for a pull request. For the `comment_id`, provide the ID of the review comment
   * you are replying to. This must be the ID of a _top-level review comment_, not a reply to that comment. Replies to
   * replies are not supported.
   *
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)"
   * and "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * @param request Request body sent to the operation.
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsCreateReplyForReviewCommentApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded PullsCreateReplyForReviewCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsCreateReplyForReviewComment(
    request: InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad,
    commentId: Long,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): PullRequestReviewComment = executor.executeWithTypedErrors<InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad, PullsCreateReplyForReviewCommentResponse, PullRequestReviewComment>(
    request = SdkExecutionRequest(pullsCreateReplyForReviewCommentMetadata, baseUri, request, listOf(PullsCodecs.PULLSCREATEREPLYFORREVIEWCOMMENT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = PullsCodecs.pullsCreateReplyForReviewCommentRequestCodecRegistry,
    responseDecoder = PullsCreateReplyForReviewCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsCreateReplyForReviewCommentResponse.SuccessJson -> response.json
        is PullsCreateReplyForReviewCommentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsCreateReplyForReviewCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsCreateReplyForReviewCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsCreateReplyForReviewCommentResponse.Http404Json -> PullsCreateReplyForReviewCommentApiException(response, statusCode, headers)
        is PullsCreateReplyForReviewCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a reply to a review comment for a pull request. For the `comment_id`, provide the ID of the review comment
   * you are replying to. This must be the ID of a _top-level review comment_, not a reply to that comment. Replies to
   * replies are not supported.
   *
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)"
   * and "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun pullsCreateReplyForReviewCommentWithResponse(
    request: InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad,
    commentId: Long,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsCreateReplyForReviewCommentResponse> = executor.executeWithResponse<InlineReposPullsCommentsRepliesPostRequestJsonXda2e91ad, PullsCreateReplyForReviewCommentResponse>(SdkExecutionRequest(pullsCreateReplyForReviewCommentMetadata, baseUri, request, listOf(PullsCodecs.PULLSCREATEREPLYFORREVIEWCOMMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), PullsCodecs.pullsCreateReplyForReviewCommentRequestCodecRegistry, PullsCreateReplyForReviewCommentResponseDecoder, options)

  /**
   * Creates a review on a specified pull request.
   *
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)" and
   * "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * Pull request reviews created in the `PENDING` state are not submitted and therefore do not include the
   * `submitted_at` property in the response. To create a pending review for a pull request, leave the `event` parameter
   * blank. For more information about submitting a `PENDING` review, see "[Submit a review for a pull
   * request](https://docs.github.com/rest/pulls/reviews#submit-a-review-for-a-pull-request)."
   *
   * > [!NOTE]
   * > To comment on a specific line in a file, you need to first determine the position of that line in the diff. To
   * see a pull request diff, add the `application/vnd.github.v3.diff` media type to the `Accept` header of a call to
   * the [Get a pull request](https://docs.github.com/rest/pulls/pulls#get-a-pull-request) endpoint.
   *
   * The `position` value equals the number of lines down from the first "@@" hunk header in the file you want to add a
   * comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in
   * the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsCreateReviewApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded PullsCreateReviewError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsCreateReview(
    request: InlineReposPullsReviewsPostRequestJsonX257d334c? = null,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): PullRequestReview = executor.executeWithTypedErrors<InlineReposPullsReviewsPostRequestJsonX257d334c?, PullsCreateReviewResponse, PullRequestReview>(
    request = SdkExecutionRequest(pullsCreateReviewMetadata, baseUri, request, listOf(PullsCodecs.PULLSCREATEREVIEW_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = PullsCodecs.pullsCreateReviewRequestCodecRegistry,
    responseDecoder = PullsCreateReviewResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsCreateReviewResponse.SuccessJson -> response.json
        is PullsCreateReviewResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsCreateReviewResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsCreateReviewResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsCreateReviewResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsCreateReviewResponse.Http403Json -> PullsCreateReviewApiException(response, statusCode, headers)
        is PullsCreateReviewResponse.Http422Json -> PullsCreateReviewApiException(response, statusCode, headers)
        is PullsCreateReviewResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a review on a specified pull request.
   *
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)" and
   * "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * Pull request reviews created in the `PENDING` state are not submitted and therefore do not include the
   * `submitted_at` property in the response. To create a pending review for a pull request, leave the `event` parameter
   * blank. For more information about submitting a `PENDING` review, see "[Submit a review for a pull
   * request](https://docs.github.com/rest/pulls/reviews#submit-a-review-for-a-pull-request)."
   *
   * > [!NOTE]
   * > To comment on a specific line in a file, you need to first determine the position of that line in the diff. To
   * see a pull request diff, add the `application/vnd.github.v3.diff` media type to the `Accept` header of a call to
   * the [Get a pull request](https://docs.github.com/rest/pulls/pulls#get-a-pull-request) endpoint.
   *
   * The `position` value equals the number of lines down from the first "@@" hunk header in the file you want to add a
   * comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in
   * the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun pullsCreateReviewWithResponse(
    request: InlineReposPullsReviewsPostRequestJsonX257d334c? = null,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsCreateReviewResponse> = executor.executeWithResponse<InlineReposPullsReviewsPostRequestJsonX257d334c?, PullsCreateReviewResponse>(SdkExecutionRequest(pullsCreateReviewMetadata, baseUri, request, listOf(PullsCodecs.PULLSCREATEREVIEW_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), PullsCodecs.pullsCreateReviewRequestCodecRegistry, PullsCreateReviewResponseDecoder, options)

  /**
   * Creates a review comment on the diff of a specified pull request. To add a regular comment to a pull request
   * timeline, see "[Create an issue comment](https://docs.github.com/rest/issues/comments#create-an-issue-comment)."
   *
   * If your comment applies to more than one line in the pull request diff, you should use the parameters `line`,
   * `side`, and optionally `start_line` and `start_side` in your request.
   *
   * The `position` parameter is closing down. If you use `position`, the `line`, `side`, `start_line`, and `start_side`
   * parameters are not required.
   *
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)"
   * and "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsCreateReviewCommentApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded PullsCreateReviewCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsCreateReviewComment(
    request: InlineReposPullsCommentsPostRequestJsonXc95c58c9,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): PullRequestReviewComment = executor.executeWithTypedErrors<InlineReposPullsCommentsPostRequestJsonXc95c58c9, PullsCreateReviewCommentResponse, PullRequestReviewComment>(
    request = SdkExecutionRequest(pullsCreateReviewCommentMetadata, baseUri, request, listOf(PullsCodecs.PULLSCREATEREVIEWCOMMENT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = PullsCodecs.pullsCreateReviewCommentRequestCodecRegistry,
    responseDecoder = PullsCreateReviewCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsCreateReviewCommentResponse.SuccessJson -> response.json
        is PullsCreateReviewCommentResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsCreateReviewCommentResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsCreateReviewCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsCreateReviewCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsCreateReviewCommentResponse.Http403Json -> PullsCreateReviewCommentApiException(response, statusCode, headers)
        is PullsCreateReviewCommentResponse.Http422Json -> PullsCreateReviewCommentApiException(response, statusCode, headers)
        is PullsCreateReviewCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a review comment on the diff of a specified pull request. To add a regular comment to a pull request
   * timeline, see "[Create an issue comment](https://docs.github.com/rest/issues/comments#create-an-issue-comment)."
   *
   * If your comment applies to more than one line in the pull request diff, you should use the parameters `line`,
   * `side`, and optionally `start_line` and `start_side` in your request.
   *
   * The `position` parameter is closing down. If you use `position`, the `line`, `side`, `start_line`, and `start_side`
   * parameters are not required.
   *
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)"
   * and "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun pullsCreateReviewCommentWithResponse(
    request: InlineReposPullsCommentsPostRequestJsonXc95c58c9,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsCreateReviewCommentResponse> = executor.executeWithResponse<InlineReposPullsCommentsPostRequestJsonXc95c58c9, PullsCreateReviewCommentResponse>(SdkExecutionRequest(pullsCreateReviewCommentMetadata, baseUri, request, listOf(PullsCodecs.PULLSCREATEREVIEWCOMMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), PullsCodecs.pullsCreateReviewCommentRequestCodecRegistry, PullsCreateReviewCommentResponseDecoder, options)

  /**
   * Deletes a pull request review that has not been submitted. Submitted reviews cannot be deleted.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param reviewId The unique identifier of the review.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsDeletePendingReviewApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded PullsDeletePendingReviewError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsDeletePendingReview(
    owner: String,
    pullNumber: Int,
    repo: String,
    reviewId: Int,
    options: CallOptions = CallOptions(),
  ): PullRequestReview = executor.executeWithTypedErrors<Unit, PullsDeletePendingReviewResponse, PullRequestReview>(
    request = SdkExecutionRequest(pullsDeletePendingReviewMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "review_id", values = listOf(reviewId.toString())))
    }),
    requestCodecs = PullsCodecs.pullsDeletePendingReviewRequestCodecRegistry,
    responseDecoder = PullsDeletePendingReviewResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsDeletePendingReviewResponse.SuccessJson -> response.json
        is PullsDeletePendingReviewResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsDeletePendingReviewResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsDeletePendingReviewResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsDeletePendingReviewResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsDeletePendingReviewResponse.Http404Json -> PullsDeletePendingReviewApiException(response, statusCode, headers)
        is PullsDeletePendingReviewResponse.Http422Json -> PullsDeletePendingReviewApiException(response, statusCode, headers)
        is PullsDeletePendingReviewResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a pull request review that has not been submitted. Submitted reviews cannot be deleted.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param reviewId The unique identifier of the review.
   * @param options Execution options.
   */
  public suspend fun pullsDeletePendingReviewWithResponse(
    owner: String,
    pullNumber: Int,
    repo: String,
    reviewId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsDeletePendingReviewResponse> = executor.executeWithResponse<Unit, PullsDeletePendingReviewResponse>(SdkExecutionRequest(pullsDeletePendingReviewMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "review_id", values = listOf(reviewId.toString())))
  }), PullsCodecs.pullsDeletePendingReviewRequestCodecRegistry, PullsDeletePendingReviewResponseDecoder, options)

  /**
   * Deletes a review comment.
   *
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws PullsDeleteReviewCommentApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded PullsDeleteReviewCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsDeleteReviewComment(
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, PullsDeleteReviewCommentResponse, Unit>(
    request = SdkExecutionRequest(pullsDeleteReviewCommentMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = PullsCodecs.pullsDeleteReviewCommentRequestCodecRegistry,
    responseDecoder = PullsDeleteReviewCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsDeleteReviewCommentResponse.SuccessNoContent -> response.unit
        is PullsDeleteReviewCommentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsDeleteReviewCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsDeleteReviewCommentResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PullsDeleteReviewCommentResponse.Http404Json -> PullsDeleteReviewCommentApiException(response, statusCode, headers)
        is PullsDeleteReviewCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a review comment.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun pullsDeleteReviewCommentWithResponse(
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsDeleteReviewCommentResponse> = executor.executeWithResponse<Unit, PullsDeleteReviewCommentResponse>(SdkExecutionRequest(pullsDeleteReviewCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), PullsCodecs.pullsDeleteReviewCommentRequestCodecRegistry, PullsDeleteReviewCommentResponseDecoder, options)

  /**
   * Dismisses a specified review on a pull request.
   *
   * > [!NOTE]
   * > To dismiss a pull request review on a [protected
   * branch](https://docs.github.com/rest/branches/branch-protection), you must be a repository administrator or be
   * included in the list of people or teams who can dismiss pull request reviews.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param reviewId The unique identifier of the review.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsDismissReviewApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded PullsDismissReviewError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsDismissReview(
    request: InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c,
    owner: String,
    pullNumber: Int,
    repo: String,
    reviewId: Int,
    options: CallOptions = CallOptions(),
  ): PullRequestReview = executor.executeWithTypedErrors<InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c, PullsDismissReviewResponse, PullRequestReview>(
    request = SdkExecutionRequest(pullsDismissReviewMetadata, baseUri, request, listOf(PullsCodecs.PULLSDISMISSREVIEW_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "review_id", values = listOf(reviewId.toString())))
    }),
    requestCodecs = PullsCodecs.pullsDismissReviewRequestCodecRegistry,
    responseDecoder = PullsDismissReviewResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsDismissReviewResponse.SuccessJson -> response.json
        is PullsDismissReviewResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsDismissReviewResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsDismissReviewResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsDismissReviewResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsDismissReviewResponse.Http404Json -> PullsDismissReviewApiException(response, statusCode, headers)
        is PullsDismissReviewResponse.Http422Json -> PullsDismissReviewApiException(response, statusCode, headers)
        is PullsDismissReviewResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Dismisses a specified review on a pull request.
   *
   * > [!NOTE]
   * > To dismiss a pull request review on a [protected
   * branch](https://docs.github.com/rest/branches/branch-protection), you must be a repository administrator or be
   * included in the list of people or teams who can dismiss pull request reviews.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param reviewId The unique identifier of the review.
   * @param options Execution options.
   */
  public suspend fun pullsDismissReviewWithResponse(
    request: InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c,
    owner: String,
    pullNumber: Int,
    repo: String,
    reviewId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsDismissReviewResponse> = executor.executeWithResponse<InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c, PullsDismissReviewResponse>(SdkExecutionRequest(pullsDismissReviewMetadata, baseUri, request, listOf(PullsCodecs.PULLSDISMISSREVIEW_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "review_id", values = listOf(reviewId.toString())))
  }), PullsCodecs.pullsDismissReviewRequestCodecRegistry, PullsDismissReviewResponseDecoder, options)

  /**
   * Retrieves a pull request review by its ID.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param reviewId The unique identifier of the review.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsGetReviewApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded PullsGetReviewError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsGetReview(
    owner: String,
    pullNumber: Int,
    repo: String,
    reviewId: Int,
    options: CallOptions = CallOptions(),
  ): PullRequestReview = executor.executeWithTypedErrors<Unit, PullsGetReviewResponse, PullRequestReview>(
    request = SdkExecutionRequest(pullsGetReviewMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "review_id", values = listOf(reviewId.toString())))
    }),
    requestCodecs = PullsCodecs.pullsGetReviewRequestCodecRegistry,
    responseDecoder = PullsGetReviewResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsGetReviewResponse.SuccessJson -> response.json
        is PullsGetReviewResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsGetReviewResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsGetReviewResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsGetReviewResponse.Http404Json -> PullsGetReviewApiException(response, statusCode, headers)
        is PullsGetReviewResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Retrieves a pull request review by its ID.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param reviewId The unique identifier of the review.
   * @param options Execution options.
   */
  public suspend fun pullsGetReviewWithResponse(
    owner: String,
    pullNumber: Int,
    repo: String,
    reviewId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsGetReviewResponse> = executor.executeWithResponse<Unit, PullsGetReviewResponse>(SdkExecutionRequest(pullsGetReviewMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "review_id", values = listOf(reviewId.toString())))
  }), PullsCodecs.pullsGetReviewRequestCodecRegistry, PullsGetReviewResponseDecoder, options)

  /**
   * Provides details for a specified review comment.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsGetReviewCommentApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded PullsGetReviewCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsGetReviewComment(
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): PullRequestReviewComment = executor.executeWithTypedErrors<Unit, PullsGetReviewCommentResponse, PullRequestReviewComment>(
    request = SdkExecutionRequest(pullsGetReviewCommentMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = PullsCodecs.pullsGetReviewCommentRequestCodecRegistry,
    responseDecoder = PullsGetReviewCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsGetReviewCommentResponse.SuccessJson -> response.json
        is PullsGetReviewCommentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsGetReviewCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsGetReviewCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsGetReviewCommentResponse.Http404Json -> PullsGetReviewCommentApiException(response, statusCode, headers)
        is PullsGetReviewCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Provides details for a specified review comment.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun pullsGetReviewCommentWithResponse(
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsGetReviewCommentResponse> = executor.executeWithResponse<Unit, PullsGetReviewCommentResponse>(SdkExecutionRequest(pullsGetReviewCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), PullsCodecs.pullsGetReviewCommentRequestCodecRegistry, PullsGetReviewCommentResponseDecoder, options)

  /**
   * Lists pull requests in a specified repository.
   *
   * Draft pull requests are available in public repositories with GitHub
   * Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing
   * plans, and in public and private repositories with GitHub Team and GitHub Enterprise
   * Cloud. For more information, see [GitHub's
   * products](https://docs.github.com/github/getting-started-with-github/githubs-products)
   * in the GitHub Help documentation.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown body. Response will include `body`. This is the
   * default if you do not pass any specific media type.
   * - **`application/vnd.github.text+json`**: Returns a text only representation of the markdown body. Response will
   * include `body_text`.
   * - **`application/vnd.github.html+json`**: Returns HTML rendered from the body's markdown. Response will include
   * `body_html`.
   * - **`application/vnd.github.full+json`**: Returns raw, text, and HTML representations. Response will include
   * `body`, `body_text`, and `body_html`.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param base Filter pulls by base branch name. Example: `gh-pages`.
   * @param direction The direction of the sort. Default: `desc` when sort is `created` or sort is not specified,
   * otherwise `asc`.
   * @param head Filter pulls by head user or head organization and branch name in the format of `user:ref-name` or
   * `organization:ref-name`. For example: `github:new-script-format` or `octocat:test-branch`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param sort What to sort results by. `popularity` will sort by the number of comments. `long-running` will sort by
   * date created and will limit the results to pull requests that have been open for more than a month and have had
   * activity within the past month.
   * @param state Either `open`, `closed`, or `all` to filter by state.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsListApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded PullsListError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsList(
    owner: String,
    repo: String,
    base: String? = null,
    direction: InlineReposPullsGetParameterXd8f86f5c? = null,
    head: String? = null,
    page: Int? = null,
    perPage: Int? = null,
    sort: InlineReposPullsGetParameterXe9f738bf? = null,
    state: InlineReposPullsGetParameterXc701184e? = null,
    options: CallOptions = CallOptions(),
  ): List<PullRequestSimple> = executor.executeWithTypedErrors<Unit, PullsListResponse, List<PullRequestSimple>>(
    request = SdkExecutionRequest(pullsListMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "base", values = base?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "head", values = head?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PullsCodecs.pullsListRequestCodecRegistry,
    responseDecoder = PullsListResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsListResponse.SuccessJson -> response.json
        is PullsListResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is PullsListResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsListResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsListResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsListResponse.Http304NoContent -> PullsListApiException(response, statusCode, headers)
        is PullsListResponse.Http422Json -> PullsListApiException(response, statusCode, headers)
        is PullsListResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists pull requests in a specified repository.
   *
   * Draft pull requests are available in public repositories with GitHub
   * Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing
   * plans, and in public and private repositories with GitHub Team and GitHub Enterprise
   * Cloud. For more information, see [GitHub's
   * products](https://docs.github.com/github/getting-started-with-github/githubs-products)
   * in the GitHub Help documentation.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown body. Response will include `body`. This is the
   * default if you do not pass any specific media type.
   * - **`application/vnd.github.text+json`**: Returns a text only representation of the markdown body. Response will
   * include `body_text`.
   * - **`application/vnd.github.html+json`**: Returns HTML rendered from the body's markdown. Response will include
   * `body_html`.
   * - **`application/vnd.github.full+json`**: Returns raw, text, and HTML representations. Response will include
   * `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param base Filter pulls by base branch name. Example: `gh-pages`.
   * @param direction The direction of the sort. Default: `desc` when sort is `created` or sort is not specified,
   * otherwise `asc`.
   * @param head Filter pulls by head user or head organization and branch name in the format of `user:ref-name` or
   * `organization:ref-name`. For example: `github:new-script-format` or `octocat:test-branch`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param sort What to sort results by. `popularity` will sort by the number of comments. `long-running` will sort by
   * date created and will limit the results to pull requests that have been open for more than a month and have had
   * activity within the past month.
   * @param state Either `open`, `closed`, or `all` to filter by state.
   * @param options Execution options.
   */
  public suspend fun pullsListWithResponse(
    owner: String,
    repo: String,
    base: String? = null,
    direction: InlineReposPullsGetParameterXd8f86f5c? = null,
    head: String? = null,
    page: Int? = null,
    perPage: Int? = null,
    sort: InlineReposPullsGetParameterXe9f738bf? = null,
    state: InlineReposPullsGetParameterXc701184e? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsListResponse> = executor.executeWithResponse<Unit, PullsListResponse>(SdkExecutionRequest(pullsListMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "base", values = base?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "head", values = head?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
  }), PullsCodecs.pullsListRequestCodecRegistry, PullsListResponseDecoder, options)

  /**
   * Lists comments for a specific pull request review.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param reviewId The unique identifier of the review.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsListCommentsForReviewApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded PullsListCommentsForReviewError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsListCommentsForReview(
    owner: String,
    pullNumber: Int,
    repo: String,
    reviewId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<ReviewComment> = executor.executeWithTypedErrors<Unit, PullsListCommentsForReviewResponse, List<ReviewComment>>(
    request = SdkExecutionRequest(pullsListCommentsForReviewMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "review_id", values = listOf(reviewId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PullsCodecs.pullsListCommentsForReviewRequestCodecRegistry,
    responseDecoder = PullsListCommentsForReviewResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsListCommentsForReviewResponse.SuccessJson -> response.json
        is PullsListCommentsForReviewResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsListCommentsForReviewResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsListCommentsForReviewResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsListCommentsForReviewResponse.Http404Json -> PullsListCommentsForReviewApiException(response, statusCode, headers)
        is PullsListCommentsForReviewResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists comments for a specific pull request review.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param reviewId The unique identifier of the review.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun pullsListCommentsForReviewWithResponse(
    owner: String,
    pullNumber: Int,
    repo: String,
    reviewId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsListCommentsForReviewResponse> = executor.executeWithResponse<Unit, PullsListCommentsForReviewResponse>(SdkExecutionRequest(pullsListCommentsForReviewMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "review_id", values = listOf(reviewId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), PullsCodecs.pullsListCommentsForReviewRequestCodecRegistry, PullsListCommentsForReviewResponseDecoder, options)

  /**
   * Lists a maximum of 250 commits for a pull request. To receive a complete
   * commit list for pull requests with more than 250 commits, use the [List
   * commits](https://docs.github.com/rest/commits/commits#list-commits)
   * endpoint.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown body. Response will include `body`. This is the
   * default if you do not pass any specific media type.
   * - **`application/vnd.github.text+json`**: Returns a text only representation of the markdown body. Response will
   * include `body_text`.
   * - **`application/vnd.github.html+json`**: Returns HTML rendered from the body's markdown. Response will include
   * `body_html`.
   * - **`application/vnd.github.full+json`**: Returns raw, text, and HTML representations. Response will include
   * `body`, `body_text`, and `body_html`.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
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
  public suspend fun pullsListCommits(
    owner: String,
    pullNumber: Int,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Commit> = executor.execute<Unit, List<Commit>>(SdkExecutionRequest(pullsListCommitsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(PullsCodecs.PULLSLISTCOMMITS_RESPONSE_CODEC_ID), PullsCodecs.pullsListCommitsRequestCodecRegistry, PullsCodecs.pullsListCommitsResponseCodecRegistry, options)

  /**
   * Lists a maximum of 250 commits for a pull request. To receive a complete
   * commit list for pull requests with more than 250 commits, use the [List
   * commits](https://docs.github.com/rest/commits/commits#list-commits)
   * endpoint.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown body. Response will include `body`. This is the
   * default if you do not pass any specific media type.
   * - **`application/vnd.github.text+json`**: Returns a text only representation of the markdown body. Response will
   * include `body_text`.
   * - **`application/vnd.github.html+json`**: Returns HTML rendered from the body's markdown. Response will include
   * `body_html`.
   * - **`application/vnd.github.full+json`**: Returns raw, text, and HTML representations. Response will include
   * `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun pullsListCommitsWithResponse(
    owner: String,
    pullNumber: Int,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsListCommitsResponse> = executor.executeWithResponse<Unit, PullsListCommitsResponse>(SdkExecutionRequest(pullsListCommitsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), PullsCodecs.pullsListCommitsRequestCodecRegistry, PullsListCommitsResponseDecoder, options)

  /**
   * Lists the files in a specified pull request.
   *
   * > [!NOTE]
   * > Responses include a maximum of 3000 files. The paginated response returns 30 files per page by default.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown body. Response will include `body`. This is the
   * default if you do not pass any specific media type.
   * - **`application/vnd.github.text+json`**: Returns a text only representation of the markdown body. Response will
   * include `body_text`.
   * - **`application/vnd.github.html+json`**: Returns HTML rendered from the body's markdown. Response will include
   * `body_html`.
   * - **`application/vnd.github.full+json`**: Returns raw, text, and HTML representations. Response will include
   * `body`, `body_text`, and `body_html`.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsListFilesApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded PullsListFilesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsListFiles(
    owner: String,
    pullNumber: Int,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<DiffEntry> = executor.executeWithTypedErrors<Unit, PullsListFilesResponse, List<DiffEntry>>(
    request = SdkExecutionRequest(pullsListFilesMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PullsCodecs.pullsListFilesRequestCodecRegistry,
    responseDecoder = PullsListFilesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsListFilesResponse.SuccessJson -> response.json
        is PullsListFilesResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsListFilesResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsListFilesResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsListFilesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsListFilesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsListFilesResponse.Http422Json -> PullsListFilesApiException(response, statusCode, headers)
        is PullsListFilesResponse.Http500Json -> PullsListFilesApiException(response, statusCode, headers)
        is PullsListFilesResponse.Http503Json -> PullsListFilesApiException(response, statusCode, headers)
        is PullsListFilesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the files in a specified pull request.
   *
   * > [!NOTE]
   * > Responses include a maximum of 3000 files. The paginated response returns 30 files per page by default.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw markdown body. Response will include `body`. This is the
   * default if you do not pass any specific media type.
   * - **`application/vnd.github.text+json`**: Returns a text only representation of the markdown body. Response will
   * include `body_text`.
   * - **`application/vnd.github.html+json`**: Returns HTML rendered from the body's markdown. Response will include
   * `body_html`.
   * - **`application/vnd.github.full+json`**: Returns raw, text, and HTML representations. Response will include
   * `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun pullsListFilesWithResponse(
    owner: String,
    pullNumber: Int,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsListFilesResponse> = executor.executeWithResponse<Unit, PullsListFilesResponse>(SdkExecutionRequest(pullsListFilesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), PullsCodecs.pullsListFilesRequestCodecRegistry, PullsListFilesResponseDecoder, options)

  /**
   * Gets the users or teams whose review is requested for a pull request. Once a requested reviewer submits a review,
   * they are no longer considered a requested reviewer. Their review will instead be returned by the [List reviews for
   * a pull request](https://docs.github.com/rest/pulls/reviews#list-reviews-for-a-pull-request) operation.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsListRequestedReviewers(
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): PullRequestReviewRequest = executor.execute<Unit, PullRequestReviewRequest>(SdkExecutionRequest(pullsListRequestedReviewersMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(PullsCodecs.PULLSLISTREQUESTEDREVIEWERS_RESPONSE_CODEC_ID), PullsCodecs.pullsListRequestedReviewersRequestCodecRegistry, PullsCodecs.pullsListRequestedReviewersResponseCodecRegistry, options)

  /**
   * Gets the users or teams whose review is requested for a pull request. Once a requested reviewer submits a review,
   * they are no longer considered a requested reviewer. Their review will instead be returned by the [List reviews for
   * a pull request](https://docs.github.com/rest/pulls/reviews#list-reviews-for-a-pull-request) operation.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun pullsListRequestedReviewersWithResponse(
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsListRequestedReviewersResponse> = executor.executeWithResponse<Unit, PullsListRequestedReviewersResponse>(SdkExecutionRequest(pullsListRequestedReviewersMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), PullsCodecs.pullsListRequestedReviewersRequestCodecRegistry, PullsListRequestedReviewersResponseDecoder, options)

  /**
   * Lists all review comments for a specified pull request. By default, review comments
   * are in ascending order by ID.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param direction The direction to sort results. Ignored without `sort` parameter.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param sort The property to sort the results by.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsListReviewComments(
    owner: String,
    pullNumber: Int,
    repo: String,
    direction: InlineReposPullsCommentsGetParameterX049d1ea8? = null,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    sort: InlineSortParameterX37db756f? = null,
    options: CallOptions = CallOptions(),
  ): List<PullRequestReviewComment> = executor.execute<Unit, List<PullRequestReviewComment>>(SdkExecutionRequest(pullsListReviewCommentsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(PullsCodecs.PULLSLISTREVIEWCOMMENTS_RESPONSE_CODEC_ID), PullsCodecs.pullsListReviewCommentsRequestCodecRegistry, PullsCodecs.pullsListReviewCommentsResponseCodecRegistry, options)

  /**
   * Lists all review comments for a specified pull request. By default, review comments
   * are in ascending order by ID.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param direction The direction to sort results. Ignored without `sort` parameter.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param sort The property to sort the results by.
   * @param options Execution options.
   */
  public suspend fun pullsListReviewCommentsWithResponse(
    owner: String,
    pullNumber: Int,
    repo: String,
    direction: InlineReposPullsCommentsGetParameterX049d1ea8? = null,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    sort: InlineSortParameterX37db756f? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsListReviewCommentsResponse> = executor.executeWithResponse<Unit, PullsListReviewCommentsResponse>(SdkExecutionRequest(pullsListReviewCommentsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), PullsCodecs.pullsListReviewCommentsRequestCodecRegistry, PullsListReviewCommentsResponseDecoder, options)

  /**
   * Lists review comments for all pull requests in a repository. By default,
   * review comments are in ascending order by ID.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param direction The direction to sort results. Ignored without `sort` parameter.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param sort Wire parameter `sort`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsListReviewCommentsForRepo(
    owner: String,
    repo: String,
    direction: InlineReposPullsCommentsGetParameterX17a2b6c2? = null,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    sort: InlineReposPullsCommentsGetParameterXaeb435e8? = null,
    options: CallOptions = CallOptions(),
  ): List<PullRequestReviewComment> = executor.execute<Unit, List<PullRequestReviewComment>>(SdkExecutionRequest(pullsListReviewCommentsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(PullsCodecs.PULLSLISTREVIEWCOMMENTSFORREPO_RESPONSE_CODEC_ID), PullsCodecs.pullsListReviewCommentsForRepoRequestCodecRegistry, PullsCodecs.pullsListReviewCommentsForRepoResponseCodecRegistry, options)

  /**
   * Lists review comments for all pull requests in a repository. By default,
   * review comments are in ascending order by ID.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param direction The direction to sort results. Ignored without `sort` parameter.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param sort Wire parameter `sort`.
   * @param options Execution options.
   */
  public suspend fun pullsListReviewCommentsForRepoWithResponse(
    owner: String,
    repo: String,
    direction: InlineReposPullsCommentsGetParameterX17a2b6c2? = null,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    sort: InlineReposPullsCommentsGetParameterXaeb435e8? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsListReviewCommentsForRepoResponse> = executor.executeWithResponse<Unit, PullsListReviewCommentsForRepoResponse>(SdkExecutionRequest(pullsListReviewCommentsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), PullsCodecs.pullsListReviewCommentsForRepoRequestCodecRegistry, PullsListReviewCommentsForRepoResponseDecoder, options)

  /**
   * Lists all reviews for a specified pull request. The list of reviews returns in chronological order.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
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
  public suspend fun pullsListReviews(
    owner: String,
    pullNumber: Int,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<PullRequestReview> = executor.execute<Unit, List<PullRequestReview>>(SdkExecutionRequest(pullsListReviewsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(PullsCodecs.PULLSLISTREVIEWS_RESPONSE_CODEC_ID), PullsCodecs.pullsListReviewsRequestCodecRegistry, PullsCodecs.pullsListReviewsResponseCodecRegistry, options)

  /**
   * Lists all reviews for a specified pull request. The list of reviews returns in chronological order.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun pullsListReviewsWithResponse(
    owner: String,
    pullNumber: Int,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsListReviewsResponse> = executor.executeWithResponse<Unit, PullsListReviewsResponse>(SdkExecutionRequest(pullsListReviewsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), PullsCodecs.pullsListReviewsRequestCodecRegistry, PullsListReviewsResponseDecoder, options)

  /**
   * Merges a pull request into the base branch.
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)" and
   * "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsMergeApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded PullsMergeError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsMerge(
    request: InlineReposPullsMergePutRequestJsonX82e311a9? = null,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): PullRequestMergeResult = executor.executeWithTypedErrors<InlineReposPullsMergePutRequestJsonX82e311a9?, PullsMergeResponse, PullRequestMergeResult>(
    request = SdkExecutionRequest(pullsMergeMetadata, baseUri, request, listOf(PullsCodecs.PULLSMERGE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = PullsCodecs.pullsMergeRequestCodecRegistry,
    responseDecoder = PullsMergeResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsMergeResponse.SuccessJson -> response.json
        is PullsMergeResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsMergeResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsMergeResponse.Http405Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsMergeResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsMergeResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsMergeResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsMergeResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsMergeResponse.Http403Json -> PullsMergeApiException(response, statusCode, headers)
        is PullsMergeResponse.Http404Json -> PullsMergeApiException(response, statusCode, headers)
        is PullsMergeResponse.Http405Json -> PullsMergeApiException(response, statusCode, headers)
        is PullsMergeResponse.Http409Json -> PullsMergeApiException(response, statusCode, headers)
        is PullsMergeResponse.Http422Json -> PullsMergeApiException(response, statusCode, headers)
        is PullsMergeResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Merges a pull request into the base branch.
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)" and
   * "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun pullsMergeWithResponse(
    request: InlineReposPullsMergePutRequestJsonX82e311a9? = null,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsMergeResponse> = executor.executeWithResponse<InlineReposPullsMergePutRequestJsonX82e311a9?, PullsMergeResponse>(SdkExecutionRequest(pullsMergeMetadata, baseUri, request, listOf(PullsCodecs.PULLSMERGE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), PullsCodecs.pullsMergeRequestCodecRegistry, PullsMergeResponseDecoder, options)

  /**
   * Removes review requests from a pull request for a given set of users and/or teams.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsRemoveRequestedReviewersApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded PullsRemoveRequestedReviewersError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsRemoveRequestedReviewers(
    request: InlineReposPullsRequestedReviewersDeleteRequestJsonX9231ce20,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): PullRequestSimple = executor.executeWithTypedErrors<InlineReposPullsRequestedReviewersDeleteRequestJsonX9231ce20, PullsRemoveRequestedReviewersResponse, PullRequestSimple>(
    request = SdkExecutionRequest(pullsRemoveRequestedReviewersMetadata, baseUri, request, listOf(PullsCodecs.PULLSREMOVEREQUESTEDREVIEWERS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = PullsCodecs.pullsRemoveRequestedReviewersRequestCodecRegistry,
    responseDecoder = PullsRemoveRequestedReviewersResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsRemoveRequestedReviewersResponse.SuccessJson -> response.json
        is PullsRemoveRequestedReviewersResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsRemoveRequestedReviewersResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsRemoveRequestedReviewersResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsRemoveRequestedReviewersResponse.Http422Json -> PullsRemoveRequestedReviewersApiException(response, statusCode, headers)
        is PullsRemoveRequestedReviewersResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes review requests from a pull request for a given set of users and/or teams.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun pullsRemoveRequestedReviewersWithResponse(
    request: InlineReposPullsRequestedReviewersDeleteRequestJsonX9231ce20,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsRemoveRequestedReviewersResponse> = executor.executeWithResponse<InlineReposPullsRequestedReviewersDeleteRequestJsonX9231ce20, PullsRemoveRequestedReviewersResponse>(SdkExecutionRequest(pullsRemoveRequestedReviewersMetadata, baseUri, request, listOf(PullsCodecs.PULLSREMOVEREQUESTEDREVIEWERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), PullsCodecs.pullsRemoveRequestedReviewersRequestCodecRegistry, PullsRemoveRequestedReviewersResponseDecoder, options)

  /**
   * Requests reviews for a pull request from a given set of users and/or teams.
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)" and
   * "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsRequestReviewersApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded PullsRequestReviewersError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsRequestReviewers(
    request: InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32? = null,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): PullRequestSimple = executor.executeWithTypedErrors<InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32?, PullsRequestReviewersResponse, PullRequestSimple>(
    request = SdkExecutionRequest(pullsRequestReviewersMetadata, baseUri, request, listOf(PullsCodecs.PULLSREQUESTREVIEWERS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = PullsCodecs.pullsRequestReviewersRequestCodecRegistry,
    responseDecoder = PullsRequestReviewersResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsRequestReviewersResponse.SuccessJson -> response.json
        is PullsRequestReviewersResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsRequestReviewersResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is PullsRequestReviewersResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsRequestReviewersResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsRequestReviewersResponse.Http403Json -> PullsRequestReviewersApiException(response, statusCode, headers)
        is PullsRequestReviewersResponse.Http422NoContent -> PullsRequestReviewersApiException(response, statusCode, headers)
        is PullsRequestReviewersResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Requests reviews for a pull request from a given set of users and/or teams.
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)" and
   * "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun pullsRequestReviewersWithResponse(
    request: InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32? = null,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsRequestReviewersResponse> = executor.executeWithResponse<InlineReposPullsRequestedReviewersPostRequestJsonXcd17ba32?, PullsRequestReviewersResponse>(SdkExecutionRequest(pullsRequestReviewersMetadata, baseUri, request, listOf(PullsCodecs.PULLSREQUESTREVIEWERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), PullsCodecs.pullsRequestReviewersRequestCodecRegistry, PullsRequestReviewersResponseDecoder, options)

  /**
   * Submits a pending review for a pull request. For more information about creating a pending review for a pull
   * request, see "[Create a review for a pull
   * request](https://docs.github.com/rest/pulls/reviews#create-a-review-for-a-pull-request)."
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param reviewId The unique identifier of the review.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsSubmitReviewApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded PullsSubmitReviewError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsSubmitReview(
    request: InlineReposPullsReviewsEventsPostRequestJsonX992628ca,
    owner: String,
    pullNumber: Int,
    repo: String,
    reviewId: Int,
    options: CallOptions = CallOptions(),
  ): PullRequestReview = executor.executeWithTypedErrors<InlineReposPullsReviewsEventsPostRequestJsonX992628ca, PullsSubmitReviewResponse, PullRequestReview>(
    request = SdkExecutionRequest(pullsSubmitReviewMetadata, baseUri, request, listOf(PullsCodecs.PULLSSUBMITREVIEW_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "review_id", values = listOf(reviewId.toString())))
    }),
    requestCodecs = PullsCodecs.pullsSubmitReviewRequestCodecRegistry,
    responseDecoder = PullsSubmitReviewResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsSubmitReviewResponse.SuccessJson -> response.json
        is PullsSubmitReviewResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsSubmitReviewResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsSubmitReviewResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsSubmitReviewResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsSubmitReviewResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsSubmitReviewResponse.Http403Json -> PullsSubmitReviewApiException(response, statusCode, headers)
        is PullsSubmitReviewResponse.Http404Json -> PullsSubmitReviewApiException(response, statusCode, headers)
        is PullsSubmitReviewResponse.Http422Json -> PullsSubmitReviewApiException(response, statusCode, headers)
        is PullsSubmitReviewResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Submits a pending review for a pull request. For more information about creating a pending review for a pull
   * request, see "[Create a review for a pull
   * request](https://docs.github.com/rest/pulls/reviews#create-a-review-for-a-pull-request)."
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param reviewId The unique identifier of the review.
   * @param options Execution options.
   */
  public suspend fun pullsSubmitReviewWithResponse(
    request: InlineReposPullsReviewsEventsPostRequestJsonX992628ca,
    owner: String,
    pullNumber: Int,
    repo: String,
    reviewId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsSubmitReviewResponse> = executor.executeWithResponse<InlineReposPullsReviewsEventsPostRequestJsonX992628ca, PullsSubmitReviewResponse>(SdkExecutionRequest(pullsSubmitReviewMetadata, baseUri, request, listOf(PullsCodecs.PULLSSUBMITREVIEW_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "review_id", values = listOf(reviewId.toString())))
  }), PullsCodecs.pullsSubmitReviewRequestCodecRegistry, PullsSubmitReviewResponseDecoder, options)

  /**
   * Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull
   * request branch.
   * Note: If making a request on behalf of a GitHub App you must also have permissions to write the contents of the
   * head repository.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsUpdateBranchApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded PullsUpdateBranchError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsUpdateBranch(
    request: InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df? = null,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff = executor.executeWithTypedErrors<InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df?, PullsUpdateBranchResponse, InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff>(
    request = SdkExecutionRequest(pullsUpdateBranchMetadata, baseUri, request, listOf(PullsCodecs.PULLSUPDATEBRANCH_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = PullsCodecs.pullsUpdateBranchRequestCodecRegistry,
    responseDecoder = PullsUpdateBranchResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsUpdateBranchResponse.SuccessJson -> response.json
        is PullsUpdateBranchResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsUpdateBranchResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsUpdateBranchResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsUpdateBranchResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsUpdateBranchResponse.Http403Json -> PullsUpdateBranchApiException(response, statusCode, headers)
        is PullsUpdateBranchResponse.Http422Json -> PullsUpdateBranchApiException(response, statusCode, headers)
        is PullsUpdateBranchResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull
   * request branch.
   * Note: If making a request on behalf of a GitHub App you must also have permissions to write the contents of the
   * head repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun pullsUpdateBranchWithResponse(
    request: InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df? = null,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsUpdateBranchResponse> = executor.executeWithResponse<InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df?, PullsUpdateBranchResponse>(SdkExecutionRequest(pullsUpdateBranchMetadata, baseUri, request, listOf(PullsCodecs.PULLSUPDATEBRANCH_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), PullsCodecs.pullsUpdateBranchRequestCodecRegistry, PullsUpdateBranchResponseDecoder, options)

  /**
   * Updates the contents of a specified review summary comment.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param reviewId The unique identifier of the review.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PullsUpdateReviewApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded PullsUpdateReviewError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsUpdateReview(
    request: InlineReposPullsReviewsPutRequestJsonX36eb5f0e,
    owner: String,
    pullNumber: Int,
    repo: String,
    reviewId: Int,
    options: CallOptions = CallOptions(),
  ): PullRequestReview = executor.executeWithTypedErrors<InlineReposPullsReviewsPutRequestJsonX36eb5f0e, PullsUpdateReviewResponse, PullRequestReview>(
    request = SdkExecutionRequest(pullsUpdateReviewMetadata, baseUri, request, listOf(PullsCodecs.PULLSUPDATEREVIEW_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "review_id", values = listOf(reviewId.toString())))
    }),
    requestCodecs = PullsCodecs.pullsUpdateReviewRequestCodecRegistry,
    responseDecoder = PullsUpdateReviewResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PullsUpdateReviewResponse.SuccessJson -> response.json
        is PullsUpdateReviewResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is PullsUpdateReviewResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PullsUpdateReviewResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PullsUpdateReviewResponse.Http422Json -> PullsUpdateReviewApiException(response, statusCode, headers)
        is PullsUpdateReviewResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates the contents of a specified review summary comment.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param reviewId The unique identifier of the review.
   * @param options Execution options.
   */
  public suspend fun pullsUpdateReviewWithResponse(
    request: InlineReposPullsReviewsPutRequestJsonX36eb5f0e,
    owner: String,
    pullNumber: Int,
    repo: String,
    reviewId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsUpdateReviewResponse> = executor.executeWithResponse<InlineReposPullsReviewsPutRequestJsonX36eb5f0e, PullsUpdateReviewResponse>(SdkExecutionRequest(pullsUpdateReviewMetadata, baseUri, request, listOf(PullsCodecs.PULLSUPDATEREVIEW_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "review_id", values = listOf(reviewId.toString())))
  }), PullsCodecs.pullsUpdateReviewRequestCodecRegistry, PullsUpdateReviewResponseDecoder, options)

  /**
   * Edits the content of a specified review comment.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * @param request Request body sent to the operation.
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun pullsUpdateReviewComment(
    request: InlineReposPullsCommentsPatchRequestJsonX088a1aad,
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): PullRequestReviewComment = executor.execute<InlineReposPullsCommentsPatchRequestJsonX088a1aad, PullRequestReviewComment>(SdkExecutionRequest(pullsUpdateReviewCommentMetadata, baseUri, request, listOf(PullsCodecs.PULLSUPDATEREVIEWCOMMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(PullsCodecs.PULLSUPDATEREVIEWCOMMENT_RESPONSE_CODEC_ID), PullsCodecs.pullsUpdateReviewCommentRequestCodecRegistry, PullsCodecs.pullsUpdateReviewCommentResponseCodecRegistry, options)

  /**
   * Edits the content of a specified review comment.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github-commitcomment.raw+json`**: Returns the raw markdown body. Response will include `body`.
   * This is the default if you do not pass any specific media type.
   * - **`application/vnd.github-commitcomment.text+json`**: Returns a text only representation of the markdown body.
   * Response will include `body_text`.
   * - **`application/vnd.github-commitcomment.html+json`**: Returns HTML rendered from the body's markdown. Response
   * will include `body_html`.
   * - **`application/vnd.github-commitcomment.full+json`**: Returns raw, text, and HTML representations. Response will
   * include `body`, `body_text`, and `body_html`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun pullsUpdateReviewCommentWithResponse(
    request: InlineReposPullsCommentsPatchRequestJsonX088a1aad,
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PullsUpdateReviewCommentResponse> = executor.executeWithResponse<InlineReposPullsCommentsPatchRequestJsonX088a1aad, PullsUpdateReviewCommentResponse>(SdkExecutionRequest(pullsUpdateReviewCommentMetadata, baseUri, request, listOf(PullsCodecs.PULLSUPDATEREVIEWCOMMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), PullsCodecs.pullsUpdateReviewCommentRequestCodecRegistry, PullsUpdateReviewCommentResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `pulls/check-if-merged` may expose through its typed API exception.
   */
  public sealed interface PullsCheckIfMergedError

  /**
   * Typed response alternatives for `pulls/check-if-merged`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PullsCheckIfMergedResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsCheckIfMergedResponse

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsCheckIfMergedResponse,
        PullsCheckIfMergedError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsCheckIfMergedResponse
  }

  /**
   * Raised by `pulls/check-if-merged` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class PullsCheckIfMergedApiException(
    public val error: PullsCheckIfMergedError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/check-if-merged")

  private object PullsCheckIfMergedResponseDecoder : SdkResponseAlternativeDecoder<PullsCheckIfMergedResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsCheckIfMergedResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsCheckIfMergedResponse> = when {
      alternative.id == "pulls/check-if-merged.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsCheckIfMergedResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/check-if-merged.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsCheckIfMergedResponse.Http404NoContent(
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
    ): PullsCheckIfMergedResponse = PullsCheckIfMergedResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/create-reply-for-review-comment` may expose through its typed
   * API exception.
   */
  public sealed interface PullsCreateReplyForReviewCommentError

  /**
   * Typed response alternatives for `pulls/create-reply-for-review-comment`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PullsCreateReplyForReviewCommentResponse {
    public class SuccessJson(
      public val json: PullRequestReviewComment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsCreateReplyForReviewCommentResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsCreateReplyForReviewCommentResponse,
        PullsCreateReplyForReviewCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsCreateReplyForReviewCommentResponse
  }

  /**
   * Raised by `pulls/create-reply-for-review-comment` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class PullsCreateReplyForReviewCommentApiException(
    public val error: PullsCreateReplyForReviewCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/create-reply-for-review-comment")

  private object PullsCreateReplyForReviewCommentResponseDecoder : SdkResponseAlternativeDecoder<PullsCreateReplyForReviewCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsCreateReplyForReviewCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsCreateReplyForReviewCommentResponse> = when {
      alternative.id == "pulls/create-reply-for-review-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsCreateReplyForReviewCommentResponse.SuccessJson(
          json = PullsCodecs.pullsCreateReplyForReviewCommentResponseCodecAlternative0Registry.select(listOf("pulls/create-reply-for-review-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/create-reply-for-review-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsCreateReplyForReviewCommentResponse.Http404Json(
          json = PullsCodecs.pullsCreateReplyForReviewCommentResponseCodecAlternative1Registry.select(listOf("pulls/create-reply-for-review-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsCreateReplyForReviewCommentResponse = PullsCreateReplyForReviewCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/create-review` may expose through its typed API exception.
   */
  public sealed interface PullsCreateReviewError

  /**
   * Typed response alternatives for `pulls/create-review`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PullsCreateReviewResponse {
    public class SuccessJson(
      public val json: PullRequestReview,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsCreateReviewResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsCreateReviewResponse,
        PullsCreateReviewError

    public class Http422Json(
      public val json: ValidationErrorSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsCreateReviewResponse,
        PullsCreateReviewError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsCreateReviewResponse
  }

  /**
   * Raised by `pulls/create-review` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class PullsCreateReviewApiException(
    public val error: PullsCreateReviewError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/create-review")

  private object PullsCreateReviewResponseDecoder : SdkResponseAlternativeDecoder<PullsCreateReviewResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsCreateReviewResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsCreateReviewResponse> = when {
      alternative.id == "pulls/create-review.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsCreateReviewResponse.SuccessJson(
          json = PullsCodecs.pullsCreateReviewResponseCodecAlternative0Registry.select(listOf("pulls/create-review.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/create-review.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsCreateReviewResponse.Http403Json(
          json = PullsCodecs.pullsCreateReviewResponseCodecAlternative1Registry.select(listOf("pulls/create-review.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/create-review.response.alternative2" -> SdkResponseDecodeResult(
        value = PullsCreateReviewResponse.Http422Json(
          json = PullsCodecs.pullsCreateReviewResponseCodecAlternative2Registry.select(listOf("pulls/create-review.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsCreateReviewResponse = PullsCreateReviewResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/create-review-comment` may expose through its typed API
   * exception.
   */
  public sealed interface PullsCreateReviewCommentError

  /**
   * Typed response alternatives for `pulls/create-review-comment`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PullsCreateReviewCommentResponse {
    public class SuccessJson(
      public val json: PullRequestReviewComment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsCreateReviewCommentResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsCreateReviewCommentResponse,
        PullsCreateReviewCommentError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsCreateReviewCommentResponse,
        PullsCreateReviewCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsCreateReviewCommentResponse
  }

  /**
   * Raised by `pulls/create-review-comment` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class PullsCreateReviewCommentApiException(
    public val error: PullsCreateReviewCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/create-review-comment")

  private object PullsCreateReviewCommentResponseDecoder : SdkResponseAlternativeDecoder<PullsCreateReviewCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsCreateReviewCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsCreateReviewCommentResponse> = when {
      alternative.id == "pulls/create-review-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsCreateReviewCommentResponse.SuccessJson(
          json = PullsCodecs.pullsCreateReviewCommentResponseCodecAlternative0Registry.select(listOf("pulls/create-review-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/create-review-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsCreateReviewCommentResponse.Http403Json(
          json = PullsCodecs.pullsCreateReviewCommentResponseCodecAlternative1Registry.select(listOf("pulls/create-review-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/create-review-comment.response.alternative2" -> SdkResponseDecodeResult(
        value = PullsCreateReviewCommentResponse.Http422Json(
          json = PullsCodecs.pullsCreateReviewCommentResponseCodecAlternative2Registry.select(listOf("pulls/create-review-comment.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsCreateReviewCommentResponse = PullsCreateReviewCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/delete-pending-review` may expose through its typed API
   * exception.
   */
  public sealed interface PullsDeletePendingReviewError

  /**
   * Typed response alternatives for `pulls/delete-pending-review`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PullsDeletePendingReviewResponse {
    public class SuccessJson(
      public val json: PullRequestReview,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsDeletePendingReviewResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsDeletePendingReviewResponse,
        PullsDeletePendingReviewError

    public class Http422Json(
      public val json: ValidationErrorSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsDeletePendingReviewResponse,
        PullsDeletePendingReviewError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsDeletePendingReviewResponse
  }

  /**
   * Raised by `pulls/delete-pending-review` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class PullsDeletePendingReviewApiException(
    public val error: PullsDeletePendingReviewError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/delete-pending-review")

  private object PullsDeletePendingReviewResponseDecoder : SdkResponseAlternativeDecoder<PullsDeletePendingReviewResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsDeletePendingReviewResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsDeletePendingReviewResponse> = when {
      alternative.id == "pulls/delete-pending-review.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsDeletePendingReviewResponse.SuccessJson(
          json = PullsCodecs.pullsDeletePendingReviewResponseCodecAlternative0Registry.select(listOf("pulls/delete-pending-review.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/delete-pending-review.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsDeletePendingReviewResponse.Http404Json(
          json = PullsCodecs.pullsDeletePendingReviewResponseCodecAlternative1Registry.select(listOf("pulls/delete-pending-review.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/delete-pending-review.response.alternative2" -> SdkResponseDecodeResult(
        value = PullsDeletePendingReviewResponse.Http422Json(
          json = PullsCodecs.pullsDeletePendingReviewResponseCodecAlternative2Registry.select(listOf("pulls/delete-pending-review.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsDeletePendingReviewResponse = PullsDeletePendingReviewResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/delete-review-comment` may expose through its typed API
   * exception.
   */
  public sealed interface PullsDeleteReviewCommentError

  /**
   * Typed response alternatives for `pulls/delete-review-comment`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PullsDeleteReviewCommentResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsDeleteReviewCommentResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsDeleteReviewCommentResponse,
        PullsDeleteReviewCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsDeleteReviewCommentResponse
  }

  /**
   * Raised by `pulls/delete-review-comment` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class PullsDeleteReviewCommentApiException(
    public val error: PullsDeleteReviewCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/delete-review-comment")

  private object PullsDeleteReviewCommentResponseDecoder : SdkResponseAlternativeDecoder<PullsDeleteReviewCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsDeleteReviewCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsDeleteReviewCommentResponse> = when {
      alternative.id == "pulls/delete-review-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsDeleteReviewCommentResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/delete-review-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsDeleteReviewCommentResponse.Http404Json(
          json = PullsCodecs.pullsDeleteReviewCommentResponseCodecAlternative1Registry.select(listOf("pulls/delete-review-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsDeleteReviewCommentResponse = PullsDeleteReviewCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/dismiss-review` may expose through its typed API exception.
   */
  public sealed interface PullsDismissReviewError

  /**
   * Typed response alternatives for `pulls/dismiss-review`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PullsDismissReviewResponse {
    public class SuccessJson(
      public val json: PullRequestReview,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsDismissReviewResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsDismissReviewResponse,
        PullsDismissReviewError

    public class Http422Json(
      public val json: ValidationErrorSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsDismissReviewResponse,
        PullsDismissReviewError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsDismissReviewResponse
  }

  /**
   * Raised by `pulls/dismiss-review` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class PullsDismissReviewApiException(
    public val error: PullsDismissReviewError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/dismiss-review")

  private object PullsDismissReviewResponseDecoder : SdkResponseAlternativeDecoder<PullsDismissReviewResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsDismissReviewResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsDismissReviewResponse> = when {
      alternative.id == "pulls/dismiss-review.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsDismissReviewResponse.SuccessJson(
          json = PullsCodecs.pullsDismissReviewResponseCodecAlternative0Registry.select(listOf("pulls/dismiss-review.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/dismiss-review.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsDismissReviewResponse.Http404Json(
          json = PullsCodecs.pullsDismissReviewResponseCodecAlternative1Registry.select(listOf("pulls/dismiss-review.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/dismiss-review.response.alternative2" -> SdkResponseDecodeResult(
        value = PullsDismissReviewResponse.Http422Json(
          json = PullsCodecs.pullsDismissReviewResponseCodecAlternative2Registry.select(listOf("pulls/dismiss-review.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsDismissReviewResponse = PullsDismissReviewResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/get-review` may expose through its typed API exception.
   */
  public sealed interface PullsGetReviewError

  /**
   * Typed response alternatives for `pulls/get-review`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PullsGetReviewResponse {
    public class SuccessJson(
      public val json: PullRequestReview,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsGetReviewResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsGetReviewResponse,
        PullsGetReviewError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsGetReviewResponse
  }

  /**
   * Raised by `pulls/get-review` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class PullsGetReviewApiException(
    public val error: PullsGetReviewError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/get-review")

  private object PullsGetReviewResponseDecoder : SdkResponseAlternativeDecoder<PullsGetReviewResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsGetReviewResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsGetReviewResponse> = when {
      alternative.id == "pulls/get-review.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsGetReviewResponse.SuccessJson(
          json = PullsCodecs.pullsGetReviewResponseCodecAlternative0Registry.select(listOf("pulls/get-review.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/get-review.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsGetReviewResponse.Http404Json(
          json = PullsCodecs.pullsGetReviewResponseCodecAlternative1Registry.select(listOf("pulls/get-review.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsGetReviewResponse = PullsGetReviewResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/get-review-comment` may expose through its typed API
   * exception.
   */
  public sealed interface PullsGetReviewCommentError

  /**
   * Typed response alternatives for `pulls/get-review-comment`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PullsGetReviewCommentResponse {
    public class SuccessJson(
      public val json: PullRequestReviewComment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsGetReviewCommentResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsGetReviewCommentResponse,
        PullsGetReviewCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsGetReviewCommentResponse
  }

  /**
   * Raised by `pulls/get-review-comment` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class PullsGetReviewCommentApiException(
    public val error: PullsGetReviewCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/get-review-comment")

  private object PullsGetReviewCommentResponseDecoder : SdkResponseAlternativeDecoder<PullsGetReviewCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsGetReviewCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsGetReviewCommentResponse> = when {
      alternative.id == "pulls/get-review-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsGetReviewCommentResponse.SuccessJson(
          json = PullsCodecs.pullsGetReviewCommentResponseCodecAlternative0Registry.select(listOf("pulls/get-review-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/get-review-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsGetReviewCommentResponse.Http404Json(
          json = PullsCodecs.pullsGetReviewCommentResponseCodecAlternative1Registry.select(listOf("pulls/get-review-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsGetReviewCommentResponse = PullsGetReviewCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/list` may expose through its typed API exception.
   */
  public sealed interface PullsListError

  /**
   * Typed response alternatives for `pulls/list`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PullsListResponse {
    public class SuccessJson(
      public val json: List<PullRequestSimple>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListResponse,
        PullsListError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListResponse,
        PullsListError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListResponse
  }

  /**
   * Raised by `pulls/list` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class PullsListApiException(
    public val error: PullsListError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/list")

  private object PullsListResponseDecoder : SdkResponseAlternativeDecoder<PullsListResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsListResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsListResponse> = when {
      alternative.id == "pulls/list.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsListResponse.SuccessJson(
          json = PullsCodecs.pullsListResponseCodecAlternative0Registry.select(listOf("pulls/list.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/list.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsListResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/list.response.alternative2" -> SdkResponseDecodeResult(
        value = PullsListResponse.Http422Json(
          json = PullsCodecs.pullsListResponseCodecAlternative2Registry.select(listOf("pulls/list.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsListResponse = PullsListResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/list-comments-for-review` may expose through its typed API
   * exception.
   */
  public sealed interface PullsListCommentsForReviewError

  /**
   * Typed response alternatives for `pulls/list-comments-for-review`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PullsListCommentsForReviewResponse {
    public class SuccessJson(
      public val json: List<ReviewComment>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListCommentsForReviewResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListCommentsForReviewResponse,
        PullsListCommentsForReviewError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListCommentsForReviewResponse
  }

  /**
   * Raised by `pulls/list-comments-for-review` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class PullsListCommentsForReviewApiException(
    public val error: PullsListCommentsForReviewError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/list-comments-for-review")

  private object PullsListCommentsForReviewResponseDecoder : SdkResponseAlternativeDecoder<PullsListCommentsForReviewResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsListCommentsForReviewResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsListCommentsForReviewResponse> = when {
      alternative.id == "pulls/list-comments-for-review.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsListCommentsForReviewResponse.SuccessJson(
          json = PullsCodecs.pullsListCommentsForReviewResponseCodecAlternative0Registry.select(listOf("pulls/list-comments-for-review.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/list-comments-for-review.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsListCommentsForReviewResponse.Http404Json(
          json = PullsCodecs.pullsListCommentsForReviewResponseCodecAlternative1Registry.select(listOf("pulls/list-comments-for-review.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsListCommentsForReviewResponse = PullsListCommentsForReviewResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `pulls/list-commits`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PullsListCommitsResponse {
    public class SuccessJson(
      public val json: List<Commit>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListCommitsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListCommitsResponse
  }

  private object PullsListCommitsResponseDecoder : SdkResponseAlternativeDecoder<PullsListCommitsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsListCommitsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsListCommitsResponse> = when {
      alternative.id == "pulls/list-commits.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsListCommitsResponse.SuccessJson(
          json = PullsCodecs.pullsListCommitsResponseCodecAlternative0Registry.select(listOf("pulls/list-commits.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsListCommitsResponse = PullsListCommitsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/list-files` may expose through its typed API exception.
   */
  public sealed interface PullsListFilesError

  /**
   * Typed response alternatives for `pulls/list-files`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PullsListFilesResponse {
    public class SuccessJson(
      public val json: List<DiffEntry>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListFilesResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListFilesResponse,
        PullsListFilesError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListFilesResponse,
        PullsListFilesError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListFilesResponse,
        PullsListFilesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListFilesResponse
  }

  /**
   * Raised by `pulls/list-files` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class PullsListFilesApiException(
    public val error: PullsListFilesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/list-files")

  private object PullsListFilesResponseDecoder : SdkResponseAlternativeDecoder<PullsListFilesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsListFilesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsListFilesResponse> = when {
      alternative.id == "pulls/list-files.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsListFilesResponse.SuccessJson(
          json = PullsCodecs.pullsListFilesResponseCodecAlternative0Registry.select(listOf("pulls/list-files.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/list-files.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsListFilesResponse.Http422Json(
          json = PullsCodecs.pullsListFilesResponseCodecAlternative1Registry.select(listOf("pulls/list-files.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/list-files.response.alternative2" -> SdkResponseDecodeResult(
        value = PullsListFilesResponse.Http500Json(
          json = PullsCodecs.pullsListFilesResponseCodecAlternative2Registry.select(listOf("pulls/list-files.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/list-files.response.alternative3" -> SdkResponseDecodeResult(
        value = PullsListFilesResponse.Http503Json(
          json = PullsCodecs.pullsListFilesResponseCodecAlternative3Registry.select(listOf("pulls/list-files.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsListFilesResponse = PullsListFilesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `pulls/list-requested-reviewers`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PullsListRequestedReviewersResponse {
    public class SuccessJson(
      public val json: PullRequestReviewRequest,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListRequestedReviewersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListRequestedReviewersResponse
  }

  private object PullsListRequestedReviewersResponseDecoder : SdkResponseAlternativeDecoder<PullsListRequestedReviewersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsListRequestedReviewersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsListRequestedReviewersResponse> = when {
      alternative.id == "pulls/list-requested-reviewers.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsListRequestedReviewersResponse.SuccessJson(
          json = PullsCodecs.pullsListRequestedReviewersResponseCodecAlternative0Registry.select(listOf("pulls/list-requested-reviewers.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsListRequestedReviewersResponse = PullsListRequestedReviewersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `pulls/list-review-comments`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PullsListReviewCommentsResponse {
    public class SuccessJson(
      public val json: List<PullRequestReviewComment>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListReviewCommentsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListReviewCommentsResponse
  }

  private object PullsListReviewCommentsResponseDecoder : SdkResponseAlternativeDecoder<PullsListReviewCommentsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsListReviewCommentsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsListReviewCommentsResponse> = when {
      alternative.id == "pulls/list-review-comments.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsListReviewCommentsResponse.SuccessJson(
          json = PullsCodecs.pullsListReviewCommentsResponseCodecAlternative0Registry.select(listOf("pulls/list-review-comments.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsListReviewCommentsResponse = PullsListReviewCommentsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `pulls/list-review-comments-for-repo`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PullsListReviewCommentsForRepoResponse {
    public class SuccessJson(
      public val json: List<PullRequestReviewComment>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListReviewCommentsForRepoResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListReviewCommentsForRepoResponse
  }

  private object PullsListReviewCommentsForRepoResponseDecoder : SdkResponseAlternativeDecoder<PullsListReviewCommentsForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsListReviewCommentsForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsListReviewCommentsForRepoResponse> = when {
      alternative.id == "pulls/list-review-comments-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsListReviewCommentsForRepoResponse.SuccessJson(
          json = PullsCodecs.pullsListReviewCommentsForRepoResponseCodecAlternative0Registry.select(listOf("pulls/list-review-comments-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsListReviewCommentsForRepoResponse = PullsListReviewCommentsForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `pulls/list-reviews`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PullsListReviewsResponse {
    public class SuccessJson(
      public val json: List<PullRequestReview>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListReviewsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsListReviewsResponse
  }

  private object PullsListReviewsResponseDecoder : SdkResponseAlternativeDecoder<PullsListReviewsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsListReviewsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsListReviewsResponse> = when {
      alternative.id == "pulls/list-reviews.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsListReviewsResponse.SuccessJson(
          json = PullsCodecs.pullsListReviewsResponseCodecAlternative0Registry.select(listOf("pulls/list-reviews.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsListReviewsResponse = PullsListReviewsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/merge` may expose through its typed API exception.
   */
  public sealed interface PullsMergeError

  /**
   * Typed response alternatives for `pulls/merge`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PullsMergeResponse {
    public class SuccessJson(
      public val json: PullRequestMergeResult,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsMergeResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsMergeResponse,
        PullsMergeError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsMergeResponse,
        PullsMergeError

    public class Http405Json(
      public val json: InlineReposPullsMergePutResponse405JsonX8a40593a,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsMergeResponse,
        PullsMergeError

    public class Http409Json(
      public val json: InlineReposPullsMergePutResponse409JsonXecbc830b,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsMergeResponse,
        PullsMergeError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsMergeResponse,
        PullsMergeError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsMergeResponse
  }

  /**
   * Raised by `pulls/merge` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class PullsMergeApiException(
    public val error: PullsMergeError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/merge")

  private object PullsMergeResponseDecoder : SdkResponseAlternativeDecoder<PullsMergeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsMergeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsMergeResponse> = when {
      alternative.id == "pulls/merge.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsMergeResponse.SuccessJson(
          json = PullsCodecs.pullsMergeResponseCodecAlternative0Registry.select(listOf("pulls/merge.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/merge.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsMergeResponse.Http403Json(
          json = PullsCodecs.pullsMergeResponseCodecAlternative1Registry.select(listOf("pulls/merge.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/merge.response.alternative2" -> SdkResponseDecodeResult(
        value = PullsMergeResponse.Http404Json(
          json = PullsCodecs.pullsMergeResponseCodecAlternative2Registry.select(listOf("pulls/merge.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/merge.response.alternative3" -> SdkResponseDecodeResult(
        value = PullsMergeResponse.Http405Json(
          json = PullsCodecs.pullsMergeResponseCodecAlternative3Registry.select(listOf("pulls/merge.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/merge.response.alternative4" -> SdkResponseDecodeResult(
        value = PullsMergeResponse.Http409Json(
          json = PullsCodecs.pullsMergeResponseCodecAlternative4Registry.select(listOf("pulls/merge.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/merge.response.alternative5" -> SdkResponseDecodeResult(
        value = PullsMergeResponse.Http422Json(
          json = PullsCodecs.pullsMergeResponseCodecAlternative5Registry.select(listOf("pulls/merge.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsMergeResponse = PullsMergeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/remove-requested-reviewers` may expose through its typed API
   * exception.
   */
  public sealed interface PullsRemoveRequestedReviewersError

  /**
   * Typed response alternatives for `pulls/remove-requested-reviewers`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PullsRemoveRequestedReviewersResponse {
    public class SuccessJson(
      public val json: PullRequestSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsRemoveRequestedReviewersResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsRemoveRequestedReviewersResponse,
        PullsRemoveRequestedReviewersError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsRemoveRequestedReviewersResponse
  }

  /**
   * Raised by `pulls/remove-requested-reviewers` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class PullsRemoveRequestedReviewersApiException(
    public val error: PullsRemoveRequestedReviewersError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/remove-requested-reviewers")

  private object PullsRemoveRequestedReviewersResponseDecoder : SdkResponseAlternativeDecoder<PullsRemoveRequestedReviewersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsRemoveRequestedReviewersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsRemoveRequestedReviewersResponse> = when {
      alternative.id == "pulls/remove-requested-reviewers.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsRemoveRequestedReviewersResponse.SuccessJson(
          json = PullsCodecs.pullsRemoveRequestedReviewersResponseCodecAlternative0Registry.select(listOf("pulls/remove-requested-reviewers.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/remove-requested-reviewers.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsRemoveRequestedReviewersResponse.Http422Json(
          json = PullsCodecs.pullsRemoveRequestedReviewersResponseCodecAlternative1Registry.select(listOf("pulls/remove-requested-reviewers.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsRemoveRequestedReviewersResponse = PullsRemoveRequestedReviewersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/request-reviewers` may expose through its typed API
   * exception.
   */
  public sealed interface PullsRequestReviewersError

  /**
   * Typed response alternatives for `pulls/request-reviewers`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PullsRequestReviewersResponse {
    public class SuccessJson(
      public val json: PullRequestSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsRequestReviewersResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsRequestReviewersResponse,
        PullsRequestReviewersError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsRequestReviewersResponse,
        PullsRequestReviewersError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsRequestReviewersResponse
  }

  /**
   * Raised by `pulls/request-reviewers` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class PullsRequestReviewersApiException(
    public val error: PullsRequestReviewersError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/request-reviewers")

  private object PullsRequestReviewersResponseDecoder : SdkResponseAlternativeDecoder<PullsRequestReviewersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsRequestReviewersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsRequestReviewersResponse> = when {
      alternative.id == "pulls/request-reviewers.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsRequestReviewersResponse.SuccessJson(
          json = PullsCodecs.pullsRequestReviewersResponseCodecAlternative0Registry.select(listOf("pulls/request-reviewers.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/request-reviewers.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsRequestReviewersResponse.Http403Json(
          json = PullsCodecs.pullsRequestReviewersResponseCodecAlternative1Registry.select(listOf("pulls/request-reviewers.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/request-reviewers.response.alternative2" -> SdkResponseDecodeResult(
        value = PullsRequestReviewersResponse.Http422NoContent(
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
    ): PullsRequestReviewersResponse = PullsRequestReviewersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/submit-review` may expose through its typed API exception.
   */
  public sealed interface PullsSubmitReviewError

  /**
   * Typed response alternatives for `pulls/submit-review`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PullsSubmitReviewResponse {
    public class SuccessJson(
      public val json: PullRequestReview,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsSubmitReviewResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsSubmitReviewResponse,
        PullsSubmitReviewError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsSubmitReviewResponse,
        PullsSubmitReviewError

    public class Http422Json(
      public val json: ValidationErrorSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsSubmitReviewResponse,
        PullsSubmitReviewError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsSubmitReviewResponse
  }

  /**
   * Raised by `pulls/submit-review` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class PullsSubmitReviewApiException(
    public val error: PullsSubmitReviewError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/submit-review")

  private object PullsSubmitReviewResponseDecoder : SdkResponseAlternativeDecoder<PullsSubmitReviewResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsSubmitReviewResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsSubmitReviewResponse> = when {
      alternative.id == "pulls/submit-review.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsSubmitReviewResponse.SuccessJson(
          json = PullsCodecs.pullsSubmitReviewResponseCodecAlternative0Registry.select(listOf("pulls/submit-review.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/submit-review.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsSubmitReviewResponse.Http403Json(
          json = PullsCodecs.pullsSubmitReviewResponseCodecAlternative1Registry.select(listOf("pulls/submit-review.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/submit-review.response.alternative2" -> SdkResponseDecodeResult(
        value = PullsSubmitReviewResponse.Http404Json(
          json = PullsCodecs.pullsSubmitReviewResponseCodecAlternative2Registry.select(listOf("pulls/submit-review.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/submit-review.response.alternative3" -> SdkResponseDecodeResult(
        value = PullsSubmitReviewResponse.Http422Json(
          json = PullsCodecs.pullsSubmitReviewResponseCodecAlternative3Registry.select(listOf("pulls/submit-review.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsSubmitReviewResponse = PullsSubmitReviewResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/update-branch` may expose through its typed API exception.
   */
  public sealed interface PullsUpdateBranchError

  /**
   * Typed response alternatives for `pulls/update-branch`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PullsUpdateBranchResponse {
    public class SuccessJson(
      public val json: InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsUpdateBranchResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsUpdateBranchResponse,
        PullsUpdateBranchError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsUpdateBranchResponse,
        PullsUpdateBranchError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsUpdateBranchResponse
  }

  /**
   * Raised by `pulls/update-branch` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class PullsUpdateBranchApiException(
    public val error: PullsUpdateBranchError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/update-branch")

  private object PullsUpdateBranchResponseDecoder : SdkResponseAlternativeDecoder<PullsUpdateBranchResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsUpdateBranchResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsUpdateBranchResponse> = when {
      alternative.id == "pulls/update-branch.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsUpdateBranchResponse.SuccessJson(
          json = PullsCodecs.pullsUpdateBranchResponseCodecAlternative0Registry.select(listOf("pulls/update-branch.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/update-branch.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsUpdateBranchResponse.Http403Json(
          json = PullsCodecs.pullsUpdateBranchResponseCodecAlternative1Registry.select(listOf("pulls/update-branch.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/update-branch.response.alternative2" -> SdkResponseDecodeResult(
        value = PullsUpdateBranchResponse.Http422Json(
          json = PullsCodecs.pullsUpdateBranchResponseCodecAlternative2Registry.select(listOf("pulls/update-branch.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsUpdateBranchResponse = PullsUpdateBranchResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `pulls/update-review` may expose through its typed API exception.
   */
  public sealed interface PullsUpdateReviewError

  /**
   * Typed response alternatives for `pulls/update-review`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PullsUpdateReviewResponse {
    public class SuccessJson(
      public val json: PullRequestReview,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsUpdateReviewResponse

    public class Http422Json(
      public val json: ValidationErrorSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsUpdateReviewResponse,
        PullsUpdateReviewError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsUpdateReviewResponse
  }

  /**
   * Raised by `pulls/update-review` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class PullsUpdateReviewApiException(
    public val error: PullsUpdateReviewError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "pulls/update-review")

  private object PullsUpdateReviewResponseDecoder : SdkResponseAlternativeDecoder<PullsUpdateReviewResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsUpdateReviewResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsUpdateReviewResponse> = when {
      alternative.id == "pulls/update-review.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsUpdateReviewResponse.SuccessJson(
          json = PullsCodecs.pullsUpdateReviewResponseCodecAlternative0Registry.select(listOf("pulls/update-review.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "pulls/update-review.response.alternative1" -> SdkResponseDecodeResult(
        value = PullsUpdateReviewResponse.Http422Json(
          json = PullsCodecs.pullsUpdateReviewResponseCodecAlternative1Registry.select(listOf("pulls/update-review.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsUpdateReviewResponse = PullsUpdateReviewResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `pulls/update-review-comment`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PullsUpdateReviewCommentResponse {
    public class SuccessJson(
      public val json: PullRequestReviewComment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsUpdateReviewCommentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PullsUpdateReviewCommentResponse
  }

  private object PullsUpdateReviewCommentResponseDecoder : SdkResponseAlternativeDecoder<PullsUpdateReviewCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PullsUpdateReviewCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PullsUpdateReviewCommentResponse> = when {
      alternative.id == "pulls/update-review-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = PullsUpdateReviewCommentResponse.SuccessJson(
          json = PullsCodecs.pullsUpdateReviewCommentResponseCodecAlternative0Registry.select(listOf("pulls/update-review-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PullsUpdateReviewCommentResponse = PullsUpdateReviewCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val pullsCheckIfMergedMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/check-if-merged",
          method = "GET",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/merge",
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
              id = "pulls/check-if-merged.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/check-if-merged.response.alternative1",
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

    public val pullsCreateReplyForReviewCommentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/create-reply-for-review-comment",
          method = "POST",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/comments/{comment_id}/replies",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "PullRequestReviewComment",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/create-reply-for-review-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/create-reply-for-review-comment.response.alternative1",
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

    public val pullsCreateReviewMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/create-review",
          method = "POST",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/reviews",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PullRequestReview",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/create-review.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/create-review.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationErrorSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/create-review.response.alternative2",
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

    public val pullsCreateReviewCommentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/create-review-comment",
          method = "POST",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/comments",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "PullRequestReviewComment",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/create-review-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/create-review-comment.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/create-review-comment.response.alternative2",
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

    public val pullsDeletePendingReviewMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/delete-pending-review",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PullRequestReview",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/delete-pending-review.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/delete-pending-review.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationErrorSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/delete-pending-review.response.alternative2",
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

    public val pullsDeleteReviewCommentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/delete-review-comment",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/pulls/comments/{comment_id}",
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
              id = "pulls/delete-review-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/delete-review-comment.response.alternative1",
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

    public val pullsDismissReviewMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/dismiss-review",
          method = "PUT",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/dismissals",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PullRequestReview",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/dismiss-review.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/dismiss-review.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationErrorSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/dismiss-review.response.alternative2",
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

    public val pullsGetReviewMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/get-review",
          method = "GET",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PullRequestReview",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/get-review.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/get-review.response.alternative1",
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

    public val pullsGetReviewCommentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/get-review-comment",
          method = "GET",
          path = "/repos/{owner}/{repo}/pulls/comments/{comment_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PullRequestReviewComment",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/get-review-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/get-review-comment.response.alternative1",
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

    public val pullsListMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/list",
          method = "GET",
          path = "/repos/{owner}/{repo}/pulls",
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
              id = "pulls/list.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/list.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/list.response.alternative2",
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

    public val pullsListCommentsForReviewMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/list-comments-for-review",
          method = "GET",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/comments",
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
              id = "pulls/list-comments-for-review.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/list-comments-for-review.response.alternative1",
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

    public val pullsListCommitsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/list-commits",
          method = "GET",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/commits",
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
              id = "pulls/list-commits.response.alternative0",
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

    public val pullsListFilesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/list-files",
          method = "GET",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/files",
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
              id = "pulls/list-files.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/list-files.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/list-files.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/list-files.response.alternative3",
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

    public val pullsListRequestedReviewersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/list-requested-reviewers",
          method = "GET",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PullRequestReviewRequest",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/list-requested-reviewers.response.alternative0",
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

    public val pullsListReviewCommentsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/list-review-comments",
          method = "GET",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/comments",
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
              id = "pulls/list-review-comments.response.alternative0",
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

    public val pullsListReviewCommentsForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/list-review-comments-for-repo",
          method = "GET",
          path = "/repos/{owner}/{repo}/pulls/comments",
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
              id = "pulls/list-review-comments-for-repo.response.alternative0",
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

    public val pullsListReviewsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/list-reviews",
          method = "GET",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/reviews",
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
              id = "pulls/list-reviews.response.alternative0",
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

    public val pullsMergeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/merge",
          method = "PUT",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/merge",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PullRequestMergeResult",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/merge.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/merge.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/merge.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 405),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposPullsMergePutResponse405JsonX8a40593a",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/merge.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposPullsMergePutResponse409JsonXecbc830b",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/merge.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/merge.response.alternative5",
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

    public val pullsRemoveRequestedReviewersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/remove-requested-reviewers",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PullRequestSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/remove-requested-reviewers.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/remove-requested-reviewers.response.alternative1",
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

    public val pullsRequestReviewersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/request-reviewers",
          method = "POST",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "PullRequestSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/request-reviewers.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/request-reviewers.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/request-reviewers.response.alternative2",
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

    public val pullsSubmitReviewMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/submit-review",
          method = "POST",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/events",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PullRequestReview",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/submit-review.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/submit-review.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/submit-review.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationErrorSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/submit-review.response.alternative3",
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

    public val pullsUpdateBranchMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/update-branch",
          method = "PUT",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/update-branch",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(202),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/update-branch.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/update-branch.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/update-branch.response.alternative2",
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

    public val pullsUpdateReviewMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/update-review",
          method = "PUT",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PullRequestReview",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/update-review.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationErrorSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/update-review.response.alternative1",
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

    public val pullsUpdateReviewCommentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "pulls/update-review-comment",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/pulls/comments/{comment_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PullRequestReviewComment",
              mode = SdkResponseMode.BUFFERED,
              id = "pulls/update-review-comment.response.alternative0",
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
